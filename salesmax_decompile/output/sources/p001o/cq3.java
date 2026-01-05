package p001o;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class cq3 {

    /* renamed from: o.cq3$a */
    public static class C12723a {
        /* renamed from: a */
        public static Handler m16274a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* renamed from: b */
    public static ThreadPoolExecutor m21579b(final String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactory() { // from class: o.aq3
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return cq3.m21580c(str, runnable);
            }
        });
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* renamed from: c */
    public static /* synthetic */ Thread m21580c(String str, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setPriority(10);
        return thread;
    }

    /* renamed from: d */
    public static Handler m21581d() {
        return Build.VERSION.SDK_INT >= 28 ? C12723a.m16274a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper());
    }
}
