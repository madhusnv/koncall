package p001o;

import com.amazonaws.regions.ServiceAbbreviations;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p001o.cxe;
import p001o.d01;
import p001o.j7f;

/* loaded from: classes3.dex */
public final class og5 implements cxe {

    /* renamed from: a */
    public final cxe.C12766c f38318a;

    /* renamed from: b */
    public final q7f f38319b;

    /* renamed from: c */
    public final i7f f38320c;

    /* renamed from: d */
    public final qxe f38321d;

    /* renamed from: e */
    public final Map f38322e;

    /* renamed from: f */
    public final bxe f38323f;

    /* renamed from: g */
    public final String f38324g;

    /* renamed from: h */
    public final ydc f38325h;

    /* renamed from: q */
    public final f91 f38326q;

    public og5(cxe.C12766c c12766c) {
        sq8.m48649h(c12766c, "config");
        this.f38318a = c12766c;
        this.f38319b = new q7f(null, 1, null);
        this.f38320c = new i7f(getConfig().mo20110b());
        this.f38321d = new qxe(getConfig());
        List listM21980e = getConfig().m21980e();
        LinkedHashMap linkedHashMap = new LinkedHashMap(bce.m18601d(hsa.m31055e(dh3.m23088v(listM21980e, 10)), 16));
        for (Object obj : listM21980e) {
            linkedHashMap.put(d01.m22166d(((c01) obj).mo19992a()), obj);
        }
        Map mapM32696w = isa.m32696w(linkedHashMap);
        d01.C12776a c12776a = d01.f18915b;
        d01 d01VarM22166d = d01.m22166d(c12776a.m22174b());
        if (mapM32696w.get(d01VarM22166d) == null) {
            mapM32696w.put(d01VarM22166d, new nrf(cc5.m20837c(), ServiceAbbreviations.S3));
        }
        d01 d01VarM22166d2 = d01.m22166d(c12776a.m22175c());
        if (mapM32696w.get(d01VarM22166d2) == null) {
            mapM32696w.put(d01VarM22166d2, new lrf(cc5.m20837c(), ServiceAbbreviations.S3));
        }
        d01 d01VarM22166d3 = d01.m22166d(d01.m22167e("aws.auth#sigv4s3express"));
        if (mapM32696w.get(d01VarM22166d3) == null) {
            mapM32696w.put(d01VarM22166d3, new prf(cc5.m20837c(), ServiceAbbreviations.S3));
        }
        this.f38322e = isa.m32693t(mapM32696w);
        this.f38323f = new bxe(getConfig());
        this.f38324g = "aws.sdk.kotlin.services.s3";
        this.f38325h = new ydc("aws.sdk.kotlin.services.s3", getConfig().m21997v());
        r7f.m46310a(this.f38319b, getConfig().mo20110b());
        r7f.m46310a(this.f38319b, getConfig().m21990o());
        r7f.m46310a(this.f38319b, getConfig().m21983h());
        this.f38326q = f91.f22967i.m26297a(new ji0("S3", "1.3.81"), getConfig().m21978c());
    }

    /* renamed from: f */
    public static final boolean m42210f(wq7 wq7Var) {
        sq8.m48649h(wq7Var, "it");
        wq7Var.m54809b();
        return sq8.m48644c(null, "ENABLED");
    }

    /* renamed from: h */
    public static final String m42211h(s3e s3eVar, s3e s3eVar2) {
        sq8.m48649h(s3eVar2, "it");
        t83 t83VarM47594f = s3eVar.m47594f();
        if (t83VarM47594f != null) {
            return t83VarM47594f.mo49556a();
        }
        return null;
    }

    /* renamed from: k */
    public static final String m42212k(c7i c7iVar, c7i c7iVar2) {
        sq8.m48649h(c7iVar2, "it");
        t83 t83VarM20379c = c7iVar.m20379c();
        if (t83VarM20379c != null) {
            return t83VarM20379c.mo49556a();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p001o.cxe
    public Object A1(ma4 ma4Var, n64 n64Var) {
        j7f.C14471a c14471a = j7f.f29929h;
        k7f k7fVar = new k7f(kge.m35689b(ma4.class), kge.m35689b(na4.class));
        k7fVar.m35122h(new la4());
        k7fVar.m35119e(new ja4());
        k7fVar.m35121g("CreateSession");
        k7fVar.m35124j("S3");
        z7f z7fVarM35118d = k7fVar.m35118d();
        z7fVarM35118d.m58874i(getConfig().m21997v());
        z7fVarM35118d.m58875j(this.f38324g);
        z7fVarM35118d.m58873h(this.f38325h);
        rx0 rx0Var = new rx0();
        rx0Var.m47216b("rpc.system", "aws-api");
        z7fVarM35118d.m58872g(rx0Var.m47215a());
        k7fVar.m35117c().m51149i(new qdc(this.f38323f, this.f38322e, this.f38321d));
        k7fVar.m35117c().m51150j(new q86(getConfig()));
        k7fVar.m35117c().m51152l(getConfig().mo20109a());
        k7fVar.m35117c().m51151k(getConfig().m21995t());
        j7f j7fVarM35115a = k7fVar.m35115a();
        m42213g(j7fVarM35115a.m33381a());
        j7fVarM35115a.m33389i(new l81());
        j7fVarM35115a.m33384d().add(b91.f15688a);
        j7fVarM35115a.m33384d().add(bw7.f16923a);
        j7fVarM35115a.m33384d().add(new c6i());
        jl6 jl6VarM33381a = j7fVarM35115a.m33381a();
        ywe yweVar = ywe.f56214a;
        jl6VarM33381a.mo34002p(yweVar.m58457b(), this);
        String strM38614a = ma4Var.m38614a();
        if (strM38614a != null) {
            j7fVarM35115a.m33381a().mo34002p(yweVar.m58456a(), strM38614a);
        }
        j7fVarM35115a.m33384d().add(new mo1());
        j7fVarM35115a.m33388h(new dai(this.f38326q));
        j7fVarM35115a.m33388h(new vfe(null, 1, 0 == true ? 1 : 0));
        j7fVarM35115a.m33384d().addAll(getConfig().m21992q());
        return l7f.m36671e(j7fVarM35115a, this.f38320c, ma4Var, n64Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p001o.cxe
    /* renamed from: E */
    public Object mo21970E(ca4 ca4Var, n64 n64Var) {
        j7f.C14471a c14471a = j7f.f29929h;
        k7f k7fVar = new k7f(kge.m35689b(ca4.class), kge.m35689b(da4.class));
        k7fVar.m35122h(new ba4());
        k7fVar.m35119e(new y94());
        k7fVar.m35121g("CreateMultipartUpload");
        k7fVar.m35124j("S3");
        z7f z7fVarM35118d = k7fVar.m35118d();
        z7fVarM35118d.m58874i(getConfig().m21997v());
        z7fVarM35118d.m58875j(this.f38324g);
        z7fVarM35118d.m58873h(this.f38325h);
        rx0 rx0Var = new rx0();
        rx0Var.m47216b("rpc.system", "aws-api");
        z7fVarM35118d.m58872g(rx0Var.m47215a());
        k7fVar.m35117c().m51149i(new qdc(this.f38323f, this.f38322e, this.f38321d));
        k7fVar.m35117c().m51150j(new q86(getConfig()));
        k7fVar.m35117c().m51152l(getConfig().mo20109a());
        k7fVar.m35117c().m51151k(getConfig().m21995t());
        j7f j7fVarM35115a = k7fVar.m35115a();
        m42213g(j7fVarM35115a.m33381a());
        j7fVarM35115a.m33389i(new l81());
        j7fVarM35115a.m33384d().add(b91.f15688a);
        j7fVarM35115a.m33384d().add(bw7.f16923a);
        j7fVarM35115a.m33384d().add(new c6i());
        jl6 jl6VarM33381a = j7fVarM35115a.m33381a();
        ywe yweVar = ywe.f56214a;
        jl6VarM33381a.mo34002p(yweVar.m58457b(), this);
        String strM20553b = ca4Var.m20553b();
        if (strM20553b != null) {
            j7fVarM35115a.m33381a().mo34002p(yweVar.m58456a(), strM20553b);
        }
        j7fVarM35115a.m33384d().add(xo6.f54001a);
        j7fVarM35115a.m33384d().add(new mo1());
        j7fVarM35115a.m33388h(new dai(this.f38326q));
        j7fVarM35115a.m33388h(new vfe(null, 1, 0 == true ? 1 : 0));
        j7fVarM35115a.m33384d().addAll(getConfig().m21992q());
        return l7f.m36671e(j7fVarM35115a, this.f38320c, ca4Var, n64Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p001o.cxe
    public Object Q1(fl5 fl5Var, n64 n64Var) {
        j7f.C14471a c14471a = j7f.f29929h;
        k7f k7fVar = new k7f(kge.m35689b(fl5.class), kge.m35689b(gl5.class));
        k7fVar.m35122h(new el5());
        k7fVar.m35119e(new al5());
        k7fVar.m35121g("DeleteObject");
        k7fVar.m35124j("S3");
        z7f z7fVarM35118d = k7fVar.m35118d();
        z7fVarM35118d.m58874i(getConfig().m21997v());
        z7fVarM35118d.m58875j(this.f38324g);
        z7fVarM35118d.m58873h(this.f38325h);
        rx0 rx0Var = new rx0();
        rx0Var.m47216b("rpc.system", "aws-api");
        z7fVarM35118d.m58872g(rx0Var.m47215a());
        k7fVar.m35117c().m51149i(new qdc(this.f38323f, this.f38322e, this.f38321d));
        k7fVar.m35117c().m51150j(new q86(getConfig()));
        k7fVar.m35117c().m51152l(getConfig().mo20109a());
        k7fVar.m35117c().m51151k(getConfig().m21995t());
        j7f j7fVarM35115a = k7fVar.m35115a();
        m42213g(j7fVarM35115a.m33381a());
        j7fVarM35115a.m33389i(new l81());
        j7fVarM35115a.m33384d().add(b91.f15688a);
        j7fVarM35115a.m33384d().add(bw7.f16923a);
        j7fVarM35115a.m33384d().add(new c6i());
        jl6 jl6VarM33381a = j7fVarM35115a.m33381a();
        ywe yweVar = ywe.f56214a;
        jl6VarM33381a.mo34002p(yweVar.m58457b(), this);
        String strM26992a = fl5Var.m26992a();
        if (strM26992a != null) {
            j7fVarM35115a.m33381a().mo34002p(yweVar.m58456a(), strM26992a);
        }
        j7fVarM35115a.m33384d().add(new mo1());
        j7fVarM35115a.m33388h(new dai(this.f38326q));
        j7fVarM35115a.m33388h(new vfe(null, 1, 0 == true ? 1 : 0));
        j7fVarM35115a.m33384d().addAll(getConfig().m21992q());
        return l7f.m36671e(j7fVarM35115a, this.f38320c, fl5Var, n64Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p001o.cxe
    public Object V1(final c7i c7iVar, n64 n64Var) {
        j7f.C14471a c14471a = j7f.f29929h;
        k7f k7fVar = new k7f(kge.m35689b(c7i.class), kge.m35689b(d7i.class));
        k7fVar.m35122h(new b7i());
        k7fVar.m35119e(new x6i());
        k7fVar.m35121g("UploadPart");
        k7fVar.m35124j("S3");
        z7f z7fVarM35118d = k7fVar.m35118d();
        z7fVarM35118d.m58874i(getConfig().m21997v());
        z7fVarM35118d.m58875j(this.f38324g);
        z7fVarM35118d.m58873h(this.f38325h);
        rx0 rx0Var = new rx0();
        rx0Var.m47216b("rpc.system", "aws-api");
        z7fVarM35118d.m58872g(rx0Var.m47215a());
        k7fVar.m35117c().m51149i(new qdc(this.f38323f, this.f38322e, this.f38321d));
        k7fVar.m35117c().m51150j(new q86(getConfig()));
        k7fVar.m35117c().m51152l(getConfig().mo20109a());
        k7fVar.m35117c().m51151k(getConfig().m21995t());
        j7f j7fVarM35115a = k7fVar.m35115a();
        m42213g(j7fVarM35115a.m33381a());
        j7fVarM35115a.m33389i(new l81());
        j7fVarM35115a.m33384d().add(b91.f15688a);
        j7fVarM35115a.m33384d().add(new s27(new xk7() { // from class: o.mg5
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return og5.m42212k(c7iVar, (c7i) obj);
            }
        }));
        t83 t83VarM20379c = c7iVar.m20379c();
        if (t83VarM20379c != null) {
            j7fVarM35115a.m33381a().mo34002p(s38.f44646a.m47565a(), t83VarM20379c.mo49556a());
        }
        Long lM21982g = getConfig().m21982g();
        if (lM21982g != null) {
            ml1.m39301a(j7fVarM35115a.m33384d().add(new r64(lM21982g.longValue())));
        }
        j7fVarM35115a.m33384d().add(bw7.f16923a);
        j7fVarM35115a.m33384d().add(new c6i());
        jl6 jl6VarM33381a = j7fVarM35115a.m33381a();
        ywe yweVar = ywe.f56214a;
        jl6VarM33381a.mo34002p(yweVar.m58457b(), this);
        String strM20378b = c7iVar.m20378b();
        if (strM20378b != null) {
            j7fVarM35115a.m33381a().mo34002p(yweVar.m58456a(), strM20378b);
        }
        j7fVarM35115a.m33384d().add(new oxe());
        j7fVarM35115a.m33384d().add(new mo1());
        j7fVarM35115a.m33388h(new dai(this.f38326q));
        j7fVarM35115a.m33388h(new vfe(null, 1, 0 == true ? 1 : 0));
        j7fVarM35115a.m33384d().addAll(getConfig().m21992q());
        return l7f.m36671e(j7fVarM35115a, this.f38320c, c7iVar, n64Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p001o.cxe
    public Object X2(final s3e s3eVar, n64 n64Var) {
        j7f.C14471a c14471a = j7f.f29929h;
        k7f k7fVar = new k7f(kge.m35689b(s3e.class), kge.m35689b(t3e.class));
        k7fVar.m35122h(new r3e());
        k7fVar.m35119e(new o3e());
        k7fVar.m35121g("PutObject");
        k7fVar.m35124j("S3");
        z7f z7fVarM35118d = k7fVar.m35118d();
        z7fVarM35118d.m58874i(getConfig().m21997v());
        z7fVarM35118d.m58875j(this.f38324g);
        z7fVarM35118d.m58873h(this.f38325h);
        rx0 rx0Var = new rx0();
        rx0Var.m47216b("rpc.system", "aws-api");
        z7fVarM35118d.m58872g(rx0Var.m47215a());
        k7fVar.m35117c().m51149i(new qdc(this.f38323f, this.f38322e, this.f38321d));
        k7fVar.m35117c().m51150j(new q86(getConfig()));
        k7fVar.m35117c().m51152l(getConfig().mo20109a());
        k7fVar.m35117c().m51151k(getConfig().m21995t());
        j7f j7fVarM35115a = k7fVar.m35115a();
        m42213g(j7fVarM35115a.m33381a());
        j7fVarM35115a.m33389i(new l81());
        j7fVarM35115a.m33384d().add(b91.f15688a);
        j7fVarM35115a.m33384d().add(new s27(new xk7() { // from class: o.lg5
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return og5.m42211h(s3eVar, (s3e) obj);
            }
        }));
        t83 t83VarM47594f = s3eVar.m47594f();
        if (t83VarM47594f != null) {
            j7fVarM35115a.m33381a().mo34002p(s38.f44646a.m47565a(), t83VarM47594f.mo49556a());
        }
        Long lM21982g = getConfig().m21982g();
        if (lM21982g != null) {
            ml1.m39301a(j7fVarM35115a.m33384d().add(new r64(lM21982g.longValue())));
        }
        j7fVarM35115a.m33384d().add(bw7.f16923a);
        j7fVarM35115a.m33384d().add(new c6i());
        jl6 jl6VarM33381a = j7fVarM35115a.m33381a();
        ywe yweVar = ywe.f56214a;
        jl6VarM33381a.mo34002p(yweVar.m58457b(), this);
        String strM47591c = s3eVar.m47591c();
        if (strM47591c != null) {
            j7fVarM35115a.m33381a().mo34002p(yweVar.m58456a(), strM47591c);
        }
        j7fVarM35115a.m33384d().add(xo6.f54001a);
        j7fVarM35115a.m33384d().add(new mo1());
        j7fVarM35115a.m33388h(new dai(this.f38326q));
        j7fVarM35115a.m33388h(new vfe(null, 1, 0 == true ? 1 : 0));
        j7fVarM35115a.m33384d().addAll(getConfig().m21992q());
        return l7f.m36671e(j7fVarM35115a, this.f38320c, s3eVar, n64Var);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f38319b.m44937b();
    }

    /* renamed from: g */
    public final void m42213g(jl6 jl6Var) {
        e7f e7fVar = e7f.f21127a;
        tx0.m50741f(jl6Var, e7fVar.m24494a(), getConfig().m21981f());
        tx0.m50741f(jl6Var, e7fVar.m24496c(), getConfig().m21993r());
        tx0.m50742g(jl6Var, d71.f19162a.m22387a(), getConfig().m21994s());
        x81 x81Var = x81.f53319a;
        tx0.m50742g(jl6Var, x81Var.m55806j(), getConfig().m21994s());
        tx0.m50741f(jl6Var, x81Var.m55808l(), ServiceAbbreviations.S3);
        tx0.m50741f(jl6Var, x81Var.m55798b(), getConfig().m21983h());
        tx0.m50742g(jl6Var, x81Var.m55797a(), getConfig().m21996u());
        kx0 kx0VarM55801e = x81Var.m55801e();
        Boolean bool = Boolean.FALSE;
        tx0.m50741f(jl6Var, kx0VarM55801e, bool);
        tx0.m50741f(jl6Var, x81Var.m55809m(), bool);
        tx0.m50741f(jl6Var, x81Var.m55804h(), u81.X_AMZ_CONTENT_SHA256);
        tx0.m50741f(jl6Var, x81Var.m55799c(), Boolean.valueOf(getConfig().m21987l()));
    }

    @Override // p001o.cxe
    public cxe.C12766c getConfig() {
        return this.f38318a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p001o.cxe
    public Object h0(qx7 qx7Var, n64 n64Var) {
        j7f.C14471a c14471a = j7f.f29929h;
        k7f k7fVar = new k7f(kge.m35689b(qx7.class), kge.m35689b(rx7.class));
        k7fVar.m35122h(new px7());
        k7fVar.m35119e(new lx7());
        k7fVar.m35121g("HeadObject");
        k7fVar.m35124j("S3");
        z7f z7fVarM35118d = k7fVar.m35118d();
        z7fVarM35118d.m58874i(getConfig().m21997v());
        z7fVarM35118d.m58875j(this.f38324g);
        z7fVarM35118d.m58873h(this.f38325h);
        rx0 rx0Var = new rx0();
        rx0Var.m47216b("rpc.system", "aws-api");
        z7fVarM35118d.m58872g(rx0Var.m47215a());
        k7fVar.m35117c().m51149i(new qdc(this.f38323f, this.f38322e, this.f38321d));
        k7fVar.m35117c().m51150j(new q86(getConfig()));
        k7fVar.m35117c().m51152l(getConfig().mo20109a());
        k7fVar.m35117c().m51151k(getConfig().m21995t());
        j7f j7fVarM35115a = k7fVar.m35115a();
        m42213g(j7fVarM35115a.m33381a());
        j7fVarM35115a.m33389i(new l81());
        j7fVarM35115a.m33384d().add(b91.f15688a);
        j7fVarM35115a.m33384d().add(bw7.f16923a);
        j7fVarM35115a.m33384d().add(new c6i());
        jl6 jl6VarM33381a = j7fVarM35115a.m33381a();
        ywe yweVar = ywe.f56214a;
        jl6VarM33381a.mo34002p(yweVar.m58457b(), this);
        String strM45904a = qx7Var.m45904a();
        if (strM45904a != null) {
            j7fVarM35115a.m33381a().mo34002p(yweVar.m58456a(), strM45904a);
        }
        j7fVarM35115a.m33384d().add(xo6.f54001a);
        j7fVarM35115a.m33384d().add(new mo1());
        j7fVarM35115a.m33388h(new dai(this.f38326q));
        j7fVarM35115a.m33388h(new vfe(null, 1, 0 == true ? 1 : 0));
        j7fVarM35115a.m33384d().addAll(getConfig().m21992q());
        return l7f.m36671e(j7fVarM35115a, this.f38320c, qx7Var, n64Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p001o.cxe
    public Object h1(am3 am3Var, n64 n64Var) {
        j7f.C14471a c14471a = j7f.f29929h;
        k7f k7fVar = new k7f(kge.m35689b(am3.class), kge.m35689b(bm3.class));
        k7fVar.m35122h(new zl3());
        k7fVar.m35119e(new vl3());
        k7fVar.m35121g("CompleteMultipartUpload");
        k7fVar.m35124j("S3");
        z7f z7fVarM35118d = k7fVar.m35118d();
        z7fVarM35118d.m58874i(getConfig().m21997v());
        z7fVarM35118d.m58875j(this.f38324g);
        z7fVarM35118d.m58873h(this.f38325h);
        rx0 rx0Var = new rx0();
        rx0Var.m47216b("rpc.system", "aws-api");
        z7fVarM35118d.m58872g(rx0Var.m47215a());
        k7fVar.m35117c().m51149i(new qdc(this.f38323f, this.f38322e, this.f38321d));
        k7fVar.m35117c().m51150j(new q86(getConfig()));
        k7fVar.m35117c().m51152l(getConfig().mo20109a());
        k7fVar.m35117c().m51151k(getConfig().m21995t());
        j7f j7fVarM35115a = k7fVar.m35115a();
        m42213g(j7fVarM35115a.m33381a());
        j7fVarM35115a.m33389i(new l81());
        j7fVarM35115a.m33384d().add(b91.f15688a);
        j7fVarM35115a.m33384d().add(bw7.f16923a);
        j7fVarM35115a.m33384d().add(new c6i());
        jl6 jl6VarM33381a = j7fVarM35115a.m33381a();
        ywe yweVar = ywe.f56214a;
        jl6VarM33381a.mo34002p(yweVar.m58457b(), this);
        String strM17403a = am3Var.m17403a();
        if (strM17403a != null) {
            j7fVarM35115a.m33381a().mo34002p(yweVar.m58456a(), strM17403a);
        }
        j7fVarM35115a.m33384d().add(new mo1());
        j7fVarM35115a.m33388h(new dai(this.f38326q));
        j7fVarM35115a.m33388h(new vfe(null, 1, 0 == true ? 1 : 0));
        j7fVarM35115a.m33384d().addAll(getConfig().m21992q());
        return l7f.m36671e(j7fVarM35115a, this.f38320c, am3Var, n64Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p001o.cxe
    public Object i2(efa efaVar, n64 n64Var) {
        j7f.C14471a c14471a = j7f.f29929h;
        k7f k7fVar = new k7f(kge.m35689b(efa.class), kge.m35689b(ffa.class));
        k7fVar.m35122h(new dfa());
        k7fVar.m35119e(new afa());
        k7fVar.m35121g("ListObjectsV2");
        k7fVar.m35124j("S3");
        z7f z7fVarM35118d = k7fVar.m35118d();
        z7fVarM35118d.m58874i(getConfig().m21997v());
        z7fVarM35118d.m58875j(this.f38324g);
        z7fVarM35118d.m58873h(this.f38325h);
        rx0 rx0Var = new rx0();
        rx0Var.m47216b("rpc.system", "aws-api");
        z7fVarM35118d.m58872g(rx0Var.m47215a());
        k7fVar.m35117c().m51149i(new qdc(this.f38323f, this.f38322e, this.f38321d));
        k7fVar.m35117c().m51150j(new q86(getConfig()));
        k7fVar.m35117c().m51152l(getConfig().mo20109a());
        k7fVar.m35117c().m51151k(getConfig().m21995t());
        j7f j7fVarM35115a = k7fVar.m35115a();
        m42213g(j7fVarM35115a.m33381a());
        j7fVarM35115a.m33389i(new l81());
        j7fVarM35115a.m33384d().add(b91.f15688a);
        j7fVarM35115a.m33384d().add(bw7.f16923a);
        j7fVarM35115a.m33384d().add(new c6i());
        jl6 jl6VarM33381a = j7fVarM35115a.m33381a();
        ywe yweVar = ywe.f56214a;
        jl6VarM33381a.mo34002p(yweVar.m58457b(), this);
        String strM24926a = efaVar.m24926a();
        if (strM24926a != null) {
            j7fVarM35115a.m33381a().mo34002p(yweVar.m58456a(), strM24926a);
        }
        j7fVarM35115a.m33384d().add(new mo1());
        j7fVarM35115a.m33388h(new dai(this.f38326q));
        j7fVarM35115a.m33388h(new vfe(null, 1, 0 == true ? 1 : 0));
        j7fVarM35115a.m33384d().addAll(getConfig().m21992q());
        return l7f.m36671e(j7fVarM35115a, this.f38320c, efaVar, n64Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p001o.cxe
    /* renamed from: v */
    public Object mo21971v(e6 e6Var, n64 n64Var) {
        j7f.C14471a c14471a = j7f.f29929h;
        k7f k7fVar = new k7f(kge.m35689b(e6.class), kge.m35689b(f6.class));
        k7fVar.m35122h(new d6());
        k7fVar.m35119e(new z5());
        k7fVar.m35121g("AbortMultipartUpload");
        k7fVar.m35124j("S3");
        z7f z7fVarM35118d = k7fVar.m35118d();
        z7fVarM35118d.m58874i(getConfig().m21997v());
        z7fVarM35118d.m58875j(this.f38324g);
        z7fVarM35118d.m58873h(this.f38325h);
        rx0 rx0Var = new rx0();
        rx0Var.m47216b("rpc.system", "aws-api");
        z7fVarM35118d.m58872g(rx0Var.m47215a());
        k7fVar.m35117c().m51149i(new qdc(this.f38323f, this.f38322e, this.f38321d));
        k7fVar.m35117c().m51150j(new q86(getConfig()));
        k7fVar.m35117c().m51152l(getConfig().mo20109a());
        k7fVar.m35117c().m51151k(getConfig().m21995t());
        j7f j7fVarM35115a = k7fVar.m35115a();
        m42213g(j7fVarM35115a.m33381a());
        j7fVarM35115a.m33389i(new l81());
        j7fVarM35115a.m33384d().add(b91.f15688a);
        j7fVarM35115a.m33384d().add(bw7.f16923a);
        j7fVarM35115a.m33384d().add(new c6i());
        jl6 jl6VarM33381a = j7fVarM35115a.m33381a();
        ywe yweVar = ywe.f56214a;
        jl6VarM33381a.mo34002p(yweVar.m58457b(), this);
        String strM24352a = e6Var.m24352a();
        if (strM24352a != null) {
            j7fVarM35115a.m33381a().mo34002p(yweVar.m58456a(), strM24352a);
        }
        j7fVarM35115a.m33384d().add(new mo1());
        j7fVarM35115a.m33388h(new dai(this.f38326q));
        j7fVarM35115a.m33388h(new vfe(null, 1, 0 == true ? 1 : 0));
        j7fVarM35115a.m33384d().addAll(getConfig().m21992q());
        return l7f.m36671e(j7fVarM35115a, this.f38320c, e6Var, n64Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p001o.cxe
    /* renamed from: w */
    public Object mo21972w(wq7 wq7Var, nl7 nl7Var, n64 n64Var) {
        j7f.C14471a c14471a = j7f.f29929h;
        k7f k7fVar = new k7f(kge.m35689b(wq7.class), kge.m35689b(xq7.class));
        k7fVar.m35122h(new vq7());
        k7fVar.m35119e(new rq7());
        k7fVar.m35121g("GetObject");
        k7fVar.m35124j("S3");
        z7f z7fVarM35118d = k7fVar.m35118d();
        z7fVarM35118d.m58874i(getConfig().m21997v());
        z7fVarM35118d.m58875j(this.f38324g);
        z7fVarM35118d.m58873h(this.f38325h);
        rx0 rx0Var = new rx0();
        rx0Var.m47216b("rpc.system", "aws-api");
        z7fVarM35118d.m58872g(rx0Var.m47215a());
        k7fVar.m35117c().m51149i(new qdc(this.f38323f, this.f38322e, this.f38321d));
        k7fVar.m35117c().m51150j(new q86(getConfig()));
        k7fVar.m35117c().m51152l(getConfig().mo20109a());
        k7fVar.m35117c().m51151k(getConfig().m21995t());
        j7f j7fVarM35115a = k7fVar.m35115a();
        m42213g(j7fVarM35115a.m33381a());
        j7fVarM35115a.m33389i(new l81());
        j7fVarM35115a.m33384d().add(b91.f15688a);
        j7fVarM35115a.m33384d().add(new v27(new xk7() { // from class: o.ng5
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return Boolean.valueOf(og5.m42210f((wq7) obj));
            }
        }));
        j7fVarM35115a.m33384d().add(new fre());
        j7fVarM35115a.m33384d().add(new c6i());
        jl6 jl6VarM33381a = j7fVarM35115a.m33381a();
        ywe yweVar = ywe.f56214a;
        jl6VarM33381a.mo34002p(yweVar.m58457b(), this);
        String strM54808a = wq7Var.m54808a();
        if (strM54808a != null) {
            j7fVarM35115a.m33381a().mo34002p(yweVar.m58456a(), strM54808a);
        }
        j7fVarM35115a.m33384d().add(xo6.f54001a);
        j7fVarM35115a.m33384d().add(new mo1());
        j7fVarM35115a.m33388h(new dai(this.f38326q));
        j7fVarM35115a.m33388h(new vfe(null, 1, 0 == true ? 1 : 0));
        j7fVarM35115a.m33384d().addAll(getConfig().m21992q());
        return l7f.m36669c(j7fVarM35115a, this.f38320c, wq7Var, nl7Var, n64Var);
    }
}
