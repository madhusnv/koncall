package fp;

import ex.InterfaceC2141e;
import hp.AbstractC2994a;
import k2.C3953b;
import k2.InterfaceC3962k;
import qp.C6266c;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fp.a */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2361a implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f10752a;

    /* renamed from: b */
    public final /* synthetic */ C6266c f10753b;

    public /* synthetic */ C2361a(C6266c c6266c, int i10, int i11) {
        this.f10752a = i11;
        this.f10753b = c6266c;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f10752a;
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        ((Integer) obj2).getClass();
        switch (i10) {
            case 0:
                AbstractC2365e.m6052d(this.f10753b, interfaceC3962k, C3953b.m8496A(1));
                break;
            default:
                AbstractC2994a.m7251d(this.f10753b, interfaceC3962k, C3953b.m8496A(1));
                break;
        }
        return a0.f30746a;
    }
}
