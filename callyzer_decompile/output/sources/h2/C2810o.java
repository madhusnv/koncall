package h2;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h2.o */
/* loaded from: classes.dex */
public final class C2810o {

    /* renamed from: a */
    public final int f15747a;

    /* renamed from: b */
    public final int f15748b;

    /* renamed from: c */
    public final int f15749c;

    /* renamed from: d */
    public final int f15750d;

    /* renamed from: e */
    public final long f15751e;

    /* renamed from: f */
    public final long f15752f;

    public C2810o(int i10, int i11, int i12, int i13, long j6) {
        this.f15747a = i10;
        this.f15748b = i11;
        this.f15749c = i12;
        this.f15750d = i13;
        this.f15751e = j6;
        this.f15752f = ((i12 * 86400000) + j6) - 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2810o)) {
            return false;
        }
        C2810o c2810o = (C2810o) obj;
        return this.f15747a == c2810o.f15747a && this.f15748b == c2810o.f15748b && this.f15749c == c2810o.f15749c && this.f15750d == c2810o.f15750d && this.f15751e == c2810o.f15751e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15751e) + AbstractC1452a.m4556c(this.f15750d, AbstractC1452a.m4556c(this.f15749c, AbstractC1452a.m4556c(this.f15748b, Integer.hashCode(this.f15747a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "CalendarMonth(year=" + this.f15747a + ", month=" + this.f15748b + ", numberOfDays=" + this.f15749c + ", daysFromStartOfWeekToFirstOfMonth=" + this.f15750d + ", startUtcTimeMillis=" + this.f15751e + ')';
    }
}
