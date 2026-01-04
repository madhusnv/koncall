defmodule KoncallApiWeb.SyncChannel do
  use Phoenix.Channel

  alias KoncallApi.CallTracking
  alias KoncallApi.CallTracking.CallLog

  @impl true
  def join("sync:" <> device_id, _params, socket) do
    # Verify the device belongs to the connected user
    if socket.assigns.device_id == device_id do
      send(self(), :after_join)
      {:ok, socket}
    else
      {:error, %{reason: "unauthorized"}}
    end
  end

  @impl true
  def handle_info(:after_join, socket) do
    # Send the last sync timestamp to client
    push(socket, "sync:ready", %{
      device_id: socket.assigns.device_id,
      user_id: socket.assigns.user_id
    })
    {:noreply, socket}
  end

  # Handle real-time call log sync from device
  @impl true
  def handle_in("call_log:new", payload, socket) do
    call_log_params = %{
      device_id: socket.assigns.device_id,
      user_id: socket.assigns.user_id,
      organization_id: socket.assigns.organization_id,
      phone_number: payload["phone_number"],
      contact_name: payload["contact_name"],
      call_type: payload["call_type"],
      duration: payload["duration"] || 0,
      call_datetime: parse_datetime(payload["call_datetime"]),
      sim_number: payload["sim_number"],
      sim_slot: payload["sim_slot"],
      device_call_id: payload["device_call_id"]
    }

    case CallTracking.create_call_log(call_log_params) do
      {:ok, call_log} ->
        # Broadcast to other devices of this user
        broadcast_from!(socket, "call_log:synced", %{
          id: call_log.id,
          device_call_id: call_log.device_call_id,
          phone_number: call_log.phone_number,
          call_type: call_log.call_type,
          synced_at: DateTime.utc_now()
        })

        {:reply, {:ok, %{id: call_log.id, status: "synced"}}, socket}

      {:error, changeset} ->
        errors = format_errors(changeset)
        {:reply, {:error, %{errors: errors}}, socket}
    end
  end

  # Handle batch sync
  @impl true
  def handle_in("call_logs:sync", %{"call_logs" => call_logs}, socket) do
    results = CallTracking.sync_call_logs(
      call_logs,
      socket.assigns.device_id,
      socket.assigns.user_id,
      socket.assigns.organization_id
    )

    {:reply, {:ok, results}, socket}
  end

  # Handle note update
  @impl true
  def handle_in("note:update", %{"call_log_id" => call_log_id, "content" => content}, socket) do
    case CallTracking.create_call_note(%{
      call_log_id: call_log_id,
      user_id: socket.assigns.user_id,
      content: content
    }) do
      {:ok, note} ->
        {:reply, {:ok, %{id: note.id}}, socket}

      {:error, changeset} ->
        {:reply, {:error, %{errors: format_errors(changeset)}}, socket}
    end
  end

  defp parse_datetime(nil), do: DateTime.utc_now()
  defp parse_datetime(datetime_string) when is_binary(datetime_string) do
    case DateTime.from_iso8601(datetime_string) do
      {:ok, datetime, _offset} -> datetime
      _ -> DateTime.utc_now()
    end
  end
  defp parse_datetime(_), do: DateTime.utc_now()

  defp format_errors(changeset) do
    Ecto.Changeset.traverse_errors(changeset, fn {msg, opts} ->
      Enum.reduce(opts, msg, fn {key, value}, acc ->
        String.replace(acc, "%{#{key}}", to_string(value))
      end)
    end)
  end
end
