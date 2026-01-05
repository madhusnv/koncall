package bt;

import an.o1;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import at.C0430a;
import au.C0440d;
import aw.C0467g;
import bg.AbstractC0656a;
import bv.C0784b;
import com.websoptimization.callyzerbiz.NotePopUpActivity;
import com.websoptimization.callyzerbiz.R;
import d7.InterfaceC1637j;
import d7.c1;
import dp.AbstractC1738e;
import ds.AbstractC1777a;
import ds.C1787k;
import dt.C1804j;
import ep.C2088f;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import f2.C2192o;
import fk.C2310p;
import fp.AbstractC2365e;
import fs.C2371b;
import g2.a6;
import g2.v1;
import g2.y1;
import g7.C2536a;
import gm.C2639h;
import gm.C2645n;
import gs.C2716b;
import gs.C2721g;
import gs.C2728n;
import gt.C2729a;
import h1.x0;
import h7.AbstractC2868a;
import java.util.ArrayList;
import java.util.List;
import jn.InterfaceC3804c;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.b1;
import k2.h2;
import kotlin.jvm.internal.AbstractC4154l;
import kp.AbstractC4169a;
import kr.AbstractC4189d;
import l7.C4409i;
import lp.C4505g;
import ls.AbstractC4510a;
import ls.C4511b;
import lu.AbstractC4515a;
import lu.AbstractC4527m;
import lu.C4522h;
import mp.AbstractC4832a;
import mq.C4841i;
import np.C5128f;
import nq.C5129a;
import og.lb;
import og.n1;
import op.AbstractC5432a;
import or.C5454q;
import org.bouncycastle.iana.AEADAlgorithm;
import pg.AbstractC5928i;
import pg.AbstractC5937r;
import pp.C5995k;
import ps.AbstractC6009i;
import ps.C6011k;
import q1.C6097y;
import qp.C6266c;
import qq.C6276b;
import qr.AbstractC6287k;
import qu.C6324e;
import s2.AbstractC6740i;
import s2.C6734c;
import sq.g2;
import ss.z0;
import t2.InterfaceC7003b;
import tq.EnumC7204p;
import tu.C7226b;
import tx.InterfaceC7266z;
import ur.C7530w;
import uw.InterfaceC7559c;
import w1.AbstractC7861e;
import w2.InterfaceC7879r;
import yu.AbstractC8775a;
import yv.C8791f;
import zp.C9005e;
import zp.C9007g;
import zp.C9008h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bt.l */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0767l implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f4868a;

    /* renamed from: b */
    public final /* synthetic */ Object f4869b;

    /* renamed from: c */
    public final /* synthetic */ Object f4870c;

    /* renamed from: d */
    public final /* synthetic */ Object f4871d;

    public /* synthetic */ C0767l(int i10, Object obj, Object obj2, Object obj3) {
        this.f4868a = i10;
        this.f4870c = obj;
        this.f4869b = obj2;
        this.f4871d = obj3;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f4868a;
        int i11 = 7;
        k2.s0 s0Var = C3961j.f20408a;
        boolean z6 = false;
        boolean z10 = false;
        qw.a0 a0Var = qw.a0.f30746a;
        Object obj3 = this.f4871d;
        Object obj4 = this.f4869b;
        Object obj5 = this.f4870c;
        switch (i10) {
            case 0:
                C0430a c0430a = (C0430a) obj5;
                C1804j c1804j = (C1804j) obj4;
                String str = (String) obj3;
                InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8598P(iIntValue & 1, (iIntValue & 3) != 2)) {
                    if (c0430a.f3167o.isEmpty()) {
                        c3966o.m8607Y(2062012568);
                    } else {
                        c3966o.m8607Y(2069292422);
                        boolean zM8616i = c3966o.m8616i(c1804j) | c3966o.m8614g(str);
                        Object objM8596M = c3966o.m8596M();
                        if (zM8616i || objM8596M == s0Var) {
                            objM8596M = new C0771p(c1804j, str, 0);
                            c3966o.j0(objM8596M);
                        }
                        a6.m6113a((InterfaceC2137a) objM8596M, null, AbstractC7861e.f37635a, ((v1) c3966o.m8618k(y1.f13286a)).f12954a, 0L, null, b0.f4777b, c3966o, 12582912, 114);
                    }
                    c3966o.m8623p(false);
                } else {
                    c3966o.m8601S();
                }
                return a0Var;
            case 1:
                ((Integer) obj2).getClass();
                b0.m2075n((List) obj3, (C1804j) obj4, (C0430a) obj5, (InterfaceC3962k) obj, C3953b.m8496A(1));
                return a0Var;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC1738e.m5435a((C2088f) obj5, (InterfaceC2139c) obj4, (InterfaceC2137a) obj3, (InterfaceC3962k) obj, C3953b.m8496A(1));
                return a0Var;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC1777a.m5466f((C2721g) obj5, (C6097y) obj4, (InterfaceC2139c) obj3, (InterfaceC3962k) obj, C3953b.m8496A(1));
                return a0Var;
            case 4:
                ((Integer) obj2).getClass();
                AbstractC1777a.m5464d((InterfaceC7879r) obj5, (String) obj3, (List) obj4, (InterfaceC3962k) obj, C3953b.m8496A(1));
                return a0Var;
            case 5:
                C2371b c2371b = (C2371b) obj5;
                C2728n c2728n = (C2728n) obj4;
                InterfaceC2137a interfaceC2137a = (InterfaceC2137a) obj3;
                InterfaceC3962k interfaceC3962k2 = (InterfaceC3962k) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                C3966o c3966o2 = (C3966o) interfaceC3962k2;
                if (c3966o2.m8598P(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zM8616i2 = c3966o2.m8616i(c2728n) | c3966o2.m8614g(interfaceC2137a);
                    Object objM8596M2 = c3966o2.m8596M();
                    if (zM8616i2 || objM8596M2 == s0Var) {
                        objM8596M2 = new C1787k(c2728n, interfaceC2137a, 0);
                        c3966o2.j0(objM8596M2);
                    }
                    AbstractC1777a.m5468h(c2371b, (InterfaceC2137a) objM8596M2, c3966o2, 0);
                } else {
                    c3966o2.m8601S();
                }
                return a0Var;
            case 6:
                String leadId = ((C2371b) obj5).f10790d;
                String str2 = (String) obj3;
                InterfaceC2139c interfaceC2139c = (InterfaceC2139c) obj4;
                InterfaceC3962k interfaceC3962k3 = (InterfaceC3962k) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                C3966o c3966o3 = (C3966o) interfaceC3962k3;
                if (c3966o3.m8598P(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    C2639h viewModelAssistedFactory = (C2639h) ((C2645n) ((InterfaceC3804c) lb.m10745a((Activity) c3966o3.m8618k(C8791f.f42458b)))).f14264g.get();
                    AbstractC4154l.m8923f(viewModelAssistedFactory, "viewModelAssistedFactory");
                    AbstractC4154l.m8923f(leadId, "leadId");
                    C2716b c2716b = new C2716b(z6 ? 1 : 0, viewModelAssistedFactory, leadId, str2);
                    c1 c1VarM6992a = AbstractC2868a.m6992a(c3966o3);
                    if (c1VarM6992a == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    C2721g c2721g = (C2721g) AbstractC5928i.m11691b(c1VarM6992a, kotlin.jvm.internal.a0.m8901a(C2721g.class), leadId, c2716b, c1VarM6992a instanceof InterfaceC1637j ? ((InterfaceC1637j) c1VarM6992a).getDefaultViewModelCreationExtras() : C2536a.f13867b);
                    C6097y c6097yM12082a = q1.b0.m12082a(0, 3, c3966o3);
                    boolean zM8616i3 = c3966o3.m8616i(c2721g) | c3966o3.m8614g(interfaceC2139c);
                    Object objM8596M3 = c3966o3.m8596M();
                    Object obj6 = objM8596M3;
                    if (zM8616i3 || objM8596M3 == s0Var) {
                        o1 o1Var = new o1(26, c2721g, interfaceC2139c);
                        c3966o3.j0(o1Var);
                        obj6 = o1Var;
                    }
                    AbstractC1777a.m5466f(c2721g, c6097yM12082a, (InterfaceC2139c) obj6, c3966o3, 0);
                } else {
                    c3966o3.m8601S();
                }
                return a0Var;
            case 7:
                ((Integer) obj2).getClass();
                AbstractC2365e.m6051c((C6266c) obj5, (C6097y) obj4, (InterfaceC2141e) obj3, (InterfaceC3962k) obj, C3953b.m8496A(1));
                return a0Var;
            case 8:
                ((Integer) obj2).getClass();
                AbstractC2365e.m6049a((C9005e) obj5, (EnumC7204p) obj4, (InterfaceC2141e) obj3, (InterfaceC3962k) obj, C3953b.m8496A(1));
                return a0Var;
            case 9:
                C0784b c0784b = (C0784b) obj5;
                NotePopUpActivity notePopUpActivity = (NotePopUpActivity) obj4;
                k2.w0 w0Var = (k2.w0) obj3;
                InterfaceC3962k interfaceC3962k4 = (InterfaceC3962k) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int i12 = NotePopUpActivity.f7268g;
                C3966o c3966o4 = (C3966o) interfaceC3962k4;
                if (c3966o4.m8598P(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    if (((Boolean) w0Var.getValue()).booleanValue()) {
                        c3966o4.m8607Y(-1032808311);
                        boolean zM8616i4 = c3966o4.m8616i(c0784b) | c3966o4.m8616i(notePopUpActivity);
                        Object objM8596M4 = c3966o4.m8596M();
                        if (zM8616i4 || objM8596M4 == s0Var) {
                            objM8596M4 = new C0467g(i11, c0784b, notePopUpActivity, w0Var);
                            c3966o4.j0(objM8596M4);
                        }
                        AbstractC8775a.m16146q((InterfaceC2137a) objM8596M4, c3966o4, 0);
                    } else {
                        c3966o4.m8607Y(-1036991234);
                    }
                    c3966o4.m8623p(false);
                } else {
                    c3966o4.m8601S();
                }
                return a0Var;
            case 10:
                int iIntValue5 = ((Integer) obj).intValue();
                Uri uri = (Uri) obj2;
                AbstractC4154l.m8923f(uri, "uri");
                ((b1) obj4).m8527g(-1);
                ((k2.w0) obj3).setValue(Boolean.FALSE);
                ((mq.h0) obj5).m9801m(new C4841i(iIntValue5, uri));
                return a0Var;
            case 11:
                ((Integer) obj2).getClass();
                AbstractC5937r.m11842f((InterfaceC2137a) obj5, (C2729a) obj4, (InterfaceC2137a) obj3, (InterfaceC3962k) obj, C3953b.m8496A(65));
                return a0Var;
            case 12:
                ((Integer) obj2).getClass();
                AbstractC4169a.m8932c((C4505g) obj5, (l7.a0) obj4, (InterfaceC2137a) obj3, (InterfaceC3962k) obj, C3953b.m8496A(1));
                return a0Var;
            case 13:
                ((Integer) obj2).getClass();
                AbstractC4189d.m8945m((C5454q) obj5, (InterfaceC2139c) obj4, (InterfaceC2137a) obj3, (InterfaceC3962k) obj, C3953b.m8496A(1));
                return a0Var;
            case 14:
                ((Integer) obj2).getClass();
                AbstractC4510a.m9344c((C4511b) obj5, (InterfaceC2139c) obj4, (C6097y) obj3, (InterfaceC3962k) obj, C3953b.m8496A(7));
                return a0Var;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                String str3 = (String) obj3;
                InterfaceC2137a interfaceC2137a2 = (InterfaceC2137a) obj5;
                C6324e c6324e = (C6324e) obj4;
                InterfaceC3962k interfaceC3962k5 = (InterfaceC3962k) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                C3966o c3966o5 = (C3966o) interfaceC3962k5;
                if (c3966o5.m8598P(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    C6734c c6734cM12902d = AbstractC6740i.m12902d(-1859830614, new C4522h(c6324e, z10 ? 1 : 0), c3966o5);
                    boolean zM8614g = c3966o5.m8614g(interfaceC2137a2);
                    Object objM8596M5 = c3966o5.m8596M();
                    if (zM8614g || objM8596M5 == s0Var) {
                        objM8596M5 = new C0440d(22, interfaceC2137a2);
                        c3966o5.j0(objM8596M5);
                    }
                    g2.m13157i(null, null, false, str3, 0L, 0, false, c6734cM12902d, (InterfaceC2137a) objM8596M5, c3966o5, 12582912, 119);
                } else {
                    c3966o5.m8601S();
                }
                return a0Var;
            case 16:
                ((Integer) obj2).getClass();
                AbstractC4527m.m9376g((String) obj3, (InterfaceC2139c) obj5, (InterfaceC2137a) obj4, (InterfaceC3962k) obj, C3953b.m8496A(1));
                return a0Var;
            case 17:
                ((Integer) obj2).getClass();
                AbstractC4515a.m9362a((C7226b) obj5, (Context) obj4, (InterfaceC2137a) obj3, (InterfaceC3962k) obj, C3953b.m8496A(1));
                return a0Var;
            case 18:
                ((Integer) obj2).getClass();
                AbstractC4832a.m9787c((C5128f) obj5, (l7.a0) obj4, (InterfaceC2137a) obj3, (InterfaceC3962k) obj, C3953b.m8496A(1));
                return a0Var;
            case 19:
                ((Integer) obj2).getClass();
                n1.m10771a((C4409i) obj5, (InterfaceC7003b) obj4, (C6734c) obj3, (InterfaceC3962k) obj, C3953b.m8496A(385));
                return a0Var;
            case 20:
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                tx.c0.m13502y((InterfaceC7266z) obj5, null, null, new C2192o(fFloatValue, (x0) obj4, (C4409i) obj3, (InterfaceC7559c) null), 3);
                return a0Var;
            case 21:
                Context context = (Context) obj5;
                C6276b c6276b = (C6276b) obj4;
                h2 h2Var = (h2) obj3;
                InterfaceC3962k interfaceC3962k6 = (InterfaceC3962k) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                C3966o c3966o6 = (C3966o) interfaceC3962k6;
                if (c3966o6.m8598P(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    String strM10920c = og.t0.m10920c(c3966o6, R.string.attach_call_recording);
                    C6734c c6734cM12902d2 = AbstractC6740i.m12902d(353812940, new C5129a(c6276b, h2Var), c3966o6);
                    boolean zM8616i5 = c3966o6.m8616i(context);
                    Object objM8596M6 = c3966o6.m8596M();
                    if (zM8616i5 || objM8596M6 == s0Var) {
                        objM8596M6 = new C2310p(context, 3);
                        c3966o6.j0(objM8596M6);
                    }
                    g2.m13157i(null, null, false, strM10920c, 0L, 0, false, c6734cM12902d2, (InterfaceC2137a) objM8596M6, c3966o6, 12582912, 119);
                } else {
                    c3966o6.m8601S();
                }
                return a0Var;
            case 22:
                ((Integer) obj2).getClass();
                AbstractC5432a.m11138c((C9008h) obj5, (k2.w0) obj4, (EnumC7204p) obj3, (InterfaceC3962k) obj, C3953b.m8496A(1));
                return a0Var;
            case 23:
                ((Integer) obj2).getClass();
                AbstractC5432a.m11137b((String) obj3, (C9007g) obj5, (EnumC7204p) obj4, (InterfaceC3962k) obj, C3953b.m8496A(1));
                return a0Var;
            case 24:
                ((Integer) obj2).getClass();
                AbstractC5432a.m11143h((l7.a0) obj5, (C5995k) obj4, (InterfaceC2137a) obj3, (InterfaceC3962k) obj, C3953b.m8496A(1));
                return a0Var;
            case 25:
                ((Integer) obj2).getClass();
                AbstractC0656a.m1898g((String) obj3, (String) obj5, (InterfaceC2137a) obj4, (InterfaceC3962k) obj, C3953b.m8496A(1));
                return a0Var;
            case 26:
                h2 h2Var2 = (h2) obj5;
                z0 z0Var = (z0) obj4;
                k2.w0 w0Var2 = (k2.w0) obj3;
                InterfaceC3962k interfaceC3962k7 = (InterfaceC3962k) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                C3966o c3966o7 = (C3966o) interfaceC3962k7;
                if (c3966o7.m8598P(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    C4409i c4409i = (C4409i) h2Var2.getValue();
                    if (c4409i == null) {
                        c3966o7.m8607Y(-1145419802);
                    } else {
                        c3966o7.m8607Y(-1145419801);
                        if (AbstractC4154l.m8918a(c4409i.f22046b.f22135b.f29940f, "callHistory") || AbstractC4154l.m8918a(c4409i.f22046b.f22135b.f29940f, "contacts")) {
                            c3966o7.m8607Y(-469854174);
                            boolean zM8616i6 = c3966o7.m8616i(z0Var);
                            Object objM8596M7 = c3966o7.m8596M();
                            if (zM8616i6 || objM8596M7 == s0Var) {
                                objM8596M7 = new C6011k(z0Var, w0Var2, 0);
                                c3966o7.j0(objM8596M7);
                            }
                            a6.m6113a((InterfaceC2137a) objM8596M7, null, AbstractC7861e.m14841b(50), 0L, 0L, null, AbstractC6009i.f29370d, c3966o7, 12582912, 122);
                        } else {
                            c3966o7.m8607Y(-495192954);
                        }
                        c3966o7.m8623p(false);
                    }
                    c3966o7.m8623p(false);
                } else {
                    c3966o7.m8601S();
                }
                return a0Var;
            case 27:
                ((Integer) obj2).getClass();
                AbstractC6009i.m12041k(C3953b.m8496A(1), (InterfaceC2139c) obj4, (String) obj3, (InterfaceC3962k) obj, (l7.a0) obj5);
                return a0Var;
            case 28:
                ((Integer) obj2).getClass();
                AbstractC6009i.m12040j((k2.w0) obj5, (z0) obj4, (InterfaceC2139c) obj3, (InterfaceC3962k) obj, C3953b.m8496A(391));
                return a0Var;
            default:
                ((Integer) obj2).getClass();
                AbstractC6287k.m12287d((C7530w) obj5, (ArrayList) obj4, (InterfaceC2139c) obj3, (InterfaceC3962k) obj, C3953b.m8496A(1));
                return a0Var;
        }
    }

    public /* synthetic */ C0767l(C2371b c2371b, String str, InterfaceC2139c interfaceC2139c) {
        this.f4868a = 6;
        this.f4870c = c2371b;
        this.f4871d = str;
        this.f4869b = interfaceC2139c;
    }

    public /* synthetic */ C0767l(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f4868a = i11;
        this.f4870c = obj;
        this.f4869b = obj2;
        this.f4871d = obj3;
    }

    public /* synthetic */ C0767l(String str, InterfaceC2137a interfaceC2137a, C6324e c6324e) {
        this.f4868a = 15;
        this.f4871d = str;
        this.f4870c = interfaceC2137a;
        this.f4869b = c6324e;
    }

    public /* synthetic */ C0767l(String str, Object obj, Object obj2, int i10, int i11) {
        this.f4868a = i11;
        this.f4871d = str;
        this.f4870c = obj;
        this.f4869b = obj2;
    }

    public /* synthetic */ C0767l(List list, C1804j c1804j, C0430a c0430a, int i10) {
        this.f4868a = 1;
        this.f4871d = list;
        this.f4869b = c1804j;
        this.f4870c = c0430a;
    }

    public /* synthetic */ C0767l(InterfaceC7879r interfaceC7879r, String str, List list, int i10) {
        this.f4868a = 4;
        this.f4870c = interfaceC7879r;
        this.f4871d = str;
        this.f4869b = list;
    }
}
