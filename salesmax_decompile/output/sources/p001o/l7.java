package p001o;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public abstract class l7 extends AtomicReference implements su5 {

    /* renamed from: c */
    public static final FutureTask f33333c;

    /* renamed from: d */
    public static final FutureTask f33334d;

    /* renamed from: a */
    public final Runnable f33335a;

    /* renamed from: b */
    public Thread f33336b;

    static {
        Runnable runnable = km7.f32431b;
        f33333c = new FutureTask(runnable, null);
        f33334d = new FutureTask(runnable, null);
    }

    public l7(Runnable runnable) {
        this.f33335a = runnable;
    }

    /* renamed from: a */
    public final void m36635a(Future future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 == f33333c) {
                return;
            }
            if (future2 == f33334d) {
                future.cancel(this.f33336b != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // p001o.su5
    public final void dispose() {
        FutureTask futureTask;
        Future future = (Future) get();
        if (future == f33333c || future == (futureTask = f33334d) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.f33336b != Thread.currentThread());
    }

    @Override // p001o.su5
    public final boolean isDisposed() {
        Future future = (Future) get();
        return future == f33333c || future == f33334d;
    }
}
