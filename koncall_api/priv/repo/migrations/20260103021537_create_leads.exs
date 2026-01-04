defmodule KoncallApi.Repo.Migrations.CreateLeads do
  use Ecto.Migration

  def change do
    create table(:leads, primary_key: false) do
      add :id, :binary_id, primary_key: true
      add :organization_id, references(:organizations, type: :binary_id, on_delete: :delete_all), null: false
      add :assigned_to, references(:users, type: :binary_id, on_delete: :nilify_all)
      add :created_by, references(:users, type: :binary_id, on_delete: :nilify_all)
      add :status_id, references(:lead_statuses, type: :binary_id, on_delete: :nilify_all)

      add :first_name, :string, null: false
      add :last_name, :string
      add :phone_number, :string, null: false
      add :alternate_phone, :string
      add :email, :string

      add :tags, {:array, :string}, default: []
      add :source, :string  # How lead was acquired (call, website, referral, etc.)

      add :reminder_at, :utc_datetime
      add :last_contacted_at, :utc_datetime
      add :contact_count, :integer, default: 0
      
      add :custom_fields, :map, default: %{}
      add :notes, :text
      add :is_deleted, :boolean, default: false

      timestamps(type: :utc_datetime)
    end

    create index(:leads, [:organization_id])
    create index(:leads, [:assigned_to])
    create index(:leads, [:status_id])
    create index(:leads, [:organization_id, :phone_number])
    create index(:leads, [:organization_id, :reminder_at], where: "reminder_at IS NOT NULL AND is_deleted = false")
    create index(:leads, [:organization_id, :is_deleted])
  end
end
