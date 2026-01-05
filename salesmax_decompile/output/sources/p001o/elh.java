package p001o;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public abstract class elh {
    /* renamed from: a */
    public static void m25220a() {
        fgd.m26666j(m25222c(), "Not in application's main thread");
    }

    /* renamed from: b */
    public static Handler m25221b() {
        return new Handler(Looper.getMainLooper());
    }

    /* renamed from: c */
    public static boolean m25222c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: d */
    public static void m25223d(Runnable runnable) {
        if (m25222c()) {
            runnable.run();
        } else {
            fgd.m26666j(m25221b().post(runnable), "Unable to post to main thread");
        }
    }
}
