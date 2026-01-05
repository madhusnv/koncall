package p001o;

import org.apache.http.HttpHeaders;
import p001o.aff;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class pm3 {
    /* renamed from: a */
    public static final void m43868a(tff tffVar, om3 om3Var) {
        sq8.m48649h(tffVar, "serializer");
        sq8.m48649h(om3Var, "input");
        aff.C12163j c12163j = aff.C12163j.f14622a;
        h7f h7fVar = new h7f(c12163j, new mej("ChecksumCRC32"));
        h7f h7fVar2 = new h7f(c12163j, new mej("ChecksumCRC32C"));
        h7f h7fVar3 = new h7f(c12163j, new mej("ChecksumSHA1"));
        h7f h7fVar4 = new h7f(c12163j, new mej("ChecksumSHA256"));
        h7f h7fVar5 = new h7f(c12163j, new mej(HttpHeaders.ETAG));
        h7f h7fVar6 = new h7f(aff.C12159f.f14618a, new mej("PartNumber"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49542e(new mej("CompletedPart"));
        c17016a.m49542e(new kej("http://s3.amazonaws.com/doc/2006-03-01/", null, 2, null));
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        c17016a.m49539b(h7fVar3);
        c17016a.m49539b(h7fVar4);
        c17016a.m49539b(h7fVar5);
        c17016a.m49539b(h7fVar6);
        l9g l9gVarMo41871h = tffVar.mo41871h(c17016a.m49538a());
        String strM42407a = om3Var.m42407a();
        if (strM42407a != null) {
            l9gVarMo41871h.mo26541g(h7fVar, strM42407a);
        }
        String strM42408b = om3Var.m42408b();
        if (strM42408b != null) {
            l9gVarMo41871h.mo26541g(h7fVar2, strM42408b);
        }
        String strM42409c = om3Var.m42409c();
        if (strM42409c != null) {
            l9gVarMo41871h.mo26541g(h7fVar3, strM42409c);
        }
        String strM42410d = om3Var.m42410d();
        if (strM42410d != null) {
            l9gVarMo41871h.mo26541g(h7fVar4, strM42410d);
        }
        String strM42411e = om3Var.m42411e();
        if (strM42411e != null) {
            l9gVarMo41871h.mo26541g(h7fVar5, strM42411e);
        }
        Integer numM42412f = om3Var.m42412f();
        if (numM42412f != null) {
            l9gVarMo41871h.mo26546q(h7fVar6, numM42412f.intValue());
        }
        l9gVarMo41871h.mo26543j();
    }
}
