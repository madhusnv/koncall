package vp;

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
import java.util.List;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.i1;
import k2.i2;
import k2.n1;
import k2.w0;
import kotlin.jvm.internal.AbstractC4154l;
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
import pr.C5998a;
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
import sq.p1;
import t1.C6979d;
import t1.b0;
import tp.C7180a;
import tp.C7181b;
import tp.C7182c;
import tp.C7183d;
import tp.C7187h;
import u7.C7351a;
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
import wp.C8141g;
import yv.C8800o;
import zp.C9014n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vp.a */
/* loaded from: classes3.dex */
public abstract class AbstractC7728a {

    /* renamed from: a */
    public static final C6734c f37278a = new C6734c(new h2(22), false, 1321285202);

    /* renamed from: a */
    public static final void m14715a(C6272i frequentCallsState, InterfaceC2141e callConfirmationAction, InterfaceC3962k interfaceC3962k, int i10) {
        boolean z6;
        AbstractC4154l.m8923f(frequentCallsState, "frequentCallsState");
        AbstractC4154l.m8923f(callConfirmationAction, "callConfirmationAction");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-1494335473);
        int i11 = (c3966o.m8616i(frequentCallsState) ? 4 : 2) | i10;
        if (c3966o.m8598P(i11 & 1, (i11 & 19) != 18)) {
            FillElement fillElement = AbstractC0245d.f1971c;
            C5261t c5261tM10367a = AbstractC5260s.m10367a(AbstractC5251j.f25759c, C7864c.f37654n, c3966o, 0);
            int i12 = c3966o.f20462P;
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
            C3953b.m8521x(C7638j.f36925f, c5261tM10367a, c3966o);
            C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o);
            C7636h c7636h = C7638j.f36926g;
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i12))) {
                AbstractC1452a.m4577x(i12, c3966o, i12, c7636h);
            }
            C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
            if (frequentCallsState.f30441h) {
                c3966o.m8607Y(1982319444);
                g2.d0(c3966o, 0);
                c3966o.m8623p(false);
                z6 = true;
            } else {
                c3966o.m8607Y(1982392046);
                if (frequentCallsState.f30436c.isEmpty()) {
                    c3966o.m8607Y(1982438608);
                    b1.m13072B(0, 3, null, c3966o, null);
                } else {
                    c3966o.m8607Y(1980605981);
                }
                c3966o.m8623p(false);
                boolean zM8616i = c3966o.m8616i(frequentCallsState);
                Object objM8596M = c3966o.m8596M();
                if (zM8616i || objM8596M == C3961j.f20408a) {
                    objM8596M = new C7180a(frequentCallsState, callConfirmationAction, 3);
                    c3966o.j0(objM8596M);
                }
                nc.m10775b(fillElement, null, null, null, null, null, false, null, (InterfaceC2139c) objM8596M, c3966o, 6, 510);
                c3966o.m8623p(false);
                z6 = true;
            }
            c3966o.m8623p(z6);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C7181b(frequentCallsState, callConfirmationAction, i10, 6);
        }
    }

    /* renamed from: b */
    public static final void m14716b(C9014n c9014n, InterfaceC2141e interfaceC2141e, InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(500679476);
        int i11 = i10 | (c3966o.m8616i(c9014n) ? 4 : 2) | (c3966o.m8616i(interfaceC2141e) ? 32 : 16);
        if (c3966o.m8598P(i11 & 1, (i11 & 19) != 18)) {
            C7870i c7870i = C7864c.f37652l;
            C7876o c7876o = C7876o.f37669a;
            InterfaceC7879r interfaceC7879rM668e = AbstractC0245d.m668e(c7876o, 1.0f);
            boolean zM8616i = ((i11 & 112) == 32) | c3966o.m8616i(c9014n);
            Object objM8596M = c3966o.m8596M();
            if (zM8616i || objM8596M == C3961j.f20408a) {
                objM8596M = new C7182c(interfaceC2141e, c9014n, 1);
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
            b1.m13115s(r0.m10866b(R.drawable.ic_call, 0, c3966o), t0.m10919b(R.string.calls_, new Object[]{c9014n.f43424f}, c3966o), null, DefinitionKt.NO_Float_VALUE, 12, null, DefinitionKt.NO_Float_VALUE, 0, null, c3966o, 1572864, 1980);
            c3966o.m8623p(true);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C7183d(c9014n, interfaceC2141e, i10, 1);
        }
    }

    /* renamed from: c */
    public static final void m14717c(C9014n c9014n, InterfaceC2141e interfaceC2141e, InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(999734502);
        int i11 = i10 | (c3966o.m8616i(c9014n) ? 4 : 2) | (c3966o.m8616i(interfaceC2141e) ? 32 : 16);
        if (c3966o.m8598P(i11 & 1, (i11 & 19) != 18)) {
            C7870i c7870i = C7864c.f37652l;
            C7876o c7876o = C7876o.f37669a;
            InterfaceC7879r interfaceC7879rM668e = AbstractC0245d.m668e(c7876o, 1.0f);
            boolean zM8616i = ((i11 & 112) == 32) | c3966o.m8616i(c9014n);
            Object objM8596M = c3966o.m8596M();
            if (zM8616i || objM8596M == C3961j.f20408a) {
                objM8596M = new C7182c(interfaceC2141e, c9014n, 2);
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
            b1.m13115s(r0.m10866b(R.drawable.ic_call, 0, c3966o), t0.m10919b(R.string.calls_, new Object[]{c9014n.f43424f}, c3966o), null, DefinitionKt.NO_Float_VALUE, 12, null, DefinitionKt.NO_Float_VALUE, 0, null, c3966o, 1572864, 1980);
            c3966o.m8623p(true);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C7183d(c9014n, interfaceC2141e, i10, 2);
        }
    }

    /* renamed from: d */
    public static final void m14718d(C9014n c9014n, InterfaceC2141e interfaceC2141e, InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(528404693);
        int i11 = i10 | (c3966o.m8616i(c9014n) ? 4 : 2) | (c3966o.m8616i(interfaceC2141e) ? 32 : 16);
        if (c3966o.m8598P(i11 & 1, (i11 & 19) != 18)) {
            C7870i c7870i = C7864c.f37652l;
            C7876o c7876o = C7876o.f37669a;
            InterfaceC7879r interfaceC7879rM668e = AbstractC0245d.m668e(c7876o, 1.0f);
            boolean zM8616i = ((i11 & 112) == 32) | c3966o.m8616i(c9014n);
            Object objM8596M = c3966o.m8596M();
            if (zM8616i || objM8596M == C3961j.f20408a) {
                objM8596M = new C7182c(interfaceC2141e, c9014n, 3);
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
            b1.m13115s(r0.m10866b(R.drawable.ic_call, 0, c3966o), t0.m10919b(R.string.calls_, new Object[]{c9014n.f43424f}, c3966o), null, DefinitionKt.NO_Float_VALUE, 12, null, DefinitionKt.NO_Float_VALUE, 0, null, c3966o, 1572864, 1980);
            c3966o.m8623p(true);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C7183d(c9014n, interfaceC2141e, i10, 3);
        }
    }

    /* renamed from: e */
    public static final void m14719e(C6272i frequentCallsState, InterfaceC2141e callConfirmationAction, InterfaceC3962k interfaceC3962k, int i10) {
        AbstractC4154l.m8923f(frequentCallsState, "frequentCallsState");
        AbstractC4154l.m8923f(callConfirmationAction, "callConfirmationAction");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-243847105);
        int i11 = (c3966o.m8616i(frequentCallsState) ? 4 : 2) | i10;
        if (c3966o.m8598P(i11 & 1, (i11 & 19) != 18)) {
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
            if (frequentCallsState.f30435b.isEmpty()) {
                c3966o.m8607Y(314980616);
                b1.m13072B(0, 3, null, c3966o, null);
            } else {
                c3966o.m8607Y(313342669);
            }
            c3966o.m8623p(false);
            FillElement fillElement = AbstractC0245d.f1971c;
            boolean zM8616i = c3966o.m8616i(frequentCallsState);
            Object objM8596M = c3966o.m8596M();
            if (zM8616i || objM8596M == C3961j.f20408a) {
                objM8596M = new C7180a(frequentCallsState, callConfirmationAction, 4);
                c3966o.j0(objM8596M);
            }
            nc.m10775b(fillElement, null, null, null, null, null, false, null, (InterfaceC2139c) objM8596M, c3966o, 6, 510);
            c3966o.m8623p(true);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C7181b(frequentCallsState, callConfirmationAction, i10, 7);
        }
    }

    /* renamed from: f */
    public static final void m14720f(C6272i frequentCallsState, InterfaceC2141e callConfirmationAction, InterfaceC3962k interfaceC3962k, int i10) {
        AbstractC4154l.m8923f(frequentCallsState, "frequentCallsState");
        AbstractC4154l.m8923f(callConfirmationAction, "callConfirmationAction");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(1825405427);
        int i11 = (c3966o.m8616i(frequentCallsState) ? 4 : 2) | i10;
        if (c3966o.m8598P(i11 & 1, (i11 & 19) != 18)) {
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
            if (frequentCallsState.f30436c.isEmpty()) {
                c3966o.m8607Y(-248438060);
                b1.m13072B(0, 3, null, c3966o, null);
            } else {
                c3966o.m8607Y(-250076007);
            }
            c3966o.m8623p(false);
            FillElement fillElement = AbstractC0245d.f1971c;
            boolean zM8616i = c3966o.m8616i(frequentCallsState);
            Object objM8596M = c3966o.m8596M();
            if (zM8616i || objM8596M == C3961j.f20408a) {
                objM8596M = new C7180a(frequentCallsState, callConfirmationAction, 5);
                c3966o.j0(objM8596M);
            }
            nc.m10775b(fillElement, null, null, null, null, null, false, null, (InterfaceC2139c) objM8596M, c3966o, 6, 510);
            c3966o.m8623p(true);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C7181b(frequentCallsState, callConfirmationAction, i10, 8);
        }
    }

    /* renamed from: g */
    public static final void m14721g(C8141g c8141g, InterfaceC2139c navigateToScreen, InterfaceC2137a popBack, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        Object c3183a;
        C6272i c6272i;
        ArrayList arrayList;
        C7876o c7876o;
        int i12;
        int i13;
        int i14;
        boolean z6;
        Object obj;
        C8141g viewModel = c8141g;
        AbstractC4154l.m8923f(viewModel, "viewModel");
        AbstractC4154l.m8923f(navigateToScreen, "navigateToScreen");
        AbstractC4154l.m8923f(popBack, "popBack");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-1682837066);
        int i15 = 4;
        int i16 = i10 | (c3966o.m8616i(viewModel) ? 4 : 2) | (c3966o.m8616i(navigateToScreen) ? 32 : 16) | (c3966o.m8616i(popBack) ? 256 : 128);
        if (c3966o.m8598P(i16 & 1, (i16 & 147) != 146)) {
            Object objM8618k = c3966o.m8618k(AndroidCompositionLocals_androidKt.f2134b);
            int i17 = i16 & 112;
            boolean zM8616i = c3966o.m8616i(viewModel) | (i17 == 32);
            Object objM8596M = c3966o.m8596M();
            Object obj2 = C3961j.f20408a;
            InterfaceC7559c interfaceC7559c = null;
            if (zM8616i || objM8596M == obj2) {
                objM8596M = new C7351a(viewModel, navigateToScreen, interfaceC7559c, 8);
                c3966o.j0(objM8596M);
            }
            C3953b.m8503f((InterfaceC2141e) objM8596M, objM8618k, c3966o);
            C6272i c6272i2 = (C6272i) C3953b.m8509l(viewModel.f38991p, c3966o).getValue();
            ArrayList arrayList2 = new ArrayList();
            Object objM8596M2 = c3966o.m8596M();
            if (objM8596M2 == obj2) {
                objM8596M2 = C3953b.m8517t("");
                c3966o.j0(objM8596M2);
            }
            w0 w0Var = (w0) objM8596M2;
            Object objM8596M3 = c3966o.m8596M();
            if (objM8596M3 == obj2) {
                objM8596M3 = C3953b.m8517t("");
                c3966o.j0(objM8596M3);
            }
            w0 w0Var2 = (w0) objM8596M3;
            Object objM8596M4 = c3966o.m8596M();
            if (objM8596M4 == obj2) {
                objM8596M4 = C3953b.m8517t(Boolean.FALSE);
                c3966o.j0(objM8596M4);
            }
            w0 w0Var3 = (w0) objM8596M4;
            Object objM8596M5 = c3966o.m8596M();
            if (objM8596M5 == obj2) {
                objM8596M5 = new C0701l(w0Var, w0Var2, w0Var3, i15);
                c3966o.j0(objM8596M5);
            }
            InterfaceC2141e interfaceC2141e = (InterfaceC2141e) objM8596M5;
            int i18 = 10;
            if (((Boolean) w0Var3.getValue()).booleanValue()) {
                c3966o.m8607Y(1755270104);
                boolean zM8616i2 = c3966o.m8616i(viewModel);
                Object objM8596M6 = c3966o.m8596M();
                if (zM8616i2 || objM8596M6 == obj2) {
                    objM8596M6 = new C0467g(22, viewModel, w0Var, w0Var3);
                    c3966o.j0(objM8596M6);
                }
                InterfaceC2137a interfaceC2137a = (InterfaceC2137a) objM8596M6;
                Object objM8596M7 = c3966o.m8596M();
                if (objM8596M7 == obj2) {
                    objM8596M7 = new C2116p(w0Var, w0Var3, i18);
                    c3966o.j0(objM8596M7);
                }
                g2.m13165q(interfaceC2137a, (InterfaceC2137a) objM8596M7, c3966o, 48);
            } else {
                c3966o.m8607Y(1752099052);
            }
            c3966o.m8623p(false);
            arrayList2.add(new n3(R.string.all_with_count, new f3(R.drawable.icon_tab_all_calls_filled, R.drawable.icon_tab_all_calls_outlined), AbstractC6740i.m12902d(-1532680132, new C7181b(c6272i2, interfaceC2141e, 9), c3966o)));
            arrayList2.add(new n3(R.string.incoming_with_count, new f3(R.drawable.ic_tab_incoming_filled, R.drawable.ic_tab_incoming_outlined), AbstractC6740i.m12902d(-1305974747, new C7181b(c6272i2, interfaceC2141e, 10), c3966o)));
            arrayList2.add(new n3(R.string.outgoing_with_count, new f3(R.drawable.ic_tab_outgoing_filled, R.drawable.ic_tab_outgoing_outlined), AbstractC6740i.m12902d(2005999172, new C7181b(c6272i2, interfaceC2141e, 11), c3966o)));
            boolean zM8616i3 = c3966o.m8616i(arrayList2);
            Object objM8596M8 = c3966o.m8596M();
            if (zM8616i3 || objM8596M8 == obj2) {
                objM8596M8 = new C7187h(1, arrayList2);
                c3966o.j0(objM8596M8);
            }
            C6979d c6979dM13251b = b0.m13251b(0, 0, 3, (InterfaceC2137a) objM8596M8, c3966o);
            long j6 = ((v1) c3966o.m8618k(y1.f13286a)).f12967n;
            C0174b c0174b = h0.f7748a;
            C7876o c7876o2 = C7876o.f37669a;
            InterfaceC7879r interfaceC7879rM10330o = AbstractC5244c.m10330o(AbstractC0237a.m633a(c7876o2, j6, c0174b).mo14852e(AbstractC0245d.f1971c));
            C5261t c5261tM10367a = AbstractC5260s.m10367a(AbstractC5251j.f25759c, C7864c.f37654n, c3966o, 0);
            int i19 = c3966o.f20462P;
            i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879rM10330o);
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
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i19))) {
                AbstractC1452a.m4577x(i19, c3966o, i19, c7636h);
            }
            C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
            String strM10920c = t0.m10920c(c3966o, R.string.top_10_frequent_talks);
            boolean z10 = (i16 & 896) == 256;
            Object objM8596M9 = c3966o.m8596M();
            if (z10 || objM8596M9 == obj2) {
                objM8596M9 = new C5998a(26, popBack);
                c3966o.j0(objM8596M9);
            }
            g2.m13157i(null, null, false, strM10920c, 0L, 0, false, f37278a, (InterfaceC2137a) objM8596M9, c3966o, 12582912, 119);
            c3966o = c3966o;
            c3966o.m8605W(2063080958, Boolean.valueOf(c6272i2.f30441h));
            boolean zM8616i4 = c3966o.m8616i(viewModel);
            Object objM8596M10 = c3966o.m8596M();
            if (zM8616i4 || objM8596M10 == obj2) {
                i11 = i17;
                c6272i = c6272i2;
                arrayList = arrayList2;
                c7876o = c7876o2;
                i12 = 4;
                i13 = 32;
                i14 = 3;
                z6 = true;
                obj = obj2;
                c3183a = new C3183a(1, c8141g, C8141g.class, "onEvent", "onEvent(Lcom/websoptimization/callyzerbiz/ui/filters/model/AllFiltersEvent;)V", 0, 26);
                viewModel = c8141g;
                c3966o.j0(c3183a);
            } else {
                i11 = i17;
                obj = obj2;
                c6272i = c6272i2;
                c7876o = c7876o2;
                arrayList = arrayList2;
                c3183a = objM8596M10;
                i12 = 4;
                i13 = 32;
                i14 = 3;
                z6 = true;
            }
            List list = ((ur.i0) C3953b.m8509l(viewModel.f36253c, c3966o).getValue()).f36224a;
            InterfaceC2139c interfaceC2139c = (InterfaceC2139c) ((InterfaceC4566e) c3183a);
            boolean z11 = i11 == i13 ? z6 : false;
            Object objM8596M11 = c3966o.m8596M();
            if (z11 || objM8596M11 == obj) {
                objM8596M11 = new p1(i12, navigateToScreen);
                c3966o.j0(objM8596M11);
            }
            InterfaceC2137a interfaceC2137a2 = (InterfaceC2137a) objM8596M11;
            C6272i c6272i3 = c6272i;
            b1.m13099c(interfaceC2139c, list, null, interfaceC2137a2, false, c3966o, 24576, 4);
            c3966o.m8623p(false);
            C8800o c8800o = C8800o.f42459a;
            b1.m13088R(C8800o.m16189M(C8800o.m16184H(c6272i3.f30438e)) + " - " + C8800o.m16189M(C8800o.m16184H(c6272i3.f30439f)), c3966o, 0);
            b1.m13094X(arrayList, c6979dM13251b, null, AbstractC0245d.m686w(c7876o, null, i14), null, c3966o, 3072);
            c3966o.m8623p(z6);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new f0(c8141g, navigateToScreen, popBack, i10, 16);
        }
    }
}
