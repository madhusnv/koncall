package aq;

import ac.C0088a;
import al.C0174b;
import androidx.compose.foundation.AbstractC0237a;
import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.layout.AbstractC0245d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ao.C0372k;
import bq.C0737q;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.R;
import d3.h0;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import g2.e6;
import g2.v1;
import g2.vd;
import g2.xd;
import g2.y1;
import i0.m0;
import i3.AbstractC3166c;
import java.util.List;
import java.util.WeakHashMap;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.i1;
import k2.l1;
import kotlin.jvm.internal.AbstractC4154l;
import l7.a0;
import lx.InterfaceC4566e;
import o1.AbstractC5244c;
import o1.AbstractC5251j;
import o1.AbstractC5260s;
import o1.C5243b;
import o1.C5261t;
import o1.m1;
import o1.n1;
import o1.w1;
import o1.y0;
import og.ke;
import og.nc;
import pg.b9;
import pg.f9;
import q1.C6097y;
import q1.b0;
import qp.C6274k;
import qr.g0;
import s2.C6734c;
import sq.b1;
import sq.g2;
import tx.InterfaceC7266z;
import ur.i0;
import uw.C7565i;
import uw.InterfaceC7559c;
import v3.C7636h;
import v3.C7638j;
import v3.InterfaceC7639k;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7870i;
import w2.C7876o;
import w2.InterfaceC7879r;
import wx.w0;
import yv.C8800o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: aq.b */
/* loaded from: classes3.dex */
public abstract class AbstractC0399b {

    /* renamed from: a */
    public static final C6734c f3098a = new C6734c(new C0398a(0), false, -1019524705);

    /* renamed from: b */
    public static final C6734c f3099b = new C6734c(new C0398a(1), false, 1313629981);

    /* renamed from: a */
    public static final void m1434a(C0737q c0737q, a0 navController, InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o;
        int i11;
        InterfaceC7559c interfaceC7559c;
        boolean z6;
        l1 l1Var;
        Object c0088a;
        C7636h c7636h;
        C6274k c6274k;
        C7636h c7636h2;
        C7636h c7636h3;
        C7876o c7876o;
        Object obj;
        C6097y c6097y;
        int i12;
        C0737q viewModel = c0737q;
        AbstractC4154l.m8923f(viewModel, "viewModel");
        w0 w0Var = viewModel.f36253c;
        AbstractC4154l.m8923f(navController, "navController");
        C3966o c3966o2 = (C3966o) interfaceC3962k;
        c3966o2.a0(1261145603);
        int i13 = (c3966o2.m8616i(viewModel) ? 4 : 2) | i10 | (c3966o2.m8616i(navController) ? 32 : 16);
        if (c3966o2.m8598P(i13 & 1, (i13 & 19) != 18)) {
            C6274k c6274k2 = (C6274k) C3953b.m8509l(viewModel.f4650o, c3966o2).getValue();
            C6097y c6097yM12082a = b0.m12082a(0, 3, c3966o2);
            Object objM8596M = c3966o2.m8596M();
            Object obj2 = C3961j.f20408a;
            if (objM8596M == obj2) {
                objM8596M = C3953b.m8510m(C7565i.f36440a, c3966o2);
                c3966o2.j0(objM8596M);
            }
            Object obj3 = (InterfaceC7266z) objM8596M;
            boolean zM8616i = c3966o2.m8616i(navController);
            Object objM8596M2 = c3966o2.m8596M();
            if (zM8616i || objM8596M2 == obj2) {
                objM8596M2 = new C0401d(navController, 0);
                c3966o2.j0(objM8596M2);
            }
            ke.m10735a(false, (InterfaceC2137a) objM8596M2, c3966o2, 6, 0);
            boolean zM8614g = c3966o2.m8614g(c6097yM12082a) | c3966o2.m8616i(obj3) | c3966o2.m8616i(viewModel);
            Object objM8596M3 = c3966o2.m8596M();
            if (zM8614g || objM8596M3 == obj2) {
                Object c0406i = new C0406i(c6097yM12082a, obj3, c0737q, null, 0);
                viewModel = c0737q;
                interfaceC7559c = null;
                c3966o2.j0(c0406i);
                objM8596M3 = c0406i;
            } else {
                interfaceC7559c = null;
            }
            C3953b.m8503f((InterfaceC2141e) objM8596M3, c6097yM12082a, c3966o2);
            Object objM8618k = c3966o2.m8618k(AndroidCompositionLocals_androidKt.f2134b);
            boolean zM8616i2 = c3966o2.m8616i(viewModel) | c3966o2.m8616i(navController);
            Object objM8596M4 = c3966o2.m8596M();
            if (zM8616i2 || objM8596M4 == obj2) {
                objM8596M4 = new C0372k(viewModel, navController, interfaceC7559c, 3);
                c3966o2.j0(objM8596M4);
            }
            C3953b.m8503f((InterfaceC2141e) objM8596M4, objM8618k, c3966o2);
            l1 l1Var2 = y1.f13286a;
            long j6 = ((v1) c3966o2.m8618k(l1Var2)).f12967n;
            C0174b c0174b = h0.f7748a;
            C7876o c7876o2 = C7876o.f37669a;
            InterfaceC7879r interfaceC7879rMo14852e = AbstractC0237a.m633a(c7876o2, j6, c0174b).mo14852e(AbstractC0245d.f1971c);
            C5261t c5261tM10367a = AbstractC5260s.m10367a(AbstractC5251j.f25759c, C7864c.f37654n, c3966o2, 0);
            int i14 = c3966o2.f20462P;
            i1 i1VarM8620m = c3966o2.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o2, interfaceC7879rMo14852e);
            InterfaceC7639k.V0.getClass();
            InterfaceC2137a interfaceC2137a = C7638j.f36921b;
            c3966o2.c0();
            if (c3966o2.f20461O) {
                c3966o2.m8619l(interfaceC2137a);
            } else {
                c3966o2.m0();
            }
            C7636h c7636h4 = C7638j.f36925f;
            C3953b.m8521x(c7636h4, c5261tM10367a, c3966o2);
            C7636h c7636h5 = C7638j.f36924e;
            C3953b.m8521x(c7636h5, i1VarM8620m, c3966o2);
            C7636h c7636h6 = C7638j.f36926g;
            if (c3966o2.f20461O || !AbstractC4154l.m8918a(c3966o2.m8596M(), Integer.valueOf(i14))) {
                AbstractC1452a.m4577x(i14, c3966o2, i14, c7636h6);
            }
            C7636h c7636h7 = C7638j.f36923d;
            C3953b.m8521x(c7636h7, interfaceC7879rM14845c, c3966o2);
            String strM11629c = f9.m11629c(c3966o2, R.string.unique_calls);
            boolean zM8616i3 = c3966o2.m8616i(navController);
            Object objM8596M5 = c3966o2.m8596M();
            if (zM8616i3 || objM8596M5 == obj2) {
                z6 = true;
                objM8596M5 = new C0401d(navController, 1);
                c3966o2.j0(objM8596M5);
            } else {
                z6 = true;
            }
            g2.m13157i(null, null, false, strM11629c, 0L, 0, false, f3098a, (InterfaceC2137a) objM8596M5, c3966o2, 12582912, 119);
            c3966o2.m8605W(1781341979, Boolean.valueOf(c6274k2.f30476k));
            boolean zM8616i4 = c3966o2.m8616i(viewModel);
            Object objM8596M6 = c3966o2.m8596M();
            if (zM8616i4 || objM8596M6 == obj2) {
                l1Var = l1Var2;
                c7636h = c7636h6;
                c6274k = c6274k2;
                c7636h2 = c7636h7;
                c7636h3 = c7636h5;
                c7876o = c7876o2;
                obj = obj2;
                c6097y = c6097yM12082a;
                i12 = 2;
                c0088a = new C0088a(1, viewModel, C0737q.class, "onEvent", "onEvent(Lcom/websoptimization/callyzerbiz/ui/filters/model/AllFiltersEvent;)V", 0, 12);
                c3966o2.j0(c0088a);
            } else {
                l1Var = l1Var2;
                obj = obj2;
                c6274k = c6274k2;
                c7636h3 = c7636h5;
                c7636h2 = c7636h7;
                c0088a = objM8596M6;
                c7876o = c7876o2;
                i12 = 2;
                c7636h = c7636h6;
                c6097y = c6097yM12082a;
            }
            List list = ((i0) C3953b.m8509l(w0Var, c3966o2).getValue()).f36224a;
            g0 g0Var = ((i0) C3953b.m8509l(w0Var, c3966o2).getValue()).f36227d;
            InterfaceC2139c interfaceC2139c = (InterfaceC2139c) ((InterfaceC4566e) c0088a);
            boolean zM8616i5 = c3966o2.m8616i(navController);
            Object objM8596M7 = c3966o2.m8596M();
            if (zM8616i5 || objM8596M7 == obj) {
                objM8596M7 = new C0401d(navController, i12);
                c3966o2.j0(objM8596M7);
            }
            InterfaceC2137a interfaceC2137a2 = (InterfaceC2137a) objM8596M7;
            Object obj4 = obj;
            C7636h c7636h8 = c7636h3;
            C7636h c7636h9 = c7636h;
            C7636h c7636h10 = c7636h2;
            C6274k c6274k3 = c6274k;
            l1 l1Var3 = l1Var;
            b1.m13099c(interfaceC2139c, list, g0Var, interfaceC2137a2, false, c3966o2, 24576, 0);
            c3966o2.m8623p(false);
            C7870i c7870i = C7864c.f37652l;
            float f6 = 10;
            InterfaceC7879r interfaceC7879rM657k = AbstractC0242a.m657k(c7876o, 12, f6);
            n1 n1VarM10357a = m1.m10357a(AbstractC5251j.f25757a, c7870i, c3966o2, 48);
            int i15 = c3966o2.f20462P;
            i1 i1VarM8620m2 = c3966o2.m8620m();
            InterfaceC7879r interfaceC7879rM14845c2 = AbstractC7862a.m14845c(c3966o2, interfaceC7879rM657k);
            c3966o2.c0();
            if (c3966o2.f20461O) {
                c3966o2.m8619l(interfaceC2137a);
            } else {
                c3966o2.m0();
            }
            C3953b.m8521x(c7636h4, n1VarM10357a, c3966o2);
            C3953b.m8521x(c7636h8, i1VarM8620m2, c3966o2);
            if (c3966o2.f20461O || !AbstractC4154l.m8918a(c3966o2.m8596M(), Integer.valueOf(i15))) {
                AbstractC1452a.m4577x(i15, c3966o2, i15, c7636h9);
            }
            C3953b.m8521x(c7636h10, interfaceC7879rM14845c2, c3966o2);
            AbstractC3166c abstractC3166cM11551a = b9.m11551a(R.drawable.ic_calender, 0, c3966o2);
            InterfaceC7879r interfaceC7879rM660n = AbstractC0242a.m660n(c7876o, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, f6, DefinitionKt.NO_Float_VALUE, 11);
            long j10 = ((v1) c3966o2.m8618k(l1Var3)).f12959f;
            i11 = 0;
            e6.m6132a(abstractC3166cM11551a, "", interfaceC7879rM660n, j10, c3966o2, 432, 0);
            C8800o c8800o = C8800o.f42459a;
            b1.m13113q(m0.m7379l(C8800o.m16189M(C8800o.m16184H(c6274k3.f30471f)), " - ", C8800o.m16189M(C8800o.m16184H(c6274k3.f30472g))), null, 0L, null, null, 0, 0, 0L, null, ((vd) c3966o2.m8618k(xd.f13268a)).f13050f, c3966o2, 0, 510);
            c3966o2.m8623p(true);
            if (c6274k3.f30483r) {
                c3966o2.m8607Y(-611607792);
                b1.m13072B(0, 3, null, c3966o2, null);
            } else {
                c3966o2.m8607Y(-617276235);
            }
            c3966o2.m8623p(false);
            WeakHashMap weakHashMap = w1.f25863v;
            y0 y0VarM10323h = AbstractC5244c.m10323h(C5243b.m10315e(c3966o2).f25868e, c3966o2);
            boolean zM8616i6 = c3966o2.m8616i(c6274k3);
            Object objM8596M8 = c3966o2.m8596M();
            if (zM8616i6 || objM8596M8 == obj4) {
                objM8596M8 = new C0402e(c6274k3, 0);
                c3966o2.j0(objM8596M8);
            }
            nc.m10775b(null, c6097y, y0VarM10323h, null, null, null, false, null, (InterfaceC2139c) objM8596M8, c3966o2, 0, 505);
            c3966o = c3966o2;
            c3966o.m8623p(true);
        } else {
            c3966o = c3966o2;
            i11 = 0;
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0403f(c0737q, navController, i10, i11);
        }
    }
}
