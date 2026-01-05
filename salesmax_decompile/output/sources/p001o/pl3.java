package p001o;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class pl3 extends xk3 {

    /* renamed from: a */
    public final ql3 f40220a;

    /* renamed from: b */
    public final rl7 f40221b;

    /* renamed from: o.pl3$a */
    public static final class C16132a extends AtomicReference implements ml3, su5 {

        /* renamed from: a */
        public final ml3 f40222a;

        /* renamed from: b */
        public final rl7 f40223b;

        /* renamed from: c */
        public boolean f40224c;

        public C16132a(ml3 ml3Var, rl7 rl7Var) {
            this.f40222a = ml3Var;
            this.f40223b = rl7Var;
        }

        @Override // p001o.ml3
        /* renamed from: a */
        public void mo16368a(su5 su5Var) {
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
            this.f40222a.onComplete();
        }

        @Override // p001o.ml3
        public void onError(Throwable th) {
            if (this.f40224c) {
                this.f40222a.onError(th);
                return;
            }
            this.f40224c = true;
            try {
                Object objApply = this.f40223b.apply(th);
                Objects.requireNonNull(objApply, "The errorMapper returned a null CompletableSource");
                ((ql3) objApply).mo45628a(this);
            } catch (Throwable th2) {
                zk6.m59526b(th2);
                this.f40222a.onError(new mo3(th, th2));
            }
        }
    }

    public pl3(ql3 ql3Var, rl7 rl7Var) {
        this.f40220a = ql3Var;
        this.f40221b = rl7Var;
    }

    @Override // p001o.xk3
    /* renamed from: x */
    public void mo17340x(ml3 ml3Var) {
        C16132a c16132a = new C16132a(ml3Var, this.f40221b);
        ml3Var.mo16368a(c16132a);
        this.f40220a.mo45628a(c16132a);
    }
}
