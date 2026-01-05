package ri;

import df.C1709h;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ri.f */
/* loaded from: classes.dex */
public final class ScheduledExecutorServiceC6548f implements ScheduledExecutorService {

    /* renamed from: a */
    public final ExecutorService f31398a;

    /* renamed from: b */
    public final ScheduledExecutorService f31399b;

    public ScheduledExecutorServiceC6548f(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f31398a = executorService;
        this.f31399b = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j6, TimeUnit timeUnit) {
        return this.f31398a.awaitTermination(j6, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f31398a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        return this.f31398a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        return this.f31398a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f31398a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f31398a.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j6, TimeUnit timeUnit) {
        return new ScheduledFutureC6550h(new C1709h(this, runnable, j6, timeUnit, 1));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j6, long j10, TimeUnit timeUnit) {
        return new ScheduledFutureC6550h(new C6545c(this, runnable, j6, j10, timeUnit, 0));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j6, long j10, TimeUnit timeUnit) {
        return new ScheduledFutureC6550h(new C6545c(this, runnable, j6, j10, timeUnit, 1));
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        return this.f31398a.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j6, TimeUnit timeUnit) {
        return this.f31398a.invokeAll(collection, j6, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j6, TimeUnit timeUnit) {
        return this.f31398a.invokeAny(collection, j6, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j6, TimeUnit timeUnit) {
        return new ScheduledFutureC6550h(new C1709h(this, callable, j6, timeUnit, 2));
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        return this.f31398a.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        return this.f31398a.submit(runnable);
    }
}
