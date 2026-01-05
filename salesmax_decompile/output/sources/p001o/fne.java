package p001o;

import java.util.Map;
import p001o.aff;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class fne {

    /* renamed from: o.fne$a */
    public /* synthetic */ class C13492a extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C13492a f23738a = new C13492a();

        public C13492a() {
            super(2, ic0.class, "serializeAnalyticsMetadataTypeDocument", "serializeAnalyticsMetadataTypeDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/cognitoidentityprovider/model/AnalyticsMetadataType;)V", 1);
        }

        /* renamed from: b */
        public final void m27159b(tff tffVar, hc0 hc0Var) {
            sq8.m48649h(tffVar, "p0");
            sq8.m48649h(hc0Var, "p1");
            ic0.m31895a(tffVar, hc0Var);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m27159b((tff) obj, (hc0) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.fne$b */
    public static final class C13493b implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ gne f23739a;

        public C13493b(gne gneVar) {
            this.f23739a = gneVar;
        }

        /* renamed from: a */
        public final void m27160a(yra yraVar) {
            sq8.m48649h(yraVar, "$this$mapField");
            for (Map.Entry entry : this.f23739a.m29162c().entrySet()) {
                yraVar.mo33675k((String) entry.getKey(), (String) entry.getValue());
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m27160a((yra) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.fne$c */
    public /* synthetic */ class C13494c extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C13494c f23740a = new C13494c();

        public C13494c() {
            super(2, zci.class, "serializeUserContextDataTypeDocument", "serializeUserContextDataTypeDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/cognitoidentityprovider/model/UserContextDataType;)V", 1);
        }

        /* renamed from: b */
        public final void m27161b(tff tffVar, yci yciVar) {
            sq8.m48649h(tffVar, "p0");
            sq8.m48649h(yciVar, "p1");
            zci.m59214a(tffVar, yciVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m27161b((tff) obj, (yci) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: b */
    public static final byte[] m27158b(jl6 jl6Var, gne gneVar) {
        oa9 oa9Var = new oa9();
        aff.C12164k c12164k = aff.C12164k.f14623a;
        h7f h7fVar = new h7f(c12164k, new na9("AnalyticsMetadata"));
        aff.C12163j c12163j = aff.C12163j.f14622a;
        h7f h7fVar2 = new h7f(c12163j, new na9("ClientId"));
        h7f h7fVar3 = new h7f(aff.C12162i.f14621a, new na9("ClientMetadata"));
        h7f h7fVar4 = new h7f(c12163j, new na9("SecretHash"));
        h7f h7fVar5 = new h7f(c12164k, new na9("UserContextData"));
        h7f h7fVar6 = new h7f(c12163j, new na9("Username"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        c17016a.m49539b(h7fVar3);
        c17016a.m49539b(h7fVar4);
        c17016a.m49539b(h7fVar5);
        c17016a.m49539b(h7fVar6);
        l9g l9gVarMo41871h = oa9Var.mo41871h(c17016a.m49538a());
        hc0 hc0VarM29160a = gneVar.m29160a();
        if (hc0VarM29160a != null) {
            d8f.m22609b(l9gVarMo41871h, h7fVar, hc0VarM29160a, C13492a.f23738a);
        }
        String strM29161b = gneVar.m29161b();
        if (strM29161b != null) {
            l9gVarMo41871h.mo26541g(h7fVar2, strM29161b);
        }
        if (gneVar.m29162c() != null) {
            l9gVarMo41871h.mo26547r(h7fVar3, new C13493b(gneVar));
        }
        String strM29163d = gneVar.m29163d();
        if (strM29163d != null) {
            l9gVarMo41871h.mo26541g(h7fVar4, strM29163d);
        }
        yci yciVarM29164e = gneVar.m29164e();
        if (yciVarM29164e != null) {
            d8f.m22609b(l9gVarMo41871h, h7fVar5, yciVarM29164e, C13494c.f23740a);
        }
        String strM29165f = gneVar.m29165f();
        if (strM29165f != null) {
            l9gVarMo41871h.mo26541g(h7fVar6, strM29165f);
        }
        l9gVarMo41871h.mo26543j();
        return oa9Var.mo41870a();
    }
}
