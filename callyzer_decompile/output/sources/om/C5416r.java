package om;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: om.r */
/* loaded from: classes3.dex */
public final class C5416r {

    /* renamed from: a */
    public final int f27213a;

    /* renamed from: b */
    public final Long f27214b;

    public C5416r(int i10, Long l9) {
        this.f27213a = i10;
        this.f27214b = l9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5416r)) {
            return false;
        }
        C5416r c5416r = (C5416r) obj;
        return this.f27213a == c5416r.f27213a && AbstractC4154l.m8918a(this.f27214b, c5416r.f27214b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f27213a) * 31;
        Long l9 = this.f27214b;
        return iHashCode + (l9 == null ? 0 : l9.hashCode());
    }

    public final String toString() {
        return "SummeryAnalyticsData(count=" + this.f27213a + ", duration=" + this.f27214b + ")";
    }
}
