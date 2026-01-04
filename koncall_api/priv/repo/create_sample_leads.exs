# Helper module for creating sample leads
defmodule KoncallApi.LeadSeeder do
  alias KoncallApi.Accounts
  alias KoncallApi.CRM
  alias KoncallApi.Repo
  import Ecto.Query

  def run do
    IO.puts "🌱 Starting lead seeding..."

    # 1. Fetch Organization
    org_code = "DEMO1A"
    org = Accounts.get_organization_by_code(org_code)
    
    if is_nil(org) do
      IO.puts "❌ Organization '#{org_code}' not found. Please run test creds seed first."
      System.halt(1)
    end

    IO.puts "✅ Found Organization: #{org.name}"

    # 2. Fetch User to assign (Admin)
    user = Accounts.get_user_by_email(org.id, "admin@koncall.com")
    
    # 3. Fetch 'New' Status
    statuses = CRM.list_lead_statuses(org.id)
    new_status = Enum.find(statuses, fn s -> s.name == "New" end)
    
    status_id = if new_status, do: new_status.id, else: nil

    # 4. Create Leads
    leads_data = [
      %{first_name: "Rahul", last_name: "Verma", phone: "9948054840", source: "Website"},
      %{first_name: "Priya", last_name: "Sharma", phone: "9000954593", source: "Referral"},
      %{first_name: "Amit", last_name: "Patel", phone: "9989251303", source: "Cold Call"}
    ]

    Enum.each(leads_data, fn data ->
      lead_attrs = %{
        first_name: data.first_name,
        last_name: data.last_name,
        phone_number: data.phone,
        organization_id: org.id,
        assigned_to: if(user, do: user.id, else: nil),
        status_id: status_id,
        source: data.source,
        notes: "Sample lead created by seeder."
      }

      # Check if exists
      existing = CRM.get_lead_by_phone(org.id, data.phone)
      
      if existing do
        IO.puts "ℹ️ Lead #{data.phone} already exists."
      else
        case CRM.create_lead(lead_attrs) do
          {:ok, lead} -> IO.puts "✅ Created Lead: #{lead.first_name} #{lead.last_name} (#{lead.phone_number})"
          {:error, changeset} -> IO.puts "❌ Failed to create #{data.phone}: #{inspect(changeset.errors)}"
        end
      end
    end)
    
    IO.puts "\n🎉 Sample Leads Created!"
  end
end

KoncallApi.LeadSeeder.run()
