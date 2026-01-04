defmodule KoncallApiWeb.Api.AuthJSON do
  @moduledoc """
  JSON rendering for AuthController responses.
  """

  def auth_response(%{user: user, device: device, token: token}) do
    %{
      data: %{
        user: render_user(user),
        device: render_device(device),
        token: token,
        token_type: "Bearer"
      }
    }
  end

  def login_response(%{user: user, token: token}) do
    %{
      data: %{
        user: render_user(user),
        token: token,
        token_type: "Bearer"
      }
    }
  end

  def token_response(%{token: token}) do
    %{
      data: %{
        token: token,
        token_type: "Bearer"
      }
    }
  end

  defp render_user(user) do
    %{
      id: user.id,
      name: user.name,
      phone: user.phone,
      email: user.email,
      role: user.role,
      organization_id: user.organization_id
    }
  end

  defp render_device(device) do
    %{
      id: device.id,
      device_name: device.device_name,
      device_model: device.device_model,
      is_active: device.is_active
    }
  end
end
