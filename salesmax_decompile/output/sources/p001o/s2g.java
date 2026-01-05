package p001o;

/* loaded from: classes6.dex */
public final class s2g implements n64, k84 {

    /* renamed from: a */
    public final n64 f44608a;

    /* renamed from: b */
    public final q74 f44609b;

    public s2g(n64 n64Var, q74 q74Var) {
        this.f44608a = n64Var;
        this.f44609b = q74Var;
    }

    @Override // p001o.k84
    public k84 getCallerFrame() {
        n64 n64Var = this.f44608a;
        if (n64Var instanceof k84) {
            return (k84) n64Var;
        }
        return null;
    }

    @Override // p001o.n64
    public q74 getContext() {
        return this.f44609b;
    }

    @Override // p001o.n64
    public void resumeWith(Object obj) {
        this.f44608a.resumeWith(obj);
    }
}
