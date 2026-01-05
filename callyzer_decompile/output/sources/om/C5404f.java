package om;

import a2.AbstractC0030c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: om.f */
/* loaded from: classes3.dex */
public final class C5404f {

    /* renamed from: a */
    public final long f27128a;

    /* renamed from: b */
    public final long f27129b;

    public C5404f(long j6, long j10) {
        this.f27128a = j6;
        this.f27129b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5404f)) {
            return false;
        }
        C5404f c5404f = (C5404f) obj;
        return this.f27128a == c5404f.f27128a && this.f27129b == c5404f.f27129b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f27129b) + (Long.hashCode(this.f27128a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CallLogsBetweenDates(startTime=");
        sb2.append(this.f27128a);
        sb2.append(", endTime=");
        return AbstractC0030c.m116g(this.f27129b, ")", sb2);
    }
}
