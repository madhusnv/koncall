package ds;

import ex.InterfaceC2141e;
import fs.C2371b;
import k2.C3953b;
import k2.C3966o;
import k2.InterfaceC3962k;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ds.f */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1782f implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f8663a = 1;

    /* renamed from: b */
    public final /* synthetic */ C2371b f8664b;

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        Integer num = (Integer) obj2;
        switch (this.f8663a) {
            case 0:
                num.getClass();
                AbstractC1777a.m5467g(this.f8664b, interfaceC3962k, C3953b.m8496A(1));
                break;
            default:
                int iIntValue = num.intValue();
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8598P(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC1777a.m5467g(this.f8664b, c3966o, 0);
                } else {
                    c3966o.m8601S();
                }
                break;
        }
        return a0.f30746a;
    }
}
