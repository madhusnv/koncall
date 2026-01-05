package p001o;

/* loaded from: classes6.dex */
public final class w8c extends a9 {

    /* renamed from: b */
    public final long f51613b;

    /* renamed from: o.w8c$a */
    public static final class C17797a implements m9c, su5 {

        /* renamed from: a */
        public final m9c f51614a;

        /* renamed from: b */
        public long f51615b;

        /* renamed from: c */
        public su5 f51616c;

        public C17797a(m9c m9cVar, long j) {
            this.f51614a = m9cVar;
            this.f51615b = j;
        }

        @Override // p001o.m9c
        /* renamed from: a */
        public void mo16559a(su5 su5Var) {
            if (zu5.validate(this.f51616c, su5Var)) {
                this.f51616c = su5Var;
                this.f51614a.mo16559a(this);
            }
        }

        @Override // p001o.su5
        public void dispose() {
            this.f51616c.dispose();
        }

        @Override // p001o.m9c
        /* renamed from: e */
        public void mo16560e(Object obj) {
            long j = this.f51615b;
            if (j != 0) {
                this.f51615b = j - 1;
            } else {
                this.f51614a.mo16560e(obj);
            }
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return this.f51616c.isDisposed();
        }

        @Override // p001o.m9c
        public void onComplete() {
            this.f51614a.onComplete();
        }

        @Override // p001o.m9c
        public void onError(Throwable th) {
            this.f51614a.onError(th);
        }
    }

    public w8c(x8c x8cVar, long j) {
        super(x8cVar);
        this.f51613b = j;
    }

    @Override // p001o.x6c
    public void x0(m9c m9cVar) {
        this.f14302a.mo55724b(new C17797a(m9cVar, this.f51613b));
    }
}
