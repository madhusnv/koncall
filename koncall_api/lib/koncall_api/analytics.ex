defmodule KoncallApi.Analytics do
  @moduledoc """
  Analytics context for call statistics and insights.
  """
  import Ecto.Query
  alias KoncallApi.Repo
  alias KoncallApi.CallTracking.CallLog

  @doc "Get summary statistics for a user - optimized single query"
  def get_summary(user_id, date_range) do
    # Single query with conditional aggregation instead of 7+ separate queries
    result = base_query(user_id, date_range)
    |> select([c], %{
      total_calls: count(c.id),
      total_duration: coalesce(sum(c.duration), 0),
      incoming: count(fragment("CASE WHEN ? = 'incoming' THEN 1 END", c.call_type)),
      outgoing: count(fragment("CASE WHEN ? = 'outgoing' THEN 1 END", c.call_type)),
      missed: count(fragment("CASE WHEN ? = 'missed' THEN 1 END", c.call_type)),
      rejected: count(fragment("CASE WHEN ? = 'rejected' THEN 1 END", c.call_type)),
      connected_calls: count(fragment("CASE WHEN ? > 0 THEN 1 END", c.duration)),
      connected_duration: coalesce(sum(fragment("CASE WHEN ? > 0 THEN ? END", c.duration, c.duration)), 0),
      unique_contacts: fragment("COUNT(DISTINCT ?)", c.phone_number)
    })
    |> Repo.one()

    # Calculate avg_duration from the aggregated data
    avg_duration = if result.connected_calls > 0 do
      div(result.connected_duration, result.connected_calls)
    else
      0
    end

    Map.put(result, :avg_duration, avg_duration)
    |> Map.delete(:connected_duration)
  end

  @doc "Get call trends grouped by day"
  def get_call_trends(user_id, date_range) do
    base_query(user_id, date_range)
    |> group_by([c], fragment("DATE(?)", c.call_datetime))
    |> select([c], %{
      date: fragment("DATE(?)", c.call_datetime),
      total: count(c.id),
      incoming: count(fragment("CASE WHEN ? = 'incoming' THEN 1 END", c.call_type)),
      outgoing: count(fragment("CASE WHEN ? = 'outgoing' THEN 1 END", c.call_type)),
      missed: count(fragment("CASE WHEN ? = 'missed' THEN 1 END", c.call_type)),
      total_duration: sum(c.duration)
    })
    |> order_by([c], fragment("DATE(?)", c.call_datetime))
    |> Repo.all()
  end

  @doc "Get top contacts by call count"
  def get_top_contacts(user_id, date_range, limit \\ 10) do
    base_query(user_id, date_range)
    |> group_by([c], [c.phone_number, c.contact_name])
    |> select([c], %{
      phone_number: c.phone_number,
      contact_name: c.contact_name,
      call_count: count(c.id),
      total_duration: sum(c.duration),
      last_call: max(c.call_datetime)
    })
    |> order_by([c], desc: count(c.id))
    |> limit(^limit)
    |> Repo.all()
  end

  @doc "Get missed calls never returned"
  def never_attended_calls(user_id, date_range) do
    # Get missed call numbers
    missed_numbers = base_query(user_id, date_range)
    |> where([c], c.call_type == "missed")
    |> select([c], c.phone_number)
    |> distinct(true)
    |> Repo.all()

    # Get numbers we've had connected calls with
    returned_numbers = CallLog
    |> where([c], c.user_id == ^user_id)
    |> where([c], c.call_type in ["outgoing", "incoming"] and c.duration > 0)
    |> select([c], c.phone_number)
    |> distinct(true)
    |> Repo.all()

    never_returned = MapSet.difference(MapSet.new(missed_numbers), MapSet.new(returned_numbers))

    base_query(user_id, date_range)
    |> where([c], c.call_type == "missed" and c.phone_number in ^MapSet.to_list(never_returned))
    |> group_by([c], [c.phone_number, c.contact_name])
    |> select([c], %{
      phone_number: c.phone_number,
      contact_name: c.contact_name,
      missed_count: count(c.id),
      last_missed: max(c.call_datetime)
    })
    |> order_by([c], desc: max(c.call_datetime))
    |> Repo.all()
  end

  @doc "Get outgoing calls not answered"
  def not_picked_up(user_id, date_range) do
    # Get numbers with 0-duration outgoing calls
    not_answered = base_query(user_id, date_range)
    |> where([c], c.call_type == "outgoing" and c.duration == 0)
    |> select([c], c.phone_number)
    |> distinct(true)
    |> Repo.all()

    # Exclude numbers we've successfully connected with
    connected_numbers = CallLog
    |> where([c], c.user_id == ^user_id)
    |> where([c], c.call_type == "outgoing" and c.duration > 0)
    |> select([c], c.phone_number)
    |> distinct(true)
    |> Repo.all()

    not_connected = MapSet.difference(MapSet.new(not_answered), MapSet.new(connected_numbers))

    base_query(user_id, date_range)
    |> where([c], c.call_type == "outgoing" and c.duration == 0)
    |> where([c], c.phone_number in ^MapSet.to_list(not_connected))
    |> group_by([c], [c.phone_number, c.contact_name])
    |> select([c], %{
      phone_number: c.phone_number,
      contact_name: c.contact_name,
      attempts: count(c.id),
      last_attempt: max(c.call_datetime)
    })
    |> order_by([c], desc: max(c.call_datetime))
    |> Repo.all()
  end

  # Private helpers

  defp base_query(user_id, date_range) do
    CallLog
    |> where([c], c.user_id == ^user_id)
    |> filter_date_range(date_range)
  end

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

  defp count_by_type(query, type) do
    query
    |> where([c], c.call_type == ^type)
    |> Repo.aggregate(:count)
  end

  defp count_unique_contacts(query) do
    query
    |> select([c], c.phone_number)
    |> distinct(true)
    |> Repo.aggregate(:count)
  end

  defp count_connected(query) do
    query
    |> where([c], c.duration > 0)
    |> Repo.aggregate(:count)
  end

  defp calculate_avg_duration(query) do
    connected = query |> where([c], c.duration > 0)
    total = Repo.aggregate(connected, :sum, :duration) || 0
    count = Repo.aggregate(connected, :count)

    if count > 0, do: div(total, count), else: 0
  end
end
