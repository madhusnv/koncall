package com.amplifyframework.logging;

import java.util.function.Supplier;

/* loaded from: classes5.dex */
public interface Logger {
    void debug(String str);

    default void debug(Supplier<String> supplier) {
        if (getThresholdLevel().above(LogLevel.DEBUG)) {
            return;
        }
        debug(supplier.get());
    }

    void error(String str);

    void error(String str, Throwable th);

    default void error(Supplier<String> supplier) {
        if (getThresholdLevel().above(LogLevel.ERROR)) {
            return;
        }
        error(supplier.get());
    }

    String getNamespace();

    LogLevel getThresholdLevel();

    void info(String str);

    default void info(Supplier<String> supplier) {
        if (getThresholdLevel().above(LogLevel.INFO)) {
            return;
        }
        info(supplier.get());
    }

    void verbose(String str);

    default void verbose(Supplier<String> supplier) {
        if (getThresholdLevel().above(LogLevel.VERBOSE)) {
            return;
        }
        verbose(supplier.get());
    }

    void warn(String str);

    void warn(String str, Throwable th);

    default void warn(Supplier<String> supplier) {
        if (getThresholdLevel().above(LogLevel.WARN)) {
            return;
        }
        warn(supplier.get());
    }

    default void error(Throwable th, Supplier<String> supplier) {
        if (getThresholdLevel().above(LogLevel.ERROR)) {
            return;
        }
        error(supplier.get(), th);
    }

    default void warn(Throwable th, Supplier<String> supplier) {
        if (getThresholdLevel().above(LogLevel.WARN)) {
            return;
        }
        warn(supplier.get(), th);
    }
}
