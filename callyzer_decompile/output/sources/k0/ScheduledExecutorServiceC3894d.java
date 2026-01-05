package k0;

import android.os.Handler;
import android.os.SystemClock;
import ci.C0973a;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import l0.ScheduledFutureC4309i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: k0.d */
/* loaded from: classes.dex */
public final class ScheduledExecutorServiceC3894d extends AbstractExecutorService implements ScheduledExecutorService {

    /* renamed from: a */
    public final Handler f19996a;

    static {
        new C0973a(8);
    }

    public ScheduledExecutorServiceC3894d(Handler handler) {
        this.f19996a = handler;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j6, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC3894d.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Handler handler = this.f19996a;
        if (handler.post(runnable)) {
            return;
        }
        throw new RejectedExecutionException(handler + " is shutting down");
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j6, TimeUnit timeUnit) {
        return schedule(new CallableC3892b(0, runnable), j6, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j6, long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC3894d.class.getSimpleName().concat(" does not yet support fixed-rate scheduling."));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j6, long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC3894d.class.getSimpleName().concat(" does not yet support fixed-delay scheduling."));
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC3894d.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC3894d.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j6, TimeUnit timeUnit) {
        long jConvert = TimeUnit.MILLISECONDS.convert(j6, timeUnit) + SystemClock.uptimeMillis();
        Handler handler = this.f19996a;
        RunnableScheduledFutureC3893c runnableScheduledFutureC3893c = new RunnableScheduledFutureC3893c(handler, jConvert, callable);
        if (handler.postAtTime(runnableScheduledFutureC3893c, jConvert)) {
            return runnableScheduledFutureC3893c;
        }
        return new ScheduledFutureC4309i(1, new RejectedExecutionException(handler + " is shutting down"));
    }
}
