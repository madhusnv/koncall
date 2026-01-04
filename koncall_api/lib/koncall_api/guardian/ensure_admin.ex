defmodule KoncallApi.Guardian.EnsureAdmin do
  @moduledoc """
  Plug that ensures the current user has admin role.
  """
  import Plug.Conn
  alias KoncallApi.Accounts

  def init(opts), do: opts

  def call(conn, _opts) do
    claims = KoncallApi.Guardian.Plug.current_claims(conn)
    user_id = claims["user_id"]

    case Accounts.get_user(user_id) do
      %{role: "admin"} ->
        conn

      _ ->
        conn
        |> put_resp_content_type("application/json")
        |> send_resp(403, Jason.encode!(%{error: "Forbidden - Admin access required"}))
        |> halt()
    end
  end
end
