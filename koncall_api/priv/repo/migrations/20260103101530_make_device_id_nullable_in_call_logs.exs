defmodule KoncallApi.Repo.Migrations.MakeDeviceIdNullableInCallLogs do
  use Ecto.Migration

  def change do
    alter table(:call_logs) do
      modify :device_id, :binary_id, null: true
    end
  end
end
