defmodule KoncallApi.Branches do
  @moduledoc """
  The Branches context - handles branch management for the education CRM.
  """
  import Ecto.Query, warn: false
  alias KoncallApi.Repo
  alias KoncallApi.Accounts.Branch

  @doc "List all branches for an organization"
  def list_branches(org_id) do
    Branch
    |> where([b], b.organization_id == ^org_id)
    |> order_by([b], asc: b.name)
    |> preload(:manager)
    |> Repo.all()
  end

  @doc "List active branches for an organization"
  def list_active_branches(org_id) do
    Branch
    |> where([b], b.organization_id == ^org_id and b.is_active == true)
    |> order_by([b], asc: b.name)
    |> preload(:manager)
    |> Repo.all()
  end

  @doc "Get a branch by ID"
  def get_branch(id), do: Repo.get(Branch, id)

  @doc "Get a branch by ID with preloads"
  def get_branch!(id, preloads \\ [:manager, :users]) do
    Branch
    |> Repo.get!(id)
    |> Repo.preload(preloads)
  end

  @doc "Create a new branch"
  def create_branch(attrs \\ %{}) do
    %Branch{}
    |> Branch.changeset(attrs)
    |> Repo.insert()
  end

  @doc "Update a branch"
  def update_branch(%Branch{} = branch, attrs) do
    branch
    |> Branch.changeset(attrs)
    |> Repo.update()
  end

  @doc "Delete a branch (soft delete by deactivating)"
  def delete_branch(%Branch{} = branch) do
    branch
    |> Ecto.Changeset.change(is_active: false)
    |> Repo.update()
  end

  @doc "Assign a manager to a branch"
  def assign_manager(%Branch{} = branch, user_id) do
    branch
    |> Ecto.Changeset.change(manager_id: user_id)
    |> Repo.update()
  end

  @doc "Get branch statistics"
  def get_branch_stats(branch_id) do
    branch = get_branch!(branch_id, [:users, :leads])

    %{
      user_count: length(branch.users),
      lead_count: length(branch.leads),
      counsellor_count: Enum.count(branch.users, fn u -> u.role == "counsellor" end)
    }
  end

  @doc "List users in a branch"
  def list_branch_users(branch_id) do
    KoncallApi.Accounts.User
    |> where([u], u.branch_id == ^branch_id)
    |> order_by([u], asc: u.name)
    |> Repo.all()
  end

  @doc "List counsellors in a branch"
  def list_branch_counsellors(branch_id) do
    KoncallApi.Accounts.User
    |> where([u], u.branch_id == ^branch_id and u.role == "counsellor")
    |> order_by([u], asc: u.name)
    |> preload(:universities)
    |> Repo.all()
  end
end
