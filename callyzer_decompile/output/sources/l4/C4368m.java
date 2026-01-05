package l4;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l4.m */
/* loaded from: classes.dex */
public final class C4368m {

    /* renamed from: a */
    public final int f21924a;

    /* renamed from: a */
    public static String m9147a(int i10) {
        return i10 == -1 ? "Unspecified" : i10 == 0 ? "None" : i10 == 1 ? "Characters" : i10 == 2 ? "Words" : i10 == 3 ? "Sentences" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4368m) {
            return this.f21924a == ((C4368m) obj).f21924a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21924a);
    }

    public final String toString() {
        return m9147a(this.f21924a);
    }
}
