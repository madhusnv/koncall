package g2;

import d3.C1565s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class o9 {

    /* renamed from: a */
    public final long f12307a = C1565s.f7817j;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o9) {
            return C1565s.m5187c(this.f12307a, ((o9) obj).f12307a);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = C1565s.f7818k;
        return Long.hashCode(this.f12307a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) C1565s.m5193i(this.f12307a)) + ", rippleAlpha=null)";
    }
}
