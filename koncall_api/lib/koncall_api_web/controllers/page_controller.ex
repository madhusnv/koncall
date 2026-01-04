defmodule KoncallApiWeb.PageController do
  use KoncallApiWeb, :controller

  def home(conn, _params) do
    render(conn, :home)
  end
end
