package qw;

import og.pd;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qw.v */
/* loaded from: classes3.dex */
public final class C6372v implements Comparable {

    /* renamed from: a */
    public final long f30772a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j6 = ((C6372v) obj).f30772a;
        long j10 = this.f30772a ^ Long.MIN_VALUE;
        long j11 = j6 ^ Long.MIN_VALUE;
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6372v) {
            return this.f30772a == ((C6372v) obj).f30772a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f30772a);
    }

    public final String toString() {
        return pd.m10825c(10, this.f30772a);
    }
}
