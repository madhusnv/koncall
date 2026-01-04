defmodule KoncallApiWeb.Api.SettingsJSON do
  def show(%{organization: org}) do
    %{
      data: %{
        organization: %{
          id: org.id,
          name: org.name,
          code: org.code,
          settings: org.settings
        }
      }
    }
  end
end
