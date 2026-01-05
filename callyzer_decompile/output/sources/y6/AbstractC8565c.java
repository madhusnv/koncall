package y6;

import androidx.fragment.app.j0;
import androidx.fragment.app.j1;
import androidx.fragment.app.strictmode.FragmentReuseViolation;
import androidx.fragment.app.strictmode.Violation;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: y6.c */
/* loaded from: classes.dex */
public abstract class AbstractC8565c {

    /* renamed from: a */
    public static final C8564b f41561a = C8564b.f41560a;

    /* renamed from: a */
    public static C8564b m15831a(j0 j0Var) {
        while (j0Var != null) {
            if (j0Var.isAdded()) {
                AbstractC4154l.m8922e(j0Var.getParentFragmentManager(), "declaringFragment.parentFragmentManager");
            }
            j0Var = j0Var.getParentFragment();
        }
        return f41561a;
    }

    /* renamed from: b */
    public static void m15832b(Violation violation) {
        if (j1.m1152K(3)) {
            violation.f2699a.getClass();
        }
    }

    /* renamed from: c */
    public static final void m15833c(j0 j0Var, String previousFragmentId) {
        AbstractC4154l.m8923f(previousFragmentId, "previousFragmentId");
        m15832b(new FragmentReuseViolation(j0Var, "Attempting to reuse fragment " + j0Var + " with previous ID " + previousFragmentId));
        m15831a(j0Var).getClass();
        EnumC8563a enumC8563a = EnumC8563a.PENALTY_LOG;
    }
}
