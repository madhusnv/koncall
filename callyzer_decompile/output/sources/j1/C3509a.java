package j1;

import com.sun.mail.util.AbstractC1452a;
import d3.C1565s;
import i0.m0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j1.a */
/* loaded from: classes.dex */
public final class C3509a {

    /* renamed from: a */
    public final long f18382a;

    /* renamed from: b */
    public final long f18383b;

    /* renamed from: c */
    public final long f18384c;

    /* renamed from: d */
    public final long f18385d;

    /* renamed from: e */
    public final long f18386e;

    public C3509a(long j6, long j10, long j11, long j12, long j13) {
        this.f18382a = j6;
        this.f18383b = j10;
        this.f18384c = j11;
        this.f18385d = j12;
        this.f18386e = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C3509a)) {
            return false;
        }
        C3509a c3509a = (C3509a) obj;
        return C1565s.m5187c(this.f18382a, c3509a.f18382a) && C1565s.m5187c(this.f18383b, c3509a.f18383b) && C1565s.m5187c(this.f18384c, c3509a.f18384c) && C1565s.m5187c(this.f18385d, c3509a.f18385d) && C1565s.m5187c(this.f18386e, c3509a.f18386e);
    }

    public final int hashCode() {
        int i10 = C1565s.f7818k;
        return Long.hashCode(this.f18386e) + AbstractC1452a.m4557d(AbstractC1452a.m4557d(AbstractC1452a.m4557d(Long.hashCode(this.f18382a) * 31, 31, this.f18383b), 31, this.f18384c), 31, this.f18385d);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ContextMenuColors(backgroundColor=");
        m0.m7391x(this.f18382a, ", textColor=", sb2);
        m0.m7391x(this.f18383b, ", iconColor=", sb2);
        m0.m7391x(this.f18384c, ", disabledTextColor=", sb2);
        m0.m7391x(this.f18385d, ", disabledIconColor=", sb2);
        sb2.append((Object) C1565s.m5193i(this.f18386e));
        sb2.append(')');
        return sb2.toString();
    }
}
