package g2;

import a3.C0045d;
import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.ui.layout.AbstractC0264a;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import d3.C1565s;
import e3.AbstractC1927c;
import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import g1.C2423c;
import g1.C2443w;
import h1.AbstractC2773d;
import h1.AbstractC2793x;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import m1.InterfaceC4630l;
import o1.AbstractC5256o;
import og.af;
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
public abstract class rb {

    /* renamed from: a */
    public static final float f12615a;

    /* renamed from: b */
    public static final float f12616b;

    /* renamed from: c */
    public static final float f12617c;

    /* renamed from: d */
    public static final float f12618d;

    /* renamed from: e */
    public static final float f12619e;

    /* renamed from: f */
    public static final long f12620f;

    static {
        float f6 = j2.c0.f18497a;
        f12615a = j2.c0.f18499c;
        f12616b = 72;
        f12617c = 16;
        f12618d = 14;
        f12619e = 6;
        f12620f = af.m10534c(20);
    }

    /* renamed from: a */
    public static final void m6294a(boolean z6, InterfaceC2137a interfaceC2137a, InterfaceC7879r interfaceC7879r, long j6, long j10, InterfaceC4630l interfaceC4630l, C6734c c6734c, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-202735880);
        if ((i10 & 6) == 0) {
            i11 = (c3966o.m8615h(z6) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c3966o.m8616i(interfaceC2137a) ? 32 : 16;
        }
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            i11 |= c3966o.m8614g(interfaceC7879r) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c3966o.m8615h(true) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c3966o.m8613f(j6) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c3966o.m8613f(j10) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c3966o.m8614g(interfaceC4630l) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= c3966o.m8616i(c6734c) ? 8388608 : 4194304;
        }
        int i12 = i11;
        if ((i12 & 4793491) == 4793490 && c3966o.m8586C()) {
            c3966o.m8601S();
        } else {
            c3966o.m8603U();
            if ((i10 & 1) != 0 && !c3966o.m8584A()) {
                c3966o.m8601S();
            }
            c3966o.m8624q();
            int i13 = i12 >> 12;
            c3966o = c3966o;
            m6296c(j6, j10, z6, AbstractC6740i.m12902d(-551896140, new C2443w(interfaceC7879r, z6, interfaceC4630l, q9.m6291c(true, DefinitionKt.NO_Float_VALUE, j6, c3966o, ((i12 >> 6) & 896) | 6, 2), interfaceC2137a, c6734c), c3966o), c3966o, (i13 & 112) | (i13 & 14) | 3072 | ((i12 << 6) & 896));
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new nb(z6, interfaceC2137a, interfaceC7879r, j6, j10, interfaceC4630l, c6734c, i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m6295b(boolean r23, ex.InterfaceC2137a r24, w2.InterfaceC7879r r25, ex.InterfaceC2141e r26, ex.InterfaceC2141e r27, long r28, long r30, m1.InterfaceC4630l r32, k2.InterfaceC3962k r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.rb.m6295b(boolean, ex.a, w2.r, ex.e, ex.e, long, long, m1.l, k2.k, int, int):void");
    }

    /* renamed from: c */
    public static final void m6296c(long j6, long j10, boolean z6, C6734c c6734c, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        long j11;
        int i12;
        boolean z10;
        h1.w1 w1VarM6795r;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(735731848);
        if ((i10 & 6) == 0) {
            i11 = (c3966o.m8613f(j6) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            j11 = j10;
            i11 |= c3966o.m8613f(j11) ? 32 : 16;
        } else {
            j11 = j10;
        }
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            i11 |= c3966o.m8615h(z6) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c3966o.m8616i(c6734c) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 1171) == 1170 && c3966o.m8586C()) {
            c3966o.m8601S();
        } else {
            int i13 = i11 >> 6;
            h1.s1 s1VarM6872e = h1.v1.m6872e(Boolean.valueOf(z6), null, c3966o, i13 & 14, 2);
            k2.e1 e1Var = s1VarM6872e.f15591d;
            boolean zBooleanValue = ((Boolean) e1Var.getValue()).booleanValue();
            c3966o.m8607Y(-1997025499);
            long j12 = zBooleanValue ? j6 : j11;
            c3966o.m8623p(false);
            AbstractC1927c abstractC1927cM5190f = C1565s.m5190f(j12);
            boolean zM8614g = c3966o.m8614g(abstractC1927cM5190f);
            Object objM8596M = c3966o.m8596M();
            if (zM8614g || objM8596M == C3961j.f20408a) {
                C2423c c2423c = C2423c.f10934f;
                C0045d c0045d = new C0045d(7, abstractC1927cM5190f);
                h1.x1 x1Var = h1.y1.f15664a;
                h1.x1 x1Var2 = new h1.x1(c2423c, c0045d);
                c3966o.j0(x1Var2);
                objM8596M = x1Var2;
            }
            h1.x1 x1Var3 = (h1.x1) objM8596M;
            boolean zBooleanValue2 = ((Boolean) s1VarM6872e.f15588a.mo345y()).booleanValue();
            c3966o.m8607Y(-1997025499);
            long j13 = zBooleanValue2 ? j6 : j11;
            c3966o.m8623p(false);
            C1565s c1565s = new C1565s(j13);
            boolean zBooleanValue3 = ((Boolean) e1Var.getValue()).booleanValue();
            c3966o.m8607Y(-1997025499);
            long j14 = zBooleanValue3 ? j6 : j11;
            c3966o.m8623p(false);
            C1565s c1565s2 = new C1565s(j14);
            h1.n1 n1VarM6857f = s1VarM6872e.m6857f();
            c3966o.m8607Y(-899623535);
            if (n1VarM6857f.m6841b(Boolean.FALSE, Boolean.TRUE)) {
                i12 = i13;
                w1VarM6795r = new h1.w1(150, 100, AbstractC2793x.f15642d);
                z10 = false;
            } else {
                i12 = i13;
                z10 = false;
                w1VarM6795r = AbstractC2773d.m6795r(100, 0, AbstractC2793x.f15642d, 2);
            }
            c3966o.m8623p(z10);
            C3953b.m8498a(AbstractC1452a.m4572s(((C1565s) h1.v1.m6870c(s1VarM6872e, c1565s, c1565s2, w1VarM6795r, x1Var3, c3966o, 0).f15544k.getValue()).f7819a, k2.f11902a), c6734c, c3966o, (i12 & 112) | 8);
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new qb(j6, j11, z6, c6734c, i10);
        }
    }

    /* renamed from: d */
    public static final void m6297d(InterfaceC2141e interfaceC2141e, InterfaceC2141e interfaceC2141e2, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        int i12;
        boolean z6;
        C7871j c7871j = C7864c.f37642a;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(514131524);
        if ((i10 & 6) == 0) {
            i11 = i10 | (c3966o.m8616i(interfaceC2141e) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c3966o.m8616i(interfaceC2141e2) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c3966o.m8586C()) {
            c3966o.m8601S();
        } else {
            int i13 = i11 & 14;
            boolean z10 = (i13 == 4) | ((i11 & 112) == 32);
            Object objM8596M = c3966o.m8596M();
            if (z10 || objM8596M == C3961j.f20408a) {
                objM8596M = new pb(0, interfaceC2141e, interfaceC2141e2);
                c3966o.j0(objM8596M);
            }
            t3.j0 j0Var = (t3.j0) objM8596M;
            int i14 = c3966o.f20462P;
            k2.i1 i1VarM8620m = c3966o.m8620m();
            C7876o c7876o = C7876o.f37669a;
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, c7876o);
            InterfaceC7639k.V0.getClass();
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
            c3966o.m8607Y(871566271);
            if (interfaceC2141e != null) {
                i12 = i11;
                InterfaceC7879r interfaceC7879rM658l = AbstractC0242a.m658l(AbstractC0264a.m722c(c7876o, TextBundle.TEXT_ENTRY), f12617c, DefinitionKt.NO_Float_VALUE, 2);
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
                AbstractC1452a.m4576w(i13, interfaceC2141e, c3966o, true);
            } else {
                i12 = i11;
            }
            boolean z11 = false;
            c3966o.m8623p(false);
            c3966o.m8607Y(871570579);
            if (interfaceC2141e2 != null) {
                InterfaceC7879r interfaceC7879rM722c = AbstractC0264a.m722c(c7876o, "icon");
                t3.j0 j0VarM10361d2 = AbstractC5256o.m10361d(c7871j, false);
                int i16 = c3966o.f20462P;
                k2.i1 i1VarM8620m3 = c3966o.m8620m();
                InterfaceC7879r interfaceC7879rM14845c3 = AbstractC7862a.m14845c(c3966o, interfaceC7879rM722c);
                c3966o.c0();
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
                z6 = true;
                AbstractC1452a.m4576w((i12 >> 3) & 14, interfaceC2141e2, c3966o, true);
                z11 = false;
            } else {
                z6 = true;
            }
            c3966o.m8623p(z11);
            c3966o.m8623p(z6);
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new v3(interfaceC2141e, interfaceC2141e2, i10, 2);
        }
    }
}
