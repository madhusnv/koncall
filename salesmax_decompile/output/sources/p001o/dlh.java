package p001o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes6.dex */
public final class dlh extends b79 {

    /* renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f20197g = AtomicIntegerFieldUpdater.newUpdater(dlh.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* renamed from: e */
    public final Thread f20198e = Thread.currentThread();

    /* renamed from: f */
    public yu5 f20199f;

    /* renamed from: A */
    public final Void m23425A(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    /* renamed from: B */
    public final void m23426B(p69 p69Var) {
        int i;
        this.f20199f = a79.m16555m(p69Var, false, this, 1, null);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f20197g;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 2 || i == 3) {
                    return;
                }
                m23425A(i);
                throw new qe9();
            }
        } while (!f20197g.compareAndSet(this, i, 0));
    }

    @Override // p001o.b79
    /* renamed from: v */
    public boolean mo18250v() {
        return true;
    }

    @Override // p001o.b79
    /* renamed from: w */
    public void mo18251w(Throwable th) {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f20197g;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1 || i == 2 || i == 3) {
                    return;
                }
                m23425A(i);
                throw new qe9();
            }
        } while (!f20197g.compareAndSet(this, i, 2));
        this.f20198e.interrupt();
        f20197g.set(this, 3);
    }

    /* renamed from: y */
    public final void m23427y() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f20197g;
        while (true) {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        m23425A(i);
                        throw new qe9();
                    }
                }
            } else if (f20197g.compareAndSet(this, i, 1)) {
                yu5 yu5Var = this.f20199f;
                if (yu5Var != null) {
                    yu5Var.dispose();
                    return;
                }
                return;
            }
        }
    }
}
