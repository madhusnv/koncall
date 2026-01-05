package c0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c0.d */
/* loaded from: classes.dex */
public final class C0811d {

    /* renamed from: a */
    public final EnumC0826s f5061a;

    /* renamed from: b */
    public final C0812e f5062b;

    public C0811d(EnumC0826s enumC0826s, C0812e c0812e) {
        if (enumC0826s == null) {
            throw new NullPointerException("Null type");
        }
        this.f5061a = enumC0826s;
        this.f5062b = c0812e;
    }

    public final boolean equals(Object obj) {
        C0812e c0812e;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0811d) {
            C0811d c0811d = (C0811d) obj;
            C0812e c0812e2 = c0811d.f5062b;
            if (this.f5061a.equals(c0811d.f5061a) && ((c0812e = this.f5062b) != null ? c0812e.equals(c0812e2) : c0812e2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f5061a.hashCode() ^ 1000003) * 1000003;
        C0812e c0812e = this.f5062b;
        return iHashCode ^ (c0812e == null ? 0 : c0812e.hashCode());
    }

    public final String toString() {
        return "CameraState{type=" + this.f5061a + ", error=" + this.f5062b + "}";
    }
}
