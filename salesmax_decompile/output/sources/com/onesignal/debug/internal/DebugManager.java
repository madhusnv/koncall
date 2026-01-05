package com.onesignal.debug.internal;

import com.onesignal.debug.IDebugManager;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class DebugManager implements IDebugManager {
    public DebugManager() {
        setLogLevel(LogLevel.WARN);
        setAlertLevel(LogLevel.NONE);
    }

    @Override // com.onesignal.debug.IDebugManager
    public LogLevel getAlertLevel() {
        return Logging.getVisualLogLevel();
    }

    @Override // com.onesignal.debug.IDebugManager
    public LogLevel getLogLevel() {
        return Logging.getLogLevel();
    }

    @Override // com.onesignal.debug.IDebugManager
    public void setAlertLevel(LogLevel logLevel) {
        sq8.m48649h(logLevel, "value");
        Logging.setVisualLogLevel(logLevel);
    }

    @Override // com.onesignal.debug.IDebugManager
    public void setLogLevel(LogLevel logLevel) {
        sq8.m48649h(logLevel, "value");
        Logging.setLogLevel(logLevel);
    }
}
