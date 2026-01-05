package eb;

import c9.C0919n;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class r2 {

    /* renamed from: a */
    public final C1992p f9433a;

    /* renamed from: b */
    public final h0 f9434b;

    /* renamed from: c */
    public final LinkedHashMap f9435c;

    /* renamed from: d */
    public final String f9436d;

    public r2(C0919n c0919n) {
        this.f9433a = (C1992p) c0919n.f5598a;
        this.f9434b = (h0) c0919n.f5599b;
        this.f9435c = (LinkedHashMap) c0919n.f5600c;
        this.f9436d = (String) c0919n.f5601d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r2.class != obj.getClass()) {
            return false;
        }
        r2 r2Var = (r2) obj;
        return AbstractC4154l.m8918a(this.f9433a, r2Var.f9433a) && AbstractC4154l.m8918a(this.f9434b, r2Var.f9434b) && AbstractC4154l.m8918a(this.f9435c, r2Var.f9435c) && AbstractC4154l.m8918a(this.f9436d, r2Var.f9436d);
    }

    public final int hashCode() {
        C1992p c1992p = this.f9433a;
        int iHashCode = (c1992p != null ? c1992p.hashCode() : 0) * 31;
        h0 h0Var = this.f9434b;
        int iHashCode2 = (iHashCode + (h0Var != null ? h0Var.hashCode() : 0)) * 31;
        LinkedHashMap linkedHashMap = this.f9435c;
        int iHashCode3 = (iHashCode2 + (linkedHashMap != null ? linkedHashMap.hashCode() : 0)) * 31;
        String str = this.f9436d;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RespondToAuthChallengeResponse(");
        sb2.append("authenticationResult=" + this.f9433a + ',');
        sb2.append("challengeName=" + this.f9434b + ',');
        sb2.append("challengeParameters=" + this.f9435c + ',');
        sb2.append("session=*** Sensitive Data Redacted ***)");
        return sb2.toString();
    }
}
