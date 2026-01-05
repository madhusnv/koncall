package p001o;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p001o.g32;

/* loaded from: classes2.dex */
public final class sw7 extends AbstractExecutorService implements ScheduledExecutorService {

    /* renamed from: b */
    public static ThreadLocal f46022b = new C16924a();

    /* renamed from: a */
    public final Handler f46023a;

    /* renamed from: o.sw7$a */
    public class C16924a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ScheduledExecutorService initialValue() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return gb2.m28295c();
            }
            if (Looper.myLooper() != null) {
                return new sw7(new Handler(Looper.myLooper()));
            }
            return null;
        }
    }

    /* renamed from: o.sw7$b */
    public class CallableC16925b implements Callable {

        /* renamed from: a */
        public final /* synthetic */ Runnable f46024a;

        public CallableC16925b(Runnable runnable) {
            this.f46024a = runnable;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            this.f46024a.run();
            return null;
        }
    }

    /* renamed from: o.sw7$c */
    public static class RunnableScheduledFutureC16926c implements RunnableScheduledFuture {

        /* renamed from: a */
        public final AtomicReference f46026a = new AtomicReference(null);

        /* renamed from: b */
        public final long f46027b;

        /* renamed from: c */
        public final Callable f46028c;

        /* renamed from: d */
        public final zfa f46029d;

        /* renamed from: o.sw7$c$a */
        public class a implements g32.InterfaceC13616c {

            /* renamed from: a */
            public final /* synthetic */ Handler f46030a;

            /* renamed from: b */
            public final /* synthetic */ Callable f46031b;

            /* renamed from: o.sw7$c$a$a, reason: collision with other inner class name */
            public class RunnableC19594a implements Runnable {
                public RunnableC19594a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (RunnableScheduledFutureC16926c.this.f46026a.getAndSet(null) != null) {
                        a aVar = a.this;
                        aVar.f46030a.removeCallbacks(RunnableScheduledFutureC16926c.this);
                    }
                }
            }

            public a(Handler handler, Callable callable) {
                this.f46030a = handler;
                this.f46031b = callable;
            }

            @Override // p001o.g32.InterfaceC13616c
            public Object attachCompleter(g32.C13614a c13614a) {
                c13614a.m28003a(new RunnableC19594a(), gb2.m28293a());
                RunnableScheduledFutureC16926c.this.f46026a.set(c13614a);
                return "HandlerScheduledFuture-" + this.f46031b.toString();
            }
        }

        public RunnableScheduledFutureC16926c(Handler handler, long j, Callable callable) {
            this.f46027b = j;
            this.f46028c = callable;
            this.f46029d = g32.m28002a(new a(handler, callable));
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(Delayed delayed) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            return this.f46029d.cancel(z);
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            return this.f46029d.get();
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            return timeUnit.convert(this.f46027b - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f46029d.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f46029d.isDone();
        }

        @Override // java.util.concurrent.RunnableScheduledFuture
        public boolean isPeriodic() {
            return false;
        }

        @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
            g32.C13614a c13614a = (g32.C13614a) this.f46026a.getAndSet(null);
            if (c13614a != null) {
                try {
                    c13614a.m28005c(this.f46028c.call());
                } catch (Exception e) {
                    c13614a.m28008f(e);
                }
            }
        }

        @Override // java.util.concurrent.Future
        public Object get(long j, TimeUnit timeUnit) {
            return this.f46029d.get(j, timeUnit);
        }
    }

    public sw7(Handler handler) {
        this.f46023a = handler;
    }

    /* renamed from: a */
    public final RejectedExecutionException m48960a() {
        return new RejectedExecutionException(this.f46023a + " is shutting down");
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(sw7.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (!this.f46023a.post(runnable)) {
            throw m48960a();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return schedule(new CallableC16925b(runnable), j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(sw7.class.getSimpleName() + " does not yet support fixed-rate scheduling.");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(sw7.class.getSimpleName() + " does not yet support fixed-delay scheduling.");
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException(sw7.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        throw new UnsupportedOperationException(sw7.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        long jUptimeMillis = SystemClock.uptimeMillis() + TimeUnit.MILLISECONDS.convert(j, timeUnit);
        RunnableScheduledFutureC16926c runnableScheduledFutureC16926c = new RunnableScheduledFutureC16926c(this.f46023a, jUptimeMillis, callable);
        return this.f46023a.postAtTime(runnableScheduledFutureC16926c, jUptimeMillis) ? runnableScheduledFutureC16926c : bn7.m19429o(m48960a());
    }
}
