defmodule KoncallApi.Universities do
  @moduledoc """
  The Universities context - handles university management and counsellor assignments.
  """
  import Ecto.Query, warn: false
  alias KoncallApi.Repo
  alias KoncallApi.CRM.{University, CounsellorUniversity}

  # =====================
  # Universities
  # =====================

  @doc "List all universities for an organization"
  def list_universities(org_id) do
    University
    |> where([u], u.organization_id == ^org_id)
    |> order_by([u], asc: u.name)
    |> Repo.all()
  end

  @doc "List active universities for an organization"
  def list_active_universities(org_id) do
    University
    |> where([u], u.organization_id == ^org_id and u.is_active == true)
    |> order_by([u], asc: u.name)
    |> Repo.all()
  end

  @doc "Get a university by ID"
  def get_university(id), do: Repo.get(University, id)

  @doc "Get a university by ID with preloads"
  def get_university!(id, preloads \\ [:counsellors]) do
    University
    |> Repo.get!(id)
    |> Repo.preload(preloads)
  end

  @doc "Get university by short code"
  def get_university_by_code(org_id, short_code) do
    University
    |> where([u], u.organization_id == ^org_id and u.short_code == ^String.upcase(short_code))
    |> Repo.one()
  end

  @doc "Create a new university"
  def create_university(attrs \\ %{}) do
    %University{}
    |> University.changeset(attrs)
    |> Repo.insert()
  end

  @doc "Update a university"
  def update_university(%University{} = university, attrs) do
    university
    |> University.changeset(attrs)
    |> Repo.update()
  end

  @doc "Delete a university (soft delete by deactivating)"
  def delete_university(%University{} = university) do
    university
    |> Ecto.Changeset.change(is_active: false)
    |> Repo.update()
  end

  # =====================
  # Counsellor Assignments
  # =====================

  @doc "Assign a counsellor to a university"
  def assign_counsellor(user_id, university_id) do
    %CounsellorUniversity{}
    |> CounsellorUniversity.changeset(%{user_id: user_id, university_id: university_id})
    |> Repo.insert()
  end

  @doc "Remove a counsellor from a university"
  def unassign_counsellor(user_id, university_id) do
    CounsellorUniversity
    |> where([cu], cu.user_id == ^user_id and cu.university_id == ^university_id)
    |> Repo.delete_all()
  end

  @doc "Get all universities assigned to a counsellor"
  def get_counsellor_universities(user_id) do
    University
    |> join(:inner, [u], cu in CounsellorUniversity, on: cu.university_id == u.id)
    |> where([u, cu], cu.user_id == ^user_id)
    |> Repo.all()
  end

  @doc "Get all counsellors assigned to a university"
  def get_university_counsellors(university_id) do
    KoncallApi.Accounts.User
    |> join(:inner, [u], cu in CounsellorUniversity, on: cu.user_id == u.id)
    |> where([u, cu], cu.university_id == ^university_id)
    |> order_by([u], asc: u.name)
    |> Repo.all()
  end

  @doc "Check if counsellor is assigned to a university"
  def counsellor_assigned?(user_id, university_id) do
    CounsellorUniversity
    |> where([cu], cu.user_id == ^user_id and cu.university_id == ^university_id)
    |> Repo.exists?()
  end

  @doc "Set universities for a counsellor (replaces existing assignments)"
  def set_counsellor_universities(user_id, university_ids) when is_list(university_ids) do
    # Remove existing assignments
    CounsellorUniversity
    |> where([cu], cu.user_id == ^user_id)
    |> Repo.delete_all()

    # Add new assignments
    now = DateTime.utc_now() |> DateTime.truncate(:second)
    
    entries = Enum.map(university_ids, fn uni_id ->
      %{
        id: Ecto.UUID.generate(),
        user_id: user_id,
        university_id: uni_id,
        inserted_at: now,
        updated_at: now
      }
    end)

    Repo.insert_all(CounsellorUniversity, entries, on_conflict: :nothing)
    {:ok, length(entries)}
  end

  @doc "Get university statistics"
  def get_university_stats(university_id) do
    university = get_university!(university_id, [:counsellors, :leads])

    %{
      counsellor_count: length(university.counsellors),
      lead_count: length(university.leads),
      enrolled_count: Enum.count(university.leads, fn l -> l.stage == "enrolled" end),
      joined_count: Enum.count(university.leads, fn l -> l.stage == "joined" end)
    }
  end
end
