package og;

import al.C0174b;
import android.content.Context;
import androidx.compose.foundation.AbstractC0237a;
import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.layout.AbstractC0245d;
import androidx.compose.foundation.layout.C0243b;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ao.C0381t;
import bm.C0699j;
import bt.C0769n;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.R;
import d7.InterfaceC1637j;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import fw.C2392f;
import g4.C2493i;
import g4.C2503s;
import g7.C2536a;
import h7.AbstractC2868a;
import hq.C3002g;
import hq.C3015t;
import i3.AbstractC3166c;
import java.util.ArrayList;
import java.util.List;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k4.C3998s;
import kotlin.jvm.internal.AbstractC4154l;
import ls.C4512c;
import m4.AbstractC4646a;
import o1.AbstractC5244c;
import o1.AbstractC5251j;
import o1.AbstractC5256o;
import o1.AbstractC5260s;
import o1.C5248g;
import o1.C5261t;
import pg.AbstractC5928i;
import pr.C5998a;
import ps.C6014n;
import q1.C6097y;
import qt.C6319n;
import r4.C6456k;
import rr.C6606f;
import rt.C6619c;
import rw.AbstractC6663m;
import s2.AbstractC6740i;
import sq.C6885b;
import tt.C7224g;
import u4.AbstractC7338a;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7871j;
import w2.C7876o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class uf {
    /* renamed from: a */
    public static final void m10987a(int i10, InterfaceC2137a onAllClick, InterfaceC2139c onTagToggle, List reorderedTags, InterfaceC3962k interfaceC3962k) {
        AbstractC4154l.m8923f(reorderedTags, "reorderedTags");
        AbstractC4154l.m8923f(onTagToggle, "onTagToggle");
        AbstractC4154l.m8923f(onAllClick, "onAllClick");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-35232506);
        int i11 = i10 | (c3966o.m8616i(reorderedTags) ? 4 : 2) | (c3966o.m8616i(onTagToggle) ? 32 : 16) | (c3966o.m8616i(onAllClick) ? 256 : 128);
        if (c3966o.m8598P(i11 & 1, (i11 & 147) != 146)) {
            o1.i1 i1VarM647a = AbstractC0242a.m647a(10, 2);
            C5248g c5248gM10351g = AbstractC5251j.m10351g(8);
            boolean zM8616i = ((i11 & 896) == 256) | c3966o.m8616i(reorderedTags) | ((i11 & 112) == 32);
            Object objM8596M = c3966o.m8596M();
            if (zM8616i || objM8596M == C3961j.f20408a) {
                objM8596M = new an.w1(29, reorderedTags, onAllClick, onTagToggle);
                c3966o.j0(objM8596M);
            }
            nc.m10777d(null, null, i1VarM647a, c5248gM10351g, null, null, false, null, (InterfaceC2139c) objM8596M, c3966o, 24960, 491);
        } else {
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C3015t(reorderedTags, onTagToggle, onAllClick, i10, 3);
        }
    }

    /* renamed from: b */
    public static final void m10988b(l7.a0 navController, InterfaceC3962k interfaceC3962k, int i10) {
        AbstractC4154l.m8923f(navController, "navController");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-1295536683);
        int i11 = (c3966o.m8616i(navController) ? 4 : 2) | i10;
        if (c3966o.m8598P(i11 & 1, (i11 & 3) != 2)) {
            c3966o.m8608Z(1890788296);
            d7.c1 c1VarM6992a = AbstractC2868a.m6992a(c3966o);
            if (c1VarM6992a == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            C2392f c2392fM11854a = pg.r9.m11854a(c1VarM6992a, c3966o);
            c3966o.m8608Z(1729797275);
            d7.w0 w0VarM11692c = AbstractC5928i.m11692c(C7224g.class, c1VarM6992a, c2392fM11854a, c1VarM6992a instanceof InterfaceC1637j ? ((InterfaceC1637j) c1VarM6992a).getDefaultViewModelCreationExtras() : C2536a.f13867b, c3966o);
            c3966o.m8623p(false);
            c3966o.m8623p(false);
            C7224g c7224g = (C7224g) w0VarM11692c;
            k2.w0 w0VarM8509l = C3953b.m8509l(c7224g.f34548h, c3966o);
            boolean zM8616i = c3966o.m8616i(navController);
            Object objM8596M = c3966o.m8596M();
            k2.s0 s0Var = C3961j.f20408a;
            if (zM8616i || objM8596M == s0Var) {
                objM8596M = new C3002g(navController, 3);
                c3966o.j0(objM8596M);
            }
            m10991e(c7224g, w0VarM8509l, (InterfaceC2139c) objM8596M, c3966o, 0);
            Object objM8596M2 = c3966o.m8596M();
            if (objM8596M2 == s0Var) {
                objM8596M2 = C3953b.m8512o(new sq.j2(w0VarM8509l, 8));
                c3966o.j0(objM8596M2);
            }
            g2.u9.m6323a(null, AbstractC6740i.m12902d(1318844569, new C0699j(w0VarM8509l, navController, c7224g, (k2.h2) objM8596M2), c3966o), null, null, null, 0, 0L, 0L, null, AbstractC6740i.m12902d(1280738276, new C4512c(9, w0VarM8509l, c7224g), c3966o), c3966o, 805306416, 509);
        } else {
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0769n(navController, i10, 8);
        }
    }

    /* renamed from: c */
    public static final void m10989c(C6619c messageTemplateData, InterfaceC2137a onClick, InterfaceC3962k interfaceC3962k, int i10) {
        AbstractC4154l.m8923f(messageTemplateData, "messageTemplateData");
        AbstractC4154l.m8923f(onClick, "onClick");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(958686037);
        int i11 = (c3966o.m8614g(messageTemplateData) ? 4 : 2) | i10 | (c3966o.m8616i(onClick) ? 32 : 16);
        if (c3966o.m8598P(i11 & 1, (i11 & 19) != 18)) {
            InterfaceC7879r interfaceC7879rM668e = AbstractC0245d.m668e(C7876o.f37669a, 1.0f);
            boolean z6 = (i11 & 112) == 32;
            Object objM8596M = c3966o.m8596M();
            if (z6 || objM8596M == C3961j.f20408a) {
                objM8596M = new C5998a(25, onClick);
                c3966o.j0(objM8596M);
            }
            InterfaceC7879r interfaceC7879rM660n = AbstractC0242a.m660n(AbstractC0237a.m637e(interfaceC7879rM668e, false, null, null, (InterfaceC2137a) objM8596M, 7), DefinitionKt.NO_Float_VALUE, 3, DefinitionKt.NO_Float_VALUE, 1, 5);
            long j6 = ((g2.v1) c3966o.m8618k(g2.y1.f13286a)).f12969p;
            C0174b c0174b = d3.h0.f7748a;
            g2.p9.m6240d(AbstractC0237a.m633a(interfaceC7879rM660n, j6, c0174b), c0174b, null, null, null, AbstractC6740i.m12902d(-2028958777, new bt.l0(22, messageTemplateData), c3966o), c3966o, 196656, 28);
        } else {
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C6014n(messageTemplateData, onClick, i10, 18);
        }
    }

    /* renamed from: d */
    public static final void m10990d(List messageTemplateList, InterfaceC2141e onClick, InterfaceC3962k interfaceC3962k, int i10) {
        AbstractC4154l.m8923f(messageTemplateList, "messageTemplateList");
        AbstractC4154l.m8923f(onClick, "onClick");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(2119888946);
        int i11 = (c3966o.m8616i(messageTemplateList) ? 4 : 2) | i10 | (c3966o.m8616i(onClick) ? 32 : 16);
        if (c3966o.m8598P(i11 & 1, (i11 & 19) != 18)) {
            C6097y c6097yM12082a = q1.b0.m12082a(0, 3, c3966o);
            boolean zM8616i = c3966o.m8616i(messageTemplateList) | ((i11 & 112) == 32);
            Object objM8596M = c3966o.m8596M();
            if (zM8616i || objM8596M == C3961j.f20408a) {
                objM8596M = new C6606f(1, onClick, messageTemplateList);
                c3966o.j0(objM8596M);
            }
            nc.m10775b(null, c6097yM12082a, null, null, null, null, false, null, (InterfaceC2139c) objM8596M, c3966o, 0, 509);
        } else {
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C6014n(messageTemplateList, onClick, i10, 17);
        }
    }

    /* renamed from: e */
    public static final void m10991e(C7224g c7224g, k2.h2 state, InterfaceC2139c onNavigate, InterfaceC3962k interfaceC3962k, int i10) {
        AbstractC4154l.m8923f(state, "state");
        AbstractC4154l.m8923f(onNavigate, "onNavigate");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-2048476385);
        int i11 = i10 | (c3966o.m8616i(c7224g) ? 4 : 2) | (c3966o.m8614g(state) ? 32 : 16) | (c3966o.m8616i(onNavigate) ? 256 : 128);
        if (c3966o.m8598P(i11 & 1, (i11 & 147) != 146)) {
            Context context = (Context) c3966o.m8618k(AndroidCompositionLocals_androidKt.f2134b);
            boolean zM8616i = ((i11 & 896) == 256) | c3966o.m8616i(c7224g) | ((i11 & 112) == 32) | c3966o.m8616i(context);
            Object objM8596M = c3966o.m8596M();
            if (zM8616i || objM8596M == C3961j.f20408a) {
                C0381t c0381t = new C0381t(c7224g, onNavigate, state, context, null, 22);
                c3966o.j0(c0381t);
                objM8596M = c0381t;
            }
            C3953b.m8503f((InterfaceC2141e) objM8596M, qw.a0.f30746a, c3966o);
        } else {
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new qr.f0((Object) c7224g, (Object) state, onNavigate, i10, 14);
        }
    }

    /* renamed from: f */
    public static final void m10992f(InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(1268763443);
        if (c3966o.m8598P(i10 & 1, i10 != 0)) {
            C7876o c7876o = C7876o.f37669a;
            InterfaceC7879r interfaceC7879rM668e = AbstractC0245d.m668e(c7876o, 1.0f);
            C7871j c7871j = C7864c.f37646e;
            t3.j0 j0VarM10361d = AbstractC5256o.m10361d(c7871j, false);
            int i11 = c3966o.f20462P;
            k2.i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879rM668e);
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
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i11))) {
                AbstractC1452a.m4577x(i11, c3966o, i11, c7636h);
            }
            C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
            g2.k9.m6197b(C0243b.f1966a.mo662a(c7876o, c7871j), 0L, DefinitionKt.NO_Float_VALUE, 0L, 0, c3966o, 0, 30);
            c3966o.m8623p(true);
        } else {
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new sq.i2(i10, 7);
        }
    }

    /* renamed from: g */
    public static final void m10993g(ld ldVar, InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(1945594452);
        if (c3966o.m8598P(i10 & 1, (i10 & 3) != 2)) {
            C6319n c6319n = C6319n.f30649a;
            int i11 = ldVar.equals(c6319n) ? R.drawable.templatesnotfound : R.drawable.file;
            int i12 = ldVar.equals(c6319n) ? R.string.tamplates_not_found : R.string.No_templates_available_yet_only_dot;
            FillElement fillElement = AbstractC0245d.f1971c;
            C5261t c5261tM10367a = AbstractC5260s.m10367a(AbstractC5251j.f25761e, C7864c.f37655p, c3966o, 54);
            int i13 = c3966o.f20462P;
            k2.i1 i1VarM8620m = c3966o.m8620m();
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
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i13))) {
                AbstractC1452a.m4577x(i13, c3966o, i13, c7636h);
            }
            C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
            AbstractC3166c abstractC3166cM10866b = r0.m10866b(i11, 0, c3966o);
            C7876o c7876o = C7876o.f37669a;
            pg.i0.m11693a(abstractC3166cM10866b, null, AbstractC0245d.m678o(c7876o, 150), null, null, DefinitionKt.NO_Float_VALUE, null, c3966o, 432, 120);
            AbstractC5244c.m10322f(c3966o, AbstractC0245d.m670g(c7876o, 16));
            sq.b1.m13113q(t0.m10920c(c3966o, i12), null, 0L, null, new C6456k(3), 0, 0, 0L, null, g4.o0.m6461a(((g2.vd) c3966o.m8618k(g2.xd.f13268a)).f13056l, 0L, af.m10534c(18), C3998s.f20698h, null, null, 0L, 0L, null, 16777209), c3966o, 0, 494);
            AbstractC5244c.m10322f(c3966o, AbstractC0245d.m670g(c7876o, 8));
            c3966o.m8623p(true);
        } else {
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C6885b(ldVar, i10, 5);
        }
    }

    /* renamed from: h */
    public static final int m10994h(List list, int i10) {
        int i11;
        int i12 = ((C2503s) AbstractC6663m.m12750N(list)).f13711c;
        if (i10 > ((C2503s) AbstractC6663m.m12750N(list)).f13711c) {
            AbstractC4646a.m9525a("Index " + i10 + " should be less or equal than last line's end " + i12);
        }
        int size = list.size() - 1;
        int i13 = 0;
        while (true) {
            if (i13 > size) {
                i11 = -(i13 + 1);
                break;
            }
            i11 = (i13 + size) >>> 1;
            C2503s c2503s = (C2503s) list.get(i11);
            char c2 = c2503s.f13710b > i10 ? (char) 1 : c2503s.f13711c <= i10 ? (char) 65535 : (char) 0;
            if (c2 >= 0) {
                if (c2 <= 0) {
                    break;
                }
                size = i11 - 1;
            } else {
                i13 = i11 + 1;
            }
        }
        if (i11 >= 0 && i11 < list.size()) {
            return i11;
        }
        StringBuilder sbM4567n = AbstractC1452a.m4567n(i11, "Found paragraph index ", " should be in range [0, ");
        sbM4567n.append(list.size());
        sbM4567n.append(").\nDebug info: index=");
        sbM4567n.append(i10);
        sbM4567n.append(", paragraphs=[");
        sbM4567n.append(AbstractC7338a.m13729a(list, null, C2493i.f13634c, 31));
        sbM4567n.append(']');
        AbstractC4646a.m9525a(sbM4567n.toString());
        return i11;
    }

    /* renamed from: i */
    public static final int m10995i(List list, int i10) {
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            C2503s c2503s = (C2503s) list.get(i12);
            char c2 = c2503s.f13712d > i10 ? (char) 1 : c2503s.f13713e <= i10 ? (char) 65535 : (char) 0;
            if (c2 < 0) {
                i11 = i12 + 1;
            } else {
                if (c2 <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    /* renamed from: j */
    public static final int m10996j(ArrayList arrayList, float f6) {
        if (f6 <= DefinitionKt.NO_Float_VALUE) {
            return 0;
        }
        if (f6 >= ((C2503s) AbstractC6663m.m12750N(arrayList)).f13715g) {
            return pe.m10832g(arrayList);
        }
        int size = arrayList.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            C2503s c2503s = (C2503s) arrayList.get(i11);
            char c2 = c2503s.f13714f > f6 ? (char) 1 : c2503s.f13715g <= f6 ? (char) 65535 : (char) 0;
            if (c2 < 0) {
                i10 = i11 + 1;
            } else {
                if (c2 <= 0) {
                    return i11;
                }
                size = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    /* renamed from: k */
    public static final void m10997k(ArrayList arrayList, long j6, InterfaceC2139c interfaceC2139c) {
        int size = arrayList.size();
        for (int iM10994h = m10994h(arrayList, g4.n0.m6458e(j6)); iM10994h < size; iM10994h++) {
            C2503s c2503s = (C2503s) arrayList.get(iM10994h);
            if (c2503s.f13710b >= g4.n0.m6457d(j6)) {
                return;
            }
            if (c2503s.f13710b != c2503s.f13711c) {
                interfaceC2139c.invoke(c2503s);
            }
        }
    }
}
