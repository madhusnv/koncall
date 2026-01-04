defmodule KoncallApi.Repo.Migrations.CreateLeadStatuses do
  use Ecto.Migration

  def change do
    create table(:lead_statuses, primary_key: false) do
      add :id, :binary_id, primary_key: true
      add :organization_id, references(:organizations, type: :binary_id, on_delete: :delete_all), null: false
      add :name, :string, null: false
      add :color, :string, default: "#6366f1"
      add :position, :integer, default: 0
      add :is_default, :boolean, default: false
      add :is_system, :boolean, default: false  # For "New", "Contacted", etc.

      timestamps(type: :utc_datetime)
    end

    create index(:lead_statuses, [:organization_id])
    create index(:lead_statuses, [:organization_id, :position])
    create unique_index(:lead_statuses, [:organization_id, :name])
  end
end
