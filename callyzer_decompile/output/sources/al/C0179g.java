package al;

import java.util.Deque;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import ng.AbstractExecutorServiceC5062m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: al.g */
/* loaded from: classes.dex */
public final class C0179g extends AbstractExecutorServiceC5062m {

    /* renamed from: b */
    public static final ThreadLocal f546b = new ThreadLocal();

    /* renamed from: a */
    public final ThreadPoolExecutor f547a;

    public C0179g() {
        final ThreadFactory threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: al.o
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return threadFactoryDefaultThreadFactory.newThread(new RunnableC0186n(runnable, 1));
            }
        });
        this.f547a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Deque deque = (Deque) f546b.get();
        if (deque == null || deque.size() > 1) {
            this.f547a.execute(new RunnableC0186n(runnable, 0));
            return;
        }
        deque.add(runnable);
        if (deque.size() <= 1) {
            do {
                runnable.run();
                deque.removeFirst();
                runnable = (Runnable) deque.peekFirst();
            } while (runnable != null);
        }
    }
}
