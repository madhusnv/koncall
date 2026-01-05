package p001o;

/* loaded from: classes6.dex */
public final class d8c extends x6c {

    /* renamed from: a */
    public final g3e f19386a;

    /* renamed from: o.d8c$a */
    public static final class C12842a implements h67, su5 {

        /* renamed from: a */
        public final m9c f19387a;

        /* renamed from: b */
        public rag f19388b;

        public C12842a(m9c m9cVar) {
            this.f19387a = m9cVar;
        }

        @Override // p001o.h67, p001o.qag
        /* renamed from: b */
        public void mo18165b(rag ragVar) {
            if (wag.validate(this.f19388b, ragVar)) {
                this.f19388b = ragVar;
                this.f19387a.mo16559a(this);
                ragVar.request(Long.MAX_VALUE);
            }
        }

        @Override // p001o.su5
        public void dispose() {
            this.f19388b.cancel();
            this.f19388b = wag.CANCELLED;
        }

        @Override // p001o.qag
        /* renamed from: e */
        public void mo18166e(Object obj) {
            this.f19387a.mo16560e(obj);
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return this.f19388b == wag.CANCELLED;
        }

        @Override // p001o.qag
        public void onComplete() {
            this.f19387a.onComplete();
        }

        @Override // p001o.qag
        public void onError(Throwable th) {
            this.f19387a.onError(th);
        }
    }

    public d8c(g3e g3eVar) {
        this.f19386a = g3eVar;
    }

    @Override // p001o.x6c
    public void x0(m9c m9cVar) {
        this.f19386a.mo28025a(new C12842a(m9cVar));
    }
}
