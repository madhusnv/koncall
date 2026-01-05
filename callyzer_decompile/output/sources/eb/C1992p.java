package eb;

import com.google.android.material.datepicker.C1339c;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: eb.p */
/* loaded from: classes.dex */
public final class C1992p {

    /* renamed from: a */
    public final String f9399a;

    /* renamed from: b */
    public final int f9400b;

    /* renamed from: c */
    public final String f9401c;

    /* renamed from: d */
    public final m2 f9402d;

    /* renamed from: e */
    public final String f9403e;

    /* renamed from: f */
    public final String f9404f;

    public C1992p(C1339c c1339c) {
        this.f9399a = (String) c1339c.f6846b;
        this.f9400b = c1339c.f6845a;
        this.f9401c = (String) c1339c.f6847c;
        this.f9402d = (m2) c1339c.f6848d;
        this.f9403e = (String) c1339c.f6849e;
        this.f9404f = (String) c1339c.f6850f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1992p.class != obj.getClass()) {
            return false;
        }
        C1992p c1992p = (C1992p) obj;
        return AbstractC4154l.m8918a(this.f9399a, c1992p.f9399a) && this.f9400b == c1992p.f9400b && AbstractC4154l.m8918a(this.f9401c, c1992p.f9401c) && AbstractC4154l.m8918a(this.f9402d, c1992p.f9402d) && AbstractC4154l.m8918a(this.f9403e, c1992p.f9403e) && AbstractC4154l.m8918a(this.f9404f, c1992p.f9404f);
    }

    public final int hashCode() {
        String str = this.f9399a;
        int iHashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f9400b) * 31;
        String str2 = this.f9401c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        m2 m2Var = this.f9402d;
        int iHashCode3 = (iHashCode2 + (m2Var != null ? m2Var.hashCode() : 0)) * 31;
        String str3 = this.f9403e;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f9404f;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AuthenticationResultType(accessToken=*** Sensitive Data Redacted ***,");
        sb2.append("expiresIn=" + this.f9400b + ',');
        sb2.append("idToken=*** Sensitive Data Redacted ***,");
        sb2.append("newDeviceMetadata=" + this.f9402d + ',');
        sb2.append("refreshToken=*** Sensitive Data Redacted ***,");
        return AbstractC4801l.m9737k(new StringBuilder("tokenType="), this.f9404f, sb2, ")");
    }
}
