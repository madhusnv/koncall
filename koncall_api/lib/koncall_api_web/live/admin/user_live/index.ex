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
    <.admin_sidebar current_user={@current_user} active_tab="users" />

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

  defp get_branch_name(_branches, nil), do: "-"
  defp get_branch_name(branches, id) do
    case Enum.find(branches, & &1.id == id) do
      nil -> "-"
      b -> b.name
    end
  end
end
