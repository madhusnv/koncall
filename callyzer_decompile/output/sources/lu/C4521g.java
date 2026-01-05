package lu;

import ex.InterfaceC2141e;
import java.util.List;
import k2.C3953b;
import k2.InterfaceC3962k;
import qw.a0;
import sq.g2;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lu.g */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4521g implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f22484a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC7879r f22485b;

    /* renamed from: c */
    public final /* synthetic */ List f22486c;

    public /* synthetic */ C4521g(int i10, int i11, List list, InterfaceC7879r interfaceC7879r) {
        this.f22484a = i11;
        this.f22485b = interfaceC7879r;
        this.f22486c = list;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f22484a;
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        ((Integer) obj2).getClass();
        switch (i10) {
            case 0:
                AbstractC4527m.m9374e(this.f22485b, this.f22486c, interfaceC3962k, C3953b.m8496A(1));
                break;
            default:
                g2.m13147Y(this.f22485b, this.f22486c, true, interfaceC3962k, C3953b.m8496A(7));
                break;
        }
        return a0.f30746a;
    }
}
