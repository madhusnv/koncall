defmodule KoncallApi.Repo.Migrations.UpdateLeadsForEducationCrm do
  use Ecto.Migration

  def change do
    alter table(:leads) do
      # Add branch and university relationships
      add :branch_id, references(:branches, type: :binary_id, on_delete: :nilify_all)
      add :university_id, references(:universities, type: :binary_id, on_delete: :nilify_all)
      
      # Simplified student name field
      add :student_name, :string
      
      # Lead stage for education funnel
      add :stage, :string, default: "new"
    end

    create index(:leads, [:branch_id])
    create index(:leads, [:university_id])
    create index(:leads, [:stage])

    # Migrate existing data: set student_name from first_name + last_name
    execute """
      UPDATE leads 
      SET student_name = COALESCE(first_name, '') || 
        CASE WHEN last_name IS NOT NULL AND last_name != '' 
          THEN ' ' || last_name 
          ELSE '' 
        END
      WHERE student_name IS NULL
    """, ""
  end
end
