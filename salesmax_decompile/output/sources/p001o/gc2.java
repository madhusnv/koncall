package p001o;

/* loaded from: classes3.dex */
public final class gc2 {

    /* renamed from: a */
    public final z38 f24906a;

    /* renamed from: b */
    public final String f24907b;

    /* renamed from: c */
    public final String f24908c;

    /* renamed from: d */
    public final String f24909d;

    public gc2(z38 z38Var, String str, String str2, String str3) {
        sq8.m48649h(z38Var, "request");
        sq8.m48649h(str, "requestString");
        sq8.m48649h(str2, "signedHeaders");
        sq8.m48649h(str3, "hash");
        this.f24906a = z38Var;
        this.f24907b = str;
        this.f24908c = str2;
        this.f24909d = str3;
    }

    /* renamed from: a */
    public final z38 m28387a() {
        return this.f24906a;
    }

    /* renamed from: b */
    public final String m28388b() {
        return this.f24907b;
    }

    /* renamed from: c */
    public final String m28389c() {
        return this.f24908c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gc2)) {
            return false;
        }
        gc2 gc2Var = (gc2) obj;
        return sq8.m48644c(this.f24906a, gc2Var.f24906a) && sq8.m48644c(this.f24907b, gc2Var.f24907b) && sq8.m48644c(this.f24908c, gc2Var.f24908c) && sq8.m48644c(this.f24909d, gc2Var.f24909d);
    }

    public int hashCode() {
        return (((((this.f24906a.hashCode() * 31) + this.f24907b.hashCode()) * 31) + this.f24908c.hashCode()) * 31) + this.f24909d.hashCode();
    }

    public String toString() {
        return "CanonicalRequest(request=" + this.f24906a + ", requestString=" + this.f24907b + ", signedHeaders=" + this.f24908c + ", hash=" + this.f24909d + ')';
    }
}
