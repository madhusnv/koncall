defmodule KoncallApiWeb.Api.UniversityController do
  use KoncallApiWeb, :controller
  alias KoncallApi.Universities

  def index(conn, _params) do
    claims = KoncallApi.Guardian.Plug.current_claims(conn)
    org_id = claims["organization_id"]
    universities = Universities.list_active_universities(org_id)

    json(conn, %{
      status: "success",
      data: Enum.map(universities, fn u ->
        %{
          id: u.id,
          name: u.name,
          short_code: u.short_code
        }
      end)
    })
  end
end
