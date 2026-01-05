package p001o;

/* loaded from: classes6.dex */
public final class o7c extends g0b implements om7 {

    /* renamed from: a */
    public final x8c f37854a;

    /* renamed from: b */
    public final long f37855b;

    /* renamed from: o.o7c$a */
    public static final class C15722a implements m9c, su5 {

        /* renamed from: a */
        public final q0b f37856a;

        /* renamed from: b */
        public final long f37857b;

        /* renamed from: c */
        public su5 f37858c;

        /* renamed from: d */
        public long f37859d;

        /* renamed from: e */
        public boolean f37860e;

        public C15722a(q0b q0bVar, long j) {
            this.f37856a = q0bVar;
            this.f37857b = j;
        }

        @Override // p001o.m9c
        /* renamed from: a */
        public void mo16559a(su5 su5Var) {
            if (zu5.validate(this.f37858c, su5Var)) {
                this.f37858c = su5Var;
                this.f37856a.mo34822a(this);
            }
        }

        @Override // p001o.su5
        public void dispose() {
            this.f37858c.dispose();
        }

        @Override // p001o.m9c
        /* renamed from: e */
        public void mo16560e(Object obj) {
            if (this.f37860e) {
                return;
            }
            long j = this.f37859d;
            if (j != this.f37857b) {
                this.f37859d = j + 1;
                return;
            }
            this.f37860e = true;
            this.f37858c.dispose();
            this.f37856a.onSuccess(obj);
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return this.f37858c.isDisposed();
        }

        @Override // p001o.m9c
        public void onComplete() {
            if (this.f37860e) {
                return;
            }
            this.f37860e = true;
            this.f37856a.onComplete();
        }

        @Override // p001o.m9c
        public void onError(Throwable th) {
            if (this.f37860e) {
                fwe.m27599r(th);
            } else {
                this.f37860e = true;
                this.f37856a.onError(th);
            }
        }
    }

    public o7c(x8c x8cVar, long j) {
        this.f37854a = x8cVar;
        this.f37855b = j;
    }

    @Override // p001o.om7
    /* renamed from: b */
    public x6c mo18256b() {
        return fwe.m27595n(new n7c(this.f37854a, this.f37855b, null, false));
    }

    @Override // p001o.g0b
    /* renamed from: l */
    public void mo26168l(q0b q0bVar) {
        this.f37854a.mo55724b(new C15722a(q0bVar, this.f37855b));
    }
}
