package m0;

import c0.t0;
import og.u1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: m0.h */
/* loaded from: classes.dex */
public final class C4614h implements t0 {

    /* renamed from: a */
    public final t0 f22853a;

    /* renamed from: b */
    public final Object f22854b = new Object();

    /* renamed from: c */
    public boolean f22855c;

    public C4614h(t0 t0Var) {
        this.f22853a = t0Var;
    }

    /* renamed from: a */
    public final void m9498a() {
        synchronized (this.f22854b) {
            try {
                if (this.f22855c) {
                    t0 t0Var = this.f22853a;
                    if (t0Var != null) {
                        t0Var.clear();
                    } else {
                        u1.m10943b("ScreenFlashWrapper");
                    }
                } else {
                    u1.m10951j("ScreenFlashWrapper");
                }
                this.f22855c = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public final void m9499b() {
        synchronized (this.f22854b) {
        }
    }

    @Override // c0.t0
    public final void clear() {
        m9498a();
    }
}
