package bt;

import at.C0431b;
import ex.InterfaceC2141e;
import k2.C3953b;
import k2.C3966o;
import k2.InterfaceC3962k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m0 implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f4879a = 0;

    /* renamed from: b */
    public final /* synthetic */ C0431b f4880b;

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        Integer num = (Integer) obj2;
        switch (this.f4879a) {
            case 0:
                int iIntValue = num.intValue();
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8598P(iIntValue & 1, (iIntValue & 3) != 2)) {
                    b0.m2066e(this.f4880b, c3966o, 0);
                } else {
                    c3966o.m8601S();
                }
                break;
            default:
                num.getClass();
                b0.m2066e(this.f4880b, interfaceC3962k, C3953b.m8496A(1));
                break;
        }
        return qw.a0.f30746a;
    }
}
