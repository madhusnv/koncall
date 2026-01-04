defmodule KoncallApiWeb.Admin.LeadLive.Import do
  use KoncallApiWeb, :live_view
  alias KoncallApi.{CRM, Accounts, Branches}

  @impl true
  def mount(_params, session, socket) do
    user_id = session["admin_user_id"]
    user = Accounts.get_user!(user_id, [:organization, :branch])
    branches = Branches.list_branches(user.organization_id)

    {:ok, assign(socket,
      page_title: "Import Leads",
      current_user: user,
      branches: branches,
      selected_branch: user.branch_id,
      csv_data: "",
      import_result: nil
    )}
  end

  @impl true
  def handle_event("select_branch", %{"branch_id" => branch_id}, socket) do
    {:noreply, assign(socket, :selected_branch, branch_id)}
  end

  @impl true
  def handle_event("import", %{"csv_data" => csv_data, "branch_id" => branch_id}, socket) do
    lines = String.split(csv_data, "\n", trim: true)
    
    # Parse CSV (simple: name,phone format)
    leads_data = lines
    |> Enum.drop(1)  # Skip header
    |> Enum.map(fn line ->
      parts = String.split(line, ",", parts: 2)
      case parts do
        [name, phone] -> %{"student_name" => String.trim(name), "phone_number" => String.trim(phone)}
        [phone] -> %{"student_name" => "Unknown", "phone_number" => String.trim(phone)}
        _ -> nil
      end
    end)
    |> Enum.filter(& &1)

    case CRM.import_leads(socket.assigns.current_user.organization_id, branch_id, leads_data) do
      {:ok, result} ->
        {:noreply, assign(socket, :import_result, result)}
      {:error, _} ->
        {:noreply, put_flash(socket, :error, "Import failed")}
    end
  end

  @impl true
  def render(assigns) do
    ~H"""
    <div class="min-h-screen bg-gray-100">
      <nav class="bg-gradient-to-r from-indigo-600 to-purple-600 shadow-lg">
        <div class="max-w-7xl mx-auto px-4 py-4">
          <div class="flex justify-between items-center">
            <h1 class="text-2xl font-bold text-white">Import Leads from CSV</h1>
            <a href="/admin/leads" class="text-white hover:text-indigo-200">← Back to Leads</a>
          </div>
        </div>
      </nav>

      <div class="max-w-4xl mx-auto px-4 py-8">
        <%= if @import_result do %>
          <div class="bg-green-50 border border-green-200 rounded-xl p-6 mb-6">
            <h3 class="text-lg font-semibold text-green-800 mb-2">Import Complete!</h3>
            <p class="text-green-700">
              Successfully imported <strong><%= @import_result.success %></strong> leads.
              <%= if @import_result.failed > 0 do %>
                <span class="text-red-600">(<%= @import_result.failed %> failed)</span>
              <% end %>
            </p>
            <a href="/admin/leads" class="mt-4 inline-block bg-green-600 text-white px-4 py-2 rounded-lg">
              View Leads →
            </a>
          </div>
        <% end %>

        <div class="bg-white rounded-xl shadow-sm p-6">
          <div class="mb-6">
            <h3 class="text-lg font-semibold mb-2">CSV Format</h3>
            <p class="text-gray-600 text-sm mb-2">Upload student data in the following format:</p>
            <code class="block bg-gray-100 p-3 rounded text-sm">
              student_name,phone_number<br/>
              John Doe,9876543210<br/>
              Jane Smith,9876543211
            </code>
          </div>

          <form phx-submit="import" class="space-y-4">
            <div>
              <label class="block text-sm font-medium text-gray-700 mb-2">Select Branch</label>
              <select name="branch_id" required class="w-full px-4 py-2 border rounded-lg">
                <%= for b <- @branches do %>
                  <option value={b.id} selected={@selected_branch == b.id}><%= b.name %></option>
                <% end %>
              </select>
            </div>

            <div>
              <label class="block text-sm font-medium text-gray-700 mb-2">Paste CSV Data</label>
              <textarea name="csv_data" rows="10" required
                        placeholder="student_name,phone_number&#10;John Doe,9876543210"
                        class="w-full px-4 py-2 border rounded-lg font-mono text-sm"
              ></textarea>
            </div>

            <button type="submit" class="bg-indigo-600 text-white px-6 py-2 rounded-lg hover:bg-indigo-700">
              Import Leads
            </button>
          </form>
        </div>
      </div>
    </div>
    """
  end
end
