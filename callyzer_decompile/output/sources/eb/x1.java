package eb;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class x1 {

    /* renamed from: a */
    public final l0 f9507a;

    public x1(w1 w1Var) {
        this.f9507a = w1Var.f9504a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && x1.class == obj.getClass() && AbstractC4154l.m8918a(this.f9507a, ((x1) obj).f9507a);
    }

    public final int hashCode() {
        l0 l0Var = this.f9507a;
        if (l0Var != null) {
            return l0Var.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GetUserAttributeVerificationCodeResponse(");
        sb2.append("codeDeliveryDetails=" + this.f9507a);
        sb2.append(")");
        return sb2.toString();
    }
}
