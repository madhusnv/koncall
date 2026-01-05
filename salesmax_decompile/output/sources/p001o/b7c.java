package p001o;

/* loaded from: classes6.dex */
public final class b7c extends wtf implements om7 {

    /* renamed from: a */
    public final x8c f15652a;

    /* renamed from: b */
    public final ggd f15653b;

    /* renamed from: o.b7c$a */
    public static final class C12295a implements m9c, su5 {

        /* renamed from: a */
        public final luf f15654a;

        /* renamed from: b */
        public final ggd f15655b;

        /* renamed from: c */
        public su5 f15656c;

        /* renamed from: d */
        public boolean f15657d;

        public C12295a(luf lufVar, ggd ggdVar) {
            this.f15654a = lufVar;
            this.f15655b = ggdVar;
        }

        @Override // p001o.m9c
        /* renamed from: a */
        public void mo16559a(su5 su5Var) {
            if (zu5.validate(this.f15656c, su5Var)) {
                this.f15656c = su5Var;
                this.f15654a.mo17881a(this);
            }
        }

        @Override // p001o.su5
        public void dispose() {
            this.f15656c.dispose();
        }

        @Override // p001o.m9c
        /* renamed from: e */
        public void mo16560e(Object obj) {
            if (this.f15657d) {
                return;
            }
            try {
                if (this.f15655b.test(obj)) {
                    this.f15657d = true;
                    this.f15656c.dispose();
                    this.f15654a.onSuccess(Boolean.TRUE);
                }
            } catch (Throwable th) {
                zk6.m59526b(th);
                this.f15656c.dispose();
                onError(th);
            }
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return this.f15656c.isDisposed();
        }

        @Override // p001o.m9c
        public void onComplete() {
            if (this.f15657d) {
                return;
            }
            this.f15657d = true;
            this.f15654a.onSuccess(Boolean.FALSE);
        }

        @Override // p001o.m9c
        public void onError(Throwable th) {
            if (this.f15657d) {
                fwe.m27599r(th);
            } else {
                this.f15657d = true;
                this.f15654a.onError(th);
            }
        }
    }

    public b7c(x8c x8cVar, ggd ggdVar) {
        this.f15652a = x8cVar;
        this.f15653b = ggdVar;
    }

    @Override // p001o.om7
    /* renamed from: b */
    public x6c mo18256b() {
        return fwe.m27595n(new a7c(this.f15652a, this.f15653b));
    }

    @Override // p001o.wtf
    /* renamed from: v */
    public void mo18257v(luf lufVar) {
        this.f15652a.mo55724b(new C12295a(lufVar, this.f15653b));
    }
}
