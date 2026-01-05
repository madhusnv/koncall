package p001o;

/* loaded from: classes6.dex */
public final class d3i extends z74 {

    /* renamed from: c */
    public static final d3i f19079c = new d3i();

    @Override // p001o.z74
    /* renamed from: K */
    public void mo22314K(q74 q74Var, Runnable runnable) {
        bfj bfjVar = (bfj) q74Var.get(bfj.f16103c);
        if (bfjVar == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        bfjVar.f16104b = true;
    }

    @Override // p001o.z74
    public boolean k0(q74 q74Var) {
        return false;
    }

    @Override // p001o.z74
    public z74 l0(int i, String str) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // p001o.z74
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
