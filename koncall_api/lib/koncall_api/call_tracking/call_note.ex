defmodule KoncallApi.CallTracking.CallNote do
  use Ecto.Schema
  import Ecto.Changeset

  @primary_key {:id, :binary_id, autogenerate: true}
  @foreign_key_type :binary_id

  schema "call_notes" do
    field :content, :string

    belongs_to :call_log, KoncallApi.CallTracking.CallLog
    belongs_to :user, KoncallApi.Accounts.User
    belongs_to :created_by_user, KoncallApi.Accounts.User, foreign_key: :created_by

    timestamps(type: :utc_datetime)
  end

  @doc false
  def changeset(call_note, attrs) do
    call_note
    |> cast(attrs, [:content, :call_log_id, :user_id, :created_by])
    |> validate_required([:content, :call_log_id])
    |> validate_length(:content, min: 1, max: 5000)
    |> foreign_key_constraint(:call_log_id)
    |> foreign_key_constraint(:user_id)
  end
end
