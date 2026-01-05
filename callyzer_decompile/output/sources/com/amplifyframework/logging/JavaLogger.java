package com.amplifyframework.logging;

import java.util.Objects;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class JavaLogger implements Logger {
    private static boolean isEnabled = true;
    private final String namespace;
    private final LogLevel threshold;

    public JavaLogger(String str, LogLevel logLevel) {
        Objects.requireNonNull(logLevel);
        this.threshold = logLevel;
        Objects.requireNonNull(str);
        this.namespace = str;
    }

    private void log(LogLevel logLevel, String str) {
        log(logLevel, str, null);
    }

    public static void setIsEnabled(boolean z6) {
        isEnabled = z6;
    }

    private boolean shouldNotLogMessage(LogLevel logLevel) {
        return !isEnabled || this.threshold.above(logLevel);
    }

    @Override // com.amplifyframework.logging.Logger
    public void debug(String str) {
        LogLevel logLevel = LogLevel.DEBUG;
        if (shouldNotLogMessage(logLevel)) {
            return;
        }
        log(logLevel, str);
    }

    @Override // com.amplifyframework.logging.Logger
    public void error(String str) {
        LogLevel logLevel = LogLevel.ERROR;
        if (shouldNotLogMessage(logLevel)) {
            return;
        }
        log(logLevel, str);
    }

    @Override // com.amplifyframework.logging.Logger
    public String getNamespace() {
        return this.namespace;
    }

    @Override // com.amplifyframework.logging.Logger
    public LogLevel getThresholdLevel() {
        return this.threshold;
    }

    @Override // com.amplifyframework.logging.Logger
    public void info(String str) {
        LogLevel logLevel = LogLevel.INFO;
        if (shouldNotLogMessage(logLevel)) {
            return;
        }
        log(logLevel, str);
    }

    @Override // com.amplifyframework.logging.Logger
    public void verbose(String str) {
        LogLevel logLevel = LogLevel.VERBOSE;
        if (shouldNotLogMessage(logLevel)) {
            return;
        }
        log(logLevel, str);
    }

    @Override // com.amplifyframework.logging.Logger
    public void warn(String str) {
        LogLevel logLevel = LogLevel.WARN;
        if (shouldNotLogMessage(logLevel)) {
            return;
        }
        log(logLevel, str);
    }

    private void log(LogLevel logLevel, String str, Throwable th2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(logLevel);
        sb2.append("/");
        a1.m14318A(sb2, this.namespace, ": ", str);
        if (th2 != null) {
            sb2.append("\n");
            sb2.append(th2);
        }
        System.out.println(sb2.toString());
    }

    @Override // com.amplifyframework.logging.Logger
    public void error(String str, Throwable th2) {
        LogLevel logLevel = LogLevel.ERROR;
        if (shouldNotLogMessage(logLevel)) {
            return;
        }
        log(logLevel, str, th2);
    }

    @Override // com.amplifyframework.logging.Logger
    public void warn(String str, Throwable th2) {
        LogLevel logLevel = LogLevel.WARN;
        if (shouldNotLogMessage(logLevel)) {
            return;
        }
        log(logLevel, str, th2);
    }
}
