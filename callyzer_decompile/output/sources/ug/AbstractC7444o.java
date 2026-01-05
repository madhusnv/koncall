package ug;

import android.os.Handler;
import l0.RunnableC4307g;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ug.o */
/* loaded from: classes.dex */
public abstract class AbstractC7444o {

    /* renamed from: d */
    public static volatile com.google.android.gms.internal.measurement.h0 f35720d;

    /* renamed from: a */
    public final u1 f35721a;

    /* renamed from: b */
    public final RunnableC4307g f35722b;

    /* renamed from: c */
    public volatile long f35723c;

    public AbstractC7444o(u1 u1Var) {
        AbstractC6840z.m13036g(u1Var);
        this.f35721a = u1Var;
        this.f35722b = new RunnableC4307g(15, this, u1Var, false);
    }

    /* renamed from: a */
    public abstract void mo13868a();

    /* renamed from: b */
    public final void m14096b(long j6) {
        m14097c();
        if (j6 >= 0) {
            u1 u1Var = this.f35721a;
            u1Var.mo334l().getClass();
            this.f35723c = System.currentTimeMillis();
            if (m14098d().postDelayed(this.f35722b, j6)) {
                return;
            }
            u1Var.mo326a().f35862f.m14141b(Long.valueOf(j6), "Failed to schedule delayed post. time");
        }
    }

    /* renamed from: c */
    public final void m14097c() {
        this.f35723c = 0L;
        m14098d().removeCallbacks(this.f35722b);
    }

    /* renamed from: d */
    public final Handler m14098d() {
        com.google.android.gms.internal.measurement.h0 h0Var;
        if (f35720d != null) {
            return f35720d;
        }
        synchronized (AbstractC7444o.class) {
            try {
                if (f35720d == null) {
                    f35720d = new com.google.android.gms.internal.measurement.h0(this.f35721a.mo333j().getMainLooper(), 0);
                }
                h0Var = f35720d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return h0Var;
    }
}
