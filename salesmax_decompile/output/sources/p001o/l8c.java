package p001o;

/* loaded from: classes6.dex */
public final class l8c extends a9 {

    /* renamed from: b */
    public final rl7 f33449b;

    /* renamed from: o.l8c$a */
    public static final class C15033a implements m9c, su5 {

        /* renamed from: a */
        public final m9c f33450a;

        /* renamed from: b */
        public final rl7 f33451b;

        /* renamed from: c */
        public su5 f33452c;

        public C15033a(m9c m9cVar, rl7 rl7Var) {
            this.f33450a = m9cVar;
            this.f33451b = rl7Var;
        }

        @Override // p001o.m9c
        /* renamed from: a */
        public void mo16559a(su5 su5Var) {
            if (zu5.validate(this.f33452c, su5Var)) {
                this.f33452c = su5Var;
                this.f33450a.mo16559a(this);
            }
        }

        @Override // p001o.su5
        public void dispose() {
            this.f33452c.dispose();
        }

        @Override // p001o.m9c
        /* renamed from: e */
        public void mo16560e(Object obj) {
            this.f33450a.mo16560e(obj);
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return this.f33452c.isDisposed();
        }

        @Override // p001o.m9c
        public void onComplete() {
            this.f33450a.onComplete();
        }

        @Override // p001o.m9c
        public void onError(Throwable th) {
            try {
                Object objApply = this.f33451b.apply(th);
                if (objApply != null) {
                    this.f33450a.mo16560e(objApply);
                    this.f33450a.onComplete();
                } else {
                    NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th);
                    this.f33450a.onError(nullPointerException);
                }
            } catch (Throwable th2) {
                zk6.m59526b(th2);
                this.f33450a.onError(new mo3(th, th2));
            }
        }
    }

    public l8c(x8c x8cVar, rl7 rl7Var) {
        super(x8cVar);
        this.f33449b = rl7Var;
    }

    @Override // p001o.x6c
    public void x0(m9c m9cVar) {
        this.f14302a.mo55724b(new C15033a(m9cVar, this.f33449b));
    }
}
