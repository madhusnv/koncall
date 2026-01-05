package p001o;

/* loaded from: classes6.dex */
public abstract class pre extends vb1 {
    public pre(n64 n64Var) {
        super(n64Var);
        if (n64Var != null) {
            if (!(n64Var.getContext() == e66.f21035a)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @Override // p001o.n64
    public q74 getContext() {
        return e66.f21035a;
    }
}
