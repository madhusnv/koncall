defmodule KoncallApi.Accounts.Device do
  use Ecto.Schema
  import Ecto.Changeset

  @primary_key {:id, :binary_id, autogenerate: true}
  @foreign_key_type :binary_id

  schema "devices" do
    field :device_name, :string
    field :device_model, :string
    field :device_os_version, :string
    field :app_version, :string
    field :fcm_token, :string
    field :sim_numbers, {:array, :string}, default: []
    field :is_active, :boolean, default: true
    field :last_sync_at, :utc_datetime

    belongs_to :user, KoncallApi.Accounts.User
    has_many :call_logs, KoncallApi.CallTracking.CallLog

    timestamps(type: :utc_datetime)
  end

  @doc false
  def changeset(device, attrs) do
    device
    |> cast(attrs, [:device_name, :device_model, :device_os_version, :app_version,
                    :fcm_token, :sim_numbers, :is_active, :user_id])
    |> validate_required([:user_id])
    |> foreign_key_constraint(:user_id)
    |> unique_constraint(:fcm_token)
  end

  @doc "Update last sync timestamp"
  def sync_changeset(device) do
    change(device, last_sync_at: DateTime.utc_now())
  end
end
