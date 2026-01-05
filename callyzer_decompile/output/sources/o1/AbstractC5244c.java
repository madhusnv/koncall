package o1;

import b2.C0543a;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import cp.C1476g;
import e1.C1908j;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import g2.C2452f;
import java.util.ArrayList;
import java.util.List;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import p1.AbstractC5788a;
import s2.C6734c;
import s4.AbstractC6746b;
import s4.C6745a;
import s4.EnumC6757m;
import s4.InterfaceC6747c;
import u5.C7340b;
import ug.C7439j;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7869h;
import w2.C7870i;
import w2.C7871j;
import w2.C7876o;
import w2.InterfaceC7865d;
import w2.InterfaceC7866e;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o1.c */
/* loaded from: classes.dex */
public abstract class AbstractC5244c {

    /* renamed from: a */
    public static final C5243b f25706a = new C5243b(0);

    /* renamed from: b */
    public static final C5243b f25707b = new C5243b(1);

    /* renamed from: c */
    public static final int f25708c = 9;

    /* renamed from: d */
    public static final int f25709d = 6;

    /* renamed from: e */
    public static final int f25710e = 10;

    /* renamed from: f */
    public static final int f25711f = 5;

    /* renamed from: g */
    public static final int f25712g = 15;

    /* renamed from: a */
    public static final void m10317a(InterfaceC7879r interfaceC7879r, InterfaceC7866e interfaceC7866e, C6734c c6734c, InterfaceC3962k interfaceC3962k, int i10, int i11) {
        int i12;
        C6734c c6734c2;
        InterfaceC7866e interfaceC7866e2;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(1781813501);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else {
            i12 = i10 | (c3966o.m8614g(interfaceC7879r) ? 4 : 2);
        }
        int i14 = i12 | 432;
        if (c3966o.m8598P(i14 & 1, (i14 & 1171) != 1170)) {
            if (i13 != 0) {
                interfaceC7879r = C7876o.f37669a;
            }
            C7871j c7871j = C7864c.f37642a;
            t3.j0 j0VarM10361d = AbstractC5256o.m10361d(c7871j, false);
            boolean zM8614g = c3966o.m8614g(j0VarM10361d);
            Object objM8596M = c3966o.m8596M();
            if (zM8614g || objM8596M == C3961j.f20408a) {
                c6734c2 = c6734c;
                objM8596M = new C1476g(18, j0VarM10361d, c6734c2);
                c3966o.j0(objM8596M);
            } else {
                c6734c2 = c6734c;
            }
            t3.c1.m13274c(interfaceC7879r, (InterfaceC2141e) objM8596M, c3966o, i14 & 14, 0);
            interfaceC7866e2 = c7871j;
        } else {
            c6734c2 = c6734c;
            c3966o.m8601S();
            interfaceC7866e2 = interfaceC7866e;
        }
        InterfaceC7879r interfaceC7879r2 = interfaceC7879r;
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0543a(interfaceC7879r2, interfaceC7866e2, c6734c2, i10, i11, 5);
        }
    }

    /* renamed from: b */
    public static final void m10318b(InterfaceC7879r interfaceC7879r, int i10, d0 d0Var, C6734c c6734c, InterfaceC3962k interfaceC3962k, int i11) {
        int i12;
        q0 q0Var;
        int i13;
        C7869h c7869h = C7864c.f37654n;
        C5243b c5243b = AbstractC5251j.f25757a;
        C5245d c5245d = AbstractC5251j.f25759c;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-1385862766);
        if ((i11 & 6) == 0) {
            i12 = (c3966o.m8614g(interfaceC7879r) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c3966o.m8614g(c5245d) ? 32 : 16;
        }
        if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i12 |= c3966o.m8614g(c5243b) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= c3966o.m8614g(c7869h) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= c3966o.m8612e(i10) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= c3966o.m8612e(Integer.MAX_VALUE) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= c3966o.m8614g(d0Var) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= c3966o.m8616i(c6734c) ? 8388608 : 4194304;
        }
        int i14 = i12;
        if (c3966o.m8598P(i14 & 1, (i14 & 4793491) != 4793490)) {
            int i15 = i14 & 3670016;
            boolean z6 = i15 == 1048576;
            Object objM8596M = c3966o.m8596M();
            Object obj = C3961j.f20408a;
            if (z6 || objM8596M == obj) {
                objM8596M = new q0((m0) d0Var.f482a);
                c3966o.j0(objM8596M);
            }
            q0 q0Var2 = (q0) objM8596M;
            int i16 = i14 >> 3;
            boolean zM8614g = ((((i16 & 14) ^ 6) > 4 && c3966o.m8614g(c5245d)) || (i16 & 6) == 4) | ((((i16 & 112) ^ 48) > 32 && c3966o.m8614g(c5243b)) || (i16 & 48) == 32) | ((((i16 & 896) ^ KyberEngine.KyberPolyBytes) > 256 && c3966o.m8614g(c7869h)) || (i16 & KyberEngine.KyberPolyBytes) == 256) | ((((i16 & 7168) ^ 3072) > 2048 && c3966o.m8612e(i10)) || (i16 & 3072) == 2048) | ((((57344 & i16) ^ 24576) > 16384 && c3966o.m8612e(Integer.MAX_VALUE)) || (i16 & 24576) == 16384) | c3966o.m8614g(q0Var2);
            Object objM8596M2 = c3966o.m8596M();
            if (zM8614g || objM8596M2 == obj) {
                float f6 = 0;
                q0Var = q0Var2;
                i13 = i15;
                Object s0Var = new s0(false, c5243b, c5245d, f6, new C5265x(c7869h), f6, i10, q0Var);
                c3966o.j0(s0Var);
                objM8596M2 = s0Var;
            } else {
                q0Var = q0Var2;
                i13 = i15;
            }
            s0 s0Var2 = (s0) objM8596M2;
            boolean z10 = (i13 == 1048576) | ((i14 & 29360128) == 8388608) | ((i14 & 458752) == 131072);
            Object objM8596M3 = c3966o.m8596M();
            Object obj2 = objM8596M3;
            if (z10 || objM8596M3 == obj) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C6734c(new C2452f(c6734c, 7, (byte) 0), true, -763839774));
                d0Var.m335o(q0Var, arrayList);
                c3966o.j0(arrayList);
                obj2 = arrayList;
            }
            C6734c c6734cM13278g = t3.c1.m13278g((List) obj2);
            boolean zM8614g2 = c3966o.m8614g(s0Var2);
            Object objM8596M4 = c3966o.m8596M();
            if (zM8614g2 || objM8596M4 == obj) {
                objM8596M4 = new t3.p0(s0Var2);
                c3966o.j0(objM8596M4);
            }
            t3.j0 j0Var = (t3.j0) objM8596M4;
            int i17 = c3966o.f20462P;
            k2.i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879r);
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
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i17))) {
                AbstractC1452a.m4577x(i17, c3966o, i17, c7636h);
            }
            C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
            c6734cM13278g.invoke(c3966o, 0);
            c3966o.m8623p(true);
        } else {
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new i0(interfaceC7879r, i10, d0Var, c6734c, i11);
        }
    }

    /* renamed from: c */
    public static final void m10319c(InterfaceC7879r interfaceC7879r, InterfaceC5249h interfaceC5249h, InterfaceC5247f interfaceC5247f, InterfaceC7865d interfaceC7865d, int i10, int i11, C6734c c6734c, InterfaceC3962k interfaceC3962k, int i12) {
        InterfaceC7879r interfaceC7879r2;
        InterfaceC5247f interfaceC5247f2;
        InterfaceC7865d interfaceC7865d2;
        int i13;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-208106226);
        int i14 = i12 | 3510 | (c3966o.m8612e(i10) ? 16384 : 8192) | 196608;
        if (c3966o.m8598P(i14 & 1, (599187 & i14) != 599186)) {
            interfaceC5249h = AbstractC5251j.f25759c;
            C5243b c5243b = AbstractC5251j.f25757a;
            C7869h c7869h = C7864c.f37654n;
            d0 d0Var = d0.f25714b;
            int i15 = (i14 & 57344) | 14355894;
            C7876o c7876o = C7876o.f37669a;
            m10318b(c7876o, i10, d0Var, c6734c, c3966o, i15);
            interfaceC5247f2 = c5243b;
            i13 = Integer.MAX_VALUE;
            interfaceC7865d2 = c7869h;
            interfaceC7879r2 = c7876o;
        } else {
            c3966o.m8601S();
            interfaceC7879r2 = interfaceC7879r;
            interfaceC5247f2 = interfaceC5247f;
            interfaceC7865d2 = interfaceC7865d;
            i13 = i11;
        }
        InterfaceC5249h interfaceC5249h2 = interfaceC5249h;
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new g1.b0(interfaceC7879r2, interfaceC5249h2, interfaceC5247f2, interfaceC7865d2, i10, i13, c6734c, i12);
        }
    }

    /* renamed from: d */
    public static final void m10320d(InterfaceC7879r interfaceC7879r, InterfaceC5247f interfaceC5247f, InterfaceC5249h interfaceC5249h, int i10, t0 t0Var, C6734c c6734c, InterfaceC3962k interfaceC3962k, int i11) {
        int i12;
        q0 q0Var;
        int i13;
        C7870i c7870i = C7864c.f37651k;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-218661582);
        if ((i11 & 6) == 0) {
            i12 = (c3966o.m8614g(interfaceC7879r) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c3966o.m8614g(interfaceC5247f) ? 32 : 16;
        }
        if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i12 |= c3966o.m8614g(interfaceC5249h) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= c3966o.m8614g(c7870i) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= c3966o.m8612e(i10) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= c3966o.m8612e(Integer.MAX_VALUE) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= c3966o.m8614g(t0Var) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= c3966o.m8616i(c6734c) ? 8388608 : 4194304;
        }
        int i14 = i12;
        if (c3966o.m8598P(i14 & 1, (i14 & 4793491) != 4793490)) {
            int i15 = i14 & 3670016;
            boolean z6 = i15 == 1048576;
            Object objM8596M = c3966o.m8596M();
            Object obj = C3961j.f20408a;
            if (z6 || objM8596M == obj) {
                objM8596M = new q0((m0) t0Var.f482a);
                c3966o.j0(objM8596M);
            }
            q0 q0Var2 = (q0) objM8596M;
            int i16 = i14 >> 3;
            boolean zM8614g = ((((i16 & 14) ^ 6) > 4 && c3966o.m8614g(interfaceC5247f)) || (i16 & 6) == 4) | ((((i16 & 112) ^ 48) > 32 && c3966o.m8614g(interfaceC5249h)) || (i16 & 48) == 32) | ((((i16 & 896) ^ KyberEngine.KyberPolyBytes) > 256 && c3966o.m8614g(c7870i)) || (i16 & KyberEngine.KyberPolyBytes) == 256) | ((((i16 & 7168) ^ 3072) > 2048 && c3966o.m8612e(i10)) || (i16 & 3072) == 2048) | ((((57344 & i16) ^ 24576) > 16384 && c3966o.m8612e(Integer.MAX_VALUE)) || (i16 & 24576) == 16384) | c3966o.m8614g(q0Var2);
            Object objM8596M2 = c3966o.m8596M();
            if (zM8614g || objM8596M2 == obj) {
                q0Var = q0Var2;
                i13 = i15;
                Object s0Var = new s0(true, interfaceC5247f, interfaceC5249h, interfaceC5247f.mo10336a(), new C5266y(c7870i), interfaceC5249h.mo10336a(), i10, q0Var);
                c3966o.j0(s0Var);
                objM8596M2 = s0Var;
            } else {
                q0Var = q0Var2;
                i13 = i15;
            }
            s0 s0Var2 = (s0) objM8596M2;
            boolean z10 = (i13 == 1048576) | ((i14 & 29360128) == 8388608) | ((i14 & 458752) == 131072);
            Object objM8596M3 = c3966o.m8596M();
            Object obj2 = objM8596M3;
            if (z10 || objM8596M3 == obj) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C6734c(new C2452f(c6734c, 8, (byte) 0), true, 702094978));
                t0Var.m335o(q0Var, arrayList);
                c3966o.j0(arrayList);
                obj2 = arrayList;
            }
            C6734c c6734cM13278g = t3.c1.m13278g((List) obj2);
            boolean zM8614g2 = c3966o.m8614g(s0Var2);
            Object objM8596M4 = c3966o.m8596M();
            if (zM8614g2 || objM8596M4 == obj) {
                objM8596M4 = new t3.p0(s0Var2);
                c3966o.j0(objM8596M4);
            }
            t3.j0 j0Var = (t3.j0) objM8596M4;
            int i17 = c3966o.f20462P;
            k2.i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879r);
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
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i17))) {
                AbstractC1452a.m4577x(i17, c3966o, i17, c7636h);
            }
            C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
            c6734cM13278g.invoke(c3966o, 0);
            c3966o.m8623p(true);
        } else {
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new g1.b0(interfaceC7879r, interfaceC5247f, interfaceC5249h, i10, t0Var, c6734c, i11);
        }
    }

    /* renamed from: e */
    public static final void m10321e(InterfaceC7879r interfaceC7879r, InterfaceC5247f interfaceC5247f, InterfaceC5249h interfaceC5249h, C7870i c7870i, int i10, int i11, C6734c c6734c, InterfaceC3962k interfaceC3962k, int i12, int i13) {
        int i14;
        InterfaceC7879r interfaceC7879r2;
        InterfaceC5247f interfaceC5247f2;
        InterfaceC5249h interfaceC5249h2;
        C7870i c7870i2;
        int i15;
        C3966o c3966o;
        int i16;
        C3966o c3966o2 = (C3966o) interfaceC3962k;
        c3966o2.a0(-2070229740);
        int i17 = i13 & 1;
        if (i17 != 0) {
            i14 = i12 | 6;
        } else if ((i12 & 6) == 0) {
            i14 = (c3966o2.m8614g(interfaceC7879r) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        int i18 = i13 & 2;
        if (i18 != 0) {
            i14 |= 48;
        } else if ((i12 & 48) == 0) {
            i14 |= c3966o2.m8614g(interfaceC5247f) ? 32 : 16;
        }
        int i19 = i13 & 4;
        if (i19 != 0) {
            i14 |= KyberEngine.KyberPolyBytes;
        } else if ((i12 & KyberEngine.KyberPolyBytes) == 0) {
            i14 |= c3966o2.m8614g(interfaceC5249h) ? 256 : 128;
        }
        int i20 = i14 | 3072;
        int i21 = i13 & 16;
        if (i21 != 0) {
            i20 = i14 | 27648;
        } else if ((i12 & 24576) == 0) {
            i20 |= c3966o2.m8612e(i10) ? 16384 : 8192;
        }
        int i22 = i20 | 196608;
        if (c3966o2.m8598P(i22 & 1, (599187 & i22) != 599186)) {
            if (i17 != 0) {
                interfaceC7879r = C7876o.f37669a;
            }
            InterfaceC7879r interfaceC7879r3 = interfaceC7879r;
            if (i18 != 0) {
                interfaceC5247f = AbstractC5251j.f25757a;
            }
            if (i19 != 0) {
                interfaceC5249h = AbstractC5251j.f25759c;
            }
            InterfaceC5249h interfaceC5249h3 = interfaceC5249h;
            C7870i c7870i3 = C7864c.f37651k;
            int i23 = i21 != 0 ? Integer.MAX_VALUE : i10;
            InterfaceC5247f interfaceC5247f3 = interfaceC5247f;
            m10320d(interfaceC7879r3, interfaceC5247f3, interfaceC5249h3, i23, t0.f25850b, c6734c, c3966o2, (i22 & 57344) | (i22 & 14) | 1572864 | (i22 & 112) | (i22 & 896) | 3072 | 12779520);
            c7870i2 = c7870i3;
            i15 = i23;
            c3966o = c3966o2;
            i16 = Integer.MAX_VALUE;
            interfaceC5249h2 = interfaceC5249h3;
            interfaceC5247f2 = interfaceC5247f3;
            interfaceC7879r2 = interfaceC7879r3;
        } else {
            c3966o2.m8601S();
            interfaceC7879r2 = interfaceC7879r;
            interfaceC5247f2 = interfaceC5247f;
            interfaceC5249h2 = interfaceC5249h;
            c7870i2 = c7870i;
            i15 = i10;
            c3966o = c3966o2;
            i16 = i11;
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new j0(interfaceC7879r2, interfaceC5247f2, interfaceC5249h2, c7870i2, i15, i16, c6734c, i12, i13);
        }
    }

    /* renamed from: f */
    public static final void m10322f(InterfaceC3962k interfaceC3962k, InterfaceC7879r interfaceC7879r) {
        C5255n c5255n = C5255n.f25793c;
        C3966o c3966o = (C3966o) interfaceC3962k;
        int i10 = c3966o.f20462P;
        InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(interfaceC3962k, interfaceC7879r);
        k2.i1 i1VarM8620m = c3966o.m8620m();
        InterfaceC7639k.V0.getClass();
        C7637i c7637i = C7638j.f36921b;
        C7439j c7439j = c3966o.f20464a;
        c3966o.c0();
        if (c3966o.f20461O) {
            c3966o.m8619l(c7637i);
        } else {
            c3966o.m0();
        }
        C3953b.m8521x(C7638j.f36925f, c5255n, interfaceC3962k);
        C3953b.m8521x(C7638j.f36924e, i1VarM8620m, interfaceC3962k);
        C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, interfaceC3962k);
        C7636h c7636h = C7638j.f36926g;
        if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i10))) {
            AbstractC1452a.m4577x(i10, c3966o, i10, c7636h);
        }
        c3966o.m8623p(true);
    }

    /* renamed from: h */
    public static final y0 m10323h(C5242a c5242a, InterfaceC3962k interfaceC3962k) {
        return new y0(c5242a, (InterfaceC6747c) ((C3966o) interfaceC3962k).m8618k(w3.k1.f37836h));
    }

    /* renamed from: i */
    public static long m10324i(long j6, c1 c1Var) {
        c1 c1Var2 = c1.Horizontal;
        return AbstractC6746b.m12923a(c1Var == c1Var2 ? C6745a.m12920k(j6) : C6745a.m12919j(j6), c1Var == c1Var2 ? C6745a.m12918i(j6) : C6745a.m12917h(j6), c1Var == c1Var2 ? C6745a.m12919j(j6) : C6745a.m12920k(j6), c1Var == c1Var2 ? C6745a.m12917h(j6) : C6745a.m12918i(j6));
    }

    /* renamed from: j */
    public static long m10325j(int i10, long j6) {
        return AbstractC6746b.m12923a(0, C6745a.m12918i(j6), (i10 & 4) != 0 ? C6745a.m12919j(j6) : 0, C6745a.m12917h(j6));
    }

    /* renamed from: k */
    public static final l1 m10326k(t3.i0 i0Var) {
        Object objMo13310C = i0Var.mo13310C();
        if (objMo13310C instanceof l1) {
            return (l1) objMo13310C;
        }
        return null;
    }

    /* renamed from: l */
    public static final float m10327l(l1 l1Var) {
        return l1Var != null ? l1Var.f25782a : DefinitionKt.NO_Float_VALUE;
    }

    /* renamed from: m */
    public static final t3.k0 m10328m(k1 k1Var, int i10, int i11, int i12, int i13, int i14, t3.l0 l0Var, List list, t3.w0[] w0VarArr, int i15, int i16, int[] iArr, int i17) {
        int i18;
        float f6;
        long j6;
        int i19;
        int i20;
        int i21;
        List list2 = list;
        long j10 = i14;
        int i22 = i16 - i15;
        int[] iArr2 = new int[i22];
        int i23 = i15;
        int iMax = 0;
        int i24 = 0;
        int i25 = 0;
        int iMin = 0;
        float f10 = DefinitionKt.NO_Float_VALUE;
        while (i23 < i16) {
            t3.i0 i0Var = (t3.i0) list2.get(i23);
            float fM10327l = m10327l(m10326k(i0Var));
            if (fM10327l > DefinitionKt.NO_Float_VALUE) {
                f10 += fM10327l;
                i24++;
                j6 = j10;
                i19 = i23;
            } else {
                int i26 = i12 - i25;
                t3.w0 w0VarMo13314z = w0VarArr[i23];
                j6 = j10;
                if (w0VarMo13314z == null) {
                    if (i12 == Integer.MAX_VALUE) {
                        i19 = i23;
                        i20 = i24;
                        i21 = Integer.MAX_VALUE;
                    } else {
                        i19 = i23;
                        i20 = i24;
                        i21 = i26 < 0 ? 0 : i26;
                    }
                    w0VarMo13314z = i0Var.mo13314z(k1Var.mo10353b(0, i21, i13, false));
                } else {
                    i19 = i23;
                    i20 = i24;
                }
                t3.w0 w0Var = w0VarMo13314z;
                int iMo10356e = k1Var.mo10356e(w0Var);
                int iMo10352a = k1Var.mo10352a(w0Var);
                iArr2[i19 - i15] = iMo10356e;
                int i27 = i26 - iMo10356e;
                if (i27 < 0) {
                    i27 = 0;
                }
                iMin = Math.min(i14, i27);
                i25 += iMo10356e + iMin;
                iMax = Math.max(iMax, iMo10352a);
                w0VarArr[i19] = w0Var;
                i24 = i20;
            }
            i23 = i19 + 1;
            j10 = j6;
        }
        long j11 = j10;
        if (i24 == 0) {
            i25 -= iMin;
            i18 = 0;
        } else {
            long j12 = (r22 - 1) * j11;
            long jRound = ((i12 != Integer.MAX_VALUE ? i12 : i10) - i25) - j12;
            if (jRound < 0) {
                jRound = 0;
            }
            float f11 = jRound / f10;
            for (int i28 = i15; i28 < i16; i28++) {
                jRound -= Math.round(m10327l(m10326k((t3.i0) list2.get(i28))) * f11);
            }
            int i29 = i15;
            int i30 = iMax;
            int i31 = 0;
            while (i29 < i16) {
                if (w0VarArr[i29] == null) {
                    t3.i0 i0Var2 = (t3.i0) list2.get(i29);
                    f6 = f11;
                    l1 l1VarM10326k = m10326k(i0Var2);
                    float fM10327l2 = m10327l(l1VarM10326k);
                    if (fM10327l2 <= DefinitionKt.NO_Float_VALUE) {
                        AbstractC5788a.m11339b("All weights <= 0 should have placeables");
                    }
                    int iSignum = Long.signum(jRound);
                    long j13 = jRound - iSignum;
                    int iMax2 = Math.max(0, Math.round(fM10327l2 * f6) + iSignum);
                    t3.w0 w0VarMo13314z2 = i0Var2.mo13314z(k1Var.mo10353b((!(l1VarM10326k != null ? l1VarM10326k.f25783b : true) || iMax2 == Integer.MAX_VALUE) ? 0 : iMax2, iMax2, i13, true));
                    int iMo10356e2 = k1Var.mo10356e(w0VarMo13314z2);
                    int iMo10352a2 = k1Var.mo10352a(w0VarMo13314z2);
                    iArr2[i29 - i15] = iMo10356e2;
                    i31 += iMo10356e2;
                    int iMax3 = Math.max(i30, iMo10352a2);
                    w0VarArr[i29] = w0VarMo13314z2;
                    i30 = iMax3;
                    jRound = j13;
                } else {
                    f6 = f11;
                }
                i29++;
                list2 = list;
                f11 = f6;
            }
            i18 = (int) (i31 + j12);
            int i32 = i12 - i25;
            if (i18 < 0) {
                i18 = 0;
            }
            if (i18 > i32) {
                i18 = i32;
            }
            iMax = i30;
        }
        int i33 = i18 + i25;
        if (i33 < 0) {
            i33 = 0;
        }
        int iMax4 = Math.max(i33, i10);
        int iMax5 = Math.max(iMax, Math.max(i11, 0));
        int[] iArr3 = new int[i22];
        k1Var.mo10355d(iMax4, iArr2, iArr3, l0Var);
        return k1Var.mo10354c(w0VarArr, l0Var, iArr3, iMax4, iMax5, iArr, i17, i15, i16);
    }

    /* renamed from: n */
    public static final long m10329n(t3.i0 i0Var, s0 s0Var, long j6, InterfaceC2139c interfaceC2139c) {
        boolean z6 = s0Var.f25838a;
        if (m10327l(m10326k(i0Var)) != DefinitionKt.NO_Float_VALUE) {
            int iMo13312x = z6 ? i0Var.mo13312x(Integer.MAX_VALUE) : i0Var.a0(Integer.MAX_VALUE);
            return C1908j.m5567a(iMo13312x, z6 ? i0Var.a0(iMo13312x) : i0Var.mo13312x(iMo13312x));
        }
        m10326k(i0Var);
        t3.w0 w0VarMo13314z = i0Var.mo13314z(j6);
        interfaceC2139c.invoke(w0VarMo13314z);
        return C1908j.m5567a(s0Var.mo10356e(w0VarMo13314z), s0Var.mo10352a(w0VarMo13314z));
    }

    /* renamed from: o */
    public static final InterfaceC7879r m10330o(InterfaceC7879r interfaceC7879r) {
        return AbstractC7862a.m14843a(interfaceC7879r, new z1(3, 1));
    }

    /* renamed from: p */
    public static final long m10331p(long j6, c1 c1Var) {
        return c1Var == c1.Horizontal ? AbstractC6746b.m12923a(C6745a.m12920k(j6), C6745a.m12918i(j6), C6745a.m12919j(j6), C6745a.m12917h(j6)) : AbstractC6746b.m12923a(C6745a.m12919j(j6), C6745a.m12917h(j6), C6745a.m12920k(j6), C6745a.m12918i(j6));
    }

    /* renamed from: q */
    public static final z0 m10332q(C7340b c7340b) {
        return new z0(c7340b.f34957a, c7340b.f34958b, c7340b.f34959c, c7340b.f34960d);
    }

    /* renamed from: r */
    public static final void m10333r(StringBuilder sb2, String str) {
        if (sb2.length() > 0) {
            sb2.append('+');
        }
        sb2.append(str);
    }

    /* renamed from: g */
    public abstract int mo10334g(int i10, EnumC6757m enumC6757m);
}
