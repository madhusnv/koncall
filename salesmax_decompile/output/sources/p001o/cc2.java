package p001o;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class cc2 extends AtomicReference implements su5 {
    public cc2(vb2 vb2Var) {
        super(vb2Var);
    }

    @Override // p001o.su5
    public void dispose() {
        vb2 vb2Var;
        if (get() == null || (vb2Var = (vb2) getAndSet(null)) == null) {
            return;
        }
        try {
            vb2Var.cancel();
        } catch (Throwable th) {
            zk6.m59526b(th);
            fwe.m27599r(th);
        }
    }

    @Override // p001o.su5
    public boolean isDisposed() {
        return get() == null;
    }
}
