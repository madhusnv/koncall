# Helper module for seeding
defmodule KoncallApi.Seeder do
  alias KoncallApi.Accounts
  alias KoncallApi.Repo

  def run do
    IO.puts "🌱 Starting seed..."

    # 1. Create Organization
    org_attrs = %{
      name: "Demo Organization",
      code: "DEMO1A",
      is_active: true
    }

    {:ok, org} = 
      case Repo.get_by(Accounts.Organization, code: org_attrs.code) do
        nil -> Accounts.create_organization(org_attrs)
        org -> {:ok, org}
      end

    IO.puts "✅ Organization '#{org.name}' (Code: #{org.code}) ready."

    # 2. Create Admin User
    admin_attrs = %{
      name: "Admin User",
      email: "admin@koncall.com",
      phone: "1234567890",
      password: "password123",
      role: "admin",
      organization_id: org.id
    }

    create_user(admin_attrs)

    # 3. Create Caller 1
    caller1_attrs = %{
      name: "Caller One",
      email: "caller1@koncall.com",
      phone: "9876543210",
      password: "password123",
      role: "counsellor",
      organization_id: org.id
    }

    create_user(caller1_attrs)
    
     # 3. Create Caller 2
    caller2_attrs = %{
      name: "Caller Two",
      email: "caller2@koncall.com",
      phone: "5555555555",
      password: "password123",
      role: "counsellor",
      organization_id: org.id
    }

    create_user(caller2_attrs)

    IO.puts "\n🎉 Test Credentials Created:"
    IO.puts "---------------------------------------------------"
    IO.puts "Organization Code: #{org.code}"
    IO.puts "---------------------------------------------------"
    IO.puts "Admin     : #{admin_attrs.phone} / #{admin_attrs.password}"
    IO.puts "Caller 1  : #{caller1_attrs.phone} / #{caller1_attrs.password}"
    IO.puts "Caller 2  : #{caller2_attrs.phone} / #{caller2_attrs.password}"
    IO.puts "---------------------------------------------------"
  end

  defp create_user(attrs) do
    case Accounts.get_user_by_phone(attrs.organization_id, attrs.phone) do
      nil ->
        case Accounts.create_user(attrs) do
          {:ok, user} -> IO.puts "✅ Created user: #{user.name} (#{user.role})"
          {:error, changeset} -> IO.puts "❌ Failed to create user #{attrs.name}: #{inspect(changeset.errors)}"
        end
      _user -> IO.puts "ℹ️ User #{attrs.name} already exists."
    end
  end
end

KoncallApi.Seeder.run()
