package p001o;

import p001o.aff;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class eti {
    /* renamed from: b */
    public static final byte[] m25607b(jl6 jl6Var, fti ftiVar) {
        oa9 oa9Var = new oa9();
        aff.C12163j c12163j = aff.C12163j.f14622a;
        h7f h7fVar = new h7f(c12163j, new na9("AccessToken"));
        h7f h7fVar2 = new h7f(c12163j, new na9("FriendlyDeviceName"));
        h7f h7fVar3 = new h7f(c12163j, new na9("Session"));
        h7f h7fVar4 = new h7f(c12163j, new na9("UserCode"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        c17016a.m49539b(h7fVar3);
        c17016a.m49539b(h7fVar4);
        l9g l9gVarMo41871h = oa9Var.mo41871h(c17016a.m49538a());
        String strM27473a = ftiVar.m27473a();
        if (strM27473a != null) {
            l9gVarMo41871h.mo26541g(h7fVar, strM27473a);
        }
        String strM27474b = ftiVar.m27474b();
        if (strM27474b != null) {
            l9gVarMo41871h.mo26541g(h7fVar2, strM27474b);
        }
        String strM27475c = ftiVar.m27475c();
        if (strM27475c != null) {
            l9gVarMo41871h.mo26541g(h7fVar3, strM27475c);
        }
        String strM27476d = ftiVar.m27476d();
        if (strM27476d != null) {
            l9gVarMo41871h.mo26541g(h7fVar4, strM27476d);
        }
        l9gVarMo41871h.mo26543j();
        return oa9Var.mo41870a();
    }
}
