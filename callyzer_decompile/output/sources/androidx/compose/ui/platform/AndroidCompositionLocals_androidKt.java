package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import au.C0446j;
import b4.C0597c;
import b4.C0598d;
import com.websoptimization.callyzerbiz.R;
import cp.C1476g;
import e7.AbstractC1967c;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import g2.l5;
import g2.p2;
import g8.C2545e;
import g8.InterfaceC2547g;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.C3977z;
import k2.InterfaceC3962k;
import k2.i2;
import k2.l1;
import k2.m1;
import k2.s0;
import k2.w0;
import kotlin.jvm.internal.AbstractC4154l;
import l3.C4355b;
import l3.InterfaceC4354a;
import p004e.C1870e;
import qw.a0;
import r1.C6431p;
import s1.C6725t;
import s2.AbstractC6740i;
import t2.AbstractC7011j;
import t2.C7010i;
import t2.InterfaceC7009h;
import w3.C7896n;
import w3.C7898p;
import w3.C7904v;
import w3.a2;
import w3.k1;
import w3.n0;
import w3.n1;
import w3.o0;
import w3.p0;
import w3.r1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt {

    /* renamed from: a */
    public static final C3977z f2133a = new C3977z(n0.f37874b);

    /* renamed from: b */
    public static final i2 f2134b = new i2(n0.f37875c);

    /* renamed from: c */
    public static final i2 f2135c = new i2(n0.f37876d);

    /* renamed from: d */
    public static final i2 f2136d = new i2(n0.f37877e);

    /* renamed from: e */
    public static final i2 f2137e = new i2(n0.f37878f);

    /* renamed from: f */
    public static final i2 f2138f = new i2(n0.f37879g);

    /* renamed from: a */
    public static final void m725a(C7904v c7904v, InterfaceC2141e interfaceC2141e, InterfaceC3962k interfaceC3962k, int i10) {
        w0 w0Var;
        LinkedHashMap linkedHashMap;
        boolean z6;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(1396852028);
        int i11 = (c3966o.m8616i(c7904v) ? 4 : 2) | i10 | (c3966o.m8616i(interfaceC2141e) ? 32 : 16);
        if (c3966o.m8598P(i11 & 1, (i11 & 19) != 18)) {
            Context context = c7904v.getContext();
            Object objM8596M = c3966o.m8596M();
            s0 s0Var = C3961j.f20408a;
            if (objM8596M == s0Var) {
                objM8596M = C3953b.m8517t(new Configuration(context.getResources().getConfiguration()));
                c3966o.j0(objM8596M);
            }
            w0 w0Var2 = (w0) objM8596M;
            Object objM8596M2 = c3966o.m8596M();
            if (objM8596M2 == s0Var) {
                objM8596M2 = new p2(w0Var2, 3);
                c3966o.j0(objM8596M2);
            }
            c7904v.setConfigurationChangeObserver((InterfaceC2139c) objM8596M2);
            Object objM8596M3 = c3966o.m8596M();
            if (objM8596M3 == s0Var) {
                objM8596M3 = new w3.w0(context);
                c3966o.j0(objM8596M3);
            }
            w3.w0 w0Var3 = (w3.w0) objM8596M3;
            C7896n viewTreeOwners = c7904v.getViewTreeOwners();
            if (viewTreeOwners == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            InterfaceC2547g interfaceC2547g = viewTreeOwners.f37865b;
            Object objM8596M4 = c3966o.m8596M();
            if (objM8596M4 == s0Var) {
                Object parent = c7904v.getParent();
                AbstractC4154l.m8921d(parent, "null cannot be cast to non-null type android.view.View");
                View view = (View) parent;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                String strValueOf = tag instanceof String ? (String) tag : null;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(view.getId());
                }
                String str = InterfaceC7009h.class.getSimpleName() + ':' + strValueOf;
                C2545e savedStateRegistry = interfaceC2547g.getSavedStateRegistry();
                Bundle bundleM6563a = savedStateRegistry.m6563a(str);
                if (bundleM6563a != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str2 : bundleM6563a.keySet()) {
                        ArrayList parcelableArrayList = bundleM6563a.getParcelableArrayList(str2);
                        AbstractC4154l.m8921d(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
                        linkedHashMap.put(str2, parcelableArrayList);
                        w0Var2 = w0Var2;
                    }
                } else {
                    linkedHashMap = null;
                }
                w0Var = w0Var2;
                C7898p c7898p = C7898p.f37912e;
                i2 i2Var = AbstractC7011j.f33948a;
                C7010i c7010i = new C7010i(linkedHashMap, c7898p);
                try {
                    savedStateRegistry.m6565c(str, new C1870e(4, c7010i));
                    z6 = true;
                } catch (IllegalArgumentException unused) {
                    z6 = false;
                }
                n1 n1Var = new n1(c7010i, new l5(z6, savedStateRegistry, str));
                c3966o.j0(n1Var);
                objM8596M4 = n1Var;
            } else {
                w0Var = w0Var2;
            }
            n1 n1Var2 = (n1) objM8596M4;
            boolean zM8616i = c3966o.m8616i(n1Var2);
            Object objM8596M5 = c3966o.m8596M();
            if (zM8616i || objM8596M5 == s0Var) {
                objM8596M5 = new C6725t(10, n1Var2);
                c3966o.j0(objM8596M5);
            }
            C3953b.m8500c(a0.f30746a, (InterfaceC2139c) objM8596M5, c3966o);
            Object objM8596M6 = c3966o.m8596M();
            if (objM8596M6 == s0Var) {
                objM8596M6 = r1.m15002a(context) ? new C4355b(1, c7904v.getView()) : new a2();
                c3966o.j0(objM8596M6);
            }
            InterfaceC4354a interfaceC4354a = (InterfaceC4354a) objM8596M6;
            Configuration configuration = (Configuration) w0Var.getValue();
            Object objM8596M7 = c3966o.m8596M();
            if (objM8596M7 == s0Var) {
                objM8596M7 = new C0597c();
                c3966o.j0(objM8596M7);
            }
            C0597c c0597c = (C0597c) objM8596M7;
            Object objM8596M8 = c3966o.m8596M();
            Object obj = objM8596M8;
            if (objM8596M8 == s0Var) {
                Configuration configuration2 = new Configuration();
                if (configuration != null) {
                    configuration2.setTo(configuration);
                }
                c3966o.j0(configuration2);
                obj = configuration2;
            }
            Configuration configuration3 = (Configuration) obj;
            Object objM8596M9 = c3966o.m8596M();
            if (objM8596M9 == s0Var) {
                objM8596M9 = new o0(configuration3, c0597c);
                c3966o.j0(objM8596M9);
            }
            o0 o0Var = (o0) objM8596M9;
            boolean zM8616i2 = c3966o.m8616i(context);
            Object objM8596M10 = c3966o.m8596M();
            if (zM8616i2 || objM8596M10 == s0Var) {
                objM8596M10 = new C6431p(22, context, o0Var);
                c3966o.j0(objM8596M10);
            }
            C3953b.m8500c(c0597c, (InterfaceC2139c) objM8596M10, c3966o);
            Object objM8596M11 = c3966o.m8596M();
            if (objM8596M11 == s0Var) {
                objM8596M11 = new C0598d();
                c3966o.j0(objM8596M11);
            }
            C0598d c0598d = (C0598d) objM8596M11;
            Object objM8596M12 = c3966o.m8596M();
            if (objM8596M12 == s0Var) {
                objM8596M12 = new p0(c0598d);
                c3966o.j0(objM8596M12);
            }
            p0 p0Var = (p0) objM8596M12;
            boolean zM8616i3 = c3966o.m8616i(context);
            Object objM8596M13 = c3966o.m8596M();
            if (zM8616i3 || objM8596M13 == s0Var) {
                objM8596M13 = new C6431p(23, context, p0Var);
                c3966o.j0(objM8596M13);
            }
            C3953b.m8500c(c0598d, (InterfaceC2139c) objM8596M13, c3966o);
            C3977z c3977z = k1.f37850v;
            C3953b.m8499b(new m1[]{f2133a.mo8541a((Configuration) w0Var.getValue()), f2134b.mo8541a(context), AbstractC1967c.f9212a.mo8541a(viewTreeOwners.f37864a), f2137e.mo8541a(interfaceC2547g), AbstractC7011j.f33948a.mo8541a(n1Var2), f2138f.mo8541a(c7904v.getView()), f2135c.mo8541a(c0597c), f2136d.mo8541a(c0598d), c3977z.mo8541a(Boolean.valueOf(((Boolean) c3966o.m8618k(c3977z)).booleanValue() | c7904v.getScrollCaptureInProgress$ui_release())), k1.f37840l.mo8541a(interfaceC4354a)}, AbstractC6740i.m12902d(1471621628, new C0446j(13, c7904v, w0Var3, interfaceC2141e), c3966o), c3966o, 56);
        } else {
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C1476g(c7904v, interfaceC2141e, i10, 26);
        }
    }

    /* renamed from: b */
    public static final void m726b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    public static final l1 getLocalLifecycleOwner() {
        return AbstractC1967c.f9212a;
    }

    public static final l1 getLocalSavedStateRegistryOwner() {
        return f2137e;
    }
}
