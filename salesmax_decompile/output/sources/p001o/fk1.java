package p001o;

import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes6.dex */
public final class fk1 extends thd {

    /* renamed from: c */
    public static final fk1 f23543c = new fk1();

    public fk1() {
        super(sm1.m48522q(gk1.f25372a));
    }

    @Override // p001o.c7
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int mo19320e(boolean[] zArr) {
        sq8.m48649h(zArr, "<this>");
        return zArr.length;
    }

    @Override // p001o.thd
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public boolean[] mo19322r() {
        return new boolean[0];
    }

    @Override // p001o.ug3, p001o.c7
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo19321h(jo3 jo3Var, int i, ck1 ck1Var, boolean z) {
        sq8.m48649h(jo3Var, "decoder");
        sq8.m48649h(ck1Var, "builder");
        ck1Var.m21332e(jo3Var.mo17253v(getDescriptor(), i));
    }

    @Override // p001o.c7
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public ck1 mo18794k(boolean[] zArr) {
        sq8.m48649h(zArr, "<this>");
        return new ck1(zArr);
    }

    @Override // p001o.thd
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo19323u(lo3 lo3Var, boolean[] zArr, int i) {
        sq8.m48649h(lo3Var, "encoder");
        sq8.m48649h(zArr, FirebaseAnalytics.Param.CONTENT);
        for (int i2 = 0; i2 < i; i2++) {
            lo3Var.mo37561e(getDescriptor(), i2, zArr[i2]);
        }
    }
}
