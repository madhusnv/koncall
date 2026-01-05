package com.razorpay;

import android.content.Context;
import java.lang.Thread;

/* loaded from: classes6.dex */
final class J$_M_ implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    Context f13637a;

    /* renamed from: b */
    private Thread.UncaughtExceptionHandler f13638b;

    private J$_M_(Context context, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f13638b = uncaughtExceptionHandler;
        this.f13637a = context;
    }

    /* renamed from: a */
    public static void m15989a(Context context) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler instanceof J$_M_) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(new J$_M_(context, defaultUncaughtExceptionHandler));
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, final Throwable th) {
        new Thread() { // from class: com.razorpay.U_$B$
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                AnalyticsUtil.reportUncaughtException(th);
                AnalyticsUtil.saveEventsToPreferences(this.f13710b.f13637a);
            }
        }.start();
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f13638b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    /* renamed from: a */
    public static void m15988a() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler instanceof J$_M_) {
            Thread.setDefaultUncaughtExceptionHandler(((J$_M_) defaultUncaughtExceptionHandler).f13638b);
        }
    }
}
