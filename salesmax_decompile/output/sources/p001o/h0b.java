package p001o;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class h0b extends g0b {

    /* renamed from: a */
    public final r0b f26049a;

    /* renamed from: o.h0b$a */
    public static final class C13838a extends AtomicReference implements i0b, su5 {

        /* renamed from: a */
        public final q0b f26050a;

        public C13838a(q0b q0bVar) {
            this.f26050a = q0bVar;
        }

        /* renamed from: a */
        public boolean m29721a(Throwable th) {
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
                this.f26050a.onError(th);
            } finally {
                if (su5Var != null) {
                    su5Var.dispose();
                }
            }
        }

        @Override // p001o.su5
        public void dispose() {
            zu5.dispose(this);
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return zu5.isDisposed((su5) get());
        }

        @Override // p001o.i0b
        public void onComplete() {
            su5 su5Var;
            Object obj = get();
            zu5 zu5Var = zu5.DISPOSED;
            if (obj == zu5Var || (su5Var = (su5) getAndSet(zu5Var)) == zu5Var) {
                return;
            }
            try {
                this.f26050a.onComplete();
            } finally {
                if (su5Var != null) {
                    su5Var.dispose();
                }
            }
        }

        @Override // p001o.i0b
        public void onError(Throwable th) {
            if (m29721a(th)) {
                return;
            }
            fwe.m27599r(th);
        }

        @Override // p001o.i0b
        public void onSuccess(Object obj) {
            su5 su5Var;
            Object obj2 = get();
            zu5 zu5Var = zu5.DISPOSED;
            if (obj2 == zu5Var || (su5Var = (su5) getAndSet(zu5Var)) == zu5Var) {
                return;
            }
            try {
                if (obj == null) {
                    this.f26050a.onError(xk6.m56414b("onSuccess called with a null value."));
                } else {
                    this.f26050a.onSuccess(obj);
                }
                if (su5Var != null) {
                    su5Var.dispose();
                }
            } catch (Throwable th) {
                if (su5Var != null) {
                    su5Var.dispose();
                }
                throw th;
            }
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", C13838a.class.getSimpleName(), super.toString());
        }
    }

    public h0b(r0b r0bVar) {
        this.f26049a = r0bVar;
    }

    @Override // p001o.g0b
    /* renamed from: l */
    public void mo26168l(q0b q0bVar) {
        C13838a c13838a = new C13838a(q0bVar);
        q0bVar.mo34822a(c13838a);
        try {
            this.f26049a.mo12391a(c13838a);
        } catch (Throwable th) {
            zk6.m59526b(th);
            c13838a.onError(th);
        }
    }
}
