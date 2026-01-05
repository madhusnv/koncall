package p001o;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class rl3 extends xk3 {

    /* renamed from: a */
    public final ql3 f43767a;

    /* renamed from: b */
    public final c5f f43768b;

    /* renamed from: o.rl3$a */
    public static final class RunnableC16622a extends AtomicReference implements ml3, su5, Runnable {

        /* renamed from: a */
        public final ml3 f43769a;

        /* renamed from: b */
        public final ref f43770b = new ref();

        /* renamed from: c */
        public final ql3 f43771c;

        public RunnableC16622a(ml3 ml3Var, ql3 ql3Var) {
            this.f43769a = ml3Var;
            this.f43771c = ql3Var;
        }

        @Override // p001o.ml3
        /* renamed from: a */
        public void mo16368a(su5 su5Var) {
            zu5.setOnce(this, su5Var);
        }

        @Override // p001o.su5
        public void dispose() {
            zu5.dispose(this);
            this.f43770b.dispose();
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return zu5.isDisposed((su5) get());
        }

        @Override // p001o.ml3
        public void onComplete() {
            this.f43769a.onComplete();
        }

        @Override // p001o.ml3
        public void onError(Throwable th) {
            this.f43769a.onError(th);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f43771c.mo45628a(this);
        }
    }

    public rl3(ql3 ql3Var, c5f c5fVar) {
        this.f43767a = ql3Var;
        this.f43768b = c5fVar;
    }

    @Override // p001o.xk3
    /* renamed from: x */
    public void mo17340x(ml3 ml3Var) {
        RunnableC16622a runnableC16622a = new RunnableC16622a(ml3Var, this.f43767a);
        ml3Var.mo16368a(runnableC16622a);
        runnableC16622a.f43770b.m46621a(this.f43768b.mo20302c(runnableC16622a));
    }
}
