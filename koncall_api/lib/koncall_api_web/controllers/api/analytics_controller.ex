defmodule KoncallApiWeb.Api.AnalyticsController do
  use KoncallApiWeb, :controller

  alias KoncallApi.Analytics
  alias KoncallApi.Guardian

  def summary(conn, params) do
    user_id = Guardian.Plug.current_claims(conn)["user_id"]
    date_range = extract_date_range(params)
    summary = Analytics.get_summary(user_id, date_range)
    render(conn, :summary, summary: summary)
  end

  def call_trends(conn, params) do
    user_id = Guardian.Plug.current_claims(conn)["user_id"]
    date_range = extract_date_range(params)
    trends = Analytics.get_call_trends(user_id, date_range)
    render(conn, :call_trends, trends: trends)
  end

  def top_contacts(conn, params) do
    user_id = Guardian.Plug.current_claims(conn)["user_id"]
    date_range = extract_date_range(params)
    contacts = Analytics.get_top_contacts(user_id, date_range)
    render(conn, :top_contacts, contacts: contacts)
  end

  def never_attended(conn, params) do
    user_id = Guardian.Plug.current_claims(conn)["user_id"]
    date_range = extract_date_range(params)
    calls = Analytics.never_attended_calls(user_id, date_range)
    render(conn, :never_attended, calls: calls)
  end

  def not_picked_up(conn, params) do
    user_id = Guardian.Plug.current_claims(conn)["user_id"]
    date_range = extract_date_range(params)
    calls = Analytics.not_picked_up(user_id, date_range)
    render(conn, :not_picked_up, calls: calls)
  end

  defp extract_date_range(params) do
    start_date = parse_date(params["start_date"])
    end_date = parse_date(params["end_date"])
    {start_date, end_date}
  end

  defp parse_date(nil), do: nil
  defp parse_date(date_string) do
    case Date.from_iso8601(date_string) do
      {:ok, date} -> date
      _ -> nil
    end
  end
end
