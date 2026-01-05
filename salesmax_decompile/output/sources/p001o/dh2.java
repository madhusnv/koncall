package p001o;

import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes6.dex */
public final class dh2 extends thd {

    /* renamed from: c */
    public static final dh2 f19827c = new dh2();

    public dh2() {
        super(sm1.m48524s(eh2.f21610a));
    }

    @Override // p001o.c7
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int mo19320e(char[] cArr) {
        sq8.m48649h(cArr, "<this>");
        return cArr.length;
    }

    @Override // p001o.thd
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public char[] mo19322r() {
        return new char[0];
    }

    @Override // p001o.ug3, p001o.c7
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo19321h(jo3 jo3Var, int i, ah2 ah2Var, boolean z) {
        sq8.m48649h(jo3Var, "decoder");
        sq8.m48649h(ah2Var, "builder");
        ah2Var.m17044e(jo3Var.mo17249r(getDescriptor(), i));
    }

    @Override // p001o.c7
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public ah2 mo18794k(char[] cArr) {
        sq8.m48649h(cArr, "<this>");
        return new ah2(cArr);
    }

    @Override // p001o.thd
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo19323u(lo3 lo3Var, char[] cArr, int i) {
        sq8.m48649h(lo3Var, "encoder");
        sq8.m48649h(cArr, FirebaseAnalytics.Param.CONTENT);
        for (int i2 = 0; i2 < i; i2++) {
            lo3Var.mo37563i(getDescriptor(), i2, cArr[i2]);
        }
    }
}
