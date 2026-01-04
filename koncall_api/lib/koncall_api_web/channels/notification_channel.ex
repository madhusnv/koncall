defmodule KoncallApiWeb.NotificationChannel do
  use Phoenix.Channel

  @impl true
  def join("notifications:" <> user_id, _params, socket) do
    if socket.assigns.user_id == user_id do
      {:ok, socket}
    else
      {:error, %{reason: "unauthorized"}}
    end
  end

  @impl true
  def handle_in("ping", _payload, socket) do
    {:reply, {:ok, %{message: "pong"}}, socket}
  end

  # Server can push notifications to this channel
  # Example: lead reminders, sync alerts, etc.
end
