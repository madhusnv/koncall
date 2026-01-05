package p001o;

import org.apache.http.message.TokenParser;

/* loaded from: classes3.dex */
public final class oe5 implements g48 {

    /* renamed from: a */
    public final s48 f38208a;

    /* renamed from: b */
    public final ux7 f38209b;

    /* renamed from: c */
    public final m18 f38210c;

    /* renamed from: d */
    public final String f38211d;

    public oe5(s48 s48Var, ux7 ux7Var, m18 m18Var) {
        sq8.m48649h(s48Var, "status");
        sq8.m48649h(ux7Var, "headers");
        sq8.m48649h(m18Var, "body");
        this.f38208a = s48Var;
        this.f38209b = ux7Var;
        this.f38210c = m18Var;
        this.f38211d = "HTTP " + getStatus().h0() + TokenParser.SP + getStatus().g0();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oe5)) {
            return false;
        }
        oe5 oe5Var = (oe5) obj;
        return sq8.m48644c(this.f38208a, oe5Var.f38208a) && sq8.m48644c(this.f38209b, oe5Var.f38209b) && sq8.m48644c(this.f38210c, oe5Var.f38210c);
    }

    @Override // p001o.g48
    public m18 getBody() {
        return this.f38210c;
    }

    @Override // p001o.g48
    public ux7 getHeaders() {
        return this.f38209b;
    }

    @Override // p001o.g48
    public s48 getStatus() {
        return this.f38208a;
    }

    @Override // p001o.d2e
    public String getSummary() {
        return this.f38211d;
    }

    public int hashCode() {
        return (((this.f38208a.hashCode() * 31) + this.f38209b.hashCode()) * 31) + this.f38210c.hashCode();
    }

    public String toString() {
        return "DefaultHttpResponse(status=" + this.f38208a + ", headers=" + this.f38209b + ", body=" + this.f38210c + ')';
    }
}
