package p001o;

import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes6.dex */
public final class zzh extends thd {

    /* renamed from: c */
    public static final zzh f57933c = new zzh();

    public zzh() {
        super(sm1.m48501A(wzh.f52958b));
    }

    @Override // p001o.c7
    /* renamed from: e */
    public /* bridge */ /* synthetic */ int mo19320e(Object obj) {
        return m60163v(((xzh) obj).m57061J());
    }

    @Override // p001o.c7
    /* renamed from: k */
    public /* bridge */ /* synthetic */ Object mo18794k(Object obj) {
        return m60166y(((xzh) obj).m57061J());
    }

    @Override // p001o.thd
    /* renamed from: r */
    public /* bridge */ /* synthetic */ Object mo19322r() {
        return xzh.m57053d(m60164w());
    }

    @Override // p001o.thd
    /* renamed from: u */
    public /* bridge */ /* synthetic */ void mo19323u(lo3 lo3Var, Object obj, int i) {
        m60167z(lo3Var, ((xzh) obj).m57061J(), i);
    }

    /* renamed from: v */
    public int m60163v(byte[] bArr) {
        sq8.m48649h(bArr, "$this$collectionSize");
        return xzh.m57060y(bArr);
    }

    /* renamed from: w */
    public byte[] m60164w() {
        return xzh.m57054e(0);
    }

    @Override // p001o.ug3, p001o.c7
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo19321h(jo3 jo3Var, int i, yzh yzhVar, boolean z) {
        sq8.m48649h(jo3Var, "decoder");
        sq8.m48649h(yzhVar, "builder");
        yzhVar.m58582e(wzh.m55511c(jo3Var.mo17239g(getDescriptor(), i).mo17219G()));
    }

    /* renamed from: y */
    public yzh m60166y(byte[] bArr) {
        sq8.m48649h(bArr, "$this$toBuilder");
        return new yzh(bArr, null);
    }

    /* renamed from: z */
    public void m60167z(lo3 lo3Var, byte[] bArr, int i) {
        sq8.m48649h(lo3Var, "encoder");
        sq8.m48649h(bArr, FirebaseAnalytics.Param.CONTENT);
        for (int i2 = 0; i2 < i; i2++) {
            lo3Var.mo37567o(getDescriptor(), i2).mo29878h(xzh.m57059v(bArr, i2));
        }
    }
}
