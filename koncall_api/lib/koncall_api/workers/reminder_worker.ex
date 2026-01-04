defmodule KoncallApi.Workers.ReminderWorker do
  @moduledoc """
  Oban worker to check for due follow-up reminders and send push notifications.
  Runs every minute via Cron plugin.
  """
  use Oban.Worker, queue: :reminders, max_attempts: 1

  import Ecto.Query
  alias KoncallApi.Repo
  alias KoncallApi.CRM.Lead
  alias KoncallApi.Accounts.Device

  @impl Oban.Worker
  def perform(%Oban.Job{}) do
    now = DateTime.utc_now()
    
    # Find leads with due reminders (reminder_at <= now)
    due_leads = 
      Lead
      |> where([l], not is_nil(l.reminder_at))
      |> where([l], l.reminder_at <= ^now)
      |> where([l], l.is_deleted == false)
      |> preload(:assigned_to_user)
      |> Repo.all()

    # Process each due reminder
    Enum.each(due_leads, fn lead ->
      # Send push notification to assigned user
      send_reminder_notification(lead)
      
      # Clear the reminder (one-time notification)
      clear_reminder(lead)
    end)

    {:ok, %{processed: length(due_leads)}}
  end

  defp send_reminder_notification(%Lead{assigned_to: nil}), do: :ok
  defp send_reminder_notification(%Lead{} = lead) do
    # Get user's active devices with FCM tokens
    devices = 
      Device
      |> where([d], d.user_id == ^lead.assigned_to and d.is_active == true)
      |> where([d], not is_nil(d.fcm_token))
      |> Repo.all()

    # For now, just log (FCM integration requires Firebase setup)
    if length(devices) > 0 do
      IO.puts("[REMINDER] Would send push to #{length(devices)} devices for lead: #{Lead.display_name(lead)}")
      
      # TODO: Integrate with Pigeon or direct FCM API
      # Enum.each(devices, fn device ->
      #   notification = %{
      #     title: "Follow-up Reminder",
      #     body: "Time to call #{Lead.display_name(lead)} (#{lead.phone_number})"
      #   }
      #   send_fcm_push(device.fcm_token, notification)
      # end)
    end

    :ok
  end

  defp clear_reminder(%Lead{} = lead) do
    lead
    |> Ecto.Changeset.change(reminder_at: nil)
    |> Repo.update()
  end
end
