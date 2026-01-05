package com.google.firebase.perf.logging;

/* loaded from: classes6.dex */
class LogWrapper {
    private static final String LOG_TAG = "FirebasePerformance";
    private static LogWrapper instance;

    private LogWrapper() {
    }

    public static synchronized LogWrapper getInstance() {
        if (instance == null) {
            instance = new LogWrapper();
        }
        return instance;
    }

    /* renamed from: d */
    public void m15745d(String str) {
    }

    /* renamed from: e */
    public void m15746e(String str) {
    }

    /* renamed from: i */
    public void m15747i(String str) {
    }

    /* renamed from: v */
    public void m15748v(String str) {
    }

    /* renamed from: w */
    public void m15749w(String str) {
    }
}
