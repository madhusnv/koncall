defmodule KoncallApi.Application do
  # See https://hexdocs.pm/elixir/Application.html
  # for more information on OTP Applications
  @moduledoc false

  use Application

  @impl true
  def start(_type, _args) do
    children = [
      KoncallApiWeb.Telemetry,
      KoncallApi.Repo,
      {DNSCluster, query: Application.get_env(:koncall_api, :dns_cluster_query) || :ignore},
      {Phoenix.PubSub, name: KoncallApi.PubSub},
      # Oban for background job processing
      {Oban, Application.fetch_env!(:koncall_api, Oban)},
      # Start to serve requests, typically the last entry
      KoncallApiWeb.Endpoint
    ]

    # See https://hexdocs.pm/elixir/Supervisor.html
    # for other strategies and supported options
    opts = [strategy: :one_for_one, name: KoncallApi.Supervisor]
    Supervisor.start_link(children, opts)
  end

  # Tell Phoenix to update the endpoint configuration
  # whenever the application is updated.
  @impl true
  def config_change(changed, _new, removed) do
    KoncallApiWeb.Endpoint.config_change(changed, removed)
    :ok
  end
end
