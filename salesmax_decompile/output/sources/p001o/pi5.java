package p001o;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p001o.j7f;
import p001o.njh;

/* loaded from: classes3.dex */
public final class pi5 implements njh {

    /* renamed from: a */
    public final njh.C15595c f40133a;

    /* renamed from: b */
    public final q7f f40134b;

    /* renamed from: c */
    public final i7f f40135c;

    /* renamed from: d */
    public final rjh f40136d;

    /* renamed from: e */
    public final Map f40137e;

    /* renamed from: f */
    public final mjh f40138f;

    /* renamed from: g */
    public final String f40139g;

    /* renamed from: h */
    public final ydc f40140h;

    /* renamed from: q */
    public final f91 f40141q;

    public pi5(njh.C15595c c15595c) {
        sq8.m48649h(c15595c, "config");
        this.f40133a = c15595c;
        this.f40134b = new q7f(null, 1, null);
        this.f40135c = new i7f(m43723a().mo20110b());
        this.f40136d = new rjh(m43723a());
        List listM40688e = m43723a().m40688e();
        LinkedHashMap linkedHashMap = new LinkedHashMap(bce.m18601d(hsa.m31055e(dh3.m23088v(listM40688e, 10)), 16));
        for (Object obj : listM40688e) {
            linkedHashMap.put(d01.m22166d(((c01) obj).mo19992a()), obj);
        }
        Map mapM32696w = isa.m32696w(linkedHashMap);
        d01 d01VarM22166d = d01.m22166d(d01.f18915b.m22174b());
        if (mapM32696w.get(d01VarM22166d) == null) {
            mapM32696w.put(d01VarM22166d, new nrf(cc5.m20837c(), "textract"));
        }
        this.f40137e = isa.m32693t(mapM32696w);
        this.f40138f = new mjh(m43723a());
        this.f40139g = "aws.sdk.kotlin.services.textract";
        this.f40140h = new ydc("aws.sdk.kotlin.services.textract", m43723a().m40698o());
        r7f.m46310a(this.f40134b, m43723a().mo20110b());
        r7f.m46310a(this.f40134b, m43723a().m40690g());
        this.f40141q = f91.f22967i.m26297a(new ji0("Textract", "1.3.81"), m43723a().m40686c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p001o.njh
    public Object L2(qc0 qc0Var, n64 n64Var) {
        j7f.C14471a c14471a = j7f.f29929h;
        k7f k7fVar = new k7f(kge.m35689b(qc0.class), kge.m35689b(rc0.class));
        k7fVar.m35122h(new oc0());
        k7fVar.m35119e(new mc0());
        k7fVar.m35121g("AnalyzeDocument");
        k7fVar.m35124j("Textract");
        z7f z7fVarM35118d = k7fVar.m35118d();
        z7fVarM35118d.m58874i(m43723a().m40698o());
        z7fVarM35118d.m58875j(this.f40139g);
        z7fVarM35118d.m58873h(this.f40140h);
        rx0 rx0Var = new rx0();
        rx0Var.m47216b("rpc.system", "aws-api");
        z7fVarM35118d.m58872g(rx0Var.m47215a());
        k7fVar.m35117c().m51149i(new qdc(this.f40138f, this.f40137e, this.f40136d));
        k7fVar.m35117c().m51150j(new r86(m43723a()));
        k7fVar.m35117c().m51152l(m43723a().mo20109a());
        k7fVar.m35117c().m51151k(m43723a().m40697n());
        j7f j7fVarM35115a = k7fVar.m35115a();
        m43724c(j7fVarM35115a.m33381a());
        j7fVarM35115a.m33389i(new l81());
        j7fVarM35115a.m33384d().add(b91.f15688a);
        j7fVarM35115a.m33384d().add(new mo1());
        j7fVarM35115a.m33388h(new h81("Textract", "1.1"));
        j7fVarM35115a.m33388h(new dai(this.f40141q));
        j7fVarM35115a.m33388h(new vfe(null, 1, 0 == true ? 1 : 0));
        j7fVarM35115a.m33384d().addAll(m43723a().m40694k());
        return l7f.m36671e(j7fVarM35115a, this.f40135c, qc0Var, n64Var);
    }

    /* renamed from: a */
    public njh.C15595c m43723a() {
        return this.f40133a;
    }

    /* renamed from: c */
    public final void m43724c(jl6 jl6Var) {
        e7f e7fVar = e7f.f21127a;
        tx0.m50741f(jl6Var, e7fVar.m24494a(), m43723a().m40689f());
        tx0.m50741f(jl6Var, e7fVar.m24496c(), m43723a().m40695l());
        tx0.m50742g(jl6Var, e7fVar.m24495b(), m43723a().m40693j());
        tx0.m50742g(jl6Var, d71.f19162a.m22387a(), m43723a().m40696m());
        x81 x81Var = x81.f53319a;
        tx0.m50742g(jl6Var, x81Var.m55806j(), m43723a().m40696m());
        tx0.m50741f(jl6Var, x81Var.m55808l(), "textract");
        tx0.m50741f(jl6Var, x81Var.m55798b(), m43723a().m40690g());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f40134b.m44937b();
    }
}
