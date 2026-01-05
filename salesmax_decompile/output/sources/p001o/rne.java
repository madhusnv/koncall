package p001o;

import org.apache.http.protocol.HTTP;

/* loaded from: classes3.dex */
public final class rne {

    /* renamed from: a */
    public final jl6 f43863a;

    /* renamed from: b */
    public final y38 f43864b;

    /* renamed from: c */
    public final ib8 f43865c;

    public rne(jl6 jl6Var, y38 y38Var, ib8 ib8Var) {
        sq8.m48649h(jl6Var, "context");
        sq8.m48649h(y38Var, "httpRequest");
        sq8.m48649h(ib8Var, HTTP.IDENTITY_CODING);
        this.f43863a = jl6Var;
        this.f43864b = y38Var;
        this.f43865c = ib8Var;
    }

    /* renamed from: a */
    public final jl6 m47005a() {
        return this.f43863a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rne)) {
            return false;
        }
        rne rneVar = (rne) obj;
        return sq8.m48644c(this.f43863a, rneVar.f43863a) && sq8.m48644c(this.f43864b, rneVar.f43864b) && sq8.m48644c(this.f43865c, rneVar.f43865c);
    }

    public int hashCode() {
        return (((this.f43863a.hashCode() * 31) + this.f43864b.hashCode()) * 31) + this.f43865c.hashCode();
    }

    public String toString() {
        return "ResolveEndpointRequest(context=" + this.f43863a + ", httpRequest=" + this.f43864b + ", identity=" + this.f43865c + ')';
    }
}
