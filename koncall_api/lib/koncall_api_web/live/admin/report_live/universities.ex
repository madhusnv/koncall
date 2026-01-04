defmodule KoncallApiWeb.Admin.ReportLive.Universities do
  use KoncallApiWeb, :live_view
  alias KoncallApi.{Accounts, Universities, CRM}
  alias KoncallApi.CRM.Lead
  alias KoncallApi.Repo
  import Ecto.Query

  @impl true
  def mount(_params, session, socket) do
    user_id = session["admin_user_id"]
    user = Accounts.get_user!(user_id, [:organization])
    university_stats = load_university_stats(user.organization_id)

    {:ok, assign(socket, page_title: "University Reports", current_user: user, universities: university_stats)}
  end

  defp load_university_stats(org_id) do
    Universities.list_universities(org_id)
    |> Enum.map(fn uni ->
      lead_count = Lead
      |> where([l], l.university_id == ^uni.id and l.is_deleted == false)
      |> Repo.aggregate(:count)

      enrolled = Lead
      |> where([l], l.university_id == ^uni.id and l.stage == "enrolled" and l.is_deleted == false)
      |> Repo.aggregate(:count)

      joined = Lead
      |> where([l], l.university_id == ^uni.id and l.stage == "joined" and l.is_deleted == false)
      |> Repo.aggregate(:count)

      counsellors = Universities.get_university_counsellors(uni.id)

      %{
        university: uni,
        lead_count: lead_count,
        enrolled: enrolled,
        joined: joined,
        counsellor_count: length(counsellors)
      }
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
                <.icon name="hero-academic-cap" class="w-8 h-8" style="color: var(--color-success);" />
              </div>
              <div>
                <h1 class="page-header-title">University Enrollment Reports</h1>
                <p class="page-header-subtitle">Enrollment and conversion statistics by university</p>
              </div>
            </div>
          </div>

          <%!-- Table Card --%>
          <div class="card">
            <div class="overflow-x-auto rounded-xl border-2" style="border-color: var(--color-border-light);">
              <table class="table">
                <thead>
                  <tr>
                    <th>University</th>
                    <th>Code</th>
                    <th>Counsellors</th>
                    <th>Total Leads</th>
                    <th>Enrolled</th>
                    <th>Joined</th>
                    <th>Conversion</th>
                  </tr>
                </thead>
                <tbody>
                  <%= for u <- @universities do %>
                    <tr>
                      <td class="font-semibold"><%= u.university.name %></td>
                      <td class="font-data" style="color: var(--color-text-muted);"><%= u.university.short_code || "-" %></td>
                      <td><%= u.counsellor_count %></td>
                      <td class="font-bold" style="color: var(--color-primary);"><%= u.lead_count %></td>
                      <td class="font-medium" style="color: var(--color-warning);"><%= u.enrolled %></td>
                      <td class="font-medium" style="color: var(--color-success);"><%= u.joined %></td>
                      <td>
                        <span class="badge badge-success">
                          <%= if u.lead_count > 0, do: Float.round(u.joined / u.lead_count * 100, 1), else: 0 %>%
                        </span>
                      </td>
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
