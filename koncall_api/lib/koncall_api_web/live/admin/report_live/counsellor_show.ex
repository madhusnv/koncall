defmodule KoncallApiWeb.Admin.ReportLive.CounsellorShow do
  use KoncallApiWeb, :live_view
  alias KoncallApi.{Accounts, CRM}
  alias KoncallApi.CRM.Lead

  @per_page 15

  @impl true
  def mount(%{"id" => id}, session, socket) do
    user_id = session["admin_user_id"]
    current_user = Accounts.get_user!(user_id)
    counsellor = Accounts.get_user!(id)

    {:ok, assign(socket, 
      page_title: "Counsellor Report: #{counsellor.name}", 
      current_user: current_user,
      counsellor: counsellor,
      counsellor_id: id,
      page: 1,
      per_page: @per_page,
      total_count: 0,
      total_pages: 1,
      leads_stats: [],
      # Filters
      search: "",
      date_filter: "all",
      stage_filter: "",
      start_date: "",
      end_date: "",
      # Summary stats
      total_calls_today: 0,
      total_duration_today: 0,
      stages: Lead.lead_stages()
    )}
  end

  @impl true
  def handle_params(params, _uri, socket) do
    page = String.to_integer(params["page"] || "1")
    
    # Get filter values from URL params - use defaults when not present (for clear functionality)
    search = Map.get(params, "search", "")
    date_filter = Map.get(params, "date_filter", "all")
    stage_filter = Map.get(params, "stage", "")
    start_date = Map.get(params, "start_date", "")
    end_date = Map.get(params, "end_date", "")
    
    filter_params = %{
      "search" => search,
      "date_filter" => date_filter,
      "stage" => stage_filter,
      "start_date" => start_date,
      "end_date" => end_date
    }
    
    {leads_stats, total_count, summary} = load_leads_paginated(
      socket.assigns.counsellor_id,
      page,
      @per_page,
      filter_params
    )
    total_pages = max(1, ceil(total_count / @per_page))
    
    {:noreply, assign(socket, 
      leads_stats: leads_stats,
      page: page,
      total_count: total_count,
      total_pages: total_pages,
      search: search,
      date_filter: date_filter,
      stage_filter: stage_filter,
      start_date: start_date,
      end_date: end_date,
      total_calls_today: summary.calls_today,
      total_duration_today: summary.duration_today
    )}
  end

  defp load_leads_paginated(counsellor_id, page, per_page, params) do
    all_leads = CRM.get_counsellor_lead_stats(counsellor_id, params)
    total_count = length(all_leads)
    
    # Calculate summary stats
    summary = %{
      calls_today: Enum.reduce(all_leads, 0, fn item, acc -> acc + (item.calls_today || 0) end),
      duration_today: Enum.reduce(all_leads, 0, fn item, acc -> acc + (item.duration_today || 0) end)
    }
    
    paginated = all_leads
    |> Enum.drop((page - 1) * per_page)
    |> Enum.take(per_page)
    
    {paginated, total_count, summary}
  end

  # Event Handlers
  @impl true
  def handle_event("search", %{"search" => search}, socket) do
    {:noreply, push_patch(socket, to: build_filter_path(socket.assigns, %{search: search, page: 1}))}
  end

  def handle_event("filter_date", %{"date" => date_filter}, socket) do
    {:noreply, push_patch(socket, to: build_filter_path(socket.assigns, %{date_filter: date_filter, page: 1}))}
  end

  def handle_event("filter_stage", %{"stage" => stage}, socket) do
    {:noreply, push_patch(socket, to: build_filter_path(socket.assigns, %{stage: stage, page: 1}))}
  end

  def handle_event("apply_custom_date", %{"start_date" => start_date, "end_date" => end_date}, socket) do
    {:noreply, push_patch(socket, to: build_filter_path(socket.assigns, %{
      date_filter: "custom",
      start_date: start_date,
      end_date: end_date,
      page: 1
    }))}
  end

  def handle_event("clear_filters", _params, socket) do
    {:noreply, push_patch(socket, to: "/admin/reports/counsellors/#{socket.assigns.counsellor_id}")}
  end



  @impl true
  def render(assigns) do
    ~H"""
    <div class="app-layout">
      <%!-- Sidebar Navigation --%>
    <.admin_sidebar current_user={@current_user} active_tab="reports" />

      <%!-- Main Content Area --%>
      <div class="main-content">
        <header class="top-header">
          <a href="/admin/reports/counsellors" class="btn btn-ghost">
            <.icon name="hero-arrow-left" class="w-5 h-5" />
            Back to Counsellors
          </a>
          <div class="flex-1"></div>
        </header>

        <main class="main-content-inner">
          <%!-- Page Header --%>
          <div class="page-header">
            <div class="page-header-content">
              <div class="page-header-icon">
                <.icon name="hero-user" class="w-8 h-8" style="color: var(--color-primary);" />
              </div>
              <div>
                <h1 class="page-header-title"><%= @counsellor.name %></h1>
                <p class="page-header-subtitle">Detailed Performance Report</p>
              </div>
            </div>
          </div>

          <%!-- Summary Stats Cards --%>
          <div class="grid grid-cols-1 md:grid-cols-4 gap-4 mb-6">
            <div class="card p-4">
              <div class="flex items-center gap-3">
                <div class="w-12 h-12 rounded-xl flex items-center justify-center" style="background: var(--color-primary-light);">
                  <.icon name="hero-phone" class="w-6 h-6" style="color: var(--color-primary);" />
                </div>
                <div>
                  <div class="text-2xl font-bold font-display" style="color: var(--color-text-primary);"><%= @total_calls_today %></div>
                  <div class="text-sm" style="color: var(--color-text-muted);">Calls Today</div>
                </div>
              </div>
            </div>
            <div class="card p-4">
              <div class="flex items-center gap-3">
                <div class="w-12 h-12 rounded-xl flex items-center justify-center" style="background: var(--color-success-light, #dcfce7);">
                  <.icon name="hero-clock" class="w-6 h-6" style="color: var(--color-success);" />
                </div>
                <div>
                  <div class="text-2xl font-bold font-display" style="color: var(--color-text-primary);"><%= format_duration(@total_duration_today) %></div>
                  <div class="text-sm" style="color: var(--color-text-muted);">Duration Today</div>
                </div>
              </div>
            </div>
            <div class="card p-4">
              <div class="flex items-center gap-3">
                <div class="w-12 h-12 rounded-xl flex items-center justify-center" style="background: var(--color-info-light, #dbeafe);">
                  <.icon name="hero-user-group" class="w-6 h-6" style="color: var(--color-info);" />
                </div>
                <div>
                  <div class="text-2xl font-bold font-display" style="color: var(--color-text-primary);"><%= @total_count %></div>
                  <div class="text-sm" style="color: var(--color-text-muted);">Total Leads</div>
                </div>
              </div>
            </div>
            <div class="card p-4">
              <div class="flex items-center gap-3">
                <div class="w-12 h-12 rounded-xl flex items-center justify-center" style="background: var(--color-warning-light, #fef3c7);">
                  <.icon name="hero-funnel" class="w-6 h-6" style="color: var(--color-warning);" />
                </div>
                <div>
                  <div class="text-2xl font-bold font-display" style="color: var(--color-text-primary);"><%= if @stage_filter != "", do: String.capitalize(@stage_filter), else: "All" %></div>
                  <div class="text-sm" style="color: var(--color-text-muted);">Stage Filter</div>
                </div>
              </div>
            </div>
          </div>

          <%!-- Filters Card --%>
          <div class="card mb-6">
            <div class="flex flex-wrap items-center gap-4">
              <%!-- Search Input --%>
              <div class="flex-1 min-w-[250px]">
                <form phx-change="search" phx-submit="search" id="search-form">
                  <div class="relative">
                    <.icon name="hero-magnifying-glass" class="absolute left-3 top-1/2 -translate-y-1/2 w-5 h-5" style="color: var(--color-text-muted);" />
                    <input 
                      type="text" 
                      name="search" 
                      value={@search}
                      placeholder="Search by name, phone, or email..."
                      phx-debounce="300"
                      class="w-full pl-10 pr-4 py-2.5 rounded-xl border-2 focus:outline-none focus:ring-2 transition-all"
                      style="border-color: var(--color-border-light); background: var(--color-bg-secondary); color: var(--color-text-primary);"
                    />
                  </div>
                </form>
              </div>

              <%!-- Date Filter Tabs --%>
              <div class="flex items-center gap-1 p-1 rounded-xl" style="background: var(--color-bg-secondary);">
                <button 
                  phx-click="filter_date" 
                  phx-value-date="all"
                  class={["px-3 py-2 rounded-lg text-sm font-medium transition-all", @date_filter == "all" && "shadow-sm" || "hover:opacity-80"]}
                  style={if @date_filter == "all", do: "background: var(--color-bg-primary); color: var(--color-primary);", else: "color: var(--color-text-muted);"}
                >
                  All Time
                </button>
                <button 
                  phx-click="filter_date" 
                  phx-value-date="today"
                  class={["px-3 py-2 rounded-lg text-sm font-medium transition-all", @date_filter == "today" && "shadow-sm" || "hover:opacity-80"]}
                  style={if @date_filter == "today", do: "background: var(--color-bg-primary); color: var(--color-primary);", else: "color: var(--color-text-muted);"}
                >
                  Today
                </button>
                <button 
                  phx-click="filter_date" 
                  phx-value-date="week"
                  class={["px-3 py-2 rounded-lg text-sm font-medium transition-all", @date_filter == "week" && "shadow-sm" || "hover:opacity-80"]}
                  style={if @date_filter == "week", do: "background: var(--color-bg-primary); color: var(--color-primary);", else: "color: var(--color-text-muted);"}
                >
                  7 Days
                </button>
                <button 
                  phx-click="filter_date" 
                  phx-value-date="month"
                  class={["px-3 py-2 rounded-lg text-sm font-medium transition-all", @date_filter == "month" && "shadow-sm" || "hover:opacity-80"]}
                  style={if @date_filter == "month", do: "background: var(--color-bg-primary); color: var(--color-primary);", else: "color: var(--color-text-muted);"}
                >
                  30 Days
                </button>
              </div>

              <%!-- Stage Filter Dropdown --%>
              <form phx-change="filter_stage" id="stage-filter-form">
                <select 
                  name="stage" 
                  class="px-4 py-2.5 rounded-xl border-2 focus:outline-none focus:ring-2 transition-all cursor-pointer"
                  style="border-color: var(--color-border-light); background: var(--color-bg-secondary); color: var(--color-text-primary);"
                >
                  <option value="">All Stages</option>
                  <%= for stage <- @stages do %>
                    <option value={stage} selected={@stage_filter == stage}><%= String.capitalize(stage) %></option>
                  <% end %>
                </select>
              </form>

              <%!-- Clear Filters Button --%>
              <%= if has_active_filters?(assigns) do %>
                <button 
                  type="button"
                  phx-click="clear_filters"
                  class="px-4 py-2.5 rounded-xl border-2 flex items-center gap-2 hover:opacity-80 transition-all"
                  style="border-color: var(--color-error); color: var(--color-error);"
                >
                  <.icon name="hero-x-mark" class="w-4 h-4" />
                  Clear
                </button>
              <% end %>
            </div>
          </div>

          <%!-- Table Card --%>
          <div class="card">
            <div class="flex items-center justify-between mb-6">
              <h3 class="text-xl font-display font-bold flex items-center gap-2" style="color: var(--color-text-primary);">
                <.icon name="hero-phone" class="w-6 h-6" style="color: var(--color-secondary);" />
                Assigned Leads & Call Activity
              </h3>
              <span class="badge badge-primary"><%= @total_count %> Leads</span>
            </div>

            <div class="overflow-x-auto rounded-xl border-2" style="border-color: var(--color-border-light);">
              <table class="table">
                <thead>
                  <tr>
                    <th>Lead Details</th>
                    <th>Status</th>
                    <th>University</th>
                    <th class="text-center">Total Calls</th>
                    <th class="text-center">Today</th>
                    <th class="text-center">Total Duration</th>
                    <th>Last Call Time</th>
                    <th class="text-center">Call History</th>
                  </tr>
                </thead>
                <tbody>
                  <%= if Enum.empty?(@leads_stats) do %>
                    <tr>
                      <td colspan="8" class="text-center py-12" style="color: var(--color-text-muted);">
                        <%= if has_active_filters?(assigns) do %>
                          No leads match your filter criteria.
                        <% else %>
                          No assigned leads found for this counsellor.
                        <% end %>
                      </td>
                    </tr>
                  <% else %>
                    <%= for item <- @leads_stats do %>
                      <tr>
                        <td>
                          <div class="flex flex-col">
                            <span class="font-semibold"><%= item.lead.student_name %></span>
                            <span class="text-sm font-data" style="color: var(--color-text-muted);"><%= item.lead.phone_number %></span>
                          </div>
                        </td>
                        <td>
                          <span class={"badge #{badge_class(item.lead.stage)}"}><%= String.capitalize(item.lead.stage || "new") %></span>
                        </td>
                        <td style="color: var(--color-text-secondary);">
                          <%= if item.lead.university, do: item.lead.university.name, else: "-" %>
                        </td>
                        <td class="text-center">
                          <span class="badge badge-info"><%= item.total_calls || 0 %></span>
                        </td>
                        <td class="text-center">
                          <%= if (item.calls_today || 0) > 0 do %>
                            <span class="badge badge-success"><%= item.calls_today %></span>
                          <% else %>
                            <span style="color: var(--color-text-muted);">-</span>
                          <% end %>
                        </td>
                        <td class="text-center font-semibold"><%= format_duration(item.total_duration) %></td>
                        <td style="color: var(--color-text-muted);"><%= format_datetime(item.last_call_at) %></td>
                        <td class="text-center">
                          <.link navigate={"/admin/reports/leads/#{item.lead.id}/calls"} class="btn btn-ghost btn-sm">
                            <.icon name="hero-play-circle" class="w-5 h-5" style="color: var(--color-primary);" />
                          </.link>
                        </td>
                      </tr>
                    <% end %>
                  <% end %>
                </tbody>
              </table>
            </div>
          </div>

          <%!-- Pagination --%>
          <%= if @total_count > 0 do %>
            <div class="flex items-center justify-between mt-6">
              <div class="text-sm" style="color: var(--color-text-muted);">
                Showing <%= (@page - 1) * @per_page + 1 %>-<%= min(@page * @per_page, @total_count) %> of <%= @total_count %> leads
              </div>
              
              <div class="flex items-center gap-2">
                <%= if @page > 1 do %>
                  <.link patch={build_filter_path(assigns, %{page: @page - 1})} class="btn btn-secondary">
                    <.icon name="hero-chevron-left" class="w-4 h-4" />
                    Previous
                  </.link>
                <% else %>
                  <button disabled class="btn btn-secondary opacity-50 cursor-not-allowed">
                    <.icon name="hero-chevron-left" class="w-4 h-4" />
                    Previous
                  </button>
                <% end %>
                
                <div class="flex items-center gap-1">
                  <%= for page_num <- max(1, @page - 2)..min(@total_pages, @page + 2) do %>
                    <%= if page_num == @page do %>
                      <span class="px-3 py-2 rounded-lg font-semibold" style="background: var(--color-primary); color: white;">
                        <%= page_num %>
                      </span>
                    <% else %>
                      <.link patch={build_filter_path(assigns, %{page: page_num})} class="px-3 py-2 rounded-lg hover:bg-[var(--color-bg-secondary)]" style="color: var(--color-text-primary);">
                        <%= page_num %>
                      </.link>
                    <% end %>
                  <% end %>
                </div>
                
                <%= if @page < @total_pages do %>
                  <.link patch={build_filter_path(assigns, %{page: @page + 1})} class="btn btn-secondary">
                    Next
                    <.icon name="hero-chevron-right" class="w-4 h-4" />
                  </.link>
                <% else %>
                  <button disabled class="btn btn-secondary opacity-50 cursor-not-allowed">
                    Next
                    <.icon name="hero-chevron-right" class="w-4 h-4" />
                  </button>
                <% end %>
              </div>
            </div>
          <% end %>
        </main>
      </div>
    </div>
    """
  end

  # Helper for pagination with filters preserved
  defp build_filter_path(assigns, overrides) do
    params = %{
      search: Map.get(overrides, :search, assigns.search),
      date_filter: Map.get(overrides, :date_filter, assigns.date_filter),
      stage: Map.get(overrides, :stage, assigns.stage_filter),
      start_date: Map.get(overrides, :start_date, assigns.start_date),
      end_date: Map.get(overrides, :end_date, assigns.end_date),
      page: Map.get(overrides, :page, assigns.page)
    }
    |> Enum.filter(fn {_k, v} -> v != "" and v != nil end)
    |> Enum.into(%{})
    
    query_string = URI.encode_query(params)
    "/admin/reports/counsellors/#{assigns.counsellor_id}?#{query_string}"
  end

  defp has_active_filters?(assigns) do
    assigns.search != "" or
    assigns.date_filter not in ["all", ""] or
    assigns.stage_filter != ""
  end

  defp badge_class("new"), do: "badge-info"
  defp badge_class("contacted"), do: "badge-warning"
  defp badge_class("interested"), do: "badge-success"
  defp badge_class("enrolled"), do: "badge-success"
  defp badge_class("joined"), do: "badge-success"
  defp badge_class(_), do: ""

  defp format_duration(nil), do: "-"
  defp format_duration(0), do: "0s"
  defp format_duration(seconds) do
    minutes = div(seconds, 60)
    secs = rem(seconds, 60)
    if minutes > 0, do: "#{minutes}m #{secs}s", else: "#{secs}s"
  end

  defp format_datetime(nil), do: "-"
  defp format_datetime(dt) do
    KoncallApiWeb.CoreComponents.format_datetime_ist(dt)
  end
end
