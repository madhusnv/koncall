package zi;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b0 extends n2 {

    /* renamed from: b */
    public final String f43002b;

    /* renamed from: c */
    public final String f43003c;

    /* renamed from: d */
    public final int f43004d;

    /* renamed from: e */
    public final String f43005e;

    /* renamed from: f */
    public final String f43006f;

    /* renamed from: g */
    public final String f43007g;

    /* renamed from: h */
    public final String f43008h;

    /* renamed from: i */
    public final String f43009i;

    /* renamed from: j */
    public final String f43010j;

    /* renamed from: k */
    public final m2 f43011k;

    /* renamed from: l */
    public final s1 f43012l;

    /* renamed from: m */
    public final p1 f43013m;

    public b0(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, String str8, m2 m2Var, s1 s1Var, p1 p1Var) {
        this.f43002b = str;
        this.f43003c = str2;
        this.f43004d = i10;
        this.f43005e = str3;
        this.f43006f = str4;
        this.f43007g = str5;
        this.f43008h = str6;
        this.f43009i = str7;
        this.f43010j = str8;
        this.f43011k = m2Var;
        this.f43012l = s1Var;
        this.f43013m = p1Var;
    }

    /* renamed from: a */
    public final a0 m16445a() {
        a0 a0Var = new a0();
        a0Var.f42972a = this.f43002b;
        a0Var.f42973b = this.f43003c;
        a0Var.f42974c = this.f43004d;
        a0Var.f42975d = this.f43005e;
        a0Var.f42976e = this.f43006f;
        a0Var.f42977f = this.f43007g;
        a0Var.f42978g = this.f43008h;
        a0Var.f42979h = this.f43009i;
        a0Var.f42980i = this.f43010j;
        a0Var.f42981j = this.f43011k;
        a0Var.f42982k = this.f43012l;
        a0Var.f42983l = this.f43013m;
        a0Var.f42984m = (byte) 1;
        return a0Var;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        m2 m2Var;
        s1 s1Var;
        p1 p1Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof n2) {
            b0 b0Var = (b0) ((n2) obj);
            p1 p1Var2 = b0Var.f43013m;
            s1 s1Var2 = b0Var.f43012l;
            m2 m2Var2 = b0Var.f43011k;
            String str4 = b0Var.f43008h;
            String str5 = b0Var.f43007g;
            String str6 = b0Var.f43006f;
            if (this.f43002b.equals(b0Var.f43002b) && this.f43003c.equals(b0Var.f43003c) && this.f43004d == b0Var.f43004d && this.f43005e.equals(b0Var.f43005e) && ((str = this.f43006f) != null ? str.equals(str6) : str6 == null) && ((str2 = this.f43007g) != null ? str2.equals(str5) : str5 == null) && ((str3 = this.f43008h) != null ? str3.equals(str4) : str4 == null) && this.f43009i.equals(b0Var.f43009i) && this.f43010j.equals(b0Var.f43010j) && ((m2Var = this.f43011k) != null ? m2Var.equals(m2Var2) : m2Var2 == null) && ((s1Var = this.f43012l) != null ? s1Var.equals(s1Var2) : s1Var2 == null) && ((p1Var = this.f43013m) != null ? p1Var.equals(p1Var2) : p1Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f43002b.hashCode() ^ 1000003) * 1000003) ^ this.f43003c.hashCode()) * 1000003) ^ this.f43004d) * 1000003) ^ this.f43005e.hashCode()) * 1000003;
        String str = this.f43006f;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f43007g;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f43008h;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.f43009i.hashCode()) * 1000003) ^ this.f43010j.hashCode()) * 1000003;
        m2 m2Var = this.f43011k;
        int iHashCode5 = (iHashCode4 ^ (m2Var == null ? 0 : m2Var.hashCode())) * 1000003;
        s1 s1Var = this.f43012l;
        int iHashCode6 = (iHashCode5 ^ (s1Var == null ? 0 : s1Var.hashCode())) * 1000003;
        p1 p1Var = this.f43013m;
        return iHashCode6 ^ (p1Var != null ? p1Var.hashCode() : 0);
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f43002b + ", gmpAppId=" + this.f43003c + ", platform=" + this.f43004d + ", installationUuid=" + this.f43005e + ", firebaseInstallationId=" + this.f43006f + ", firebaseAuthenticationToken=" + this.f43007g + ", appQualitySessionId=" + this.f43008h + ", buildVersion=" + this.f43009i + ", displayVersion=" + this.f43010j + ", session=" + this.f43011k + ", ndkPayload=" + this.f43012l + ", appExitInfo=" + this.f43013m + "}";
    }
}
