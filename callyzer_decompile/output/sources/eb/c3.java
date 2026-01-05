package eb;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c3 {

    /* renamed from: a */
    public final boolean f9283a;

    /* renamed from: b */
    public final boolean f9284b;

    public c3(b3 b3Var) {
        this.f9283a = b3Var.f9278a;
        this.f9284b = b3Var.f9279b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c3.class != obj.getClass()) {
            return false;
        }
        c3 c3Var = (c3) obj;
        return this.f9283a == c3Var.f9283a && this.f9284b == c3Var.f9284b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9284b) + (Boolean.hashCode(this.f9283a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SoftwareTokenMfaSettingsType(");
        sb2.append("enabled=" + this.f9283a + ',');
        StringBuilder sb3 = new StringBuilder("preferredMfa=");
        sb3.append(this.f9284b);
        sb2.append(sb3.toString());
        sb2.append(")");
        return sb2.toString();
    }
}
