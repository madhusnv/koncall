defmodule KoncallApi.CRM.Lead do
  use Ecto.Schema
  import Ecto.Changeset

  @primary_key {:id, :binary_id, autogenerate: true}
  @foreign_key_type :binary_id

  @lead_stages ~w(new contacted interested application_submitted documents_collected enrolled joined)

  schema "leads" do
    field :first_name, :string
    field :last_name, :string
    field :student_name, :string  # Simplified name field for education CRM
    field :phone_number, :string
    field :alternate_phone, :string
    field :email, :string
    field :tags, {:array, :string}, default: []
    field :source, :string
    field :stage, :string, default: "new"  # Education CRM funnel stage
    field :reminder_at, :utc_datetime
    field :last_contacted_at, :utc_datetime
    field :contact_count, :integer, default: 0
    field :custom_fields, :map, default: %{}
    field :notes, :string
    field :is_deleted, :boolean, default: false

    belongs_to :organization, KoncallApi.Accounts.Organization
    belongs_to :branch, KoncallApi.Accounts.Branch
    belongs_to :university, KoncallApi.CRM.University
    belongs_to :assigned_to_user, KoncallApi.Accounts.User, foreign_key: :assigned_to
    belongs_to :created_by_user, KoncallApi.Accounts.User, foreign_key: :created_by
    belongs_to :status, KoncallApi.CRM.LeadStatus
    has_many :call_logs, KoncallApi.CallTracking.CallLog

    timestamps(type: :utc_datetime)
  end

  def lead_stages, do: @lead_stages

  @doc false
  def changeset(lead, attrs) do
    lead
    |> cast(attrs, [:first_name, :last_name, :student_name, :phone_number, :alternate_phone, :email,
                    :tags, :source, :stage, :reminder_at, :notes, :custom_fields,
                    :organization_id, :branch_id, :university_id, :assigned_to, :created_by, :status_id])
    |> validate_required([:phone_number, :organization_id])
    |> validate_student_name()
    |> validate_format(:phone_number, ~r/^[0-9+\-\s]+$/, message: "must be a valid phone number")
    |> validate_format(:email, ~r/^[^\s]+@[^\s]+$/, message: "must be a valid email address")
    |> validate_inclusion(:stage, @lead_stages)
    |> foreign_key_constraint(:organization_id)
    |> foreign_key_constraint(:branch_id)
    |> foreign_key_constraint(:university_id)
    |> foreign_key_constraint(:assigned_to)
    |> foreign_key_constraint(:status_id)
  end

  # Ensure at least one name field is present
  defp validate_student_name(changeset) do
    student_name = get_field(changeset, :student_name)
    first_name = get_field(changeset, :first_name)

    if is_nil(student_name) and is_nil(first_name) do
      add_error(changeset, :student_name, "either student_name or first_name is required")
    else
      changeset
    end
  end

  @doc "Changeset for stage update"
  def stage_changeset(lead, stage) when stage in @lead_stages do
    change(lead, stage: stage)
  end

  @doc "Update contact tracking after a call"
  def contact_changeset(lead) do
    change(lead,
      last_contacted_at: DateTime.utc_now() |> DateTime.truncate(:second),
      contact_count: lead.contact_count + 1
    )
  end

  @doc "Soft delete a lead"
  def delete_changeset(lead) do
    change(lead, is_deleted: true)
  end

  @doc "Get display name (student_name or full_name)"
  def display_name(%__MODULE__{student_name: student_name}) when not is_nil(student_name), do: student_name
  def display_name(%__MODULE__{first_name: first, last_name: last}) do
    [first, last]
    |> Enum.filter(& &1)
    |> Enum.join(" ")
  end

  @doc "Get full name (legacy)"
  def full_name(%__MODULE__{first_name: first, last_name: last}) do
    [first, last]
    |> Enum.filter(& &1)
    |> Enum.join(" ")
  end
end
