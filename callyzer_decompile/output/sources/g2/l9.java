package g2;

import com.sun.mail.util.AbstractC1452a;
import d3.C1565s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class l9 {

    /* renamed from: a */
    public final long f12012a;

    /* renamed from: b */
    public final long f12013b;

    /* renamed from: c */
    public final long f12014c;

    /* renamed from: d */
    public final long f12015d;

    public l9(long j6, long j10, long j11, long j12) {
        this.f12012a = j6;
        this.f12013b = j10;
        this.f12014c = j11;
        this.f12015d = j12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof l9)) {
            return false;
        }
        l9 l9Var = (l9) obj;
        return C1565s.m5187c(this.f12012a, l9Var.f12012a) && C1565s.m5187c(this.f12013b, l9Var.f12013b) && C1565s.m5187c(this.f12014c, l9Var.f12014c) && C1565s.m5187c(this.f12015d, l9Var.f12015d);
    }

    public final int hashCode() {
        int i10 = C1565s.f7818k;
        return Long.hashCode(this.f12015d) + AbstractC1452a.m4557d(AbstractC1452a.m4557d(Long.hashCode(this.f12012a) * 31, 31, this.f12013b), 31, this.f12014c);
    }
}
