package al;

import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.measurement.h0;
import java.util.concurrent.Callable;
import yg.C8650g;
import yg.C8656m;
import zh.RunnableC8956c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: al.e */
/* loaded from: classes.dex */
public final class C0177e {

    /* renamed from: b */
    public static final Object f540b = new Object();

    /* renamed from: c */
    public static C0177e f541c;

    /* renamed from: a */
    public final h0 f542a;

    public C0177e(Looper looper) {
        h0 h0Var = new h0(looper, 5, false);
        Looper.getMainLooper();
        this.f542a = h0Var;
    }

    /* renamed from: a */
    public static C0177e m401a() {
        C0177e c0177e;
        synchronized (f540b) {
            try {
                if (f541c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f541c = new C0177e(handlerThread.getLooper());
                }
                c0177e = f541c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0177e;
    }

    /* renamed from: b */
    public static C8656m m402b(Callable callable) {
        C8650g c8650g = new C8650g();
        EnumC0185m.INSTANCE.execute(new RunnableC8956c(1, callable, c8650g));
        return c8650g.f41930a;
    }
}
