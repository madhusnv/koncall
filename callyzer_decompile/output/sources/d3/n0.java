package d3;

import android.graphics.Shader;
import of.C5359n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class n0 extends AbstractC1561o {

    /* renamed from: a */
    public final long f7801a;

    public n0(long j6) {
        this.f7801a = j6;
    }

    @Override // d3.AbstractC1561o
    /* renamed from: a */
    public final void mo5176a(float f6, long j6, C5359n c5359n) {
        c5359n.m10512s(1.0f);
        long jM5186b = this.f7801a;
        if (f6 != 1.0f) {
            jM5186b = C1565s.m5186b(C1565s.m5188d(jM5186b) * f6, 14, jM5186b);
        }
        c5359n.m10514u(jM5186b);
        if (((Shader) c5359n.f26305c) != null) {
            c5359n.m10517x(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n0) {
            return C1565s.m5187c(this.f7801a, ((n0) obj).f7801a);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = C1565s.f7818k;
        return Long.hashCode(this.f7801a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) C1565s.m5193i(this.f7801a)) + ')';
    }
}
