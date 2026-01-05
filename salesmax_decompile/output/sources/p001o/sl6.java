package p001o;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p001o.c5f;

/* loaded from: classes6.dex */
public final class sl6 extends c5f {

    /* renamed from: e */
    public static final c5f f45553e = i5f.m31601e();

    /* renamed from: b */
    public final boolean f45554b;

    /* renamed from: c */
    public final boolean f45555c;

    /* renamed from: d */
    public final Executor f45556d;

    /* renamed from: o.sl6$a */
    public final class RunnableC16860a implements Runnable {

        /* renamed from: a */
        public final RunnableC16861b f45557a;

        public RunnableC16860a(RunnableC16861b runnableC16861b) {
            this.f45557a = runnableC16861b;
        }

        @Override // java.lang.Runnable
        public void run() {
            RunnableC16861b runnableC16861b = this.f45557a;
            runnableC16861b.f45560b.m46621a(sl6.this.mo20302c(runnableC16861b));
        }
    }

    /* renamed from: o.sl6$b */
    public static final class RunnableC16861b extends AtomicReference implements Runnable, su5 {

        /* renamed from: a */
        public final ref f45559a;

        /* renamed from: b */
        public final ref f45560b;

        public RunnableC16861b(Runnable runnable) {
            super(runnable);
            this.f45559a = new ref();
            this.f45560b = new ref();
        }

        @Override // p001o.su5
        public void dispose() {
            if (getAndSet(null) != null) {
                this.f45559a.dispose();
                this.f45560b.dispose();
            }
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return get() == null;
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = (Runnable) get();
            if (runnable != null) {
                try {
                    try {
                        runnable.run();
                        lazySet(null);
                        ref refVar = this.f45559a;
                        zu5 zu5Var = zu5.DISPOSED;
                        refVar.lazySet(zu5Var);
                        this.f45560b.lazySet(zu5Var);
                    } catch (Throwable th) {
                        lazySet(null);
                        this.f45559a.lazySet(zu5.DISPOSED);
                        this.f45560b.lazySet(zu5.DISPOSED);
                        throw th;
                    }
                } catch (Throwable th2) {
                    fwe.m27599r(th2);
                    throw th2;
                }
            }
        }
    }

    /* renamed from: o.sl6$c */
    public static final class RunnableC16862c extends c5f.AbstractC12571c implements Runnable {

        /* renamed from: a */
        public final boolean f45561a;

        /* renamed from: b */
        public final boolean f45562b;

        /* renamed from: c */
        public final Executor f45563c;

        /* renamed from: e */
        public volatile boolean f45565e;

        /* renamed from: f */
        public final AtomicInteger f45566f = new AtomicInteger();

        /* renamed from: g */
        public final ko3 f45567g = new ko3();

        /* renamed from: d */
        public final lnb f45564d = new lnb();

        /* renamed from: o.sl6$c$a */
        public static final class a extends AtomicBoolean implements Runnable, su5 {

            /* renamed from: a */
            public final Runnable f45568a;

            public a(Runnable runnable) {
                this.f45568a = runnable;
            }

            @Override // p001o.su5
            public void dispose() {
                lazySet(true);
            }

            @Override // p001o.su5
            public boolean isDisposed() {
                return get();
            }

            @Override // java.lang.Runnable
            public void run() {
                if (get()) {
                    return;
                }
                try {
                    this.f45568a.run();
                } finally {
                }
            }
        }

        /* renamed from: o.sl6$c$b */
        public static final class b extends AtomicInteger implements Runnable, su5 {

            /* renamed from: a */
            public final Runnable f45569a;

            /* renamed from: b */
            public final tu5 f45570b;

            /* renamed from: c */
            public volatile Thread f45571c;

            public b(Runnable runnable, tu5 tu5Var) {
                this.f45569a = runnable;
                this.f45570b = tu5Var;
            }

            /* renamed from: a */
            public void m48455a() {
                tu5 tu5Var = this.f45570b;
                if (tu5Var != null) {
                    tu5Var.mo30305b(this);
                }
            }

            @Override // p001o.su5
            public void dispose() {
                while (true) {
                    int i = get();
                    if (i >= 2) {
                        return;
                    }
                    if (i == 0) {
                        if (compareAndSet(0, 4)) {
                            m48455a();
                            return;
                        }
                    } else if (compareAndSet(1, 3)) {
                        Thread thread = this.f45571c;
                        if (thread != null) {
                            thread.interrupt();
                            this.f45571c = null;
                        }
                        set(4);
                        m48455a();
                        return;
                    }
                }
            }

            @Override // p001o.su5
            public boolean isDisposed() {
                return get() >= 2;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (get() == 0) {
                    this.f45571c = Thread.currentThread();
                    if (!compareAndSet(0, 1)) {
                        this.f45571c = null;
                        return;
                    }
                    try {
                        this.f45569a.run();
                        this.f45571c = null;
                        if (compareAndSet(1, 2)) {
                            m48455a();
                            return;
                        }
                        while (get() == 3) {
                            Thread.yield();
                        }
                        Thread.interrupted();
                    } catch (Throwable th) {
                        try {
                            fwe.m27599r(th);
                            throw th;
                        } catch (Throwable th2) {
                            this.f45571c = null;
                            if (compareAndSet(1, 2)) {
                                m48455a();
                            } else {
                                while (get() == 3) {
                                    Thread.yield();
                                }
                                Thread.interrupted();
                            }
                            throw th2;
                        }
                    }
                }
            }
        }

        /* renamed from: o.sl6$c$c */
        public final class c implements Runnable {

            /* renamed from: a */
            public final ref f45572a;

            /* renamed from: b */
            public final Runnable f45573b;

            public c(ref refVar, Runnable runnable) {
                this.f45572a = refVar;
                this.f45573b = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f45572a.m46621a(RunnableC16862c.this.mo20307b(this.f45573b));
            }
        }

        public RunnableC16862c(Executor executor, boolean z, boolean z2) {
            this.f45563c = executor;
            this.f45561a = z;
            this.f45562b = z2;
        }

        @Override // p001o.c5f.AbstractC12571c
        /* renamed from: b */
        public su5 mo20307b(Runnable runnable) {
            su5 aVar;
            if (this.f45565e) {
                return h66.INSTANCE;
            }
            Runnable runnableM27602u = fwe.m27602u(runnable);
            if (this.f45561a) {
                aVar = new b(runnableM27602u, this.f45567g);
                this.f45567g.mo30304a(aVar);
            } else {
                aVar = new a(runnableM27602u);
            }
            this.f45564d.offer(aVar);
            if (this.f45566f.getAndIncrement() == 0) {
                try {
                    this.f45563c.execute(this);
                } catch (RejectedExecutionException e) {
                    this.f45565e = true;
                    this.f45564d.clear();
                    fwe.m27599r(e);
                    return h66.INSTANCE;
                }
            }
            return aVar;
        }

        @Override // p001o.c5f.AbstractC12571c
        /* renamed from: d */
        public su5 mo20308d(Runnable runnable, long j, TimeUnit timeUnit) {
            if (j <= 0) {
                return mo20307b(runnable);
            }
            if (this.f45565e) {
                return h66.INSTANCE;
            }
            ref refVar = new ref();
            ref refVar2 = new ref(refVar);
            b5f b5fVar = new b5f(new c(refVar2, fwe.m27602u(runnable)), this.f45567g);
            this.f45567g.mo30304a(b5fVar);
            Executor executor = this.f45563c;
            if (executor instanceof ScheduledExecutorService) {
                try {
                    b5fVar.m18173a(((ScheduledExecutorService) executor).schedule((Callable) b5fVar, j, timeUnit));
                } catch (RejectedExecutionException e) {
                    this.f45565e = true;
                    fwe.m27599r(e);
                    return h66.INSTANCE;
                }
            } else {
                b5fVar.m18173a(new ev5(sl6.f45553e.mo20303d(b5fVar, j, timeUnit)));
            }
            refVar.m46621a(b5fVar);
            return refVar2;
        }

        @Override // p001o.su5
        public void dispose() {
            if (this.f45565e) {
                return;
            }
            this.f45565e = true;
            this.f45567g.dispose();
            if (this.f45566f.getAndIncrement() == 0) {
                this.f45564d.clear();
            }
        }

        /* renamed from: f */
        public void m48453f() {
            lnb lnbVar = this.f45564d;
            int iAddAndGet = 1;
            while (!this.f45565e) {
                do {
                    Runnable runnable = (Runnable) lnbVar.poll();
                    if (runnable != null) {
                        runnable.run();
                    } else if (this.f45565e) {
                        lnbVar.clear();
                        return;
                    } else {
                        iAddAndGet = this.f45566f.addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    }
                } while (!this.f45565e);
                lnbVar.clear();
                return;
            }
            lnbVar.clear();
        }

        /* renamed from: h */
        public void m48454h() {
            lnb lnbVar = this.f45564d;
            if (this.f45565e) {
                lnbVar.clear();
                return;
            }
            ((Runnable) lnbVar.poll()).run();
            if (this.f45565e) {
                lnbVar.clear();
            } else if (this.f45566f.decrementAndGet() != 0) {
                this.f45563c.execute(this);
            }
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return this.f45565e;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f45562b) {
                m48454h();
            } else {
                m48453f();
            }
        }
    }

    public sl6(Executor executor, boolean z, boolean z2) {
        this.f45556d = executor;
        this.f45554b = z;
        this.f45555c = z2;
    }

    @Override // p001o.c5f
    /* renamed from: b */
    public c5f.AbstractC12571c mo20301b() {
        return new RunnableC16862c(this.f45556d, this.f45554b, this.f45555c);
    }

    @Override // p001o.c5f
    /* renamed from: c */
    public su5 mo20302c(Runnable runnable) {
        Runnable runnableM27602u = fwe.m27602u(runnable);
        try {
            if (this.f45556d instanceof ExecutorService) {
                a5f a5fVar = new a5f(runnableM27602u);
                a5fVar.m36635a(((ExecutorService) this.f45556d).submit(a5fVar));
                return a5fVar;
            }
            if (this.f45554b) {
                RunnableC16862c.b bVar = new RunnableC16862c.b(runnableM27602u, null);
                this.f45556d.execute(bVar);
                return bVar;
            }
            RunnableC16862c.a aVar = new RunnableC16862c.a(runnableM27602u);
            this.f45556d.execute(aVar);
            return aVar;
        } catch (RejectedExecutionException e) {
            fwe.m27599r(e);
            return h66.INSTANCE;
        }
    }

    @Override // p001o.c5f
    /* renamed from: d */
    public su5 mo20303d(Runnable runnable, long j, TimeUnit timeUnit) {
        Runnable runnableM27602u = fwe.m27602u(runnable);
        if (!(this.f45556d instanceof ScheduledExecutorService)) {
            RunnableC16861b runnableC16861b = new RunnableC16861b(runnableM27602u);
            runnableC16861b.f45559a.m46621a(f45553e.mo20303d(new RunnableC16860a(runnableC16861b), j, timeUnit));
            return runnableC16861b;
        }
        try {
            a5f a5fVar = new a5f(runnableM27602u);
            a5fVar.m36635a(((ScheduledExecutorService) this.f45556d).schedule(a5fVar, j, timeUnit));
            return a5fVar;
        } catch (RejectedExecutionException e) {
            fwe.m27599r(e);
            return h66.INSTANCE;
        }
    }

    @Override // p001o.c5f
    /* renamed from: e */
    public su5 mo20304e(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        if (!(this.f45556d instanceof ScheduledExecutorService)) {
            return super.mo20304e(runnable, j, j2, timeUnit);
        }
        try {
            z4f z4fVar = new z4f(fwe.m27602u(runnable));
            z4fVar.m36635a(((ScheduledExecutorService) this.f45556d).scheduleAtFixedRate(z4fVar, j, j2, timeUnit));
            return z4fVar;
        } catch (RejectedExecutionException e) {
            fwe.m27599r(e);
            return h66.INSTANCE;
        }
    }
}
