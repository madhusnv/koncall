package p001o;

import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes6.dex */
public final class d37 extends thd {

    /* renamed from: c */
    public static final d37 f19064c = new d37();

    public d37() {
        super(sm1.m48527v(e37.f20857a));
    }

    @Override // p001o.c7
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int mo19320e(float[] fArr) {
        sq8.m48649h(fArr, "<this>");
        return fArr.length;
    }

    @Override // p001o.thd
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public float[] mo19322r() {
        return new float[0];
    }

    @Override // p001o.ug3, p001o.c7
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo19321h(jo3 jo3Var, int i, z27 z27Var, boolean z) {
        sq8.m48649h(jo3Var, "decoder");
        sq8.m48649h(z27Var, "builder");
        z27Var.m58657e(jo3Var.mo17217E(getDescriptor(), i));
    }

    @Override // p001o.c7
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public z27 mo18794k(float[] fArr) {
        sq8.m48649h(fArr, "<this>");
        return new z27(fArr);
    }

    @Override // p001o.thd
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo19323u(lo3 lo3Var, float[] fArr, int i) {
        sq8.m48649h(lo3Var, "encoder");
        sq8.m48649h(fArr, FirebaseAnalytics.Param.CONTENT);
        for (int i2 = 0; i2 < i; i2++) {
            lo3Var.mo37558C(getDescriptor(), i2, fArr[i2]);
        }
    }
}
