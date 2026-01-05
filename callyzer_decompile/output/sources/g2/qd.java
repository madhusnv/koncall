package g2;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class qd {

    /* renamed from: a */
    public final int f12540a;

    public final boolean equals(Object obj) {
        if (obj instanceof qd) {
            return this.f12540a == ((qd) obj).f12540a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12540a);
    }

    public final String toString() {
        int i10 = this.f12540a;
        return i10 == 0 ? "Hour" : i10 == 1 ? "Minute" : "";
    }
}
