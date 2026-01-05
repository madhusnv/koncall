package eb;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: eb.f */
/* loaded from: classes.dex */
public final class C1982f {

    /* renamed from: a */
    public final String f9307a;

    /* renamed from: b */
    public final String f9308b;

    public C1982f(C1981e c1981e) {
        this.f9307a = c1981e.f9297a;
        this.f9308b = c1981e.f9298b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1982f.class != obj.getClass()) {
            return false;
        }
        C1982f c1982f = (C1982f) obj;
        return AbstractC4154l.m8918a(this.f9307a, c1982f.f9307a) && AbstractC4154l.m8918a(this.f9308b, c1982f.f9308b);
    }

    public final int hashCode() {
        String str = this.f9307a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f9308b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "AssociateSoftwareTokenResponse(secretCode=*** Sensitive Data Redacted ***,session=*** Sensitive Data Redacted ***)";
    }
}
