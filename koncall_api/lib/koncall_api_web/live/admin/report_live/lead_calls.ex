defmodule KoncallApiWeb.Admin.ReportLive.LeadCalls do
  use KoncallApiWeb, :live_view
  alias KoncallApi.{CRM, CallTracking}

  @impl true
  def mount(%{"id" => lead_id}, _session, socket) do
    lead = CRM.get_lead!(lead_id)
    call_logs = CallTracking.list_lead_call_logs(lead_id)

    {:ok, assign(socket,
      page_title: "Call History: #{lead.student_name}",
      lead: lead,
      call_logs: call_logs
    )}
  end

  @impl true
  def render(assigns) do
    ~H"""
    <div class="app-layout">
      <%!-- Sidebar Navigation --%>
      <aside id="sidebar" class="sidebar">
        <%!-- Collapse Toggle Button --%>
        <button 
          type="button" 
          class="sidebar-collapse-toggle"
          phx-click={JS.toggle_class("collapsed", to: "#sidebar")}
          title="Toggle sidebar"
        >
          <.icon name="hero-chevron-left" class="w-4 h-4" />
        </button>
        
        <div class="sidebar-header">
          <a href="/admin/dashboard" class="sidebar-logo">
            <div class="sidebar-logo-icon">
              <.icon name="hero-phone" class="w-7 h-7 text-white" />
            </div>
            <div class="flex flex-col">
              <span class="sidebar-logo-title">KonCall CRM</span>
              <span class="sidebar-logo-subtitle">Education Consultancy</span>
            </div>
          </a>
        </div>

        <nav class="sidebar-nav">
          <a href="/admin/dashboard" class="sidebar-nav-item">
            <.icon name="hero-chart-bar" class="sidebar-nav-icon" />
            <span>Dashboard</span>
          </a>
          <a href="/admin/branches" class="sidebar-nav-item">
            <.icon name="hero-building-office" class="sidebar-nav-icon" />
            <span>Branches</span>
          </a>
          <a href="/admin/universities" class="sidebar-nav-item">
            <.icon name="hero-academic-cap" class="sidebar-nav-icon" />
            <span>Universities</span>
          </a>
          <a href="/admin/users" class="sidebar-nav-item">
            <.icon name="hero-users" class="sidebar-nav-icon" />
            <span>Users</span>
          </a>
          <a href="/admin/leads" class="sidebar-nav-item">
            <.icon name="hero-user-group" class="sidebar-nav-icon" />
            <span>Leads</span>
          </a>
          <a href="/admin/reports" class="sidebar-nav-item active">
            <.icon name="hero-document-chart-bar" class="sidebar-nav-icon" />
            <span>Reports</span>
          </a>
        </nav>

        <div class="p-4 border-t-2 border-[var(--color-border-light)]">
          <a href="/admin/logout" class="sidebar-nav-item" style="color: var(--color-error);">
            <.icon name="hero-arrow-right-on-rectangle" class="sidebar-nav-icon" />
            <span>Log out</span>
          </a>
        </div>
      </aside>

      <%!-- Main Content Area --%>
      <div class="main-content">
        <header class="top-header">
          <button onclick="history.back()" class="btn btn-ghost">
            <.icon name="hero-arrow-left" class="w-5 h-5" />
            Back
          </button>
          <div class="flex-1"></div>
        </header>

        <main class="main-content-inner">
          <%!-- Page Header --%>
          <div class="page-header">
            <div class="page-header-content">
              <div class="page-header-icon">
                <.icon name="hero-phone" class="w-8 h-8" style="color: var(--color-primary);" />
              </div>
              <div>
                <h1 class="page-header-title"><%= @lead.student_name %></h1>
                <p class="page-header-subtitle font-data"><%= @lead.phone_number %></p>
              </div>
            </div>
          </div>

          <%!-- Call History Table --%>
          <div class="card">
            <div class="flex items-center justify-between mb-6">
              <h3 class="text-xl font-display font-bold flex items-center gap-2" style="color: var(--color-text-primary);">
                <.icon name="hero-clock" class="w-6 h-6" style="color: var(--color-secondary);" />
                Call History
              </h3>
              <span class="badge badge-primary"><%= length(@call_logs) %> Calls</span>
            </div>

            <div class="overflow-x-auto rounded-xl border-2" style="border-color: var(--color-border-light);">
              <table class="table">
                <thead>
                  <tr>
                    <th>Date & Time</th>
                    <th>Type</th>
                    <th class="text-center">Duration</th>
                    <th>Recording</th>
                  </tr>
                </thead>
                <tbody>
                  <%= if Enum.empty?(@call_logs) do %>
                    <tr>
                      <td colspan="4" class="text-center py-12" style="color: var(--color-text-muted);">
                        No calls found for this lead.
                      </td>
                    </tr>
                  <% else %>
                    <%= for call <- @call_logs do %>
                      <tr>
                        <td>
                          <div class="flex flex-col">
                            <span class="font-semibold"><%= format_date(call.call_datetime) %></span>
                            <span class="text-sm font-data" style="color: var(--color-text-muted);"><%= format_time(call.call_datetime) %></span>
                          </div>
                        </td>
                        <td>
                          <span class={"badge #{call_type_badge(call.call_type)}"}>
                            <%= call_type_icon(call.call_type) %> <%= String.capitalize(call.call_type || "unknown") %>
                          </span>
                        </td>
                        <td class="text-center font-semibold"><%= format_duration(call.duration) %></td>
                        <td>
                          <%= if call.has_recording && call.recording_url do %>
                            <audio controls preload="none" class="h-8 max-w-[200px]">
                              <source src={call.recording_url} type="audio/mpeg" />
                              <source src={call.recording_url} type="audio/mp4" />
                              Your browser does not support audio playback.
                            </audio>
                          <% else %>
                            <span style="color: var(--color-text-muted);">-</span>
                          <% end %>
                        </td>
                      </tr>
                    <% end %>
                  <% end %>
                </tbody>
              </table>
            </div>
          </div>
        </main>
      </div>
    </div>
    """
  end

  defp call_type_badge("incoming"), do: "badge-success"
  defp call_type_badge("outgoing"), do: "badge-info"
  defp call_type_badge("missed"), do: "badge-error"
  defp call_type_badge("rejected"), do: "badge-warning"
  defp call_type_badge(_), do: ""

  defp call_type_icon("incoming"), do: "📞↙"
  defp call_type_icon("outgoing"), do: "📞↗"
  defp call_type_icon("missed"), do: "📞✕"
  defp call_type_icon("rejected"), do: "📞⊘"
  defp call_type_icon(_), do: "📞"

  defp format_duration(nil), do: "-"
  defp format_duration(0), do: "0s"
  defp format_duration(seconds) do
    minutes = div(seconds, 60)
    secs = rem(seconds, 60)
    if minutes > 0, do: "#{minutes}m #{secs}s", else: "#{secs}s"
  end

  defp format_date(nil), do: "-"
  defp format_date(dt) do
    KoncallApiWeb.CoreComponents.format_date_ist(dt)
  end

  defp format_time(nil), do: ""
  defp format_time(dt) do
    KoncallApiWeb.CoreComponents.format_time_ist(dt)
  end
end
