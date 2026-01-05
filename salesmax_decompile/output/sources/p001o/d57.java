package p001o;

/* loaded from: classes6.dex */
public final class d57 extends o7 {

    /* renamed from: c */
    public final gu3 f19111c;

    /* renamed from: d */
    public final ila f19112d;

    /* renamed from: e */
    public final jm f19113e;

    /* renamed from: o.d57$a */
    public static final class C12795a implements h67, rag {

        /* renamed from: a */
        public final qag f19114a;

        /* renamed from: b */
        public final gu3 f19115b;

        /* renamed from: c */
        public final ila f19116c;

        /* renamed from: d */
        public final jm f19117d;

        /* renamed from: e */
        public rag f19118e;

        public C12795a(qag qagVar, gu3 gu3Var, ila ilaVar, jm jmVar) {
            this.f19114a = qagVar;
            this.f19115b = gu3Var;
            this.f19117d = jmVar;
            this.f19116c = ilaVar;
        }

        @Override // p001o.h67, p001o.qag
        /* renamed from: b */
        public void mo18165b(rag ragVar) {
            try {
                this.f19115b.accept(ragVar);
                if (wag.validate(this.f19118e, ragVar)) {
                    this.f19118e = ragVar;
                    this.f19114a.mo18165b(this);
                }
            } catch (Throwable th) {
                zk6.m59526b(th);
                ragVar.cancel();
                this.f19118e = wag.CANCELLED;
                u66.error(th, this.f19114a);
            }
        }

        @Override // p001o.rag
        public void cancel() {
            rag ragVar = this.f19118e;
            wag wagVar = wag.CANCELLED;
            if (ragVar != wagVar) {
                this.f19118e = wagVar;
                try {
                    this.f19117d.run();
                } catch (Throwable th) {
                    zk6.m59526b(th);
                    fwe.m27599r(th);
                }
                ragVar.cancel();
            }
        }

        @Override // p001o.qag
        /* renamed from: e */
        public void mo18166e(Object obj) {
            this.f19114a.mo18166e(obj);
        }

        @Override // p001o.qag
        public void onComplete() {
            if (this.f19118e != wag.CANCELLED) {
                this.f19114a.onComplete();
            }
        }

        @Override // p001o.qag
        public void onError(Throwable th) {
            if (this.f19118e != wag.CANCELLED) {
                this.f19114a.onError(th);
            } else {
                fwe.m27599r(th);
            }
        }

        @Override // p001o.rag
        public void request(long j) {
            try {
                this.f19116c.accept(j);
            } catch (Throwable th) {
                zk6.m59526b(th);
                fwe.m27599r(th);
            }
            this.f19118e.request(j);
        }
    }

    public d57(s47 s47Var, gu3 gu3Var, ila ilaVar, jm jmVar) {
        super(s47Var);
        this.f19111c = gu3Var;
        this.f19112d = ilaVar;
        this.f19113e = jmVar;
    }

    @Override // p001o.s47
    public void c0(qag qagVar) {
        this.f37840b.b0(new C12795a(qagVar, this.f19111c, this.f19112d, this.f19113e));
    }
}
