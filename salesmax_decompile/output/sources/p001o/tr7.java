package p001o;

import java.util.Map;
import p001o.aff;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class tr7 {

    /* renamed from: o.tr7$a */
    public static final class C17192a implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ ur7 f47651a;

        public C17192a(ur7 ur7Var) {
            this.f47651a = ur7Var;
        }

        /* renamed from: a */
        public final void m50412a(yra yraVar) {
            sq8.m48649h(yraVar, "$this$mapField");
            for (Map.Entry entry : this.f47651a.m51953c().entrySet()) {
                yraVar.mo33675k((String) entry.getKey(), (String) entry.getValue());
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m50412a((yra) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: b */
    public static final byte[] m50411b(jl6 jl6Var, ur7 ur7Var) {
        oa9 oa9Var = new oa9();
        aff.C12163j c12163j = aff.C12163j.f14622a;
        h7f h7fVar = new h7f(c12163j, new na9("AccessToken"));
        h7f h7fVar2 = new h7f(c12163j, new na9("AttributeName"));
        h7f h7fVar3 = new h7f(aff.C12162i.f14621a, new na9("ClientMetadata"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        c17016a.m49539b(h7fVar3);
        l9g l9gVarMo41871h = oa9Var.mo41871h(c17016a.m49538a());
        String strM51951a = ur7Var.m51951a();
        if (strM51951a != null) {
            l9gVarMo41871h.mo26541g(h7fVar, strM51951a);
        }
        String strM51952b = ur7Var.m51952b();
        if (strM51952b != null) {
            l9gVarMo41871h.mo26541g(h7fVar2, strM51952b);
        }
        if (ur7Var.m51953c() != null) {
            l9gVarMo41871h.mo26547r(h7fVar3, new C17192a(ur7Var));
        }
        l9gVarMo41871h.mo26543j();
        return oa9Var.mo41870a();
    }
}
