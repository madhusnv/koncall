defmodule KoncallApiWeb.FallbackController do
  @moduledoc """
  Translates controller action results into valid Plug.Conn responses.
  """
  use KoncallApiWeb, :controller

  def call(conn, {:error, %Ecto.Changeset{} = changeset}) do
    conn
    |> put_status(:unprocessable_entity)
    |> put_view(json: KoncallApiWeb.ChangesetJSON)
    |> render(:error, changeset: changeset)
  end

  def call(conn, {:error, :not_found}) do
    conn
    |> put_status(:not_found)
    |> put_view(json: KoncallApiWeb.ErrorJSON)
    |> render(:"404")
  end

  def call(conn, {:error, :not_found, message}) do
    conn
    |> put_status(:not_found)
    |> put_view(json: KoncallApiWeb.ErrorJSON)
    |> render(:error, message: message)
  end

  def call(conn, {:error, :unauthorized}) do
    conn
    |> put_status(:unauthorized)
    |> put_view(json: KoncallApiWeb.ErrorJSON)
    |> render(:"401")
  end

  def call(conn, {:error, :unauthorized, message}) do
    conn
    |> put_status(:unauthorized)
    |> put_view(json: KoncallApiWeb.ErrorJSON)
    |> render(:error, message: message)
  end

  def call(conn, {:error, :invalid_password}) do
    conn
    |> put_status(:unauthorized)
    |> put_view(json: KoncallApiWeb.ErrorJSON)
    |> render(:error, message: "Invalid phone or password")
  end

  def call(conn, {:error, :user_not_found}) do
    conn
    |> put_status(:unauthorized)
    |> put_view(json: KoncallApiWeb.ErrorJSON)
    |> render(:error, message: "Invalid phone or password")
  end
end
