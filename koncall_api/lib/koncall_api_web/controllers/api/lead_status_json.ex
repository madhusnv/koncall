defmodule KoncallApiWeb.Api.LeadStatusJSON do
  def index(%{statuses: statuses}) do
    %{data: Enum.map(statuses, &render_status/1)}
  end

  def show(%{status: status}) do
    %{data: render_status(status)}
  end

  defp render_status(status) do
    %{
      id: status.id,
      name: status.name,
      color: status.color,
      position: status.position,
      is_default: status.is_default,
      is_system: status.is_system
    }
  end
end
