package p001o;

import java.util.Map;
import p001o.aff;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class vi8 {

    /* renamed from: o.vi8$a */
    public /* synthetic */ class C17595a extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C17595a f50413a = new C17595a();

        public C17595a() {
            super(2, ic0.class, "serializeAnalyticsMetadataTypeDocument", "serializeAnalyticsMetadataTypeDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/cognitoidentityprovider/model/AnalyticsMetadataType;)V", 1);
        }

        /* renamed from: b */
        public final void m52855b(tff tffVar, hc0 hc0Var) {
            sq8.m48649h(tffVar, "p0");
            sq8.m48649h(hc0Var, "p1");
            ic0.m31895a(tffVar, hc0Var);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m52855b((tff) obj, (hc0) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.vi8$b */
    public static final class C17596b implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ wi8 f50414a;

        public C17596b(wi8 wi8Var) {
            this.f50414a = wi8Var;
        }

        /* renamed from: a */
        public final void m52856a(yra yraVar) {
            sq8.m48649h(yraVar, "$this$mapField");
            for (Map.Entry entry : this.f50414a.m54577c().entrySet()) {
                yraVar.mo33675k((String) entry.getKey(), (String) entry.getValue());
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m52856a((yra) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.vi8$c */
    public static final class C17597c implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ wi8 f50415a;

        public C17597c(wi8 wi8Var) {
            this.f50415a = wi8Var;
        }

        /* renamed from: a */
        public final void m52857a(yra yraVar) {
            sq8.m48649h(yraVar, "$this$mapField");
            for (Map.Entry entry : this.f50415a.m54579e().entrySet()) {
                yraVar.mo33675k((String) entry.getKey(), (String) entry.getValue());
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m52857a((yra) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.vi8$d */
    public /* synthetic */ class C17598d extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C17598d f50416a = new C17598d();

        public C17598d() {
            super(2, zci.class, "serializeUserContextDataTypeDocument", "serializeUserContextDataTypeDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/cognitoidentityprovider/model/UserContextDataType;)V", 1);
        }

        /* renamed from: b */
        public final void m52858b(tff tffVar, yci yciVar) {
            sq8.m48649h(tffVar, "p0");
            sq8.m48649h(yciVar, "p1");
            zci.m59214a(tffVar, yciVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m52858b((tff) obj, (yci) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: b */
    public static final byte[] m52854b(jl6 jl6Var, wi8 wi8Var) {
        oa9 oa9Var = new oa9();
        aff.C12164k c12164k = aff.C12164k.f14623a;
        h7f h7fVar = new h7f(c12164k, new na9("AnalyticsMetadata"));
        h7f h7fVar2 = new h7f(aff.C12157d.f14616a, new na9("AuthFlow"));
        aff.C12162i c12162i = aff.C12162i.f14621a;
        h7f h7fVar3 = new h7f(c12162i, new na9("AuthParameters"));
        aff.C12163j c12163j = aff.C12163j.f14622a;
        h7f h7fVar4 = new h7f(c12163j, new na9("ClientId"));
        h7f h7fVar5 = new h7f(c12162i, new na9("ClientMetadata"));
        h7f h7fVar6 = new h7f(c12163j, new na9("Session"));
        h7f h7fVar7 = new h7f(c12164k, new na9("UserContextData"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        c17016a.m49539b(h7fVar3);
        c17016a.m49539b(h7fVar4);
        c17016a.m49539b(h7fVar5);
        c17016a.m49539b(h7fVar6);
        c17016a.m49539b(h7fVar7);
        l9g l9gVarMo41871h = oa9Var.mo41871h(c17016a.m49538a());
        hc0 hc0VarM54575a = wi8Var.m54575a();
        if (hc0VarM54575a != null) {
            d8f.m22609b(l9gVarMo41871h, h7fVar, hc0VarM54575a, C17595a.f50413a);
        }
        sz0 sz0VarM54576b = wi8Var.m54576b();
        if (sz0VarM54576b != null) {
            l9gVarMo41871h.mo26541g(h7fVar2, sz0VarM54576b.mo49086a());
        }
        if (wi8Var.m54577c() != null) {
            l9gVarMo41871h.mo26547r(h7fVar3, new C17596b(wi8Var));
        }
        String strM54578d = wi8Var.m54578d();
        if (strM54578d != null) {
            l9gVarMo41871h.mo26541g(h7fVar4, strM54578d);
        }
        if (wi8Var.m54579e() != null) {
            l9gVarMo41871h.mo26547r(h7fVar5, new C17597c(wi8Var));
        }
        String strM54580f = wi8Var.m54580f();
        if (strM54580f != null) {
            l9gVarMo41871h.mo26541g(h7fVar6, strM54580f);
        }
        yci yciVarM54581g = wi8Var.m54581g();
        if (yciVarM54581g != null) {
            d8f.m22609b(l9gVarMo41871h, h7fVar7, yciVarM54581g, C17598d.f50416a);
        }
        l9gVarMo41871h.mo26543j();
        return oa9Var.mo41870a();
    }
}
