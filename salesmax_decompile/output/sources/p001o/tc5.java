package p001o;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p001o.cg3;
import p001o.d01;
import p001o.j7f;

/* loaded from: classes3.dex */
public final class tc5 implements cg3 {

    /* renamed from: a */
    public final cg3.C12676c f46799a;

    /* renamed from: b */
    public final q7f f46800b;

    /* renamed from: c */
    public final i7f f46801c;

    /* renamed from: d */
    public final gg3 f46802d;

    /* renamed from: e */
    public final Map f46803e;

    /* renamed from: f */
    public final bg3 f46804f;

    /* renamed from: g */
    public final String f46805g;

    /* renamed from: h */
    public final ydc f46806h;

    /* renamed from: q */
    public final f91 f46807q;

    public tc5(cg3.C12676c c12676c) {
        sq8.m48649h(c12676c, "config");
        this.f46799a = c12676c;
        this.f46800b = new q7f(null, 1, null);
        this.f46801c = new i7f(m49698a().mo20110b());
        this.f46802d = new gg3(m49698a());
        List listM21147e = m49698a().m21147e();
        LinkedHashMap linkedHashMap = new LinkedHashMap(bce.m18601d(hsa.m31055e(dh3.m23088v(listM21147e, 10)), 16));
        for (Object obj : listM21147e) {
            linkedHashMap.put(d01.m22166d(((c01) obj).mo19992a()), obj);
        }
        Map mapM32696w = isa.m32696w(linkedHashMap);
        d01.C12776a c12776a = d01.f18915b;
        d01 d01VarM22166d = d01.m22166d(c12776a.m22174b());
        if (mapM32696w.get(d01VarM22166d) == null) {
            mapM32696w.put(d01VarM22166d, new nrf(cc5.m20837c(), "cognito-identity"));
        }
        d01 d01VarM22166d2 = d01.m22166d(c12776a.m22173a());
        if (mapM32696w.get(d01VarM22166d2) == null) {
            mapM32696w.put(d01VarM22166d2, sh0.f45416a);
        }
        this.f46803e = isa.m32693t(mapM32696w);
        this.f46804f = new bg3(m49698a());
        this.f46805g = "aws.sdk.kotlin.services.cognitoidentity";
        this.f46806h = new ydc("aws.sdk.kotlin.services.cognitoidentity", m49698a().m21156n());
        r7f.m46310a(this.f46800b, m49698a().mo20110b());
        r7f.m46310a(this.f46800b, m49698a().m21149g());
        this.f46807q = f91.f22967i.m26297a(new ji0("Cognito Identity", "1.3.81"), m49698a().m21145c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p001o.cg3
    public Object V2(bp7 bp7Var, n64 n64Var) {
        j7f.C14471a c14471a = j7f.f29929h;
        k7f k7fVar = new k7f(kge.m35689b(bp7.class), kge.m35689b(cp7.class));
        k7fVar.m35122h(new zo7());
        k7fVar.m35119e(new xo7());
        k7fVar.m35121g("GetCredentialsForIdentity");
        k7fVar.m35124j("Cognito Identity");
        z7f z7fVarM35118d = k7fVar.m35118d();
        z7fVarM35118d.m58874i(m49698a().m21156n());
        z7fVarM35118d.m58875j(this.f46805g);
        z7fVarM35118d.m58873h(this.f46806h);
        rx0 rx0Var = new rx0();
        rx0Var.m47216b("rpc.system", "aws-api");
        z7fVarM35118d.m58872g(rx0Var.m47215a());
        k7fVar.m35117c().m51149i(new qdc(this.f46804f, this.f46803e, this.f46802d));
        k7fVar.m35117c().m51150j(new l86(m49698a()));
        k7fVar.m35117c().m51152l(m49698a().mo20109a());
        k7fVar.m35117c().m51151k(m49698a().m21155m());
        j7f j7fVarM35115a = k7fVar.m35115a();
        m49699c(j7fVarM35115a.m33381a());
        j7fVarM35115a.m33389i(new l81());
        j7fVarM35115a.m33384d().add(b91.f15688a);
        j7fVarM35115a.m33384d().add(new mo1());
        j7fVarM35115a.m33388h(new h81("AWSCognitoIdentityService", "1.1"));
        j7fVarM35115a.m33388h(new dai(this.f46807q));
        j7fVarM35115a.m33388h(new vfe(null, 1, 0 == true ? 1 : 0));
        j7fVarM35115a.m33384d().addAll(m49698a().m21152j());
        return l7f.m36671e(j7fVarM35115a, this.f46801c, bp7Var, n64Var);
    }

    /* renamed from: a */
    public cg3.C12676c m49698a() {
        return this.f46799a;
    }

    /* renamed from: c */
    public final void m49699c(jl6 jl6Var) {
        e7f e7fVar = e7f.f21127a;
        tx0.m50741f(jl6Var, e7fVar.m24494a(), m49698a().m21148f());
        tx0.m50741f(jl6Var, e7fVar.m24496c(), m49698a().m21153k());
        tx0.m50742g(jl6Var, d71.f19162a.m22387a(), m49698a().m21154l());
        x81 x81Var = x81.f53319a;
        tx0.m50742g(jl6Var, x81Var.m55806j(), m49698a().m21154l());
        tx0.m50741f(jl6Var, x81Var.m55808l(), "cognito-identity");
        tx0.m50741f(jl6Var, x81Var.m55798b(), m49698a().m21149g());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f46800b.m44937b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p001o.cg3
    public Object e1(iq7 iq7Var, n64 n64Var) {
        j7f.C14471a c14471a = j7f.f29929h;
        k7f k7fVar = new k7f(kge.m35689b(iq7.class), kge.m35689b(jq7.class));
        k7fVar.m35122h(new gq7());
        k7fVar.m35119e(new eq7());
        k7fVar.m35121g("GetId");
        k7fVar.m35124j("Cognito Identity");
        z7f z7fVarM35118d = k7fVar.m35118d();
        z7fVarM35118d.m58874i(m49698a().m21156n());
        z7fVarM35118d.m58875j(this.f46805g);
        z7fVarM35118d.m58873h(this.f46806h);
        rx0 rx0Var = new rx0();
        rx0Var.m47216b("rpc.system", "aws-api");
        z7fVarM35118d.m58872g(rx0Var.m47215a());
        k7fVar.m35117c().m51149i(new qdc(this.f46804f, this.f46803e, this.f46802d));
        k7fVar.m35117c().m51150j(new l86(m49698a()));
        k7fVar.m35117c().m51152l(m49698a().mo20109a());
        k7fVar.m35117c().m51151k(m49698a().m21155m());
        j7f j7fVarM35115a = k7fVar.m35115a();
        m49699c(j7fVarM35115a.m33381a());
        j7fVarM35115a.m33389i(new l81());
        j7fVarM35115a.m33384d().add(b91.f15688a);
        j7fVarM35115a.m33384d().add(new mo1());
        j7fVarM35115a.m33388h(new h81("AWSCognitoIdentityService", "1.1"));
        j7fVarM35115a.m33388h(new dai(this.f46807q));
        j7fVarM35115a.m33388h(new vfe(null, 1, 0 == true ? 1 : 0));
        j7fVarM35115a.m33384d().addAll(m49698a().m21152j());
        return l7f.m36671e(j7fVarM35115a, this.f46801c, iq7Var, n64Var);
    }
}
