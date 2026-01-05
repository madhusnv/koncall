package p001o;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class yk3 extends xk3 {

    /* renamed from: a */
    public final ql3 f55625a;

    /* renamed from: b */
    public final ql3 f55626b;

    /* renamed from: o.yk3$a */
    public static final class C18423a implements ml3 {

        /* renamed from: a */
        public final AtomicReference f55627a;

        /* renamed from: b */
        public final ml3 f55628b;

        public C18423a(AtomicReference atomicReference, ml3 ml3Var) {
            this.f55627a = atomicReference;
            this.f55628b = ml3Var;
        }

        @Override // p001o.ml3
        /* renamed from: a */
        public void mo16368a(su5 su5Var) {
            zu5.replace(this.f55627a, su5Var);
        }

        @Override // p001o.ml3
        public void onComplete() {
            this.f55628b.onComplete();
        }

        @Override // p001o.ml3
        public void onError(Throwable th) {
            this.f55628b.onError(th);
        }
    }

    /* renamed from: o.yk3$b */
    public static final class C18424b extends AtomicReference implements ml3, su5 {

        /* renamed from: a */
        public final ml3 f55629a;

        /* renamed from: b */
        public final ql3 f55630b;

        public C18424b(ml3 ml3Var, ql3 ql3Var) {
            this.f55629a = ml3Var;
            this.f55630b = ql3Var;
        }

        @Override // p001o.ml3
        /* renamed from: a */
        public void mo16368a(su5 su5Var) {
            if (zu5.setOnce(this, su5Var)) {
                this.f55629a.mo16368a(this);
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

        @Override // p001o.ml3
        public void onComplete() {
            this.f55630b.mo45628a(new C18423a(this, this.f55629a));
        }

        @Override // p001o.ml3
        public void onError(Throwable th) {
            this.f55629a.onError(th);
        }
    }

    public yk3(ql3 ql3Var, ql3 ql3Var2) {
        this.f55625a = ql3Var;
        this.f55626b = ql3Var2;
    }

    @Override // p001o.xk3
    /* renamed from: x */
    public void mo17340x(ml3 ml3Var) {
        this.f55625a.mo45628a(new C18424b(ml3Var, this.f55626b));
    }
}
