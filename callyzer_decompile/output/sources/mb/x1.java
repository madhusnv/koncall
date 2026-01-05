package mb;

import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class x1 {

    /* renamed from: a */
    public final String f23535a;

    /* renamed from: b */
    public final String f23536b;

    public x1(eb.p1 p1Var) {
        this.f23535a = p1Var.f9409a;
        this.f23536b = p1Var.f9410b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x1.class != obj.getClass()) {
            return false;
        }
        x1 x1Var = (x1) obj;
        return AbstractC4154l.m8918a(this.f23535a, x1Var.f23535a) && AbstractC4154l.m8918a(this.f23536b, x1Var.f23536b);
    }

    public final int hashCode() {
        String str = this.f23535a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f23536b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Owner(");
        return AbstractC4801l.m9737k(i0.m0.m7385r(new StringBuilder("displayName="), this.f23535a, ',', sb2, "id="), this.f23536b, sb2, ")");
    }
}
