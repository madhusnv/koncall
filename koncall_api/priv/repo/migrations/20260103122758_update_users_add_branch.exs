defmodule KoncallApi.Repo.Migrations.UpdateUsersAddBranch do
  use Ecto.Migration

  def change do
    # Add branch_id to users
    alter table(:users) do
      add :branch_id, references(:branches, type: :binary_id, on_delete: :nilify_all)
    end

    create index(:users, [:branch_id])

    # Now add manager_id to branches (was deferred from branches migration)
    alter table(:branches) do
      add :manager_id, references(:users, type: :binary_id, on_delete: :nilify_all)
    end

    create index(:branches, [:manager_id])
  end
end
