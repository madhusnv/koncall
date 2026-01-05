package p001o;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p001o.d01;
import p001o.j7f;
import p001o.q1g;

/* loaded from: classes2.dex */
public final class mh5 implements q1g {

    /* renamed from: a */
    public final q1g.C16272c f35472a;

    /* renamed from: b */
    public final q7f f35473b;

    /* renamed from: c */
    public final i7f f35474c;

    /* renamed from: d */
    public final y1g f35475d;

    /* renamed from: e */
    public final Map f35476e;

    /* renamed from: f */
    public final p1g f35477f;

    /* renamed from: g */
    public final String f35478g;

    /* renamed from: h */
    public final ydc f35479h;

    /* renamed from: q */
    public final f91 f35480q;

    public mh5(q1g.C16272c c16272c) {
        sq8.m48649h(c16272c, "config");
        this.f35472a = c16272c;
        this.f35473b = new q7f(null, 1, null);
        this.f35474c = new i7f(m39057a().mo20110b());
        this.f35475d = new y1g(m39057a());
        List listM44711e = m39057a().m44711e();
        LinkedHashMap linkedHashMap = new LinkedHashMap(bce.m18601d(hsa.m31055e(dh3.m23088v(listM44711e, 10)), 16));
        for (Object obj : listM44711e) {
            linkedHashMap.put(d01.m22166d(((c01) obj).mo19992a()), obj);
        }
        Map mapM32696w = isa.m32696w(linkedHashMap);
        d01.C12776a c12776a = d01.f18915b;
        d01 d01VarM22166d = d01.m22166d(c12776a.m22174b());
        if (mapM32696w.get(d01VarM22166d) == null) {
            mapM32696w.put(d01VarM22166d, new nrf(cc5.m20837c(), "awsssoportal"));
        }
        d01 d01VarM22166d2 = d01.m22166d(c12776a.m22173a());
        if (mapM32696w.get(d01VarM22166d2) == null) {
            mapM32696w.put(d01VarM22166d2, sh0.f45416a);
        }
        this.f35476e = isa.m32693t(mapM32696w);
        this.f35477f = new p1g(m39057a());
        this.f35478g = "aws.sdk.kotlin.runtime.auth.credentials.internal.sso";
        this.f35479h = new ydc("aws.sdk.kotlin.runtime.auth.credentials.internal.sso", m39057a().m44720n());
        r7f.m46310a(this.f35473b, m39057a().mo20110b());
        r7f.m46310a(this.f35473b, m39057a().m44713g());
        this.f35480q = f91.f22967i.m26297a(new ji0("SSO", "1.3.81"), m39057a().m44709c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p001o.q1g
    public Object W1(gr7 gr7Var, n64 n64Var) {
        j7f.C14471a c14471a = j7f.f29929h;
        k7f k7fVar = new k7f(kge.m35689b(gr7.class), kge.m35689b(hr7.class));
        k7fVar.m35122h(new fr7());
        k7fVar.m35119e(new cr7());
        k7fVar.m35121g("GetRoleCredentials");
        k7fVar.m35124j("SSO");
        z7f z7fVarM35118d = k7fVar.m35118d();
        z7fVarM35118d.m58874i(m39057a().m44720n());
        z7fVarM35118d.m58875j(this.f35478g);
        z7fVarM35118d.m58873h(this.f35479h);
        rx0 rx0Var = new rx0();
        rx0Var.m47216b("rpc.system", "aws-api");
        z7fVarM35118d.m58872g(rx0Var.m47215a());
        k7fVar.m35117c().m51149i(new qdc(this.f35477f, this.f35476e, this.f35475d));
        k7fVar.m35117c().m51150j(new s86(m39057a()));
        k7fVar.m35117c().m51152l(m39057a().mo20109a());
        k7fVar.m35117c().m51151k(m39057a().m44719m());
        j7f j7fVarM35115a = k7fVar.m35115a();
        m39058c(j7fVarM35115a.m33381a());
        j7fVarM35115a.m33389i(new l81());
        j7fVarM35115a.m33384d().add(b91.f15688a);
        j7fVarM35115a.m33384d().add(new mo1());
        j7fVarM35115a.m33388h(new dai(this.f35480q));
        j7fVarM35115a.m33388h(new vfe(null, 1, 0 == true ? 1 : 0));
        j7fVarM35115a.m33384d().addAll(m39057a().m44716j());
        return l7f.m36671e(j7fVarM35115a, this.f35474c, gr7Var, n64Var);
    }

    /* renamed from: a */
    public q1g.C16272c m39057a() {
        return this.f35472a;
    }

    /* renamed from: c */
    public final void m39058c(jl6 jl6Var) {
        e7f e7fVar = e7f.f21127a;
        tx0.m50741f(jl6Var, e7fVar.m24494a(), m39057a().m44712f());
        tx0.m50741f(jl6Var, e7fVar.m24496c(), m39057a().m44717k());
        tx0.m50742g(jl6Var, d71.f19162a.m22387a(), m39057a().m44718l());
        x81 x81Var = x81.f53319a;
        tx0.m50742g(jl6Var, x81Var.m55806j(), m39057a().m44718l());
        tx0.m50741f(jl6Var, x81Var.m55808l(), "awsssoportal");
        tx0.m50741f(jl6Var, x81Var.m55798b(), m39057a().m44713g());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f35473b.m44937b();
    }
}
