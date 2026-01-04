# Script to assign leads to a specific counsellor
alias KoncallApi.Repo
alias KoncallApi.Accounts.User
alias KoncallApi.CRM.Lead
import Ecto.Query

defmodule KoncallApi.LeadAssigner do
  def run do
    counsellor_phone = "9876543210"
    
    # 1. Find the Counsellor
    user = Repo.get_by(User, phone: counsellor_phone)

    if is_nil(user) do
      IO.puts "❌ User with phone #{counsellor_phone} not found!"
    else
      IO.puts "✅ Found User: #{user.name} (ID: #{user.id})"
      
      # 2. Define Leads
      leads = [
        %{name: "jessu", phone: "9063035525"}
      ]
      
      # 3. Insert Leads
      Enum.each(leads, fn lead_data ->
        # Check if lead exists to avoid duplicates (optional, but good practice)
        existing = Repo.get_by(Lead, phone_number: lead_data.phone, organization_id: user.organization_id)
        
        if existing do
           IO.puts "⚠️ Lead #{lead_data.name} already exists. Updating assignment..."
           existing
           |> Ecto.Changeset.change(assigned_to: user.id)
           |> Repo.update()
           IO.puts "   -> Re-assigned to #{user.name}"
        else
            %Lead{}
            |> Lead.changeset(%{
              student_name: lead_data.name,
              first_name: lead_data.name,
              phone_number: lead_data.phone,
              assigned_to: user.id,
              organization_id: user.organization_id,
              stage: "new",
              source: "manual_assignment"
            })
            |> Repo.insert()
            |> case do
              {:ok, lead} -> IO.puts "✅ Created Lead: #{lead.student_name} assigned to #{user.name}"
              {:error, changeset} -> IO.puts "❌ Failed to create #{lead_data.name}: #{inspect(changeset.errors)}"
            end
        end
      end)
    end
  end
end

KoncallApi.LeadAssigner.run()
