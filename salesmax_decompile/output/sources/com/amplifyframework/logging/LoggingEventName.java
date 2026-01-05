package com.amplifyframework.logging;

import p001o.gi6;
import p001o.hi6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class LoggingEventName {
    private static final /* synthetic */ gi6 $ENTRIES;
    private static final /* synthetic */ LoggingEventName[] $VALUES;
    public static final LoggingEventName WRITE_LOG_FAILURE = new LoggingEventName("WRITE_LOG_FAILURE", 0, "writeLogFailure");
    public static final LoggingEventName FLUSH_LOG_FAILURE = new LoggingEventName("FLUSH_LOG_FAILURE", 1, "flushLogFailure");

    private static final /* synthetic */ LoggingEventName[] $values() {
        return new LoggingEventName[]{WRITE_LOG_FAILURE, FLUSH_LOG_FAILURE};
    }

    static {
        LoggingEventName[] loggingEventNameArr$values = $values();
        $VALUES = loggingEventNameArr$values;
        $ENTRIES = hi6.m30609a(loggingEventNameArr$values);
    }

    private LoggingEventName(String str, int i, String str2) {
    }

    public static gi6 getEntries() {
        return $ENTRIES;
    }

    public static LoggingEventName valueOf(String str) {
        return (LoggingEventName) Enum.valueOf(LoggingEventName.class, str);
    }

    public static LoggingEventName[] values() {
        return (LoggingEventName[]) $VALUES.clone();
    }
}
