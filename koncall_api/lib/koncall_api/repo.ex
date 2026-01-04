defmodule KoncallApi.Repo do
  use Ecto.Repo,
    otp_app: :koncall_api,
    adapter: Ecto.Adapters.Postgres
end
