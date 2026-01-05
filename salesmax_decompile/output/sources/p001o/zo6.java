package p001o;

/* loaded from: classes3.dex */
public final class zo6 {

    /* renamed from: a */
    public final Object f57448a;

    /* renamed from: b */
    public final dk3 f57449b;

    public zo6(Object obj, dk3 dk3Var) {
        sq8.m48649h(dk3Var, "expiresAt");
        this.f57448a = obj;
        this.f57449b = dk3Var;
    }

    /* renamed from: a */
    public final dk3 m59664a() {
        return this.f57449b;
    }

    /* renamed from: b */
    public final Object m59665b() {
        return this.f57448a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zo6)) {
            return false;
        }
        zo6 zo6Var = (zo6) obj;
        return sq8.m48644c(this.f57448a, zo6Var.f57448a) && sq8.m48644c(this.f57449b, zo6Var.f57449b);
    }

    public int hashCode() {
        Object obj = this.f57448a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f57449b.hashCode();
    }

    public String toString() {
        return "ExpiringValue(value=" + this.f57448a + ", expiresAt=" + this.f57449b + ')';
    }
}
