defmodule KoncallApi.Accounts.Organization do
  use Ecto.Schema
  import Ecto.Changeset

  @primary_key {:id, :binary_id, autogenerate: true}
  @foreign_key_type :binary_id

  schema "organizations" do
    field :name, :string
    field :code, :string
    field :settings, :map, default: %{}
    field :is_active, :boolean, default: true

    has_many :users, KoncallApi.Accounts.User
    has_many :lead_statuses, KoncallApi.CRM.LeadStatus
    has_many :leads, KoncallApi.CRM.Lead
    has_many :call_logs, KoncallApi.CallTracking.CallLog

    timestamps(type: :utc_datetime)
  end

  @doc false
  def changeset(organization, attrs) do
    organization
    |> cast(attrs, [:name, :code, :settings, :is_active])
    |> validate_required([:name, :code])
    |> validate_length(:code, min: 4, max: 10)
    |> unique_constraint(:code)
    |> validate_format(:code, ~r/^[A-Z0-9]+$/, message: "must be uppercase alphanumeric")
  end

  @doc "Generate a unique 6-character organization code"
  def generate_code do
    for _ <- 1..6, into: "" do
      <<Enum.random(?A..?Z)>>
    end
  end
end
