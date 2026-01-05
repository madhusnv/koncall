package p001o;

import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes6.dex */
public final class g1i extends thd {

    /* renamed from: c */
    public static final g1i f24472c = new g1i();

    public g1i() {
        super(sm1.m48504D(d1i.f19007b));
    }

    @Override // p001o.c7
    /* renamed from: e */
    public /* bridge */ /* synthetic */ int mo19320e(Object obj) {
        return m27981v(((e1i) obj).m24132J());
    }

    @Override // p001o.c7
    /* renamed from: k */
    public /* bridge */ /* synthetic */ Object mo18794k(Object obj) {
        return m27984y(((e1i) obj).m24132J());
    }

    @Override // p001o.thd
    /* renamed from: r */
    public /* bridge */ /* synthetic */ Object mo19322r() {
        return e1i.m24124d(m27982w());
    }

    @Override // p001o.thd
    /* renamed from: u */
    public /* bridge */ /* synthetic */ void mo19323u(lo3 lo3Var, Object obj, int i) {
        m27985z(lo3Var, ((e1i) obj).m24132J(), i);
    }

    /* renamed from: v */
    public int m27981v(short[] sArr) {
        sq8.m48649h(sArr, "$this$collectionSize");
        return e1i.m24131y(sArr);
    }

    /* renamed from: w */
    public short[] m27982w() {
        return e1i.m24125e(0);
    }

    @Override // p001o.ug3, p001o.c7
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo19321h(jo3 jo3Var, int i, f1i f1iVar, boolean z) {
        sq8.m48649h(jo3Var, "decoder");
        sq8.m48649h(f1iVar, "builder");
        f1iVar.m25949e(d1i.m22246c(jo3Var.mo17239g(getDescriptor(), i).mo17250s()));
    }

    /* renamed from: y */
    public f1i m27984y(short[] sArr) {
        sq8.m48649h(sArr, "$this$toBuilder");
        return new f1i(sArr, null);
    }

    /* renamed from: z */
    public void m27985z(lo3 lo3Var, short[] sArr, int i) {
        sq8.m48649h(lo3Var, "encoder");
        sq8.m48649h(sArr, FirebaseAnalytics.Param.CONTENT);
        for (int i2 = 0; i2 < i; i2++) {
            lo3Var.mo37567o(getDescriptor(), i2).mo29881u(e1i.m24130v(sArr, i2));
        }
    }
}
