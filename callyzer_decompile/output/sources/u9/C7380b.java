package u9;

import kotlin.jvm.internal.AbstractC4154l;
import ly.C4599w;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u9.b */
/* loaded from: classes.dex */
public final class C7380b {

    /* renamed from: a */
    public final String f35084a;

    /* renamed from: b */
    public final int f35085b;

    /* renamed from: c */
    public final String f35086c;

    /* renamed from: d */
    public final String f35087d;

    /* renamed from: e */
    public final String f35088e;

    public C7380b(C4599w c4599w) {
        this.f35084a = c4599w.f22764c;
        this.f35085b = c4599w.f22763b;
        this.f35086c = c4599w.f22765d;
        this.f35087d = (String) c4599w.f22766e;
        this.f35088e = (String) c4599w.f22767f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7380b.class != obj.getClass()) {
            return false;
        }
        C7380b c7380b = (C7380b) obj;
        return AbstractC4154l.m8918a(this.f35084a, c7380b.f35084a) && this.f35085b == c7380b.f35085b && AbstractC4154l.m8918a(this.f35086c, c7380b.f35086c) && AbstractC4154l.m8918a(this.f35087d, c7380b.f35087d) && AbstractC4154l.m8918a(this.f35088e, c7380b.f35088e);
    }

    public final int hashCode() {
        String str = this.f35084a;
        int iHashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f35085b) * 31;
        String str2 = this.f35086c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f35087d;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f35088e;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreateTokenResponse(accessToken=*** Sensitive Data Redacted ***,");
        sb2.append("expiresIn=" + this.f35085b + ',');
        sb2.append("idToken=*** Sensitive Data Redacted ***,refreshToken=*** Sensitive Data Redacted ***,");
        return AbstractC4801l.m9737k(new StringBuilder("tokenType="), this.f35088e, sb2, ")");
    }
}
