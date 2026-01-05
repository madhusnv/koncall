package wi;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wi.c */
/* loaded from: classes.dex */
public final class C8053c {

    /* renamed from: a */
    public final String f38573a;

    /* renamed from: b */
    public final String f38574b;

    /* renamed from: c */
    public final String f38575c;

    public C8053c(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.f38573a = str;
        this.f38574b = str2;
        this.f38575c = str3;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8053c) {
            C8053c c8053c = (C8053c) obj;
            String str3 = c8053c.f38575c;
            String str4 = c8053c.f38574b;
            if (this.f38573a.equals(c8053c.f38573a) && ((str = this.f38574b) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f38575c) != null ? str2.equals(str3) : str3 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f38573a.hashCode() ^ 1000003) * 1000003;
        String str = this.f38574b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f38575c;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb2.append(this.f38573a);
        sb2.append(", firebaseInstallationId=");
        sb2.append(this.f38574b);
        sb2.append(", firebaseAuthenticationToken=");
        return AbstractC1452a.m4564k(sb2, this.f38575c, "}");
    }
}
