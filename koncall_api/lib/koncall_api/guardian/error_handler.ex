defmodule KoncallApi.Guardian.ErrorHandler do
  @moduledoc """
  Guardian error handler for authentication failures.
  """
  import Plug.Conn

  @behaviour Guardian.Plug.ErrorHandler

  @impl Guardian.Plug.ErrorHandler
  def auth_error(conn, {type, _reason}, _opts) do
    body = Jason.encode!(%{
      error: %{
        status: 401,
        message: to_string(type),
        detail: error_message(type)
      }
    })

    conn
    |> put_resp_content_type("application/json")
    |> send_resp(401, body)
  end

  defp error_message(:unauthenticated), do: "You must be logged in to access this resource"
  defp error_message(:invalid_token), do: "The provided token is invalid"
  defp error_message(:token_expired), do: "Your session has expired, please login again"
  defp error_message(:no_resource_found), do: "User not found"
  defp error_message(_), do: "Authentication failed"
end
