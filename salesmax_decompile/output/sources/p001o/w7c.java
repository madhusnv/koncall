package p001o;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class w7c extends a9 {

    /* renamed from: b */
    public final rl7 f51569b;

    /* renamed from: c */
    public final boolean f51570c;

    /* renamed from: o.w7c$a */
    public static final class C17795a extends nf1 implements m9c {

        /* renamed from: a */
        public final m9c f51571a;

        /* renamed from: c */
        public final rl7 f51573c;

        /* renamed from: d */
        public final boolean f51574d;

        /* renamed from: f */
        public su5 f51576f;

        /* renamed from: g */
        public volatile boolean f51577g;

        /* renamed from: b */
        public final ns0 f51572b = new ns0();

        /* renamed from: e */
        public final ko3 f51575e = new ko3();

        /* renamed from: o.w7c$a$a */
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
                C17795a.this.m54044b(this);
            }

            @Override // p001o.ml3
            public void onError(Throwable th) {
                C17795a.this.m54045d(this, th);
            }
        }

        public C17795a(m9c m9cVar, rl7 rl7Var, boolean z) {
            this.f51571a = m9cVar;
            this.f51573c = rl7Var;
            this.f51574d = z;
            lazySet(1);
        }

        @Override // p001o.m9c
        /* renamed from: a */
        public void mo16559a(su5 su5Var) {
            if (zu5.validate(this.f51576f, su5Var)) {
                this.f51576f = su5Var;
                this.f51571a.mo16559a(this);
            }
        }

        /* renamed from: b */
        public void m54044b(a aVar) {
            this.f51575e.mo30305b(aVar);
            onComplete();
        }

        @Override // p001o.rtf
        public void clear() {
        }

        /* renamed from: d */
        public void m54045d(a aVar, Throwable th) {
            this.f51575e.mo30305b(aVar);
            onError(th);
        }

        @Override // p001o.su5
        public void dispose() {
            this.f51577g = true;
            this.f51576f.dispose();
            this.f51575e.dispose();
            this.f51572b.m41018d();
        }

        @Override // p001o.m9c
        /* renamed from: e */
        public void mo16560e(Object obj) {
            try {
                Object objApply = this.f51573c.apply(obj);
                Objects.requireNonNull(objApply, "The mapper returned a null CompletableSource");
                ql3 ql3Var = (ql3) objApply;
                getAndIncrement();
                a aVar = new a();
                if (this.f51577g || !this.f51575e.mo30304a(aVar)) {
                    return;
                }
                ql3Var.mo45628a(aVar);
            } catch (Throwable th) {
                zk6.m59526b(th);
                this.f51576f.dispose();
                onError(th);
            }
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return this.f51576f.isDisposed();
        }

        @Override // p001o.rtf
        public boolean isEmpty() {
            return true;
        }

        @Override // p001o.m9c
        public void onComplete() {
            if (decrementAndGet() == 0) {
                this.f51572b.m41020f(this.f51571a);
            }
        }

        @Override // p001o.m9c
        public void onError(Throwable th) {
            if (this.f51572b.m41017c(th)) {
                if (this.f51574d) {
                    if (decrementAndGet() == 0) {
                        this.f51572b.m41020f(this.f51571a);
                    }
                } else {
                    this.f51577g = true;
                    this.f51576f.dispose();
                    this.f51575e.dispose();
                    this.f51572b.m41020f(this.f51571a);
                }
            }
        }

        @Override // p001o.rtf
        public Object poll() {
            return null;
        }

        @Override // p001o.f5e
        public int requestFusion(int i) {
            return i & 2;
        }
    }

    public w7c(x8c x8cVar, rl7 rl7Var, boolean z) {
        super(x8cVar);
        this.f51569b = rl7Var;
        this.f51570c = z;
    }

    @Override // p001o.x6c
    public void x0(m9c m9cVar) {
        this.f14302a.mo55724b(new C17795a(m9cVar, this.f51569b, this.f51570c));
    }
}
