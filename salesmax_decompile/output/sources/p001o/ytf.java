package p001o;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class ytf extends wtf {

    /* renamed from: a */
    public final muf f55946a;

    /* renamed from: o.ytf$a */
    public static final class C18489a extends AtomicReference implements auf, su5 {

        /* renamed from: a */
        public final luf f55947a;

        public C18489a(luf lufVar) {
            this.f55947a = lufVar;
        }

        @Override // p001o.auf
        /* renamed from: a */
        public boolean mo17847a(Throwable th) {
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
                this.f55947a.onError(th);
            } finally {
                if (su5Var != null) {
                    su5Var.dispose();
                }
            }
        }

        @Override // p001o.auf
        /* renamed from: b */
        public void mo17848b(vb2 vb2Var) {
            mo17849d(new cc2(vb2Var));
        }

        @Override // p001o.auf
        /* renamed from: d */
        public void mo17849d(su5 su5Var) {
            zu5.set(this, su5Var);
        }

        @Override // p001o.su5
        public void dispose() {
            zu5.dispose(this);
        }

        @Override // p001o.auf, p001o.su5
        public boolean isDisposed() {
            return zu5.isDisposed((su5) get());
        }

        @Override // p001o.auf
        public void onError(Throwable th) {
            if (mo17847a(th)) {
                return;
            }
            fwe.m27599r(th);
        }

        @Override // p001o.auf
        public void onSuccess(Object obj) {
            su5 su5Var;
            Object obj2 = get();
            zu5 zu5Var = zu5.DISPOSED;
            if (obj2 == zu5Var || (su5Var = (su5) getAndSet(zu5Var)) == zu5Var) {
                return;
            }
            try {
                if (obj == null) {
                    this.f55947a.onError(xk6.m56414b("onSuccess called with a null value."));
                } else {
                    this.f55947a.onSuccess(obj);
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
            return String.format("%s{%s}", C18489a.class.getSimpleName(), super.toString());
        }
    }

    public ytf(muf mufVar) {
        this.f55946a = mufVar;
    }

    @Override // p001o.wtf
    /* renamed from: v */
    public void mo18257v(luf lufVar) {
        C18489a c18489a = new C18489a(lufVar);
        lufVar.mo17881a(c18489a);
        try {
            this.f55946a.mo12390a(c18489a);
        } catch (Throwable th) {
            zk6.m59526b(th);
            c18489a.onError(th);
        }
    }
}
