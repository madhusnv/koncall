package p001o;

/* loaded from: classes6.dex */
public final class k0b extends p8 {

    /* renamed from: b */
    public final ggd f31320b;

    /* renamed from: o.k0b$a */
    public static final class C14685a implements q0b, su5 {

        /* renamed from: a */
        public final q0b f31321a;

        /* renamed from: b */
        public final ggd f31322b;

        /* renamed from: c */
        public su5 f31323c;

        public C14685a(q0b q0bVar, ggd ggdVar) {
            this.f31321a = q0bVar;
            this.f31322b = ggdVar;
        }

        @Override // p001o.q0b
        /* renamed from: a */
        public void mo34822a(su5 su5Var) {
            if (zu5.validate(this.f31323c, su5Var)) {
                this.f31323c = su5Var;
                this.f31321a.mo34822a(this);
            }
        }

        @Override // p001o.su5
        public void dispose() {
            su5 su5Var = this.f31323c;
            this.f31323c = zu5.DISPOSED;
            su5Var.dispose();
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return this.f31323c.isDisposed();
        }

        @Override // p001o.q0b
        public void onComplete() {
            this.f31321a.onComplete();
        }

        @Override // p001o.q0b
        public void onError(Throwable th) {
            this.f31321a.onError(th);
        }

        @Override // p001o.q0b
        public void onSuccess(Object obj) {
            try {
                if (this.f31322b.test(obj)) {
                    this.f31321a.onSuccess(obj);
                } else {
                    this.f31321a.onComplete();
                }
            } catch (Throwable th) {
                zk6.m59526b(th);
                this.f31321a.onError(th);
            }
        }
    }

    public k0b(s0b s0bVar, ggd ggdVar) {
        super(s0bVar);
        this.f31320b = ggdVar;
    }

    @Override // p001o.g0b
    /* renamed from: l */
    public void mo26168l(q0b q0bVar) {
        this.f39572a.mo27839a(new C14685a(q0bVar, this.f31320b));
    }
}
