package tx;

import ex.InterfaceC2139c;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class d1 extends g1 {

    /* renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f34620f = AtomicIntegerFieldUpdater.newUpdater(d1.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* renamed from: e */
    public final InterfaceC2139c f34621e;

    public d1(InterfaceC2139c interfaceC2139c) {
        this.f34621e = interfaceC2139c;
    }

    @Override // tx.g1
    /* renamed from: j */
    public final boolean mo13463j() {
        return true;
    }

    @Override // tx.g1
    /* renamed from: k */
    public final void mo13464k(Throwable th2) {
        if (f34620f.compareAndSet(this, 0, 1)) {
            this.f34621e.invoke(th2);
        }
    }
}
