package p001o;

import p001o.ac7;

/* loaded from: classes2.dex */
public abstract class me0 {
    /* renamed from: a */
    public static final ac7 m38806a(ac7.C12136a c12136a) {
        sq8.m48649h(c12136a, "<this>");
        return c12136a.m16854b();
    }

    /* renamed from: b */
    public static final int m38807b(boolean z, boolean z2) {
        if (z2 && z) {
            return 3;
        }
        if (z) {
            return 1;
        }
        return z2 ? 2 : 0;
    }

    /* renamed from: c */
    public static final int m38808c(ac7 ac7Var, int i) {
        sq8.m48649h(ac7Var, "fontWeight");
        return m38807b(ac7Var.compareTo(m38806a(ac7.f14477b)) >= 0, yb7.m57461d(i, yb7.f55185a.m57462a()));
    }
}
