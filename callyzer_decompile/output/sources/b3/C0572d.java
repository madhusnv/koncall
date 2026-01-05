package b3;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b3.d */
/* loaded from: classes.dex */
public final class C0572d {

    /* renamed from: a */
    public final int f3900a;

    /* renamed from: a */
    public static String m1709a(int i10) {
        return i10 == 1 ? "Next" : i10 == 2 ? "Previous" : i10 == 3 ? "Left" : i10 == 4 ? "Right" : i10 == 5 ? "Up" : i10 == 6 ? "Down" : i10 == 7 ? "Enter" : i10 == 8 ? "Exit" : "Invalid FocusDirection";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0572d) {
            return this.f3900a == ((C0572d) obj).f3900a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3900a);
    }

    public final String toString() {
        return m1709a(this.f3900a);
    }
}
