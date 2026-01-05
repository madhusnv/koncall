package eb;

import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class t1 {

    /* renamed from: a */
    public final C1978b f9466a;

    /* renamed from: b */
    public final String f9467b;

    /* renamed from: c */
    public final Map f9468c;

    /* renamed from: d */
    public final String f9469d;

    /* renamed from: e */
    public final l3 f9470e;

    /* renamed from: f */
    public final String f9471f;

    public t1(s1 s1Var) {
        this.f9466a = s1Var.f9447a;
        this.f9467b = s1Var.f9448b;
        this.f9468c = s1Var.f9449c;
        this.f9469d = s1Var.f9450d;
        this.f9470e = s1Var.f9451e;
        this.f9471f = s1Var.f9452f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t1.class != obj.getClass()) {
            return false;
        }
        t1 t1Var = (t1) obj;
        return AbstractC4154l.m8918a(this.f9466a, t1Var.f9466a) && AbstractC4154l.m8918a(this.f9467b, t1Var.f9467b) && AbstractC4154l.m8918a(this.f9468c, t1Var.f9468c) && AbstractC4154l.m8918a(this.f9469d, t1Var.f9469d) && AbstractC4154l.m8918a(this.f9470e, t1Var.f9470e) && AbstractC4154l.m8918a(this.f9471f, t1Var.f9471f);
    }

    public final int hashCode() {
        C1978b c1978b = this.f9466a;
        int iHashCode = (c1978b != null ? c1978b.hashCode() : 0) * 31;
        String str = this.f9467b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        Map map = this.f9468c;
        int iHashCode3 = (iHashCode2 + (map != null ? map.hashCode() : 0)) * 31;
        String str2 = this.f9469d;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        l3 l3Var = this.f9470e;
        int iHashCode5 = (iHashCode4 + (l3Var != null ? l3Var.hashCode() : 0)) * 31;
        String str3 = this.f9471f;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ForgotPasswordRequest(");
        sb2.append("analyticsMetadata=" + this.f9466a + ',');
        sb2.append("clientId=*** Sensitive Data Redacted ***,");
        sb2.append("clientMetadata=" + this.f9468c + ',');
        sb2.append("secretHash=*** Sensitive Data Redacted ***,userContextData=*** Sensitive Data Redacted ***,username=*** Sensitive Data Redacted ***)");
        return sb2.toString();
    }
}
