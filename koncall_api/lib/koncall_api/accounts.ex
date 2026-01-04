defmodule KoncallApi.Accounts do
  @moduledoc """
  The Accounts context - handles organizations, users, and devices.
  """
  import Ecto.Query, warn: false
  alias KoncallApi.Repo
  alias KoncallApi.Accounts.{Organization, User, Device}

  # =====================
  # Organizations
  # =====================

  @doc "List all organizations"
  def list_organizations do
    Repo.all(Organization)
  end

  @doc "Get a single organization by ID"
  def get_organization(id), do: Repo.get(Organization, id)

  @doc "Get organization by connect code"
  def get_organization_by_code(code) when is_binary(code) do
    Repo.get_by(Organization, code: String.upcase(code))
  end

  @doc "Create a new organization"
  def create_organization(attrs \\ %{}) do
    code = attrs[:code] || attrs["code"] || generate_unique_code()

    %Organization{}
    |> Organization.changeset(Map.put(attrs, :code, code))
    |> Repo.insert()
  end

  @doc "Update an organization"
  def update_organization(%Organization{} = org, attrs) do
    org
    |> Organization.changeset(attrs)
    |> Repo.update()
  end

  defp generate_unique_code do
    code = Organization.generate_code()
    if get_organization_by_code(code), do: generate_unique_code(), else: code
  end

  # =====================
  # Users
  # =====================

  @doc "Get a user by ID"
  def get_user(id), do: Repo.get(User, id)

  @doc "Get a user by ID with preloads"
  def get_user!(id, preloads \\ []) do
    User
    |> Repo.get!(id)
    |> Repo.preload(preloads)
  end

  @doc "Get user by phone within organization"
  def get_user_by_phone(organization_id, phone) do
    User
    |> where([u], u.organization_id == ^organization_id and u.phone == ^phone)
    |> Repo.one()
  end

  @doc "Get user by email within organization"
  def get_user_by_email(organization_id, email) when is_binary(email) do
    User
    |> where([u], u.organization_id == ^organization_id and u.email == ^String.downcase(email))
    |> Repo.one()
  end

  @doc "List users for an organization"
  def list_users(organization_id) do
    User
    |> where([u], u.organization_id == ^organization_id)
    |> order_by([u], asc: u.name)
    |> Repo.all()
  end

  @doc "Create a user with password"
  def create_user(attrs \\ %{}) do
    %User{}
    |> User.registration_changeset(attrs)
    |> Repo.insert()
  end

  @doc "Update a user"
  def update_user(%User{} = user, attrs) do
    user
    |> User.changeset(attrs)
    |> Repo.update()
  end

  @doc "Update user password"
  def update_user_password(%User{} = user, attrs) do
    user
    |> User.password_changeset(attrs)
    |> Repo.update()
  end

  @doc "Authenticate user by phone and password"
  def authenticate_by_phone(organization_id, phone, password) do
    user = get_user_by_phone(organization_id, phone)
    
    cond do
      user && User.valid_password?(user, password) ->
        {:ok, user}
      user ->
        {:error, :invalid_password}
      true ->
        Bcrypt.no_user_verify()
        {:error, :user_not_found}
    end
  end

  @doc "Update last login timestamp"
  def update_last_login(%User{} = user) do
    user
    |> Ecto.Changeset.change(last_login_at: DateTime.truncate(DateTime.utc_now(), :second))
    |> Repo.update()
  end

  # =====================
  # Devices
  # =====================

  @doc "Get a device by ID"
  def get_device(id), do: Repo.get(Device, id)

  @doc "Get device with preloads"
  def get_device!(id, preloads \\ []) do
    Device
    |> Repo.get!(id)
    |> Repo.preload(preloads)
  end

  @doc "List devices for a user"
  def list_user_devices(user_id) do
    Device
    |> where([d], d.user_id == ^user_id)
    |> order_by([d], desc: d.last_sync_at)
    |> Repo.all()
  end

  @doc "Register a new device"
  def register_device(attrs \\ %{}) do
    %Device{}
    |> Device.changeset(attrs)
    |> Repo.insert()
  end

  @doc "Update device info"
  def update_device(%Device{} = device, attrs) do
    device
    |> Device.changeset(attrs)
    |> Repo.update()
  end

  @doc "Update device FCM token"
  def update_device_fcm_token(%Device{} = device, fcm_token) do
    device
    |> Ecto.Changeset.change(fcm_token: fcm_token)
    |> Repo.update()
  end

  @doc "Mark device sync"
  def update_device_sync(%Device{} = device) do
    device
    |> Device.sync_changeset()
    |> Repo.update()
  end

  @doc "Deactivate a device"
  def deactivate_device(%Device{} = device) do
    device
    |> Ecto.Changeset.change(is_active: false)
    |> Repo.update()
  end
end
