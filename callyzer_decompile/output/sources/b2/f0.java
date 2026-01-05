package b2;

import c3.C0847b;
import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a */
    public final x1.j0 f3734a;

    /* renamed from: b */
    public final long f3735b;

    /* renamed from: c */
    public final e0 f3736c;

    /* renamed from: d */
    public final boolean f3737d;

    public f0(x1.j0 j0Var, long j6, e0 e0Var, boolean z6) {
        this.f3734a = j0Var;
        this.f3735b = j6;
        this.f3736c = e0Var;
        this.f3737d = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.f3734a == f0Var.f3734a && C0847b.m2271b(this.f3735b, f0Var.f3735b) && this.f3736c == f0Var.f3736c && this.f3737d == f0Var.f3737d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3737d) + ((this.f3736c.hashCode() + AbstractC1452a.m4557d(this.f3734a.hashCode() * 31, 31, this.f3735b)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectionHandleInfo(handle=");
        sb2.append(this.f3734a);
        sb2.append(", position=");
        sb2.append((Object) C0847b.m2278i(this.f3735b));
        sb2.append(", anchor=");
        sb2.append(this.f3736c);
        sb2.append(", visible=");
        return i0.m0.m7382o(sb2, this.f3737d, ')');
    }
}
