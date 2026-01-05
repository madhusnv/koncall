package p001o;

/* loaded from: classes6.dex */
public final class avf extends x6c {

    /* renamed from: a */
    public final xuf f15286a;

    /* renamed from: o.avf$a */
    public static final class C12256a extends ik5 implements luf {

        /* renamed from: c */
        public su5 f15287c;

        public C12256a(m9c m9cVar) {
            super(m9cVar);
        }

        @Override // p001o.luf
        /* renamed from: a */
        public void mo17881a(su5 su5Var) {
            if (zu5.validate(this.f15287c, su5Var)) {
                this.f15287c = su5Var;
                this.f28776a.mo16559a(this);
            }
        }

        @Override // p001o.ik5, p001o.su5
        public void dispose() {
            super.dispose();
            this.f15287c.dispose();
        }

        @Override // p001o.luf
        public void onError(Throwable th) {
            m32240f(th);
        }

        @Override // p001o.luf
        public void onSuccess(Object obj) {
            m32239d(obj);
        }
    }

    public avf(xuf xufVar) {
        this.f15286a = xufVar;
    }

    public static luf L0(m9c m9cVar) {
        return new C12256a(m9cVar);
    }

    @Override // p001o.x6c
    public void x0(m9c m9cVar) {
        this.f15286a.mo55011a(L0(m9cVar));
    }
}
