# KonCall Android - Known Edge Cases & Technical Debt

This document tracks known edge cases and issues to be fixed in phases.

---

## Phase 1 - Critical ✅ COMPLETED

### 1.1 Token Refresh ✅
- **File**: `TokenAuthenticator.kt`, `TokenManager.kt`, `NetworkModule.kt`
- **Fix**: Implemented `okhttp3.Authenticator` with automatic token refresh on 401
- **Details**: Thread-safe refresh with in-memory token cache

### 1.2 Auto-Start Permission Prompt ✅
- **File**: `BatteryOptimizationHelper.kt`, `MainActivity.kt`
- **Fix**: Detects aggressive OEMs (Xiaomi, Huawei, OPPO, etc.) and shows dialog with instructions
- **Details**: One-time prompt on first login, opens OEM-specific auto-start settings

---

## Phase 2 - High Priority ✅ COMPLETED

### ~~2.1 Dual SIM Concurrent Calls~~ - NOT NEEDED
- User confirmed: Only leads with known phone numbers are tracked
- India market primarily single-SIM usage for business calls

### ~~2.2 SD Card Recording Paths~~ - NOT NEEDED
- User confirmed: No one uses external SD card storage

### 2.3 Battery Whitelist Prompt ✅
- **Already completed in Phase 1** as item 1.2 (Auto-Start Permission Prompt)
- Covered by `BatteryOptimizationHelper.kt`

---

## Phase 3 - Medium Priority ✅ COMPLETED

### 3.1 Multiple Leads with Same Phone ✅
- **File**: `LeadDao.kt`
- **Fix**: Added `ORDER BY updatedAt DESC` to return most recently updated lead
- **Details**: Consistent behavior - always returns the lead with latest activity

### 3.2 Logout During Active Sync ✅
- **File**: `AuthRepository.kt`
- **Fix**: Added `WorkManager.cancelAllWork()` before clearing auth
- **Details**: Prevents orphan sync jobs from failing with 401 after logout

---

## Phase 4 - Low Priority

### 4.1 Call Waiting / Conference Call Detection - DEFERRED
- **Issue**: State machine doesn't handle multiple OFFHOOK states
- **Effort**: High (may not be reliably detectable)

### 4.2 VoIP Call Tracking (WhatsApp, etc.) - DEFERRED
- **Issue**: TelephonyManager doesn't receive VoIP calls
- **Effort**: Very High (requires AccessibilityService)

### 4.3 IST Timezone Display ✅
- **File**: `core_components.ex` (Phoenix backend)
- **Fix**: Added helpers: `format_datetime_ist/1`, `format_date_ist/1`, `format_time_ist/1`
- **Details**: Converts UTC to IST (UTC+5:30) for admin panel display

---

## Completed ✅

- [x] Static state in PhoneStateReceiver → CallStateTracker singleton
- [x] onTaskRemoved for OEM resilience
- [x] API retry with exponential backoff
- [x] Lead sync pagination
- [x] In-memory token cache (AuthInterceptor blocking fix)
- [x] AppCallTracker cleanup method
- [x] Code deduplication (mapCallType, extractSimSlot)
- [x] Removed unused scheduleRecordingUpload()

---

## Notes

- Recording-to-call matching uses `usedRecordings` set to prevent double-matching ✅
- Quick calls (<1 second) are intentionally skipped (no recording exists) ✅
- 17 OEM recording paths covered + recursive fallback search ✅

---

*Last Updated: 2026-01-07*
