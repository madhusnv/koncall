package eb;

import kotlin.jvm.internal.AbstractC4154l;
import nf.C5047i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class u1 {

    /* renamed from: a */
    public final l0 f9479a;

    public u1(C5047i c5047i) {
        this.f9479a = (l0) c5047i.f24823b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && u1.class == obj.getClass() && AbstractC4154l.m8918a(this.f9479a, ((u1) obj).f9479a);
    }

    public final int hashCode() {
        l0 l0Var = this.f9479a;
        if (l0Var != null) {
            return l0Var.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ForgotPasswordResponse(");
        sb2.append("codeDeliveryDetails=" + this.f9479a);
        sb2.append(")");
        return sb2.toString();
    }
}
