package pg;

import android.view.View;
import kotlin.jvm.internal.AbstractC4154l;
import kx.C4266h;
import y7.AbstractC8586u;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class h8 {
    /* renamed from: a */
    public static final jc.g0 m11682a(jc.h0 h0Var) {
        jc.g0 g0Var;
        AbstractC4154l.m8923f(h0Var, "<this>");
        jc.f0 f0Var = jc.g0.Companion;
        int i10 = h0Var.f19575a;
        f0Var.getClass();
        jc.g0[] g0VarArrValues = jc.g0.values();
        int length = g0VarArrValues.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                g0Var = null;
                break;
            }
            g0Var = g0VarArrValues[i11];
            C4266h c4266h = g0Var.range;
            int i12 = c4266h.f21646a;
            if (i10 <= c4266h.f21647b && i12 <= i10) {
                break;
            }
            i11++;
        }
        if (g0Var != null) {
            return g0Var;
        }
        throw new IllegalStateException(("Invalid HTTP code " + i10).toString());
    }

    /* renamed from: b */
    public static int m11683b(y7.q0 q0Var, AbstractC8586u abstractC8586u, View view, View view2, y7.f0 f0Var, boolean z6) {
        if (f0Var.m15858v() == 0 || q0Var.m15894b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z6) {
            return Math.abs(y7.f0.m15843D(view) - y7.f0.m15843D(view2)) + 1;
        }
        return Math.min(abstractC8586u.mo15912n(), abstractC8586u.mo15902d(view2) - abstractC8586u.mo15905g(view));
    }

    /* renamed from: c */
    public static int m11684c(y7.q0 q0Var, AbstractC8586u abstractC8586u, View view, View view2, y7.f0 f0Var, boolean z6, boolean z10) {
        if (f0Var.m15858v() == 0 || q0Var.m15894b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z10 ? Math.max(0, (q0Var.m15894b() - Math.max(y7.f0.m15843D(view), y7.f0.m15843D(view2))) - 1) : Math.max(0, Math.min(y7.f0.m15843D(view), y7.f0.m15843D(view2)));
        if (z6) {
            return Math.round((iMax * (Math.abs(abstractC8586u.mo15902d(view2) - abstractC8586u.mo15905g(view)) / (Math.abs(y7.f0.m15843D(view) - y7.f0.m15843D(view2)) + 1))) + (abstractC8586u.mo15911m() - abstractC8586u.mo15905g(view)));
        }
        return iMax;
    }

    /* renamed from: d */
    public static int m11685d(y7.q0 q0Var, AbstractC8586u abstractC8586u, View view, View view2, y7.f0 f0Var, boolean z6) {
        if (f0Var.m15858v() == 0 || q0Var.m15894b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z6) {
            return q0Var.m15894b();
        }
        return (int) (((abstractC8586u.mo15902d(view2) - abstractC8586u.mo15905g(view)) / (Math.abs(y7.f0.m15843D(view) - y7.f0.m15843D(view2)) + 1)) * q0Var.m15894b());
    }

    /* renamed from: e */
    public static final boolean m11686e(jc.h0 h0Var) {
        AbstractC4154l.m8923f(h0Var, "<this>");
        return jc.g0.SUCCESS.contains(h0Var.f19575a);
    }
}
