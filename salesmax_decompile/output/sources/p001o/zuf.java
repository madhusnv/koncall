package p001o;

/* loaded from: classes6.dex */
public final class zuf extends s47 {

    /* renamed from: b */
    public final xuf f57726b;

    /* renamed from: o.zuf$a */
    public static final class C18711a extends jk5 implements luf {

        /* renamed from: c */
        public su5 f57727c;

        public C18711a(qag qagVar) {
            super(qagVar);
        }

        @Override // p001o.luf
        /* renamed from: a */
        public void mo17881a(su5 su5Var) {
            if (zu5.validate(this.f57727c, su5Var)) {
                this.f57727c = su5Var;
                this.f30542a.mo18165b(this);
            }
        }

        @Override // p001o.jk5, p001o.rag
        public void cancel() {
            super.cancel();
            this.f57727c.dispose();
        }

        @Override // p001o.luf
        public void onError(Throwable th) {
            this.f30542a.onError(th);
        }

        @Override // p001o.luf
        public void onSuccess(Object obj) {
            m33899c(obj);
        }
    }

    public zuf(xuf xufVar) {
        this.f57726b = xufVar;
    }

    @Override // p001o.s47
    public void c0(qag qagVar) {
        this.f57726b.mo55011a(new C18711a(qagVar));
    }
}
