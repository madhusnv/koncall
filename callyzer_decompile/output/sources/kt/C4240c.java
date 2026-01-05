package kt;

import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import k2.C3953b;
import k2.InterfaceC3962k;
import qw.a0;
import vr.AbstractC7733a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kt.c */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4240c implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f21553a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2139c f21554b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2139c f21555c;

    public /* synthetic */ C4240c(InterfaceC2139c interfaceC2139c, InterfaceC2139c interfaceC2139c2, int i10, int i11) {
        this.f21553a = i11;
        this.f21554b = interfaceC2139c;
        this.f21555c = interfaceC2139c2;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f21553a;
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        ((Integer) obj2).getClass();
        switch (i10) {
            case 0:
                AbstractC4238a.m8978d(this.f21554b, this.f21555c, interfaceC3962k, C3953b.m8496A(1));
                break;
            default:
                AbstractC7733a.m14724c(this.f21554b, this.f21555c, interfaceC3962k, C3953b.m8496A(1));
                break;
        }
        return a0.f30746a;
    }
}
