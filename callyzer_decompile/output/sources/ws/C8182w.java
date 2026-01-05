package ws;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ws.w */
/* loaded from: classes3.dex */
public final class C8182w {

    /* renamed from: a */
    public final C8176q f39135a;

    /* renamed from: b */
    public final Integer f39136b;

    /* renamed from: c */
    public final Integer f39137c;

    /* renamed from: d */
    public final Integer f39138d;

    public C8182w(C8176q c8176q, Integer num, Integer num2, Integer num3) {
        this.f39135a = c8176q;
        this.f39136b = num;
        this.f39137c = num2;
        this.f39138d = num3;
    }

    /* renamed from: a */
    public static C8182w m15341a(C8182w c8182w, C8176q c8176q, Integer num, Integer num2, Integer num3, int i10) {
        if ((i10 & 1) != 0) {
            c8176q = c8182w.f39135a;
        }
        if ((i10 & 2) != 0) {
            num = c8182w.f39136b;
        }
        if ((i10 & 4) != 0) {
            num2 = c8182w.f39137c;
        }
        if ((i10 & 8) != 0) {
            num3 = c8182w.f39138d;
        }
        return new C8182w(c8176q, num, num2, num3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8182w)) {
            return false;
        }
        C8182w c8182w = (C8182w) obj;
        return AbstractC4154l.m8918a(this.f39135a, c8182w.f39135a) && AbstractC4154l.m8918a(this.f39136b, c8182w.f39136b) && AbstractC4154l.m8918a(this.f39137c, c8182w.f39137c) && AbstractC4154l.m8918a(this.f39138d, c8182w.f39138d);
    }

    public final int hashCode() {
        C8176q c8176q = this.f39135a;
        int iHashCode = (c8176q == null ? 0 : c8176q.hashCode()) * 31;
        Integer num = this.f39136b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f39137c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f39138d;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return "CorruptCardState(fixedCorruptCall=" + this.f39135a + ", callTypeError=" + this.f39136b + ", simNumberError=" + this.f39137c + ", durationError=" + this.f39138d + ")";
    }
}
