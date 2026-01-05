package tx;

import uw.InterfaceC7559c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class h1 extends C7251k {

    /* renamed from: j */
    public final k1 f34635j;

    public h1(InterfaceC7559c interfaceC7559c, k1 k1Var) {
        super(1, interfaceC7559c);
        this.f34635j = k1Var;
    }

    @Override // tx.C7251k
    /* renamed from: n */
    public final Throwable mo13518n(k1 k1Var) {
        Throwable thM13521b;
        k1 k1Var2 = this.f34635j;
        k1Var2.getClass();
        Object obj = k1.f34653a.get(k1Var2);
        return (!(obj instanceof j1) || (thM13521b = ((j1) obj).m13521b()) == null) ? obj instanceof C7260t ? ((C7260t) obj).f34677a : k1Var.mo13507A() : thM13521b;
    }

    @Override // tx.C7251k
    /* renamed from: y */
    public final String mo13519y() {
        return "AwaitContinuation";
    }
}
