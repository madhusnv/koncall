package ng;

import al.C0179g;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ng.m */
/* loaded from: classes.dex */
public abstract class AbstractExecutorServiceC5062m implements ExecutorService {
    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j6, TimeUnit timeUnit) {
        return ((C0179g) this).f547a.awaitTermination(j6, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        return ((C0179g) this).f547a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        return ((C0179g) this).f547a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return ((C0179g) this).f547a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return ((C0179g) this).f547a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        ((C0179g) this).f547a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return ((C0179g) this).f547a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        return ((C0179g) this).f547a.submit(runnable);
    }

    public final String toString() {
        return ((C0179g) this).f547a.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j6, TimeUnit timeUnit) {
        return ((C0179g) this).f547a.invokeAll(collection, j6, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j6, TimeUnit timeUnit) {
        return ((C0179g) this).f547a.invokeAny(collection, j6, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        return ((C0179g) this).f547a.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        return ((C0179g) this).f547a.submit(callable);
    }
}
