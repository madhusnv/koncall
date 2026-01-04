alias KoncallApi.{Repo, Accounts, CRM}

# 1. Create Organization
IO.puts "Creating Organization..."
{:ok, org} = Accounts.create_organization(%{
  name: "KON01",
  slug: "kon01",
  code: "KON01"
})

# 2. Create Admin User
IO.puts "Creating Admin User..."
{:ok, _admin} = Accounts.create_user(%{
  name: "Admin User",
  phone: "9948054840",
  password: "password123",
  role: "admin",
  organization_id: org.id
})

# 3. Create Default Lead Statuses
IO.puts "Creating Default Lead Statuses..."
CRM.create_default_statuses(org.id)

IO.puts "Seeding completed successfully!"
