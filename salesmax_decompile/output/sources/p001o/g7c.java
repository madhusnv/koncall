package p001o;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class g7c extends x6c {

    /* renamed from: a */
    public final m8c f24682a;

    /* renamed from: o.g7c$a */
    public static final class C13633a extends AtomicReference implements q7c, su5 {

        /* renamed from: a */
        public final m9c f24683a;

        public C13633a(m9c m9cVar) {
            this.f24683a = m9cVar;
        }

        @Override // p001o.q7c
        /* renamed from: a */
        public boolean mo28139a(Throwable th) {
            if (th == null) {
                th = xk6.m56414b("onError called with a null Throwable.");
            }
            if (isDisposed()) {
                return false;
            }
            try {
                this.f24683a.onError(th);
                dispose();
                return true;
            } catch (Throwable th2) {
                dispose();
                throw th2;
            }
        }

        @Override // p001o.q7c
        /* renamed from: b */
        public void mo28140b(vb2 vb2Var) {
            mo28141d(new cc2(vb2Var));
        }

        @Override // p001o.q7c
        /* renamed from: d */
        public void mo28141d(su5 su5Var) {
            zu5.set(this, su5Var);
        }

        @Override // p001o.su5
        public void dispose() {
            zu5.dispose(this);
        }

        @Override // p001o.i56
        /* renamed from: e */
        public void mo16430e(Object obj) {
            if (obj == null) {
                onError(xk6.m56414b("onNext called with a null value."));
            } else {
                if (isDisposed()) {
                    return;
                }
                this.f24683a.mo16560e(obj);
            }
        }

        @Override // p001o.q7c, p001o.su5
        public boolean isDisposed() {
            return zu5.isDisposed((su5) get());
        }

        @Override // p001o.i56
        public void onComplete() {
            if (isDisposed()) {
                return;
            }
            try {
                this.f24683a.onComplete();
            } finally {
                dispose();
            }
        }

        @Override // p001o.i56
        public void onError(Throwable th) {
            if (mo28139a(th)) {
                return;
            }
            fwe.m27599r(th);
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", C13633a.class.getSimpleName(), super.toString());
        }
    }

    public g7c(m8c m8cVar) {
        this.f24682a = m8cVar;
    }

    @Override // p001o.x6c
    public void x0(m9c m9cVar) {
        C13633a c13633a = new C13633a(m9cVar);
        m9cVar.mo16559a(c13633a);
        try {
            this.f24682a.mo12393a(c13633a);
        } catch (Throwable th) {
            zk6.m59526b(th);
            c13633a.onError(th);
        }
    }
}
