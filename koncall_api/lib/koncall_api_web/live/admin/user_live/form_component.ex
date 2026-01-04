defmodule KoncallApiWeb.Admin.UserLive.FormComponent do
  use KoncallApiWeb, :live_component

  alias KoncallApi.Accounts

  @impl true
  def render(assigns) do
    ~H"""
    <div>
      <div class="pb-6 mb-6 border-b-2" style="border-color: var(--color-border-light);">
        <div class="flex items-center gap-3 mb-2">
          <div class="p-2 rounded-xl" style="background: linear-gradient(135deg, var(--color-primary), var(--color-secondary));">
            <.icon name="hero-user-plus" class="w-6 h-6 text-white" />
          </div>
          <h2 class="text-2xl font-display font-bold" style="color: var(--color-text-primary);"><%= @title %></h2>
        </div>
        <p class="text-sm" style="color: var(--color-text-muted);">Fill in the details below to manage the user account.</p>
      </div>

      <.form
        for={@form}
        id="user-form"
        phx-target={@myself}
        phx-change="validate"
        phx-submit="save"
        class="space-y-6"
      >
        <div>
          <label class="label">Full Name</label>
          <.input field={@form[:name]} type="text" class="input" placeholder="e.g. John Doe" />
        </div>

        <div class="grid grid-cols-1 md:grid-cols-2 gap-6">
          <div>
            <label class="label">Phone Number</label>
            <.input field={@form[:phone]} type="tel" class="input" placeholder="10-digit number" />
          </div>

          <div>
             <label class="label">Password</label>
             <.input field={@form[:password]} type="password" class="input" placeholder="******" />
             <p class="text-xs mt-1.5 ml-1" style="color: var(--color-text-muted);">Leave blank to keep current password</p>
          </div>
        </div>

        <div class="grid grid-cols-1 md:grid-cols-2 gap-6">
          <div>
            <label class="label">Role</label>
            <.input field={@form[:role]} type="select" options={[{"Counsellor", "counsellor"}, {"Branch Manager", "branch_manager"}, {"Admin", "admin"}]} class="input" />
          </div>

          <div>
            <label class="label">Branch</label>
            <.input field={@form[:branch_id]} type="select" options={Enum.map(@branches, &{&1.name, &1.id})} prompt="Select Branch" class="input" />
          </div>
        </div>

        <div class="flex justify-end gap-3 pt-6 mt-8 border-t-2" style="border-color: var(--color-border-light);">
          <.link patch={@patch} class="btn btn-ghost">Cancel</.link>
          <button type="submit" phx-disable-with="Saving..." class="btn btn-primary">
            <.icon name="hero-check" class="w-5 h-5" />
            <%= if @action == :new, do: "Create User", else: "Save Changes" %>
          </button>
        </div>
      </.form>
    </div>
    """
  end

  @impl true
  def update(%{user: user} = assigns, socket) do
    changeset = Accounts.User.changeset(user, %{})
    {:ok,
     socket
     |> assign(assigns)
     |> assign_form(changeset)}
  end

  @impl true
  def handle_event("validate", %{"user" => user_params}, socket) do
    changeset =
      socket.assigns.user
      |> Accounts.User.changeset(user_params)
      |> Map.put(:action, :validate)

    {:noreply, assign_form(socket, changeset)}
  end

  @impl true
  def handle_event("save", %{"user" => user_params}, socket) do
    save_user(socket, socket.assigns.action, user_params)
  end

  defp save_user(socket, :edit, user_params) do
    case Accounts.update_user(socket.assigns.user, user_params) do
      {:ok, _user} ->
        notify_parent({:saved, _user})

        {:noreply,
         socket
         |> put_flash(:info, "User updated successfully")
         |> push_patch(to: socket.assigns.patch)}

      {:error, %Ecto.Changeset{} = changeset} ->
        {:noreply, assign_form(socket, changeset)}
    end
  end

  defp save_user(socket, :new, user_params) do
    params = Map.put(user_params, "organization_id", socket.assigns.current_user.organization_id)

    case Accounts.create_user(params) do
      {:ok, _user} ->
        notify_parent({:saved, _user})

        {:noreply,
         socket
         |> put_flash(:info, "User created successfully")
         |> push_patch(to: socket.assigns.patch)}

      {:error, %Ecto.Changeset{} = changeset} ->
        {:noreply, assign_form(socket, changeset)}
    end
  end

  defp notify_parent(msg), do: send(self(), {__MODULE__, msg})

  defp assign_form(socket, %Ecto.Changeset{} = changeset) do
    assign(socket, :form, to_form(changeset))
  end
end
