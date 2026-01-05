package eb;

import c9.C0917l;
import hc.AbstractC2887j;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a */
    public final String f9364a;

    /* renamed from: b */
    public final AbstractC2887j f9365b;

    public m0(C0917l c0917l) {
        this.f9364a = (String) c0917l.f5594b;
        this.f9365b = (AbstractC2887j) c0917l.f5595c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m0.class != obj.getClass()) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return AbstractC4154l.m8918a(this.f9364a, m0Var.f9364a) && AbstractC4154l.m8918a(this.f9365b, m0Var.f9365b);
    }

    public final int hashCode() {
        String str = this.f9364a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        AbstractC2887j abstractC2887j = this.f9365b;
        return iHashCode + (abstractC2887j != null ? abstractC2887j.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CompleteWebAuthnRegistrationRequest(accessToken=*** Sensitive Data Redacted ***,");
        sb2.append("credential=" + this.f9365b);
        sb2.append(")");
        return sb2.toString();
    }
}
