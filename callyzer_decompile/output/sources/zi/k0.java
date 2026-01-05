package zi;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class k0 extends u1 {

    /* renamed from: a */
    public final String f43158a;

    /* renamed from: b */
    public final String f43159b;

    /* renamed from: c */
    public final String f43160c;

    /* renamed from: d */
    public final String f43161d;

    /* renamed from: e */
    public final String f43162e;

    /* renamed from: f */
    public final String f43163f;

    public k0(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f43158a = str;
        this.f43159b = str2;
        this.f43160c = str3;
        this.f43161d = str4;
        this.f43162e = str5;
        this.f43163f = str6;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        if (obj == this) {
            return true;
        }
        if (obj instanceof u1) {
            k0 k0Var = (k0) ((u1) obj);
            String str5 = k0Var.f43163f;
            String str6 = k0Var.f43162e;
            String str7 = k0Var.f43161d;
            String str8 = k0Var.f43160c;
            if (this.f43158a.equals(k0Var.f43158a) && this.f43159b.equals(k0Var.f43159b) && ((str = this.f43160c) != null ? str.equals(str8) : str8 == null) && ((str2 = this.f43161d) != null ? str2.equals(str7) : str7 == null) && ((str3 = this.f43162e) != null ? str3.equals(str6) : str6 == null) && ((str4 = this.f43163f) != null ? str4.equals(str5) : str5 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f43158a.hashCode() ^ 1000003) * 1000003) ^ this.f43159b.hashCode()) * 1000003;
        String str = this.f43160c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * (-721379959);
        String str2 = this.f43161d;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f43162e;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f43163f;
        return iHashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{identifier=");
        sb2.append(this.f43158a);
        sb2.append(", version=");
        sb2.append(this.f43159b);
        sb2.append(", displayVersion=");
        sb2.append(this.f43160c);
        sb2.append(", organization=null, installationUuid=");
        sb2.append(this.f43161d);
        sb2.append(", developmentPlatform=");
        sb2.append(this.f43162e);
        sb2.append(", developmentPlatformVersion=");
        return AbstractC1452a.m4564k(sb2, this.f43163f, "}");
    }
}
