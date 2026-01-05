package sq;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class f3 {

    /* renamed from: a */
    public final int f32862a;

    /* renamed from: b */
    public final int f32863b;

    public f3(int i10, int i11) {
        this.f32862a = i10;
        this.f32863b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3)) {
            return false;
        }
        f3 f3Var = (f3) obj;
        return this.f32862a == f3Var.f32862a && this.f32863b == f3Var.f32863b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f32863b) + (Integer.hashCode(this.f32862a) * 31);
    }

    public final String toString() {
        return i0.m0.m7377j(this.f32862a, this.f32863b, "TabIcon(selected=", ", unselected=", ")");
    }
}
