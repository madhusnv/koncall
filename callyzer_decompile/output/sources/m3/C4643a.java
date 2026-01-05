package m3;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: m3.a */
/* loaded from: classes.dex */
public final class C4643a {

    /* renamed from: a */
    public final int f22888a;

    public final boolean equals(Object obj) {
        if (obj instanceof C4643a) {
            return this.f22888a == ((C4643a) obj).f22888a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f22888a);
    }

    public final String toString() {
        int i10 = this.f22888a;
        return i10 == 1 ? "Touch" : i10 == 2 ? "Keyboard" : "Error";
    }
}
