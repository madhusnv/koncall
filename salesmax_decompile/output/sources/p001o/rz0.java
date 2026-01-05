package p001o;

import p001o.f64;

/* loaded from: classes.dex */
public final class rz0 implements a58 {

    /* renamed from: a */
    public final String f44270a = "auth-context-listener";

    @Override // p001o.a58
    /* renamed from: a */
    public void mo16434a() {
        f64.C13345a c13345a = f64.f22783a;
        f64 f64VarM26204a = c13345a.m26204a();
        f64.EnumC13346b enumC13346b = f64.EnumC13346b.USER;
        f64VarM26204a.m26201b(enumC13346b);
        ub1 ub1VarM26202c = c13345a.m26204a().m26202c(enumC13346b);
        vci vciVar = ub1VarM26202c instanceof vci ? (vci) ub1VarM26202c : null;
        uia uiaVar = uia.f48971a;
        uia.m51627b(uiaVar, this.f44270a, "User context initialized: " + vciVar, null, null, 12, null);
        f64 f64VarM26204a2 = c13345a.m26204a();
        f64.EnumC13346b enumC13346b2 = f64.EnumC13346b.BUSINESS;
        f64VarM26204a2.m26201b(enumC13346b2);
        ub1 ub1VarM26202c2 = c13345a.m26204a().m26202c(enumC13346b2);
        co1 co1Var = ub1VarM26202c2 instanceof co1 ? (co1) ub1VarM26202c2 : null;
        uia.m51627b(uiaVar, this.f44270a, "Business context initialized: " + co1Var, null, null, 12, null);
    }

    @Override // p001o.a58
    /* renamed from: b */
    public void mo16435b() {
        f64.C13345a c13345a = f64.f22783a;
        f64 f64VarM26204a = c13345a.m26204a();
        f64.EnumC13346b enumC13346b = f64.EnumC13346b.USER;
        f64.m26200e(f64VarM26204a, enumC13346b, null, 2, null);
        ub1 ub1VarM26202c = c13345a.m26204a().m26202c(enumC13346b);
        vci vciVar = ub1VarM26202c instanceof vci ? (vci) ub1VarM26202c : null;
        uia uiaVar = uia.f48971a;
        uia.m51627b(uiaVar, this.f44270a, "User context initialized: " + vciVar, null, null, 12, null);
        f64 f64VarM26204a2 = c13345a.m26204a();
        f64.EnumC13346b enumC13346b2 = f64.EnumC13346b.BUSINESS;
        f64.m26200e(f64VarM26204a2, enumC13346b2, null, 2, null);
        ub1 ub1VarM26202c2 = c13345a.m26204a().m26202c(enumC13346b2);
        co1 co1Var = ub1VarM26202c2 instanceof co1 ? (co1) ub1VarM26202c2 : null;
        uia.m51627b(uiaVar, this.f44270a, "Business context initialized: " + co1Var, null, null, 12, null);
    }
}
