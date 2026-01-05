package p001o;

import java.util.Set;

/* loaded from: classes3.dex */
public abstract class po1 {

    /* renamed from: a */
    public static final kx0 f40320a = new kx0("aws.smithy.kotlin#BusinessMetrics");

    /* renamed from: b */
    public static final kx0 f40321b = new kx0("aws.smithy.kotlin#AccountIdBasedEndpointAccountId");

    /* renamed from: c */
    public static final kx0 f40322c = new kx0("aws.smithy.kotlin#ServiceEndpointOverride");

    /* renamed from: a */
    public static final boolean m43952a(jl6 jl6Var, lo1 lo1Var) {
        sq8.m48649h(jl6Var, "<this>");
        sq8.m48649h(lo1Var, "metric");
        tob tobVarM34001d = jl6Var.m34001d();
        kx0 kx0Var = f40320a;
        return tobVarM34001d.mo18192c(kx0Var) && ((Set) tx0.m50737b(jl6Var.m34001d(), kx0Var)).contains(lo1Var);
    }

    /* renamed from: b */
    public static final void m43953b(jl6 jl6Var, lo1 lo1Var) {
        sq8.m48649h(jl6Var, "<this>");
        sq8.m48649h(lo1Var, "metric");
        tob tobVarM34001d = jl6Var.m34001d();
        kx0 kx0Var = f40320a;
        if (tobVarM34001d.mo18192c(kx0Var)) {
            ((Set) tx0.m50737b(jl6Var.m34001d(), kx0Var)).add(lo1Var);
        } else {
            jl6Var.m34001d().mo34002p(kx0Var, nif.m40666g(lo1Var));
        }
    }

    /* renamed from: c */
    public static final kx0 m43954c() {
        return f40321b;
    }

    /* renamed from: d */
    public static final kx0 m43955d() {
        return f40320a;
    }

    /* renamed from: e */
    public static final kx0 m43956e() {
        return f40322c;
    }

    /* renamed from: f */
    public static final void m43957f(jl6 jl6Var, lo1 lo1Var) {
        sq8.m48649h(jl6Var, "<this>");
        sq8.m48649h(lo1Var, "metric");
        tob tobVarM34001d = jl6Var.m34001d();
        kx0 kx0Var = f40320a;
        if (tobVarM34001d.mo18192c(kx0Var)) {
            ((Set) tx0.m50737b(jl6Var.m34001d(), kx0Var)).remove(lo1Var);
        }
    }
}
