# Education Consultancy CRM - Implementation Plan

Transform KonCall into a full-fledged CRM for an education consultancy with multiple branches, counsellors, and university partnerships.

## User Review Required

> **IMPORTANT**: This plan includes database schema changes that will require migrations. Existing data will need migration scripts.

> **WARNING**: The current system tracks ALL calls. The new system will ONLY track calls made via the app's "Call" button. This is a fundamental change to the call tracking logic.

---

## Business Model Overview

```
Admin
  └── Organization
        └── Branches (multiple)
              ├── Branch Manager
              └── Counsellors
                    ├── Assigned to Universities
                    └── Handle Leads (end-to-end)

Lead Flow:
CSV Import → New → Contacted → Interested → Application Submitted → Documents Collected → Enrolled → Joined
```

---

## Proposed Changes

### Phase 1: Database Schema Updates

---

#### Phoenix Backend - New Schemas

##### [NEW] Branch Schema
**File**: `lib/koncall_api/accounts/branch.ex`

```elixir
schema "branches" do
  field :name, :string
  field :location, :string
  field :is_active, :boolean, default: true
  
  belongs_to :organization, Organization
  belongs_to :manager, User  # Branch manager
  has_many :users, User
  has_many :leads, Lead
  
  timestamps()
end
```

##### [NEW] University Schema
**File**: `lib/koncall_api/crm/university.ex`

```elixir
schema "universities" do
  field :name, :string
  field :short_code, :string  # e.g., "UNI1"
  field :is_active, :boolean, default: true
  
  belongs_to :organization, Organization
  has_many :counsellor_assignments, CounsellorUniversity
  has_many :leads, Lead
  
  timestamps()
end
```

##### [NEW] CounsellorUniversity (Join Table)
**File**: `lib/koncall_api/crm/counsellor_university.ex`

```elixir
schema "counsellor_universities" do
  belongs_to :user, User
  belongs_to :university, University
  
  timestamps()
end
```

---

##### [MODIFY] User Schema Updates
**File**: `lib/koncall_api/accounts/user.ex`

Add fields:
```elixir
belongs_to :branch, Branch
has_many :university_assignments, CounsellorUniversity
has_many :universities, through: [:university_assignments, :university]
```

Roles update: `admin`, `branch_manager`, `counsellor`

---

##### [MODIFY] Lead Schema Updates
**File**: `lib/koncall_api/crm/lead.ex`

Add fields:
```elixir
belongs_to :branch, Branch
belongs_to :university, University  # University of interest
field :student_name, :string  # Simplified from first_name/last_name
```

Update status enum:
```elixir
@lead_stages ~w(new contacted interested application_submitted documents_collected enrolled joined)
```

---

##### [MODIFY] CallLog Schema Updates  
**File**: `lib/koncall_api/call_tracking/call_log.ex`

Add field:
```elixir
field :app_initiated, :boolean, default: true  # Only app-initiated calls stored
```

---

### Phase 2: Android App Changes

---

#### [MODIFY] Call Tracking - App-Initiated Only

##### Changes to CallMonitorService.kt

```diff
- Currently: Observes ALL calls from system CallLog
+ New: Only tracks calls initiated via app's "Call" button
```

**New Flow**:
1. User taps "Call" button on lead profile
2. App stores a pending call record with `lead_id`, `phone_number`, timestamp
3. App initiates call via `Intent.ACTION_CALL`
4. `PhoneStateReceiver` detects call end
5. Match duration from system by phone number + time window
6. Update pending call with actual duration
7. Sync to backend

##### [NEW] AppCallTracker.kt
**File**: `app/src/main/java/com/koncall/app/service/AppCallTracker.kt`

Manages pending calls initiated from app:
- `startTracking(leadId, phoneNumber)` - Called before initiating call
- `completeTracking(phoneNumber, duration)` - Called when call ends
- Stores to Room, syncs to backend

---

##### [MODIFY] Lead Detail Screen

Add "Call" button that:
1. Calls `AppCallTracker.startTracking()`
2. Opens dialer with `ACTION_CALL`
3. Tracks call duration automatically

---

##### [MODIFY] Lead Entity Updates

Add fields:
```kotlin
val branchId: String?,
val universityId: String?,
val studentName: String,
val stage: String  // new, contacted, interested, etc.
```

---

##### [NEW] Follow-up Notifications

- WorkManager scheduled job to check `reminder_at`
- Push notification to counsellor for due follow-ups
- Notification channels for Android 8+

---

### Phase 3: Role-Based Access Control

---

#### Permission Matrix

| Feature | Admin | Branch Manager | Counsellor |
|---------|-------|----------------|------------|
| View all branches | ✅ | ❌ | ❌ |
| View own branch leads | ✅ | ✅ | ❌ |
| View assigned leads only | ✅ | ✅ | ✅ |
| Import CSV | ✅ | ✅ | ❌ |
| Create/Edit Universities | ✅ | ❌ | ❌ |
| Assign Counsellors to Universities | ✅ | ❌ | ❌ |
| View all reports | ✅ | Branch only | Own only |
| Make calls | ❌ | ❌ | ✅ |

---

#### Backend Implementation

##### [MODIFY] Router - Add role-based scopes

```elixir
# Admin-only routes
scope "/api/admin", KoncallApiWeb.Api.Admin do
  pipe_through [:api, :api_auth, :ensure_admin]
  
  resources "/branches", BranchController
  resources "/universities", UniversityController
  get "/reports/organization", ReportController, :organization
end

# Branch manager routes
scope "/api/manager", KoncallApiWeb.Api.Manager do
  pipe_through [:api, :api_auth, :ensure_manager]
  
  post "/leads/import", LeadController, :import_csv
  get "/reports/branch", ReportController, :branch
end
```

##### [NEW] Authorization Plugs

- `EnsureAdmin` - Checks `role == "admin"`
- `EnsureManager` - Checks `role in ["admin", "branch_manager"]`
- `EnsureBranchAccess` - Validates user can access branch resources

---

### Phase 4: Reports & Analytics

---

#### New Report Endpoints

##### Counsellor Performance
```
GET /api/reports/counsellor/:id
- Total calls made (via app)
- Total talk time
- Leads by stage (conversion funnel)
- Follow-ups completed
```

##### Branch Metrics
```
GET /api/reports/branch/:id
- All counsellors performance
- Lead count by stage
- Conversion rate
- University-wise distribution
```

##### Organization Overview (Admin)
```
GET /api/reports/organization
- All branches comparison
- Top performing counsellors
- University-wise enrollments
- Lead source analysis
```

---

### Phase 5: Migrations

---

#### [NEW] Migration Files

1. `create_branches.exs`
   - Create branches table
   - Add `branch_id` to users
   - Add `manager_id` to branches

2. `create_universities.exs`
   - Create universities table
   - Create counsellor_universities join table
   - Add `university_id` to leads

3. `update_leads_for_crm.exs`
   - Add `student_name` field
   - Update status enum values
   - Add branch_id foreign key

4. `update_call_logs_app_initiated.exs`
   - Add `app_initiated` boolean field
   - Default true for new records

---

## Verification Plan

### Automated Tests

1. **Unit Tests**:
   - Branch CRUD operations
   - University assignment logic
   - Role-based access control
   - App-initiated call tracking

2. **Integration Tests**:
   - CSV import with branch assignment
   - Call flow: app button → tracking → sync
   - Follow-up notification scheduling

### Manual Verification

1. **End-to-End Flow**:
   - Admin creates branch + university
   - Branch manager imports CSV
   - Counsellor logs in, sees assigned leads
   - Counsellor makes call via app button
   - Call duration tracked and synced
   - Lead stage updated
   - Branch manager views reports

2. **Notification Testing**:
   - Set follow-up reminder
   - Verify push notification received

---

## Implementation Order

1. **Backend Schema Changes** (Migrations + Contexts)
2. **Role-Based Access Control** (Router + Plugs)
3. **Android: App-Initiated Call Tracking** (New flow)
4. **Android: Updated Lead UI** (Stages, Call button)
5. **Follow-up Notifications** (WorkManager + Push)
6. **Reports & Analytics** (New endpoints + Views)
7. **Admin Web Dashboard** (LiveView for management)

---

## Open Questions

1. Should the **web admin dashboard** be a priority, or is everything done via API/mobile?
2. For **4 universities** - should I seed them initially, or should admin create them?
3. **FCM Push Notifications** - Do you have Firebase set up, or should we use a simpler local notification approach first?
