package g2;

import a3.C0045d;
import androidx.compose.foundation.layout.AbstractC0245d;
import androidx.compose.foundation.selection.AbstractC0252b;
import androidx.compose.ui.graphics.AbstractC0260a;
import androidx.compose.ui.layout.AbstractC0264a;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import cp.C1475f;
import cp.C1476g;
import d4.C1580h;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import h1.AbstractC2773d;
import h1.AbstractC2774e;
import j2.AbstractC3544x;
import j2.EnumC3525e;
import java.util.WeakHashMap;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import m1.InterfaceC4630l;
import o1.AbstractC5244c;
import o1.AbstractC5256o;
import o1.C5243b;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import s2.AbstractC6740i;
import s2.C6734c;
import s4.InterfaceC6747c;
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
public abstract class l8 {

    /* renamed from: a */
    public static final float f12006a;

    /* renamed from: b */
    public static final float f12007b;

    /* renamed from: c */
    public static final float f12008c;

    /* renamed from: d */
    public static final float f12009d;

    /* renamed from: e */
    public static final float f12010e;

    /* renamed from: f */
    public static final float f12011f;

    static {
        EnumC3525e enumC3525e = AbstractC3544x.f18914a;
        f12006a = AbstractC3544x.f18920g;
        f12007b = 8;
        f12008c = 4;
        float f6 = AbstractC3544x.f18918e;
        float f10 = AbstractC3544x.f18921h;
        float f11 = 2;
        f12009d = (f6 - f10) / f11;
        f12010e = (AbstractC3544x.f18916c - f10) / f11;
        f12011f = 12;
    }

    /* renamed from: a */
    public static final void m6201a(InterfaceC7879r interfaceC7879r, long j6, long j10, float f6, o1.v1 v1Var, C6734c c6734c, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        long j11;
        o1.v1 e1Var;
        float f10;
        C6734c c6734c2;
        o1.v1 v1Var2;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(1596802123);
        int i12 = i10 | (c3966o.m8614g(interfaceC7879r) ? 4 : 2) | (c3966o.m8613f(j6) ? 32 : 16) | 11392;
        if ((74899 & i12) == 74898 && c3966o.m8586C()) {
            c3966o.m8601S();
            j11 = j10;
            f10 = f6;
            v1Var2 = v1Var;
            c6734c2 = c6734c;
        } else {
            c3966o.m8603U();
            if ((i10 & 1) == 0 || c3966o.m8584A()) {
                long jM6342a = y1.m6342a((v1) c3966o.m8618k(y1.f13286a), j6);
                float f11 = c8.f11311a;
                WeakHashMap weakHashMap = o1.w1.f25863v;
                i11 = i12 & (-58241);
                j11 = jM6342a;
                e1Var = new o1.e1(C5243b.m10315e(c3966o).f25870g, 32 | AbstractC5244c.f25712g);
                f10 = f11;
            } else {
                c3966o.m8601S();
                i11 = i12 & (-58241);
                j11 = j10;
                f10 = f6;
                e1Var = v1Var;
            }
            c3966o.m8624q();
            c6734c2 = c6734c;
            fb.m6164a(interfaceC7879r, null, j6, j11, f10, DefinitionKt.NO_Float_VALUE, null, AbstractC6740i.m12902d(105663120, new C1476g(5, e1Var, c6734c2), c3966o), c3966o, ((i11 << 3) & 896) | (i11 & 14) | 12582912 | 24576, 98);
            v1Var2 = e1Var;
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new e8(interfaceC7879r, j6, j11, f10, v1Var2, c6734c2, i10);
        }
    }

    /* renamed from: b */
    public static final void m6202b(o1.o1 o1Var, boolean z6, InterfaceC2137a interfaceC2137a, C6734c c6734c, InterfaceC7879r interfaceC7879r, boolean z10, InterfaceC2141e interfaceC2141e, boolean z11, d8 d8Var, InterfaceC4630l interfaceC4630l, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        InterfaceC7879r interfaceC7879r2;
        boolean z12;
        boolean z13;
        InterfaceC4630l interfaceC4630l2;
        d8 d8Var2;
        InterfaceC7879r interfaceC7879r3;
        boolean z14;
        boolean z15;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-663510974);
        if ((i10 & 6) == 0) {
            i11 = (c3966o.m8614g(o1Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c3966o.m8615h(z6) ? 32 : 16;
        }
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            i11 |= c3966o.m8616i(interfaceC2137a) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c3966o.m8616i(c6734c) ? NewHope.SENDB_BYTES : 1024;
        }
        int i12 = i11 | 221184;
        if ((1572864 & i10) == 0) {
            i12 |= c3966o.m8616i(interfaceC2141e) ? 1048576 : 524288;
        }
        int i13 = i12 | 12582912;
        if ((100663296 & i10) == 0) {
            i13 |= c3966o.m8614g(d8Var) ? 67108864 : 33554432;
        }
        if ((805306368 & i10) == 0) {
            i13 |= c3966o.m8614g(interfaceC4630l) ? 536870912 : 268435456;
        }
        int i14 = i13;
        if ((306783379 & i14) == 306783378 && c3966o.m8586C()) {
            c3966o.m8601S();
            interfaceC7879r3 = interfaceC7879r;
            z15 = z10;
            z14 = z11;
            d8Var2 = d8Var;
        } else {
            c3966o.m8603U();
            if ((i10 & 1) == 0 || c3966o.m8584A()) {
                interfaceC7879r2 = C7876o.f37669a;
                z12 = true;
                z13 = true;
            } else {
                c3966o.m8601S();
                interfaceC7879r2 = interfaceC7879r;
                z12 = z10;
                z13 = z11;
            }
            c3966o.m8624q();
            c3966o.m8607Y(-103236853);
            Object obj = C3961j.f20408a;
            if (interfaceC4630l == null) {
                Object objM8596M = c3966o.m8596M();
                if (objM8596M == obj) {
                    objM8596M = i0.m0.m7389v(c3966o);
                }
                interfaceC4630l2 = (InterfaceC4630l) objM8596M;
            } else {
                interfaceC4630l2 = interfaceC4630l;
            }
            c3966o.m8623p(false);
            boolean z16 = z13;
            C6734c c6734cM12902d = AbstractC6740i.m12902d(-1419576100, new g8(d8Var, z6, z12, interfaceC2141e, z13, c6734c), c3966o);
            c3966o.m8607Y(-103210706);
            C6734c c6734cM12902d2 = interfaceC2141e == null ? null : AbstractC6740i.m12902d(1644987592, new h8(d8Var, z6, z12, interfaceC2141e), c3966o);
            c3966o.m8623p(false);
            Object objM8596M2 = c3966o.m8596M();
            if (objM8596M2 == obj) {
                objM8596M2 = new k2.b1(0);
                c3966o.j0(objM8596M2);
            }
            k2.b1 b1Var = (k2.b1) objM8596M2;
            boolean z17 = z12;
            InterfaceC7879r interfaceC7879r4 = interfaceC7879r2;
            d8Var2 = d8Var;
            InterfaceC4630l interfaceC4630l3 = interfaceC4630l2;
            InterfaceC7879r interfaceC7879rMo10364b = o1Var.mo10364b(1.0f, AbstractC0245d.m665b(AbstractC0252b.m697a(interfaceC7879r4, z6, interfaceC4630l3, null, z17, new C1580h(4), interfaceC2137a), DefinitionKt.NO_Float_VALUE, f12006a, 1), true);
            Object objM8596M3 = c3966o.m8596M();
            if (objM8596M3 == obj) {
                objM8596M3 = new C0045d(11, b1Var);
                c3966o.j0(objM8596M3);
            }
            InterfaceC7879r interfaceC7879rM724e = AbstractC0264a.m724e(interfaceC7879rMo10364b, (InterfaceC2139c) objM8596M3);
            t3.j0 j0VarM10361d = AbstractC5256o.m10361d(C7864c.f37646e, true);
            int i15 = c3966o.f20462P;
            k2.i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879rM724e);
            InterfaceC7639k.V0.getClass();
            C7637i c7637i = C7638j.f36921b;
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C3953b.m8521x(C7638j.f36925f, j0VarM10361d, c3966o);
            C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o);
            C7636h c7636h = C7638j.f36926g;
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i15))) {
                AbstractC1452a.m4577x(i15, c3966o, i15, c7636h);
            }
            C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
            k2.h2 h2VarM6799b = AbstractC2774e.m6799b(z6 ? 1.0f : DefinitionKt.NO_Float_VALUE, AbstractC2773d.m6795r(100, 0, null, 6), c3966o, 48, 28);
            long jM10524a = og.a2.m10524a((b1Var.m8526f() - r3.e0(AbstractC3544x.f18918e)) / 2, ((InterfaceC6747c) c3966o.m8618k(w3.k1.f37836h)).mo8435T(f12011f));
            boolean zM8614g = c3966o.m8614g(interfaceC4630l3) | c3966o.m8613f(jM10524a);
            Object objM8596M4 = c3966o.m8596M();
            if (zM8614g || objM8596M4 == obj) {
                objM8596M4 = new h2.g0(interfaceC4630l3, jM10524a);
                c3966o.j0(objM8596M4);
            }
            C6734c c6734cM12902d3 = AbstractC6740i.m12902d(691730997, new C1475f(6, (h2.g0) objM8596M4), c3966o);
            C6734c c6734cM12902d4 = AbstractC6740i.m12902d(-474426875, new C1476g(6, h2VarM6799b, d8Var2), c3966o);
            boolean zM8614g2 = c3966o.m8614g(h2VarM6799b);
            Object objM8596M5 = c3966o.m8596M();
            if (zM8614g2 || objM8596M5 == obj) {
                objM8596M5 = new b2.i0(h2VarM6799b, 2);
                c3966o.j0(objM8596M5);
            }
            m6203c(c6734cM12902d3, c6734cM12902d4, c6734cM12902d, c6734cM12902d2, z16, (InterfaceC2137a) objM8596M5, c3966o, ((i14 >> 9) & 57344) | 438);
            c3966o.m8623p(true);
            c3966o = c3966o;
            interfaceC7879r3 = interfaceC7879r4;
            z14 = z16;
            z15 = z17;
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new f8(o1Var, z6, interfaceC2137a, c6734c, interfaceC7879r3, z15, interfaceC2141e, z14, d8Var2, interfaceC4630l, i10);
        }
    }

    /* renamed from: c */
    public static final void m6203c(C6734c c6734c, C6734c c6734c2, C6734c c6734c3, InterfaceC2141e interfaceC2141e, boolean z6, InterfaceC2137a interfaceC2137a, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        boolean z10;
        InterfaceC2137a interfaceC2137a2;
        boolean z11;
        InterfaceC2141e interfaceC2141e2 = interfaceC2141e;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-1427075886);
        if ((i10 & 6) == 0) {
            i11 = (c3966o.m8616i(c6734c) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c3966o.m8616i(c6734c2) ? 32 : 16;
        }
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            i11 |= c3966o.m8616i(c6734c3) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c3966o.m8616i(interfaceC2141e2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c3966o.m8615h(z6) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c3966o.m8616i(interfaceC2137a) ? 131072 : 65536;
        }
        if ((74899 & i11) == 74898 && c3966o.m8586C()) {
            c3966o.m8601S();
            z10 = z6;
            interfaceC2137a2 = interfaceC2137a;
        } else {
            int i12 = 458752 & i11;
            int i13 = 57344 & i11;
            boolean z12 = ((i11 & 7168) == 2048) | (i12 == 131072) | (i13 == 16384);
            Object objM8596M = c3966o.m8596M();
            k2.s0 s0Var = C3961j.f20408a;
            if (z12 || objM8596M == s0Var) {
                objM8596M = new i8(interfaceC2137a, interfaceC2141e2, z6);
                c3966o.j0(objM8596M);
            }
            t3.j0 j0Var = (t3.j0) objM8596M;
            int i14 = c3966o.f20462P;
            k2.i1 i1VarM8620m = c3966o.m8620m();
            C7876o c7876o = C7876o.f37669a;
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, c7876o);
            InterfaceC7639k.V0.getClass();
            int i15 = i11;
            C7637i c7637i = C7638j.f36921b;
            c3966o.c0();
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
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i14))) {
                AbstractC1452a.m4577x(i14, c3966o, i14, c7636h3);
            }
            C7636h c7636h4 = C7638j.f36923d;
            C3953b.m8521x(c7636h4, interfaceC7879rM14845c, c3966o);
            c6734c.invoke(c3966o, Integer.valueOf(i15 & 14));
            c6734c2.invoke(c3966o, Integer.valueOf((i15 >> 3) & 14));
            InterfaceC7879r interfaceC7879rM722c = AbstractC0264a.m722c(c7876o, "icon");
            C7871j c7871j = C7864c.f37642a;
            t3.j0 j0VarM10361d = AbstractC5256o.m10361d(c7871j, false);
            int i16 = c3966o.f20462P;
            k2.i1 i1VarM8620m2 = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c2 = AbstractC7862a.m14845c(c3966o, interfaceC7879rM722c);
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C3953b.m8521x(c7636h, j0VarM10361d, c3966o);
            C3953b.m8521x(c7636h2, i1VarM8620m2, c3966o);
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i16))) {
                AbstractC1452a.m4577x(i16, c3966o, i16, c7636h3);
            }
            C3953b.m8521x(c7636h4, interfaceC7879rM14845c2, c3966o);
            c6734c3.invoke(c3966o, Integer.valueOf((i15 >> 6) & 14));
            c3966o.m8623p(true);
            c3966o.m8607Y(1087196576);
            if (interfaceC2141e != null) {
                InterfaceC7879r interfaceC7879rM722c2 = AbstractC0264a.m722c(c7876o, AnnotatedPrivateKey.LABEL);
                boolean z13 = (i13 == 16384) | (i12 == 131072);
                Object objM8596M2 = c3966o.m8596M();
                if (z13 || objM8596M2 == s0Var) {
                    z10 = z6;
                    interfaceC2137a2 = interfaceC2137a;
                    objM8596M2 = new g1.m0(1, interfaceC2137a2, z10);
                    c3966o.j0(objM8596M2);
                } else {
                    z10 = z6;
                    interfaceC2137a2 = interfaceC2137a;
                }
                InterfaceC7879r interfaceC7879rM714a = AbstractC0260a.m714a(interfaceC7879rM722c2, (InterfaceC2139c) objM8596M2);
                t3.j0 j0VarM10361d2 = AbstractC5256o.m10361d(c7871j, false);
                int i17 = c3966o.f20462P;
                k2.i1 i1VarM8620m3 = c3966o.m8620m();
                InterfaceC7879r interfaceC7879rM14845c3 = AbstractC7862a.m14845c(c3966o, interfaceC7879rM714a);
                c3966o.c0();
                if (c3966o.f20461O) {
                    c3966o.m8619l(c7637i);
                } else {
                    c3966o.m0();
                }
                C3953b.m8521x(c7636h, j0VarM10361d2, c3966o);
                C3953b.m8521x(c7636h2, i1VarM8620m3, c3966o);
                if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i17))) {
                    AbstractC1452a.m4577x(i17, c3966o, i17, c7636h3);
                }
                C3953b.m8521x(c7636h4, interfaceC7879rM14845c3, c3966o);
                interfaceC2141e2 = interfaceC2141e;
                z11 = true;
                AbstractC1452a.m4576w((i15 >> 9) & 14, interfaceC2141e2, c3966o, true);
            } else {
                interfaceC2141e2 = interfaceC2141e;
                z10 = z6;
                interfaceC2137a2 = interfaceC2137a;
                z11 = true;
            }
            c3966o.m8623p(false);
            c3966o.m8623p(z11);
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new c6(c6734c, c6734c2, c6734c3, interfaceC2141e2, z10, interfaceC2137a2, i10);
        }
    }
}
