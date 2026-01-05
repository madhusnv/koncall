package p001o;

import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes6.dex */
public final class n0i extends thd {

    /* renamed from: c */
    public static final n0i f36188c = new n0i();

    public n0i() {
        super(sm1.m48502B(j0i.f29524b));
    }

    @Override // p001o.c7
    /* renamed from: e */
    public /* bridge */ /* synthetic */ int mo19320e(Object obj) {
        return m39958v(((l0i) obj).m36437J());
    }

    @Override // p001o.c7
    /* renamed from: k */
    public /* bridge */ /* synthetic */ Object mo18794k(Object obj) {
        return m39961y(((l0i) obj).m36437J());
    }

    @Override // p001o.thd
    /* renamed from: r */
    public /* bridge */ /* synthetic */ Object mo19322r() {
        return l0i.m36429d(m39959w());
    }

    @Override // p001o.thd
    /* renamed from: u */
    public /* bridge */ /* synthetic */ void mo19323u(lo3 lo3Var, Object obj, int i) {
        m39962z(lo3Var, ((l0i) obj).m36437J(), i);
    }

    /* renamed from: v */
    public int m39958v(int[] iArr) {
        sq8.m48649h(iArr, "$this$collectionSize");
        return l0i.m36436y(iArr);
    }

    /* renamed from: w */
    public int[] m39959w() {
        return l0i.m36430e(0);
    }

    @Override // p001o.ug3, p001o.c7
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo19321h(jo3 jo3Var, int i, m0i m0iVar, boolean z) {
        sq8.m48649h(jo3Var, "decoder");
        sq8.m48649h(m0iVar, "builder");
        m0iVar.m38141e(j0i.m33018c(jo3Var.mo17239g(getDescriptor(), i).mo17240h()));
    }

    /* renamed from: y */
    public m0i m39961y(int[] iArr) {
        sq8.m48649h(iArr, "$this$toBuilder");
        return new m0i(iArr, null);
    }

    /* renamed from: z */
    public void m39962z(lo3 lo3Var, int[] iArr, int i) {
        sq8.m48649h(lo3Var, "encoder");
        sq8.m48649h(iArr, FirebaseAnalytics.Param.CONTENT);
        for (int i2 = 0; i2 < i; i2++) {
            lo3Var.mo37567o(getDescriptor(), i2).mo29873B(l0i.m36435v(iArr, i2));
        }
    }
}
