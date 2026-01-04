defmodule KoncallApi.Guardian.AuthPipeline do
  @moduledoc """
  Guardian auth pipeline for protected routes.
  """
  use Guardian.Plug.Pipeline,
    otp_app: :koncall_api,
    module: KoncallApi.Guardian,
    error_handler: KoncallApi.Guardian.ErrorHandler

  # Verify token from Authorization header
  plug Guardian.Plug.VerifyHeader, claims: %{"typ" => "access"}
  # Load the user if token is valid
  plug Guardian.Plug.LoadResource, allow_blank: true
end
