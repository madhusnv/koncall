package p001o;

import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import java.util.Iterator;
import p001o.aff;
import p001o.t7f;

/* loaded from: classes2.dex */
public abstract class pr0 {

    /* renamed from: o.pr0$a */
    public static final class C16163a implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ sr0 f40428a;

        /* renamed from: o.pr0$a$a */
        public /* synthetic */ class a extends dm7 implements nl7 {

            /* renamed from: a */
            public static final a f40429a = new a();

            public a() {
                super(2, gdd.class, "serializePolicyDescriptorTypeDocument", "serializePolicyDescriptorTypeDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/runtime/auth/credentials/internal/sts/model/PolicyDescriptorType;)V", 1);
            }

            /* renamed from: b */
            public final void m44064b(tff tffVar, fdd fddVar) {
                sq8.m48649h(tffVar, "p0");
                sq8.m48649h(fddVar, "p1");
                gdd.m28503a(tffVar, fddVar);
            }

            @Override // p001o.nl7
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                m44064b((tff) obj, (fdd) obj2);
                return y3i.f54824a;
            }
        }

        public C16163a(sr0 sr0Var) {
            this.f40428a = sr0Var;
        }

        /* renamed from: a */
        public final void m44063a(gfa gfaVar) {
            sq8.m48649h(gfaVar, "$this$listField");
            Iterator it = this.f40428a.m48751c().iterator();
            while (it.hasNext()) {
                gfaVar.mo21109e(d8f.m22608a((fdd) it.next(), a.f40429a));
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m44063a((gfa) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: b */
    public static final byte[] m44062b(jl6 jl6Var, sr0 sr0Var) {
        tff tffVarM59334a = ze7.m59334a();
        h7f h7fVar = new h7f(aff.C12159f.f14618a, new ue7("DurationSeconds"));
        aff.C12163j c12163j = aff.C12163j.f14622a;
        h7f h7fVar2 = new h7f(c12163j, new ue7("Policy"));
        h7f h7fVar3 = new h7f(aff.C12160g.f14619a, new ue7("PolicyArns"));
        h7f h7fVar4 = new h7f(c12163j, new ue7("ProviderId"));
        h7f h7fVar5 = new h7f(c12163j, new ue7("RoleArn"));
        h7f h7fVar6 = new h7f(c12163j, new ue7("RoleSessionName"));
        h7f h7fVar7 = new h7f(c12163j, new ue7("WebIdentityToken"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49542e(new ue7("AssumeRoleWithWebIdentityRequest"));
        c17016a.m49542e(new b5e(JsonDocumentFields.ACTION, "AssumeRoleWithWebIdentity"));
        c17016a.m49542e(new b5e(JsonDocumentFields.VERSION, "2011-06-15"));
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        c17016a.m49539b(h7fVar3);
        c17016a.m49539b(h7fVar4);
        c17016a.m49539b(h7fVar5);
        c17016a.m49539b(h7fVar6);
        c17016a.m49539b(h7fVar7);
        l9g l9gVarMo41871h = tffVarM59334a.mo41871h(c17016a.m49538a());
        Integer numM48749a = sr0Var.m48749a();
        if (numM48749a != null) {
            l9gVarMo41871h.mo26546q(h7fVar, numM48749a.intValue());
        }
        String strM48750b = sr0Var.m48750b();
        if (strM48750b != null) {
            l9gVarMo41871h.mo26541g(h7fVar2, strM48750b);
        }
        if (sr0Var.m48751c() != null) {
            l9gVarMo41871h.mo26540c(h7fVar3, new C16163a(sr0Var));
        }
        String strM48752d = sr0Var.m48752d();
        if (strM48752d != null) {
            l9gVarMo41871h.mo26541g(h7fVar4, strM48752d);
        }
        String strM48753e = sr0Var.m48753e();
        if (strM48753e != null) {
            l9gVarMo41871h.mo26541g(h7fVar5, strM48753e);
        }
        String strM48754f = sr0Var.m48754f();
        if (strM48754f != null) {
            l9gVarMo41871h.mo26541g(h7fVar6, strM48754f);
        }
        String strM48755g = sr0Var.m48755g();
        if (strM48755g != null) {
            l9gVarMo41871h.mo26541g(h7fVar7, strM48755g);
        }
        l9gVarMo41871h.mo26543j();
        return tffVarM59334a.mo41870a();
    }
}
