package bt;

import dt.C1813s;
import ex.InterfaceC2137a;
import zs.C9048m;
import zs.C9049n;
import zs.C9050o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j0 implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f4857a;

    /* renamed from: b */
    public final /* synthetic */ C1813s f4858b;

    public /* synthetic */ j0(C1813s c1813s, int i10) {
        this.f4857a = i10;
        this.f4858b = c1813s;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f4857a) {
            case 0:
                this.f4858b.m5479f(new C9048m(false));
                break;
            case 1:
                this.f4858b.m5479f(C9049n.f43558a);
                break;
            default:
                this.f4858b.m5479f(C9050o.f43559a);
                break;
        }
        return qw.a0.f30746a;
    }
}
