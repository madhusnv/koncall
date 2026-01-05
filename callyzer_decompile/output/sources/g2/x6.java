package g2;

import com.sun.mail.util.AbstractC1452a;
import d3.C1565s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class x6 {

    /* renamed from: a */
    public final long f13221a;

    /* renamed from: b */
    public final long f13222b;

    /* renamed from: c */
    public final long f13223c;

    /* renamed from: d */
    public final long f13224d;

    /* renamed from: e */
    public final long f13225e;

    /* renamed from: f */
    public final long f13226f;

    public x6(long j6, long j10, long j11, long j12, long j13, long j14) {
        this.f13221a = j6;
        this.f13222b = j10;
        this.f13223c = j11;
        this.f13224d = j12;
        this.f13225e = j13;
        this.f13226f = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof x6)) {
            return false;
        }
        x6 x6Var = (x6) obj;
        return C1565s.m5187c(this.f13221a, x6Var.f13221a) && C1565s.m5187c(this.f13222b, x6Var.f13222b) && C1565s.m5187c(this.f13223c, x6Var.f13223c) && C1565s.m5187c(this.f13224d, x6Var.f13224d) && C1565s.m5187c(this.f13225e, x6Var.f13225e) && C1565s.m5187c(this.f13226f, x6Var.f13226f);
    }

    public final int hashCode() {
        int i10 = C1565s.f7818k;
        return Long.hashCode(this.f13226f) + AbstractC1452a.m4557d(AbstractC1452a.m4557d(AbstractC1452a.m4557d(AbstractC1452a.m4557d(Long.hashCode(this.f13221a) * 31, 31, this.f13222b), 31, this.f13223c), 31, this.f13224d), 31, this.f13225e);
    }
}
