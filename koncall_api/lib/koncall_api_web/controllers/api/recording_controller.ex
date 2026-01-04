defmodule KoncallApiWeb.Api.RecordingController do
  @moduledoc """
  Controller for uploading and serving call recordings.
  For local testing - stores files in priv/static/uploads/recordings/
  """
  use KoncallApiWeb, :controller
  alias KoncallApi.Guardian

  @upload_dir "priv/static/uploads/recordings"

  @doc """
  Upload a recording file.
  POST /api/recordings/upload
  Multipart form with: file (the .aac file), call_log_id (optional)
  """
  def upload(conn, %{"file" => upload}) do
    # Ensure upload directory exists
    File.mkdir_p!(@upload_dir)
    
    # Generate unique filename
    timestamp = System.system_time(:millisecond)
    user_id = Guardian.Plug.current_claims(conn)["user_id"]
    filename = "#{user_id}_#{timestamp}_#{upload.filename}"
    dest_path = Path.join(@upload_dir, filename)
    
    # Copy uploaded file
    File.cp!(upload.path, dest_path)
    
    # Return the URL to access the file
    base_url = KoncallApiWeb.Endpoint.url()
    file_url = "#{base_url}/uploads/recordings/#{filename}"
    
    json(conn, %{
      success: true,
      filename: filename,
      url: file_url,
      size: File.stat!(dest_path).size
    })
  end

  def upload(conn, _params) do
    conn
    |> put_status(:bad_request)
    |> json(%{error: "No file provided"})
  end
end
