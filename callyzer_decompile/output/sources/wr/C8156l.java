package wr;

import android.content.Context;
import bt.C0768m;
import com.websoptimization.callyzerbiz.R;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import g2.u9;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import pg.f9;
import ps.C6016p;
import qw.a0;
import s2.AbstractC6740i;
import s2.C6734c;
import sq.g2;
import zr.C9031a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wr.l */
/* loaded from: classes3.dex */
public final /* synthetic */ class C8156l implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f39064a;

    /* renamed from: b */
    public final /* synthetic */ C9031a f39065b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2139c f39066c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC2137a f39067d;

    /* renamed from: e */
    public final /* synthetic */ Context f39068e;

    public /* synthetic */ C8156l(C9031a c9031a, InterfaceC2139c interfaceC2139c, InterfaceC2137a interfaceC2137a, Context context, int i10) {
        this.f39064a = i10;
        this.f39065b = c9031a;
        this.f39066c = interfaceC2139c;
        this.f39067d = interfaceC2137a;
        this.f39068e = context;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f39064a) {
            case 0:
                InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8598P(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C9031a c9031a = this.f39065b;
                    InterfaceC2139c interfaceC2139c = this.f39066c;
                    u9.m6323a(null, AbstractC6740i.m12902d(97028201, new C8156l(c9031a, interfaceC2139c, this.f39067d, this.f39068e, 1), c3966o), null, null, null, 0, 0L, 0L, null, AbstractC6740i.m12902d(1187035508, new C8155k(c9031a, interfaceC2139c, 1), c3966o), c3966o, 805306416, 509);
                } else {
                    c3966o.m8601S();
                }
                break;
            default:
                InterfaceC3962k interfaceC3962k2 = (InterfaceC3962k) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                C3966o c3966o2 = (C3966o) interfaceC3962k2;
                if (c3966o2.m8598P(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    String strM11629c = f9.m11629c(c3966o2, R.string.select_employee);
                    C9031a c9031a2 = this.f39065b;
                    boolean z6 = !c9031a2.f43491h;
                    InterfaceC2139c interfaceC2139c2 = this.f39066c;
                    InterfaceC2137a interfaceC2137a = this.f39067d;
                    C6734c c6734cM12902d = AbstractC6740i.m12902d(1799035863, new C0768m(c9031a2, interfaceC2139c2, interfaceC2137a, this.f39068e, 21), c3966o2);
                    boolean zM8614g = c3966o2.m8614g(interfaceC2139c2) | c3966o2.m8614g(interfaceC2137a);
                    Object objM8596M = c3966o2.m8596M();
                    if (zM8614g || objM8596M == C3961j.f20408a) {
                        objM8596M = new C6016p(3, interfaceC2137a, interfaceC2139c2);
                        c3966o2.j0(objM8596M);
                    }
                    g2.m13157i(null, null, false, strM11629c, 0L, 0, z6, c6734cM12902d, (InterfaceC2137a) objM8596M, c3966o2, 12582912, 55);
                } else {
                    c3966o2.m8601S();
                }
                break;
        }
        return a0.f30746a;
    }
}
