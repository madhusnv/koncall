package k0;

import a1.C0005d;
import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import pg.i7;
import x4.C8299i;
import x4.C8302l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: k0.c */
/* loaded from: classes.dex */
public final class RunnableScheduledFutureC3893c implements RunnableScheduledFuture {

    /* renamed from: a */
    public final AtomicReference f19992a = new AtomicReference(null);

    /* renamed from: b */
    public final long f19993b;

    /* renamed from: c */
    public final Callable f19994c;

    /* renamed from: d */
    public final C8302l f19995d;

    public RunnableScheduledFutureC3893c(Handler handler, long j6, Callable callable) {
        this.f19993b = j6;
        this.f19994c = callable;
        this.f19995d = i7.m11697b(new C0005d(25, this, handler, callable));
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        return this.f19995d.cancel(z6);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f19995d.f39850b.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(this.f19993b - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f19995d.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f19995d.f39850b.isDone();
    }

    @Override // java.util.concurrent.RunnableScheduledFuture
    public final boolean isPeriodic() {
        return false;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        C8299i c8299i = (C8299i) this.f19992a.getAndSet(null);
        if (c8299i != null) {
            try {
                c8299i.m15507b(this.f19994c.call());
            } catch (Exception e2) {
                c8299i.m15509d(e2);
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j6, TimeUnit timeUnit) {
        return this.f19995d.f39850b.get(j6, timeUnit);
    }
}
