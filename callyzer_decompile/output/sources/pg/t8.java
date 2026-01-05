package pg;

import android.os.Handler;
import android.os.Looper;
import k0.AbstractC3898h;
import k0.ExecutorC3891a;
import k0.ExecutorC3896f;
import k0.ExecutorC3897g;
import k0.ScheduledExecutorServiceC3894d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class t8 {

    /* renamed from: a */
    public static final /* synthetic */ int f29069a = 0;

    /* renamed from: a */
    public static ExecutorC3891a m11872a() {
        if (ExecutorC3891a.f19987b != null) {
            return ExecutorC3891a.f19987b;
        }
        synchronized (ExecutorC3891a.class) {
            try {
                if (ExecutorC3891a.f19987b == null) {
                    ExecutorC3891a.f19987b = new ExecutorC3891a(0);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ExecutorC3891a.f19987b;
    }

    /* renamed from: b */
    public static ExecutorC3896f m11873b() {
        if (ExecutorC3896f.f19998c != null) {
            return ExecutorC3896f.f19998c;
        }
        synchronized (ExecutorC3896f.class) {
            try {
                if (ExecutorC3896f.f19998c == null) {
                    ExecutorC3896f.f19998c = new ExecutorC3896f();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ExecutorC3896f.f19998c;
    }

    /* renamed from: c */
    public static ExecutorC3897g m11874c() {
        if (ExecutorC3897g.f20001c != null) {
            return ExecutorC3897g.f20001c;
        }
        synchronized (ExecutorC3897g.class) {
            try {
                if (ExecutorC3897g.f20001c == null) {
                    ExecutorC3897g.f20001c = new ExecutorC3897g(0);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ExecutorC3897g.f20001c;
    }

    /* renamed from: d */
    public static ScheduledExecutorServiceC3894d m11875d() {
        if (AbstractC3898h.f20004a != null) {
            return AbstractC3898h.f20004a;
        }
        synchronized (AbstractC3898h.class) {
            try {
                if (AbstractC3898h.f20004a == null) {
                    AbstractC3898h.f20004a = new ScheduledExecutorServiceC3894d(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return AbstractC3898h.f20004a;
    }
}
