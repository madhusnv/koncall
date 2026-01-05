package mb;

import kotlin.jvm.internal.AbstractC4154l;
import td.C7126c;
import z1.C8849i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class p2 {

    /* renamed from: a */
    public final Boolean f23425a;

    /* renamed from: b */
    public final C7126c f23426b;

    public p2(C8849i c8849i) {
        this.f23425a = (Boolean) c8849i.f42583b;
        this.f23426b = (C7126c) c8849i.f42584c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p2.class != obj.getClass()) {
            return false;
        }
        p2 p2Var = (p2) obj;
        return AbstractC4154l.m8918a(this.f23425a, p2Var.f23425a) && AbstractC4154l.m8918a(this.f23426b, p2Var.f23426b);
    }

    public final int hashCode() {
        Boolean bool = this.f23425a;
        int iHashCode = (bool != null ? bool.hashCode() : 0) * 31;
        C7126c c7126c = this.f23426b;
        return iHashCode + (c7126c != null ? c7126c.f34346a.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RestoreStatus(");
        StringBuilder sbM7384q = i0.m0.m7384q(new StringBuilder("isRestoreInProgress="), this.f23425a, ',', sb2, "restoreExpiryDate=");
        sbM7384q.append(this.f23426b);
        sb2.append(sbM7384q.toString());
        sb2.append(")");
        return sb2.toString();
    }
}
