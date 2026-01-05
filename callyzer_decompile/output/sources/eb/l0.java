package eb;

import a1.C0005d;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a */
    public final String f9355a;

    /* renamed from: b */
    public final g1 f9356b;

    /* renamed from: c */
    public final String f9357c;

    public l0(C0005d c0005d) {
        this.f9355a = (String) c0005d.f24b;
        this.f9356b = (g1) c0005d.f25c;
        this.f9357c = (String) c0005d.f26d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l0.class != obj.getClass()) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return AbstractC4154l.m8918a(this.f9355a, l0Var.f9355a) && AbstractC4154l.m8918a(this.f9356b, l0Var.f9356b) && AbstractC4154l.m8918a(this.f9357c, l0Var.f9357c);
    }

    public final int hashCode() {
        String str = this.f9355a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        g1 g1Var = this.f9356b;
        int iHashCode2 = (iHashCode + (g1Var != null ? g1Var.hashCode() : 0)) * 31;
        String str2 = this.f9357c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CodeDeliveryDetailsType(");
        StringBuilder sbM7385r = i0.m0.m7385r(new StringBuilder("attributeName="), this.f9355a, ',', sb2, "deliveryMedium=");
        sbM7385r.append(this.f9356b);
        sbM7385r.append(',');
        sb2.append(sbM7385r.toString());
        return AbstractC4801l.m9737k(new StringBuilder("destination="), this.f9357c, sb2, ")");
    }
}
