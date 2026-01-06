defmodule KoncallApiWeb.Router do
  use KoncallApiWeb, :router

  pipeline :browser do
    plug :accepts, ["html"]
    plug :fetch_session
    plug :fetch_live_flash
    plug :put_root_layout, html: {KoncallApiWeb.Layouts, :root}
    plug :protect_from_forgery
    plug :put_secure_browser_headers
  end

  pipeline :api do
    plug :accepts, ["json"]
    plug CORSPlug, origin: ["*"]
  end

  pipeline :api_auth do
    plug KoncallApi.Guardian.AuthPipeline
  end

  pipeline :ensure_auth do
    plug KoncallApi.Guardian.EnsureAuth
  end

  pipeline :admin_auth do
    plug :fetch_admin_user
  end

  pipeline :require_admin do
    plug :require_admin_role
  end

  pipeline :require_manager do
    plug :require_manager_role
  end

  # Browser routes - Public pages
  scope "/", KoncallApiWeb do
    pipe_through :browser

    get "/", PageController, :home
  end

  # Admin Authentication (no auth required)
  scope "/admin", KoncallApiWeb.Admin do
    pipe_through :browser

    get "/login", SessionController, :new
    post "/login", SessionController, :create
    get "/logout", SessionController, :delete
    delete "/logout", SessionController, :delete
  end

  # Admin Dashboard - Requires admin login
  scope "/admin", KoncallApiWeb.Admin do
    pipe_through [:browser, :admin_auth, :require_manager]

    live "/dashboard", DashboardLive, :index
    
    # Branch management (Admin only)
    live "/branches", BranchLive.Index, :index
    live "/branches/new", BranchLive.Index, :new
    live "/branches/:id", BranchLive.Show, :show
    live "/branches/:id/edit", BranchLive.Index, :edit

    # University management (Admin only)
    live "/universities", UniversityLive.Index, :index
    live "/universities/new", UniversityLive.Index, :new
    live "/universities/:id", UniversityLive.Show, :show
    live "/universities/:id/edit", UniversityLive.Index, :edit

    # User management
    live "/users", UserLive.Index, :index
    live "/users/new", UserLive.Index, :new
    live "/users/:id", UserLive.Show, :show
    live "/users/:id/edit", UserLive.Index, :edit

    # Lead management
    live "/leads", LeadLive.Index, :index
    live "/leads/import", LeadLive.Import, :import
    live "/leads/:id", LeadLive.Show, :show
    
    # Analytics Dashboard
    live "/analytics", AnalyticsLive, :index

    # Reports
    live "/reports", ReportLive.Index, :index
    live "/reports/counsellors", ReportLive.Counsellors, :index
    live "/reports/counsellors/:id", ReportLive.CounsellorShow, :show
    live "/reports/leads/:id/calls", ReportLive.LeadCalls, :show
    live "/reports/branches", ReportLive.Branches, :index
    live "/reports/universities", ReportLive.Universities, :index
    
    # CSV Exports (regular controller, not LiveView)
    get "/exports/leads", ExportController, :leads
    get "/exports/call-logs", ExportController, :call_logs
  end

  # Public API routes - no auth required
  scope "/api", KoncallApiWeb.Api, as: :api do
    pipe_through :api

    post "/auth/register", AuthController, :register
    post "/auth/login", AuthController, :login
  end

  # Protected API routes - auth required
  scope "/api", KoncallApiWeb.Api, as: :api do
    pipe_through [:api, :api_auth, :ensure_auth]

    # Auth
    post "/auth/refresh", AuthController, :refresh
    delete "/auth/logout", AuthController, :logout

    # Call logs
    get "/call-logs", CallLogController, :index
    post "/call-logs/sync", CallLogController, :sync
    get "/call-logs/:id", CallLogController, :show
    put "/call-logs/:id", CallLogController, :update

    # Call notes
    post "/call-logs/:call_log_id/notes", CallNoteController, :create
    put "/call-logs/:call_log_id/notes/:id", CallNoteController, :update
    delete "/call-logs/:call_log_id/notes/:id", CallNoteController, :delete

    # Leads
    get "/leads", LeadController, :index
    post "/leads", LeadController, :create
    get "/leads/:id", LeadController, :show
    put "/leads/:id", LeadController, :update
    delete "/leads/:id", LeadController, :delete
    get "/leads/by-phone/:phone", LeadController, :by_phone
    post "/leads/import", LeadController, :import_csv
    put "/leads/:id/stage", LeadController, :update_stage
    put "/leads/:id/reminder", LeadController, :set_reminder
    get "/users", LeadController, :list_users

    # Lead statuses
    get "/lead-statuses", LeadStatusController, :index
    post "/lead-statuses", LeadStatusController, :create
    put "/lead-statuses/:id", LeadStatusController, :update
    delete "/lead-statuses/:id", LeadStatusController, :delete

    # Analytics
    get "/analytics/summary", AnalyticsController, :summary
    get "/analytics/call-trends", AnalyticsController, :call_trends
    get "/analytics/top-contacts", AnalyticsController, :top_contacts
    get "/analytics/never-attended", AnalyticsController, :never_attended
    get "/analytics/not-picked-up", AnalyticsController, :not_picked_up

    # Branches (for counsellor app)
    get "/branches", BranchController, :index

    # Universities (for counsellor app)
    get "/universities", UniversityController, :index

    # Settings
    get "/settings", SettingsController, :show
    put "/settings", SettingsController, :update
    
    # Recording uploads
    post "/recordings/upload", RecordingController, :upload
  end

  # Enable LiveDashboard and Swoosh mailbox preview in development
  if Application.compile_env(:koncall_api, :dev_routes) do
    import Phoenix.LiveDashboard.Router

    scope "/dev" do
      pipe_through :browser

      live_dashboard "/dashboard", metrics: KoncallApiWeb.Telemetry
      forward "/mailbox", Plug.Swoosh.MailboxPreview
    end
  end

  # Helper functions for admin auth
  defp fetch_admin_user(conn, _opts) do
    user_id = get_session(conn, :admin_user_id)

    if user_id do
      user = KoncallApi.Accounts.get_user(user_id)
      assign(conn, :current_user, user)
    else
      assign(conn, :current_user, nil)
    end
  end

  defp require_admin_role(conn, _opts) do
    case conn.assigns[:current_user] do
      %{role: "admin"} -> conn
      _ ->
        conn
        |> Phoenix.Controller.put_flash(:error, "Admin access required")
        |> Phoenix.Controller.redirect(to: "/admin/login")
        |> halt()
    end
  end

  defp require_manager_role(conn, _opts) do
    case conn.assigns[:current_user] do
      %{role: role} when role in ["admin", "branch_manager"] -> conn
      _ ->
        conn
        |> Phoenix.Controller.put_flash(:error, "Please log in to access the dashboard")
        |> Phoenix.Controller.redirect(to: "/admin/login")
        |> halt()
    end
  end
end
