defmodule KoncallApiWeb.Api.LeadController do
  use KoncallApiWeb, :controller

  alias KoncallApi.CRM
  alias KoncallApi.CRM.LeadImport
  alias KoncallApi.Accounts
  alias KoncallApi.Guardian

  action_fallback KoncallApiWeb.FallbackController

  def index(conn, params) do
    # Debug: Log JWT claims to trace token user_id
    require Logger
    claims = Guardian.Plug.current_claims(conn)
    Logger.warning("[LeadController.index] JWT claims user_id: #{claims["user_id"]}, sub: #{claims["sub"]}")
    
    user = get_current_user(conn)
    
    # SECURITY: Always refresh user from DB to get current role
    user = Accounts.get_user!(user.id)
    
    # Debug logging for authorization issues
    Logger.warning("[LeadController.index] Fetched User: #{user.id}, Role: #{inspect(user.role)}, Name: #{user.name}")
    
    leads = 
      case user.role do
        "admin" -> 
          CRM.list_leads(user.organization_id, params)
          
        "branch_manager" ->
          # Managers see leads in their branch (with org scope)
          if user.branch_id do
            CRM.list_branch_leads(user.branch_id, params)
          else
            # Fallback: only show leads assigned to them
            CRM.list_counsellor_leads(user.id, params)
          end
          
        "counsellor" ->
          # Counsellors ONLY see leads assigned to them - strict enforcement
          CRM.list_counsellor_leads(user.id, params)
          
        role ->
          # Log unexpected role and return empty
          Logger.warning("[LeadController.index] Unexpected role: #{inspect(role)} for user #{user.id}")
          []
      end

    render(conn, :index, leads: leads)
  end

  defp get_current_user(conn) do
    case Guardian.Plug.current_resource(conn) do
      %Accounts.User{} = user -> user
      %Accounts.Device{} = device -> Accounts.get_user!(device.user_id)
      nil -> 
        # This should never happen due to EnsureAuth, but handle defensively
        raise "Unauthorized: No authenticated user"
    end
  end

  def create(conn, params) do
    claims = Guardian.Plug.current_claims(conn)
    org_id = claims["org_id"]
    user_id = claims["user_id"]

    attrs = Map.merge(params, %{
      "organization_id" => org_id,
      "created_by" => user_id,
      "assigned_to" => params["assigned_to"] || user_id
    })

    with {:ok, lead} <- CRM.create_lead(attrs) do
      conn
      |> put_status(:created)
      |> render(:show, lead: lead)
    end
  end

  def show(conn, %{"id" => id}) do
    user = get_current_user(conn) |> then(&Accounts.get_user!(&1.id))
    lead = CRM.get_lead!(id, [:status, :assigned_to_user, :call_logs])
    
    with :ok <- authorize_lead_access(user, lead) do
      render(conn, :show, lead: lead)
    end
  end

  def update(conn, %{"id" => id} = params) do
    user = get_current_user(conn) |> then(&Accounts.get_user!(&1.id))
    lead = CRM.get_lead!(id)

    with :ok <- authorize_lead_access(user, lead),
         {:ok, updated} <- CRM.update_lead(lead, params) do
      render(conn, :show, lead: updated)
    end
  end

  def delete(conn, %{"id" => id}) do
    user = get_current_user(conn) |> then(&Accounts.get_user!(&1.id))
    lead = CRM.get_lead!(id)

    with :ok <- authorize_lead_access(user, lead),
         {:ok, _} <- CRM.delete_lead(lead) do
      send_resp(conn, :no_content, "")
    end
  end

  # SECURITY: Authorization helper to prevent IDOR attacks
  defp authorize_lead_access(user, lead) do
    cond do
      # Must be same organization
      lead.organization_id != user.organization_id ->
        {:error, :forbidden}
      
      # Admins can access all leads in their org
      user.role == "admin" ->
        :ok
      
      # Branch managers can access leads in their branch
      user.role == "branch_manager" and lead.branch_id == user.branch_id ->
        :ok
      
      # Counsellors can ONLY access leads assigned to them
      user.role == "counsellor" and lead.assigned_to == user.id ->
        :ok
      
      # Default deny
      true ->
        {:error, :forbidden}
    end
  end

  def by_phone(conn, %{"phone" => phone}) do
    org_id = Guardian.Plug.current_claims(conn)["org_id"]

    case CRM.get_lead_by_phone(org_id, phone) do
      nil -> {:error, :not_found}
      lead -> render(conn, :show, lead: lead)
    end
  end

  @doc """
  Import leads from CSV with round-robin distribution.
  Admin-only action.
  """
  def import_csv(conn, params) do
    claims = Guardian.Plug.current_claims(conn)
    org_id = claims["org_id"]
    user_id = claims["user_id"]
    role = claims["role"]

    # Admin/Manager check
    unless role in ["admin", "manager"] do
      conn
      |> put_status(:forbidden)
      |> json(%{error: "Only admins can import leads"})
      |> halt()
    else
      # Get CSV content - handle both file upload and direct content
      csv_content = get_csv_content(params)
      user_ids = params["user_ids"] || []

      case csv_content do
        nil ->
          conn
          |> put_status(:bad_request)
          |> json(%{error: "No CSV file or content provided"})

        content ->
          case LeadImport.import_csv_with_distribution(org_id, content, user_ids, user_id) do
            {:ok, result} ->
              json(conn, %{
                success: true,
                total: result.total,
                imported: result.imported,
                failed: result.failed,
                errors: result.errors
              })

            {:error, message} ->
              conn
              |> put_status(:unprocessable_entity)
              |> json(%{error: message})
          end
      end
    end
  end

  @doc """
  List users for lead assignment (for admin import UI).
  """
  def list_users(conn, _params) do
    org_id = Guardian.Plug.current_claims(conn)["org_id"]
    users = Accounts.list_users(org_id)
    render(conn, :users, users: users)
  end

  @doc """
  Set or clear a follow-up reminder for a lead.
  PUT /api/leads/:id/reminder
  Body: { "reminder_at": "2024-01-15T10:00:00Z" } or { "reminder_at": null }
  """
  def set_reminder(conn, %{"id" => id} = params) do
    lead = CRM.get_lead!(id)
    
    reminder_at = case params["reminder_at"] do
      nil -> nil
      "" -> nil
      datetime_string -> 
        case DateTime.from_iso8601(datetime_string) do
          {:ok, dt, _offset} -> DateTime.truncate(dt, :second)
          _ -> nil
        end
    end
    
    with {:ok, updated} <- CRM.update_lead(lead, %{"reminder_at" => reminder_at}) do
      render(conn, :show, lead: updated)
    end
  end

  # Private helpers

  defp get_csv_content(%{"file" => %Plug.Upload{path: path}}) do
    File.read!(path)
  end

  defp get_csv_content(%{"csv_content" => content}) when is_binary(content) do
    content
  end

  defp get_csv_content(_), do: nil
end

