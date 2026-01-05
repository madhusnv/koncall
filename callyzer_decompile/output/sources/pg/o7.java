package pg;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import c6.AbstractC0879i;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class o7 {
    /* renamed from: a */
    public static void m11806a() {
        og.y0.m11056f("Not in application's main thread", m11808c());
    }

    /* renamed from: b */
    public static Handler m11807b(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return AbstractC0879i.m2391c(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    /* renamed from: c */
    public static boolean m11808c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: d */
    public static void m11809d(Runnable runnable) {
        if (m11808c()) {
            runnable.run();
        } else {
            og.y0.m11056f("Unable to post to main thread", new Handler(Looper.getMainLooper()).post(runnable));
        }
    }
}
