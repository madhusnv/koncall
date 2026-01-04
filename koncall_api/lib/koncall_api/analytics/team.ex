defmodule KoncallApi.Analytics.Team do
  @moduledoc """
  Team-level analytics for organization dashboards.
  Provides leaderboard, call stats by user, and org-wide summaries.
  """
  import Ecto.Query
  alias KoncallApi.Repo
  alias KoncallApi.CallTracking.CallLog
  alias KoncallApi.CRM.Lead
  alias KoncallApi.Accounts.User

  @doc """
  Get leaderboard of top callers in organization.
  Returns users ranked by call count with stats.
  """
  def get_leaderboard(org_id, date_range \\ {nil, nil}, limit \\ 10) do
    base_query = 
      CallLog
      |> join(:inner, [c], u in User, on: c.user_id == u.id)
      |> where([c, u], u.organization_id == ^org_id)
      |> filter_date_range(date_range)

    base_query
    |> group_by([c, u], [u.id, u.name, u.email])
    |> select([c, u], %{
      user_id: u.id,
      user_name: u.name,
      user_email: u.email,
      total_calls: count(c.id),
      connected_calls: count(fragment("CASE WHEN ? > 0 THEN 1 END", c.duration)),
      total_duration: sum(c.duration),
      avg_duration: fragment("ROUND(AVG(CASE WHEN ? > 0 THEN ? END))", c.duration, c.duration)
    })
    |> order_by([c, u], desc: count(c.id))
    |> limit(^limit)
    |> Repo.all()
    |> Enum.with_index(1)
    |> Enum.map(fn {row, rank} -> Map.put(row, :rank, rank) end)
  end

  @doc """
  Get organization-wide call summary.
  """
  def get_org_summary(org_id, date_range \\ {nil, nil}) do
    base_query = 
      CallLog
      |> join(:inner, [c], u in User, on: c.user_id == u.id)
      |> where([c, u], u.organization_id == ^org_id)
      |> filter_date_range(date_range)

    %{
      total_calls: Repo.aggregate(base_query, :count),
      total_duration: Repo.aggregate(base_query, :sum, :duration) || 0,
      connected_calls: base_query |> where([c], c.duration > 0) |> Repo.aggregate(:count),
      unique_callers: base_query |> select([c], c.user_id) |> distinct(true) |> Repo.aggregate(:count),
      calls_today: get_calls_today(org_id),
      calls_this_week: get_calls_in_range(org_id, week_range()),
      calls_this_month: get_calls_in_range(org_id, month_range())
    }
  end

  @doc """
  Get lead conversion summary by stage.
  """
  def get_stage_summary(org_id) do
    Lead
    |> where([l], l.organization_id == ^org_id and l.is_deleted == false)
    |> group_by([l], l.stage)
    |> select([l], {l.stage, count(l.id)})
    |> Repo.all()
    |> Map.new()
  end

  @doc """
  Get hourly call distribution (peak hours analysis).
  """
  def get_hourly_distribution(org_id, date_range \\ {nil, nil}) do
    CallLog
    |> join(:inner, [c], u in User, on: c.user_id == u.id)
    |> where([c, u], u.organization_id == ^org_id)
    |> filter_date_range(date_range)
    |> group_by([c], fragment("EXTRACT(HOUR FROM ?)", c.call_datetime))
    |> select([c], %{
      hour: fragment("EXTRACT(HOUR FROM ?)", c.call_datetime),
      call_count: count(c.id)
    })
    |> order_by([c], fragment("EXTRACT(HOUR FROM ?)", c.call_datetime))
    |> Repo.all()
  end

  # Private helpers
  defp filter_date_range(query, {nil, nil}), do: query
  defp filter_date_range(query, {start_date, nil}) do
    where(query, [c], c.call_datetime >= ^DateTime.new!(start_date, ~T[00:00:00]))
  end
  defp filter_date_range(query, {nil, end_date}) do
    where(query, [c], c.call_datetime <= ^DateTime.new!(end_date, ~T[23:59:59]))
  end
  defp filter_date_range(query, {start_date, end_date}) do
    query
    |> where([c], c.call_datetime >= ^DateTime.new!(start_date, ~T[00:00:00]))
    |> where([c], c.call_datetime <= ^DateTime.new!(end_date, ~T[23:59:59]))
  end

  defp get_calls_today(org_id) do
    today = Date.utc_today()
    get_calls_in_range(org_id, {today, today})
  end

  defp get_calls_in_range(org_id, {start_date, end_date}) do
    CallLog
    |> join(:inner, [c], u in User, on: c.user_id == u.id)
    |> where([c, u], u.organization_id == ^org_id)
    |> where([c], c.call_datetime >= ^DateTime.new!(start_date, ~T[00:00:00]))
    |> where([c], c.call_datetime <= ^DateTime.new!(end_date, ~T[23:59:59]))
    |> Repo.aggregate(:count)
  end

  defp week_range do
    today = Date.utc_today()
    start_of_week = Date.add(today, -Date.day_of_week(today) + 1)
    {start_of_week, today}
  end

  defp month_range do
    today = Date.utc_today()
    start_of_month = Date.beginning_of_month(today)
    {start_of_month, today}
  end
end
