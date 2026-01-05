package at;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: at.c */
/* loaded from: classes3.dex */
public final class C0432c {

    /* renamed from: a */
    public final int f3190a;

    /* renamed from: b */
    public final String f3191b;

    public C0432c(int i10, String str) {
        this.f3190a = i10;
        this.f3191b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0432c)) {
            return false;
        }
        C0432c c0432c = (C0432c) obj;
        return this.f3190a == c0432c.f3190a && this.f3191b.equals(c0432c.f3191b);
    }

    public final int hashCode() {
        return this.f3191b.hashCode() + (Integer.hashCode(this.f3190a) * 31);
    }

    public final String toString() {
        return "ImageItem(imageResId=" + this.f3190a + ", title=" + this.f3191b + ")";
    }
}
