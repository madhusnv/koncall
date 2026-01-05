package eb;

import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a */
    public final C1978b f9481a;

    /* renamed from: b */
    public final String f9482b;

    /* renamed from: c */
    public final Map f9483c;

    /* renamed from: d */
    public final String f9484d;

    /* renamed from: e */
    public final String f9485e;

    /* renamed from: f */
    public final String f9486f;

    /* renamed from: g */
    public final l3 f9487g;

    /* renamed from: h */
    public final String f9488h;

    public v0(s0 s0Var) {
        this.f9481a = s0Var.f9439a;
        this.f9482b = s0Var.f9440b;
        this.f9483c = s0Var.f9441c;
        this.f9484d = s0Var.f9442d;
        this.f9485e = s0Var.f9443e;
        this.f9486f = s0Var.f9444f;
        this.f9487g = s0Var.f9445g;
        this.f9488h = s0Var.f9446h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v0.class != obj.getClass()) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return AbstractC4154l.m8918a(this.f9481a, v0Var.f9481a) && AbstractC4154l.m8918a(this.f9482b, v0Var.f9482b) && AbstractC4154l.m8918a(this.f9483c, v0Var.f9483c) && AbstractC4154l.m8918a(this.f9484d, v0Var.f9484d) && AbstractC4154l.m8918a(this.f9485e, v0Var.f9485e) && AbstractC4154l.m8918a(this.f9486f, v0Var.f9486f) && AbstractC4154l.m8918a(this.f9487g, v0Var.f9487g) && AbstractC4154l.m8918a(this.f9488h, v0Var.f9488h);
    }

    public final int hashCode() {
        C1978b c1978b = this.f9481a;
        int iHashCode = (c1978b != null ? c1978b.hashCode() : 0) * 31;
        String str = this.f9482b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        Map map = this.f9483c;
        int iHashCode3 = (iHashCode2 + (map != null ? map.hashCode() : 0)) * 31;
        String str2 = this.f9484d;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 961;
        String str3 = this.f9485e;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f9486f;
        int iHashCode6 = (iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        l3 l3Var = this.f9487g;
        int iHashCode7 = (iHashCode6 + (l3Var != null ? l3Var.hashCode() : 0)) * 31;
        String str5 = this.f9488h;
        return iHashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConfirmSignUpRequest(");
        sb2.append("analyticsMetadata=" + this.f9481a + ',');
        sb2.append("clientId=*** Sensitive Data Redacted ***,");
        sb2.append("clientMetadata=" + this.f9483c + ',');
        sb2.append("confirmationCode=" + this.f9484d + ',');
        sb2.append("forceAliasCreation=null,secretHash=*** Sensitive Data Redacted ***,session=*** Sensitive Data Redacted ***,userContextData=*** Sensitive Data Redacted ***,username=*** Sensitive Data Redacted ***)");
        return sb2.toString();
    }
}
