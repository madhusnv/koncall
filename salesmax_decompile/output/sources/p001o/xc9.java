package p001o;

import java.security.GeneralSecurityException;
import p001o.md9;

/* loaded from: classes4.dex */
public class xc9 implements wc9 {

    /* renamed from: a */
    public final md9 f53501a;

    /* renamed from: b */
    public final Class f53502b;

    /* renamed from: o.xc9$a */
    public static class C18112a {

        /* renamed from: a */
        public final md9.AbstractC15284a f53503a;

        public C18112a(md9.AbstractC15284a abstractC15284a) {
            this.f53503a = abstractC15284a;
        }

        /* renamed from: a */
        public rcb m55977a(yq1 yq1Var) {
            return m55978b(this.f53503a.mo20434c(yq1Var));
        }

        /* renamed from: b */
        public final rcb m55978b(rcb rcbVar) {
            this.f53503a.mo20435d(rcbVar);
            return (rcb) this.f53503a.mo20433a(rcbVar);
        }
    }

    public xc9(md9 md9Var, Class cls) {
        if (!md9Var.m38757h().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", md9Var.toString(), cls.getName()));
        }
        this.f53501a = md9Var;
        this.f53502b = cls;
    }

    @Override // p001o.wc9
    /* renamed from: a */
    public final boolean mo54211a(String str) {
        return str.equals(m55974e());
    }

    @Override // p001o.wc9
    /* renamed from: b */
    public final Object mo54212b(yq1 yq1Var) throws GeneralSecurityException {
        try {
            return m55976g(this.f53501a.mo20425g(yq1Var));
        } catch (bt8 e) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.f53501a.m38755b().getName(), e);
        }
    }

    @Override // p001o.wc9
    /* renamed from: c */
    public final rcb mo54213c(yq1 yq1Var) throws GeneralSecurityException {
        try {
            return m55975f().m55977a(yq1Var);
        } catch (bt8 e) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.f53501a.mo20423e().m38758b().getName(), e);
        }
    }

    @Override // p001o.wc9
    /* renamed from: d */
    public final nc9 mo54214d(yq1 yq1Var) throws GeneralSecurityException {
        try {
            return (nc9) nc9.m40320N().m40328u(m55974e()).m40329v(m55975f().m55977a(yq1Var).mo44941b()).m40327t(this.f53501a.mo20424f()).m53060i();
        } catch (bt8 e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    /* renamed from: e */
    public final String m55974e() {
        return this.f53501a.mo20422c();
    }

    /* renamed from: f */
    public final C18112a m55975f() {
        return new C18112a(this.f53501a.mo20423e());
    }

    /* renamed from: g */
    public final Object m55976g(rcb rcbVar) throws GeneralSecurityException {
        if (Void.class.equals(this.f53502b)) {
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        }
        this.f53501a.mo20426i(rcbVar);
        return this.f53501a.m38756d(rcbVar, this.f53502b);
    }
}
