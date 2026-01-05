package c0;

import java.util.concurrent.Executor;
import l0.RunnableC4307g;
import nf.C5047i;
import pg.t8;
import zh.InterfaceFutureC8957d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class q0 extends m0 {

    /* renamed from: B */
    public b1 f5195B;

    /* renamed from: C */
    public p0 f5196C;

    /* renamed from: y */
    public final Executor f5197y;

    /* renamed from: z */
    public final Object f5198z = new Object();

    public q0(Executor executor) {
        this.f5197y = executor;
    }

    @Override // c0.m0
    /* renamed from: a */
    public final b1 mo2211a(i0.d1 d1Var) {
        return d1Var.mo1878h();
    }

    @Override // c0.m0
    /* renamed from: c */
    public final void mo2213c() {
        synchronized (this.f5198z) {
            try {
                b1 b1Var = this.f5195B;
                if (b1Var != null) {
                    b1Var.close();
                    this.f5195B = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // c0.m0
    /* renamed from: f */
    public final void mo2215f(b1 b1Var) {
        synchronized (this.f5198z) {
            try {
                if (!this.f5177x) {
                    b1Var.close();
                    return;
                }
                if (this.f5196C != null) {
                    if (b1Var.mo2135X().mo2195c() <= this.f5196C.f5064b.mo2135X().mo2195c()) {
                        b1Var.close();
                    } else {
                        b1 b1Var2 = this.f5195B;
                        if (b1Var2 != null) {
                            b1Var2.close();
                        }
                        this.f5195B = b1Var;
                    }
                    return;
                }
                p0 p0Var = new p0(b1Var, this);
                this.f5196C = p0Var;
                InterfaceFutureC8957d interfaceFutureC8957dM2212b = m2212b(p0Var);
                C5047i c5047i = new C5047i(5, p0Var);
                interfaceFutureC8957dM2212b.mo9026a(new RunnableC4307g(0, interfaceFutureC8957dM2212b, c5047i), t8.m11872a());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
