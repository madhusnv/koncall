package mm;

import a2.AbstractC0030c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mm.e */
/* loaded from: classes3.dex */
public final class C4794e {

    /* renamed from: a */
    public final long f23865a;

    /* renamed from: b */
    public final long f23866b;

    public C4794e(long j6, long j10) {
        this.f23865a = j6;
        this.f23866b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4794e)) {
            return false;
        }
        C4794e c4794e = (C4794e) obj;
        return this.f23865a == c4794e.f23865a && this.f23866b == c4794e.f23866b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f23866b) + (Long.hashCode(this.f23865a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CloudFreeSpaceInfo(lastCheckedOn=");
        sb2.append(this.f23865a);
        sb2.append(", availableSpace=");
        return AbstractC0030c.m116g(this.f23866b, ")", sb2);
    }
}
