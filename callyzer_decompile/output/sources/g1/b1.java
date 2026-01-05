package g1;

import a3.C0045d;
import com.skydoves.balloon.internals.DefinitionKt;
import d3.C1565s;
import e3.AbstractC1927c;
import h1.AbstractC2773d;
import h1.AbstractC2774e;
import h1.InterfaceC2794y;
import h1.x1;
import h1.y1;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.h2;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class b1 {
    static {
        AbstractC2773d.m6794q(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, null, 7);
    }

    /* renamed from: a */
    public static final h2 m6085a(long j6, InterfaceC2794y interfaceC2794y, InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        boolean zM8614g = c3966o.m8614g(C1565s.m5190f(j6));
        Object objM8596M = c3966o.m8596M();
        if (zM8614g || objM8596M == C3961j.f20408a) {
            AbstractC1927c abstractC1927cM5190f = C1565s.m5190f(j6);
            C2423c c2423c = C2423c.f10934f;
            C0045d c0045d = new C0045d(7, abstractC1927cM5190f);
            x1 x1Var = y1.f15664a;
            x1 x1Var2 = new x1(c2423c, c0045d);
            c3966o.j0(x1Var2);
            objM8596M = x1Var2;
        }
        return AbstractC2774e.m6800c(new C1565s(j6), (x1) objM8596M, interfaceC2794y, null, "ColorAnimation", c3966o, (i10 << 3) & 896, 8);
    }
}
