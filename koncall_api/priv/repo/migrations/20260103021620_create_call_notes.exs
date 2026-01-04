defmodule KoncallApi.Repo.Migrations.CreateCallNotes do
  use Ecto.Migration

  def change do
    create table(:call_notes, primary_key: false) do
      add :id, :binary_id, primary_key: true
      add :call_log_id, references(:call_logs, type: :binary_id, on_delete: :delete_all), null: false
      add :user_id, references(:users, type: :binary_id, on_delete: :nilify_all)
      add :content, :text, null: false
      add :created_by, references(:users, type: :binary_id, on_delete: :nilify_all)

      timestamps(type: :utc_datetime)
    end

    create index(:call_notes, [:call_log_id])
    create index(:call_notes, [:user_id])
  end
end
