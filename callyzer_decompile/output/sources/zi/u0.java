package zi;

import a2.AbstractC0030c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class u0 extends y1 {

    /* renamed from: a */
    public final String f43286a;

    /* renamed from: b */
    public final String f43287b;

    /* renamed from: c */
    public final long f43288c;

    public u0(String str, String str2, long j6) {
        this.f43286a = str;
        this.f43287b = str2;
        this.f43288c = j6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y1) {
            u0 u0Var = (u0) ((y1) obj);
            if (this.f43286a.equals(u0Var.f43286a) && this.f43287b.equals(u0Var.f43287b) && this.f43288c == u0Var.f43288c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f43286a.hashCode() ^ 1000003) * 1000003) ^ this.f43287b.hashCode()) * 1000003;
        long j6 = this.f43288c;
        return iHashCode ^ ((int) ((j6 >>> 32) ^ j6));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f43286a);
        sb2.append(", code=");
        sb2.append(this.f43287b);
        sb2.append(", address=");
        return AbstractC0030c.m116g(this.f43288c, "}", sb2);
    }
}
