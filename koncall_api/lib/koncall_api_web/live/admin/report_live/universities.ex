defmodule KoncallApiWeb.Admin.ReportLive.Universities do
  use KoncallApiWeb, :live_view
  alias KoncallApi.{Accounts, Universities}
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
    <.admin_sidebar current_user={@current_user} active_tab="reports" />

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
