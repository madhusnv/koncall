defmodule KoncallApiWeb.Api.CallLogController do
  use KoncallApiWeb, :controller

  alias KoncallApi.CallTracking
  alias KoncallApi.Guardian

  action_fallback KoncallApiWeb.FallbackController

  @doc "GET /api/call-logs - List call logs with filters"
  def index(conn, params) do
    user_id = get_user_id(conn)
    call_logs = CallTracking.list_call_logs(user_id, params)
    render(conn, :index, call_logs: call_logs)
  end

  @doc "POST /api/call-logs/sync - Batch sync call logs from device"
  def sync(conn, %{"call_logs" => call_logs}) do
    claims = Guardian.Plug.current_claims(conn)
    device_id = get_device_id(conn)
    user_id = claims["user_id"]
    org_id = claims["org_id"]

    case CallTracking.sync_call_logs(device_id, user_id, org_id, call_logs) do
      {:ok, result} ->
        conn
        |> put_status(:ok)
        |> render(:sync_result, result: result)
      {:error, reason} ->
        {:error, reason}
    end
  end

  @doc "GET /api/call-logs/:id - Get single call log"
  def show(conn, %{"id" => id}) do
    call_log = CallTracking.get_call_log!(id, [:notes, :lead])
    render(conn, :show, call_log: call_log)
  end

  @doc "PUT /api/call-logs/:id - Update call log"
  def update(conn, %{"id" => id} = params) do
    call_log = CallTracking.get_call_log!(id)

    with {:ok, updated} <- CallTracking.update_call_log(call_log, params) do
      render(conn, :show, call_log: updated)
    end
  end

  @doc "POST /api/call-logs/upload-recording - Upload call recording"
  def upload_recording(conn, %{"recording" => upload}) do
    # 1. Validate extension
    extension = Path.extname(upload.filename)
    
    if extension not in [".aac", ".mp3", ".m4a", ".wav"] do
      conn
      |> put_status(:bad_request)
      |> json(%{error: "Invalid file type"})
    else
      # 2. Generate unique filename
      filename = "#{Ecto.UUID.generate()}#{extension}"
      
      # 3. Define upload path (priv/static/uploads)
      upload_dir = Application.app_dir(:koncall_api, "priv/static/uploads")
      File.mkdir_p!(upload_dir)
      
      dest_path = Path.join(upload_dir, filename)
      
      # 4. Copy file
      File.cp!(upload.path, dest_path)
      
      # 5. Return public URL
      # In dev: http://localhost:4000/uploads/filename
      # We need to configure Endpoint to serve /uploads
      
      # For now, return the relative path that the app can construct URL from
      # Or constructing full URL if host is known
      
      public_url = "/uploads/#{filename}"
      
      conn
      |> put_status(:ok)
      |> json(%{
        data: %{
          url: public_url,
          filename: filename
        }
      })
    end
  end

  defp get_user_id(conn) do
    Guardian.Plug.current_claims(conn)["user_id"]
  end

  defp get_device_id(conn) do
    case Guardian.Plug.current_claims(conn)["sub"] do
      "device:" <> id -> id
      _ -> nil
    end
  end
end
