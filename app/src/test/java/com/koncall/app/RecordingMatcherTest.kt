package com.koncall.app

import com.koncall.app.data.local.entity.CallLogEntity
import com.koncall.app.service.recording.RecordingMatcher
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Unit tests for RecordingMatcher
 */
class RecordingMatcherTest {

    @Test
    fun normalizePhoneNumber_removesNonDigits() {
        assertEquals("9876543210", RecordingMatcher.normalizePhoneNumber("+91 98765 43210"))
        assertEquals("9876543210", RecordingMatcher.normalizePhoneNumber("98765-43210"))
        assertEquals("9876543210", RecordingMatcher.normalizePhoneNumber("(987) 654-3210"))
        assertEquals("123", RecordingMatcher.normalizePhoneNumber("123")) // Less than 10 digits
    }

    @Test
    fun stripEmojis_removesEmojisCorrectly() {
        val nameWithEmoji = "John Doe 👨‍💻"
        val nameWithMix = "Jane 🚀 Smith ✨"
        
        assertEquals("John Doe ", RecordingMatcher.stripEmojis(nameWithEmoji))
        assertEquals("Jane  Smith ", RecordingMatcher.stripEmojis(nameWithMix))
    }

    @Test
    fun filenameContainsNumber_findsNumberInFilename() {
        val filename1 = "Call_9876543210_20240101.m4a"
        val filename2 = "recording_John_+919876543210.mp3"
        val filename3 = "audio_12345.wav" // Wrong number
        
        val phoneNumber = "+91 98765 43210"
        
        assertTrue(RecordingMatcher.filenameContainsNumber(filename1, phoneNumber))
        assertTrue(RecordingMatcher.filenameContainsNumber(filename2, phoneNumber))
        assertFalse(RecordingMatcher.filenameContainsNumber(filename3, phoneNumber))
    }

    @Test
    fun filenameContainsName_findsNameInFilename() {
        val filename1 = "Call_John_Doe_2024.m4a"
        val filename2 = "recording_jane.mp3"
        
        assertTrue(RecordingMatcher.filenameContainsName(filename1, "John Doe"))
        assertTrue(RecordingMatcher.filenameContainsName(filename1, "John"))
        assertTrue(RecordingMatcher.filenameContainsName(filename1, "Doe")) // Partial match allowed
        
        assertTrue(RecordingMatcher.filenameContainsName(filename2, "Jane Smith")) // "Jane" is in filename
        
        assertFalse(RecordingMatcher.filenameContainsName("audio_file.mp3", "John Doe"))
    }

    @Test
    fun calculateMatch_scoresCorrectly() {
        val now = System.currentTimeMillis()
        
        // Setup Call
        val call = CallLogEntity(
            id = "call_1",
            deviceCallId = 1001L,
            phoneNumber = "+91 98765 43210",
            contactName = "John Doe",
            callType = "incoming",
            callDateTime = now - 5000, // Call at T-5s
            duration = 10,
            simNumber = "sim1"
        )
        
        // 1. Perfect Match (Number + Name + Time)
        val recording1 = RecordingMatcher.RecordingInfo(
            id = "rec_1",
            fileName = "Call_John_Doe_9876543210.m4a",
            dateAdded = now - 4000, // T-4s (1s diff from call time - very close)
            size = 1024
        )
        
        val match1 = RecordingMatcher.calculateMatch(recording1, call)
        // Score: 10 (Phone) + 5 (Name) + 5 (Time < 15s) = 20 (approx)
        assertTrue(match1.score >= 19) 
        assertTrue(match1.reasons.any { it.contains("Phone number") })
        
        // 2. Partial Match (Time only - should trigger if close enough)
        val recording2 = RecordingMatcher.RecordingInfo(
            id = "rec_2",
            fileName = "audio_record.m4a",
            dateAdded = now - 3000, // T-3s (2s diff)
            size = 1024
        )
        
        val match2 = RecordingMatcher.calculateMatch(recording2, call)
        // Score: 5 (Time) approx
        assertTrue(match2.score >= 4)
        
        // 3. No Match (Time far away)
        val recording3 = RecordingMatcher.RecordingInfo(
            id = "rec_3",
            fileName = "old_recording.m4a",
            dateAdded = now - 60000, // T-60s (55s diff)
            size = 1024
        )
        
        val match3 = RecordingMatcher.calculateMatch(recording3, call)
        assertEquals(0, match3.score)
    }
    
    @Test
    fun findBestMatch_selectsHighestScore() {
        val now = System.currentTimeMillis()
        val call = CallLogEntity(
            id = "call_1",
            deviceCallId = 1002L,
            phoneNumber = "9876543210",
            contactName = null,
            callType = "incoming",
            callDateTime = now,
            duration = 10
        )
        
        // High score (has number)
        val goodRec = RecordingMatcher.RecordingInfo(
            id = "good",
            fileName = "Re_9876543210.m4a",
            dateAdded = now + 1000,
            size = 1000
        )
        
        // Low score (only time)
        val okRec = RecordingMatcher.RecordingInfo(
            id = "ok",
            fileName = "audio.m4a",
            dateAdded = now + 1000,
            size = 1000
        )
        
        val match = RecordingMatcher.findBestMatch(call, listOf(okRec, goodRec))
        
        assertNotNull(match)
        assertEquals("good", match?.recording?.id)
    }

    // ==================
    // Additional Edge Case Tests
    // ==================

    @Test
    fun normalizePhoneNumber_internationalFormats() {
        // UK number
        assertEquals("7912345678", RecordingMatcher.normalizePhoneNumber("+44 7912 345678"))
        // US number
        assertEquals("2025551234", RecordingMatcher.normalizePhoneNumber("+1 (202) 555-1234"))
        // Indian number with 0 prefix
        assertEquals("9876543210", RecordingMatcher.normalizePhoneNumber("09876543210"))
    }

    @Test
    fun normalizePhoneNumber_emptyAndNull() {
        assertEquals("", RecordingMatcher.normalizePhoneNumber(""))
        assertEquals("", RecordingMatcher.normalizePhoneNumber("   "))
    }

    @Test
    fun filenameContainsName_nullOrEmptyName() {
        assertFalse(RecordingMatcher.filenameContainsName("Call_123.m4a", null))
        assertFalse(RecordingMatcher.filenameContainsName("Call_123.m4a", ""))
        assertFalse(RecordingMatcher.filenameContainsName("Call_123.m4a", "   "))
    }

    @Test
    fun filenameContainsName_specialCharacters() {
        // Name with unicode characters
        assertTrue(RecordingMatcher.filenameContainsName("Call_Müller_2024.m4a", "Müller"))
        // Name with apostrophe
        assertTrue(RecordingMatcher.filenameContainsName("Call_O'Brien_2024.m4a", "O'Brien"))
    }

    @Test
    fun findBestMatch_emptyRecordingsList_returnsNull() {
        val call = CallLogEntity(
            id = "call_1",
            deviceCallId = 1003L,
            phoneNumber = "9876543210",
            contactName = "Test",
            callType = "incoming",
            callDateTime = System.currentTimeMillis(),
            duration = 10
        )
        
        val match = RecordingMatcher.findBestMatch(call, emptyList())
        
        assertEquals(null, match)
    }

    @Test
    fun findBestMatch_allBelowThreshold_returnsNull() {
        val now = System.currentTimeMillis()
        val call = CallLogEntity(
            id = "call_1",
            deviceCallId = 1004L,
            phoneNumber = "9876543210",
            contactName = "John",
            callType = "incoming",
            callDateTime = now,
            duration = 10
        )
        
        // Recording that's way too old - should score 0
        val oldRecording = RecordingMatcher.RecordingInfo(
            id = "old",
            fileName = "unrelated.m4a",
            dateAdded = now - 120000, // 2 minutes ago
            size = 1000
        )
        
        val match = RecordingMatcher.findBestMatch(call, listOf(oldRecording))
        
        // Should be null since score is below threshold
        assertEquals(null, match)
    }

    @Test
    fun isRecordingAfterCallEnd_withinBuffer_returnsTrue() {
        val callTime = 1000000L
        val duration = 60 // 60 second call
        val callEnd = callTime + (duration * 1000L) // callTime + 60000
        
        // Recording 1 second after call ended
        assertTrue(RecordingMatcher.isRecordingAfterCallEnd(callEnd + 1000, callTime, duration))
        
        // Recording exactly at call end
        assertTrue(RecordingMatcher.isRecordingAfterCallEnd(callEnd, callTime, duration))
        
        // Recording within 5s buffer before call end
        assertTrue(RecordingMatcher.isRecordingAfterCallEnd(callEnd - 3000, callTime, duration))
    }

    @Test
    fun isRecordingAfterCallEnd_beforeBuffer_returnsFalse() {
        val callTime = 1000000L
        val duration = 60
        val callEnd = callTime + (duration * 1000L)
        
        // Recording way before call ended
        assertFalse(RecordingMatcher.isRecordingAfterCallEnd(callTime, callTime, duration))
    }

    @Test
    fun stripEmojis_plainText_unchanged() {
        assertEquals("John Doe", RecordingMatcher.stripEmojis("John Doe"))
        assertEquals("Test 123", RecordingMatcher.stripEmojis("Test 123"))
    }
}
