package com.amplifyframework.logging;

import android.annotation.SuppressLint;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class AndroidLogger implements Logger {
    private static boolean isEnabled = true;
    private final String namespace;
    private final LogLevel threshold;

    public AndroidLogger(String str, LogLevel logLevel) {
        Objects.requireNonNull(logLevel);
        this.threshold = logLevel;
        Objects.requireNonNull(str);
        this.namespace = str;
    }

    public static void setIsEnabled(boolean z6) {
        isEnabled = z6;
    }

    private boolean shouldNotLogMessage(LogLevel logLevel) {
        return !isEnabled || this.threshold.above(logLevel);
    }

    @Override // com.amplifyframework.logging.Logger
    @SuppressLint({"LogConditional"})
    public void debug(String str) {
        shouldNotLogMessage(LogLevel.DEBUG);
    }

    @Override // com.amplifyframework.logging.Logger
    public void error(String str) {
        shouldNotLogMessage(LogLevel.ERROR);
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
    @SuppressLint({"LogConditional"})
    public void info(String str) {
        shouldNotLogMessage(LogLevel.INFO);
    }

    @Override // com.amplifyframework.logging.Logger
    @SuppressLint({"LogConditional"})
    public void verbose(String str) {
        shouldNotLogMessage(LogLevel.VERBOSE);
    }

    @Override // com.amplifyframework.logging.Logger
    public void warn(String str) {
        shouldNotLogMessage(LogLevel.WARN);
    }

    @Override // com.amplifyframework.logging.Logger
    public void error(String str, Throwable th2) {
        shouldNotLogMessage(LogLevel.ERROR);
    }

    @Override // com.amplifyframework.logging.Logger
    public void warn(String str, Throwable th2) {
        shouldNotLogMessage(LogLevel.WARN);
    }
}
