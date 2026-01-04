defmodule KoncallApiWeb.Api.AnalyticsJSON do
  def summary(%{summary: summary}) do
    %{data: summary}
  end

  def call_trends(%{trends: trends}) do
    %{data: trends}
  end

  def top_contacts(%{contacts: contacts}) do
    %{data: contacts}
  end

  def never_attended(%{calls: calls}) do
    %{data: calls}
  end

  def not_picked_up(%{calls: calls}) do
    %{data: calls}
  end
end
