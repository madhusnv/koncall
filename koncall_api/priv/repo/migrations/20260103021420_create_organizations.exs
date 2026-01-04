defmodule KoncallApi.Repo.Migrations.CreateOrganizations do
  use Ecto.Migration

  def change do
    create table(:organizations, primary_key: false) do
      add :id, :binary_id, primary_key: true
      add :name, :string, null: false
      add :code, :string, null: false  # Device connect code (6 chars)
      add :settings, :map, default: %{}
      add :is_active, :boolean, default: true

      timestamps(type: :utc_datetime)
    end

    create unique_index(:organizations, [:code])
    create index(:organizations, [:is_active])
  end
end
