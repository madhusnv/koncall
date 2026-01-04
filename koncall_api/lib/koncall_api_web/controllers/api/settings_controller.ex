defmodule KoncallApiWeb.Api.SettingsController do
  use KoncallApiWeb, :controller

  alias KoncallApi.Accounts
  alias KoncallApi.Guardian

  def show(conn, _params) do
    org_id = Guardian.Plug.current_claims(conn)["org_id"]
    org = Accounts.get_organization(org_id)
    render(conn, :show, organization: org)
  end

  def update(conn, %{"settings" => settings}) do
    org_id = Guardian.Plug.current_claims(conn)["org_id"]
    org = Accounts.get_organization(org_id)

    case Accounts.update_organization(org, %{settings: settings}) do
      {:ok, updated} -> render(conn, :show, organization: updated)
      {:error, changeset} -> {:error, changeset}
    end
  end
end
