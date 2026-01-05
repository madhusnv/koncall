# Callyzer Call Recording Implementation Analysis

## Executive Summary

**Critical Finding**: Callyzer **does NOT record calls itself**. Instead, it **finds and syncs recordings** created by other call recording apps (typically the phone's native dialer app).

This is a significant insight because it means Callyzer sidesteps Android's increasingly restrictive call recording policies by relying on OEM-specific dialers that have system-level privileges.

---

## Architecture Overview

```
┌─────────────────────────────────────────────────────────────────────────────┐
│                           Phone Dialer (OEM)                                 │
│  ┌────────────────────┐         ┌─────────────────────────────────────┐     │
│  │ Native Dialer App  │────────▶│ Recording Files on Storage          │     │
│  │ (Samsung/Xiaomi/   │         │ e.g., /Recordings/Call/             │     │
│  │  OnePlus/etc.)     │         └─────────────────────────────────────┘     │
│  └────────────────────┘                          │                          │
└──────────────────────────────────────────────────│──────────────────────────┘
                                                   │
                                    User grants SAF access
                                                   │
                                                   ▼
┌─────────────────────────────────────────────────────────────────────────────┐
│                             Callyzer App                                     │
│                                                                              │
│  ┌──────────────────────┐                                                   │
│  │  CallMonitorService  │ ◀── ContentObserver on CallLog.Calls             │
│  │  (Foreground Service)│                                                   │
│  └──────────┬───────────┘                                                   │
│             │ Detect Call Ended                                             │
│             ▼                                                                │
│  ┌──────────────────────┐     ┌─────────────────────────────┐              │
│  │ RecordingFindManager │────▶│ Scan Recording Paths        │              │
│  │ (WorkManager)        │     │ via SAF/DocumentsContract   │              │
│  └──────────────────────┘     └──────────────┬──────────────┘              │
│                                              │                              │
│             ┌────────────────────────────────┘                              │
│             │ Match by: filename (phone#) + timestamp                       │
│             ▼                                                                │
│  ┌──────────────────────┐                                                   │
│  │ Link Recording to    │                                                   │
│  │ Call Log Entry       │                                                   │
│  └──────────┬───────────┘                                                   │
│             │                                                                │
│             ▼                                                                │
│  ┌──────────────────────┐     ┌─────────────────────────────┐              │
│  │RecordingCompressManager│──▶│ FFmpegKit                   │              │
│  │ (WorkManager)        │     │ -acodec libmp3lame          │              │
│  └──────────┬───────────┘     │ -ar 22050 -b:a 32k          │              │
│             │                 └─────────────────────────────┘              │
│             ▼                                                                │
│  ┌──────────────────────┐     ┌─────────────────────────────┐              │
│  │RecordingUploadManager│────▶│ AWS Amplify (S3)            │              │
│  │ (WorkManager)        │     │ Cloud Storage               │              │
│  └──────────────────────┘     └─────────────────────────────┘              │
│                                                                              │
└─────────────────────────────────────────────────────────────────────────────┘
```

---

## Key Components

### 1. Call Monitoring Service

**File**: `callyzer_decompile/output/sources/com/websoptimization/callyzerbiz/services/CallMonitorService.java`

```java
// Registers a ContentObserver on the system call log
ContentResolver contentResolver = getContentResolver();
Uri uri = CallLog.Calls.CONTENT_URI;
contentResolver.registerContentObserver(uri, true, callLogObserver);
```

- Runs as a **foreground service** with `specialUse` type
- Listens for changes to the system call log
- Triggers recording discovery after each call ends
- Special handling for Tecno devices (brand-specific logic)

### 2. Recording Discovery Engine

**File**: `callyzer_decompile/output/sources/rn/q0.java` (FindCallRecordingUseCase)

This is the **core intelligence** of the app:

#### How It Finds Recordings

1. **Server-Suggested Paths**: Gets recording folder suggestions based on device model, brand, Android version, and dialer package name from their backend

2. **SAF (Storage Access Framework) Access**:
   ```java
   Uri uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(uri, ...);
   getContentResolver().query(uri, 
       new String[]{"document_id", "_display_name", "last_modified", "_size", "mime_type"}, 
       null, null, null);
   ```

3. **Filename Pattern Matching**:
   ```java
   // Matching logic in m12653w
   // Checks if recording filename contains:
   // - Phone number (with various formats: spaces, dashes removed)
   // - Contact name
   // - Handles emojis in contact names (has regex to strip emojis)
   // - Timestamp proximity check (within 5 seconds of call end)
   ```

4. **Time-Based Matching**:
   ```java
   // Last modified time of file must be >= call end time
   if (fileModifiedTime >= callEndTime + 5000) { // 5 second tolerance
       // Match found
   }
   ```

### 3. Path Suggestion System

**File**: `callyzer_decompile/output/sources/com/websoptimization/callyzerbiz/data/model/request/CallRecordingPathSuggestionRequest.java`

The app sends device info to get recording paths:
```java
public CallRecordingPathSuggestionRequest(
    C4802m userSimDetail,
    String deviceModel,      // e.g., "SM-A525F"
    String androidVersion,   // e.g., "13"
    String deviceBrand,      // e.g., "samsung"
    String dialerPackageName // e.g., "com.samsung.android.dialer"
)
```

**Common recording paths by OEM:**

| OEM | Typical Recording Path |
|-----|----------------------|
| Samsung | `/Recordings/Call/` |
| Xiaomi | `/MIUI/sound_recorder/call_rec/` |
| OnePlus | `/Recordings/` |
| OPPO | `/Recordings/Call Recordings/` |
| Vivo | `/Recording/Call/` |
| Realme | `/Recordings/Call Recordings/` |

### 4. Recording Compression

**File**: `callyzer_decompile/output/sources/com/websoptimization/callyzerbiz/workManager/RecordingCompressManager.java`

Uses **FFmpegKit** to compress recordings before upload:
```java
String command = "-i " + inputPath + 
                 " -vn -ar 22050 -acodec libmp3lame -b:a " + bitrate + "k " + 
                 outputPath;
FFmpegKit.execute(command);
```

- Converts to MP3 with 22050 Hz sample rate
- Default bitrate: 32 kbps (configurable per call)
- Rejects files larger than a threshold (LARGE_SIZE status)
- Retry logic for failed compressions (up to 3 times)

### 5. Cloud Upload

**File**: `callyzer_decompile/output/sources/com/websoptimization/callyzerbiz/workManager/RecordingUploadManager.java`

Uses **AWS Amplify Storage** (S3) for cloud uploads with:
- Resume capability for failed uploads
- Network state monitoring
- Retry logic
- Deletes corrupt compressed files automatically

---

## Permissions Analysis

From `callyzer_decompile/output/resources/AndroidManifest.xml`:

### Essential Permissions

| Permission | Purpose |
|-----------|---------|
| `READ_CALL_LOG` | Access call history to match recordings |
| `READ_PHONE_STATE` | Detect call start/end events |
| `READ_MEDIA_AUDIO` | Access audio files (Android 13+) |
| `READ_EXTERNAL_STORAGE` | Legacy storage access (< Android 13) |
| `FOREGROUND_SERVICE` | Run background services |
| `FOREGROUND_SERVICE_DATA_SYNC` | Sync service type |
| `FOREGROUND_SERVICE_SPECIAL_USE` | Call monitoring |
| `FOREGROUND_SERVICE_MEDIA_PROCESSING` | FFmpeg compression |
| `POST_NOTIFICATIONS` | Show sync progress |
| `RECEIVE_BOOT_COMPLETED` | Auto-start on boot |
| `REQUEST_IGNORE_BATTERY_OPTIMIZATIONS` | Prevent doze mode issues |

### Interesting Permission
```xml
<uses-permission android:name="android.permission.RECORD_AUDIO"/>
```
Despite having `RECORD_AUDIO`, the app doesn't appear to use `MediaRecorder` or `AudioRecord` for call recording directly. This permission may be for:
- Voice notes feature
- Future functionality
- Placeholder

### Queried Packages (OEM-specific)
```xml
<package android:name="com.miui.securitycenter"/>
<package android:name="com.huawei.systemmanager"/>
<package android:name="com.coloros.safecenter"/>
<package android:name="com.oppo.safe"/>
<package android:name="com.vivo.permissionmanager"/>
```
Used to guide users through OEM-specific battery optimization and permission settings.

---

## Data Models

### SyncCallLogCallRecording

**File**: `callyzer_decompile/output/sources/com/websoptimization/callyzerbiz/data/model/db/SyncCallLogCallRecording.java`

```java
public final class SyncCallLogCallRecording {
    String number;              // Phone number
    String simNumber;           // SIM card identifier
    int countryCode;            // Country code
    EnumC8994d callType;        // INCOMING, OUTGOING
    String dateTime;            // Call timestamp
    long duration;              // Call duration in seconds
    EnumC8993c callRecordingSyncStatus; // NOT_FOUND, SUCCESS, LARGE_SIZE
    String localPath;           // Path on device (source)
    String compressedPath;      // Path after compression
    String webPath;             // Cloud URL after upload
    String fileId;              // Cloud file identifier
    String companyCode;         // Enterprise code
}
```

### Sync Status Enum
```java
enum EnumC8993c {
    NOT_FOUND,      // Recording not found yet
    SUCCESS,        // Successfully synced
    LARGE_SIZE,     // File too large to upload
    // ... potentially others
}
```

### Recording Match Info (C4122b)
```java
// Document info from SAF query
String documentId;   // f21063a
String displayName;  // f21064b - filename (key for matching!)
long lastModified;   // f21065c - file modified timestamp
long fileSize;       // f21066d
String mimeType;     // f21067e
```

---

## Database Queries

The app uses Room database with custom SQL queries to find unsynced recordings:

```sql
SELECT MIN(date_time) FROM CallLog T1 
LEFT JOIN UserSimDetails S1 ON S1.sim_number = T1.sim_number 
WHERE T1.call_type IN (OUTGOING, INCOMING) 
  AND T1.duration > 0 
  AND S1.is_call_recording = 1
  AND T1.date_time BETWEEN S1.call_recording_subscription_start_time 
                       AND S1.call_recording_subscription_end_time 
  AND (T1.call_record_sync_status IS NULL OR T1.call_record_sync_status='')
  AND ((T1.call_record_source_path IS NULL OR T1.call_record_source_path='') 
       OR (T1.call_record_compress_path IS NULL OR T1.call_record_compress_path=''))
```

This query finds the earliest call that:
- Has duration > 0 (completed call)
- Is within the user's subscription period
- Hasn't been synced yet
- Doesn't have a recording path set

---

## Technology Stack

| Component | Technology |
|-----------|------------|
| Language | Kotlin (decompiled to Java) |
| UI | Jetpack Compose |
| Async | Kotlin Coroutines + Flow |
| Background | WorkManager |
| Database | Room |
| Networking | Retrofit + OkHttp |
| Cloud Storage | AWS Amplify + S3 |
| Media Processing | FFmpegKit (libmp3lame) |
| Analytics | Firebase Crashlytics + Analytics |
| Push | Firebase Cloud Messaging |
| Image Loading | Coil |
| Barcode | ML Kit Barcode Scanning |
| Auth | AWS Cognito |

---

## Broadcast Receivers

### PhoneStateReceiver
```xml
<receiver android:name=".broadcastReceivers.PhoneStateReceiver"
          android:priority="2147483647">  <!-- MAX priority! -->
    <intent-filter>
        <action android:name="android.intent.action.PHONE_STATE"/>
    </intent-filter>
</receiver>
```
Listens for call state changes (ringing, offhook, idle).

### SimStatesChangedReceiver
Detects SIM changes for dual-SIM tracking.

### RebootReceiver
Auto-starts services after device reboot.

---

## How the Matching Algorithm Works

### Step 1: Get Call Info
```java
// From call log
String phoneNumber = "9876543210";
String contactName = "John Doe";
long callEndTime = 1704441234567L; // Epoch ms
```

### Step 2: Scan Recording Folder
```java
// Query via SAF
Cursor cursor = contentResolver.query(recordingFolderUri, ...);
while (cursor.moveToNext()) {
    String filename = cursor.getString("_display_name");
    long lastModified = cursor.getLong("last_modified");
    // ...
}
```

### Step 3: Match by Filename
```java
// Filename patterns that match:
// "9876543210_20240105_123456.mp3"     ✓ (contains phone number)
// "John Doe_incoming_20240105.mp3"     ✓ (contains contact name)
// "Call_9876543210.m4a"                ✓ (contains phone number)
// "recording_123.mp3"                   ✗ (no identifiable info)
```

### Step 4: Validate Timestamp
```java
// File must be created AFTER call ended (with tolerance)
if (fileLastModified >= callEndTime - 5000 && 
    fileLastModified <= callEndTime + 60000) {
    // Valid match
}
```

### Step 5: Handle Edge Cases
- Emojis in contact names (regex removal)
- Spaces/dashes in phone numbers (normalization)
- Different phone number formats (+91 vs 91 vs local)

---

## Implications for KonCall

### What This Means

1. **You cannot directly record calls** on modern Android (10+) without system privileges
2. **Callyzer's approach**: Rely on the OEM dialer to record, then find and sync those recordings
3. **This requires**:
   - User to enable call recording in their phone's dialer
   - User to grant SAF access to the recording folder
   - Device-specific path knowledge

### Alternative Approaches

| Approach | Feasibility | Notes |
|----------|-------------|-------|
| OEM Dialer Recording + Finder (Callyzer's method) | ✅ Works | Requires user setup |
| `CAPTURE_AUDIO_OUTPUT` permission | ❌ System only | Requires system signature |
| Accessibility Service | ⚠️ Unreliable | Against Play Store policies |
| Root/Magisk Module | ⚠️ Niche | Very limited user base |
| VoIP Recording | ✅ Works | Only for VoIP calls |
| Server-Side Recording | ✅ Works | For calls routed through your infra |

### Recommended Path for KonCall

If your goal is call recording sync similar to Callyzer:

1. **Detect calls** via `PhoneStateListener` or call log ContentObserver
2. **Guide users** to enable call recording in their native dialer
3. **Request SAF access** to the recording folder (use Intent.ACTION_OPEN_DOCUMENT_TREE)
4. **Build a path database** for common OEM recording locations
5. **Scan and match** recordings by:
   - Filename containing phone number (with number normalization)
   - File timestamp matching call end time (±30-60 seconds)
6. **Store the link** between call log entry and recording file
7. **Upload/sync** matched recordings as needed

---

## Key Files Reference

| File | Purpose |
|------|---------|
| `services/CallMonitorService.java` | Foreground service for call detection |
| `rn/q0.java` (FindCallRecordingUseCase) | Core recording discovery logic |
| `rn/h0.java` (CallRecordingUseCase) | Recording management operations |
| `workManager/RecordingCompressManager.java` | FFmpeg compression |
| `workManager/RecordingUploadManager.java` | AWS S3 upload |
| `workManager/RecordingFindManager.java` | WorkManager wrapper |
| `broadcastReceivers/PhoneStateReceiver.java` | Call state detection |
| `data/model/db/SyncCallLogCallRecording.java` | Recording data model |
| `resources/AndroidManifest.xml` | Permissions and components |

---

## Conclusion

Callyzer's "call recording" feature is actually a **call recording finder and syncer**. It ingeniously works around Android's restrictions by:

1. **Leveraging OEM dialers** that have system-level recording permissions
2. **Using SAF** to access recordings without needing broad storage permissions
3. **Building a comprehensive path suggestion database** based on device characteristics
4. **Matching recordings to calls** through filename and timestamp analysis
5. **Compressing with FFmpeg** for efficient cloud storage
6. **Syncing to AWS S3** for cloud backup

This approach is compliant with Google Play policies because the app itself doesn't record calls—it just syncs recordings made by the system dialer.

---

## Next Steps for Implementation

1. **Create a RecordingFinderService** that:
   - Watches for call log changes
   - Scans configured recording folders
   - Matches recordings by phone number + timestamp

2. **Build a PathConfigurationScreen** that:
   - Asks user to select their recording folder via SAF
   - Stores the granted URI permission persistently

3. **Implement filename parsing** for common formats:
   - `PhoneNumber_DateTime.ext`
   - `ContactName_CallType_DateTime.ext`
   - `DateTime_PhoneNumber.ext`

4. **Add FFmpeg for compression** (optional, for cloud sync):
   - Use `mobile-ffmpeg` or `ffmpeg-kit`
   - Target 32-64 kbps MP3 for voice

5. **Store recording metadata** in your Room database:
   - Link call log entries to recording file URIs
   - Track sync status
