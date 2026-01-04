defmodule KoncallApiWeb.Api.CallNoteJSON do
  def show(%{note: note}) do
    %{data: render_note(note)}
  end

  defp render_note(note) do
    %{
      id: note.id,
      content: note.content,
      call_log_id: note.call_log_id,
      created_at: note.inserted_at
    }
  end
end
