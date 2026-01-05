package pc;

import a9.C0073l;
import ec.C2005c;
import i0.m0;
import iz.C3391x;
import iz.InterfaceC3392y;
import iz.i0;
import iz.j0;
import iz.k0;
import iz.n0;
import kotlin.jvm.internal.AbstractC4154l;
import oc.C5335b;
import og.ud;
import oz.C5783f;
import p020v.x0;
import pd.C5897c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pc.k */
/* loaded from: classes.dex */
public final class C5883k implements InterfaceC3392y {

    /* renamed from: a */
    public static final C5883k f28689a = new C5883k();

    @Override // iz.InterfaceC3392y
    /* renamed from: a */
    public final k0 mo7804a(C5783f c5783f) {
        C5335b c5335b;
        x0 x0Var = (x0) c5783f.f28358i;
        Object objM14479O = x0Var.m14479O(C5893u.class);
        i0 i0Var = (i0) x0Var.f36757e;
        C3391x c3391x = (C3391x) x0Var.f36754b;
        C5893u c5893u = (C5893u) objM14479O;
        if (c5893u == null || (c5335b = c5893u.f28723c) == null) {
            return c5783f.m11332f(x0Var);
        }
        C2005c c2005cM10980f = ud.m10980f();
        String value = c3391x.f17994d + ':' + c3391x.f17995e;
        AbstractC4154l.m8923f(value, "value");
        m0.m7365B("server.address", c2005cM10980f, value);
        if (i0Var != null) {
            C0073l c0073lM14470E = x0Var.m14470E();
            String str = (String) x0Var.f36755c;
            C5897c counter = c5335b.f26249n;
            AbstractC4154l.m8923f(counter, "counter");
            c0073lM14470E.m196E(str, new C5879g(i0Var, counter, c2005cM10980f));
            x0Var = new x0(c0073lM14470E);
        }
        k0 k0VarM11332f = c5783f.m11332f(x0Var);
        n0 n0Var = k0VarM11332f.f17923g;
        if (n0Var.mo7460h() == 0) {
            return k0VarM11332f;
        }
        j0 j0VarM7739h = k0VarM11332f.m7739h();
        C5897c counter2 = c5335b.f26250p;
        AbstractC4154l.m8923f(counter2, "counter");
        j0VarM7739h.f17905g = new C5880h(n0Var, counter2, c2005cM10980f);
        return j0VarM7739h.m7732a();
    }
}
