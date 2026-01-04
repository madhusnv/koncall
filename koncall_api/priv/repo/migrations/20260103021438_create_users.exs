defmodule KoncallApi.Repo.Migrations.CreateUsers do
  use Ecto.Migration

  def change do
    # Enable citext extension for case-insensitive email (must be before table creation)
    execute "CREATE EXTENSION IF NOT EXISTS citext", "DROP EXTENSION IF EXISTS citext"
    
    create table(:users, primary_key: false) do
      add :id, :binary_id, primary_key: true
      add :organization_id, references(:organizations, type: :binary_id, on_delete: :delete_all), null: false
      add :email, :citext
      add :phone, :string, null: false
      add :name, :string, null: false
      add :role, :string, default: "employee", null: false  # admin, manager, employee
      add :password_hash, :string
      add :is_active, :boolean, default: true
      add :avatar_url, :string
      add :last_login_at, :utc_datetime

      timestamps(type: :utc_datetime)
    end

    create index(:users, [:organization_id])
    create unique_index(:users, [:organization_id, :phone])
    create unique_index(:users, [:organization_id, :email], where: "email IS NOT NULL")
    create index(:users, [:role])
  end
end

