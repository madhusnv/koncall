package p001o;

import java.util.Iterator;
import p001o.aff;
import p001o.t7f;

/* loaded from: classes2.dex */
public abstract class ra4 {

    /* renamed from: o.ra4$a */
    public static final class C16580a implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ sa4 f43310a;

        public C16580a(sa4 sa4Var) {
            this.f43310a = sa4Var;
        }

        /* renamed from: a */
        public final void m46474a(gfa gfaVar) {
            sq8.m48649h(gfaVar, "$this$listField");
            Iterator it = this.f43310a.m48078i().iterator();
            while (it.hasNext()) {
                gfaVar.mo21108d((String) it.next());
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m46474a((gfa) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: b */
    public static final byte[] m46473b(jl6 jl6Var, sa4 sa4Var) {
        oa9 oa9Var = new oa9();
        aff.C12163j c12163j = aff.C12163j.f14622a;
        h7f h7fVar = new h7f(c12163j, new na9("clientId"));
        h7f h7fVar2 = new h7f(c12163j, new na9("clientSecret"));
        h7f h7fVar3 = new h7f(c12163j, new na9("code"));
        h7f h7fVar4 = new h7f(c12163j, new na9("codeVerifier"));
        h7f h7fVar5 = new h7f(c12163j, new na9("deviceCode"));
        h7f h7fVar6 = new h7f(c12163j, new na9("grantType"));
        h7f h7fVar7 = new h7f(c12163j, new na9("redirectUri"));
        h7f h7fVar8 = new h7f(c12163j, new na9("refreshToken"));
        h7f h7fVar9 = new h7f(aff.C12160g.f14619a, new na9("scope"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        c17016a.m49539b(h7fVar3);
        c17016a.m49539b(h7fVar4);
        c17016a.m49539b(h7fVar5);
        c17016a.m49539b(h7fVar6);
        c17016a.m49539b(h7fVar7);
        c17016a.m49539b(h7fVar8);
        c17016a.m49539b(h7fVar9);
        l9g l9gVarMo41871h = oa9Var.mo41871h(c17016a.m49538a());
        String strM48070a = sa4Var.m48070a();
        if (strM48070a != null) {
            l9gVarMo41871h.mo26541g(h7fVar, strM48070a);
        }
        String strM48071b = sa4Var.m48071b();
        if (strM48071b != null) {
            l9gVarMo41871h.mo26541g(h7fVar2, strM48071b);
        }
        String strM48072c = sa4Var.m48072c();
        if (strM48072c != null) {
            l9gVarMo41871h.mo26541g(h7fVar3, strM48072c);
        }
        String strM48073d = sa4Var.m48073d();
        if (strM48073d != null) {
            l9gVarMo41871h.mo26541g(h7fVar4, strM48073d);
        }
        String strM48074e = sa4Var.m48074e();
        if (strM48074e != null) {
            l9gVarMo41871h.mo26541g(h7fVar5, strM48074e);
        }
        String strM48075f = sa4Var.m48075f();
        if (strM48075f != null) {
            l9gVarMo41871h.mo26541g(h7fVar6, strM48075f);
        }
        String strM48076g = sa4Var.m48076g();
        if (strM48076g != null) {
            l9gVarMo41871h.mo26541g(h7fVar7, strM48076g);
        }
        String strM48077h = sa4Var.m48077h();
        if (strM48077h != null) {
            l9gVarMo41871h.mo26541g(h7fVar8, strM48077h);
        }
        if (sa4Var.m48078i() != null) {
            l9gVarMo41871h.mo26540c(h7fVar9, new C16580a(sa4Var));
        }
        l9gVarMo41871h.mo26543j();
        return oa9Var.mo41870a();
    }
}
