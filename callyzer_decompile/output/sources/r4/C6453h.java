package r4;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: r4.h */
/* loaded from: classes.dex */
public final class C6453h {

    /* renamed from: a */
    public final int f31111a;

    public final boolean equals(Object obj) {
        if (obj instanceof C6453h) {
            return this.f31111a == ((C6453h) obj).f31111a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f31111a);
    }

    public final String toString() {
        int i10 = this.f31111a;
        return i10 == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i10 == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i10 == 17 ? "LineHeightStyle.Trim.Both" : i10 == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
    }
}
