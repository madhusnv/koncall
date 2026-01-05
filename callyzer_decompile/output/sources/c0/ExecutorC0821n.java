package c0;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p020v.C7600j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c0.n */
/* loaded from: classes.dex */
public final class ExecutorC0821n implements Executor {

    /* renamed from: c */
    public static final ThreadFactoryC0820m f5179c = new ThreadFactoryC0820m(0);

    /* renamed from: a */
    public final Object f5180a = new Object();

    /* renamed from: b */
    public ThreadPoolExecutor f5181b;

    public ExecutorC0821n() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f5179c);
        threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandlerC0819l());
        this.f5181b = threadPoolExecutor;
    }

    /* renamed from: a */
    public final void m2222a(C7600j c7600j) {
        ThreadPoolExecutor threadPoolExecutor;
        c7600j.getClass();
        synchronized (this.f5180a) {
            try {
                if (this.f5181b.isShutdown()) {
                    ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f5179c);
                    threadPoolExecutor2.setRejectedExecutionHandler(new RejectedExecutionHandlerC0819l());
                    this.f5181b = threadPoolExecutor2;
                }
                threadPoolExecutor = this.f5181b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int iMax = Math.max(1, c7600j.m14400a().size());
        threadPoolExecutor.setMaximumPoolSize(iMax);
        threadPoolExecutor.setCorePoolSize(iMax);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.f5180a) {
            this.f5181b.execute(runnable);
        }
    }
}
