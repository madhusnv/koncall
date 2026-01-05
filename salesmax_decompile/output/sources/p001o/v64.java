package p001o;

import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class v64 {

    /* renamed from: a */
    public static final Set f49913a = Collections.unmodifiableSet(EnumSet.of(p72.PASSIVE_FOCUSED, p72.PASSIVE_NOT_FOCUSED, p72.LOCKED_FOCUSED, p72.LOCKED_NOT_FOCUSED));

    /* renamed from: b */
    public static final Set f49914b = Collections.unmodifiableSet(EnumSet.of(r72.CONVERGED, r72.UNKNOWN));

    /* renamed from: c */
    public static final Set f49915c;

    /* renamed from: d */
    public static final Set f49916d;

    static {
        n72 n72Var = n72.CONVERGED;
        n72 n72Var2 = n72.FLASH_REQUIRED;
        n72 n72Var3 = n72.UNKNOWN;
        Set setUnmodifiableSet = Collections.unmodifiableSet(EnumSet.of(n72Var, n72Var2, n72Var3));
        f49915c = setUnmodifiableSet;
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) setUnmodifiableSet);
        enumSetCopyOf.remove(n72Var2);
        enumSetCopyOf.remove(n72Var3);
        f49916d = Collections.unmodifiableSet(enumSetCopyOf);
    }

    /* renamed from: a */
    public static boolean m52351a(u72 u72Var, boolean z) {
        boolean z2 = u72Var.mo46024i() == o72.OFF || u72Var.mo46024i() == o72.UNKNOWN || f49913a.contains(u72Var.mo46022g());
        boolean z3 = u72Var.mo46021f() == m72.OFF;
        boolean z4 = !z ? !(z3 || f49915c.contains(u72Var.mo46025j())) : !(z3 || f49916d.contains(u72Var.mo46025j()));
        boolean z5 = (u72Var.mo46020d() == q72.OFF) || f49914b.contains(u72Var.mo46023h());
        wja.m54627a("ConvergenceUtils", "checkCaptureResult, AE=" + u72Var.mo46025j() + " AF =" + u72Var.mo46022g() + " AWB=" + u72Var.mo46023h());
        return z2 && z4 && z5;
    }
}
