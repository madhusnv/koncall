package c0;

import android.os.Handler;
import i0.C3076g;
import java.util.concurrent.Executor;
import m0.InterfaceC4617k;
import p018t.C6970a;
import p018t.C6971b;
import p018t.C6972c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c0.y */
/* loaded from: classes.dex */
public final class C0832y implements InterfaceC4617k {

    /* renamed from: b */
    public static final C3076g f5272b = new C3076g("camerax.core.appConfig.cameraFactoryProvider", C6970a.class, null);

    /* renamed from: c */
    public static final C3076g f5273c = new C3076g("camerax.core.appConfig.deviceSurfaceManagerProvider", C6971b.class, null);

    /* renamed from: d */
    public static final C3076g f5274d = new C3076g("camerax.core.appConfig.useCaseConfigFactoryProvider", C6972c.class, null);

    /* renamed from: e */
    public static final C3076g f5275e = new C3076g("camerax.core.appConfig.cameraExecutor", Executor.class, null);

    /* renamed from: f */
    public static final C3076g f5276f = new C3076g("camerax.core.appConfig.schedulerHandler", Handler.class, null);

    /* renamed from: g */
    public static final C3076g f5277g;

    /* renamed from: h */
    public static final C3076g f5278h;

    /* renamed from: j */
    public static final C3076g f5279j;

    /* renamed from: k */
    public static final C3076g f5280k;

    /* renamed from: l */
    public static final C3076g f5281l;

    /* renamed from: m */
    public static final C3076g f5282m;

    /* renamed from: n */
    public static final C3076g f5283n;

    /* renamed from: a */
    public final i0.o1 f5284a;

    static {
        Class cls = Integer.TYPE;
        f5277g = new C3076g("camerax.core.appConfig.minimumLoggingLevel", cls, null);
        f5278h = new C3076g("camerax.core.appConfig.availableCamerasLimiter", C0825r.class, null);
        f5279j = new C3076g("camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming", Long.TYPE, null);
        f5280k = new C3076g("camerax.core.appConfig.cameraProviderInitRetryPolicy", m1.class, null);
        f5281l = new C3076g("camerax.core.appConfig.quirksSettings", i0.t1.class, null);
        f5282m = new C3076g("camerax.core.appConfig.configImplType", cls, null);
        f5283n = new C3076g("camerax.core.appConfig.repeatingStreamForced", Boolean.TYPE, null);
    }

    public C0832y(i0.o1 o1Var) {
        this.f5284a = o1Var;
    }

    /* renamed from: a */
    public final C0825r m2239a() {
        Object objMo7406k;
        try {
            objMo7406k = this.f5284a.mo7406k(f5278h);
        } catch (IllegalArgumentException unused) {
            objMo7406k = null;
        }
        return (C0825r) objMo7406k;
    }

    /* renamed from: b */
    public final C6970a m2240b() {
        Object objMo7406k;
        try {
            objMo7406k = this.f5284a.mo7406k(f5272b);
        } catch (IllegalArgumentException unused) {
            objMo7406k = null;
        }
        return (C6970a) objMo7406k;
    }

    @Override // i0.w1
    /* renamed from: d */
    public final i0.s0 mo2241d() {
        return this.f5284a;
    }

    /* renamed from: g */
    public final long m2242g() {
        C3076g c3076g = f5279j;
        Object objMo7406k = -1L;
        i0.o1 o1Var = this.f5284a;
        o1Var.getClass();
        try {
            objMo7406k = o1Var.mo7406k(c3076g);
        } catch (IllegalArgumentException unused) {
        }
        return ((Long) objMo7406k).longValue();
    }

    /* renamed from: m */
    public final C6971b m2243m() {
        Object objMo7406k;
        try {
            objMo7406k = this.f5284a.mo7406k(f5273c);
        } catch (IllegalArgumentException unused) {
            objMo7406k = null;
        }
        return (C6971b) objMo7406k;
    }

    /* renamed from: n */
    public final C6972c m2244n() {
        Object objMo7406k;
        try {
            objMo7406k = this.f5284a.mo7406k(f5274d);
        } catch (IllegalArgumentException unused) {
            objMo7406k = null;
        }
        return (C6972c) objMo7406k;
    }
}
