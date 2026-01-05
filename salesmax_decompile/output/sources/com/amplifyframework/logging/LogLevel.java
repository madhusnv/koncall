package com.amplifyframework.logging;

/* loaded from: classes5.dex */
public enum LogLevel {
    VERBOSE,
    DEBUG,
    INFO,
    WARN,
    ERROR,
    NONE;

    public boolean above(LogLevel logLevel) {
        return ordinal() > logLevel.ordinal();
    }
}
