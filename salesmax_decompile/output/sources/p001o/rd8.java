package p001o;

import android.util.Size;
import androidx.camera.core.AbstractC1892b;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import p001o.bhf;
import p001o.cd2;
import p001o.gjg;
import p001o.pd2;

/* loaded from: classes2.dex */
public class rd8 {

    /* renamed from: f */
    public static int f43398f;

    /* renamed from: g */
    public static final nm6 f43399g = new nm6();

    /* renamed from: a */
    public final tc8 f43400a;

    /* renamed from: b */
    public final cd2 f43401b;

    /* renamed from: c */
    public final pd2 f43402c;

    /* renamed from: d */
    public final fjd f43403d;

    /* renamed from: e */
    public final pd2.AbstractC16063c f43404e;

    public rd8(tc8 tc8Var, Size size, n92 n92Var, boolean z, Size size2, int i) {
        elh.m25220a();
        this.f43400a = tc8Var;
        this.f43401b = cd2.C12638a.m20892i(tc8Var).m20901h();
        pd2 pd2Var = new pd2();
        this.f43402c = pd2Var;
        Executor executorB0 = tc8Var.b0(gb2.m28294b());
        Objects.requireNonNull(executorB0);
        fjd fjdVar = new fjd(executorB0, null);
        this.f43403d = fjdVar;
        int iMo19021n = tc8Var.mo19021n();
        int iM46552i = m46552i();
        tc8Var.a0();
        pd2.AbstractC16063c abstractC16063cM43406m = pd2.AbstractC16063c.m43406m(size, iMo19021n, iM46552i, z, null, size2, i);
        this.f43404e = abstractC16063cM43406m;
        fjdVar.m26930x(pd2Var.m43402v(abstractC16063cM43406m));
    }

    /* renamed from: a */
    public void m46544a() {
        elh.m25220a();
        this.f43402c.m43398r();
        this.f43403d.m26929v();
    }

    /* renamed from: b */
    public final ma2 m46545b(int i, xc2 xc2Var, mjg mjgVar, cjg cjgVar) {
        ArrayList arrayList = new ArrayList();
        String strValueOf = String.valueOf(xc2Var.hashCode());
        List<ge2> listMo55965a = xc2Var.mo55965a();
        Objects.requireNonNull(listMo55965a);
        for (ge2 ge2Var : listMo55965a) {
            cd2.C12638a c12638a = new cd2.C12638a();
            c12638a.m20911t(this.f43401b.m20889k());
            c12638a.m20898e(this.f43401b.m20885g());
            c12638a.m20894a(mjgVar.mo39246p());
            c12638a.m20899f(this.f43404e.m43409k());
            c12638a.m20909r(m46555l());
            if (ke8.m35536i(this.f43404e.mo24260d())) {
                if (f43399g.m40785a()) {
                    c12638a.m20897d(cd2.f17857i, Integer.valueOf(mjgVar.mo39244n()));
                }
                c12638a.m20897d(cd2.f17858j, Integer.valueOf(m46550g(mjgVar)));
            }
            c12638a.m20898e(ge2Var.mo28510a().m20885g());
            c12638a.m20900g(strValueOf, Integer.valueOf(ge2Var.getId()));
            c12638a.m20907p(i);
            c12638a.m20896c(this.f43404e.m43407a());
            arrayList.add(c12638a.m20901h());
        }
        return new ma2(arrayList, cjgVar);
    }

    /* renamed from: c */
    public final xc2 m46546c() {
        xc2 xc2VarM49702W = this.f43400a.m49702W(yc2.m57491b());
        Objects.requireNonNull(xc2VarM49702W);
        return xc2VarM49702W;
    }

    /* renamed from: d */
    public final gjd m46547d(int i, xc2 xc2Var, mjg mjgVar, cjg cjgVar, zfa zfaVar) {
        return new gjd(xc2Var, mjgVar.mo39243m(), mjgVar.mo39239i(), mjgVar.mo39244n(), mjgVar.mo39241k(), mjgVar.mo39245o(), cjgVar, zfaVar, i);
    }

    /* renamed from: e */
    public iwc m46548e(mjg mjgVar, cjg cjgVar, zfa zfaVar) {
        elh.m25220a();
        xc2 xc2VarM46546c = m46546c();
        int i = f43398f;
        f43398f = i + 1;
        return new iwc(m46545b(i, xc2VarM46546c, mjgVar, cjgVar), m46547d(i, xc2VarM46546c, mjgVar, cjgVar, zfaVar));
    }

    /* renamed from: f */
    public bhf.C12402b m46549f(Size size) {
        bhf.C12402b c12402bM19037p = bhf.C12402b.m19037p(this.f43400a, size);
        c12402bM19037p.m19045h(this.f43404e.m43409k());
        if (this.f43404e.m43408h() != null) {
            c12402bM19037p.m19058v(this.f43404e.m43408h());
        }
        return c12402bM19037p;
    }

    /* renamed from: g */
    public int m46550g(mjg mjgVar) {
        return ((mjgVar.mo39242l() != null) && wuh.m55039h(mjgVar.mo39239i(), this.f43404e.mo24265j())) ? mjgVar.mo39238h() == 0 ? 100 : 95 : mjgVar.mo39241k();
    }

    /* renamed from: h */
    public int m46551h() {
        elh.m25220a();
        return this.f43402c.m43393h();
    }

    /* renamed from: i */
    public final int m46552i() {
        Integer num = (Integer) this.f43400a.mo36958d(tc8.f46812L, null);
        if (num != null) {
            return num.intValue();
        }
        Integer num2 = (Integer) this.f43400a.mo36958d(kd8.f31942h, null);
        return (num2 == null || num2.intValue() != 4101) ? 256 : 4101;
    }

    /* renamed from: j */
    public void m46553j(gjg.AbstractC13760b abstractC13760b) {
        elh.m25220a();
        this.f43404e.mo24258b().accept(abstractC13760b);
    }

    /* renamed from: k */
    public void m46554k(AbstractC1892b.a aVar) {
        elh.m25220a();
        this.f43402c.m43401u(aVar);
    }

    /* renamed from: l */
    public final boolean m46555l() {
        return this.f43404e.m43408h() != null;
    }

    /* renamed from: m */
    public void m46556m(gjd gjdVar) {
        elh.m25220a();
        this.f43404e.mo24264i().accept(gjdVar);
    }
}
