package ug;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class h3 extends AbstractC7444o {

    /* renamed from: e */
    public final /* synthetic */ int f35470e;

    /* renamed from: f */
    public final /* synthetic */ k3 f35471f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h3(k3 k3Var, n1 n1Var, int i10) {
        super(n1Var);
        this.f35470e = i10;
        this.f35471f = k3Var;
    }

    @Override // ug.AbstractC7444o
    /* renamed from: a */
    public final void mo13868a() {
        switch (this.f35470e) {
            case 0:
                k3 k3Var = this.f35471f;
                k3Var.mo325M();
                if (k3Var.d0()) {
                    v0 v0Var = ((n1) k3Var.f482a).f35669f;
                    n1.m14085m(v0Var);
                    v0Var.f35870p.m14140a("Inactivity, disconnecting from the service");
                    k3Var.m14021U();
                    break;
                }
                break;
            default:
                v0 v0Var2 = ((n1) this.f35471f.f482a).f35669f;
                n1.m14085m(v0Var2);
                v0Var2.f35865j.m14140a("Tasks have been queued for a long time");
                break;
        }
    }
}
