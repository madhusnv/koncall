package p001o;

/* loaded from: classes3.dex */
public final class wz0 implements vz0 {

    /* renamed from: a */
    public final String f52907a;

    /* renamed from: b */
    public final qx0 f52908b;

    public /* synthetic */ wz0(String str, qx0 qx0Var, id5 id5Var) {
        this(str, qx0Var);
    }

    @Override // p001o.vz0
    /* renamed from: a */
    public String mo53621a() {
        return this.f52907a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wz0)) {
            return false;
        }
        wz0 wz0Var = (wz0) obj;
        return d01.m22169g(this.f52907a, wz0Var.f52907a) && sq8.m48644c(this.f52908b, wz0Var.f52908b);
    }

    @Override // p001o.vz0
    public qx0 getAttributes() {
        return this.f52908b;
    }

    public int hashCode() {
        return (d01.m22170h(this.f52907a) * 31) + this.f52908b.hashCode();
    }

    public String toString() {
        return "AuthOptionImpl(schemeId=" + ((Object) d01.m22171i(this.f52907a)) + ", attributes=" + this.f52908b + ')';
    }

    public wz0(String str, qx0 qx0Var) {
        sq8.m48649h(str, "schemeId");
        sq8.m48649h(qx0Var, "attributes");
        this.f52907a = str;
        this.f52908b = qx0Var;
    }
}
