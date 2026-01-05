package p001o;

import java.util.Map;
import p001o.aff;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class jr3 {

    /* renamed from: o.jr3$a */
    public /* synthetic */ class C14634a extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C14634a f30987a = new C14634a();

        public C14634a() {
            super(2, ic0.class, "serializeAnalyticsMetadataTypeDocument", "serializeAnalyticsMetadataTypeDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/cognitoidentityprovider/model/AnalyticsMetadataType;)V", 1);
        }

        /* renamed from: b */
        public final void m34360b(tff tffVar, hc0 hc0Var) {
            sq8.m48649h(tffVar, "p0");
            sq8.m48649h(hc0Var, "p1");
            ic0.m31895a(tffVar, hc0Var);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m34360b((tff) obj, (hc0) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.jr3$b */
    public static final class C14635b implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ kr3 f30988a;

        public C14635b(kr3 kr3Var) {
            this.f30988a = kr3Var;
        }

        /* renamed from: a */
        public final void m34361a(yra yraVar) {
            sq8.m48649h(yraVar, "$this$mapField");
            for (Map.Entry entry : this.f30988a.m36094c().entrySet()) {
                yraVar.mo33675k((String) entry.getKey(), (String) entry.getValue());
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m34361a((yra) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.jr3$c */
    public /* synthetic */ class C14636c extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C14636c f30989a = new C14636c();

        public C14636c() {
            super(2, zci.class, "serializeUserContextDataTypeDocument", "serializeUserContextDataTypeDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/cognitoidentityprovider/model/UserContextDataType;)V", 1);
        }

        /* renamed from: b */
        public final void m34362b(tff tffVar, yci yciVar) {
            sq8.m48649h(tffVar, "p0");
            sq8.m48649h(yciVar, "p1");
            zci.m59214a(tffVar, yciVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m34362b((tff) obj, (yci) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: b */
    public static final byte[] m34359b(jl6 jl6Var, kr3 kr3Var) {
        oa9 oa9Var = new oa9();
        aff.C12164k c12164k = aff.C12164k.f14623a;
        h7f h7fVar = new h7f(c12164k, new na9("AnalyticsMetadata"));
        aff.C12163j c12163j = aff.C12163j.f14622a;
        h7f h7fVar2 = new h7f(c12163j, new na9("ClientId"));
        h7f h7fVar3 = new h7f(aff.C12162i.f14621a, new na9("ClientMetadata"));
        h7f h7fVar4 = new h7f(c12163j, new na9("ConfirmationCode"));
        h7f h7fVar5 = new h7f(c12163j, new na9("Password"));
        h7f h7fVar6 = new h7f(c12163j, new na9("SecretHash"));
        h7f h7fVar7 = new h7f(c12164k, new na9("UserContextData"));
        h7f h7fVar8 = new h7f(c12163j, new na9("Username"));
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
        l9g l9gVarMo41871h = oa9Var.mo41871h(c17016a.m49538a());
        hc0 hc0VarM36092a = kr3Var.m36092a();
        if (hc0VarM36092a != null) {
            d8f.m22609b(l9gVarMo41871h, h7fVar, hc0VarM36092a, C14634a.f30987a);
        }
        String strM36093b = kr3Var.m36093b();
        if (strM36093b != null) {
            l9gVarMo41871h.mo26541g(h7fVar2, strM36093b);
        }
        if (kr3Var.m36094c() != null) {
            l9gVarMo41871h.mo26547r(h7fVar3, new C14635b(kr3Var));
        }
        String strM36095d = kr3Var.m36095d();
        if (strM36095d != null) {
            l9gVarMo41871h.mo26541g(h7fVar4, strM36095d);
        }
        String strM36096e = kr3Var.m36096e();
        if (strM36096e != null) {
            l9gVarMo41871h.mo26541g(h7fVar5, strM36096e);
        }
        String strM36097f = kr3Var.m36097f();
        if (strM36097f != null) {
            l9gVarMo41871h.mo26541g(h7fVar6, strM36097f);
        }
        yci yciVarM36098g = kr3Var.m36098g();
        if (yciVarM36098g != null) {
            d8f.m22609b(l9gVarMo41871h, h7fVar7, yciVarM36098g, C14636c.f30989a);
        }
        String strM36099h = kr3Var.m36099h();
        if (strM36099h != null) {
            l9gVarMo41871h.mo26541g(h7fVar8, strM36099h);
        }
        l9gVarMo41871h.mo26543j();
        return oa9Var.mo41870a();
    }
}
