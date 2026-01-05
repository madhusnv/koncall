package p001o;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p001o.c5f;

/* loaded from: classes6.dex */
public final class vuf extends c5f {

    /* renamed from: d */
    public static final vwe f50897d;

    /* renamed from: e */
    public static final ScheduledExecutorService f50898e;

    /* renamed from: b */
    public final ThreadFactory f50899b;

    /* renamed from: c */
    public final AtomicReference f50900c;

    /* renamed from: o.vuf$a */
    public static final class C17674a extends c5f.AbstractC12571c {

        /* renamed from: a */
        public final ScheduledExecutorService f50901a;

        /* renamed from: b */
        public final ko3 f50902b = new ko3();

        /* renamed from: c */
        public volatile boolean f50903c;

        public C17674a(ScheduledExecutorService scheduledExecutorService) {
            this.f50901a = scheduledExecutorService;
        }

        @Override // p001o.c5f.AbstractC12571c
        /* renamed from: d */
        public su5 mo20308d(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f50903c) {
                return h66.INSTANCE;
            }
            b5f b5fVar = new b5f(fwe.m27602u(runnable), this.f50902b);
            this.f50902b.mo30304a(b5fVar);
            try {
                b5fVar.m18173a(j <= 0 ? this.f50901a.submit((Callable) b5fVar) : this.f50901a.schedule((Callable) b5fVar, j, timeUnit));
                return b5fVar;
            } catch (RejectedExecutionException e) {
                dispose();
                fwe.m27599r(e);
                return h66.INSTANCE;
            }
        }

        @Override // p001o.su5
        public void dispose() {
            if (this.f50903c) {
                return;
            }
            this.f50903c = true;
            this.f50902b.dispose();
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return this.f50903c;
        }
    }

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f50898e = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        f50897d = new vwe("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx3.single-priority", 5).intValue())), true);
    }

    public vuf() {
        this(f50897d);
    }

    /* renamed from: g */
    public static ScheduledExecutorService m53457g(ThreadFactory threadFactory) {
        return g5f.m28069a(threadFactory);
    }

    @Override // p001o.c5f
    /* renamed from: b */
    public c5f.AbstractC12571c mo20301b() {
        return new C17674a((ScheduledExecutorService) this.f50900c.get());
    }

    @Override // p001o.c5f
    /* renamed from: d */
    public su5 mo20303d(Runnable runnable, long j, TimeUnit timeUnit) {
        a5f a5fVar = new a5f(fwe.m27602u(runnable));
        try {
            a5fVar.m36635a(j <= 0 ? ((ScheduledExecutorService) this.f50900c.get()).submit(a5fVar) : ((ScheduledExecutorService) this.f50900c.get()).schedule(a5fVar, j, timeUnit));
            return a5fVar;
        } catch (RejectedExecutionException e) {
            fwe.m27599r(e);
            return h66.INSTANCE;
        }
    }

    @Override // p001o.c5f
    /* renamed from: e */
    public su5 mo20304e(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Runnable runnableM27602u = fwe.m27602u(runnable);
        if (j2 > 0) {
            z4f z4fVar = new z4f(runnableM27602u);
            try {
                z4fVar.m36635a(((ScheduledExecutorService) this.f50900c.get()).scheduleAtFixedRate(z4fVar, j, j2, timeUnit));
                return z4fVar;
            } catch (RejectedExecutionException e) {
                fwe.m27599r(e);
                return h66.INSTANCE;
            }
        }
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f50900c.get();
        kk8 kk8Var = new kk8(runnableM27602u, scheduledExecutorService);
        try {
            kk8Var.m35804b(j <= 0 ? scheduledExecutorService.submit(kk8Var) : scheduledExecutorService.schedule(kk8Var, j, timeUnit));
            return kk8Var;
        } catch (RejectedExecutionException e2) {
            fwe.m27599r(e2);
            return h66.INSTANCE;
        }
    }

    @Override // p001o.c5f
    /* renamed from: f */
    public void mo20305f() {
        AtomicReference atomicReference = this.f50900c;
        ScheduledExecutorService scheduledExecutorService = f50898e;
        ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) atomicReference.getAndSet(scheduledExecutorService);
        if (scheduledExecutorService2 != scheduledExecutorService) {
            scheduledExecutorService2.shutdownNow();
        }
    }

    public vuf(ThreadFactory threadFactory) {
        AtomicReference atomicReference = new AtomicReference();
        this.f50900c = atomicReference;
        this.f50899b = threadFactory;
        atomicReference.lazySet(m53457g(threadFactory));
    }
}
