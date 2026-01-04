defmodule KoncallApiWeb.Admin.ReportLive.Index do
  use KoncallApiWeb, :live_view
  alias KoncallApi.Accounts

  @impl true
  def mount(_params, session, socket) do
    user_id = session["admin_user_id"]
    user = Accounts.get_user!(user_id)
    {:ok, assign(socket, page_title: "Reports", current_user: user)}
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
          <div class="flex-1"></div>
        </header>

        <main class="main-content-inner">
          <%!-- Page Header --%>
          <div class="page-header">
            <div class="page-header-content">
              <div class="page-header-icon">
                <.icon name="hero-document-chart-bar" class="w-8 h-8" style="color: var(--color-success);" />
              </div>
              <div>
                <h1 class="page-header-title">Reports</h1>
                <p class="page-header-subtitle">Analytics and performance insights</p>
              </div>
            </div>
          </div>

          <%!-- Report Cards --%>
          <div class="grid grid-cols-1 md:grid-cols-3 gap-6 animate-stagger">
            <a href="/admin/reports/counsellors" class="card group">
              <div class="flex items-start gap-4">
                <div class="p-3 rounded-xl" style="background: var(--color-bg-secondary);">
                  <.icon name="hero-users" class="w-8 h-8" style="color: var(--color-primary);" />
                </div>
                <div class="flex-1">
                  <h3 class="text-lg font-display font-bold group-hover:text-[var(--color-primary)] transition-colors" style="color: var(--color-text-primary);">Counsellor Performance</h3>
                  <p class="text-sm mt-1" style="color: var(--color-text-muted);">View individual counsellor metrics and KPIs</p>
                </div>
                <.icon name="hero-arrow-right" class="w-5 h-5 group-hover:translate-x-1 transition-transform" style="color: var(--color-text-muted);" />
              </div>
            </a>

            <a href="/admin/reports/branches" class="card group">
              <div class="flex items-start gap-4">
                <div class="p-3 rounded-xl" style="background: var(--color-bg-secondary);">
                  <.icon name="hero-building-office" class="w-8 h-8" style="color: var(--color-secondary);" />
                </div>
                <div class="flex-1">
                  <h3 class="text-lg font-display font-bold group-hover:text-[var(--color-secondary)] transition-colors" style="color: var(--color-text-primary);">Branch Reports</h3>
                  <p class="text-sm mt-1" style="color: var(--color-text-muted);">Compare branch performance across locations</p>
                </div>
                <.icon name="hero-arrow-right" class="w-5 h-5 group-hover:translate-x-1 transition-transform" style="color: var(--color-text-muted);" />
              </div>
            </a>

            <a href="/admin/reports/universities" class="card group">
              <div class="flex items-start gap-4">
                <div class="p-3 rounded-xl" style="background: var(--color-bg-secondary);">
                  <.icon name="hero-academic-cap" class="w-8 h-8" style="color: var(--color-success);" />
                </div>
                <div class="flex-1">
                  <h3 class="text-lg font-display font-bold group-hover:text-[var(--color-success)] transition-colors" style="color: var(--color-text-primary);">University Reports</h3>
                  <p class="text-sm mt-1" style="color: var(--color-text-muted);">Enrollment and admission statistics by university</p>
                </div>
                <.icon name="hero-arrow-right" class="w-5 h-5 group-hover:translate-x-1 transition-transform" style="color: var(--color-text-muted);" />
              </div>
            </a>
          </div>
        </main>
      </div>
    </div>
    """
  end
end
