package g2;

import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.ui.layout.AbstractC0264a;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import ex.InterfaceC2141e;
import j2.EnumC3525e;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import o1.AbstractC5256o;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import s2.AbstractC6740i;
import s2.C6734c;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7871j;
import w2.C7876o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class ab {

    /* renamed from: d */
    public static final float f11198d;

    /* renamed from: f */
    public static final float f11200f;

    /* renamed from: a */
    public static final float f11195a = 600;

    /* renamed from: b */
    public static final float f11196b = 30;

    /* renamed from: c */
    public static final float f11197c = 16;

    /* renamed from: e */
    public static final float f11199e = 6;

    static {
        float f6 = 8;
        f11198d = f6;
        f11200f = f6;
    }

    /* renamed from: a */
    public static final void m6117a(InterfaceC7879r interfaceC7879r, InterfaceC2141e interfaceC2141e, InterfaceC2141e interfaceC2141e2, d3.l0 l0Var, long j6, long j10, long j11, long j12, C6734c c6734c, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        InterfaceC2141e interfaceC2141e3;
        InterfaceC2141e interfaceC2141e4;
        d3.l0 l0Var2;
        int i12;
        C6734c c6734c2;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-1235788955);
        if ((i10 & 6) == 0) {
            i11 = (c3966o.m8614g(interfaceC7879r) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            interfaceC2141e3 = interfaceC2141e;
            i11 |= c3966o.m8616i(interfaceC2141e3) ? 32 : 16;
        } else {
            interfaceC2141e3 = interfaceC2141e;
        }
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            interfaceC2141e4 = interfaceC2141e2;
            i11 |= c3966o.m8616i(interfaceC2141e4) ? 256 : 128;
        } else {
            interfaceC2141e4 = interfaceC2141e2;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c3966o.m8615h(false) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i10 & 24576) == 0) {
            l0Var2 = l0Var;
            i11 |= c3966o.m8614g(l0Var2) ? 16384 : 8192;
        } else {
            l0Var2 = l0Var;
        }
        if ((196608 & i10) == 0) {
            i11 |= c3966o.m8613f(j6) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c3966o.m8613f(j10) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= c3966o.m8613f(j11) ? 8388608 : 4194304;
        }
        int i13 = i11;
        if ((100663296 & i10) == 0) {
            i12 = i13 | (c3966o.m8613f(j12) ? 67108864 : 33554432);
        } else {
            i12 = i13;
        }
        if ((805306368 & i10) == 0) {
            c6734c2 = c6734c;
            i12 |= c3966o.m8616i(c6734c2) ? 536870912 : 268435456;
        } else {
            c6734c2 = c6734c;
        }
        if ((306783379 & i12) == 306783378 && c3966o.m8586C()) {
            c3966o.m8601S();
        } else {
            c3966o.m8603U();
            if ((i10 & 1) != 0 && !c3966o.m8584A()) {
                c3966o.m8601S();
            }
            c3966o.m8624q();
            float f6 = j2.j0.f18621d;
            C6734c c6734cM12902d = AbstractC6740i.m12902d(-1829663446, new xa(interfaceC2141e3, c6734c2, interfaceC2141e4, j11, j12), c3966o);
            int i14 = i12 >> 9;
            fb.m6164a(interfaceC7879r, l0Var2, j6, j10, DefinitionKt.NO_Float_VALUE, f6, null, c6734cM12902d, c3966o, (i12 & 14) | 12779520 | (i14 & 112) | (i14 & 896) | (i14 & 7168), 80);
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new ya(interfaceC7879r, interfaceC2141e, interfaceC2141e2, l0Var, j6, j10, j11, j12, c6734c, i10);
        }
    }

    /* renamed from: b */
    public static final void m6118b(qa qaVar, InterfaceC7879r interfaceC7879r, d3.l0 l0Var, long j6, long j10, long j11, long j12, long j13, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        long jM6345d;
        InterfaceC7879r interfaceC7879r2;
        d3.l0 l0Var2;
        int i12;
        long j14;
        long j15;
        long j16;
        long j17;
        C3966o c3966o;
        InterfaceC7879r interfaceC7879r3;
        long j18;
        d3.l0 l0Var3;
        long j19;
        long j20;
        long j21;
        long j22;
        C3966o c3966o2 = (C3966o) interfaceC3962k;
        c3966o2.a0(274621471);
        if ((i10 & 6) == 0) {
            i11 = (c3966o2.m8614g(qaVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i13 = i11 | 432;
        if ((i10 & 3072) == 0) {
            i13 = i11 | 1456;
        }
        if ((i10 & 24576) == 0) {
            i13 |= 8192;
        }
        if ((196608 & i10) == 0) {
            i13 |= 65536;
        }
        if ((1572864 & i10) == 0) {
            i13 |= 524288;
        }
        if ((12582912 & i10) == 0) {
            i13 |= 4194304;
        }
        if ((100663296 & i10) == 0) {
            i13 |= 33554432;
        }
        if ((38347923 & i13) == 38347922 && c3966o2.m8586C()) {
            c3966o2.m8601S();
            interfaceC7879r3 = interfaceC7879r;
            l0Var3 = l0Var;
            j19 = j6;
            j20 = j10;
            j18 = j11;
            j21 = j12;
            j22 = j13;
            c3966o = c3966o2;
        } else {
            c3966o2.m8603U();
            if ((i10 & 1) == 0 || c3966o2.m8584A()) {
                d3.l0 l0VarM6134a = ea.m6134a(j2.j0.f18622e, c3966o2);
                long jM6345d2 = y1.m6345d(j2.j0.f18620c, c3966o2);
                long jM6345d3 = y1.m6345d(j2.j0.f18624g, c3966o2);
                EnumC3525e enumC3525e = j2.j0.f18618a;
                jM6345d = y1.m6345d(enumC3525e, c3966o2);
                long jM6345d4 = y1.m6345d(enumC3525e, c3966o2);
                long jM6345d5 = y1.m6345d(j2.j0.f18623f, c3966o2);
                interfaceC7879r2 = C7876o.f37669a;
                l0Var2 = l0VarM6134a;
                i12 = i13 & (-268434433);
                j14 = jM6345d2;
                j15 = jM6345d3;
                j16 = jM6345d4;
                j17 = jM6345d5;
            } else {
                c3966o2.m8601S();
                i12 = i13 & (-268434433);
                interfaceC7879r2 = interfaceC7879r;
                l0Var2 = l0Var;
                j14 = j6;
                j15 = j10;
                jM6345d = j11;
                j16 = j12;
                j17 = j13;
            }
            c3966o2.m8624q();
            qaVar.f12514a.getClass();
            c3966o2.m8607Y(1561344786);
            c3966o2.m8623p(false);
            c3966o2.m8607Y(1561358724);
            qaVar.f12514a.getClass();
            c3966o2.m8623p(false);
            c3966o = c3966o2;
            m6117a(AbstractC0242a.m656j(interfaceC7879r2, 12), null, null, l0Var2, j14, j15, j16, j17, AbstractC6740i.m12902d(-1266389126, new na(qaVar, 1), c3966o2), c3966o, ((i12 << 3) & 7168) | 805306368);
            interfaceC7879r3 = interfaceC7879r2;
            j18 = jM6345d;
            l0Var3 = l0Var2;
            j19 = j14;
            j20 = j15;
            j21 = j16;
            j22 = j17;
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new za(qaVar, interfaceC7879r3, l0Var3, j19, j20, j18, j21, j22, i10);
        }
    }

    /* renamed from: c */
    public static final void m6119c(C6734c c6734c, InterfaceC2141e interfaceC2141e, InterfaceC2141e interfaceC2141e2, g4.o0 o0Var, long j6, long j10, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        InterfaceC2141e interfaceC2141e3;
        g4.o0 o0Var2;
        int i12;
        InterfaceC2141e interfaceC2141e4;
        long j11;
        boolean z6;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-903235475);
        if ((i10 & 6) == 0) {
            i11 = (c3966o.m8616i(c6734c) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c3966o.m8616i(interfaceC2141e) ? 32 : 16;
        }
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            i11 |= c3966o.m8616i(interfaceC2141e2) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c3966o.m8614g(o0Var) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c3966o.m8613f(j6) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c3966o.m8613f(j10) ? 131072 : 65536;
        }
        if ((74899 & i11) == 74898 && c3966o.m8586C()) {
            c3966o.m8601S();
            interfaceC2141e3 = interfaceC2141e;
            interfaceC2141e4 = interfaceC2141e2;
            o0Var2 = o0Var;
            j11 = j10;
        } else {
            float f6 = interfaceC2141e2 == null ? f11198d : 0;
            C7876o c7876o = C7876o.f37669a;
            InterfaceC7879r interfaceC7879rM660n = AbstractC0242a.m660n(c7876o, f11197c, DefinitionKt.NO_Float_VALUE, f6, DefinitionKt.NO_Float_VALUE, 10);
            Object objM8596M = c3966o.m8596M();
            if (objM8596M == C3961j.f20408a) {
                objM8596M = new k1(4);
                c3966o.j0(objM8596M);
            }
            t3.j0 j0Var = (t3.j0) objM8596M;
            int i13 = c3966o.f20462P;
            k2.i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879rM660n);
            InterfaceC7639k.V0.getClass();
            C7637i c7637i = C7638j.f36921b;
            c3966o.c0();
            int i14 = i11;
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C7636h c7636h = C7638j.f36925f;
            C3953b.m8521x(c7636h, j0Var, c3966o);
            C7636h c7636h2 = C7638j.f36924e;
            C3953b.m8521x(c7636h2, i1VarM8620m, c3966o);
            C7636h c7636h3 = C7638j.f36926g;
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i13))) {
                AbstractC1452a.m4577x(i13, c3966o, i13, c7636h3);
            }
            C7636h c7636h4 = C7638j.f36923d;
            C3953b.m8521x(c7636h4, interfaceC7879rM14845c, c3966o);
            InterfaceC7879r interfaceC7879rM658l = AbstractC0242a.m658l(AbstractC0264a.m722c(c7876o, TextBundle.TEXT_ENTRY), DefinitionKt.NO_Float_VALUE, f11199e, 1);
            C7871j c7871j = C7864c.f37642a;
            t3.j0 j0VarM10361d = AbstractC5256o.m10361d(c7871j, false);
            int i15 = c3966o.f20462P;
            k2.i1 i1VarM8620m2 = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c2 = AbstractC7862a.m14845c(c3966o, interfaceC7879rM658l);
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C3953b.m8521x(c7636h, j0VarM10361d, c3966o);
            C3953b.m8521x(c7636h2, i1VarM8620m2, c3966o);
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i15))) {
                AbstractC1452a.m4577x(i15, c3966o, i15, c7636h3);
            }
            C3953b.m8521x(c7636h4, interfaceC7879rM14845c2, c3966o);
            c6734c.invoke(c3966o, Integer.valueOf(i14 & 14));
            c3966o.m8623p(true);
            c3966o.m8607Y(-904778058);
            if (interfaceC2141e != null) {
                InterfaceC7879r interfaceC7879rM722c = AbstractC0264a.m722c(c7876o, "action");
                t3.j0 j0VarM10361d2 = AbstractC5256o.m10361d(c7871j, false);
                int i16 = c3966o.f20462P;
                k2.i1 i1VarM8620m3 = c3966o.m8620m();
                InterfaceC7879r interfaceC7879rM14845c3 = AbstractC7862a.m14845c(c3966o, interfaceC7879rM722c);
                c3966o.c0();
                i12 = 8;
                if (c3966o.f20461O) {
                    c3966o.m8619l(c7637i);
                } else {
                    c3966o.m0();
                }
                C3953b.m8521x(c7636h, j0VarM10361d2, c3966o);
                C3953b.m8521x(c7636h2, i1VarM8620m3, c3966o);
                if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i16))) {
                    AbstractC1452a.m4577x(i16, c3966o, i16, c7636h3);
                }
                C3953b.m8521x(c7636h4, interfaceC7879rM14845c3, c3966o);
                o0Var2 = o0Var;
                interfaceC2141e3 = interfaceC2141e;
                C3953b.m8499b(new k2.m1[]{AbstractC1452a.m4572s(j6, k2.f11902a), sc.f12721a.mo8541a(o0Var2)}, interfaceC2141e3, c3966o, 8 | (i14 & 112));
                c3966o.m8623p(true);
            } else {
                interfaceC2141e3 = interfaceC2141e;
                o0Var2 = o0Var;
                i12 = 8;
            }
            c3966o.m8623p(false);
            c3966o.m8607Y(-904766579);
            if (interfaceC2141e2 != null) {
                InterfaceC7879r interfaceC7879rM722c2 = AbstractC0264a.m722c(c7876o, "dismissAction");
                t3.j0 j0VarM10361d3 = AbstractC5256o.m10361d(c7871j, false);
                int i17 = c3966o.f20462P;
                k2.i1 i1VarM8620m4 = c3966o.m8620m();
                InterfaceC7879r interfaceC7879rM14845c4 = AbstractC7862a.m14845c(c3966o, interfaceC7879rM722c2);
                c3966o.c0();
                if (c3966o.f20461O) {
                    c3966o.m8619l(c7637i);
                } else {
                    c3966o.m0();
                }
                C3953b.m8521x(c7636h, j0VarM10361d3, c3966o);
                C3953b.m8521x(c7636h2, i1VarM8620m4, c3966o);
                if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i17))) {
                    AbstractC1452a.m4577x(i17, c3966o, i17, c7636h3);
                }
                C3953b.m8521x(c7636h4, interfaceC7879rM14845c4, c3966o);
                j11 = j10;
                interfaceC2141e4 = interfaceC2141e2;
                C3953b.m8498a(AbstractC1452a.m4572s(j11, k2.f11902a), interfaceC2141e4, c3966o, i12 | ((i14 >> 3) & 112));
                z6 = true;
                c3966o.m8623p(true);
            } else {
                interfaceC2141e4 = interfaceC2141e2;
                j11 = j10;
                z6 = true;
            }
            c3966o.m8623p(false);
            c3966o.m8623p(z6);
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new va(c6734c, interfaceC2141e3, interfaceC2141e4, o0Var2, j6, j11, i10);
        }
    }
}
