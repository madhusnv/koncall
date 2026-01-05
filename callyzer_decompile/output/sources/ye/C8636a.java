package ye;

import a2.AbstractC0030c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ye.a */
/* loaded from: classes.dex */
public final class C8636a {

    /* renamed from: a */
    public final EnumC8638c f41916a;

    /* renamed from: b */
    public final long f41917b;

    public C8636a(EnumC8638c enumC8638c, long j6) {
        if (enumC8638c == null) {
            throw new NullPointerException("Null status");
        }
        this.f41916a = enumC8638c;
        this.f41917b = j6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8636a) {
            C8636a c8636a = (C8636a) obj;
            if (this.f41916a.equals(c8636a.f41916a) && this.f41917b == c8636a.f41917b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f41916a.hashCode() ^ 1000003) * 1000003;
        long j6 = this.f41917b;
        return iHashCode ^ ((int) ((j6 >>> 32) ^ j6));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BackendResponse{status=");
        sb2.append(this.f41916a);
        sb2.append(", nextRequestWaitMillis=");
        return AbstractC0030c.m116g(this.f41917b, "}", sb2);
    }
}
