package p001o;

/* loaded from: classes6.dex */
public final class z6c extends wtf implements om7 {

    /* renamed from: a */
    public final x8c f56588a;

    /* renamed from: b */
    public final ggd f56589b;

    /* renamed from: o.z6c$a */
    public static final class C18560a implements m9c, su5 {

        /* renamed from: a */
        public final luf f56590a;

        /* renamed from: b */
        public final ggd f56591b;

        /* renamed from: c */
        public su5 f56592c;

        /* renamed from: d */
        public boolean f56593d;

        public C18560a(luf lufVar, ggd ggdVar) {
            this.f56590a = lufVar;
            this.f56591b = ggdVar;
        }

        @Override // p001o.m9c
        /* renamed from: a */
        public void mo16559a(su5 su5Var) {
            if (zu5.validate(this.f56592c, su5Var)) {
                this.f56592c = su5Var;
                this.f56590a.mo17881a(this);
            }
        }

        @Override // p001o.su5
        public void dispose() {
            this.f56592c.dispose();
        }

        @Override // p001o.m9c
        /* renamed from: e */
        public void mo16560e(Object obj) {
            if (this.f56593d) {
                return;
            }
            try {
                if (this.f56591b.test(obj)) {
                    return;
                }
                this.f56593d = true;
                this.f56592c.dispose();
                this.f56590a.onSuccess(Boolean.FALSE);
            } catch (Throwable th) {
                zk6.m59526b(th);
                this.f56592c.dispose();
                onError(th);
            }
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return this.f56592c.isDisposed();
        }

        @Override // p001o.m9c
        public void onComplete() {
            if (this.f56593d) {
                return;
            }
            this.f56593d = true;
            this.f56590a.onSuccess(Boolean.TRUE);
        }

        @Override // p001o.m9c
        public void onError(Throwable th) {
            if (this.f56593d) {
                fwe.m27599r(th);
            } else {
                this.f56593d = true;
                this.f56590a.onError(th);
            }
        }
    }

    public z6c(x8c x8cVar, ggd ggdVar) {
        this.f56588a = x8cVar;
        this.f56589b = ggdVar;
    }

    @Override // p001o.om7
    /* renamed from: b */
    public x6c mo18256b() {
        return fwe.m27595n(new y6c(this.f56588a, this.f56589b));
    }

    @Override // p001o.wtf
    /* renamed from: v */
    public void mo18257v(luf lufVar) {
        this.f56588a.mo55724b(new C18560a(lufVar, this.f56589b));
    }
}
