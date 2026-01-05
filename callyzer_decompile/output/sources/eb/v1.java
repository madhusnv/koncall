package eb;

import a1.C0005d;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class v1 {

    /* renamed from: a */
    public final String f9489a;

    /* renamed from: b */
    public final String f9490b;

    /* renamed from: c */
    public final Map f9491c;

    public v1(C0005d c0005d) {
        this.f9489a = (String) c0005d.f24b;
        this.f9490b = (String) c0005d.f25c;
        this.f9491c = (Map) c0005d.f26d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v1.class != obj.getClass()) {
            return false;
        }
        v1 v1Var = (v1) obj;
        return AbstractC4154l.m8918a(this.f9489a, v1Var.f9489a) && AbstractC4154l.m8918a(this.f9490b, v1Var.f9490b) && AbstractC4154l.m8918a(this.f9491c, v1Var.f9491c);
    }

    public final int hashCode() {
        String str = this.f9489a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f9490b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Map map = this.f9491c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GetUserAttributeVerificationCodeRequest(accessToken=*** Sensitive Data Redacted ***,");
        StringBuilder sbM7385r = i0.m0.m7385r(new StringBuilder("attributeName="), this.f9490b, ',', sb2, "clientMetadata=");
        sbM7385r.append(this.f9491c);
        sb2.append(sbM7385r.toString());
        sb2.append(")");
        return sb2.toString();
    }
}
