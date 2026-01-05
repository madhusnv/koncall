package p001o;

/* loaded from: classes3.dex */
public abstract class wk5 {
    /* renamed from: b */
    public static final Void m54662b(jl6 jl6Var, o18 o18Var, byte[] bArr) throws Throwable {
        g48 g48VarM31020b = hre.m31020b(o18Var.m41347f(), bArr);
        o18 o18VarM41344c = o18.m41344c(o18Var, null, g48VarM31020b, 1, null);
        try {
            ij6 ij6VarM32630a = ire.f29157a.m32630a(o18Var.m41347f().getHeaders(), bArr);
            String strMo18271a = ij6VarM32630a.mo18271a();
            Throwable thMo16296b = !sq8.m48644c(strMo18271a, "ServiceFailureException") ? sq8.m48644c(strMo18271a, "LexiconNotFoundException") ? new gca().mo16296b(jl6Var, o18VarM41344c, bArr) : new pdd(ij6VarM32630a.getMessage()) : new jgf().mo16296b(jl6Var, o18VarM41344c, bArr);
            b2e.m18117a(thMo16296b, g48VarM31020b, ij6VarM32630a);
            throw thMo16296b;
        } catch (Exception e) {
            pdd pddVar = new pdd("Failed to parse response as 'restJson1' error", e);
            b2e.m18117a(pddVar, o18VarM41344c.m41347f(), null);
            throw pddVar;
        }
    }
}
