package tj;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tj.a */
/* loaded from: classes.dex */
public final class C7165a {

    /* renamed from: a */
    public final String f34415a;

    /* renamed from: b */
    public final String f34416b;

    /* renamed from: c */
    public final String f34417c;

    /* renamed from: d */
    public final C7166b f34418d;

    /* renamed from: e */
    public final EnumC7168d f34419e;

    public C7165a(String str, String str2, String str3, C7166b c7166b, EnumC7168d enumC7168d) {
        this.f34415a = str;
        this.f34416b = str2;
        this.f34417c = str3;
        this.f34418d = c7166b;
        this.f34419e = enumC7168d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7165a) {
            C7165a c7165a = (C7165a) obj;
            EnumC7168d enumC7168d = c7165a.f34419e;
            C7166b c7166b = c7165a.f34418d;
            String str = c7165a.f34417c;
            String str2 = c7165a.f34416b;
            String str3 = c7165a.f34415a;
            String str4 = this.f34415a;
            if (str4 != null ? str4.equals(str3) : str3 == null) {
                String str5 = this.f34416b;
                if (str5 != null ? str5.equals(str2) : str2 == null) {
                    String str6 = this.f34417c;
                    if (str6 != null ? str6.equals(str) : str == null) {
                        C7166b c7166b2 = this.f34418d;
                        if (c7166b2 != null ? c7166b2.equals(c7166b) : c7166b == null) {
                            EnumC7168d enumC7168d2 = this.f34419e;
                            if (enumC7168d2 != null ? enumC7168d2.equals(enumC7168d) : enumC7168d == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f34415a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f34416b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f34417c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        C7166b c7166b = this.f34418d;
        int iHashCode4 = (iHashCode3 ^ (c7166b == null ? 0 : c7166b.hashCode())) * 1000003;
        EnumC7168d enumC7168d = this.f34419e;
        return (enumC7168d != null ? enumC7168d.hashCode() : 0) ^ iHashCode4;
    }

    public final String toString() {
        return "InstallationResponse{uri=" + this.f34415a + ", fid=" + this.f34416b + ", refreshToken=" + this.f34417c + ", authToken=" + this.f34418d + ", responseCode=" + this.f34419e + "}";
    }
}
