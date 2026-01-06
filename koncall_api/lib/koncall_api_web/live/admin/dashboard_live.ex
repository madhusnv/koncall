defmodule KoncallApiWeb.Admin.DashboardLive do
  use KoncallApiWeb, :live_view

  alias KoncallApi.{Branches, Universities, CRM, Accounts}
  alias KoncallApi.CallTracking.CallLog
  alias KoncallApi.Repo
  import Ecto.Query

  @impl true
  def mount(_params, session, socket) do
    user_id = session["admin_user_id"]
    user = Accounts.get_user!(user_id, [:branch, :organization])
    org_id = user.organization_id

    # Load dashboard data based on role
    stats = load_stats(user)
    branches = if user.role == "admin", do: Branches.list_branches(org_id), else: []
    universities = Universities.list_universities(org_id)
    stage_stats = CRM.get_stage_stats(:organization, org_id)
    recent_leads = load_recent_leads(user, 10)

    {:ok, assign(socket,
      page_title: "Dashboard",
      current_user: user,
      stats: stats,
      branches: branches,
      universities: universities,
      stage_stats: stage_stats,
      recent_leads: recent_leads
    )}
  end

  defp load_stats(user) do
    org_id = user.organization_id
    
    base_query = case user.role do
      "admin" -> CallLog |> where([c], c.organization_id == ^org_id)
      "branch_manager" -> CallLog |> where([c], c.organization_id == ^org_id)
    end

    today = Date.utc_today()

    %{
      total_calls: Repo.aggregate(base_query, :count, :id) || 0,
      today_calls: base_query |> where([c], fragment("DATE(?) = ?", c.call_datetime, ^today)) |> Repo.aggregate(:count, :id) || 0,
      total_duration: Repo.aggregate(base_query, :sum, :duration) || 0,
      total_leads: CRM.Lead |> where([l], l.organization_id == ^org_id and l.is_deleted == false) |> Repo.aggregate(:count, :id) || 0,
      total_counsellors: Accounts.User |> where([u], u.organization_id == ^org_id and u.role == "counsellor") |> Repo.aggregate(:count, :id) || 0,
      total_branches: Branches.list_branches(org_id) |> length(),
      total_universities: Universities.list_universities(org_id) |> length()
    }
  end

  defp load_recent_leads(user, limit) do
    CRM.list_leads(user.organization_id, %{"per_page" => "#{limit}"})
  end

  defp format_duration(nil), do: "0s"
  defp format_duration(seconds) when seconds < 60, do: "#{seconds}s"
  defp format_duration(seconds) do
    hours = div(seconds, 3600)
    mins = div(rem(seconds, 3600), 60)
    if hours > 0, do: "#{hours}h #{mins}m", else: "#{mins}m"
  end



  defp stage_label("new"), do: "New"
  defp stage_label("contacted"), do: "Contacted"
  defp stage_label("interested"), do: "Interested"
  defp stage_label("application_submitted"), do: "Application"
  defp stage_label("documents_collected"), do: "Documents"
  defp stage_label("enrolled"), do: "Enrolled"
  defp stage_label("joined"), do: "Joined"
  defp stage_label(stage), do: stage

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
          <a href="/admin/dashboard" class="sidebar-nav-item active">
            <.icon name="hero-chart-bar" class="sidebar-nav-icon" />
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
          <a href="/admin/reports" class="sidebar-nav-item">
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
        </header>

        <main class="main-content-inner">
          <%!-- Page Header --%>
          <div class="page-header">
            <div class="page-header-content">
              <div class="page-header-icon">
                <.icon name="hero-chart-bar" class="w-8 h-8" style="color: var(--color-success);" />
              </div>
              <div>
                <h1 class="page-header-title">Dashboard</h1>
                <p class="page-header-subtitle">Overview of leads, calls, and performance metrics</p>
              </div>
            </div>
          </div>

          <%!-- Stats Cards --%>
          <div class="grid grid-cols-1 sm:grid-cols-2 lg:grid-cols-4 gap-6 mb-8 animate-stagger">
            <div class="stat-card">
              <div class="stat-card-icon">
                <.icon name="hero-user-group" class="w-5 h-5" />
              </div>
              <div class="stat-card-value"><%= @stats.total_leads %></div>
              <div class="stat-card-label">Total Leads</div>
            </div>
            <div class="stat-card">
              <div class="stat-card-icon">
                <.icon name="hero-phone" class="w-5 h-5" />
              </div>
              <div class="stat-card-value"><%= @stats.total_calls %></div>
              <div class="stat-card-label">Total Calls</div>
            </div>
            <div class="stat-card">
              <div class="stat-card-icon">
                <.icon name="hero-clock" class="w-5 h-5" />
              </div>
              <div class="stat-card-value"><%= @stats.today_calls %></div>
              <div class="stat-card-label">Today's Calls</div>
            </div>
            <div class="stat-card">
              <div class="stat-card-icon">
                <.icon name="hero-academic-cap" class="w-5 h-5" />
              </div>
              <div class="stat-card-value"><%= @stats.total_universities %></div>
              <div class="stat-card-label">Universities</div>
            </div>
          </div>

          <%!-- Secondary Stats Row --%>
          <div class="grid grid-cols-1 sm:grid-cols-3 gap-6 mb-8 animate-stagger">
            <div class="stat-card">
              <div class="stat-card-icon">
                <.icon name="hero-play-circle" class="w-5 h-5" />
              </div>
              <div class="stat-card-value"><%= format_duration(@stats.total_duration) %></div>
              <div class="stat-card-label">Talk Time</div>
            </div>
            <div class="stat-card">
              <div class="stat-card-icon">
                <.icon name="hero-users" class="w-5 h-5" />
              </div>
              <div class="stat-card-value"><%= @stats.total_counsellors %></div>
              <div class="stat-card-label">Counsellors</div>
            </div>
            <div class="stat-card">
              <div class="stat-card-icon">
                <.icon name="hero-building-office" class="w-5 h-5" />
              </div>
              <div class="stat-card-value"><%= @stats.total_branches %></div>
              <div class="stat-card-label">Branches</div>
            </div>
          </div>

          <%!-- Lead Funnel --%>
          <div class="card mb-8">
            <h3 class="text-xl font-display font-bold mb-6 flex items-center gap-2" style="color: var(--color-text-primary);">
              <.icon name="hero-funnel" class="w-6 h-6" style="color: var(--color-primary);" />
              Lead Funnel
            </h3>
            <div class="grid grid-cols-2 sm:grid-cols-4 lg:grid-cols-7 gap-4">
              <%= for stage <- ~w(new contacted interested application_submitted documents_collected enrolled joined) do %>
                <div class="text-center p-4 rounded-xl border-2 transition-all hover:scale-105 hover:shadow-lg" style="border-color: var(--color-border); background: var(--color-bg-secondary);">
                  <div class="text-2xl font-display font-bold" style="color: var(--color-primary);"><%= Map.get(@stage_stats, stage, 0) %></div>
                  <div class="text-xs font-semibold mt-1" style="color: var(--color-text-muted);"><%= stage_label(stage) %></div>
                </div>
              <% end %>
            </div>
          </div>

          <%!-- Recent Leads Table --%>
          <div class="card">
            <div class="flex items-center justify-between mb-6">
              <h3 class="text-xl font-display font-bold flex items-center gap-2" style="color: var(--color-text-primary);">
                <.icon name="hero-user-group" class="w-6 h-6" style="color: var(--color-secondary);" />
                Recent Leads
              </h3>
              <a href="/admin/leads" class="btn btn-ghost text-sm">
                View All →
              </a>
            </div>

            <div class="overflow-x-auto rounded-xl border-2" style="border-color: var(--color-border-light);">
              <table class="table">
                <thead>
                  <tr>
                    <th>Name</th>
                    <th>Phone</th>
                    <th>Stage</th>
                    <th>Assigned To</th>
                    <th>Branch</th>
                  </tr>
                </thead>
                <tbody>
                  <%= for lead <- @recent_leads do %>
                    <tr>
                      <td class="font-semibold"><%= lead.student_name || lead.first_name %></td>
                      <td class="font-data" style="color: var(--color-text-muted);"><%= lead.phone_number %></td>
                      <td>
                        <span class={"badge #{badge_class(lead.stage)}"}>
                          <%= stage_label(lead.stage) %>
                        </span>
                      </td>
                      <td style="color: var(--color-text-secondary);"><%= if lead.assigned_to_user, do: lead.assigned_to_user.name, else: "Unassigned" %></td>
                      <td style="color: var(--color-text-secondary);"><%= if lead.branch, do: lead.branch.name, else: "-" %></td>
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

  defp badge_class("new"), do: "badge-info"
  defp badge_class("contacted"), do: "badge-warning"
  defp badge_class("interested"), do: "badge-success"
  defp badge_class("application_submitted"), do: "badge-primary"
  defp badge_class("documents_collected"), do: "badge-primary"
  defp badge_class("enrolled"), do: "badge-success"
  defp badge_class("joined"), do: "badge-success"
  defp badge_class(_), do: ""
end
