package p001o;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class tl3 extends xk3 {

    /* renamed from: a */
    public final long f47363a;

    /* renamed from: b */
    public final TimeUnit f47364b;

    /* renamed from: c */
    public final c5f f47365c;

    /* renamed from: o.tl3$a */
    public static final class RunnableC17149a extends AtomicReference implements su5, Runnable {

        /* renamed from: a */
        public final ml3 f47366a;

        public RunnableC17149a(ml3 ml3Var) {
            this.f47366a = ml3Var;
        }

        /* renamed from: a */
        public void m50155a(su5 su5Var) {
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

        @Override // java.lang.Runnable
        public void run() {
            this.f47366a.onComplete();
        }
    }

    public tl3(long j, TimeUnit timeUnit, c5f c5fVar) {
        this.f47363a = j;
        this.f47364b = timeUnit;
        this.f47365c = c5fVar;
    }

    @Override // p001o.xk3
    /* renamed from: x */
    public void mo17340x(ml3 ml3Var) {
        RunnableC17149a runnableC17149a = new RunnableC17149a(ml3Var);
        ml3Var.mo16368a(runnableC17149a);
        runnableC17149a.m50155a(this.f47365c.mo20303d(runnableC17149a, this.f47363a, this.f47364b));
    }
}
