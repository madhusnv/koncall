defmodule KoncallApiWeb.Admin.AnalyticsLive do
  @moduledoc """
  LiveView for call analytics dashboard with team leaderboard and charts.
  """
  use KoncallApiWeb, :live_view
  alias KoncallApi.Analytics.Team, as: TeamAnalytics
  alias KoncallApi.Accounts

  @impl true
  def mount(_params, session, socket) do
    user_id = session["admin_user_id"]
    user = Accounts.get_user!(user_id, [:organization])
    
    {:ok, socket
     |> assign(:current_user, user)
     |> assign(:page_title, "Analytics")
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

  @impl true
  def render(assigns) do
    ~H"""
    <div class="app-layout">
      <%!-- Sidebar Navigation --%>
      <aside id="sidebar" class="sidebar">
        <%!-- Collapse Toggle Button --%>
        <button 
          type="button" 
          class="sidebar-collapse-toggle"
          phx-click={JS.toggle_class("collapsed", to: "#sidebar")}
          title="Toggle sidebar"
        >
          <.icon name="hero-chevron-left" class="w-4 h-4" />
        </button>
        
        <div class="sidebar-header">
          <a href="/admin/dashboard" class="sidebar-logo">
            <div class="sidebar-logo-icon">
              <.icon name="hero-phone" class="w-7 h-7 text-white" />
            </div>
            <div class="flex flex-col">
              <span class="sidebar-logo-title">KonCall CRM</span>
              <span class="sidebar-logo-subtitle">Education Consultancy</span>
            </div>
          </a>
        </div>

        <nav class="sidebar-nav">
          <a href="/admin/dashboard" class="sidebar-nav-item">
            <.icon name="hero-home" class="sidebar-nav-icon" />
            <span>Dashboard</span>
          </a>
          <%= if @current_user.role == "admin" do %>
            <a href="/admin/branches" class="sidebar-nav-item">
              <.icon name="hero-building-office" class="sidebar-nav-icon" />
              <span>Branches</span>
            </a>
            <a href="/admin/universities" class="sidebar-nav-item">
              <.icon name="hero-academic-cap" class="sidebar-nav-icon" />
              <span>Universities</span>
            </a>
            <a href="/admin/users" class="sidebar-nav-item">
              <.icon name="hero-users" class="sidebar-nav-icon" />
              <span>Users</span>
            </a>
          <% end %>
          <a href="/admin/leads" class="sidebar-nav-item">
            <.icon name="hero-user-group" class="sidebar-nav-icon" />
            <span>Leads</span>
          </a>
          <a href="/admin/analytics" class="sidebar-nav-item active">
            <.icon name="hero-chart-bar" class="sidebar-nav-icon" />
            <span>Analytics</span>
          </a>
          <a href="/admin/reports" class="sidebar-nav-item">
            <.icon name="hero-document-chart-bar" class="sidebar-nav-icon" />
            <span>Reports</span>
          </a>
        </nav>

        <div class="p-4 border-t-2 border-[var(--color-border-light)]">
          <div class="flex items-center gap-3 p-3 rounded-xl" style="background: var(--color-bg-secondary);">
            <.icon name="hero-user-circle-solid" class="w-10 h-10 text-[var(--color-primary)]" />
            <div class="flex-1 min-w-0">
              <div class="font-semibold text-sm truncate" style="color: var(--color-text-primary);"><%= @current_user.name %></div>
              <div class="text-xs capitalize" style="color: var(--color-text-muted);"><%= @current_user.role %></div>
            </div>
          </div>
          <a href="/admin/logout" class="sidebar-nav-item mt-2" style="color: var(--color-error);">
            <.icon name="hero-arrow-right-on-rectangle" class="sidebar-nav-icon" />
            <span>Log out</span>
          </a>
        </div>
      </aside>

      <%!-- Mobile Overlay --%>
      <div id="sidebar-overlay" class="sidebar-overlay" phx-click={JS.remove_class("open", to: "#sidebar") |> JS.remove_class("active", to: "#sidebar-overlay")}></div>

      <%!-- Main Content Area --%>
      <div class="main-content">
        <header class="top-header">
          <button 
            type="button"
            class="mobile-menu-toggle"
            phx-click={JS.add_class("open", to: "#sidebar") |> JS.add_class("active", to: "#sidebar-overlay")}
          >
            <.icon name="hero-bars-3" class="w-6 h-6" style="color: var(--color-text-primary);" />
          </button>
          <div class="flex-1"></div>
          
          <%!-- Date Filter Buttons --%>
          <div class="flex gap-2">
            <button phx-click="filter" phx-value-period="today"
                    class={"btn text-sm " <> if(@date_filter == "today", do: "btn-primary", else: "btn-ghost")}>
              Today
            </button>
            <button phx-click="filter" phx-value-period="week"
                    class={"btn text-sm " <> if(@date_filter == "week", do: "btn-primary", else: "btn-ghost")}>
              This Week
            </button>
            <button phx-click="filter" phx-value-period="month"
                    class={"btn text-sm " <> if(@date_filter == "month", do: "btn-primary", else: "btn-ghost")}>
              This Month
            </button>
            <button phx-click="filter" phx-value-period="all"
                    class={"btn text-sm " <> if(@date_filter == "all", do: "btn-primary", else: "btn-ghost")}>
              All Time
            </button>
          </div>
        </header>

        <main class="main-content-inner">
          <%!-- Page Header --%>
          <div class="page-header">
            <div class="page-header-content">
              <div class="page-header-icon">
                <.icon name="hero-chart-bar" class="w-8 h-8 text-[var(--color-primary)]" />
              </div>
              <div>
                <h1 class="page-header-title">Analytics Dashboard</h1>
                <p class="page-header-subtitle">Team performance, call statistics, and insights</p>
              </div>
            </div>
          </div>

          <%!-- Summary Stats --%>
          <div class="grid grid-cols-1 sm:grid-cols-2 lg:grid-cols-4 gap-6 mb-8 animate-stagger">
            <div class="stat-card">
              <div class="stat-card-icon">
                <.icon name="hero-phone" class="w-5 h-5" />
              </div>
              <div class="stat-card-value"><%= @org_summary.total_calls %></div>
              <div class="stat-card-label">Total Calls</div>
            </div>
            <div class="stat-card">
              <div class="stat-card-icon">
                <.icon name="hero-check-circle" class="w-5 h-5" />
              </div>
              <div class="stat-card-value"><%= @org_summary.connected_calls %></div>
              <div class="stat-card-label">Connected</div>
            </div>
            <div class="stat-card">
              <div class="stat-card-icon">
                <.icon name="hero-clock" class="w-5 h-5" />
              </div>
              <div class="stat-card-value"><%= format_duration(@org_summary.total_duration) %></div>
              <div class="stat-card-label">Total Duration</div>
            </div>
            <div class="stat-card">
              <div class="stat-card-icon">
                <.icon name="hero-users" class="w-5 h-5" />
              </div>
              <div class="stat-card-value"><%= @org_summary.unique_callers %></div>
              <div class="stat-card-label">Active Callers</div>
            </div>
          </div>

          <%!-- Quick Stats Row --%>
          <div class="grid grid-cols-1 sm:grid-cols-3 gap-6 mb-8 animate-stagger">
            <div class="stat-card">
              <div class="stat-card-icon">
                <.icon name="hero-sun" class="w-5 h-5" />
              </div>
              <div class="stat-card-value"><%= @org_summary.calls_today %></div>
              <div class="stat-card-label">Calls Today</div>
            </div>
            <div class="stat-card">
              <div class="stat-card-icon">
                <.icon name="hero-calendar" class="w-5 h-5" />
              </div>
              <div class="stat-card-value"><%= @org_summary.calls_this_week %></div>
              <div class="stat-card-label">Calls This Week</div>
            </div>
            <div class="stat-card">
              <div class="stat-card-icon">
                <.icon name="hero-calendar-days" class="w-5 h-5" />
              </div>
              <div class="stat-card-value"><%= @org_summary.calls_this_month %></div>
              <div class="stat-card-label">Calls This Month</div>
            </div>
          </div>

          <%!-- Leaderboard & Stage Summary --%>
          <div class="grid grid-cols-1 lg:grid-cols-2 gap-6 mb-8">
            <%!-- Team Leaderboard --%>
            <div class="card">
              <h3 class="text-xl font-display font-bold mb-6 flex items-center gap-2" style="color: var(--color-text-primary);">
                <.icon name="hero-trophy" class="w-6 h-6 text-amber-500" />
                Team Leaderboard
              </h3>
              <%= if @leaderboard == [] do %>
                <div class="text-center py-8" style="color: var(--color-text-muted);">
                  <.icon name="hero-chart-bar" class="w-12 h-12 mx-auto mb-2 opacity-50" />
                  <p>No call data available yet</p>
                </div>
              <% else %>
                <div class="space-y-3">
                  <%= for entry <- @leaderboard do %>
                    <div class="flex items-center justify-between p-4 rounded-xl border-2 transition-all hover:scale-[1.02]" 
                         style="border-color: var(--color-border); background: var(--color-bg-secondary);">
                      <div class="flex items-center gap-3">
                        <span class={"w-10 h-10 rounded-full flex items-center justify-center font-bold text-lg " <> rank_class(entry.rank)}>
                          <%= entry.rank %>
                        </span>
                        <div>
                          <div class="font-semibold" style="color: var(--color-text-primary);"><%= entry.user_name %></div>
                          <div class="text-xs" style="color: var(--color-text-muted);"><%= entry.user_email %></div>
                        </div>
                      </div>
                      <div class="text-right">
                        <div class="font-display font-bold text-lg" style="color: var(--color-primary);"><%= entry.total_calls %> <span class="text-sm font-normal">calls</span></div>
                        <div class="text-xs" style="color: var(--color-text-muted);"><%= entry.connected_calls %> connected</div>
                      </div>
                    </div>
                  <% end %>
                </div>
              <% end %>
            </div>

            <%!-- Lead Stage Funnel --%>
            <div class="card">
              <h3 class="text-xl font-display font-bold mb-6 flex items-center gap-2" style="color: var(--color-text-primary);">
                <.icon name="hero-funnel" class="w-6 h-6 text-[var(--color-primary)]" />
                Lead Stages
              </h3>
              <div class="space-y-4">
                <%= for {stage, color} <- stage_colors() do %>
                  <% count = Map.get(@stage_summary, stage, 0) %>
                  <% max_count = max(Enum.max(Map.values(@stage_summary), fn -> 1 end), 1) %>
                  <% width = count / max_count * 100 %>
                  <div class="flex items-center gap-4">
                    <span class="w-24 text-sm font-medium capitalize" style="color: var(--color-text-secondary);">
                      <%= String.replace(stage, "_", " ") %>
                    </span>
                    <div class="flex-1 h-3 rounded-full overflow-hidden" style="background: var(--color-bg-tertiary);">
                      <div class={"h-full rounded-full transition-all " <> color} style={"width: #{max(width, 3)}%"}></div>
                    </div>
                    <span class="w-8 text-right font-bold" style="color: var(--color-text-primary);"><%= count %></span>
                  </div>
                <% end %>
              </div>
            </div>
          </div>

          <%!-- Peak Hours Chart --%>
          <div class="card">
            <h3 class="text-xl font-display font-bold mb-6 flex items-center gap-2" style="color: var(--color-text-primary);">
              <.icon name="hero-clock" class="w-6 h-6 text-emerald-500" />
              Peak Calling Hours
            </h3>
            <div class="flex items-end gap-1 h-40 px-4">
              <%= for hour <- 0..23 do %>
                <% count = Enum.find(@hourly_data, %{call_count: 0}, & &1.hour == hour).call_count %>
                <% max_count = max(Enum.max_by(@hourly_data, & &1.call_count, fn -> %{call_count: 1} end).call_count, 1) %>
                <% height = count / max_count * 100 %>
                <div 
                  class="flex-1 rounded-t-md transition-all hover:opacity-80"
                  style={"height: #{max(height, 5)}%; background: linear-gradient(to top, var(--color-primary), var(--color-secondary));"}
                  title={"#{hour}:00 - #{count} calls"}>
                </div>
              <% end %>
            </div>
            <div class="flex justify-between text-xs mt-4 px-4" style="color: var(--color-text-muted);">
              <span>12 AM</span>
              <span>6 AM</span>
              <span>12 PM</span>
              <span>6 PM</span>
              <span>11 PM</span>
            </div>
          </div>
        </main>
      </div>
    </div>
    """
  end

  defp rank_class(1), do: "bg-amber-500 text-white"
  defp rank_class(2), do: "bg-zinc-400 text-white"
  defp rank_class(3), do: "bg-amber-700 text-white"
  defp rank_class(_), do: "bg-[var(--color-bg-tertiary)] text-[var(--color-text-secondary)]"

  defp stage_colors do
    [
      {"new", "bg-blue-500"},
      {"contacted", "bg-emerald-500"},
      {"interested", "bg-amber-500"},
      {"application_submitted", "bg-pink-500"},
      {"documents_collected", "bg-purple-500"},
      {"enrolled", "bg-cyan-500"},
      {"joined", "bg-green-600"}
    ]
  end
end
