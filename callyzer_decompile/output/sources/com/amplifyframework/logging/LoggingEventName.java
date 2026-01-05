package com.amplifyframework.logging;

import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class LoggingEventName {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ LoggingEventName[] $VALUES;
    public static final LoggingEventName WRITE_LOG_FAILURE = new LoggingEventName("WRITE_LOG_FAILURE", 0, "writeLogFailure");
    public static final LoggingEventName FLUSH_LOG_FAILURE = new LoggingEventName("FLUSH_LOG_FAILURE", 1, "flushLogFailure");

    private static final /* synthetic */ LoggingEventName[] $values() {
        return new LoggingEventName[]{WRITE_LOG_FAILURE, FLUSH_LOG_FAILURE};
    }

    static {
        LoggingEventName[] loggingEventNameArr$values = $values();
        $VALUES = loggingEventNameArr$values;
        $ENTRIES = b8.m11548b(loggingEventNameArr$values);
    }

    private LoggingEventName(String str, int i10, String str2) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static LoggingEventName valueOf(String str) {
        return (LoggingEventName) Enum.valueOf(LoggingEventName.class, str);
    }

    public static LoggingEventName[] values() {
        return (LoggingEventName[]) $VALUES.clone();
    }
}
