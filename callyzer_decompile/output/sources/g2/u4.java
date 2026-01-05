package g2;

import androidx.compose.foundation.layout.AbstractC0242a;
import au.C0447k;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import d4.AbstractC1586n;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import h1.AbstractC2773d;
import h2.AbstractC2808m;
import h2.AbstractC2812q;
import h2.C2807l;
import h2.C2810o;
import j2.AbstractC3526f;
import java.util.Locale;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import kx.C4266h;
import o1.AbstractC5251j;
import o1.AbstractC5260s;
import o1.C5261t;
import og.rf;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import q1.C6097y;
import s2.AbstractC6740i;
import s2.C6734c;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7876o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class u4 {

    /* renamed from: a */
    public static final o1.i1 f12866a = AbstractC0242a.m649c(24, 20, DefinitionKt.NO_Float_VALUE, 8, 4);

    /* renamed from: b */
    public static final float f12867b;

    static {
        float f6 = 64;
        float f10 = 12;
        AbstractC0242a.m649c(f6, DefinitionKt.NO_Float_VALUE, f10, DefinitionKt.NO_Float_VALUE, 10);
        AbstractC0242a.m649c(f6, DefinitionKt.NO_Float_VALUE, f10, f10, 2);
        f12867b = 60;
    }

    /* renamed from: a */
    public static final void m6318a(v4 v4Var, InterfaceC7879r interfaceC7879r, z2 z2Var, C6734c c6734c, C6734c c6734c2, boolean z6, u2 u2Var, InterfaceC3962k interfaceC3962k, int i10) {
        z2 z2Var2;
        int i11;
        z2 z2Var3;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(650830774);
        int i12 = i10 | (c3966o.m8614g(v4Var) ? 4 : 2) | (c3966o.m8614g(interfaceC7879r) ? 32 : 16) | 128 | (c3966o.m8614g(u2Var) ? 1048576 : 524288);
        if ((599187 & i12) == 599186 && c3966o.m8586C()) {
            c3966o.m8601S();
            z2Var3 = z2Var;
        } else {
            c3966o.m8603U();
            int i13 = i10 & 1;
            k2.s0 s0Var = C3961j.f20408a;
            if (i13 == 0 || c3966o.m8584A()) {
                Object objM8596M = c3966o.m8596M();
                if (objM8596M == s0Var) {
                    y2 y2Var = y2.f13288a;
                    objM8596M = new z2();
                    c3966o.j0(objM8596M);
                }
                z2Var2 = (z2) objM8596M;
                i11 = i12 & (-897);
            } else {
                c3966o.m8601S();
                i11 = i12 & (-897);
                z2Var2 = z2Var;
            }
            int i14 = i11;
            c3966o.m8624q();
            Locale localeM6258v = p9.m6258v(c3966o);
            boolean zM8614g = c3966o.m8614g(localeM6258v);
            Object objM8596M2 = c3966o.m8596M();
            if (zM8614g || objM8596M2 == s0Var) {
                objM8596M2 = AbstractC2812q.m6911c(localeM6258v);
                c3966o.j0(objM8596M2);
            }
            AbstractC2808m abstractC2808m = (AbstractC2808m) objM8596M2;
            c3966o.m8607Y(-1454747621);
            C6734c c6734cM12902d = z6 ? AbstractC6740i.m12902d(-1490010652, new l4(v4Var, 0), c3966o) : null;
            c3966o.m8623p(false);
            z2 z2Var4 = z2Var2;
            f4.m6141a(interfaceC7879r, c6734c, c6734c2, c6734cM12902d, u2Var, xd.m6341a(AbstractC3526f.f18576v, c3966o), AbstractC3526f.f18575u - f12867b, AbstractC6740i.m12902d(-57534331, new C0447k(v4Var, abstractC2808m, z2Var4, u2Var, 4), c3966o), c3966o, ((i14 >> 3) & 14) | 14156208 | ((i14 >> 6) & 57344));
            z2Var3 = z2Var4;
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new b3(v4Var, interfaceC7879r, z2Var3, c6734c, c6734c2, z6, u2Var, i10, 1);
        }
    }

    /* renamed from: b */
    public static final void m6319b(C6097y c6097y, Long l9, Long l10, InterfaceC2141e interfaceC2141e, InterfaceC2139c interfaceC2139c, AbstractC2808m abstractC2808m, C4266h c4266h, z2 z2Var, z9 z9Var, u2 u2Var, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        Long l11;
        Long l12;
        InterfaceC2141e interfaceC2141e2;
        z9 z9Var2;
        Object n3Var;
        C6097y c6097y2 = c6097y;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(1257365001);
        if ((i10 & 6) == 0) {
            i11 = (c3966o.m8614g(c6097y2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            l11 = l9;
            i11 |= c3966o.m8614g(l11) ? 32 : 16;
        } else {
            l11 = l9;
        }
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            l12 = l10;
            i11 |= c3966o.m8614g(l12) ? 256 : 128;
        } else {
            l12 = l10;
        }
        if ((i10 & 3072) == 0) {
            interfaceC2141e2 = interfaceC2141e;
            i11 |= c3966o.m8616i(interfaceC2141e2) ? NewHope.SENDB_BYTES : 1024;
        } else {
            interfaceC2141e2 = interfaceC2141e;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c3966o.m8616i(interfaceC2139c) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c3966o.m8616i(abstractC2808m) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c3966o.m8616i(c4266h) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= (16777216 & i10) == 0 ? c3966o.m8614g(z2Var) : c3966o.m8616i(z2Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            z9Var2 = z9Var;
            i11 |= c3966o.m8614g(z9Var2) ? 67108864 : 33554432;
        } else {
            z9Var2 = z9Var;
        }
        if ((805306368 & i10) == 0) {
            i11 |= c3966o.m8614g(u2Var) ? 536870912 : 268435456;
        }
        int i12 = i11;
        if ((i12 & 306783379) == 306783378 && c3966o.m8586C()) {
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
            sc.m6306a(xd.m6341a(AbstractC3526f.f18559e, c3966o), AbstractC6740i.m12902d(1090773432, new r4(l11, l12, interfaceC2141e2, c6097y2, c4266h, abstractC2808m, (C2810o) objM8596M, z2Var, u2Var, c2807lMo6904h, z9Var2), c3966o), c3966o, 48);
            boolean zM8616i = ((i12 & 14) == 4) | ((i12 & 57344) == 16384) | c3966o.m8616i(abstractC2808m) | c3966o.m8616i(c4266h);
            Object objM8596M2 = c3966o.m8596M();
            if (zM8616i || objM8596M2 == s0Var) {
                c6097y2 = c6097y;
                n3Var = new n3(c6097y2, interfaceC2139c, abstractC2808m, c4266h, null, 1);
                c3966o.j0(n3Var);
            } else {
                n3Var = objM8596M2;
                c6097y2 = c6097y;
            }
            C3953b.m8503f((InterfaceC2141e) n3Var, c6097y2, c3966o);
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new s4(c6097y2, l9, l10, interfaceC2141e, interfaceC2139c, abstractC2808m, c4266h, z2Var, z9Var, u2Var, i10);
        }
    }

    /* renamed from: c */
    public static final void m6320c(Long l9, Long l10, long j6, InterfaceC2141e interfaceC2141e, InterfaceC2139c interfaceC2139c, AbstractC2808m abstractC2808m, C4266h c4266h, z2 z2Var, z9 z9Var, u2 u2Var, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        InterfaceC2141e interfaceC2141e2;
        InterfaceC2139c interfaceC2139c2;
        z9 z9Var2;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-787063721);
        if ((i10 & 6) == 0) {
            i11 = (c3966o.m8614g(l9) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c3966o.m8614g(l10) ? 32 : 16;
        }
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            i11 |= c3966o.m8613f(j6) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            interfaceC2141e2 = interfaceC2141e;
            i11 |= c3966o.m8616i(interfaceC2141e2) ? NewHope.SENDB_BYTES : 1024;
        } else {
            interfaceC2141e2 = interfaceC2141e;
        }
        if ((i10 & 24576) == 0) {
            interfaceC2139c2 = interfaceC2139c;
            i11 |= c3966o.m8616i(interfaceC2139c2) ? 16384 : 8192;
        } else {
            interfaceC2139c2 = interfaceC2139c;
        }
        if ((196608 & i10) == 0) {
            i11 |= c3966o.m8616i(abstractC2808m) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c3966o.m8616i(c4266h) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= (16777216 & i10) == 0 ? c3966o.m8614g(z2Var) : c3966o.m8616i(z2Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            z9Var2 = z9Var;
            i11 |= c3966o.m8614g(z9Var2) ? 67108864 : 33554432;
        } else {
            z9Var2 = z9Var;
        }
        if ((805306368 & i10) == 0) {
            i11 |= c3966o.m8614g(u2Var) ? 536870912 : 268435456;
        }
        if ((306783379 & i11) == 306783378 && c3966o.m8586C()) {
            c3966o.m8601S();
        } else {
            C2810o c2810oMo6902f = abstractC2808m.mo6902f(j6);
            int i12 = (((c2810oMo6902f.f15747a - c4266h.f21646a) * 12) + c2810oMo6902f.f15748b) - 1;
            if (i12 < 0) {
                i12 = 0;
            }
            C6097y c6097yM12082a = q1.b0.m12082a(i12, 2, c3966o);
            Integer numValueOf = Integer.valueOf(i12);
            boolean zM8614g = c3966o.m8614g(c6097yM12082a) | c3966o.m8612e(i12);
            Object objM8596M = c3966o.m8596M();
            if (zM8614g || objM8596M == C3961j.f20408a) {
                objM8596M = new c3(c6097yM12082a, i12, null, 1);
                c3966o.j0(objM8596M);
            }
            C3953b.m8503f((InterfaceC2141e) objM8596M, numValueOf, c3966o);
            InterfaceC7879r interfaceC7879rM658l = AbstractC0242a.m658l(C7876o.f37669a, f4.f11557c, DefinitionKt.NO_Float_VALUE, 2);
            C5261t c5261tM10367a = AbstractC5260s.m10367a(AbstractC5251j.f25759c, C7864c.f37654n, c3966o, 0);
            int i13 = c3966o.f20462P;
            k2.i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879rM658l);
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
            f4.m6150j(u2Var, abstractC2808m, c3966o, ((i11 >> 27) & 14) | ((i11 >> 12) & 112));
            m6319b(c6097yM12082a, l9, l10, interfaceC2141e2, interfaceC2139c2, abstractC2808m, c4266h, z2Var, z9Var2, u2Var, c3966o, ((i11 << 3) & 1008) | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (3670016 & i11) | (29360128 & i11) | (234881024 & i11) | (i11 & 1879048192));
            c3966o.m8623p(true);
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new m4(l9, l10, j6, interfaceC2141e, interfaceC2139c, abstractC2808m, c4266h, z2Var, z9Var, u2Var, i10);
        }
    }

    /* renamed from: d */
    public static final void m6321d(Long l9, Long l10, long j6, int i10, InterfaceC2141e interfaceC2141e, InterfaceC2139c interfaceC2139c, AbstractC2808m abstractC2808m, C4266h c4266h, z2 z2Var, z9 z9Var, u2 u2Var, InterfaceC3962k interfaceC3962k, int i11, int i12) {
        int i13;
        InterfaceC2139c interfaceC2139c2;
        AbstractC2808m abstractC2808m2;
        C4266h c4266h2;
        z9 z9Var2;
        int i14;
        C3966o c3966o;
        C3966o c3966o2 = (C3966o) interfaceC3962k;
        c3966o2.a0(-532789335);
        if ((i11 & 6) == 0) {
            i13 = (c3966o2.m8614g(l9) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= c3966o2.m8614g(l10) ? 32 : 16;
        }
        if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i13 |= c3966o2.m8613f(j6) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= c3966o2.m8612e(i10) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= c3966o2.m8616i(interfaceC2141e) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            interfaceC2139c2 = interfaceC2139c;
            i13 |= c3966o2.m8616i(interfaceC2139c2) ? 131072 : 65536;
        } else {
            interfaceC2139c2 = interfaceC2139c;
        }
        if ((1572864 & i11) == 0) {
            abstractC2808m2 = abstractC2808m;
            i13 |= c3966o2.m8616i(abstractC2808m2) ? 1048576 : 524288;
        } else {
            abstractC2808m2 = abstractC2808m;
        }
        if ((12582912 & i11) == 0) {
            c4266h2 = c4266h;
            i13 |= c3966o2.m8616i(c4266h2) ? 8388608 : 4194304;
        } else {
            c4266h2 = c4266h;
        }
        if ((100663296 & i11) == 0) {
            i13 |= (134217728 & i11) == 0 ? c3966o2.m8614g(z2Var) : c3966o2.m8616i(z2Var) ? 67108864 : 33554432;
        }
        if ((805306368 & i11) == 0) {
            z9Var2 = z9Var;
            i13 |= c3966o2.m8614g(z9Var2) ? 536870912 : 268435456;
        } else {
            z9Var2 = z9Var;
        }
        if ((i12 & 6) == 0) {
            i14 = i12 | (c3966o2.m8614g(u2Var) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i13 & 306783379) == 306783378 && (i14 & 3) == 2 && c3966o2.m8586C()) {
            c3966o2.m8601S();
            c3966o = c3966o2;
        } else {
            h1.a1 a1VarM6794q = AbstractC2773d.m6794q(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, null, 7);
            c3966o = c3966o2;
            rf.m10881b(new a5(i10), AbstractC1586n.m5204b(C7876o.f37669a, false, p0.f12366q), a1VarM6794q, null, AbstractC6740i.m12902d(-1026642619, new n4(l9, l10, j6, interfaceC2141e, interfaceC2139c2, abstractC2808m2, c4266h2, z2Var, z9Var2, u2Var), c3966o2), c3966o, ((i13 >> 9) & 14) | 24960, 8);
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new o4(l9, l10, j6, i10, interfaceC2141e, interfaceC2139c, abstractC2808m, c4266h, z2Var, z9Var, u2Var, i11, i12);
        }
    }
}
