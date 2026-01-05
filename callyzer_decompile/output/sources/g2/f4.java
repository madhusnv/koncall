package g2;

import a3.C0045d;
import androidx.compose.animation.AbstractC0234a;
import androidx.compose.foundation.AbstractC0237a;
import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.layout.AbstractC0245d;
import au.C0447k;
import b2.C0552j;
import b3.C0584p;
import c9.C0917l;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import cp.C1475f;
import cp.C1476g;
import d3.C1565s;
import d4.AbstractC1586n;
import d4.C1587o;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import h1.AbstractC2773d;
import h2.AbstractC2808m;
import h2.AbstractC2812q;
import h2.C2807l;
import h2.C2810o;
import i1.C3138q;
import j2.AbstractC3526f;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import kx.C4266h;
import o1.AbstractC5251j;
import o1.AbstractC5256o;
import o1.AbstractC5260s;
import o1.C5261t;
import og.gg;
import og.hg;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import q1.C6097y;
import qw.C6361k;
import r4.C6456k;
import s2.AbstractC6740i;
import s2.C6734c;
import s4.InterfaceC6747c;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import w1.AbstractC7861e;
import w1.C7860d;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7876o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class f4 {

    /* renamed from: a */
    public static final float f11555a = 48;

    /* renamed from: b */
    public static final float f11556b = 56;

    /* renamed from: c */
    public static final float f11557c;

    /* renamed from: d */
    public static final o1.i1 f11558d;

    /* renamed from: e */
    public static final o1.i1 f11559e;

    /* renamed from: f */
    public static final float f11560f;

    static {
        float f6 = 12;
        f11557c = f6;
        f11558d = AbstractC0242a.m649c(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, f6, f6, 3);
        float f10 = 24;
        float f11 = 16;
        AbstractC0242a.m649c(f10, f11, f6, DefinitionKt.NO_Float_VALUE, 8);
        f11559e = AbstractC0242a.m649c(f10, DefinitionKt.NO_Float_VALUE, f6, f6, 2);
        f11560f = f11;
    }

    /* renamed from: a */
    public static final void m6141a(InterfaceC7879r interfaceC7879r, C6734c c6734c, InterfaceC2141e interfaceC2141e, InterfaceC2141e interfaceC2141e2, u2 u2Var, g4.o0 o0Var, float f6, C6734c c6734c2, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        InterfaceC2141e interfaceC2141e3;
        InterfaceC2141e interfaceC2141e4;
        C3966o c3966o;
        C3966o c3966o2 = (C3966o) interfaceC3962k;
        c3966o2.a0(1507356255);
        if ((i10 & 6) == 0) {
            i11 = (c3966o2.m8614g(interfaceC7879r) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c3966o2.m8616i(c6734c) ? 32 : 16;
        }
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            interfaceC2141e3 = interfaceC2141e;
            i11 |= c3966o2.m8616i(interfaceC2141e3) ? 256 : 128;
        } else {
            interfaceC2141e3 = interfaceC2141e;
        }
        if ((i10 & 3072) == 0) {
            interfaceC2141e4 = interfaceC2141e2;
            i11 |= c3966o2.m8616i(interfaceC2141e4) ? NewHope.SENDB_BYTES : 1024;
        } else {
            interfaceC2141e4 = interfaceC2141e2;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c3966o2.m8614g(u2Var) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c3966o2.m8614g(o0Var) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c3966o2.m8611d(f6) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= c3966o2.m8616i(c6734c2) ? 8388608 : 4194304;
        }
        int i12 = i11;
        if ((i12 & 4793491) == 4793490 && c3966o2.m8586C()) {
            c3966o2.m8601S();
            c3966o = c3966o2;
        } else {
            InterfaceC7879r interfaceC7879rM633a = AbstractC0237a.m633a(AbstractC1586n.m5204b(AbstractC0245d.m681r(interfaceC7879r, AbstractC3526f.f18557c, DefinitionKt.NO_Float_VALUE, 14), false, p0.f12356e), u2Var.f12830a, d3.h0.f7748a);
            C5261t c5261tM10367a = AbstractC5260s.m10367a(AbstractC5251j.f25759c, C7864c.f37654n, c3966o2, 0);
            int i13 = c3966o2.f20462P;
            k2.i1 i1VarM8620m = c3966o2.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o2, interfaceC7879rM633a);
            InterfaceC7639k.V0.getClass();
            C7637i c7637i = C7638j.f36921b;
            c3966o2.c0();
            if (c3966o2.f20461O) {
                c3966o2.m8619l(c7637i);
            } else {
                c3966o2.m0();
            }
            C3953b.m8521x(C7638j.f36925f, c5261tM10367a, c3966o2);
            C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o2);
            C7636h c7636h = C7638j.f36926g;
            if (c3966o2.f20461O || !AbstractC4154l.m8918a(c3966o2.m8596M(), Integer.valueOf(i13))) {
                AbstractC1452a.m4577x(i13, c3966o2, i13, c7636h);
            }
            C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o2);
            m6143c(c6734c, u2Var.f12831b, u2Var.f12832c, f6, AbstractC6740i.m12902d(-229007058, new C0447k(interfaceC2141e3, interfaceC2141e4, c6734c, u2Var, o0Var), c3966o2), c3966o2, (i12 & 112) | 196614 | (57344 & (i12 >> 6)));
            c3966o = c3966o2;
            c6734c2.invoke(c3966o, Integer.valueOf(14 & (i12 >> 21)));
            c3966o.m8623p(true);
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C2468v(interfaceC7879r, c6734c, interfaceC2141e, interfaceC2141e2, u2Var, o0Var, f6, c6734c2, i10);
        }
    }

    /* renamed from: b */
    public static final void m6142b(h4 h4Var, InterfaceC7879r interfaceC7879r, z2 z2Var, C6734c c6734c, InterfaceC2141e interfaceC2141e, boolean z6, u2 u2Var, InterfaceC3962k interfaceC3962k, int i10) {
        z2 z2Var2;
        u2 u2VarM6347b;
        InterfaceC7879r interfaceC7879r2;
        InterfaceC2141e interfaceC2141e2;
        boolean z10;
        InterfaceC2141e interfaceC2141e3;
        u2 u2Var2;
        boolean z11;
        InterfaceC7879r interfaceC7879r3;
        z2 z2Var3;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(809701813);
        int i11 = 2;
        if (((i10 | (c3966o.m8614g(h4Var) ? 4 : 2) | 745648) & 599187) == 599186 && c3966o.m8586C()) {
            c3966o.m8601S();
            interfaceC7879r3 = interfaceC7879r;
            z2Var3 = z2Var;
            interfaceC2141e3 = interfaceC2141e;
            z11 = z6;
            u2Var2 = u2Var;
        } else {
            c3966o.m8603U();
            int i12 = i10 & 1;
            Object obj = C3961j.f20408a;
            if (i12 == 0 || c3966o.m8584A()) {
                Object objM8596M = c3966o.m8596M();
                if (objM8596M == obj) {
                    y2 y2Var = y2.f13288a;
                    objM8596M = new z2();
                    c3966o.j0(objM8596M);
                }
                z2Var2 = (z2) objM8596M;
                C6734c c6734cM12902d = AbstractC6740i.m12902d(-1780043561, new C1476g(i11, h4Var, z2Var2), c3966o);
                y2 y2Var2 = y2.f13288a;
                u2VarM6347b = y2.m6347b(c3966o);
                interfaceC7879r2 = C7876o.f37669a;
                interfaceC2141e2 = c6734cM12902d;
                z10 = true;
            } else {
                c3966o.m8601S();
                interfaceC7879r2 = interfaceC7879r;
                z2Var2 = z2Var;
                interfaceC2141e2 = interfaceC2141e;
                z10 = z6;
                u2VarM6347b = u2Var;
            }
            c3966o.m8624q();
            Locale localeM6258v = p9.m6258v(c3966o);
            boolean zM8614g = c3966o.m8614g(localeM6258v);
            Object objM8596M2 = c3966o.m8596M();
            if (zM8614g || objM8596M2 == obj) {
                objM8596M2 = AbstractC2812q.m6911c(localeM6258v);
                c3966o.j0(objM8596M2);
            }
            AbstractC2808m abstractC2808m = (AbstractC2808m) objM8596M2;
            c3966o.m8607Y(255587712);
            C6734c c6734cM12902d2 = z10 ? AbstractC6740i.m12902d(1982226759, new C1475f(3, h4Var), c3966o) : null;
            c3966o.m8623p(false);
            g4.o0 o0VarM6341a = xd.m6341a(AbstractC3526f.f18570p, c3966o);
            InterfaceC7879r interfaceC7879r4 = interfaceC7879r2;
            float f6 = AbstractC3526f.f18568n;
            z2 z2Var4 = z2Var2;
            C6734c c6734cM12902d3 = AbstractC6740i.m12902d(-1840727866, new C0447k(h4Var, abstractC2808m, z2Var4, u2VarM6347b, 3), c3966o);
            InterfaceC2141e interfaceC2141e4 = interfaceC2141e2;
            m6141a(interfaceC7879r4, c6734c, interfaceC2141e4, c6734cM12902d2, u2VarM6347b, o0VarM6341a, f6, c6734cM12902d3, c3966o, 14156214);
            interfaceC2141e3 = interfaceC2141e4;
            u2Var2 = u2VarM6347b;
            z11 = z10;
            interfaceC7879r3 = interfaceC7879r4;
            z2Var3 = z2Var4;
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new b3(h4Var, interfaceC7879r3, z2Var3, c6734c, interfaceC2141e3, z11, u2Var2, i10, 0);
        }
    }

    /* renamed from: c */
    public static final void m6143c(C6734c c6734c, long j6, long j10, float f6, C6734c c6734c2, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-996037719);
        int i12 = i10 & 6;
        C7876o c7876o = C7876o.f37669a;
        if (i12 == 0) {
            i11 = (c3966o.m8614g(c7876o) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c3966o.m8616i(c6734c) ? 32 : 16;
        }
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            i11 |= c3966o.m8613f(j6) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c3966o.m8613f(j10) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c3966o.m8611d(f6) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c3966o.m8616i(c6734c2) ? 131072 : 65536;
        }
        if ((74899 & i11) == 74898 && c3966o.m8586C()) {
            c3966o.m8601S();
        } else {
            InterfaceC7879r interfaceC7879rMo14852e = AbstractC0245d.m668e(c7876o, 1.0f).mo14852e(AbstractC0245d.m665b(c7876o, DefinitionKt.NO_Float_VALUE, f6, 1));
            C5261t c5261tM10367a = AbstractC5260s.m10367a(AbstractC5251j.f25763g, C7864c.f37654n, c3966o, 6);
            int i13 = c3966o.f20462P;
            k2.i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879rMo14852e);
            InterfaceC7639k.V0.getClass();
            C7637i c7637i = C7638j.f36921b;
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C3953b.m8521x(C7638j.f36925f, c5261tM10367a, c3966o);
            C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o);
            C7636h c7636h = C7638j.f36926g;
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i13))) {
                AbstractC1452a.m4577x(i13, c3966o, i13, c7636h);
            }
            C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
            c3966o.m8607Y(594325590);
            AbstractC2812q.m6910b(j6, xd.m6341a(AbstractC3526f.f18572r, c3966o), AbstractC6740i.m12902d(1936268514, new C2452f(c6734c, 2, (byte) 0), c3966o), c3966o, ((i11 >> 6) & 14) | KyberEngine.KyberPolyBytes);
            c3966o.m8623p(false);
            C3953b.m8498a(AbstractC1452a.m4572s(j10, k2.f11902a), c6734c2, c3966o, ((i11 >> 12) & 112) | 8);
            c3966o.m8623p(true);
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new h3(c6734c, j6, j10, f6, c6734c2, i10);
        }
    }

    /* renamed from: d */
    public static h4 m6144d(Locale locale, Long l9, z9 z9Var, int i10) {
        if ((i10 & 2) != 0) {
            l9 = null;
        }
        Long l10 = l9;
        C4266h c4266h = y2.f13289b;
        if ((i10 & 32) != 0) {
            z9Var = y2.f13291d;
        }
        return new h4(l10, l10, c4266h, 0, z9Var, locale);
    }

    /* renamed from: e */
    public static final void m6145e(boolean z6, InterfaceC2137a interfaceC2137a, boolean z10, boolean z11, boolean z12, boolean z13, String str, u2 u2Var, C6734c c6734c, InterfaceC3962k interfaceC3962k, int i10) {
        long j6;
        k2.h2 h2VarM8520w;
        long j10;
        C3138q c3138q;
        k2.h2 h2VarM8520w2;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-1434777861);
        int i11 = i10 | (c3966o.m8615h(z6) ? 32 : 16) | (c3966o.m8616i(interfaceC2137a) ? 256 : 128) | (c3966o.m8615h(z10) ? NewHope.SENDB_BYTES : 1024) | (c3966o.m8615h(z11) ? 16384 : 8192) | (c3966o.m8615h(z12) ? 131072 : 65536) | (c3966o.m8615h(z13) ? 1048576 : 524288) | (c3966o.m8614g(str) ? 8388608 : 4194304) | (c3966o.m8614g(u2Var) ? 67108864 : 33554432);
        if ((306783379 & i11) == 306783378 && c3966o.m8586C()) {
            c3966o.m8601S();
        } else {
            boolean z14 = (29360128 & i11) == 8388608;
            Object objM8596M = c3966o.m8596M();
            if (z14 || objM8596M == C3961j.f20408a) {
                objM8596M = new C1587o(str, 6);
                c3966o.j0(objM8596M);
            }
            InterfaceC7879r interfaceC7879rM5204b = AbstractC1586n.m5204b(C7876o.f37669a, true, (InterfaceC2139c) objM8596M);
            d3.l0 l0VarM6134a = ea.m6134a(AbstractC3526f.f18558d, c3966o);
            int i12 = i11 >> 3;
            if (z6) {
                j6 = z11 ? u2Var.f12847r : u2Var.f12848s;
            } else {
                u2Var.getClass();
                j6 = C1565s.f7816i;
            }
            if (z10) {
                c3966o.m8607Y(-217363149);
                h2VarM8520w = g1.b1.m6085a(j6, AbstractC2773d.m6795r(100, 0, null, 6), c3966o, 0);
                c3966o.m8623p(false);
            } else {
                c3966o.m8607Y(-217247953);
                h2VarM8520w = C3953b.m8520w(new C1565s(j6), c3966o);
                c3966o.m8623p(false);
            }
            long j11 = ((C1565s) h2VarM8520w.getValue()).f7819a;
            long j12 = u2Var.f12844o;
            if (z6 && z11) {
                j12 = u2Var.f12845p;
            } else if (z6 && !z11) {
                j12 = u2Var.f12846q;
            } else if (z13 && z11) {
                j12 = u2Var.f12852w;
            } else if (!z13 || z11) {
                if (z12) {
                    j12 = u2Var.f12849t;
                } else if (z11) {
                    j12 = u2Var.f12843n;
                }
            }
            if (z13) {
                c3966o.m8607Y(-828303257);
                h2VarM8520w2 = C3953b.m8520w(new C1565s(j12), c3966o);
                c3966o.m8623p(false);
                j10 = j11;
                c3138q = null;
            } else {
                j10 = j11;
                c3966o.m8607Y(-828241443);
                c3138q = null;
                k2.h2 h2VarM6085a = g1.b1.m6085a(j12, AbstractC2773d.m6795r(100, 0, null, 6), c3966o, 0);
                c3966o.m8623p(false);
                h2VarM8520w2 = h2VarM6085a;
            }
            fb.m6165b(z6, interfaceC2137a, interfaceC7879rM5204b, z11, l0VarM6134a, j10, ((C1565s) h2VarM8520w2.getValue()).f7819a, DefinitionKt.NO_Float_VALUE, (!z12 || z6) ? c3138q : pg.d0.m11579a(AbstractC3526f.f18565k, u2Var.f12850u), null, AbstractC6740i.m12902d(-2031780827, new C2452f(c6734c, 3, (byte) 0), c3966o), c3966o, i12 & 7294, 1408);
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new i3(z6, interfaceC2137a, z10, z11, z12, z13, str, u2Var, c6734c, i10);
        }
    }

    /* renamed from: f */
    public static final void m6146f(InterfaceC7879r interfaceC7879r, int i10, InterfaceC2139c interfaceC2139c, InterfaceC3962k interfaceC3962k, int i11) {
        boolean z6;
        InterfaceC7879r interfaceC7879r2;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(1393846115);
        int i12 = (c3966o.m8612e(i10) ? 32 : 16) | i11 | (c3966o.m8616i(interfaceC2139c) ? 256 : 128);
        if ((i12 & 147) == 146 && c3966o.m8586C()) {
            c3966o.m8601S();
            interfaceC7879r2 = interfaceC7879r;
        } else {
            k2.s0 s0Var = C3961j.f20408a;
            if (i10 == 0) {
                c3966o.m8607Y(-411219388);
                z6 = (i12 & 896) == 256;
                Object objM8596M = c3966o.m8596M();
                if (z6 || objM8596M == s0Var) {
                    objM8596M = new j3(0, interfaceC2139c);
                    c3966o.j0(objM8596M);
                }
                interfaceC7879r2 = interfaceC7879r;
                p9.m6246j((InterfaceC2137a) objM8596M, interfaceC7879r2, false, null, null, d2.f11359a, c3966o, 196656, 28);
                c3966o.m8623p(false);
            } else {
                c3966o.m8607Y(-410937381);
                z6 = (i12 & 896) == 256;
                Object objM8596M2 = c3966o.m8596M();
                if (z6 || objM8596M2 == s0Var) {
                    objM8596M2 = new j3(1, interfaceC2139c);
                    c3966o.j0(objM8596M2);
                }
                interfaceC7879r2 = interfaceC7879r;
                p9.m6246j((InterfaceC2137a) objM8596M2, interfaceC7879r2, false, null, null, d2.f11360b, c3966o, 196656, 28);
                c3966o.m8623p(false);
            }
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new k3(interfaceC7879r2, i10, interfaceC2139c, i11);
        }
    }

    /* renamed from: g */
    public static final void m6147g(C6097y c6097y, Long l9, InterfaceC2139c interfaceC2139c, InterfaceC2139c interfaceC2139c2, AbstractC2808m abstractC2808m, C4266h c4266h, z2 z2Var, z9 z9Var, u2 u2Var, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        Long l10;
        Object n3Var;
        C6097y c6097y2 = c6097y;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-1994757941);
        if ((i10 & 6) == 0) {
            i11 = (c3966o.m8614g(c6097y2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            l10 = l9;
            i11 |= c3966o.m8614g(l10) ? 32 : 16;
        } else {
            l10 = l9;
        }
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            i11 |= c3966o.m8616i(interfaceC2139c) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c3966o.m8616i(interfaceC2139c2) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c3966o.m8616i(abstractC2808m) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c3966o.m8616i(c4266h) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= (2097152 & i10) == 0 ? c3966o.m8614g(z2Var) : c3966o.m8616i(z2Var) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= c3966o.m8614g(z9Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i11 |= c3966o.m8614g(u2Var) ? 67108864 : 33554432;
        }
        if ((38347923 & i11) == 38347922 && c3966o.m8586C()) {
            c3966o.m8601S();
        } else {
            C2807l c2807lMo6904h = abstractC2808m.mo6904h();
            boolean zM8614g = c3966o.m8614g(c4266h);
            Object objM8596M = c3966o.m8596M();
            k2.s0 s0Var = C3961j.f20408a;
            if (zM8614g || objM8596M == s0Var) {
                objM8596M = abstractC2808m.mo6901e(c4266h.f21646a, 1);
                c3966o.j0(objM8596M);
            }
            int i12 = i11;
            sc.m6306a(xd.m6341a(AbstractC3526f.f18559e, c3966o), AbstractC6740i.m12902d(1504086906, new m3(c6097y2, c4266h, abstractC2808m, (C2810o) objM8596M, interfaceC2139c, c2807lMo6904h, l10, z2Var, z9Var, u2Var), c3966o), c3966o, 48);
            boolean zM8616i = ((i12 & 14) == 4) | ((i12 & 7168) == 2048) | c3966o.m8616i(abstractC2808m) | c3966o.m8616i(c4266h);
            Object objM8596M2 = c3966o.m8596M();
            if (zM8616i || objM8596M2 == s0Var) {
                c6097y2 = c6097y;
                n3Var = new n3(c6097y2, interfaceC2139c2, abstractC2808m, c4266h, null, 0);
                c3966o.j0(n3Var);
            } else {
                n3Var = objM8596M2;
                c6097y2 = c6097y;
            }
            C3953b.m8503f((InterfaceC2141e) n3Var, c6097y2, c3966o);
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new o3(c6097y2, l9, interfaceC2139c, interfaceC2139c2, abstractC2808m, c4266h, z2Var, z9Var, u2Var, i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x0252  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m6148h(h2.C2810o r31, ex.InterfaceC2139c r32, long r33, java.lang.Long r35, java.lang.Long r36, g2.aa r37, g2.z2 r38, g2.z9 r39, g2.u2 r40, k2.InterfaceC3962k r41, int r42) {
        /*
            Method dump skipped, instructions count: 1071
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.f4.m6148h(h2.o, ex.c, long, java.lang.Long, java.lang.Long, g2.aa, g2.z2, g2.z9, g2.u2, k2.k, int):void");
    }

    /* renamed from: i */
    public static final void m6149i(InterfaceC7879r interfaceC7879r, boolean z6, boolean z10, boolean z11, String str, InterfaceC2137a interfaceC2137a, InterfaceC2137a interfaceC2137a2, InterfaceC2137a interfaceC2137a3, u2 u2Var, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        InterfaceC2137a interfaceC2137a4;
        InterfaceC2137a interfaceC2137a5;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-773929258);
        if ((i10 & 6) == 0) {
            i11 = (c3966o.m8614g(interfaceC7879r) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c3966o.m8615h(z6) ? 32 : 16;
        }
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            i11 |= c3966o.m8615h(z10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c3966o.m8615h(z11) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c3966o.m8614g(str) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c3966o.m8616i(interfaceC2137a) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            interfaceC2137a4 = interfaceC2137a2;
            i11 |= c3966o.m8616i(interfaceC2137a4) ? 1048576 : 524288;
        } else {
            interfaceC2137a4 = interfaceC2137a2;
        }
        if ((12582912 & i10) == 0) {
            interfaceC2137a5 = interfaceC2137a3;
            i11 |= c3966o.m8616i(interfaceC2137a5) ? 8388608 : 4194304;
        } else {
            interfaceC2137a5 = interfaceC2137a3;
        }
        if ((100663296 & i10) == 0) {
            i11 |= c3966o.m8614g(u2Var) ? 67108864 : 33554432;
        }
        if ((i11 & 38347923) == 38347922 && c3966o.m8586C()) {
            c3966o.m8601S();
        } else {
            InterfaceC7879r interfaceC7879rM673j = AbstractC0245d.m673j(AbstractC0245d.m668e(interfaceC7879r, 1.0f), f11556b);
            o1.n1 n1VarM10357a = o1.m1.m10357a(z11 ? AbstractC5251j.f25757a : AbstractC5251j.f25763g, C7864c.f37652l, c3966o, 48);
            int i12 = c3966o.f20462P;
            k2.i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879rM673j);
            InterfaceC7639k.V0.getClass();
            C7637i c7637i = C7638j.f36921b;
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C3953b.m8521x(C7638j.f36925f, n1VarM10357a, c3966o);
            C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o);
            C7636h c7636h = C7638j.f36926g;
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i12))) {
                AbstractC1452a.m4577x(i12, c3966o, i12, c7636h);
            }
            C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
            C3953b.m8498a(AbstractC1452a.m4572s(u2Var.f12835f, k2.f11902a), AbstractC6740i.m12902d(-962805198, new r3(interfaceC2137a5, z11, str, interfaceC2137a4, z10, interfaceC2137a, z6), c3966o), c3966o, 56);
            c3966o.m8623p(true);
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new s3(interfaceC7879r, z6, z10, z11, str, interfaceC2137a, interfaceC2137a2, interfaceC2137a3, u2Var, i10);
        }
    }

    /* renamed from: j */
    public static final void m6150j(u2 u2Var, AbstractC2808m abstractC2808m, InterfaceC3962k interfaceC3962k, int i10) {
        u2 u2Var2 = u2Var;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-1849465391);
        int i11 = (i10 & 6) == 0 ? (c3966o.m8614g(u2Var2) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= c3966o.m8616i(abstractC2808m) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c3966o.m8586C()) {
            c3966o.m8601S();
        } else {
            int iMo6900d = abstractC2808m.mo6900d();
            List listMo6905i = abstractC2808m.mo6905i();
            ArrayList arrayList = new ArrayList();
            boolean z6 = true;
            int i12 = iMo6900d - 1;
            int size = listMo6905i.size();
            for (int i13 = i12; i13 < size; i13++) {
                arrayList.add(listMo6905i.get(i13));
            }
            boolean z10 = false;
            for (int i14 = 0; i14 < i12; i14++) {
                arrayList.add(listMo6905i.get(i14));
            }
            g4.o0 o0VarM6341a = xd.m6341a(AbstractC3526f.f18580z, c3966o);
            C7876o c7876o = C7876o.f37669a;
            float f6 = f11555a;
            InterfaceC7879r interfaceC7879rM668e = AbstractC0245d.m668e(AbstractC0245d.m665b(c7876o, DefinitionKt.NO_Float_VALUE, f6, 1), 1.0f);
            o1.n1 n1VarM10357a = o1.m1.m10357a(AbstractC5251j.f25762f, C7864c.f37652l, c3966o, 54);
            int i15 = c3966o.f20462P;
            k2.i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879rM668e);
            InterfaceC7639k.V0.getClass();
            C7637i c7637i = C7638j.f36921b;
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C3953b.m8521x(C7638j.f36925f, n1VarM10357a, c3966o);
            C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o);
            C7636h c7636h = C7638j.f36926g;
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i15))) {
                AbstractC1452a.m4577x(i15, c3966o, i15, c7636h);
            }
            C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
            c3966o.m8607Y(396197267);
            int size2 = arrayList.size();
            int i16 = 0;
            while (i16 < size2) {
                C6361k c6361k = (C6361k) arrayList.get(i16);
                boolean zM8614g = c3966o.m8614g(c6361k);
                Object objM8596M = c3966o.m8596M();
                if (zM8614g || objM8596M == C3961j.f20408a) {
                    objM8596M = new C0045d(9, c6361k);
                    c3966o.j0(objM8596M);
                }
                InterfaceC7879r interfaceC7879rM679p = AbstractC0245d.m679p(AbstractC1586n.m5203a(c7876o, (InterfaceC2139c) objM8596M), f6, f6);
                t3.j0 j0VarM10361d = AbstractC5256o.m10361d(C7864c.f37646e, z10);
                int i17 = c3966o.f20462P;
                k2.i1 i1VarM8620m2 = c3966o.m8620m();
                InterfaceC7879r interfaceC7879rM14845c2 = AbstractC7862a.m14845c(c3966o, interfaceC7879rM679p);
                InterfaceC7639k.V0.getClass();
                C7637i c7637i2 = C7638j.f36921b;
                c3966o.c0();
                if (c3966o.f20461O) {
                    c3966o.m8619l(c7637i2);
                } else {
                    c3966o.m0();
                }
                C3953b.m8521x(C7638j.f36925f, j0VarM10361d, c3966o);
                C3953b.m8521x(C7638j.f36924e, i1VarM8620m2, c3966o);
                C7636h c7636h2 = C7638j.f36926g;
                if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i17))) {
                    AbstractC1452a.m4577x(i17, c3966o, i17, c7636h2);
                }
                C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c2, c3966o);
                C3966o c3966o2 = c3966o;
                sc.m6307b((String) c6361k.f30756b, AbstractC0245d.m686w(c7876o, null, 3), u2Var2.f12833d, 0L, null, null, 0L, null, new C6456k(3), 0L, 0, false, 0, 0, null, o0VarM6341a, c3966o2, 48, 0, 65016);
                c3966o = c3966o2;
                c3966o.m8623p(true);
                i16++;
                z10 = false;
                z6 = true;
                arrayList = arrayList;
                c7876o = c7876o;
                size2 = size2;
                f6 = f6;
                u2Var2 = u2Var;
            }
            c3966o.m8623p(z10);
            c3966o.m8623p(z6);
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new v3(u2Var, abstractC2808m, i10, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02d3  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m6151k(java.lang.Long r28, long r29, ex.InterfaceC2139c r31, ex.InterfaceC2139c r32, h2.AbstractC2808m r33, kx.C4266h r34, g2.z2 r35, g2.z9 r36, g2.u2 r37, k2.InterfaceC3962k r38, int r39) {
        /*
            Method dump skipped, instructions count: 926
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.f4.m6151k(java.lang.Long, long, ex.c, ex.c, h2.m, kx.h, g2.z2, g2.z9, g2.u2, k2.k, int):void");
    }

    /* renamed from: l */
    public static final void m6152l(Long l9, long j6, int i10, InterfaceC2139c interfaceC2139c, InterfaceC2139c interfaceC2139c2, AbstractC2808m abstractC2808m, C4266h c4266h, z2 z2Var, z9 z9Var, u2 u2Var, InterfaceC3962k interfaceC3962k, int i11) {
        int i12;
        C3966o c3966o;
        C3966o c3966o2 = (C3966o) interfaceC3962k;
        c3966o2.a0(-895379221);
        if ((i11 & 6) == 0) {
            i12 = (c3966o2.m8614g(l9) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c3966o2.m8613f(j6) ? 32 : 16;
        }
        if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i12 |= c3966o2.m8612e(i10) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= c3966o2.m8616i(interfaceC2139c) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= c3966o2.m8616i(interfaceC2139c2) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= c3966o2.m8616i(abstractC2808m) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= c3966o2.m8616i(c4266h) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= (16777216 & i11) == 0 ? c3966o2.m8614g(z2Var) : c3966o2.m8616i(z2Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            i12 |= c3966o2.m8614g(z9Var) ? 67108864 : 33554432;
        }
        if ((805306368 & i11) == 0) {
            i12 |= c3966o2.m8614g(u2Var) ? 536870912 : 268435456;
        }
        if ((306783379 & i12) == 306783378 && c3966o2.m8586C()) {
            c3966o2.m8601S();
            c3966o = c3966o2;
        } else {
            int i13 = -((InterfaceC6747c) c3966o2.m8618k(w3.k1.f37836h)).e0(48);
            a5 a5Var = new a5(i10);
            int i14 = i12;
            InterfaceC7879r interfaceC7879rM5204b = AbstractC1586n.m5204b(C7876o.f37669a, false, p0.f12359h);
            boolean zM8612e = c3966o2.m8612e(i13);
            Object objM8596M = c3966o2.m8596M();
            if (zM8612e || objM8596M == C3961j.f20408a) {
                objM8596M = new C0584p(i13, 3);
                c3966o2.j0(objM8596M);
            }
            c3966o = c3966o2;
            AbstractC0234a.m623a(a5Var, interfaceC7879rM5204b, (InterfaceC2139c) objM8596M, null, "DatePickerDisplayModeAnimation", null, AbstractC6740i.m12902d(-459778869, new t3(l9, j6, interfaceC2139c, interfaceC2139c2, abstractC2808m, c4266h, z2Var, z9Var, u2Var), c3966o2), c3966o, ((i14 >> 6) & 14) | 1597440);
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new u3(l9, j6, i10, interfaceC2139c, interfaceC2139c2, abstractC2808m, c4266h, z2Var, z9Var, u2Var, i11);
        }
    }

    /* renamed from: m */
    public static final void m6153m(InterfaceC7879r interfaceC7879r, boolean z6, boolean z10, InterfaceC2137a interfaceC2137a, String str, u2 u2Var, C6734c c6734c, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        InterfaceC2137a interfaceC2137a2;
        Object objM11579a;
        C3966o c3966o;
        long j6;
        C3966o c3966o2 = (C3966o) interfaceC3962k;
        c3966o2.a0(238547184);
        if ((i10 & 6) == 0) {
            i11 = (c3966o2.m8614g(interfaceC7879r) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c3966o2.m8615h(z6) ? 32 : 16;
        }
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            i11 |= c3966o2.m8615h(z10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            interfaceC2137a2 = interfaceC2137a;
            i11 |= c3966o2.m8616i(interfaceC2137a2) ? NewHope.SENDB_BYTES : 1024;
        } else {
            interfaceC2137a2 = interfaceC2137a;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c3966o2.m8615h(true) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c3966o2.m8614g(str) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c3966o2.m8614g(u2Var) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= c3966o2.m8616i(c6734c) ? 8388608 : 4194304;
        }
        if ((4793491 & i11) == 4793490 && c3966o2.m8586C()) {
            c3966o2.m8601S();
        } else {
            boolean z11 = ((i11 & 112) == 32) | ((i11 & 896) == 256);
            Object objM8596M = c3966o2.m8596M();
            k2.s0 s0Var = C3961j.f20408a;
            if (z11 || objM8596M == s0Var) {
                objM11579a = (!z10 || z6) ? null : pg.d0.m11579a(AbstractC3526f.f18565k, u2Var.f12850u);
                c3966o2.j0(objM11579a);
            } else {
                objM11579a = objM8596M;
            }
            C3138q c3138q = (C3138q) objM11579a;
            boolean z12 = (458752 & i11) == 131072;
            Object objM8596M2 = c3966o2.m8596M();
            if (z12 || objM8596M2 == s0Var) {
                objM8596M2 = new C1587o(str, 8);
                c3966o2.j0(objM8596M2);
            }
            InterfaceC7879r interfaceC7879rM5204b = AbstractC1586n.m5204b(interfaceC7879r, true, (InterfaceC2139c) objM8596M2);
            d3.l0 l0VarM6134a = ea.m6134a(AbstractC3526f.f18553F, c3966o2);
            int i12 = i11 >> 3;
            int i13 = i12 & 14;
            if (z6) {
                c3966o = c3966o2;
                j6 = u2Var.f12841l;
            } else {
                c3966o = c3966o2;
                u2Var.getClass();
                j6 = C1565s.f7816i;
            }
            C3966o c3966o3 = c3966o;
            c3966o2 = c3966o3;
            fb.m6165b(z6, interfaceC2137a2, interfaceC7879rM5204b, true, l0VarM6134a, ((C1565s) g1.b1.m6085a(j6, AbstractC2773d.m6795r(100, 0, null, 6), c3966o3, 0).getValue()).f7819a, ((C1565s) g1.b1.m6085a(z6 ? u2Var.f12839j : z10 ? u2Var.f12838i : u2Var.f12836g, AbstractC2773d.m6795r(100, 0, null, 6), c3966o3, 0).getValue()).f7819a, DefinitionKt.NO_Float_VALUE, c3138q, null, AbstractC6740i.m12902d(-1573188346, new C2452f(c6734c, 4, (byte) 0), c3966o3), c3966o2, ((i11 >> 6) & 112) | i13 | (i12 & 7168), 1408);
        }
        k2.n1 n1VarM8628u = c3966o2.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new w3(interfaceC7879r, z6, z10, interfaceC2137a, str, u2Var, c6734c, i10);
        }
    }

    /* renamed from: n */
    public static final void m6154n(InterfaceC7879r interfaceC7879r, long j6, InterfaceC2139c interfaceC2139c, z9 z9Var, AbstractC2808m abstractC2808m, C4266h c4266h, u2 u2Var, InterfaceC3962k interfaceC3962k, int i10) {
        InterfaceC7879r interfaceC7879r2;
        int i11;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-1286899812);
        if ((i10 & 6) == 0) {
            interfaceC7879r2 = interfaceC7879r;
            i11 = (c3966o.m8614g(interfaceC7879r2) ? 4 : 2) | i10;
        } else {
            interfaceC7879r2 = interfaceC7879r;
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c3966o.m8613f(j6) ? 32 : 16;
        }
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            i11 |= c3966o.m8616i(interfaceC2139c) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c3966o.m8614g(z9Var) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c3966o.m8616i(abstractC2808m) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c3966o.m8616i(c4266h) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c3966o.m8614g(u2Var) ? 1048576 : 524288;
        }
        if ((i11 & 599187) == 599186 && c3966o.m8586C()) {
            c3966o.m8601S();
        } else {
            sc.m6306a(xd.m6341a(AbstractC3526f.f18550C, c3966o), AbstractC6740i.m12902d(1301915789, new z3(abstractC2808m, j6, c4266h, u2Var, interfaceC7879r2, interfaceC2139c, z9Var), c3966o), c3966o, 48);
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new a4(interfaceC7879r, j6, interfaceC2139c, z9Var, abstractC2808m, c4266h, u2Var, i10);
        }
    }

    /* renamed from: o */
    public static final void m6155o(InterfaceC2137a interfaceC2137a, boolean z6, InterfaceC7879r interfaceC7879r, C6734c c6734c, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        InterfaceC7879r interfaceC7879r2;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(409654418);
        if ((i10 & 6) == 0) {
            i11 = (c3966o.m8616i(interfaceC2137a) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c3966o.m8615h(z6) ? 32 : 16;
        }
        int i12 = i11 | KyberEngine.KyberPolyBytes;
        if ((i10 & 3072) == 0) {
            i12 |= c3966o.m8616i(c6734c) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i12 & 1171) == 1170 && c3966o.m8586C()) {
            c3966o.m8601S();
            interfaceC7879r2 = interfaceC7879r;
        } else {
            C7860d c7860d = AbstractC7861e.f37635a;
            o1.i1 i1Var = k0.f11893a;
            C7876o c7876o = C7876o.f37669a;
            p9.m6251o(interfaceC2137a, c7876o, false, c7860d, k0.m6194e(0L, ((C1565s) c3966o.m8618k(k2.f11902a)).f7819a, c3966o, 13), null, AbstractC6740i.m12902d(1899012021, new C0552j(c6734c, z6, 1), c3966o), c3966o, (i12 & 14) | 807075840 | ((i12 >> 3) & 112), 388);
            c3966o = c3966o;
            interfaceC7879r2 = c7876o;
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new f1(interfaceC2137a, z6, interfaceC7879r2, c6734c, i10);
        }
    }

    /* renamed from: p */
    public static final h4 m6156p(Long l9, z9 z9Var, InterfaceC3962k interfaceC3962k) {
        z9 z9Var2;
        C4266h c4266h = y2.f13289b;
        Locale localeM6258v = p9.m6258v(interfaceC3962k);
        Object[] objArr = new Object[0];
        C0917l c0917lM10675b = gg.m10675b(a2.f11153v, new g4(z9Var, localeM6258v, 0));
        C3966o c3966o = (C3966o) interfaceC3962k;
        boolean zM8616i = c3966o.m8616i(c4266h) | ((C3966o) interfaceC3962k).m8614g(l9) | ((C3966o) interfaceC3962k).m8614g(l9) | c3966o.m8612e(0) | c3966o.m8614g(z9Var) | c3966o.m8616i(localeM6258v);
        Object objM8596M = c3966o.m8596M();
        if (zM8616i || objM8596M == C3961j.f20408a) {
            z9Var2 = z9Var;
            objM8596M = new d4(l9, l9, c4266h, z9Var2, localeM6258v, 0);
            c3966o.j0(objM8596M);
        } else {
            z9Var2 = z9Var;
        }
        h4 h4Var = (h4) hg.m10691b(objArr, c0917lM10675b, (InterfaceC2137a) objM8596M, c3966o, 0, 4);
        ((k2.e1) h4Var.f11537c).setValue(z9Var2);
        return h4Var;
    }
}
