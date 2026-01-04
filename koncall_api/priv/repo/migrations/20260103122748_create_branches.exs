defmodule KoncallApi.Repo.Migrations.CreateBranches do
  use Ecto.Migration

  def change do
    create table(:branches, primary_key: false) do
      add :id, :binary_id, primary_key: true
      add :name, :string, null: false
      add :location, :string
      add :is_active, :boolean, default: true, null: false
      add :organization_id, references(:organizations, type: :binary_id, on_delete: :delete_all), null: false

      timestamps(type: :utc_datetime)
    end

    create index(:branches, [:organization_id])
    create unique_index(:branches, [:organization_id, :name])

    # Add manager_id after we update users (to avoid circular dependency)
    # This will be done in a separate migration after users are updated
  end
end
