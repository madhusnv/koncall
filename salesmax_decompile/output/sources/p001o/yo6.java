package p001o;

/* loaded from: classes3.dex */
public final class yo6 {

    /* renamed from: a */
    public final Object f55768a;

    /* renamed from: b */
    public final gk8 f55769b;

    public yo6(Object obj, gk8 gk8Var) {
        sq8.m48649h(gk8Var, "expiresAt");
        this.f55768a = obj;
        this.f55769b = gk8Var;
    }

    /* renamed from: a */
    public final gk8 m58047a() {
        return this.f55769b;
    }

    /* renamed from: b */
    public final Object m58048b() {
        return this.f55768a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yo6)) {
            return false;
        }
        yo6 yo6Var = (yo6) obj;
        return sq8.m48644c(this.f55768a, yo6Var.f55768a) && sq8.m48644c(this.f55769b, yo6Var.f55769b);
    }

    public int hashCode() {
        Object obj = this.f55768a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f55769b.hashCode();
    }

    public String toString() {
        return "ExpiringValue(value=" + this.f55768a + ", expiresAt=" + this.f55769b + ')';
    }
}
