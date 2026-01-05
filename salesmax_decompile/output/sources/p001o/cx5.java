package p001o;

import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes6.dex */
public final class cx5 extends thd {

    /* renamed from: c */
    public static final cx5 f18753c = new cx5();

    public cx5() {
        super(sm1.m48525t(fx5.f24237a));
    }

    @Override // p001o.c7
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int mo19320e(double[] dArr) {
        sq8.m48649h(dArr, "<this>");
        return dArr.length;
    }

    @Override // p001o.thd
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public double[] mo19322r() {
        return new double[0];
    }

    @Override // p001o.ug3, p001o.c7
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo19321h(jo3 jo3Var, int i, zw5 zw5Var, boolean z) {
        sq8.m48649h(jo3Var, "decoder");
        sq8.m48649h(zw5Var, "builder");
        zw5Var.m59989e(jo3Var.mo17214A(getDescriptor(), i));
    }

    @Override // p001o.c7
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public zw5 mo18794k(double[] dArr) {
        sq8.m48649h(dArr, "<this>");
        return new zw5(dArr);
    }

    @Override // p001o.thd
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo19323u(lo3 lo3Var, double[] dArr, int i) {
        sq8.m48649h(lo3Var, "encoder");
        sq8.m48649h(dArr, FirebaseAnalytics.Param.CONTENT);
        for (int i2 = 0; i2 < i; i2++) {
            lo3Var.mo37564j(getDescriptor(), i2, dArr[i2]);
        }
    }
}
