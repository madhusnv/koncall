defmodule KoncallApiWeb.Api.RecordingController do
  @moduledoc """
  Controller for uploading and serving call recordings.
  Stores files in priv/static/uploads/recordings/
  
  Features server-side deduplication: if a call_log already has a recording,
  returns the existing URL instead of saving a duplicate.
  """
  use KoncallApiWeb, :controller
  alias KoncallApi.Guardian

  # Use absolute path that matches Docker volume mount: ./uploads:/app/priv/static/uploads
  # In development, fall back to relative path
  defp upload_dir do
    if File.dir?("/app/priv/static") do
      # Docker/Release environment
      "/app/priv/static/uploads/recordings"
    else
      # Local development
      Path.join(File.cwd!(), "priv/static/uploads/recordings")
    end
  end

  @doc """
  Upload a recording file.
  POST /api/recordings/upload
  Multipart form with: file (the .aac file), call_log_id (optional)
  
  Server-side deduplication: If call_log already has recording_url, 
  returns existing URL with skipped: true instead of saving duplicate.
  """
  def upload(conn, params) do
    upload = params["file"]
    call_log_id = params["call_log_id"]
    
    cond do
      is_nil(upload) ->
        conn
        |> put_status(:bad_request)
        |> json(%{error: "No file provided"})
      
      # Server-side deduplication: check if recording already exists
      call_log_id && call_log_id != "" && already_has_recording?(call_log_id) ->
        existing_url = get_existing_recording_url(call_log_id)
        json(conn, %{
          success: true,
          url: existing_url,
          skipped: true,
          reason: "Recording already exists for this call"
        })
      
      true ->
        save_and_link_recording(conn, upload, call_log_id)
    end
  end
  
  # Check if call_log already has a recording
  defp already_has_recording?(call_log_id) do
    case KoncallApi.CallTracking.get_call_log(call_log_id) do
      nil -> false
      call_log -> call_log.recording_url != nil && call_log.recording_url != ""
    end
  end
  
  # Get existing recording URL for a call_log
  defp get_existing_recording_url(call_log_id) do
    case KoncallApi.CallTracking.get_call_log(call_log_id) do
      nil -> nil
      call_log -> call_log.recording_url
    end
  end
  
  # Save the uploaded file and link to call_log
  defp save_and_link_recording(conn, upload, call_log_id) do
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
