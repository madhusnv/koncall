package p001o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes6.dex */
public final class au5 extends f6f {

    /* renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15249e = AtomicIntegerFieldUpdater.newUpdater(au5.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public au5(q74 q74Var, n64 n64Var) {
        super(q74Var, n64Var);
    }

    @Override // p001o.f6f, p001o.h7
    public void S0(Object obj) {
        if (Y0()) {
            return;
        }
        zt5.m59877b(tq8.m50336c(this.f22801d), rm3.m46954a(obj, this.f22801d));
    }

    public final Object W0() {
        if (Z0()) {
            return uq8.m51918f();
        }
        Object objM24481h = e79.m24481h(i0());
        if (objM24481h instanceof lm3) {
            throw ((lm3) objM24481h).f34036a;
        }
        return objM24481h;
    }

    public final boolean Y0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15249e;
        do {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f15249e.compareAndSet(this, 0, 2));
        return true;
    }

    public final boolean Z0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15249e;
        do {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f15249e.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // p001o.f6f, p001o.d79
    /* renamed from: z */
    public void mo17837z(Object obj) {
        S0(obj);
    }
}
