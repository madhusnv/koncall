package p001o;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p001o.c2g;
import p001o.d01;
import p001o.j7f;

/* loaded from: classes2.dex */
public final class ph5 implements c2g {

    /* renamed from: a */
    public final c2g.C12539c f40086a;

    /* renamed from: b */
    public final q7f f40087b;

    /* renamed from: c */
    public final i7f f40088c;

    /* renamed from: d */
    public final g2g f40089d;

    /* renamed from: e */
    public final Map f40090e;

    /* renamed from: f */
    public final b2g f40091f;

    /* renamed from: g */
    public final String f40092g;

    /* renamed from: h */
    public final ydc f40093h;

    /* renamed from: q */
    public final f91 f40094q;

    public ph5(c2g.C12539c c12539c) {
        sq8.m48649h(c12539c, "config");
        this.f40086a = c12539c;
        this.f40087b = new q7f(null, 1, null);
        this.f40088c = new i7f(m43676a().mo20110b());
        this.f40089d = new g2g(m43676a());
        List listM20113e = m43676a().m20113e();
        LinkedHashMap linkedHashMap = new LinkedHashMap(bce.m18601d(hsa.m31055e(dh3.m23088v(listM20113e, 10)), 16));
        for (Object obj : listM20113e) {
            linkedHashMap.put(d01.m22166d(((c01) obj).mo19992a()), obj);
        }
        Map mapM32696w = isa.m32696w(linkedHashMap);
        d01.C12776a c12776a = d01.f18915b;
        d01 d01VarM22166d = d01.m22166d(c12776a.m22174b());
        if (mapM32696w.get(d01VarM22166d) == null) {
            mapM32696w.put(d01VarM22166d, new nrf(cc5.m20837c(), "sso-oauth"));
        }
        d01 d01VarM22166d2 = d01.m22166d(c12776a.m22173a());
        if (mapM32696w.get(d01VarM22166d2) == null) {
            mapM32696w.put(d01VarM22166d2, sh0.f45416a);
        }
        this.f40090e = isa.m32693t(mapM32696w);
        this.f40091f = new b2g(m43676a());
        this.f40092g = "aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc";
        this.f40093h = new ydc("aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc", m43676a().m20122n());
        r7f.m46310a(this.f40087b, m43676a().mo20110b());
        r7f.m46310a(this.f40087b, m43676a().m20115g());
        this.f40094q = f91.f22967i.m26297a(new ji0("SSO OIDC", "1.3.81"), m43676a().m20111c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p001o.c2g
    public Object E2(sa4 sa4Var, n64 n64Var) {
        j7f.C14471a c14471a = j7f.f29929h;
        k7f k7fVar = new k7f(kge.m35689b(sa4.class), kge.m35689b(ta4.class));
        k7fVar.m35122h(new qa4());
        k7fVar.m35119e(new oa4());
        k7fVar.m35121g("CreateToken");
        k7fVar.m35124j("SSO OIDC");
        z7f z7fVarM35118d = k7fVar.m35118d();
        z7fVarM35118d.m58874i(m43676a().m20122n());
        z7fVarM35118d.m58875j(this.f40092g);
        z7fVarM35118d.m58873h(this.f40093h);
        rx0 rx0Var = new rx0();
        rx0Var.m47216b("rpc.system", "aws-api");
        z7fVarM35118d.m58872g(rx0Var.m47215a());
        k7fVar.m35117c().m51149i(new qdc(this.f40091f, this.f40090e, this.f40089d));
        k7fVar.m35117c().m51150j(new j86(m43676a()));
        k7fVar.m35117c().m51152l(m43676a().mo20109a());
        k7fVar.m35117c().m51151k(m43676a().m20121m());
        j7f j7fVarM35115a = k7fVar.m35115a();
        m43677c(j7fVarM35115a.m33381a());
        j7fVarM35115a.m33389i(new l81());
        j7fVarM35115a.m33384d().add(b91.f15688a);
        j7fVarM35115a.m33384d().add(new mo1());
        j7fVarM35115a.m33388h(new dai(this.f40094q));
        j7fVarM35115a.m33388h(new vfe(null, 1, 0 == true ? 1 : 0));
        j7fVarM35115a.m33384d().addAll(m43676a().m20118j());
        return l7f.m36671e(j7fVarM35115a, this.f40088c, sa4Var, n64Var);
    }

    /* renamed from: a */
    public c2g.C12539c m43676a() {
        return this.f40086a;
    }

    /* renamed from: c */
    public final void m43677c(jl6 jl6Var) {
        e7f e7fVar = e7f.f21127a;
        tx0.m50741f(jl6Var, e7fVar.m24494a(), m43676a().m20114f());
        tx0.m50741f(jl6Var, e7fVar.m24496c(), m43676a().m20119k());
        tx0.m50742g(jl6Var, d71.f19162a.m22387a(), m43676a().m20120l());
        x81 x81Var = x81.f53319a;
        tx0.m50742g(jl6Var, x81Var.m55806j(), m43676a().m20120l());
        tx0.m50741f(jl6Var, x81Var.m55808l(), "sso-oauth");
        tx0.m50741f(jl6Var, x81Var.m55798b(), m43676a().m20115g());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f40087b.m44937b();
    }
}
