package tx;

import ex.InterfaceC2141e;
import kotlinx.coroutines.DispatchException;
import og.od;
import pg.n6;
import uw.InterfaceC7559c;
import uw.InterfaceC7564h;
import yx.AbstractC8808b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class m1 extends s1 {

    /* renamed from: d */
    public final InterfaceC7559c f34660d;

    public m1(InterfaceC7564h interfaceC7564h, InterfaceC2141e interfaceC2141e) {
        super(interfaceC7564h, false);
        this.f34660d = n6.m11795a(interfaceC2141e, this, this);
    }

    @Override // tx.k1
    /* renamed from: Z */
    public final void mo13562Z() throws Throwable {
        try {
            AbstractC8808b.m16250j(qw.a0.f30746a, n6.m11797c(this.f34660d));
        } catch (Throwable th2) {
            th = th2;
            if (th instanceof DispatchException) {
                th = ((DispatchException) th).f21165a;
            }
            resumeWith(od.m10796a(th));
            throw th;
        }
    }
}
