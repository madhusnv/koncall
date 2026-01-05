package g2;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a5 {

    /* renamed from: a */
    public final int f11169a;

    public final boolean equals(Object obj) {
        if (obj instanceof a5) {
            return this.f11169a == ((a5) obj).f11169a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f11169a);
    }

    public final String toString() {
        int i10 = this.f11169a;
        return i10 == 0 ? "Picker" : i10 == 1 ? "Input" : "Unknown";
    }
}
