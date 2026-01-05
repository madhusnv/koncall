package sq;

import com.websoptimization.callyzerbiz.R;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import ls.C4512c;
import pg.f9;
import ps.C6016p;
import s2.AbstractC6740i;
import s2.C6734c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v2 implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f33306a = 1;

    /* renamed from: b */
    public final /* synthetic */ boolean f33307b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2139c f33308c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC2137a f33309d;

    public /* synthetic */ v2(boolean z6, InterfaceC2139c interfaceC2139c, InterfaceC2137a interfaceC2137a) {
        this.f33307b = z6;
        this.f33308c = interfaceC2139c;
        this.f33309d = interfaceC2137a;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f33306a) {
            case 0:
                ((Integer) obj2).getClass();
                b1.m13074D(this.f33307b, this.f33308c, this.f33309d, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
            default:
                InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8598P(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String strM11629c = f9.m11629c(c3966o, R.string.select_tags);
                    boolean z6 = !this.f33307b;
                    InterfaceC2137a interfaceC2137a = this.f33309d;
                    InterfaceC2139c interfaceC2139c = this.f33308c;
                    C6734c c6734cM12902d = AbstractC6740i.m12902d(-908448765, new C4512c(19, interfaceC2137a, interfaceC2139c), c3966o);
                    boolean zM8614g = c3966o.m8614g(interfaceC2139c) | c3966o.m8614g(interfaceC2137a);
                    Object objM8596M = c3966o.m8596M();
                    if (zM8614g || objM8596M == C3961j.f20408a) {
                        objM8596M = new C6016p(6, interfaceC2137a, interfaceC2139c);
                        c3966o.j0(objM8596M);
                    }
                    g2.m13157i(null, null, false, strM11629c, 0L, 0, z6, c6734cM12902d, (InterfaceC2137a) objM8596M, c3966o, 12582912, 55);
                } else {
                    c3966o.m8601S();
                }
                break;
        }
        return qw.a0.f30746a;
    }

    public /* synthetic */ v2(boolean z6, InterfaceC2139c interfaceC2139c, InterfaceC2137a interfaceC2137a, int i10) {
        this.f33307b = z6;
        this.f33308c = interfaceC2139c;
        this.f33309d = interfaceC2137a;
    }
}
