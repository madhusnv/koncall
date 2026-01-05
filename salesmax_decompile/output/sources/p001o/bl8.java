package p001o;

import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes6.dex */
public final class bl8 extends thd {

    /* renamed from: c */
    public static final bl8 f16474c = new bl8();

    public bl8() {
        super(sm1.m48528w(cl8.f18292a));
    }

    @Override // p001o.c7
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int mo19320e(int[] iArr) {
        sq8.m48649h(iArr, "<this>");
        return iArr.length;
    }

    @Override // p001o.thd
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public int[] mo19322r() {
        return new int[0];
    }

    @Override // p001o.ug3, p001o.c7
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo19321h(jo3 jo3Var, int i, yk8 yk8Var, boolean z) {
        sq8.m48649h(jo3Var, "decoder");
        sq8.m48649h(yk8Var, "builder");
        yk8Var.m57918e(jo3Var.mo17218F(getDescriptor(), i));
    }

    @Override // p001o.c7
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public yk8 mo18794k(int[] iArr) {
        sq8.m48649h(iArr, "<this>");
        return new yk8(iArr);
    }

    @Override // p001o.thd
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void mo19323u(lo3 lo3Var, int[] iArr, int i) {
        sq8.m48649h(lo3Var, "encoder");
        sq8.m48649h(iArr, FirebaseAnalytics.Param.CONTENT);
        for (int i2 = 0; i2 < i; i2++) {
            lo3Var.mo37562f(getDescriptor(), i2, iArr[i2]);
        }
    }
}
