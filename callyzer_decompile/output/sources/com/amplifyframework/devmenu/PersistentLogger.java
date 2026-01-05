package com.amplifyframework.devmenu;

import android.annotation.SuppressLint;
import com.amplifyframework.logging.LogLevel;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.util.Immutable;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class PersistentLogger implements Logger {
    private static final int MAX_NUM_LOGS = 500;
    private static boolean isEnabled = true;
    private final List<LogEntry> logs;
    private final String namespace;

    public PersistentLogger(String str) {
        Objects.requireNonNull(str);
        this.namespace = str;
        this.logs = new LinkedList();
    }

    private void addToLogs(String str, Throwable th2, LogLevel logLevel) {
        if (isEnabled) {
            if (this.logs.size() == MAX_NUM_LOGS) {
                this.logs.remove(0);
            }
            this.logs.add(new LogEntry(new Date(), this.namespace, str, th2, logLevel));
        }
    }

    public static void setIsEnabled(boolean z6) {
        isEnabled = z6;
    }

    @Override // com.amplifyframework.logging.Logger
    @SuppressLint({"LogConditional"})
    public void debug(String str) {
        addToLogs(str, null, LogLevel.DEBUG);
    }

    @Override // com.amplifyframework.logging.Logger
    public void error(String str) {
        addToLogs(str, null, LogLevel.ERROR);
    }

    public List<LogEntry> getLogs() {
        return Immutable.of(this.logs);
    }

    @Override // com.amplifyframework.logging.Logger
    public String getNamespace() {
        return this.namespace;
    }

    @Override // com.amplifyframework.logging.Logger
    public LogLevel getThresholdLevel() {
        return LogLevel.VERBOSE;
    }

    @Override // com.amplifyframework.logging.Logger
    @SuppressLint({"LogConditional"})
    public void info(String str) {
        addToLogs(str, null, LogLevel.INFO);
    }

    @Override // com.amplifyframework.logging.Logger
    @SuppressLint({"LogConditional"})
    public void verbose(String str) {
        addToLogs(str, null, LogLevel.VERBOSE);
    }

    @Override // com.amplifyframework.logging.Logger
    public void warn(String str) {
        addToLogs(str, null, LogLevel.WARN);
    }

    @Override // com.amplifyframework.logging.Logger
    public void error(String str, Throwable th2) {
        addToLogs(str, th2, LogLevel.ERROR);
    }

    @Override // com.amplifyframework.logging.Logger
    public void warn(String str, Throwable th2) {
        addToLogs(str, th2, LogLevel.WARN);
    }
}
