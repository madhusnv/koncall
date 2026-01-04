defmodule KoncallApiWeb.Admin.SessionController do
  use KoncallApiWeb, :controller

  alias KoncallApi.Accounts

  def new(conn, _params) do
    render(conn, :new, error: nil)
  end

  def create(conn, %{"session" => %{"phone" => phone, "password" => password, "org_code" => org_code}}) do
    # Find organization
    case Accounts.get_organization_by_code(org_code) do
      nil ->
        render(conn, :new, error: "Invalid organization code")

      org ->
        # Authenticate user
        case Accounts.authenticate_by_phone(org.id, phone, password) do
          {:ok, user} ->
            if user.role in ["admin", "branch_manager"] do
              conn
              |> put_session(:admin_user_id, user.id)
              |> put_session(:org_id, org.id)
              |> put_flash(:info, "Welcome back, #{user.name}!")
              |> redirect(to: ~p"/admin/dashboard")
            else
              render(conn, :new, error: "Access denied. Admin or Branch Manager role required.")
            end

          {:error, _} ->
            render(conn, :new, error: "Invalid phone number or password")
        end
    end
  end

  def delete(conn, _params) do
    conn
    |> clear_session()
    |> put_flash(:info, "Logged out successfully")
    |> redirect(to: ~p"/admin/login")
  end
end
