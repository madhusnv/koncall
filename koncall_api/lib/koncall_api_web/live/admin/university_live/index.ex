defmodule KoncallApiWeb.Admin.UniversityLive.Index do
  use KoncallApiWeb, :live_view

  alias KoncallApi.Universities
  alias KoncallApi.Accounts
  alias KoncallApi.CRM.University

  @impl true
  def mount(_params, session, socket) do
    user_id = session["admin_user_id"]
    user = Accounts.get_user!(user_id, [:organization])
    universities = Universities.list_universities(user.organization_id)

    {:ok, assign(socket,
      page_title: "Universities",
      current_user: user,
      universities: universities,
      show_form: false,
      university: nil,
      changeset: nil
    )}
  end

  @impl true
  def handle_params(params, _url, socket) do
    {:noreply, apply_action(socket, socket.assigns.live_action, params)}
  end

  defp apply_action(socket, :new, _params) do
    socket
    |> assign(:page_title, "New University")
    |> assign(:show_form, true)
    |> assign(:university, %University{})
    |> assign(:changeset, University.changeset(%University{}, %{}))
  end

  defp apply_action(socket, :edit, %{"id" => id}) do
    university = Universities.get_university!(id)
    socket
    |> assign(:page_title, "Edit University")
    |> assign(:show_form, true)
    |> assign(:university, university)
    |> assign(:changeset, University.changeset(university, %{}))
  end

  defp apply_action(socket, :index, _params) do
    socket
    |> assign(:page_title, "Universities")
    |> assign(:show_form, false)
    |> assign(:university, nil)
  end

  @impl true
  def handle_event("save", %{"university" => params}, socket) do
    params = Map.put(params, "organization_id", socket.assigns.current_user.organization_id)

    case socket.assigns.live_action do
      :new -> create_university(socket, params)
      :edit -> update_university(socket, socket.assigns.university, params)
    end
  end

  @impl true
  def handle_event("delete", %{"id" => id}, socket) do
    university = Universities.get_university!(id)
    {:ok, _} = Universities.delete_university(university)
    universities = Universities.list_universities(socket.assigns.current_user.organization_id)
    {:noreply, assign(socket, :universities, universities)}
  end

  defp create_university(socket, params) do
    case Universities.create_university(params) do
      {:ok, _} ->
        universities = Universities.list_universities(socket.assigns.current_user.organization_id)
        {:noreply, socket |> assign(:universities, universities) |> assign(:show_form, false) |> put_flash(:info, "University created")}
      {:error, changeset} ->
        {:noreply, assign(socket, :changeset, changeset)}
    end
  end

  defp update_university(socket, university, params) do
    case Universities.update_university(university, params) do
      {:ok, _} ->
        universities = Universities.list_universities(socket.assigns.current_user.organization_id)
        {:noreply, socket |> assign(:universities, universities) |> assign(:show_form, false) |> put_flash(:info, "University updated")}
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
          <a href="/admin/branches" class="sidebar-nav-item">
            <.icon name="hero-building-office" class="sidebar-nav-icon" />
            <span>Branches</span>
          </a>
          <a href="/admin/universities" class="sidebar-nav-item active">
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
                <.icon name="hero-academic-cap" class="w-8 h-8" style="color: var(--color-secondary);" />
              </div>
              <div>
                <h1 class="page-header-title">University Management</h1>
                <p class="page-header-subtitle">Manage partner universities and institutions</p>
              </div>
            </div>
          </div>

          <%!-- Action Bar --%>
          <div class="flex justify-between items-center mb-6">
            <h2 class="text-xl font-display font-bold" style="color: var(--color-text-primary);">
              All Universities (<%= length(@universities) %>)
            </h2>
            <a href="/admin/universities/new" class="btn btn-primary">
              <.icon name="hero-plus" class="w-5 h-5" />
              New University
            </a>
          </div>

          <%!-- Form Card --%>
          <%= if @show_form do %>
            <div class="card mb-6">
              <h3 class="text-xl font-display font-bold mb-6 flex items-center gap-2" style="color: var(--color-text-primary);">
                <.icon name="hero-pencil-square" class="w-6 h-6" style="color: var(--color-secondary);" />
                <%= if @university.id, do: "Edit", else: "New" %> University
              </h3>
              <.form for={@changeset} phx-submit="save" id="university-form" class="space-y-4">
                <div class="grid grid-cols-1 md:grid-cols-2 gap-4">
                  <div>
                    <label class="label">University Name</label>
                    <input type="text" name="university[name]" value={@changeset.changes[:name] || (@university && @university.name)} 
                           required class="input" placeholder="Enter university name" />
                  </div>
                  <div>
                    <label class="label">Short Code</label>
                    <input type="text" name="university[short_code]" value={@changeset.changes[:short_code] || (@university && @university.short_code)}
                           placeholder="e.g., UNI1" class="input uppercase" />
                  </div>
                </div>
                <div class="flex gap-3 pt-4">
                  <button type="submit" class="btn btn-primary">
                    <.icon name="hero-check" class="w-5 h-5" />
                    Save University
                  </button>
                  <a href="/admin/universities" class="btn btn-ghost">Cancel</a>
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
                    <th>Code</th>
                    <th>Counsellors</th>
                    <th>Status</th>
                    <th>Actions</th>
                  </tr>
                </thead>
                <tbody>
                  <%= for uni <- @universities do %>
                    <tr>
                      <td class="font-semibold"><%= uni.name %></td>
                      <td class="font-data" style="color: var(--color-text-muted);"><%= uni.short_code || "-" %></td>
                      <td style="color: var(--color-text-secondary);">-</td>
                      <td>
                        <%= if uni.is_active do %>
                          <span class="badge badge-success">Active</span>
                        <% else %>
                          <span class="badge badge-error">Inactive</span>
                        <% end %>
                      </td>
                      <td>
                        <div class="flex items-center gap-2">
                          <a href={"/admin/universities/#{uni.id}/edit"} class="btn btn-ghost btn-sm" style="color: var(--color-secondary);">
                            <.icon name="hero-pencil" class="w-4 h-4" />
                          </a>
                          <button phx-click="delete" phx-value-id={uni.id} class="btn btn-ghost btn-sm" style="color: var(--color-error);" data-confirm="Are you sure?">
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
