package r4;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: r4.s */
/* loaded from: classes.dex */
public final class C6464s {

    /* renamed from: a */
    public final int f31130a;

    public final boolean equals(Object obj) {
        if (obj instanceof C6464s) {
            return this.f31130a == ((C6464s) obj).f31130a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f31130a);
    }

    public final String toString() {
        int i10 = this.f31130a;
        return i10 == 1 ? "Linearity.Linear" : i10 == 2 ? "Linearity.FontHinting" : i10 == 3 ? "Linearity.None" : "Invalid";
    }
}
