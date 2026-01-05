package p001o;

/* loaded from: classes3.dex */
public final class kxe {

    /* renamed from: a */
    public final String f32796a;

    /* renamed from: b */
    public final ic4 f32797b;

    public kxe(String str, ic4 ic4Var) {
        sq8.m48649h(str, "bucket");
        sq8.m48649h(ic4Var, "baseCredentials");
        this.f32796a = str;
        this.f32797b = ic4Var;
    }

    /* renamed from: a */
    public final String m36294a() {
        return this.f32796a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kxe)) {
            return false;
        }
        kxe kxeVar = (kxe) obj;
        return sq8.m48644c(this.f32796a, kxeVar.f32796a) && sq8.m48644c(this.f32797b, kxeVar.f32797b);
    }

    public int hashCode() {
        return (this.f32796a.hashCode() * 31) + this.f32797b.hashCode();
    }

    public String toString() {
        return "S3ExpressCredentialsCacheKey(bucket=" + this.f32796a + ", baseCredentials=" + this.f32797b + ')';
    }
}
