package p001o;

/* loaded from: classes6.dex */
public final class i67 extends o7 {

    /* renamed from: c */
    public final ggd f28151c;

    /* renamed from: o.i67$a */
    public static final class C14198a implements h67, rag {

        /* renamed from: a */
        public final qag f28152a;

        /* renamed from: b */
        public final ggd f28153b;

        /* renamed from: c */
        public rag f28154c;

        /* renamed from: d */
        public boolean f28155d;

        public C14198a(qag qagVar, ggd ggdVar) {
            this.f28152a = qagVar;
            this.f28153b = ggdVar;
        }

        @Override // p001o.h67, p001o.qag
        /* renamed from: b */
        public void mo18165b(rag ragVar) {
            if (wag.validate(this.f28154c, ragVar)) {
                this.f28154c = ragVar;
                this.f28152a.mo18165b(this);
            }
        }

        @Override // p001o.rag
        public void cancel() {
            this.f28154c.cancel();
        }

        @Override // p001o.qag
        /* renamed from: e */
        public void mo18166e(Object obj) {
            if (this.f28155d) {
                return;
            }
            this.f28152a.mo18166e(obj);
            try {
                if (this.f28153b.test(obj)) {
                    this.f28155d = true;
                    this.f28154c.cancel();
                    this.f28152a.onComplete();
                }
            } catch (Throwable th) {
                zk6.m59526b(th);
                this.f28154c.cancel();
                onError(th);
            }
        }

        @Override // p001o.qag
        public void onComplete() {
            if (this.f28155d) {
                return;
            }
            this.f28155d = true;
            this.f28152a.onComplete();
        }

        @Override // p001o.qag
        public void onError(Throwable th) {
            if (this.f28155d) {
                fwe.m27599r(th);
            } else {
                this.f28155d = true;
                this.f28152a.onError(th);
            }
        }

        @Override // p001o.rag
        public void request(long j) {
            this.f28154c.request(j);
        }
    }

    public i67(s47 s47Var, ggd ggdVar) {
        super(s47Var);
        this.f28151c = ggdVar;
    }

    @Override // p001o.s47
    public void c0(qag qagVar) {
        this.f37840b.b0(new C14198a(qagVar, this.f28151c));
    }
}
