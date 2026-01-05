package p001o;

import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes6.dex */
public final class vpf extends thd {

    /* renamed from: c */
    public static final vpf f50706c = new vpf();

    public vpf() {
        super(sm1.m48530y(wpf.f52456a));
    }

    @Override // p001o.c7
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int mo19320e(short[] sArr) {
        sq8.m48649h(sArr, "<this>");
        return sArr.length;
    }

    @Override // p001o.thd
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public short[] mo19322r() {
        return new short[0];
    }

    @Override // p001o.ug3, p001o.c7
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo19321h(jo3 jo3Var, int i, upf upfVar, boolean z) {
        sq8.m48649h(jo3Var, "decoder");
        sq8.m48649h(upfVar, "builder");
        upfVar.m51912e(jo3Var.mo17246o(getDescriptor(), i));
    }

    @Override // p001o.c7
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public upf mo18794k(short[] sArr) {
        sq8.m48649h(sArr, "<this>");
        return new upf(sArr);
    }

    @Override // p001o.thd
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo19323u(lo3 lo3Var, short[] sArr, int i) {
        sq8.m48649h(lo3Var, "encoder");
        sq8.m48649h(sArr, FirebaseAnalytics.Param.CONTENT);
        for (int i2 = 0; i2 < i; i2++) {
            lo3Var.mo37570v(getDescriptor(), i2, sArr[i2]);
        }
    }
}
