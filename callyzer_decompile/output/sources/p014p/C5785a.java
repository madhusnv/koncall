package p014p;

import android.os.Looper;
import h6.ExecutorC2852h;
import og.gb;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: p.a */
/* loaded from: classes.dex */
public final class C5785a extends gb {

    /* renamed from: b */
    public static volatile C5785a f28362b;

    /* renamed from: c */
    public static final ExecutorC2852h f28363c = new ExecutorC2852h(1);

    /* renamed from: a */
    public final C5786b f28364a = new C5786b();

    /* renamed from: g */
    public static C5785a m11334g() {
        if (f28362b != null) {
            return f28362b;
        }
        synchronized (C5785a.class) {
            try {
                if (f28362b == null) {
                    f28362b = new C5785a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f28362b;
    }

    /* renamed from: h */
    public final void m11335h(Runnable runnable) {
        C5786b c5786b = this.f28364a;
        if (c5786b.f28367c == null) {
            synchronized (c5786b.f28365a) {
                try {
                    if (c5786b.f28367c == null) {
                        c5786b.f28367c = C5786b.m11336g(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        c5786b.f28367c.post(runnable);
    }
}
