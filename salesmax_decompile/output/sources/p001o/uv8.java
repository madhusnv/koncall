package p001o;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p001o.c5f;

/* loaded from: classes6.dex */
public final class uv8 extends c5f {

    /* renamed from: d */
    public static final vwe f49535d;

    /* renamed from: e */
    public static final vwe f49536e;

    /* renamed from: h */
    public static final C17456c f49539h;

    /* renamed from: i */
    public static final RunnableC17454a f49540i;

    /* renamed from: b */
    public final ThreadFactory f49541b;

    /* renamed from: c */
    public final AtomicReference f49542c;

    /* renamed from: g */
    public static final TimeUnit f49538g = TimeUnit.SECONDS;

    /* renamed from: f */
    public static final long f49537f = Long.getLong("rx3.io-keep-alive-time", 60).longValue();

    /* renamed from: o.uv8$a */
    public static final class RunnableC17454a implements Runnable {

        /* renamed from: a */
        public final long f49543a;

        /* renamed from: b */
        public final ConcurrentLinkedQueue f49544b;

        /* renamed from: c */
        public final ko3 f49545c;

        /* renamed from: d */
        public final ScheduledExecutorService f49546d;

        /* renamed from: e */
        public final Future f49547e;

        /* renamed from: f */
        public final ThreadFactory f49548f;

        public RunnableC17454a(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
            ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
            long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0L;
            this.f49543a = nanos;
            this.f49544b = new ConcurrentLinkedQueue();
            this.f49545c = new ko3();
            this.f49548f = threadFactory;
            if (timeUnit != null) {
                scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, uv8.f49536e);
                scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                scheduledExecutorServiceNewScheduledThreadPool = null;
                scheduledFutureScheduleWithFixedDelay = null;
            }
            this.f49546d = scheduledExecutorServiceNewScheduledThreadPool;
            this.f49547e = scheduledFutureScheduleWithFixedDelay;
        }

        /* renamed from: a */
        public static void m52049a(ConcurrentLinkedQueue concurrentLinkedQueue, ko3 ko3Var) {
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            long jM52050c = m52050c();
            Iterator it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                C17456c c17456c = (C17456c) it.next();
                if (c17456c.m52054l() > jM52050c) {
                    return;
                }
                if (concurrentLinkedQueue.remove(c17456c)) {
                    ko3Var.mo30306d(c17456c);
                }
            }
        }

        /* renamed from: c */
        public static long m52050c() {
            return System.nanoTime();
        }

        /* renamed from: b */
        public C17456c m52051b() {
            if (this.f49545c.isDisposed()) {
                return uv8.f49539h;
            }
            while (!this.f49544b.isEmpty()) {
                C17456c c17456c = (C17456c) this.f49544b.poll();
                if (c17456c != null) {
                    return c17456c;
                }
            }
            C17456c c17456c2 = new C17456c(this.f49548f);
            this.f49545c.mo30304a(c17456c2);
            return c17456c2;
        }

        /* renamed from: d */
        public void m52052d(C17456c c17456c) {
            c17456c.m52055n(m52050c() + this.f49543a);
            this.f49544b.offer(c17456c);
        }

        /* renamed from: e */
        public void m52053e() {
            this.f49545c.dispose();
            Future future = this.f49547e;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f49546d;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            m52049a(this.f49544b, this.f49545c);
        }
    }

    /* renamed from: o.uv8$b */
    public static final class C17455b extends c5f.AbstractC12571c {

        /* renamed from: b */
        public final RunnableC17454a f49550b;

        /* renamed from: c */
        public final C17456c f49551c;

        /* renamed from: d */
        public final AtomicBoolean f49552d = new AtomicBoolean();

        /* renamed from: a */
        public final ko3 f49549a = new ko3();

        public C17455b(RunnableC17454a runnableC17454a) {
            this.f49550b = runnableC17454a;
            this.f49551c = runnableC17454a.m52051b();
        }

        @Override // p001o.c5f.AbstractC12571c
        /* renamed from: d */
        public su5 mo20308d(Runnable runnable, long j, TimeUnit timeUnit) {
            return this.f49549a.isDisposed() ? h66.INSTANCE : this.f49551c.m50782f(runnable, j, timeUnit, this.f49549a);
        }

        @Override // p001o.su5
        public void dispose() {
            if (this.f49552d.compareAndSet(false, true)) {
                this.f49549a.dispose();
                this.f49550b.m52052d(this.f49551c);
            }
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return this.f49552d.get();
        }
    }

    /* renamed from: o.uv8$c */
    public static final class C17456c extends tyb {

        /* renamed from: c */
        public long f49553c;

        public C17456c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.f49553c = 0L;
        }

        /* renamed from: l */
        public long m52054l() {
            return this.f49553c;
        }

        /* renamed from: n */
        public void m52055n(long j) {
            this.f49553c = j;
        }
    }

    static {
        C17456c c17456c = new C17456c(new vwe("RxCachedThreadSchedulerShutdown"));
        f49539h = c17456c;
        c17456c.dispose();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx3.io-priority", 5).intValue()));
        vwe vweVar = new vwe("RxCachedThreadScheduler", iMax);
        f49535d = vweVar;
        f49536e = new vwe("RxCachedWorkerPoolEvictor", iMax);
        RunnableC17454a runnableC17454a = new RunnableC17454a(0L, null, vweVar);
        f49540i = runnableC17454a;
        runnableC17454a.m52053e();
    }

    public uv8() {
        this(f49535d);
    }

    @Override // p001o.c5f
    /* renamed from: b */
    public c5f.AbstractC12571c mo20301b() {
        return new C17455b((RunnableC17454a) this.f49542c.get());
    }

    @Override // p001o.c5f
    /* renamed from: f */
    public void mo20305f() {
        AtomicReference atomicReference = this.f49542c;
        RunnableC17454a runnableC17454a = f49540i;
        RunnableC17454a runnableC17454a2 = (RunnableC17454a) atomicReference.getAndSet(runnableC17454a);
        if (runnableC17454a2 != runnableC17454a) {
            runnableC17454a2.m52053e();
        }
    }

    /* renamed from: g */
    public void m52048g() {
        RunnableC17454a runnableC17454a = new RunnableC17454a(f49537f, f49538g, this.f49541b);
        if (ec3.m24748a(this.f49542c, f49540i, runnableC17454a)) {
            return;
        }
        runnableC17454a.m52053e();
    }

    public uv8(ThreadFactory threadFactory) {
        this.f49541b = threadFactory;
        this.f49542c = new AtomicReference(f49540i);
        m52048g();
    }
}
