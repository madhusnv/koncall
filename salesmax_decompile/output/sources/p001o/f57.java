package p001o;

/* loaded from: classes6.dex */
public final class f57 extends g0b implements nm7 {

    /* renamed from: a */
    public final s47 f22746a;

    /* renamed from: b */
    public final long f22747b;

    /* renamed from: o.f57$a */
    public static final class C13340a implements h67, su5 {

        /* renamed from: a */
        public final q0b f22748a;

        /* renamed from: b */
        public final long f22749b;

        /* renamed from: c */
        public rag f22750c;

        /* renamed from: d */
        public long f22751d;

        /* renamed from: e */
        public boolean f22752e;

        public C13340a(q0b q0bVar, long j) {
            this.f22748a = q0bVar;
            this.f22749b = j;
        }

        @Override // p001o.h67, p001o.qag
        /* renamed from: b */
        public void mo18165b(rag ragVar) {
            if (wag.validate(this.f22750c, ragVar)) {
                this.f22750c = ragVar;
                this.f22748a.mo34822a(this);
                ragVar.request(this.f22749b + 1);
            }
        }

        @Override // p001o.su5
        public void dispose() {
            this.f22750c.cancel();
            this.f22750c = wag.CANCELLED;
        }

        @Override // p001o.qag
        /* renamed from: e */
        public void mo18166e(Object obj) {
            if (this.f22752e) {
                return;
            }
            long j = this.f22751d;
            if (j != this.f22749b) {
                this.f22751d = j + 1;
                return;
            }
            this.f22752e = true;
            this.f22750c.cancel();
            this.f22750c = wag.CANCELLED;
            this.f22748a.onSuccess(obj);
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return this.f22750c == wag.CANCELLED;
        }

        @Override // p001o.qag
        public void onComplete() {
            this.f22750c = wag.CANCELLED;
            if (this.f22752e) {
                return;
            }
            this.f22752e = true;
            this.f22748a.onComplete();
        }

        @Override // p001o.qag
        public void onError(Throwable th) {
            if (this.f22752e) {
                fwe.m27599r(th);
                return;
            }
            this.f22752e = true;
            this.f22750c = wag.CANCELLED;
            this.f22748a.onError(th);
        }
    }

    public f57(s47 s47Var, long j) {
        this.f22746a = s47Var;
        this.f22747b = j;
    }

    @Override // p001o.nm7
    /* renamed from: c */
    public s47 mo26167c() {
        return fwe.m27593l(new e57(this.f22746a, this.f22747b, null, false));
    }

    @Override // p001o.g0b
    /* renamed from: l */
    public void mo26168l(q0b q0bVar) {
        this.f22746a.b0(new C13340a(q0bVar, this.f22747b));
    }
}
