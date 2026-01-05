package bt;

import er.AbstractC2101a;
import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import k2.C3953b;
import k2.InterfaceC3962k;
import og.fe;
import qr.AbstractC6287k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bt.f */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0761f implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f4816a;

    /* renamed from: b */
    public final /* synthetic */ int f4817b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2137a f4818c;

    public /* synthetic */ C0761f(int i10, int i11, int i12, InterfaceC2137a interfaceC2137a) {
        this.f4816a = i12;
        this.f4817b = i10;
        this.f4818c = interfaceC2137a;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        Integer num = (Integer) obj2;
        switch (this.f4816a) {
            case 0:
                num.intValue();
                b0.m2062a(this.f4818c, interfaceC3962k, C3953b.m8496A(this.f4817b | 1));
                break;
            case 1:
                num.getClass();
                b0.m2076o(this.f4817b, this.f4818c, interfaceC3962k, C3953b.m8496A(7));
                break;
            case 2:
                num.getClass();
                AbstractC2101a.m5807a(this.f4817b, this.f4818c, interfaceC3962k, C3953b.m8496A(1));
                break;
            case 3:
                num.getClass();
                AbstractC6287k.m12284a(this.f4817b, this.f4818c, interfaceC3962k, C3953b.m8496A(1));
                break;
            default:
                num.getClass();
                fe.m10651a(this.f4817b, this.f4818c, interfaceC3962k, C3953b.m8496A(1));
                break;
        }
        return qw.a0.f30746a;
    }

    public /* synthetic */ C0761f(int i10, InterfaceC2137a interfaceC2137a) {
        this.f4816a = 0;
        this.f4818c = interfaceC2137a;
        this.f4817b = i10;
    }
}
