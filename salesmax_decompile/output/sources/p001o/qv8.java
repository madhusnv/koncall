package p001o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes6.dex */
public final class qv8 extends b79 {

    /* renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f42482f = AtomicIntegerFieldUpdater.newUpdater(qv8.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;

    /* renamed from: e */
    public final xk7 f42483e;

    public qv8(xk7 xk7Var) {
        this.f42483e = xk7Var;
    }

    @Override // p001o.b79
    /* renamed from: v */
    public boolean mo18250v() {
        return true;
    }

    @Override // p001o.b79
    /* renamed from: w */
    public void mo18251w(Throwable th) {
        if (f42482f.compareAndSet(this, 0, 1)) {
            this.f42483e.invoke(th);
        }
    }
}
