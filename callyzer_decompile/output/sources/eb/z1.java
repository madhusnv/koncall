package eb;

import a9.C0073l;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class z1 {

    /* renamed from: a */
    public final ArrayList f9526a;

    /* renamed from: b */
    public final String f9527b;

    /* renamed from: c */
    public final Object f9528c;

    /* renamed from: d */
    public final ArrayList f9529d;

    /* renamed from: e */
    public final String f9530e;

    public z1(C0073l c0073l) {
        this.f9526a = (ArrayList) c0073l.f264a;
        this.f9527b = (String) c0073l.f265b;
        Object obj = c0073l.f266c;
        if (obj == null) {
            throw new IllegalArgumentException("A non-null value must be provided for userAttributes");
        }
        this.f9528c = obj;
        this.f9529d = (ArrayList) c0073l.f267d;
        String str = (String) c0073l.f268e;
        if (str == null) {
            throw new IllegalArgumentException("A non-null value must be provided for username");
        }
        this.f9530e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z1.class != obj.getClass()) {
            return false;
        }
        z1 z1Var = (z1) obj;
        return AbstractC4154l.m8918a(this.f9526a, z1Var.f9526a) && AbstractC4154l.m8918a(this.f9527b, z1Var.f9527b) && AbstractC4154l.m8918a(this.f9528c, z1Var.f9528c) && AbstractC4154l.m8918a(this.f9529d, z1Var.f9529d) && AbstractC4154l.m8918a(this.f9530e, z1Var.f9530e);
    }

    public final int hashCode() {
        ArrayList arrayList = this.f9526a;
        int iHashCode = (arrayList != null ? arrayList.hashCode() : 0) * 31;
        String str = this.f9527b;
        int iHashCode2 = (this.f9528c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31;
        ArrayList arrayList2 = this.f9529d;
        return this.f9530e.hashCode() + ((iHashCode2 + (arrayList2 != null ? arrayList2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GetUserResponse(");
        sb2.append("mfaOptions=" + this.f9526a + ',');
        StringBuilder sbM7385r = i0.m0.m7385r(new StringBuilder("preferredMfaSetting="), this.f9527b, ',', sb2, "userAttributes=");
        sbM7385r.append(this.f9528c);
        sbM7385r.append(',');
        sb2.append(sbM7385r.toString());
        sb2.append("userMfaSettingList=" + this.f9529d + ',');
        sb2.append("username=*** Sensitive Data Redacted ***)");
        return sb2.toString();
    }
}
