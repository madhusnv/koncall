# Salesmax Call Recording Implementation Analysis

## Executive Summary

**Critical Finding**: Salesmax, like Callyzer, **does NOT directly record phone calls**. Instead, it:
1. **Finds recordings** created by the device's OEM dialer via MediaStore or user-selected folder (SAF)
2. **Matches recordings to calls** based on timestamp proximity (within 10 seconds)
3. **Syncs recordings to cloud** (AWS Amplify/S3)

The `MediaRecorder` usage found in the code is **only for voice notes** (manual user recordings), not for automatic call recording.

---

## Architecture Overview

```
┌─────────────────────────────────────────────────────────────────────────────┐
│                           Phone Dialer (OEM)                                 │
│  ┌────────────────────┐         ┌─────────────────────────────────────┐     │
│  │ Native Dialer App  │────────▶│ Recording Files on Storage          │     │
│  │ (Samsung/Xiaomi/   │         │ Usually in /Recordings/Call/        │     │
│  │  OnePlus/etc.)     │         └─────────────────────────────────────┘     │
│  └────────────────────┘                          │                          │
└──────────────────────────────────────────────────│──────────────────────────┘
                                                   │
                                    User grants SAF access OR
                                    MediaStore audio permission
                                                   │
                                                   ▼
┌─────────────────────────────────────────────────────────────────────────────┐
│                            Salesmax App                                      │
│                                                                              │
│  ┌──────────────────────────┐                                               │
│  │  CallStateManagerService │ ◀── Listens for PHONE_STATE broadcasts        │
│  │  (Foreground Service)    │                                               │
│  └──────────┬───────────────┘                                               │
│             │ Call ended event                                              │
│             ▼                                                                │
│  ┌──────────────────────────┐     ┌─────────────────────────────────┐      │
│  │  RecordingReconWorker    │────▶│ Search for recordings:          │      │
│  │  (WorkManager)           │     │ 1. MediaStore.Audio (API 30+)   │      │
│  │                          │     │ 2. SAF folder (user selected)   │      │
│  │                          │     │ 3. File system path             │      │
│  └──────────────────────────┘     └──────────────┬──────────────────┘      │
│                                                  │                          │
│             ┌────────────────────────────────────┘                          │
│             │ Match by: timestamp proximity (±10 seconds)                   │
│             ▼                                                                │
│  ┌────────────────────────────┐                                             │
│  │ Link CallRecording (rz1)   │                                             │
│  │ to CallEngagement          │                                             │
│  └──────────┬─────────────────┘                                             │
│             │                                                                │
│             ▼                                                                │
│  ┌────────────────────────────┐       ┌─────────────────────────────┐      │
│  │ Upload to Backend          │──────▶│ AWS Amplify DataStore       │      │
│  │ (GraphQL Sync)             │       │ + S3 Storage                │      │
│  └────────────────────────────┘       └─────────────────────────────┘      │
│                                                                              │
└─────────────────────────────────────────────────────────────────────────────┘
```

---

## Key Components

### 1. CallRecording Data Model (`rz1.java`)

```java
// CallRecording class (deobfuscated from rz1)
public final class CallRecording {
    String id;           // f44271a - Unique identifier (file path or media store ID)
    Uri uri;             // f44272b - Content URI for the file
    String fileName;     // f44273c - Display name of the file
    String filePath;     // f44274d - Absolute path to the file
    Long dateAdded;      // f44275e - When file was added (milliseconds)
    Long dateModified;   // f44276f - When file was modified
    String mimeType;     // f44277g - Audio MIME type (audio/mpeg, etc.)
    String relativePath; // f44278h - Relative path in storage
    Context context;     // f44279i - Android context
}
```

### 2. Recording Finder (`wz6.java`)

This class scans for call recordings in two ways:

#### Method 1: File System Scan (for older Android versions)
```java
public Set<CallRecording> findRecordings(Context context, String path, long start, long end) {
    File folder = new File(path);
    if (!folder.isDirectory()) return emptySet();
    
    return folder.listFiles()
        .filter(f -> f.isFile() && !isHidden(f))
        .filter(f -> f.lastModified() >= start && f.lastModified() <= end)
        .map(f -> new CallRecording.Builder()
            .id(f.getAbsolutePath())
            .uri(Uri.fromFile(f))
            .fileName(f.getName())
            .filePath(f.getAbsolutePath())
            .dateAdded(f.lastModified())
            .dateModified(f.lastModified())
            .mimeType(getMimeType(context, f))
            .build()
        );
}
```

#### Method 2: SAF Document Tree (for user-selected folders)
```java
public Set<CallRecording> findRecordingsInTree(DocumentFile tree, long start, long end) {
    List<DocumentFile> files = getAllFiles(tree);
    
    return files.stream()
        .filter(f -> f.isFile() && !f.getName().startsWith("."))
        .filter(f -> f.lastModified() >= start && f.lastModified() <= end)
        .map(f -> convertToCallRecording(f))
        .collect(toSet());
}
```

### 3. Recording Reconciliation Worker (`RecordingReconWorker.java`)

This is the **core matching logic**:

```java
// Simplified logic from RecordingReconWorker
public Result doWork() {
    // Get time window for search
    long start = inputData.getLong("start", System.currentTimeMillis());
    long end = inputData.getLong("end", System.currentTimeMillis() - 300000); // 5 min ago
    
    // Get user's recording storage preference
    Uri storageUri = prefs.getCallRecordingStorageUri();
    String storagePath = prefs.getCallRecordingStoragePath();
    
    // Find recordings based on Android version
    List<CallRecording> recordings;
    if (Build.VERSION.SDK_INT >= 30) {
        // Use MediaStore for Android 11+
        recordings = findFromMediaStore(context, start, end);
        
        // Also check SAF folder if configured
        if (storageUri != null) {
            List<CallRecording> safRecordings = findFromSAF(storageUri, start, end);
            recordings.addAll(safRecordings);
        }
    } else {
        // Use file system for older Android
        recordings = findFromFileSystem(storagePath, start, end);
    }
    
    // Get call engagements that need recording
    List<CallEngagement> callsNeedingRecording = getCallsWithoutRecording();
    
    // Match recordings to calls by timestamp
    for (CallRecording recording : recordings) {
        CallEngagement match = findMatchingCall(recording, callsNeedingRecording);
        if (match != null && isTimestampClose(recording, match, 10000)) { // 10 sec tolerance
            match.setCallRecording(recording);
            uploadRecording(match);
        }
    }
    
    return Result.success();
}

private boolean isTimestampClose(CallRecording recording, CallEngagement call, long tolerance) {
    long recordingTime = recording.getDateAdded();
    long callEndTime = call.getCallEndTime();
    return Math.abs(recordingTime - callEndTime) <= tolerance;
}
```

### 4. MediaStore Query for Recordings (`h4e.java`)

```java
// Query MediaStore for audio files
public CallRecording findClosestRecording(Context context, long callEndTime) {
    Cursor cursor = context.getContentResolver().query(
        MediaStore.Audio.Media.EXTERNAL_CONTENT_URI,
        new String[]{"_id", "_display_name", "_data", "date_added", "date_modified", 
                     "mime_type", "relative_path"},
        "date_added >= ?",
        new String[]{String.valueOf(callEndTime / 1000)}, // MediaStore uses seconds
        "date_added ASC"  // Get earliest after call end
    );
    
    if (cursor != null && cursor.moveToFirst()) {
        return buildRecordingFromCursor(cursor);
    }
    return null;
}

// Get all recordings in a time window
public List<CallRecording> findRecordingsInRange(Context context, long start, long end) {
    Cursor cursor = context.getContentResolver().query(
        MediaStore.Audio.Media.EXTERNAL_CONTENT_URI,
        projection,
        "date_added >= ? and date_added <= ?",
        new String[]{String.valueOf(start / 1000), String.valueOf(end / 1000)},
        "date_added DESC"
    );
    // ... process cursor
}
```

### 5. Voice Notes (NOT Call Recording!)

The `RecordingDialogFragment` uses `MediaRecorder` for **manual voice notes only**:

```java
// This is for VOICE NOTES, not call recording!
MediaRecorder mediaRecorder = new MediaRecorder();
mediaRecorder.setAudioSource(1);  // MIC (not VOICE_CALL!)
mediaRecorder.setOutputFormat(2); // MPEG_4
mediaRecorder.setAudioEncoder(3); // AAC
mediaRecorder.setAudioEncodingBitRate(128000);
mediaRecorder.setAudioSamplingRate(16000);
mediaRecorder.setOutputFile(cacheDir + "/" + timestamp + "-audio_record.m4a");
mediaRecorder.prepare();
mediaRecorder.start();
```

This is triggered manually by the user through a dialog, not automatically during calls.

---

## Permissions Analysis

| Permission | Purpose |
|-----------|---------|
| `READ_CALL_LOG` | Access call history for matching |
| `READ_PHONE_STATE` | Detect call events |
| `READ_MEDIA_AUDIO` | Access audio files (Android 13+) |
| `READ_EXTERNAL_STORAGE` | Legacy storage access |
| `RECORD_AUDIO` | **Voice notes only** (not call recording!) |
| `FOREGROUND_SERVICE_SPECIAL_USE` | Background call monitoring |
| `FOREGROUND_SERVICE_LOCATION` | Location tracking during calls |
| `POST_NOTIFICATIONS` | Sync notifications |

### Important Intent Filters
```xml
<!-- SAF folder picker -->
<intent>
    <action android:name="android.intent.action.OPEN_DOCUMENT_TREE"/>
</intent>

<!-- Call state monitoring -->
<receiver android:name=".ui.service.CallStateManagerRestarterBroadcastReceiver"
          android:priority="999">
    <intent-filter>
        <action android:name="android.intent.action.PHONE_STATE"/>
    </intent-filter>
</receiver>
```

---

## Matching Algorithm Details

### Timestamp Matching
The app uses a **10-second tolerance window** when matching recordings to calls:

```java
// From RecordingReconWorker
Long recordingTime = recording.getDateAdded();      // When file was created
Long callEndTime = call.getCallEndTime();           // When call ended

// Match if within 10 seconds
if (Math.abs(recordingTime - callEndTime) <= 10000) {
    // This recording belongs to this call
    call.setCallRecording(recording);
}
```

### Priority Order
1. **MediaStore Query** (Android 11+) - Most reliable, system-indexed
2. **SAF Folder Scan** - User-selected recording folder
3. **File System Scan** - Direct path access (legacy)

---

## Workflow for Recording Sync

1. **User makes/receives a call**
2. **CallStateManagerService** detects call end via `PHONE_STATE` broadcast
3. **RecordingReconWorker** is scheduled via WorkManager (60 sec delay)
4. Worker queries:
   - Recent call logs from `CallLog.Calls.CONTENT_URI`
   - Recent audio files from `MediaStore.Audio.Media` or configured folder
5. **Timestamp matching** finds the recording closest to call end time
6. **Recording linked** to the CallEngagement in DataStore
7. **Recording uploaded** to AWS S3 (if enabled)

---

## Technology Stack

| Component | Technology |
|-----------|------------|
| Language | Kotlin |
| UI | Jetpack Compose |
| Backend Sync | AWS Amplify DataStore (GraphQL) |
| Cloud Storage | AWS S3 |
| Background Tasks | WorkManager |
| Local DB | Room (SQLite) |
| Analytics | Firebase Analytics |
| Push | OneSignal |
| Media Playback | ExoPlayer (Media3) |

---

## Comparison: Salesmax vs Callyzer

| Feature | Salesmax | Callyzer |
|---------|----------|----------|
| Direct Call Recording | ❌ No | ❌ No |
| Recording Discovery | ✅ MediaStore + SAF | ✅ SAF + File System |
| Matching Method | Timestamp only | Timestamp + Filename + Number |
| Matching Tolerance | 10 seconds | 5-10 seconds |
| Recording Compression | ❌ None (uploads as-is) | ✅ FFmpegKit (MP3) |
| Cloud Storage | AWS S3 | AWS S3 |
| Voice Notes | ✅ Manual recording | ❓ Unknown |
| Emoji handling | ❌ N/A | ✅ Strips emojis from names |

---

## Key Differences from Callyzer

1. **Simpler Matching**: Salesmax only uses timestamp matching, while Callyzer also checks phone numbers and contact names in filenames

2. **No Compression**: Salesmax uploads recordings as-is, Callyzer compresses with FFmpeg

3. **MediaStore First**: Salesmax prefers MediaStore on Android 11+, Callyzer primarily uses SAF

4. **Voice Notes Feature**: Salesmax has a built-in voice notes feature (unrelated to call recording)

---

## Recommendations for KonCall

Based on both Salesmax and Callyzer analysis:

1. **Don't try to directly record calls** - It won't work reliably on modern Android

2. **Implement a Recording Finder** service that:
   - Watches call log for new entries
   - Scans MediaStore for new audio files
   - Uses SAF for user-selected folders as fallback

3. **Match recordings using multiple criteria**:
   ```kotlin
   fun findMatchingRecording(call: CallLog, recordings: List<Recording>): Recording? {
       return recordings.firstOrNull { recording ->
           // Primary: Timestamp within 15 seconds
           val timeMatch = abs(recording.dateAdded - call.endTime) <= 15000
           
           // Secondary: Phone number in filename (if available)
           val numberMatch = call.number?.let { 
               recording.fileName.contains(it.takeLast(10))
           } ?: false
           
           timeMatch && (numberMatch || recording.dateAdded >= call.endTime)
       }
   }
   ```

4. **Guide users to enable OEM dialer recording**:
   - Samsung: Settings → Call settings → Record calls automatically
   - Xiaomi: Phone → Settings → Call recording
   - OnePlus: Phone app → Menu → Settings → Call recording

5. **Request SAF access** for the recording folder:
   ```kotlin
   val intent = Intent(Intent.ACTION_OPEN_DOCUMENT_TREE)
   startActivityForResult(intent, REQUEST_CODE_RECORDING_FOLDER)
   ```

---

## Key Files Reference

| File | Purpose |
|------|---------|
| `RecordingReconWorker.java` | Main reconciliation logic |
| `rz1.java` | CallRecording data class |
| `wz6.java` | Recording finder (file system + SAF) |
| `h4e.java` | MediaStore queries + call log reader |
| `CallStateManagerService.java` | Foreground service for call monitoring |
| `Prefs.java` | User preferences including recording folder URI |
| `RecordingDialogFragment.java` | Voice notes (not call recording!) |

---

## Conclusion

Both Salesmax and Callyzer use the **same fundamental approach**: they rely on OEM dialers to record calls, then find and sync those recordings. Neither app attempts to directly record phone calls, which is effectively impossible on modern Android without system-level privileges.

For KonCall, the recommended path is:
1. **Inform users** they need to enable call recording in their phone's native dialer
2. **Request storage permissions** (READ_MEDIA_AUDIO for Android 13+)
3. **Request SAF access** for the recording folder
4. **Build a RecordingFinderService** that matches recordings to calls by timestamp
5. **Sync matched recordings** to your backend
