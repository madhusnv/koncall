package tx;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.DispatchException;
import pg.n6;
import yx.AbstractC8808b;
import yx.C8822p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class j0 extends C8822p {

    /* renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f34642e = AtomicIntegerFieldUpdater.newUpdater(j0.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // yx.C8822p, tx.k1
    /* renamed from: k */
    public final void mo13511k(Object obj) throws DispatchException {
        mo13504l(obj);
    }

    @Override // yx.C8822p, tx.k1
    /* renamed from: l */
    public final void mo13504l(Object obj) throws DispatchException {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f34642e;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                AbstractC8808b.m16250j(c0.m13466B(obj), n6.m11797c(this.f42516d));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
