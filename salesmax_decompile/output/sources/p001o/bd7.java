package p001o;

import java.util.Map;
import p001o.aff;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class bd7 {

    /* renamed from: o.bd7$a */
    public /* synthetic */ class C12354a extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C12354a f15956a = new C12354a();

        public C12354a() {
            super(2, ic0.class, "serializeAnalyticsMetadataTypeDocument", "serializeAnalyticsMetadataTypeDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/cognitoidentityprovider/model/AnalyticsMetadataType;)V", 1);
        }

        /* renamed from: b */
        public final void m18637b(tff tffVar, hc0 hc0Var) {
            sq8.m48649h(tffVar, "p0");
            sq8.m48649h(hc0Var, "p1");
            ic0.m31895a(tffVar, hc0Var);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18637b((tff) obj, (hc0) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.bd7$b */
    public static final class C12355b implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ cd7 f15957a;

        public C12355b(cd7 cd7Var) {
            this.f15957a = cd7Var;
        }

        /* renamed from: a */
        public final void m18638a(yra yraVar) {
            sq8.m48649h(yraVar, "$this$mapField");
            for (Map.Entry entry : this.f15957a.m20942c().entrySet()) {
                yraVar.mo33675k((String) entry.getKey(), (String) entry.getValue());
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m18638a((yra) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.bd7$c */
    public /* synthetic */ class C12356c extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C12356c f15958a = new C12356c();

        public C12356c() {
            super(2, zci.class, "serializeUserContextDataTypeDocument", "serializeUserContextDataTypeDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/cognitoidentityprovider/model/UserContextDataType;)V", 1);
        }

        /* renamed from: b */
        public final void m18639b(tff tffVar, yci yciVar) {
            sq8.m48649h(tffVar, "p0");
            sq8.m48649h(yciVar, "p1");
            zci.m59214a(tffVar, yciVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m18639b((tff) obj, (yci) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: b */
    public static final byte[] m18636b(jl6 jl6Var, cd7 cd7Var) {
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
        hc0 hc0VarM20940a = cd7Var.m20940a();
        if (hc0VarM20940a != null) {
            d8f.m22609b(l9gVarMo41871h, h7fVar, hc0VarM20940a, C12354a.f15956a);
        }
        String strM20941b = cd7Var.m20941b();
        if (strM20941b != null) {
            l9gVarMo41871h.mo26541g(h7fVar2, strM20941b);
        }
        if (cd7Var.m20942c() != null) {
            l9gVarMo41871h.mo26547r(h7fVar3, new C12355b(cd7Var));
        }
        String strM20943d = cd7Var.m20943d();
        if (strM20943d != null) {
            l9gVarMo41871h.mo26541g(h7fVar4, strM20943d);
        }
        yci yciVarM20944e = cd7Var.m20944e();
        if (yciVarM20944e != null) {
            d8f.m22609b(l9gVarMo41871h, h7fVar5, yciVarM20944e, C12356c.f15958a);
        }
        String strM20945f = cd7Var.m20945f();
        if (strM20945f != null) {
            l9gVarMo41871h.mo26541g(h7fVar6, strM20945f);
        }
        l9gVarMo41871h.mo26543j();
        return oa9Var.mo41870a();
    }
}
