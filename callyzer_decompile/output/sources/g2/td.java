package g2;

import com.sun.mail.util.AbstractC1452a;
import d3.C1565s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class td {

    /* renamed from: a */
    public final long f12806a;

    /* renamed from: b */
    public final long f12807b;

    /* renamed from: c */
    public final long f12808c;

    /* renamed from: d */
    public final long f12809d;

    /* renamed from: e */
    public final long f12810e;

    public td(long j6, long j10, long j11, long j12, long j13) {
        this.f12806a = j6;
        this.f12807b = j10;
        this.f12808c = j11;
        this.f12809d = j12;
        this.f12810e = j13;
    }

    /* renamed from: a */
    public final td m6314a(long j6, long j10, long j11, long j12, long j13) {
        return new td(j6 != 16 ? j6 : this.f12806a, j10 != 16 ? j10 : this.f12807b, j11 != 16 ? j11 : this.f12808c, j12 != 16 ? j12 : this.f12809d, j13 != 16 ? j13 : this.f12810e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof td)) {
            return false;
        }
        td tdVar = (td) obj;
        return C1565s.m5187c(this.f12806a, tdVar.f12806a) && C1565s.m5187c(this.f12807b, tdVar.f12807b) && C1565s.m5187c(this.f12808c, tdVar.f12808c) && C1565s.m5187c(this.f12809d, tdVar.f12809d) && C1565s.m5187c(this.f12810e, tdVar.f12810e);
    }

    public final int hashCode() {
        int i10 = C1565s.f7818k;
        return Long.hashCode(this.f12810e) + AbstractC1452a.m4557d(AbstractC1452a.m4557d(AbstractC1452a.m4557d(Long.hashCode(this.f12806a) * 31, 31, this.f12807b), 31, this.f12808c), 31, this.f12809d);
    }
}
