package k2;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g0 implements k2 {

    /* renamed from: a */
    public final e1 f20390a;

    public g0(e1 e1Var) {
        this.f20390a = e1Var;
    }

    @Override // k2.k2
    /* renamed from: a */
    public final Object mo8487a(i1 i1Var) {
        return this.f20390a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0) && this.f20390a.equals(((g0) obj).f20390a);
    }

    public final int hashCode() {
        return this.f20390a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.f20390a + ')';
    }
}
