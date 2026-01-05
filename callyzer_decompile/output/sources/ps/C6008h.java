package ps;

import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import java.util.List;
import k2.C3953b;
import k2.InterfaceC3962k;
import og.he;
import og.ie;
import qv.AbstractC6327b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ps.h */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6008h implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f29361a;

    /* renamed from: b */
    public final /* synthetic */ List f29362b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2139c f29363c;

    public /* synthetic */ C6008h(List list, InterfaceC2139c interfaceC2139c, int i10, int i11) {
        this.f29361a = i11;
        this.f29362b = list;
        this.f29363c = interfaceC2139c;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f29361a;
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        ((Integer) obj2).getClass();
        switch (i10) {
            case 0:
                AbstractC6009i.m12032b(this.f29362b, this.f29363c, interfaceC3962k, C3953b.m8496A(1));
                break;
            case 1:
                AbstractC6327b.m12339d(this.f29362b, this.f29363c, interfaceC3962k, C3953b.m8496A(1));
                break;
            case 2:
                he.m10684a(this.f29362b, this.f29363c, interfaceC3962k, C3953b.m8496A(1));
                break;
            default:
                ie.m10701b(this.f29362b, this.f29363c, interfaceC3962k, C3953b.m8496A(1));
                break;
        }
        return qw.a0.f30746a;
    }
}
