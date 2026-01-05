package og;

import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import bp.C0718b;
import bp.C0719c;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class g1 {
    /* renamed from: a */
    public static final void m10661a(InterfaceC2141e onEvent, InterfaceC3962k interfaceC3962k, int i10) {
        AbstractC4154l.m8923f(onEvent, "onEvent");
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(1729847592);
        int i11 = (c3966o.m8616i(onEvent) ? 4 : 2) | i10;
        if (c3966o.m8598P(i11 & 1, (i11 & 3) != 2)) {
            k2.w0 w0VarM8520w = C3953b.m8520w(onEvent, c3966o);
            k2.w0 w0VarM8520w2 = C3953b.m8520w(c3966o.m8618k(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner()), c3966o);
            Object value = w0VarM8520w2.getValue();
            boolean zM8614g = c3966o.m8614g(w0VarM8520w2) | c3966o.m8614g(w0VarM8520w);
            Object objM8596M = c3966o.m8596M();
            if (zM8614g || objM8596M == C3961j.f20408a) {
                objM8596M = new C0718b(w0VarM8520w2, w0VarM8520w, 0);
                c3966o.j0(objM8596M);
            }
            C3953b.m8500c(value, (InterfaceC2139c) objM8596M, c3966o);
        } else {
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0719c(onEvent, i10);
        }
    }

    /* renamed from: b */
    public static final double m10662b(double d2, double d10, lw.c0 c0Var) {
        double d11 = d10 - d2;
        if (Math.abs(d11 / ((d10 + d2) / 2)) < 0.01d) {
            return d2;
        }
        if (d10 == 0.0d && d2 == 0.0d) {
            return d2;
        }
        double d12 = Double.isInfinite(d10) ? d2 == 0.0d ? 1.0d : d2 * 2.0d : (d11 / 2.0d) + d2;
        return ((Boolean) c0Var.invoke(Double.valueOf(d12))).booleanValue() ? m10662b(d12, d10, c0Var) : m10662b(d2, d12, c0Var);
    }
}
