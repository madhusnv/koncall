package og;

import al.C0174b;
import androidx.compose.foundation.AbstractC0237a;
import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.layout.AbstractC0245d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import aq.C0401d;
import au.C0457u;
import bt.C0769n;
import bu.C0782a;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.R;
import d3.C1559m;
import d7.InterfaceC1637j;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import fu.C2373a;
import fu.C2375c;
import fw.C2392f;
import g7.C2536a;
import h7.AbstractC2868a;
import java.util.List;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import ng.AbstractC5068s;
import o1.AbstractC5251j;
import o1.AbstractC5256o;
import o1.AbstractC5260s;
import o1.C5261t;
import pg.AbstractC5928i;
import r4.C6456k;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7870i;
import w2.C7876o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class ee {
    /* renamed from: a */
    public static final void m10629a(String text, InterfaceC3962k interfaceC3962k, int i10) {
        AbstractC4154l.m8923f(text, "text");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(994400996);
        int i11 = i10 | (c3966o.m8614g(text) ? 4 : 2);
        if (c3966o.m8598P(i11 & 1, (i11 & 3) != 2)) {
            C7870i c7870i = C7864c.f37652l;
            float f6 = 10;
            C7876o c7876o = C7876o.f37669a;
            InterfaceC7879r interfaceC7879rM656j = AbstractC0242a.m656j(c7876o, f6);
            o1.n1 n1VarM10357a = o1.m1.m10357a(AbstractC5251j.f25757a, c7870i, c3966o, 48);
            int i12 = c3966o.f20462P;
            k2.i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879rM656j);
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
            pg.i0.m11693a(pg.b9.m11551a(R.drawable.ic_info, 0, c3966o), "info", AbstractC0245d.m678o(c7876o, 22), null, null, DefinitionKt.NO_Float_VALUE, new C1559m(5, AbstractC5068s.m9996a(c3966o, R.color.notes_na_icon_color)), c3966o, 432, 56);
            sq.b1.m13113q(text, AbstractC0242a.m660n(c7876o, f6, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 14), AbstractC5068s.m9996a(c3966o, R.color.notes_na_icon_color), null, new C6456k(5), 0, 0, 0L, null, ((g2.vd) c3966o.m8618k(g2.xd.f13268a)).f13056l, c3966o, (i11 & 14) | 48, 488);
            c3966o = c3966o;
            c3966o.m8623p(true);
        } else {
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0457u(text, i10, 10);
        }
    }

    /* renamed from: b */
    public static final void m10630b(l7.a0 navController, InterfaceC3962k interfaceC3962k, int i10) {
        AbstractC4154l.m8923f(navController, "navController");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-1014298098);
        int i11 = i10 | (c3966o.m8616i(navController) ? 4 : 2);
        if (c3966o.m8598P(i11 & 1, (i11 & 3) != 2)) {
            c3966o.m8608Z(1890788296);
            d7.c1 c1VarM6992a = AbstractC2868a.m6992a(c3966o);
            if (c1VarM6992a == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            C2392f c2392fM11854a = pg.r9.m11854a(c1VarM6992a, c3966o);
            c3966o.m8608Z(1729797275);
            d7.w0 w0VarM11692c = AbstractC5928i.m11692c(C2375c.class, c1VarM6992a, c2392fM11854a, c1VarM6992a instanceof InterfaceC1637j ? ((InterfaceC1637j) c1VarM6992a).getDefaultViewModelCreationExtras() : C2536a.f13867b, c3966o);
            c3966o.m8623p(false);
            c3966o.m8623p(false);
            C2375c c2375c = (C2375c) w0VarM11692c;
            C2373a c2373a = (C2373a) C3953b.m8509l(c2375c.f10812f, c3966o).getValue();
            Object objM8618k = c3966o.m8618k(AndroidCompositionLocals_androidKt.f2134b);
            boolean zM8616i = c3966o.m8616i(c2375c);
            Object objM8596M = c3966o.m8596M();
            k2.s0 s0Var = C3961j.f20408a;
            if (zM8616i || objM8596M == s0Var) {
                objM8596M = new C0782a(c2375c, null, 4);
                c3966o.j0(objM8596M);
            }
            C3953b.m8503f((InterfaceC2141e) objM8596M, objM8618k, c3966o);
            long j6 = ((g2.v1) c3966o.m8618k(g2.y1.f13286a)).f12967n;
            C0174b c0174b = d3.h0.f7748a;
            C7876o c7876o = C7876o.f37669a;
            InterfaceC7879r interfaceC7879rMo14852e = AbstractC0237a.m633a(c7876o, j6, c0174b).mo14852e(AbstractC0245d.f1971c);
            C5261t c5261tM10367a = AbstractC5260s.m10367a(AbstractC5251j.f25759c, C7864c.f37654n, c3966o, 0);
            int i12 = c3966o.f20462P;
            k2.i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879rMo14852e);
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
            String strM11629c = pg.f9.m11629c(c3966o, R.string.not_sync_notification);
            boolean zM8616i2 = c3966o.m8616i(navController);
            Object objM8596M2 = c3966o.m8596M();
            if (zM8616i2 || objM8596M2 == s0Var) {
                objM8596M2 = new C0401d(navController, 9);
                c3966o.j0(objM8596M2);
            }
            sq.g2.m13157i(null, null, false, strM11629c, 0L, 0, false, null, (InterfaceC2137a) objM8596M2, c3966o, 0, 247);
            m10629a(pg.f9.m11629c(c3966o, R.string.sync_notification_hour), c3966o, 0);
            InterfaceC7879r interfaceC7879rM658l = AbstractC0242a.m658l(c7876o, 15, DefinitionKt.NO_Float_VALUE, 2);
            t3.j0 j0VarM10361d = AbstractC5256o.m10361d(C7864c.f37642a, false);
            int i13 = c3966o.f20462P;
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
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i13))) {
                AbstractC1452a.m4577x(i13, c3966o, i13, c7636h3);
            }
            C3953b.m8521x(c7636h4, interfaceC7879rM14845c2, c3966o);
            List list = c2373a.f10803a;
            boolean zM8616i3 = c3966o.m8616i(c2375c);
            Object objM8596M3 = c3966o.m8596M();
            if (zM8616i3 || objM8596M3 == s0Var) {
                objM8596M3 = new an.j2(12, c2375c);
                c3966o.j0(objM8596M3);
            }
            he.m10684a(list, (InterfaceC2139c) objM8596M3, c3966o, 0);
            c3966o.m8623p(true);
            c3966o.m8623p(true);
        } else {
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0769n(navController, i10, 2);
        }
    }
}
