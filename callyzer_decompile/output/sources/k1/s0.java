package k1;

import c3.C0847b;
import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a */
    public final long f20222a;

    /* renamed from: b */
    public final long f20223b;

    /* renamed from: c */
    public final boolean f20224c;

    public s0(long j6, long j10, boolean z6) {
        this.f20222a = j6;
        this.f20223b = j10;
        this.f20224c = z6;
    }

    /* renamed from: a */
    public final s0 m8473a(s0 s0Var) {
        return new s0(C0847b.m2276g(this.f20222a, s0Var.f20222a), Math.max(this.f20223b, s0Var.f20223b), this.f20224c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return C0847b.m2271b(this.f20222a, s0Var.f20222a) && this.f20223b == s0Var.f20223b && this.f20224c == s0Var.f20224c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f20224c) + AbstractC1452a.m4557d(Long.hashCode(this.f20222a) * 31, 31, this.f20223b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MouseWheelScrollDelta(value=");
        sb2.append((Object) C0847b.m2278i(this.f20222a));
        sb2.append(", timeMillis=");
        sb2.append(this.f20223b);
        sb2.append(", shouldApplyImmediately=");
        return i0.m0.m7382o(sb2, this.f20224c, ')');
    }
}
