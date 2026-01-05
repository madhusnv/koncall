package tx;

import uw.InterfaceC7564h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class b2 extends AbstractC7262v {

    /* renamed from: c */
    public static final /* synthetic */ int f34600c = 0;

    static {
        new b2();
    }

    @Override // tx.AbstractC7262v
    public final void B0(InterfaceC7564h interfaceC7564h, Runnable runnable) {
        f2 f2Var = (f2) interfaceC7564h.o0(f2.f34629c);
        if (f2Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        f2Var.f34630b = true;
    }

    @Override // tx.AbstractC7262v
    public final AbstractC7262v E0(int i10) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // tx.AbstractC7262v
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
