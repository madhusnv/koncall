package r4;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: r4.k */
/* loaded from: classes.dex */
public final class C6456k {

    /* renamed from: a */
    public final int f31115a;

    /* renamed from: a */
    public static String m12444a(int i10) {
        return i10 == 1 ? "Left" : i10 == 2 ? "Right" : i10 == 3 ? "Center" : i10 == 4 ? "Justify" : i10 == 5 ? "Start" : i10 == 6 ? "End" : i10 == Integer.MIN_VALUE ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6456k) {
            return this.f31115a == ((C6456k) obj).f31115a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f31115a);
    }

    public final String toString() {
        return m12444a(this.f31115a);
    }
}
