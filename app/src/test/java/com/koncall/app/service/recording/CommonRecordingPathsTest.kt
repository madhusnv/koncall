package com.koncall.app.service.recording

import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Unit tests for CommonRecordingPaths utility functions.
 * Tests audio file detection and path constants.
 */
class CommonRecordingPathsTest {

    // ==================
    // isAudioFile() Tests
    // ==================

    @Test
    fun isAudioFile_m4aExtension_returnsTrue() {
        assertTrue(CommonRecordingPaths.isAudioFile("recording.m4a"))
    }

    @Test
    fun isAudioFile_aacExtension_returnsTrue() {
        assertTrue(CommonRecordingPaths.isAudioFile("call.aac"))
    }

    @Test
    fun isAudioFile_mp3Extension_returnsTrue() {
        assertTrue(CommonRecordingPaths.isAudioFile("audio.mp3"))
    }

    @Test
    fun isAudioFile_amrExtension_returnsTrue() {
        assertTrue(CommonRecordingPaths.isAudioFile("voice.amr"))
    }

    @Test
    fun isAudioFile_wavExtension_returnsTrue() {
        assertTrue(CommonRecordingPaths.isAudioFile("sound.wav"))
    }

    @Test
    fun isAudioFile_opusExtension_returnsTrue() {
        assertTrue(CommonRecordingPaths.isAudioFile("call.opus"))
    }

    @Test
    fun isAudioFile_3gpExtension_returnsTrue() {
        assertTrue(CommonRecordingPaths.isAudioFile("recording.3gp"))
    }

    @Test
    fun isAudioFile_oggExtension_returnsTrue() {
        assertTrue(CommonRecordingPaths.isAudioFile("file.ogg"))
    }

    @Test
    fun isAudioFile_uppercaseExtension_returnsTrue() {
        // Should be case-insensitive
        assertTrue(CommonRecordingPaths.isAudioFile("RECORDING.MP3"))
        assertTrue(CommonRecordingPaths.isAudioFile("Call.M4A"))
    }

    @Test
    fun isAudioFile_mixedCaseExtension_returnsTrue() {
        assertTrue(CommonRecordingPaths.isAudioFile("test.Mp3"))
    }

    @Test
    fun isAudioFile_textFile_returnsFalse() {
        assertFalse(CommonRecordingPaths.isAudioFile("notes.txt"))
    }

    @Test
    fun isAudioFile_imageFile_returnsFalse() {
        assertFalse(CommonRecordingPaths.isAudioFile("photo.jpg"))
    }

    @Test
    fun isAudioFile_videoFile_returnsFalse() {
        assertFalse(CommonRecordingPaths.isAudioFile("video.mp4"))
    }

    @Test
    fun isAudioFile_noExtension_returnsFalse() {
        assertFalse(CommonRecordingPaths.isAudioFile("fileWithNoExtension"))
    }

    @Test
    fun isAudioFile_emptyString_returnsFalse() {
        assertFalse(CommonRecordingPaths.isAudioFile(""))
    }

    @Test
    fun isAudioFile_dotOnly_isValidExtension() {
        // ".m4a" has extension "m4a" which is valid audio
        assertTrue(CommonRecordingPaths.isAudioFile(".m4a"))
    }

    // ==================
    // AUDIO_EXTENSIONS Tests
    // ==================

    @Test
    fun audioExtensions_containsAllExpectedFormats() {
        val expected = setOf("m4a", "aac", "mp3", "amr", "3gp", "ogg", "wav", "opus")
        assertEquals(expected, CommonRecordingPaths.AUDIO_EXTENSIONS)
    }

    // ==================
    // PATHS Tests
    // ==================

    @Test
    fun paths_containsSamsungPath() {
        assertTrue(CommonRecordingPaths.PATHS.any { it.contains("Samsung", ignoreCase = true) || it.contains("Recordings/Call") })
    }

    @Test
    fun paths_containsXiaomiPath() {
        assertTrue(CommonRecordingPaths.PATHS.any { it.contains("MIUI") })
    }

    @Test
    fun paths_containsOnePlusPath() {
        assertTrue(CommonRecordingPaths.PATHS.any { it.contains("PhoneRecord") || it.contains("Record/PhoneRecord") })
    }

    @Test
    fun paths_containsGoogleDialerPath() {
        assertTrue(CommonRecordingPaths.PATHS.any { it.contains("Call recordings") })
    }

    @Test
    fun paths_notEmpty() {
        assertTrue(CommonRecordingPaths.PATHS.isNotEmpty())
        assertTrue(CommonRecordingPaths.PATHS.size >= 10) // Should have many OEM paths
    }
}
