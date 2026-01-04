defmodule KoncallApiWeb.Admin.UniversityLive.Show do
  use KoncallApiWeb, :live_view
  alias KoncallApi.{Universities, Accounts}

  @impl true
  def mount(%{"id" => id}, session, socket) do
    user_id = session["admin_user_id"]
    user = Accounts.get_user!(user_id)
    university = Universities.get_university!(id, [:counsellors, :leads])
    counsellors = Universities.get_university_counsellors(id)

    {:ok, assign(socket, page_title: university.name, current_user: user, university: university, counsellors: counsellors)}
  end

  @impl true
  def render(assigns) do
    ~H"""
    <div class="min-h-screen bg-gray-100">
      <nav class="bg-gradient-to-r from-indigo-600 to-purple-600 shadow-lg">
        <div class="max-w-7xl mx-auto px-4 py-4">
          <div class="flex justify-between items-center">
            <h1 class="text-2xl font-bold text-white"><%= @university.name %></h1>
            <a href="/admin/universities" class="text-white hover:text-indigo-200">← Back</a>
          </div>
        </div>
      </nav>
      <div class="max-w-7xl mx-auto px-4 py-8">
        <div class="bg-white rounded-xl shadow-sm p-6">
          <h3 class="text-lg font-semibold mb-4">Assigned Counsellors (<%= length(@counsellors) %>)</h3>
          <ul class="space-y-2">
            <%= for c <- @counsellors do %>
              <li class="p-3 bg-gray-50 rounded-lg"><%= c.name %> (<%= c.phone %>)</li>
            <% end %>
          </ul>
        </div>
      </div>
    </div>
    """
  end
end
