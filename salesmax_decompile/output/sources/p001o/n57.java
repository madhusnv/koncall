package p001o;

/* loaded from: classes6.dex */
public final class n57 extends s47 {

    /* renamed from: b */
    public final x8c f36401b;

    /* renamed from: o.n57$a */
    public static final class C15507a implements m9c, rag {

        /* renamed from: a */
        public final qag f36402a;

        /* renamed from: b */
        public su5 f36403b;

        public C15507a(qag qagVar) {
            this.f36402a = qagVar;
        }

        @Override // p001o.m9c
        /* renamed from: a */
        public void mo16559a(su5 su5Var) {
            this.f36403b = su5Var;
            this.f36402a.mo18165b(this);
        }

        @Override // p001o.rag
        public void cancel() {
            this.f36403b.dispose();
        }

        @Override // p001o.m9c
        /* renamed from: e */
        public void mo16560e(Object obj) {
            this.f36402a.mo18166e(obj);
        }

        @Override // p001o.m9c
        public void onComplete() {
            this.f36402a.onComplete();
        }

        @Override // p001o.m9c
        public void onError(Throwable th) {
            this.f36402a.onError(th);
        }

        @Override // p001o.rag
        public void request(long j) {
        }
    }

    public n57(x8c x8cVar) {
        this.f36401b = x8cVar;
    }

    @Override // p001o.s47
    public void c0(qag qagVar) {
        this.f36401b.mo55724b(new C15507a(qagVar));
    }
}
