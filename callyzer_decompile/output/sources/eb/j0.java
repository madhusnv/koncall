package eb;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a */
    public final String f9341a;

    /* renamed from: b */
    public final String f9342b;

    /* renamed from: c */
    public final String f9343c;

    public j0(i0 i0Var) {
        this.f9341a = i0Var.f9333a;
        this.f9342b = i0Var.f9334b;
        this.f9343c = i0Var.f9335c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j0.class != obj.getClass()) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return AbstractC4154l.m8918a(this.f9341a, j0Var.f9341a) && AbstractC4154l.m8918a(this.f9342b, j0Var.f9342b) && AbstractC4154l.m8918a(this.f9343c, j0Var.f9343c);
    }

    public final int hashCode() {
        String str = this.f9341a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f9342b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f9343c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "ChangePasswordRequest(accessToken=*** Sensitive Data Redacted ***,previousPassword=*** Sensitive Data Redacted ***,proposedPassword=*** Sensitive Data Redacted ***)";
    }
}
