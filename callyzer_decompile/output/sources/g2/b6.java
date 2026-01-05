package g2;

import com.sun.mail.util.AbstractC1452a;
import d3.C1565s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b6 {

    /* renamed from: a */
    public final long f11250a;

    /* renamed from: b */
    public final long f11251b;

    /* renamed from: c */
    public final long f11252c;

    /* renamed from: d */
    public final long f11253d;

    public b6(long j6, long j10, long j11, long j12) {
        this.f11250a = j6;
        this.f11251b = j10;
        this.f11252c = j11;
        this.f11253d = j12;
    }

    /* renamed from: a */
    public final b6 m6120a(long j6, long j10, long j11, long j12) {
        if (j6 == 16) {
            j6 = this.f11250a;
        }
        return new b6(j6, j10 != 16 ? j10 : this.f11251b, j11 != 16 ? j11 : this.f11252c, j12 != 16 ? j12 : this.f11253d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof b6)) {
            return false;
        }
        b6 b6Var = (b6) obj;
        return C1565s.m5187c(this.f11250a, b6Var.f11250a) && C1565s.m5187c(this.f11251b, b6Var.f11251b) && C1565s.m5187c(this.f11252c, b6Var.f11252c) && C1565s.m5187c(this.f11253d, b6Var.f11253d);
    }

    public final int hashCode() {
        int i10 = C1565s.f7818k;
        return Long.hashCode(this.f11253d) + AbstractC1452a.m4557d(AbstractC1452a.m4557d(Long.hashCode(this.f11250a) * 31, 31, this.f11251b), 31, this.f11252c);
    }
}
