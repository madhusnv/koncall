package xr;

import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import java.util.List;
import k2.C3953b;
import k2.InterfaceC3962k;
import qw.a0;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xr.b */
/* loaded from: classes3.dex */
public final /* synthetic */ class C8438b implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f41163a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC7879r f41164b;

    /* renamed from: c */
    public final /* synthetic */ List f41165c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC2137a f41166d;

    public /* synthetic */ C8438b(InterfaceC7879r interfaceC7879r, List list, InterfaceC2137a interfaceC2137a, int i10, int i11) {
        this.f41163a = i11;
        this.f41164b = interfaceC7879r;
        this.f41165c = list;
        this.f41166d = interfaceC2137a;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f41163a;
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        ((Integer) obj2).getClass();
        switch (i10) {
            case 0:
                AbstractC8437a.m15748c(this.f41164b, this.f41165c, this.f41166d, interfaceC3962k, C3953b.m8496A(1));
                break;
            default:
                AbstractC8437a.m15747b(this.f41164b, this.f41165c, this.f41166d, interfaceC3962k, C3953b.m8496A(1));
                break;
        }
        return a0.f30746a;
    }
}
