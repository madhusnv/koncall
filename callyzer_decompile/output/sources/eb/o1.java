package eb;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: a */
    public final boolean f9394a;

    /* renamed from: b */
    public final boolean f9395b;

    public o1(n1 n1Var) {
        this.f9394a = n1Var.f9378a;
        this.f9395b = n1Var.f9379b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o1.class != obj.getClass()) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return this.f9394a == o1Var.f9394a && this.f9395b == o1Var.f9395b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9395b) + (Boolean.hashCode(this.f9394a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EmailMfaSettingsType(");
        sb2.append("enabled=" + this.f9394a + ',');
        StringBuilder sb3 = new StringBuilder("preferredMfa=");
        sb3.append(this.f9395b);
        sb2.append(sb3.toString());
        sb2.append(")");
        return sb2.toString();
    }
}
