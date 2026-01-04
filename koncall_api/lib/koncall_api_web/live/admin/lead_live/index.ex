defmodule KoncallApiWeb.Admin.LeadLive.Index do
  use KoncallApiWeb, :live_view
  alias KoncallApi.{CRM, Accounts, Branches, Universities}
  alias KoncallApi.CRM.Lead

  @impl true
  def mount(_params, session, socket) do
    user_id = session["admin_user_id"]
    user = Accounts.get_user!(user_id, [:organization, :branch])
    
    leads = load_leads(user, %{})
    branches = Branches.list_branches(user.organization_id)
    universities = Universities.list_universities(user.organization_id)
    stage_stats = CRM.get_stage_stats(:organization, user.organization_id)

    {:ok, assign(socket,
      page_title: "Leads",
      current_user: user,
      leads: leads,
      branches: branches,
      universities: universities,
      stage_stats: stage_stats,
      filters: %{}
    )}
  end

  defp load_leads(user, filters) do
    case user.role do
      "admin" -> CRM.list_leads(user.organization_id, filters)
      "branch_manager" -> CRM.list_branch_leads(user.branch_id, filters)
      _ -> []
    end
  end

  @impl true
  def handle_event("filter", params, socket) do
    filters = %{
      "stage" => params["stage"],
      "branch_id" => params["branch_id"],
      "search" => params["search"]
    } |> Enum.reject(fn {_, v} -> v == "" or is_nil(v) end) |> Map.new()

    leads = load_leads(socket.assigns.current_user, filters)
    {:noreply, assign(socket, leads: leads, filters: filters)}
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
          <a href="/admin/leads" class="sidebar-nav-item active">
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

      <%!-- Main Content Area --%>
      <div class="main-content">
        <header class="top-header">
          <div class="flex-1"></div>
          <div class="flex items-center gap-3">
            <a href="/admin/leads/import" class="btn btn-ghost">
              <.icon name="hero-arrow-up-tray" class="w-5 h-5" />
              Import CSV
            </a>
          </div>
        </header>

        <main class="main-content-inner">
          <%!-- Page Header --%>
          <div class="page-header">
            <div class="page-header-content">
              <div class="page-header-icon">
                <.icon name="hero-user-group" class="w-8 h-8" style="color: var(--color-warning);" />
              </div>
              <div>
                <h1 class="page-header-title">Lead Management</h1>
                <p class="page-header-subtitle">Track and manage student leads through the funnel</p>
              </div>
            </div>
          </div>

          <%!-- Stage Funnel --%>
          <div class="card mb-6">
            <h3 class="text-lg font-display font-bold mb-4 flex items-center gap-2" style="color: var(--color-text-primary);">
              <.icon name="hero-funnel" class="w-5 h-5" style="color: var(--color-primary);" />
              Lead Funnel
            </h3>
            <div class="grid grid-cols-2 sm:grid-cols-4 lg:grid-cols-7 gap-3">
              <%= for stage <- ~w(new contacted interested application_submitted documents_collected enrolled joined) do %>
                <button phx-click="filter" phx-value-stage={stage}
                        class="text-center p-4 rounded-xl border-2 transition-all hover:scale-105 hover:shadow-lg" 
                        style={"border-color: var(--color-border); background: #{if @filters["stage"] == stage, do: "var(--color-bg-tertiary)", else: "var(--color-bg-secondary)"};"}>
                  <div class="text-2xl font-display font-bold" style="color: var(--color-primary);"><%= Map.get(@stage_stats, stage, 0) %></div>
                  <div class="text-xs font-semibold mt-1" style="color: var(--color-text-muted);"><%= stage_label(stage) %></div>
                </button>
              <% end %>
            </div>
          </div>

          <%!-- Filters Card --%>
          <div class="card mb-6">
            <form phx-change="filter" class="flex gap-4 flex-wrap items-end">
              <div class="flex-1 min-w-[200px]">
                <label class="label">Search</label>
                <input type="text" name="search" placeholder="Search by name or phone..." 
                       value={@filters["search"]} class="input" />
              </div>
              <%= if @current_user.role == "admin" do %>
                <div class="min-w-[180px]">
                  <label class="label">Branch</label>
                  <select name="branch_id" class="input">
                    <option value="">All Branches</option>
                    <%= for b <- @branches do %>
                      <option value={b.id} selected={@filters["branch_id"] == b.id}><%= b.name %></option>
                    <% end %>
                  </select>
                </div>
              <% end %>
              <div class="min-w-[150px]">
                <label class="label">Stage</label>
                <select name="stage" class="input">
                  <option value="">All Stages</option>
                  <%= for stage <- ~w(new contacted interested application_submitted documents_collected enrolled joined) do %>
                    <option value={stage} selected={@filters["stage"] == stage}><%= stage_label(stage) %></option>
                  <% end %>
                </select>
              </div>
            </form>
          </div>

          <%!-- Leads Table --%>
          <div class="card">
            <div class="overflow-x-auto rounded-xl border-2" style="border-color: var(--color-border-light);">
              <table class="table">
                <thead>
                  <tr>
                    <th>Name</th>
                    <th>Phone</th>
                    <th>Stage</th>
                    <th>Assigned To</th>
                    <th>Branch</th>
                    <th>University</th>
                  </tr>
                </thead>
                <tbody>
                  <%= for lead <- @leads do %>
                    <tr class="cursor-pointer" onclick={"window.location.href='/admin/leads/#{lead.id}'"}>
                      <td class="font-semibold"><%= Lead.display_name(lead) %></td>
                      <td class="font-data" style="color: var(--color-text-muted);"><%= lead.phone_number %></td>
                      <td>
                        <span class={"badge #{badge_class(lead.stage)}"}><%= stage_label(lead.stage) %></span>
                      </td>
                      <td style="color: var(--color-text-secondary);"><%= if lead.assigned_to_user, do: lead.assigned_to_user.name, else: "-" %></td>
                      <td style="color: var(--color-text-secondary);"><%= if lead.branch, do: lead.branch.name, else: "-" %></td>
                      <td style="color: var(--color-text-secondary);"><%= if lead.university, do: lead.university.name, else: "-" %></td>
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

  defp stage_label("new"), do: "New"
  defp stage_label("contacted"), do: "Contacted"
  defp stage_label("interested"), do: "Interested"
  defp stage_label("application_submitted"), do: "Application"
  defp stage_label("documents_collected"), do: "Documents"
  defp stage_label("enrolled"), do: "Enrolled"
  defp stage_label("joined"), do: "Joined"
  defp stage_label(stage), do: stage
end
