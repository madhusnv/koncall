package p001o;

import org.apache.http.protocol.HTTP;

/* loaded from: classes3.dex */
public final class srf {

    /* renamed from: a */
    public final z38 f45845a;

    /* renamed from: b */
    public final ib8 f45846b;

    /* renamed from: c */
    public final qx0 f45847c;

    public srf(z38 z38Var, ib8 ib8Var, qx0 qx0Var) {
        sq8.m48649h(z38Var, "httpRequest");
        sq8.m48649h(ib8Var, HTTP.IDENTITY_CODING);
        sq8.m48649h(qx0Var, "signingAttributes");
        this.f45845a = z38Var;
        this.f45846b = ib8Var;
        this.f45847c = qx0Var;
    }

    /* renamed from: b */
    public static /* synthetic */ srf m48818b(srf srfVar, z38 z38Var, ib8 ib8Var, qx0 qx0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            z38Var = srfVar.f45845a;
        }
        if ((i & 2) != 0) {
            ib8Var = srfVar.f45846b;
        }
        if ((i & 4) != 0) {
            qx0Var = srfVar.f45847c;
        }
        return srfVar.m48819a(z38Var, ib8Var, qx0Var);
    }

    /* renamed from: a */
    public final srf m48819a(z38 z38Var, ib8 ib8Var, qx0 qx0Var) {
        sq8.m48649h(z38Var, "httpRequest");
        sq8.m48649h(ib8Var, HTTP.IDENTITY_CODING);
        sq8.m48649h(qx0Var, "signingAttributes");
        return new srf(z38Var, ib8Var, qx0Var);
    }

    /* renamed from: c */
    public final z38 m48820c() {
        return this.f45845a;
    }

    /* renamed from: d */
    public final ib8 m48821d() {
        return this.f45846b;
    }

    /* renamed from: e */
    public final qx0 m48822e() {
        return this.f45847c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof srf)) {
            return false;
        }
        srf srfVar = (srf) obj;
        return sq8.m48644c(this.f45845a, srfVar.f45845a) && sq8.m48644c(this.f45846b, srfVar.f45846b) && sq8.m48644c(this.f45847c, srfVar.f45847c);
    }

    public int hashCode() {
        return (((this.f45845a.hashCode() * 31) + this.f45846b.hashCode()) * 31) + this.f45847c.hashCode();
    }

    public String toString() {
        return "SignHttpRequest(httpRequest=" + this.f45845a + ", identity=" + this.f45846b + ", signingAttributes=" + this.f45847c + ')';
    }
}
