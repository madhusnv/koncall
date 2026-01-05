package eb;

import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class q2 {

    /* renamed from: a */
    public final C1978b f9423a;

    /* renamed from: b */
    public final h0 f9424b;

    /* renamed from: c */
    public final Map f9425c;

    /* renamed from: d */
    public final String f9426d;

    /* renamed from: e */
    public final Map f9427e;

    /* renamed from: f */
    public final String f9428f;

    /* renamed from: g */
    public final l3 f9429g;

    public q2(p2 p2Var) {
        this.f9423a = p2Var.f9411a;
        this.f9424b = p2Var.f9412b;
        this.f9425c = p2Var.f9413c;
        this.f9426d = p2Var.f9414d;
        this.f9427e = p2Var.f9415e;
        this.f9428f = p2Var.f9416f;
        this.f9429g = p2Var.f9417g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q2.class != obj.getClass()) {
            return false;
        }
        q2 q2Var = (q2) obj;
        return AbstractC4154l.m8918a(this.f9423a, q2Var.f9423a) && AbstractC4154l.m8918a(this.f9424b, q2Var.f9424b) && AbstractC4154l.m8918a(this.f9425c, q2Var.f9425c) && AbstractC4154l.m8918a(this.f9426d, q2Var.f9426d) && AbstractC4154l.m8918a(this.f9427e, q2Var.f9427e) && AbstractC4154l.m8918a(this.f9428f, q2Var.f9428f) && AbstractC4154l.m8918a(this.f9429g, q2Var.f9429g);
    }

    public final int hashCode() {
        C1978b c1978b = this.f9423a;
        int iHashCode = (c1978b != null ? c1978b.hashCode() : 0) * 31;
        h0 h0Var = this.f9424b;
        int iHashCode2 = (iHashCode + (h0Var != null ? h0Var.hashCode() : 0)) * 31;
        Map map = this.f9425c;
        int iHashCode3 = (iHashCode2 + (map != null ? map.hashCode() : 0)) * 31;
        String str = this.f9426d;
        int iHashCode4 = (iHashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        Map map2 = this.f9427e;
        int iHashCode5 = (iHashCode4 + (map2 != null ? map2.hashCode() : 0)) * 31;
        String str2 = this.f9428f;
        int iHashCode6 = (iHashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        l3 l3Var = this.f9429g;
        return iHashCode6 + (l3Var != null ? l3Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RespondToAuthChallengeRequest(");
        sb2.append("analyticsMetadata=" + this.f9423a + ',');
        sb2.append("challengeName=" + this.f9424b + ',');
        sb2.append("challengeResponses=*** Sensitive Data Redacted ***,clientId=*** Sensitive Data Redacted ***,");
        sb2.append("clientMetadata=" + this.f9427e + ',');
        sb2.append("session=*** Sensitive Data Redacted ***,userContextData=*** Sensitive Data Redacted ***)");
        return sb2.toString();
    }
}
