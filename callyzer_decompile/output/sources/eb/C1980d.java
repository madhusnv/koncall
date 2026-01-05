package eb;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: eb.d */
/* loaded from: classes.dex */
public final class C1980d {

    /* renamed from: a */
    public final String f9285a;

    /* renamed from: b */
    public final String f9286b;

    public C1980d(C1979c c1979c) {
        this.f9285a = c1979c.f9280a;
        this.f9286b = c1979c.f9281b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1980d.class != obj.getClass()) {
            return false;
        }
        C1980d c1980d = (C1980d) obj;
        return AbstractC4154l.m8918a(this.f9285a, c1980d.f9285a) && AbstractC4154l.m8918a(this.f9286b, c1980d.f9286b);
    }

    public final int hashCode() {
        String str = this.f9285a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f9286b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "AssociateSoftwareTokenRequest(accessToken=*** Sensitive Data Redacted ***,session=*** Sensitive Data Redacted ***)";
    }
}
