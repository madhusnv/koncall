package p001o;

/* loaded from: classes2.dex */
public abstract class nh9 {
    /* renamed from: a */
    public static final mfe m40598a(mh9 mh9Var) {
        mfe mfeVarM39059c;
        sq8.m48649h(mh9Var, "<this>");
        mh9 mh9VarMo39066z = mh9Var.mo39066z();
        return (mh9VarMo39066z == null || (mfeVarM39059c = mh9.m39059c(mh9VarMo39066z, mh9Var, false, 2, null)) == null) ? new mfe(0.0f, 0.0f, ml8.m39312e(mh9Var.mo39063i()), ml8.m39311d(mh9Var.mo39063i())) : mfeVarM39059c;
    }

    /* renamed from: b */
    public static final mfe m40599b(mh9 mh9Var) {
        sq8.m48649h(mh9Var, "<this>");
        return mh9.m39059c(m40601d(mh9Var), mh9Var, false, 2, null);
    }

    /* renamed from: c */
    public static final mfe m40600c(mh9 mh9Var) {
        sq8.m48649h(mh9Var, "<this>");
        mh9 mh9VarM40601d = m40601d(mh9Var);
        mfe mfeVarM40599b = m40599b(mh9Var);
        float fM39312e = ml8.m39312e(mh9VarM40601d.mo39063i());
        float fM39311d = ml8.m39311d(mh9VarM40601d.mo39063i());
        float fM18607j = bce.m18607j(mfeVarM40599b.m38945f(), 0.0f, fM39312e);
        float fM18607j2 = bce.m18607j(mfeVarM40599b.m38948i(), 0.0f, fM39311d);
        float fM18607j3 = bce.m18607j(mfeVarM40599b.m38946g(), 0.0f, fM39312e);
        float fM18607j4 = bce.m18607j(mfeVarM40599b.m38942c(), 0.0f, fM39311d);
        if (!(fM18607j == fM18607j3)) {
            if (!(fM18607j2 == fM18607j4)) {
                long jMo39065r = mh9VarM40601d.mo39065r(v9c.m52474a(fM18607j, fM18607j2));
                long jMo39065r2 = mh9VarM40601d.mo39065r(v9c.m52474a(fM18607j3, fM18607j2));
                long jMo39065r3 = mh9VarM40601d.mo39065r(v9c.m52474a(fM18607j3, fM18607j4));
                long jMo39065r4 = mh9VarM40601d.mo39065r(v9c.m52474a(fM18607j, fM18607j4));
                return new mfe(vk3.m52899k(s9c.m48052k(jMo39065r), s9c.m48052k(jMo39065r2), s9c.m48052k(jMo39065r4), s9c.m48052k(jMo39065r3)), vk3.m52899k(s9c.m48053l(jMo39065r), s9c.m48053l(jMo39065r2), s9c.m48053l(jMo39065r4), s9c.m48053l(jMo39065r3)), vk3.m52897i(s9c.m48052k(jMo39065r), s9c.m48052k(jMo39065r2), s9c.m48052k(jMo39065r4), s9c.m48052k(jMo39065r3)), vk3.m52897i(s9c.m48053l(jMo39065r), s9c.m48053l(jMo39065r2), s9c.m48053l(jMo39065r4), s9c.m48053l(jMo39065r3)));
            }
        }
        return mfe.f35356e.m38953a();
    }

    /* renamed from: d */
    public static final mh9 m40601d(mh9 mh9Var) {
        mh9 mh9Var2;
        sq8.m48649h(mh9Var, "<this>");
        mh9 mh9VarMo39066z = mh9Var.mo39066z();
        while (true) {
            mh9 mh9Var3 = mh9VarMo39066z;
            mh9Var2 = mh9Var;
            mh9Var = mh9Var3;
            if (mh9Var == null) {
                break;
            }
            mh9VarMo39066z = mh9Var.mo39066z();
        }
        xzb xzbVar = mh9Var2 instanceof xzb ? (xzb) mh9Var2 : null;
        if (xzbVar == null) {
            return mh9Var2;
        }
        xzb xzbVarR0 = xzbVar.R0();
        while (true) {
            xzb xzbVar2 = xzbVarR0;
            xzb xzbVar3 = xzbVar;
            xzbVar = xzbVar2;
            if (xzbVar == null) {
                return xzbVar3;
            }
            xzbVarR0 = xzbVar.R0();
        }
    }

    /* renamed from: e */
    public static final long m40602e(mh9 mh9Var) {
        sq8.m48649h(mh9Var, "<this>");
        return mh9Var.mo39061F(s9c.f45035b.m48063c());
    }
}
