package xt;

import android.content.Context;
import androidx.compose.foundation.AbstractC0237a;
import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.layout.AbstractC0245d;
import androidx.compose.foundation.layout.C0243b;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.draw.AbstractC0258a;
import androidx.compose.ui.graphics.AbstractC0260a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.viewinterop.AbstractC0265a;
import androidx.fragment.app.d1;
import au.C0437a;
import au.C0439c;
import bt.C0768m;
import bt.C0769n;
import bt.d0;
import bt.p0;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.imap.IMAPStore;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.R;
import cv.C1506b;
import d3.C1565s;
import d3.h0;
import d3.k0;
import d7.InterfaceC1637j;
import d7.InterfaceC1649u;
import d7.c1;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import f3.C2196b;
import f3.C2201g;
import f3.C2202h;
import f3.InterfaceC2198d;
import fw.C2392f;
import g2.AbstractC2465s;
import g2.p9;
import g2.t6;
import g2.u9;
import g2.v1;
import g2.vd;
import g2.xd;
import g4.C2489e;
import g4.C2492h;
import g4.g0;
import g4.o0;
import g7.C2536a;
import gc.C2557a;
import h7.AbstractC2868a;
import java.util.List;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.h2;
import k2.i1;
import k2.i2;
import k2.l1;
import k2.n1;
import k2.s0;
import k2.w0;
import k4.AbstractC3988i;
import k4.C3994o;
import k4.C3995p;
import k4.C3998s;
import kotlin.jvm.internal.AbstractC4154l;
import mv.C4888b;
import n4.C4953b;
import o1.AbstractC5251j;
import o1.AbstractC5256o;
import o1.AbstractC5260s;
import o1.C5261t;
import o1.m1;
import og.af;
import og.je;
import og.nc;
import og.r0;
import og.t0;
import op.C5433b;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import ot.C5738f;
import p005f.C2162k;
import p1.AbstractC5788a;
import pg.AbstractC5928i;
import pg.e0;
import pg.f9;
import pg.i0;
import pg.r6;
import pg.r9;
import ps.C6021u;
import qr.f0;
import qw.a0;
import r4.C6446a;
import r4.C6456k;
import r4.C6457l;
import r4.C6462q;
import s2.AbstractC6740i;
import s2.C6734c;
import s4.InterfaceC6747c;
import sq.b1;
import sq.g2;
import sq.n2;
import sq.y1;
import t3.j0;
import tp.C7188i;
import ub.C7393i;
import uv.AbstractC7554g;
import uw.InterfaceC7559c;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import vr.C7734b;
import vs.C7759a;
import vs.C7765g;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7869h;
import w2.C7871j;
import w2.C7876o;
import w2.InterfaceC7879r;
import w3.k1;
import wr.C8146b;
import wr.C8147c;
import wt.C8183a;
import wt.C8184b;
import xm.h3;
import xm.s1;
import yt.C8770b;
import yt.C8774f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xt.a */
/* loaded from: classes3.dex */
public abstract class AbstractC8450a {

    /* renamed from: a */
    public static final C6734c f41228a = new C6734c(new C7734b(18), false, -1606905880);

    /* renamed from: b */
    public static final C6734c f41229b = new C6734c(new C7759a(11), false, -1471940791);

    /* renamed from: c */
    public static final C6734c f41230c = new C6734c(new C7734b(19), false, -203217945);

    /* renamed from: a */
    public static final void m15754a(InterfaceC2139c onPermissionResult, InterfaceC3962k interfaceC3962k, int i10) {
        InterfaceC2139c interfaceC2139c;
        AbstractC4154l.m8923f(onPermissionResult, "onPermissionResult");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(1715851743);
        if (c3966o.m8598P(i10 & 1, (i10 & 3) != 2)) {
            Context context = (Context) c3966o.m8618k(AndroidCompositionLocals_androidKt.f2134b);
            d1 d1Var = new d1(5);
            Object objM8596M = c3966o.m8596M();
            s0 s0Var = C3961j.f20408a;
            if (objM8596M == s0Var) {
                objM8596M = new C8146b(9, onPermissionResult);
                c3966o.j0(objM8596M);
            }
            C2162k c2162kM10719c = je.m10719c(d1Var, (InterfaceC2139c) objM8596M, c3966o, 0);
            boolean zM8616i = c3966o.m8616i(context) | c3966o.m8616i(c2162kM10719c);
            Object objM8596M2 = c3966o.m8596M();
            if (zM8616i || objM8596M2 == s0Var) {
                interfaceC2139c = onPermissionResult;
                C5738f c5738f = new C5738f(context, interfaceC2139c, c2162kM10719c, null, 1);
                c3966o.j0(c5738f);
                objM8596M2 = c5738f;
            } else {
                interfaceC2139c = onPermissionResult;
            }
            C3953b.m8503f((InterfaceC2141e) objM8596M2, a0.f30746a, c3966o);
        } else {
            interfaceC2139c = onPermissionResult;
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C2557a(i10, 10, interfaceC2139c);
        }
    }

    /* renamed from: b */
    public static final void m15755b(C8183a extensionData, InterfaceC2139c onDisConnect, InterfaceC2141e onEdit, InterfaceC3962k interfaceC3962k, int i10) {
        C7636h c7636h;
        w0 w0Var;
        AbstractC4154l.m8923f(extensionData, "extensionData");
        AbstractC4154l.m8923f(onDisConnect, "onDisConnect");
        AbstractC4154l.m8923f(onEdit, "onEdit");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(435605454);
        int i11 = i10 | (c3966o.m8614g(extensionData) ? 4 : 2) | (c3966o.m8616i(onDisConnect) ? 32 : 16) | (c3966o.m8616i(onEdit) ? 256 : 128);
        if (c3966o.m8598P(i11 & 1, (i11 & 147) != 146)) {
            C7876o c7876o = C7876o.f37669a;
            float f6 = 12;
            InterfaceC7879r interfaceC7879rM656j = AbstractC0242a.m656j(AbstractC0245d.m668e(c7876o, 1.0f), f6);
            o1.n1 n1VarM10357a = m1.m10357a(AbstractC5251j.f25757a, C7864c.f37652l, c3966o, 48);
            int i12 = c3966o.f20462P;
            i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879rM656j);
            InterfaceC7639k.V0.getClass();
            C7637i c7637i = C7638j.f36921b;
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C7636h c7636h2 = C7638j.f36925f;
            C3953b.m8521x(c7636h2, n1VarM10357a, c3966o);
            C7636h c7636h3 = C7638j.f36924e;
            C3953b.m8521x(c7636h3, i1VarM8620m, c3966o);
            C7636h c7636h4 = C7638j.f36926g;
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i12))) {
                AbstractC1452a.m4577x(i12, c3966o, i12, c7636h4);
            }
            C7636h c7636h5 = C7638j.f36923d;
            C3953b.m8521x(c7636h5, interfaceC7879rM14845c, c3966o);
            Object objM8596M = c3966o.m8596M();
            s0 s0Var = C3961j.f20408a;
            if (objM8596M == s0Var) {
                objM8596M = C3953b.m8517t(Boolean.FALSE);
                c3966o.j0(objM8596M);
            }
            w0 w0Var2 = (w0) objM8596M;
            i0.m11693a(r0.m10866b(R.drawable.crom, 0, c3966o), "Chrome Logo", AbstractC0242a.m660n(AbstractC0245d.m678o(c7876o, 50), DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, f6, DefinitionKt.NO_Float_VALUE, 11), null, null, DefinitionKt.NO_Float_VALUE, null, c3966o, 432, 120);
            if (1.0f <= 0.0d) {
                AbstractC5788a.m11338a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C5261t c5261tM10367a = AbstractC5260s.m10367a(AbstractC5251j.f25759c, C7864c.f37654n, c3966o, 0);
            int i13 = c3966o.f20462P;
            i1 i1VarM8620m2 = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c2 = AbstractC7862a.m14845c(c3966o, layoutWeightElement);
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C3953b.m8521x(c7636h2, c5261tM10367a, c3966o);
            C3953b.m8521x(c7636h3, i1VarM8620m2, c3966o);
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i13))) {
                c7636h = c7636h4;
                AbstractC1452a.m4577x(i13, c3966o, i13, c7636h);
            } else {
                c7636h = c7636h4;
            }
            C3953b.m8521x(c7636h5, interfaceC7879rM14845c2, c3966o);
            C7636h c7636h6 = c7636h;
            b1.m13113q(extensionData.f39140b, AbstractC0245d.m668e(c7876o, 1.0f), 0L, null, null, 2, 1, 0L, null, o0.m6461a(t6.m6311b(c3966o).f13054j, 0L, 0L, C3998s.f20698h, null, null, 0L, 0L, null, 16777211), c3966o, 1769520, 412);
            b1.m13113q(extensionData.f39141c, null, 0L, null, null, 0, 0, 0L, null, t6.m6311b(c3966o).f13055k, c3966o, 0, 510);
            c3966o.m8623p(true);
            j0 j0VarM10361d = AbstractC5256o.m10361d(C7864c.f37642a, false);
            int i14 = c3966o.f20462P;
            i1 i1VarM8620m3 = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c3 = AbstractC7862a.m14845c(c3966o, c7876o);
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C3953b.m8521x(c7636h2, j0VarM10361d, c3966o);
            C3953b.m8521x(c7636h3, i1VarM8620m3, c3966o);
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i14))) {
                AbstractC1452a.m4577x(i14, c3966o, i14, c7636h6);
            }
            C3953b.m8521x(c7636h5, interfaceC7879rM14845c3, c3966o);
            Object objM8596M2 = c3966o.m8596M();
            if (objM8596M2 == s0Var) {
                w0Var = w0Var2;
                objM8596M2 = new C8457h(w0Var, 0);
                c3966o.j0(objM8596M2);
            } else {
                w0Var = w0Var2;
            }
            p9.m6246j((InterfaceC2137a) objM8596M2, null, false, null, null, f41230c, c3966o, 196614, 30);
            boolean zBooleanValue = ((Boolean) w0Var.getValue()).booleanValue();
            Object objM8596M3 = c3966o.m8596M();
            if (objM8596M3 == s0Var) {
                objM8596M3 = new C8457h(w0Var, 1);
                c3966o.j0(objM8596M3);
            }
            AbstractC2465s.m6298a(zBooleanValue, (InterfaceC2137a) objM8596M3, AbstractC0237a.m633a(c7876o, AbstractC7554g.m14301b(c3966o).f36392d, h0.f7748a), 0L, null, null, null, 0L, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, AbstractC6740i.m12902d(-2034285793, new C0768m(onDisConnect, extensionData, onEdit, w0Var, 23), c3966o), c3966o, 48, 2040);
            c3966o = c3966o;
            c3966o.m8623p(true);
            c3966o.m8623p(true);
            p9.m6245i(null, DefinitionKt.NO_Float_VALUE, C1565s.m5186b(0.1f, 14, t6.m6310a(c3966o).f12970q), c3966o, 0, 3);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new f0(extensionData, onDisConnect, onEdit, i10, 25);
        }
    }

    /* renamed from: c */
    public static final void m15756c(List chromeActivities, InterfaceC2139c onDisConnect, InterfaceC2141e onEdit, InterfaceC3962k interfaceC3962k, int i10) {
        AbstractC4154l.m8923f(chromeActivities, "chromeActivities");
        AbstractC4154l.m8923f(onDisConnect, "onDisConnect");
        AbstractC4154l.m8923f(onEdit, "onEdit");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(711213300);
        int i11 = i10 | (c3966o.m8616i(chromeActivities) ? 4 : 2) | (c3966o.m8616i(onDisConnect) ? 32 : 16) | (c3966o.m8616i(onEdit) ? 256 : 128);
        if (c3966o.m8598P(i11 & 1, (i11 & 147) != 146)) {
            boolean zM8616i = c3966o.m8616i(chromeActivities) | ((i11 & 112) == 32) | ((i11 & 896) == 256);
            Object objM8596M = c3966o.m8596M();
            if (zM8616i || objM8596M == C3961j.f20408a) {
                objM8596M = new C7765g(6, chromeActivities, onDisConnect, onEdit);
                c3966o.j0(objM8596M);
            }
            nc.m10775b(null, null, null, null, null, null, false, null, (InterfaceC2139c) objM8596M, c3966o, 0, 511);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new f0(chromeActivities, onDisConnect, onEdit, i10, 26);
        }
    }

    /* renamed from: d */
    public static final void m15757d(C8770b c8770b, InterfaceC2137a popBack, InterfaceC3962k interfaceC3962k, int i10) {
        C8770b c8770b2;
        InterfaceC2137a interfaceC2137a;
        AbstractC4154l.m8923f(popBack, "popBack");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(1667961999);
        int i11 = (c3966o.m8616i(c8770b) ? 4 : 2) | i10 | (c3966o.m8616i(popBack) ? 32 : 16);
        if (c3966o.m8598P(i11 & 1, (i11 & 19) != 18)) {
            Context context = (Context) c3966o.m8618k(AndroidCompositionLocals_androidKt.f2134b);
            boolean zM8616i = c3966o.m8616i(c8770b) | c3966o.m8616i(context) | ((i11 & 112) == 32);
            Object objM8596M = c3966o.m8596M();
            if (zM8616i || objM8596M == C3961j.f20408a) {
                c8770b2 = c8770b;
                interfaceC2137a = popBack;
                o6.s0 s0Var = new o6.s0(c8770b2, context, interfaceC2137a, (InterfaceC7559c) null, 29);
                c3966o.j0(s0Var);
                objM8596M = s0Var;
            } else {
                c8770b2 = c8770b;
                interfaceC2137a = popBack;
            }
            C3953b.m8503f((InterfaceC2141e) objM8596M, a0.f30746a, c3966o);
        } else {
            c8770b2 = c8770b;
            interfaceC2137a = popBack;
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C8453d(c8770b2, interfaceC2137a, i10, 0);
        }
    }

    /* renamed from: e */
    public static final void m15758e(C8774f c8774f, InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(612876348);
        int i11 = (c3966o.m8616i(c8774f) ? 4 : 2) | i10;
        if (c3966o.m8598P(i11 & 1, (i11 & 3) != 2)) {
            Context context = (Context) c3966o.m8618k(AndroidCompositionLocals_androidKt.f2134b);
            boolean zM8616i = c3966o.m8616i(c8774f) | c3966o.m8616i(context);
            Object objM8596M = c3966o.m8596M();
            if (zM8616i || objM8596M == C3961j.f20408a) {
                objM8596M = new h3(c8774f, context, null, 15);
                c3966o.j0(objM8596M);
            }
            C3953b.m8503f((InterfaceC2141e) objM8596M, a0.f30746a, c3966o);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C8460k(c8774f, i10);
        }
    }

    /* renamed from: f */
    public static final void m15759f(String title, InterfaceC2137a onDismiss, InterfaceC3962k interfaceC3962k, int i10) {
        InterfaceC2137a interfaceC2137a;
        AbstractC4154l.m8923f(title, "title");
        AbstractC4154l.m8923f(onDismiss, "onDismiss");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-1737565747);
        int i11 = (c3966o.m8614g(title) ? 4 : 2) | i10;
        if (c3966o.m8598P(i11 & 1, (i11 & 19) != 18)) {
            interfaceC2137a = onDismiss;
            r6.m11845a(interfaceC2137a, null, AbstractC6740i.m12902d(1090626198, new y1(title, 5, (byte) 0), c3966o), c3966o, 390, 2);
        } else {
            interfaceC2137a = onDismiss;
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C1506b(i10, 9, interfaceC2137a, title);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x032b  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m15760g(java.lang.Integer r64, final boolean r65, java.lang.String r66, int r67, ex.InterfaceC2139c r68, ex.InterfaceC2137a r69, ex.InterfaceC2139c r70, k2.InterfaceC3962k r71, int r72) {
        /*
            Method dump skipped, instructions count: 1077
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xt.AbstractC8450a.m15760g(java.lang.Integer, boolean, java.lang.String, int, ex.c, ex.a, ex.c, k2.k, int):void");
    }

    /* renamed from: h */
    public static final void m15761h(InterfaceC2137a onAdd, InterfaceC3962k interfaceC3962k, int i10) {
        InterfaceC2137a interfaceC2137a;
        AbstractC4154l.m8923f(onAdd, "onAdd");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(781997340);
        int i11 = i10 | (c3966o.m8616i(onAdd) ? 4 : 2);
        if (c3966o.m8598P(i11 & 1, (i11 & 3) != 2)) {
            InterfaceC7879r interfaceC7879rM668e = AbstractC0245d.m668e(C7876o.f37669a, 1.0f);
            C7869h c7869h = C7864c.f37655p;
            C5261t c5261tM10367a = AbstractC5260s.m10367a(AbstractC5251j.f25761e, c7869h, c3966o, 54);
            int i12 = c3966o.f20462P;
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
            C3953b.m8521x(C7638j.f36925f, c5261tM10367a, c3966o);
            C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o);
            C7636h c7636h = C7638j.f36926g;
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i12))) {
                AbstractC1452a.m4577x(i12, c3966o, i12, c7636h);
            }
            C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
            String strM10920c = t0.m10920c(c3966o, R.string.device_not_connected);
            HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(c7869h);
            i2 i2Var = g2.y1.f13286a;
            b1.m13113q(strM10920c, horizontalAlignElement, ((v1) c3966o.m8618k(i2Var)).f12970q, null, null, 0, 0, 0L, null, null, c3966o, 0, 1016);
            String strM10920c2 = t0.m10920c(c3966o, R.string.connect_to_extension);
            long j6 = ((v1) c3966o.m8618k(i2Var)).f12954a;
            InterfaceC7879r interfaceC7879rM660n = AbstractC0242a.m660n(new HorizontalAlignElement(c7869h), DefinitionKt.NO_Float_VALUE, 8, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 13);
            boolean z6 = (i11 & 14) == 4;
            Object objM8596M = c3966o.m8596M();
            if (z6 || objM8596M == C3961j.f20408a) {
                interfaceC2137a = onAdd;
                objM8596M = new C8147c(7, interfaceC2137a);
                c3966o.j0(objM8596M);
            } else {
                interfaceC2137a = onAdd;
            }
            b1.m13113q(strM10920c2, AbstractC0237a.m637e(interfaceC7879rM660n, false, null, null, (InterfaceC2137a) objM8596M, 7), j6, null, null, 0, 0, 0L, null, new o0(0L, 0L, C3998s.f20698h, null, null, 0L, 0, 0L, 16777211), c3966o, 805306368, 504);
            c3966o.m8623p(true);
        } else {
            interfaceC2137a = onAdd;
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0439c(i10, 18, interfaceC2137a);
        }
    }

    /* renamed from: i */
    public static final void m15762i(l7.a0 navController, InterfaceC3962k interfaceC3962k, int i10) {
        AbstractC4154l.m8923f(navController, "navController");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-38084612);
        int i11 = i10 | (c3966o.m8616i(navController) ? 4 : 2);
        if (c3966o.m8598P(i11 & 1, (i11 & 3) != 2)) {
            c3966o.m8608Z(1890788296);
            c1 c1VarM6992a = AbstractC2868a.m6992a(c3966o);
            if (c1VarM6992a == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            C2392f c2392fM11854a = r9.m11854a(c1VarM6992a, c3966o);
            c3966o.m8608Z(1729797275);
            d7.w0 w0VarM11692c = AbstractC5928i.m11692c(C8770b.class, c1VarM6992a, c2392fM11854a, c1VarM6992a instanceof InterfaceC1637j ? ((InterfaceC1637j) c1VarM6992a).getDefaultViewModelCreationExtras() : C2536a.f13867b, c3966o);
            c3966o.m8623p(false);
            c3966o.m8623p(false);
            C8770b c8770b = (C8770b) w0VarM11692c;
            w0 w0VarM8509l = C3953b.m8509l(c8770b.f42394e, c3966o);
            boolean zM8616i = c3966o.m8616i(c8770b) | c3966o.m8616i(navController);
            Object objM8596M = c3966o.m8596M();
            s0 s0Var = C3961j.f20408a;
            if (zM8616i || objM8596M == s0Var) {
                objM8596M = new C6021u(22, c8770b, navController);
                c3966o.j0(objM8596M);
            }
            m15757d(c8770b, (InterfaceC2137a) objM8596M, c3966o, 0);
            C5261t c5261tM10367a = AbstractC5260s.m10367a(AbstractC5251j.f25759c, C7864c.f37654n, c3966o, 0);
            int i12 = c3966o.f20462P;
            i1 i1VarM8620m = c3966o.m8620m();
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
            String strM11629c = f9.m11629c(c3966o, R.string.linked_quick_call);
            boolean zM8616i2 = c3966o.m8616i(navController);
            Object objM8596M2 = c3966o.m8596M();
            if (zM8616i2 || objM8596M2 == s0Var) {
                objM8596M2 = new C7188i(navController, 5);
                c3966o.j0(objM8596M2);
            }
            g2.m13157i(null, null, false, strM11629c, 0L, 0, false, null, (InterfaceC2137a) objM8596M2, c3966o, 0, 247);
            InterfaceC7879r interfaceC7879rM633a = AbstractC0237a.m633a(AbstractC0245d.f1971c, ((v1) c3966o.m8618k(g2.y1.f13286a)).f12954a, h0.f7748a);
            j0 j0VarM10361d = AbstractC5256o.m10361d(C7864c.f37642a, false);
            int i13 = c3966o.f20462P;
            i1 i1VarM8620m2 = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c2 = AbstractC7862a.m14845c(c3966o, interfaceC7879rM633a);
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C3953b.m8521x(c7636h, j0VarM10361d, c3966o);
            C3953b.m8521x(c7636h2, i1VarM8620m2, c3966o);
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i13))) {
                AbstractC1452a.m4577x(i13, c3966o, i13, c7636h3);
            }
            C3953b.m8521x(c7636h4, interfaceC7879rM14845c2, c3966o);
            m15765l(w0VarM8509l, c8770b, c3966o, 0);
            m15767n(c3966o, 0);
            float f6 = 8;
            b1.m13113q(f9.m11629c(c3966o, R.string.scan_the_qr_code), AbstractC0242a.m660n(AbstractC0245d.m668e(c7876o, 1.0f), f6, 40, f6, DefinitionKt.NO_Float_VALUE, 8), C1565s.f7812e, null, new C6456k(3), 0, 0, 0L, null, null, c3966o, KyberEngine.KyberPolyBytes, IMAPStore.RESPONSE);
            c3966o = c3966o;
            c3966o.m8623p(true);
            c3966o.m8623p(true);
            if (((C8184b) w0VarM8509l.getValue()).f39143a) {
                c3966o.m8607Y(-706218033);
                String strM11629c2 = f9.m11629c(c3966o, R.string.connecting_dot);
                Object objM8596M3 = c3966o.m8596M();
                if (objM8596M3 == s0Var) {
                    objM8596M3 = new n2(16);
                    c3966o.j0(objM8596M3);
                }
                m15759f(strM11629c2, (InterfaceC2137a) objM8596M3, c3966o, 48);
            } else {
                c3966o.m8607Y(-710056794);
            }
            c3966o.m8623p(false);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0769n(navController, i10, 12);
        }
    }

    /* renamed from: j */
    public static final void m15763j(l7.a0 navController, InterfaceC3962k interfaceC3962k, int i10) {
        w0 w0Var;
        w0 w0Var2;
        boolean z6;
        AbstractC4154l.m8923f(navController, "navController");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-1937287804);
        int i11 = (c3966o.m8616i(navController) ? 4 : 2) | i10;
        if (c3966o.m8598P(i11 & 1, (i11 & 3) != 2)) {
            Context context = (Context) c3966o.m8618k(AndroidCompositionLocals_androidKt.f2134b);
            Object objM8596M = c3966o.m8596M();
            Object obj = C3961j.f20408a;
            if (objM8596M == obj) {
                objM8596M = C3953b.m8517t(Boolean.FALSE);
                c3966o.j0(objM8596M);
            }
            w0 w0Var3 = (w0) objM8596M;
            Object objM8596M2 = c3966o.m8596M();
            if (objM8596M2 == obj) {
                objM8596M2 = C3953b.m8517t(Boolean.FALSE);
                c3966o.j0(objM8596M2);
            }
            w0 w0Var4 = (w0) objM8596M2;
            c3966o.m8608Z(1890788296);
            c1 c1VarM6992a = AbstractC2868a.m6992a(c3966o);
            if (c1VarM6992a == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            C2392f c2392fM11854a = r9.m11854a(c1VarM6992a, c3966o);
            c3966o.m8608Z(1729797275);
            d7.w0 w0VarM11692c = AbstractC5928i.m11692c(C8774f.class, c1VarM6992a, c2392fM11854a, c1VarM6992a instanceof InterfaceC1637j ? ((InterfaceC1637j) c1VarM6992a).getDefaultViewModelCreationExtras() : C2536a.f13867b, c3966o);
            c3966o.m8623p(false);
            c3966o.m8623p(false);
            C8774f c8774f = (C8774f) w0VarM11692c;
            w0 w0VarM8509l = C3953b.m8509l(c8774f.f42416h, c3966o);
            InterfaceC1649u interfaceC1649u = (InterfaceC1649u) c3966o.m8618k(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            Object objM8596M3 = c3966o.m8596M();
            if (objM8596M3 == obj) {
                objM8596M3 = C3953b.m8517t(Boolean.FALSE);
                c3966o.j0(objM8596M3);
            }
            w0 w0Var5 = (w0) objM8596M3;
            Object objM8596M4 = c3966o.m8596M();
            if (objM8596M4 == obj) {
                objM8596M4 = C3953b.m8517t(null);
                c3966o.j0(objM8596M4);
            }
            w0 w0Var6 = (w0) objM8596M4;
            boolean zM8616i = c3966o.m8616i(context) | c3966o.m8616i(interfaceC1649u);
            Object objM8596M5 = c3966o.m8596M();
            if (zM8616i || objM8596M5 == obj) {
                objM8596M5 = new C7765g(5, (Object) interfaceC1649u, (Object) context, w0Var4);
                c3966o.j0(objM8596M5);
            }
            a0 a0Var = a0.f30746a;
            C3953b.m8500c(a0Var, (InterfaceC2139c) objM8596M5, c3966o);
            boolean zM8616i2 = c3966o.m8616i(c8774f) | c3966o.m8616i(navController) | c3966o.m8614g(w0VarM8509l) | c3966o.m8616i(context);
            Object objM8596M6 = c3966o.m8596M();
            if (zM8616i2 || objM8596M6 == obj) {
                s1 s1Var = new s1(c8774f, navController, w0VarM8509l, context, (InterfaceC7559c) null);
                c3966o.j0(s1Var);
                objM8596M6 = s1Var;
            }
            C3953b.m8503f((InterfaceC2141e) objM8596M6, a0Var, c3966o);
            if (((Boolean) w0Var5.getValue()).booleanValue()) {
                c3966o.m8607Y(2031591417);
                Object objM8596M7 = c3966o.m8596M();
                if (objM8596M7 == obj) {
                    w0Var = w0Var4;
                    C5433b c5433b = new C5433b(w0Var, w0Var3, w0Var6, w0Var5, 2);
                    w0Var2 = w0Var3;
                    c3966o.j0(c5433b);
                    objM8596M7 = c5433b;
                } else {
                    w0Var = w0Var4;
                    w0Var2 = w0Var3;
                }
                m15754a((InterfaceC2139c) objM8596M7, c3966o, 6);
            } else {
                w0Var = w0Var4;
                w0Var2 = w0Var3;
                c3966o.m8607Y(2024510366);
            }
            c3966o.m8623p(false);
            m15758e(c8774f, c3966o, 0);
            if (((Boolean) w0Var2.getValue()).booleanValue()) {
                c3966o.m8607Y(2032024084);
                String strM11629c = f9.m11629c(c3966o, R.string.permission_denied);
                Object objM8596M8 = c3966o.m8596M();
                if (objM8596M8 == obj) {
                    objM8596M8 = new C8457h(w0Var2, 2);
                    c3966o.j0(objM8596M8);
                }
                InterfaceC2137a interfaceC2137a = (InterfaceC2137a) objM8596M8;
                String strM11629c2 = f9.m11629c(c3966o, R.string.permission_allowed_dialog_description);
                String strM11629c3 = f9.m11629c(c3966o, R.string.go_to_settings);
                boolean zM8616i3 = c3966o.m8616i(context);
                Object objM8596M9 = c3966o.m8596M();
                if (zM8616i3 || objM8596M9 == obj) {
                    objM8596M9 = new C4888b(context, w0Var2, 2);
                    c3966o.j0(objM8596M9);
                }
                InterfaceC2137a interfaceC2137a2 = (InterfaceC2137a) objM8596M9;
                String strM11629c4 = f9.m11629c(c3966o, R.string.cancel);
                Object objM8596M10 = c3966o.m8596M();
                if (objM8596M10 == obj) {
                    objM8596M10 = new C8457h(w0Var2, 3);
                    c3966o.j0(objM8596M10);
                }
                z6 = false;
                g2.m13150b(strM11629c, interfaceC2137a, strM11629c2, strM11629c3, interfaceC2137a2, strM11629c4, (InterfaceC2137a) objM8596M10, c3966o, 1572912);
            } else {
                z6 = false;
                c3966o.m8607Y(2024510366);
            }
            c3966o.m8623p(z6);
            w0 w0Var7 = w0Var;
            u9.m6323a(null, AbstractC6740i.m12902d(-438586808, new C8453d(navController, c8774f, 2), c3966o), null, null, AbstractC6740i.m12902d(-1860664757, new d0(w0VarM8509l, context, c8774f, w0Var7, w0Var6, w0Var5), c3966o), 0, 0L, 0L, null, AbstractC6740i.m12902d(635143955, new p0(c8774f, w0VarM8509l, w0Var7, w0Var6, w0Var5), c3966o), c3966o, 805330992, 493);
            c3966o = c3966o;
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0769n(navController, i10, 13);
        }
    }

    /* renamed from: k */
    public static final void m15764k(InterfaceC2137a onLearnMoreClicked, InterfaceC3962k interfaceC3962k, int i10) {
        AbstractC4154l.m8923f(onLearnMoreClicked, "onLearnMoreClicked");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(127889143);
        int i11 = (c3966o.m8616i(onLearnMoreClicked) ? 4 : 2) | i10;
        if (c3966o.m8598P(i11 & 1, (i11 & 3) != 2)) {
            String strM10920c = t0.m10920c(c3966o, R.string.quick_call_description);
            String strM10920c2 = t0.m10920c(c3966o, R.string.learn_more);
            c3966o.m8607Y(-1652577744);
            C2489e c2489e = new C2489e();
            c2489e.m6423c(strM10920c + " ");
            c2489e.m6426f("LEARN_MORE", "learn_more");
            l1 l1Var = g2.y1.f13286a;
            int iM6427g = c2489e.m6427g(new g0(((v1) c3966o.m8618k(l1Var)).f12954a, 0L, C3998s.f20697g, (C3994o) null, (C3995p) null, (AbstractC3988i) null, (String) null, 0L, (C6446a) null, (C6462q) null, (C4953b) null, 0L, (C6457l) null, (k0) null, 65530));
            try {
                c2489e.m6423c(strM10920c2);
                c2489e.m6425e(iM6427g);
                c2489e.m6424d();
                C2492h c2492hM6428h = c2489e.m6428h();
                c3966o.m8623p(false);
                InterfaceC7879r interfaceC7879rM657k = AbstractC0242a.m657k(C7876o.f37669a, 4, 16);
                o0 o0VarM6461a = o0.m6461a(((vd) c3966o.m8618k(xd.f13268a)).f13055k, ((v1) c3966o.m8618k(l1Var)).f12970q, af.m10534c(16), null, null, null, 0L, 0L, null, 16744444);
                boolean zM8614g = c3966o.m8614g(c2492hM6428h) | ((i11 & 14) == 4);
                Object objM8596M = c3966o.m8596M();
                if (zM8614g || objM8596M == C3961j.f20408a) {
                    objM8596M = new C0437a(c2492hM6428h, onLearnMoreClicked, 2);
                    c3966o.j0(objM8596M);
                }
                x1.r0.m15445e(c2492hM6428h, interfaceC7879rM657k, o0VarM6461a, false, 0, 0, null, (InterfaceC2139c) objM8596M, c3966o, 48, 120);
            } catch (Throwable th2) {
                c2489e.m6425e(iM6427g);
                throw th2;
            }
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0439c(i10, 17, onLearnMoreClicked);
        }
    }

    /* renamed from: l */
    public static final void m15765l(h2 state, C8770b c8770b, InterfaceC3962k interfaceC3962k, int i10) {
        AbstractC4154l.m8923f(state, "state");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(1953153539);
        int i11 = (c3966o.m8614g(state) ? 4 : 2) | i10 | (c3966o.m8616i(c8770b) ? 32 : 16);
        if (c3966o.m8598P(i11 & 1, (i11 & 19) != 18)) {
            InterfaceC1649u interfaceC1649u = (InterfaceC1649u) c3966o.m8618k(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean zM8616i = c3966o.m8616i(c8770b) | ((i11 & 14) == 4) | c3966o.m8616i(interfaceC1649u);
            Object objM8596M = c3966o.m8596M();
            if (zM8616i || objM8596M == C3961j.f20408a) {
                objM8596M = new C7765g(4, interfaceC1649u, state, c8770b);
                c3966o.j0(objM8596M);
            }
            AbstractC0265a.m729b((InterfaceC2139c) objM8596M, null, null, c3966o, 0, 6);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C8453d(state, c8770b, i10);
        }
    }

    /* renamed from: m */
    public static final void m15766m(final InterfaceC7879r interfaceC7879r, float f6, float f10, float f11, long j6, InterfaceC3962k interfaceC3962k, final int i10) {
        final float f12;
        final float f13;
        final float f14;
        final long j10;
        final float f15;
        final float f16;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-914987774);
        int i11 = i10 | 11696;
        if (c3966o.m8598P(i11 & 1, (i11 & 9363) != 9362)) {
            c3966o.m8603U();
            if ((i10 & 1) == 0 || c3966o.m8584A()) {
                f11 = 2;
                j6 = AbstractC7554g.m14301b(c3966o).f36394f;
                f15 = 20;
                f16 = 20;
            } else {
                c3966o.m8601S();
                f16 = f6;
                f15 = f10;
            }
            final float f17 = f11;
            final long j11 = j6;
            c3966o.m8624q();
            boolean zM8613f = c3966o.m8613f(j11);
            Object objM8596M = c3966o.m8596M();
            if (zM8613f || objM8596M == C3961j.f20408a) {
                InterfaceC2139c interfaceC2139c = new InterfaceC2139c() { // from class: xt.b
                    @Override // ex.InterfaceC2139c
                    public final Object invoke(Object obj) {
                        InterfaceC2198d Canvas = (InterfaceC2198d) obj;
                        AbstractC4154l.m8923f(Canvas, "$this$Canvas");
                        float fMo8435T = Canvas.mo8435T(f16);
                        float fMo8435T2 = Canvas.mo8435T(f15);
                        float fMo8435T3 = Canvas.mo8435T(f17);
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo5913e() >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.mo5913e() & 4294967295L));
                        float f18 = fMo8435T * 2;
                        C2202h c2202h = new C2202h(fMo8435T3, DefinitionKt.NO_Float_VALUE, 0, 0, 30);
                        long j12 = j11;
                        Canvas.mo5904i(j12, 180.0f, 90.0f, (Float.floatToRawIntBits(DefinitionKt.NO_Float_VALUE) << 32) | (Float.floatToRawIntBits(DefinitionKt.NO_Float_VALUE) & 4294967295L), (Float.floatToRawIntBits(f18) << 32) | (Float.floatToRawIntBits(f18) & 4294967295L), (832 & 64) != 0 ? 1.0f : DefinitionKt.NO_Float_VALUE, c2202h);
                        float f19 = fMo8435T + fMo8435T2;
                        Canvas.r0(j12, (Float.floatToRawIntBits(fMo8435T) << 32) | (Float.floatToRawIntBits(DefinitionKt.NO_Float_VALUE) & 4294967295L), (Float.floatToRawIntBits(f19) << 32) | (Float.floatToRawIntBits(DefinitionKt.NO_Float_VALUE) & 4294967295L), fMo8435T3, (496 & 16) != 0 ? 0 : 0, 3);
                        Canvas.r0(j12, (Float.floatToRawIntBits(DefinitionKt.NO_Float_VALUE) << 32) | (Float.floatToRawIntBits(fMo8435T) & 4294967295L), (Float.floatToRawIntBits(DefinitionKt.NO_Float_VALUE) << 32) | (Float.floatToRawIntBits(f19) & 4294967295L), fMo8435T3, (496 & 16) != 0 ? 0 : 0, 3);
                        float f20 = fIntBitsToFloat - f18;
                        Canvas.mo5904i(j12, 270.0f, 90.0f, (Float.floatToRawIntBits(f20) << 32) | (Float.floatToRawIntBits(DefinitionKt.NO_Float_VALUE) & 4294967295L), (Float.floatToRawIntBits(f18) << 32) | (Float.floatToRawIntBits(f18) & 4294967295L), (832 & 64) != 0 ? 1.0f : DefinitionKt.NO_Float_VALUE, new C2202h(fMo8435T3, DefinitionKt.NO_Float_VALUE, 0, 0, 30));
                        float f21 = (fIntBitsToFloat - fMo8435T) - fMo8435T2;
                        Canvas.r0(j12, (Float.floatToRawIntBits(r24) << 32) | (Float.floatToRawIntBits(DefinitionKt.NO_Float_VALUE) & 4294967295L), (Float.floatToRawIntBits(f21) << 32) | (Float.floatToRawIntBits(DefinitionKt.NO_Float_VALUE) & 4294967295L), fMo8435T3, (496 & 16) != 0 ? 0 : 0, 3);
                        Canvas.r0(j12, (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fMo8435T) & 4294967295L), (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(f19) & 4294967295L), fMo8435T3, (496 & 16) != 0 ? 0 : 0, 3);
                        float f22 = fIntBitsToFloat2 - f18;
                        Canvas.mo5904i(j12, DefinitionKt.NO_Float_VALUE, 90.0f, (Float.floatToRawIntBits(f20) << 32) | (Float.floatToRawIntBits(f22) & 4294967295L), (Float.floatToRawIntBits(f18) << 32) | (Float.floatToRawIntBits(f18) & 4294967295L), (832 & 64) != 0 ? 1.0f : DefinitionKt.NO_Float_VALUE, new C2202h(fMo8435T3, DefinitionKt.NO_Float_VALUE, 0, 0, 30));
                        Canvas.r0(j12, (Float.floatToRawIntBits(r24) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L), (Float.floatToRawIntBits(f21) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L), fMo8435T3, (496 & 16) != 0 ? 0 : 0, 3);
                        float f23 = (fIntBitsToFloat2 - fMo8435T) - fMo8435T2;
                        Canvas.r0(j12, (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(r22) & 4294967295L), (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(f23) & 4294967295L), fMo8435T3, (496 & 16) != 0 ? 0 : 0, 3);
                        Canvas.mo5904i(j12, 90.0f, 90.0f, (Float.floatToRawIntBits(DefinitionKt.NO_Float_VALUE) << 32) | (Float.floatToRawIntBits(f22) & 4294967295L), (Float.floatToRawIntBits(f18) << 32) | (Float.floatToRawIntBits(f18) & 4294967295L), (832 & 64) != 0 ? 1.0f : DefinitionKt.NO_Float_VALUE, new C2202h(fMo8435T3, DefinitionKt.NO_Float_VALUE, 0, 0, 30));
                        Canvas.r0(j12, (Float.floatToRawIntBits(DefinitionKt.NO_Float_VALUE) << 32) | (Float.floatToRawIntBits(r22) & 4294967295L), (Float.floatToRawIntBits(DefinitionKt.NO_Float_VALUE) << 32) | (Float.floatToRawIntBits(f23) & 4294967295L), fMo8435T3, (496 & 16) != 0 ? 0 : 0, 3);
                        Canvas.r0(j12, (Float.floatToRawIntBits(fMo8435T) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L), (Float.floatToRawIntBits(f19) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L), fMo8435T3, (496 & 16) != 0 ? 0 : 0, 3);
                        return a0.f30746a;
                    }
                };
                c3966o.j0(interfaceC2139c);
                objM8596M = interfaceC2139c;
            }
            e0.m11594a(6, (InterfaceC2139c) objM8596M, c3966o, interfaceC7879r);
            j10 = j11;
            f14 = f17;
            f13 = f15;
            f12 = f16;
        } else {
            c3966o.m8601S();
            f12 = f6;
            f13 = f10;
            f14 = f11;
            j10 = j6;
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new InterfaceC2141e(f12, f13, f14, j10, i10) { // from class: xt.e

                /* renamed from: b */
                public final /* synthetic */ float f41241b;

                /* renamed from: c */
                public final /* synthetic */ float f41242c;

                /* renamed from: d */
                public final /* synthetic */ float f41243d;

                /* renamed from: e */
                public final /* synthetic */ long f41244e;

                @Override // ex.InterfaceC2141e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM8496A = C3953b.m8496A(7);
                    AbstractC8450a.m15766m(this.f41240a, this.f41241b, this.f41242c, this.f41243d, this.f41244e, (InterfaceC3962k) obj, iM8496A);
                    return a0.f30746a;
                }
            };
        }
    }

    /* renamed from: n */
    public static final void m15767n(InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(1550742997);
        if (c3966o.m8598P(i10 & 1, i10 != 0)) {
            float f6 = 250;
            float f10 = 300;
            InterfaceC6747c interfaceC6747c = (InterfaceC6747c) c3966o.m8618k(k1.f37836h);
            final float fMo8435T = interfaceC6747c.mo8435T(f6);
            final float fMo8435T2 = interfaceC6747c.mo8435T(f10);
            FillElement fillElement = AbstractC0245d.f1971c;
            C7871j c7871j = C7864c.f37642a;
            j0 j0VarM10361d = AbstractC5256o.m10361d(c7871j, false);
            int i11 = c3966o.f20462P;
            i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, fillElement);
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
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i11))) {
                AbstractC1452a.m4577x(i11, c3966o, i11, c7636h3);
            }
            C7636h c7636h4 = C7638j.f36923d;
            C3953b.m8521x(c7636h4, interfaceC7879rM14845c, c3966o);
            Object objM8596M = c3966o.m8596M();
            s0 s0Var = C3961j.f20408a;
            if (objM8596M == s0Var) {
                objM8596M = new C7393i(21);
                c3966o.j0(objM8596M);
            }
            InterfaceC7879r interfaceC7879rM714a = AbstractC0260a.m714a(fillElement, (InterfaceC2139c) objM8596M);
            boolean zM8611d = c3966o.m8611d(fMo8435T) | c3966o.m8611d(fMo8435T2);
            Object objM8596M2 = c3966o.m8596M();
            if (zM8611d || objM8596M2 == s0Var) {
                objM8596M2 = new InterfaceC2139c() { // from class: xt.c
                    @Override // ex.InterfaceC2139c
                    public final Object invoke(Object obj) {
                        v3.i0 drawWithContent = (v3.i0) obj;
                        AbstractC4154l.m8923f(drawWithContent, "$this$drawWithContent");
                        drawWithContent.m14622b();
                        long jM5186b = C1565s.m5186b(0.6f, 14, C1565s.f7809b);
                        C2196b c2196b = drawWithContent.f36917a;
                        InterfaceC2198d.o0(drawWithContent, jM5186b, 0L, c2196b.mo5913e(), DefinitionKt.NO_Float_VALUE, null, 122);
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (c2196b.mo5913e() >> 32));
                        float f11 = fMo8435T;
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c2196b.mo5913e() & 4294967295L));
                        float f12 = fMo8435T2;
                        long jFloatToRawIntBits = (Float.floatToRawIntBits((fIntBitsToFloat2 - f12) / 2.0f) & 4294967295L) | (Float.floatToRawIntBits((fIntBitsToFloat - f11) / 2.0f) << 32);
                        long j6 = C1565s.f7816i;
                        long jFloatToRawIntBits2 = (Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L);
                        float f13 = 20;
                        float fMo8435T3 = drawWithContent.mo8435T(f13);
                        float fMo8435T4 = drawWithContent.mo8435T(f13);
                        drawWithContent.p0(j6, (226 & 2) != 0 ? 0L : jFloatToRawIntBits, jFloatToRawIntBits2, (Float.floatToRawIntBits(fMo8435T3) << 32) | (Float.floatToRawIntBits(fMo8435T4) & 4294967295L), (226 & 16) != 0 ? C2201g.f10129a : null, (226 & 128) != 0 ? 3 : 0);
                        return a0.f30746a;
                    }
                };
                c3966o.j0(objM8596M2);
            }
            AbstractC5256o.m10358a(AbstractC0258a.m709c(interfaceC7879rM714a, (InterfaceC2139c) objM8596M2), c3966o, 0);
            InterfaceC7879r interfaceC7879rM679p = AbstractC0245d.m679p(C0243b.f1966a.mo662a(C7876o.f37669a, C7864c.f37646e), f6, f10);
            j0 j0VarM10361d2 = AbstractC5256o.m10361d(c7871j, false);
            int i12 = c3966o.f20462P;
            i1 i1VarM8620m2 = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c2 = AbstractC7862a.m14845c(c3966o, interfaceC7879rM679p);
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C3953b.m8521x(c7636h, j0VarM10361d2, c3966o);
            C3953b.m8521x(c7636h2, i1VarM8620m2, c3966o);
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i12))) {
                AbstractC1452a.m4577x(i12, c3966o, i12, c7636h3);
            }
            C3953b.m8521x(c7636h4, interfaceC7879rM14845c2, c3966o);
            m15766m(AbstractC0242a.m656j(fillElement, 1), DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 0L, c3966o, 6);
            c3966o.m8623p(true);
            c3966o.m8623p(true);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C7734b(i10, 20);
        }
    }
}
