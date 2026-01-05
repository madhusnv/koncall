package kt;

import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import ex.InterfaceC2142f;
import java.util.List;
import k2.C3953b;
import k2.InterfaceC3962k;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kt.e */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4242e implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f21560a;

    /* renamed from: b */
    public final /* synthetic */ List f21561b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2142f f21562c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC2137a f21563d;

    public /* synthetic */ C4242e(List list, InterfaceC2142f interfaceC2142f, InterfaceC2137a interfaceC2137a, int i10, int i11) {
        this.f21560a = i11;
        this.f21561b = list;
        this.f21562c = interfaceC2142f;
        this.f21563d = interfaceC2137a;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f21560a;
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        ((Integer) obj2).getClass();
        switch (i10) {
            case 0:
                AbstractC4238a.m8976b(this.f21561b, this.f21562c, this.f21563d, interfaceC3962k, C3953b.m8496A(1));
                break;
            default:
                AbstractC4238a.m8975a(this.f21561b, this.f21562c, this.f21563d, interfaceC3962k, C3953b.m8496A(1));
                break;
        }
        return a0.f30746a;
    }
}
