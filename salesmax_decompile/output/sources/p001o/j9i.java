package p001o;

import com.amplifyframework.datastore.generated.model.UserStatus;

/* loaded from: classes.dex */
public final class j9i {

    /* renamed from: a */
    public final String f30003a;

    /* renamed from: b */
    public final String f30004b;

    /* renamed from: c */
    public final String f30005c;

    /* renamed from: d */
    public final String f30006d;

    /* renamed from: e */
    public final String f30007e;

    /* renamed from: f */
    public final Long f30008f;

    /* renamed from: g */
    public final Long f30009g;

    /* renamed from: h */
    public UserStatus f30010h;

    public j9i(String str, String str2, String str3, String str4, String str5, Long l, Long l2, UserStatus userStatus) {
        sq8.m48649h(str, "userId");
        sq8.m48649h(str2, "sub");
        sq8.m48649h(str3, "number");
        this.f30003a = str;
        this.f30004b = str2;
        this.f30005c = str3;
        this.f30006d = str4;
        this.f30007e = str5;
        this.f30008f = l;
        this.f30009g = l2;
        this.f30010h = userStatus;
    }

    /* renamed from: a */
    public final String m33425a() {
        return this.f30003a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j9i)) {
            return false;
        }
        j9i j9iVar = (j9i) obj;
        return sq8.m48644c(this.f30003a, j9iVar.f30003a) && sq8.m48644c(this.f30004b, j9iVar.f30004b) && sq8.m48644c(this.f30005c, j9iVar.f30005c) && sq8.m48644c(this.f30006d, j9iVar.f30006d) && sq8.m48644c(this.f30007e, j9iVar.f30007e) && sq8.m48644c(this.f30008f, j9iVar.f30008f) && sq8.m48644c(this.f30009g, j9iVar.f30009g) && this.f30010h == j9iVar.f30010h;
    }

    public int hashCode() {
        int iHashCode = ((((this.f30003a.hashCode() * 31) + this.f30004b.hashCode()) * 31) + this.f30005c.hashCode()) * 31;
        String str = this.f30006d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f30007e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.f30008f;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f30009g;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        UserStatus userStatus = this.f30010h;
        return iHashCode5 + (userStatus != null ? userStatus.hashCode() : 0);
    }

    public String toString() {
        return "User(userId=" + this.f30003a + ", sub=" + this.f30004b + ", number=" + this.f30005c + ", email=" + this.f30006d + ", eventId=" + this.f30007e + ", authTime=" + this.f30008f + ", exp=" + this.f30009g + ", status=" + this.f30010h + ")";
    }

    public /* synthetic */ j9i(String str, String str2, String str3, String str4, String str5, Long l, Long l2, UserStatus userStatus, int i, id5 id5Var) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : l2, (i & 128) != 0 ? null : userStatus);
    }
}
