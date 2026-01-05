package ox;

import kotlin.jvm.internal.AbstractC4154l;
import og.db;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ox.e */
/* loaded from: classes3.dex */
public final class C5774e implements Comparable {

    /* renamed from: a */
    public final long f28340a;

    /* renamed from: a */
    public static long m11306a(long j6) {
        long jM11305c = AbstractC5773d.m11305c();
        EnumC5772c unit = EnumC5772c.NANOSECONDS;
        AbstractC4154l.m8923f(unit, "unit");
        return (1 | (j6 - 1)) == Long.MAX_VALUE ? C5770a.m11304o(db.m10605a(j6)) : db.m10607c(jM11305c, j6, unit);
    }

    /* renamed from: b */
    public static final long m11307b(long j6, long j10) {
        int i10 = AbstractC5773d.f28339b;
        EnumC5772c unit = EnumC5772c.NANOSECONDS;
        AbstractC4154l.m8923f(unit, "unit");
        if (((j10 - 1) | 1) != Long.MAX_VALUE) {
            return (1 | (j6 - 1)) == Long.MAX_VALUE ? db.m10605a(j6) : db.m10607c(j6, j10, unit);
        }
        if (j6 != j10) {
            return C5770a.m11304o(db.m10605a(j10));
        }
        int i11 = C5770a.f28335d;
        return 0L;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C5774e other = (C5774e) obj;
        AbstractC4154l.m8923f(other, "other");
        return C5770a.m11292c(m11307b(this.f28340a, other.f28340a), 0L);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5774e) {
            return this.f28340a == ((C5774e) obj).f28340a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f28340a);
    }

    public final String toString() {
        return "ValueTimeMark(reading=" + this.f28340a + ')';
    }
}
