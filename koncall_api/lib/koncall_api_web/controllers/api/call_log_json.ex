defmodule KoncallApiWeb.Api.CallLogJSON do
  alias KoncallApi.CRM.Lead

  def index(%{call_logs: call_logs}) do
    %{data: Enum.map(call_logs, &render_call_log/1)}
  end

  def show(%{call_log: call_log}) do
    %{data: render_call_log(call_log)}
  end

  def sync_result(%{result: result}) do
    %{
      data: %{
        synced_count: length(result.synced),
        synced: Enum.map(result.synced, fn log ->
          %{
            id: log.id,
            device_call_id: log.device_call_id,
            lead_id: log.lead_id
          }
        end),
        failed_count: result.failed
      }
    }
  end

  defp render_call_log(call_log) do
    %{
      id: call_log.id,
      phone_number: call_log.phone_number,
      contact_name: call_log.contact_name,
      call_type: call_log.call_type,
      duration: call_log.duration,
      call_datetime: call_log.call_datetime,
      sim_number: call_log.sim_number,
      sim_slot: call_log.sim_slot,
      has_recording: call_log.has_recording,
      recording_url: call_log.recording_url,
      device_call_id: call_log.device_call_id,
      lead_id: call_log.lead_id,
      lead: render_lead(call_log.lead),
      notes: render_notes(call_log.notes),
      inserted_at: call_log.inserted_at
    }
  end

  defp render_lead(nil), do: nil
  defp render_lead(%Lead{} = lead) do
    %{
      id: lead.id,
      name: [lead.first_name, lead.last_name] |> Enum.filter(& &1) |> Enum.join(" "),
      phone_number: lead.phone_number
    }
  end

  defp render_notes(notes) when is_list(notes) do
    Enum.map(notes, fn note ->
      %{
        id: note.id,
        content: note.content,
        created_at: note.inserted_at
      }
    end)
  end
  defp render_notes(_), do: []
end
