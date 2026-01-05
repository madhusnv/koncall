package eb;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a */
    public final boolean f9432a;

    public r0(q0 q0Var) {
        this.f9432a = q0Var.f9420a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && r0.class == obj.getClass() && this.f9432a == ((r0) obj).f9432a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9432a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConfirmDeviceResponse(");
        sb2.append("userConfirmationNecessary=" + this.f9432a);
        sb2.append(")");
        return sb2.toString();
    }
}
