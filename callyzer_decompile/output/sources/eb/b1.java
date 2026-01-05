package eb;

import aa.C0078e;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: a */
    public final String f9275a;

    /* renamed from: b */
    public final String f9276b;

    public b1(C0078e c0078e) {
        this.f9275a = c0078e.f291a;
        this.f9276b = c0078e.f292b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b1.class != obj.getClass()) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return AbstractC4154l.m8918a(this.f9275a, b1Var.f9275a) && AbstractC4154l.m8918a(this.f9276b, b1Var.f9276b);
    }

    public final int hashCode() {
        String str = this.f9275a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f9276b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return AbstractC4801l.m9737k(new StringBuilder("credentialId="), this.f9276b, new StringBuilder("DeleteWebAuthnCredentialRequest(accessToken=*** Sensitive Data Redacted ***,"), ")");
    }
}
