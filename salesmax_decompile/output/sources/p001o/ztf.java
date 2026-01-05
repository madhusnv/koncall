package p001o;

/* loaded from: classes6.dex */
public final class ztf extends wtf {

    /* renamed from: a */
    public final xuf f57703a;

    /* renamed from: b */
    public final gu3 f57704b;

    /* renamed from: o.ztf$a */
    public final class C18708a implements luf {

        /* renamed from: a */
        public final luf f57705a;

        public C18708a(luf lufVar) {
            this.f57705a = lufVar;
        }

        @Override // p001o.luf
        /* renamed from: a */
        public void mo17881a(su5 su5Var) {
            this.f57705a.mo17881a(su5Var);
        }

        @Override // p001o.luf
        public void onError(Throwable th) {
            try {
                ztf.this.f57704b.accept(th);
            } catch (Throwable th2) {
                zk6.m59526b(th2);
                th = new mo3(th, th2);
            }
            this.f57705a.onError(th);
        }

        @Override // p001o.luf
        public void onSuccess(Object obj) {
            this.f57705a.onSuccess(obj);
        }
    }

    public ztf(xuf xufVar, gu3 gu3Var) {
        this.f57703a = xufVar;
        this.f57704b = gu3Var;
    }

    @Override // p001o.wtf
    /* renamed from: v */
    public void mo18257v(luf lufVar) {
        this.f57703a.mo55011a(new C18708a(lufVar));
    }
}
