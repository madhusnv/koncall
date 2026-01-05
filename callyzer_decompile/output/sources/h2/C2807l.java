package h2;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h2.l */
/* loaded from: classes.dex */
public final class C2807l implements Comparable {

    /* renamed from: a */
    public final int f15724a;

    /* renamed from: b */
    public final int f15725b;

    /* renamed from: c */
    public final int f15726c;

    /* renamed from: d */
    public final long f15727d;

    public C2807l(int i10, int i11, int i12, long j6) {
        this.f15724a = i10;
        this.f15725b = i11;
        this.f15726c = i12;
        this.f15727d = j6;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j6 = this.f15727d;
        long j10 = ((C2807l) obj).f15727d;
        if (j6 < j10) {
            return -1;
        }
        return j6 == j10 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2807l)) {
            return false;
        }
        C2807l c2807l = (C2807l) obj;
        return this.f15724a == c2807l.f15724a && this.f15725b == c2807l.f15725b && this.f15726c == c2807l.f15726c && this.f15727d == c2807l.f15727d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15727d) + AbstractC1452a.m4556c(this.f15726c, AbstractC1452a.m4556c(this.f15725b, Integer.hashCode(this.f15724a) * 31, 31), 31);
    }

    public final String toString() {
        return "CalendarDate(year=" + this.f15724a + ", month=" + this.f15725b + ", dayOfMonth=" + this.f15726c + ", utcTimeMillis=" + this.f15727d + ')';
    }
}
