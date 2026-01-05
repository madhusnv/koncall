package i0;

import android.util.Log;
import android.util.Size;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import java.util.concurrent.atomic.AtomicInteger;
import l0.C4310j;
import pg.i7;
import pg.t8;
import x4.C8299i;
import x4.C8302l;
import x4.InterfaceC8300j;
import zh.InterfaceFutureC8957d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class v0 {

    /* renamed from: k */
    public static final Size f16596k = new Size(0, 0);

    /* renamed from: l */
    public static final boolean f16597l = og.u1.m10946e("DeferrableSurface");

    /* renamed from: m */
    public static final AtomicInteger f16598m = new AtomicInteger(0);

    /* renamed from: n */
    public static final AtomicInteger f16599n = new AtomicInteger(0);

    /* renamed from: a */
    public final Object f16600a = new Object();

    /* renamed from: b */
    public int f16601b = 0;

    /* renamed from: c */
    public boolean f16602c = false;

    /* renamed from: d */
    public C8299i f16603d;

    /* renamed from: e */
    public final C8302l f16604e;

    /* renamed from: f */
    public C8299i f16605f;

    /* renamed from: g */
    public final C8302l f16606g;

    /* renamed from: h */
    public final Size f16607h;

    /* renamed from: i */
    public final int f16608i;

    /* renamed from: j */
    public Class f16609j;

    public v0(Size size, int i10) {
        this.f16607h = size;
        this.f16608i = i10;
        final int i11 = 0;
        C8302l c8302lM11697b = i7.m11697b(new InterfaceC8300j(this) { // from class: i0.t0

            /* renamed from: b */
            public final /* synthetic */ v0 f16581b;

            {
                this.f16581b = this;
            }

            @Override // x4.InterfaceC8300j
            /* renamed from: I */
            public final Object mo15I(C8299i c8299i) {
                switch (i11) {
                    case 0:
                        v0 v0Var = this.f16581b;
                        synchronized (v0Var.f16600a) {
                            v0Var.f16603d = c8299i;
                        }
                        return "DeferrableSurface-termination(" + v0Var + ")";
                    default:
                        v0 v0Var2 = this.f16581b;
                        synchronized (v0Var2.f16600a) {
                            v0Var2.f16605f = c8299i;
                        }
                        return "DeferrableSurface-close(" + v0Var2 + ")";
                }
            }
        });
        this.f16604e = c8302lM11697b;
        final int i12 = 1;
        this.f16606g = i7.m11697b(new InterfaceC8300j(this) { // from class: i0.t0

            /* renamed from: b */
            public final /* synthetic */ v0 f16581b;

            {
                this.f16581b = this;
            }

            @Override // x4.InterfaceC8300j
            /* renamed from: I */
            public final Object mo15I(C8299i c8299i) {
                switch (i12) {
                    case 0:
                        v0 v0Var = this.f16581b;
                        synchronized (v0Var.f16600a) {
                            v0Var.f16603d = c8299i;
                        }
                        return "DeferrableSurface-termination(" + v0Var + ")";
                    default:
                        v0 v0Var2 = this.f16581b;
                        synchronized (v0Var2.f16600a) {
                            v0Var2.f16605f = c8299i;
                        }
                        return "DeferrableSurface-close(" + v0Var2 + ")";
                }
            }
        });
        if (og.u1.m10946e("DeferrableSurface")) {
            m7420e(f16599n.incrementAndGet(), f16598m.get(), "Surface created");
            c8302lM11697b.f39850b.mo9026a(new u0(this, Log.getStackTraceString(new Exception())), t8.m11872a());
        }
    }

    /* renamed from: a */
    public void mo7416a() {
        C8299i c8299i;
        synchronized (this.f16600a) {
            try {
                if (this.f16602c) {
                    c8299i = null;
                } else {
                    this.f16602c = true;
                    this.f16605f.m15507b(null);
                    if (this.f16601b == 0) {
                        c8299i = this.f16603d;
                        this.f16603d = null;
                    } else {
                        c8299i = null;
                    }
                    if (og.u1.m10946e("DeferrableSurface")) {
                        toString();
                        og.u1.m10942a("DeferrableSurface");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c8299i != null) {
            c8299i.m15507b(null);
        }
    }

    /* renamed from: b */
    public final void m7417b() {
        C8299i c8299i;
        synchronized (this.f16600a) {
            try {
                int i10 = this.f16601b;
                if (i10 == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                int i11 = i10 - 1;
                this.f16601b = i11;
                if (i11 == 0 && this.f16602c) {
                    c8299i = this.f16603d;
                    this.f16603d = null;
                } else {
                    c8299i = null;
                }
                if (og.u1.m10946e("DeferrableSurface")) {
                    toString();
                    og.u1.m10942a("DeferrableSurface");
                    if (this.f16601b == 0) {
                        m7420e(f16599n.get(), f16598m.decrementAndGet(), "Surface no longer in use");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c8299i != null) {
            c8299i.m15507b(null);
        }
    }

    /* renamed from: c */
    public final InterfaceFutureC8957d m7418c() {
        synchronized (this.f16600a) {
            try {
                if (this.f16602c) {
                    return new C4310j(1, new DeferrableSurface$SurfaceClosedException(this, "DeferrableSurface already closed."));
                }
                return mo2229f();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public final void m7419d() {
        synchronized (this.f16600a) {
            try {
                int i10 = this.f16601b;
                if (i10 == 0 && this.f16602c) {
                    throw new DeferrableSurface$SurfaceClosedException(this, "Cannot begin use on a closed surface.");
                }
                this.f16601b = i10 + 1;
                if (og.u1.m10946e("DeferrableSurface")) {
                    if (this.f16601b == 1) {
                        m7420e(f16599n.get(), f16598m.incrementAndGet(), "New surface in use");
                    }
                    toString();
                    og.u1.m10942a("DeferrableSurface");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public final void m7420e(int i10, int i11, String str) {
        if (!f16597l && og.u1.m10946e("DeferrableSurface")) {
            og.u1.m10942a("DeferrableSurface");
        }
        toString();
        og.u1.m10942a("DeferrableSurface");
    }

    /* renamed from: f */
    public abstract InterfaceFutureC8957d mo2229f();
}
