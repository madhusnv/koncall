package tp;

import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import qw.a0;
import zp.C9014n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tp.g */
/* loaded from: classes3.dex */
public final class C7186g implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f34472a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2141e f34473b;

    /* renamed from: c */
    public final /* synthetic */ C9014n f34474c;

    public /* synthetic */ C7186g(InterfaceC2141e interfaceC2141e, C9014n c9014n, int i10) {
        this.f34472a = i10;
        this.f34473b = interfaceC2141e;
        this.f34474c = c9014n;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f34472a) {
            case 0:
                C9014n c9014n = this.f34474c;
                this.f34473b.invoke(c9014n.f43422d, c9014n.f43423e);
                break;
            default:
                C9014n c9014n2 = this.f34474c;
                this.f34473b.invoke(c9014n2.f43422d, c9014n2.f43423e);
                break;
        }
        return a0.f30746a;
    }
}
