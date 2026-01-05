package p001o;

/* loaded from: classes6.dex */
public final class il3 extends xk3 {

    /* renamed from: a */
    public final jm f28792a;

    public il3(jm jmVar) {
        this.f28792a = jmVar;
    }

    @Override // p001o.xk3
    /* renamed from: x */
    public void mo17340x(ml3 ml3Var) {
        su5 su5VarM48918c = su5.m48918c();
        ml3Var.mo16368a(su5VarM48918c);
        if (su5VarM48918c.isDisposed()) {
            return;
        }
        try {
            this.f28792a.run();
            if (su5VarM48918c.isDisposed()) {
                return;
            }
            ml3Var.onComplete();
        } catch (Throwable th) {
            zk6.m59526b(th);
            if (su5VarM48918c.isDisposed()) {
                fwe.m27599r(th);
            } else {
                ml3Var.onError(th);
            }
        }
    }
}
