package eb;

import c9.C0917l;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class l2 {

    /* renamed from: a */
    public final String f9360a;

    /* renamed from: b */
    public final g1 f9361b;

    public l2(C0917l c0917l) {
        this.f9360a = (String) c0917l.f5594b;
        this.f9361b = (g1) c0917l.f5595c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l2.class != obj.getClass()) {
            return false;
        }
        l2 l2Var = (l2) obj;
        return AbstractC4154l.m8918a(this.f9360a, l2Var.f9360a) && AbstractC4154l.m8918a(this.f9361b, l2Var.f9361b);
    }

    public final int hashCode() {
        String str = this.f9360a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        g1 g1Var = this.f9361b;
        return iHashCode + (g1Var != null ? g1Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MfaOptionType(");
        StringBuilder sbM7385r = i0.m0.m7385r(new StringBuilder("attributeName="), this.f9360a, ',', sb2, "deliveryMedium=");
        sbM7385r.append(this.f9361b);
        sb2.append(sbM7385r.toString());
        sb2.append(")");
        return sb2.toString();
    }
}
