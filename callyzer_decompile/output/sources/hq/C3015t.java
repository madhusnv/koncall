package hq;

import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import java.util.List;
import k2.C3953b;
import k2.InterfaceC3962k;
import kt.AbstractC4238a;
import og.uf;
import ps.AbstractC6009i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hq.t */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3015t implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f16286a;

    /* renamed from: b */
    public final /* synthetic */ List f16287b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2137a f16288c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC2139c f16289d;

    public /* synthetic */ C3015t(List list, InterfaceC2137a interfaceC2137a, InterfaceC2139c interfaceC2139c, int i10) {
        this.f16286a = 1;
        this.f16287b = list;
        this.f16288c = interfaceC2137a;
        this.f16289d = interfaceC2139c;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f16286a;
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        ((Integer) obj2).getClass();
        switch (i10) {
            case 0:
                a0.m7258d(C3953b.m8496A(1), this.f16288c, this.f16289d, this.f16287b, interfaceC3962k);
                break;
            case 1:
                AbstractC4238a.m8977c(C3953b.m8496A(1), this.f16288c, this.f16289d, this.f16287b, interfaceC3962k);
                break;
            case 2:
                AbstractC6009i.m12037g(C3953b.m8496A(1), this.f16288c, this.f16289d, this.f16287b, interfaceC3962k);
                break;
            default:
                uf.m10987a(C3953b.m8496A(1), this.f16288c, this.f16289d, this.f16287b, interfaceC3962k);
                break;
        }
        return qw.a0.f30746a;
    }

    public /* synthetic */ C3015t(List list, InterfaceC2139c interfaceC2139c, InterfaceC2137a interfaceC2137a, int i10, int i11) {
        this.f16286a = i11;
        this.f16287b = list;
        this.f16289d = interfaceC2139c;
        this.f16288c = interfaceC2137a;
    }
}
