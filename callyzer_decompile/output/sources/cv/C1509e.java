package cv;

import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import k2.C3953b;
import k2.InterfaceC3962k;
import qr.AbstractC6287k;
import qw.a0;
import xq.AbstractC8436j;
import ys.AbstractC8768a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cv.e */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1509e implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f7624a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2137a f7625b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2137a f7626c;

    public /* synthetic */ C1509e(InterfaceC2137a interfaceC2137a, InterfaceC2137a interfaceC2137a2, int i10, int i11) {
        this.f7624a = i11;
        this.f7625b = interfaceC2137a;
        this.f7626c = interfaceC2137a2;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f7624a;
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        ((Integer) obj2).getClass();
        switch (i10) {
            case 0:
                AbstractC1505a.m5066f(this.f7625b, this.f7626c, interfaceC3962k, C3953b.m8496A(1));
                break;
            case 1:
                AbstractC6287k.m12288e(this.f7625b, this.f7626c, interfaceC3962k, C3953b.m8496A(1));
                break;
            case 2:
                AbstractC6287k.m12289f(this.f7625b, this.f7626c, interfaceC3962k, C3953b.m8496A(1));
                break;
            case 3:
                AbstractC8436j.m15734c(this.f7625b, this.f7626c, interfaceC3962k, C3953b.m8496A(1));
                break;
            case 4:
                AbstractC8768a.m16122a(this.f7625b, this.f7626c, interfaceC3962k, C3953b.m8496A(1));
                break;
            case 5:
                AbstractC8768a.m16125d(this.f7625b, this.f7626c, interfaceC3962k, C3953b.m8496A(1));
                break;
            default:
                AbstractC8768a.m16124c(this.f7625b, this.f7626c, interfaceC3962k, C3953b.m8496A(1));
                break;
        }
        return a0.f30746a;
    }
}
