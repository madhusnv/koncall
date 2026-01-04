defmodule KoncallApiWeb.Admin.AnalyticsLive do
  @moduledoc """
  LiveView for call analytics dashboard with team leaderboard and charts.
  """
  use KoncallApiWeb, :live_view
  alias KoncallApi.Analytics.Team, as: TeamAnalytics

  @impl true
  def mount(_params, session, socket) do
    user = get_user_from_session(session)
    
    {:ok, socket
     |> assign(:current_user, user)
     |> assign(:page_title, "Analytics Dashboard")
     |> assign(:date_filter, "all")
     |> load_analytics()}
  end

  defp load_analytics(socket) do
    user = socket.assigns.current_user
    org_id = user.organization_id
    date_range = get_date_range(socket.assigns.date_filter)

    socket
    |> assign(:org_summary, TeamAnalytics.get_org_summary(org_id, date_range))
    |> assign(:leaderboard, TeamAnalytics.get_leaderboard(org_id, date_range, 10))
    |> assign(:stage_summary, TeamAnalytics.get_stage_summary(org_id))
    |> assign(:hourly_data, TeamAnalytics.get_hourly_distribution(org_id, date_range))
  end

  defp get_date_range("today") do
    today = Date.utc_today()
    {today, today}
  end
  defp get_date_range("week") do
    today = Date.utc_today()
    start_of_week = Date.add(today, -Date.day_of_week(today) + 1)
    {start_of_week, today}
  end
  defp get_date_range("month") do
    today = Date.utc_today()
    {Date.beginning_of_month(today), today}
  end
  defp get_date_range(_), do: {nil, nil}

  @impl true
  def handle_event("filter", %{"period" => period}, socket) do
    {:noreply, socket |> assign(:date_filter, period) |> load_analytics()}
  end

  defp get_user_from_session(session) do
    case session["admin_user_id"] do
      nil -> nil
      user_id -> KoncallApi.Accounts.get_user(user_id)
    end
  end

  @impl true
  def render(assigns) do
    ~H"""
    <Layouts.app flash={@flash} current_scope={%{current_user: @current_user}}>
      <div class="space-y-6">
        <div class="flex justify-between items-center">
          <h1 class="text-2xl font-bold text-zinc-100">Analytics Dashboard</h1>
          
          <div class="flex gap-2">
            <button 
              phx-click="filter" phx-value-period="today"
              class={["px-4 py-2 rounded-lg text-sm font-medium transition-colors",
                      if(@date_filter == "today", do: "bg-indigo-600 text-white", else: "bg-zinc-800 text-zinc-300 hover:bg-zinc-700")]}>
              Today
            </button>
            <button 
              phx-click="filter" phx-value-period="week"
              class={["px-4 py-2 rounded-lg text-sm font-medium transition-colors",
                      if(@date_filter == "week", do: "bg-indigo-600 text-white", else: "bg-zinc-800 text-zinc-300 hover:bg-zinc-700")]}>
              This Week
            </button>
            <button 
              phx-click="filter" phx-value-period="month"
              class={["px-4 py-2 rounded-lg text-sm font-medium transition-colors",
                      if(@date_filter == "month", do: "bg-indigo-600 text-white", else: "bg-zinc-800 text-zinc-300 hover:bg-zinc-700")]}>
              This Month
            </button>
            <button 
              phx-click="filter" phx-value-period="all"
              class={["px-4 py-2 rounded-lg text-sm font-medium transition-colors",
                      if(@date_filter == "all", do: "bg-indigo-600 text-white", else: "bg-zinc-800 text-zinc-300 hover:bg-zinc-700")]}>
              All Time
            </button>
          </div>
        </div>

        <%!-- Summary Cards --%>
        <div class="grid grid-cols-1 md:grid-cols-4 gap-4">
          <.stat_card title="Total Calls" value={@org_summary.total_calls} icon="hero-phone" color="indigo" />
          <.stat_card title="Connected" value={@org_summary.connected_calls} icon="hero-check-circle" color="emerald" />
          <.stat_card title="Total Duration" value={format_duration(@org_summary.total_duration)} icon="hero-clock" color="amber" />
          <.stat_card title="Active Callers" value={@org_summary.unique_callers} icon="hero-users" color="pink" />
        </div>

        <%!-- Quick Stats Row --%>
        <div class="grid grid-cols-1 md:grid-cols-3 gap-4">
          <div class="bg-zinc-900/50 rounded-xl p-4 border border-zinc-800">
            <div class="text-zinc-400 text-sm">Calls Today</div>
            <div class="text-2xl font-bold text-zinc-100"><%= @org_summary.calls_today %></div>
          </div>
          <div class="bg-zinc-900/50 rounded-xl p-4 border border-zinc-800">
            <div class="text-zinc-400 text-sm">Calls This Week</div>
            <div class="text-2xl font-bold text-zinc-100"><%= @org_summary.calls_this_week %></div>
          </div>
          <div class="bg-zinc-900/50 rounded-xl p-4 border border-zinc-800">
            <div class="text-zinc-400 text-sm">Calls This Month</div>
            <div class="text-2xl font-bold text-zinc-100"><%= @org_summary.calls_this_month %></div>
          </div>
        </div>

        <%!-- Leaderboard & Stage Summary --%>
        <div class="grid grid-cols-1 lg:grid-cols-2 gap-6">
          <%!-- Team Leaderboard --%>
          <div class="bg-zinc-900/50 rounded-xl border border-zinc-800">
            <div class="p-4 border-b border-zinc-800">
              <h2 class="text-lg font-semibold text-zinc-100 flex items-center gap-2">
                <.icon name="hero-trophy" class="w-5 h-5 text-amber-400" />
                Team Leaderboard
              </h2>
            </div>
            <div class="p-4">
              <%= if @leaderboard == [] do %>
                <p class="text-zinc-500 text-center py-8">No call data yet</p>
              <% else %>
                <div class="space-y-3">
                  <%= for entry <- @leaderboard do %>
                    <div class="flex items-center justify-between p-3 bg-zinc-800/50 rounded-lg">
                      <div class="flex items-center gap-3">
                        <span class={["w-8 h-8 rounded-full flex items-center justify-center font-bold text-sm",
                                     rank_color(entry.rank)]}>
                          <%= entry.rank %>
                        </span>
                        <div>
                          <div class="font-medium text-zinc-100"><%= entry.user_name %></div>
                          <div class="text-xs text-zinc-500"><%= entry.user_email %></div>
                        </div>
                      </div>
                      <div class="text-right">
                        <div class="font-bold text-zinc-100"><%= entry.total_calls %> calls</div>
                        <div class="text-xs text-zinc-500"><%= entry.connected_calls %> connected</div>
                      </div>
                    </div>
                  <% end %>
                </div>
              <% end %>
            </div>
          </div>

          <%!-- Lead Stage Funnel --%>
          <div class="bg-zinc-900/50 rounded-xl border border-zinc-800">
            <div class="p-4 border-b border-zinc-800">
              <h2 class="text-lg font-semibold text-zinc-100 flex items-center gap-2">
                <.icon name="hero-funnel" class="w-5 h-5 text-indigo-400" />
                Lead Stages
              </h2>
            </div>
            <div class="p-4">
              <div class="space-y-3">
                <%= for {stage, color} <- stage_colors() do %>
                  <% count = Map.get(@stage_summary, stage, 0) %>
                  <div class="flex items-center justify-between">
                    <span class="capitalize text-zinc-300"><%= String.replace(stage, "_", " ") %></span>
                    <div class="flex items-center gap-2">
                      <div class="w-32 h-2 bg-zinc-800 rounded-full overflow-hidden">
                        <div class={"h-full rounded-full " <> color} style={"width: #{stage_percent(@stage_summary, stage)}%"}></div>
                      </div>
                      <span class="text-zinc-100 font-medium w-8 text-right"><%= count %></span>
                    </div>
                  </div>
                <% end %>
              </div>
            </div>
          </div>
        </div>

        <%!-- Peak Hours Chart placeholder --%>
        <div class="bg-zinc-900/50 rounded-xl border border-zinc-800 p-4">
          <h2 class="text-lg font-semibold text-zinc-100 mb-4 flex items-center gap-2">
            <.icon name="hero-chart-bar" class="w-5 h-5 text-emerald-400" />
            Peak Calling Hours
          </h2>
          <div class="flex items-end gap-1 h-32">
            <%= for hour <- 0..23 do %>
              <% count = Enum.find(@hourly_data, %{call_count: 0}, & &1.hour == hour).call_count %>
              <% max_count = Enum.max_by(@hourly_data, & &1.call_count, fn -> %{call_count: 1} end).call_count %>
              <% height = if max_count > 0, do: count / max_count * 100, else: 0 %>
              <div 
                class="flex-1 bg-gradient-to-t from-indigo-600 to-indigo-400 rounded-t transition-all hover:from-indigo-500"
                style={"height: #{max(height, 2)}%"}
                title={"#{hour}:00 - #{count} calls"}>
              </div>
            <% end %>
          </div>
          <div class="flex justify-between text-xs text-zinc-500 mt-2">
            <span>12 AM</span>
            <span>6 AM</span>
            <span>12 PM</span>
            <span>6 PM</span>
            <span>12 AM</span>
          </div>
        </div>
      </div>
    </Layouts.app>
    """
  end

  defp stat_card(assigns) do
    ~H"""
    <div class="bg-zinc-900/50 rounded-xl p-4 border border-zinc-800">
      <div class="flex items-center justify-between">
        <div>
          <div class="text-zinc-400 text-sm"><%= @title %></div>
          <div class="text-2xl font-bold text-zinc-100"><%= @value %></div>
        </div>
        <div class={["p-3 rounded-lg", color_class(@color)]}>
          <.icon name={@icon} class="w-6 h-6" />
        </div>
      </div>
    </div>
    """
  end

  defp color_class("indigo"), do: "bg-indigo-600/20 text-indigo-400"
  defp color_class("emerald"), do: "bg-emerald-600/20 text-emerald-400"
  defp color_class("amber"), do: "bg-amber-600/20 text-amber-400"
  defp color_class("pink"), do: "bg-pink-600/20 text-pink-400"
  defp color_class(_), do: "bg-zinc-600/20 text-zinc-400"

  defp rank_color(1), do: "bg-amber-500 text-white"
  defp rank_color(2), do: "bg-zinc-400 text-white"
  defp rank_color(3), do: "bg-amber-700 text-white"
  defp rank_color(_), do: "bg-zinc-700 text-zinc-300"

  defp format_duration(nil), do: "0m"
  defp format_duration(seconds) when is_integer(seconds) do
    hours = div(seconds, 3600)
    minutes = div(rem(seconds, 3600), 60)
    
    cond do
      hours > 0 -> "#{hours}h #{minutes}m"
      minutes > 0 -> "#{minutes}m"
      true -> "#{seconds}s"
    end
  end
  defp format_duration(_), do: "0m"

  defp stage_colors do
    [
      {"new", "bg-indigo-500"},
      {"contacted", "bg-emerald-500"},
      {"interested", "bg-amber-500"},
      {"application_submitted", "bg-pink-500"},
      {"documents_collected", "bg-purple-500"},
      {"enrolled", "bg-cyan-500"},
      {"joined", "bg-green-500"}
    ]
  end

  defp stage_percent(summary, stage) do
    total = Map.values(summary) |> Enum.sum()
    count = Map.get(summary, stage, 0)
    if total > 0, do: count / total * 100, else: 0
  end
end
