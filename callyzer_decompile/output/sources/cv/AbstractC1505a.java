package cv;

import an.j5;
import android.app.Activity;
import android.content.Context;
import androidx.compose.animation.AbstractC0235b;
import androidx.compose.foundation.AbstractC0237a;
import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.layout.AbstractC0245d;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ao.C0381t;
import ap.C0388a;
import aq.C0398a;
import aq.C0400c;
import aq.C0403f;
import au.C0439c;
import au.C0440d;
import aw.C0467g;
import b3.InterfaceC0579k;
import bm.C0699j;
import bt.C0763h;
import bt.C0768m;
import bt.i0;
import com.amplifyframework.statemachine.codegen.data.C1226a;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.R;
import com.websoptimization.callyzerbiz.data.model.response.LeadRecentNoteResponse;
import com.websoptimization.callyzerbiz.data.model.response.lead.LastCallDetails;
import d3.C1565s;
import d7.InterfaceC1637j;
import d7.c1;
import ev.C2136a;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import fv.C2378c;
import fv.C2386k;
import g2.e6;
import g2.ja;
import g2.p9;
import g2.qa;
import g2.t6;
import g2.ta;
import g2.u9;
import g2.v1;
import g2.vd;
import g2.xd;
import g2.y1;
import g2.z7;
import g4.o0;
import g7.C2536a;
import gm.C2641j;
import gm.C2645n;
import h7.AbstractC2868a;
import i1.p1;
import i3.AbstractC3166c;
import java.util.List;
import jn.InterfaceC3804c;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.i1;
import k2.n1;
import k2.s0;
import k2.w0;
import k4.C3998s;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.a0;
import ng.AbstractC5068s;
import o1.AbstractC5251j;
import o1.m1;
import og.af;
import og.hg;
import og.lb;
import og.qd;
import og.r0;
import og.t0;
import om.C5414p;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import p1.AbstractC5788a;
import pg.AbstractC5928i;
import pg.b9;
import pg.f9;
import pg.j0;
import r4.C6456k;
import s2.AbstractC6740i;
import s2.C6734c;
import sq.b1;
import sq.g2;
import tx.InterfaceC7266z;
import uv.AbstractC7554g;
import uv.AbstractC7556i;
import uw.C7565i;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import w1.AbstractC7861e;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7876o;
import w2.InterfaceC7879r;
import w3.k1;
import w3.p2;
import yv.C8791f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cv.a */
/* loaded from: classes3.dex */
public abstract class AbstractC1505a {

    /* renamed from: a */
    public static final C6734c f7614a = new C6734c(new C0400c(13), false, 1753955186);

    /* renamed from: b */
    public static final C6734c f7615b = new C6734c(new C0398a(4), false, -1154428449);

    /* renamed from: a */
    public static final void m5061a(int i10, int i11, String str, InterfaceC3962k interfaceC3962k) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-1852131642);
        int i12 = (c3966o.m8612e(i10) ? 4 : 2) | i11 | (c3966o.m8614g(str) ? 32 : 16);
        if (c3966o.m8598P(i12 & 1, (i12 & 19) != 18)) {
            b1.m13113q("+" + i10 + " " + str, AbstractC0242a.m660n(C7876o.f37669a, DefinitionKt.NO_Float_VALUE, 5, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 13), AbstractC7554g.m14301b(c3966o).f36374B, null, new C6456k(5), 2, 1, 0L, null, t6.m6311b(c3966o).f13056l, c3966o, 1769520, 392);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C1519o(i10, str, i11);
        }
    }

    /* renamed from: b */
    public static final void m5062b(int i10, long j6, int i11, InterfaceC2137a interfaceC2137a, InterfaceC3962k interfaceC3962k, int i12) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(1629370549);
        int i13 = (c3966o.m8612e(i10) ? 4 : 2) | i12;
        if ((i12 & 48) == 0) {
            i13 |= c3966o.m8613f(j6) ? 32 : 16;
        }
        int i14 = i13 | (c3966o.m8612e(i11) ? 256 : 128);
        if ((i12 & 3072) == 0) {
            i14 |= c3966o.m8616i(interfaceC2137a) ? 2048 : 1024;
        }
        if (c3966o.m8598P(i14 & 1, (i14 & 1171) != 1170)) {
            AbstractC3166c abstractC3166cM10866b = r0.m10866b(i10, i14 & 14, c3966o);
            C7876o c7876o = C7876o.f37669a;
            InterfaceC7879r interfaceC7879rM660n = AbstractC0242a.m660n(AbstractC0245d.m678o(c7876o, 28), DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 4, 6, 3);
            int i15 = i14 & 7168;
            boolean z6 = i15 == 2048;
            Object objM8596M = c3966o.m8596M();
            s0 s0Var = C3961j.f20408a;
            if (z6 || objM8596M == s0Var) {
                objM8596M = new C0440d(8, interfaceC2137a);
                c3966o.j0(objM8596M);
            }
            e6.m6132a(abstractC3166cM10866b, null, AbstractC0237a.m637e(interfaceC7879rM660n, false, null, null, (InterfaceC2137a) objM8596M, 7), j6, c3966o, ((i14 << 6) & 7168) | 48, 0);
            String strM10920c = t0.m10920c(c3966o, i11);
            InterfaceC7879r interfaceC7879rM660n2 = AbstractC0242a.m660n(c7876o, DefinitionKt.NO_Float_VALUE, 2, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 13);
            boolean z10 = i15 == 2048;
            Object objM8596M2 = c3966o.m8596M();
            if (z10 || objM8596M2 == s0Var) {
                objM8596M2 = new C0440d(9, interfaceC2137a);
                c3966o.j0(objM8596M2);
            }
            b1.m13113q(strM10920c, AbstractC0237a.m637e(interfaceC7879rM660n2, false, null, null, (InterfaceC2137a) objM8596M2, 7), j6, null, null, 0, 0, 0L, null, o0.m6461a(((vd) c3966o.m8618k(xd.f13268a)).f13056l, 0L, af.m10534c(14), C3998s.f20697g, null, null, 0L, 0L, null, 16777209), c3966o, (i14 << 3) & 896, 504);
            c3966o = c3966o;
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C1511g(i10, j6, i11, interfaceC2137a, i12, 0);
        }
    }

    /* renamed from: c */
    public static final void m5063c(C2136a c2136a, InterfaceC2139c interfaceC2139c, InterfaceC3962k interfaceC3962k, int i10) {
        boolean z6;
        InterfaceC2139c interfaceC2139c2 = interfaceC2139c;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-2029856660);
        int i11 = i10 | (c3966o.m8616i(c2136a) ? 32 : 16) | (c3966o.m8616i(interfaceC2139c2) ? 256 : 128);
        if (c3966o.m8598P(i11 & 1, (i11 & 147) != 146)) {
            C5414p c5414p = c2136a.f9969a;
            List list = c2136a.f9971c;
            if (c5414p == null || !c2136a.f9980l || list.isEmpty()) {
                z6 = false;
                c3966o.m8607Y(1658652918);
            } else {
                c3966o.m8607Y(1680025620);
                b1.m13113q(t0.m10920c(c3966o, R.string.recent_notes), null, 0L, null, new C6456k(5), 0, 0, 0L, null, ((vd) c3966o.m8618k(xd.f13268a)).f13049e, c3966o, 0, 494);
                c3966o.m8607Y(-777083953);
                int size = list.size();
                for (int i12 = 0; i12 < size; i12++) {
                    m5072l(c2136a, i12, c3966o, (i11 >> 3) & 14);
                }
                c3966o.m8623p(false);
                if (list.size() >= 3) {
                    c3966o.m8607Y(1680384538);
                    String strM10920c = t0.m10920c(c3966o, R.string.view_all_notes);
                    o0 o0Var = AbstractC7556i.f36430c;
                    long j6 = ((v1) c3966o.m8618k(y1.f13286a)).f12954a;
                    InterfaceC7879r interfaceC7879rMo14852e = AbstractC0242a.m660n(C7876o.f37669a, DefinitionKt.NO_Float_VALUE, 16, DefinitionKt.NO_Float_VALUE, 24, 5).mo14852e(new HorizontalAlignElement(C7864c.f37655p));
                    boolean zM8616i = ((i11 & 896) == 256) | c3966o.m8616i(c2136a);
                    Object objM8596M = c3966o.m8596M();
                    if (zM8616i || objM8596M == C3961j.f20408a) {
                        objM8596M = new i0(5, interfaceC2139c, c2136a);
                        c3966o.j0(objM8596M);
                    }
                    interfaceC2139c2 = interfaceC2139c;
                    b1.m13113q(strM10920c, AbstractC0237a.m637e(interfaceC7879rMo14852e, false, null, null, (InterfaceC2137a) objM8596M, 7), j6, null, new C6456k(3), 0, 0, 0L, null, o0Var, c3966o, 805306368, 488);
                    z6 = false;
                } else {
                    interfaceC2139c2 = interfaceC2139c;
                    z6 = false;
                    c3966o.m8607Y(1658652918);
                }
                c3966o.m8623p(z6);
            }
            c3966o.m8623p(z6);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0403f(c2136a, interfaceC2139c2, i10, 12);
        }
    }

    /* renamed from: d */
    public static final void m5064d(C2136a noteState, InterfaceC2139c onSelectionChanged, InterfaceC2137a onReminderDateClick, InterfaceC2137a onSelectedStatusCleared, InterfaceC3962k interfaceC3962k, int i10) {
        AbstractC4154l.m8923f(noteState, "noteState");
        AbstractC4154l.m8923f(onSelectionChanged, "onSelectionChanged");
        AbstractC4154l.m8923f(onReminderDateClick, "onReminderDateClick");
        AbstractC4154l.m8923f(onSelectedStatusCleared, "onSelectedStatusCleared");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-853564675);
        int i11 = (c3966o.m8616i(noteState) ? 4 : 2) | i10 | (c3966o.m8616i(onSelectionChanged) ? 32 : 16) | (c3966o.m8616i(onReminderDateClick) ? 256 : 128) | (c3966o.m8616i(onSelectedStatusCleared) ? NewHope.SENDB_BYTES : 1024);
        boolean z6 = false;
        if (c3966o.m8598P(i11 & 1, (i11 & 1171) != 1170)) {
            if (noteState.f9969a != null && noteState.f9980l && !noteState.f9970b.isEmpty()) {
                z6 = true;
            }
            AbstractC0235b.m629d(z6, null, null, null, null, AbstractC6740i.m12902d(1678272805, new C0768m(noteState, onSelectionChanged, onSelectedStatusCleared, onReminderDateClick, 2), c3966o), c3966o, 196608, 30);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0699j(i10, 3, noteState, onSelectionChanged, onReminderDateClick, onSelectedStatusCleared);
        }
    }

    /* renamed from: e */
    public static final void m5065e(String str, LastCallDetails lastCallDetails, Integer num, InterfaceC2139c navigateTo, boolean z6, InterfaceC2137a onBackMain, InterfaceC3962k interfaceC3962k, int i10) {
        C2386k c2386k;
        AbstractC4154l.m8923f(navigateTo, "navigateTo");
        AbstractC4154l.m8923f(onBackMain, "onBackMain");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-1569506634);
        int i11 = i10 | (c3966o.m8614g(str) ? 4 : 2) | (c3966o.m8616i(lastCallDetails) ? 32 : 16) | (c3966o.m8614g(num) ? 256 : 128) | (c3966o.m8616i(navigateTo) ? NewHope.SENDB_BYTES : 1024) | (c3966o.m8615h(z6) ? 16384 : 8192) | (c3966o.m8616i(onBackMain) ? 131072 : 65536);
        if (c3966o.m8598P(i11 & 1, (74899 & i11) != 74898)) {
            Context context = (Context) c3966o.m8618k(AndroidCompositionLocals_androidKt.f2134b);
            C2641j viewModelAssistedFactory = (C2641j) ((C2645n) ((InterfaceC3804c) lb.m10745a((Activity) c3966o.m8618k(C8791f.f42458b)))).f14266i.get();
            AbstractC4154l.m8923f(viewModelAssistedFactory, "viewModelAssistedFactory");
            C2378c c2378c = new C2378c(viewModelAssistedFactory, num, str, lastCallDetails, z6);
            String strValueOf = String.valueOf(num);
            c1 c1VarM6992a = AbstractC2868a.m6992a(c3966o);
            if (c1VarM6992a == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            C2386k c2386k2 = (C2386k) AbstractC5928i.m11691b(c1VarM6992a, a0.m8901a(C2386k.class), strValueOf, c2378c, c1VarM6992a instanceof InterfaceC1637j ? ((InterfaceC1637j) c1VarM6992a).getDefaultViewModelCreationExtras() : C2536a.f13867b);
            w0 w0VarM10853a = qd.m10853a(c2386k2.f10868s, c3966o);
            Object objM8596M = c3966o.m8596M();
            Object obj = C3961j.f20408a;
            if (objM8596M == obj) {
                objM8596M = new ta();
                c3966o.j0(objM8596M);
            }
            ta taVar = (ta) objM8596M;
            Object objM8596M2 = c3966o.m8596M();
            if (objM8596M2 == obj) {
                objM8596M2 = C3953b.m8510m(C7565i.f36440a, c3966o);
                c3966o.j0(objM8596M2);
            }
            InterfaceC7266z interfaceC7266z = (InterfaceC7266z) objM8596M2;
            Object objM8596M3 = c3966o.m8596M();
            if (objM8596M3 == obj) {
                objM8596M3 = C3953b.m8517t(Boolean.FALSE);
                c3966o.j0(objM8596M3);
            }
            w0 w0Var = (w0) objM8596M3;
            p2 p2Var = (p2) c3966o.m8618k(k1.f37844p);
            InterfaceC0579k interfaceC0579k = (InterfaceC0579k) c3966o.m8618k(k1.f37837i);
            p1 p1VarM11707b = j0.m11707b(c3966o);
            Object[] objArr = new Object[0];
            Object objM8596M4 = c3966o.m8596M();
            if (objM8596M4 == obj) {
                objM8596M4 = new C1226a(15);
                c3966o.j0(objM8596M4);
            }
            w0 w0Var2 = (w0) hg.m10691b(objArr, null, (InterfaceC2137a) objM8596M4, c3966o, 0, 6);
            Object[] objArr2 = new Object[0];
            Object objM8596M5 = c3966o.m8596M();
            if (objM8596M5 == obj) {
                objM8596M5 = new C1226a(16);
                c3966o.j0(objM8596M5);
            }
            w0 w0Var3 = (w0) hg.m10691b(objArr2, null, (InterfaceC2137a) objM8596M5, c3966o, 0, 6);
            Object objM8596M6 = c3966o.m8596M();
            if (objM8596M6 == obj) {
                objM8596M6 = C3953b.m8517t("");
                c3966o.j0(objM8596M6);
            }
            w0 w0Var4 = (w0) objM8596M6;
            Object objM8596M7 = c3966o.m8596M();
            if (objM8596M7 == obj) {
                objM8596M7 = C3953b.m8517t(Boolean.FALSE);
                c3966o.j0(objM8596M7);
            }
            w0 w0Var5 = (w0) objM8596M7;
            boolean z10 = (i11 & 458752) == 131072;
            Object objM8596M8 = c3966o.m8596M();
            if (z10 || objM8596M8 == obj) {
                objM8596M8 = new C0763h(onBackMain, w0Var5, 1);
                c3966o.j0(objM8596M8);
            }
            InterfaceC2137a interfaceC2137a = (InterfaceC2137a) objM8596M8;
            if (((Boolean) w0Var.getValue()).booleanValue()) {
                c3966o.m8607Y(2138410282);
                boolean zM8616i = c3966o.m8616i(interfaceC7266z);
                Object objM8596M9 = c3966o.m8596M();
                if (zM8616i || objM8596M9 == obj) {
                    objM8596M9 = new C0388a(interfaceC7266z, taVar, null, 8);
                    c3966o.j0(objM8596M9);
                }
                C3953b.m8503f((InterfaceC2141e) objM8596M9, context, c3966o);
                c3966o.m8623p(false);
            } else {
                c3966o.m8607Y(2138706115);
                c3966o.m8623p(false);
                qa qaVar = (qa) taVar.f12800b.getValue();
                if (qaVar != null) {
                    qaVar.m6292a();
                }
            }
            boolean zM8616i2 = c3966o.m8616i(c2386k2) | c3966o.m8614g(p2Var) | c3966o.m8616i(context) | c3966o.m8614g(interfaceC2137a);
            Object objM8596M10 = c3966o.m8596M();
            if (zM8616i2 || objM8596M10 == obj) {
                c2386k = c2386k2;
                objM8596M10 = new C0381t(c2386k, p2Var, context, interfaceC2137a, null, 4);
                c3966o.j0(objM8596M10);
            } else {
                c2386k = c2386k2;
            }
            C3953b.m8503f((InterfaceC2141e) objM8596M10, context, c3966o);
            if (((Boolean) w0Var3.getValue()).booleanValue()) {
                c3966o.m8607Y(2139093863);
                boolean zM8614g = c3966o.m8614g(w0Var3) | c3966o.m8614g(w0VarM10853a) | c3966o.m8614g(interfaceC2137a);
                Object objM8596M11 = c3966o.m8596M();
                if (zM8614g || objM8596M11 == obj) {
                    objM8596M11 = new C0467g(4, interfaceC2137a, w0Var3, w0VarM10853a);
                    c3966o.j0(objM8596M11);
                }
                m5071k((InterfaceC2137a) objM8596M11, c3966o, 0);
            } else {
                c3966o.m8607Y(2130088332);
            }
            c3966o.m8623p(false);
            C6734c c6734cM12902d = AbstractC6740i.m12902d(-1091309446, new C0403f(13, interfaceC2137a, w0VarM10853a), c3966o);
            C6734c c6734cM12902d2 = AbstractC6740i.m12902d(-664754948, new C1522r(taVar, 0), c3966o);
            C6734c c6734cM12902d3 = AbstractC6740i.m12902d(-1985083899, new C1523s(p1VarM11707b, interfaceC0579k, c2386k, w0Var2, w0Var3, interfaceC2137a, navigateTo, w0VarM10853a, w0Var4, w0Var), c3966o);
            c3966o = c3966o;
            u9.m6323a(null, c6734cM12902d, null, c6734cM12902d2, null, 0, 0L, 0L, null, c6734cM12902d3, c3966o, 805309488, 501);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C1524t(str, lastCallDetails, num, navigateTo, z6, onBackMain, i10);
        }
    }

    /* renamed from: f */
    public static final void m5066f(InterfaceC2137a onCancelClick, InterfaceC2137a onSaveClick, InterfaceC3962k interfaceC3962k, int i10) {
        InterfaceC2137a interfaceC2137a;
        C3966o c3966o;
        AbstractC4154l.m8923f(onCancelClick, "onCancelClick");
        AbstractC4154l.m8923f(onSaveClick, "onSaveClick");
        C3966o c3966o2 = (C3966o) interfaceC3962k;
        c3966o2.a0(867375914);
        int i11 = (c3966o2.m8616i(onCancelClick) ? 4 : 2) | i10 | (c3966o2.m8616i(onSaveClick) ? 32 : 16);
        if (c3966o2.m8598P(i11 & 1, (i11 & 19) != 18)) {
            C7876o c7876o = C7876o.f37669a;
            InterfaceC7879r interfaceC7879rM670g = AbstractC0245d.m670g(AbstractC0245d.m668e(AbstractC0242a.m658l(c7876o, DefinitionKt.NO_Float_VALUE, 24, 1), 1.0f), 50);
            o1.n1 n1VarM10357a = m1.m10357a(AbstractC5251j.f25763g, C7864c.f37652l, c3966o2, 54);
            int i12 = c3966o2.f20462P;
            i1 i1VarM8620m = c3966o2.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o2, interfaceC7879rM670g);
            InterfaceC7639k.V0.getClass();
            C7637i c7637i = C7638j.f36921b;
            c3966o2.c0();
            if (c3966o2.f20461O) {
                c3966o2.m8619l(c7637i);
            } else {
                c3966o2.m0();
            }
            C3953b.m8521x(C7638j.f36925f, n1VarM10357a, c3966o2);
            C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o2);
            C7636h c7636h = C7638j.f36926g;
            if (c3966o2.f20461O || !AbstractC4154l.m8918a(c3966o2.m8596M(), Integer.valueOf(i12))) {
                AbstractC1452a.m4577x(i12, c3966o2, i12, c7636h);
            }
            C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o2);
            float f6 = 150;
            float f10 = 4;
            g2.m13141S(AbstractC0242a.m660n(AbstractC0245d.m666c(AbstractC0245d.m682s(c7876o, f6), 1.0f), DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, f10, DefinitionKt.NO_Float_VALUE, 11), onSaveClick, 28, f9.m11629c(c3966o2, R.string.save_small_case), 0, null, C1565s.f7812e, c3966o2, 1573254 | (i11 & 112), 48);
            interfaceC2137a = onSaveClick;
            g2.m13146X(AbstractC0242a.m660n(AbstractC0245d.m666c(AbstractC0245d.m682s(c7876o, f6), 1.0f), f10, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 14), onCancelClick, 0L, DefinitionKt.NO_Float_VALUE, 28, f9.m11629c(c3966o2, R.string.cancel), 0L, c3966o2, ((i11 << 3) & 112) | 24582);
            c3966o = c3966o2;
            c3966o.m8623p(true);
        } else {
            interfaceC2137a = onSaveClick;
            c3966o = c3966o2;
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C1509e(onCancelClick, interfaceC2137a, i10, 0);
        }
    }

    /* renamed from: g */
    public static final void m5067g(String str, InterfaceC2137a onBackClick, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        int i12;
        AbstractC4154l.m8923f(onBackClick, "onBackClick");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-710004394);
        int i13 = (c3966o.m8614g(str) ? 4 : 2) | i10 | (c3966o.m8616i(onBackClick) ? 32 : 16);
        if (c3966o.m8598P(i13 & 1, (i13 & 19) != 18)) {
            if (str.length() == 0) {
                i11 = 585581347;
                i12 = R.string.add_note;
            } else {
                i11 = 585582563;
                i12 = R.string.edit_note;
            }
            g2.m13157i(C7876o.f37669a, null, false, AbstractC1452a.m4565l(c3966o, i11, i12, c3966o, false), AbstractC7554g.m14301b(c3966o).f36412x, R.drawable.icon_arrow_back, false, null, onBackClick, c3966o, ((i13 << 21) & 234881024) | 6, 198);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C1506b(i10, 0, onBackClick, str);
        }
    }

    /* renamed from: h */
    public static final void m5068h(C5414p callLog, List simList, int i10, InterfaceC3962k interfaceC3962k, int i11) {
        AbstractC4154l.m8923f(callLog, "callLog");
        AbstractC4154l.m8923f(simList, "simList");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(304140049);
        int i12 = (c3966o.m8616i(callLog) ? 4 : 2) | i11 | (c3966o.m8616i(simList) ? 32 : 16) | (c3966o.m8612e(i10) ? 256 : 128);
        if (c3966o.m8598P(i12 & 1, (i12 & 147) != 146)) {
            p9.m6240d(AbstractC0245d.m668e(C7876o.f37669a, 1.0f), AbstractC7861e.m14841b(10), p9.m6253q(AbstractC7554g.m14301b(c3966o).f36396h, c3966o, 0), p9.m6254r(4, 62), null, AbstractC6740i.m12902d(2108025347, new C1512h(callLog, simList, i10), c3966o), c3966o, 196614, 16);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C1513i(callLog, simList, i10, i11);
        }
    }

    /* renamed from: i */
    public static final void m5069i(String str, InterfaceC2137a interfaceC2137a, InterfaceC3962k interfaceC3962k, int i10) {
        InterfaceC2137a interfaceC2137a2;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(394098037);
        int i11 = (c3966o.m8614g(str) ? 4 : 2) | i10 | (c3966o.m8616i(interfaceC2137a) ? 32 : 16);
        if (c3966o.m8598P(i11 & 1, (i11 & 19) != 18)) {
            Object objM8596M = c3966o.m8596M();
            s0 s0Var = C3961j.f20408a;
            if (objM8596M == s0Var) {
                objM8596M = C3953b.m8510m(C7565i.f36440a, c3966o);
                c3966o.j0(objM8596M);
            }
            InterfaceC7266z interfaceC7266z = (InterfaceC7266z) objM8596M;
            C8791f c8791f = C8791f.f42457a;
            if (C8791f.m16171d(str)) {
                c3966o.m8607Y(-1865735301);
                Object objM8596M2 = c3966o.m8596M();
                if (objM8596M2 == s0Var) {
                    objM8596M2 = new j5(29);
                    c3966o.j0(objM8596M2);
                }
                ja jaVarM6355f = z7.m6355f(false, (InterfaceC2139c) objM8596M2, c3966o, 54, 0);
                interfaceC2137a2 = interfaceC2137a;
                g2.m13162n(0L, null, jaVarM6355f, interfaceC2137a2, AbstractC6740i.m12902d(1591780741, new C0768m(interfaceC7266z, jaVarM6355f, interfaceC2137a, str), c3966o), c3966o, ((i11 << 6) & 7168) | 24624, 1);
            } else {
                interfaceC2137a2 = interfaceC2137a;
                c3966o.m8607Y(-1884750515);
            }
            c3966o.m8623p(false);
        } else {
            interfaceC2137a2 = interfaceC2137a;
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C1506b(i10, 1, interfaceC2137a2, str);
        }
    }

    /* renamed from: j */
    public static final void m5070j(InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(257056441);
        if (c3966o.m8598P(i10 & 1, i10 != 0)) {
            g2.m13148Z(48, 4, f9.m11629c(c3966o, R.string.please_wait), c3966o);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0400c(i10, 14);
        }
    }

    /* renamed from: k */
    public static final void m5071k(InterfaceC2137a interfaceC2137a, InterfaceC3962k interfaceC3962k, int i10) {
        InterfaceC2137a interfaceC2137a2;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-1611731950);
        int i11 = (c3966o.m8616i(interfaceC2137a) ? 4 : 2) | i10;
        if (c3966o.m8598P(i11 & 1, (i11 & 3) != 2)) {
            Context context = (Context) c3966o.m8618k(AndroidCompositionLocals_androidKt.f2134b);
            String strM11629c = f9.m11629c(c3966o, R.string.permission_denied);
            String strM11629c2 = f9.m11629c(c3966o, R.string.permission_allowed_dialog_description);
            String strM11629c3 = f9.m11629c(c3966o, R.string.go_to_settings);
            boolean zM8616i = c3966o.m8616i(context) | ((i11 & 14) == 4);
            Object objM8596M = c3966o.m8596M();
            if (zM8616i || objM8596M == C3961j.f20408a) {
                objM8596M = new C1510f(context, interfaceC2137a, 0);
                c3966o.j0(objM8596M);
            }
            interfaceC2137a2 = interfaceC2137a;
            g2.m13150b(strM11629c, interfaceC2137a2, strM11629c2, strM11629c3, (InterfaceC2137a) objM8596M, f9.m11629c(c3966o, R.string.cancel), interfaceC2137a, c3966o, ((i11 << 3) & 112) | ((i11 << 18) & 3670016));
        } else {
            interfaceC2137a2 = interfaceC2137a;
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0439c(i10, 1, interfaceC2137a2);
        }
    }

    /* renamed from: l */
    public static final void m5072l(C2136a noteState, int i10, InterfaceC3962k interfaceC3962k, int i11) {
        int i12;
        AbstractC4154l.m8923f(noteState, "noteState");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(1691540740);
        if ((i11 & 6) == 0) {
            i12 = (c3966o.m8616i(noteState) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c3966o.m8612e(i10) ? 32 : 16;
        }
        if (c3966o.m8598P(i12 & 1, (i12 & 19) != 18)) {
            p9.m6240d(AbstractC0245d.m668e(AbstractC0242a.m658l(C7876o.f37669a, DefinitionKt.NO_Float_VALUE, 8, 1), 1.0f), AbstractC7861e.m14841b(14), p9.m6253q(AbstractC7554g.m14301b(c3966o).f36396h, c3966o, 0), p9.m6254r(4, 62), null, AbstractC6740i.m12902d(488132178, new C1514j(noteState, i10), c3966o), c3966o, 196614, 16);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C1515k(noteState, i10, i11, 0);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x048c  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m5073m(com.websoptimization.callyzerbiz.data.model.response.LeadRecentNoteResponse r47, k2.InterfaceC3962k r48, int r49) {
        /*
            Method dump skipped, instructions count: 1334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cv.AbstractC1505a.m5073m(com.websoptimization.callyzerbiz.data.model.response.LeadRecentNoteResponse, k2.k, int):void");
    }

    /* renamed from: n */
    public static final void m5074n(LeadRecentNoteResponse leadRecentNoteResponse, InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-826760009);
        int i11 = (c3966o.m8616i(leadRecentNoteResponse) ? 4 : 2) | i10;
        if (c3966o.m8598P(i11 & 1, (i11 & 3) != 2)) {
            C7876o c7876o = C7876o.f37669a;
            InterfaceC7879r interfaceC7879rM660n = AbstractC0242a.m660n(AbstractC0245d.m668e(c7876o, 1.0f), DefinitionKt.NO_Float_VALUE, 12, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 13);
            o1.n1 n1VarM10357a = m1.m10357a(AbstractC5251j.f25757a, C7864c.f37651k, c3966o, 48);
            int i12 = c3966o.f20462P;
            i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879rM660n);
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
            float f6 = 10;
            float f10 = 16;
            e6.m6132a(b9.m11551a(R.drawable.ic_add_note, 0, c3966o), null, AbstractC0245d.m682s(AbstractC0245d.m670g(AbstractC0242a.m660n(c7876o, f6, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 14), f10), f10), AbstractC5068s.m9996a(c3966o, R.color.notes_na_icon_color), c3966o, 432, 0);
            String strM4817g = leadRecentNoteResponse.m4817g();
            if (1.0f <= 0.0d) {
                AbstractC5788a.m11338a("invalid weight; must be greater than zero");
            }
            b1.m13113q(strM4817g, AbstractC0242a.m660n(new LayoutWeightElement(1.0f, true), 13, DefinitionKt.NO_Float_VALUE, f6, DefinitionKt.NO_Float_VALUE, 10), AbstractC7554g.m14301b(c3966o).f36389a, null, null, 2, 3, 0L, null, null, c3966o, 1769472, 920);
            c3966o.m8623p(true);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C1520p(leadRecentNoteResponse, i10, 1);
        }
    }
}
