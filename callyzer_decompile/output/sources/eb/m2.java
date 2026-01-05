package eb;

import aa.C0078e;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class m2 {

    /* renamed from: a */
    public final String f9371a;

    /* renamed from: b */
    public final String f9372b;

    public m2(C0078e c0078e) {
        this.f9371a = c0078e.f291a;
        this.f9372b = c0078e.f292b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m2.class != obj.getClass()) {
            return false;
        }
        m2 m2Var = (m2) obj;
        return AbstractC4154l.m8918a(this.f9371a, m2Var.f9371a) && AbstractC4154l.m8918a(this.f9372b, m2Var.f9372b);
    }

    public final int hashCode() {
        String str = this.f9371a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f9372b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NewDeviceMetadataType(");
        return AbstractC4801l.m9737k(i0.m0.m7385r(new StringBuilder("deviceGroupKey="), this.f9371a, ',', sb2, "deviceKey="), this.f9372b, sb2, ")");
    }
}
