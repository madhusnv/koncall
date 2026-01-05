package lu;

import androidx.compose.foundation.layout.AbstractC0245d;
import aq.C0403f;
import au.C0439c;
import bm.C0696g;
import bt.C0757b;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.R;
import com.websoptimization.callyzerbiz.common.exception.SimStateException;
import d3.C1565s;
import ex.InterfaceC2137a;
import g2.ja;
import g2.k0;
import g2.p9;
import g2.z7;
import hq.C3010o;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.n1;
import k2.s0;
import k2.w0;
import kotlin.jvm.internal.AbstractC4154l;
import o1.i1;
import pg.f9;
import pu.C6035c;
import s2.AbstractC6740i;
import sq.g2;
import uv.AbstractC7554g;
import w1.AbstractC7861e;
import w1.C7860d;
import w2.C7876o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lu.d */
/* loaded from: classes3.dex */
public abstract class AbstractC4518d {
    /* renamed from: a */
    public static final void m9364a(InterfaceC2137a onClick, InterfaceC3962k interfaceC3962k, int i10) {
        AbstractC4154l.m8923f(onClick, "onClick");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-1843571141);
        int i11 = (c3966o.m8616i(onClick) ? 4 : 2) | i10;
        if (c3966o.m8598P(i11 & 1, (i11 & 3) != 2)) {
            Object objM8596M = c3966o.m8596M();
            s0 s0Var = C3961j.f20408a;
            if (objM8596M == s0Var) {
                objM8596M = C3953b.m8517t(Boolean.FALSE);
                c3966o.j0(objM8596M);
            }
            w0 w0Var = (w0) objM8596M;
            if (((Boolean) w0Var.getValue()).booleanValue()) {
                c3966o.m8607Y(-2080835537);
                ja jaVarM6355f = z7.m6355f(true, null, c3966o, 6, 2);
                Object objM8596M2 = c3966o.m8596M();
                if (objM8596M2 == s0Var) {
                    objM8596M2 = new C0696g(w0Var, 26);
                    c3966o.j0(objM8596M2);
                }
                g2.m13162n(0L, null, jaVarM6355f, (InterfaceC2137a) objM8596M2, AbstractC6740i.m12902d(761445419, new C0757b(onClick, w0Var, 1), c3966o), c3966o, 27696, 1);
            } else {
                c3966o.m8607Y(-2082579225);
            }
            c3966o.m8623p(false);
            String strM11629c = f9.m11629c(c3966o, R.string.ts_battery_error_btn);
            Object objM8596M3 = c3966o.m8596M();
            if (objM8596M3 == s0Var) {
                objM8596M3 = new C0696g(w0Var, 27);
                c3966o.j0(objM8596M3);
            }
            m9369f(strM11629c, (InterfaceC2137a) objM8596M3, c3966o, 48);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0439c(i10, 8, onClick);
        }
    }

    /* renamed from: b */
    public static final void m9365b(boolean z6, InterfaceC2137a onClick, InterfaceC3962k interfaceC3962k, int i10) {
        AbstractC4154l.m8923f(onClick, "onClick");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(258594806);
        int i11 = (c3966o.m8615h(z6) ? 4 : 2) | i10 | (c3966o.m8616i(onClick) ? 32 : 16);
        if (c3966o.m8598P(i11 & 1, (i11 & 19) != 18)) {
            m9369f(z6 ? AbstractC1452a.m4565l(c3966o, -598487773, R.string.ts_internet_error_bg_btn, c3966o, false) : AbstractC1452a.m4565l(c3966o, -598485629, R.string.ts_internet_error_internet_btn, c3966o, false), onClick, c3966o, i11 & 112);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C4516b(z6, onClick, i10, 0);
        }
    }

    /* renamed from: c */
    public static final void m9366c(InterfaceC2137a onClick, InterfaceC3962k interfaceC3962k, int i10) {
        AbstractC4154l.m8923f(onClick, "onClick");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-479239645);
        int i11 = (c3966o.m8616i(onClick) ? 4 : 2) | i10;
        if (c3966o.m8598P(i11 & 1, (i11 & 3) != 2)) {
            m9369f(f9.m11629c(c3966o, R.string.ts_note_popup_error_btn), onClick, c3966o, (i11 << 3) & 112);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0439c(i10, 7, onClick);
        }
    }

    /* renamed from: d */
    public static final void m9367d(InterfaceC2137a onClick, InterfaceC3962k interfaceC3962k, int i10) {
        AbstractC4154l.m8923f(onClick, "onClick");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(764562818);
        int i11 = (c3966o.m8616i(onClick) ? 4 : 2) | i10;
        if (c3966o.m8598P(i11 & 1, (i11 & 3) != 2)) {
            m9369f(f9.m11629c(c3966o, R.string.ts_permission_error_btn), onClick, c3966o, (i11 << 3) & 112);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0439c(i10, 9, onClick);
        }
    }

    /* renamed from: e */
    public static final void m9368e(C6035c troubleshootErrorAction, InterfaceC2137a onClick, InterfaceC3962k interfaceC3962k, int i10) {
        AbstractC4154l.m8923f(troubleshootErrorAction, "troubleshootErrorAction");
        AbstractC4154l.m8923f(onClick, "onClick");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(885918894);
        int i11 = (c3966o.m8614g(troubleshootErrorAction) ? 4 : 2) | i10 | (c3966o.m8616i(onClick) ? 32 : 16);
        if (c3966o.m8598P(i11 & 1, (i11 & 19) != 18)) {
            SimStateException.EnumC1456a enumC1456a = troubleshootErrorAction.f29484b;
            if (enumC1456a == SimStateException.EnumC1456a.NO_AVAILABLE_SIM_IN_DB || enumC1456a == SimStateException.EnumC1456a.CONNECTED_SIM_NOT_EXIST_ON_DEVICE || enumC1456a == SimStateException.EnumC1456a.NO_CONNECTED_SIM_FOUND) {
                c3966o.m8607Y(-163812334);
                m9369f(f9.m11629c(c3966o, R.string.ts_sim_card_error_btn), onClick, c3966o, i11 & 112);
            } else {
                c3966o.m8607Y(-167180236);
            }
            c3966o.m8623p(false);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0403f(troubleshootErrorAction, onClick, i10, 22);
        }
    }

    /* renamed from: f */
    public static final void m9369f(String text, InterfaceC2137a onClick, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        C3966o c3966o;
        AbstractC4154l.m8923f(text, "text");
        AbstractC4154l.m8923f(onClick, "onClick");
        C3966o c3966o2 = (C3966o) interfaceC3962k;
        c3966o2.a0(1608205411);
        if ((i10 & 6) == 0) {
            i11 = (c3966o2.m8614g(text) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c3966o2.m8616i(onClick) ? 32 : 16;
        }
        if (c3966o2.m8598P(i11 & 1, (i11 & 19) != 18)) {
            C7860d c7860dM14840a = AbstractC7861e.m14840a(15);
            i1 i1Var = k0.f11893a;
            long j6 = AbstractC7554g.m14301b(c3966o2).f36388P;
            long j10 = C1565s.f7812e;
            float f6 = 12;
            float f10 = 0;
            p9.m6238b(onClick, AbstractC0245d.m664a(C7876o.f37669a, 50, 35), false, c7860dM14840a, k0.m6190a(j6, j10, 0L, C1565s.m5186b(0.6f, 14, j10), c3966o2, 4), null, null, new i1(f6, f10, f6, f10), AbstractC6740i.m12902d(-116556173, new C4517c(text, 0), c3966o2), c3966o2, ((i11 >> 3) & 14) | 817889328, 356);
            c3966o = c3966o2;
        } else {
            c3966o = c3966o2;
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C3010o(i10, onClick, text);
        }
    }
}
