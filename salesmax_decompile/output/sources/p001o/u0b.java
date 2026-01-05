package p001o;

/* loaded from: classes6.dex */
public final class u0b extends x6c {

    /* renamed from: a */
    public final s0b f48141a;

    /* renamed from: o.u0b$a */
    public static final class C17277a extends ik5 implements q0b {

        /* renamed from: c */
        public su5 f48142c;

        public C17277a(m9c m9cVar) {
            super(m9cVar);
        }

        @Override // p001o.q0b
        /* renamed from: a */
        public void mo34822a(su5 su5Var) {
            if (zu5.validate(this.f48142c, su5Var)) {
                this.f48142c = su5Var;
                this.f28776a.mo16559a(this);
            }
        }

        @Override // p001o.ik5, p001o.su5
        public void dispose() {
            super.dispose();
            this.f48142c.dispose();
        }

        @Override // p001o.q0b
        public void onComplete() {
            m32238b();
        }

        @Override // p001o.q0b
        public void onError(Throwable th) {
            m32240f(th);
        }

        @Override // p001o.q0b
        public void onSuccess(Object obj) {
            m32239d(obj);
        }
    }

    public u0b(s0b s0bVar) {
        this.f48141a = s0bVar;
    }

    public static q0b L0(m9c m9cVar) {
        return new C17277a(m9cVar);
    }

    @Override // p001o.x6c
    public void x0(m9c m9cVar) {
        this.f48141a.mo27839a(L0(m9cVar));
    }
}
