package com.koncall.app.service

import android.content.Context
import android.media.MediaRecorder
import android.os.Build
import android.util.Log
import java.io.File

/**
 * Helper class for recording calls.
 * Extracted from CallMonitorService for better separation of concerns.
 * 
 * Note: Call recording may have legal restrictions in some jurisdictions.
 * Ensure compliance with local laws before using.
 */
class CallRecorder(private val context: Context) {
    
    companion object {
        private const val TAG = "CallRecorder"
    }
    
    private var mediaRecorder: MediaRecorder? = null
    private var currentRecordingFile: File? = null
    
    /**
     * Check if currently recording
     */
    val isRecording: Boolean
        get() = mediaRecorder != null
    
    /**
     * Get the current recording file (if recording)
     */
    val recordingFile: File?
        get() = currentRecordingFile
    
    /**
     * Start recording a call
     * 
     * @param phoneNumber Phone number for file naming (optional)
     * @return True if recording started successfully
     */
    fun startRecording(phoneNumber: String? = null): Boolean {
        if (mediaRecorder != null) {
            Log.w(TAG, "Already recording, ignoring start request")
            return false
        }
        
        return try {
            val fileName = "REC_${System.currentTimeMillis()}_${phoneNumber ?: "Unknown"}.aac"
            val file = File(context.getExternalFilesDir(null), fileName)
            currentRecordingFile = file
            
            mediaRecorder = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
                MediaRecorder(context)
            } else {
                @Suppress("DEPRECATION")
                MediaRecorder()
            }
            
            mediaRecorder?.apply {
                setAudioSource(MediaRecorder.AudioSource.MIC)
                setOutputFormat(MediaRecorder.OutputFormat.AAC_ADTS)
                setAudioEncoder(MediaRecorder.AudioEncoder.AAC)
                setOutputFile(file.absolutePath)
                prepare()
                start()
            }
            
            Log.d(TAG, "Recording started: ${file.absolutePath}")
            true
            
        } catch (e: Exception) {
            Log.e(TAG, "Failed to start recording", e)
            cleanup()
            false
        }
    }
    
    /**
     * Stop recording and get the recorded file
     * 
     * @return The recorded file, or null if recording failed
     */
    fun stopRecording(): File? {
        val file = currentRecordingFile
        
        try {
            mediaRecorder?.apply {
                stop()
                release()
            }
            Log.d(TAG, "Recording stopped. File: ${file?.absolutePath}")
            
        } catch (e: Exception) {
            Log.e(TAG, "Failed to stop recording", e)
        } finally {
            cleanup()
        }
        
        // Return file only if it exists and has content
        return file?.takeIf { it.exists() && it.length() > 0 }
    }
    
    /**
     * Clean up recorder resources
     */
    private fun cleanup() {
        mediaRecorder = null
        currentRecordingFile = null
    }
    
    /**
     * Release resources (call when done with recorder)
     */
    fun release() {
        try {
            mediaRecorder?.release()
        } catch (e: Exception) {
            Log.e(TAG, "Error releasing recorder", e)
        }
        cleanup()
    }
}
