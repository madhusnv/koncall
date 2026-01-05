package p001o;

/* loaded from: classes6.dex */
public final class ul3 extends wtf {

    /* renamed from: a */
    public final ql3 f49054a;

    /* renamed from: b */
    public final idg f49055b;

    /* renamed from: c */
    public final Object f49056c;

    /* renamed from: o.ul3$a */
    public final class C17391a implements ml3 {

        /* renamed from: a */
        public final luf f49057a;

        public C17391a(luf lufVar) {
            this.f49057a = lufVar;
        }

        @Override // p001o.ml3
        /* renamed from: a */
        public void mo16368a(su5 su5Var) {
            this.f49057a.mo17881a(su5Var);
        }

        @Override // p001o.ml3
        public void onComplete() {
            Object obj;
            ul3 ul3Var = ul3.this;
            idg idgVar = ul3Var.f49055b;
            if (idgVar != null) {
                try {
                    obj = idgVar.get();
                } catch (Throwable th) {
                    zk6.m59526b(th);
                    this.f49057a.onError(th);
                    return;
                }
            } else {
                obj = ul3Var.f49056c;
            }
            if (obj == null) {
                this.f49057a.onError(new NullPointerException("The value supplied is null"));
            } else {
                this.f49057a.onSuccess(obj);
            }
        }

        @Override // p001o.ml3
        public void onError(Throwable th) {
            this.f49057a.onError(th);
        }
    }

    public ul3(ql3 ql3Var, idg idgVar, Object obj) {
        this.f49054a = ql3Var;
        this.f49056c = obj;
        this.f49055b = idgVar;
    }

    @Override // p001o.wtf
    /* renamed from: v */
    public void mo18257v(luf lufVar) {
        this.f49054a.mo45628a(new C17391a(lufVar));
    }
}
