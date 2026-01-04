# This file is responsible for configuring your application
# and its dependencies with the aid of the Config module.
#
# This configuration file is loaded before any dependency and
# is restricted to this project.

# General application configuration
import Config

config :koncall_api,
  ecto_repos: [KoncallApi.Repo],
  generators: [timestamp_type: :utc_datetime, binary_id: true]

# Configure the endpoint
config :koncall_api, KoncallApiWeb.Endpoint,
  url: [host: "localhost"],
  adapter: Bandit.PhoenixAdapter,
  render_errors: [
    formats: [html: KoncallApiWeb.ErrorHTML, json: KoncallApiWeb.ErrorJSON],
    layout: false
  ],
  pubsub_server: KoncallApi.PubSub,
  live_view: [signing_salt: "ylwpY9qE"]

# Configure the mailer
#
# By default it uses the "Local" adapter which stores the emails
# locally. You can see the emails in your browser, at "/dev/mailbox".
#
# For production it's recommended to configure a different adapter
# at the `config/runtime.exs`.
config :koncall_api, KoncallApi.Mailer, adapter: Swoosh.Adapters.Local

# Configure esbuild (the version is required)
config :esbuild,
  version: "0.25.4",
  koncall_api: [
    args:
      ~w(js/app.js --bundle --target=es2022 --outdir=../priv/static/assets/js --external:/fonts/* --external:/images/* --alias:@=.),
    cd: Path.expand("../assets", __DIR__),
    env: %{"NODE_PATH" => [Path.expand("../deps", __DIR__), Mix.Project.build_path()]}
  ]

# Configure tailwind (the version is required)
config :tailwind,
  version: "4.1.12",
  koncall_api: [
    args: ~w(
      --input=assets/css/app.css
      --output=priv/static/assets/css/app.css
    ),
    cd: Path.expand("..", __DIR__)
  ]

# Configure Elixir's Logger
config :logger, :default_formatter,
  format: "$time $metadata[$level] $message\n",
  metadata: [:request_id]

# Use Jason for JSON parsing in Phoenix
config :phoenix, :json_library, Jason

# Guardian JWT configuration
config :koncall_api, KoncallApi.Guardian,
  issuer: "koncall_api",
  secret_key: "zfDgD1yt2M4R+L3HTu57U9q6lF3E0e4Xn7Kj5xZvMhBq8pR7sW3tY6uI9oP0aS8d",
  ttl: {30, :days}

# Oban background job configuration
config :koncall_api, Oban,
  repo: KoncallApi.Repo,
  plugins: [
    Oban.Plugins.Pruner,
    {Oban.Plugins.Cron,
     crontab: [
       # Check for due reminders every minute
       {"* * * * *", KoncallApi.Workers.ReminderWorker}
     ]}
  ],
  queues: [default: 10, sync: 5, recordings: 3, reminders: 2]

# Import environment specific config. This must remain at the bottom
# of this file so it overrides the configuration defined above.
import_config "#{config_env()}.exs"

