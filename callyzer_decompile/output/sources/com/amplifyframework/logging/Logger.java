package com.amplifyframework.logging;

import java.util.function.Supplier;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface Logger {
    void debug(String str);

    default void debug(Supplier<String> supplier) {
        if (getThresholdLevel().above(LogLevel.DEBUG)) {
            return;
        }
        debug(supplier.get());
    }

    void error(String str);

    void error(String str, Throwable th2);

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

    void warn(String str, Throwable th2);

    default void warn(Supplier<String> supplier) {
        if (getThresholdLevel().above(LogLevel.WARN)) {
            return;
        }
        warn(supplier.get());
    }

    default void error(Throwable th2, Supplier<String> supplier) {
        if (getThresholdLevel().above(LogLevel.ERROR)) {
            return;
        }
        error(supplier.get(), th2);
    }

    default void warn(Throwable th2, Supplier<String> supplier) {
        if (getThresholdLevel().above(LogLevel.WARN)) {
            return;
        }
        warn(supplier.get(), th2);
    }
}
