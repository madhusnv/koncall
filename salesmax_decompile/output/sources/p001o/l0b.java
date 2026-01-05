package p001o;

/* loaded from: classes6.dex */
public final class l0b extends g0b {

    /* renamed from: a */
    public final xuf f32909a;

    /* renamed from: b */
    public final ggd f32910b;

    /* renamed from: o.l0b$a */
    public static final class C14947a implements luf, su5 {

        /* renamed from: a */
        public final q0b f32911a;

        /* renamed from: b */
        public final ggd f32912b;

        /* renamed from: c */
        public su5 f32913c;

        public C14947a(q0b q0bVar, ggd ggdVar) {
            this.f32911a = q0bVar;
            this.f32912b = ggdVar;
        }

        @Override // p001o.luf
        /* renamed from: a */
        public void mo17881a(su5 su5Var) {
            if (zu5.validate(this.f32913c, su5Var)) {
                this.f32913c = su5Var;
                this.f32911a.mo34822a(this);
            }
        }

        @Override // p001o.su5
        public void dispose() {
            su5 su5Var = this.f32913c;
            this.f32913c = zu5.DISPOSED;
            su5Var.dispose();
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return this.f32913c.isDisposed();
        }

        @Override // p001o.luf
        public void onError(Throwable th) {
            this.f32911a.onError(th);
        }

        @Override // p001o.luf
        public void onSuccess(Object obj) {
            try {
                if (this.f32912b.test(obj)) {
                    this.f32911a.onSuccess(obj);
                } else {
                    this.f32911a.onComplete();
                }
            } catch (Throwable th) {
                zk6.m59526b(th);
                this.f32911a.onError(th);
            }
        }
    }

    public l0b(xuf xufVar, ggd ggdVar) {
        this.f32909a = xufVar;
        this.f32910b = ggdVar;
    }

    @Override // p001o.g0b
    /* renamed from: l */
    public void mo26168l(q0b q0bVar) {
        this.f32909a.mo55011a(new C14947a(q0bVar, this.f32910b));
    }
}
