package p001o;

/* loaded from: classes6.dex */
public final class l7c extends a9 {

    /* renamed from: b */
    public final gu3 f33355b;

    /* renamed from: c */
    public final gu3 f33356c;

    /* renamed from: d */
    public final jm f33357d;

    /* renamed from: e */
    public final jm f33358e;

    /* renamed from: o.l7c$a */
    public static final class C15012a implements m9c, su5 {

        /* renamed from: a */
        public final m9c f33359a;

        /* renamed from: b */
        public final gu3 f33360b;

        /* renamed from: c */
        public final gu3 f33361c;

        /* renamed from: d */
        public final jm f33362d;

        /* renamed from: e */
        public final jm f33363e;

        /* renamed from: f */
        public su5 f33364f;

        /* renamed from: g */
        public boolean f33365g;

        public C15012a(m9c m9cVar, gu3 gu3Var, gu3 gu3Var2, jm jmVar, jm jmVar2) {
            this.f33359a = m9cVar;
            this.f33360b = gu3Var;
            this.f33361c = gu3Var2;
            this.f33362d = jmVar;
            this.f33363e = jmVar2;
        }

        @Override // p001o.m9c
        /* renamed from: a */
        public void mo16559a(su5 su5Var) {
            if (zu5.validate(this.f33364f, su5Var)) {
                this.f33364f = su5Var;
                this.f33359a.mo16559a(this);
            }
        }

        @Override // p001o.su5
        public void dispose() {
            this.f33364f.dispose();
        }

        @Override // p001o.m9c
        /* renamed from: e */
        public void mo16560e(Object obj) {
            if (this.f33365g) {
                return;
            }
            try {
                this.f33360b.accept(obj);
                this.f33359a.mo16560e(obj);
            } catch (Throwable th) {
                zk6.m59526b(th);
                this.f33364f.dispose();
                onError(th);
            }
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return this.f33364f.isDisposed();
        }

        @Override // p001o.m9c
        public void onComplete() {
            if (this.f33365g) {
                return;
            }
            try {
                this.f33362d.run();
                this.f33365g = true;
                this.f33359a.onComplete();
                try {
                    this.f33363e.run();
                } catch (Throwable th) {
                    zk6.m59526b(th);
                    fwe.m27599r(th);
                }
            } catch (Throwable th2) {
                zk6.m59526b(th2);
                onError(th2);
            }
        }

        @Override // p001o.m9c
        public void onError(Throwable th) {
            if (this.f33365g) {
                fwe.m27599r(th);
                return;
            }
            this.f33365g = true;
            try {
                this.f33361c.accept(th);
            } catch (Throwable th2) {
                zk6.m59526b(th2);
                th = new mo3(th, th2);
            }
            this.f33359a.onError(th);
            try {
                this.f33363e.run();
            } catch (Throwable th3) {
                zk6.m59526b(th3);
                fwe.m27599r(th3);
            }
        }
    }

    public l7c(x8c x8cVar, gu3 gu3Var, gu3 gu3Var2, jm jmVar, jm jmVar2) {
        super(x8cVar);
        this.f33355b = gu3Var;
        this.f33356c = gu3Var2;
        this.f33357d = jmVar;
        this.f33358e = jmVar2;
    }

    @Override // p001o.x6c
    public void x0(m9c m9cVar) {
        this.f14302a.mo55724b(new C15012a(m9cVar, this.f33355b, this.f33356c, this.f33357d, this.f33358e));
    }
}
