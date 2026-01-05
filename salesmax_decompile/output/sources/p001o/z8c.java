package p001o;

/* loaded from: classes6.dex */
public final class z8c extends a9 {

    /* renamed from: b */
    public final x8c f56701b;

    /* renamed from: o.z8c$a */
    public static final class C18579a implements m9c {

        /* renamed from: a */
        public final m9c f56702a;

        /* renamed from: b */
        public final x8c f56703b;

        /* renamed from: d */
        public boolean f56705d = true;

        /* renamed from: c */
        public final ref f56704c = new ref();

        public C18579a(m9c m9cVar, x8c x8cVar) {
            this.f56702a = m9cVar;
            this.f56703b = x8cVar;
        }

        @Override // p001o.m9c
        /* renamed from: a */
        public void mo16559a(su5 su5Var) {
            this.f56704c.m46622b(su5Var);
        }

        @Override // p001o.m9c
        /* renamed from: e */
        public void mo16560e(Object obj) {
            if (this.f56705d) {
                this.f56705d = false;
            }
            this.f56702a.mo16560e(obj);
        }

        @Override // p001o.m9c
        public void onComplete() {
            if (!this.f56705d) {
                this.f56702a.onComplete();
            } else {
                this.f56705d = false;
                this.f56703b.mo55724b(this);
            }
        }

        @Override // p001o.m9c
        public void onError(Throwable th) {
            this.f56702a.onError(th);
        }
    }

    public z8c(x8c x8cVar, x8c x8cVar2) {
        super(x8cVar);
        this.f56701b = x8cVar2;
    }

    @Override // p001o.x6c
    public void x0(m9c m9cVar) {
        C18579a c18579a = new C18579a(m9cVar, this.f56701b);
        m9cVar.mo16559a(c18579a.f56704c);
        this.f14302a.mo55724b(c18579a);
    }
}
