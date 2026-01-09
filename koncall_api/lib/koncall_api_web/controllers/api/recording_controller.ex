defmodule KoncallApiWeb.Api.RecordingController do
  @moduledoc """
  Controller for uploading and serving call recordings.
  Stores files in priv/static/uploads/recordings/
  """
  use KoncallApiWeb, :controller
  alias KoncallApi.Guardian

  # Use absolute path for Docker compatibility
  defp upload_dir do
    Path.join(Application.app_dir(:koncall_api, "priv/static"), "uploads/recordings")
  end

  @doc """
  Upload a recording file.
  POST /api/recordings/upload
  Multipart form with: file (the .aac file), call_log_id (optional)
  """
  def upload(conn, params) do
    upload = params["file"]
    call_log_id = params["call_log_id"]
    
    if is_nil(upload) do
      conn
      |> put_status(:bad_request)
      |> json(%{error: "No file provided"})
    else
      # Ensure upload directory exists
      File.mkdir_p!(upload_dir())
      
      # Generate unique filename
      timestamp = System.system_time(:millisecond)
      user_id = Guardian.Plug.current_claims(conn)["user_id"]
      filename = "#{user_id}_#{timestamp}_#{upload.filename}"
      dest_path = Path.join(upload_dir(), filename)
      
      # Copy uploaded file
      File.cp!(upload.path, dest_path)
      
      # Return the URL to access the file
      base_url = KoncallApiWeb.Endpoint.url()
      file_url = "#{base_url}/uploads/recordings/#{filename}"
      
      # Link recording to call log if call_log_id provided
      if call_log_id && call_log_id != "" do
        case KoncallApi.CallTracking.get_call_log(call_log_id) do
          nil -> :ok
          call_log ->
            KoncallApi.CallTracking.add_recording(call_log, %{
              "recording_url" => file_url,
              "has_recording" => true,
              "recording_size" => File.stat!(dest_path).size
            })
        end
      end
      
      json(conn, %{
        success: true,
        filename: filename,
        url: file_url,
        size: File.stat!(dest_path).size
      })
    end
  end
end
