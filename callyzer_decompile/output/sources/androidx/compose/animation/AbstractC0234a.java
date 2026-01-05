package androidx.compose.animation;

import ai.AbstractC0151h;
import c9.AbstractC0911f;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import e1.j0;
import e1.r0;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import g1.C2423c;
import g1.C2424d;
import g1.C2428h;
import g1.C2429i;
import g1.C2430j;
import g1.C2432l;
import g1.C2437q;
import g1.C2438r;
import g1.a0;
import g1.f1;
import g1.u0;
import g1.v0;
import g2.a5;
import h1.m1;
import h1.s1;
import h1.v1;
import h1.y1;
import java.util.ListIterator;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.e1;
import k2.i1;
import k2.n1;
import k2.w0;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import rw.AbstractC6662l;
import s2.AbstractC6740i;
import s2.C6734c;
import sw.C6957a;
import u2.C7320q;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import v3.a1;
import w2.AbstractC7862a;
import w2.AbstractC7878q;
import w2.C7864c;
import w2.C7871j;
import w2.C7876o;
import w2.InterfaceC7866e;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.compose.animation.a */
/* loaded from: classes.dex */
public abstract class AbstractC0234a {

    /* renamed from: a */
    public static final long f1882a;

    static {
        long j6 = Integer.MIN_VALUE;
        f1882a = (j6 & 4294967295L) | (j6 << 32);
    }

    /* renamed from: a */
    public static final void m623a(a5 a5Var, InterfaceC7879r interfaceC7879r, InterfaceC2139c interfaceC2139c, InterfaceC7866e interfaceC7866e, String str, InterfaceC2139c interfaceC2139c2, C6734c c6734c, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        InterfaceC7866e interfaceC7866e2;
        InterfaceC2139c interfaceC2139c3;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(2132720749);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c3966o.m8614g(a5Var) : c3966o.m8616i(a5Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c3966o.m8614g(interfaceC7879r) ? 32 : 16;
        }
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            i11 |= c3966o.m8616i(interfaceC2139c) ? 256 : 128;
        }
        int i12 = i11 | 3072;
        if ((i10 & 24576) == 0) {
            i12 |= c3966o.m8614g(str) ? 16384 : 8192;
        }
        int i13 = i12 | 196608;
        if ((1572864 & i10) == 0) {
            i13 |= c3966o.m8616i(c6734c) ? 1048576 : 524288;
        }
        if (c3966o.m8598P(i13 & 1, (599187 & i13) != 599186)) {
            C7871j c7871j = C7864c.f37642a;
            C2423c c2423c = C2423c.f10930b;
            s1 s1VarM6872e = v1.m6872e(a5Var, str, c3966o, (i13 & 14) | ((i13 >> 9) & 112), 0);
            int i14 = i13 & 8176;
            int i15 = i13 >> 3;
            m624b(s1VarM6872e, interfaceC7879r, interfaceC2139c, c7871j, c2423c, c6734c, c3966o, i14 | (57344 & i15) | (i15 & 458752));
            interfaceC7866e2 = c7871j;
            interfaceC2139c3 = c2423c;
        } else {
            c3966o.m8601S();
            interfaceC7866e2 = interfaceC7866e;
            interfaceC2139c3 = interfaceC2139c2;
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C2424d(a5Var, interfaceC7879r, interfaceC2139c, interfaceC7866e2, str, interfaceC2139c3, c6734c, i10);
        }
    }

    /* renamed from: b */
    public static final void m624b(s1 s1Var, InterfaceC7879r interfaceC7879r, InterfaceC2139c interfaceC2139c, InterfaceC7866e interfaceC7866e, InterfaceC2139c interfaceC2139c2, C6734c c6734c, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        InterfaceC2139c interfaceC2139c3;
        C3966o c3966o;
        AbstractC0151h abstractC0151h;
        C2438r c2438r;
        C7320q c7320q;
        final C2438r c2438r2;
        final m1 m1VarM6869b;
        boolean z6;
        InterfaceC2139c interfaceC2139c4 = interfaceC2139c;
        C3966o c3966o2 = (C3966o) interfaceC3962k;
        c3966o2.a0(-114689412);
        if ((i10 & 6) == 0) {
            i11 = (c3966o2.m8614g(s1Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c3966o2.m8614g(interfaceC7879r) ? 32 : 16;
        }
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            i11 |= c3966o2.m8616i(interfaceC2139c4) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c3966o2.m8614g(interfaceC7866e) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c3966o2.m8616i(interfaceC2139c2) ? 16384 : 8192;
        }
        C6734c c6734c2 = c6734c;
        if ((196608 & i10) == 0) {
            i11 |= c3966o2.m8616i(c6734c2) ? 131072 : 65536;
        }
        if (c3966o2.m8598P(i11 & 1, (74899 & i11) != 74898)) {
            int i12 = i11 & 14;
            boolean z10 = i12 == 4;
            Object objM8596M = c3966o2.m8596M();
            Object obj = C3961j.f20408a;
            if (z10 || objM8596M == obj) {
                objM8596M = new C2438r(s1Var, interfaceC7866e);
                c3966o2.j0(objM8596M);
            }
            C2438r c2438r3 = (C2438r) objM8596M;
            boolean z11 = i12 == 4;
            Object objM8596M2 = c3966o2.m8596M();
            Object obj2 = objM8596M2;
            if (z11 || objM8596M2 == obj) {
                Object[] objArr = {s1Var.f15588a.mo345y()};
                C7320q c7320q2 = new C7320q();
                c7320q2.addAll(AbstractC6662l.m12708K(objArr));
                c3966o2.j0(c7320q2);
                obj2 = c7320q2;
            }
            C7320q c7320q3 = (C7320q) obj2;
            boolean z12 = i12 == 4;
            Object objM8596M3 = c3966o2.m8596M();
            if (z12 || objM8596M3 == obj) {
                long[] jArr = r0.f9045a;
                objM8596M3 = new j0();
                c3966o2.j0(objM8596M3);
            }
            j0 j0Var = (j0) objM8596M3;
            AbstractC0151h abstractC0151h2 = s1Var.f15588a;
            e1 e1Var = s1Var.f15591d;
            if (!c7320q3.contains(abstractC0151h2.mo345y())) {
                c7320q3.clear();
                c7320q3.add(abstractC0151h2.mo345y());
            }
            if (AbstractC4154l.m8918a(abstractC0151h2.mo345y(), e1Var.getValue())) {
                if (c7320q3.size() != 1 || !AbstractC4154l.m8918a(c7320q3.get(0), abstractC0151h2.mo345y())) {
                    c7320q3.clear();
                    c7320q3.add(abstractC0151h2.mo345y());
                }
                if (j0Var.f9002e != 1 || j0Var.m5570c(abstractC0151h2.mo345y())) {
                    j0Var.m5568a();
                }
                c2438r3.f11061b = interfaceC7866e;
            }
            if (AbstractC4154l.m8918a(abstractC0151h2.mo345y(), e1Var.getValue()) || c7320q3.contains(e1Var.getValue())) {
                abstractC0151h = abstractC0151h2;
            } else {
                ListIterator listIterator = c7320q3.listIterator();
                int i13 = 0;
                while (true) {
                    C6957a c6957a = (C6957a) listIterator;
                    abstractC0151h = abstractC0151h2;
                    if (!c6957a.hasNext()) {
                        i13 = -1;
                        break;
                    } else {
                        if (AbstractC4154l.m8918a(interfaceC2139c2.invoke(c6957a.next()), interfaceC2139c2.invoke(e1Var.getValue()))) {
                            break;
                        }
                        i13++;
                        abstractC0151h2 = abstractC0151h;
                    }
                }
                if (i13 == -1) {
                    c7320q3.add(e1Var.getValue());
                } else {
                    c7320q3.set(i13, e1Var.getValue());
                }
            }
            if (j0Var.m5570c(e1Var.getValue()) && j0Var.m5570c(abstractC0151h.mo345y())) {
                c3966o2.m8607Y(919489879);
                c3966o2.m8623p(false);
                interfaceC2139c3 = interfaceC2139c4;
                c2438r = c2438r3;
            } else {
                c3966o2.m8607Y(916905750);
                j0Var.m5568a();
                int size = c7320q3.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj3 = c7320q3.get(i14);
                    j0Var.m5579l(obj3, AbstractC6740i.m12902d(885640742, new C2428h(s1Var, obj3, interfaceC2139c4, c2438r3, c7320q3, c6734c2), c3966o2));
                    i14++;
                    interfaceC2139c4 = interfaceC2139c4;
                    c6734c2 = c6734c;
                }
                interfaceC2139c3 = interfaceC2139c4;
                c2438r = c2438r3;
                c3966o2.m8623p(false);
            }
            boolean zM8614g = c3966o2.m8614g(s1Var.m6857f()) | c3966o2.m8614g(c2438r);
            Object objM8596M4 = c3966o2.m8596M();
            if (zM8614g || objM8596M4 == obj) {
                objM8596M4 = (a0) interfaceC2139c3.invoke(c2438r);
                c3966o2.j0(objM8596M4);
            }
            a0 a0Var = (a0) objM8596M4;
            s1 s1Var2 = c2438r.f11060a;
            boolean zM8614g2 = c3966o2.m8614g(c2438r);
            Object objM8596M5 = c3966o2.m8596M();
            if (zM8614g2 || objM8596M5 == obj) {
                objM8596M5 = C3953b.m8517t(Boolean.FALSE);
                c3966o2.j0(objM8596M5);
            }
            w0 w0Var = (w0) objM8596M5;
            final w0 w0VarM8520w = C3953b.m8520w(a0Var.f10920d, c3966o2);
            if (AbstractC4154l.m8918a(s1Var2.f15588a.mo345y(), s1Var2.f15591d.getValue())) {
                w0Var.setValue(Boolean.FALSE);
            } else if (w0VarM8520w.getValue() != null) {
                w0Var.setValue(Boolean.TRUE);
            }
            boolean zBooleanValue = ((Boolean) w0Var.getValue()).booleanValue();
            InterfaceC7879r interfaceC7879r2 = C7876o.f37669a;
            if (zBooleanValue) {
                c3966o2.m8607Y(249676467);
                C2438r c2438r4 = c2438r;
                c7320q = c7320q3;
                c3966o = c3966o2;
                c2438r2 = c2438r4;
                m1VarM6869b = v1.m6869b(c2438r4.f11060a, y1.f15671h, null, c3966o, 0, 2);
                boolean zM8614g3 = c3966o.m8614g(m1VarM6869b);
                Object objM8596M6 = c3966o.m8596M();
                if (zM8614g3 || objM8596M6 == obj) {
                    objM8596M6 = AbstractC0911f.m2618b(interfaceC7879r2);
                    c3966o.j0(objM8596M6);
                }
                interfaceC7879r2 = (InterfaceC7879r) objM8596M6;
                c3966o.m8623p(false);
            } else {
                c7320q = c7320q3;
                c3966o = c3966o2;
                c2438r2 = c2438r;
                c3966o.m8607Y(249942509);
                c3966o.m8623p(false);
                m1VarM6869b = null;
            }
            InterfaceC7879r interfaceC7879rMo14852e = interfaceC7879r.mo14852e(interfaceC7879r2.mo14852e(new a1(m1VarM6869b, w0VarM8520w, c2438r2) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierElement

                /* renamed from: a */
                public final m1 f1870a;

                /* renamed from: b */
                public final w0 f1871b;

                /* renamed from: c */
                public final C2438r f1872c;

                {
                    this.f1870a = m1VarM6869b;
                    this.f1871b = w0VarM8520w;
                    this.f1872c = c2438r2;
                }

                public final boolean equals(Object obj4) {
                    if (!(obj4 instanceof AnimatedContentTransitionScopeImpl$SizeModifierElement)) {
                        return false;
                    }
                    AnimatedContentTransitionScopeImpl$SizeModifierElement animatedContentTransitionScopeImpl$SizeModifierElement = (AnimatedContentTransitionScopeImpl$SizeModifierElement) obj4;
                    return AbstractC4154l.m8918a(animatedContentTransitionScopeImpl$SizeModifierElement.f1870a, this.f1870a) && animatedContentTransitionScopeImpl$SizeModifierElement.f1871b.equals(this.f1871b);
                }

                @Override // v3.a1
                /* renamed from: h */
                public final AbstractC7878q mo621h() {
                    C2437q c2437q = new C2437q();
                    c2437q.f11051q = this.f1870a;
                    c2437q.f11052r = this.f1871b;
                    c2437q.f11053s = this.f1872c;
                    c2437q.f11054t = AbstractC0234a.f1882a;
                    return c2437q;
                }

                public final int hashCode() {
                    int iHashCode = this.f1872c.hashCode() * 31;
                    m1 m1Var = this.f1870a;
                    return this.f1871b.hashCode() + ((iHashCode + (m1Var != null ? m1Var.hashCode() : 0)) * 31);
                }

                @Override // v3.a1
                /* renamed from: i */
                public final void mo622i(AbstractC7878q abstractC7878q) {
                    C2437q c2437q = (C2437q) abstractC7878q;
                    c2437q.f11051q = this.f1870a;
                    c2437q.f11052r = this.f1871b;
                    c2437q.f11053s = this.f1872c;
                }
            }));
            Object objM8596M7 = c3966o.m8596M();
            if (objM8596M7 == obj) {
                objM8596M7 = new C2432l(c2438r2);
                c3966o.j0(objM8596M7);
            }
            C2432l c2432l = (C2432l) objM8596M7;
            int i15 = c3966o.f20462P;
            i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879rMo14852e);
            InterfaceC7639k.V0.getClass();
            C7637i c7637i = C7638j.f36921b;
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C3953b.m8521x(C7638j.f36925f, c2432l, c3966o);
            C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o);
            C7636h c7636h = C7638j.f36926g;
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i15))) {
                AbstractC1452a.m4577x(i15, c3966o, i15, c7636h);
            }
            C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
            c3966o.m8607Y(-1490874326);
            int size2 = c7320q.size();
            int i16 = 0;
            while (i16 < size2) {
                C7320q c7320q4 = c7320q;
                Object obj4 = c7320q4.get(i16);
                c3966o.m8605W(1908442329, interfaceC2139c2.invoke(obj4));
                InterfaceC2141e interfaceC2141e = (InterfaceC2141e) j0Var.m5574g(obj4);
                if (interfaceC2141e == null) {
                    c3966o.m8607Y(-967793488);
                    z6 = false;
                } else {
                    z6 = false;
                    c3966o.m8607Y(1908443505);
                    interfaceC2141e.invoke(c3966o, 0);
                }
                c3966o.m8623p(z6);
                c3966o.m8623p(z6);
                i16++;
                c7320q = c7320q4;
            }
            c3966o.m8623p(false);
            c3966o.m8623p(true);
        } else {
            interfaceC2139c3 = interfaceC2139c4;
            c3966o = c3966o2;
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C2429i(s1Var, interfaceC7879r, interfaceC2139c3, interfaceC7866e, interfaceC2139c2, c6734c, i10);
        }
    }

    /* renamed from: c */
    public static final a0 m625c(u0 u0Var, v0 v0Var) {
        return new a0(u0Var, v0Var, DefinitionKt.NO_Float_VALUE, new f1(C2430j.f11022b));
    }
}
