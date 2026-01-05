package p001o;

import p001o.aff;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class fif {

    /* renamed from: o.fif$a */
    public /* synthetic */ class C13444a extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C13444a f23415a = new C13444a();

        public C13444a() {
            super(2, u46.class, "serializeEmailMfaSettingsTypeDocument", "serializeEmailMfaSettingsTypeDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/cognitoidentityprovider/model/EmailMfaSettingsType;)V", 1);
        }

        /* renamed from: b */
        public final void m26786b(tff tffVar, t46 t46Var) {
            sq8.m48649h(tffVar, "p0");
            sq8.m48649h(t46Var, "p1");
            u46.m50929a(tffVar, t46Var);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m26786b((tff) obj, (t46) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.fif$b */
    public /* synthetic */ class C13445b extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C13445b f23416a = new C13445b();

        public C13445b() {
            super(2, twf.class, "serializeSmsMfaSettingsTypeDocument", "serializeSmsMfaSettingsTypeDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/cognitoidentityprovider/model/SmsMfaSettingsType;)V", 1);
        }

        /* renamed from: b */
        public final void m26787b(tff tffVar, swf swfVar) {
            sq8.m48649h(tffVar, "p0");
            sq8.m48649h(swfVar, "p1");
            twf.m50734a(tffVar, swfVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m26787b((tff) obj, (swf) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.fif$c */
    public /* synthetic */ class C13446c extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C13446c f23417a = new C13446c();

        public C13446c() {
            super(2, dzf.class, "serializeSoftwareTokenMfaSettingsTypeDocument", "serializeSoftwareTokenMfaSettingsTypeDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/cognitoidentityprovider/model/SoftwareTokenMfaSettingsType;)V", 1);
        }

        /* renamed from: b */
        public final void m26788b(tff tffVar, czf czfVar) {
            sq8.m48649h(tffVar, "p0");
            sq8.m48649h(czfVar, "p1");
            dzf.m23971a(tffVar, czfVar);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m26788b((tff) obj, (czf) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: b */
    public static final byte[] m26785b(jl6 jl6Var, gif gifVar) {
        oa9 oa9Var = new oa9();
        h7f h7fVar = new h7f(aff.C12163j.f14622a, new na9("AccessToken"));
        aff.C12164k c12164k = aff.C12164k.f14623a;
        h7f h7fVar2 = new h7f(c12164k, new na9("EmailMfaSettings"));
        h7f h7fVar3 = new h7f(c12164k, new na9("SMSMfaSettings"));
        h7f h7fVar4 = new h7f(c12164k, new na9("SoftwareTokenMfaSettings"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        c17016a.m49539b(h7fVar3);
        c17016a.m49539b(h7fVar4);
        l9g l9gVarMo41871h = oa9Var.mo41871h(c17016a.m49538a());
        String strM28816a = gifVar.m28816a();
        if (strM28816a != null) {
            l9gVarMo41871h.mo26541g(h7fVar, strM28816a);
        }
        t46 t46VarM28817b = gifVar.m28817b();
        if (t46VarM28817b != null) {
            d8f.m22609b(l9gVarMo41871h, h7fVar2, t46VarM28817b, C13444a.f23415a);
        }
        swf swfVarM28818c = gifVar.m28818c();
        if (swfVarM28818c != null) {
            d8f.m22609b(l9gVarMo41871h, h7fVar3, swfVarM28818c, C13445b.f23416a);
        }
        czf czfVarM28819d = gifVar.m28819d();
        if (czfVarM28819d != null) {
            d8f.m22609b(l9gVarMo41871h, h7fVar4, czfVarM28819d, C13446c.f23417a);
        }
        l9gVarMo41871h.mo26543j();
        return oa9Var.mo41870a();
    }
}
