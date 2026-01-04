defmodule KoncallApi.Repo.Migrations.CreateUniversities do
  use Ecto.Migration

  def change do
    create table(:universities, primary_key: false) do
      add :id, :binary_id, primary_key: true
      add :name, :string, null: false
      add :short_code, :string  # e.g., "UNI1", "OXFORD"
      add :is_active, :boolean, default: true, null: false
      add :organization_id, references(:organizations, type: :binary_id, on_delete: :delete_all), null: false

      timestamps(type: :utc_datetime)
    end

    create index(:universities, [:organization_id])
    create unique_index(:universities, [:organization_id, :name])
    create unique_index(:universities, [:organization_id, :short_code])

    # Join table for counsellor-university assignments
    create table(:counsellor_universities, primary_key: false) do
      add :id, :binary_id, primary_key: true
      add :user_id, references(:users, type: :binary_id, on_delete: :delete_all), null: false
      add :university_id, references(:universities, type: :binary_id, on_delete: :delete_all), null: false

      timestamps(type: :utc_datetime)
    end

    create index(:counsellor_universities, [:user_id])
    create index(:counsellor_universities, [:university_id])
    create unique_index(:counsellor_universities, [:user_id, :university_id])
  end
end
