package eb;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a3 {

    /* renamed from: a */
    public final boolean f9271a;

    /* renamed from: b */
    public final boolean f9272b;

    public a3(z2 z2Var) {
        this.f9271a = z2Var.f9531a;
        this.f9272b = z2Var.f9532b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a3.class != obj.getClass()) {
            return false;
        }
        a3 a3Var = (a3) obj;
        return this.f9271a == a3Var.f9271a && this.f9272b == a3Var.f9272b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9272b) + (Boolean.hashCode(this.f9271a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SmsMfaSettingsType(");
        sb2.append("enabled=" + this.f9271a + ',');
        StringBuilder sb3 = new StringBuilder("preferredMfa=");
        sb3.append(this.f9272b);
        sb2.append(sb3.toString());
        sb2.append(")");
        return sb2.toString();
    }
}
