package b2;

import d3.C1565s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: a */
    public final long f3758a;

    /* renamed from: b */
    public final long f3759b;

    public h1(long j6, long j10) {
        this.f3758a = j6;
        this.f3759b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return C1565s.m5187c(this.f3758a, h1Var.f3758a) && C1565s.m5187c(this.f3759b, h1Var.f3759b);
    }

    public final int hashCode() {
        int i10 = C1565s.f7818k;
        return Long.hashCode(this.f3759b) + (Long.hashCode(this.f3758a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectionColors(selectionHandleColor=");
        i0.m0.m7391x(this.f3758a, ", selectionBackgroundColor=", sb2);
        sb2.append((Object) C1565s.m5193i(this.f3759b));
        sb2.append(')');
        return sb2.toString();
    }
}
