package p001o;

import com.amazonaws.regions.ServiceAbbreviations;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p001o.d01;
import p001o.j7f;
import p001o.z9g;

/* loaded from: classes2.dex */
public final class sh5 implements z9g {

    /* renamed from: a */
    public final z9g.C18593c f45430a;

    /* renamed from: b */
    public final q7f f45431b;

    /* renamed from: c */
    public final i7f f45432c;

    /* renamed from: d */
    public final dag f45433d;

    /* renamed from: e */
    public final Map f45434e;

    /* renamed from: f */
    public final y9g f45435f;

    /* renamed from: g */
    public final String f45436g;

    /* renamed from: h */
    public final ydc f45437h;

    /* renamed from: q */
    public final f91 f45438q;

    public sh5(z9g.C18593c c18593c) {
        sq8.m48649h(c18593c, "config");
        this.f45430a = c18593c;
        this.f45431b = new q7f(null, 1, null);
        this.f45432c = new i7f(getConfig().mo20110b());
        this.f45433d = new dag(getConfig());
        List listM59009e = getConfig().m59009e();
        LinkedHashMap linkedHashMap = new LinkedHashMap(bce.m18601d(hsa.m31055e(dh3.m23088v(listM59009e, 10)), 16));
        for (Object obj : listM59009e) {
            linkedHashMap.put(d01.m22166d(((c01) obj).mo19992a()), obj);
        }
        Map mapM32696w = isa.m32696w(linkedHashMap);
        d01.C12776a c12776a = d01.f18915b;
        d01 d01VarM22166d = d01.m22166d(c12776a.m22174b());
        if (mapM32696w.get(d01VarM22166d) == null) {
            mapM32696w.put(d01VarM22166d, new nrf(cc5.m20837c(), ServiceAbbreviations.STS));
        }
        d01 d01VarM22166d2 = d01.m22166d(c12776a.m22173a());
        if (mapM32696w.get(d01VarM22166d2) == null) {
            mapM32696w.put(d01VarM22166d2, sh0.f45416a);
        }
        this.f45434e = isa.m32693t(mapM32696w);
        this.f45435f = new y9g(getConfig());
        this.f45436g = "aws.sdk.kotlin.runtime.auth.credentials.internal.sts";
        this.f45437h = new ydc("aws.sdk.kotlin.runtime.auth.credentials.internal.sts", getConfig().m59018n());
        r7f.m46310a(this.f45431b, getConfig().mo20110b());
        r7f.m46310a(this.f45431b, getConfig().m59011g());
        this.f45438q = f91.f22967i.m26297a(new ji0("STS", "1.3.81"), getConfig().m59007c());
    }

    /* renamed from: a */
    public final void m48350a(jl6 jl6Var) {
        e7f e7fVar = e7f.f21127a;
        tx0.m50741f(jl6Var, e7fVar.m24494a(), getConfig().m59010f());
        tx0.m50741f(jl6Var, e7fVar.m24496c(), getConfig().m59015k());
        tx0.m50742g(jl6Var, d71.f19162a.m22387a(), getConfig().m59016l());
        x81 x81Var = x81.f53319a;
        tx0.m50742g(jl6Var, x81Var.m55806j(), getConfig().m59016l());
        tx0.m50741f(jl6Var, x81Var.m55808l(), ServiceAbbreviations.STS);
        tx0.m50741f(jl6Var, x81Var.m55798b(), getConfig().m59011g());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f45431b.m44937b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p001o.z9g
    public Object g0(sr0 sr0Var, n64 n64Var) {
        j7f.C14471a c14471a = j7f.f29929h;
        k7f k7fVar = new k7f(kge.m35689b(sr0.class), kge.m35689b(tr0.class));
        k7fVar.m35122h(new or0());
        k7fVar.m35119e(new mr0());
        k7fVar.m35121g("AssumeRoleWithWebIdentity");
        k7fVar.m35124j("STS");
        z7f z7fVarM35118d = k7fVar.m35118d();
        z7fVarM35118d.m58874i(getConfig().m59018n());
        z7fVarM35118d.m58875j(this.f45436g);
        z7fVarM35118d.m58873h(this.f45437h);
        rx0 rx0Var = new rx0();
        rx0Var.m47216b("rpc.system", "aws-api");
        z7fVarM35118d.m58872g(rx0Var.m47215a());
        k7fVar.m35117c().m51149i(new qdc(this.f45435f, this.f45434e, this.f45433d));
        k7fVar.m35117c().m51150j(new k86(getConfig()));
        k7fVar.m35117c().m51152l(getConfig().mo20109a());
        k7fVar.m35117c().m51151k(getConfig().m59017m());
        j7f j7fVarM35115a = k7fVar.m35115a();
        m48350a(j7fVarM35115a.m33381a());
        j7fVarM35115a.m33389i(new l81());
        j7fVarM35115a.m33384d().add(b91.f15688a);
        j7fVarM35115a.m33384d().add(new mo1());
        jqb jqbVar = new jqb(null, null, null, 7, null);
        jqbVar.m34283f("Content-Type", "application/x-www-form-urlencoded");
        j7fVarM35115a.m33388h(jqbVar);
        j7fVarM35115a.m33388h(new dai(this.f45438q));
        j7fVarM35115a.m33388h(new vfe(null, 1, 0 == true ? 1 : 0));
        j7fVarM35115a.m33384d().addAll(getConfig().m59014j());
        return l7f.m36671e(j7fVarM35115a, this.f45432c, sr0Var, n64Var);
    }

    @Override // p001o.z9g
    public z9g.C18593c getConfig() {
        return this.f45430a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p001o.z9g
    public Object l1(kr0 kr0Var, n64 n64Var) {
        j7f.C14471a c14471a = j7f.f29929h;
        k7f k7fVar = new k7f(kge.m35689b(kr0.class), kge.m35689b(lr0.class));
        k7fVar.m35122h(new fr0());
        k7fVar.m35119e(new dr0());
        k7fVar.m35121g("AssumeRole");
        k7fVar.m35124j("STS");
        z7f z7fVarM35118d = k7fVar.m35118d();
        z7fVarM35118d.m58874i(getConfig().m59018n());
        z7fVarM35118d.m58875j(this.f45436g);
        z7fVarM35118d.m58873h(this.f45437h);
        rx0 rx0Var = new rx0();
        rx0Var.m47216b("rpc.system", "aws-api");
        z7fVarM35118d.m58872g(rx0Var.m47215a());
        k7fVar.m35117c().m51149i(new qdc(this.f45435f, this.f45434e, this.f45433d));
        k7fVar.m35117c().m51150j(new k86(getConfig()));
        k7fVar.m35117c().m51152l(getConfig().mo20109a());
        k7fVar.m35117c().m51151k(getConfig().m59017m());
        j7f j7fVarM35115a = k7fVar.m35115a();
        m48350a(j7fVarM35115a.m33381a());
        j7fVarM35115a.m33389i(new l81());
        j7fVarM35115a.m33384d().add(b91.f15688a);
        j7fVarM35115a.m33384d().add(new mo1());
        jqb jqbVar = new jqb(null, null, null, 7, null);
        jqbVar.m34283f("Content-Type", "application/x-www-form-urlencoded");
        j7fVarM35115a.m33388h(jqbVar);
        j7fVarM35115a.m33388h(new dai(this.f45438q));
        j7fVarM35115a.m33388h(new vfe(null, 1, 0 == true ? 1 : 0));
        j7fVarM35115a.m33384d().addAll(getConfig().m59014j());
        return l7f.m36671e(j7fVarM35115a, this.f45432c, kr0Var, n64Var);
    }
}
