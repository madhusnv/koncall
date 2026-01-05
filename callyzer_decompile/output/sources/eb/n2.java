package eb;

import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class n2 {

    /* renamed from: a */
    public final C1978b f9380a;

    /* renamed from: b */
    public final String f9381b;

    /* renamed from: c */
    public final Map f9382c;

    /* renamed from: d */
    public final String f9383d;

    /* renamed from: e */
    public final l3 f9384e;

    /* renamed from: f */
    public final String f9385f;

    public n2(s1 s1Var) {
        this.f9380a = s1Var.f9447a;
        this.f9381b = s1Var.f9448b;
        this.f9382c = s1Var.f9449c;
        this.f9383d = s1Var.f9450d;
        this.f9384e = s1Var.f9451e;
        this.f9385f = s1Var.f9452f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n2.class != obj.getClass()) {
            return false;
        }
        n2 n2Var = (n2) obj;
        return AbstractC4154l.m8918a(this.f9380a, n2Var.f9380a) && AbstractC4154l.m8918a(this.f9381b, n2Var.f9381b) && AbstractC4154l.m8918a(this.f9382c, n2Var.f9382c) && AbstractC4154l.m8918a(this.f9383d, n2Var.f9383d) && AbstractC4154l.m8918a(this.f9384e, n2Var.f9384e) && AbstractC4154l.m8918a(this.f9385f, n2Var.f9385f);
    }

    public final int hashCode() {
        C1978b c1978b = this.f9380a;
        int iHashCode = (c1978b != null ? c1978b.hashCode() : 0) * 31;
        String str = this.f9381b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        Map map = this.f9382c;
        int iHashCode3 = (iHashCode2 + (map != null ? map.hashCode() : 0)) * 31;
        String str2 = this.f9383d;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        l3 l3Var = this.f9384e;
        int iHashCode5 = (iHashCode4 + (l3Var != null ? l3Var.hashCode() : 0)) * 31;
        String str3 = this.f9385f;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResendConfirmationCodeRequest(");
        sb2.append("analyticsMetadata=" + this.f9380a + ',');
        sb2.append("clientId=*** Sensitive Data Redacted ***,");
        sb2.append("clientMetadata=" + this.f9382c + ',');
        sb2.append("secretHash=*** Sensitive Data Redacted ***,userContextData=*** Sensitive Data Redacted ***,username=*** Sensitive Data Redacted ***)");
        return sb2.toString();
    }
}
