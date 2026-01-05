package t8;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a */
    public final long f34126a;

    /* renamed from: b */
    public final long f34127b;

    public d0(long j6, long j10) {
        this.f34126a = j6;
        this.f34127b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d0.class.equals(obj.getClass())) {
            d0 d0Var = (d0) obj;
            if (d0Var.f34126a == this.f34126a && d0Var.f34127b == this.f34127b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f34127b) + (Long.hashCode(this.f34126a) * 31);
    }

    public final String toString() {
        return "PeriodicityInfo{repeatIntervalMillis=" + this.f34126a + ", flexIntervalMillis=" + this.f34127b + '}';
    }
}
