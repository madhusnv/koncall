package om;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: om.h */
/* loaded from: classes3.dex */
public final class C5406h {

    /* renamed from: a */
    public final int f27140a;

    /* renamed from: b */
    public final Long f27141b;

    /* renamed from: c */
    public int f27142c;

    public C5406h(int i10, Long l9) {
        this.f27140a = i10;
        this.f27141b = l9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5406h)) {
            return false;
        }
        C5406h c5406h = (C5406h) obj;
        return this.f27140a == c5406h.f27140a && AbstractC4154l.m8918a(this.f27141b, c5406h.f27141b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f27140a) * 31;
        Long l9 = this.f27141b;
        return iHashCode + (l9 == null ? 0 : l9.hashCode());
    }

    public final String toString() {
        return "ContactDetailAnalyticsData(count=" + this.f27140a + ", duration=" + this.f27141b + ")";
    }
}
