package h1;

import ai.AbstractC0151h;
import aq.C0406i;
import aq.C0408k;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import og.nd;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import qw.EnumC6359i;
import uw.InterfaceC7559c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class v1 {

    /* renamed from: a */
    public static final Object f15630a = nd.m10781b(EnumC6359i.NONE, t1.f15615a);

    /* renamed from: a */
    public static final void m6868a(s1 s1Var, p1 p1Var, Object obj, Object obj2, InterfaceC2794y interfaceC2794y, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(867041821);
        if ((i10 & 6) == 0) {
            i11 = (c3966o.m8614g(s1Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c3966o.m8614g(p1Var) ? 32 : 16;
        }
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            i11 |= (i10 & 512) == 0 ? c3966o.m8614g(obj) : c3966o.m8616i(obj) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= (i10 & 4096) == 0 ? c3966o.m8614g(obj2) : c3966o.m8616i(obj2) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= (32768 & i10) == 0 ? c3966o.m8614g(interfaceC2794y) : c3966o.m8616i(interfaceC2794y) ? 16384 : 8192;
        }
        if (!c3966o.m8598P(i11 & 1, (i11 & 9363) != 9362)) {
            c3966o.m8601S();
        } else if (s1Var.m6858g()) {
            p1Var.m6847h(obj, obj2, interfaceC2794y);
        } else {
            p1Var.m6848i(obj2, interfaceC2794y);
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new g1.e0(s1Var, p1Var, obj, obj2, interfaceC2794y, i10);
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [ex.c, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r5v7, types: [ex.c, kotlin.jvm.internal.m] */
    /* renamed from: b */
    public static final m1 m6869b(s1 s1Var, x1 x1Var, String str, InterfaceC3962k interfaceC3962k, int i10, int i11) {
        l1 l1Var;
        if ((i11 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean zM8614g = ((C3966o) interfaceC3962k).m8614g(s1Var);
        C3966o c3966o = (C3966o) interfaceC3962k;
        Object objM8596M = c3966o.m8596M();
        k2.s0 s0Var = C3961j.f20408a;
        if (zM8614g || objM8596M == s0Var) {
            objM8596M = new m1(s1Var, x1Var, str);
            c3966o.j0(objM8596M);
        }
        m1 m1Var = (m1) objM8596M;
        boolean zM8614g2 = c3966o.m8614g(s1Var) | c3966o.m8616i(m1Var);
        Object objM8596M2 = c3966o.m8596M();
        if (zM8614g2 || objM8596M2 == s0Var) {
            objM8596M2 = new C0408k(22, s1Var, m1Var);
            c3966o.j0(objM8596M2);
        }
        C3953b.m8500c(m1Var, (InterfaceC2139c) objM8596M2, c3966o);
        if (s1Var.m6858g() && (l1Var = (l1) m1Var.f15516b.getValue()) != null) {
            s1 s1Var2 = m1Var.f15517c;
            l1Var.f15507a.m6847h(l1Var.f15509c.invoke(s1Var2.m6857f().mo6099a()), l1Var.f15509c.invoke(s1Var2.m6857f().mo6100c()), (InterfaceC2794y) l1Var.f15508b.invoke(s1Var2.m6857f()));
        }
        return m1Var;
    }

    /* renamed from: c */
    public static final p1 m6870c(s1 s1Var, Object obj, Object obj2, InterfaceC2794y interfaceC2794y, x1 x1Var, InterfaceC3962k interfaceC3962k, int i10) {
        boolean zM8614g = ((C3966o) interfaceC3962k).m8614g(s1Var);
        C3966o c3966o = (C3966o) interfaceC3962k;
        Object objM8596M = c3966o.m8596M();
        Object obj3 = C3961j.f20408a;
        if (zM8614g || objM8596M == obj3) {
            AbstractC2785p abstractC2785p = (AbstractC2785p) x1Var.f15661a.invoke(obj2);
            abstractC2785p.mo6834d();
            objM8596M = new p1(s1Var, obj, abstractC2785p, x1Var);
            c3966o.j0(objM8596M);
        }
        p1 p1Var = (p1) objM8596M;
        m6868a(s1Var, p1Var, obj, obj2, interfaceC2794y, c3966o, 0);
        boolean zM8614g2 = c3966o.m8614g(s1Var) | c3966o.m8614g(p1Var);
        Object objM8596M2 = c3966o.m8596M();
        if (zM8614g2 || objM8596M2 == obj3) {
            objM8596M2 = new C0408k(23, s1Var, p1Var);
            c3966o.j0(objM8596M2);
        }
        C3953b.m8500c(p1Var, (InterfaceC2139c) objM8596M2, c3966o);
        return p1Var;
    }

    /* renamed from: d */
    public static final s1 m6871d(AbstractC0151h abstractC0151h, String str, InterfaceC3962k interfaceC3962k, int i10) {
        int i11 = (i10 & 14) ^ 6;
        boolean z6 = true;
        boolean z10 = (i11 > 4 && ((C3966o) interfaceC3962k).m8614g(abstractC0151h)) || (i10 & 6) == 4;
        C3966o c3966o = (C3966o) interfaceC3962k;
        Object objM8596M = c3966o.m8596M();
        Object obj = C3961j.f20408a;
        InterfaceC7559c interfaceC7559c = null;
        if (z10 || objM8596M == obj) {
            objM8596M = new s1(abstractC0151h, null, str);
            c3966o.j0(objM8596M);
        }
        s1 s1Var = (s1) objM8596M;
        if (abstractC0151h instanceof x0) {
            c3966o.m8607Y(1030829284);
            x0 x0Var = (x0) abstractC0151h;
            Object value = x0Var.f15646c.getValue();
            Object value2 = x0Var.f15645b.getValue();
            if ((i11 <= 4 || !c3966o.m8614g(abstractC0151h)) && (i10 & 6) != 4) {
                z6 = false;
            }
            Object objM8596M2 = c3966o.m8596M();
            if (z6 || objM8596M2 == obj) {
                objM8596M2 = new C0406i(abstractC0151h, interfaceC7559c, 25);
                c3966o.j0(objM8596M2);
            }
            C3953b.m8504g(value, value2, (InterfaceC2141e) objM8596M2, c3966o);
            c3966o.m8623p(false);
        } else {
            c3966o.m8607Y(1031290843);
            s1Var.m6852a(abstractC0151h.mo313A(), c3966o, 0);
            c3966o.m8623p(false);
        }
        boolean zM8614g = c3966o.m8614g(s1Var);
        Object objM8596M3 = c3966o.m8596M();
        if (zM8614g || objM8596M3 == obj) {
            objM8596M3 = new g1.c0(s1Var, 1);
            c3966o.j0(objM8596M3);
        }
        C3953b.m8500c(s1Var, (InterfaceC2139c) objM8596M3, c3966o);
        return s1Var;
    }

    /* renamed from: e */
    public static final s1 m6872e(Object obj, String str, InterfaceC3962k interfaceC3962k, int i10, int i11) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        C3966o c3966o = (C3966o) interfaceC3962k;
        Object objM8596M = c3966o.m8596M();
        k2.s0 s0Var = C3961j.f20408a;
        if (objM8596M == s0Var) {
            objM8596M = new s1(new j0(obj), null, str);
            c3966o.j0(objM8596M);
        }
        s1 s1Var = (s1) objM8596M;
        s1Var.m6852a(obj, c3966o, (i10 & 8) | 48 | (i10 & 14));
        Object objM8596M2 = c3966o.m8596M();
        if (objM8596M2 == s0Var) {
            objM8596M2 = new g1.c0(s1Var, 2);
            c3966o.j0(objM8596M2);
        }
        C3953b.m8500c(s1Var, (InterfaceC2139c) objM8596M2, c3966o);
        return s1Var;
    }
}
