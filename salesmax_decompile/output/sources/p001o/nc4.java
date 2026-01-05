package p001o;

import p001o.ic4;

/* loaded from: classes3.dex */
public final class nc4 implements ic4 {

    /* renamed from: b */
    public final String f36680b;

    /* renamed from: c */
    public final String f36681c;

    /* renamed from: d */
    public final String f36682d;

    /* renamed from: e */
    public final gk8 f36683e;

    /* renamed from: f */
    public final qx0 f36684f;

    public nc4(String str, String str2, String str3, gk8 gk8Var, qx0 qx0Var) {
        sq8.m48649h(str, "accessKeyId");
        sq8.m48649h(str2, "secretAccessKey");
        sq8.m48649h(qx0Var, "attributes");
        this.f36680b = str;
        this.f36681c = str2;
        this.f36682d = str3;
        this.f36683e = gk8Var;
        this.f36684f = qx0Var;
    }

    @Override // p001o.ic4
    /* renamed from: a */
    public String mo31896a() {
        return this.f36681c;
    }

    @Override // p001o.ic4
    /* renamed from: b */
    public String mo31897b() {
        return ic4.C14249b.m31901a(this);
    }

    @Override // p001o.ib8
    /* renamed from: c */
    public gk8 mo29762c() {
        return this.f36683e;
    }

    @Override // p001o.ic4
    /* renamed from: d */
    public String mo31898d() {
        return this.f36680b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nc4)) {
            return false;
        }
        nc4 nc4Var = (nc4) obj;
        return sq8.m48644c(this.f36680b, nc4Var.f36680b) && sq8.m48644c(this.f36681c, nc4Var.f36681c) && sq8.m48644c(this.f36682d, nc4Var.f36682d) && sq8.m48644c(this.f36683e, nc4Var.f36683e) && sq8.m48644c(this.f36684f, nc4Var.f36684f);
    }

    @Override // p001o.ib8
    public qx0 getAttributes() {
        return this.f36684f;
    }

    @Override // p001o.ic4
    public String getSessionToken() {
        return this.f36682d;
    }

    public int hashCode() {
        int iHashCode = ((this.f36680b.hashCode() * 31) + this.f36681c.hashCode()) * 31;
        String str = this.f36682d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        gk8 gk8Var = this.f36683e;
        return ((iHashCode2 + (gk8Var != null ? gk8Var.hashCode() : 0)) * 31) + this.f36684f.hashCode();
    }

    public String toString() {
        return "CredentialsImpl(accessKeyId=" + this.f36680b + ", secretAccessKey=" + this.f36681c + ", sessionToken=" + this.f36682d + ", expiration=" + this.f36683e + ", attributes=" + this.f36684f + ')';
    }
}
