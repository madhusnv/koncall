package p001o;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p001o.j7f;
import p001o.xvh;

/* loaded from: classes3.dex */
public final class qj5 implements xvh {

    /* renamed from: a */
    public final xvh.C18256c f42055a;

    /* renamed from: b */
    public final q7f f42056b;

    /* renamed from: c */
    public final i7f f42057c;

    /* renamed from: d */
    public final bwh f42058d;

    /* renamed from: e */
    public final Map f42059e;

    /* renamed from: f */
    public final wvh f42060f;

    /* renamed from: g */
    public final String f42061g;

    /* renamed from: h */
    public final ydc f42062h;

    /* renamed from: q */
    public final f91 f42063q;

    public qj5(xvh.C18256c c18256c) {
        sq8.m48649h(c18256c, "config");
        this.f42055a = c18256c;
        this.f42056b = new q7f(null, 1, null);
        this.f42057c = new i7f(m45531a().mo20110b());
        this.f42058d = new bwh(m45531a());
        List listM56881e = m45531a().m56881e();
        LinkedHashMap linkedHashMap = new LinkedHashMap(bce.m18601d(hsa.m31055e(dh3.m23088v(listM56881e, 10)), 16));
        for (Object obj : listM56881e) {
            linkedHashMap.put(d01.m22166d(((c01) obj).mo19992a()), obj);
        }
        Map mapM32696w = isa.m32696w(linkedHashMap);
        d01 d01VarM22166d = d01.m22166d(d01.f18915b.m22174b());
        if (mapM32696w.get(d01VarM22166d) == null) {
            mapM32696w.put(d01VarM22166d, new nrf(cc5.m20837c(), "translate"));
        }
        this.f42059e = isa.m32693t(mapM32696w);
        this.f42060f = new wvh(m45531a());
        this.f42061g = "aws.sdk.kotlin.services.translate";
        this.f42062h = new ydc("aws.sdk.kotlin.services.translate", m45531a().m56891o());
        r7f.m46310a(this.f42056b, m45531a().mo20110b());
        r7f.m46310a(this.f42056b, m45531a().m56883g());
        this.f42063q = f91.f22967i.m26297a(new ji0("Translate", "1.3.81"), m45531a().m56879c());
    }

    /* renamed from: a */
    public xvh.C18256c m45531a() {
        return this.f42055a;
    }

    /* renamed from: c */
    public final void m45532c(jl6 jl6Var) {
        e7f e7fVar = e7f.f21127a;
        tx0.m50741f(jl6Var, e7fVar.m24494a(), m45531a().m56882f());
        tx0.m50741f(jl6Var, e7fVar.m24496c(), m45531a().m56888l());
        tx0.m50742g(jl6Var, e7fVar.m24495b(), m45531a().m56886j());
        tx0.m50742g(jl6Var, d71.f19162a.m22387a(), m45531a().m56889m());
        x81 x81Var = x81.f53319a;
        tx0.m50742g(jl6Var, x81Var.m55806j(), m45531a().m56889m());
        tx0.m50741f(jl6Var, x81Var.m55808l(), "translate");
        tx0.m50741f(jl6Var, x81Var.m55798b(), m45531a().m56883g());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f42056b.m44937b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p001o.xvh
    public Object l3(gwh gwhVar, n64 n64Var) {
        j7f.C14471a c14471a = j7f.f29929h;
        k7f k7fVar = new k7f(kge.m35689b(gwh.class), kge.m35689b(hwh.class));
        k7fVar.m35122h(new ewh());
        k7fVar.m35119e(new cwh());
        k7fVar.m35121g("TranslateText");
        k7fVar.m35124j("Translate");
        z7f z7fVarM35118d = k7fVar.m35118d();
        z7fVarM35118d.m58874i(m45531a().m56891o());
        z7fVarM35118d.m58875j(this.f42061g);
        z7fVarM35118d.m58873h(this.f42062h);
        rx0 rx0Var = new rx0();
        rx0Var.m47216b("rpc.system", "aws-api");
        z7fVarM35118d.m58872g(rx0Var.m47215a());
        k7fVar.m35117c().m51149i(new qdc(this.f42060f, this.f42059e, this.f42058d));
        k7fVar.m35117c().m51150j(new i86(m45531a()));
        k7fVar.m35117c().m51152l(m45531a().mo20109a());
        k7fVar.m35117c().m51151k(m45531a().m56890n());
        j7f j7fVarM35115a = k7fVar.m35115a();
        m45532c(j7fVarM35115a.m33381a());
        j7fVarM35115a.m33389i(new l81());
        j7fVarM35115a.m33384d().add(b91.f15688a);
        j7fVarM35115a.m33384d().add(new mo1());
        j7fVarM35115a.m33388h(new h81("AWSShineFrontendService_20170701", "1.1"));
        j7fVarM35115a.m33388h(new dai(this.f42063q));
        j7fVarM35115a.m33388h(new vfe(null, 1, 0 == true ? 1 : 0));
        j7fVarM35115a.m33384d().addAll(m45531a().m56887k());
        return l7f.m36671e(j7fVarM35115a, this.f42057c, gwhVar, n64Var);
    }
}
