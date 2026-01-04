defmodule KoncallApi.Guardian.EnsureAuth do
  @moduledoc """
  Plug to ensure a user is authenticated.
  """
  import Plug.Conn

  def init(opts), do: opts

  def call(conn, _opts) do
    case Guardian.Plug.current_resource(conn) do
      nil ->
        conn
        |> put_status(:unauthorized)
        |> Phoenix.Controller.put_view(json: KoncallApiWeb.ErrorJSON)
        |> Phoenix.Controller.render("401.json")
        |> halt()

      _resource ->
        conn
    end
  end
end
