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
}
