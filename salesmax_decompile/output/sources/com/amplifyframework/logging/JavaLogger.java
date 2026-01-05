package com.amplifyframework.logging;

import java.util.Objects;

/* loaded from: classes5.dex */
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

    public static void setIsEnabled(boolean z) {
        isEnabled = z;
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

    private void log(LogLevel logLevel, String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(logLevel);
        sb.append("/");
        sb.append(this.namespace);
        sb.append(": ");
        sb.append(str);
        if (th != null) {
            sb.append("\n");
            sb.append(th);
        }
        System.out.println(sb.toString());
    }

    @Override // com.amplifyframework.logging.Logger
    public void error(String str, Throwable th) {
        LogLevel logLevel = LogLevel.ERROR;
        if (shouldNotLogMessage(logLevel)) {
            return;
        }
        log(logLevel, str, th);
    }

    @Override // com.amplifyframework.logging.Logger
    public void warn(String str, Throwable th) {
        LogLevel logLevel = LogLevel.WARN;
        if (shouldNotLogMessage(logLevel)) {
            return;
        }
        log(logLevel, str, th);
    }
}
