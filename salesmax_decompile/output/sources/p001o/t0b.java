package p001o;

/* loaded from: classes6.dex */
public final class t0b extends s47 {

    /* renamed from: b */
    public final s0b f46188b;

    /* renamed from: o.t0b$a */
    public static final class C16956a extends jk5 implements q0b {

        /* renamed from: c */
        public su5 f46189c;

        public C16956a(qag qagVar) {
            super(qagVar);
        }

        @Override // p001o.q0b
        /* renamed from: a */
        public void mo34822a(su5 su5Var) {
            if (zu5.validate(this.f46189c, su5Var)) {
                this.f46189c = su5Var;
                this.f30542a.mo18165b(this);
            }
        }

        @Override // p001o.jk5, p001o.rag
        public void cancel() {
            super.cancel();
            this.f46189c.dispose();
        }

        @Override // p001o.q0b
        public void onComplete() {
            this.f30542a.onComplete();
        }

        @Override // p001o.q0b
        public void onError(Throwable th) {
            this.f30542a.onError(th);
        }

        @Override // p001o.q0b
        public void onSuccess(Object obj) {
            m33899c(obj);
        }
    }

    public t0b(s0b s0bVar) {
        this.f46188b = s0bVar;
    }

    @Override // p001o.s47
    public void c0(qag qagVar) {
        this.f46188b.mo27839a(new C16956a(qagVar));
    }
}
