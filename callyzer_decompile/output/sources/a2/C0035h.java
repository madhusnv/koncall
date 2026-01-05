package a2;

import d3.C1565s;
import d3.InterfaceC1566t;
import ex.InterfaceC2139c;
import g4.C2492h;
import g4.k0;
import g4.l0;
import g4.o0;
import java.util.List;
import k4.InterfaceC3987h;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import rw.C6668r;
import v3.AbstractC7634f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: a2.h */
/* loaded from: classes.dex */
public final class C0035h extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f153a;

    /* renamed from: b */
    public final /* synthetic */ C0038k f154b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0035h(C0038k c0038k, int i10) {
        super(1);
        this.f153a = i10;
        this.f154b = c0038k;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        l0 l0Var;
        switch (this.f153a) {
            case 0:
                List list = (List) obj;
                C0038k c0038k = this.f154b;
                l0 l0Var2 = c0038k.L0().f128n;
                if (l0Var2 != null) {
                    k0 k0Var = l0Var2.f13670a;
                    C2492h c2492h = k0Var.f13660a;
                    o0 o0Var = c0038k.f167r;
                    InterfaceC1566t interfaceC1566t = c0038k.f160C;
                    l0Var = new l0(new k0(c2492h, o0.m6462e(o0Var, interfaceC1566t != null ? interfaceC1566t.mo5194a() : C1565s.f7817j, 0L, null, null, 0L, null, 0, 0L, 16777214), k0Var.f13662c, k0Var.f13663d, k0Var.f13664e, k0Var.f13665f, k0Var.f13666g, k0Var.f13667h, k0Var.f13668i, k0Var.f13669j), l0Var2.f13671b, l0Var2.f13672c);
                    list.add(l0Var);
                } else {
                    l0Var = null;
                }
                break;
            case 1:
                C2492h c2492h2 = (C2492h) obj;
                C0038k c0038k2 = this.f154b;
                C0034g c0034g = c0038k2.f165H;
                C6668r c6668r = C6668r.f31943a;
                if (c0034g == null) {
                    C0034g c0034g2 = new C0034g(c0038k2.f166q, c2492h2);
                    C0032e c0032e = new C0032e(c2492h2, c0038k2.f167r, c0038k2.f168s, c0038k2.f170v, c0038k2.f171w, c0038k2.f172x, c0038k2.f173y, c6668r);
                    c0032e.m138c(c0038k2.L0().f124j);
                    c0034g2.f152d = c0032e;
                    c0038k2.f165H = c0034g2;
                } else if (!AbstractC4154l.m8918a(c2492h2, c0034g.f150b)) {
                    c0034g.f150b = c2492h2;
                    C0032e c0032e2 = c0034g.f152d;
                    if (c0032e2 != null) {
                        o0 o0Var2 = c0038k2.f167r;
                        InterfaceC3987h interfaceC3987h = c0038k2.f168s;
                        int i10 = c0038k2.f170v;
                        boolean z6 = c0038k2.f171w;
                        int i11 = c0038k2.f172x;
                        int i12 = c0038k2.f173y;
                        c0032e2.f115a = c2492h2;
                        boolean zM6464c = o0Var2.m6464c(c0032e2.f125k);
                        c0032e2.f125k = o0Var2;
                        if (!zM6464c) {
                            c0032e2.f126l = null;
                            c0032e2.f128n = null;
                            c0032e2.f130p = -1;
                            c0032e2.f129o = -1;
                        }
                        c0032e2.f116b = interfaceC3987h;
                        c0032e2.f117c = i10;
                        c0032e2.f118d = z6;
                        c0032e2.f119e = i11;
                        c0032e2.f120f = i12;
                        c0032e2.f121g = c6668r;
                        c0032e2.f126l = null;
                        c0032e2.f128n = null;
                        c0032e2.f130p = -1;
                        c0032e2.f129o = -1;
                    }
                }
                AbstractC7634f.m14554o(c0038k2);
                AbstractC7634f.m14553n(c0038k2);
                AbstractC7634f.m14552m(c0038k2);
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C0038k c0038k3 = this.f154b;
                C0034g c0034g3 = c0038k3.f165H;
                if (c0034g3 != null) {
                    InterfaceC2139c interfaceC2139c = c0038k3.f161D;
                    if (interfaceC2139c != null) {
                        interfaceC2139c.invoke(c0034g3);
                    }
                    C0034g c0034g4 = c0038k3.f165H;
                    if (c0034g4 != null) {
                        c0034g4.f151c = zBooleanValue;
                    }
                    AbstractC7634f.m14554o(c0038k3);
                    AbstractC7634f.m14553n(c0038k3);
                    AbstractC7634f.m14552m(c0038k3);
                    break;
                } else {
                    break;
                }
        }
        return Boolean.TRUE;
    }
}
