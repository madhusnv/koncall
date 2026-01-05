package zt;

import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import iu.AbstractC3353e;
import k2.C3953b;
import k2.InterfaceC3962k;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zt.b */
/* loaded from: classes3.dex */
public final /* synthetic */ class C9063b implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f43576a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC3353e f43577b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2137a f43578c;

    /* renamed from: d */
    public final /* synthetic */ int f43579d;

    public /* synthetic */ C9063b(AbstractC3353e abstractC3353e, InterfaceC2137a interfaceC2137a, int i10, int i11) {
        this.f43576a = i11;
        this.f43577b = abstractC3353e;
        this.f43578c = interfaceC2137a;
        this.f43579d = i10;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f43576a;
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                AbstractC9062a.m16503d(this.f43577b, this.f43578c, interfaceC3962k, C3953b.m8496A(this.f43579d | 1));
                break;
            case 1:
                AbstractC9062a.m16503d(this.f43577b, this.f43578c, interfaceC3962k, C3953b.m8496A(this.f43579d | 1));
                break;
            default:
                AbstractC9062a.m16504e(this.f43577b, this.f43578c, interfaceC3962k, C3953b.m8496A(this.f43579d | 1));
                break;
        }
        return a0.f30746a;
    }
}
