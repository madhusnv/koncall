package g2;

import com.sun.mail.util.AbstractC1452a;
import d3.C1565s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a */
    public final long f11833a;

    /* renamed from: b */
    public final long f11834b;

    /* renamed from: c */
    public final long f11835c;

    /* renamed from: d */
    public final long f11836d;

    public j0(long j6, long j10, long j11, long j12) {
        this.f11833a = j6;
        this.f11834b = j10;
        this.f11835c = j11;
        this.f11836d = j12;
    }

    /* renamed from: a */
    public final j0 m6175a(long j6, long j10, long j11, long j12) {
        if (j6 == 16) {
            j6 = this.f11833a;
        }
        return new j0(j6, j10 != 16 ? j10 : this.f11834b, j11 != 16 ? j11 : this.f11835c, j12 != 16 ? j12 : this.f11836d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return C1565s.m5187c(this.f11833a, j0Var.f11833a) && C1565s.m5187c(this.f11834b, j0Var.f11834b) && C1565s.m5187c(this.f11835c, j0Var.f11835c) && C1565s.m5187c(this.f11836d, j0Var.f11836d);
    }

    public final int hashCode() {
        int i10 = C1565s.f7818k;
        return Long.hashCode(this.f11836d) + AbstractC1452a.m4557d(AbstractC1452a.m4557d(Long.hashCode(this.f11833a) * 31, 31, this.f11834b), 31, this.f11835c);
    }
}
