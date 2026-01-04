defmodule KoncallApiWeb.Admin.BranchLive.Show do
  use KoncallApiWeb, :live_view

  alias KoncallApi.Branches
  alias KoncallApi.Accounts

  @impl true
  def mount(%{"id" => id}, session, socket) do
    user_id = session["admin_user_id"]
    user = Accounts.get_user!(user_id, [:organization])
    branch = Branches.get_branch!(id, [:manager, :users])
    counsellors = Branches.list_branch_counsellors(id)

    {:ok, assign(socket,
      page_title: branch.name,
      current_user: user,
      branch: branch,
      counsellors: counsellors
    )}
  end

  @impl true
  def render(assigns) do
    ~H"""
    <div class="min-h-screen bg-gray-100">
      <nav class="bg-gradient-to-r from-indigo-600 to-purple-600 shadow-lg">
        <div class="max-w-7xl mx-auto px-4 py-4">
          <div class="flex justify-between items-center">
            <div>
              <h1 class="text-2xl font-bold text-white"><%= @branch.name %></h1>
              <p class="text-indigo-200"><%= @branch.location %></p>
            </div>
            <a href="/admin/branches" class="text-white hover:text-indigo-200">← Back to Branches</a>
          </div>
        </div>
      </nav>

      <div class="max-w-7xl mx-auto px-4 py-8">
        <div class="grid grid-cols-1 lg:grid-cols-3 gap-6">
          <!-- Branch Info -->
          <div class="bg-white rounded-xl shadow-sm p-6">
            <h3 class="text-lg font-semibold mb-4">Branch Details</h3>
            <dl class="space-y-3">
              <div>
                <dt class="text-sm text-gray-500">Manager</dt>
                <dd class="font-medium"><%= if @branch.manager, do: @branch.manager.name, else: "Not assigned" %></dd>
              </div>
              <div>
                <dt class="text-sm text-gray-500">Status</dt>
                <dd>
                  <%= if @branch.is_active do %>
                    <span class="px-2 py-1 text-xs bg-green-100 text-green-800 rounded-full">Active</span>
                  <% else %>
                    <span class="px-2 py-1 text-xs bg-red-100 text-red-800 rounded-full">Inactive</span>
                  <% end %>
                </dd>
              </div>
              <div>
                <dt class="text-sm text-gray-500">Total Staff</dt>
                <dd class="font-medium"><%= length(@branch.users) %></dd>
              </div>
            </dl>
          </div>

          <!-- Counsellors -->
          <div class="lg:col-span-2 bg-white rounded-xl shadow-sm p-6">
            <h3 class="text-lg font-semibold mb-4">Counsellors (<%= length(@counsellors) %>)</h3>
            <div class="overflow-x-auto">
              <table class="min-w-full divide-y divide-gray-200">
                <thead class="bg-gray-50">
                  <tr>
                    <th class="px-4 py-2 text-left text-xs font-medium text-gray-500 uppercase">Name</th>
                    <th class="px-4 py-2 text-left text-xs font-medium text-gray-500 uppercase">Phone</th>
                    <th class="px-4 py-2 text-left text-xs font-medium text-gray-500 uppercase">Universities</th>
                  </tr>
                </thead>
                <tbody class="divide-y divide-gray-200">
                  <%= for counsellor <- @counsellors do %>
                    <tr>
                      <td class="px-4 py-3 font-medium"><%= counsellor.name %></td>
                      <td class="px-4 py-3 text-gray-600"><%= counsellor.phone %></td>
                      <td class="px-4 py-3 text-gray-600">
                        <%= counsellor.universities |> Enum.map(& &1.name) |> Enum.join(", ") %>
                      </td>
                    </tr>
                  <% end %>
                </tbody>
              </table>
            </div>
          </div>
        </div>
      </div>
    </div>
    """
  end
end
