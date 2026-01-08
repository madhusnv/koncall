defmodule KoncallApiWeb.Admin.ReportLive.Counsellors do
  use KoncallApiWeb, :live_view
  alias KoncallApi.{Accounts, CRM}

  @per_page 10

  @impl true
  def mount(_params, session, socket) do
    user_id = session["admin_user_id"]
    user = Accounts.get_user!(user_id, [:organization])

    {:ok, assign(socket, 
      page_title: "Counsellor Reports", 
      current_user: user,
      page: 1,
      per_page: @per_page,
      total_count: 0,
      total_pages: 1,
      counsellors: []
    )}
  end

  @impl true
  def handle_params(params, _uri, socket) do
    page = String.to_integer(params["page"] || "1")
    {counsellors, total_count} = load_counsellor_stats(
      socket.assigns.current_user.organization_id,
      page,
      @per_page
    )
    total_pages = max(1, ceil(total_count / @per_page))
    
    {:noreply, assign(socket, 
      counsellors: counsellors,
      page: page,
      total_count: total_count,
      total_pages: total_pages
    )}
  end

  defp load_counsellor_stats(org_id, page, per_page) do
    all_counsellors = Accounts.list_users(org_id)
    |> Enum.filter(& &1.role == "counsellor")
    
    total_count = length(all_counsellors)
    
    paginated = all_counsellors
    |> Enum.drop((page - 1) * per_page)
    |> Enum.take(per_page)
    |> Enum.map(fn u ->
      stats = CRM.get_stage_stats(:counsellor, u.id)
      total = stats |> Map.values() |> Enum.sum()
      %{user: u, stats: stats, total_leads: total}
    end)
    
    {paginated, total_count}
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

          <%!-- Pagination --%>
          <div class="flex items-center justify-between mt-6">
            <div class="text-sm" style="color: var(--color-text-muted);">
              Showing <%= (@page - 1) * @per_page + 1 %>-<%= min(@page * @per_page, @total_count) %> of <%= @total_count %> counsellors
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
        </main>
      </div>
    </div>
    """
  end
end
