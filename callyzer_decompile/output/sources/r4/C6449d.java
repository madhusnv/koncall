package r4;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: r4.d */
/* loaded from: classes.dex */
public final class C6449d {

    /* renamed from: a */
    public final int f31104a;

    /* renamed from: a */
    public static String m12440a(int i10) {
        return i10 == 1 ? "Hyphens.None" : i10 == 2 ? "Hyphens.Auto" : i10 == Integer.MIN_VALUE ? "Hyphens.Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6449d) {
            return this.f31104a == ((C6449d) obj).f31104a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f31104a);
    }

    public final String toString() {
        return m12440a(this.f31104a);
    }
}
