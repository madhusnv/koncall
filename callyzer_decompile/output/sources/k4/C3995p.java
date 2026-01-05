package k4;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: k4.p */
/* loaded from: classes.dex */
public final class C3995p {

    /* renamed from: a */
    public final int f20690a;

    public final boolean equals(Object obj) {
        if (obj instanceof C3995p) {
            return this.f20690a == ((C3995p) obj).f20690a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f20690a);
    }

    public final String toString() {
        int i10 = this.f20690a;
        return i10 == 0 ? "None" : i10 == 1 ? "Weight" : i10 == 2 ? "Style" : i10 == 65535 ? "All" : "Invalid";
    }
}
