package eb;

import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: a */
    public final String f9358a;

    /* renamed from: b */
    public final String f9359b;

    public l1(k1 k1Var) {
        this.f9358a = k1Var.f9349a;
        this.f9359b = k1Var.f9350b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l1.class != obj.getClass()) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return AbstractC4154l.m8918a(this.f9358a, l1Var.f9358a) && AbstractC4154l.m8918a(this.f9359b, l1Var.f9359b);
    }

    public final int hashCode() {
        String str = this.f9358a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f9359b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceSecretVerifierConfigType(");
        return AbstractC4801l.m9737k(i0.m0.m7385r(new StringBuilder("passwordVerifier="), this.f9358a, ',', sb2, "salt="), this.f9359b, sb2, ")");
    }
}
