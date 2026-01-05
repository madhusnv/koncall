package g2;

import com.sun.mail.util.AbstractC1452a;
import d3.C1565s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a */
    public final long f12818a;

    /* renamed from: b */
    public final long f12819b;

    /* renamed from: c */
    public final long f12820c;

    /* renamed from: d */
    public final long f12821d;

    public u0(long j6, long j10, long j11, long j12) {
        this.f12818a = j6;
        this.f12819b = j10;
        this.f12820c = j11;
        this.f12821d = j12;
    }

    /* renamed from: a */
    public final u0 m6315a(long j6, long j10, long j11, long j12) {
        if (j6 == 16) {
            j6 = this.f12818a;
        }
        return new u0(j6, j10 != 16 ? j10 : this.f12819b, j11 != 16 ? j11 : this.f12820c, j12 != 16 ? j12 : this.f12821d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return C1565s.m5187c(this.f12818a, u0Var.f12818a) && C1565s.m5187c(this.f12819b, u0Var.f12819b) && C1565s.m5187c(this.f12820c, u0Var.f12820c) && C1565s.m5187c(this.f12821d, u0Var.f12821d);
    }

    public final int hashCode() {
        int i10 = C1565s.f7818k;
        return Long.hashCode(this.f12821d) + AbstractC1452a.m4557d(AbstractC1452a.m4557d(Long.hashCode(this.f12818a) * 31, 31, this.f12819b), 31, this.f12820c);
    }
}
