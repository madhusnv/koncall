package qv;

import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import l7.a0;
import rv.C6630f;
import rv.C6638n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qv.p */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6341p implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f30732a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2139c f30733b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2139c f30734c;

    /* renamed from: d */
    public final /* synthetic */ a0 f30735d;

    public /* synthetic */ C6341p(InterfaceC2139c interfaceC2139c, InterfaceC2139c interfaceC2139c2, a0 a0Var, int i10) {
        this.f30732a = i10;
        this.f30733b = interfaceC2139c;
        this.f30734c = interfaceC2139c2;
        this.f30735d = a0Var;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f30732a) {
            case 0:
                C6638n c6638n = C6638n.f31852a;
                InterfaceC2139c interfaceC2139c = this.f30733b;
                interfaceC2139c.invoke(c6638n);
                interfaceC2139c.invoke(C6630f.f31830a);
                this.f30734c.invoke(C6343r.f30737a);
                this.f30735d.m9188g();
                break;
            case 1:
                C6638n c6638n2 = C6638n.f31852a;
                InterfaceC2139c interfaceC2139c2 = this.f30733b;
                interfaceC2139c2.invoke(c6638n2);
                interfaceC2139c2.invoke(C6630f.f31830a);
                this.f30734c.invoke(C6343r.f30737a);
                this.f30735d.m9188g();
                break;
            default:
                a0.m9181f(this.f30735d, "synced_call_log_progress");
                this.f30733b.invoke(C6630f.f31830a);
                this.f30734c.invoke(C6343r.f30737a);
                break;
        }
        return qw.a0.f30746a;
    }

    public /* synthetic */ C6341p(a0 a0Var, InterfaceC2139c interfaceC2139c, InterfaceC2139c interfaceC2139c2) {
        this.f30732a = 2;
        this.f30735d = a0Var;
        this.f30733b = interfaceC2139c;
        this.f30734c = interfaceC2139c2;
    }
}
