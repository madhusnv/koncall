package tx;

import kotlinx.coroutines.flow.internal.ChildCancelledException;
import uw.InterfaceC7559c;
import uw.InterfaceC7564h;
import yx.C8822p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class t1 extends C8822p {

    /* renamed from: e */
    public final /* synthetic */ int f34680e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t1(InterfaceC7564h interfaceC7564h, InterfaceC7559c interfaceC7559c, int i10) {
        super(interfaceC7559c, interfaceC7564h);
        this.f34680e = i10;
    }

    @Override // tx.k1
    /* renamed from: v */
    public final boolean mo13568v(Throwable th2) {
        switch (this.f34680e) {
            case 0:
                return false;
            default:
                if (th2 instanceof ChildCancelledException) {
                    return true;
                }
                return m13565o(th2);
        }
    }
}
