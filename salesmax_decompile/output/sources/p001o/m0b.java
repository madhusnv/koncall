package p001o;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class m0b extends xk3 {

    /* renamed from: a */
    public final s0b f34589a;

    /* renamed from: b */
    public final rl7 f34590b;

    /* renamed from: o.m0b$a */
    public static final class C15189a extends AtomicReference implements q0b, ml3, su5 {

        /* renamed from: a */
        public final ml3 f34591a;

        /* renamed from: b */
        public final rl7 f34592b;

        public C15189a(ml3 ml3Var, rl7 rl7Var) {
            this.f34591a = ml3Var;
            this.f34592b = rl7Var;
        }

        @Override // p001o.q0b
        /* renamed from: a */
        public void mo34822a(su5 su5Var) {
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

        @Override // p001o.q0b
        public void onComplete() {
            this.f34591a.onComplete();
        }

        @Override // p001o.q0b
        public void onError(Throwable th) {
            this.f34591a.onError(th);
        }

        @Override // p001o.q0b
        public void onSuccess(Object obj) {
            try {
                Object objApply = this.f34592b.apply(obj);
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

    public m0b(s0b s0bVar, rl7 rl7Var) {
        this.f34589a = s0bVar;
        this.f34590b = rl7Var;
    }

    @Override // p001o.xk3
    /* renamed from: x */
    public void mo17340x(ml3 ml3Var) {
        C15189a c15189a = new C15189a(ml3Var, this.f34590b);
        ml3Var.mo16368a(c15189a);
        this.f34589a.mo27839a(c15189a);
    }
}
