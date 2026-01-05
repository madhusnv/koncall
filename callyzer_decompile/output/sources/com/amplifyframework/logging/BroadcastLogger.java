package com.amplifyframework.logging;

import android.annotation.SuppressLint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class BroadcastLogger implements Logger {
    private final List<Logger> delegates;

    public BroadcastLogger(List<Logger> list) {
        this.delegates = new ArrayList(list);
    }

    @Override // com.amplifyframework.logging.Logger
    @SuppressLint({"LogConditional"})
    public void debug(String str) {
        Iterator<Logger> it = this.delegates.iterator();
        while (it.hasNext()) {
            it.next().debug(str);
        }
    }

    @Override // com.amplifyframework.logging.Logger
    public void error(String str) {
        Iterator<Logger> it = this.delegates.iterator();
        while (it.hasNext()) {
            it.next().error(str);
        }
    }

    @Override // com.amplifyframework.logging.Logger
    public String getNamespace() {
        return this.delegates.isEmpty() ? "" : this.delegates.get(0).getNamespace();
    }

    @Override // com.amplifyframework.logging.Logger
    public LogLevel getThresholdLevel() {
        if (this.delegates.isEmpty()) {
            throw new IllegalStateException("Cannot get threshold level for BroadcastLogger with no registered loggers.");
        }
        return this.delegates.get(0).getThresholdLevel();
    }

    @Override // com.amplifyframework.logging.Logger
    @SuppressLint({"LogConditional"})
    public void info(String str) {
        Iterator<Logger> it = this.delegates.iterator();
        while (it.hasNext()) {
            it.next().info(str);
        }
    }

    @Override // com.amplifyframework.logging.Logger
    @SuppressLint({"LogConditional"})
    public void verbose(String str) {
        Iterator<Logger> it = this.delegates.iterator();
        while (it.hasNext()) {
            it.next().verbose(str);
        }
    }

    @Override // com.amplifyframework.logging.Logger
    public void warn(String str) {
        Iterator<Logger> it = this.delegates.iterator();
        while (it.hasNext()) {
            it.next().warn(str);
        }
    }

    @Override // com.amplifyframework.logging.Logger
    public void error(String str, Throwable th2) {
        Iterator<Logger> it = this.delegates.iterator();
        while (it.hasNext()) {
            it.next().error(str, th2);
        }
    }

    @Override // com.amplifyframework.logging.Logger
    public void warn(String str, Throwable th2) {
        Iterator<Logger> it = this.delegates.iterator();
        while (it.hasNext()) {
            it.next().warn(str, th2);
        }
    }
}
