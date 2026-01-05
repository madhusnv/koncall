package wi;

import android.os.Looper;
import c0.ThreadFactoryC0820m;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import p020v.b0;
import yg.C8656m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wi.x */
/* loaded from: classes.dex */
public abstract class AbstractC8074x {

    /* renamed from: a */
    public static final ExecutorService f38667a;

    static {
        ExecutorService executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0820m(new AtomicLong(1L)), new ThreadPoolExecutor.DiscardPolicy()));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Runtime.getRuntime().addShutdownHook(new Thread(new RunnableC8070t(executorServiceUnconfigurableExecutorService), "Crashlytics Shutdown Hook for awaitEvenIfOnMainThread task continuation executor"));
        f38667a = executorServiceUnconfigurableExecutorService;
    }

    /* renamed from: a */
    public static void m15214a(C8656m c8656m) throws InterruptedException, TimeoutException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        c8656m.m15980g(f38667a, new b0(5, countDownLatch));
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(3000L, TimeUnit.MILLISECONDS);
        } else {
            countDownLatch.await(4000L, TimeUnit.MILLISECONDS);
        }
        if (c8656m.m15985l()) {
            c8656m.m15983j();
        } else {
            if (c8656m.f41952d) {
                throw new CancellationException("Task is already canceled");
            }
            if (!c8656m.m15984k()) {
                throw new TimeoutException();
            }
            throw new IllegalStateException(c8656m.m15982i());
        }
    }
}
