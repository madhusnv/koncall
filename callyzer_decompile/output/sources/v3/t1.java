package v3;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class t1 implements q1 {

    /* renamed from: a */
    public final t3.k0 f37013a;

    /* renamed from: b */
    public final n0 f37014b;

    public t1(t3.k0 k0Var, n0 n0Var) {
        this.f37013a = k0Var;
        this.f37014b = n0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        return AbstractC4154l.m8918a(this.f37013a, t1Var.f37013a) && AbstractC4154l.m8918a(this.f37014b, t1Var.f37014b);
    }

    public final int hashCode() {
        return this.f37014b.hashCode() + (this.f37013a.hashCode() * 31);
    }

    @Override // v3.q1
    /* renamed from: n */
    public final boolean mo14534n() {
        return this.f37014b.z0().mo13305s();
    }

    public final String toString() {
        return "PlaceableResult(result=" + this.f37013a + ", placeable=" + this.f37014b + ')';
    }
}
