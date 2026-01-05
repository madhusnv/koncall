package p001o;

import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;

/* loaded from: classes2.dex */
public final class h2g implements ag1 {

    /* renamed from: b */
    public final String f26132b;

    /* renamed from: c */
    public final gk8 f26133c;

    /* renamed from: d */
    public final String f26134d;

    /* renamed from: e */
    public final String f26135e;

    /* renamed from: f */
    public final String f26136f;

    /* renamed from: g */
    public final gk8 f26137g;

    /* renamed from: h */
    public final String f26138h;

    /* renamed from: i */
    public final String f26139i;

    /* renamed from: j */
    public final qx0 f26140j;

    public h2g(String str, gk8 gk8Var, String str2, String str3, String str4, gk8 gk8Var2, String str5, String str6) {
        sq8.m48649h(str, AWSCognitoLegacyCredentialStore.TOKEN_KEY);
        sq8.m48649h(gk8Var, "expiration");
        this.f26132b = str;
        this.f26133c = gk8Var;
        this.f26134d = str2;
        this.f26135e = str3;
        this.f26136f = str4;
        this.f26137g = gk8Var2;
        this.f26138h = str5;
        this.f26139i = str6;
        this.f26140j = tx0.m50736a();
    }

    @Override // p001o.ib8
    /* renamed from: c */
    public gk8 mo29762c() {
        return this.f26133c;
    }

    /* renamed from: e */
    public final h2g m29763e(String str, gk8 gk8Var, String str2, String str3, String str4, gk8 gk8Var2, String str5, String str6) {
        sq8.m48649h(str, AWSCognitoLegacyCredentialStore.TOKEN_KEY);
        sq8.m48649h(gk8Var, "expiration");
        return new h2g(str, gk8Var, str2, str3, str4, gk8Var2, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2g)) {
            return false;
        }
        h2g h2gVar = (h2g) obj;
        return sq8.m48644c(this.f26132b, h2gVar.f26132b) && sq8.m48644c(this.f26133c, h2gVar.f26133c) && sq8.m48644c(this.f26134d, h2gVar.f26134d) && sq8.m48644c(this.f26135e, h2gVar.f26135e) && sq8.m48644c(this.f26136f, h2gVar.f26136f) && sq8.m48644c(this.f26137g, h2gVar.f26137g) && sq8.m48644c(this.f26138h, h2gVar.f26138h) && sq8.m48644c(this.f26139i, h2gVar.f26139i);
    }

    /* renamed from: g */
    public final String m29764g() {
        return this.f26135e;
    }

    @Override // p001o.ib8
    public qx0 getAttributes() {
        return this.f26140j;
    }

    @Override // p001o.ag1
    public String getToken() {
        return this.f26132b;
    }

    /* renamed from: h */
    public final String m29765h() {
        return this.f26136f;
    }

    public int hashCode() {
        int iHashCode = ((this.f26132b.hashCode() * 31) + this.f26133c.hashCode()) * 31;
        String str = this.f26134d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f26135e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f26136f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        gk8 gk8Var = this.f26137g;
        int iHashCode5 = (iHashCode4 + (gk8Var == null ? 0 : gk8Var.hashCode())) * 31;
        String str4 = this.f26138h;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f26139i;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    /* renamed from: i */
    public final String m29766i() {
        return this.f26134d;
    }

    /* renamed from: j */
    public final String m29767j() {
        return this.f26138h;
    }

    /* renamed from: k */
    public final gk8 m29768k() {
        return this.f26137g;
    }

    /* renamed from: l */
    public final String m29769l() {
        return this.f26139i;
    }

    public String toString() {
        return "SsoToken(token=" + this.f26132b + ", expiration=" + this.f26133c + ", refreshToken=" + this.f26134d + ", clientId=" + this.f26135e + ", clientSecret=" + this.f26136f + ", registrationExpiresAt=" + this.f26137g + ", region=" + this.f26138h + ", startUrl=" + this.f26139i + ')';
    }
}
