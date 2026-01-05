package p001o;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class duf extends xk3 {

    /* renamed from: a */
    public final xuf f20556a;

    /* renamed from: b */
    public final rl7 f20557b;

    /* renamed from: o.duf$a */
    public static final class C13039a extends AtomicReference implements luf, ml3, su5 {

        /* renamed from: a */
        public final ml3 f20558a;

        /* renamed from: b */
        public final rl7 f20559b;

        public C13039a(ml3 ml3Var, rl7 rl7Var) {
            this.f20558a = ml3Var;
            this.f20559b = rl7Var;
        }

        @Override // p001o.luf
        /* renamed from: a */
        public void mo17881a(su5 su5Var) {
            zu5.replace(this, su5Var);
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
            this.f20558a.onComplete();
        }

        @Override // p001o.luf
        public void onError(Throwable th) {
            this.f20558a.onError(th);
        }

        @Override // p001o.luf
        public void onSuccess(Object obj) {
            try {
                Object objApply = this.f20559b.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null CompletableSource");
                ql3 ql3Var = (ql3) objApply;
                if (isDisposed()) {
                    return;
                }
                ql3Var.mo45628a(this);
            } catch (Throwable th) {
                zk6.m59526b(th);
                onError(th);
            }
        }
    }

    public duf(xuf xufVar, rl7 rl7Var) {
        this.f20556a = xufVar;
        this.f20557b = rl7Var;
    }

    @Override // p001o.xk3
    /* renamed from: x */
    public void mo17340x(ml3 ml3Var) {
        C13039a c13039a = new C13039a(ml3Var, this.f20557b);
        ml3Var.mo16368a(c13039a);
        this.f20556a.mo55011a(c13039a);
    }
}
