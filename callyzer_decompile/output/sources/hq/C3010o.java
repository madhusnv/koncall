package hq;

import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import k2.C3953b;
import k2.InterfaceC3962k;
import lu.AbstractC4518d;
import sq.g2;
import yu.AbstractC8775a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hq.o */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3010o implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f16267a;

    /* renamed from: b */
    public final /* synthetic */ String f16268b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2137a f16269c;

    /* renamed from: d */
    public final /* synthetic */ int f16270d;

    public /* synthetic */ C3010o(int i10, int i11, int i12, InterfaceC2137a interfaceC2137a, String str) {
        this.f16267a = i12;
        this.f16270d = i10;
        this.f16268b = str;
        this.f16269c = interfaceC2137a;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        Integer num = (Integer) obj2;
        switch (this.f16267a) {
            case 0:
                num.getClass();
                a0.m7259e(this.f16270d, C3953b.m8496A(1), this.f16269c, this.f16268b, interfaceC3962k);
                break;
            case 1:
                num.intValue();
                AbstractC4518d.m9369f(this.f16268b, this.f16269c, interfaceC3962k, C3953b.m8496A(this.f16270d | 1));
                break;
            case 2:
                num.getClass();
                g2.m13136N(this.f16270d, C3953b.m8496A(1), this.f16269c, this.f16268b, interfaceC3962k);
                break;
            default:
                num.getClass();
                AbstractC8775a.m16148s(this.f16270d, C3953b.m8496A(1), this.f16269c, this.f16268b, interfaceC3962k);
                break;
        }
        return qw.a0.f30746a;
    }

    public /* synthetic */ C3010o(int i10, int i11, InterfaceC2137a interfaceC2137a, String str) {
        this.f16267a = 2;
        this.f16268b = str;
        this.f16270d = i10;
        this.f16269c = interfaceC2137a;
    }

    public /* synthetic */ C3010o(int i10, InterfaceC2137a interfaceC2137a, String str) {
        this.f16267a = 1;
        this.f16268b = str;
        this.f16269c = interfaceC2137a;
        this.f16270d = i10;
    }
}
