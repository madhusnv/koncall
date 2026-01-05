package eb;

import c9.C0910e;
import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class k2 {

    /* renamed from: a */
    public final Object f9351a;

    /* renamed from: b */
    public final String f9352b;

    public k2(C0910e c0910e) {
        Object obj = c0910e.f5579b;
        if (obj == null) {
            throw new IllegalArgumentException("A non-null value must be provided for credentials");
        }
        this.f9351a = obj;
        this.f9352b = (String) c0910e.f5580c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k2.class != obj.getClass()) {
            return false;
        }
        k2 k2Var = (k2) obj;
        return AbstractC4154l.m8918a(this.f9351a, k2Var.f9351a) && AbstractC4154l.m8918a(this.f9352b, k2Var.f9352b);
    }

    public final int hashCode() {
        int iHashCode = this.f9351a.hashCode() * 31;
        String str = this.f9352b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ListWebAuthnCredentialsResponse(");
        sb2.append("credentials=" + this.f9351a + ',');
        return AbstractC4801l.m9737k(new StringBuilder("nextToken="), this.f9352b, sb2, ")");
    }
}
