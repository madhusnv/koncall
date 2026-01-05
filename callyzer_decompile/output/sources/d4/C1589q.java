package d4;

import a3.C0045d;
import c3.C0848c;
import e1.j0;
import ex.InterfaceC2139c;
import java.util.ArrayList;
import java.util.List;
import m2.C4640e;
import og.nc;
import rw.AbstractC6663m;
import rw.C6668r;
import t3.c1;
import v3.AbstractC7634f;
import v3.InterfaceC7641m;
import v3.g0;
import v3.h1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d4.q */
/* loaded from: classes.dex */
public final class C1589q {

    /* renamed from: a */
    public final AbstractC7878q f7876a;

    /* renamed from: b */
    public final boolean f7877b;

    /* renamed from: c */
    public final g0 f7878c;

    /* renamed from: d */
    public final C1583k f7879d;

    /* renamed from: e */
    public boolean f7880e;

    /* renamed from: f */
    public C1589q f7881f;

    /* renamed from: g */
    public final int f7882g;

    public C1589q(AbstractC7878q abstractC7878q, boolean z6, g0 g0Var, C1583k c1583k) {
        this.f7876a = abstractC7878q;
        this.f7877b = z6;
        this.f7878c = g0Var;
        this.f7879d = c1583k;
        this.f7882g = g0Var.f36843b;
    }

    /* renamed from: h */
    public static /* synthetic */ List m5206h(int i10, C1589q c1589q) {
        return c1589q.m5213g((i10 & 1) != 0 ? !c1589q.f7877b : false, (i10 & 2) == 0);
    }

    /* renamed from: a */
    public final C1589q m5207a(C1580h c1580h, InterfaceC2139c interfaceC2139c) {
        C1583k c1583k = new C1583k();
        c1583k.f7870c = false;
        c1583k.f7871d = false;
        interfaceC2139c.invoke(c1583k);
        C1589q c1589q = new C1589q(new C1588p(interfaceC2139c), false, new g0(true, this.f7882g + (c1580h != null ? 1000000000 : 2000000000)), c1583k);
        c1589q.f7880e = true;
        c1589q.f7881f = this;
        return c1589q;
    }

    /* renamed from: b */
    public final void m5208b(g0 g0Var, ArrayList arrayList) {
        C4640e c4640eM14612y = g0Var.m14612y();
        Object[] objArr = c4640eM14612y.f22884a;
        int i10 = c4640eM14612y.f22886c;
        for (int i11 = 0; i11 < i10; i11++) {
            g0 g0Var2 = (g0) objArr[i11];
            if (g0Var2.m14578H() && !g0Var2.f44836h0) {
                if (g0Var2.f36832K.m9386d(8)) {
                    arrayList.add(nc.m10778e(g0Var2, this.f7877b));
                } else {
                    m5208b(g0Var2, arrayList);
                }
            }
        }
    }

    /* renamed from: c */
    public final h1 m5209c() {
        if (this.f7880e) {
            C1589q c1589qM5215j = m5215j();
            if (c1589qM5215j != null) {
                return c1589qM5215j.m5209c();
            }
            return null;
        }
        InterfaceC7641m interfaceC7641mM10779f = nc.m10779f(this.f7878c);
        if (interfaceC7641mM10779f == null) {
            interfaceC7641mM10779f = this.f7876a;
        }
        return AbstractC7634f.m14561v(interfaceC7641mM10779f, 8);
    }

    /* renamed from: d */
    public final void m5210d(ArrayList arrayList, ArrayList arrayList2) {
        m5220o(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            C1589q c1589q = (C1589q) arrayList.get(size2);
            if (c1589q.m5217l()) {
                arrayList2.add(c1589q);
            } else if (!c1589q.f7879d.f7871d) {
                c1589q.m5210d(arrayList, arrayList2);
            }
        }
    }

    /* renamed from: e */
    public final C0848c m5211e() {
        h1 h1VarM5209c = m5209c();
        if (h1VarM5209c != null) {
            if (!h1VarM5209c.T0().f37683p) {
                h1VarM5209c = null;
            }
            if (h1VarM5209c != null) {
                return c1.m13279h(h1VarM5209c).mo13298S(h1VarM5209c, true);
            }
        }
        return C0848c.f5353e;
    }

    /* renamed from: f */
    public final C0848c m5212f() {
        h1 h1VarM5209c = m5209c();
        if (h1VarM5209c != null) {
            if (!h1VarM5209c.T0().f37683p) {
                h1VarM5209c = null;
            }
            if (h1VarM5209c != null) {
                return c1.m13277f(h1VarM5209c);
            }
        }
        return C0848c.f5353e;
    }

    /* renamed from: g */
    public final List m5213g(boolean z6, boolean z10) {
        if (!z6 && this.f7879d.f7871d) {
            return C6668r.f31943a;
        }
        ArrayList arrayList = new ArrayList();
        if (!m5217l()) {
            return m5220o(arrayList, z10);
        }
        ArrayList arrayList2 = new ArrayList();
        m5210d(arrayList, arrayList2);
        return arrayList2;
    }

    /* renamed from: i */
    public final C1583k m5214i() {
        boolean zM5217l = m5217l();
        C1583k c1583k = this.f7879d;
        if (!zM5217l) {
            return c1583k;
        }
        C1583k c1583kM5199b = c1583k.m5199b();
        m5219n(new ArrayList(), c1583kM5199b);
        return c1583kM5199b;
    }

    /* renamed from: j */
    public final C1589q m5215j() {
        g0 g0VarM14609v;
        C1589q c1589q = this.f7881f;
        if (c1589q != null) {
            return c1589q;
        }
        g0 g0Var = this.f7878c;
        boolean z6 = this.f7877b;
        if (z6) {
            g0VarM14609v = g0Var.m14609v();
            while (g0VarM14609v != null) {
                C1583k c1583kM14611x = g0VarM14609v.m14611x();
                if (c1583kM14611x != null && c1583kM14611x.f7870c) {
                    break;
                }
                g0VarM14609v = g0VarM14609v.m14609v();
            }
            g0VarM14609v = null;
        } else {
            g0VarM14609v = null;
        }
        if (g0VarM14609v == null) {
            g0 g0VarM14609v2 = g0Var.m14609v();
            while (true) {
                if (g0VarM14609v2 == null) {
                    g0VarM14609v = null;
                    break;
                }
                if (g0VarM14609v2.f36832K.m9386d(8)) {
                    g0VarM14609v = g0VarM14609v2;
                    break;
                }
                g0VarM14609v2 = g0VarM14609v2.m14609v();
            }
        }
        if (g0VarM14609v == null) {
            return null;
        }
        return nc.m10778e(g0VarM14609v, z6);
    }

    /* renamed from: k */
    public final C1583k m5216k() {
        return this.f7879d;
    }

    /* renamed from: l */
    public final boolean m5217l() {
        return this.f7877b && this.f7879d.f7870c;
    }

    /* renamed from: m */
    public final boolean m5218m() {
        if (this.f7880e || !m5206h(4, this).isEmpty()) {
            return false;
        }
        g0 g0VarM14609v = this.f7878c.m14609v();
        while (true) {
            if (g0VarM14609v == null) {
                g0VarM14609v = null;
                break;
            }
            C1583k c1583kM14611x = g0VarM14609v.m14611x();
            if (c1583kM14611x != null && c1583kM14611x.f7870c) {
                break;
            }
            g0VarM14609v = g0VarM14609v.m14609v();
        }
        return g0VarM14609v == null;
    }

    /* renamed from: n */
    public final void m5219n(ArrayList arrayList, C1583k c1583k) {
        if (this.f7879d.f7871d) {
            return;
        }
        m5220o(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            C1589q c1589q = (C1589q) arrayList.get(size2);
            if (!c1589q.m5217l()) {
                c1583k.m5201j(c1589q.f7879d);
                c1589q.m5219n(arrayList, c1583k);
            }
        }
    }

    /* renamed from: o */
    public final List m5220o(ArrayList arrayList, boolean z6) {
        if (this.f7880e) {
            return C6668r.f31943a;
        }
        m5208b(this.f7878c, arrayList);
        if (z6) {
            C1583k c1583k = this.f7879d;
            j0 j0Var = c1583k.f7868a;
            Object objM5574g = j0Var.m5574g(AbstractC1592t.f7939w);
            if (objM5574g == null) {
                objM5574g = null;
            }
            C1580h c1580h = (C1580h) objM5574g;
            if (c1580h != null && c1583k.f7870c && !arrayList.isEmpty()) {
                arrayList.add(m5207a(c1580h, new C0045d(3, c1580h)));
            }
            C1595w c1595w = AbstractC1592t.f7917a;
            if (j0Var.m5570c(c1595w) && !arrayList.isEmpty() && c1583k.f7870c) {
                Object objM5574g2 = j0Var.m5574g(c1595w);
                if (objM5574g2 == null) {
                    objM5574g2 = null;
                }
                List list = (List) objM5574g2;
                String str = list != null ? (String) AbstractC6663m.m12743G(list) : null;
                if (str != null) {
                    arrayList.add(0, m5207a(null, new C1587o(str, 0)));
                }
            }
        }
        return arrayList;
    }
}
