package tp;

import al.C0174b;
import androidx.compose.foundation.AbstractC0237a;
import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.layout.AbstractC0245d;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import aw.C0467g;
import bm.C0701l;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.R;
import d3.h0;
import er.C2116p;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import g2.v1;
import g2.vd;
import g2.xd;
import g2.y1;
import g4.o0;
import i9.C3183a;
import java.util.ArrayList;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.i1;
import k2.i2;
import k2.n1;
import kotlin.jvm.internal.AbstractC4154l;
import l7.a0;
import lx.InterfaceC4566e;
import mm.AbstractC4801l;
import o1.AbstractC5244c;
import o1.AbstractC5251j;
import o1.AbstractC5260s;
import o1.C5261t;
import o1.m1;
import og.nc;
import og.r0;
import og.t0;
import p1.AbstractC5788a;
import pg.b9;
import pg.i0;
import ps.c0;
import qp.C6272i;
import qr.f0;
import r4.C6456k;
import s2.AbstractC6740i;
import s2.C6734c;
import sq.b1;
import sq.f3;
import sq.g2;
import sq.h2;
import sq.n3;
import t1.C6979d;
import t1.b0;
import up.C7494g;
import uw.InterfaceC7559c;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7870i;
import w2.C7876o;
import w2.InterfaceC7879r;
import wx.w0;
import yv.C8800o;
import zp.C9014n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tp.f */
/* loaded from: classes3.dex */
public abstract class AbstractC7185f {

    /* renamed from: a */
    public static final C6734c f34471a = new C6734c(new h2(21), false, 1030827132);

    /* renamed from: a */
    public static final void m13442a(C6272i callDurationState, InterfaceC2141e callConfirmationAction, InterfaceC3962k interfaceC3962k, int i10) {
        AbstractC4154l.m8923f(callDurationState, "callDurationState");
        AbstractC4154l.m8923f(callConfirmationAction, "callConfirmationAction");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-219104533);
        int i11 = (c3966o.m8616i(callDurationState) ? 4 : 2) | i10;
        if (!c3966o.m8598P(i11 & 1, (i11 & 19) != 18)) {
            c3966o.m8601S();
        } else if (callDurationState.f30441h) {
            c3966o.m8607Y(1007311030);
            g2.d0(c3966o, 0);
            c3966o.m8623p(false);
        } else {
            c3966o.m8607Y(1007376533);
            C5261t c5261tM10367a = AbstractC5260s.m10367a(AbstractC5251j.f25759c, C7864c.f37654n, c3966o, 0);
            int i12 = c3966o.f20462P;
            i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, C7876o.f37669a);
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
            if (callDurationState.f30434a.isEmpty()) {
                c3966o.m8607Y(1677360624);
                b1.m13072B(0, 3, null, c3966o, null);
            } else {
                c3966o.m8607Y(1675621245);
            }
            c3966o.m8623p(false);
            FillElement fillElement = AbstractC0245d.f1971c;
            boolean zM8616i = c3966o.m8616i(callDurationState);
            Object objM8596M = c3966o.m8596M();
            if (zM8616i || objM8596M == C3961j.f20408a) {
                objM8596M = new C7180a(callDurationState, callConfirmationAction, 0);
                c3966o.j0(objM8596M);
            }
            nc.m10775b(fillElement, null, null, null, null, null, false, null, (InterfaceC2139c) objM8596M, c3966o, 6, 510);
            c3966o.m8623p(true);
            c3966o.m8623p(false);
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C7181b(callDurationState, callConfirmationAction, i10, 0);
        }
    }

    /* renamed from: b */
    public static final void m13443b(C9014n c9014n, InterfaceC2141e interfaceC2141e, InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(443216486);
        int i11 = i10 | (c3966o.m8616i(c9014n) ? 4 : 2) | (c3966o.m8616i(interfaceC2141e) ? 32 : 16);
        if (c3966o.m8598P(i11 & 1, (i11 & 19) != 18)) {
            C7870i c7870i = C7864c.f37652l;
            C7876o c7876o = C7876o.f37669a;
            InterfaceC7879r interfaceC7879rM668e = AbstractC0245d.m668e(c7876o, 1.0f);
            boolean zM8616i = ((i11 & 112) == 32) | c3966o.m8616i(c9014n);
            Object objM8596M = c3966o.m8596M();
            if (zM8616i || objM8596M == C3961j.f20408a) {
                objM8596M = new C7182c(interfaceC2141e, c9014n, 0);
                c3966o.j0(objM8596M);
            }
            float f6 = 10;
            InterfaceC7879r interfaceC7879rM657k = AbstractC0242a.m657k(AbstractC0237a.m637e(interfaceC7879rM668e, false, null, null, (InterfaceC2137a) objM8596M, 7), f6, 15);
            o1.n1 n1VarM10357a = m1.m10357a(AbstractC5251j.f25757a, c7870i, c3966o, 48);
            int i12 = c3966o.f20462P;
            i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879rM657k);
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
            i0.m11693a(b9.m11551a(c9014n.f43426h, 0, c3966o), "", AbstractC0245d.m678o(c7876o, 30), null, null, DefinitionKt.NO_Float_VALUE, null, c3966o, 432, 120);
            InterfaceC7879r interfaceC7879rM658l = AbstractC0242a.m658l(c7876o, f6, DefinitionKt.NO_Float_VALUE, 2);
            if (1.0f <= 0.0d) {
                AbstractC5788a.m11338a("invalid weight; must be greater than zero");
            }
            InterfaceC7879r interfaceC7879rM9747u = AbstractC4801l.m9747u(1.0f, interfaceC7879rM658l, true);
            C5261t c5261tM10367a = AbstractC5260s.m10367a(AbstractC5251j.f25759c, C7864c.f37654n, c3966o, 0);
            int i13 = c3966o.f20462P;
            i1 i1VarM8620m2 = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c2 = AbstractC7862a.m14845c(c3966o, interfaceC7879rM9747u);
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C3953b.m8521x(c7636h, c5261tM10367a, c3966o);
            C3953b.m8521x(c7636h2, i1VarM8620m2, c3966o);
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i13))) {
                AbstractC1452a.m4577x(i13, c3966o, i13, c7636h3);
            }
            C3953b.m8521x(c7636h4, interfaceC7879rM14845c2, c3966o);
            String str = c9014n.f43420b;
            i2 i2Var = xd.f13268a;
            o0 o0Var = ((vd) c3966o.m8618k(i2Var)).f13050f;
            c3966o = c3966o;
            b1.m13113q(str, null, 0L, null, null, 0, 0, 0L, null, o0Var, c3966o, 0, 510);
            b1.m13113q(c9014n.f43421c, null, 0L, null, new C6456k(5), 0, 0, 0L, null, ((vd) c3966o.m8618k(i2Var)).f13056l, c3966o, 0, 494);
            c3966o.m8623p(true);
            b1.m13115s(r0.m10866b(R.drawable.ic_call, 0, c3966o), c9014n.f43425g, null, DefinitionKt.NO_Float_VALUE, 12, null, DefinitionKt.NO_Float_VALUE, 0, null, c3966o, 1572864, 1980);
            c3966o.m8623p(true);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C7183d(c9014n, interfaceC2141e, i10, 0);
        }
    }

    /* renamed from: c */
    public static final void m13444c(C6272i callDurationState, InterfaceC2141e callConfirmationAction, InterfaceC3962k interfaceC3962k, int i10) {
        AbstractC4154l.m8923f(callDurationState, "callDurationState");
        AbstractC4154l.m8923f(callConfirmationAction, "callConfirmationAction");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(1239500679);
        int i11 = (c3966o.m8616i(callDurationState) ? 4 : 2) | i10;
        if (c3966o.m8598P(i11 & 1, (i11 & 19) != 18)) {
            if (callDurationState.f30435b.isEmpty()) {
                c3966o.m8607Y(2131073758);
                b1.m13072B(0, 3, null, c3966o, null);
            } else {
                c3966o.m8607Y(2129580891);
            }
            c3966o.m8623p(false);
            FillElement fillElement = AbstractC0245d.f1971c;
            boolean zM8616i = c3966o.m8616i(callDurationState);
            Object objM8596M = c3966o.m8596M();
            if (zM8616i || objM8596M == C3961j.f20408a) {
                objM8596M = new C7180a(callDurationState, callConfirmationAction, 1);
                c3966o.j0(objM8596M);
            }
            nc.m10775b(fillElement, null, null, null, null, null, false, null, (InterfaceC2139c) objM8596M, c3966o, 6, 510);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C7181b(callDurationState, callConfirmationAction, i10, 1);
        }
    }

    /* renamed from: d */
    public static final void m13445d(C6272i callDurationState, InterfaceC2141e callConfirmationAction, InterfaceC3962k interfaceC3962k, int i10) {
        AbstractC4154l.m8923f(callDurationState, "callDurationState");
        AbstractC4154l.m8923f(callConfirmationAction, "callConfirmationAction");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-986214085);
        int i11 = (c3966o.m8616i(callDurationState) ? 4 : 2) | i10;
        if (c3966o.m8598P(i11 & 1, (i11 & 19) != 18)) {
            if (callDurationState.f30436c.isEmpty()) {
                c3966o.m8607Y(1567655082);
                b1.m13072B(0, 3, null, c3966o, null);
            } else {
                c3966o.m8607Y(1566162215);
            }
            c3966o.m8623p(false);
            FillElement fillElement = AbstractC0245d.f1971c;
            boolean zM8616i = c3966o.m8616i(callDurationState);
            Object objM8596M = c3966o.m8596M();
            if (zM8616i || objM8596M == C3961j.f20408a) {
                objM8596M = new C7180a(callDurationState, callConfirmationAction, 2);
                c3966o.j0(objM8596M);
            }
            nc.m10775b(fillElement, null, null, null, null, null, false, null, (InterfaceC2139c) objM8596M, c3966o, 6, 510);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C7181b(callDurationState, callConfirmationAction, i10, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* renamed from: e */
    public static final void m13446e(C7494g viewModel, a0 navHostController, InterfaceC2137a filterNavigation, InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o;
        boolean z6;
        Object c3183a;
        int i11;
        C6272i c6272i;
        ArrayList arrayList;
        int i12;
        ?? r15;
        C7876o c7876o;
        AbstractC4154l.m8923f(viewModel, "viewModel");
        w0 w0Var = viewModel.f36253c;
        AbstractC4154l.m8923f(navHostController, "navHostController");
        AbstractC4154l.m8923f(filterNavigation, "filterNavigation");
        C3966o c3966o2 = (C3966o) interfaceC3962k;
        c3966o2.a0(-1865219688);
        int i13 = i10 | (c3966o2.m8616i(viewModel) ? 4 : 2) | (c3966o2.m8616i(navHostController) ? 32 : 16) | (c3966o2.m8616i(filterNavigation) ? 256 : 128);
        if (c3966o2.m8598P(i13 & 1, (i13 & 147) != 146)) {
            C6272i c6272i2 = (C6272i) C3953b.m8509l(viewModel.f36183p, c3966o2).getValue();
            ArrayList arrayList2 = new ArrayList();
            Object objM8596M = c3966o2.m8596M();
            Object obj = C3961j.f20408a;
            if (objM8596M == obj) {
                objM8596M = C3953b.m8517t("");
                c3966o2.j0(objM8596M);
            }
            k2.w0 w0Var2 = (k2.w0) objM8596M;
            Object objM8596M2 = c3966o2.m8596M();
            if (objM8596M2 == obj) {
                objM8596M2 = C3953b.m8517t("");
                c3966o2.j0(objM8596M2);
            }
            k2.w0 w0Var3 = (k2.w0) objM8596M2;
            Object objM8596M3 = c3966o2.m8596M();
            if (objM8596M3 == obj) {
                objM8596M3 = C3953b.m8517t(Boolean.FALSE);
                c3966o2.j0(objM8596M3);
            }
            k2.w0 w0Var4 = (k2.w0) objM8596M3;
            Object objM8596M4 = c3966o2.m8596M();
            int i14 = 3;
            if (objM8596M4 == obj) {
                objM8596M4 = new C0701l(w0Var2, w0Var3, w0Var4, i14);
                c3966o2.j0(objM8596M4);
            }
            InterfaceC2141e interfaceC2141e = (InterfaceC2141e) objM8596M4;
            if (((Boolean) w0Var4.getValue()).booleanValue()) {
                c3966o2.m8607Y(1527895062);
                boolean zM8616i = c3966o2.m8616i(viewModel);
                Object objM8596M5 = c3966o2.m8596M();
                if (zM8616i || objM8596M5 == obj) {
                    objM8596M5 = new C0467g(21, viewModel, w0Var2, w0Var4);
                    c3966o2.j0(objM8596M5);
                }
                InterfaceC2137a interfaceC2137a = (InterfaceC2137a) objM8596M5;
                Object objM8596M6 = c3966o2.m8596M();
                if (objM8596M6 == obj) {
                    objM8596M6 = new C2116p(w0Var2, w0Var4, 9);
                    c3966o2.j0(objM8596M6);
                }
                g2.m13165q(interfaceC2137a, (InterfaceC2137a) objM8596M6, c3966o2, 48);
            } else {
                c3966o2.m8607Y(1524989866);
            }
            c3966o2.m8623p(false);
            arrayList2.add(new n3(R.string.all_with_count, new f3(R.drawable.icon_tab_all_calls_filled, R.drawable.icon_tab_all_calls_outlined), AbstractC6740i.m12902d(1166918098, new C7181b(c6272i2, interfaceC2141e, 3), c3966o2)));
            arrayList2.add(new n3(R.string.incoming_with_count, new f3(R.drawable.ic_tab_incoming_filled, R.drawable.ic_tab_incoming_outlined), AbstractC6740i.m12902d(622417929, new C7181b(c6272i2, interfaceC2141e, 4), c3966o2)));
            arrayList2.add(new n3(R.string.outgoing_with_count, new f3(R.drawable.ic_tab_outgoing_filled, R.drawable.ic_tab_outgoing_outlined), AbstractC6740i.m12902d(-1073605430, new C7181b(c6272i2, interfaceC2141e, 5), c3966o2)));
            boolean zM8616i2 = c3966o2.m8616i(arrayList2);
            Object objM8596M7 = c3966o2.m8596M();
            if (zM8616i2 || objM8596M7 == obj) {
                objM8596M7 = new C7187h(0, arrayList2);
                c3966o2.j0(objM8596M7);
            }
            C6979d c6979dM13251b = b0.m13251b(0, 0, 3, (InterfaceC2137a) objM8596M7, c3966o2);
            Object objM8618k = c3966o2.m8618k(AndroidCompositionLocals_androidKt.f2134b);
            boolean zM8616i3 = c3966o2.m8616i(viewModel) | c3966o2.m8616i(navHostController);
            Object objM8596M8 = c3966o2.m8596M();
            InterfaceC7559c interfaceC7559c = null;
            if (zM8616i3 || objM8596M8 == obj) {
                objM8596M8 = new c0(viewModel, navHostController, interfaceC7559c, 26);
                c3966o2.j0(objM8596M8);
            }
            C3953b.m8503f((InterfaceC2141e) objM8596M8, objM8618k, c3966o2);
            long j6 = ((v1) c3966o2.m8618k(y1.f13286a)).f12967n;
            C0174b c0174b = h0.f7748a;
            C7876o c7876o2 = C7876o.f37669a;
            InterfaceC7879r interfaceC7879rM10330o = AbstractC5244c.m10330o(AbstractC0237a.m633a(c7876o2, j6, c0174b).mo14852e(AbstractC0245d.f1971c));
            C5261t c5261tM10367a = AbstractC5260s.m10367a(AbstractC5251j.f25759c, C7864c.f37654n, c3966o2, 0);
            int i15 = c3966o2.f20462P;
            i1 i1VarM8620m = c3966o2.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o2, interfaceC7879rM10330o);
            InterfaceC7639k.V0.getClass();
            InterfaceC2137a interfaceC2137a2 = C7638j.f36921b;
            c3966o2.c0();
            if (c3966o2.f20461O) {
                c3966o2.m8619l(interfaceC2137a2);
            } else {
                c3966o2.m0();
            }
            C3953b.m8521x(C7638j.f36925f, c5261tM10367a, c3966o2);
            C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o2);
            C7636h c7636h = C7638j.f36926g;
            if (c3966o2.f20461O || !AbstractC4154l.m8918a(c3966o2.m8596M(), Integer.valueOf(i15))) {
                AbstractC1452a.m4577x(i15, c3966o2, i15, c7636h);
            }
            C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o2);
            String strM10920c = t0.m10920c(c3966o2, R.string.top_10_call_duration);
            boolean zM8616i4 = c3966o2.m8616i(navHostController);
            Object objM8596M9 = c3966o2.m8596M();
            if (zM8616i4 || objM8596M9 == obj) {
                z6 = false;
                objM8596M9 = new C7188i(navHostController, 0);
                c3966o2.j0(objM8596M9);
            } else {
                z6 = false;
            }
            g2.m13157i(null, null, false, strM10920c, 0L, 0, false, f34471a, (InterfaceC2137a) objM8596M9, c3966o2, 12582912, 119);
            C3966o c3966o3 = c3966o2;
            c3966o3.m8605W(-579722213, Boolean.valueOf(c6272i2.f30441h));
            boolean zM8616i5 = c3966o3.m8616i(viewModel);
            Object objM8596M10 = c3966o3.m8596M();
            if (zM8616i5 || objM8596M10 == obj) {
                i11 = i13;
                c6272i = c6272i2;
                arrayList = arrayList2;
                i12 = 3;
                r15 = z6;
                c7876o = c7876o2;
                c3183a = new C3183a(1, viewModel, C7494g.class, "onEvent", "onEvent(Lcom/websoptimization/callyzerbiz/ui/filters/model/AllFiltersEvent;)V", 0, 24);
                c3966o3.j0(c3183a);
            } else {
                i11 = i13;
                r15 = z6;
                arrayList = arrayList2;
                c7876o = c7876o2;
                c3183a = objM8596M10;
                i12 = 3;
                c6272i = c6272i2;
            }
            b1.m13099c((InterfaceC2139c) ((InterfaceC4566e) c3183a), ((ur.i0) C3953b.m8509l(w0Var, c3966o3).getValue()).f36224a, ((ur.i0) C3953b.m8509l(w0Var, c3966o3).getValue()).f36227d, filterNavigation, false, c3966o3, ((i11 << 3) & 7168) | 24576, 0);
            c3966o3.m8623p(r15);
            C8800o c8800o = C8800o.f42459a;
            b1.m13088R(C8800o.m16189M(C8800o.m16184H(c6272i.f30438e)) + " - " + C8800o.m16189M(C8800o.m16184H(c6272i.f30439f)), c3966o3, r15);
            b1.m13094X(arrayList, c6979dM13251b, null, AbstractC0245d.m686w(c7876o, null, i12), null, c3966o3, 3072);
            c3966o3.m8623p(true);
            c3966o = c3966o3;
        } else {
            C3966o c3966o4 = c3966o2;
            c3966o4.m8601S();
            c3966o = c3966o4;
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new f0(viewModel, navHostController, filterNavigation, i10, 15);
        }
    }
}
