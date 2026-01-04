defmodule KoncallApiWeb.Api.CallNoteController do
  use KoncallApiWeb, :controller

  alias KoncallApi.CallTracking
  alias KoncallApi.Guardian

  action_fallback KoncallApiWeb.FallbackController

  def create(conn, %{"call_log_id" => call_log_id, "content" => content}) do
    user_id = Guardian.Plug.current_claims(conn)["user_id"]

    attrs = %{
      call_log_id: call_log_id,
      content: content,
      user_id: user_id,
      created_by: user_id
    }

    with {:ok, note} <- CallTracking.create_call_note(attrs) do
      conn
      |> put_status(:created)
      |> render(:show, note: note)
    end
  end

  def update(conn, %{"id" => id, "content" => content}) do
    note = CallTracking.get_call_note(id)

    with {:ok, updated} <- CallTracking.update_call_note(note, %{content: content}) do
      render(conn, :show, note: updated)
    end
  end

  def delete(conn, %{"id" => id}) do
    note = CallTracking.get_call_note(id)

    with {:ok, _} <- CallTracking.delete_call_note(note) do
      send_resp(conn, :no_content, "")
    end
  end
end
