package zi;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: a */
    public final l1 f43164a;

    /* renamed from: b */
    public final n1 f43165b;

    /* renamed from: c */
    public final m1 f43166c;

    public k1(l1 l1Var, n1 n1Var, m1 m1Var) {
        this.f43164a = l1Var;
        this.f43165b = n1Var;
        this.f43166c = m1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k1) {
            k1 k1Var = (k1) obj;
            if (this.f43164a.equals(k1Var.f43164a) && this.f43165b.equals(k1Var.f43165b) && this.f43166c.equals(k1Var.f43166c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f43164a.hashCode() ^ 1000003) * 1000003) ^ this.f43165b.hashCode()) * 1000003) ^ this.f43166c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f43164a + ", osData=" + this.f43165b + ", deviceData=" + this.f43166c + "}";
    }
}
