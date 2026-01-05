package x1;

import a1.C0004c;
import androidx.compose.foundation.AbstractC0237a;
import androidx.compose.ui.graphics.AbstractC0260a;
import b2.C0543a;
import cp.C1475f;
import d4.AbstractC1586n;
import eb.i3;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import g4.AbstractC2499o;
import g4.C2488d;
import g4.C2489e;
import g4.C2490f;
import g4.C2492h;
import java.util.ArrayList;
import java.util.List;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k9.C4032f;
import m1.InterfaceC4630l;
import o1.AbstractC5256o;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p3.AbstractC5818p;
import p3.InterfaceC5816n;
import rw.AbstractC6663m;
import u2.C7320q;
import uw.InterfaceC7559c;
import w2.C7876o;
import w2.InterfaceC7879r;
import wr.C8158n;
import z8.C8898a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class s1 {

    /* renamed from: a */
    public final k2.e1 f39677a = C3953b.m8517t(null);

    /* renamed from: b */
    public C2492h f39678b;

    /* renamed from: c */
    public final C7320q f39679c;

    public s1(C2492h c2492h) {
        C8259i c8259i = C8259i.f39531q;
        c2492h.getClass();
        C2489e c2489e = new C2489e(c2492h);
        ArrayList arrayList = c2489e.f13571c;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            List list = (List) c8259i.invoke(((C2488d) arrayList.get(i10)).m6420a(Integer.MIN_VALUE));
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i11 = 0; i11 < size2; i11++) {
                C2490f c2490f = (C2490f) list.get(i11);
                arrayList3.add(new C2488d(c2490f.f13595a, c2490f.f13596b, c2490f.f13597c, c2490f.f13598d));
            }
            AbstractC6663m.m12765x(arrayList2, arrayList3);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        this.f39678b = c2489e.m6428h();
        this.f39679c = new C7320q();
    }

    /* renamed from: c */
    public static C2490f m15471c(C2490f c2490f, g4.l0 l0Var) {
        int iM6470c = l0Var.f13671b.m6470c(r3.f13702f - 1, false);
        if (c2490f.f13596b < iM6470c) {
            return C2490f.m6430a(c2490f, null, Math.min(c2490f.f13597c, iM6470c), 11);
        }
        return null;
    }

    /* renamed from: a */
    public final void m15472a(InterfaceC3962k interfaceC3962k, int i10) {
        char c2;
        boolean z6;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(1154651354);
        char c10 = 2;
        int i11 = (c3966o.m8616i(this) ? 4 : 2) | i10;
        boolean z10 = false;
        if (c3966o.m8598P(i11 & 1, (i11 & 3) != 2)) {
            w3.w0 w0Var = (w3.w0) c3966o.m8618k(w3.k1.f37846r);
            C2492h c2492h = this.f39678b;
            List listM6434a = c2492h.m6434a(c2492h.f13620b.length());
            int size = listM6434a.size();
            int i12 = 0;
            while (i12 < size) {
                C2490f c2490f = (C2490f) listM6434a.get(i12);
                int i13 = c2490f.f13596b;
                Object obj = c2490f.f13595a;
                if (i13 != c2490f.f13597c) {
                    c3966o.m8607Y(1386075176);
                    Object objM8596M = c3966o.m8596M();
                    k2.s0 s0Var = C3961j.f20408a;
                    Object objM7389v = objM8596M;
                    if (objM8596M == s0Var) {
                        objM7389v = i0.m0.m7389v(c3966o);
                    }
                    InterfaceC4630l interfaceC4630l = (InterfaceC4630l) objM7389v;
                    c2 = c10;
                    InterfaceC7879r interfaceC7879rM641i = AbstractC0237a.m641i(AbstractC1586n.m5204b(AbstractC0260a.m714a(C7876o.f37669a, new C8158n(8, this, c2490f)), z10, C8259i.f39532r).mo14852e(new t1(new C0004c(23, this, c2490f))), interfaceC4630l);
                    InterfaceC5816n.f28472a.getClass();
                    InterfaceC7879r interfaceC7879rM11402f = AbstractC5818p.m11402f(interfaceC7879rM641i, AbstractC5818p.f28474b);
                    boolean zM8616i = c3966o.m8616i(this) | c3966o.m8614g(c2490f) | c3966o.m8616i(w0Var);
                    Object objM8596M2 = c3966o.m8596M();
                    Object obj2 = objM8596M2;
                    if (zM8616i || objM8596M2 == s0Var) {
                        C8898a c8898a = new C8898a(this, c2490f, w0Var);
                        c3966o.j0(c8898a);
                        obj2 = c8898a;
                    }
                    boolean z11 = false;
                    AbstractC5256o.m10358a(AbstractC0237a.m638f(interfaceC7879rM11402f, interfaceC4630l, null, null, (InterfaceC2137a) obj2), c3966o, 0);
                    AbstractC2499o abstractC2499o = (AbstractC2499o) obj;
                    g4.m0 m0VarMo6453a = abstractC2499o.mo6453a();
                    if (m0VarMo6453a == null || (m0VarMo6453a.f13678a == null && m0VarMo6453a.f13679b == null && m0VarMo6453a.f13680c == null && m0VarMo6453a.f13681d == null)) {
                        z6 = false;
                        c3966o.m8607Y(1388926990);
                        c3966o.m8623p(false);
                    } else {
                        c3966o.m8607Y(1386898319);
                        Object objM8596M3 = c3966o.m8596M();
                        Object obj3 = objM8596M3;
                        if (objM8596M3 == s0Var) {
                            w0 w0Var2 = new w0(interfaceC4630l);
                            c3966o.j0(w0Var2);
                            obj3 = w0Var2;
                        }
                        w0 w0Var3 = (w0) obj3;
                        Object objM8596M4 = c3966o.m8596M();
                        Object obj4 = objM8596M4;
                        if (objM8596M4 == s0Var) {
                            C4032f c4032f = new C4032f((Object) w0Var3, (InterfaceC7559c) (z11 ? 1 : 0), 19);
                            c3966o.j0(c4032f);
                            obj4 = c4032f;
                        }
                        C3953b.m8503f((InterfaceC2141e) obj4, qw.a0.f30746a, c3966o);
                        k2.b1 b1Var = w0Var3.f39731b;
                        k2.b1 b1Var2 = w0Var3.f39731b;
                        Boolean boolValueOf = Boolean.valueOf((b1Var.m8526f() & 2) != 0);
                        Boolean boolValueOf2 = Boolean.valueOf((b1Var2.m8526f() & 1) != 0);
                        Boolean boolValueOf3 = Boolean.valueOf((b1Var2.m8526f() & 4) != 0);
                        g4.m0 m0VarMo6453a2 = abstractC2499o.mo6453a();
                        g4.g0 g0Var = m0VarMo6453a2 != null ? m0VarMo6453a2.f13678a : null;
                        g4.m0 m0VarMo6453a3 = abstractC2499o.mo6453a();
                        g4.g0 g0Var2 = m0VarMo6453a3 != null ? m0VarMo6453a3.f13679b : null;
                        g4.m0 m0VarMo6453a4 = abstractC2499o.mo6453a();
                        g4.g0 g0Var3 = m0VarMo6453a4 != null ? m0VarMo6453a4.f13680c : null;
                        g4.m0 m0VarMo6453a5 = abstractC2499o.mo6453a();
                        Object[] objArr = {boolValueOf, boolValueOf2, boolValueOf3, g0Var, g0Var2, g0Var3, m0VarMo6453a5 != null ? m0VarMo6453a5.f13681d : null};
                        boolean zM8616i2 = c3966o.m8616i(this) | c3966o.m8614g(c2490f);
                        Object objM8596M5 = c3966o.m8596M();
                        Object obj5 = objM8596M5;
                        if (zM8616i2 || objM8596M5 == s0Var) {
                            C8158n c8158n = new C8158n(this, c2490f, w0Var3);
                            c3966o.j0(c8158n);
                            obj5 = c8158n;
                        }
                        m15473b(objArr, (InterfaceC2139c) obj5, c3966o, (i11 << 6) & 896);
                        z6 = false;
                        c3966o.m8623p(false);
                    }
                    c3966o.m8623p(z6);
                } else {
                    c2 = c10;
                    z6 = z10;
                    c3966o.m8607Y(1388940878);
                    c3966o.m8623p(z6);
                }
                i12++;
                z10 = z6;
                c10 = c2;
            }
        } else {
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C1475f(this, i10, 27);
        }
    }

    /* renamed from: b */
    public final void m15473b(Object[] objArr, InterfaceC2139c interfaceC2139c, InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-2083052099);
        int i11 = (i10 & 48) == 0 ? (c3966o.m8616i(interfaceC2139c) ? 32 : 16) | i10 : i10;
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            i11 |= c3966o.m8616i(this) ? 256 : 128;
        }
        c3966o.m8605W(-416604407, Integer.valueOf(objArr.length));
        for (Object obj : objArr) {
            i11 |= c3966o.m8616i(obj) ? 4 : 0;
        }
        c3966o.m8623p(false);
        if ((i11 & 14) == 0) {
            i11 |= 2;
        }
        if (c3966o.m8598P(i11 & 1, (i11 & 147) != 146)) {
            i3 i3Var = new i3(3);
            ArrayList arrayList = i3Var.f9339a;
            arrayList.add(interfaceC2139c);
            i3Var.m5725c(objArr);
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean zM8616i = c3966o.m8616i(this) | ((i11 & 112) == 32);
            Object objM8596M = c3966o.m8596M();
            if (zM8616i || objM8596M == C3961j.f20408a) {
                objM8596M = new C8266p(this, interfaceC2139c, 1);
                c3966o.j0(objM8596M);
            }
            C3953b.m8502e(array, (InterfaceC2139c) objM8596M, c3966o);
        } else {
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0543a(this, objArr, interfaceC2139c, i10, 9);
        }
    }
}
