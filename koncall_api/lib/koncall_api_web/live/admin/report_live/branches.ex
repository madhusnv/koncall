defmodule KoncallApiWeb.Admin.ReportLive.Branches do
  use KoncallApiWeb, :live_view
  alias KoncallApi.{Accounts, Branches, CRM}

  @impl true
  def mount(_params, session, socket) do
    user_id = session["admin_user_id"]
    user = Accounts.get_user!(user_id, [:organization])
    branch_stats = load_branch_stats(user.organization_id)

    {:ok, assign(socket, page_title: "Branch Reports", current_user: user, branches: branch_stats)}
  end

  defp load_branch_stats(org_id) do
    Branches.list_branches(org_id)
    |> Enum.map(fn b ->
      stats = CRM.get_stage_stats(:branch, b.id)
      total = stats |> Map.values() |> Enum.sum()
      counsellors = Branches.list_branch_counsellors(b.id)
      %{branch: b, stats: stats, total_leads: total, counsellor_count: length(counsellors)}
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
                <.icon name="hero-building-office" class="w-8 h-8" style="color: var(--color-secondary);" />
              </div>
              <div>
                <h1 class="page-header-title">Branch Reports</h1>
                <p class="page-header-subtitle">Compare performance across all branches</p>
              </div>
            </div>
          </div>

          <%!-- Branch Cards --%>
          <div class="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-6 animate-stagger">
            <%= for b <- @branches do %>
              <div class="card">
                <div class="flex items-center gap-3 mb-4">
                  <div class="p-2 rounded-xl" style="background: var(--color-bg-secondary);">
                    <.icon name="hero-building-office" class="w-6 h-6" style="color: var(--color-secondary);" />
                  </div>
                  <div>
                    <h3 class="text-lg font-display font-bold" style="color: var(--color-text-primary);"><%= b.branch.name %></h3>
                    <p class="text-sm" style="color: var(--color-text-muted);"><%= b.branch.location %></p>
                  </div>
                </div>
                <div class="grid grid-cols-2 gap-3">
                  <div class="text-center p-3 rounded-xl border-2" style="border-color: var(--color-border-light); background: var(--color-bg-secondary);">
                    <div class="text-2xl font-display font-bold" style="color: var(--color-primary);"><%= b.total_leads %></div>
                    <div class="text-xs font-semibold" style="color: var(--color-text-muted);">Total Leads</div>
                  </div>
                  <div class="text-center p-3 rounded-xl border-2" style="border-color: var(--color-border-light); background: var(--color-bg-secondary);">
                    <div class="text-2xl font-display font-bold" style="color: var(--color-info);"><%= b.counsellor_count %></div>
                    <div class="text-xs font-semibold" style="color: var(--color-text-muted);">Counsellors</div>
                  </div>
                  <div class="text-center p-3 rounded-xl border-2" style="border-color: var(--color-border-light); background: var(--color-bg-secondary);">
                    <div class="text-2xl font-display font-bold" style="color: var(--color-warning);"><%= Map.get(b.stats, "enrolled", 0) %></div>
                    <div class="text-xs font-semibold" style="color: var(--color-text-muted);">Enrolled</div>
                  </div>
                  <div class="text-center p-3 rounded-xl border-2" style="border-color: var(--color-border-light); background: var(--color-bg-secondary);">
                    <div class="text-2xl font-display font-bold" style="color: var(--color-success);"><%= Map.get(b.stats, "joined", 0) %></div>
                    <div class="text-xs font-semibold" style="color: var(--color-text-muted);">Joined</div>
                  </div>
                </div>
              </div>
            <% end %>
          </div>
        </main>
      </div>
    </div>
    """
  end
end
