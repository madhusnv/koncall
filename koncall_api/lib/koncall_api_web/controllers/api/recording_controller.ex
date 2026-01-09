defmodule KoncallApiWeb.Api.RecordingController do
  @moduledoc """
  Controller for uploading call recordings to Backblaze B2 (S3-compatible).
  
  Features:
  - Uploads recordings to B2 bucket
  - Server-side deduplication (skips if recording_url exists)
  - Returns public URL for streaming
  """
  use KoncallApiWeb, :controller
  alias KoncallApi.Guardian
  alias ExAws.S3

  @doc """
  Upload a recording file to Backblaze B2.
  POST /api/recordings/upload
  Multipart form with: file (the .aac file), call_log_id (optional)
  
  Deduplication: If call_log already has recording_url, returns existing URL.
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
        upload_to_b2(conn, upload, call_log_id)
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
  
  # Upload file to Backblaze B2
  defp upload_to_b2(conn, upload, call_log_id) do
    # Get storage config
    storage_config = Application.get_env(:koncall_api, :recording_storage, [])
    bucket = Keyword.get(storage_config, :bucket, "koncall")
    public_url_base = Keyword.get(storage_config, :public_url, "https://f005.backblazeb2.com/file/koncall")
    
    # Generate unique filename
    timestamp = System.system_time(:millisecond)
    user_id = Guardian.Plug.current_claims(conn)["user_id"]
    # Sanitize filename - remove problematic characters
    safe_filename = 
      upload.filename
      |> String.replace(~r/[^\w\.\-]/, "_")
    filename = "recordings/#{user_id}_#{timestamp}_#{safe_filename}"
    
    # Read file content
    file_content = File.read!(upload.path)
    file_size = byte_size(file_content)
    
    # Determine content type
    content_type = upload.content_type || guess_content_type(upload.filename)
    
    # Upload to B2
    case S3.put_object(bucket, filename, file_content, [
      content_type: content_type,
      acl: :public_read
    ]) |> ExAws.request() do
      {:ok, _response} ->
        # Generate public URL
        file_url = "#{public_url_base}/#{filename}"
        
        # Link recording to call log if call_log_id provided
        if call_log_id && call_log_id != "" do
          case KoncallApi.CallTracking.get_call_log(call_log_id) do
            nil -> :ok
            call_log ->
              KoncallApi.CallTracking.add_recording(call_log, %{
                "recording_url" => file_url,
                "has_recording" => true,
                "recording_size" => file_size
              })
          end
        end
        
        json(conn, %{
          success: true,
          filename: filename,
          url: file_url,
          size: file_size
        })
        
      {:error, error} ->
        require Logger
        Logger.error("B2 upload failed: #{inspect(error)}")
        
        conn
        |> put_status(:internal_server_error)
        |> json(%{error: "Upload failed", details: inspect(error)})
    end
  end
  
  defp guess_content_type(filename) do
    case Path.extname(filename) |> String.downcase() do
      ".m4a" -> "audio/mp4"
      ".aac" -> "audio/aac"
      ".mp3" -> "audio/mpeg"
      ".amr" -> "audio/amr"
      ".ogg" -> "audio/ogg"
      ".wav" -> "audio/wav"
      _ -> "audio/mpeg"
    end
  end
end
