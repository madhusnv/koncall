defmodule KoncallApi.Guardian do
  @moduledoc """
  Guardian implementation for JWT authentication.
  """
  use Guardian, otp_app: :koncall_api

  alias KoncallApi.Accounts

  def subject_for_token(%{id: id, type: :user}, _claims) do
    {:ok, "user:#{id}"}
  end

  def subject_for_token(%{id: id, type: :device}, _claims) do
    {:ok, "device:#{id}"}
  end

  def subject_for_token(_, _) do
    {:error, :invalid_resource}
  end

  def resource_from_claims(%{"sub" => "user:" <> id}) do
    case Accounts.get_user(id) do
      nil -> {:error, :resource_not_found}
      user -> {:ok, user}
    end
  end

  def resource_from_claims(%{"sub" => "device:" <> id}) do
    case Accounts.get_device(id) do
      nil -> {:error, :resource_not_found}
      device -> {:ok, device}
    end
  end

  def resource_from_claims(_claims) do
    {:error, :invalid_claims}
  end
end
