defmodule KoncallApiWeb.Admin.ReportLive.CounsellorShow do
  use KoncallApiWeb, :live_view
  alias KoncallApi.{Accounts, CRM}

  @per_page 15

  @impl true
  def mount(%{"id" => id}, _session, socket) do
    counsellor = Accounts.get_user!(id)

    {:ok, assign(socket, 
      page_title: "Counsellor Report: #{counsellor.name}", 
      counsellor: counsellor,
      counsellor_id: id,
      page: 1,
      per_page: @per_page,
      total_count: 0,
      total_pages: 1,
      leads_stats: []
    )}
  end

  @impl true
  def handle_params(params, _uri, socket) do
    page = String.to_integer(params["page"] || "1")
    {leads_stats, total_count} = load_leads_paginated(
      socket.assigns.counsellor_id,
      page,
      @per_page
    )
    total_pages = max(1, ceil(total_count / @per_page))
    
    {:noreply, assign(socket, 
      leads_stats: leads_stats,
      page: page,
      total_count: total_count,
      total_pages: total_pages
    )}
  end

  defp load_leads_paginated(counsellor_id, page, per_page) do
    all_leads = CRM.get_counsellor_lead_stats(counsellor_id)
    total_count = length(all_leads)
    
    paginated = all_leads
    |> Enum.drop((page - 1) * per_page)
    |> Enum.take(per_page)
    
    {paginated, total_count}
  end

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
            <.icon name="hero-chart-bar" class="sidebar-nav-icon" />
            <span>Dashboard</span>
          </a>
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
          <a href="/admin/leads" class="sidebar-nav-item">
            <.icon name="hero-user-group" class="sidebar-nav-icon" />
            <span>Leads</span>
          </a>
          <a href="/admin/reports" class="sidebar-nav-item active">
            <.icon name="hero-document-chart-bar" class="sidebar-nav-icon" />
            <span>Reports</span>
          </a>
        </nav>

        <div class="p-4 border-t-2 border-[var(--color-border-light)]">
          <a href="/admin/logout" class="sidebar-nav-item" style="color: var(--color-error);">
            <.icon name="hero-arrow-right-on-rectangle" class="sidebar-nav-icon" />
            <span>Log out</span>
          </a>
        </div>
      </aside>

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

          <%!-- Table Card --%>
          <div class="card">
            <div class="flex items-center justify-between mb-6">
              <h3 class="text-xl font-display font-bold flex items-center gap-2" style="color: var(--color-text-primary);">
                <.icon name="hero-phone" class="w-6 h-6" style="color: var(--color-secondary);" />
                Assigned Leads & Call Activity
              </h3>
              <span class="badge badge-primary"><%= length(@leads_stats) %> Leads</span>
            </div>

            <div class="overflow-x-auto rounded-xl border-2" style="border-color: var(--color-border-light);">
              <table class="table">
                <thead>
                  <tr>
                    <th>Lead Details</th>
                    <th>Status</th>
                    <th>University</th>
                    <th class="text-center">Total Calls</th>
                    <th class="text-center">Total Duration</th>
                    <th>Last Call Time</th>
                  </tr>
                </thead>
                <tbody>
                  <%= if Enum.empty?(@leads_stats) do %>
                    <tr>
                      <td colspan="6" class="text-center py-12" style="color: var(--color-text-muted);">
                        No assigned leads found for this counsellor.
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
                        <td class="text-center font-semibold"><%= format_duration(item.total_duration) %></td>
                        <td style="color: var(--color-text-muted);"><%= format_datetime(item.last_call_at) %></td>
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
                  <.link patch={"?page=#{@page - 1}"} class="btn btn-secondary">
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
                      <.link patch={"?page=#{page_num}"} class="px-3 py-2 rounded-lg hover:bg-[var(--color-bg-secondary)]" style="color: var(--color-text-primary);">
                        <%= page_num %>
                      </.link>
                    <% end %>
                  <% end %>
                </div>
                
                <%= if @page < @total_pages do %>
                  <.link patch={"?page=#{@page + 1}"} class="btn btn-secondary">
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

  defp badge_class("new"), do: "badge-info"
  defp badge_class("contacted"), do: "badge-warning"
  defp badge_class("interested"), do: "badge-success"
  defp badge_class("enrolled"), do: "badge-success"
  defp badge_class("joined"), do: "badge-success"
  defp badge_class(_), do: ""

  defp format_duration(nil), do: "-"
  defp format_duration(seconds) do
    minutes = div(seconds, 60)
    secs = rem(seconds, 60)
    "#{minutes}m #{secs}s"
  end

  defp format_datetime(nil), do: "-"
  defp format_datetime(dt) do
    Calendar.strftime(dt, "%d %b %H:%M")
  end
end
