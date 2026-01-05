package androidx.compose.animation;

import ai.AbstractC0151h;
import androidx.compose.ui.graphics.AbstractC0260a;
import androidx.compose.ui.layout.AbstractC0264a;
import aq.C0406i;
import aq.C0408k;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import ex.InterfaceC2142f;
import g1.C2423c;
import g1.C2424d;
import g1.C2429i;
import g1.C2430j;
import g1.C2439s;
import g1.C2442v;
import g1.C2443w;
import g1.C2445y;
import g1.f0;
import g1.g0;
import g1.i1;
import g1.l0;
import g1.m0;
import g1.o0;
import g1.u0;
import g1.v0;
import h1.j0;
import h1.m1;
import h1.s1;
import h1.v1;
import h1.x1;
import h1.y1;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.e1;
import k2.f2;
import k2.n1;
import k2.s0;
import k2.w0;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import qw.a0;
import s2.C6734c;
import sq.g2;
import uw.InterfaceC7559c;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import w2.AbstractC7862a;
import w2.C7876o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.compose.animation.b */
/* loaded from: classes.dex */
public abstract class AbstractC0235b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13, types: [s2.c] */
    /* renamed from: a */
    public static final void m626a(s1 s1Var, InterfaceC2139c interfaceC2139c, InterfaceC7879r interfaceC7879r, u0 u0Var, v0 v0Var, InterfaceC2141e interfaceC2141e, C6734c c6734c, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        C6734c c6734c2;
        int i12;
        s1 s1Var2;
        s0 s0Var;
        boolean z6;
        m1 m1Var;
        m1 m1Var2;
        m1 m1Var3;
        boolean z10;
        boolean z11;
        m1 m1VarM6869b;
        u0 u0Var2;
        v0 v0Var2;
        boolean z12;
        boolean z13;
        C6734c c6734c3;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-891967166);
        if ((i10 & 6) == 0) {
            i11 = (c3966o.m8614g(s1Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c3966o.m8616i(interfaceC2139c) ? 32 : 16;
        }
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            i11 |= c3966o.m8614g(interfaceC7879r) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c3966o.m8614g(u0Var) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c3966o.m8614g(v0Var) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c3966o.m8616i(interfaceC2141e) ? 131072 : 65536;
        }
        int i13 = i11 | 1572864;
        if ((12582912 & i10) == 0) {
            i13 |= c3966o.m8616i(c6734c) ? 8388608 : 4194304;
        }
        if (c3966o.m8598P(i13 & 1, (4793491 & i13) != 4793490)) {
            e1 e1Var = s1Var.f15591d;
            AbstractC0151h abstractC0151h = s1Var.f15588a;
            if (((Boolean) interfaceC2139c.invoke(e1Var.getValue())).booleanValue() || ((Boolean) interfaceC2139c.invoke(abstractC0151h.mo345y())).booleanValue() || s1Var.m6858g() || s1Var.m6855d()) {
                c3966o.m8607Y(1788522886);
                int i14 = i13 & 14;
                int i15 = i14 | 48;
                int i16 = i15 & 14;
                boolean z14 = ((i16 ^ 6) > 4 && c3966o.m8614g(s1Var)) || (i15 & 6) == 4;
                Object objM8596M = c3966o.m8596M();
                boolean z15 = z14;
                s0 s0Var2 = C3961j.f20408a;
                if (z15 || objM8596M == s0Var2) {
                    objM8596M = abstractC0151h.mo345y();
                    c3966o.j0(objM8596M);
                }
                if (s1Var.m6858g()) {
                    objM8596M = abstractC0151h.mo345y();
                }
                c3966o.m8607Y(-466616829);
                f0 f0VarM631f = m631f(s1Var, interfaceC2139c, objM8596M, c3966o);
                c3966o.m8623p(false);
                Object value = s1Var.f15591d.getValue();
                c3966o.m8607Y(-466616829);
                f0 f0VarM631f2 = m631f(s1Var, interfaceC2139c, value, c3966o);
                c3966o.m8623p(false);
                int i17 = i16 | 3072;
                Object obj = v1.f15630a;
                int i18 = (i17 & 14) ^ 6;
                int i19 = i13;
                boolean z16 = (i18 > 4 && c3966o.m8614g(s1Var)) || (i17 & 6) == 4;
                Object objM8596M2 = c3966o.m8596M();
                if (z16 || objM8596M2 == s0Var2) {
                    i12 = i17;
                    objM8596M2 = new s1(new j0(f0VarM631f), s1Var, AbstractC1452a.m4564k(new StringBuilder(), s1Var.f15590c, " > EnterExitTransition"));
                    c3966o.j0(objM8596M2);
                } else {
                    i12 = i17;
                }
                s1 s1Var3 = (s1) objM8596M2;
                boolean zM8614g = ((i18 > 4 && c3966o.m8614g(s1Var)) || (i12 & 6) == 4) | c3966o.m8614g(s1Var3);
                Object objM8596M3 = c3966o.m8596M();
                if (zM8614g || objM8596M3 == s0Var2) {
                    objM8596M3 = new C0408k(21, s1Var, s1Var3);
                    c3966o.j0(objM8596M3);
                }
                C3953b.m8500c(s1Var3, (InterfaceC2139c) objM8596M3, c3966o);
                if (s1Var.m6858g()) {
                    s1Var3.m6862k(f0VarM631f, f0VarM631f2);
                } else {
                    s1Var3.m6867p(f0VarM631f2);
                    s1Var3.f15598k.setValue(Boolean.FALSE);
                }
                w0 w0VarM8520w = C3953b.m8520w(interfaceC2141e, c3966o);
                AbstractC0151h abstractC0151h2 = s1Var3.f15588a;
                AbstractC0151h abstractC0151h3 = s1Var3.f15588a;
                e1 e1Var2 = s1Var3.f15591d;
                Object objInvoke = interfaceC2141e.invoke(abstractC0151h2.mo345y(), e1Var2.getValue());
                boolean zM8614g2 = c3966o.m8614g(s1Var3) | c3966o.m8614g(w0VarM8520w);
                Object objM8596M4 = c3966o.m8596M();
                InterfaceC7559c interfaceC7559c = null;
                if (zM8614g2 || objM8596M4 == s0Var2) {
                    objM8596M4 = new C0406i(s1Var3, w0VarM8520w, interfaceC7559c, 17);
                    c3966o.j0(objM8596M4);
                }
                InterfaceC2141e interfaceC2141e2 = (InterfaceC2141e) objM8596M4;
                Object objM8596M5 = c3966o.m8596M();
                if (objM8596M5 == s0Var2) {
                    objM8596M5 = C3953b.m8517t(objInvoke);
                    c3966o.j0(objM8596M5);
                }
                w0 w0Var = (w0) objM8596M5;
                boolean zM8616i = c3966o.m8616i(interfaceC2141e2);
                Object objM8596M6 = c3966o.m8596M();
                if (zM8616i || objM8596M6 == s0Var2) {
                    objM8596M6 = new f2(interfaceC2141e2, w0Var, null, 0);
                    c3966o.j0(objM8596M6);
                }
                C3953b.m8503f((InterfaceC2141e) objM8596M6, a0.f30746a, c3966o);
                Object objMo345y = abstractC0151h3.mo345y();
                f0 f0Var = f0.PostExit;
                if (objMo345y == f0Var && e1Var2.getValue() == f0Var && ((Boolean) w0Var.getValue()).booleanValue()) {
                    c3966o.m8607Y(1790688794);
                    c3966o.m8623p(false);
                    c6734c3 = c6734c;
                    z13 = false;
                } else {
                    c3966o.m8607Y(1789551931);
                    boolean z17 = i14 == 4;
                    Object objM8596M7 = c3966o.m8596M();
                    if (z17 || objM8596M7 == s0Var2) {
                        objM8596M7 = new C2445y();
                        c3966o.j0(objM8596M7);
                    }
                    C2445y c2445y = (C2445y) objM8596M7;
                    x1 x1Var = o0.f11043a;
                    boolean zM8614g3 = c3966o.m8614g(s1Var3);
                    Object objM8596M8 = c3966o.m8596M();
                    if (zM8614g3 || objM8596M8 == s0Var2) {
                        objM8596M8 = C3953b.m8517t(u0Var);
                        c3966o.j0(objM8596M8);
                    }
                    w0 w0Var2 = (w0) objM8596M8;
                    if (abstractC0151h3.mo345y() == e1Var2.getValue() && abstractC0151h3.mo345y() == f0.Visible) {
                        if (s1Var3.m6858g()) {
                            w0Var2.setValue(u0Var);
                        } else {
                            w0Var2.setValue(u0.f11094b);
                        }
                    } else if (e1Var2.getValue() == f0.Visible) {
                        w0Var2.setValue(((u0) w0Var2.getValue()).m6101a(u0Var));
                    }
                    u0 u0Var3 = (u0) w0Var2.getValue();
                    boolean zM8614g4 = c3966o.m8614g(s1Var3);
                    Object objM8596M9 = c3966o.m8596M();
                    if (zM8614g4 || objM8596M9 == s0Var2) {
                        objM8596M9 = C3953b.m8517t(v0Var);
                        c3966o.j0(objM8596M9);
                    }
                    w0 w0Var3 = (w0) objM8596M9;
                    if (abstractC0151h3.mo345y() == e1Var2.getValue() && abstractC0151h3.mo345y() == f0.Visible) {
                        if (s1Var3.m6858g()) {
                            w0Var3.setValue(v0Var);
                        } else {
                            w0Var3.setValue(v0.f11102b);
                        }
                    } else if (e1Var2.getValue() != f0.Visible) {
                        w0Var3.setValue(((v0) w0Var3.getValue()).m6102a(v0Var));
                    }
                    v0 v0Var3 = (v0) w0Var3.getValue();
                    i1 i1Var = u0Var3.f11095a;
                    boolean z18 = (i1Var.f11018b == null && v0Var3.f11104a.f11018b == null) ? false : true;
                    boolean z19 = (i1Var.f11019c == null && v0Var3.f11104a.f11019c == null) ? false : true;
                    if (z18) {
                        c3966o.m8607Y(-821159459);
                        x1 x1Var2 = y1.f15670g;
                        Object objM8596M10 = c3966o.m8596M();
                        if (objM8596M10 == s0Var2) {
                            objM8596M10 = "Built-in slide";
                            c3966o.j0("Built-in slide");
                        }
                        String str = (String) objM8596M10;
                        s1Var2 = s1Var3;
                        s0Var = s0Var2;
                        z6 = true;
                        m1 m1VarM6869b2 = v1.m6869b(s1Var2, x1Var2, str, c3966o, KyberEngine.KyberPolyBytes, 0);
                        c3966o.m8623p(false);
                        m1Var = m1VarM6869b2;
                    } else {
                        s1Var2 = s1Var3;
                        s0Var = s0Var2;
                        z6 = true;
                        c3966o.m8607Y(-821053656);
                        c3966o.m8623p(false);
                        m1Var = null;
                    }
                    if (z19) {
                        c3966o.m8607Y(-820961865);
                        x1 x1Var3 = y1.f15671h;
                        Object objM8596M11 = c3966o.m8596M();
                        if (objM8596M11 == s0Var) {
                            objM8596M11 = "Built-in shrink/expand";
                            c3966o.j0("Built-in shrink/expand");
                        }
                        m1 m1VarM6869b3 = v1.m6869b(s1Var2, x1Var3, (String) objM8596M11, c3966o, KyberEngine.KyberPolyBytes, 0);
                        c3966o.m8623p(false);
                        m1Var2 = m1VarM6869b3;
                    } else {
                        c3966o.m8607Y(-820851041);
                        c3966o.m8623p(false);
                        m1Var2 = null;
                    }
                    if (z19) {
                        c3966o.m8607Y(-820777446);
                        x1 x1Var4 = y1.f15670g;
                        Object objM8596M12 = c3966o.m8596M();
                        if (objM8596M12 == s0Var) {
                            objM8596M12 = "Built-in InterruptionHandlingOffset";
                            c3966o.j0("Built-in InterruptionHandlingOffset");
                        }
                        m1 m1VarM6869b4 = v1.m6869b(s1Var2, x1Var4, (String) objM8596M12, c3966o, KyberEngine.KyberPolyBytes, 0);
                        c3966o.m8623p(false);
                        m1Var3 = m1VarM6869b4;
                    } else {
                        c3966o.m8607Y(-820608001);
                        c3966o.m8623p(false);
                        m1Var3 = null;
                    }
                    boolean z20 = !z19;
                    if ((u0Var3.f11095a.f11017a == null && v0Var3.f11104a.f11017a == null) ? false : z6) {
                        c3966o.m8607Y(-675026101);
                        x1 x1Var5 = y1.f15664a;
                        Object objM8596M13 = c3966o.m8596M();
                        if (objM8596M13 == s0Var) {
                            objM8596M13 = "Built-in alpha";
                            c3966o.j0("Built-in alpha");
                        }
                        z10 = z20;
                        m1VarM6869b = v1.m6869b(s1Var2, x1Var5, (String) objM8596M13, c3966o, KyberEngine.KyberPolyBytes, 0);
                        z11 = false;
                        c3966o.m8623p(false);
                    } else {
                        z10 = z20;
                        z11 = false;
                        c3966o.m8607Y(-674857617);
                        c3966o.m8623p(false);
                        m1VarM6869b = null;
                    }
                    c3966o.m8607Y(-674621521);
                    c3966o.m8623p(z11);
                    c3966o.m8607Y(-674372529);
                    c3966o.m8623p(z11);
                    boolean zM8616i2 = c3966o.m8616i(m1VarM6869b) | c3966o.m8614g(u0Var3) | c3966o.m8614g(v0Var3) | c3966o.m8616i(null) | c3966o.m8614g(s1Var2) | c3966o.m8616i(null);
                    Object objM8596M14 = c3966o.m8596M();
                    if (zM8616i2 || objM8596M14 == s0Var) {
                        u0Var2 = u0Var3;
                        v0Var2 = v0Var3;
                        objM8596M14 = new g0(m1VarM6869b, null, s1Var2, u0Var2, v0Var2, null);
                        c3966o.j0(objM8596M14);
                    } else {
                        u0Var2 = u0Var3;
                        v0Var2 = v0Var3;
                    }
                    g0 g0Var = (g0) objM8596M14;
                    boolean z21 = z10;
                    boolean zM8615h = c3966o.m8615h(z21);
                    l0 l0Var = l0.f11033a;
                    boolean zM8614g5 = zM8615h | c3966o.m8614g(l0Var);
                    Object objM8596M15 = c3966o.m8596M();
                    if (zM8614g5 || objM8596M15 == s0Var) {
                        z12 = false;
                        objM8596M15 = new m0(0, l0Var, z21);
                        c3966o.j0(objM8596M15);
                    } else {
                        z12 = false;
                    }
                    C7876o c7876o = C7876o.f37669a;
                    InterfaceC7879r interfaceC7879rMo14852e = AbstractC0260a.m714a(c7876o, (InterfaceC2139c) objM8596M15).mo14852e(new EnterExitTransitionElement(s1Var2, m1Var2, m1Var3, m1Var, u0Var2, v0Var2, l0Var, g0Var));
                    c3966o.m8607Y(1581779440);
                    c3966o.m8623p(z12);
                    InterfaceC7879r interfaceC7879rMo14852e2 = interfaceC7879r.mo14852e(interfaceC7879rMo14852e.mo14852e(c7876o));
                    Object objM8596M16 = c3966o.m8596M();
                    if (objM8596M16 == s0Var) {
                        objM8596M16 = new C2439s(c2445y);
                        c3966o.j0(objM8596M16);
                    }
                    C2439s c2439s = (C2439s) objM8596M16;
                    int i20 = c3966o.f20462P;
                    k2.i1 i1VarM8620m = c3966o.m8620m();
                    InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879rMo14852e2);
                    InterfaceC7639k.V0.getClass();
                    C7637i c7637i = C7638j.f36921b;
                    c3966o.c0();
                    if (c3966o.f20461O) {
                        c3966o.m8619l(c7637i);
                    } else {
                        c3966o.m0();
                    }
                    C3953b.m8521x(C7638j.f36925f, c2439s, c3966o);
                    C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o);
                    C7636h c7636h = C7638j.f36926g;
                    if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i20))) {
                        AbstractC1452a.m4577x(i20, c3966o, i20, c7636h);
                    }
                    C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
                    ?? r22 = c6734c;
                    r22.invoke(c2445y, c3966o, Integer.valueOf((i19 >> 18) & 112));
                    c3966o.m8623p(z6);
                    z13 = false;
                    c3966o.m8623p(false);
                    c6734c3 = r22;
                }
                c3966o.m8623p(z13);
                c6734c2 = c6734c3;
            } else {
                c3966o.m8607Y(1790694746);
                c3966o.m8623p(false);
                c6734c2 = c6734c;
            }
        } else {
            c6734c2 = c6734c;
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C2424d(s1Var, interfaceC2139c, interfaceC7879r, u0Var, v0Var, interfaceC2141e, c6734c2, i10);
        }
    }

    /* renamed from: b */
    public static final void m627b(boolean z6, InterfaceC7879r interfaceC7879r, u0 u0Var, v0 v0Var, String str, InterfaceC3962k interfaceC3962k, int i10) {
        InterfaceC7879r interfaceC7879r2;
        u0 u0Var2;
        v0 v0Var2;
        String str2;
        C6734c c6734c = g2.f32918x;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-1741346906);
        int i11 = i10 | (c3966o.m8615h(z6) ? 32 : 16) | 224640;
        if (c3966o.m8598P(i11 & 1, (599185 & i11) != 599184)) {
            u0 u0VarM6101a = o0.m6091d(null, DefinitionKt.NO_Float_VALUE, 3).m6101a(o0.m6088a(null, 15));
            v0 v0VarM6102a = o0.m6092e(null, 3).m6102a(o0.m6093f(null, 15));
            s1 s1VarM6872e = v1.m6872e(Boolean.valueOf(z6), "AnimatedVisibility", c3966o, ((i11 >> 3) & 14) | 48, 0);
            C2423c c2423c = C2423c.f10932d;
            C7876o c7876o = C7876o.f37669a;
            m630e(s1VarM6872e, c2423c, c7876o, u0VarM6101a, v0VarM6102a, c6734c, c3966o, 224688);
            u0Var2 = u0VarM6101a;
            v0Var2 = v0VarM6102a;
            str2 = "AnimatedVisibility";
            interfaceC7879r2 = c7876o;
        } else {
            c3966o.m8601S();
            interfaceC7879r2 = interfaceC7879r;
            u0Var2 = u0Var;
            v0Var2 = v0Var;
            str2 = str;
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C2442v(z6, interfaceC7879r2, u0Var2, v0Var2, str2, i10);
        }
    }

    /* renamed from: c */
    public static final void m628c(boolean z6, InterfaceC7879r interfaceC7879r, u0 u0Var, v0 v0Var, String str, C6734c c6734c, InterfaceC3962k interfaceC3962k, int i10) {
        InterfaceC7879r interfaceC7879r2;
        u0 u0Var2;
        v0 v0Var2;
        String str2;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(1766503102);
        int i11 = i10 | (c3966o.m8615h(z6) ? 32 : 16) | 224640;
        if (c3966o.m8598P(i11 & 1, (599185 & i11) != 599184)) {
            u0 u0VarM6101a = o0.m6091d(null, DefinitionKt.NO_Float_VALUE, 3).m6101a(o0.m6090c(15));
            v0 v0VarM6102a = o0.m6092e(null, 3).m6102a(o0.m6095h());
            s1 s1VarM6872e = v1.m6872e(Boolean.valueOf(z6), "AnimatedVisibility", c3966o, ((i11 >> 3) & 14) | 48, 0);
            C2423c c2423c = C2423c.f10933e;
            C7876o c7876o = C7876o.f37669a;
            m630e(s1VarM6872e, c2423c, c7876o, u0VarM6101a, v0VarM6102a, c6734c, c3966o, 224688);
            u0Var2 = u0VarM6101a;
            v0Var2 = v0VarM6102a;
            str2 = "AnimatedVisibility";
            interfaceC7879r2 = c7876o;
        } else {
            c3966o.m8601S();
            interfaceC7879r2 = interfaceC7879r;
            u0Var2 = u0Var;
            v0Var2 = v0Var;
            str2 = str;
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C2443w(z6, interfaceC7879r2, u0Var2, v0Var2, str2, c6734c, i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m629d(boolean r20, w2.InterfaceC7879r r21, g1.u0 r22, g1.v0 r23, java.lang.String r24, s2.C6734c r25, k2.InterfaceC3962k r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AbstractC0235b.m629d(boolean, w2.r, g1.u0, g1.v0, java.lang.String, s2.c, k2.k, int, int):void");
    }

    /* renamed from: e */
    public static final void m630e(s1 s1Var, InterfaceC2139c interfaceC2139c, InterfaceC7879r interfaceC7879r, u0 u0Var, v0 v0Var, C6734c c6734c, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        u0 u0Var2;
        v0 v0Var2;
        C6734c c6734c2;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(429978603);
        if ((i10 & 6) == 0) {
            i11 = (c3966o.m8614g(s1Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c3966o.m8616i(interfaceC2139c) ? 32 : 16;
        }
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            i11 |= c3966o.m8614g(interfaceC7879r) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            u0Var2 = u0Var;
            i11 |= c3966o.m8614g(u0Var2) ? NewHope.SENDB_BYTES : 1024;
        } else {
            u0Var2 = u0Var;
        }
        if ((i10 & 24576) == 0) {
            v0Var2 = v0Var;
            i11 |= c3966o.m8614g(v0Var2) ? 16384 : 8192;
        } else {
            v0Var2 = v0Var;
        }
        if ((i10 & 196608) == 0) {
            c6734c2 = c6734c;
            i11 |= c3966o.m8616i(c6734c2) ? 131072 : 65536;
        } else {
            c6734c2 = c6734c;
        }
        if (c3966o.m8598P(i11 & 1, (74899 & i11) != 74898)) {
            int i12 = i11 & 112;
            int i13 = i11 & 14;
            boolean z6 = (i12 == 32) | (i13 == 4);
            Object objM8596M = c3966o.m8596M();
            if (z6 || objM8596M == C3961j.f20408a) {
                objM8596M = new b2.j0(interfaceC2139c, s1Var);
                c3966o.j0(objM8596M);
            }
            m626a(s1Var, interfaceC2139c, AbstractC0264a.m721b(interfaceC7879r, (InterfaceC2142f) objM8596M), u0Var2, v0Var2, C2430j.f11023c, c6734c2, c3966o, 196608 | i13 | i12 | (i11 & 7168) | (57344 & i11) | ((i11 << 6) & 29360128));
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C2429i(s1Var, interfaceC2139c, interfaceC7879r, u0Var, v0Var, c6734c, i10);
        }
    }

    /* renamed from: f */
    public static final f0 m631f(s1 s1Var, InterfaceC2139c interfaceC2139c, Object obj, InterfaceC3962k interfaceC3962k) {
        f0 f0Var;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.m8605W(-902032957, s1Var);
        boolean zM6858g = s1Var.m6858g();
        AbstractC0151h abstractC0151h = s1Var.f15588a;
        if (zM6858g) {
            c3966o.m8607Y(2101770115);
            c3966o.m8623p(false);
            f0Var = ((Boolean) interfaceC2139c.invoke(obj)).booleanValue() ? f0.Visible : ((Boolean) interfaceC2139c.invoke(abstractC0151h.mo345y())).booleanValue() ? f0.PostExit : f0.PreEnter;
        } else {
            c3966o.m8607Y(2102044248);
            Object objM8596M = c3966o.m8596M();
            if (objM8596M == C3961j.f20408a) {
                objM8596M = C3953b.m8517t(Boolean.FALSE);
                c3966o.j0(objM8596M);
            }
            w0 w0Var = (w0) objM8596M;
            if (((Boolean) interfaceC2139c.invoke(abstractC0151h.mo345y())).booleanValue()) {
                w0Var.setValue(Boolean.TRUE);
            }
            f0Var = ((Boolean) interfaceC2139c.invoke(obj)).booleanValue() ? f0.Visible : ((Boolean) w0Var.getValue()).booleanValue() ? f0.PostExit : f0.PreEnter;
            c3966o.m8623p(false);
        }
        c3966o.m8623p(false);
        return f0Var;
    }
}
