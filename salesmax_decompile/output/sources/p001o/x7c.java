package p001o;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class x7c extends xk3 implements om7 {

    /* renamed from: a */
    public final x8c f53301a;

    /* renamed from: b */
    public final rl7 f53302b;

    /* renamed from: c */
    public final boolean f53303c;

    /* renamed from: o.x7c$a */
    public static final class C18071a extends AtomicInteger implements su5, m9c {

        /* renamed from: a */
        public final ml3 f53304a;

        /* renamed from: c */
        public final rl7 f53306c;

        /* renamed from: d */
        public final boolean f53307d;

        /* renamed from: f */
        public su5 f53309f;

        /* renamed from: g */
        public volatile boolean f53310g;

        /* renamed from: b */
        public final ns0 f53305b = new ns0();

        /* renamed from: e */
        public final ko3 f53308e = new ko3();

        /* renamed from: o.x7c$a$a */
        public final class a extends AtomicReference implements ml3, su5 {
            public a() {
            }

            @Override // p001o.ml3
            /* renamed from: a */
            public void mo16368a(su5 su5Var) {
                zu5.setOnce(this, su5Var);
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
                C18071a.this.m55795b(this);
            }

            @Override // p001o.ml3
            public void onError(Throwable th) {
                C18071a.this.m55796d(this, th);
            }
        }

        public C18071a(ml3 ml3Var, rl7 rl7Var, boolean z) {
            this.f53304a = ml3Var;
            this.f53306c = rl7Var;
            this.f53307d = z;
            lazySet(1);
        }

        @Override // p001o.m9c
        /* renamed from: a */
        public void mo16559a(su5 su5Var) {
            if (zu5.validate(this.f53309f, su5Var)) {
                this.f53309f = su5Var;
                this.f53304a.mo16368a(this);
            }
        }

        /* renamed from: b */
        public void m55795b(a aVar) {
            this.f53308e.mo30305b(aVar);
            onComplete();
        }

        /* renamed from: d */
        public void m55796d(a aVar, Throwable th) {
            this.f53308e.mo30305b(aVar);
            onError(th);
        }

        @Override // p001o.su5
        public void dispose() {
            this.f53310g = true;
            this.f53309f.dispose();
            this.f53308e.dispose();
            this.f53305b.m41018d();
        }

        @Override // p001o.m9c
        /* renamed from: e */
        public void mo16560e(Object obj) {
            try {
                Object objApply = this.f53306c.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null CompletableSource");
                ql3 ql3Var = (ql3) objApply;
                getAndIncrement();
                a aVar = new a();
                if (this.f53310g || !this.f53308e.mo30304a(aVar)) {
                    return;
                }
                ql3Var.mo45628a(aVar);
            } catch (Throwable th) {
                zk6.m59526b(th);
                this.f53309f.dispose();
                onError(th);
            }
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return this.f53309f.isDisposed();
        }

        @Override // p001o.m9c
        public void onComplete() {
            if (decrementAndGet() == 0) {
                this.f53305b.m41019e(this.f53304a);
            }
        }

        @Override // p001o.m9c
        public void onError(Throwable th) {
            if (this.f53305b.m41017c(th)) {
                if (this.f53307d) {
                    if (decrementAndGet() == 0) {
                        this.f53305b.m41019e(this.f53304a);
                    }
                } else {
                    this.f53310g = true;
                    this.f53309f.dispose();
                    this.f53308e.dispose();
                    this.f53305b.m41019e(this.f53304a);
                }
            }
        }
    }

    public x7c(x8c x8cVar, rl7 rl7Var, boolean z) {
        this.f53301a = x8cVar;
        this.f53302b = rl7Var;
        this.f53303c = z;
    }

    @Override // p001o.om7
    /* renamed from: b */
    public x6c mo18256b() {
        return fwe.m27595n(new w7c(this.f53301a, this.f53302b, this.f53303c));
    }

    @Override // p001o.xk3
    /* renamed from: x */
    public void mo17340x(ml3 ml3Var) {
        this.f53301a.mo55724b(new C18071a(ml3Var, this.f53302b, this.f53303c));
    }
}
