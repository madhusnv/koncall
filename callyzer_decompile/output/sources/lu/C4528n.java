package lu;

import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import k2.C3953b;
import k2.InterfaceC3962k;
import qw.a0;
import vs.AbstractC7760b;
import xq.AbstractC8436j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lu.n */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4528n implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f22499a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2139c f22500b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2137a f22501c;

    public /* synthetic */ C4528n(int i10, InterfaceC2137a interfaceC2137a, InterfaceC2139c interfaceC2139c) {
        this.f22499a = 2;
        this.f22501c = interfaceC2137a;
        this.f22500b = interfaceC2139c;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f22499a;
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        ((Integer) obj2).getClass();
        switch (i10) {
            case 0:
                AbstractC4515a.m9363b(C3953b.m8496A(1), this.f22501c, this.f22500b, interfaceC3962k);
                break;
            case 1:
                AbstractC7760b.m14737d(C3953b.m8496A(49), this.f22501c, this.f22500b, interfaceC3962k);
                break;
            default:
                AbstractC8436j.m15735d(C3953b.m8496A(1), this.f22501c, this.f22500b, interfaceC3962k);
                break;
        }
        return a0.f30746a;
    }

    public /* synthetic */ C4528n(InterfaceC2139c interfaceC2139c, InterfaceC2137a interfaceC2137a, int i10, int i11) {
        this.f22499a = i11;
        this.f22500b = interfaceC2139c;
        this.f22501c = interfaceC2137a;
    }
}
