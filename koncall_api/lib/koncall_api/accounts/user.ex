defmodule KoncallApi.Accounts.User do
  use Ecto.Schema
  import Ecto.Changeset

  @primary_key {:id, :binary_id, autogenerate: true}
  @foreign_key_type :binary_id

  schema "users" do
    field :email, :string
    field :phone, :string
    field :name, :string
    field :role, :string, default: "counsellor"
    field :password, :string, virtual: true, redact: true
    field :password_hash, :string, redact: true
    field :is_active, :boolean, default: true
    field :avatar_url, :string
    field :last_login_at, :utc_datetime

    belongs_to :organization, KoncallApi.Accounts.Organization
    belongs_to :branch, KoncallApi.Accounts.Branch
    has_many :devices, KoncallApi.Accounts.Device
    has_many :call_logs, KoncallApi.CallTracking.CallLog
    has_many :assigned_leads, KoncallApi.CRM.Lead, foreign_key: :assigned_to
    has_many :university_assignments, KoncallApi.CRM.CounsellorUniversity
    has_many :universities, through: [:university_assignments, :university]

    timestamps(type: :utc_datetime)
  end

  @roles ~w(admin branch_manager counsellor)

  @doc false
  def changeset(user, attrs) do
    user
    |> cast(attrs, [:email, :phone, :name, :role, :is_active, :avatar_url, :organization_id, :branch_id])
    |> validate_required([:phone, :name, :organization_id])
    |> validate_format(:phone, ~r/^[0-9+\-\s]+$/, message: "must be a valid phone number")
    |> validate_format(:email, ~r/^[^\s]+@[^\s]+$/, message: "must be a valid email address")
    |> validate_inclusion(:role, @roles)
    |> foreign_key_constraint(:branch_id)
    |> unique_constraint([:organization_id, :phone])
    |> unique_constraint([:organization_id, :email])
  end

  @doc "Changeset for registration with password"
  def registration_changeset(user, attrs) do
    user
    |> changeset(attrs)
    |> cast(attrs, [:password])
    |> validate_required([:password])
    |> validate_length(:password, min: 6, max: 72)
    |> hash_password()
  end

  @doc "Changeset for password change"
  def password_changeset(user, attrs) do
    user
    |> cast(attrs, [:password])
    |> validate_required([:password])
    |> validate_length(:password, min: 6, max: 72)
    |> hash_password()
  end

  defp hash_password(%Ecto.Changeset{valid?: true, changes: %{password: password}} = changeset) do
    change(changeset, password_hash: Bcrypt.hash_pwd_salt(password))
  end

  defp hash_password(changeset), do: changeset

  @doc "Verify password against hash"
  def valid_password?(%__MODULE__{password_hash: hash}, password)
      when is_binary(hash) and byte_size(password) > 0 do
    Bcrypt.verify_pass(password, hash)
  end

  def valid_password?(_, _), do: Bcrypt.no_user_verify()
end
