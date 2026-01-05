package p001o;

import java.security.GeneralSecurityException;

/* loaded from: classes4.dex */
public final class yd9 {

    /* renamed from: a */
    public final xd9 f55306a;

    public yd9(xd9 xd9Var) {
        this.f55306a = xd9Var;
    }

    /* renamed from: a */
    public static void m57629a(s76 s76Var) throws GeneralSecurityException {
        if (s76Var == null || s76Var.m47939I().size() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    /* renamed from: b */
    public static void m57630b(xd9 xd9Var) throws GeneralSecurityException {
        if (xd9Var == null || xd9Var.m56053L() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    /* renamed from: c */
    public static xd9 m57631c(s76 s76Var, p70 p70Var) throws GeneralSecurityException {
        try {
            xd9 xd9VarM56049P = xd9.m56049P(p70Var.mo24515b(s76Var.m47939I().m58086E(), new byte[0]), pp6.m44004b());
            m57630b(xd9VarM56049P);
            return xd9VarM56049P;
        } catch (bt8 unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    /* renamed from: d */
    public static s76 m57632d(xd9 xd9Var, p70 p70Var) throws GeneralSecurityException {
        byte[] bArrMo24514a = p70Var.mo24514a(xd9Var.mo44940a(), new byte[0]);
        try {
            if (xd9.m56049P(p70Var.mo24515b(bArrMo24514a, new byte[0]), pp6.m44004b()).equals(xd9Var)) {
                return (s76) s76.m47937J().m47942t(yq1.m58080j(bArrMo24514a)).m47943u(wqi.m54885b(xd9Var)).m53060i();
            }
            throw new GeneralSecurityException("cannot encrypt keyset");
        } catch (bt8 unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    /* renamed from: e */
    public static final yd9 m57633e(xd9 xd9Var) throws GeneralSecurityException {
        m57630b(xd9Var);
        return new yd9(xd9Var);
    }

    /* renamed from: j */
    public static final yd9 m57634j(be9 be9Var, p70 p70Var) throws GeneralSecurityException {
        s76 s76VarMo18790a = be9Var.mo18790a();
        m57629a(s76VarMo18790a);
        return new yd9(m57631c(s76VarMo18790a, p70Var));
    }

    /* renamed from: f */
    public xd9 m57635f() {
        return this.f55306a;
    }

    /* renamed from: g */
    public zd9 m57636g() {
        return wqi.m54885b(this.f55306a);
    }

    /* renamed from: h */
    public Object m57637h(Class cls) throws GeneralSecurityException {
        Class clsM21267e = che.m21267e(cls);
        if (clsM21267e != null) {
            return m57638i(cls, clsM21267e);
        }
        throw new GeneralSecurityException("No wrapper found for " + cls.getName());
    }

    /* renamed from: i */
    public final Object m57638i(Class cls, Class cls2) {
        return che.m21282t(che.m21273k(this, cls2), cls);
    }

    /* renamed from: k */
    public void m57639k(ce9 ce9Var, p70 p70Var) {
        ce9Var.mo21065b(m57632d(this.f55306a, p70Var));
    }

    public String toString() {
        return m57636g().toString();
    }
}
