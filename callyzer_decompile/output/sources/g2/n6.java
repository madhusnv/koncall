package g2;

import com.sun.mail.util.AbstractC1452a;
import cp.C1476g;
import d4.AbstractC1586n;
import ex.InterfaceC2141e;
import h2.AbstractC2812q;
import j2.AbstractC3541u;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import og.pe;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import s2.AbstractC6740i;
import s2.C6734c;
import s4.C6745a;
import t3.InterfaceC7028o;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import w2.AbstractC7862a;
import w2.C7876o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class n6 {

    /* renamed from: a */
    public static final float f12192a = 8;

    /* renamed from: b */
    public static final float f12193b = 12;

    /* renamed from: c */
    public static final float f12194c;

    /* renamed from: d */
    public static final float f12195d;

    /* renamed from: e */
    public static final float f12196e;

    /* renamed from: f */
    public static final float f12197f;

    static {
        float f6 = 16;
        f12194c = f6;
        f12195d = f6;
        f12196e = f6;
        f12197f = f6;
    }

    /* renamed from: a */
    public static final void m6217a(C6734c c6734c, InterfaceC7879r interfaceC7879r, InterfaceC2141e interfaceC2141e, InterfaceC2141e interfaceC2141e2, i6 i6Var, float f6, float f10, InterfaceC3962k interfaceC3962k, int i10) {
        float f11;
        float f12;
        C3966o c3966o;
        float f13;
        float f14;
        C3966o c3966o2 = (C3966o) interfaceC3962k;
        c3966o2.a0(-1647707763);
        if (((i10 | (c3966o2.m8614g(interfaceC7879r) ? 32 : 16) | 3456 | (c3966o2.m8614g(i6Var) ? 1048576 : 524288) | 113246208) & 38347923) == 38347922 && c3966o2.m8586C()) {
            c3966o2.m8601S();
            f13 = f6;
            f14 = f10;
            c3966o = c3966o2;
        } else {
            c3966o2.m8603U();
            if ((i10 & 1) == 0 || c3966o2.m8584A()) {
                f11 = j6.f11854a;
                f12 = f11;
            } else {
                c3966o2.m8601S();
                f11 = f6;
                f12 = f10;
            }
            c3966o2.m8624q();
            C6734c c6734cM12902d = AbstractC6740i.m12902d(-403249643, new C1476g(3, i6Var, c6734c), c3966o2);
            c3966o2.m8607Y(1640970492);
            int i11 = 0;
            c3966o2.m8623p(false);
            c3966o2.m8607Y(1640980724);
            c3966o2.m8623p(false);
            c3966o2.m8607Y(1640990750);
            C6734c c6734cM12902d2 = interfaceC2141e == null ? null : AbstractC6740i.m12902d(1400509200, new l6(i6Var, interfaceC2141e, i11), c3966o2);
            c3966o2.m8623p(false);
            c3966o2.m8607Y(1641004177);
            C6734c c6734cM12902d3 = interfaceC2141e2 == null ? null : AbstractC6740i.m12902d(1512306332, new l6(i6Var, interfaceC2141e2, 1), c3966o2);
            c3966o2.m8623p(false);
            InterfaceC7879r interfaceC7879rMo14852e = AbstractC1586n.m5204b(C7876o.f37669a, true, p0.f12370v).mo14852e(interfaceC7879r);
            float f15 = j6.f11854a;
            d3.l0 l0VarM6134a = ea.m6134a(AbstractC3541u.f18873c, c3966o2);
            long j6 = i6Var.f11799a;
            long j10 = i6Var.f11800b;
            C6734c c6734cM12902d4 = AbstractC6740i.m12902d(1502590376, new x0(c6734cM12902d2, c6734cM12902d3, c6734cM12902d, null, null), c3966o2);
            c3966o = c3966o2;
            fb.m6164a(interfaceC7879rMo14852e, l0VarM6134a, j6, j10, f11, f12, null, c6734cM12902d4, c3966o, 12804096, 64);
            f13 = f11;
            f14 = f12;
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new k6(c6734c, interfaceC7879r, interfaceC2141e, interfaceC2141e2, i6Var, f13, f14, i10);
        }
    }

    /* renamed from: b */
    public static final void m6218b(InterfaceC2141e interfaceC2141e, InterfaceC2141e interfaceC2141e2, C6734c c6734c, InterfaceC2141e interfaceC2141e3, InterfaceC2141e interfaceC2141e4, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(2052297037);
        if ((i10 & 6) == 0) {
            i11 = (c3966o.m8616i(interfaceC2141e) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c3966o.m8616i(interfaceC2141e2) ? 32 : 16;
        }
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            i11 |= c3966o.m8616i(c6734c) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c3966o.m8616i(interfaceC2141e3) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c3966o.m8616i(interfaceC2141e4) ? 16384 : 8192;
        }
        if ((i11 & 9363) == 9362 && c3966o.m8586C()) {
            c3966o.m8601S();
        } else {
            Object objM8596M = c3966o.m8596M();
            k2.s0 s0Var = C3961j.f20408a;
            if (objM8596M == s0Var) {
                objM8596M = new s6();
                c3966o.j0(objM8596M);
            }
            s6 s6Var = (s6) objM8596M;
            C6734c c6734cM13278g = t3.c1.m13278g(pe.m10834i(c6734c, interfaceC2141e3 == null ? e2.f11434a : interfaceC2141e3, interfaceC2141e4 == null ? e2.f11435b : interfaceC2141e4, interfaceC2141e == null ? e2.f11436c : interfaceC2141e, interfaceC2141e2 == null ? e2.f11437d : interfaceC2141e2));
            Object objM8596M2 = c3966o.m8596M();
            if (objM8596M2 == s0Var) {
                objM8596M2 = new t3.p0(s6Var);
                c3966o.j0(objM8596M2);
            }
            t3.j0 j0Var = (t3.j0) objM8596M2;
            int i12 = c3966o.f20462P;
            k2.i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, C7876o.f37669a);
            InterfaceC7639k.V0.getClass();
            C7637i c7637i = C7638j.f36921b;
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C3953b.m8521x(C7638j.f36925f, j0Var, c3966o);
            C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o);
            C7636h c7636h = C7638j.f36926g;
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i12))) {
                AbstractC1452a.m4577x(i12, c3966o, i12, c7636h);
            }
            C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
            c6734cM13278g.invoke(c3966o, 0);
            c3966o.m8623p(true);
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new g1.e0(interfaceC2141e, interfaceC2141e2, c6734c, interfaceC2141e3, interfaceC2141e4, i10);
        }
    }

    /* renamed from: c */
    public static final void m6219c(long j6, j2.t0 t0Var, InterfaceC2141e interfaceC2141e, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(1133967795);
        if ((i10 & 6) == 0) {
            i11 = (c3966o.m8613f(j6) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c3966o.m8614g(t0Var) ? 32 : 16;
        }
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            i11 |= c3966o.m8616i(interfaceC2141e) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c3966o.m8586C()) {
            c3966o.m8601S();
        } else {
            AbstractC2812q.m6910b(j6, xd.m6341a(t0Var, c3966o), interfaceC2141e, c3966o, i11 & 910);
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new h2.l0(j6, t0Var, interfaceC2141e, i10, 2);
        }
    }

    /* renamed from: d */
    public static final int m6220d(InterfaceC7028o interfaceC7028o, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j6) {
        int iMax = Math.max(Math.max(C6745a.m12919j(j6), interfaceC7028o.e0(i15 == 1 ? AbstractC3541u.f18884n : i15 == 2 ? AbstractC3541u.f18891u : AbstractC3541u.f18887q)), Math.max(i10, Math.max(i12 + i13 + i14, i11)) + i16);
        int iM12917h = C6745a.m12917h(j6);
        return iMax > iM12917h ? iM12917h : iMax;
    }
}
