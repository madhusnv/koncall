package p001o;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public class p92 implements Executor {

    /* renamed from: c */
    public static final ThreadFactory f39639c = new ThreadFactoryC16033a();

    /* renamed from: a */
    public final Object f39640a = new Object();

    /* renamed from: b */
    public ThreadPoolExecutor f39641b = m43211b();

    /* renamed from: o.p92$a */
    public class ThreadFactoryC16033a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f39642a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-core_camera_%d", Integer.valueOf(this.f39642a.getAndIncrement())));
            return thread;
        }
    }

    /* renamed from: b */
    public static ThreadPoolExecutor m43211b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f39639c);
        threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandler() { // from class: o.o92
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                wja.m54629c("CameraExecutor", "A rejected execution occurred in CameraExecutor!");
            }
        });
        return threadPoolExecutor;
    }

    /* renamed from: c */
    public void m43213c(q92 q92Var) {
        ThreadPoolExecutor threadPoolExecutor;
        fgd.m26663g(q92Var);
        synchronized (this.f39640a) {
            if (this.f39641b.isShutdown()) {
                this.f39641b = m43211b();
            }
            threadPoolExecutor = this.f39641b;
        }
        int iMax = Math.max(1, q92Var.mo42953b().size());
        threadPoolExecutor.setMaximumPoolSize(iMax);
        threadPoolExecutor.setCorePoolSize(iMax);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        fgd.m26663g(runnable);
        synchronized (this.f39640a) {
            this.f39641b.execute(runnable);
        }
    }
}
