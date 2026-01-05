package p001o;

import com.amplifyframework.datastore.generated.model.AccountMembership;
import p001o.f64;

/* loaded from: classes.dex */
public final class ho1 {

    /* renamed from: a */
    public final String f27239a = "business-context-listener";

    /* renamed from: a */
    public void m30871a(AccountMembership accountMembership) {
        sq8.m48649h(accountMembership, "accountMembership");
        f64.C13345a c13345a = f64.f22783a;
        f64 f64VarM26204a = c13345a.m26204a();
        f64.EnumC13346b enumC13346b = f64.EnumC13346b.BUSINESS;
        ub1 ub1VarM26202c = f64VarM26204a.m26202c(enumC13346b);
        co1 co1Var = ub1VarM26202c instanceof co1 ? (co1) ub1VarM26202c : null;
        if (co1Var != null) {
            co1.m21499s(co1Var, null, 1, null);
        }
        ub1 ub1VarM26202c2 = c13345a.m26204a().m26202c(enumC13346b);
        co1 co1Var2 = ub1VarM26202c2 instanceof co1 ? (co1) ub1VarM26202c2 : null;
        uia.m51627b(uia.f48971a, this.f27239a, "Business context after update: " + co1Var2, null, null, 12, null);
    }

    /* renamed from: b */
    public void m30872b(String str) {
        sq8.m48649h(str, "business");
        f64.C13345a c13345a = f64.f22783a;
        f64 f64VarM26204a = c13345a.m26204a();
        f64.EnumC13346b enumC13346b = f64.EnumC13346b.BUSINESS;
        ub1 ub1VarM26202c = f64VarM26204a.m26202c(enumC13346b);
        co1 co1Var = ub1VarM26202c instanceof co1 ? (co1) ub1VarM26202c : null;
        if (co1Var != null) {
            co1Var.m21506r(str);
        }
        ub1 ub1VarM26202c2 = c13345a.m26204a().m26202c(enumC13346b);
        co1 co1Var2 = ub1VarM26202c2 instanceof co1 ? (co1) ub1VarM26202c2 : null;
        uia.m51627b(uia.f48971a, this.f27239a, "Business context after update: " + co1Var2, null, null, 12, null);
    }
}
