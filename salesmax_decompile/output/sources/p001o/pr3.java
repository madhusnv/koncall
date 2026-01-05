package p001o;

import java.util.Map;
import p001o.aff;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class pr3 {

    /* renamed from: o.pr3$a */
    public /* synthetic */ class C16164a extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C16164a f40434a = new C16164a();

        public C16164a() {
            super(2, ic0.class, "serializeAnalyticsMetadataTypeDocument", "serializeAnalyticsMetadataTypeDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/cognitoidentityprovider/model/AnalyticsMetadataType;)V", 1);
        }

        /* renamed from: b */
        public final void m44067b(tff tffVar, hc0 hc0Var) {
            sq8.m48649h(tffVar, "p0");
            sq8.m48649h(hc0Var, "p1");
            ic0.m31895a(tffVar, hc0Var);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m44067b((tff) obj, (hc0) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.pr3$b */
    public static final class C16165b implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ qr3 f40435a;

        public C16165b(qr3 qr3Var) {
            this.f40435a = qr3Var;
        }

        /* renamed from: a */
        public final void m44068a(yra yraVar) {
            sq8.m48649h(yraVar, "$this$mapField");
            for (Map.Entry entry : this.f40435a.m45776c().entrySet()) {
                yraVar.mo33675k((String) entry.getKey(), (String) entry.getValue());
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m44068a((yra) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.pr3$c */
    public /* synthetic */ class C16166c extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C16166c f40436a = new C16166c();

        public C16166c() {
            super(2, zci.class, "serializeUserContextDataTypeDocument", "serializeUserContextDataTypeDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/cognitoidentityprovider/model/UserContextDataType;)V", 1);
        }

        /* renamed from: b */
        public final void m44069b(tff tffVar, yci yciVar) {
            sq8.m48649h(tffVar, "p0");
            sq8.m48649h(yciVar, "p1");
            zci.m59214a(tffVar, yciVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m44069b((tff) obj, (yci) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: b */
    public static final byte[] m44066b(jl6 jl6Var, qr3 qr3Var) {
        oa9 oa9Var = new oa9();
        aff.C12164k c12164k = aff.C12164k.f14623a;
        h7f h7fVar = new h7f(c12164k, new na9("AnalyticsMetadata"));
        aff.C12163j c12163j = aff.C12163j.f14622a;
        h7f h7fVar2 = new h7f(c12163j, new na9("ClientId"));
        h7f h7fVar3 = new h7f(aff.C12162i.f14621a, new na9("ClientMetadata"));
        h7f h7fVar4 = new h7f(c12163j, new na9("ConfirmationCode"));
        h7f h7fVar5 = new h7f(aff.C12155b.f14614a, new na9("ForceAliasCreation"));
        h7f h7fVar6 = new h7f(c12163j, new na9("SecretHash"));
        h7f h7fVar7 = new h7f(c12163j, new na9("Session"));
        h7f h7fVar8 = new h7f(c12164k, new na9("UserContextData"));
        h7f h7fVar9 = new h7f(c12163j, new na9("Username"));
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
        hc0 hc0VarM45774a = qr3Var.m45774a();
        if (hc0VarM45774a != null) {
            d8f.m22609b(l9gVarMo41871h, h7fVar, hc0VarM45774a, C16164a.f40434a);
        }
        String strM45775b = qr3Var.m45775b();
        if (strM45775b != null) {
            l9gVarMo41871h.mo26541g(h7fVar2, strM45775b);
        }
        if (qr3Var.m45776c() != null) {
            l9gVarMo41871h.mo26547r(h7fVar3, new C16165b(qr3Var));
        }
        String strM45777d = qr3Var.m45777d();
        if (strM45777d != null) {
            l9gVarMo41871h.mo26541g(h7fVar4, strM45777d);
        }
        Boolean boolM45778e = qr3Var.m45778e();
        if (boolM45778e != null) {
            l9gVarMo41871h.mo26542i(h7fVar5, boolM45778e.booleanValue());
        }
        String strM45779f = qr3Var.m45779f();
        if (strM45779f != null) {
            l9gVarMo41871h.mo26541g(h7fVar6, strM45779f);
        }
        String strM45780g = qr3Var.m45780g();
        if (strM45780g != null) {
            l9gVarMo41871h.mo26541g(h7fVar7, strM45780g);
        }
        yci yciVarM45781h = qr3Var.m45781h();
        if (yciVarM45781h != null) {
            d8f.m22609b(l9gVarMo41871h, h7fVar8, yciVarM45781h, C16166c.f40436a);
        }
        String strM45782i = qr3Var.m45782i();
        if (strM45782i != null) {
            l9gVarMo41871h.mo26541g(h7fVar9, strM45782i);
        }
        l9gVarMo41871h.mo26543j();
        return oa9Var.mo41870a();
    }
}
