package tx;

import yx.C8814h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class i1 extends g1 {

    /* renamed from: e */
    public final k1 f34638e;

    /* renamed from: f */
    public final j1 f34639f;

    /* renamed from: g */
    public final C7255o f34640g;

    /* renamed from: h */
    public final Object f34641h;

    public i1(k1 k1Var, j1 j1Var, C7255o c7255o, Object obj) {
        this.f34638e = k1Var;
        this.f34639f = j1Var;
        this.f34640g = c7255o;
        this.f34641h = obj;
    }

    @Override // tx.g1
    /* renamed from: j */
    public final boolean mo13463j() {
        return false;
    }

    @Override // tx.g1
    /* renamed from: k */
    public final void mo13464k(Throwable th2) {
        C7255o c7255o = this.f34640g;
        C7255o c7255oM13548W = k1.m13548W(c7255o);
        k1 k1Var = this.f34638e;
        j1 j1Var = this.f34639f;
        Object obj = this.f34641h;
        if (c7255oM13548W == null || !k1Var.h0(j1Var, c7255oM13548W, obj)) {
            j1Var.f34646a.m16261b(new C8814h(2), 2);
            C7255o c7255oM13548W2 = k1.m13548W(c7255o);
            if (c7255oM13548W2 == null || !k1Var.h0(j1Var, c7255oM13548W2, obj)) {
                k1Var.mo13511k(k1Var.m13549B(j1Var, obj));
            }
        }
    }
}
