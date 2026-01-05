package eb;

import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class t3 {

    /* renamed from: a */
    public final String f9475a;

    /* renamed from: b */
    public final String f9476b;

    /* renamed from: c */
    public final String f9477c;

    public t3(i0 i0Var) {
        this.f9475a = i0Var.f9333a;
        this.f9476b = i0Var.f9334b;
        this.f9477c = i0Var.f9335c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t3.class != obj.getClass()) {
            return false;
        }
        t3 t3Var = (t3) obj;
        return AbstractC4154l.m8918a(this.f9475a, t3Var.f9475a) && AbstractC4154l.m8918a(this.f9476b, t3Var.f9476b) && AbstractC4154l.m8918a(this.f9477c, t3Var.f9477c);
    }

    public final int hashCode() {
        String str = this.f9475a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f9476b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f9477c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VerifyUserAttributeRequest(accessToken=*** Sensitive Data Redacted ***,");
        return AbstractC4801l.m9737k(i0.m0.m7385r(new StringBuilder("attributeName="), this.f9476b, ',', sb2, "code="), this.f9477c, sb2, ")");
    }
}
