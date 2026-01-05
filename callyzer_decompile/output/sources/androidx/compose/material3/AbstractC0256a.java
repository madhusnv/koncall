package androidx.compose.material3;

import androidx.compose.foundation.AbstractC0237a;
import androidx.compose.foundation.AbstractC0240d;
import androidx.compose.foundation.layout.AbstractC0245d;
import androidx.compose.foundation.layout.C0243b;
import androidx.compose.foundation.selection.AbstractC0252b;
import com.sun.mail.util.AbstractC1452a;
import d3.l0;
import d4.C1580h;
import ex.InterfaceC2139c;
import g2.ea;
import g2.g6;
import g2.gb;
import g2.hb;
import g2.m9;
import g2.q9;
import h1.InterfaceC2792w;
import h1.w1;
import h1.y0;
import i0.m0;
import j2.k0;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.i1;
import k2.i2;
import k2.n1;
import kotlin.jvm.internal.AbstractC4154l;
import m1.InterfaceC4629k;
import m1.InterfaceC4630l;
import o1.AbstractC5256o;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import pg.c0;
import t3.j0;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7876o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.compose.material3.a */
/* loaded from: classes.dex */
public abstract class AbstractC0256a {

    /* renamed from: a */
    public static final float f2072a;

    /* renamed from: b */
    public static final float f2073b;

    /* renamed from: c */
    public static final float f2074c;

    /* renamed from: d */
    public static final float f2075d;

    /* renamed from: e */
    public static final float f2076e;

    /* renamed from: f */
    public static final y0 f2077f;

    /* renamed from: g */
    public static final w1 f2078g;

    static {
        float f6 = k0.f18644p;
        f2072a = f6;
        f2073b = k0.f18652x;
        f2074c = k0.f18651w;
        float f10 = k0.f18648t;
        f2075d = f10;
        f2076e = (f10 - f6) / 2;
        f2077f = new y0(0);
        f2078g = new w1(100, (InterfaceC2792w) null, 6);
    }

    /* renamed from: a */
    public static final void m702a(boolean z6, InterfaceC2139c interfaceC2139c, InterfaceC7879r interfaceC7879r, boolean z10, gb gbVar, InterfaceC3962k interfaceC3962k, int i10) {
        boolean z11;
        boolean z12;
        InterfaceC7879r interfaceC7879rM698b;
        boolean z13;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(1580463220);
        int i11 = i10 | (c3966o.m8615h(z6) ? 4 : 2) | (c3966o.m8616i(interfaceC2139c) ? 32 : 16) | 27648 | (c3966o.m8614g(gbVar) ? 131072 : 65536) | 1572864;
        if ((599187 & i11) == 599186 && c3966o.m8586C()) {
            c3966o.m8601S();
            z13 = z10;
        } else {
            c3966o.m8603U();
            if ((i10 & 1) == 0 || c3966o.m8584A()) {
                z11 = true;
            } else {
                c3966o.m8601S();
                z11 = z10;
            }
            c3966o.m8624q();
            c3966o.m8607Y(783532531);
            Object objM8596M = c3966o.m8596M();
            if (objM8596M == C3961j.f20408a) {
                objM8596M = m0.m7389v(c3966o);
            }
            InterfaceC4630l interfaceC4630l = (InterfaceC4630l) objM8596M;
            c3966o.m8623p(false);
            if (interfaceC2139c != null) {
                i2 i2Var = g6.f11636a;
                interfaceC7879rM698b = AbstractC0252b.m698b(MinimumInteractiveModifier.f2066a, z6, interfaceC4630l, z11, new C1580h(2), interfaceC2139c);
                interfaceC4630l = interfaceC4630l;
                z12 = z11;
            } else {
                z12 = z11;
                interfaceC7879rM698b = C7876o.f37669a;
            }
            m703b(AbstractC0245d.m675l(AbstractC0245d.m686w(interfaceC7879r.mo14852e(interfaceC7879rM698b), C7864c.f37646e, 2), f2074c, f2075d), z6, z12, gbVar, interfaceC4630l, ea.m6134a(k0.f18641m, c3966o), c3966o, ((i11 << 3) & 112) | KyberEngine.KyberPolyBytes | ((i11 >> 6) & 7168) | 24576);
            z13 = z12;
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new m9(z6, interfaceC2139c, interfaceC7879r, z13, gbVar, i10, 1);
        }
    }

    /* renamed from: b */
    public static final void m703b(InterfaceC7879r interfaceC7879r, boolean z6, boolean z10, gb gbVar, InterfaceC4629k interfaceC4629k, l0 l0Var, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        long j6;
        long j10;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-1594099146);
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
            i11 |= c3966o.m8614g(gbVar) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c3966o.m8616i(null) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c3966o.m8614g(interfaceC4629k) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c3966o.m8614g(l0Var) ? 1048576 : 524288;
        }
        if ((i11 & 599187) == 599186 && c3966o.m8586C()) {
            c3966o.m8601S();
        } else {
            long j11 = z10 ? z6 ? gbVar.f11659b : gbVar.f11663f : z6 ? gbVar.f11667j : gbVar.f11671n;
            long j12 = z10 ? z6 ? gbVar.f11658a : gbVar.f11662e : z6 ? gbVar.f11666i : gbVar.f11670m;
            l0 l0VarM6134a = ea.m6134a(k0.f18650v, c3966o);
            float f6 = k0.f18649u;
            if (z10) {
                j6 = j11;
                j10 = z6 ? gbVar.f11660c : gbVar.f11664g;
            } else {
                j6 = j11;
                j10 = z6 ? gbVar.f11668k : gbVar.f11672o;
            }
            InterfaceC7879r interfaceC7879rM633a = AbstractC0237a.m633a(c0.m11560a(interfaceC7879r, f6, j10, l0VarM6134a), j6, l0VarM6134a);
            j0 j0VarM10361d = AbstractC5256o.m10361d(C7864c.f37642a, false);
            int i12 = c3966o.f20462P;
            i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879rM633a);
            InterfaceC7639k.V0.getClass();
            C7637i c7637i = C7638j.f36921b;
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C7636h c7636h = C7638j.f36925f;
            C3953b.m8521x(c7636h, j0VarM10361d, c3966o);
            C7636h c7636h2 = C7638j.f36924e;
            C3953b.m8521x(c7636h2, i1VarM8620m, c3966o);
            C7636h c7636h3 = C7638j.f36926g;
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i12))) {
                AbstractC1452a.m4577x(i12, c3966o, i12, c7636h3);
            }
            C7636h c7636h4 = C7638j.f36923d;
            C3953b.m8521x(c7636h4, interfaceC7879rM14845c, c3966o);
            InterfaceC7879r interfaceC7879rM633a2 = AbstractC0237a.m633a(AbstractC0240d.m644a(C0243b.f1966a.mo662a(C7876o.f37669a, C7864c.f37645d).mo14852e(new ThumbElement(interfaceC4629k, z6)), interfaceC4629k, q9.m6291c(false, k0.f18647s / 2, 0L, c3966o, 54, 4)), j12, l0Var);
            j0 j0VarM10361d2 = AbstractC5256o.m10361d(C7864c.f37646e, false);
            int i13 = c3966o.f20462P;
            i1 i1VarM8620m2 = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c2 = AbstractC7862a.m14845c(c3966o, interfaceC7879rM633a2);
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C3953b.m8521x(c7636h, j0VarM10361d2, c3966o);
            C3953b.m8521x(c7636h2, i1VarM8620m2, c3966o);
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i13))) {
                AbstractC1452a.m4577x(i13, c3966o, i13, c7636h3);
            }
            C3953b.m8521x(c7636h4, interfaceC7879rM14845c2, c3966o);
            c3966o.m8607Y(1163457794);
            c3966o.m8623p(false);
            c3966o.m8623p(true);
            c3966o.m8623p(true);
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new hb(interfaceC7879r, z6, z10, gbVar, interfaceC4629k, l0Var, i10);
        }
    }
}
