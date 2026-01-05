package xi;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p020v.b0;
import pg.l8;
import yg.C8656m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xi.b */
/* loaded from: classes.dex */
public final class ExecutorC8384b implements Executor {

    /* renamed from: a */
    public final ExecutorService f40059a;

    /* renamed from: b */
    public final Object f40060b = new Object();

    /* renamed from: c */
    public C8656m f40061c = l8.m11765f(null);

    public ExecutorC8384b(ExecutorService executorService) {
        this.f40059a = executorService;
    }

    /* renamed from: a */
    public final C8656m m15551a(Runnable runnable) {
        C8656m c8656mM15981h;
        synchronized (this.f40060b) {
            c8656mM15981h = this.f40061c.m15981h(this.f40059a, new b0(11, runnable));
            this.f40061c = c8656mM15981h;
        }
        return c8656mM15981h;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f40059a.execute(runnable);
    }
}
