package p001o;

import java.util.Map;
import p001o.aff;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class vqe {

    /* renamed from: o.vqe$a */
    public /* synthetic */ class C17647a extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C17647a f50727a = new C17647a();

        public C17647a() {
            super(2, ic0.class, "serializeAnalyticsMetadataTypeDocument", "serializeAnalyticsMetadataTypeDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/cognitoidentityprovider/model/AnalyticsMetadataType;)V", 1);
        }

        /* renamed from: b */
        public final void m53218b(tff tffVar, hc0 hc0Var) {
            sq8.m48649h(tffVar, "p0");
            sq8.m48649h(hc0Var, "p1");
            ic0.m31895a(tffVar, hc0Var);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m53218b((tff) obj, (hc0) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.vqe$b */
    public static final class C17648b implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ wqe f50728a;

        public C17648b(wqe wqeVar) {
            this.f50728a = wqeVar;
        }

        /* renamed from: a */
        public final void m53219a(yra yraVar) {
            sq8.m48649h(yraVar, "$this$mapField");
            for (Map.Entry entry : this.f50728a.m54862c().entrySet()) {
                yraVar.mo33675k((String) entry.getKey(), (String) entry.getValue());
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m53219a((yra) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.vqe$c */
    public static final class C17649c implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ wqe f50729a;

        public C17649c(wqe wqeVar) {
            this.f50729a = wqeVar;
        }

        /* renamed from: a */
        public final void m53220a(yra yraVar) {
            sq8.m48649h(yraVar, "$this$mapField");
            for (Map.Entry entry : this.f50729a.m54864e().entrySet()) {
                yraVar.mo33675k((String) entry.getKey(), (String) entry.getValue());
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m53220a((yra) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.vqe$d */
    public /* synthetic */ class C17650d extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C17650d f50730a = new C17650d();

        public C17650d() {
            super(2, zci.class, "serializeUserContextDataTypeDocument", "serializeUserContextDataTypeDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/cognitoidentityprovider/model/UserContextDataType;)V", 1);
        }

        /* renamed from: b */
        public final void m53221b(tff tffVar, yci yciVar) {
            sq8.m48649h(tffVar, "p0");
            sq8.m48649h(yciVar, "p1");
            zci.m59214a(tffVar, yciVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m53221b((tff) obj, (yci) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: b */
    public static final byte[] m53217b(jl6 jl6Var, wqe wqeVar) {
        oa9 oa9Var = new oa9();
        aff.C12164k c12164k = aff.C12164k.f14623a;
        h7f h7fVar = new h7f(c12164k, new na9("AnalyticsMetadata"));
        h7f h7fVar2 = new h7f(aff.C12157d.f14616a, new na9("ChallengeName"));
        aff.C12162i c12162i = aff.C12162i.f14621a;
        h7f h7fVar3 = new h7f(c12162i, new na9("ChallengeResponses"));
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
        hc0 hc0VarM54860a = wqeVar.m54860a();
        if (hc0VarM54860a != null) {
            d8f.m22609b(l9gVarMo41871h, h7fVar, hc0VarM54860a, C17647a.f50727a);
        }
        cg2 cg2VarM54861b = wqeVar.m54861b();
        if (cg2VarM54861b != null) {
            l9gVarMo41871h.mo26541g(h7fVar2, cg2VarM54861b.mo21138a());
        }
        if (wqeVar.m54862c() != null) {
            l9gVarMo41871h.mo26547r(h7fVar3, new C17648b(wqeVar));
        }
        String strM54863d = wqeVar.m54863d();
        if (strM54863d != null) {
            l9gVarMo41871h.mo26541g(h7fVar4, strM54863d);
        }
        if (wqeVar.m54864e() != null) {
            l9gVarMo41871h.mo26547r(h7fVar5, new C17649c(wqeVar));
        }
        String strM54865f = wqeVar.m54865f();
        if (strM54865f != null) {
            l9gVarMo41871h.mo26541g(h7fVar6, strM54865f);
        }
        yci yciVarM54866g = wqeVar.m54866g();
        if (yciVarM54866g != null) {
            d8f.m22609b(l9gVarMo41871h, h7fVar7, yciVarM54866g, C17650d.f50730a);
        }
        l9gVarMo41871h.mo26543j();
        return oa9Var.mo41870a();
    }
}
