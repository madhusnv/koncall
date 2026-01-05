package mb;

import kotlin.jvm.internal.AbstractC4154l;
import l4.C4367l;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a */
    public final Boolean f23236a;

    /* renamed from: b */
    public final l2 f23237b;

    /* renamed from: c */
    public final String f23238c;

    public f0(C4367l c4367l) {
        this.f23236a = (Boolean) c4367l.f21921b;
        this.f23237b = (l2) c4367l.f21922c;
        this.f23238c = (String) c4367l.f21923d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f0.class != obj.getClass()) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return AbstractC4154l.m8918a(this.f23236a, f0Var.f23236a) && AbstractC4154l.m8918a(this.f23237b, f0Var.f23237b) && AbstractC4154l.m8918a(this.f23238c, f0Var.f23238c);
    }

    public final int hashCode() {
        Boolean bool = this.f23236a;
        int iHashCode = (bool != null ? bool.hashCode() : 0) * 31;
        l2 l2Var = this.f23237b;
        int iHashCode2 = (iHashCode + (l2Var != null ? l2Var.hashCode() : 0)) * 31;
        String str = this.f23238c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeleteObjectResponse(");
        StringBuilder sbM7384q = i0.m0.m7384q(new StringBuilder("deleteMarker="), this.f23236a, ',', sb2, "requestCharged=");
        sbM7384q.append(this.f23237b);
        sbM7384q.append(',');
        sb2.append(sbM7384q.toString());
        return AbstractC4801l.m9737k(new StringBuilder("versionId="), this.f23238c, sb2, ")");
    }
}
