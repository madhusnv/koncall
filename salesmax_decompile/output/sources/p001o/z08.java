package p001o;

/* loaded from: classes3.dex */
public final class z08 {

    /* renamed from: a */
    public final String f56356a;

    /* renamed from: b */
    public final vv8 f56357b;

    public z08(String str, vv8 vv8Var) {
        sq8.m48649h(str, "hostname");
        sq8.m48649h(vv8Var, "address");
        this.f56356a = str;
        this.f56357b = vv8Var;
    }

    /* renamed from: a */
    public final vv8 m58588a() {
        return this.f56357b;
    }

    /* renamed from: b */
    public final String m58589b() {
        return this.f56356a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z08)) {
            return false;
        }
        z08 z08Var = (z08) obj;
        return sq8.m48644c(this.f56356a, z08Var.f56356a) && sq8.m48644c(this.f56357b, z08Var.f56357b);
    }

    public int hashCode() {
        return (this.f56356a.hashCode() * 31) + this.f56357b.hashCode();
    }

    public String toString() {
        return "HostAddress(hostname=" + this.f56356a + ", address=" + this.f56357b + ')';
    }
}
