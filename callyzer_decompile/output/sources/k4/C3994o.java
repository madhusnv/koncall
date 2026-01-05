package k4;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: k4.o */
/* loaded from: classes.dex */
public final class C3994o {

    /* renamed from: a */
    public final int f20689a;

    public final boolean equals(Object obj) {
        if (obj instanceof C3994o) {
            return this.f20689a == ((C3994o) obj).f20689a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f20689a);
    }

    public final String toString() {
        int i10 = this.f20689a;
        return i10 == 0 ? "Normal" : i10 == 1 ? "Italic" : "Invalid";
    }
}
