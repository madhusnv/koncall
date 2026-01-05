package p001o;

import java.util.Iterator;
import java.util.Map;
import p001o.aff;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class wrf {

    /* renamed from: o.wrf$a */
    public /* synthetic */ class C17959a extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C17959a f52600a = new C17959a();

        public C17959a() {
            super(2, ic0.class, "serializeAnalyticsMetadataTypeDocument", "serializeAnalyticsMetadataTypeDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/cognitoidentityprovider/model/AnalyticsMetadataType;)V", 1);
        }

        /* renamed from: b */
        public final void m54937b(tff tffVar, hc0 hc0Var) {
            sq8.m48649h(tffVar, "p0");
            sq8.m48649h(hc0Var, "p1");
            ic0.m31895a(tffVar, hc0Var);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m54937b((tff) obj, (hc0) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.wrf$b */
    public static final class C17960b implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ xrf f52601a;

        public C17960b(xrf xrfVar) {
            this.f52601a = xrfVar;
        }

        /* renamed from: a */
        public final void m54938a(yra yraVar) {
            sq8.m48649h(yraVar, "$this$mapField");
            for (Map.Entry entry : this.f52601a.m56703c().entrySet()) {
                yraVar.mo33675k((String) entry.getKey(), (String) entry.getValue());
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m54938a((yra) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.wrf$c */
    public static final class C17961c implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ xrf f52602a;

        /* renamed from: o.wrf$c$a */
        public /* synthetic */ class a extends dm7 implements nl7 {

            /* renamed from: a */
            public static final a f52603a = new a();

            public a() {
                super(2, nx0.class, "serializeAttributeTypeDocument", "serializeAttributeTypeDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/cognitoidentityprovider/model/AttributeType;)V", 1);
            }

            /* renamed from: b */
            public final void m54940b(tff tffVar, lx0 lx0Var) {
                sq8.m48649h(tffVar, "p0");
                sq8.m48649h(lx0Var, "p1");
                nx0.m41202a(tffVar, lx0Var);
            }

            @Override // p001o.nl7
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                m54940b((tff) obj, (lx0) obj2);
                return y3i.f54824a;
            }
        }

        public C17961c(xrf xrfVar) {
            this.f52602a = xrfVar;
        }

        /* renamed from: a */
        public final void m54939a(gfa gfaVar) {
            sq8.m48649h(gfaVar, "$this$listField");
            Iterator it = this.f52602a.m56706f().iterator();
            while (it.hasNext()) {
                gfaVar.mo21109e(d8f.m22608a((lx0) it.next(), a.f52603a));
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m54939a((gfa) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.wrf$d */
    public /* synthetic */ class C17962d extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C17962d f52604a = new C17962d();

        public C17962d() {
            super(2, zci.class, "serializeUserContextDataTypeDocument", "serializeUserContextDataTypeDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/cognitoidentityprovider/model/UserContextDataType;)V", 1);
        }

        /* renamed from: b */
        public final void m54941b(tff tffVar, yci yciVar) {
            sq8.m48649h(tffVar, "p0");
            sq8.m48649h(yciVar, "p1");
            zci.m59214a(tffVar, yciVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m54941b((tff) obj, (yci) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.wrf$e */
    public static final class C17963e implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ xrf f52605a;

        /* renamed from: o.wrf$e$a */
        public /* synthetic */ class a extends dm7 implements nl7 {

            /* renamed from: a */
            public static final a f52606a = new a();

            public a() {
                super(2, nx0.class, "serializeAttributeTypeDocument", "serializeAttributeTypeDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/cognitoidentityprovider/model/AttributeType;)V", 1);
            }

            /* renamed from: b */
            public final void m54943b(tff tffVar, lx0 lx0Var) {
                sq8.m48649h(tffVar, "p0");
                sq8.m48649h(lx0Var, "p1");
                nx0.m41202a(tffVar, lx0Var);
            }

            @Override // p001o.nl7
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                m54943b((tff) obj, (lx0) obj2);
                return y3i.f54824a;
            }
        }

        public C17963e(xrf xrfVar) {
            this.f52605a = xrfVar;
        }

        /* renamed from: a */
        public final void m54942a(gfa gfaVar) {
            sq8.m48649h(gfaVar, "$this$listField");
            Iterator it = this.f52605a.m56709i().iterator();
            while (it.hasNext()) {
                gfaVar.mo21109e(d8f.m22608a((lx0) it.next(), a.f52606a));
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m54942a((gfa) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: b */
    public static final byte[] m54936b(jl6 jl6Var, xrf xrfVar) {
        oa9 oa9Var = new oa9();
        aff.C12164k c12164k = aff.C12164k.f14623a;
        h7f h7fVar = new h7f(c12164k, new na9("AnalyticsMetadata"));
        aff.C12163j c12163j = aff.C12163j.f14622a;
        h7f h7fVar2 = new h7f(c12163j, new na9("ClientId"));
        h7f h7fVar3 = new h7f(aff.C12162i.f14621a, new na9("ClientMetadata"));
        h7f h7fVar4 = new h7f(c12163j, new na9("Password"));
        h7f h7fVar5 = new h7f(c12163j, new na9("SecretHash"));
        aff.C12160g c12160g = aff.C12160g.f14619a;
        h7f h7fVar6 = new h7f(c12160g, new na9("UserAttributes"));
        h7f h7fVar7 = new h7f(c12164k, new na9("UserContextData"));
        h7f h7fVar8 = new h7f(c12163j, new na9("Username"));
        h7f h7fVar9 = new h7f(c12160g, new na9("ValidationData"));
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
        hc0 hc0VarM56701a = xrfVar.m56701a();
        if (hc0VarM56701a != null) {
            d8f.m22609b(l9gVarMo41871h, h7fVar, hc0VarM56701a, C17959a.f52600a);
        }
        String strM56702b = xrfVar.m56702b();
        if (strM56702b != null) {
            l9gVarMo41871h.mo26541g(h7fVar2, strM56702b);
        }
        if (xrfVar.m56703c() != null) {
            l9gVarMo41871h.mo26547r(h7fVar3, new C17960b(xrfVar));
        }
        String strM56704d = xrfVar.m56704d();
        if (strM56704d != null) {
            l9gVarMo41871h.mo26541g(h7fVar4, strM56704d);
        }
        String strM56705e = xrfVar.m56705e();
        if (strM56705e != null) {
            l9gVarMo41871h.mo26541g(h7fVar5, strM56705e);
        }
        if (xrfVar.m56706f() != null) {
            l9gVarMo41871h.mo26540c(h7fVar6, new C17961c(xrfVar));
        }
        yci yciVarM56707g = xrfVar.m56707g();
        if (yciVarM56707g != null) {
            d8f.m22609b(l9gVarMo41871h, h7fVar7, yciVarM56707g, C17962d.f52604a);
        }
        String strM56708h = xrfVar.m56708h();
        if (strM56708h != null) {
            l9gVarMo41871h.mo26541g(h7fVar8, strM56708h);
        }
        if (xrfVar.m56709i() != null) {
            l9gVarMo41871h.mo26540c(h7fVar9, new C17963e(xrfVar));
        }
        l9gVarMo41871h.mo26543j();
        return oa9Var.mo41870a();
    }
}
