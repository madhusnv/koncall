defmodule KoncallApi.Accounts.Branch do
  use Ecto.Schema
  import Ecto.Changeset

  @primary_key {:id, :binary_id, autogenerate: true}
  @foreign_key_type :binary_id

  schema "branches" do
    field :name, :string
    field :location, :string
    field :is_active, :boolean, default: true

    belongs_to :organization, KoncallApi.Accounts.Organization
    belongs_to :manager, KoncallApi.Accounts.User
    has_many :users, KoncallApi.Accounts.User
    has_many :leads, KoncallApi.CRM.Lead

    timestamps(type: :utc_datetime)
  end

  @doc false
  def changeset(branch, attrs) do
    branch
    |> cast(attrs, [:name, :location, :is_active, :organization_id, :manager_id])
    |> validate_required([:name, :organization_id])
    |> validate_length(:name, min: 2, max: 100)
    |> foreign_key_constraint(:organization_id)
    |> foreign_key_constraint(:manager_id)
    |> unique_constraint([:organization_id, :name])
  end
end
