package z7;

import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC4154l;
import og.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class o0 extends AbstractC8879h {

    /* renamed from: b */
    public final C8881j f42798b;

    /* renamed from: c */
    public final WeakReference f42799c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(C8881j c8881j, a0 delegate) {
        super(delegate.f42734a);
        AbstractC4154l.m8923f(delegate, "delegate");
        this.f42798b = c8881j;
        this.f42799c = new WeakReference(delegate);
    }

    @Override // z7.AbstractC8879h
    /* renamed from: a */
    public final void mo16374a(Set tables) {
        AbstractC4154l.m8923f(tables, "tables");
        AbstractC8879h abstractC8879h = (AbstractC8879h) this.f42799c.get();
        if (abstractC8879h != null) {
            abstractC8879h.mo16374a(tables);
            return;
        }
        C8881j c8881j = this.f42798b;
        c8881j.getClass();
        AbstractC4154l.m8923f(this, "observer");
        ReentrantLock reentrantLock = c8881j.f42750d;
        reentrantLock.lock();
        try {
            C8887p c8887p = (C8887p) c8881j.f42749c.remove(this);
            if (c8887p != null) {
                n0 n0Var = c8881j.f42748b;
                int[] tableIds = c8887p.f42801b;
                n0Var.getClass();
                AbstractC4154l.m8923f(tableIds, "tableIds");
                if (n0Var.f42791h.m421l(tableIds)) {
                    a1.m10523a(new C8880i(c8881j, null, 1));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
