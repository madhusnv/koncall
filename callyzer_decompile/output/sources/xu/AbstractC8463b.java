package xu;

import an.b2;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import bt.k0;
import bt.p0;
import c9.AbstractC0911f;
import com.amplifyframework.auth.cognito.C1139f;
import com.skydoves.balloon.internals.DefinitionKt;
import com.websoptimization.callyzerbiz.R;
import d7.InterfaceC1637j;
import d7.c1;
import ds.C1788l;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import fw.C2392f;
import g2.l8;
import g7.C2536a;
import gr.C2713i;
import h7.AbstractC2868a;
import hq.C3002g;
import java.util.List;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.n1;
import k2.s0;
import k2.w0;
import kotlin.jvm.internal.AbstractC4154l;
import l7.a0;
import l7.n0;
import mq.i0;
import ng.AbstractC5068s;
import o1.h1;
import og.p1;
import og.qd;
import og.r1;
import og.t0;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import p004e.AbstractActivityC1878m;
import pg.AbstractC5928i;
import pg.r9;
import q1.C6097y;
import q1.b0;
import qc.C6158d;
import qr.f0;
import rr.C6609i;
import s2.AbstractC6740i;
import s2.C6734c;
import sq.g2;
import tp.C7188i;
import tx.InterfaceC7266z;
import uw.C7565i;
import vs.C7759a;
import w1.AbstractC7861e;
import w2.C7876o;
import wx.InterfaceC8209j;
import xm.h3;
import xp.C8426g;
import xv.C8474a;
import xv.C8489p;
import yv.C8791f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xu.b */
/* loaded from: classes3.dex */
public abstract class AbstractC8463b {

    /* renamed from: a */
    public static final C6734c f41259a = new C6734c(new C7759a(12), false, -713947339);

    /* renamed from: b */
    public static final C6734c f41260b = new C6734c(new C8462a(), false, -11563296);

    /* renamed from: a */
    public static final void m15768a(C8489p permissionsViewModel, InterfaceC2139c onCreateNavController, InterfaceC2139c onCreateBottomNavController, InterfaceC3962k interfaceC3962k, int i10) {
        AbstractC4154l.m8923f(permissionsViewModel, "permissionsViewModel");
        AbstractC4154l.m8923f(onCreateNavController, "onCreateNavController");
        AbstractC4154l.m8923f(onCreateBottomNavController, "onCreateBottomNavController");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-1254216168);
        int i11 = (c3966o.m8616i(permissionsViewModel) ? 4 : 2) | i10 | (c3966o.m8616i(onCreateNavController) ? 32 : 16) | (c3966o.m8616i(onCreateBottomNavController) ? 256 : 128);
        if (c3966o.m8598P(i11 & 1, (i11 & 147) != 146)) {
            C8474a c8474a = (C8474a) qd.m10853a(permissionsViewModel.f41349E, c3966o).getValue();
            C8791f c8791f = C8791f.f42457a;
            Object obj = (AbstractActivityC1878m) c3966o.m8618k(C8791f.f42458b);
            a0 a0VarM10813c = p1.m10813c(new n0[0], c3966o);
            onCreateNavController.invoke(a0VarM10813c);
            Boolean bool = Boolean.TRUE;
            boolean zM8616i = c3966o.m8616i(permissionsViewModel) | c3966o.m8616i(a0VarM10813c);
            Object objM8596M = c3966o.m8596M();
            Object obj2 = C3961j.f20408a;
            if (zM8616i || objM8596M == obj2) {
                objM8596M = new h3(permissionsViewModel, a0VarM10813c, null, 18);
                c3966o.j0(objM8596M);
            }
            C3953b.m8503f((InterfaceC2141e) objM8596M, bool, c3966o);
            if (C8791f.m16171d(c8474a.f41292c)) {
                c3966o.m8607Y(1862492234);
                m15771d((i11 >> 3) & 112, onCreateBottomNavController, c8474a.f41292c, c3966o, a0VarM10813c);
            } else {
                c3966o.m8607Y(1844803882);
            }
            c3966o.m8623p(false);
            if (c8474a.f41291b) {
                c3966o.m8607Y(1862767731);
                String strM10920c = t0.m10920c(c3966o, R.string.account_mobile_no_updated);
                boolean zM8616i2 = c3966o.m8616i(obj);
                Object objM8596M2 = c3966o.m8596M();
                if (zM8616i2 || objM8596M2 == obj2) {
                    objM8596M2 = new C6158d(17, obj);
                    c3966o.j0(objM8596M2);
                }
                g2.m13128F(strM10920c, 0, false, false, null, (InterfaceC2137a) objM8596M2, c3966o, 0, 30);
            } else {
                c3966o.m8607Y(1844803882);
            }
            c3966o.m8623p(false);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new f0((Object) permissionsViewModel, (Object) onCreateNavController, (Object) onCreateBottomNavController, i10, 28);
        }
    }

    /* renamed from: b */
    public static final void m15769b(String str, List list, InterfaceC2139c navigationItemClick, boolean z6, InterfaceC3962k interfaceC3962k, int i10) {
        AbstractC4154l.m8923f(navigationItemClick, "navigationItemClick");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(1589067704);
        int i11 = i10 | (c3966o.m8614g(str) ? 4 : 2) | (c3966o.m8616i(list) ? 32 : 16) | (c3966o.m8616i(navigationItemClick) ? 256 : 128) | (c3966o.m8615h(z6) ? NewHope.SENDB_BYTES : 1024);
        if (c3966o.m8598P(i11 & 1, (i11 & 1171) != 1170)) {
            Object objM8596M = c3966o.m8596M();
            s0 s0Var = C3961j.f20408a;
            if (objM8596M == s0Var) {
                objM8596M = C3953b.m8510m(C7565i.f36440a, c3966o);
                c3966o.j0(objM8596M);
            }
            InterfaceC7266z interfaceC7266z = (InterfaceC7266z) objM8596M;
            Object objM8596M2 = c3966o.m8596M();
            if (objM8596M2 == s0Var) {
                objM8596M2 = C3953b.m8517t(Boolean.valueOf(z6));
                c3966o.j0(objM8596M2);
            }
            w0 w0Var = (w0) objM8596M2;
            float f6 = 15;
            l8.m6201a(AbstractC0911f.m2617a(C7876o.f37669a, AbstractC7861e.m14842c(f6, f6)), AbstractC5068s.m9996a(c3966o, R.color.card_background), 0L, DefinitionKt.NO_Float_VALUE, null, AbstractC6740i.m12902d(571556593, new p0(list, str, navigationItemClick, interfaceC7266z, w0Var, 8), c3966o), c3966o, 196608);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C1788l(str, list, navigationItemClick, z6, i10);
        }
    }

    /* renamed from: c */
    public static final void m15770c(a0 navController, a0 bottomNavigationController, List list, InterfaceC8209j refreshChannel, h1 padding, InterfaceC2139c setInfoMessageCallback, String str, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        C3966o c3966o;
        boolean z6;
        AbstractC4154l.m8923f(navController, "navController");
        AbstractC4154l.m8923f(bottomNavigationController, "bottomNavigationController");
        AbstractC4154l.m8923f(refreshChannel, "refreshChannel");
        AbstractC4154l.m8923f(padding, "padding");
        AbstractC4154l.m8923f(setInfoMessageCallback, "setInfoMessageCallback");
        C3966o c3966o2 = (C3966o) interfaceC3962k;
        c3966o2.a0(185260963);
        if ((i10 & 6) == 0) {
            i11 = (c3966o2.m8616i(navController) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c3966o2.m8616i(bottomNavigationController) ? 32 : 16;
        }
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            i11 |= c3966o2.m8616i(list) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c3966o2.m8616i(refreshChannel) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c3966o2.m8614g(padding) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c3966o2.m8616i(setInfoMessageCallback) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c3966o2.m8614g(str) ? 1048576 : 524288;
        }
        int i12 = i11;
        if (c3966o2.m8598P(i12 & 1, (599187 & i12) != 599186)) {
            C6097y c6097yM12082a = b0.m12082a(0, 3, c3966o2);
            c3966o2.m8608Z(1890788296);
            c1 c1VarM6992a = AbstractC2868a.m6992a(c3966o2);
            if (c1VarM6992a == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            C2392f c2392fM11854a = r9.m11854a(c1VarM6992a, c3966o2);
            c3966o2.m8608Z(1729797275);
            d7.w0 w0VarM11692c = AbstractC5928i.m11692c(C2713i.class, c1VarM6992a, c2392fM11854a, c1VarM6992a instanceof InterfaceC1637j ? ((InterfaceC1637j) c1VarM6992a).getDefaultViewModelCreationExtras() : C2536a.f13867b, c3966o2);
            c3966o2.m8623p(false);
            c3966o2.m8623p(false);
            C2713i c2713i = (C2713i) w0VarM11692c;
            c3966o2.m8608Z(1890788296);
            c1 c1VarM6992a2 = AbstractC2868a.m6992a(c3966o2);
            if (c1VarM6992a2 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            C2392f c2392fM11854a2 = r9.m11854a(c1VarM6992a2, c3966o2);
            c3966o2.m8608Z(1729797275);
            d7.w0 w0VarM11692c2 = AbstractC5928i.m11692c(i0.class, c1VarM6992a2, c2392fM11854a2, c1VarM6992a2 instanceof InterfaceC1637j ? ((InterfaceC1637j) c1VarM6992a2).getDefaultViewModelCreationExtras() : C2536a.f13867b, c3966o2);
            c3966o2.m8623p(false);
            c3966o2.m8623p(false);
            i0 i0Var = (i0) w0VarM11692c2;
            Context context = (Context) c3966o2.m8618k(AndroidCompositionLocals_androidKt.f2134b);
            boolean zM8616i = c3966o2.m8616i(c2713i) | c3966o2.m8616i(refreshChannel);
            Object objM8596M = c3966o2.m8596M();
            s0 s0Var = C3961j.f20408a;
            if (zM8616i || objM8596M == s0Var) {
                objM8596M = new C8426g(c2713i, refreshChannel, null, 2);
                c3966o2.j0(objM8596M);
            }
            C3953b.m8503f((InterfaceC2141e) objM8596M, context, c3966o2);
            if (str != null) {
                c3966o2.m8607Y(77165115);
                boolean zM8616i2 = c3966o2.m8616i(list) | c3966o2.m8616i(navController) | c3966o2.m8616i(i0Var) | ((57344 & i12) == 16384) | ((458752 & i12) == 131072) | c3966o2.m8616i(c2713i) | c3966o2.m8614g(c6097yM12082a);
                Object objM8596M2 = c3966o2.m8596M();
                if (zM8616i2 || objM8596M2 == s0Var) {
                    C1139f c1139f = new C1139f(list, navController, i0Var, padding, setInfoMessageCallback, c2713i, c6097yM12082a, 3);
                    c3966o2.j0(c1139f);
                    objM8596M2 = c1139f;
                }
                c3966o = c3966o2;
                r1.m10867a(bottomNavigationController, str, null, null, null, null, null, null, (InterfaceC2139c) objM8596M2, c3966o, ((i12 >> 3) & 14) | ((i12 >> 15) & 112));
                z6 = false;
            } else {
                c3966o = c3966o2;
                z6 = false;
                c3966o.m8607Y(65340351);
            }
            c3966o.m8623p(z6);
        } else {
            c3966o = c3966o2;
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C6609i(navController, bottomNavigationController, list, refreshChannel, padding, setInfoMessageCallback, str, i10);
        }
    }

    /* renamed from: d */
    public static final void m15771d(int i10, InterfaceC2139c onCreateBottomNavigationController, String str, InterfaceC3962k interfaceC3962k, a0 navController) {
        int i11;
        AbstractC4154l.m8923f(onCreateBottomNavigationController, "onCreateBottomNavigationController");
        AbstractC4154l.m8923f(navController, "navController");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(1481156462);
        if ((i10 & 6) == 0) {
            i11 = (c3966o.m8614g(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c3966o.m8616i(onCreateBottomNavigationController) ? 32 : 16;
        }
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            i11 |= c3966o.m8616i(navController) ? 256 : 128;
        }
        if (c3966o.m8598P(i11 & 1, (i11 & 147) != 146)) {
            Object objM8596M = c3966o.m8596M();
            s0 s0Var = C3961j.f20408a;
            if (objM8596M == s0Var) {
                objM8596M = C3953b.m8517t(null);
                c3966o.j0(objM8596M);
            }
            w0 w0Var = (w0) objM8596M;
            boolean zM8616i = c3966o.m8616i(navController);
            Object objM8596M2 = c3966o.m8596M();
            if (zM8616i || objM8596M2 == s0Var) {
                objM8596M2 = new C3002g(navController, 10);
                c3966o.j0(objM8596M2);
            }
            InterfaceC2139c interfaceC2139c = (InterfaceC2139c) objM8596M2;
            boolean zM8616i2 = c3966o.m8616i(navController);
            Object objM8596M3 = c3966o.m8596M();
            if (zM8616i2 || objM8596M3 == s0Var) {
                objM8596M3 = new C7188i(navController, 17);
                c3966o.j0(objM8596M3);
            }
            InterfaceC2137a interfaceC2137a = (InterfaceC2137a) objM8596M3;
            boolean zM8616i3 = c3966o.m8616i(navController) | c3966o.m8614g(interfaceC2139c) | ((i11 & 112) == 32) | c3966o.m8614g(interfaceC2137a);
            Object objM8596M4 = c3966o.m8596M();
            if (zM8616i3 || objM8596M4 == s0Var) {
                b2 b2Var = new b2(navController, interfaceC2139c, onCreateBottomNavigationController, w0Var, interfaceC2137a, 7);
                c3966o.j0(b2Var);
                objM8596M4 = b2Var;
            }
            r1.m10867a(navController, str, null, null, null, null, null, null, (InterfaceC2139c) objM8596M4, c3966o, ((i11 >> 6) & 14) | ((i11 << 3) & 112));
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new k0(str, onCreateBottomNavigationController, navController, i10, 14);
        }
    }
}
