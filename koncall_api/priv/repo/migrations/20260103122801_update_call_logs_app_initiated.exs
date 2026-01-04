defmodule KoncallApi.Repo.Migrations.UpdateCallLogsAppInitiated do
  use Ecto.Migration

  def change do
    alter table(:call_logs) do
      # Only track calls initiated via the app's Call button
      add :app_initiated, :boolean, default: true
    end

    create index(:call_logs, [:app_initiated])
  end
end
