defmodule KoncallApi.CRM.CounsellorUniversity do
  @moduledoc """
  Join table for many-to-many relationship between counsellors (users) and universities.
  """
  use Ecto.Schema
  import Ecto.Changeset

  @primary_key {:id, :binary_id, autogenerate: true}
  @foreign_key_type :binary_id

  schema "counsellor_universities" do
    belongs_to :user, KoncallApi.Accounts.User
    belongs_to :university, KoncallApi.CRM.University

    timestamps(type: :utc_datetime)
  end

  @doc false
  def changeset(counsellor_university, attrs) do
    counsellor_university
    |> cast(attrs, [:user_id, :university_id])
    |> validate_required([:user_id, :university_id])
    |> foreign_key_constraint(:user_id)
    |> foreign_key_constraint(:university_id)
    |> unique_constraint([:user_id, :university_id])
  end
end
