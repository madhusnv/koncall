package g2;

import android.content.res.Configuration;
import androidx.compose.foundation.AbstractC0237a;
import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.layout.AbstractC0245d;
import androidx.compose.material3.ClockDialModifier;
import androidx.compose.material3.MinimumInteractiveModifier;
import androidx.compose.ui.draw.AbstractC0258a;
import androidx.compose.ui.layout.AbstractC0264a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import aq.C0408k;
import b2.C0549g;
import b2.C0563u;
import c3.C0847b;
import c9.C0917l;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.R;
import cp.C1476g;
import d4.AbstractC1586n;
import d4.C1587o;
import e1.AbstractC1909k;
import e1.C1921w;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import g1.C2429i;
import h1.AbstractC2773d;
import h2.AbstractC2812q;
import i1.C3138q;
import java.util.Arrays;
import java.util.Locale;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.C3975x;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import o1.AbstractC5244c;
import o1.AbstractC5251j;
import o1.AbstractC5256o;
import o1.AbstractC5260s;
import o1.C5261t;
import og.hg;
import og.rf;
import org.bouncycastle.asn1.x509.DisplayText;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import r4.C6451f;
import r4.C6454i;
import s2.AbstractC6740i;
import s2.C6734c;
import s4.C6754j;
import s4.EnumC6757m;
import s4.InterfaceC6747c;
import t2.AbstractC7013l;
import tx.InterfaceC7266z;
import uw.C7565i;
import v1.C7623a;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import w1.AbstractC7861e;
import w1.C7858b;
import w1.C7860d;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7871j;
import w2.C7876o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class pd {

    /* renamed from: d */
    public static final float f12445d;

    /* renamed from: e */
    public static final float f12446e;

    /* renamed from: i */
    public static final C1921w f12450i;

    /* renamed from: j */
    public static final C1921w f12451j;

    /* renamed from: k */
    public static final float f12452k;

    /* renamed from: a */
    public static final float f12442a = 101;

    /* renamed from: b */
    public static final float f12443b = 69;

    /* renamed from: c */
    public static final float f12444c = 36;

    /* renamed from: f */
    public static final float f12447f = 74;

    /* renamed from: g */
    public static final float f12448g = 48;

    /* renamed from: h */
    public static final C1921w f12449h = AbstractC1909k.m5580a(0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55);

    static {
        float f6 = 24;
        f12445d = f6;
        f12446e = f6;
        C1921w c1921wM5580a = AbstractC1909k.m5580a(12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        f12450i = c1921wM5580a;
        C1921w c1921w = new C1921w(c1921wM5580a.f9077b);
        int[] iArr = c1921wM5580a.f9076a;
        int i10 = c1921wM5580a.f9077b;
        for (int i11 = 0; i11 < i10; i11++) {
            c1921w.m5651a((iArr[i11] % 12) + 12);
        }
        f12451j = c1921w;
        f12452k = 12;
    }

    /* renamed from: a */
    public static final void m6265a(rd rdVar, vc vcVar, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-934561141);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c3966o.m8614g(rdVar) : c3966o.m8616i(rdVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c3966o.m8614g(vcVar) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c3966o.m8586C()) {
            c3966o.m8601S();
        } else {
            C3953b.m8499b(new k2.m1[]{sc.f12721a.mo8541a(xd.m6341a(j2.n0.f18702x, c3966o)), w3.k1.f37842n.mo8541a(EnumC6757m.Ltr)}, AbstractC6740i.m12902d(-477913269, new C1476g(9, rdVar, vcVar), c3966o), c3966o, 56);
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new zc(rdVar, vcVar, i10, 0);
        }
    }

    /* renamed from: b */
    public static final void m6266b(C2460n c2460n, vc vcVar, boolean z6, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-1170157036);
        if ((i10 & 6) == 0) {
            i11 = (c3966o.m8616i(c2460n) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c3966o.m8614g(vcVar) ? 32 : 16;
        }
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            i11 |= c3966o.m8615h(z6) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c3966o.m8586C()) {
            c3966o.m8601S();
        } else {
            rf.m10881b(c2460n.f12146a.mo6212f() == 1 ? f12449h : f12450i, AbstractC0258a.m709c(AbstractC0245d.m678o(AbstractC0237a.m633a(C7876o.f37669a, vcVar.f13031a, AbstractC7861e.f37635a).mo14852e(new ClockDialModifier(c2460n, z6, c2460n.f12146a.mo6212f())), j2.n0.f18680b), new C0408k(18, c2460n, vcVar)), AbstractC2773d.m6795r(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, 0, null, 6), null, AbstractC6740i.m12902d(-1022006568, new k5(vcVar, c2460n, z6), c3966o), c3966o, 24960, 8);
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0549g(c2460n, vcVar, z6, i10, 2);
        }
    }

    /* renamed from: c */
    public static final void m6267c(rd rdVar, vc vcVar, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        boolean z6;
        boolean z10;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(755539561);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c3966o.m8614g(rdVar) : c3966o.m8616i(rdVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c3966o.m8614g(vcVar) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c3966o.m8586C()) {
            c3966o.m8601S();
        } else {
            C5261t c5261tM10367a = AbstractC5260s.m10367a(AbstractC5251j.f25761e, C7864c.f37654n, c3966o, 6);
            int i12 = c3966o.f20462P;
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
            C3953b.m8521x(c7636h, c5261tM10367a, c3966o);
            C7636h c7636h2 = C7638j.f36924e;
            C3953b.m8521x(c7636h2, i1VarM8620m, c3966o);
            C7636h c7636h3 = C7638j.f36926g;
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i12))) {
                AbstractC1452a.m4577x(i12, c3966o, i12, c7636h3);
            }
            C7636h c7636h4 = C7638j.f36923d;
            C3953b.m8521x(c7636h4, interfaceC7879rM14845c, c3966o);
            m6265a(rdVar, vcVar, c3966o, i11 & 126);
            c3966o.m8607Y(919638492);
            if (rdVar.mo6213g()) {
                z6 = true;
                z10 = false;
            } else {
                int i13 = i11;
                z10 = false;
                InterfaceC7879r interfaceC7879rM660n = AbstractC0242a.m660n(c7876o, DefinitionKt.NO_Float_VALUE, f12452k, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 13);
                t3.j0 j0VarM10361d = AbstractC5256o.m10361d(C7864c.f37642a, false);
                int i14 = c3966o.f20462P;
                k2.i1 i1VarM8620m2 = c3966o.m8620m();
                InterfaceC7879r interfaceC7879rM14845c2 = AbstractC7862a.m14845c(c3966o, interfaceC7879rM660n);
                c3966o.c0();
                if (c3966o.f20461O) {
                    c3966o.m8619l(c7637i);
                } else {
                    c3966o.m0();
                }
                C3953b.m8521x(c7636h, j0VarM10361d, c3966o);
                C3953b.m8521x(c7636h2, i1VarM8620m2, c3966o);
                if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i14))) {
                    AbstractC1452a.m4577x(i14, c3966o, i14, c7636h3);
                }
                C3953b.m8521x(c7636h4, interfaceC7879rM14845c2, c3966o);
                int i15 = i13 << 3;
                m6268d(AbstractC0245d.m679p(c7876o, j2.n0.f18691m, j2.n0.f18690l), rdVar, vcVar, c3966o, (i15 & 896) | (i15 & 112) | 6);
                z6 = true;
                c3966o.m8623p(true);
            }
            c3966o.m8623p(z10);
            c3966o.m8623p(z6);
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new zc(rdVar, vcVar, i10, 1);
        }
    }

    /* renamed from: d */
    public static final void m6268d(InterfaceC7879r interfaceC7879r, rd rdVar, vc vcVar, InterfaceC3962k interfaceC3962k, int i10) {
        InterfaceC7879r interfaceC7879r2;
        int i11;
        vc vcVar2;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(1261215927);
        if ((i10 & 6) == 0) {
            interfaceC7879r2 = interfaceC7879r;
            i11 = (c3966o.m8614g(interfaceC7879r2) ? 4 : 2) | i10;
        } else {
            interfaceC7879r2 = interfaceC7879r;
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? c3966o.m8614g(rdVar) : c3966o.m8616i(rdVar) ? 32 : 16;
        }
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            vcVar2 = vcVar;
            i11 |= c3966o.m8614g(vcVar2) ? 256 : 128;
        } else {
            vcVar2 = vcVar;
        }
        if ((i11 & 147) == 146 && c3966o.m8586C()) {
            c3966o.m8601S();
        } else {
            Object objM8596M = c3966o.m8596M();
            if (objM8596M == C3961j.f20408a) {
                objM8596M = k1.f11899c;
                c3966o.j0(objM8596M);
            }
            d3.l0 l0VarM6134a = ea.m6134a(j2.n0.f18689k, c3966o);
            AbstractC4154l.m8921d(l0VarM6134a, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            C7860d c7860d = (C7860d) l0VarM6134a;
            float f6 = (float) 0.0d;
            m6270f(interfaceC7879r2, rdVar, vcVar2, (t3.j0) objM8596M, C7860d.m14839a(c7860d, null, new C7858b(f6), new C7858b(f6), null, 9), C7860d.m14839a(c7860d, new C7858b(f6), null, null, new C7858b(f6), 6), c3966o, (i11 & 896) | (i11 & 14) | 3072 | (i11 & 112));
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new fd(interfaceC7879r, rdVar, vcVar, i10, 0);
        }
    }

    /* renamed from: e */
    public static final void m6269e(C2460n c2460n, InterfaceC7879r interfaceC7879r, vc vcVar, boolean z6, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        InterfaceC7879r interfaceC7879r2;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(1432307537);
        if ((i10 & 6) == 0) {
            i11 = (c3966o.m8616i(c2460n) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c3966o.m8614g(interfaceC7879r) ? 32 : 16;
        }
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            i11 |= c3966o.m8614g(vcVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c3966o.m8615h(z6) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 1171) == 1170 && c3966o.m8586C()) {
            c3966o.m8601S();
            interfaceC7879r2 = interfaceC7879r;
        } else {
            c3966o.m8603U();
            if ((i10 & 1) != 0 && !c3966o.m8584A()) {
                c3966o.m8601S();
            }
            c3966o.m8624q();
            interfaceC7879r2 = interfaceC7879r;
            InterfaceC7879r interfaceC7879rM660n = AbstractC0242a.m660n(interfaceC7879r2, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, f12445d, 7);
            o1.n1 n1VarM10357a = o1.m1.m10357a(AbstractC5251j.f25757a, C7864c.f37652l, c3966o, 48);
            int i12 = c3966o.f20462P;
            k2.i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879rM660n);
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
            int i13 = i11 & 14;
            int i14 = i11 >> 3;
            int i15 = i13 | (i14 & 112);
            m6267c(c2460n, vcVar, c3966o, i15);
            AbstractC5244c.m10322f(c3966o, AbstractC0245d.m682s(C7876o.f37669a, f12444c));
            m6266b(c2460n, vcVar, z6, c3966o, i15 | (i14 & 896));
            c3966o.m8623p(true);
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new hd(c2460n, interfaceC7879r2, vcVar, z6, i10, 0);
        }
    }

    /* renamed from: f */
    public static final void m6270f(InterfaceC7879r interfaceC7879r, rd rdVar, vc vcVar, t3.j0 j0Var, C7860d c7860d, C7860d c7860d2, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        C7860d c7860d3;
        long j6 = vcVar.f13034d;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(1374241901);
        if ((i10 & 6) == 0) {
            i11 = (c3966o.m8614g(interfaceC7879r) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? c3966o.m8614g(rdVar) : c3966o.m8616i(rdVar) ? 32 : 16;
        }
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            i11 |= c3966o.m8614g(vcVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c3966o.m8614g(j0Var) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i10 & 24576) == 0) {
            c7860d3 = c7860d;
            i11 |= c3966o.m8614g(c7860d3) ? 16384 : 8192;
        } else {
            c7860d3 = c7860d;
        }
        if ((196608 & i10) == 0) {
            i11 |= c3966o.m8614g(c7860d2) ? 131072 : 65536;
        }
        int i12 = i11;
        if ((74899 & i12) == 74898 && c3966o.m8586C()) {
            c3966o.m8601S();
        } else {
            C3138q c3138qM11579a = pg.d0.m11579a(j2.n0.f18693o, j6);
            d3.l0 l0VarM6134a = ea.m6134a(j2.n0.f18689k, c3966o);
            AbstractC4154l.m8921d(l0VarM6134a, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            C7860d c7860d4 = (C7860d) l0VarM6134a;
            String strM6916h = AbstractC2812q.m6916h(c3966o, R.string.m3c_time_picker_period_toggle_description);
            boolean zM8614g = c3966o.m8614g(strM6916h);
            Object objM8596M = c3966o.m8596M();
            Object obj = C3961j.f20408a;
            if (zM8614g || objM8596M == obj) {
                objM8596M = new C1587o(strM6916h, 12);
                c3966o.j0(objM8596M);
            }
            InterfaceC7879r interfaceC7879rM11561b = pg.c0.m11561b(AbstractC1586n.m5204b(AbstractC1586n.m5204b(interfaceC7879r, false, (InterfaceC2139c) objM8596M), false, C7623a.f36779a), c3138qM11579a.f16961a, c3138qM11579a.f16962b, c7860d4);
            int i13 = c3966o.f20462P;
            k2.i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879rM11561b);
            InterfaceC7639k.V0.getClass();
            InterfaceC2137a interfaceC2137a = C7638j.f36921b;
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(interfaceC2137a);
            } else {
                c3966o.m0();
            }
            C3953b.m8521x(C7638j.f36925f, j0Var, c3966o);
            C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o);
            C7636h c7636h = C7638j.f36926g;
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i13))) {
                AbstractC1452a.m4577x(i13, c3966o, i13, c7636h);
            }
            C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
            boolean z6 = !rdVar.mo6215i();
            int i14 = i12 & 112;
            boolean z10 = i14 == 32 || ((i12 & 64) != 0 && c3966o.m8616i(rdVar));
            Object objM8596M2 = c3966o.m8596M();
            if (z10 || objM8596M2 == obj) {
                objM8596M2 = new id(rdVar, 0);
                c3966o.j0(objM8596M2);
            }
            int i15 = (i12 << 3) & 7168;
            m6272h(z6, c7860d3, (InterfaceC2137a) objM8596M2, vcVar, j2.f11844a, c3966o, ((i12 >> 9) & 112) | 24576 | i15);
            AbstractC5244c.m10322f(c3966o, AbstractC0237a.m633a(AbstractC7862a.m14846d(AbstractC0264a.m722c(C7876o.f37669a, "Spacer"), 2.0f).mo14852e(AbstractC0245d.f1971c), j6, d3.h0.f7748a));
            boolean zMo6215i = rdVar.mo6215i();
            boolean z11 = i14 == 32 || ((i12 & 64) != 0 && c3966o.m8616i(rdVar));
            Object objM8596M3 = c3966o.m8596M();
            if (z11 || objM8596M3 == obj) {
                objM8596M3 = new id(rdVar, 1);
                c3966o.j0(objM8596M3);
            }
            m6272h(zMo6215i, c7860d2, (InterfaceC2137a) objM8596M3, vcVar, j2.f11845b, c3966o, ((i12 >> 12) & 112) | 24576 | i15);
            c3966o.m8623p(true);
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C2429i(interfaceC7879r, rdVar, vcVar, j0Var, c7860d, c7860d2, i10);
        }
    }

    /* renamed from: g */
    public static final void m6271g(rd rdVar, InterfaceC7879r interfaceC7879r, vc vcVar, int i10, InterfaceC3962k interfaceC3962k, int i11) {
        int i12;
        int i13;
        int i14;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-619286452);
        int i15 = i11 | (c3966o.m8614g(rdVar) ? 4 : 2) | (c3966o.m8614g(interfaceC7879r) ? 32 : 16) | (c3966o.m8614g(vcVar) ? 256 : 128) | 1024;
        if ((i15 & 1171) == 1170 && c3966o.m8586C()) {
            c3966o.m8601S();
            i14 = i10;
        } else {
            c3966o.m8603U();
            if ((i11 & 1) == 0 || c3966o.m8584A()) {
                Configuration configuration = (Configuration) c3966o.m8618k(AndroidCompositionLocals_androidKt.f2133a);
                int i16 = configuration.screenHeightDp < configuration.screenWidthDp ? 0 : 1;
                i12 = i15 & (-7169);
                i13 = i16;
            } else {
                c3966o.m8601S();
                i12 = i15 & (-7169);
                i13 = i10;
            }
            c3966o.m8624q();
            h2.c0 c0VarM6917i = AbstractC2812q.m6917i(c3966o);
            boolean z6 = (i12 & 14) == 4;
            Object objM8596M = c3966o.m8596M();
            if (z6 || objM8596M == C3961j.f20408a) {
                objM8596M = new C2460n(rdVar);
                c3966o.j0(objM8596M);
            }
            C2460n c2460n = (C2460n) objM8596M;
            if (i13 == 1) {
                c3966o.m8607Y(-337235422);
                m6275k(c2460n, interfaceC7879r, vcVar, true ^ ((Boolean) c0VarM6917i.getValue()).booleanValue(), c3966o, i12 & 1008);
                c3966o.m8623p(false);
            } else {
                c3966o.m8607Y(-337036960);
                m6269e(c2460n, interfaceC7879r, vcVar, !((Boolean) c0VarM6917i.getValue()).booleanValue(), c3966o, i12 & 1008);
                c3966o.m8623p(false);
            }
            i14 = i13;
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new fd(rdVar, interfaceC7879r, vcVar, i14, i11);
        }
    }

    /* renamed from: h */
    public static final void m6272h(boolean z6, C7860d c7860d, InterfaceC2137a interfaceC2137a, vc vcVar, C6734c c6734c, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        C7860d c7860d2;
        InterfaceC2137a interfaceC2137a2;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-1937408098);
        if ((i10 & 6) == 0) {
            i11 = (c3966o.m8615h(z6) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            c7860d2 = c7860d;
            i11 |= c3966o.m8614g(c7860d2) ? 32 : 16;
        } else {
            c7860d2 = c7860d;
        }
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            interfaceC2137a2 = interfaceC2137a;
            i11 |= c3966o.m8616i(interfaceC2137a2) ? 256 : 128;
        } else {
            interfaceC2137a2 = interfaceC2137a;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c3966o.m8614g(vcVar) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c3966o.m8616i(c6734c) ? 16384 : 8192;
        }
        if ((i11 & 9363) == 9362 && c3966o.m8586C()) {
            c3966o.m8601S();
        } else {
            long j6 = z6 ? vcVar.f13039i : vcVar.f13040j;
            long j10 = z6 ? vcVar.f13037g : vcVar.f13038h;
            InterfaceC7879r interfaceC7879rMo14852e = AbstractC7862a.m14846d(C7876o.f37669a, z6 ? DefinitionKt.NO_Float_VALUE : 1.0f).mo14852e(AbstractC0245d.f1971c);
            boolean z10 = (i11 & 14) == 4;
            Object objM8596M = c3966o.m8596M();
            if (z10 || objM8596M == C3961j.f20408a) {
                objM8596M = new ld(z6);
                c3966o.j0(objM8596M);
            }
            InterfaceC7879r interfaceC7879rM5204b = AbstractC1586n.m5204b(interfaceC7879rMo14852e, false, (InterfaceC2139c) objM8596M);
            float f6 = 0;
            p9.m6251o(interfaceC2137a2, interfaceC7879rM5204b, false, c7860d2, k0.m6194e(j10, j6, c3966o, 12), new o1.i1(f6, f6, f6, f6), c6734c, c3966o, ((i11 >> 6) & 14) | 12582912 | ((i11 << 6) & 7168) | ((i11 << 15) & 1879048192), 356);
            c3966o = c3966o;
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new g1(z6, c7860d, interfaceC2137a, vcVar, c6734c, i10);
        }
    }

    /* renamed from: i */
    public static final void m6273i(rd rdVar, vc vcVar, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        boolean z6;
        boolean z10;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(2054675515);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c3966o.m8614g(rdVar) : c3966o.m8616i(rdVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c3966o.m8614g(vcVar) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c3966o.m8586C()) {
            c3966o.m8601S();
        } else {
            o1.n1 n1VarM10357a = o1.m1.m10357a(AbstractC5251j.f25761e, C7864c.f37651k, c3966o, 6);
            int i12 = c3966o.f20462P;
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
            C3953b.m8521x(c7636h, n1VarM10357a, c3966o);
            C7636h c7636h2 = C7638j.f36924e;
            C3953b.m8521x(c7636h2, i1VarM8620m, c3966o);
            C7636h c7636h3 = C7638j.f36926g;
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i12))) {
                AbstractC1452a.m4577x(i12, c3966o, i12, c7636h3);
            }
            C7636h c7636h4 = C7638j.f36923d;
            C3953b.m8521x(c7636h4, interfaceC7879rM14845c, c3966o);
            m6265a(rdVar, vcVar, c3966o, i11 & 126);
            c3966o.m8607Y(-709485014);
            if (rdVar.mo6213g()) {
                z6 = true;
                z10 = false;
            } else {
                int i13 = i11;
                z10 = false;
                InterfaceC7879r interfaceC7879rM660n = AbstractC0242a.m660n(c7876o, f12452k, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 14);
                t3.j0 j0VarM10361d = AbstractC5256o.m10361d(C7864c.f37642a, false);
                int i14 = c3966o.f20462P;
                k2.i1 i1VarM8620m2 = c3966o.m8620m();
                InterfaceC7879r interfaceC7879rM14845c2 = AbstractC7862a.m14845c(c3966o, interfaceC7879rM660n);
                c3966o.c0();
                if (c3966o.f20461O) {
                    c3966o.m8619l(c7637i);
                } else {
                    c3966o.m0();
                }
                C3953b.m8521x(c7636h, j0VarM10361d, c3966o);
                C3953b.m8521x(c7636h2, i1VarM8620m2, c3966o);
                if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i14))) {
                    AbstractC1452a.m4577x(i14, c3966o, i14, c7636h3);
                }
                C3953b.m8521x(c7636h4, interfaceC7879rM14845c2, c3966o);
                int i15 = i13 << 3;
                m6274j(AbstractC0245d.m679p(c7876o, j2.n0.f18698t, j2.n0.f18697s), rdVar, vcVar, c3966o, (i15 & 896) | (i15 & 112) | 6);
                z6 = true;
                c3966o.m8623p(true);
            }
            c3966o.m8623p(z10);
            c3966o.m8623p(z6);
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new zc(rdVar, vcVar, i10, 2);
        }
    }

    /* renamed from: j */
    public static final void m6274j(InterfaceC7879r interfaceC7879r, rd rdVar, vc vcVar, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        vc vcVar2;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-1898918107);
        if ((i10 & 6) == 0) {
            i11 = (c3966o.m8614g(interfaceC7879r) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? c3966o.m8614g(rdVar) : c3966o.m8616i(rdVar) ? 32 : 16;
        }
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            vcVar2 = vcVar;
            i11 |= c3966o.m8614g(vcVar2) ? 256 : 128;
        } else {
            vcVar2 = vcVar;
        }
        if ((i11 & 147) == 146 && c3966o.m8586C()) {
            c3966o.m8601S();
        } else {
            Object objM8596M = c3966o.m8596M();
            if (objM8596M == C3961j.f20408a) {
                objM8596M = k1.f11900d;
                c3966o.j0(objM8596M);
            }
            d3.l0 l0VarM6134a = ea.m6134a(j2.n0.f18689k, c3966o);
            AbstractC4154l.m8921d(l0VarM6134a, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            C7860d c7860d = (C7860d) l0VarM6134a;
            float f6 = (float) 0.0d;
            m6270f(interfaceC7879r, rdVar, vcVar2, (t3.j0) objM8596M, ea.m6135b(c7860d), C7860d.m14839a(c7860d, new C7858b(f6), new C7858b(f6), null, null, 12), c3966o, (i11 & 14) | 3072 | (i11 & 112) | (i11 & 896));
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new fd(interfaceC7879r, rdVar, vcVar, i10, 2);
        }
    }

    /* renamed from: k */
    public static final void m6275k(C2460n c2460n, InterfaceC7879r interfaceC7879r, vc vcVar, boolean z6, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(1249591487);
        if ((i10 & 6) == 0) {
            i11 = (c3966o.m8616i(c2460n) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c3966o.m8614g(interfaceC7879r) ? 32 : 16;
        }
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            i11 |= c3966o.m8614g(vcVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c3966o.m8615h(z6) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 1171) == 1170 && c3966o.m8586C()) {
            c3966o.m8601S();
        } else {
            c3966o.m8603U();
            if ((i10 & 1) != 0 && !c3966o.m8584A()) {
                c3966o.m8601S();
            }
            c3966o.m8624q();
            InterfaceC7879r interfaceC7879rM5204b = AbstractC1586n.m5204b(interfaceC7879r, false, md.f12143b);
            C5261t c5261tM10367a = AbstractC5260s.m10367a(AbstractC5251j.f25759c, C7864c.f37655p, c3966o, 48);
            int i12 = c3966o.f20462P;
            k2.i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879rM5204b);
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
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i12))) {
                AbstractC1452a.m4577x(i12, c3966o, i12, c7636h);
            }
            C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
            int i13 = i11 & 14;
            int i14 = i11 >> 3;
            int i15 = i13 | (i14 & 112);
            m6273i(c2460n, vcVar, c3966o, i15);
            float f6 = f12444c;
            C7876o c7876o = C7876o.f37669a;
            AbstractC5244c.m10322f(c3966o, AbstractC0245d.m670g(c7876o, f6));
            m6266b(c2460n, vcVar, z6, c3966o, (i14 & 896) | i15);
            AbstractC5244c.m10322f(c3966o, AbstractC0245d.m670g(c7876o, f12445d));
            c3966o.m8623p(true);
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new hd(c2460n, interfaceC7879r, vcVar, z6, i10, 1);
        }
    }

    /* renamed from: l */
    public static final void m6276l(InterfaceC7879r interfaceC7879r, float f6, C6734c c6734c, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(1548175696);
        if ((i10 & 6) == 0) {
            i11 = (c3966o.m8614g(interfaceC7879r) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c3966o.m8611d(f6) ? 32 : 16;
        }
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            i11 |= c3966o.m8616i(c6734c) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c3966o.m8586C()) {
            c3966o.m8601S();
        } else {
            boolean z6 = (i11 & 112) == 32;
            Object objM8596M = c3966o.m8596M();
            if (z6 || objM8596M == C3961j.f20408a) {
                objM8596M = new xc(f6);
                c3966o.j0(objM8596M);
            }
            t3.j0 j0Var = (t3.j0) objM8596M;
            int i12 = c3966o.f20462P;
            k2.i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879r);
            InterfaceC7639k.V0.getClass();
            C7637i c7637i = C7638j.f36921b;
            int i13 = (((((i11 << 3) & 112) | ((i11 >> 6) & 14)) << 6) & 896) | 6;
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
            c6734c.invoke(c3966o, Integer.valueOf((i13 >> 6) & 14));
            c3966o.m8623p(true);
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new yc(interfaceC7879r, f6, c6734c, i10);
        }
    }

    /* renamed from: m */
    public static final void m6277m(InterfaceC7879r interfaceC7879r, C2460n c2460n, int i10, boolean z6, InterfaceC3962k interfaceC3962k, int i11) {
        int i12;
        String str;
        boolean z10;
        C3966o c3966o;
        C3966o c3966o2 = (C3966o) interfaceC3962k;
        c3966o2.a0(-206784607);
        if ((i11 & 6) == 0) {
            i12 = (c3966o2.m8614g(interfaceC7879r) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c3966o2.m8616i(c2460n) ? 32 : 16;
        }
        if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i12 |= c3966o2.m8612e(i10) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= c3966o2.m8615h(z6) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i12 & 1171) == 1170 && c3966o2.m8586C()) {
            c3966o2.m8601S();
            c3966o = c3966o2;
        } else {
            g4.o0 o0VarM6341a = xd.m6341a(j2.n0.f18681c, c3966o2);
            float fMo8435T = ((InterfaceC6747c) c3966o2.m8618k(w3.k1.f37836h)).mo8435T(f12447f);
            Object objM8596M = c3966o2.m8596M();
            Object obj = C3961j.f20408a;
            if (objM8596M == obj) {
                objM8596M = C3953b.m8517t(new C0847b(0L));
                c3966o2.j0(objM8596M);
            }
            k2.w0 w0Var = (k2.w0) objM8596M;
            Object objM8596M2 = c3966o2.m8596M();
            if (objM8596M2 == obj) {
                objM8596M2 = C3953b.m8517t(new C6754j(0L));
                c3966o2.j0(objM8596M2);
            }
            k2.w0 w0Var2 = (k2.w0) objM8596M2;
            Object objM8596M3 = c3966o2.m8596M();
            if (objM8596M3 == obj) {
                Object c3975x = new C3975x(C3953b.m8510m(C7565i.f36440a, c3966o2));
                c3966o2.j0(c3975x);
                objM8596M3 = c3975x;
            }
            InterfaceC7266z interfaceC7266z = ((C3975x) objM8596M3).f20607a;
            rd rdVar = c2460n.f12146a;
            String strM6283s = m6283s(rdVar.mo6212f(), rdVar.mo6213g(), i10, c3966o2);
            String strM6309a = t0.m6309a(i10, 7);
            boolean zM8918a = rdVar.mo6212f() == 1 ? AbstractC4154l.m8918a(t0.m6309a(rdVar.mo6210d(), 7), strM6309a) : AbstractC4154l.m8918a(t0.m6309a(rdVar.mo6214h(), 7), strM6309a);
            C7871j c7871j = C7864c.f37646e;
            k2.i2 i2Var = g6.f11636a;
            InterfaceC7879r interfaceC7879rM678o = AbstractC0245d.m678o(interfaceC7879r.mo14852e(MinimumInteractiveModifier.f2066a), f12448g);
            Object objM8596M4 = c3966o2.m8596M();
            if (objM8596M4 == obj) {
                objM8596M4 = new C0408k(17, w0Var2, w0Var);
                c3966o2.j0(objM8596M4);
            }
            InterfaceC7879r interfaceC7879rM640h = AbstractC0237a.m640h(AbstractC0264a.m723d(interfaceC7879rM678o, (InterfaceC2139c) objM8596M4), true, null);
            boolean zM8616i = c3966o2.m8616i(interfaceC7266z) | c3966o2.m8616i(c2460n) | c3966o2.m8611d(fMo8435T) | ((i12 & 7168) == 2048) | c3966o2.m8615h(zM8918a);
            Object objM8596M5 = c3966o2.m8596M();
            if (zM8616i || objM8596M5 == obj) {
                str = strM6309a;
                boolean z11 = zM8918a;
                z10 = false;
                Object cdVar = new cd(z11, interfaceC7266z, c2460n, fMo8435T, z6, w0Var, w0Var2);
                c3966o2.j0(cdVar);
                objM8596M5 = cdVar;
            } else {
                str = strM6309a;
                z10 = false;
            }
            InterfaceC7879r interfaceC7879rM5204b = AbstractC1586n.m5204b(interfaceC7879rM640h, true, (InterfaceC2139c) objM8596M5);
            t3.j0 j0VarM10361d = AbstractC5256o.m10361d(c7871j, z10);
            int i13 = c3966o2.f20462P;
            k2.i1 i1VarM8620m = c3966o2.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o2, interfaceC7879rM5204b);
            InterfaceC7639k.V0.getClass();
            InterfaceC2137a interfaceC2137a = C7638j.f36921b;
            c3966o2.c0();
            if (c3966o2.f20461O) {
                c3966o2.m8619l(interfaceC2137a);
            } else {
                c3966o2.m0();
            }
            C3953b.m8521x(C7638j.f36925f, j0VarM10361d, c3966o2);
            C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o2);
            C7636h c7636h = C7638j.f36926g;
            if (c3966o2.f20461O || !AbstractC4154l.m8918a(c3966o2.m8596M(), Integer.valueOf(i13))) {
                AbstractC1452a.m4577x(i13, c3966o2, i13, c7636h);
            }
            C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o2);
            boolean zM8614g = c3966o2.m8614g(strM6283s);
            Object objM8596M6 = c3966o2.m8596M();
            if (zM8614g || objM8596M6 == obj) {
                objM8596M6 = new C1587o(strM6283s, 11);
                c3966o2.j0(objM8596M6);
            }
            sc.m6307b(str, AbstractC1586n.m5203a(C7876o.f37669a, (InterfaceC2139c) objM8596M6), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o0VarM6341a, c3966o2, 0, 0, 65532);
            c3966o = c3966o2;
            c3966o.m8623p(true);
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new dd(interfaceC7879r, c2460n, i10, z6, i11);
        }
    }

    /* renamed from: n */
    public static final void m6278n(InterfaceC7879r interfaceC7879r, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(2100674302);
        if ((i10 & 6) == 0) {
            i11 = (c3966o.m8614g(interfaceC7879r) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && c3966o.m8586C()) {
            c3966o.m8601S();
        } else {
            g4.o0 o0VarM6461a = g4.o0.m6461a((g4.o0) c3966o.m8618k(sc.f12721a), 0L, 0L, null, null, null, 0L, 0L, new C6454i(C6451f.f31107b, 17), 15695871);
            InterfaceC7879r interfaceC7879rM5203a = AbstractC1586n.m5203a(interfaceC7879r, p0.f12352I);
            t3.j0 j0VarM10361d = AbstractC5256o.m10361d(C7864c.f37646e, false);
            int i12 = c3966o.f20462P;
            k2.i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879rM5203a);
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
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i12))) {
                AbstractC1452a.m4577x(i12, c3966o, i12, c7636h);
            }
            C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
            sc.m6307b(":", null, y1.m6345d(j2.m0.f18666a, c3966o), 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o0VarM6461a, c3966o, 6, 0, 65530);
            c3966o = c3966o;
            c3966o.m8623p(true);
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new ed(i10, 0, interfaceC7879r);
        }
    }

    /* renamed from: o */
    public static final void m6279o(InterfaceC7879r interfaceC7879r, int i10, rd rdVar, int i11, vc vcVar, InterfaceC3962k interfaceC3962k, int i12) {
        int i13;
        int i14;
        C3966o c3966o;
        C3966o c3966o2 = (C3966o) interfaceC3962k;
        c3966o2.a0(-1148055889);
        if ((i12 & 6) == 0) {
            i13 = (c3966o2.m8614g(interfaceC7879r) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 = i10;
            i13 |= c3966o2.m8612e(i14) ? 32 : 16;
        } else {
            i14 = i10;
        }
        if ((i12 & KyberEngine.KyberPolyBytes) == 0) {
            i13 |= (i12 & 512) == 0 ? c3966o2.m8614g(rdVar) : c3966o2.m8616i(rdVar) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= c3966o2.m8612e(i11) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i12 & 24576) == 0) {
            i13 |= c3966o2.m8614g(vcVar) ? 16384 : 8192;
        }
        if ((i13 & 9363) == 9362 && c3966o2.m8586C()) {
            c3966o2.m8601S();
            c3966o = c3966o2;
        } else {
            boolean z6 = rdVar.mo6212f() == i11;
            String strM6916h = AbstractC2812q.m6916h(c3966o2, i11 == 0 ? R.string.m3c_time_picker_hour_selection : R.string.m3c_time_picker_minute_selection);
            long j6 = z6 ? vcVar.f13041k : vcVar.f13042l;
            long j10 = z6 ? vcVar.f13043m : vcVar.f13044n;
            boolean zM8614g = c3966o2.m8614g(strM6916h);
            Object objM8596M = c3966o2.m8596M();
            Object obj = C3961j.f20408a;
            if (zM8614g || objM8596M == obj) {
                objM8596M = new C1587o(strM6916h, 13);
                c3966o2.j0(objM8596M);
            }
            InterfaceC7879r interfaceC7879rM5204b = AbstractC1586n.m5204b(interfaceC7879r, true, (InterfaceC2139c) objM8596M);
            d3.l0 l0VarM6134a = ea.m6134a(j2.n0.f18700v, c3966o2);
            boolean z10 = ((i13 & 7168) == 2048) | ((i13 & 896) == 256 || ((i13 & 512) != 0 && c3966o2.m8616i(rdVar)));
            Object objM8596M2 = c3966o2.m8596M();
            if (z10 || objM8596M2 == obj) {
                objM8596M2 = new C0563u(i11, rdVar, 2);
                c3966o2.j0(objM8596M2);
            }
            c3966o = c3966o2;
            fb.m6165b(z6, (InterfaceC2137a) objM8596M2, interfaceC7879rM5204b, false, l0VarM6134a, j6, 0L, DefinitionKt.NO_Float_VALUE, null, null, AbstractC6740i.m12902d(-1477282471, new jd(i11, rdVar, i14, j10), c3966o2), c3966o, 0, 1992);
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new kd(interfaceC7879r, i10, rdVar, i11, vcVar, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m6280p(g2.C2460n r12, float r13, float r14, float r15, boolean r16, long r17, ww.AbstractC8193c r19) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.pd.m6280p(g2.n, float, float, float, boolean, long, ww.c):java.lang.Object");
    }

    /* renamed from: q */
    public static final long m6281q(C2460n c2460n) {
        float f6 = 2;
        float f10 = j2.n0.f18685g / f6;
        rd rdVar = c2460n.f12146a;
        float fCos = ((float) Math.cos(((Number) c2460n.f12149d.m6775d()).floatValue())) * ((((rdVar.mo6213g() && rdVar.mo6215i() && rdVar.mo6212f() == 0) ? f12443b : f12442a) - f10) + f10);
        float f11 = j2.n0.f18680b / f6;
        return (Float.floatToRawIntBits(fCos + f11) << 32) | (Float.floatToRawIntBits((r2 * ((float) Math.sin(((Number) c2460n.f12149d.m6775d()).floatValue()))) + f11) & 4294967295L);
    }

    /* renamed from: r */
    public static final void m6282r(rd rdVar, float f6, float f10, float f11, long j6) {
        if (rdVar.mo6212f() == 0 && rdVar.mo6213g()) {
            rdVar.mo6207a(((float) Math.hypot((double) (((float) ((int) (j6 >> 32))) - f6), (double) (((float) ((int) (j6 & 4294967295L))) - f10))) < f11);
        }
    }

    /* renamed from: s */
    public static final String m6283s(int i10, boolean z6, int i11, InterfaceC3962k interfaceC3962k) {
        int i12 = i10 == 1 ? R.string.m3c_time_picker_minute_suffix : z6 ? R.string.m3c_time_picker_hour_24h_suffix : R.string.m3c_time_picker_hour_suffix;
        Object[] objArr = {Integer.valueOf(i11)};
        String strM6916h = AbstractC2812q.m6916h(interfaceC3962k, i12);
        Locale locale = ((Configuration) ((C3966o) interfaceC3962k).m8618k(AndroidCompositionLocals_androidKt.f2133a)).getLocales().get(0);
        if (locale == null) {
            locale = Locale.getDefault();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 1);
        return String.format(locale, strM6916h, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    /* renamed from: t */
    public static final sd m6284t(int i10, int i11, InterfaceC3962k interfaceC3962k) {
        Object[] objArr = new Object[0];
        a2 a2Var = a2.f11135I;
        md mdVar = md.f12144c;
        C0917l c0917l = AbstractC7013l.f33949a;
        C0917l c0917l2 = new C0917l(16, a2Var, mdVar);
        boolean zM8612e = ((C3966o) interfaceC3962k).m8612e(i10) | ((C3966o) interfaceC3962k).m8612e(i11);
        C3966o c3966o = (C3966o) interfaceC3962k;
        Object objM8596M = c3966o.m8596M();
        if (zM8612e || objM8596M == C3961j.f20408a) {
            objM8596M = new od(i10, i11);
            c3966o.j0(objM8596M);
        }
        return (sd) hg.m10691b(objArr, c0917l2, (InterfaceC2137a) objM8596M, c3966o, 0, 4);
    }
}
