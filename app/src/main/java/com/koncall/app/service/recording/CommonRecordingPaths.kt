package com.koncall.app.service.recording

import android.content.Context
import android.os.Build
import android.os.Environment
import java.io.File

/**
 * Common recording paths for various OEM dialers.
 * Used to auto-detect where the device stores call recordings.
 */
object CommonRecordingPaths {
    
    /**
     * List of common call recording paths by OEM/Dialer.
     * Ordered by popularity (most common first).
     */
    val PATHS = listOf(
        // Samsung
        "/storage/emulated/0/Recordings/Call",
        "/storage/emulated/0/Call",
        "/storage/emulated/0/Recordings/Voice Recorder",
        
        // Xiaomi / MIUI
        "/storage/emulated/0/MIUI/sound_recorder/call_rec",
        "/storage/emulated/0/MIUI/sound_recorder",
        
        // OnePlus
        "/storage/emulated/0/Recordings",
        "/storage/emulated/0/Record/PhoneRecord",
        
        // OPPO / Realme / ColorOS
        "/storage/emulated/0/Recordings/Call Recordings",
        "/storage/emulated/0/Music/Recordings/Call Recordings",
        
        // Vivo / FuntouchOS
        "/storage/emulated/0/Recording/Call",
        "/storage/emulated/0/Record/Call",
        
        // Huawei / HarmonyOS
        "/storage/emulated/0/Sounds/CallRecord",
        "/storage/emulated/0/record",
        
        // Google Dialer
        "/storage/emulated/0/Recordings/Call recordings",
        
        // Motorola
        "/storage/emulated/0/PhoneRecord",
        
        // Generic Android
        "/storage/emulated/0/Record/Call",
        "/storage/emulated/0/CallRecordings",
        "/storage/emulated/0/Recordings",
        "/storage/emulated/0/AudioRecordings"
    )
    
    /**
     * Common audio file extensions for call recordings
     */
    val AUDIO_EXTENSIONS = setOf(
        "m4a", "aac", "mp3", "amr", "3gp", "ogg", "wav", "opus"
    )
    
    /**
     * Detect the first valid recording path on this device.
     * @return The path if found, null otherwise
     */
    fun detectRecordingPath(context: Context): String? {
        // First check our predefined paths
        val existingPath = PATHS.firstOrNull { path ->
            val file = File(path)
            file.exists() && file.isDirectory && file.canRead()
        }
        
        if (existingPath != null) {
            return existingPath
        }
        
        // Try to find any "Recordings" or "Call" folder in external storage
        val externalDir = Environment.getExternalStorageDirectory()
        return findRecordingFolderRecursive(externalDir, maxDepth = 3)
    }
    
    /**
     * Get all valid recording paths on this device.
     * Some devices may have recordings in multiple locations.
     */
    fun getAllValidPaths(): List<String> {
        return PATHS.filter { path ->
            val file = File(path)
            file.exists() && file.isDirectory && file.canRead()
        }
    }
    
    /**
     * Check if a file is a valid audio recording based on extension
     */
    fun isAudioFile(fileName: String): Boolean {
        val extension = fileName.substringAfterLast('.', "").lowercase()
        return extension in AUDIO_EXTENSIONS
    }
    
    /**
     * Get brand-specific instructions for enabling call recording
     */
    fun getDialerInstructions(context: Context): String {
        val brand = Build.BRAND.lowercase()
        val manufacturer = Build.MANUFACTURER.lowercase()
        
        return when {
            brand.contains("samsung") || manufacturer.contains("samsung") ->
                """
                Samsung Phone:
                1. Open Phone app
                2. Tap ⋮ (menu) → Settings
                3. Tap "Record calls"
                4. Enable "Auto record calls"
                """.trimIndent()
                
            brand.contains("xiaomi") || manufacturer.contains("xiaomi") ->
                """
                Xiaomi / MIUI:
                1. Open Phone app
                2. Tap ≡ (menu) → Settings
                3. Tap "Call recording"
                4. Enable "Record calls automatically"
                """.trimIndent()
                
            brand.contains("oneplus") || manufacturer.contains("oneplus") ->
                """
                OnePlus:
                1. Open Phone app
                2. Tap ⋮ (menu) → Settings
                3. Tap "Call recording"
                4. Enable auto-recording
                """.trimIndent()
                
            brand.contains("oppo") || brand.contains("realme") ->
                """
                OPPO / Realme:
                1. Open Phone app
                2. Tap Settings → Call recording
                3. Enable "Auto call recording"
                """.trimIndent()
                
            brand.contains("vivo") ->
                """
                Vivo:
                1. Open Phone app
                2. Tap ≡ → Settings → Record
                3. Enable call recording
                """.trimIndent()
                
            brand.contains("huawei") || brand.contains("honor") ->
                """
                Huawei / Honor:
                1. Open Phone app
                2. Tap ⋮ → Settings → Call recording
                3. Enable "Auto record calls"
                """.trimIndent()
                
            else ->
                """
                Generic Android:
                1. Open your Phone/Dialer app
                2. Go to Settings (usually ⋮ menu)
                3. Look for "Call recording" or "Record calls"
                4. Enable automatic recording
                
                Note: Some devices may not support call recording natively.
                """.trimIndent()
        }
    }
    
    /**
     * Recursively search for folders that might contain recordings
     */
    private fun findRecordingFolderRecursive(dir: File, maxDepth: Int, currentDepth: Int = 0): String? {
        if (currentDepth >= maxDepth || !dir.isDirectory || !dir.canRead()) {
            return null
        }
        
        val targetNames = setOf("recordings", "call", "record", "callrecord", "phonerecord")
        
        dir.listFiles()?.forEach { file ->
            if (file.isDirectory) {
                val name = file.name.lowercase()
                if (targetNames.any { name.contains(it) }) {
                    // Check if it contains audio files
                    val hasAudio = file.listFiles()?.any { isAudioFile(it.name) } ?: false
                    if (hasAudio) {
                        return file.absolutePath
                    }
                }
                
                // Recurse into subdirectories
                val found = findRecordingFolderRecursive(file, maxDepth, currentDepth + 1)
                if (found != null) return found
            }
        }
        
        return null
    }
}
