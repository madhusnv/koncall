package p001o;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
public final class sl3 extends xk3 {

    /* renamed from: a */
    public final ql3 f45538a;

    /* renamed from: b */
    public final long f45539b;

    /* renamed from: c */
    public final TimeUnit f45540c;

    /* renamed from: d */
    public final c5f f45541d;

    /* renamed from: e */
    public final ql3 f45542e;

    /* renamed from: o.sl3$a */
    public final class RunnableC16858a implements Runnable {

        /* renamed from: a */
        public final AtomicBoolean f45543a;

        /* renamed from: b */
        public final ko3 f45544b;

        /* renamed from: c */
        public final ml3 f45545c;

        /* renamed from: o.sl3$a$a */
        public final class a implements ml3 {
            public a() {
            }

            @Override // p001o.ml3
            /* renamed from: a */
            public void mo16368a(su5 su5Var) {
                RunnableC16858a.this.f45544b.mo30304a(su5Var);
            }

            @Override // p001o.ml3
            public void onComplete() {
                RunnableC16858a.this.f45544b.dispose();
                RunnableC16858a.this.f45545c.onComplete();
            }

            @Override // p001o.ml3
            public void onError(Throwable th) {
                RunnableC16858a.this.f45544b.dispose();
                RunnableC16858a.this.f45545c.onError(th);
            }
        }

        public RunnableC16858a(AtomicBoolean atomicBoolean, ko3 ko3Var, ml3 ml3Var) {
            this.f45543a = atomicBoolean;
            this.f45544b = ko3Var;
            this.f45545c = ml3Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f45543a.compareAndSet(false, true)) {
                this.f45544b.m35969e();
                ql3 ql3Var = sl3.this.f45542e;
                if (ql3Var != null) {
                    ql3Var.mo45628a(new a());
                    return;
                }
                ml3 ml3Var = this.f45545c;
                sl3 sl3Var = sl3.this;
                ml3Var.onError(new TimeoutException(xk6.m56419g(sl3Var.f45539b, sl3Var.f45540c)));
            }
        }
    }

    /* renamed from: o.sl3$b */
    public static final class C16859b implements ml3 {

        /* renamed from: a */
        public final ko3 f45548a;

        /* renamed from: b */
        public final AtomicBoolean f45549b;

        /* renamed from: c */
        public final ml3 f45550c;

        public C16859b(ko3 ko3Var, AtomicBoolean atomicBoolean, ml3 ml3Var) {
            this.f45548a = ko3Var;
            this.f45549b = atomicBoolean;
            this.f45550c = ml3Var;
        }

        @Override // p001o.ml3
        /* renamed from: a */
        public void mo16368a(su5 su5Var) {
            this.f45548a.mo30304a(su5Var);
        }

        @Override // p001o.ml3
        public void onComplete() {
            if (this.f45549b.compareAndSet(false, true)) {
                this.f45548a.dispose();
                this.f45550c.onComplete();
            }
        }

        @Override // p001o.ml3
        public void onError(Throwable th) {
            if (!this.f45549b.compareAndSet(false, true)) {
                fwe.m27599r(th);
            } else {
                this.f45548a.dispose();
                this.f45550c.onError(th);
            }
        }
    }

    public sl3(ql3 ql3Var, long j, TimeUnit timeUnit, c5f c5fVar, ql3 ql3Var2) {
        this.f45538a = ql3Var;
        this.f45539b = j;
        this.f45540c = timeUnit;
        this.f45541d = c5fVar;
        this.f45542e = ql3Var2;
    }

    @Override // p001o.xk3
    /* renamed from: x */
    public void mo17340x(ml3 ml3Var) {
        ko3 ko3Var = new ko3();
        ml3Var.mo16368a(ko3Var);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        ko3Var.mo30304a(this.f45541d.mo20303d(new RunnableC16858a(atomicBoolean, ko3Var, ml3Var), this.f45539b, this.f45540c));
        this.f45538a.mo45628a(new C16859b(ko3Var, atomicBoolean, ml3Var));
    }
}
