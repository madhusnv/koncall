package tx;

import ex.InterfaceC2139c;
import og.od;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class p0 extends g1 {

    /* renamed from: e */
    public final /* synthetic */ int f34664e;

    /* renamed from: f */
    public final Object f34665f;

    public /* synthetic */ p0(int i10, Object obj) {
        this.f34664e = i10;
        this.f34665f = obj;
    }

    @Override // tx.g1
    /* renamed from: j */
    public final boolean mo13463j() {
        switch (this.f34664e) {
        }
        return false;
    }

    @Override // tx.g1
    /* renamed from: k */
    public final void mo13464k(Throwable th2) {
        switch (this.f34664e) {
            case 0:
                ((o0) this.f34665f).dispose();
                break;
            case 1:
                ((InterfaceC2139c) this.f34665f).invoke(th2);
                break;
            default:
                h1 h1Var = (h1) this.f34665f;
                Object obj = k1.f34653a.get(m13516g());
                if (!(obj instanceof C7260t)) {
                    h1Var.resumeWith(c0.m13473I(obj));
                    break;
                } else {
                    h1Var.resumeWith(od.m10796a(((C7260t) obj).f34677a));
                    break;
                }
        }
    }
}
