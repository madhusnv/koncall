package rp;

import androidx.compose.foundation.AbstractC0237a;
import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.layout.AbstractC0245d;
import androidx.compose.foundation.layout.C0243b;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import aq.C0401d;
import bt.l0;
import c9.AbstractC0911f;
import com.amplifyframework.storage.s3.C1230b;
import com.skydoves.balloon.compose.C1423d;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.R;
import d3.h0;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import g2.p9;
import g2.v1;
import g2.vd;
import g2.xd;
import g2.y1;
import i1.p1;
import i9.C3183a;
import java.util.ArrayList;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.i1;
import k2.s0;
import kotlin.jvm.internal.AbstractC4154l;
import kq.C4182l;
import l7.a0;
import lx.InterfaceC4566e;
import mm.AbstractC4801l;
import nx.AbstractC5178p;
import o1.AbstractC5251j;
import o1.AbstractC5256o;
import o1.AbstractC5260s;
import o1.C5245d;
import o1.C5261t;
import o1.m1;
import o1.n1;
import og.pe;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p020v.a1;
import p1.AbstractC5788a;
import pg.b9;
import pg.f9;
import pg.i0;
import pg.j0;
import ps.C6014n;
import ps.c0;
import qp.C6271h;
import qr.f0;
import r4.C6456k;
import s2.AbstractC6740i;
import s2.C6734c;
import sp.C6883f;
import sq.b1;
import sq.g2;
import uv.AbstractC7548a;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import w1.AbstractC7861e;
import w1.C7860d;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7869h;
import w2.C7871j;
import w2.C7876o;
import w2.InterfaceC7879r;
import wx.w0;
import xd.AbstractC8346q;
import yv.C8791f;
import yv.C8800o;
import zp.C9011k;
import zp.C9012l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rp.a */
/* loaded from: classes3.dex */
public abstract class AbstractC6598a {

    /* renamed from: a */
    public static final C6734c f31707a = new C6734c(new C4182l(22), false, -955170805);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [boolean, int] */
    /* renamed from: a */
    public static final void m12654a(int i10, C9012l c9012l, C9011k c9011k, InterfaceC3962k interfaceC3962k, int i11) {
        int i12;
        C3966o c3966o;
        C7876o c7876o;
        C7636h c7636h;
        C7636h c7636h2;
        C7636h c7636h3;
        float f6;
        ?? r52;
        C7637i c7637i;
        C3966o c3966o2;
        C3966o c3966o3 = (C3966o) interfaceC3962k;
        c3966o3.a0(1735725163);
        if ((i11 & 6) == 0) {
            i12 = (c3966o3.m8612e(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c3966o3.m8616i(c9012l) ? 32 : 16;
        }
        if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i12 |= c3966o3.m8614g(c9011k) ? 256 : 128;
        }
        if (c3966o3.m8598P(i12 & 1, (i12 & 147) != 146)) {
            float f10 = 20;
            C7876o c7876o2 = C7876o.f37669a;
            InterfaceC7879r interfaceC7879rM658l = AbstractC0242a.m658l(c7876o2, f10, DefinitionKt.NO_Float_VALUE, 2);
            C5261t c5261tM10367a = AbstractC5260s.m10367a(AbstractC5251j.f25759c, C7864c.f37655p, c3966o3, 48);
            int i13 = c3966o3.f20462P;
            i1 i1VarM8620m = c3966o3.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o3, interfaceC7879rM658l);
            InterfaceC7639k.V0.getClass();
            C7637i c7637i2 = C7638j.f36921b;
            c3966o3.c0();
            if (c3966o3.f20461O) {
                c3966o3.m8619l(c7637i2);
            } else {
                c3966o3.m0();
            }
            C7636h c7636h4 = C7638j.f36925f;
            C3953b.m8521x(c7636h4, c5261tM10367a, c3966o3);
            C7636h c7636h5 = C7638j.f36924e;
            C3953b.m8521x(c7636h5, i1VarM8620m, c3966o3);
            C7636h c7636h6 = C7638j.f36926g;
            if (c3966o3.f20461O || !AbstractC4154l.m8918a(c3966o3.m8596M(), Integer.valueOf(i13))) {
                AbstractC1452a.m4577x(i13, c3966o3, i13, c7636h6);
            }
            C7636h c7636h7 = C7638j.f36923d;
            C3953b.m8521x(c7636h7, interfaceC7879rM14845c, c3966o3);
            if (i10 > pe.m10832g(c9012l.m16475a()) || i10 == 0) {
                c7876o = c7876o2;
                c7636h = c7636h4;
                c7636h2 = c7636h5;
                c7636h3 = c7636h6;
                C3966o c3966o4 = c3966o3;
                f6 = DefinitionKt.NO_Float_VALUE;
                r52 = 0;
                c7637i = c7637i2;
                c3966o4.m8607Y(813883009);
                c3966o2 = c3966o4;
            } else {
                c3966o3.m8607Y(821703503);
                long j6 = ((v1) c3966o3.m8618k(y1.f13286a)).f12928A;
                c7876o = c7876o2;
                f6 = DefinitionKt.NO_Float_VALUE;
                c7636h2 = c7636h5;
                c7636h3 = c7636h6;
                c7636h = c7636h4;
                C3966o c3966o5 = c3966o3;
                c7637i = c7637i2;
                p9.m6245i(AbstractC0245d.m668e(c7876o2, 1.0f), 1, j6, c3966o5, 54, 0);
                r52 = 0;
                c3966o2 = c3966o5;
            }
            c3966o2.m8623p(r52);
            float f11 = 15;
            InterfaceC7879r interfaceC7879rM658l2 = AbstractC0242a.m658l(c7876o, f6, f11, 1);
            n1 n1VarM10357a = m1.m10357a(AbstractC5251j.f25757a, C7864c.f37651k, c3966o2, r52);
            int i14 = c3966o2.f20462P;
            i1 i1VarM8620m2 = c3966o2.m8620m();
            InterfaceC7879r interfaceC7879rM14845c2 = AbstractC7862a.m14845c(c3966o2, interfaceC7879rM658l2);
            c3966o2.c0();
            if (c3966o2.f20461O) {
                c3966o2.m8619l(c7637i);
            } else {
                c3966o2.m0();
            }
            C3953b.m8521x(c7636h, n1VarM10357a, c3966o2);
            C3953b.m8521x(c7636h2, i1VarM8620m2, c3966o2);
            if (c3966o2.f20461O || !AbstractC4154l.m8918a(c3966o2.m8596M(), Integer.valueOf(i14))) {
                AbstractC1452a.m4577x(i14, c3966o2, i14, c7636h3);
            }
            C3953b.m8521x(c7636h7, interfaceC7879rM14845c2, c3966o2);
            C3966o c3966o6 = c3966o2;
            i0.m11693a(b9.m11551a(c9011k.f43409c, 0, c3966o2), "", AbstractC0245d.m678o(c7876o, f10), null, null, DefinitionKt.NO_Float_VALUE, null, c3966o6, 432, 120);
            String strM11629c = f9.m11629c(c3966o6, c9011k.f43410d);
            InterfaceC7879r interfaceC7879rM658l3 = AbstractC0242a.m658l(c7876o, f11, f6, 2);
            if (1.0f <= 0.0d) {
                AbstractC5788a.m11338a("invalid weight; must be greater than zero");
            }
            b1.m13113q(strM11629c, AbstractC4801l.m9747u(1.0f, interfaceC7879rM658l3, true), 0L, null, null, 0, 0, 0L, null, null, c3966o6, 0, 1020);
            b1.m13113q(c9011k.f43412f, null, 0L, null, new C6456k(6), 0, 0, 0L, null, null, c3966o6, 0, 1006);
            c3966o = c3966o6;
            c3966o.m8623p(true);
            c3966o.m8623p(true);
        } else {
            c3966o = c3966o3;
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C1423d(i10, c9012l, c9011k, i11, 3);
        }
    }

    /* renamed from: b */
    public static final void m12655b(C6271h c6271h, p1 scrollState, InterfaceC3962k interfaceC3962k, int i10) {
        AbstractC4154l.m8923f(scrollState, "scrollState");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(1557845290);
        int i11 = (c3966o.m8616i(c6271h) ? 4 : 2) | i10 | (c3966o.m8614g(scrollState) ? 32 : 16);
        if (c3966o.m8598P(i11 & 1, (i11 & 19) != 18)) {
            float f6 = 15;
            p9.m6240d(AbstractC0242a.m656j(AbstractC0245d.m668e(j0.m11708c(C7876o.f37669a, scrollState, true, true), 1.0f), f6), AbstractC7861e.m14841b(f6), null, p9.m6254r(8, 62), null, AbstractC6740i.m12902d(1399302172, new l0(18, c6271h), c3966o), c3966o, 196608, 20);
        } else {
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C6014n(c6271h, scrollState, i10, 9);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* renamed from: c */
    public static final void m12656c(C9012l c9012l, InterfaceC3962k interfaceC3962k, int i10) {
        C9012l c9012l2;
        String strValueOf;
        C5245d c5245d;
        C7636h c7636h;
        C7636h c7636h2;
        C7636h c7636h3;
        C7636h c7636h4;
        C7637i c7637i;
        ?? r02;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-113454344);
        int i11 = i10 | (c3966o.m8616i(c9012l) ? 4 : 2);
        if (c3966o.m8598P(i11 & 1, (i11 & 3) != 2)) {
            C7869h c7869h = C7864c.f37655p;
            C7876o c7876o = C7876o.f37669a;
            InterfaceC7879r interfaceC7879rM660n = AbstractC0242a.m660n(AbstractC0245d.m668e(c7876o, 1.0f), DefinitionKt.NO_Float_VALUE, 30, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 13);
            C5245d c5245d2 = AbstractC5251j.f25759c;
            C5261t c5261tM10367a = AbstractC5260s.m10367a(c5245d2, c7869h, c3966o, 48);
            int i12 = c3966o.f20462P;
            i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879rM660n);
            InterfaceC7639k.V0.getClass();
            C7637i c7637i2 = C7638j.f36921b;
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i2);
            } else {
                c3966o.m0();
            }
            C7636h c7636h5 = C7638j.f36925f;
            C3953b.m8521x(c7636h5, c5261tM10367a, c3966o);
            C7636h c7636h6 = C7638j.f36924e;
            C3953b.m8521x(c7636h6, i1VarM8620m, c3966o);
            C7636h c7636h7 = C7638j.f36926g;
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i12))) {
                AbstractC1452a.m4577x(i12, c3966o, i12, c7636h7);
            }
            C7636h c7636h8 = C7638j.f36923d;
            C3953b.m8521x(c7636h8, interfaceC7879rM14845c, c3966o);
            float f6 = 80;
            InterfaceC7879r interfaceC7879rM678o = AbstractC0245d.m678o(c7876o, f6);
            C7860d c7860d = AbstractC7861e.f37635a;
            C7876o c7876o2 = c7876o;
            InterfaceC7879r interfaceC7879rM660n2 = AbstractC0242a.m660n(AbstractC0237a.m633a(interfaceC7879rM678o, ((v1) c3966o.m8618k(y1.f13286a)).f12929B, c7860d), DefinitionKt.NO_Float_VALUE, 2, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 13);
            C7871j c7871j = C7864c.f37646e;
            t3.j0 j0VarM10361d = AbstractC5256o.m10361d(c7871j, false);
            int i13 = c3966o.f20462P;
            i1 i1VarM8620m2 = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c2 = AbstractC7862a.m14845c(c3966o, interfaceC7879rM660n2);
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i2);
            } else {
                c3966o.m0();
            }
            C3953b.m8521x(c7636h5, j0VarM10361d, c3966o);
            C3953b.m8521x(c7636h6, i1VarM8620m2, c3966o);
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i13))) {
                AbstractC1452a.m4577x(i13, c3966o, i13, c7636h7);
            }
            C3953b.m8521x(c7636h8, interfaceC7879rM14845c2, c3966o);
            C8791f c8791f = C8791f.f42457a;
            if (C8791f.m16171d(c9012l.f43416d)) {
                c3966o.m8607Y(-675273552);
                AbstractC8346q.m15524c(c9012l.f43416d, "contact image", AbstractC0245d.m678o(AbstractC0911f.m2617a(c7876o2, c7860d), f6), c3966o);
                c3966o.m8623p(false);
                c7636h = c7636h6;
                c7636h2 = c7636h8;
                c7636h4 = c7636h7;
                c7637i = c7637i2;
                c7636h3 = c7636h5;
                c5245d = c5245d2;
                r02 = 1;
            } else {
                c3966o.m8607Y(-674945758);
                try {
                    strValueOf = String.valueOf(AbstractC5178p.m10094E(c9012l.f43414b));
                } catch (Exception unused) {
                    strValueOf = "";
                }
                c7876o2 = c7876o2;
                c5245d = c5245d2;
                c7636h = c7636h6;
                c7636h2 = c7636h8;
                c7636h3 = c7636h5;
                c7636h4 = c7636h7;
                c7637i = c7637i2;
                r02 = 1;
                b1.m13113q(strValueOf, C0243b.f1966a.mo662a(c7876o2, c7871j), AbstractC7548a.f36329B, null, null, 0, 0, 0L, null, ((vd) c3966o.m8618k(xd.f13268a)).f13045a, c3966o, KyberEngine.KyberPolyBytes, 504);
                c3966o.m8623p(false);
            }
            c3966o.m8623p(r02);
            float f10 = 20;
            C7876o c7876o3 = c7876o2;
            b1.m13113q(c9012l.f43414b, AbstractC0242a.m660n(c7876o2, DefinitionKt.NO_Float_VALUE, f10, DefinitionKt.NO_Float_VALUE, f10, 5), 0L, null, null, 0, 0, 0L, null, ((vd) c3966o.m8618k(xd.f13268a)).f13048d, c3966o, 48, 508);
            AbstractC5256o.m10358a(AbstractC0237a.m633a(AbstractC0245d.m670g(AbstractC0245d.m668e(c7876o3, 1.0f), (float) r02), ((v1) c3966o.m8618k(y1.f13286a)).f12928A, h0.f7748a), c3966o, 0);
            InterfaceC7879r interfaceC7879rM660n3 = AbstractC0242a.m660n(c7876o3, DefinitionKt.NO_Float_VALUE, 15, DefinitionKt.NO_Float_VALUE, f10, 5);
            C5261t c5261tM10367a2 = AbstractC5260s.m10367a(c5245d, C7864c.f37654n, c3966o, 0);
            int i14 = c3966o.f20462P;
            i1 i1VarM8620m3 = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c3 = AbstractC7862a.m14845c(c3966o, interfaceC7879rM660n3);
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C3953b.m8521x(c7636h3, c5261tM10367a2, c3966o);
            C3953b.m8521x(c7636h, i1VarM8620m3, c3966o);
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i14))) {
                AbstractC1452a.m4577x(i14, c3966o, i14, c7636h4);
            }
            C3953b.m8521x(c7636h2, interfaceC7879rM14845c3, c3966o);
            c3966o.m8607Y(745003511);
            ArrayList arrayListM16475a = c9012l.m16475a();
            int size = arrayListM16475a.size();
            int i15 = 0;
            int i16 = 0;
            while (i15 < size) {
                Object obj = arrayListM16475a.get(i15);
                i15++;
                int i17 = i16 + 1;
                if (i16 < 0) {
                    pe.m10842q();
                    throw null;
                }
                m12654a(i16, c9012l, (C9011k) obj, c3966o, (i11 << 3) & 112);
                i16 = i17;
            }
            c9012l2 = c9012l;
            a1.m14320C(c3966o, false, r02, r02);
        } else {
            c9012l2 = c9012l;
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C1230b(c9012l2, i10, 26);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* renamed from: d */
    public static final void m12657d(C6883f viewModel, a0 navController, InterfaceC2137a filterNavigation, InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o;
        int i11;
        ?? r15;
        p1 p1Var;
        C6271h c6271h;
        AbstractC4154l.m8923f(viewModel, "viewModel");
        w0 w0Var = viewModel.f36253c;
        AbstractC4154l.m8923f(navController, "navController");
        AbstractC4154l.m8923f(filterNavigation, "filterNavigation");
        C3966o c3966o2 = (C3966o) interfaceC3962k;
        c3966o2.a0(-225099737);
        int i12 = i10 | (c3966o2.m8616i(viewModel) ? 4 : 2) | (c3966o2.m8616i(navController) ? 32 : 16) | (c3966o2.m8616i(filterNavigation) ? 256 : 128);
        if (c3966o2.m8598P(i12 & 1, (i12 & 147) != 146)) {
            C6271h c6271h2 = (C6271h) C3953b.m8509l(viewModel.f32720o, c3966o2).getValue();
            Object objM8618k = c3966o2.m8618k(AndroidCompositionLocals_androidKt.f2134b);
            boolean zM8616i = c3966o2.m8616i(viewModel) | c3966o2.m8616i(navController);
            Object objM8596M = c3966o2.m8596M();
            s0 s0Var = C3961j.f20408a;
            if (zM8616i || objM8596M == s0Var) {
                objM8596M = new c0(viewModel, navController, null, 15);
                c3966o2.j0(objM8596M);
            }
            C3953b.m8503f((InterfaceC2141e) objM8596M, objM8618k, c3966o2);
            p1 p1VarM11707b = j0.m11707b(c3966o2);
            InterfaceC7879r interfaceC7879rMo14852e = AbstractC0237a.m633a(C7876o.f37669a, ((v1) c3966o2.m8618k(y1.f13286a)).f12967n, h0.f7748a).mo14852e(AbstractC0245d.f1971c);
            C5261t c5261tM10367a = AbstractC5260s.m10367a(AbstractC5251j.f25759c, C7864c.f37654n, c3966o2, 0);
            int i13 = c3966o2.f20462P;
            i1 i1VarM8620m = c3966o2.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o2, interfaceC7879rMo14852e);
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
            String strM11629c = f9.m11629c(c3966o2, R.string.top_caller);
            boolean zM8616i2 = c3966o2.m8616i(navController);
            Object objM8596M2 = c3966o2.m8596M();
            if (zM8616i2 || objM8596M2 == s0Var) {
                objM8596M2 = new C0401d(navController, 28);
                c3966o2.j0(objM8596M2);
            }
            g2.m13157i(null, null, false, strM11629c, 0L, 0, false, f31707a, (InterfaceC2137a) objM8596M2, c3966o2, 12582912, 119);
            C3966o c3966o3 = c3966o2;
            c3966o3.m8605W(-498138680, Boolean.valueOf(c6271h2.f30431f));
            boolean zM8616i3 = c3966o3.m8616i(viewModel);
            Object objM8596M3 = c3966o3.m8596M();
            if (zM8616i3 || objM8596M3 == s0Var) {
                i11 = i12;
                r15 = 0;
                p1Var = p1VarM11707b;
                c6271h = c6271h2;
                C3183a c3183a = new C3183a(1, viewModel, C6883f.class, "onEvent", "onEvent(Lcom/websoptimization/callyzerbiz/ui/filters/model/AllFiltersEvent;)V", 0, 22);
                c3966o3.j0(c3183a);
                objM8596M3 = c3183a;
            } else {
                i11 = i12;
                c6271h = c6271h2;
                p1Var = p1VarM11707b;
                r15 = 0;
            }
            b1.m13099c((InterfaceC2139c) ((InterfaceC4566e) objM8596M3), ((ur.i0) C3953b.m8509l(w0Var, c3966o3).getValue()).f36224a, ((ur.i0) C3953b.m8509l(w0Var, c3966o3).getValue()).f36227d, filterNavigation, false, c3966o3, ((i11 << 3) & 7168) | 24576, 0);
            c3966o3.m8623p(r15);
            C8800o c8800o = C8800o.f42459a;
            b1.m13088R(C8800o.m16189M(C8800o.m16184H(c6271h.f30428c)) + " - " + C8800o.m16189M(C8800o.m16184H(c6271h.f30429d)), c3966o3, r15);
            if (c6271h.f30432g) {
                c3966o3.m8607Y(1738203808);
                b1.m13072B(r15, 3, null, c3966o3, null);
                c3966o3.m8623p(r15);
            } else {
                c3966o3.m8607Y(1738247487);
                m12655b(c6271h, p1Var, c3966o3, r15);
                c3966o3.m8623p(r15);
            }
            c3966o3.m8623p(true);
            c3966o = c3966o3;
        } else {
            C3966o c3966o4 = c3966o2;
            c3966o4.m8601S();
            c3966o = c3966o4;
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new f0(viewModel, navController, filterNavigation, i10, 5);
        }
    }
}
