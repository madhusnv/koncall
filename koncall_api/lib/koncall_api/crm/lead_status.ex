defmodule KoncallApi.CRM.LeadStatus do
  use Ecto.Schema
  import Ecto.Changeset

  @primary_key {:id, :binary_id, autogenerate: true}
  @foreign_key_type :binary_id

  schema "lead_statuses" do
    field :name, :string
    field :color, :string, default: "#6366f1"
    field :position, :integer, default: 0
    field :is_default, :boolean, default: false
    field :is_system, :boolean, default: false

    belongs_to :organization, KoncallApi.Accounts.Organization
    has_many :leads, KoncallApi.CRM.Lead, foreign_key: :status_id

    timestamps(type: :utc_datetime)
  end

  @doc false
  def changeset(lead_status, attrs) do
    lead_status
    |> cast(attrs, [:name, :color, :position, :is_default, :is_system, :organization_id])
    |> validate_required([:name, :organization_id])
    |> validate_format(:color, ~r/^#[0-9A-Fa-f]{6}$/, message: "must be a valid hex color")
    |> unique_constraint([:organization_id, :name])
    |> foreign_key_constraint(:organization_id)
  end
end
