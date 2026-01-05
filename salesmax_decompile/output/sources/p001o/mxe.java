package p001o;

/* loaded from: classes3.dex */
public final class mxe {

    /* renamed from: a */
    public final zo6 f36076a;

    /* renamed from: b */
    public final fuf f36077b;

    public mxe(zo6 zo6Var, fuf fufVar) {
        sq8.m48649h(zo6Var, "expiringCredentials");
        sq8.m48649h(fufVar, "sfg");
        this.f36076a = zo6Var;
        this.f36077b = fufVar;
    }

    /* renamed from: a */
    public final zo6 m39758a() {
        return this.f36076a;
    }

    /* renamed from: b */
    public final fuf m39759b() {
        return this.f36077b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mxe)) {
            return false;
        }
        mxe mxeVar = (mxe) obj;
        return sq8.m48644c(this.f36076a, mxeVar.f36076a) && sq8.m48644c(this.f36077b, mxeVar.f36077b);
    }

    public int hashCode() {
        return (this.f36076a.hashCode() * 31) + this.f36077b.hashCode();
    }

    public String toString() {
        return "S3ExpressCredentialsCacheValue(expiringCredentials=" + this.f36076a + ", sfg=" + this.f36077b + ')';
    }

    public /* synthetic */ mxe(zo6 zo6Var, fuf fufVar, int i, id5 id5Var) {
        this(zo6Var, (i & 2) != 0 ? new fuf() : fufVar);
    }
}
