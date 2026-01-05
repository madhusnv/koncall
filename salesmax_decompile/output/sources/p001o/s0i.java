package p001o;

import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes6.dex */
public final class s0i extends thd {

    /* renamed from: c */
    public static final s0i f44424c = new s0i();

    public s0i() {
        super(sm1.m48503C(p0i.f39160b));
    }

    @Override // p001o.c7
    /* renamed from: e */
    public /* bridge */ /* synthetic */ int mo19320e(Object obj) {
        return m47440v(((q0i) obj).m44642J());
    }

    @Override // p001o.c7
    /* renamed from: k */
    public /* bridge */ /* synthetic */ Object mo18794k(Object obj) {
        return m47443y(((q0i) obj).m44642J());
    }

    @Override // p001o.thd
    /* renamed from: r */
    public /* bridge */ /* synthetic */ Object mo19322r() {
        return q0i.m44634d(m47441w());
    }

    @Override // p001o.thd
    /* renamed from: u */
    public /* bridge */ /* synthetic */ void mo19323u(lo3 lo3Var, Object obj, int i) {
        m47444z(lo3Var, ((q0i) obj).m44642J(), i);
    }

    /* renamed from: v */
    public int m47440v(long[] jArr) {
        sq8.m48649h(jArr, "$this$collectionSize");
        return q0i.m44641y(jArr);
    }

    /* renamed from: w */
    public long[] m47441w() {
        return q0i.m44635e(0);
    }

    @Override // p001o.ug3, p001o.c7
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo19321h(jo3 jo3Var, int i, r0i r0iVar, boolean z) {
        sq8.m48649h(jo3Var, "decoder");
        sq8.m48649h(r0iVar, "builder");
        r0iVar.m46016e(p0i.m42841c(jo3Var.mo17239g(getDescriptor(), i).mo17243l()));
    }

    /* renamed from: y */
    public r0i m47443y(long[] jArr) {
        sq8.m48649h(jArr, "$this$toBuilder");
        return new r0i(jArr, null);
    }

    /* renamed from: z */
    public void m47444z(lo3 lo3Var, long[] jArr, int i) {
        sq8.m48649h(lo3Var, "encoder");
        sq8.m48649h(jArr, FirebaseAnalytics.Param.CONTENT);
        for (int i2 = 0; i2 < i; i2++) {
            lo3Var.mo37567o(getDescriptor(), i2).mo29880q(q0i.m44640v(jArr, i2));
        }
    }
}
