defmodule KoncallApiWeb.Admin.UserLive.Index do
  use KoncallApiWeb, :live_view
  alias KoncallApi.{Accounts, Branches, Universities}

  @impl true
  def mount(_params, session, socket) do
    user_id = session["admin_user_id"]
    user = Accounts.get_user!(user_id, [:organization])
    users = Accounts.list_users(user.organization_id)
    branches = Branches.list_branches(user.organization_id)
    universities = Universities.list_universities(user.organization_id)

    {:ok, assign(socket, page_title: "Users", current_user: user, users: users, branches: branches, universities: universities, show_form: false)}
  end

  @impl true
  @impl true
  def handle_params(params, _url, socket) do
    {:noreply, apply_action(socket, socket.assigns.live_action, params)}
  end

  defp apply_action(socket, :edit, %{"id" => id}) do
    socket
    |> assign(:page_title, "Edit User")
    |> assign(:user, Accounts.get_user!(id))
  end

  defp apply_action(socket, :new, _params) do
    socket
    |> assign(:page_title, "New User")
    |> assign(:user, %Accounts.User{})
  end

  defp apply_action(socket, :index, _params) do
    socket
    |> assign(:page_title, "Users")
    |> assign(:user, nil)
  end

  @impl true
  def handle_info({KoncallApiWeb.Admin.UserLive.FormComponent, {:saved, _user}}, socket) do
    users = Accounts.list_users(socket.assigns.current_user.organization_id)
    {:noreply, assign(socket, :users, users)}
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
          <a href="/admin/users" class="sidebar-nav-item active">
            <.icon name="hero-users" class="sidebar-nav-icon" />
            <span>Users</span>
          </a>
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
                <.icon name="hero-users" class="w-8 h-8" style="color: var(--color-info);" />
              </div>
              <div>
                <h1 class="page-header-title">User Management</h1>
                <p class="page-header-subtitle">Manage counsellors, managers, and administrators</p>
              </div>
            </div>
          </div>

          <%!-- Action Bar --%>
          <div class="flex justify-between items-center mb-6">
            <h2 class="text-xl font-display font-bold" style="color: var(--color-text-primary);">
              All Users (<%= length(@users) %>)
            </h2>
            <.link patch={~p"/admin/users/new"} class="btn btn-primary">
              <.icon name="hero-plus" class="w-5 h-5" />
              New User
            </.link>
          </div>

          <%!-- Table Card --%>
          <div class="card">
            <div class="overflow-x-auto rounded-xl border-2" style="border-color: var(--color-border-light);">
              <table class="table">
                <thead>
                  <tr>
                    <th>Name</th>
                    <th>Phone</th>
                    <th>Role</th>
                    <th>Branch</th>
                    <th>Status</th>
                  </tr>
                </thead>
                <tbody>
                  <%= for u <- @users do %>
                    <tr>
                      <td class="font-semibold"><%= u.name %></td>
                      <td class="font-data" style="color: var(--color-text-muted);"><%= u.phone %></td>
                      <td>
                        <span class={"badge #{role_badge(u.role)}"}><%= u.role %></span>
                      </td>
                      <td style="color: var(--color-text-secondary);">
                        <%= get_branch_name(@branches, u.branch_id) %>
                      </td>
                      <td>
                        <%= if u.is_active do %>
                          <span class="badge badge-success">Active</span>
                        <% else %>
                          <span class="badge badge-error">Inactive</span>
                        <% end %>
                      </td>
                    </tr>
                  <% end %>
                </tbody>
              </table>
            </div>
          </div>
        </main>
      </div>

      <.modal :if={@live_action in [:new, :edit]} id="user-modal" show on_cancel={JS.patch(~p"/admin/users")}>
        <.live_component
          module={KoncallApiWeb.Admin.UserLive.FormComponent}
          id={@user.id || :new}
          title={@page_title}
          action={@live_action}
          user={@user}
          current_user={@current_user}
          branches={@branches}
          patch={~p"/admin/users"}
        />
      </.modal>
    </div>
    """
  end

  defp role_badge("admin"), do: "badge-primary"
  defp role_badge("branch_manager"), do: "badge-info"
  defp role_badge("counsellor"), do: "badge-success"
  defp role_badge(_), do: ""

  defp get_branch_name(branches, nil), do: "-"
  defp get_branch_name(branches, id) do
    case Enum.find(branches, & &1.id == id) do
      nil -> "-"
      b -> b.name
    end
  end
end
