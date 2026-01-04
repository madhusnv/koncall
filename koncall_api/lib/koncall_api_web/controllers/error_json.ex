defmodule KoncallApiWeb.ErrorJSON do
  @moduledoc """
  This module is invoked by your endpoint in case of errors on JSON requests.
  """

  def render("401.json", _assigns) do
    %{error: %{status: 401, message: "Unauthorized"}}
  end

  def render("404.json", _assigns) do
    %{error: %{status: 404, message: "Not found"}}
  end

  def render("500.json", _assigns) do
    %{error: %{status: 500, message: "Internal server error"}}
  end

  # Custom error with message
  def error(%{message: message}) do
    %{error: %{message: message}}
  end

  # Default fallback
  def render(template, _assigns) do
    %{error: %{detail: Phoenix.Controller.status_message_from_template(template)}}
  end
end

