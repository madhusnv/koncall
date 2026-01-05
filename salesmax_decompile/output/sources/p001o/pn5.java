package p001o;

import p001o.aff;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class pn5 {
    /* renamed from: b */
    public static final byte[] m43909b(jl6 jl6Var, qn5 qn5Var) {
        oa9 oa9Var = new oa9();
        h7f h7fVar = new h7f(aff.C12154a.f14613a, new na9("Bytes"));
        h7f h7fVar2 = new h7f(aff.C12164k.f14623a, new na9("DocumentReaderConfig"));
        aff.C12163j c12163j = aff.C12163j.f14622a;
        h7f h7fVar3 = new h7f(c12163j, new na9("EndpointArn"));
        h7f h7fVar4 = new h7f(aff.C12157d.f14616a, new na9("LanguageCode"));
        h7f h7fVar5 = new h7f(c12163j, new na9("Text"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        c17016a.m49539b(h7fVar3);
        c17016a.m49539b(h7fVar4);
        c17016a.m49539b(h7fVar5);
        l9g l9gVarMo41871h = oa9Var.mo41871h(c17016a.m49538a());
        byte[] bArrM45681a = qn5Var.m45681a();
        if (bArrM45681a != null) {
            l9gVarMo41871h.mo26541g(h7fVar, cb1.m20635c(bArrM45681a));
        }
        qn5Var.m45682b();
        String strM45683c = qn5Var.m45683c();
        if (strM45683c != null) {
            l9gVarMo41871h.mo26541g(h7fVar3, strM45683c);
        }
        sg9 sg9VarM45684d = qn5Var.m45684d();
        if (sg9VarM45684d != null) {
            l9gVarMo41871h.mo26541g(h7fVar4, sg9VarM45684d.mo48308a());
        }
        String strM45685e = qn5Var.m45685e();
        if (strM45685e != null) {
            l9gVarMo41871h.mo26541g(h7fVar5, strM45685e);
        }
        l9gVarMo41871h.mo26543j();
        return oa9Var.mo41870a();
    }
}
