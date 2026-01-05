package we;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: we.v */
/* loaded from: classes.dex */
public final class C8020v extends i0 {

    /* renamed from: a */
    public final h0 f38540a;

    /* renamed from: b */
    public final g0 f38541b;

    public C8020v(h0 h0Var, g0 g0Var) {
        this.f38540a = h0Var;
        this.f38541b = g0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i0) {
            i0 i0Var = (i0) obj;
            h0 h0Var = this.f38540a;
            if (h0Var != null ? h0Var.equals(((C8020v) i0Var).f38540a) : ((C8020v) i0Var).f38540a == null) {
                g0 g0Var = this.f38541b;
                if (g0Var != null ? g0Var.equals(((C8020v) i0Var).f38541b) : ((C8020v) i0Var).f38541b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        h0 h0Var = this.f38540a;
        int iHashCode = ((h0Var == null ? 0 : h0Var.hashCode()) ^ 1000003) * 1000003;
        g0 g0Var = this.f38541b;
        return (g0Var != null ? g0Var.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f38540a + ", mobileSubtype=" + this.f38541b + "}";
    }
}
