package t3;

import au.C0446j;
import b2.C0543a;
import c3.C0848c;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import cp.C1475f;
import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import java.util.List;
import k2.C3953b;
import k2.C3958g;
import k2.C3961j;
import k2.C3964m;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.i1;
import k2.n1;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import s2.C6734c;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import w2.AbstractC7862a;
import w2.C7876o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class c1 {

    /* renamed from: a */
    public static final q0 f33970a = new q0(4);

    /* renamed from: a */
    public static final void m13272a(InterfaceC7879r interfaceC7879r, C6734c c6734c, j0 j0Var, InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(1949933075);
        int i11 = (c3966o.m8614g(interfaceC7879r) ? 4 : 2) | i10 | (c3966o.m8614g(j0Var) ? 256 : 128);
        if (c3966o.m8598P(i11 & 1, (i11 & 147) != 146)) {
            int i12 = c3966o.f20462P;
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879r);
            i1 i1VarM8620m = c3966o.m8620m();
            C7637i c7637i = C7637i.f36915c;
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            InterfaceC7639k.V0.getClass();
            C3953b.m8521x(C7638j.f36925f, j0Var, c3966o);
            C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o);
            if (c3966o.f20461O) {
                c3966o.m8610c(qw.a0.f30746a, new C3958g(2, 2));
            }
            C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
            C7636h c7636h = C7638j.f36926g;
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i12))) {
                AbstractC1452a.m4577x(i12, c3966o, i12, c7636h);
            }
            c6734c.invoke(c3966o, 6);
            c3966o.m8623p(true);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0446j(interfaceC7879r, c6734c, j0Var, i10, 12);
        }
    }

    /* renamed from: b */
    public static final void m13273b(f1 f1Var, InterfaceC7879r interfaceC7879r, InterfaceC2141e interfaceC2141e, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-511989831);
        if ((i10 & 6) == 0) {
            i11 = (c3966o.m8616i(f1Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c3966o.m8614g(interfaceC7879r) ? 32 : 16;
        }
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            i11 |= c3966o.m8616i(interfaceC2141e) ? 256 : 128;
        }
        if (c3966o.m8598P(i11 & 1, (i11 & 147) != 146)) {
            int i12 = c3966o.f20462P;
            C3964m c3964mM8519v = C3953b.m8519v(c3966o);
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879r);
            i1 i1VarM8620m = c3966o.m8620m();
            C7637i c7637i = C7637i.f36915c;
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C3953b.m8521x(f1Var.f33997c, f1Var, c3966o);
            C3953b.m8521x(f1Var.f33998d, c3964mM8519v, c3966o);
            C3953b.m8521x(f1Var.f33999e, interfaceC2141e, c3966o);
            InterfaceC7639k.V0.getClass();
            C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o);
            C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
            C7636h c7636h = C7638j.f36926g;
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i12))) {
                AbstractC1452a.m4577x(i12, c3966o, i12, c7636h);
            }
            c3966o.m8623p(true);
            if (c3966o.m8586C()) {
                c3966o.m8607Y(-26267397);
                c3966o.m8623p(false);
            } else {
                c3966o.m8607Y(-26326018);
                boolean zM8616i = c3966o.m8616i(f1Var);
                Object objM8596M = c3966o.m8596M();
                if (zM8616i || objM8596M == C3961j.f20408a) {
                    objM8596M = new o6.b0(6, f1Var);
                    c3966o.j0(objM8596M);
                }
                C3953b.m8505h((InterfaceC2137a) objM8596M, c3966o);
                c3966o.m8623p(false);
            }
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0543a(f1Var, interfaceC7879r, interfaceC2141e, i10, 7);
        }
    }

    /* renamed from: c */
    public static final void m13274c(InterfaceC7879r interfaceC7879r, InterfaceC2141e interfaceC2141e, InterfaceC3962k interfaceC3962k, int i10, int i11) {
        int i12;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-1298353104);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c3966o.m8614g(interfaceC7879r) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c3966o.m8616i(interfaceC2141e) ? 32 : 16;
        }
        if (c3966o.m8598P(i12 & 1, (i12 & 19) != 18)) {
            if (i13 != 0) {
                interfaceC7879r = C7876o.f37669a;
            }
            Object objM8596M = c3966o.m8596M();
            if (objM8596M == C3961j.f20408a) {
                objM8596M = new f1(q0.f34016b);
                c3966o.j0(objM8596M);
            }
            m13273b((f1) objM8596M, interfaceC7879r, interfaceC2141e, c3966o, (i12 << 3) & 1008);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new b1(interfaceC7879r, interfaceC2141e, i10, i11);
        }
    }

    /* renamed from: d */
    public static final float m13275d(long j6, long j10) {
        return Math.min(Float.intBitsToFloat((int) (j10 >> 32)) / Float.intBitsToFloat((int) (j6 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)) / Float.intBitsToFloat((int) (j6 & 4294967295L)));
    }

    /* renamed from: e */
    public static final C0848c m13276e(InterfaceC7033t interfaceC7033t) {
        InterfaceC7033t interfaceC7033tMo13296D = interfaceC7033t.mo13296D();
        return interfaceC7033tMo13296D != null ? interfaceC7033tMo13296D.mo13298S(interfaceC7033t, true) : new C0848c(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, (int) (interfaceC7033t.mo13307v() >> 32), (int) (interfaceC7033t.mo13307v() & 4294967295L));
    }

    /* renamed from: f */
    public static final C0848c m13277f(InterfaceC7033t interfaceC7033t) {
        InterfaceC7033t interfaceC7033tM13279h = m13279h(interfaceC7033t);
        float fMo13307v = (int) (interfaceC7033tM13279h.mo13307v() >> 32);
        float fMo13307v2 = (int) (interfaceC7033tM13279h.mo13307v() & 4294967295L);
        C0848c c0848cMo13298S = interfaceC7033tM13279h.mo13298S(interfaceC7033t, true);
        float f6 = c0848cMo13298S.f5354a;
        float f10 = DefinitionKt.NO_Float_VALUE;
        if (f6 < DefinitionKt.NO_Float_VALUE) {
            f6 = 0.0f;
        }
        if (f6 > fMo13307v) {
            f6 = fMo13307v;
        }
        float f11 = c0848cMo13298S.f5355b;
        if (f11 < DefinitionKt.NO_Float_VALUE) {
            f11 = 0.0f;
        }
        if (f11 > fMo13307v2) {
            f11 = fMo13307v2;
        }
        float f12 = c0848cMo13298S.f5356c;
        if (f12 < DefinitionKt.NO_Float_VALUE) {
            f12 = 0.0f;
        }
        if (f12 <= fMo13307v) {
            fMo13307v = f12;
        }
        float f13 = c0848cMo13298S.f5357d;
        if (f13 >= DefinitionKt.NO_Float_VALUE) {
            f10 = f13;
        }
        if (f10 <= fMo13307v2) {
            fMo13307v2 = f10;
        }
        if (f6 == fMo13307v || f11 == fMo13307v2) {
            return C0848c.f5353e;
        }
        long jMo13303f = interfaceC7033tM13279h.mo13303f((Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L));
        long jMo13303f2 = interfaceC7033tM13279h.mo13303f((Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(fMo13307v) << 32));
        long jMo13303f3 = interfaceC7033tM13279h.mo13303f((Float.floatToRawIntBits(fMo13307v) << 32) | (Float.floatToRawIntBits(fMo13307v2) & 4294967295L));
        long jMo13303f4 = interfaceC7033tM13279h.mo13303f((Float.floatToRawIntBits(fMo13307v2) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo13303f >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo13303f2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jMo13303f4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jMo13303f3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jMo13303f & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jMo13303f2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jMo13303f4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jMo13303f3 & 4294967295L));
        return new C0848c(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    /* renamed from: g */
    public static final C6734c m13278g(List list) {
        return new C6734c(new C1475f(20, list), true, -1953651383);
    }

    /* renamed from: h */
    public static final InterfaceC7033t m13279h(InterfaceC7033t interfaceC7033t) {
        InterfaceC7033t interfaceC7033t2;
        InterfaceC7033t interfaceC7033tMo13296D = interfaceC7033t.mo13296D();
        while (true) {
            InterfaceC7033t interfaceC7033t3 = interfaceC7033tMo13296D;
            interfaceC7033t2 = interfaceC7033t;
            interfaceC7033t = interfaceC7033t3;
            if (interfaceC7033t == null) {
                break;
            }
            interfaceC7033tMo13296D = interfaceC7033t.mo13296D();
        }
        v3.h1 h1Var = interfaceC7033t2 instanceof v3.h1 ? (v3.h1) interfaceC7033t2 : null;
        if (h1Var == null) {
            return interfaceC7033t2;
        }
        v3.h1 h1Var2 = h1Var.f36904p;
        while (true) {
            v3.h1 h1Var3 = h1Var2;
            v3.h1 h1Var4 = h1Var;
            h1Var = h1Var3;
            if (h1Var == null) {
                return h1Var4;
            }
            h1Var2 = h1Var.f36904p;
        }
    }

    /* renamed from: i */
    public static final v3.o0 m13280i(v3.o0 o0Var) {
        v3.g0 g0Var = o0Var.f36966m.f36902m;
        while (true) {
            v3.g0 g0VarM14609v = g0Var.m14609v();
            v3.g0 g0Var2 = null;
            if ((g0VarM14609v != null ? g0VarM14609v.f36849h : null) == null) {
                v3.o0 o0VarR0 = ((v3.h1) g0Var.f36832K.f22540d).R0();
                AbstractC4154l.m8920c(o0VarR0);
                return o0VarR0;
            }
            v3.g0 g0VarM14609v2 = g0Var.m14609v();
            if (g0VarM14609v2 != null) {
                g0Var2 = g0VarM14609v2.f36849h;
            }
            AbstractC4154l.m8920c(g0Var2);
            v3.g0 g0VarM14609v3 = g0Var.m14609v();
            AbstractC4154l.m8920c(g0VarM14609v3);
            g0Var = g0VarM14609v3.f36849h;
            AbstractC4154l.m8920c(g0Var);
        }
    }

    /* renamed from: j */
    public static final long m13281j(long j6, long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) * Float.intBitsToFloat((int) (j6 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) * Float.intBitsToFloat((int) (j6 & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }
}
