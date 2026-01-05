package pg;

import androidx.compose.foundation.AbstractC0237a;
import androidx.compose.foundation.ScrollingLayoutElement;
import androidx.compose.foundation.layout.AbstractC0245d;
import bt.C0769n;
import c9.C0917l;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.R;
import d7.InterfaceC1637j;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import fw.C2392f;
import g7.C2536a;
import h7.AbstractC2868a;
import java.util.WeakHashMap;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import mq.C4833a;
import o1.AbstractC5244c;
import o1.AbstractC5251j;
import o1.AbstractC5260s;
import o1.C5243b;
import o1.C5261t;
import og.hg;
import og.nc;
import tp.C7188i;
import v3.C7636h;
import v3.C7638j;
import v3.InterfaceC7639k;
import vu.C7788a;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7876o;
import w2.InterfaceC7879r;
import wu.C8186a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class j0 {
    /* renamed from: a */
    public static final void m11706a(l7.a0 navController, InterfaceC3962k interfaceC3962k, int i10) {
        AbstractC4154l.m8923f(navController, "navController");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(1052176670);
        int i11 = (c3966o.m8616i(navController) ? 4 : 2) | i10;
        int i12 = 1;
        if (c3966o.m8598P(i11 & 1, (i11 & 3) != 2)) {
            c3966o.m8608Z(1890788296);
            d7.c1 c1VarM6992a = AbstractC2868a.m6992a(c3966o);
            if (c1VarM6992a == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            C2392f c2392fM11854a = r9.m11854a(c1VarM6992a, c3966o);
            c3966o.m8608Z(1729797275);
            d7.w0 w0VarM11692c = AbstractC5928i.m11692c(C8186a.class, c1VarM6992a, c2392fM11854a, c1VarM6992a instanceof InterfaceC1637j ? ((InterfaceC1637j) c1VarM6992a).getDefaultViewModelCreationExtras() : C2536a.f13867b, c3966o);
            c3966o.m8623p(false);
            c3966o.m8623p(false);
            C7788a c7788a = (C7788a) C3953b.m8509l(((C8186a) w0VarM11692c).f39155d, c3966o).getValue();
            InterfaceC7879r interfaceC7879rMo14852e = AbstractC0237a.m633a(C7876o.f37669a, ((g2.v1) c3966o.m8618k(g2.y1.f13286a)).f12967n, d3.h0.f7748a).mo14852e(AbstractC0245d.f1971c);
            C5261t c5261tM10367a = AbstractC5260s.m10367a(AbstractC5251j.f25759c, C7864c.f37654n, c3966o, 0);
            int i13 = c3966o.f20462P;
            k2.i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879rMo14852e);
            InterfaceC7639k.V0.getClass();
            InterfaceC2137a interfaceC2137a = C7638j.f36921b;
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(interfaceC2137a);
            } else {
                c3966o.m0();
            }
            C3953b.m8521x(C7638j.f36925f, c5261tM10367a, c3966o);
            C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o);
            C7636h c7636h = C7638j.f36926g;
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i13))) {
                AbstractC1452a.m4577x(i13, c3966o, i13, c7636h);
            }
            C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
            String strM11629c = f9.m11629c(c3966o, R.string.whats_new);
            String str = c7788a.f37453b;
            boolean zM8616i = c3966o.m8616i(navController);
            Object objM8596M = c3966o.m8596M();
            Object obj = C3961j.f20408a;
            if (zM8616i || objM8596M == obj) {
                objM8596M = new C7188i(navController, i12);
                c3966o.j0(objM8596M);
            }
            sq.g2.m13159k(null, null, strM11629c, str, 0L, 0, null, (InterfaceC2137a) objM8596M, c3966o, 0, 243);
            if (c7788a.f37454c) {
                c3966o.m8607Y(1053486390);
                sq.b1.m13072B(0, 2, f9.m11629c(c3966o, R.string.no_data_found), c3966o, null);
                c3966o.m8623p(false);
            } else {
                c3966o.m8607Y(1053585807);
                WeakHashMap weakHashMap = o1.w1.f25863v;
                o1.y0 y0VarM10323h = AbstractC5244c.m10323h(C5243b.m10315e(c3966o).f25868e, c3966o);
                boolean zM8616i2 = c3966o.m8616i(c7788a);
                Object objM8596M2 = c3966o.m8596M();
                if (zM8616i2 || objM8596M2 == obj) {
                    objM8596M2 = new C4833a(24, c7788a);
                    c3966o.j0(objM8596M2);
                }
                nc.m10775b(null, null, y0VarM10323h, null, null, null, false, null, (InterfaceC2139c) objM8596M2, c3966o, 0, 507);
                c3966o.m8623p(false);
            }
            c3966o.m8623p(true);
        } else {
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0769n(navController, i10, 9);
        }
    }

    /* renamed from: b */
    public static final i1.p1 m11707b(InterfaceC3962k interfaceC3962k) {
        Object[] objArr = new Object[0];
        C0917l c0917l = i1.p1.f16952i;
        boolean zM8612e = ((C3966o) interfaceC3962k).m8612e(0);
        C3966o c3966o = (C3966o) interfaceC3962k;
        Object objM8596M = c3966o.m8596M();
        if (zM8612e || objM8596M == C3961j.f20408a) {
            objM8596M = new i1.r0(0, 2);
            c3966o.j0(objM8596M);
        }
        return (i1.p1) hg.m10691b(objArr, c0917l, (InterfaceC2137a) objM8596M, c3966o, 0, 4);
    }

    /* renamed from: c */
    public static InterfaceC7879r m11708c(InterfaceC7879r interfaceC7879r, i1.p1 p1Var, boolean z6, boolean z10) {
        return AbstractC0237a.m643k(interfaceC7879r, p1Var, z10 ? k1.x0.Vertical : k1.x0.Horizontal, z6, null, p1Var.f16955c, true, null, null).mo14852e(new ScrollingLayoutElement(p1Var, z10));
    }
}
