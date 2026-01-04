defmodule KoncallApi.Repo.Migrations.CreateCallLogs do
  use Ecto.Migration

  def change do
    create table(:call_logs, primary_key: false) do
      add :id, :binary_id, primary_key: true
      add :device_id, references(:devices, type: :binary_id, on_delete: :delete_all), null: false
      add :user_id, references(:users, type: :binary_id, on_delete: :delete_all), null: false
      add :organization_id, references(:organizations, type: :binary_id, on_delete: :delete_all), null: false
      add :lead_id, references(:leads, type: :binary_id, on_delete: :nilify_all)

      # Call details
      add :phone_number, :string, null: false
      add :contact_name, :string
      add :call_type, :string, null: false  # incoming, outgoing, missed, rejected
      add :duration, :integer, default: 0   # in seconds
      add :call_datetime, :utc_datetime, null: false
      add :sim_number, :string
      add :sim_slot, :integer
      add :country_code, :string

      # Sync tracking
      add :device_call_id, :bigint  # Original ID from device
      add :sync_status, :string, default: "synced"

      # Recording
      add :has_recording, :boolean, default: false
      add :recording_url, :string
      add :recording_duration, :integer
      add :recording_size, :integer  # in bytes

      timestamps(type: :utc_datetime)
    end

    create index(:call_logs, [:user_id])
    create index(:call_logs, [:organization_id])
    create index(:call_logs, [:device_id])
    create index(:call_logs, [:lead_id])
    create index(:call_logs, [:user_id, :call_datetime])
    create index(:call_logs, [:phone_number])
    create index(:call_logs, [:call_type])
    create unique_index(:call_logs, [:device_id, :device_call_id], where: "device_call_id IS NOT NULL")
  end
end
