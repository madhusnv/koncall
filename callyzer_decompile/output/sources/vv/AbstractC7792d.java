package vv;

import android.content.Context;
import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.layout.AbstractC0245d;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.d1;
import au.C0444h;
import au.C0447k;
import bt.C0769n;
import com.google.android.gms.internal.measurement.d4;
import com.sun.mail.util.AbstractC1452a;
import cv.C1516l;
import d4.AbstractC1586n;
import d7.InterfaceC1649u;
import ex.InterfaceC2139c;
import g2.x0;
import gc.C2557a;
import hq.C3002g;
import java.util.WeakHashMap;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.i1;
import k2.n1;
import k2.s0;
import k2.w0;
import kotlin.jvm.internal.AbstractC4154l;
import o1.AbstractC5244c;
import o1.AbstractC5256o;
import o1.C5243b;
import o1.w1;
import og.je;
import p005f.C2162k;
import qw.a0;
import s2.AbstractC6740i;
import s4.InterfaceC6747c;
import t3.c1;
import t3.j0;
import ub.C7393i;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import vr.C7747o;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7876o;
import w2.InterfaceC7879r;
import w3.k1;
import y4.C8547h;
import y4.C8552m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vv.d */
/* loaded from: classes3.dex */
public abstract class AbstractC7792d {

    /* renamed from: a */
    public static final String[] f37464a = {"android.permission.CALL_PHONE", "android.permission.READ_CALL_LOG", "android.permission.READ_PHONE_STATE"};

    /* renamed from: a */
    public static final void m14749a(InterfaceC2139c navigateScreen, InterfaceC3962k interfaceC3962k, int i10) {
        boolean z6;
        AbstractC4154l.m8923f(navigateScreen, "navigateScreen");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-186276755);
        int i11 = 4;
        int i12 = (c3966o.m8616i(navigateScreen) ? 4 : 2) | i10;
        if (c3966o.m8598P(i12 & 1, (i12 & 3) != 2)) {
            Context context = (Context) c3966o.m8618k(AndroidCompositionLocals_androidKt.f2134b);
            d1 d1Var = new d1(i11);
            boolean z10 = (i12 & 14) == 4;
            Object objM8596M = c3966o.m8596M();
            s0 s0Var = C3961j.f20408a;
            if (z10 || objM8596M == s0Var) {
                objM8596M = new C1516l(21, navigateScreen);
                c3966o.j0(objM8596M);
            }
            C2162k c2162kM10719c = je.m10719c(d1Var, (InterfaceC2139c) objM8596M, c3966o, 0);
            Object objM8596M2 = c3966o.m8596M();
            if (objM8596M2 == s0Var) {
                objM8596M2 = C3953b.m8517t(Boolean.TRUE);
                c3966o.j0(objM8596M2);
            }
            w0 w0Var = (w0) objM8596M2;
            InterfaceC1649u interfaceC1649u = (InterfaceC1649u) c3966o.m8618k(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean zM8616i = c3966o.m8616i(interfaceC1649u);
            Object objM8596M3 = c3966o.m8596M();
            if (zM8616i || objM8596M3 == s0Var) {
                objM8596M3 = new C7789a(interfaceC1649u, w0Var, 0);
                c3966o.j0(objM8596M3);
            }
            C3953b.m8500c(interfaceC1649u, (InterfaceC2139c) objM8596M3, c3966o);
            Object objM8596M4 = c3966o.m8596M();
            if (objM8596M4 == s0Var) {
                objM8596M4 = new C7393i(7);
                c3966o.j0(objM8596M4);
            }
            C8547h c8547h = new C8547h((InterfaceC2139c) objM8596M4);
            FillElement fillElement = AbstractC0245d.f1971c;
            WeakHashMap weakHashMap = w1.f25863v;
            InterfaceC7879r interfaceC7879rM655i = AbstractC0242a.m655i(fillElement, AbstractC5244c.m10323h(C5243b.m10315e(c3966o).f25870g, c3966o));
            c3966o.m8607Y(-1998673515);
            Object objM8596M5 = c3966o.m8596M();
            if (objM8596M5 == s0Var) {
                objM8596M5 = AbstractC1452a.m4570q(0L, c3966o);
            }
            Object objM8596M6 = c3966o.m8596M();
            if (objM8596M6 == s0Var) {
                objM8596M6 = AbstractC1452a.m4571r(a0.f30746a, s0.f20544c, c3966o);
            }
            w0 w0Var2 = (w0) objM8596M6;
            InterfaceC6747c interfaceC6747c = (InterfaceC6747c) c3966o.m8618k(k1.f37836h);
            Object objM8596M7 = c3966o.m8596M();
            if (objM8596M7 == s0Var) {
                objM8596M7 = AbstractC1452a.m4575v(interfaceC6747c, c3966o);
            }
            C8552m c8552m = (C8552m) objM8596M7;
            boolean zM8616i2 = c3966o.m8616i(c8552m) | c3966o.m8614g(c8547h) | c3966o.m8612e(257);
            Object objM8596M8 = c3966o.m8596M();
            if (zM8616i2 || objM8596M8 == s0Var) {
                objM8596M8 = new C0444h(18, w0Var2, c8552m, c8547h);
                c3966o.j0(objM8596M8);
            }
            j0 j0Var = (j0) objM8596M8;
            c8552m.getClass();
            if (Float.isNaN(c8552m.f41518h)) {
                c3966o.m8607Y(-1996827620);
                boolean zM8616i3 = c3966o.m8616i(c8552m);
                Object objM8596M9 = c3966o.m8596M();
                if (zM8616i3 || objM8596M9 == s0Var) {
                    objM8596M9 = new C7747o(c8552m, 7);
                    c3966o.j0(objM8596M9);
                }
                z6 = false;
                c1.m13272a(AbstractC1586n.m5204b(interfaceC7879rM655i, false, (InterfaceC2139c) objM8596M9), AbstractC6740i.m12902d(-207512644, new x0(3, context, c2162kM10719c, navigateScreen, w0Var, w0Var2), c3966o), j0Var, c3966o, 48);
                c3966o.m8623p(false);
            } else {
                c3966o.m8607Y(-1997256040);
                InterfaceC7879r interfaceC7879rM3228b = d4.m3228b(interfaceC7879rM655i, c8552m.f41518h);
                j0 j0VarM10361d = AbstractC5256o.m10361d(C7864c.f37642a, false);
                int i13 = c3966o.f20462P;
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
                C3953b.m8521x(C7638j.f36925f, j0VarM10361d, c3966o);
                C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o);
                C7636h c7636h = C7638j.f36926g;
                if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i13))) {
                    AbstractC1452a.m4577x(i13, c3966o, i13, c7636h);
                }
                C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
                boolean zM8616i4 = c3966o.m8616i(c8552m);
                Object objM8596M10 = c3966o.m8596M();
                if (zM8616i4 || objM8596M10 == s0Var) {
                    objM8596M10 = new C7747o(c8552m, 6);
                    c3966o.j0(objM8596M10);
                }
                c1.m13272a(AbstractC1586n.m5204b(interfaceC7879rM3228b, false, (InterfaceC2139c) objM8596M10), AbstractC6740i.m12902d(1131308473, new C0447k(context, navigateScreen, c2162kM10719c, w0Var), c3966o), j0Var, c3966o, 48);
                c3966o.m8623p(true);
                c3966o.m8623p(false);
                z6 = false;
            }
            c3966o.m8623p(z6);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C2557a(i10, 7, navigateScreen);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x035e  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m14750b(l7.a0 r41, k2.InterfaceC3962k r42, int r43) {
        /*
            Method dump skipped, instructions count: 1022
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vv.AbstractC7792d.m14750b(l7.a0, k2.k, int):void");
    }

    /* renamed from: c */
    public static final void m14751c(l7.a0 a0Var, InterfaceC3962k interfaceC3962k, int i10) {
        boolean z6;
        l7.a0 navHostController = a0Var;
        AbstractC4154l.m8923f(navHostController, "navHostController");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(254266619);
        int i11 = 4;
        int i12 = (c3966o.m8616i(navHostController) ? 4 : 2) | i10;
        if (c3966o.m8598P(i12 & 1, (i12 & 3) != 2)) {
            Context context = (Context) c3966o.m8618k(AndroidCompositionLocals_androidKt.f2134b);
            String[] strArr = {"android.permission.POST_NOTIFICATIONS"};
            d1 d1Var = new d1(i11);
            boolean zM8616i = c3966o.m8616i(navHostController);
            Object objM8596M = c3966o.m8596M();
            s0 s0Var = C3961j.f20408a;
            if (zM8616i || objM8596M == s0Var) {
                objM8596M = new C3002g(navHostController, i11);
                c3966o.j0(objM8596M);
            }
            C2162k c2162kM10719c = je.m10719c(d1Var, (InterfaceC2139c) objM8596M, c3966o, 0);
            Object objM8596M2 = c3966o.m8596M();
            if (objM8596M2 == s0Var) {
                objM8596M2 = new C7393i(8);
                c3966o.j0(objM8596M2);
            }
            C8547h c8547h = new C8547h((InterfaceC2139c) objM8596M2);
            FillElement fillElement = AbstractC0245d.f1971c;
            WeakHashMap weakHashMap = w1.f25863v;
            InterfaceC7879r interfaceC7879rM655i = AbstractC0242a.m655i(fillElement, AbstractC5244c.m10323h(C5243b.m10315e(c3966o).f25870g, c3966o));
            c3966o.m8607Y(-1998673515);
            Object objM8596M3 = c3966o.m8596M();
            if (objM8596M3 == s0Var) {
                objM8596M3 = AbstractC1452a.m4570q(0L, c3966o);
            }
            Object objM8596M4 = c3966o.m8596M();
            if (objM8596M4 == s0Var) {
                objM8596M4 = AbstractC1452a.m4571r(a0.f30746a, s0.f20544c, c3966o);
            }
            w0 w0Var = (w0) objM8596M4;
            InterfaceC6747c interfaceC6747c = (InterfaceC6747c) c3966o.m8618k(k1.f37836h);
            Object objM8596M5 = c3966o.m8596M();
            if (objM8596M5 == s0Var) {
                objM8596M5 = AbstractC1452a.m4575v(interfaceC6747c, c3966o);
            }
            C8552m c8552m = (C8552m) objM8596M5;
            boolean zM8616i2 = c3966o.m8616i(c8552m) | c3966o.m8614g(c8547h) | c3966o.m8612e(257);
            Object objM8596M6 = c3966o.m8596M();
            if (zM8616i2 || objM8596M6 == s0Var) {
                objM8596M6 = new C0444h(19, w0Var, c8552m, c8547h);
                c3966o.j0(objM8596M6);
            }
            j0 j0Var = (j0) objM8596M6;
            c8552m.getClass();
            if (Float.isNaN(c8552m.f41518h)) {
                c3966o.m8607Y(-1996827620);
                boolean zM8616i3 = c3966o.m8616i(c8552m);
                Object objM8596M7 = c3966o.m8596M();
                if (zM8616i3 || objM8596M7 == s0Var) {
                    objM8596M7 = new C7747o(c8552m, 9);
                    c3966o.j0(objM8596M7);
                }
                z6 = false;
                navHostController = a0Var;
                c1.m13272a(AbstractC1586n.m5204b(interfaceC7879rM655i, false, (InterfaceC2139c) objM8596M7), AbstractC6740i.m12902d(-207512644, new x0(4, context, strArr, c2162kM10719c, a0Var, w0Var), c3966o), j0Var, c3966o, 48);
                c3966o.m8623p(false);
            } else {
                c3966o.m8607Y(-1997256040);
                InterfaceC7879r interfaceC7879rM3228b = d4.m3228b(interfaceC7879rM655i, c8552m.f41518h);
                j0 j0VarM10361d = AbstractC5256o.m10361d(C7864c.f37642a, false);
                int i13 = c3966o.f20462P;
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
                C3953b.m8521x(C7638j.f36925f, j0VarM10361d, c3966o);
                C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o);
                C7636h c7636h = C7638j.f36926g;
                if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i13))) {
                    AbstractC1452a.m4577x(i13, c3966o, i13, c7636h);
                }
                C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
                boolean zM8616i4 = c3966o.m8616i(c8552m);
                Object objM8596M8 = c3966o.m8596M();
                if (zM8616i4 || objM8596M8 == s0Var) {
                    objM8596M8 = new C7747o(c8552m, 8);
                    c3966o.j0(objM8596M8);
                }
                z6 = false;
                c1.m13272a(AbstractC1586n.m5204b(interfaceC7879rM3228b, false, (InterfaceC2139c) objM8596M8), AbstractC6740i.m12902d(1131308473, new C0447k(context, strArr, c2162kM10719c, navHostController, 13), c3966o), j0Var, c3966o, 48);
                c3966o.m8623p(true);
                c3966o.m8623p(false);
                navHostController = a0Var;
            }
            c3966o.m8623p(z6);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0769n(navHostController, i10, 11);
        }
    }
}
