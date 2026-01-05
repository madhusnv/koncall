package p001o;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p001o.c5f;

/* loaded from: classes6.dex */
public final class h7c extends a9 {

    /* renamed from: b */
    public final long f26333b;

    /* renamed from: c */
    public final TimeUnit f26334c;

    /* renamed from: d */
    public final c5f f26335d;

    /* renamed from: o.h7c$a */
    public static final class RunnableC13889a extends AtomicReference implements Runnable, su5 {

        /* renamed from: a */
        public final Object f26336a;

        /* renamed from: b */
        public final long f26337b;

        /* renamed from: c */
        public final C13890b f26338c;

        /* renamed from: d */
        public final AtomicBoolean f26339d = new AtomicBoolean();

        public RunnableC13889a(Object obj, long j, C13890b c13890b) {
            this.f26336a = obj;
            this.f26337b = j;
            this.f26338c = c13890b;
        }

        /* renamed from: a */
        public void m29898a(su5 su5Var) {
            zu5.replace(this, su5Var);
        }

        @Override // p001o.su5
        public void dispose() {
            zu5.dispose(this);
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return get() == zu5.DISPOSED;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f26339d.compareAndSet(false, true)) {
                this.f26338c.m29899b(this.f26337b, this.f26336a, this);
            }
        }
    }

    /* renamed from: o.h7c$b */
    public static final class C13890b implements m9c, su5 {

        /* renamed from: a */
        public final m9c f26340a;

        /* renamed from: b */
        public final long f26341b;

        /* renamed from: c */
        public final TimeUnit f26342c;

        /* renamed from: d */
        public final c5f.AbstractC12571c f26343d;

        /* renamed from: e */
        public su5 f26344e;

        /* renamed from: f */
        public su5 f26345f;

        /* renamed from: g */
        public volatile long f26346g;

        /* renamed from: h */
        public boolean f26347h;

        public C13890b(m9c m9cVar, long j, TimeUnit timeUnit, c5f.AbstractC12571c abstractC12571c) {
            this.f26340a = m9cVar;
            this.f26341b = j;
            this.f26342c = timeUnit;
            this.f26343d = abstractC12571c;
        }

        @Override // p001o.m9c
        /* renamed from: a */
        public void mo16559a(su5 su5Var) {
            if (zu5.validate(this.f26344e, su5Var)) {
                this.f26344e = su5Var;
                this.f26340a.mo16559a(this);
            }
        }

        /* renamed from: b */
        public void m29899b(long j, Object obj, RunnableC13889a runnableC13889a) {
            if (j == this.f26346g) {
                this.f26340a.mo16560e(obj);
                runnableC13889a.dispose();
            }
        }

        @Override // p001o.su5
        public void dispose() {
            this.f26344e.dispose();
            this.f26343d.dispose();
        }

        @Override // p001o.m9c
        /* renamed from: e */
        public void mo16560e(Object obj) {
            if (this.f26347h) {
                return;
            }
            long j = this.f26346g + 1;
            this.f26346g = j;
            su5 su5Var = this.f26345f;
            if (su5Var != null) {
                su5Var.dispose();
            }
            RunnableC13889a runnableC13889a = new RunnableC13889a(obj, j, this);
            this.f26345f = runnableC13889a;
            runnableC13889a.m29898a(this.f26343d.mo20308d(runnableC13889a, this.f26341b, this.f26342c));
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return this.f26343d.isDisposed();
        }

        @Override // p001o.m9c
        public void onComplete() {
            if (this.f26347h) {
                return;
            }
            this.f26347h = true;
            su5 su5Var = this.f26345f;
            if (su5Var != null) {
                su5Var.dispose();
            }
            RunnableC13889a runnableC13889a = (RunnableC13889a) su5Var;
            if (runnableC13889a != null) {
                runnableC13889a.run();
            }
            this.f26340a.onComplete();
            this.f26343d.dispose();
        }

        @Override // p001o.m9c
        public void onError(Throwable th) {
            if (this.f26347h) {
                fwe.m27599r(th);
                return;
            }
            su5 su5Var = this.f26345f;
            if (su5Var != null) {
                su5Var.dispose();
            }
            this.f26347h = true;
            this.f26340a.onError(th);
            this.f26343d.dispose();
        }
    }

    public h7c(x8c x8cVar, long j, TimeUnit timeUnit, c5f c5fVar) {
        super(x8cVar);
        this.f26333b = j;
        this.f26334c = timeUnit;
        this.f26335d = c5fVar;
    }

    @Override // p001o.x6c
    public void x0(m9c m9cVar) {
        this.f14302a.mo55724b(new C13890b(new qff(m9cVar), this.f26333b, this.f26334c, this.f26335d.mo20301b()));
    }
}
