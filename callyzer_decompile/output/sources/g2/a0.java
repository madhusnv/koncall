package g2;

import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.ui.graphics.AbstractC0260a;
import androidx.compose.ui.layout.AbstractC0264a;
import au.C0444h;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import d3.C1565s;
import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import ex.InterfaceC2142f;
import h1.AbstractC2773d;
import h1.AbstractC2793x;
import h1.C2788s;
import h2.AbstractC2812q;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.C3977z;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import o1.AbstractC5256o;
import o1.InterfaceC5247f;
import o1.InterfaceC5249h;
import org.bouncycastle.i18n.MessageBundle;
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
public abstract class a0 {

    /* renamed from: a */
    public static final float f11125a;

    /* renamed from: b */
    public static final float f11126b;

    static {
        new C2788s(0.8f, DefinitionKt.NO_Float_VALUE, 0.8f, 0.15f);
        float f6 = 4;
        f11125a = f6;
        f11126b = 16 - f6;
    }

    /* renamed from: a */
    public static final void m6110a(InterfaceC7879r interfaceC7879r, C6734c c6734c, g4.o0 o0Var, InterfaceC2141e interfaceC2141e, InterfaceC2142f interfaceC2142f, float f6, o1.v1 v1Var, td tdVar, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        o1.v1 v1Var2;
        C3966o c3966o;
        C3966o c3966o2 = (C3966o) interfaceC3962k;
        c3966o2.a0(-342194911);
        if ((i10 & 6) == 0) {
            i11 = (c3966o2.m8614g(interfaceC7879r) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c3966o2.m8616i(c6734c) ? 32 : 16;
        }
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            i11 |= c3966o2.m8614g(o0Var) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c3966o2.m8615h(false) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c3966o2.m8616i(interfaceC2141e) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c3966o2.m8616i(interfaceC2142f) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c3966o2.m8611d(f6) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            v1Var2 = v1Var;
            i11 |= c3966o2.m8614g(v1Var2) ? 8388608 : 4194304;
        } else {
            v1Var2 = v1Var;
        }
        if ((100663296 & i10) == 0) {
            i11 |= c3966o2.m8614g(tdVar) ? 67108864 : 33554432;
        }
        if ((805306368 & i10) == 0) {
            i11 |= c3966o2.m8614g(null) ? 536870912 : 268435456;
        }
        if ((306783379 & i11) == 306783378 && c3966o2.m8586C()) {
            c3966o2.m8601S();
            c3966o = c3966o2;
        } else {
            if (Float.isNaN(f6) || f6 == Float.POSITIVE_INFINITY) {
                throw new IllegalArgumentException("The expandedHeight is expected to be specified and finite");
            }
            float fMo8435T = ((InterfaceC6747c) c3966o2.m8618k(w3.k1.f37836h)).mo8435T(f6);
            if (fMo8435T < DefinitionKt.NO_Float_VALUE) {
                fMo8435T = 0.0f;
            }
            int i12 = i11 & 1879048192;
            boolean zM8611d = (i12 == 536870912) | c3966o2.m8611d(fMo8435T);
            Object objM8596M = c3966o2.m8596M();
            k2.s0 s0Var = C3961j.f20408a;
            if (zM8611d || objM8596M == s0Var) {
                objM8596M = new w1(0, 21);
                c3966o2.j0(objM8596M);
            }
            C3953b.m8505h((InterfaceC2137a) objM8596M, c3966o2);
            boolean z6 = i12 == 536870912;
            Object objM8596M2 = c3966o2.m8596M();
            if (z6 || objM8596M2 == s0Var) {
                objM8596M2 = C3953b.m8512o(new w1(0, 22));
                c3966o2.j0(objM8596M2);
            }
            k2.h2 h2VarM6085a = g1.b1.m6085a(d3.h0.m5142n(tdVar.f12806a, tdVar.f12807b, AbstractC2793x.f15641c.mo6654c(((Number) ((k2.h2) objM8596M2).getValue()).floatValue())), AbstractC2773d.m6794q(DefinitionKt.NO_Float_VALUE, 400.0f, null, 5), c3966o2, 48);
            C6734c c6734cM12902d = AbstractC6740i.m12902d(1370231018, new C2469w(interfaceC2142f, 0), c3966o2);
            c3966o2.m8607Y(-1193605157);
            c3966o2.m8623p(false);
            c3966o = c3966o2;
            fb.m6164a(interfaceC7879r.mo14852e(C7876o.f37669a), null, ((C1565s) h2VarM6085a.getValue()).f7819a, 0L, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, null, AbstractC6740i.m12902d(-1943739546, new C2467u(v1Var2, f6, tdVar, c6734c, o0Var, interfaceC2141e, c6734cM12902d), c3966o2), c3966o, 12582912, 122);
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C2468v(interfaceC7879r, c6734c, o0Var, interfaceC2141e, interfaceC2142f, f6, v1Var, tdVar, i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m6111b(s2.C6734c r19, w2.InterfaceC7879r r20, ex.InterfaceC2141e r21, ex.InterfaceC2142f r22, float r23, o1.v1 r24, g2.td r25, k2.InterfaceC3962k r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.a0.m6111b(s2.c, w2.r, ex.e, ex.f, float, o1.v1, g2.td, k2.k, int, int):void");
    }

    /* renamed from: c */
    public static final void m6112c(InterfaceC7879r interfaceC7879r, C2466t c2466t, long j6, long j10, long j11, C6734c c6734c, g4.o0 o0Var, InterfaceC5249h interfaceC5249h, InterfaceC5247f interfaceC5247f, InterfaceC2141e interfaceC2141e, C6734c c6734c2, InterfaceC3962k interfaceC3962k, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        C3966o c3966o;
        long j12 = j11;
        C6734c c6734c3 = c6734c2;
        C3966o c3966o2 = (C3966o) interfaceC3962k;
        c3966o2.a0(-742442296);
        if ((i10 & 6) == 0) {
            i12 = (c3966o2.m8614g(interfaceC7879r) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= (i10 & 64) == 0 ? c3966o2.m8614g(c2466t) : c3966o2.m8616i(c2466t) ? 32 : 16;
        }
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            i12 |= c3966o2.m8613f(j6) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= c3966o2.m8613f(j10) ? 2048 : 1024;
        }
        int i16 = i12;
        if ((i10 & 24576) == 0) {
            i13 = i16 | (c3966o2.m8613f(j12) ? 16384 : 8192);
        } else {
            i13 = i16;
        }
        if ((i10 & 196608) == 0) {
            i14 = i13 | (c3966o2.m8616i(c6734c) ? 131072 : 65536);
        } else {
            i14 = i13;
        }
        if ((i10 & 1572864) == 0) {
            i14 |= c3966o2.m8614g(o0Var) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i14 |= c3966o2.m8611d(1.0f) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i14 |= c3966o2.m8614g(interfaceC5249h) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i14 |= c3966o2.m8614g(interfaceC5247f) ? 536870912 : 268435456;
        }
        if ((i11 & 6) == 0) {
            i15 = i11 | (c3966o2.m8612e(0) ? 4 : 2);
        } else {
            i15 = i11;
        }
        if ((i11 & 48) == 0) {
            i15 |= c3966o2.m8615h(false) ? 32 : 16;
        }
        if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i15 |= c3966o2.m8616i(interfaceC2141e) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i15 |= c3966o2.m8616i(c6734c3) ? 2048 : 1024;
        }
        int i17 = i15;
        if ((i14 & 306783379) == 306783378 && (i17 & 1171) == 1170 && c3966o2.m8586C()) {
            c3966o2.m8601S();
            c3966o = c3966o2;
        } else {
            boolean z6 = ((i14 & 112) == 32 || ((i14 & 64) != 0 && c3966o2.m8616i(c2466t))) | ((i14 & 1879048192) == 536870912) | ((i14 & 234881024) == 67108864) | ((i17 & 14) == 4);
            Object objM8596M = c3966o2.m8596M();
            if (z6 || objM8596M == C3961j.f20408a) {
                objM8596M = new C0444h(21, c2466t, interfaceC5247f, interfaceC5249h);
                c3966o2.j0(objM8596M);
            }
            t3.j0 j0Var = (t3.j0) objM8596M;
            int i18 = c3966o2.f20462P;
            k2.i1 i1VarM8620m = c3966o2.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o2, interfaceC7879r);
            InterfaceC7639k.V0.getClass();
            C7637i c7637i = C7638j.f36921b;
            c3966o2.c0();
            if (c3966o2.f20461O) {
                c3966o2.m8619l(c7637i);
            } else {
                c3966o2.m0();
            }
            C7636h c7636h = C7638j.f36925f;
            C3953b.m8521x(c7636h, j0Var, c3966o2);
            C7636h c7636h2 = C7638j.f36924e;
            C3953b.m8521x(c7636h2, i1VarM8620m, c3966o2);
            C7636h c7636h3 = C7638j.f36926g;
            if (c3966o2.f20461O || !AbstractC4154l.m8918a(c3966o2.m8596M(), Integer.valueOf(i18))) {
                AbstractC1452a.m4577x(i18, c3966o2, i18, c7636h3);
            }
            C7636h c7636h4 = C7638j.f36923d;
            C3953b.m8521x(c7636h4, interfaceC7879rM14845c, c3966o2);
            C7876o c7876o = C7876o.f37669a;
            InterfaceC7879r interfaceC7879rM722c = AbstractC0264a.m722c(c7876o, "navigationIcon");
            float f6 = f11125a;
            InterfaceC7879r interfaceC7879rM660n = AbstractC0242a.m660n(interfaceC7879rM722c, f6, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 14);
            C7871j c7871j = C7864c.f37642a;
            t3.j0 j0VarM10361d = AbstractC5256o.m10361d(c7871j, false);
            int i19 = c3966o2.f20462P;
            k2.i1 i1VarM8620m2 = c3966o2.m8620m();
            InterfaceC7879r interfaceC7879rM14845c2 = AbstractC7862a.m14845c(c3966o2, interfaceC7879rM660n);
            c3966o2.c0();
            if (c3966o2.f20461O) {
                c3966o2.m8619l(c7637i);
            } else {
                c3966o2.m0();
            }
            C3953b.m8521x(c7636h, j0VarM10361d, c3966o2);
            C3953b.m8521x(c7636h2, i1VarM8620m2, c3966o2);
            if (c3966o2.f20461O || !AbstractC4154l.m8918a(c3966o2.m8596M(), Integer.valueOf(i19))) {
                AbstractC1452a.m4577x(i19, c3966o2, i19, c7636h3);
            }
            C3953b.m8521x(c7636h4, interfaceC7879rM14845c2, c3966o2);
            C3977z c3977z = k2.f11902a;
            C3953b.m8498a(AbstractC1452a.m4572s(j6, c3977z), interfaceC2141e, c3966o2, ((i17 >> 3) & 112) | 8);
            c3966o2.m8623p(true);
            InterfaceC7879r interfaceC7879rM715b = AbstractC0260a.m715b(AbstractC0242a.m658l(AbstractC0264a.m722c(c7876o, MessageBundle.TITLE_ENTRY), f6, DefinitionKt.NO_Float_VALUE, 2).mo14852e(c7876o), DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 1.0f, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, null, false, 131067);
            t3.j0 j0VarM10361d2 = AbstractC5256o.m10361d(c7871j, false);
            int i20 = c3966o2.f20462P;
            k2.i1 i1VarM8620m3 = c3966o2.m8620m();
            InterfaceC7879r interfaceC7879rM14845c3 = AbstractC7862a.m14845c(c3966o2, interfaceC7879rM715b);
            c3966o2.c0();
            if (c3966o2.f20461O) {
                c3966o2.m8619l(c7637i);
            } else {
                c3966o2.m0();
            }
            C3953b.m8521x(c7636h, j0VarM10361d2, c3966o2);
            C3953b.m8521x(c7636h2, i1VarM8620m3, c3966o2);
            if (c3966o2.f20461O || !AbstractC4154l.m8918a(c3966o2.m8596M(), Integer.valueOf(i20))) {
                AbstractC1452a.m4577x(i20, c3966o2, i20, c7636h3);
            }
            C3953b.m8521x(c7636h4, interfaceC7879rM14845c3, c3966o2);
            int i21 = i14 >> 9;
            AbstractC2812q.m6910b(j10, o0Var, c6734c, c3966o2, (i21 & 14) | ((i14 >> 15) & 112) | (i21 & 896));
            c3966o = c3966o2;
            c3966o.m8623p(true);
            InterfaceC7879r interfaceC7879rM660n2 = AbstractC0242a.m660n(AbstractC0264a.m722c(c7876o, "actionIcons"), DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, f6, DefinitionKt.NO_Float_VALUE, 11);
            t3.j0 j0VarM10361d3 = AbstractC5256o.m10361d(c7871j, false);
            int i22 = c3966o.f20462P;
            k2.i1 i1VarM8620m4 = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c4 = AbstractC7862a.m14845c(c3966o, interfaceC7879rM660n2);
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C3953b.m8521x(c7636h, j0VarM10361d3, c3966o);
            C3953b.m8521x(c7636h2, i1VarM8620m4, c3966o);
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i22))) {
                AbstractC1452a.m4577x(i22, c3966o, i22, c7636h3);
            }
            C3953b.m8521x(c7636h4, interfaceC7879rM14845c4, c3966o);
            j12 = j11;
            c6734c3 = c6734c2;
            C3953b.m8498a(c3977z.mo8541a(new C1565s(j12)), c6734c3, c3966o, 8 | ((i17 >> 6) & 112));
            c3966o.m8623p(true);
            c3966o.m8623p(true);
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C2472z(interfaceC7879r, c2466t, j6, j10, j12, c6734c, o0Var, interfaceC5249h, interfaceC5247f, interfaceC2141e, c6734c3, i10, i11);
        }
    }
}
