package u9;

import c9.C0919n;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u9.a */
/* loaded from: classes.dex */
public final class C7379a {

    /* renamed from: a */
    public final String f35080a;

    /* renamed from: b */
    public final String f35081b;

    /* renamed from: c */
    public final String f35082c;

    /* renamed from: d */
    public final String f35083d;

    public C7379a(C0919n c0919n) {
        this.f35080a = (String) c0919n.f5598a;
        this.f35081b = (String) c0919n.f5599b;
        this.f35082c = (String) c0919n.f5600c;
        this.f35083d = (String) c0919n.f5601d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7379a.class != obj.getClass()) {
            return false;
        }
        C7379a c7379a = (C7379a) obj;
        return AbstractC4154l.m8918a(this.f35080a, c7379a.f35080a) && AbstractC4154l.m8918a(this.f35081b, c7379a.f35081b) && AbstractC4154l.m8918a(this.f35082c, c7379a.f35082c) && AbstractC4154l.m8918a(this.f35083d, c7379a.f35083d);
    }

    public final int hashCode() {
        String str = this.f35080a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f35081b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 923521;
        String str3 = this.f35082c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 961;
        String str4 = this.f35083d;
        return (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreateTokenRequest(");
        sb2.append("clientId=" + this.f35080a + ',');
        sb2.append("clientSecret=*** Sensitive Data Redacted ***,code=null,codeVerifier=*** Sensitive Data Redacted ***,deviceCode=null,");
        sb2.append("grantType=" + this.f35082c + ',');
        sb2.append("redirectUri=null,refreshToken=*** Sensitive Data Redacted ***,scope=null)");
        return sb2.toString();
    }
}
