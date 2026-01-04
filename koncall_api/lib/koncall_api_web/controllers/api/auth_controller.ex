defmodule KoncallApiWeb.Api.AuthController do
  use KoncallApiWeb, :controller

  alias KoncallApi.Accounts
  alias KoncallApi.Accounts.User
  alias KoncallApi.Guardian

  action_fallback KoncallApiWeb.FallbackController

  @doc """
  Register a device with organization code.
  
  POST /api/auth/register
  Body: {org_code, phone, name, password, device_info}
  """
  def register(conn, %{"org_code" => org_code} = params) do
    with {:ok, org} <- find_organization(org_code),
         {:ok, user} <- find_or_create_user(org, params),
         {:ok, device} <- create_device(user, params),
         {:ok, token, _claims} <- Guardian.encode_and_sign(%{id: device.id, type: :device}, %{
           user_id: user.id,
           org_id: org.id
         }) do
      conn
      |> put_status(:created)
      |> render(:auth_response, user: user, device: device, token: token)
    end
  end

  @doc """
  User login with phone and password.
  
  POST /api/auth/login
  Body: {org_code, phone, password, device_id?}
  """
  def login(conn, %{"org_code" => org_code, "phone" => phone, "password" => password} = params) do
    with {:ok, org} <- find_organization(org_code),
         {:ok, user} <- Accounts.authenticate_by_phone(org.id, phone, password),
         {:ok, _user} <- Accounts.update_last_login(user),
         {:ok, token, _claims} <- encode_token(user, params) do

      # Update device FCM token if provided
      if device_id = params["device_id"] do
        if device = Accounts.get_device(device_id) do
          if fcm_token = params["fcm_token"] do
            Accounts.update_device_fcm_token(device, fcm_token)
          end
        end
      end

      conn
      |> put_status(:ok)
      |> render(:login_response, user: user, token: token)
    end
  end

  @doc """
  Refresh the access token.
  
  POST /api/auth/refresh
  Header: Authorization: Bearer <token>
  """
  def refresh(conn, _params) do
    old_token = Guardian.Plug.current_token(conn)
    
    with {:ok, _claims} <- Guardian.decode_and_verify(old_token),
         {:ok, _old, {new_token, _claims}} <- Guardian.refresh(old_token) do
      conn
      |> put_status(:ok)
      |> render(:token_response, token: new_token)
    else
      {:error, reason} ->
        {:error, :unauthorized, reason}
    end
  end

  @doc """
  Logout - deactivate device token.
  
  DELETE /api/auth/logout
  """
  def logout(conn, _params) do
    token = Guardian.Plug.current_token(conn)
    Guardian.revoke(token)

    # Deactivate device if present in claims
    case Guardian.Plug.current_claims(conn) do
      %{"sub" => "device:" <> device_id} ->
        if device = Accounts.get_device(device_id) do
          Accounts.deactivate_device(device)
        end
      _ ->
        :ok
    end

    conn
    |> put_status(:ok)
    |> json(%{message: "Logged out successfully"})
  end

  # Private helpers

  defp find_organization(code) do
    case Accounts.get_organization_by_code(code) do
      nil -> {:error, :not_found, "Invalid organization code"}
      org -> {:ok, org}
    end
  end

  defp find_or_create_user(org, %{"phone" => phone} = params) do
    case Accounts.get_user_by_phone(org.id, phone) do
      nil ->
        Accounts.create_user(%{
          organization_id: org.id,
          phone: phone,
          name: params["name"] || "User",
          email: params["email"],
          password: params["password"]
        })
      user ->
        # Verify password for existing user
        if User.valid_password?(user, params["password"]) do
          {:ok, user}
        else
          {:error, :unauthorized, "Invalid password"}
        end
    end
  end

  defp create_device(user, params) do
    device_info = params["device_info"] || %{}
    
    Accounts.register_device(%{
      user_id: user.id,
      device_name: device_info["name"],
      device_model: device_info["model"],
      device_os_version: device_info["os_version"],
      app_version: device_info["app_version"],
      fcm_token: device_info["fcm_token"],
      sim_numbers: device_info["sim_numbers"] || []
    })
  end

  defp encode_token(user, params) do
    resource = if device_id = params["device_id"] do
      %{id: device_id, type: :device}
    else
      %{id: user.id, type: :user}
    end

    extra_claims = %{user_id: user.id, org_id: user.organization_id}
    Guardian.encode_and_sign(resource, extra_claims)
  end
end
