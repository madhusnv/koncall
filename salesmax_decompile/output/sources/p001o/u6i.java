package p001o;

import java.util.Iterator;
import java.util.Map;
import p001o.aff;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class u6i {

    /* renamed from: o.u6i$a */
    public static final class C17308a implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ v6i f48435a;

        public C17308a(v6i v6iVar) {
            this.f48435a = v6iVar;
        }

        /* renamed from: a */
        public final void m51056a(yra yraVar) {
            sq8.m48649h(yraVar, "$this$mapField");
            for (Map.Entry entry : this.f48435a.m52364b().entrySet()) {
                yraVar.mo33675k((String) entry.getKey(), (String) entry.getValue());
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m51056a((yra) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.u6i$b */
    public static final class C17309b implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ v6i f48436a;

        /* renamed from: o.u6i$b$a */
        public /* synthetic */ class a extends dm7 implements nl7 {

            /* renamed from: a */
            public static final a f48437a = new a();

            public a() {
                super(2, nx0.class, "serializeAttributeTypeDocument", "serializeAttributeTypeDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/cognitoidentityprovider/model/AttributeType;)V", 1);
            }

            /* renamed from: b */
            public final void m51058b(tff tffVar, lx0 lx0Var) {
                sq8.m48649h(tffVar, "p0");
                sq8.m48649h(lx0Var, "p1");
                nx0.m41202a(tffVar, lx0Var);
            }

            @Override // p001o.nl7
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                m51058b((tff) obj, (lx0) obj2);
                return y3i.f54824a;
            }
        }

        public C17309b(v6i v6iVar) {
            this.f48436a = v6iVar;
        }

        /* renamed from: a */
        public final void m51057a(gfa gfaVar) {
            sq8.m48649h(gfaVar, "$this$listField");
            Iterator it = this.f48436a.m52365c().iterator();
            while (it.hasNext()) {
                gfaVar.mo21109e(d8f.m22608a((lx0) it.next(), a.f48437a));
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m51057a((gfa) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: b */
    public static final byte[] m51055b(jl6 jl6Var, v6i v6iVar) {
        oa9 oa9Var = new oa9();
        h7f h7fVar = new h7f(aff.C12163j.f14622a, new na9("AccessToken"));
        h7f h7fVar2 = new h7f(aff.C12162i.f14621a, new na9("ClientMetadata"));
        h7f h7fVar3 = new h7f(aff.C12160g.f14619a, new na9("UserAttributes"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        c17016a.m49539b(h7fVar3);
        l9g l9gVarMo41871h = oa9Var.mo41871h(c17016a.m49538a());
        String strM52363a = v6iVar.m52363a();
        if (strM52363a != null) {
            l9gVarMo41871h.mo26541g(h7fVar, strM52363a);
        }
        if (v6iVar.m52364b() != null) {
            l9gVarMo41871h.mo26547r(h7fVar2, new C17308a(v6iVar));
        }
        if (v6iVar.m52365c() != null) {
            l9gVarMo41871h.mo26540c(h7fVar3, new C17309b(v6iVar));
        }
        l9gVarMo41871h.mo26543j();
        return oa9Var.mo41870a();
    }
}
