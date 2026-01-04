defmodule KoncallApiWeb.UserSocket do
  use Phoenix.Socket

  # Channels
  channel "sync:*", KoncallApiWeb.SyncChannel
  channel "notifications:*", KoncallApiWeb.NotificationChannel

  @impl true
  def connect(%{"token" => token}, socket, _connect_info) do
    case KoncallApi.Guardian.decode_and_verify(token) do
      {:ok, claims} ->
        user_id = claims["sub"]
        device_id = claims["device_id"]
        org_id = claims["organization_id"]

        socket =
          socket
          |> assign(:user_id, user_id)
          |> assign(:device_id, device_id)
          |> assign(:organization_id, org_id)

        {:ok, socket}

      {:error, _reason} ->
        :error
    end
  end

  # No token provided
  def connect(_params, _socket, _connect_info) do
    :error
  end

  @impl true
  def id(socket), do: "user_socket:#{socket.assigns.user_id}"
end
