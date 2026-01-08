package com.koncall.app.service

import android.provider.CallLog
import com.koncall.app.data.local.entity.CallType
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test

/**
 * Unit tests for CallLogReader utility functions.
 * Tests mapCallType() which converts Android call type constants to our string types.
 */
class CallLogReaderTest {

    // ==================
    // mapCallType() Tests
    // ==================

    @Test
    fun mapCallType_incomingType_returnsIncoming() {
        val result = CallLogReader.mapCallType(CallLog.Calls.INCOMING_TYPE)
        assertEquals(CallType.INCOMING, result)
    }

    @Test
    fun mapCallType_outgoingType_returnsOutgoing() {
        val result = CallLogReader.mapCallType(CallLog.Calls.OUTGOING_TYPE)
        assertEquals(CallType.OUTGOING, result)
    }

    @Test
    fun mapCallType_missedType_returnsMissed() {
        val result = CallLogReader.mapCallType(CallLog.Calls.MISSED_TYPE)
        assertEquals(CallType.MISSED, result)
    }

    @Test
    fun mapCallType_rejectedType_returnsRejected() {
        val result = CallLogReader.mapCallType(CallLog.Calls.REJECTED_TYPE)
        assertEquals(CallType.REJECTED, result)
    }

    @Test
    fun mapCallType_unknownType_defaultsToIncoming() {
        // Unknown type codes should default to incoming
        val result = CallLogReader.mapCallType(999)
        assertEquals(CallType.INCOMING, result)
    }

    @Test
    fun mapCallType_blockedType_defaultsToIncoming() {
        // BLOCKED_TYPE (6) - should default to incoming
        val result = CallLogReader.mapCallType(6)
        assertEquals(CallType.INCOMING, result)
    }

    // ==================
    // extractSimSlot() Tests
    // Note: SIM slot is stored but not used for lead matching
    // ==================

    @Test
    fun extractSimSlot_singleDigitZero_returnsZero() {
        val result = CallLogReader.extractSimSlot("0")
        assertEquals(0, result)
    }

    @Test
    fun extractSimSlot_singleDigitOne_returnsOne() {
        val result = CallLogReader.extractSimSlot("1")
        assertEquals(1, result)
    }

    @Test
    fun extractSimSlot_sim1Lowercase_returnsZero() {
        val result = CallLogReader.extractSimSlot("sim1")
        assertEquals(0, result)
    }

    @Test
    fun extractSimSlot_sim2Uppercase_returnsOne() {
        val result = CallLogReader.extractSimSlot("SIM2")
        assertEquals(1, result)
    }

    @Test
    fun extractSimSlot_nullInput_returnsNull() {
        val result = CallLogReader.extractSimSlot(null)
        assertNull(result)
    }

    @Test
    fun extractSimSlot_emptyString_returnsNull() {
        val result = CallLogReader.extractSimSlot("")
        assertNull(result)
    }

    @Test
    fun extractSimSlot_blankString_returnsNull() {
        val result = CallLogReader.extractSimSlot("   ")
        assertNull(result)
    }
}
