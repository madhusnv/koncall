package p001o;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class r8c extends a9 {

    /* renamed from: b */
    public final rl7 f43143b;

    /* renamed from: o.r8c$a */
    public static final class C16553a extends AtomicInteger implements m9c, su5 {

        /* renamed from: a */
        public final m9c f43144a;

        /* renamed from: d */
        public final lag f43147d;

        /* renamed from: g */
        public final x8c f43150g;

        /* renamed from: h */
        public volatile boolean f43151h;

        /* renamed from: b */
        public final AtomicInteger f43145b = new AtomicInteger();

        /* renamed from: c */
        public final ns0 f43146c = new ns0();

        /* renamed from: e */
        public final a f43148e = new a();

        /* renamed from: f */
        public final AtomicReference f43149f = new AtomicReference();

        /* renamed from: o.r8c$a$a */
        public final class a extends AtomicReference implements m9c {
            public a() {
            }

            @Override // p001o.m9c
            /* renamed from: a */
            public void mo16559a(su5 su5Var) {
                zu5.setOnce(this, su5Var);
            }

            @Override // p001o.m9c
            /* renamed from: e */
            public void mo16560e(Object obj) {
                C16553a.this.m46345f();
            }

            @Override // p001o.m9c
            public void onComplete() {
                C16553a.this.m46343b();
            }

            @Override // p001o.m9c
            public void onError(Throwable th) {
                C16553a.this.m46344d(th);
            }
        }

        public C16553a(m9c m9cVar, lag lagVar, x8c x8cVar) {
            this.f43144a = m9cVar;
            this.f43147d = lagVar;
            this.f43150g = x8cVar;
        }

        @Override // p001o.m9c
        /* renamed from: a */
        public void mo16559a(su5 su5Var) {
            zu5.replace(this.f43149f, su5Var);
        }

        /* renamed from: b */
        public void m46343b() {
            zu5.dispose(this.f43149f);
            aw7.m17889a(this.f43144a, this, this.f43146c);
        }

        /* renamed from: d */
        public void m46344d(Throwable th) {
            zu5.dispose(this.f43149f);
            aw7.m17891c(this.f43144a, th, this, this.f43146c);
        }

        @Override // p001o.su5
        public void dispose() {
            zu5.dispose(this.f43149f);
            zu5.dispose(this.f43148e);
        }

        @Override // p001o.m9c
        /* renamed from: e */
        public void mo16560e(Object obj) {
            aw7.m17893e(this.f43144a, obj, this, this.f43146c);
        }

        /* renamed from: f */
        public void m46345f() {
            m46346h();
        }

        /* renamed from: h */
        public void m46346h() {
            if (this.f43145b.getAndIncrement() == 0) {
                while (!isDisposed()) {
                    if (!this.f43151h) {
                        this.f43151h = true;
                        this.f43150g.mo55724b(this);
                    }
                    if (this.f43145b.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return zu5.isDisposed((su5) this.f43149f.get());
        }

        @Override // p001o.m9c
        public void onComplete() {
            zu5.dispose(this.f43148e);
            aw7.m17889a(this.f43144a, this, this.f43146c);
        }

        @Override // p001o.m9c
        public void onError(Throwable th) {
            zu5.replace(this.f43149f, null);
            this.f43151h = false;
            this.f43147d.mo16560e(th);
        }
    }

    public r8c(x8c x8cVar, rl7 rl7Var) {
        super(x8cVar);
        this.f43143b = rl7Var;
    }

    @Override // p001o.x6c
    public void x0(m9c m9cVar) {
        lag lagVarL0 = f3e.N0().L0();
        try {
            Object objApply = this.f43143b.apply(lagVarL0);
            Objects.requireNonNull(objApply, "The handler returned a null ObservableSource");
            x8c x8cVar = (x8c) objApply;
            C16553a c16553a = new C16553a(m9cVar, lagVarL0, this.f14302a);
            m9cVar.mo16559a(c16553a);
            x8cVar.mo55724b(c16553a.f43148e);
            c16553a.m46346h();
        } catch (Throwable th) {
            zk6.m59526b(th);
            h66.error(th, m9cVar);
        }
    }
}
