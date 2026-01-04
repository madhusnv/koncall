defmodule KoncallApi.CallTracking.CallLog do
  use Ecto.Schema
  import Ecto.Changeset

  @primary_key {:id, :binary_id, autogenerate: true}
  @foreign_key_type :binary_id

  @call_types ~w(incoming outgoing missed rejected)

  schema "call_logs" do
    field :phone_number, :string
    field :contact_name, :string
    field :call_type, :string
    field :duration, :integer, default: 0
    field :call_datetime, :utc_datetime
    field :sim_number, :string
    field :sim_slot, :integer
    field :country_code, :string
    field :device_call_id, :integer
    field :sync_status, :string, default: "synced"
    field :has_recording, :boolean, default: false
    field :recording_url, :string
    field :recording_duration, :integer
    field :recording_size, :integer
    field :app_initiated, :boolean, default: true  # Only track calls made via app's Call button

    belongs_to :device, KoncallApi.Accounts.Device
    belongs_to :user, KoncallApi.Accounts.User
    belongs_to :organization, KoncallApi.Accounts.Organization
    belongs_to :lead, KoncallApi.CRM.Lead
    has_many :notes, KoncallApi.CallTracking.CallNote

    timestamps(type: :utc_datetime)
  end

  @doc false
  def changeset(call_log, attrs) do
    call_log
    |> cast(attrs, [:phone_number, :contact_name, :call_type, :duration, :call_datetime,
                    :sim_number, :sim_slot, :country_code, :device_call_id, :sync_status,
                    :has_recording, :recording_url, :recording_duration, :recording_size,
                    :device_id, :user_id, :organization_id, :lead_id])
    |> validate_required([:phone_number, :call_type, :call_datetime, :user_id, :organization_id])
    |> validate_inclusion(:call_type, @call_types)
    |> validate_number(:duration, greater_than_or_equal_to: 0)
    |> foreign_key_constraint(:device_id)
    |> foreign_key_constraint(:user_id)
    |> foreign_key_constraint(:organization_id)
    |> unique_constraint([:user_id, :device_call_id])
  end

  @doc "Sync changeset for incoming call logs from device"
  def sync_changeset(call_log, attrs) do
    call_log
    |> changeset(attrs)
    |> put_change(:sync_status, "synced")
  end

  @doc "Recording upload changeset"
  def recording_changeset(call_log, attrs) do
    call_log
    |> cast(attrs, [:has_recording, :recording_url, :recording_duration, :recording_size])
    |> put_change(:has_recording, true)
  end
end
