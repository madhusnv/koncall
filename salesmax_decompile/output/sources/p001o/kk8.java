package p001o;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class kk8 implements Callable, su5 {

    /* renamed from: f */
    public static final FutureTask f32331f = new FutureTask(km7.f32431b, null);

    /* renamed from: a */
    public final Runnable f32332a;

    /* renamed from: d */
    public final ExecutorService f32335d;

    /* renamed from: e */
    public Thread f32336e;

    /* renamed from: c */
    public final AtomicReference f32334c = new AtomicReference();

    /* renamed from: b */
    public final AtomicReference f32333b = new AtomicReference();

    public kk8(Runnable runnable, ExecutorService executorService) {
        this.f32332a = runnable;
        this.f32335d = executorService;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Void call() {
        this.f32336e = Thread.currentThread();
        try {
            this.f32332a.run();
            this.f32336e = null;
            m35805d(this.f32335d.submit(this));
            return null;
        } catch (Throwable th) {
            this.f32336e = null;
            fwe.m27599r(th);
            throw th;
        }
    }

    /* renamed from: b */
    public void m35804b(Future future) {
        Future future2;
        do {
            future2 = (Future) this.f32334c.get();
            if (future2 == f32331f) {
                future.cancel(this.f32336e != Thread.currentThread());
                return;
            }
        } while (!ec3.m24748a(this.f32334c, future2, future));
    }

    /* renamed from: d */
    public void m35805d(Future future) {
        Future future2;
        do {
            future2 = (Future) this.f32333b.get();
            if (future2 == f32331f) {
                future.cancel(this.f32336e != Thread.currentThread());
                return;
            }
        } while (!ec3.m24748a(this.f32333b, future2, future));
    }

    @Override // p001o.su5
    public void dispose() {
        AtomicReference atomicReference = this.f32334c;
        FutureTask futureTask = f32331f;
        Future future = (Future) atomicReference.getAndSet(futureTask);
        if (future != null && future != futureTask) {
            future.cancel(this.f32336e != Thread.currentThread());
        }
        Future future2 = (Future) this.f32333b.getAndSet(futureTask);
        if (future2 == null || future2 == futureTask) {
            return;
        }
        future2.cancel(this.f32336e != Thread.currentThread());
    }

    @Override // p001o.su5
    public boolean isDisposed() {
        return this.f32334c.get() == f32331f;
    }
}
