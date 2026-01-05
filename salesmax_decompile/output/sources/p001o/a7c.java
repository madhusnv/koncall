package p001o;

/* loaded from: classes6.dex */
public final class a7c extends a9 {

    /* renamed from: b */
    public final ggd f14239b;

    /* renamed from: o.a7c$a */
    public static final class C12104a implements m9c, su5 {

        /* renamed from: a */
        public final m9c f14240a;

        /* renamed from: b */
        public final ggd f14241b;

        /* renamed from: c */
        public su5 f14242c;

        /* renamed from: d */
        public boolean f14243d;

        public C12104a(m9c m9cVar, ggd ggdVar) {
            this.f14240a = m9cVar;
            this.f14241b = ggdVar;
        }

        @Override // p001o.m9c
        /* renamed from: a */
        public void mo16559a(su5 su5Var) {
            if (zu5.validate(this.f14242c, su5Var)) {
                this.f14242c = su5Var;
                this.f14240a.mo16559a(this);
            }
        }

        @Override // p001o.su5
        public void dispose() {
            this.f14242c.dispose();
        }

        @Override // p001o.m9c
        /* renamed from: e */
        public void mo16560e(Object obj) {
            if (this.f14243d) {
                return;
            }
            try {
                if (this.f14241b.test(obj)) {
                    this.f14243d = true;
                    this.f14242c.dispose();
                    this.f14240a.mo16560e(Boolean.TRUE);
                    this.f14240a.onComplete();
                }
            } catch (Throwable th) {
                zk6.m59526b(th);
                this.f14242c.dispose();
                onError(th);
            }
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return this.f14242c.isDisposed();
        }

        @Override // p001o.m9c
        public void onComplete() {
            if (this.f14243d) {
                return;
            }
            this.f14243d = true;
            this.f14240a.mo16560e(Boolean.FALSE);
            this.f14240a.onComplete();
        }

        @Override // p001o.m9c
        public void onError(Throwable th) {
            if (this.f14243d) {
                fwe.m27599r(th);
            } else {
                this.f14243d = true;
                this.f14240a.onError(th);
            }
        }
    }

    public a7c(x8c x8cVar, ggd ggdVar) {
        super(x8cVar);
        this.f14239b = ggdVar;
    }

    @Override // p001o.x6c
    public void x0(m9c m9cVar) {
        this.f14302a.mo55724b(new C12104a(m9cVar, this.f14239b));
    }
}
