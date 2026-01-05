package er;

import android.content.Context;
import androidx.compose.foundation.AbstractC0237a;
import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.layout.AbstractC0245d;
import androidx.compose.foundation.layout.C0243b;
import androidx.compose.ui.layout.AbstractC0264a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import aq.C0398a;
import aq.C0400c;
import aq.C0406i;
import au.C0444h;
import au.C0445i;
import bm.C0696g;
import bm.C0699j;
import bm.C0701l;
import bt.C0761f;
import bt.C0768m;
import bt.d0;
import bt.i0;
import bt.v0;
import bt.w0;
import c9.AbstractC0911f;
import com.amplifyframework.auth.cognito.C1138e;
import com.amplifyframework.storage.s3.C1230b;
import com.google.android.gms.internal.measurement.d4;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.R;
import cv.C1517m;
import d4.AbstractC1586n;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import ex.InterfaceC2142f;
import fr.C2369a;
import g2.k9;
import g2.p9;
import g2.v1;
import g2.vd;
import g2.xd;
import g2.y1;
import g4.o0;
import gr.C2713i;
import java.util.Arrays;
import java.util.List;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.i1;
import k2.i2;
import k2.n1;
import k2.s0;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;
import mm.C4798i;
import nx.AbstractC5178p;
import o1.AbstractC5244c;
import o1.AbstractC5251j;
import o1.AbstractC5256o;
import o1.AbstractC5260s;
import o1.C5246e;
import o1.C5261t;
import o1.h1;
import o1.m1;
import og.nc;
import og.t0;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import p1.AbstractC5788a;
import pg.f9;
import q1.C6097y;
import qw.a0;
import r4.C6456k;
import s2.AbstractC6740i;
import s2.C6734c;
import s4.InterfaceC6747c;
import sq.b1;
import sq.g2;
import t3.c1;
import t3.j0;
import uv.AbstractC7548a;
import uw.InterfaceC7559c;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import w1.AbstractC7861e;
import w1.C7860d;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7869h;
import w2.C7870i;
import w2.C7871j;
import w2.C7876o;
import w2.InterfaceC7879r;
import w3.k1;
import xd.AbstractC8346q;
import y4.C8547h;
import y4.C8552m;
import yv.C8791f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: er.a */
/* loaded from: classes3.dex */
public abstract class AbstractC2101a {

    /* renamed from: a */
    public static final C6734c f9853a = new C6734c(new C0398a(9), false, -876653614);

    /* renamed from: a */
    public static final void m5807a(int i10, InterfaceC2137a interfaceC2137a, InterfaceC3962k interfaceC3962k, int i11) {
        int i12;
        InterfaceC2137a interfaceC2137a2;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(767944446);
        int i13 = (c3966o.m8612e(i10) ? 4 : 2) | i11 | (c3966o.m8616i(interfaceC2137a) ? 32 : 16);
        if (c3966o.m8598P(i13 & 1, (i13 & 19) != 18)) {
            interfaceC2137a2 = interfaceC2137a;
            i12 = i10;
            b1.m13082L(i12, null, AbstractC0242a.m658l(AbstractC0245d.f1971c, 9, DefinitionKt.NO_Float_VALUE, 2), interfaceC2137a2, c3966o, (i13 & 14) | KyberEngine.KyberPolyBytes | ((i13 << 9) & 57344));
        } else {
            i12 = i10;
            interfaceC2137a2 = interfaceC2137a;
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0761f(i12, i11, 2, interfaceC2137a2);
        }
    }

    /* renamed from: b */
    public static final void m5808b(final String str, final int i10, String str2, InterfaceC2141e interfaceC2141e, InterfaceC2142f interfaceC2142f, final InterfaceC2139c interfaceC2139c, InterfaceC3962k interfaceC3962k, int i11) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-502600050);
        int i12 = i11 | (c3966o.m8614g(str) ? 4 : 2) | (c3966o.m8612e(i10) ? 32 : 16) | (c3966o.m8614g(str2) ? 256 : 128) | (c3966o.m8616i(interfaceC2141e) ? NewHope.SENDB_BYTES : 1024) | (c3966o.m8616i(interfaceC2142f) ? 16384 : 8192) | (c3966o.m8616i(interfaceC2139c) ? 131072 : 65536);
        if (c3966o.m8598P(i12 & 1, (74899 & i12) != 74898)) {
            C7870i c7870i = C7864c.f37652l;
            C5246e c5246e = AbstractC5251j.f25763g;
            InterfaceC7879r interfaceC7879rM668e = AbstractC0245d.m668e(AbstractC0242a.m660n(C7876o.f37669a, 70, DefinitionKt.NO_Float_VALUE, 5, DefinitionKt.NO_Float_VALUE, 10), 1.0f);
            o1.n1 n1VarM10357a = m1.m10357a(c5246e, c7870i, c3966o, 54);
            int i13 = c3966o.f20462P;
            i1 i1VarM8620m = c3966o.m8620m();
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
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i13))) {
                AbstractC1452a.m4577x(i13, c3966o, i13, c7636h);
            }
            C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
            int i14 = 458752 & i12;
            int i15 = i12 & 112;
            int i16 = i12 & 14;
            boolean z6 = (i14 == 131072) | (i15 == 32) | (i16 == 4);
            Object objM8596M = c3966o.m8596M();
            s0 s0Var = C3961j.f20408a;
            if (z6 || objM8596M == s0Var) {
                final int i17 = 0;
                objM8596M = new InterfaceC2137a() { // from class: er.n
                    @Override // ex.InterfaceC2137a
                    public final Object invoke() {
                        switch (i17) {
                            case 0:
                                interfaceC2139c.invoke(new C2103c(AbstractC5601a.m11232c(i10, "+", str)));
                                break;
                            default:
                                interfaceC2139c.invoke(new C2108h(AbstractC5601a.m11232c(i10, "+", str)));
                                break;
                        }
                        return a0.f30746a;
                    }
                };
                c3966o.j0(objM8596M);
            }
            m5807a(R.drawable.ic_copy, (InterfaceC2137a) objM8596M, c3966o, 0);
            boolean z10 = (i14 == 131072) | (i15 == 32) | (i16 == 4);
            Object objM8596M2 = c3966o.m8596M();
            if (z10 || objM8596M2 == s0Var) {
                final int i18 = 1;
                objM8596M2 = new InterfaceC2137a() { // from class: er.n
                    @Override // ex.InterfaceC2137a
                    public final Object invoke() {
                        switch (i18) {
                            case 0:
                                interfaceC2139c.invoke(new C2103c(AbstractC5601a.m11232c(i10, "+", str)));
                                break;
                            default:
                                interfaceC2139c.invoke(new C2108h(AbstractC5601a.m11232c(i10, "+", str)));
                                break;
                        }
                        return a0.f30746a;
                    }
                };
                c3966o.j0(objM8596M2);
            }
            m5807a(R.drawable.ic_messanger, (InterfaceC2137a) objM8596M2, c3966o, 0);
            boolean z11 = ((57344 & i12) == 16384) | (i15 == 32) | (i16 == 4) | ((i12 & 896) == 256);
            Object objM8596M3 = c3966o.m8596M();
            if (z11 || objM8596M3 == s0Var) {
                objM8596M3 = new v0(interfaceC2142f, i10, str, str2);
                c3966o.j0(objM8596M3);
            }
            m5807a(R.drawable.ic_wp, (InterfaceC2137a) objM8596M3, c3966o, 0);
            boolean z12 = (i15 == 32) | ((i12 & 7168) == 2048) | (i16 == 4);
            Object objM8596M4 = c3966o.m8596M();
            if (z12 || objM8596M4 == s0Var) {
                objM8596M4 = new w0(interfaceC2141e, i10, str, 3);
                c3966o.j0(objM8596M4);
            }
            m5807a(R.drawable.ic_call, (InterfaceC2137a) objM8596M4, c3966o, 0);
            c3966o.m8623p(true);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C2113m(str, i10, str2, interfaceC2141e, interfaceC2142f, interfaceC2139c, i11);
        }
    }

    /* renamed from: c */
    public static final void m5809c(C4798i c4798i, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        C7876o c7876o;
        C7636h c7636h;
        int i12;
        C7636h c7636h2;
        C7636h c7636h3;
        C7636h c7636h4;
        C7637i c7637i;
        C4798i c4798i2 = c4798i;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-847925660);
        int i13 = i10 | (c3966o.m8616i(c4798i2) ? 4 : 2);
        if (c3966o.m8598P(i13 & 1, (i13 & 3) != 2)) {
            C7870i c7870i = C7864c.f37652l;
            float f6 = 10;
            C7876o c7876o2 = C7876o.f37669a;
            InterfaceC7879r interfaceC7879rM658l = AbstractC0242a.m658l(c7876o2, f6, DefinitionKt.NO_Float_VALUE, 2);
            o1.n1 n1VarM10357a = m1.m10357a(AbstractC5251j.f25757a, c7870i, c3966o, 48);
            int i14 = c3966o.f20462P;
            i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879rM658l);
            InterfaceC7639k.V0.getClass();
            C7637i c7637i2 = C7638j.f36921b;
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i2);
            } else {
                c3966o.m0();
            }
            C7636h c7636h5 = C7638j.f36925f;
            C3953b.m8521x(c7636h5, n1VarM10357a, c3966o);
            C7636h c7636h6 = C7638j.f36924e;
            C3953b.m8521x(c7636h6, i1VarM8620m, c3966o);
            C7636h c7636h7 = C7638j.f36926g;
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i14))) {
                AbstractC1452a.m4577x(i14, c3966o, i14, c7636h7);
            }
            C7636h c7636h8 = C7638j.f36923d;
            C3953b.m8521x(c7636h8, interfaceC7879rM14845c, c3966o);
            InterfaceC7879r interfaceC7879rM678o = AbstractC0245d.m678o(c7876o2, 45);
            C7860d c7860d = AbstractC7861e.f37635a;
            InterfaceC7879r interfaceC7879rM656j = AbstractC0242a.m656j(AbstractC0237a.m633a(interfaceC7879rM678o, ((v1) c3966o.m8618k(y1.f13286a)).f12929B, c7860d), 2);
            C7871j c7871j = C7864c.f37646e;
            j0 j0VarM10361d = AbstractC5256o.m10361d(c7871j, false);
            int i15 = c3966o.f20462P;
            i1 i1VarM8620m2 = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c2 = AbstractC7862a.m14845c(c3966o, interfaceC7879rM656j);
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i2);
            } else {
                c3966o.m0();
            }
            C3953b.m8521x(c7636h5, j0VarM10361d, c3966o);
            C3953b.m8521x(c7636h6, i1VarM8620m2, c3966o);
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i15))) {
                AbstractC1452a.m4577x(i15, c3966o, i15, c7636h7);
            }
            C3953b.m8521x(c7636h8, interfaceC7879rM14845c2, c3966o);
            C8791f c8791f = C8791f.f42457a;
            if (C8791f.m16171d(c4798i2.f23880e)) {
                c3966o.m8607Y(382615706);
                AbstractC8346q.m15524c(c4798i2.f23880e, "contact image", AbstractC0245d.m678o(AbstractC0911f.m2617a(c7876o2, c7860d), 51), c3966o);
                c3966o.m8623p(false);
                c7636h3 = c7636h6;
                c7636h2 = c7636h8;
                i12 = 0;
                c7876o = c7876o2;
                c7636h4 = c7636h7;
                c7637i = c7637i2;
                c7636h = c7636h5;
            } else {
                c3966o.m8607Y(382947375);
                c7876o = c7876o2;
                c7636h = c7636h5;
                i12 = 0;
                c7636h2 = c7636h8;
                c7636h3 = c7636h6;
                c7636h4 = c7636h7;
                c7637i = c7637i2;
                b1.m13113q(String.valueOf(AbstractC5178p.m10094E(c4798i2.f23877b)), C0243b.f1966a.mo662a(c7876o2, c7871j), AbstractC7548a.f36329B, null, null, 0, 0, 0L, null, ((vd) c3966o.m8618k(xd.f13268a)).f13054j, c3966o, KyberEngine.KyberPolyBytes, 504);
                c3966o.m8623p(false);
            }
            c3966o.m8623p(true);
            InterfaceC7879r interfaceC7879rM660n = AbstractC0242a.m660n(c7876o, f6, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 14);
            if (1.0f <= 0.0d) {
                AbstractC5788a.m11338a("invalid weight; must be greater than zero");
            }
            InterfaceC7879r interfaceC7879rM9747u = AbstractC4801l.m9747u(1.0f, interfaceC7879rM660n, true);
            C5261t c5261tM10367a = AbstractC5260s.m10367a(AbstractC5251j.f25759c, C7864c.f37654n, c3966o, i12);
            int i16 = c3966o.f20462P;
            i1 i1VarM8620m3 = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c3 = AbstractC7862a.m14845c(c3966o, interfaceC7879rM9747u);
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C3953b.m8521x(c7636h, c5261tM10367a, c3966o);
            C3953b.m8521x(c7636h3, i1VarM8620m3, c3966o);
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i16))) {
                AbstractC1452a.m4577x(i16, c3966o, i16, c7636h4);
            }
            C3953b.m8521x(c7636h2, interfaceC7879rM14845c3, c3966o);
            c4798i2 = c4798i;
            String str = c4798i2.f23877b;
            i2 i2Var = xd.f13268a;
            b1.m13113q(str, c7876o, 0L, null, null, 0, 0, 0L, null, ((vd) c3966o.m8618k(i2Var)).f13050f, c3966o, 48, 508);
            String strM11232c = AbstractC5601a.m11232c(c4798i2.f23879d, "+", c4798i2.f23878c);
            InterfaceC7879r interfaceC7879rM660n2 = AbstractC0242a.m660n(c7876o, DefinitionKt.NO_Float_VALUE, 5, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 13);
            o0 o0Var = ((vd) c3966o.m8618k(i2Var)).f13056l;
            i11 = 5;
            b1.m13113q(strM11232c, interfaceC7879rM660n2, 0L, null, new C6456k(5), 2, 1, 0L, null, o0Var, c3966o, 1769520, 396);
            c3966o.m8623p(true);
            b1.m13113q(t0.m10919b(R.string.total_calls, Arrays.copyOf(new Object[]{Integer.valueOf(c4798i2.f23876a)}, 1), c3966o), null, 0L, null, null, 0, 0, 0L, null, null, c3966o, 0, 1022);
            c3966o.m8623p(true);
        } else {
            i11 = 5;
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C1230b(c4798i2, i10, i11);
        }
    }

    /* renamed from: d */
    public static final void m5810d(C4798i frequentCalls, InterfaceC2141e callConfirmationAction, InterfaceC2142f whatsAppAction, InterfaceC2139c cardAction, l7.a0 navController, InterfaceC3962k interfaceC3962k, int i10) {
        AbstractC4154l.m8923f(frequentCalls, "frequentCalls");
        AbstractC4154l.m8923f(callConfirmationAction, "callConfirmationAction");
        AbstractC4154l.m8923f(whatsAppAction, "whatsAppAction");
        AbstractC4154l.m8923f(cardAction, "cardAction");
        AbstractC4154l.m8923f(navController, "navController");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(93492823);
        int i11 = (c3966o.m8616i(frequentCalls) ? 4 : 2) | i10;
        if ((i10 & 48) == 0) {
            i11 |= c3966o.m8616i(callConfirmationAction) ? 32 : 16;
        }
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            i11 |= c3966o.m8616i(whatsAppAction) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c3966o.m8616i(cardAction) ? NewHope.SENDB_BYTES : 1024;
        }
        int i12 = i11 | (c3966o.m8616i(navController) ? 16384 : 8192);
        if (c3966o.m8598P(i12 & 1, (i12 & 9363) != 9362)) {
            InterfaceC7879r interfaceC7879rM668e = AbstractC0245d.m668e(AbstractC0242a.m656j(C7876o.f37669a, 10), 1.0f);
            boolean zM8616i = c3966o.m8616i(navController) | c3966o.m8616i(frequentCalls);
            Object objM8596M = c3966o.m8596M();
            if (zM8616i || objM8596M == C3961j.f20408a) {
                objM8596M = new i0(11, navController, frequentCalls);
                c3966o.j0(objM8596M);
            }
            p9.m6240d(AbstractC0237a.m637e(interfaceC7879rM668e, false, null, null, (InterfaceC2137a) objM8596M, 7), AbstractC7861e.m14841b(15), null, p9.m6254r(8, 62), null, AbstractC6740i.m12902d(-1989459675, new C0768m(frequentCalls, callConfirmationAction, whatsAppAction, cardAction, 4), c3966o), c3966o, 196608, 20);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C2113m(frequentCalls, callConfirmationAction, whatsAppAction, cardAction, navController, i10, 0);
        }
    }

    /* renamed from: e */
    public static final void m5811e(C6097y lazyListState, C2369a state, InterfaceC2141e callConfirmationAction, InterfaceC2142f whatsAppAction, InterfaceC2139c cardAction, l7.a0 navController, InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o;
        AbstractC4154l.m8923f(lazyListState, "lazyListState");
        AbstractC4154l.m8923f(state, "state");
        AbstractC4154l.m8923f(callConfirmationAction, "callConfirmationAction");
        AbstractC4154l.m8923f(whatsAppAction, "whatsAppAction");
        AbstractC4154l.m8923f(cardAction, "cardAction");
        AbstractC4154l.m8923f(navController, "navController");
        C3966o c3966o2 = (C3966o) interfaceC3962k;
        c3966o2.a0(905889538);
        int i11 = i10 | (c3966o2.m8614g(lazyListState) ? 4 : 2) | (c3966o2.m8616i(state) ? 32 : 16) | (c3966o2.m8616i(cardAction) ? 16384 : 8192) | (c3966o2.m8616i(navController) ? 131072 : 65536);
        if (c3966o2.m8598P(i11 & 1, (74899 & i11) != 74898)) {
            List list = state.f10771a;
            C7869h c7869h = C7864c.f37655p;
            o1.i1 i1VarM649c = AbstractC0242a.m649c(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 85, 7);
            InterfaceC7879r interfaceC7879rM10330o = AbstractC5244c.m10330o(AbstractC0264a.m722c(C7876o.f37669a, "contactList"));
            boolean zM8616i = c3966o2.m8616i(list) | ((57344 & i11) == 16384) | c3966o2.m8616i(navController) | c3966o2.m8616i(state);
            Object objM8596M = c3966o2.m8596M();
            if (zM8616i || objM8596M == C3961j.f20408a) {
                C1138e c1138e = new C1138e(list, state, callConfirmationAction, whatsAppAction, cardAction, navController, 3);
                c3966o2.j0(c1138e);
                objM8596M = c1138e;
            }
            c3966o = c3966o2;
            nc.m10775b(interfaceC7879rM10330o, lazyListState, i1VarM649c, null, c7869h, null, false, null, (InterfaceC2139c) objM8596M, c3966o, ((i11 << 3) & 112) | 196992, 472);
        } else {
            c3966o = c3966o2;
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new d0(lazyListState, state, callConfirmationAction, whatsAppAction, cardAction, navController, i10, 2);
        }
    }

    /* renamed from: f */
    public static final void m5812f(C2713i contactsViewModel, C6097y lazyListState, l7.a0 navController, h1 innerPadding, InterfaceC3962k interfaceC3962k, int i10) {
        Object obj;
        k2.w0 w0Var;
        int i11;
        Object obj2;
        k2.w0 w0Var2;
        a0 a0Var;
        k2.w0 w0Var3;
        boolean z6;
        int i12;
        boolean z10;
        boolean z11;
        Object c2115o;
        k2.w0 w0Var4;
        InterfaceC2137a interfaceC2137a;
        AbstractC4154l.m8923f(contactsViewModel, "contactsViewModel");
        AbstractC4154l.m8923f(lazyListState, "lazyListState");
        AbstractC4154l.m8923f(navController, "navController");
        AbstractC4154l.m8923f(innerPadding, "innerPadding");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(63964995);
        int i13 = i10 | (c3966o.m8616i(contactsViewModel) ? 4 : 2) | (c3966o.m8614g(lazyListState) ? 32 : 16) | (c3966o.m8616i(navController) ? 256 : 128) | (c3966o.m8614g(innerPadding) ? NewHope.SENDB_BYTES : 1024);
        if (c3966o.m8598P(i13 & 1, (i13 & 1171) != 1170)) {
            String str = (String) C3953b.m8509l(contactsViewModel.f15138m, c3966o).getValue();
            C2369a c2369a = (C2369a) C3953b.m8509l(contactsViewModel.f15136k, c3966o).getValue();
            Object obj3 = (Context) c3966o.m8618k(AndroidCompositionLocals_androidKt.f2134b);
            Object objM8596M = c3966o.m8596M();
            Object obj4 = C3961j.f20408a;
            if (objM8596M == obj4) {
                objM8596M = C3953b.m8517t(Boolean.FALSE);
                c3966o.j0(objM8596M);
            }
            k2.w0 w0Var5 = (k2.w0) objM8596M;
            Object objM8596M2 = c3966o.m8596M();
            if (objM8596M2 == obj4) {
                objM8596M2 = C3953b.m8517t(Boolean.FALSE);
                c3966o.j0(objM8596M2);
            }
            k2.w0 w0Var6 = (k2.w0) objM8596M2;
            Object objM8596M3 = c3966o.m8596M();
            if (objM8596M3 == obj4) {
                objM8596M3 = C3953b.m8517t("");
                c3966o.j0(objM8596M3);
            }
            k2.w0 w0Var7 = (k2.w0) objM8596M3;
            Object objM8596M4 = c3966o.m8596M();
            if (objM8596M4 == obj4) {
                objM8596M4 = C3953b.m8517t("");
                c3966o.j0(objM8596M4);
            }
            k2.w0 w0Var8 = (k2.w0) objM8596M4;
            Object objM8596M5 = c3966o.m8596M();
            if (objM8596M5 == obj4) {
                objM8596M5 = C3953b.m8517t("");
                c3966o.j0(objM8596M5);
            }
            k2.w0 w0Var9 = (k2.w0) objM8596M5;
            Object objM8596M6 = c3966o.m8596M();
            if (objM8596M6 == obj4) {
                Object c2112l = new C2112l(w0Var7, w0Var9, w0Var8, w0Var6, 0);
                c3966o.j0(c2112l);
                w0Var = w0Var9;
                obj = c2112l;
            } else {
                obj = objM8596M6;
                w0Var = w0Var9;
            }
            InterfaceC2142f interfaceC2142f = (InterfaceC2142f) obj;
            Object objM8596M7 = c3966o.m8596M();
            if (objM8596M7 == obj4) {
                i11 = i13;
                objM8596M7 = new C0701l(w0Var7, w0Var, w0Var5, 1);
                c3966o.j0(objM8596M7);
            } else {
                i11 = i13;
            }
            InterfaceC2141e interfaceC2141e = (InterfaceC2141e) objM8596M7;
            int i14 = i11 & 112;
            boolean zM8616i = c3966o.m8616i(contactsViewModel) | (i14 == 32);
            Object objM8596M8 = c3966o.m8596M();
            k2.w0 w0Var10 = w0Var;
            InterfaceC7559c interfaceC7559c = null;
            if (zM8616i || objM8596M8 == obj4) {
                objM8596M8 = new C2120t(contactsViewModel, lazyListState, (InterfaceC7559c) null);
                c3966o.j0(objM8596M8);
            }
            C3953b.m8503f((InterfaceC2141e) objM8596M8, obj3, c3966o);
            boolean zM8616i2 = (i14 == 32) | c3966o.m8616i(contactsViewModel);
            Object objM8596M9 = c3966o.m8596M();
            if (zM8616i2 || objM8596M9 == obj4) {
                objM8596M9 = new C2120t(lazyListState, contactsViewModel, (InterfaceC7559c) null);
                c3966o.j0(objM8596M9);
            }
            C3953b.m8503f((InterfaceC2141e) objM8596M9, lazyListState, c3966o);
            boolean zM8616i3 = c3966o.m8616i(contactsViewModel) | c3966o.m8616i(navController) | c3966o.m8616i(obj3);
            Object objM8596M10 = c3966o.m8596M();
            if (zM8616i3 || objM8596M10 == obj4) {
                Object c0406i = new C0406i(contactsViewModel, navController, obj3, interfaceC7559c, 13);
                c3966o.j0(c0406i);
                objM8596M10 = c0406i;
            }
            a0 a0Var2 = a0.f30746a;
            C3953b.m8503f((InterfaceC2141e) objM8596M10, a0Var2, c3966o);
            Object objM8596M11 = c3966o.m8596M();
            if (objM8596M11 == obj4) {
                objM8596M11 = new C1517m(5);
                c3966o.j0(objM8596M11);
            }
            Object c8547h = new C8547h((InterfaceC2139c) objM8596M11);
            if (((Boolean) w0Var6.getValue()).booleanValue()) {
                c3966o.m8607Y(-1380628438);
                Object objM8596M12 = c3966o.m8596M();
                if (objM8596M12 == obj4) {
                    objM8596M12 = new C0696g(w0Var6, 12);
                    c3966o.j0(objM8596M12);
                }
                InterfaceC2137a interfaceC2137a2 = (InterfaceC2137a) objM8596M12;
                boolean zM8616i4 = c3966o.m8616i(contactsViewModel);
                Object objM8596M13 = c3966o.m8596M();
                if (zM8616i4 || objM8596M13 == obj4) {
                    objM8596M13 = new C2115o(w0Var6, contactsViewModel, w0Var7, w0Var8);
                    c3966o.j0(objM8596M13);
                }
                InterfaceC2137a interfaceC2137a3 = (InterfaceC2137a) objM8596M13;
                boolean zM8616i5 = c3966o.m8616i(contactsViewModel);
                Object objM8596M14 = c3966o.m8596M();
                if (zM8616i5 || objM8596M14 == obj4) {
                    obj2 = c8547h;
                    w0Var2 = w0Var7;
                    a0Var = a0Var2;
                    i12 = -1388259553;
                    interfaceC2137a = interfaceC2137a2;
                    w0Var3 = w0Var10;
                    Object c2115o2 = new C2115o(contactsViewModel, w0Var3, w0Var2, w0Var6, 1);
                    c3966o.j0(c2115o2);
                    objM8596M14 = c2115o2;
                } else {
                    obj2 = c8547h;
                    w0Var2 = w0Var7;
                    a0Var = a0Var2;
                    interfaceC2137a = interfaceC2137a2;
                    w0Var3 = w0Var10;
                    i12 = -1388259553;
                }
                b1.m13096Z(interfaceC2137a, interfaceC2137a3, (InterfaceC2137a) objM8596M14, c3966o, 6);
                z6 = false;
            } else {
                obj2 = c8547h;
                w0Var2 = w0Var7;
                a0Var = a0Var2;
                w0Var3 = w0Var10;
                z6 = false;
                i12 = -1388259553;
                c3966o.m8607Y(-1388259553);
            }
            c3966o.m8623p(z6);
            if (((Boolean) w0Var5.getValue()).booleanValue()) {
                c3966o.m8607Y(-1380033517);
                boolean zM8616i6 = c3966o.m8616i(contactsViewModel);
                Object objM8596M15 = c3966o.m8596M();
                if (zM8616i6 || objM8596M15 == obj4) {
                    w0Var4 = w0Var5;
                    c2115o = new C2115o(contactsViewModel, w0Var3, w0Var2, w0Var4, 2);
                    c3966o.j0(c2115o);
                } else {
                    c2115o = objM8596M15;
                    w0Var4 = w0Var5;
                }
                InterfaceC2137a interfaceC2137a4 = (InterfaceC2137a) c2115o;
                Object objM8596M16 = c3966o.m8596M();
                if (objM8596M16 == obj4) {
                    objM8596M16 = new C2116p(w0Var2, w0Var4, 0);
                    c3966o.j0(objM8596M16);
                }
                g2.m13165q(interfaceC2137a4, (InterfaceC2137a) objM8596M16, c3966o, 48);
                z10 = false;
            } else {
                z10 = false;
                c3966o.m8607Y(i12);
            }
            c3966o.m8623p(z10);
            C7876o c7876o = C7876o.f37669a;
            InterfaceC7879r interfaceC7879rM660n = AbstractC0242a.m660n(AbstractC0245d.m668e(c7876o, 1.0f), DefinitionKt.NO_Float_VALUE, innerPadding.mo10344d(), DefinitionKt.NO_Float_VALUE, 64, 5);
            c3966o.m8607Y(-1998673515);
            Object objM8596M17 = c3966o.m8596M();
            if (objM8596M17 == obj4) {
                objM8596M17 = AbstractC1452a.m4570q(0L, c3966o);
            }
            Object objM8596M18 = c3966o.m8596M();
            if (objM8596M18 == obj4) {
                objM8596M18 = AbstractC1452a.m4571r(a0Var, s0.f20544c, c3966o);
            }
            k2.w0 w0Var11 = (k2.w0) objM8596M18;
            InterfaceC6747c interfaceC6747c = (InterfaceC6747c) c3966o.m8618k(k1.f37836h);
            Object objM8596M19 = c3966o.m8596M();
            if (objM8596M19 == obj4) {
                objM8596M19 = AbstractC1452a.m4575v(interfaceC6747c, c3966o);
            }
            C8552m c8552m = (C8552m) objM8596M19;
            boolean zM8616i7 = c3966o.m8616i(c8552m) | c3966o.m8614g(obj2) | c3966o.m8612e(257);
            Object objM8596M20 = c3966o.m8596M();
            if (zM8616i7 || objM8596M20 == obj4) {
                objM8596M20 = new C0444h(2, w0Var11, c8552m, obj2);
                c3966o.j0(objM8596M20);
            }
            j0 j0Var = (j0) objM8596M20;
            c8552m.getClass();
            if (Float.isNaN(c8552m.f41518h)) {
                c3966o.m8607Y(-1996827620);
                boolean zM8616i8 = c3966o.m8616i(c8552m);
                Object objM8596M21 = c3966o.m8596M();
                if (zM8616i8 || objM8596M21 == obj4) {
                    objM8596M21 = new C0445i(c8552m, 5);
                    c3966o.j0(objM8596M21);
                }
                z11 = false;
                c1.m13272a(AbstractC1586n.m5204b(interfaceC7879rM660n, false, (InterfaceC2139c) objM8596M21), AbstractC6740i.m12902d(-207512644, new C2119s(w0Var11, str, contactsViewModel, c2369a, lazyListState, interfaceC2141e, interfaceC2142f, navController), c3966o), j0Var, c3966o, 48);
                c3966o.m8623p(false);
            } else {
                c3966o.m8607Y(-1997256040);
                InterfaceC7879r interfaceC7879rM3228b = d4.m3228b(interfaceC7879rM660n, c8552m.f41518h);
                j0 j0VarM10361d = AbstractC5256o.m10361d(C7864c.f37642a, false);
                int i15 = c3966o.f20462P;
                i1 i1VarM8620m = c3966o.m8620m();
                InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, c7876o);
                InterfaceC7639k.V0.getClass();
                InterfaceC2137a interfaceC2137a5 = C7638j.f36921b;
                c3966o.c0();
                if (c3966o.f20461O) {
                    c3966o.m8619l(interfaceC2137a5);
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
                boolean zM8616i9 = c3966o.m8616i(c8552m);
                Object objM8596M22 = c3966o.m8596M();
                if (zM8616i9 || objM8596M22 == obj4) {
                    objM8596M22 = new C0445i(c8552m, 4);
                    c3966o.j0(objM8596M22);
                }
                z11 = false;
                c1.m13272a(AbstractC1586n.m5204b(interfaceC7879rM3228b, false, (InterfaceC2139c) objM8596M22), AbstractC6740i.m12902d(1131308473, new C2118r(str, contactsViewModel, c2369a, lazyListState, interfaceC2141e, interfaceC2142f, navController, 0), c3966o), j0Var, c3966o, 48);
                c3966o.m8623p(true);
                c3966o.m8623p(false);
            }
            c3966o.m8623p(z11);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0699j(i10, 4, contactsViewModel, lazyListState, navController, innerPadding);
        }
    }

    /* renamed from: g */
    public static final void m5813g(InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-331318514);
        if (c3966o.m8598P(i10 & 1, i10 != 0)) {
            InterfaceC7879r interfaceC7879rM722c = AbstractC0264a.m722c(AbstractC0245d.f1971c, "emptyList");
            j0 j0VarM10361d = AbstractC5256o.m10361d(C7864c.f37646e, false);
            int i11 = c3966o.f20462P;
            i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879rM722c);
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
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i11))) {
                AbstractC1452a.m4577x(i11, c3966o, i11, c7636h);
            }
            C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
            b1.m13113q(f9.m11629c(c3966o, R.string.no_contact_found), null, 0L, null, null, 0, 0, 0L, null, ((vd) c3966o.m8618k(xd.f13268a)).f13054j, c3966o, 0, 510);
            c3966o.m8623p(true);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0400c(i10, 24);
        }
    }

    /* renamed from: h */
    public static final void m5814h(InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-1921639490);
        if (c3966o.m8598P(i10 & 1, i10 != 0)) {
            k9.m6197b(AbstractC0242a.m656j(AbstractC0245d.m678o(C7876o.f37669a, 50), 10), ((v1) c3966o.m8618k(y1.f13286a)).f12954a, 3.0f, 0L, 0, c3966o, 390, 24);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0400c(i10, 22);
        }
    }
}
