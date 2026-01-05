package d3;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d3.z */
/* loaded from: classes.dex */
public final class C1572z {

    /* renamed from: a */
    public final int f7824a;

    public final boolean equals(Object obj) {
        if (obj instanceof C1572z) {
            return this.f7824a == ((C1572z) obj).f7824a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7824a);
    }

    public final String toString() {
        int i10 = this.f7824a;
        return i10 == 0 ? "Argb8888" : i10 == 1 ? "Alpha8" : i10 == 2 ? "Rgb565" : i10 == 3 ? "F16" : i10 == 4 ? "Gpu" : "Unknown";
    }
}
