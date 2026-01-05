package g2;

import com.sun.mail.util.AbstractC1452a;
import d3.C1565s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d8 {

    /* renamed from: a */
    public final long f11386a;

    /* renamed from: b */
    public final long f11387b;

    /* renamed from: c */
    public final long f11388c;

    /* renamed from: d */
    public final long f11389d;

    /* renamed from: e */
    public final long f11390e;

    /* renamed from: f */
    public final long f11391f;

    /* renamed from: g */
    public final long f11392g;

    public d8(long j6, long j10, long j11, long j12, long j13, long j14, long j15) {
        this.f11386a = j6;
        this.f11387b = j10;
        this.f11388c = j11;
        this.f11389d = j12;
        this.f11390e = j13;
        this.f11391f = j14;
        this.f11392g = j15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof d8)) {
            return false;
        }
        d8 d8Var = (d8) obj;
        return C1565s.m5187c(this.f11386a, d8Var.f11386a) && C1565s.m5187c(this.f11389d, d8Var.f11389d) && C1565s.m5187c(this.f11387b, d8Var.f11387b) && C1565s.m5187c(this.f11390e, d8Var.f11390e) && C1565s.m5187c(this.f11388c, d8Var.f11388c) && C1565s.m5187c(this.f11391f, d8Var.f11391f) && C1565s.m5187c(this.f11392g, d8Var.f11392g);
    }

    public final int hashCode() {
        int i10 = C1565s.f7818k;
        return Long.hashCode(this.f11392g) + AbstractC1452a.m4557d(AbstractC1452a.m4557d(AbstractC1452a.m4557d(AbstractC1452a.m4557d(AbstractC1452a.m4557d(Long.hashCode(this.f11386a) * 31, 31, this.f11389d), 31, this.f11387b), 31, this.f11390e), 31, this.f11388c), 31, this.f11391f);
    }
}
