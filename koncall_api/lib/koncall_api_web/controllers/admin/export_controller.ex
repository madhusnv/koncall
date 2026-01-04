defmodule KoncallApiWeb.Admin.ExportController do
  @moduledoc """
  Controller for CSV exports of leads and call logs.
  """
  use KoncallApiWeb, :controller
  alias KoncallApi.CRM
  alias KoncallApi.CallTracking
  alias KoncallApi.CRM.Lead

  @doc """
  Export leads as CSV file.
  GET /admin/exports/leads
  """
  def leads(conn, params) do
    user = conn.assigns[:current_user]
    
    # Get leads based on user role
    leads = case user.role do
      "admin" -> CRM.list_leads(user.organization_id, params |> Map.put("per_page", "10000"))
      "branch_manager" -> CRM.list_branch_leads(user.branch_id, params |> Map.put("per_page", "10000"))
      _ -> []
    end
    
    csv_content = leads_to_csv(leads)
    filename = "leads_export_#{Date.utc_today()}.csv"
    
    conn
    |> put_resp_content_type("text/csv")
    |> put_resp_header("content-disposition", "attachment; filename=\"#{filename}\"")
    |> send_resp(200, csv_content)
  end

  @doc """
  Export call logs as CSV file.
  GET /admin/exports/call-logs
  """
  def call_logs(conn, params) do
    user = conn.assigns[:current_user]
    
    # For simplicity, export org-level call logs (admin view)
    # In production, you'd want to scope this better
    date_range = parse_date_range(params)
    
    logs = CallTracking.list_call_logs(user.id, params |> Map.put("per_page", "10000"))
    
    csv_content = call_logs_to_csv(logs)
    filename = "call_logs_export_#{Date.utc_today()}.csv"
    
    conn
    |> put_resp_content_type("text/csv")
    |> put_resp_header("content-disposition", "attachment; filename=\"#{filename}\"")
    |> send_resp(200, csv_content)
  end

  # Convert leads to CSV format
  defp leads_to_csv(leads) do
    header = "Name,Phone,Alternate Phone,Email,Stage,Assigned To,Branch,University,Contact Count,Last Contacted,Notes,Created At\n"
    
    rows = Enum.map(leads, fn lead ->
      [
        Lead.display_name(lead) || "",
        lead.phone_number || "",
        lead.alternate_phone || "",
        lead.email || "",
        lead.stage || "",
        lead.assigned_to_user && lead.assigned_to_user.name || "",
        lead.branch && lead.branch.name || "",
        lead.university && lead.university.name || "",
        to_string(lead.contact_count || 0),
        format_datetime(lead.last_contacted_at),
        escape_csv(lead.notes || ""),
        format_datetime(lead.inserted_at)
      ]
      |> Enum.join(",")
    end)
    |> Enum.join("\n")
    
    header <> rows
  end

  # Convert call logs to CSV format
  defp call_logs_to_csv(logs) do
    header = "Date,Phone Number,Contact Name,Call Type,Duration (sec),Notes\n"
    
    rows = Enum.map(logs, fn log ->
      [
        format_datetime(log.call_datetime),
        log.phone_number || "",
        log.contact_name || "",
        log.call_type || "",
        to_string(log.duration || 0),
        escape_csv(Enum.map_join(log.notes || [], "; ", & &1.content))
      ]
      |> Enum.join(",")
    end)
    |> Enum.join("\n")
    
    header <> rows
  end

  defp format_datetime(nil), do: ""
  defp format_datetime(dt), do: Calendar.strftime(dt, "%Y-%m-%d %H:%M")

  defp escape_csv(text) when is_binary(text) do
    text
    |> String.replace("\"", "\"\"")
    |> then(& "\"#{&1}\"")
  end
  defp escape_csv(_), do: ""

  defp parse_date_range(params) do
    start_date = case params["start_date"] do
      nil -> nil
      date -> Date.from_iso8601!(date)
    end
    end_date = case params["end_date"] do
      nil -> nil
      date -> Date.from_iso8601!(date)
    end
    {start_date, end_date}
  end
end
