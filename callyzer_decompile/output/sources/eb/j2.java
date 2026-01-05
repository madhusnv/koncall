package eb;

import a1.C0005d;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class j2 {

    /* renamed from: a */
    public final String f9344a;

    /* renamed from: b */
    public final Integer f9345b;

    /* renamed from: c */
    public final String f9346c;

    public j2(C0005d c0005d) {
        this.f9344a = (String) c0005d.f24b;
        this.f9345b = (Integer) c0005d.f25c;
        this.f9346c = (String) c0005d.f26d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j2.class != obj.getClass()) {
            return false;
        }
        j2 j2Var = (j2) obj;
        return AbstractC4154l.m8918a(this.f9344a, j2Var.f9344a) && AbstractC4154l.m8918a(this.f9345b, j2Var.f9345b) && AbstractC4154l.m8918a(this.f9346c, j2Var.f9346c);
    }

    public final int hashCode() {
        String str = this.f9344a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.f9345b;
        int iIntValue = (iHashCode + (num != null ? num.intValue() : 0)) * 31;
        String str2 = this.f9346c;
        return iIntValue + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ListWebAuthnCredentialsRequest(accessToken=*** Sensitive Data Redacted ***,");
        sb2.append("maxResults=" + this.f9345b + ',');
        return AbstractC4801l.m9737k(new StringBuilder("nextToken="), this.f9346c, sb2, ")");
    }
}
