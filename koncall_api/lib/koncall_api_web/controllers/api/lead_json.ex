defmodule KoncallApiWeb.Api.LeadJSON do
  def index(%{leads: leads}) do
    %{data: Enum.map(leads, &render_lead/1)}
  end

  def show(%{lead: lead}) do
    %{data: render_lead(lead)}
  end

  def users(%{users: users}) do
    %{data: Enum.map(users, &render_user_full/1)}
  end

  defp render_lead(lead) do
    %{
      id: lead.id,
      first_name: lead.first_name,
      last_name: lead.last_name,
      full_name: [lead.first_name, lead.last_name] |> Enum.filter(& &1) |> Enum.join(" "),
      phone_number: lead.phone_number,
      alternate_phone: lead.alternate_phone,
      email: lead.email,
      tags: lead.tags,
      source: lead.source,
      reminder_at: lead.reminder_at,
      last_contacted_at: lead.last_contacted_at,
      contact_count: lead.contact_count,
      notes: lead.notes,
      status: render_status(lead.status),
      assigned_to: render_user(lead.assigned_to_user),
      call_logs: render_call_logs(lead.call_logs),
      inserted_at: lead.inserted_at,
      updated_at: lead.updated_at
    }
  end

  defp render_status(nil), do: nil
  defp render_status(status) do
    %{id: status.id, name: status.name, color: status.color}
  end

  defp render_user(nil), do: nil
  defp render_user(user) do
    %{id: user.id, name: user.name}
  end

  defp render_user_full(user) do
    %{
      id: user.id,
      name: user.name,
      phone: user.phone,
      email: user.email,
      role: user.role,
      is_active: user.is_active
    }
  end

  defp render_call_logs(nil), do: []
  defp render_call_logs(%Ecto.Association.NotLoaded{}), do: nil
  defp render_call_logs(logs) do
    Enum.take(logs, 10) |> Enum.map(fn log ->
      %{
        id: log.id,
        call_type: log.call_type,
        duration: log.duration,
        call_datetime: log.call_datetime
      }
    end)
  end
end

