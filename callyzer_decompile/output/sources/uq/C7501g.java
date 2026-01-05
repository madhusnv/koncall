package uq;

import fk.C2310p;
import sq.p1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: uq.g */
/* loaded from: classes3.dex */
public final class C7501g extends AbstractC7507m {

    /* renamed from: a */
    public final p1 f36194a;

    /* renamed from: b */
    public final C2310p f36195b;

    public C7501g(p1 p1Var, C2310p c2310p) {
        this.f36194a = p1Var;
        this.f36195b = c2310p;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7501g)) {
            return false;
        }
        C7501g c7501g = (C7501g) obj;
        return this.f36194a.equals(c7501g.f36194a) && this.f36195b.equals(c7501g.f36195b);
    }

    public final int hashCode() {
        return this.f36195b.hashCode() + (this.f36194a.hashCode() * 31);
    }

    public final String toString() {
        return "OnCompareClick(doIfValidated=" + this.f36194a + ", doIfNotValid=" + this.f36195b + ")";
    }
}
