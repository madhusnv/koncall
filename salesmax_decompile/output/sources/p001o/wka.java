package p001o;

import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import java.util.Set;

/* loaded from: classes5.dex */
public final class wka {

    /* renamed from: a */
    public final AccessToken f52262a;

    /* renamed from: b */
    public final AuthenticationToken f52263b;

    /* renamed from: c */
    public final Set f52264c;

    /* renamed from: d */
    public final Set f52265d;

    public wka(AccessToken accessToken, AuthenticationToken authenticationToken, Set set, Set set2) {
        sq8.m48649h(accessToken, "accessToken");
        sq8.m48649h(set, "recentlyGrantedPermissions");
        sq8.m48649h(set2, "recentlyDeniedPermissions");
        this.f52262a = accessToken;
        this.f52263b = authenticationToken;
        this.f52264c = set;
        this.f52265d = set2;
    }

    /* renamed from: a */
    public final AccessToken m54669a() {
        return this.f52262a;
    }

    /* renamed from: b */
    public final Set m54670b() {
        return this.f52264c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wka)) {
            return false;
        }
        wka wkaVar = (wka) obj;
        return sq8.m48644c(this.f52262a, wkaVar.f52262a) && sq8.m48644c(this.f52263b, wkaVar.f52263b) && sq8.m48644c(this.f52264c, wkaVar.f52264c) && sq8.m48644c(this.f52265d, wkaVar.f52265d);
    }

    public int hashCode() {
        int iHashCode = this.f52262a.hashCode() * 31;
        AuthenticationToken authenticationToken = this.f52263b;
        return ((((iHashCode + (authenticationToken == null ? 0 : authenticationToken.hashCode())) * 31) + this.f52264c.hashCode()) * 31) + this.f52265d.hashCode();
    }

    public String toString() {
        return "LoginResult(accessToken=" + this.f52262a + ", authenticationToken=" + this.f52263b + ", recentlyGrantedPermissions=" + this.f52264c + ", recentlyDeniedPermissions=" + this.f52265d + ')';
    }
}
