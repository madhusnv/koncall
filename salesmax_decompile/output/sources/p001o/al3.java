package p001o;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class al3 extends xk3 {

    /* renamed from: a */
    public final nl3 f14908a;

    /* renamed from: o.al3$a */
    public static final class C12213a extends AtomicReference implements fl3, su5 {

        /* renamed from: a */
        public final ml3 f14909a;

        public C12213a(ml3 ml3Var) {
            this.f14909a = ml3Var;
        }

        @Override // p001o.fl3
        /* renamed from: a */
        public boolean mo17341a(Throwable th) {
            su5 su5Var;
            if (th == null) {
                th = xk6.m56414b("onError called with a null Throwable.");
            }
            Object obj = get();
            zu5 zu5Var = zu5.DISPOSED;
            if (obj == zu5Var || (su5Var = (su5) getAndSet(zu5Var)) == zu5Var) {
                return false;
            }
            try {
                this.f14909a.onError(th);
            } finally {
                if (su5Var != null) {
                    su5Var.dispose();
                }
            }
        }

        @Override // p001o.fl3
        /* renamed from: b */
        public void mo17342b(vb2 vb2Var) {
            mo17343d(new cc2(vb2Var));
        }

        @Override // p001o.fl3
        /* renamed from: d */
        public void mo17343d(su5 su5Var) {
            zu5.set(this, su5Var);
        }

        @Override // p001o.su5
        public void dispose() {
            zu5.dispose(this);
        }

        @Override // p001o.fl3, p001o.su5
        public boolean isDisposed() {
            return zu5.isDisposed((su5) get());
        }

        @Override // p001o.fl3
        public void onComplete() {
            su5 su5Var;
            Object obj = get();
            zu5 zu5Var = zu5.DISPOSED;
            if (obj == zu5Var || (su5Var = (su5) getAndSet(zu5Var)) == zu5Var) {
                return;
            }
            try {
                this.f14909a.onComplete();
            } finally {
                if (su5Var != null) {
                    su5Var.dispose();
                }
            }
        }

        @Override // p001o.fl3
        public void onError(Throwable th) {
            if (mo17341a(th)) {
                return;
            }
            fwe.m27599r(th);
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", C12213a.class.getSimpleName(), super.toString());
        }
    }

    public al3(nl3 nl3Var) {
        this.f14908a = nl3Var;
    }

    @Override // p001o.xk3
    /* renamed from: x */
    public void mo17340x(ml3 ml3Var) {
        C12213a c12213a = new C12213a(ml3Var);
        ml3Var.mo16368a(c12213a);
        try {
            this.f14908a.mo12392a(c12213a);
        } catch (Throwable th) {
            zk6.m59526b(th);
            c12213a.onError(th);
        }
    }
}
