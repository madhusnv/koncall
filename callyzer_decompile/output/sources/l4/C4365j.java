package l4;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l4.j */
/* loaded from: classes.dex */
public final class C4365j {

    /* renamed from: a */
    public final int f21911a;

    /* renamed from: a */
    public static String m9113a(int i10) {
        return i10 == -1 ? "Unspecified" : i10 == 0 ? "None" : i10 == 1 ? "Default" : i10 == 2 ? "Go" : i10 == 3 ? "Search" : i10 == 4 ? "Send" : i10 == 5 ? "Previous" : i10 == 6 ? "Next" : i10 == 7 ? "Done" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4365j) {
            return this.f21911a == ((C4365j) obj).f21911a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21911a);
    }

    public final String toString() {
        return m9113a(this.f21911a);
    }
}
