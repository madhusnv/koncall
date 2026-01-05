package d3;

import c3.C0847b;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: d */
    public static final k0 f7781d = new k0();

    /* renamed from: a */
    public final long f7782a;

    /* renamed from: b */
    public final long f7783b;

    /* renamed from: c */
    public final float f7784c;

    public k0(long j6, long j10, float f6) {
        this.f7782a = j6;
        this.f7783b = j10;
        this.f7784c = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return C1565s.m5187c(this.f7782a, k0Var.f7782a) && C0847b.m2271b(this.f7783b, k0Var.f7783b) && this.f7784c == k0Var.f7784c;
    }

    public final int hashCode() {
        int i10 = C1565s.f7818k;
        return Float.hashCode(this.f7784c) + AbstractC1452a.m4557d(Long.hashCode(this.f7782a) * 31, 31, this.f7783b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Shadow(color=");
        i0.m0.m7391x(this.f7782a, ", offset=", sb2);
        sb2.append((Object) C0847b.m2278i(this.f7783b));
        sb2.append(", blurRadius=");
        return AbstractC1452a.m4562i(sb2, this.f7784c, ')');
    }

    public /* synthetic */ k0() {
        this(h0.m5132d(4278190080L), 0L, DefinitionKt.NO_Float_VALUE);
    }
}
