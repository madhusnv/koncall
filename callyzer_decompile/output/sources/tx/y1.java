package tx;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class y1 extends g1 {

    /* renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f34698g = AtomicIntegerFieldUpdater.newUpdater(y1.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* renamed from: e */
    public final Thread f34699e = Thread.currentThread();

    /* renamed from: f */
    public o0 f34700f;

    /* renamed from: m */
    public static void m13578m(int i10) {
        throw new IllegalStateException(("Illegal state " + i10).toString());
    }

    @Override // tx.g1
    /* renamed from: j */
    public final boolean mo13463j() {
        return true;
    }

    @Override // tx.g1
    /* renamed from: k */
    public final void mo13464k(Throwable th2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = f34698g;
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1 || i10 == 2 || i10 == 3) {
                    return;
                }
                m13578m(i10);
                throw null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 2));
        this.f34699e.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    /* renamed from: l */
    public final void m13579l() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f34698g;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        m13578m(i10);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i10, 1)) {
                o0 o0Var = this.f34700f;
                if (o0Var != null) {
                    o0Var.dispose();
                    return;
                }
                return;
            }
        }
    }
}
