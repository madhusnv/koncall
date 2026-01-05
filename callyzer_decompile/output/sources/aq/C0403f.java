package aq;

import android.app.Activity;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.foundation.AbstractC0237a;
import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.layout.AbstractC0245d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import at.C0431b;
import au.C0437a;
import au.C0440d;
import au.C0454r;
import bg.AbstractC0656a;
import bm.AbstractC0690a;
import bm.C0699j;
import bq.C0737q;
import bt.b0;
import bv.C0784b;
import cm.C0983a;
import com.amplifyframework.statemachine.codegen.data.C1226a;
import com.skydoves.balloon.Balloon;
import com.skydoves.balloon.internals.DefinitionKt;
import com.websoptimization.callyzerbiz.MainActivity;
import com.websoptimization.callyzerbiz.NotePopUpActivity;
import com.websoptimization.callyzerbiz.R;
import cq.AbstractC1478a;
import cv.AbstractC1505a;
import d3.C1565s;
import d3.k0;
import d7.InterfaceC1637j;
import d7.c1;
import dq.C1750l;
import ds.AbstractC1777a;
import dt.C1813s;
import es.C2127d;
import ev.C2136a;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import fb.AbstractC2250x;
import fs.C2371b;
import g2.i1;
import g2.p9;
import g2.sc;
import g2.t6;
import g2.v1;
import g2.vd;
import g2.xd;
import g2.y1;
import g4.C2489e;
import g4.C2492h;
import g4.g0;
import g4.o0;
import g7.C2536a;
import gm.C2640i;
import gm.C2645n;
import gm.C2655x;
import gm.e0;
import gs.C2716b;
import gs.C2724j;
import h7.AbstractC2868a;
import hp.AbstractC2994a;
import ip.C3342l;
import java.util.Collection;
import java.util.List;
import jn.InterfaceC3804c;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.b1;
import k2.e1;
import k2.h2;
import k2.i2;
import k2.m1;
import k2.s0;
import k2.w0;
import k4.AbstractC3988i;
import k4.C3994o;
import k4.C3995p;
import k4.C3998s;
import kotlin.jvm.internal.AbstractC4154l;
import lu.AbstractC4518d;
import mm.C4802m;
import n4.C4953b;
import nt.C5138b;
import og.ac;
import og.fb;
import og.gb;
import og.hg;
import og.lb;
import og.n1;
import org.bouncycastle.iana.AEADAlgorithm;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import ot.C5737e;
import pg.AbstractC5928i;
import pg.AbstractC5937r;
import pg.f9;
import pg.w5;
import pr.C5999b;
import ps.AbstractC6009i;
import pu.C6035c;
import q1.C6097y;
import qp.C6266c;
import qw.a0;
import r4.C6446a;
import r4.C6457l;
import r4.C6462q;
import s2.AbstractC6740i;
import s2.C6734c;
import sv.C6955c;
import t2.InterfaceC7003b;
import tq.AbstractC7201m;
import tx.InterfaceC7266z;
import uv.AbstractC7548a;
import uv.AbstractC7554g;
import uw.C7565i;
import w2.C7876o;
import x1.r0;
import yv.C8791f;
import zp.C9002b;
import zp.C9010j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: aq.f */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0403f implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f3105a;

    /* renamed from: b */
    public final /* synthetic */ Object f3106b;

    /* renamed from: c */
    public final /* synthetic */ Object f3107c;

    public /* synthetic */ C0403f(int i10, Object obj, Object obj2) {
        this.f3105a = i10;
        this.f3106b = obj;
        this.f3107c = obj2;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        w0 w0Var;
        int i10 = this.f3105a;
        s0 s0Var = C3961j.f20408a;
        boolean z6 = false;
        int i11 = 1;
        a0 a0Var = a0.f30746a;
        Object obj3 = this.f3107c;
        Object obj4 = this.f3106b;
        switch (i10) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC0399b.m1434a((C0737q) obj4, (l7.a0) obj3, (InterfaceC3962k) obj, C3953b.m8496A(1));
                return a0Var;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC2250x.m5948b((C0454r) obj4, (InterfaceC2139c) obj3, (InterfaceC3962k) obj, C3953b.m8496A(1));
                return a0Var;
            case 2:
                C4802m c4802m = (C4802m) obj4;
                InterfaceC2137a interfaceC2137a = (InterfaceC2137a) obj3;
                InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (!c3966o.m8598P(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c3966o.m8601S();
                } else if (c4802m.f23898j) {
                    c3966o.m8607Y(461222034);
                    String strM11629c = f9.m11629c(c3966o, R.string.connected);
                    o0 o0Var = ((vd) c3966o.m8618k(xd.f13268a)).f13055k;
                    long j6 = AbstractC7548a.f36337J;
                    boolean zM8614g = c3966o.m8614g(interfaceC2137a);
                    Object objM8596M = c3966o.m8596M();
                    Object obj5 = objM8596M;
                    if (zM8614g || objM8596M == s0Var) {
                        C0440d c0440d = new C0440d(1, interfaceC2137a);
                        c3966o.j0(c0440d);
                        obj5 = c0440d;
                    }
                    sc.m6307b(strM11629c, AbstractC0237a.m637e(C7876o.f37669a, false, null, null, (InterfaceC2137a) obj5, 7), j6, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o0Var, c3966o, KyberEngine.KyberPolyBytes, 0, 65528);
                    c3966o.m8623p(false);
                } else {
                    c3966o.m8607Y(461538606);
                    c3966o.m8607Y(2093099112);
                    C2489e c2489e = new C2489e();
                    c3966o.m8607Y(2093100290);
                    int iM6427g = c2489e.m6427g(new g0(((v1) c3966o.m8618k(y1.f13286a)).f12954a, 0L, (C3998s) null, (C3994o) null, (C3995p) null, (AbstractC3988i) null, (String) null, 0L, (C6446a) null, (C6462q) null, (C4953b) null, 0L, C6457l.f31117c, (k0) null, 61438));
                    try {
                        c2489e.m6423c(f9.m11629c(c3966o, R.string.connect_now));
                        c2489e.m6425e(iM6427g);
                        c3966o.m8623p(false);
                        c2489e.m6421a(1, 11);
                        C2492h c2492hM6428h = c2489e.m6428h();
                        c3966o.m8623p(false);
                        o0 o0Var2 = ((vd) c3966o.m8618k(xd.f13268a)).f13055k;
                        boolean zM8614g2 = c3966o.m8614g(c2492hM6428h) | c3966o.m8614g(interfaceC2137a);
                        Object objM8596M2 = c3966o.m8596M();
                        Object obj6 = objM8596M2;
                        if (zM8614g2 || objM8596M2 == s0Var) {
                            C0437a c0437a = new C0437a(c2492hM6428h, interfaceC2137a, 0);
                            c3966o.j0(c0437a);
                            obj6 = c0437a;
                        }
                        r0.m15445e(c2492hM6428h, null, o0Var2, false, 0, 0, null, (InterfaceC2139c) obj6, c3966o, 0, 122);
                        c3966o.m8623p(false);
                    } catch (Throwable th2) {
                        c2489e.m6425e(iM6427g);
                        throw th2;
                    }
                }
                return a0Var;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC2250x.m5949c((C6955c) obj4, (InterfaceC2137a) obj3, (InterfaceC3962k) obj, C3953b.m8496A(1));
                return a0Var;
            case 4:
                String str = (String) obj4;
                o0 o0Var3 = (o0) obj3;
                InterfaceC3962k interfaceC3962k2 = (InterfaceC3962k) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                C3966o c3966o2 = (C3966o) interfaceC3962k2;
                if (c3966o2.m8598P(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    sc.m6307b(str, null, C1565s.m5186b(0.5f, 14, ((v1) c3966o2.m8618k(y1.f13286a)).f12970q), 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o0Var3, c3966o2, 0, 0, 65530);
                } else {
                    c3966o2.m8601S();
                }
                return a0Var;
            case 5:
                AbstractC0690a.m1991b((C0983a) obj4, (o0) obj3, (InterfaceC3962k) obj, ((Integer) obj2).intValue());
                return a0Var;
            case 6:
                ((Integer) obj2).getClass();
                b0.m2070i((w0) obj4, (InterfaceC2137a) obj3, (InterfaceC3962k) obj, C3953b.m8496A(7));
                return a0Var;
            case 7:
                ((Integer) obj2).getClass();
                b0.m2073l((C0431b) obj4, (C1813s) obj3, (InterfaceC3962k) obj, C3953b.m8496A(1));
                return a0Var;
            case 8:
                return Boolean.valueOf(Balloon.passTouchEventToAnchor$lambda$50((View) obj4, (Balloon) obj3, (View) obj, (MotionEvent) obj2));
            case 9:
                ((Integer) obj2).getClass();
                fb.m10647a((C9002b) obj4, (InterfaceC2137a) obj3, (InterfaceC3962k) obj, C3953b.m8496A(1));
                return a0Var;
            case 10:
                ((Integer) obj2).getClass();
                gb.m10668e((C9010j) obj4, (InterfaceC2137a) obj3, (InterfaceC3962k) obj, C3953b.m8496A(1));
                return a0Var;
            case 11:
                ((Integer) obj2).getClass();
                AbstractC1478a.m5057a((C1750l) obj4, (l7.a0) obj3, (InterfaceC3962k) obj, C3953b.m8496A(1));
                return a0Var;
            case 12:
                ((Integer) obj2).getClass();
                AbstractC1505a.m5063c((C2136a) obj4, (InterfaceC2139c) obj3, (InterfaceC3962k) obj, C3953b.m8496A(7));
                return a0Var;
            case 13:
                InterfaceC2137a interfaceC2137a2 = (InterfaceC2137a) obj4;
                h2 h2Var = (h2) obj3;
                InterfaceC3962k interfaceC3962k3 = (InterfaceC3962k) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                C3966o c3966o3 = (C3966o) interfaceC3962k3;
                if (c3966o3.m8598P(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    AbstractC1505a.m5067g(((C2136a) h2Var.getValue()).f9972d, interfaceC2137a2, c3966o3, 0);
                } else {
                    c3966o3.m8601S();
                }
                return a0Var;
            case 14:
                ((Integer) obj2).getClass();
                AbstractC1777a.m5462b((C2127d) obj4, (InterfaceC2139c) obj3, (InterfaceC3962k) obj, C3953b.m8496A(1));
                return a0Var;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                ((Integer) obj2).getClass();
                AbstractC1777a.m5468h((C2371b) obj4, (InterfaceC2137a) obj3, (InterfaceC3962k) obj, C3953b.m8496A(1));
                return a0Var;
            case 16:
                C2371b c2371b = (C2371b) obj4;
                String str2 = (String) obj3;
                InterfaceC3962k interfaceC3962k4 = (InterfaceC3962k) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                C3966o c3966o4 = (C3966o) interfaceC3962k4;
                if (c3966o4.m8598P(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    C2640i viewModelAssistedFactory = (C2640i) ((C2645n) ((InterfaceC3804c) lb.m10745a((Activity) c3966o4.m8618k(C8791f.f42458b)))).f14265h.get();
                    String leadId = c2371b.f10790d;
                    AbstractC4154l.m8923f(viewModelAssistedFactory, "viewModelAssistedFactory");
                    AbstractC4154l.m8923f(leadId, "leadId");
                    C2716b c2716b = new C2716b(i11, viewModelAssistedFactory, leadId, str2);
                    c1 c1VarM6992a = AbstractC2868a.m6992a(c3966o4);
                    if (c1VarM6992a == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    AbstractC1777a.m5471k((C2724j) AbstractC5928i.m11691b(c1VarM6992a, kotlin.jvm.internal.a0.m8901a(C2724j.class), str2, c2716b, c1VarM6992a instanceof InterfaceC1637j ? ((InterfaceC1637j) c1VarM6992a).getDefaultViewModelCreationExtras() : C2536a.f13867b), c3966o4, 0);
                } else {
                    c3966o4.m8601S();
                }
                return a0Var;
            case 17:
                w0 w0Var2 = (w0) obj4;
                MainActivity mainActivity = (MainActivity) obj3;
                InterfaceC3962k interfaceC3962k5 = (InterfaceC3962k) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                int i12 = MainActivity.f7256m;
                C3966o c3966o5 = (C3966o) interfaceC3962k5;
                if (c3966o5.m8598P(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    AbstractC7554g.m14300a(((Boolean) w0Var2.getValue()).booleanValue(), AbstractC6740i.m12902d(-52064306, new C2655x(mainActivity, z6 ? 1 : 0), c3966o5), c3966o5, 48, 0);
                } else {
                    c3966o5.m8601S();
                }
                return a0Var;
            case 18:
                C0784b c0784b = (C0784b) obj4;
                NotePopUpActivity notePopUpActivity = (NotePopUpActivity) obj3;
                InterfaceC3962k interfaceC3962k6 = (InterfaceC3962k) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                int i13 = NotePopUpActivity.f7268g;
                C3966o c3966o6 = (C3966o) interfaceC3962k6;
                if (c3966o6.m8598P(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    Object objM8596M3 = c3966o6.m8596M();
                    Object obj7 = objM8596M3;
                    if (objM8596M3 == s0Var) {
                        InterfaceC7266z interfaceC7266zM8510m = C3953b.m8510m(C7565i.f36440a, c3966o6);
                        c3966o6.j0(interfaceC7266zM8510m);
                        obj7 = interfaceC7266zM8510m;
                    }
                    InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj7;
                    Object[] objArr = new Object[0];
                    Object objM8596M4 = c3966o6.m8596M();
                    Object obj8 = objM8596M4;
                    if (objM8596M4 == s0Var) {
                        C1226a c1226a = new C1226a(21);
                        c3966o6.j0(c1226a);
                        obj8 = c1226a;
                    }
                    w0 w0Var3 = (w0) hg.m10691b(objArr, null, (InterfaceC2137a) obj8, c3966o6, 0, 6);
                    Object[] objArr2 = new Object[0];
                    Object objM8596M5 = c3966o6.m8596M();
                    Object obj9 = objM8596M5;
                    if (objM8596M5 == s0Var) {
                        C1226a c1226a2 = new C1226a(22);
                        c3966o6.j0(c1226a2);
                        obj9 = c1226a2;
                    }
                    b1 b1Var = (b1) hg.m10691b(objArr2, null, (InterfaceC2137a) obj9, c3966o6, 0, 6);
                    Object objM8596M6 = c3966o6.m8596M();
                    Object obj10 = objM8596M6;
                    if (objM8596M6 == s0Var) {
                        e1 e1VarM8517t = C3953b.m8517t(Boolean.FALSE);
                        c3966o6.j0(e1VarM8517t);
                        obj10 = e1VarM8517t;
                    }
                    w0 w0Var4 = (w0) obj10;
                    w0Var4.setValue(Boolean.valueOf(pg.g0.m11646c(c3966o6)));
                    Object objM8596M7 = c3966o6.m8596M();
                    Object obj11 = objM8596M7;
                    if (objM8596M7 == s0Var) {
                        e1 e1VarM8517t2 = C3953b.m8517t(Boolean.FALSE);
                        c3966o6.j0(e1VarM8517t2);
                        obj11 = e1VarM8517t2;
                    }
                    w0 w0Var5 = (w0) obj11;
                    i2 i2Var = AndroidCompositionLocals_androidKt.f2134b;
                    Object objM8618k = c3966o6.m8618k(i2Var);
                    boolean zM8616i = c3966o6.m8616i(interfaceC7266z) | c3966o6.m8614g(w0Var3) | c3966o6.m8616i(c0784b) | c3966o6.m8614g(b1Var);
                    Object objM8596M8 = c3966o6.m8596M();
                    if (zM8616i || objM8596M8 == s0Var) {
                        e0 e0Var = new e0(interfaceC7266z, w0Var3, c0784b, b1Var, w0Var4, w0Var5, null);
                        w0Var = w0Var5;
                        c3966o6.j0(e0Var);
                        objM8596M8 = e0Var;
                    } else {
                        w0Var = w0Var5;
                    }
                    C3953b.m8503f((InterfaceC2141e) objM8596M8, objM8618k, c3966o6);
                    notePopUpActivity.getWindow().setStatusBarColor(notePopUpActivity.getColor(b1Var.m8526f()));
                    notePopUpActivity.getWindow().setNavigationBarColor(notePopUpActivity.getColor(b1Var.m8526f()));
                    C3953b.m8499b(new m1[]{i2Var.mo8541a(w5.m11906b(((Boolean) w0Var3.getValue()).booleanValue(), c3966o6)), C8791f.f42458b.mo8541a(notePopUpActivity)}, AbstractC6740i.m12902d(340211398, new C0699j(w0Var3, c0784b, notePopUpActivity, w0Var), c3966o6), c3966o6, 56);
                } else {
                    c3966o6.m8601S();
                }
                return a0Var;
            case 19:
                ((Integer) obj2).getClass();
                AbstractC2994a.m7250c((C6266c) obj4, (C6097y) obj3, (InterfaceC3962k) obj, C3953b.m8496A(1));
                return a0Var;
            case 20:
                ((Integer) obj2).getClass();
                AbstractC2994a.m7249b((C3342l) obj4, (l7.a0) obj3, (InterfaceC3962k) obj, C3953b.m8496A(1));
                return a0Var;
            case 21:
                ((Integer) obj2).getClass();
                AbstractC5937r.m11840d((Uri) obj4, (InterfaceC2139c) obj3, (InterfaceC3962k) obj, C3953b.m8496A(1));
                return a0Var;
            case 22:
                ((Integer) obj2).getClass();
                AbstractC4518d.m9368e((C6035c) obj4, (InterfaceC2137a) obj3, (InterfaceC3962k) obj, C3953b.m8496A(1));
                return a0Var;
            case 23:
                InterfaceC2141e composable = (InterfaceC2141e) obj;
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                AbstractC4154l.m8923f(composable, "composable");
                ((w0) obj4).setValue(bool);
                ((w0) obj3).setValue(composable);
                return a0Var;
            case 24:
                ((Integer) obj2).getClass();
                og.m1.m10758b((List) obj4, (Collection) obj3, (InterfaceC3962k) obj, C3953b.m8496A(1));
                return a0Var;
            case 25:
                ((Integer) obj2).getClass();
                n1.m10772b((InterfaceC7003b) obj4, (C6734c) obj3, (InterfaceC3962k) obj, C3953b.m8496A(1));
                return a0Var;
            case 26:
                ((Integer) obj2).getClass();
                AbstractC0656a.m1895d((l7.a0) obj3, (String) obj4, (InterfaceC3962k) obj, C3953b.m8496A(1));
                return a0Var;
            case 27:
                C5138b c5138b = (C5138b) obj4;
                InterfaceC2137a interfaceC2137a3 = (InterfaceC2137a) obj3;
                InterfaceC3962k interfaceC3962k7 = (InterfaceC3962k) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                C3966o c3966o7 = (C3966o) interfaceC3962k7;
                if (c3966o7.m8598P(1 & iIntValue7, (iIntValue7 & 3) != 2)) {
                    boolean z10 = c5138b.f25173e;
                    boolean zM8614g3 = c3966o7.m8614g(interfaceC2137a3);
                    Object objM8596M9 = c3966o7.m8596M();
                    if (zM8614g3 || objM8596M9 == s0Var) {
                        objM8596M9 = new C5737e(0, interfaceC2137a3);
                        c3966o7.j0(objM8596M9);
                    }
                    i1.m6172a(z10, (InterfaceC2139c) objM8596M9, AbstractC0242a.m660n(AbstractC0245d.f1971c, DefinitionKt.NO_Float_VALUE, 7, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 13), false, p9.m6255s(t6.m6310a(c3966o7).f12954a, AbstractC7554g.m14301b(c3966o7).f36389a, 0L, 0L, 0L, 0L, c3966o7, 60), c3966o7, KyberEngine.KyberPolyBytes);
                } else {
                    c3966o7.m8601S();
                }
                return a0Var;
            case 28:
                ((Integer) obj2).getClass();
                ac.m10527c((C5999b) obj4, (InterfaceC2137a) obj3, (InterfaceC3962k) obj, C3953b.m8496A(1));
                return a0Var;
            default:
                ((Integer) obj2).getClass();
                AbstractC6009i.m12031a((AbstractC7201m) obj4, (InterfaceC2137a) obj3, (InterfaceC3962k) obj, C3953b.m8496A(1));
                return a0Var;
        }
    }

    public /* synthetic */ C0403f(Object obj, Object obj2, int i10, int i11) {
        this.f3105a = i11;
        this.f3106b = obj;
        this.f3107c = obj2;
    }

    public /* synthetic */ C0403f(l7.a0 a0Var, String str, int i10) {
        this.f3105a = 26;
        this.f3107c = a0Var;
        this.f3106b = str;
    }
}
