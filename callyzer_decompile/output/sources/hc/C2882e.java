package hc;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hc.e */
/* loaded from: classes.dex */
public final class C2882e extends AbstractC2887j {

    /* renamed from: a */
    public final boolean f15909a;

    public C2882e(boolean z6) {
        this.f15909a = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2882e) && this.f15909a == ((C2882e) obj).f15909a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15909a);
    }

    public final String toString() {
        return String.valueOf(this.f15909a);
    }
}
