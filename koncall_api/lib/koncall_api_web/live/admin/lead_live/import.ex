defmodule KoncallApiWeb.Admin.LeadLive.Import do
  use KoncallApiWeb, :live_view
  alias KoncallApi.{CRM, Accounts, Branches, Universities}

  @impl true
  def mount(_params, session, socket) do
    user_id = session["admin_user_id"]
    user = Accounts.get_user!(user_id, [:organization, :branch])
    
    branches = Branches.list_branches(user.organization_id)
    universities = Universities.list_active_universities(user.organization_id)
    
    # Pre-fetch branch counsellors for manual selection
    counsellors = if user.branch_id, do: Accounts.list_branch_counsellors(user.branch_id), else: []

    {:ok, socket
      |> assign(
        page_title: "Import Leads",
        current_user: user,
        branches: branches,
        universities: universities,
        counsellors: counsellors,
        # Form State
        selected_branch: user.branch_id,
        distribution_strategy: "none",
        target_university_id: nil,
        selected_counsellors: [],
        import_result: nil
      )
      |> allow_upload(:csv, accept: ~w(.csv), max_entries: 1)}
  end

  @impl true
  def handle_event("validate", params, socket) do
    # Extract params to update state
    branch_id = params["branch_id"]
    strategy = params["distribution_strategy"]
    uni_id = params["target_university_id"]
    counsellor_ids = params["counsellor_ids"] || []

    # If branch changed, refresh counsellors
    socket = 
      if branch_id != socket.assigns.selected_branch do
        counsellors = Accounts.list_branch_counsellors(branch_id)
        assign(socket, selected_branch: branch_id, counsellors: counsellors)
      else
        socket
      end

    {:noreply, assign(socket,
      distribution_strategy: strategy,
      target_university_id: uni_id,
      selected_counsellors: counsellor_ids
    )}
  end

  @impl true
  def handle_event("save", params, socket) do
    consume_uploaded_entries(socket, :csv, fn %{path: path}, _entry ->
      # Process the file
      csv_content = File.read!(path)
      
      # Basic parsing
      leads_data = 
        csv_content
        |> String.split(["\r\n", "\n"], trim: true)
        |> Enum.drop(1) # Drop header
        |> Enum.map(fn line ->
          case String.split(line, ",") do
            [name, phone | _] -> 
              %{"student_name" => String.trim(name), "phone_number" => String.trim(phone)}
            _ -> nil
          end
        end)
        |> Enum.reject(&is_nil/1)

      opts = [
        distribution_strategy: String.to_existing_atom(params["distribution_strategy"] || "none"),
        university_id: params["target_university_id"],
        target_ids: params["counsellor_ids"], # For manual strategy
        branch_id: params["branch_id"] # For branch RR
      ]

      case CRM.import_leads(socket.assigns.current_user.organization_id, params["branch_id"], leads_data, opts) do
        {:ok, result} ->
          {:ok, result}
        {:error, _} ->
          {:error, "Import failed"}
      end
    end)
    |> case do
      [result] -> 
        {:noreply, assign(socket, import_result: result)}
      [] ->
        {:noreply, put_flash(socket, :error, "Please upload a CSV file")}
    end
  end


  # Wait, I need to rewrite the file content.
  # Let's just fix the render function to wrap everything in one form and use params normally.
  
  @impl true
  def render(assigns) do
    ~H"""
    <div class="min-h-screen bg-gray-50 flex flex-col">
       <%!-- Header ... --%>
      <header class="bg-white shadow-sm border-b border-gray-200 sticky top-0 z-20">
        <div class="max-w-7xl mx-auto px-4 sm:px-6 lg:px-8">
          <div class="flex justify-between h-16">
            <div class="flex items-center gap-4">
              <div class="p-2 rounded-lg bg-indigo-50 text-indigo-600">
                <.icon name="hero-arrow-up-tray" class="w-6 h-6" />
              </div>
              <div>
                 <h1 class="text-xl font-display font-bold text-gray-900">Import Leads</h1>
                 <p class="text-sm text-gray-500">Bulk upload leads via CSV</p>
              </div>
            </div>
            <div class="flex items-center">
               <.link navigate={~p"/admin/leads"} class="btn btn-ghost text-sm">
                 <.icon name="hero-arrow-long-left" class="w-4 h-4 mr-2"/> Back to Leads
               </.link>
            </div>
          </div>
        </div>
      </header>

      <main class="flex-1 py-8">
        <div class="max-w-5xl mx-auto px-4 sm:px-6 lg:px-8">
          
          <%= if @import_result do %>
             <%!-- Result View (Same as before) --%>
            <div class="mb-8 rounded-2xl bg-gradient-to-br from-emerald-50 to-teal-50 border border-emerald-100 p-8 text-center shadow-sm">
               <div class="inline-flex items-center justify-center w-16 h-16 rounded-full bg-emerald-100 text-emerald-600 mb-4">
                 <.icon name="hero-check-circle" class="w-8 h-8" />
               </div>
               <h3 class="text-2xl font-bold text-emerald-900 mb-2">Import Successful!</h3>
               <p class="text-emerald-700 max-w-md mx-auto mb-6">
                 Processed <strong><%= @import_result.success + @import_result.failed %></strong> rows.
                 <span class="font-semibold"><%= @import_result.success %></span> leads imported.
                 <%= if @import_result.failed > 0 do %>
                   <span class="text-red-600">(<%= @import_result.failed %> failed)</span>
                 <% end %>
               </p>
               <div class="flex justify-center gap-3">
                 <.link patch={~p"/admin/leads/import"} class="btn bg-white border border-emerald-200 text-emerald-700 hover:bg-emerald-50">
                    Import More
                 </.link>
                 <.link navigate={~p"/admin/leads"} class="btn bg-emerald-600 text-white hover:bg-emerald-700 shadow-lg shadow-emerald-200">
                    View Leads
                 </.link>
               </div>
            </div>
          <% else %>
            
            <form id="import-form" phx-change="validate" phx-submit="save" class="grid grid-cols-1 lg:grid-cols-3 gap-8">
              
              <%!-- Sidebar Config --%>
              <div class="lg:col-span-1 space-y-6">
                 
                 <div class="bg-white rounded-2xl shadow-sm border border-gray-100 p-6">
                    <h3 class="font-semibold text-gray-900 mb-4 flex items-center gap-2">
                      <.icon name="hero-cog-6-tooth" class="w-5 h-5 text-gray-400"/> Configuration
                    </h3>
                    
                       <%!-- Branch Selection --%>
                       <div class="form-control w-full mb-4">
                          <label class="label"><span class="label-text font-medium">Target Branch</span></label>
                          <select name="branch_id" class="select select-bordered w-full bg-gray-50 focus:bg-white text-sm">
                            <%= for b <- @branches do %>
                              <option value={b.id} selected={@selected_branch == b.id}><%= b.name %></option>
                            <% end %>
                          </select>
                       </div>

                       <div class="divider my-4"></div>

                       <%!-- Distribution --%>
                       <div class="form-control w-full mb-4">
                          <label class="label"><span class="label-text font-medium">Distribution Strategy</span></label>
                          <select name="distribution_strategy" class="select select-bordered w-full bg-gray-50 focus:bg-white text-sm">
                            <option value="none" selected={@distribution_strategy == "none"}>No Assignment (Unassigned)</option>
                            <option value="branch_rr" selected={@distribution_strategy == "branch_rr"}>Round Robin (Branch)</option>
                            <option value="university_rr" selected={@distribution_strategy == "university_rr"}>Round Robin (University)</option>
                            <option value="manual" selected={@distribution_strategy == "manual"}>Manual Selection</option>
                          </select>
                       </div>
                       
                       <%!-- University Dropdown --%>
                       <%= if @distribution_strategy == "university_rr" do %>
                         <div class="form-control w-full mb-4 animate-in slide-in-from-top-2 duration-200">
                            <label class="label"><span class="label-text font-medium text-indigo-600">Select University</span></label>
                            <select name="target_university_id" required class="select select-bordered w-full border-indigo-200 focus:border-indigo-500">
                              <option value="" disabled selected>Choose University</option>
                              <%= for u <- @universities do %>
                                <option value={u.id} selected={@target_university_id == u.id}><%= u.name %></option>
                              <% end %>
                            </select>
                         </div>
                       <% end %>

                       <%!-- Manual Counsellor Selection --%>
                       <%= if @distribution_strategy == "manual" do %>
                         <div class="form-control w-full mb-4 animate-in slide-in-from-top-2 duration-200">
                            <label class="label"><span class="label-text font-medium text-indigo-600">Select Counsellors</span></label>
                            <p class="text-xs text-gray-500 mb-2">Hold Ctrl/Cmd to select multiple</p>
                            <select name="counsellor_ids[]" multiple required class="select select-bordered w-full h-40 text-sm">
                              <%= for c <- @counsellors do %>
                                <option value={c.id} selected={c.id in @selected_counsellors}><%= c.name %></option>
                              <% end %>
                            </select>
                         </div>
                       <% end %>

                 </div>
                 
                 <div class="bg-indigo-50 rounded-2xl p-6 border border-indigo-100">
                    <h4 class="text-sm font-bold text-indigo-900 mb-2">CSV Format Guide</h4>
                    <p class="text-xs text-indigo-700 mb-3">Your CSV file must include header row.</p>
                    <div class="bg-white rounded border border-indigo-100 p-3 font-mono text-xs text-gray-600 overflow-x-auto">
                      student_name,phone_number<br/>
                      John Doe,9876543210<br/>
                      Jane Smith,9876543211
                    </div>
                 </div>

              </div>

              <%!-- Main Upload Area --%>
              <div class="lg:col-span-2">
                 <div class="bg-white rounded-2xl shadow-sm border border-gray-100 p-8 h-full flex flex-col justify-center">
                    
                      <div class="text-center mb-8">
                         <div class="w-20 h-20 bg-indigo-50 rounded-full flex items-center justify-center mx-auto mb-4">
                           <.icon name="hero-cloud-arrow-up" class="w-10 h-10 text-indigo-600" />
                         </div>
                         <h2 class="text-2xl font-bold text-gray-900">Upload CSV File</h2>
                         <p class="text-gray-500 mt-2">Drag and drop your file here, or click to browse</p>
                      </div>

                      <div class="w-full mb-8">
                        <.live_file_input upload={@uploads.csv} class="file-input w-full max-w-xs mx-auto block" />
                      </div>
                      
                      <%= for entry <- @uploads.csv.entries do %>
                        <div class="mb-6 p-4 bg-gray-50 rounded-xl border border-gray-200 flex items-center justify-between">
                           <div class="flex items-center gap-3">
                              <.icon name="hero-document-text" class="w-8 h-8 text-gray-400" />
                              <div>
                                <p class="font-medium text-gray-900 text-sm"><%= entry.client_name %></p>
                                <p class="text-xs text-gray-500"><%= (entry.client_size / 1024) |> Float.round(1) %> KB</p>
                              </div>
                           </div>
                           <button type="button" phx-click="cancel-upload" phx-value-ref={entry.ref} class="text-gray-400 hover:text-red-500">
                             <.icon name="hero-x-mark" class="w-5 h-5" />
                           </button>
                        </div>
                        
                        <%= for err <- upload_errors(@uploads.csv, entry) do %>
                           <p class="text-red-600 text-sm mb-2 text-center"><%= error_to_string(err) %></p>
                        <% end %>
                      <% end %>
                      
                      <div class="text-center">
                        <button type="submit" phx-disable-with="Importing..." 
                          class={"btn w-full max-w-sm " <> if(@uploads.csv.entries == [], do: "btn-disabled bg-gray-100 text-gray-400", else: "btn-primary shadow-lg shadow-indigo-200")}>
                          Import Leads
                        </button>
                      </div>

                 </div>
              </div>
            </form>

          <% end %>
        </div>
      </main>
    </div>
    """
  end

  defp error_to_string(:too_large), do: "File is too large"
  defp error_to_string(:not_accepted), do: "You have selected an unacceptable file type"
  defp error_to_string(:too_many_files), do: "You have selected too many files"
end
