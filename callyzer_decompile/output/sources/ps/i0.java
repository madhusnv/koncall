package ps;

import androidx.compose.foundation.AbstractC0237a;
import androidx.compose.foundation.layout.AbstractC0245d;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import g2.e6;
import g2.v1;
import g2.y1;
import j3.C3552f;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import og.wb;
import sq.g2;
import w2.C7876o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i0 implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f29380a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2139c f29381b;

    /* renamed from: c */
    public final /* synthetic */ String f29382c;

    public /* synthetic */ i0(int i10, int i11, InterfaceC2139c interfaceC2139c, String str) {
        this.f29380a = i11;
        this.f29382c = str;
        this.f29381b = interfaceC2139c;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        Integer num = (Integer) obj2;
        switch (this.f29380a) {
            case 0:
                num.getClass();
                AbstractC6009i.m12043m(this.f29382c, this.f29381b, interfaceC3962k, C3953b.m8496A(1));
                break;
            case 1:
                int iIntValue = num.intValue();
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8598P(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C3552f c3552fM11029b = wb.m11029b();
                    long j6 = ((v1) c3966o.m8618k(y1.f13286a)).f12970q;
                    InterfaceC7879r interfaceC7879rM678o = AbstractC0245d.m678o(C7876o.f37669a, 15);
                    InterfaceC2139c interfaceC2139c = this.f29381b;
                    boolean zM8614g = c3966o.m8614g(interfaceC2139c);
                    String str = this.f29382c;
                    boolean zM8614g2 = zM8614g | c3966o.m8614g(str);
                    Object objM8596M = c3966o.m8596M();
                    if (zM8614g2 || objM8596M == C3961j.f20408a) {
                        objM8596M = new h0(interfaceC2139c, str, 1);
                        c3966o.j0(objM8596M);
                    }
                    e6.m6133b(c3552fM11029b, "Localized description", AbstractC0237a.m637e(interfaceC7879rM678o, false, null, null, (InterfaceC2137a) objM8596M, 7), j6, c3966o, 48, 0);
                } else {
                    c3966o.m8601S();
                }
                return qw.a0.f30746a;
            default:
                num.getClass();
                g2.m13171w(this.f29382c, this.f29381b, interfaceC3962k, C3953b.m8496A(1));
                break;
        }
        return qw.a0.f30746a;
    }

    public /* synthetic */ i0(InterfaceC2139c interfaceC2139c, String str) {
        this.f29380a = 1;
        this.f29381b = interfaceC2139c;
        this.f29382c = str;
    }
}
