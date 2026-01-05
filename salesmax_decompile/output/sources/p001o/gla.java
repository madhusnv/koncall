package p001o;

import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes6.dex */
public final class gla extends thd {

    /* renamed from: c */
    public static final gla f25416c = new gla();

    public gla() {
        super(sm1.m48529x(hla.f27108a));
    }

    @Override // p001o.c7
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int mo19320e(long[] jArr) {
        sq8.m48649h(jArr, "<this>");
        return jArr.length;
    }

    @Override // p001o.thd
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public long[] mo19322r() {
        return new long[0];
    }

    @Override // p001o.ug3, p001o.c7
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo19321h(jo3 jo3Var, int i, cla claVar, boolean z) {
        sq8.m48649h(jo3Var, "decoder");
        sq8.m48649h(claVar, "builder");
        claVar.m21379e(jo3Var.mo17220H(getDescriptor(), i));
    }

    @Override // p001o.c7
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public cla mo18794k(long[] jArr) {
        sq8.m48649h(jArr, "<this>");
        return new cla(jArr);
    }

    @Override // p001o.thd
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo19323u(lo3 lo3Var, long[] jArr, int i) {
        sq8.m48649h(lo3Var, "encoder");
        sq8.m48649h(jArr, FirebaseAnalytics.Param.CONTENT);
        for (int i2 = 0; i2 < i; i2++) {
            lo3Var.mo37565k(getDescriptor(), i2, jArr[i2]);
        }
    }
}
