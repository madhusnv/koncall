defmodule KoncallApiWeb.Admin.ReportLive.CounsellorShow do
  use KoncallApiWeb, :live_view
  alias KoncallApi.{Accounts, CRM}

  @impl true
  def mount(%{"id" => id}, _session, socket) do
    counsellor = Accounts.get_user!(id)
    # Fetch leads with stats
    leads_with_stats = CRM.get_counsellor_lead_stats(counsellor.id)

    {:ok, assign(socket, page_title: "Counsellor Report: #{counsellor.name}", counsellor: counsellor, leads_stats: leads_with_stats)}
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
