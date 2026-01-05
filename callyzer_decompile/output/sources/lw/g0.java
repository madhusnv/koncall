package lw;

import mw.C4896d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class g0 {

    /* renamed from: a */
    public final C4896d f22585a;

    /* renamed from: b */
    public final C4896d f22586b;

    public g0(C4896d c4896d, C4896d c4896d2) {
        this.f22585a = c4896d;
        this.f22586b = c4896d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f22585a.equals(g0Var.f22585a) && this.f22586b.equals(g0Var.f22586b);
    }

    public final int hashCode() {
        return Double.hashCode(this.f22586b.f24423a) + (Double.hashCode(this.f22585a.f24423a) * 31);
    }

    public final String toString() {
        return "PieSliceData(startAngle=" + this.f22585a + ", angle=" + this.f22586b + ")";
    }
}
