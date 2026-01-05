package eb;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class t2 {

    /* renamed from: a */
    public final String f9472a;

    /* renamed from: b */
    public final String f9473b;

    /* renamed from: c */
    public final String f9474c;

    public t2(s2 s2Var) {
        this.f9472a = s2Var.f9453a;
        this.f9473b = s2Var.f9454b;
        this.f9474c = s2Var.f9455c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t2.class != obj.getClass()) {
            return false;
        }
        t2 t2Var = (t2) obj;
        return AbstractC4154l.m8918a(this.f9472a, t2Var.f9472a) && AbstractC4154l.m8918a(this.f9473b, t2Var.f9473b) && AbstractC4154l.m8918a(this.f9474c, t2Var.f9474c);
    }

    public final int hashCode() {
        String str = this.f9472a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f9473b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f9474c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "RevokeTokenRequest(clientId=*** Sensitive Data Redacted ***,clientSecret=*** Sensitive Data Redacted ***,token=*** Sensitive Data Redacted ***)";
    }
}
