package p001o;

/* loaded from: classes2.dex */
public interface mc2 {
    /* renamed from: a */
    static /* synthetic */ void m38702a(mc2 mc2Var, xzc xzcVar, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i2 & 2) != 0) {
            i = db3.f19509a.m22721b();
        }
        mc2Var.mo20340l(xzcVar, i);
    }

    /* renamed from: k */
    static /* synthetic */ void m38703k(mc2 mc2Var, float f, float f2, float f3, float f4, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
        }
        if ((i2 & 16) != 0) {
            i = db3.f19509a.m22721b();
        }
        mc2Var.mo20332b(f, f2, f3, f4, i);
    }

    /* renamed from: b */
    void mo20332b(float f, float f2, float f3, float f4, int i);

    /* renamed from: c */
    void mo20333c(float f, float f2);

    /* renamed from: d */
    void mo20334d();

    /* renamed from: e */
    void mo20335e();

    /* renamed from: f */
    default void m38704f(mfe mfeVar, ewc ewcVar) {
        sq8.m48649h(mfeVar, "rect");
        sq8.m48649h(ewcVar, "paint");
        mo20338i(mfeVar.m38945f(), mfeVar.m38948i(), mfeVar.m38946g(), mfeVar.m38942c(), ewcVar);
    }

    /* renamed from: g */
    void mo20336g();

    /* renamed from: h */
    void mo20337h();

    /* renamed from: i */
    void mo20338i(float f, float f2, float f3, float f4, ewc ewcVar);

    /* renamed from: j */
    void mo20339j(float[] fArr);

    /* renamed from: l */
    void mo20340l(xzc xzcVar, int i);
}
