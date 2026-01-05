package p001o;

import com.amplifyframework.auth.cognito.asf.BuildDataCollector;
import p001o.aff;
import p001o.t7f;

/* loaded from: classes3.dex */
public abstract class dr3 {

    /* renamed from: o.dr3$a */
    public /* synthetic */ class C13018a extends dm7 implements nl7 {

        /* renamed from: a */
        public static final C13018a f20429a = new C13018a();

        public C13018a() {
            super(2, kr5.class, "serializeDeviceSecretVerifierConfigTypeDocument", "serializeDeviceSecretVerifierConfigTypeDocument(Laws/smithy/kotlin/runtime/serde/Serializer;Laws/sdk/kotlin/services/cognitoidentityprovider/model/DeviceSecretVerifierConfigType;)V", 1);
        }

        /* renamed from: b */
        public final void m23688b(tff tffVar, jr5 jr5Var) {
            sq8.m48649h(tffVar, "p0");
            sq8.m48649h(jr5Var, "p1");
            kr5.m36119a(tffVar, jr5Var);
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m23688b((tff) obj, (jr5) obj2);
            return y3i.f54824a;
        }
    }

    /* renamed from: b */
    public static final byte[] m23687b(jl6 jl6Var, er3 er3Var) {
        oa9 oa9Var = new oa9();
        aff.C12163j c12163j = aff.C12163j.f14622a;
        h7f h7fVar = new h7f(c12163j, new na9("AccessToken"));
        h7f h7fVar2 = new h7f(c12163j, new na9("DeviceKey"));
        h7f h7fVar3 = new h7f(c12163j, new na9(BuildDataCollector.MODEL));
        h7f h7fVar4 = new h7f(aff.C12164k.f14623a, new na9("DeviceSecretVerifierConfig"));
        t7f.C17017b c17017b = t7f.f46589f;
        t7f.C17016a c17016a = new t7f.C17016a();
        c17016a.m49539b(h7fVar);
        c17016a.m49539b(h7fVar2);
        c17016a.m49539b(h7fVar3);
        c17016a.m49539b(h7fVar4);
        l9g l9gVarMo41871h = oa9Var.mo41871h(c17016a.m49538a());
        String strM25448a = er3Var.m25448a();
        if (strM25448a != null) {
            l9gVarMo41871h.mo26541g(h7fVar, strM25448a);
        }
        String strM25449b = er3Var.m25449b();
        if (strM25449b != null) {
            l9gVarMo41871h.mo26541g(h7fVar2, strM25449b);
        }
        String strM25450c = er3Var.m25450c();
        if (strM25450c != null) {
            l9gVarMo41871h.mo26541g(h7fVar3, strM25450c);
        }
        jr5 jr5VarM25451d = er3Var.m25451d();
        if (jr5VarM25451d != null) {
            d8f.m22609b(l9gVarMo41871h, h7fVar4, jr5VarM25451d, C13018a.f20429a);
        }
        l9gVarMo41871h.mo26543j();
        return oa9Var.mo41870a();
    }
}
