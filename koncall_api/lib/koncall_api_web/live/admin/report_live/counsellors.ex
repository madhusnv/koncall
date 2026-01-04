defmodule KoncallApiWeb.Admin.ReportLive.Counsellors do
  use KoncallApiWeb, :live_view
  alias KoncallApi.{Accounts, Branches, CRM}

  @impl true
  def mount(_params, session, socket) do
    user_id = session["admin_user_id"]
    user = Accounts.get_user!(user_id, [:organization])
    counsellors = load_counsellor_stats(user.organization_id)

    {:ok, assign(socket, page_title: "Counsellor Reports", current_user: user, counsellors: counsellors)}
  end

  defp load_counsellor_stats(org_id) do
    Accounts.list_users(org_id)
    |> Enum.filter(& &1.role == "counsellor")
    |> Enum.map(fn u ->
      stats = CRM.get_stage_stats(:counsellor, u.id)
      total = stats |> Map.values() |> Enum.sum()
      %{user: u, stats: stats, total_leads: total}
    end)
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
          <div class="flex items-center gap-3 p-3 rounded-xl" style="background: var(--color-bg-secondary);">
            <.icon name="hero-user-circle-solid" class="w-10 h-10" style="color: var(--color-primary);" />
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

      <%!-- Main Content Area --%>
      <div class="main-content">
        <header class="top-header">
          <a href="/admin/reports" class="btn btn-ghost">
            <.icon name="hero-arrow-left" class="w-5 h-5" />
            Back to Reports
          </a>
          <div class="flex-1"></div>
        </header>

        <main class="main-content-inner">
          <%!-- Page Header --%>
          <div class="page-header">
            <div class="page-header-content">
              <div class="page-header-icon">
                <.icon name="hero-users" class="w-8 h-8" style="color: var(--color-primary);" />
              </div>
              <div>
                <h1 class="page-header-title">Counsellor Performance</h1>
                <p class="page-header-subtitle">Individual counsellor metrics and lead statistics</p>
              </div>
            </div>
          </div>

          <%!-- Table Card --%>
          <div class="card">
            <div class="overflow-x-auto rounded-xl border-2" style="border-color: var(--color-border-light);">
              <table class="table">
                <thead>
                  <tr>
                    <th>Counsellor</th>
                    <th>Total Leads</th>
                    <th>New</th>
                    <th>Contacted</th>
                    <th>Interested</th>
                    <th>Enrolled</th>
                    <th>Joined</th>
                  </tr>
                </thead>
                <tbody>
                  <%= for c <- @counsellors do %>
                    <tr>
                      <td>
                        <a href={"/admin/reports/counsellors/#{c.user.id}"} class="font-semibold hover:underline" style="color: var(--color-primary);">
                          <%= c.user.name %>
                        </a>
                      </td>
                      <td class="font-bold" style="color: var(--color-primary);"><%= c.total_leads %></td>
                      <td><%= Map.get(c.stats, "new", 0) %></td>
                      <td><%= Map.get(c.stats, "contacted", 0) %></td>
                      <td><%= Map.get(c.stats, "interested", 0) %></td>
                      <td class="font-medium" style="color: var(--color-success);"><%= Map.get(c.stats, "enrolled", 0) %></td>
                      <td class="font-medium" style="color: var(--color-success);"><%= Map.get(c.stats, "joined", 0) %></td>
                    </tr>
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
end
