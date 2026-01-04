defmodule KoncallApi.CRM.University do
  use Ecto.Schema
  import Ecto.Changeset

  @primary_key {:id, :binary_id, autogenerate: true}
  @foreign_key_type :binary_id

  schema "universities" do
    field :name, :string
    field :short_code, :string
    field :is_active, :boolean, default: true

    belongs_to :organization, KoncallApi.Accounts.Organization
    has_many :counsellor_assignments, KoncallApi.CRM.CounsellorUniversity
    has_many :counsellors, through: [:counsellor_assignments, :user]
    has_many :leads, KoncallApi.CRM.Lead

    timestamps(type: :utc_datetime)
  end

  @doc false
  def changeset(university, attrs) do
    university
    |> cast(attrs, [:name, :short_code, :is_active, :organization_id])
    |> validate_required([:name, :organization_id])
    |> validate_length(:name, min: 2, max: 200)
    |> validate_length(:short_code, max: 20)
    |> update_change(:short_code, &String.upcase/1)
    |> foreign_key_constraint(:organization_id)
    |> unique_constraint([:organization_id, :name])
    |> unique_constraint([:organization_id, :short_code])
  end
end
