defmodule KoncallApiWeb.Admin.UserLive.Show do
  use KoncallApiWeb, :live_view
  alias KoncallApi.Accounts

  @impl true
  def mount(%{"id" => id}, session, socket) do
    user_id = session["admin_user_id"]
    current_user = Accounts.get_user!(user_id)
    user = Accounts.get_user!(id, [:branch, :universities])

    {:ok, assign(socket, page_title: user.name, current_user: current_user, user: user)}
  end

  @impl true
  def render(assigns) do
    ~H"""
    <div class="min-h-screen bg-gray-100">
      <nav class="bg-gradient-to-r from-indigo-600 to-purple-600 shadow-lg">
        <div class="max-w-7xl mx-auto px-4 py-4">
          <div class="flex justify-between items-center">
            <h1 class="text-2xl font-bold text-white"><%= @user.name %></h1>
            <a href="/admin/users" class="text-white hover:text-indigo-200">← Back</a>
          </div>
        </div>
      </nav>
      <div class="max-w-7xl mx-auto px-4 py-8">
        <div class="bg-white rounded-xl shadow-sm p-6">
          <dl class="grid grid-cols-2 gap-4">
            <div><dt class="text-sm text-gray-500">Phone</dt><dd class="font-medium"><%= @user.phone %></dd></div>
            <div><dt class="text-sm text-gray-500">Email</dt><dd class="font-medium"><%= @user.email || "-" %></dd></div>
            <div><dt class="text-sm text-gray-500">Role</dt><dd class="font-medium capitalize"><%= @user.role %></dd></div>
            <div><dt class="text-sm text-gray-500">Branch</dt><dd class="font-medium"><%= if @user.branch, do: @user.branch.name, else: "-" %></dd></div>
          </dl>
        </div>
      </div>
    </div>
    """
  end
end
