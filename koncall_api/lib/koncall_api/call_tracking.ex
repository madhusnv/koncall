defmodule KoncallApi.CallTracking do
  @moduledoc """
  The CallTracking context - handles call logs and notes.
  """
  import Ecto.Query, warn: false
  alias KoncallApi.Repo
  alias KoncallApi.CallTracking.{CallLog, CallNote}
  alias KoncallApi.CRM

  # =====================
  # Call Logs
  # =====================

  @doc "List call logs for a user with pagination and filters"
  def list_call_logs(user_id, params \\ %{}) do
    CallLog
    |> where([c], c.user_id == ^user_id)
    |> filter_by_type(params["call_type"])
    |> filter_by_date_range(params["start_date"], params["end_date"])
    |> filter_by_phone(params["phone"])
    |> order_by([c], desc: c.call_datetime)
    |> preload(:notes)
    |> paginate(params)
  end

  @doc "Get a single call log"
  def get_call_log(id), do: Repo.get(CallLog, id)

  @doc "Get call log with preloads"
  def get_call_log!(id, preloads \\ [:notes]) do
    CallLog
    |> Repo.get!(id)
    |> Repo.preload(preloads)
  end

  @doc "List call logs for a specific lead"
  def list_lead_call_logs(lead_id) do
    CallLog
    |> where([c], c.lead_id == ^lead_id)
    |> order_by([c], desc: c.call_datetime)
    |> preload(:notes)
    |> Repo.all()
  end

  @doc "Create a call log"
  def create_call_log(attrs \\ %{}) do
    result = %CallLog{}
    |> CallLog.changeset(attrs)
    |> Repo.insert()

    # Try to auto-link to lead
    case result do
      {:ok, call_log} -> auto_link_lead(call_log)
      error -> error
    end
  end

  @doc "Batch sync call logs from device"
  def sync_call_logs(device_id, user_id, org_id, call_logs) when is_list(call_logs) do
    require Logger
    Logger.debug("[SYNC] Starting sync for #{length(call_logs)} call logs, user: #{user_id}")

    results = Enum.map(call_logs, fn log_attrs ->
      attrs = Map.merge(log_attrs, %{
        "device_id" => device_id,
        "user_id" => user_id,
        "organization_id" => org_id
      })

      device_call_id = attrs["device_call_id"]
      
      # Check for existing log - handle nil device_id
      existing = find_existing_call_log(user_id, device_id, device_call_id)

      case existing do
        nil ->
          Logger.debug("[SYNC] Creating new call log for device_call_id: #{device_call_id}")
          create_call_log(attrs)
        log ->
          {:ok, log}  # Already synced
      end
    end)

    synced = Enum.filter(results, &match?({:ok, _}, &1)) |> Enum.map(fn {:ok, log} -> log end)
    failed = Enum.filter(results, &match?({:error, _}, &1))
    
    Logger.debug("[SYNC] Complete: synced=#{length(synced)}, failed=#{length(failed)}")

    {:ok, %{synced: synced, failed: length(failed)}}
  end

  # Find existing call log - handles nil device_id
  defp find_existing_call_log(user_id, device_id, device_call_id) when is_nil(device_id) do
    # When device_id is nil, just check by user_id and device_call_id
    CallLog
    |> where([c], c.user_id == ^user_id and c.device_call_id == ^device_call_id)
    |> limit(1)
    |> Repo.one()
  end

  defp find_existing_call_log(_user_id, device_id, device_call_id) do
    CallLog
    |> where([c], c.device_id == ^device_id and c.device_call_id == ^device_call_id)
    |> limit(1)
    |> Repo.one()
  end

  @doc "Update a call log"
  def update_call_log(%CallLog{} = call_log, attrs) do
    call_log
    |> CallLog.changeset(attrs)
    |> Repo.update()
  end

  @doc "Add recording to call log"
  def add_recording(%CallLog{} = call_log, attrs) do
    call_log
    |> CallLog.recording_changeset(attrs)
    |> Repo.update()
  end

  # =====================
  # Call Notes
  # =====================

  @doc "Create a note for a call log"
  def create_call_note(attrs \\ %{}) do
    %CallNote{}
    |> CallNote.changeset(attrs)
    |> Repo.insert()
  end

  @doc "Update a call note"
  def update_call_note(%CallNote{} = note, attrs) do
    note
    |> CallNote.changeset(attrs)
    |> Repo.update()
  end

  @doc "Delete a call note"
  def delete_call_note(%CallNote{} = note) do
    Repo.delete(note)
  end

  @doc "Get a call note"
  def get_call_note(id), do: Repo.get(CallNote, id)

  # =====================
  # Private helpers
  # =====================

  defp filter_by_type(query, nil), do: query
  defp filter_by_type(query, type) when type in ~w(incoming outgoing missed rejected) do
    where(query, [c], c.call_type == ^type)
  end
  defp filter_by_type(query, _), do: query

  defp filter_by_date_range(query, nil, nil), do: query
  defp filter_by_date_range(query, start_date, nil) do
    case Date.from_iso8601(start_date) do
      {:ok, date} -> where(query, [c], c.call_datetime >= ^DateTime.new!(date, ~T[00:00:00]))
      _ -> query
    end
  end
  defp filter_by_date_range(query, nil, end_date) do
    case Date.from_iso8601(end_date) do
      {:ok, date} -> where(query, [c], c.call_datetime <= ^DateTime.new!(date, ~T[23:59:59]))
      _ -> query
    end
  end
  defp filter_by_date_range(query, start_date, end_date) do
    query
    |> filter_by_date_range(start_date, nil)
    |> filter_by_date_range(nil, end_date)
  end

  defp filter_by_phone(query, nil), do: query
  defp filter_by_phone(query, phone) do
    where(query, [c], ilike(c.phone_number, ^"%#{phone}%"))
  end

  defp paginate(query, params) do
    page = (params["page"] || "1") |> String.to_integer()
    per_page = (params["per_page"] || "50") |> String.to_integer() |> min(100)
    offset = (page - 1) * per_page

    query
    |> limit(^per_page)
    |> offset(^offset)
    |> Repo.all()
  end

  defp auto_link_lead(%CallLog{organization_id: org_id, phone_number: phone} = call_log) do
    case CRM.get_lead_by_phone(org_id, phone) do
      nil -> {:ok, call_log}
      lead ->
        # Update stage if call was connected (duration > 0) and stage is still 'new'
        if call_log.duration > 0 and lead.stage == "new" do
           CRM.update_lead_stage(lead, "contacted")
        end

        call_log
        |> Ecto.Changeset.change(lead_id: lead.id)
        |> Repo.update()
        |> case do
          {:ok, updated_log} ->
            CRM.increment_contact_count(lead)
            {:ok, Repo.preload(updated_log, :lead)}
          error -> error
        end
    end
  end
end
