package com.koncall.app.service.recording

import com.koncall.app.data.local.entity.CallLogEntity
import java.util.regex.Pattern
import kotlin.math.abs

/**
 * Multi-factor matching algorithm for linking recordings to calls.
 * Inspired by Callyzer's matching logic.
 * 
 * Matching factors (in priority order):
 * 1. Phone number in filename (+10 points)
 * 2. Contact name in filename (+5 points)  
 * 3. Timestamp proximity (closer = more points, max +5)
 */
object RecordingMatcher {
    
    private const val TAG = "RecordingMatcher"
    
    // Points for different matching criteria
    private const val PHONE_NUMBER_MATCH_SCORE = 10
    private const val CONTACT_NAME_MATCH_SCORE = 5
    private const val MAX_TIMESTAMP_SCORE = 5
    
    // Maximum time difference to consider a match (15 seconds)
    const val TIMESTAMP_TOLERANCE_MS = 15_000L
    
    // Minimum score to consider a valid match
    const val MIN_MATCH_SCORE = 5
    
    // Pattern to extract phone numbers from filenames
    private val PHONE_PATTERN = Pattern.compile("\\d{10,}")
    
    // Emoji pattern for stripping from contact names
    // Pattern for purely stripping non-text characters (emojis, etc.)
    // Keeps Letters (L), Numbers (N), Punctuation (P), and Separators (Z)
    private val EMOJI_PATTERN = Pattern.compile("[^\\p{L}\\p{N}\\p{P}\\p{Z}]")
    
    /**
     * Data class representing a discovered recording for matching
     */
    data class RecordingInfo(
        val id: String,
        val fileName: String,
        val dateAdded: Long,
        val size: Long
    )
    
    /**
     * Match result with score and reasoning
     */
    data class MatchResult(
        val recording: RecordingInfo,
        val call: CallLogEntity,
        val score: Int,
        val reasons: List<String>
    )
    
    /**
     * Find the best matching recording for a call
     * Returns null if no recording meets the minimum score threshold
     */
    fun findBestMatch(
        call: CallLogEntity,
        recordings: List<RecordingInfo>
    ): MatchResult? {
        val results = recordings
            .map { recording -> calculateMatch(recording, call) }
            .filter { it.score >= MIN_MATCH_SCORE }
            .sortedByDescending { it.score }
        
        return results.firstOrNull()
    }
    
    /**
     * Find matches for multiple calls against recordings
     * Returns a map of call ID to best matching recording
     */
    fun findMatches(
        calls: List<CallLogEntity>,
        recordings: List<RecordingInfo>
    ): Map<String, MatchResult> {
        val results = mutableMapOf<String, MatchResult>()
        val usedRecordings = mutableSetOf<String>()
        
        // Sort calls by most recent first
        val sortedCalls = calls.sortedByDescending { it.callDateTime }
        
        for (call in sortedCalls) {
            // Filter out already-matched recordings
            val availableRecordings = recordings.filter { it.id !in usedRecordings }
            
            val match = findBestMatch(call, availableRecordings)
            if (match != null) {
                results[call.id] = match
                usedRecordings.add(match.recording.id)
            }
        }
        
        return results
    }
    
    /**
     * Calculate match score between a recording and a call
     */
    fun calculateMatch(recording: RecordingInfo, call: CallLogEntity): MatchResult {
        var score = 0
        val reasons = mutableListOf<String>()
        
        // 1. Check timestamp proximity
        val timeDiff = abs(recording.dateAdded - call.callDateTime)
        if (timeDiff <= TIMESTAMP_TOLERANCE_MS) {
            // Linear score based on how close the timestamps are
            // 0ms diff = 5 points, 15000ms diff = 0 points
            val timestampScore = ((TIMESTAMP_TOLERANCE_MS - timeDiff) * MAX_TIMESTAMP_SCORE / TIMESTAMP_TOLERANCE_MS).toInt()
            score += timestampScore
            reasons.add("Timestamp within ${timeDiff}ms (+$timestampScore)")
        } else {
            // Recording is outside tolerance, but still track for debugging
            reasons.add("Timestamp diff ${timeDiff}ms (outside ${TIMESTAMP_TOLERANCE_MS}ms tolerance)")
        }
        
        // 2. Check if phone number is in filename
        val normalizedCallNumber = normalizePhoneNumber(call.phoneNumber)
        if (filenameContainsNumber(recording.fileName, normalizedCallNumber)) {
            score += PHONE_NUMBER_MATCH_SCORE
            reasons.add("Phone number in filename (+$PHONE_NUMBER_MATCH_SCORE)")
        }
        
        // 3. Check if contact name is in filename
        if (filenameContainsName(recording.fileName, call.contactName)) {
            score += CONTACT_NAME_MATCH_SCORE
            reasons.add("Contact name in filename (+$CONTACT_NAME_MATCH_SCORE)")
        }
        
        return MatchResult(recording, call, score, reasons)
    }
    
    /**
     * Extract phone numbers from filename
     * Handles formats like:
     * - "9876543210_20240105.m4a"
     * - "Call_+91-9876543210.mp3"
     * - "recording_John_Doe_9876543210.aac"
     */
    fun extractPhoneNumbers(fileName: String): List<String> {
        val numbers = mutableListOf<String>()
        val matcher = PHONE_PATTERN.matcher(fileName.filter { it.isDigit() || it == '+' })
        
        while (matcher.find()) {
            val number = matcher.group()
            val normalized = normalizePhoneNumber(number)
            if (normalized.length >= 10) {
                numbers.add(normalized)
            }
        }
        
        // Also try extracting from the original filename with digits
        val digitsOnly = fileName.filter { it.isDigit() }
        if (digitsOnly.length >= 10) {
            // Take last 10 digits as potential phone number
            numbers.add(digitsOnly.takeLast(10))
        }
        
        return numbers.distinct()
    }
    
    /**
     * Check if filename contains the phone number
     * Normalizes both before comparison
     */
    fun filenameContainsNumber(fileName: String, phoneNumber: String): Boolean {
        val normalizedTarget = normalizePhoneNumber(phoneNumber)
        if (normalizedTarget.length < 10) return false
        
        // Check if any variation of the number appears in filename
        val last10 = normalizedTarget.takeLast(10)
        val digitsInFileName = fileName.filter { it.isDigit() }
        
        return digitsInFileName.contains(last10)
    }
    
    /**
     * Check if filename contains contact name
     * Handles emoji stripping and case-insensitive matching
     */
    fun filenameContainsName(fileName: String, contactName: String?): Boolean {
        if (contactName.isNullOrBlank()) return false
        
        val cleanedName = stripEmojis(contactName).trim().lowercase()
        if (cleanedName.length < 3) return false  // Too short to match reliably
        
        val cleanedFileName = fileName.lowercase()
        
        // Check if full name matches
        if (cleanedFileName.contains(cleanedName)) return true
        
        // Check if any word from name matches (for "John Doe" -> "john" or "doe")
        val nameWords = cleanedName.split(" ", "_", "-").filter { it.length >= 3 }
        return nameWords.any { word -> cleanedFileName.contains(word) }
    }
    
    /**
     * Strip emojis from string (for contact name matching)
     */
    fun stripEmojis(text: String): String {
        return EMOJI_PATTERN.matcher(text).replaceAll("")
    }
    
    /**
     * Normalize phone number (remove +91, spaces, dashes, parentheses)
     * Keep only last 10 digits for matching
     */
    fun normalizePhoneNumber(phone: String): String {
        val digitsOnly = phone.filter { it.isDigit() }
        return if (digitsOnly.length >= 10) {
            digitsOnly.takeLast(10)
        } else {
            digitsOnly
        }
    }
    
    /**
     * Check if recording timestamp is after call ended
     * (Recording is saved after call ends, so it should be created after callDateTime + duration)
     */
    fun isRecordingAfterCallEnd(recordingTime: Long, callTime: Long, durationSeconds: Int): Boolean {
        val callEndTime = callTime + (durationSeconds * 1000L)
        return recordingTime >= callEndTime - 5000 // Allow 5 second buffer
    }
}
