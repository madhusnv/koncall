package bk;

import a1.C0004c;
import ak.CallableC0163b;
import ak.CallableC0167f;
import h6.ExecutorC2852h;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import pg.l8;
import yg.C8656m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bk.e */
/* loaded from: classes.dex */
public final class C0674e {

    /* renamed from: d */
    public static final HashMap f4245d = new HashMap();

    /* renamed from: e */
    public static final ExecutorC2852h f4246e = new ExecutorC2852h(0);

    /* renamed from: a */
    public final Executor f4247a;

    /* renamed from: b */
    public final C0688s f4248b;

    /* renamed from: c */
    public C8656m f4249c = null;

    public C0674e(Executor executor, C0688s c0688s) {
        this.f4247a = executor;
        this.f4248b = c0688s;
    }

    /* renamed from: a */
    public static Object m1947a(C8656m c8656m) throws ExecutionException, TimeoutException {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        C0673d c0673d = new C0673d();
        Executor executor = f4246e;
        c8656m.m15979f(executor, c0673d);
        c8656m.m15977d(executor, c0673d);
        c8656m.m15974a(executor, c0673d);
        if (!c0673d.f4244a.await(5L, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (c8656m.m15985l()) {
            return c8656m.m15983j();
        }
        throw new ExecutionException(c8656m.m15982i());
    }

    /* renamed from: b */
    public final synchronized C8656m m1948b() {
        try {
            C8656m c8656m = this.f4249c;
            if (c8656m == null || (c8656m.m15984k() && !this.f4249c.m15985l())) {
                this.f4249c = l8.m11762c(this.f4247a, new CallableC0167f(1, this.f4248b));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f4249c;
    }

    /* renamed from: c */
    public final C0676g m1949c() {
        synchronized (this) {
            try {
                C8656m c8656m = this.f4249c;
                if (c8656m != null && c8656m.m15985l()) {
                    return (C0676g) this.f4249c.m15983j();
                }
                try {
                    C8656m c8656mM1948b = m1948b();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    return (C0676g) m1947a(c8656mM1948b);
                } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                    return null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public final C8656m m1950d(C0676g c0676g) {
        CallableC0163b callableC0163b = new CallableC0163b(1, this, c0676g);
        Executor executor = this.f4247a;
        return l8.m11762c(executor, callableC0163b).m15986m(executor, new C0004c(3, this, c0676g));
    }
}
