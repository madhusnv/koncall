package eb;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class n3 {

    /* renamed from: a */
    public final String f9386a;

    /* renamed from: b */
    public final String f9387b;

    /* renamed from: c */
    public final String f9388c;

    /* renamed from: d */
    public final String f9389d;

    public n3(m3 m3Var) {
        this.f9386a = m3Var.f9373a;
        this.f9387b = m3Var.f9374b;
        this.f9388c = m3Var.f9375c;
        this.f9389d = m3Var.f9376d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n3.class != obj.getClass()) {
            return false;
        }
        n3 n3Var = (n3) obj;
        return AbstractC4154l.m8918a(this.f9386a, n3Var.f9386a) && AbstractC4154l.m8918a(this.f9387b, n3Var.f9387b) && AbstractC4154l.m8918a(this.f9388c, n3Var.f9388c) && AbstractC4154l.m8918a(this.f9389d, n3Var.f9389d);
    }

    public final int hashCode() {
        String str = this.f9386a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f9387b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f9388c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f9389d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VerifySoftwareTokenRequest(accessToken=*** Sensitive Data Redacted ***,");
        sb2.append("friendlyDeviceName=" + this.f9387b + ',');
        sb2.append("session=*** Sensitive Data Redacted ***,userCode=*** Sensitive Data Redacted ***)");
        return sb2.toString();
    }
}
