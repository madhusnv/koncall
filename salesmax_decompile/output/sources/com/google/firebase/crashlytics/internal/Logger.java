package com.google.firebase.crashlytics.internal;

import android.util.Log;

/* loaded from: classes4.dex */
public class Logger {
    private int logLevel = 4;
    private final String tag;
    public static final String TAG = "FirebaseCrashlytics";
    static final Logger DEFAULT_LOGGER = new Logger(TAG);

    public Logger(String str) {
        this.tag = str;
    }

    private boolean canLog(int i) {
        return this.logLevel <= i || Log.isLoggable(this.tag, i);
    }

    public static Logger getLogger() {
        return DEFAULT_LOGGER;
    }

    /* renamed from: d */
    public void m15663d(String str, Throwable th) {
        canLog(3);
    }

    /* renamed from: e */
    public void m15665e(String str, Throwable th) {
        canLog(6);
    }

    /* renamed from: i */
    public void m15667i(String str, Throwable th) {
        canLog(4);
    }

    public void log(int i, String str) {
        log(i, str, false);
    }

    /* renamed from: v */
    public void m15669v(String str, Throwable th) {
        canLog(2);
    }

    /* renamed from: w */
    public void m15671w(String str, Throwable th) {
        canLog(5);
    }

    /* renamed from: d */
    public void m15662d(String str) {
        m15663d(str, null);
    }

    /* renamed from: e */
    public void m15664e(String str) {
        m15665e(str, null);
    }

    /* renamed from: i */
    public void m15666i(String str) {
        m15667i(str, null);
    }

    public void log(int i, String str, boolean z) {
        if (z || canLog(i)) {
            Log.println(i, this.tag, str);
        }
    }

    /* renamed from: v */
    public void m15668v(String str) {
        m15669v(str, null);
    }

    /* renamed from: w */
    public void m15670w(String str) {
        m15671w(str, null);
    }
}
