package l4;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l4.n */
/* loaded from: classes.dex */
public final class C4369n {

    /* renamed from: a */
    public final int f21925a;

    /* renamed from: a */
    public static String m9148a(int i10) {
        return i10 == 0 ? "Unspecified" : i10 == 1 ? "Text" : i10 == 2 ? "Ascii" : i10 == 3 ? "Number" : i10 == 4 ? "Phone" : i10 == 5 ? "Uri" : i10 == 6 ? "Email" : i10 == 7 ? "Password" : i10 == 8 ? "NumberPassword" : i10 == 9 ? "Decimal" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4369n) {
            return this.f21925a == ((C4369n) obj).f21925a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21925a);
    }

    public final String toString() {
        return m9148a(this.f21925a);
    }
}
