package p001o;

/* loaded from: classes6.dex */
public final class u8c extends g0b {

    /* renamed from: a */
    public final x8c f48557a;

    /* renamed from: o.u8c$a */
    public static final class C17334a implements m9c, su5 {

        /* renamed from: a */
        public final q0b f48558a;

        /* renamed from: b */
        public su5 f48559b;

        /* renamed from: c */
        public Object f48560c;

        /* renamed from: d */
        public boolean f48561d;

        public C17334a(q0b q0bVar) {
            this.f48558a = q0bVar;
        }

        @Override // p001o.m9c
        /* renamed from: a */
        public void mo16559a(su5 su5Var) {
            if (zu5.validate(this.f48559b, su5Var)) {
                this.f48559b = su5Var;
                this.f48558a.mo34822a(this);
            }
        }

        @Override // p001o.su5
        public void dispose() {
            this.f48559b.dispose();
        }

        @Override // p001o.m9c
        /* renamed from: e */
        public void mo16560e(Object obj) {
            if (this.f48561d) {
                return;
            }
            if (this.f48560c == null) {
                this.f48560c = obj;
                return;
            }
            this.f48561d = true;
            this.f48559b.dispose();
            this.f48558a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return this.f48559b.isDisposed();
        }

        @Override // p001o.m9c
        public void onComplete() {
            if (this.f48561d) {
                return;
            }
            this.f48561d = true;
            Object obj = this.f48560c;
            this.f48560c = null;
            if (obj == null) {
                this.f48558a.onComplete();
            } else {
                this.f48558a.onSuccess(obj);
            }
        }

        @Override // p001o.m9c
        public void onError(Throwable th) {
            if (this.f48561d) {
                fwe.m27599r(th);
            } else {
                this.f48561d = true;
                this.f48558a.onError(th);
            }
        }
    }

    public u8c(x8c x8cVar) {
        this.f48557a = x8cVar;
    }

    @Override // p001o.g0b
    /* renamed from: l */
    public void mo26168l(q0b q0bVar) {
        this.f48557a.mo55724b(new C17334a(q0bVar));
    }
}
