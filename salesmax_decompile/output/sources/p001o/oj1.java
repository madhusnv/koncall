package p001o;

import java.util.concurrent.locks.LockSupport;

/* loaded from: classes6.dex */
public final class oj1 extends h7 {

    /* renamed from: d */
    public final Thread f38435d;

    /* renamed from: e */
    public final ek6 f38436e;

    public oj1(q74 q74Var, Thread thread, ek6 ek6Var) {
        super(q74Var, true, true);
        this.f38435d = thread;
        this.f38436e = ek6Var;
    }

    public final Object W0() throws Throwable {
        v9.m52465a();
        try {
            ek6 ek6Var = this.f38436e;
            if (ek6Var != null) {
                ek6.E0(ek6Var, false, 1, null);
            }
            while (!Thread.interrupted()) {
                try {
                    ek6 ek6Var2 = this.f38436e;
                    long jH0 = ek6Var2 != null ? ek6Var2.H0() : Long.MAX_VALUE;
                    if (mo22414J()) {
                        v9.m52465a();
                        Object objM24481h = e79.m24481h(i0());
                        lm3Var = objM24481h instanceof lm3 ? (lm3) objM24481h : null;
                        if (lm3Var == null) {
                            return objM24481h;
                        }
                        throw lm3Var.f34036a;
                    }
                    v9.m52465a();
                    LockSupport.parkNanos(this, jH0);
                } finally {
                    ek6 ek6Var3 = this.f38436e;
                    if (ek6Var3 != null) {
                        ek6.u0(ek6Var3, false, 1, null);
                    }
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            m22413I(interruptedException);
            throw interruptedException;
        } catch (Throwable th) {
            v9.m52465a();
            throw th;
        }
    }

    @Override // p001o.d79
    public boolean r0() {
        return true;
    }

    @Override // p001o.d79
    /* renamed from: z */
    public void mo17837z(Object obj) {
        if (sq8.m48644c(Thread.currentThread(), this.f38435d)) {
            return;
        }
        Thread thread = this.f38435d;
        v9.m52465a();
        LockSupport.unpark(thread);
    }
}
