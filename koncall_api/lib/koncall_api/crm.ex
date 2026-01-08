defmodule KoncallApi.CRM do
  @moduledoc """
  The CRM context - handles leads and lead statuses for the education CRM.
  """
  import Ecto.Query, warn: false
  alias KoncallApi.Repo
  alias KoncallApi.CRM.{Lead, LeadStatus}
  alias KoncallApi.Accounts

  # =====================
  # Leads
  # =====================

  @doc "List leads for an organization with filters"
  def list_leads(org_id, params \\ %{}) do
    Lead
    |> where([l], l.organization_id == ^org_id and l.is_deleted == false)
    |> filter_by_branch(params["branch_id"])
    |> filter_by_university(params["university_id"])
    |> filter_by_stage(params["stage"])
    |> filter_by_status(params["status_id"])
    |> filter_by_assigned(params["assigned_to"])
    |> filter_by_search(params["search"])
    |> filter_by_reminder(params["due_leads"])
    |> order_by([l], desc: l.inserted_at)
    |> preload([:status, :assigned_to_user, :branch, :university])
    |> paginate(params)
  end

  @doc "List leads for a specific branch"
  def list_branch_leads(branch_id, params \\ %{}) do
    Lead
    |> where([l], l.branch_id == ^branch_id and l.is_deleted == false)
    |> filter_by_university(params["university_id"])
    |> filter_by_stage(params["stage"])
    |> filter_by_status(params["status_id"])
    |> filter_by_assigned(params["assigned_to"])
    |> filter_by_search(params["search"])
    |> filter_by_reminder(params["due_leads"])
    |> order_by([l], desc: l.inserted_at)
    |> preload([:status, :assigned_to_user, :branch, :university])
    |> paginate(params)
  end

  @doc "List leads assigned to a specific counsellor"
  def list_counsellor_leads(user_id, params \\ %{}) do
    Lead
    |> where([l], l.assigned_to == ^user_id and l.is_deleted == false)
    |> filter_by_stage(params["stage"])
    |> filter_by_search(params["search"])
    |> filter_by_reminder(params["due_leads"])
    |> order_by([l], desc: l.inserted_at)
    |> preload([:status, :university, :assigned_to_user])
    |> paginate(params)
  end

  @doc "Get leads with call statistics for a counsellor"
  def get_counsellor_lead_stats(user_id) do
    Lead
    |> join(:left, [l], c in assoc(l, :call_logs))
    |> where([l, c], l.assigned_to == ^user_id and l.is_deleted == false)
    |> group_by([l], l.id)
    |> select([l, c], %{
      lead: l,
      total_duration: sum(c.duration),
      total_calls: count(c.id),
      last_call_at: max(c.call_datetime)
    })
    |> order_by([l, c], desc: max(c.call_datetime), desc: l.inserted_at)
    |> preload([:status, :university])
    |> Repo.all()
  end

  @doc "Get a lead by ID"
  def get_lead(id), do: Repo.get(Lead, id)

  @doc "Get lead with preloads"
  def get_lead!(id, preloads \\ [:status, :assigned_to_user, :branch, :university]) do
    Lead
    |> Repo.get!(id)
    |> Repo.preload(preloads)
  end

  @doc "Get lead by phone number within organization"
  def get_lead_by_phone(org_id, phone) when is_binary(phone) do
    normalized = normalize_phone(phone)

    Lead
    |> where([l], l.organization_id == ^org_id and l.is_deleted == false)
    |> where([l],
      fragment("regexp_replace(?, '[^0-9]', '', 'g')", l.phone_number) == ^normalized or
      fragment("regexp_replace(?, '[^0-9]', '', 'g')", l.alternate_phone) == ^normalized
    )
    |> limit(1)
    |> Repo.one()
  end

  @doc "Create a lead"
  def create_lead(attrs \\ %{}) do
    %Lead{}
    |> Lead.changeset(attrs)
    |> Repo.insert()
  end

  @doc "Update a lead"
  def update_lead(%Lead{} = lead, attrs) do
    lead
    |> Lead.changeset(attrs)
    |> Repo.update()
  end

  @doc "Update lead stage"
  def update_lead_stage(%Lead{} = lead, stage) do
    lead
    |> Lead.stage_changeset(stage)
    |> Repo.update()
  end

  @doc "Soft delete a lead"
  def delete_lead(%Lead{} = lead) do
    lead
    |> Lead.delete_changeset()
    |> Repo.update()
  end

  @doc "Increment contact count after call"
  def increment_contact_count(%Lead{} = lead) do
    lead
    |> Lead.contact_changeset()
    |> Repo.update()
  end

  @doc "Assign lead to counsellor"
  def assign_lead(%Lead{} = lead, user_id) do
    lead
    |> Ecto.Changeset.change(assigned_to: user_id)
    |> Repo.update()
  end

  @doc "Bulk import leads from CSV data"
  def import_leads(org_id, branch_id, leads_data, opts \\ []) when is_list(leads_data) do
    now = DateTime.utc_now() |> DateTime.truncate(:second)
    
    _distribution_strategy = Keyword.get(opts, :distribution_strategy, :none)
    counsellors_cycle = get_distribution_cycle(branch_id, opts)
    
    results = 
      leads_data
      |> Enum.with_index()
      |> Enum.map(fn {data, index} ->
        assigned_to = get_assigned_counsellor(counsellors_cycle, index)
        
        raw_name = data["student_name"] || data["name"]
        student_name = if raw_name in [nil, ""], do: "Unknown", else: raw_name
        
        attrs = %{
          "organization_id" => org_id,
          "branch_id" => branch_id,
          "student_name" => student_name,
          "first_name" => student_name, # Fallback to satisfy DB constraint if first_name is NOT NULL
          "phone_number" => data["phone_number"] || data["phone"],
          "stage" => "new",
          "assigned_to" => assigned_to,
          "inserted_at" => now,
          "updated_at" => now
        }
        


        create_lead(attrs)
      end)

    success = Enum.filter(results, &match?({:ok, _}, &1)) |> length()
    failed = Enum.filter(results, &match?({:error, _}, &1)) |> length()

    {:ok, %{success: success, failed: failed}}
  end

  defp get_distribution_cycle(_branch_id, opts) do
    strategy = Keyword.get(opts, :distribution_strategy, :none)
    
    counsellors = case strategy do
      :branch_rr ->
        Accounts.list_branch_counsellors(opts[:branch_id]) # Note: branch_id passed to func might be needed here, or use opts
      :university_rr ->
        Accounts.list_university_counsellors(opts[:university_id])
      :manual ->
        # opts[:target_ids] contains list of user_ids
        # We need to turn them into simple functional cycle, but we need IDs.
        # Actually cycle just needs to return ID.
        opts[:target_ids] || []
      _ ->
        []
    end

    # Handle struct list vs id list
    ids = Enum.map(counsellors, fn
      %Accounts.User{id: id} -> id
      id when is_binary(id) -> id
      _ -> nil
    end) |> Enum.reject(&is_nil/1)

    if ids != [], do: ids, else: nil
  end

  defp get_assigned_counsellor(nil, _index), do: nil
  defp get_assigned_counsellor(ids, index) do
    Enum.at(ids, rem(index, length(ids)))
  end

  @doc "Get lead stage statistics for a scope"
  def get_stage_stats(scope, id) do
    query = case scope do
      :organization -> Lead |> where([l], l.organization_id == ^id and l.is_deleted == false)
      :branch -> Lead |> where([l], l.branch_id == ^id and l.is_deleted == false)
      :counsellor -> Lead |> where([l], l.assigned_to == ^id and l.is_deleted == false)
    end

    Lead.lead_stages()
    |> Enum.map(fn stage ->
      count = query |> where([l], l.stage == ^stage) |> Repo.aggregate(:count)
      {stage, count}
    end)
    |> Map.new()
  end

  # =====================
  # Lead Statuses
  # =====================

  @doc "List lead statuses for organization"
  def list_lead_statuses(org_id) do
    LeadStatus
    |> where([s], s.organization_id == ^org_id)
    |> order_by([s], asc: s.position)
    |> Repo.all()
  end

  @doc "Get a lead status"
  def get_lead_status(id), do: Repo.get(LeadStatus, id)

  @doc "Create a lead status"
  def create_lead_status(attrs \\ %{}) do
    %LeadStatus{}
    |> LeadStatus.changeset(attrs)
    |> Repo.insert()
  end

  @doc "Update a lead status"
  def update_lead_status(%LeadStatus{} = status, attrs) do
    status
    |> LeadStatus.changeset(attrs)
    |> Repo.update()
  end

  @doc "Delete a lead status (only if not system)"
  def delete_lead_status(%LeadStatus{is_system: true}), do: {:error, :cannot_delete_system}
  def delete_lead_status(%LeadStatus{} = status), do: Repo.delete(status)

  @doc "Create default statuses for a new organization"
  def create_default_statuses(org_id) do
    defaults = [
      %{name: "New", color: "#6366f1", position: 0, is_default: true, is_system: true},
      %{name: "Contacted", color: "#22c55e", position: 1, is_system: true},
      %{name: "Interested", color: "#eab308", position: 2, is_system: true},
      %{name: "Not Interested", color: "#ef4444", position: 3, is_system: true},
      %{name: "Converted", color: "#06b6d4", position: 4, is_system: true}
    ]

    Enum.each(defaults, fn attrs ->
      create_lead_status(Map.put(attrs, :organization_id, org_id))
    end)
  end

  # =====================
  # Private helpers
  # =====================

  defp normalize_phone(phone) do
    Regex.replace(~r/[^0-9]/, phone, "")
  end

  defp filter_by_branch(query, nil), do: query
  defp filter_by_branch(query, branch_id) do
    where(query, [l], l.branch_id == ^branch_id)
  end

  defp filter_by_university(query, nil), do: query
  defp filter_by_university(query, university_id) do
    where(query, [l], l.university_id == ^university_id)
  end

  defp filter_by_stage(query, nil), do: query
  defp filter_by_stage(query, stage) do
    where(query, [l], l.stage == ^stage)
  end

  defp filter_by_status(query, nil), do: query
  defp filter_by_status(query, status_id) do
    where(query, [l], l.status_id == ^status_id)
  end

  defp filter_by_assigned(query, nil), do: query
  defp filter_by_assigned(query, user_id) do
    where(query, [l], l.assigned_to == ^user_id)
  end

  defp filter_by_search(query, nil), do: query
  defp filter_by_search(query, search) do
    pattern = "%#{search}%"
    where(query, [l],
      ilike(l.student_name, ^pattern) or
      ilike(l.first_name, ^pattern) or
      ilike(l.last_name, ^pattern) or
      ilike(l.phone_number, ^pattern) or
      ilike(l.email, ^pattern)
    )
  end

  defp filter_by_reminder(query, nil), do: query
  defp filter_by_reminder(query, "true") do
    now = DateTime.utc_now()
    where(query, [l], l.reminder_at <= ^now and not is_nil(l.reminder_at))
  end
  defp filter_by_reminder(query, _), do: query

  defp paginate(query, params) do
    page = String.to_integer(params["page"] || "1")
    per_page = min(String.to_integer(params["per_page"] || "20"), 100)
    offset = (page - 1) * per_page

    query
    |> limit(^per_page)
    |> offset(^offset)
    |> Repo.all()
  end
end
