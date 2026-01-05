package yu;

import ex.InterfaceC2141e;
import k2.C3953b;
import k2.InterfaceC3962k;
import qw.a0;
import zq.AbstractC9018a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yu.i */
/* loaded from: classes3.dex */
public final /* synthetic */ class C8783i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f42441a;

    /* renamed from: b */
    public final /* synthetic */ String f42442b;

    /* renamed from: c */
    public final /* synthetic */ String f42443c;

    /* renamed from: d */
    public final /* synthetic */ String f42444d;

    public /* synthetic */ C8783i(int i10, int i11, String str, String str2, String str3) {
        this.f42441a = i11;
        this.f42442b = str;
        this.f42443c = str2;
        this.f42444d = str3;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f42441a;
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        ((Integer) obj2).getClass();
        switch (i10) {
            case 0:
                AbstractC8775a.m16135f(this.f42442b, this.f42443c, this.f42444d, interfaceC3962k, C3953b.m8496A(7));
                break;
            case 1:
                AbstractC8775a.m16134e(this.f42442b, this.f42443c, this.f42444d, interfaceC3962k, C3953b.m8496A(7));
                break;
            default:
                AbstractC9018a.m16492l(this.f42442b, this.f42443c, this.f42444d, interfaceC3962k, C3953b.m8496A(1));
                break;
        }
        return a0.f30746a;
    }
}
