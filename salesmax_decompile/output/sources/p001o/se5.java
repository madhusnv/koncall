package p001o;

import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class se5 extends ql6 implements Executor {

    /* renamed from: d */
    public static final se5 f45310d = new se5();

    /* renamed from: e */
    public static final z74 f45311e = z74.o0(p4i.f39328c, rig.m46848e("kotlinx.coroutines.io.parallelism", bce.m18601d(64, pig.m43751a()), 0, 0, 12, null), null, 2, null);

    @Override // p001o.z74
    /* renamed from: K */
    public void mo22314K(q74 q74Var, Runnable runnable) {
        f45311e.mo22314K(q74Var, runnable);
    }

    @Override // p001o.z74
    /* renamed from: X */
    public void mo26180X(q74 q74Var, Runnable runnable) {
        f45311e.mo26180X(q74Var, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        mo22314K(e66.f21035a, runnable);
    }

    @Override // p001o.z74
    public z74 l0(int i, String str) {
        return p4i.f39328c.l0(i, str);
    }

    @Override // p001o.z74
    public String toString() {
        return "Dispatchers.IO";
    }
}
