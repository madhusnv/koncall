package p001o;

import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes6.dex */
public final class wp1 extends thd {

    /* renamed from: c */
    public static final wp1 f52435c = new wp1();

    public wp1() {
        super(sm1.m48523r(gq1.f25657a));
    }

    @Override // p001o.c7
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int mo19320e(byte[] bArr) {
        sq8.m48649h(bArr, "<this>");
        return bArr.length;
    }

    @Override // p001o.thd
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public byte[] mo19322r() {
        return new byte[0];
    }

    @Override // p001o.ug3, p001o.c7
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo19321h(jo3 jo3Var, int i, qp1 qp1Var, boolean z) {
        sq8.m48649h(jo3Var, "decoder");
        sq8.m48649h(qp1Var, "builder");
        qp1Var.m45740e(jo3Var.mo17242j(getDescriptor(), i));
    }

    @Override // p001o.c7
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public qp1 mo18794k(byte[] bArr) {
        sq8.m48649h(bArr, "<this>");
        return new qp1(bArr);
    }

    @Override // p001o.thd
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo19323u(lo3 lo3Var, byte[] bArr, int i) {
        sq8.m48649h(lo3Var, "encoder");
        sq8.m48649h(bArr, FirebaseAnalytics.Param.CONTENT);
        for (int i2 = 0; i2 < i; i2++) {
            lo3Var.mo37559E(getDescriptor(), i2, bArr[i2]);
        }
    }
}
