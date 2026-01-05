package og;

import androidx.compose.foundation.AbstractC0237a;
import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.layout.AbstractC0245d;
import aq.C0403f;
import au.C0440d;
import b2.C0554l;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import cp.C1470a;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import java.net.ProtocolException;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;
import nx.AbstractC5185w;
import o1.AbstractC5251j;
import o1.AbstractC5260s;
import o1.C5261t;
import p1.AbstractC5788a;
import qp.C6264a;
import r1.C6417b;
import s2.AbstractC6740i;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import w1.AbstractC7861e;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7876o;
import w2.InterfaceC7879r;
import zp.C9002b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class fb {
    /* renamed from: a */
    public static final void m10647a(C9002b analytics, InterfaceC2137a openSubScreen, InterfaceC3962k interfaceC3962k, int i10) {
        AbstractC4154l.m8923f(analytics, "analytics");
        AbstractC4154l.m8923f(openSubScreen, "openSubScreen");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(411614468);
        int i11 = (c3966o.m8616i(analytics) ? 4 : 2) | i10 | (c3966o.m8616i(openSubScreen) ? 32 : 16);
        if (c3966o.m8598P(i11 & 1, (i11 & 19) != 18)) {
            float f6 = 8;
            InterfaceC7879r interfaceC7879rM650d = AbstractC0242a.m650d(AbstractC0242a.m656j(C7876o.f37669a, f6));
            boolean z6 = (i11 & 112) == 32;
            Object objM8596M = c3966o.m8596M();
            if (z6 || objM8596M == C3961j.f20408a) {
                objM8596M = new C0440d(6, openSubScreen);
                c3966o.j0(objM8596M);
            }
            g2.p9.m6240d(AbstractC0237a.m637e(interfaceC7879rM650d, false, null, null, (InterfaceC2137a) objM8596M, 7), AbstractC7861e.m14841b(15), null, g2.p9.m6254r(f6, 62), null, AbstractC6740i.m12902d(713204818, new bt.l0(1, analytics), c3966o), c3966o, 196608, 20);
        } else {
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0403f(analytics, openSubScreen, i10, 9);
        }
    }

    /* renamed from: b */
    public static final void m10648b(C6264a analytics, l7.a0 navController, InterfaceC3962k interfaceC3962k, int i10) {
        AbstractC4154l.m8923f(analytics, "analytics");
        AbstractC4154l.m8923f(navController, "navController");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(1514277060);
        int i11 = (c3966o.m8616i(analytics) ? 4 : 2) | i10 | (c3966o.m8616i(navController) ? 32 : 16);
        if (c3966o.m8598P(i11 & 1, (i11 & 19) != 18)) {
            float f6 = 10;
            InterfaceC7879r interfaceC7879rM660n = AbstractC0242a.m660n(AbstractC0245d.f1971c, DefinitionKt.NO_Float_VALUE, f6, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, 13);
            C5261t c5261tM10367a = AbstractC5260s.m10367a(AbstractC5251j.f25759c, C7864c.f37654n, c3966o, 0);
            int i12 = c3966o.f20462P;
            k2.i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879rM660n);
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
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i12))) {
                AbstractC1452a.m4577x(i12, c3966o, i12, c7636h);
            }
            C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
            InterfaceC7879r interfaceC7879rM660n2 = AbstractC0242a.m660n(C7876o.f37669a, f6, DefinitionKt.NO_Float_VALUE, f6, DefinitionKt.NO_Float_VALUE, 10);
            if (1.0f <= 0.0d) {
                AbstractC5788a.m11338a("invalid weight; must be greater than zero");
            }
            InterfaceC7879r interfaceC7879rM9747u = AbstractC4801l.m9747u(1.0f, interfaceC7879rM660n2, true);
            C6417b c6417b = new C6417b(2);
            boolean zM8616i = c3966o.m8616i(analytics) | c3966o.m8616i(navController);
            Object objM8596M = c3966o.m8596M();
            if (zM8616i || objM8596M == C3961j.f20408a) {
                objM8596M = new an.o1(21, analytics, navController);
                c3966o.j0(objM8596M);
            }
            rd.m10874b(c6417b, interfaceC7879rM9747u, null, null, null, null, null, false, null, (InterfaceC2139c) objM8596M, c3966o, 0, 0, 1020);
            c3966o.m8623p(true);
        } else {
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C1470a(analytics, navController, i10, 2);
        }
    }

    /* renamed from: c */
    public static C0554l m10649c(String statusLine) throws ProtocolException {
        iz.f0 f0Var;
        int i10;
        String strSubstring;
        AbstractC4154l.m8923f(statusLine, "statusLine");
        if (AbstractC5185w.m10138t(statusLine, "HTTP/1.", false)) {
            i10 = 9;
            if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            int iCharAt = statusLine.charAt(7) - '0';
            if (iCharAt == 0) {
                f0Var = iz.f0.HTTP_1_0;
            } else {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                f0Var = iz.f0.HTTP_1_1;
            }
        } else if (AbstractC5185w.m10138t(statusLine, "ICY ", false)) {
            f0Var = iz.f0.HTTP_1_0;
            i10 = 4;
        } else {
            if (!AbstractC5185w.m10138t(statusLine, "SOURCETABLE ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            f0Var = iz.f0.HTTP_1_1;
            i10 = 12;
        }
        int i11 = i10 + 3;
        if (statusLine.length() < i11) {
            throw new ProtocolException("Unexpected status line: ".concat(statusLine));
        }
        String strSubstring2 = statusLine.substring(i10, i11);
        AbstractC4154l.m8922e(strSubstring2, "substring(...)");
        Integer numM10140v = AbstractC5185w.m10140v(strSubstring2);
        if (numM10140v == null) {
            throw new ProtocolException("Unexpected status line: ".concat(statusLine));
        }
        int iIntValue = numM10140v.intValue();
        if (statusLine.length() <= i11) {
            strSubstring = "";
        } else {
            if (statusLine.charAt(i11) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            strSubstring = statusLine.substring(i10 + 4);
            AbstractC4154l.m8922e(strSubstring, "substring(...)");
        }
        return new C0554l(f0Var, iIntValue, strSubstring);
    }
}
