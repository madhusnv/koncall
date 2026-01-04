defmodule KoncallApiWeb.Api.LeadStatusController do
  use KoncallApiWeb, :controller

  alias KoncallApi.CRM
  alias KoncallApi.Guardian

  action_fallback KoncallApiWeb.FallbackController

  def index(conn, _params) do
    org_id = Guardian.Plug.current_claims(conn)["org_id"]
    statuses = CRM.list_lead_statuses(org_id)
    render(conn, :index, statuses: statuses)
  end

  def create(conn, params) do
    org_id = Guardian.Plug.current_claims(conn)["org_id"]
    attrs = Map.put(params, "organization_id", org_id)

    with {:ok, status} <- CRM.create_lead_status(attrs) do
      conn
      |> put_status(:created)
      |> render(:show, status: status)
    end
  end

  def update(conn, %{"id" => id} = params) do
    status = CRM.get_lead_status(id)

    with {:ok, updated} <- CRM.update_lead_status(status, params) do
      render(conn, :show, status: updated)
    end
  end

  def delete(conn, %{"id" => id}) do
    status = CRM.get_lead_status(id)

    case CRM.delete_lead_status(status) do
      {:ok, _} -> send_resp(conn, :no_content, "")
      {:error, :cannot_delete_system} -> {:error, :forbidden}
    end
  end
end
