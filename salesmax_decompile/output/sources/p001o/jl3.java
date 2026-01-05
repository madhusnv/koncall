package p001o;

/* loaded from: classes6.dex */
public final class jl3 extends xk3 {

    /* renamed from: a */
    public final xuf f30658a;

    /* renamed from: o.jl3$a */
    public static final class C14587a implements luf {

        /* renamed from: a */
        public final ml3 f30659a;

        public C14587a(ml3 ml3Var) {
            this.f30659a = ml3Var;
        }

        @Override // p001o.luf
        /* renamed from: a */
        public void mo17881a(su5 su5Var) {
            this.f30659a.mo16368a(su5Var);
        }

        @Override // p001o.luf
        public void onError(Throwable th) {
            this.f30659a.onError(th);
        }

        @Override // p001o.luf
        public void onSuccess(Object obj) {
            this.f30659a.onComplete();
        }
    }

    public jl3(xuf xufVar) {
        this.f30658a = xufVar;
    }

    @Override // p001o.xk3
    /* renamed from: x */
    public void mo17340x(ml3 ml3Var) {
        this.f30658a.mo55011a(new C14587a(ml3Var));
    }
}
