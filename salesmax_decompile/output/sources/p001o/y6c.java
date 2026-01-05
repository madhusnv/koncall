package p001o;

/* loaded from: classes6.dex */
public final class y6c extends a9 {

    /* renamed from: b */
    public final ggd f55000b;

    /* renamed from: o.y6c$a */
    public static final class C18344a implements m9c, su5 {

        /* renamed from: a */
        public final m9c f55001a;

        /* renamed from: b */
        public final ggd f55002b;

        /* renamed from: c */
        public su5 f55003c;

        /* renamed from: d */
        public boolean f55004d;

        public C18344a(m9c m9cVar, ggd ggdVar) {
            this.f55001a = m9cVar;
            this.f55002b = ggdVar;
        }

        @Override // p001o.m9c
        /* renamed from: a */
        public void mo16559a(su5 su5Var) {
            if (zu5.validate(this.f55003c, su5Var)) {
                this.f55003c = su5Var;
                this.f55001a.mo16559a(this);
            }
        }

        @Override // p001o.su5
        public void dispose() {
            this.f55003c.dispose();
        }

        @Override // p001o.m9c
        /* renamed from: e */
        public void mo16560e(Object obj) {
            if (this.f55004d) {
                return;
            }
            try {
                if (this.f55002b.test(obj)) {
                    return;
                }
                this.f55004d = true;
                this.f55003c.dispose();
                this.f55001a.mo16560e(Boolean.FALSE);
                this.f55001a.onComplete();
            } catch (Throwable th) {
                zk6.m59526b(th);
                this.f55003c.dispose();
                onError(th);
            }
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return this.f55003c.isDisposed();
        }

        @Override // p001o.m9c
        public void onComplete() {
            if (this.f55004d) {
                return;
            }
            this.f55004d = true;
            this.f55001a.mo16560e(Boolean.TRUE);
            this.f55001a.onComplete();
        }

        @Override // p001o.m9c
        public void onError(Throwable th) {
            if (this.f55004d) {
                fwe.m27599r(th);
            } else {
                this.f55004d = true;
                this.f55001a.onError(th);
            }
        }
    }

    public y6c(x8c x8cVar, ggd ggdVar) {
        super(x8cVar);
        this.f55000b = ggdVar;
    }

    @Override // p001o.x6c
    public void x0(m9c m9cVar) {
        this.f14302a.mo55724b(new C18344a(m9cVar, this.f55000b));
    }
}
