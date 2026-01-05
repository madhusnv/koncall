package com.amplifyframework.devmenu;

import a2.AbstractC0030c;
import android.util.Log;
import com.amplifyframework.logging.LogLevel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class LogEntry implements Comparable<LogEntry> {
    private static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS";
    private final Date date;
    private final LogLevel logLevel;
    private final String message;
    private final String namespace;
    private final Throwable throwable;

    public LogEntry(Date date, String str, String str2, Throwable th2, LogLevel logLevel) {
        Objects.requireNonNull(date);
        this.date = date;
        Objects.requireNonNull(logLevel);
        this.logLevel = logLevel;
        this.namespace = str;
        this.message = str2;
        this.throwable = th2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && LogEntry.class == obj.getClass()) {
            LogEntry logEntry = (LogEntry) obj;
            if (this.date.equals(logEntry.getDate()) && Objects.equals(this.namespace, logEntry.getNamespace()) && Objects.equals(this.message, logEntry.getMessage()) && this.logLevel == logEntry.getLogLevel() && Objects.equals(this.throwable, logEntry.getThrowable())) {
                return true;
            }
        }
        return false;
    }

    public Date getDate() {
        return this.date;
    }

    public LogLevel getLogLevel() {
        return this.logLevel;
    }

    public String getMessage() {
        return this.message;
    }

    public String getNamespace() {
        return this.namespace;
    }

    public Throwable getThrowable() {
        return this.throwable;
    }

    public int hashCode() {
        return getLogLevel().hashCode() + (((((((getDate().hashCode() * 31) + (getNamespace() != null ? getNamespace().hashCode() : 0)) * 31) + (getMessage() != null ? getMessage().hashCode() : 0)) * 31) + (getThrowable() != null ? getThrowable().hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = new SimpleDateFormat(DATE_TIME_FORMAT, Locale.US).format(this.date);
        Throwable th2 = this.throwable;
        String stackTraceString = th2 == null ? "" : Log.getStackTraceString(th2);
        if (!stackTraceString.isEmpty() && !stackTraceString.endsWith("\n")) {
            stackTraceString = stackTraceString.concat("\n");
        }
        String strName = this.logLevel.name();
        String str2 = this.namespace;
        String str3 = this.message;
        StringBuilder sbM127r = AbstractC0030c.m127r("[", strName, "] ", str, " ");
        a1.m14319B(sbM127r, str2, ": ", str3, "\n");
        sbM127r.append(stackTraceString);
        return sbM127r.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(LogEntry logEntry) {
        return getDate().compareTo(logEntry.getDate());
    }
}
