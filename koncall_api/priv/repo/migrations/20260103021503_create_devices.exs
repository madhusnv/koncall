defmodule KoncallApi.Repo.Migrations.CreateDevices do
  use Ecto.Migration

  def change do
    create table(:devices, primary_key: false) do
      add :id, :binary_id, primary_key: true
      add :user_id, references(:users, type: :binary_id, on_delete: :delete_all), null: false
      add :device_name, :string
      add :device_model, :string
      add :device_os_version, :string
      add :app_version, :string
      add :fcm_token, :string
      add :sim_numbers, {:array, :string}, default: []
      add :is_active, :boolean, default: true
      add :last_sync_at, :utc_datetime

      timestamps(type: :utc_datetime)
    end

    create index(:devices, [:user_id])
    create index(:devices, [:is_active])
    create unique_index(:devices, [:fcm_token], where: "fcm_token IS NOT NULL")
  end
end
