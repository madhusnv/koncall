defmodule KoncallApiWeb.Admin.LeadLive.Show do
  use KoncallApiWeb, :live_view
  alias KoncallApi.{CRM, Accounts, CallTracking}
  alias KoncallApi.CRM.Lead

  @impl true
  def mount(%{"id" => id}, session, socket) do
    user_id = session["admin_user_id"]
    user = Accounts.get_user!(user_id)
    lead = CRM.get_lead!(id, [:status, :assigned_to_user, :branch, :university, :call_logs])

    {:ok, assign(socket, page_title: Lead.display_name(lead), current_user: user, lead: lead)}
  end

  @impl true
  def handle_event("update_stage", %{"stage" => stage}, socket) do
    case CRM.update_lead_stage(socket.assigns.lead, stage) do
      {:ok, updated_lead} ->
        lead = CRM.get_lead!(updated_lead.id, [:status, :assigned_to_user, :branch, :university, :call_logs])
        {:noreply, assign(socket, :lead, lead) |> put_flash(:info, "Stage updated")}
      {:error, _} ->
        {:noreply, put_flash(socket, :error, "Failed to update stage")}
    end
  end

  @impl true
  def render(assigns) do
    ~H"""
    <div class="min-h-screen bg-gray-100">
      <nav class="bg-gradient-to-r from-indigo-600 to-purple-600 shadow-lg">
        <div class="max-w-7xl mx-auto px-4 py-4">
          <div class="flex justify-between items-center">
            <div>
              <h1 class="text-2xl font-bold text-white"><%= Lead.display_name(@lead) %></h1>
              <p class="text-indigo-200"><%= @lead.phone_number %></p>
            </div>
            <a href="/admin/leads" class="text-white hover:text-indigo-200">← Back to Leads</a>
          </div>
        </div>
      </nav>

      <div class="max-w-7xl mx-auto px-4 py-8">
        <div class="grid grid-cols-1 lg:grid-cols-3 gap-6">
          <!-- Lead Info -->
          <div class="bg-white rounded-xl shadow-sm p-6">
            <h3 class="text-lg font-semibold mb-4">Lead Details</h3>
            <dl class="space-y-3">
              <div><dt class="text-sm text-gray-500">Email</dt><dd class="font-medium"><%= @lead.email || "-" %></dd></div>
              <div><dt class="text-sm text-gray-500">Alternate Phone</dt><dd class="font-medium"><%= @lead.alternate_phone || "-" %></dd></div>
              <div><dt class="text-sm text-gray-500">Branch</dt><dd class="font-medium"><%= if @lead.branch, do: @lead.branch.name, else: "-" %></dd></div>
              <div><dt class="text-sm text-gray-500">University</dt><dd class="font-medium"><%= if @lead.university, do: @lead.university.name, else: "-" %></dd></div>
              <div><dt class="text-sm text-gray-500">Assigned To</dt><dd class="font-medium"><%= if @lead.assigned_to_user, do: @lead.assigned_to_user.name, else: "Unassigned" %></dd></div>
              <div><dt class="text-sm text-gray-500">Contact Count</dt><dd class="font-medium"><%= @lead.contact_count %></dd></div>
              <div><dt class="text-sm text-gray-500">Last Contacted</dt><dd class="font-medium"><%= format_datetime(@lead.last_contacted_at) %></dd></div>
            </dl>
          </div>

          <!-- Stage Update -->
          <div class="bg-white rounded-xl shadow-sm p-6">
            <h3 class="text-lg font-semibold mb-4">Update Stage</h3>
            <div class="space-y-2">
              <%= for stage <- ~w(new contacted interested application_submitted documents_collected enrolled joined) do %>
                <button phx-click="update_stage" phx-value-stage={stage}
                        class={"w-full text-left px-4 py-2 rounded-lg transition " <> 
                               if(@lead.stage == stage, do: "bg-indigo-600 text-white", else: "bg-gray-100 hover:bg-gray-200")}>
                  <%= stage_label(stage) %>
                </button>
              <% end %>
            </div>
          </div>

          <!-- Notes -->
          <div class="bg-white rounded-xl shadow-sm p-6">
            <h3 class="text-lg font-semibold mb-4">Notes</h3>
            <p class="text-gray-600 whitespace-pre-wrap"><%= @lead.notes || "No notes yet" %></p>
          </div>
        </div>

        <!-- Call History -->
        <div class="mt-6 bg-white rounded-xl shadow-sm p-6">
          <h3 class="text-lg font-semibold mb-4">Call History (<%= length(@lead.call_logs) %>)</h3>
          <table class="min-w-full divide-y divide-gray-200">
            <thead class="bg-gray-50">
              <tr>
                <th class="px-4 py-2 text-left text-xs font-medium text-gray-500 uppercase">Date/Time</th>
                <th class="px-4 py-2 text-left text-xs font-medium text-gray-500 uppercase">Type</th>
                <th class="px-4 py-2 text-left text-xs font-medium text-gray-500 uppercase">Duration</th>
              </tr>
            </thead>
            <tbody class="divide-y divide-gray-200">
              <%= for call <- @lead.call_logs do %>
                <tr>
                  <td class="px-4 py-3 text-sm"><%= format_datetime(call.call_datetime) %></td>
                  <td class="px-4 py-3"><span class={"px-2 py-1 text-xs rounded-full " <> call_type_class(call.call_type)}><%= call.call_type %></span></td>
                  <td class="px-4 py-3 text-sm"><%= format_duration(call.duration) %></td>
                </tr>
              <% end %>
            </tbody>
          </table>
        </div>
      </div>
    </div>
    """
  end

  defp stage_label("new"), do: "New"
  defp stage_label("contacted"), do: "Contacted"
  defp stage_label("interested"), do: "Interested"
  defp stage_label("application_submitted"), do: "Application Submitted"
  defp stage_label("documents_collected"), do: "Documents Collected"
  defp stage_label("enrolled"), do: "Enrolled"
  defp stage_label("joined"), do: "Joined"
  defp stage_label(s), do: s

  defp call_type_class("incoming"), do: "bg-green-100 text-green-800"
  defp call_type_class("outgoing"), do: "bg-blue-100 text-blue-800"
  defp call_type_class("missed"), do: "bg-red-100 text-red-800"
  defp call_type_class(_), do: "bg-gray-100 text-gray-800"

  defp format_datetime(nil), do: "-"
  defp format_datetime(dt), do: Calendar.strftime(dt, "%Y-%m-%d %H:%M")

  defp format_duration(nil), do: "0s"
  defp format_duration(s) when s < 60, do: "#{s}s"
  defp format_duration(s), do: "#{div(s, 60)}m #{rem(s, 60)}s"
end
