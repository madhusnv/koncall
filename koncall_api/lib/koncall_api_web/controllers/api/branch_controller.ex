defmodule KoncallApiWeb.Api.BranchController do
  use KoncallApiWeb, :controller
  alias KoncallApi.Branches

  def index(conn, _params) do
    claims = KoncallApi.Guardian.Plug.current_claims(conn)
    org_id = claims["organization_id"]
    branches = Branches.list_active_branches(org_id)

    json(conn, %{
      status: "success",
      data: Enum.map(branches, fn b ->
        %{
          id: b.id,
          name: b.name,
          location: b.location
        }
      end)
    })
  end
end
