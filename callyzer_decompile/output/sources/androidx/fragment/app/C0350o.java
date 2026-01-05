package androidx.fragment.app;

import android.transition.Transition;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.fragment.app.o */
/* loaded from: classes.dex */
public final class C0350o extends AbstractC0346k {

    /* renamed from: b */
    public final Object f2652b;

    /* renamed from: c */
    public final boolean f2653c;

    /* renamed from: d */
    public final Object f2654d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0350o(h2 h2Var, boolean z6, boolean z10) {
        super(h2Var);
        j0 j0Var = h2Var.f2547c;
        l2 l2Var = h2Var.f2545a;
        l2 l2Var2 = l2.VISIBLE;
        this.f2652b = l2Var == l2Var2 ? z6 ? j0Var.getReenterTransition() : j0Var.getEnterTransition() : z6 ? j0Var.getReturnTransition() : j0Var.getExitTransition();
        this.f2653c = h2Var.f2545a == l2Var2 ? z6 ? j0Var.getAllowReturnTransitionOverlap() : j0Var.getAllowEnterTransitionOverlap() : true;
        this.f2654d = z10 ? z6 ? j0Var.getSharedElementReturnTransition() : j0Var.getSharedElementEnterTransition() : null;
    }

    /* renamed from: b */
    public final c2 m1213b() {
        Object obj = this.f2652b;
        c2 c2VarM1214c = m1214c(obj);
        Object obj2 = this.f2654d;
        c2 c2VarM1214c2 = m1214c(obj2);
        if (c2VarM1214c == null || c2VarM1214c2 == null || c2VarM1214c == c2VarM1214c2) {
            return c2VarM1214c == null ? c2VarM1214c2 : c2VarM1214c;
        }
        throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.f2605a.f2547c + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition " + obj2).toString());
    }

    /* renamed from: c */
    public final c2 m1214c(Object obj) {
        if (obj == null) {
            return null;
        }
        a2 a2Var = v1.f2724a;
        if (obj instanceof Transition) {
            return a2Var;
        }
        c2 c2Var = v1.f2725b;
        if (c2Var != null && c2Var.mo1100e(obj)) {
            return c2Var;
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f2605a.f2547c + " is not a valid framework Transition or AndroidX Transition");
    }
}
