package tx;

import ex.InterfaceC2139c;
import java.util.concurrent.CancellationException;
import uw.AbstractC7557a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class o1 extends AbstractC7557a implements e1 {

    /* renamed from: b */
    public static final o1 f34663b = new o1(C7263w.f34689b);

    @Override // tx.e1
    /* renamed from: A */
    public final CancellationException mo13507A() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // tx.e1
    /* renamed from: U */
    public final Object mo13508U(AbstractC8193c abstractC8193c) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // tx.e1
    public final o0 a0(boolean z6, boolean z10, InterfaceC2139c interfaceC2139c) {
        return p1.f34666a;
    }

    @Override // tx.e1
    /* renamed from: h */
    public final boolean mo13509h() {
        return true;
    }

    @Override // tx.e1
    public final boolean isCancelled() {
        return false;
    }

    @Override // tx.e1
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // tx.e1
    public final o0 v0(InterfaceC2139c interfaceC2139c) {
        return p1.f34666a;
    }

    @Override // tx.e1
    public final InterfaceC7254n w0(k1 k1Var) {
        return p1.f34666a;
    }

    @Override // tx.e1
    /* renamed from: j */
    public final void mo13510j(CancellationException cancellationException) {
    }
}
