defmodule KoncallApiWeb.Admin.BranchLive.Index do
  use KoncallApiWeb, :live_view

  alias KoncallApi.Branches
  alias KoncallApi.Accounts
  alias KoncallApi.Accounts.Branch

  @impl true
  def mount(_params, session, socket) do
    user_id = session["admin_user_id"]
    user = Accounts.get_user!(user_id, [:organization])
    branches = Branches.list_branches(user.organization_id)

    {:ok, assign(socket,
      page_title: "Branches",
      current_user: user,
      branches: branches,
      show_form: false,
      branch: nil,
      changeset: nil
    )}
  end

  @impl true
  def handle_params(params, _url, socket) do
    {:noreply, apply_action(socket, socket.assigns.live_action, params)}
  end

  defp apply_action(socket, :new, _params) do
    socket
    |> assign(:page_title, "New Branch")
    |> assign(:show_form, true)
    |> assign(:branch, %Branch{})
    |> assign(:changeset, Branch.changeset(%Branch{}, %{}))
  end

  defp apply_action(socket, :edit, %{"id" => id}) do
    branch = Branches.get_branch!(id)
    socket
    |> assign(:page_title, "Edit Branch")
    |> assign(:show_form, true)
    |> assign(:branch, branch)
    |> assign(:changeset, Branch.changeset(branch, %{}))
  end

  defp apply_action(socket, :index, _params) do
    socket
    |> assign(:page_title, "Branches")
    |> assign(:show_form, false)
    |> assign(:branch, nil)
  end

  @impl true
  def handle_event("save", %{"branch" => branch_params}, socket) do
    branch_params = Map.put(branch_params, "organization_id", socket.assigns.current_user.organization_id)

    case socket.assigns.live_action do
      :new -> create_branch(socket, branch_params)
      :edit -> update_branch(socket, socket.assigns.branch, branch_params)
    end
  end

  @impl true
  def handle_event("delete", %{"id" => id}, socket) do
    branch = Branches.get_branch!(id)
    {:ok, _} = Branches.delete_branch(branch)
    branches = Branches.list_branches(socket.assigns.current_user.organization_id)
    {:noreply, assign(socket, :branches, branches)}
  end

  defp create_branch(socket, params) do
    case Branches.create_branch(params) do
      {:ok, _branch} ->
        branches = Branches.list_branches(socket.assigns.current_user.organization_id)
        {:noreply,
         socket
         |> assign(:branches, branches)
         |> assign(:show_form, false)
         |> put_flash(:info, "Branch created successfully")}

      {:error, changeset} ->
        {:noreply, assign(socket, :changeset, changeset)}
    end
  end

  defp update_branch(socket, branch, params) do
    case Branches.update_branch(branch, params) do
      {:ok, _branch} ->
        branches = Branches.list_branches(socket.assigns.current_user.organization_id)
        {:noreply,
         socket
         |> assign(:branches, branches)
         |> assign(:show_form, false)
         |> put_flash(:info, "Branch updated successfully")}

      {:error, changeset} ->
        {:noreply, assign(socket, :changeset, changeset)}
    end
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
          <a href="/admin/branches" class="sidebar-nav-item active">
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
                <.icon name="hero-building-office" class="w-8 h-8" style="color: var(--color-primary);" />
              </div>
              <div>
                <h1 class="page-header-title">Branch Management</h1>
                <p class="page-header-subtitle">Manage your organization's branches and locations</p>
              </div>
            </div>
          </div>

          <%!-- Action Bar --%>
          <div class="flex justify-between items-center mb-6">
            <h2 class="text-xl font-display font-bold" style="color: var(--color-text-primary);">
              All Branches (<%= length(@branches) %>)
            </h2>
            <a href="/admin/branches/new" class="btn btn-primary">
              <.icon name="hero-plus" class="w-5 h-5" />
              New Branch
            </a>
          </div>

          <%!-- Form Card --%>
          <%= if @show_form do %>
            <div class="card mb-6">
              <h3 class="text-xl font-display font-bold mb-6 flex items-center gap-2" style="color: var(--color-text-primary);">
                <.icon name="hero-pencil-square" class="w-6 h-6" style="color: var(--color-primary);" />
                <%= if @branch.id, do: "Edit Branch", else: "New Branch" %>
              </h3>
              <.form for={@changeset} phx-submit="save" id="branch-form" class="space-y-4">
                <div class="grid grid-cols-1 md:grid-cols-2 gap-4">
                  <div>
                    <label class="label">Branch Name</label>
                    <input type="text" name="branch[name]" value={@changeset.changes[:name] || (@branch && @branch.name)} 
                           required class="input" placeholder="Enter branch name" />
                  </div>
                  <div>
                    <label class="label">Location</label>
                    <input type="text" name="branch[location]" value={@changeset.changes[:location] || (@branch && @branch.location)}
                           class="input" placeholder="Enter location" />
                  </div>
                </div>
                <div class="flex gap-3 pt-4">
                  <button type="submit" class="btn btn-primary">
                    <.icon name="hero-check" class="w-5 h-5" />
                    Save Branch
                  </button>
                  <a href="/admin/branches" class="btn btn-ghost">Cancel</a>
                </div>
              </.form>
            </div>
          <% end %>

          <%!-- Table Card --%>
          <div class="card">
            <div class="overflow-x-auto rounded-xl border-2" style="border-color: var(--color-border-light);">
              <table class="table">
                <thead>
                  <tr>
                    <th>Name</th>
                    <th>Location</th>
                    <th>Manager</th>
                    <th>Status</th>
                    <th>Actions</th>
                  </tr>
                </thead>
                <tbody>
                  <%= for branch <- @branches do %>
                    <tr>
                      <td class="font-semibold"><%= branch.name %></td>
                      <td style="color: var(--color-text-muted);"><%= branch.location || "-" %></td>
                      <td style="color: var(--color-text-secondary);">
                        <%= if branch.manager, do: branch.manager.name, else: "Not assigned" %>
                      </td>
                      <td>
                        <%= if branch.is_active do %>
                          <span class="badge badge-success">Active</span>
                        <% else %>
                          <span class="badge badge-error">Inactive</span>
                        <% end %>
                      </td>
                      <td>
                        <div class="flex items-center gap-2">
                          <a href={"/admin/branches/#{branch.id}/edit"} class="btn btn-ghost btn-sm" style="color: var(--color-primary);">
                            <.icon name="hero-pencil" class="w-4 h-4" />
                          </a>
                          <button phx-click="delete" phx-value-id={branch.id} 
                                  class="btn btn-ghost btn-sm" style="color: var(--color-error);"
                                  data-confirm="Are you sure you want to delete this branch?">
                            <.icon name="hero-trash" class="w-4 h-4" />
                          </button>
                        </div>
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
