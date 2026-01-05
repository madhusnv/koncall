package cp;

import ex.InterfaceC2141e;
import k2.C3953b;
import k2.InterfaceC3962k;
import og.gb;
import qw.a0;
import zp.C9010j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cp.e */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1474e implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f7530a;

    /* renamed from: b */
    public final /* synthetic */ C9010j f7531b;

    public /* synthetic */ C1474e(C9010j c9010j, int i10, int i11) {
        this.f7530a = i11;
        this.f7531b = c9010j;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f7530a;
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        ((Integer) obj2).getClass();
        switch (i10) {
            case 0:
                gb.m10669f(this.f7531b, interfaceC3962k, C3953b.m8496A(1));
                break;
            case 1:
                gb.m10664a(this.f7531b, interfaceC3962k, C3953b.m8496A(1));
                break;
            default:
                gb.m10667d(this.f7531b, interfaceC3962k, C3953b.m8496A(1));
                break;
        }
        return a0.f30746a;
    }
}
