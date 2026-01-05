package p001o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p001o.ff8;
import p001o.g32;

/* loaded from: classes2.dex */
public abstract class bn7 {

    /* renamed from: a */
    public static final zl7 f16567a = new C12459b();

    /* renamed from: o.bn7$a */
    public class C12458a implements wr0 {

        /* renamed from: a */
        public final /* synthetic */ zl7 f16568a;

        public C12458a(zl7 zl7Var) {
            this.f16568a = zl7Var;
        }

        @Override // p001o.wr0
        public zfa apply(Object obj) {
            return bn7.m19430p(this.f16568a.apply(obj));
        }
    }

    /* renamed from: o.bn7$b */
    public class C12459b implements zl7 {
        @Override // p001o.zl7
        public Object apply(Object obj) {
            return obj;
        }
    }

    /* renamed from: o.bn7$c */
    public class C12460c implements qm7 {

        /* renamed from: a */
        public final /* synthetic */ g32.C13614a f16569a;

        /* renamed from: b */
        public final /* synthetic */ zl7 f16570b;

        public C12460c(g32.C13614a c13614a, zl7 zl7Var) {
            this.f16569a = c13614a;
            this.f16570b = zl7Var;
        }

        @Override // p001o.qm7
        /* renamed from: a */
        public void mo4761a(Throwable th) {
            this.f16569a.m28008f(th);
        }

        @Override // p001o.qm7
        public void onSuccess(Object obj) {
            try {
                this.f16569a.m28005c(this.f16570b.apply(obj));
            } catch (Throwable th) {
                this.f16569a.m28008f(th);
            }
        }
    }

    /* renamed from: o.bn7$d */
    public class RunnableC12461d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ zfa f16571a;

        public RunnableC12461d(zfa zfaVar) {
            this.f16571a = zfaVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f16571a.cancel(true);
        }
    }

    /* renamed from: o.bn7$e */
    public static final class RunnableC12462e implements Runnable {

        /* renamed from: a */
        public final Future f16572a;

        /* renamed from: b */
        public final qm7 f16573b;

        public RunnableC12462e(Future future, qm7 qm7Var) {
            this.f16572a = future;
            this.f16573b = qm7Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f16573b.onSuccess(bn7.m19426l(this.f16572a));
            } catch (Error e) {
                e = e;
                this.f16573b.mo4761a(e);
            } catch (RuntimeException e2) {
                e = e2;
                this.f16573b.mo4761a(e);
            } catch (ExecutionException e3) {
                Throwable cause = e3.getCause();
                if (cause == null) {
                    this.f16573b.mo4761a(e3);
                } else {
                    this.f16573b.mo4761a(cause);
                }
            }
        }

        public String toString() {
            return RunnableC12462e.class.getSimpleName() + "," + this.f16573b;
        }
    }

    /* renamed from: A */
    public static zfa m19406A(final long j, final ScheduledExecutorService scheduledExecutorService, final zfa zfaVar) {
        return g32.m28002a(new g32.InterfaceC13616c() { // from class: o.an7
            @Override // p001o.g32.InterfaceC13616c
            public final Object attachCompleter(g32.C13614a c13614a) {
                return bn7.m19433s(zfaVar, scheduledExecutorService, j, c13614a);
            }
        });
    }

    /* renamed from: B */
    public static zfa m19407B(final zfa zfaVar) {
        fgd.m26663g(zfaVar);
        return zfaVar.isDone() ? zfaVar : g32.m28002a(new g32.InterfaceC13616c() { // from class: o.zm7
            @Override // p001o.g32.InterfaceC13616c
            public final Object attachCompleter(g32.C13614a c13614a) {
                return bn7.m19437w(zfaVar, c13614a);
            }
        });
    }

    /* renamed from: C */
    public static void m19408C(zfa zfaVar, g32.C13614a c13614a) {
        m19409D(zfaVar, f16567a, c13614a, gb2.m28293a());
    }

    /* renamed from: D */
    public static void m19409D(zfa zfaVar, zl7 zl7Var, g32.C13614a c13614a, Executor executor) {
        m19410E(true, zfaVar, zl7Var, c13614a, executor);
    }

    /* renamed from: E */
    public static void m19410E(boolean z, zfa zfaVar, zl7 zl7Var, g32.C13614a c13614a, Executor executor) {
        fgd.m26663g(zfaVar);
        fgd.m26663g(zl7Var);
        fgd.m26663g(c13614a);
        fgd.m26663g(executor);
        m19424j(zfaVar, new C12460c(c13614a, zl7Var), executor);
        if (z) {
            c13614a.m28003a(new RunnableC12461d(zfaVar), gb2.m28293a());
        }
    }

    /* renamed from: F */
    public static zfa m19411F(Collection collection) {
        return new qea(new ArrayList(collection), false, gb2.m28293a());
    }

    /* renamed from: G */
    public static zfa m19412G(zfa zfaVar, zl7 zl7Var, Executor executor) {
        fgd.m26663g(zl7Var);
        return m19413H(zfaVar, new C12458a(zl7Var), executor);
    }

    /* renamed from: H */
    public static zfa m19413H(zfa zfaVar, wr0 wr0Var, Executor executor) {
        ag2 ag2Var = new ag2(wr0Var, zfaVar);
        zfaVar.addListener(ag2Var, executor);
        return ag2Var;
    }

    /* renamed from: I */
    public static zfa m19414I(final zfa zfaVar) {
        return g32.m28002a(new g32.InterfaceC13616c() { // from class: o.um7
            @Override // p001o.g32.InterfaceC13616c
            public final Object attachCompleter(g32.C13614a c13614a) {
                return bn7.m19439y(zfaVar, c13614a);
            }
        });
    }

    /* renamed from: j */
    public static void m19424j(zfa zfaVar, qm7 qm7Var, Executor executor) {
        fgd.m26663g(qm7Var);
        zfaVar.addListener(new RunnableC12462e(zfaVar, qm7Var), executor);
    }

    /* renamed from: k */
    public static zfa m19425k(Collection collection) {
        return new qea(new ArrayList(collection), true, gb2.m28293a());
    }

    /* renamed from: l */
    public static Object m19426l(Future future) {
        fgd.m26666j(future.isDone(), "Future was expected to be done, " + future);
        return m19427m(future);
    }

    /* renamed from: m */
    public static Object m19427m(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* renamed from: n */
    public static zfa m19428n(Throwable th) {
        return new ff8.C13413a(th);
    }

    /* renamed from: o */
    public static ScheduledFuture m19429o(Throwable th) {
        return new ff8.ScheduledFutureC13414b(th);
    }

    /* renamed from: p */
    public static zfa m19430p(Object obj) {
        return obj == null ? ff8.m26548a() : new ff8.C13415c(obj);
    }

    /* renamed from: q */
    public static /* synthetic */ Boolean m19431q(g32.C13614a c13614a, zfa zfaVar, long j) {
        return Boolean.valueOf(c13614a.m28008f(new TimeoutException("Future[" + zfaVar + "] is not done within " + j + " ms.")));
    }

    /* renamed from: s */
    public static /* synthetic */ Object m19433s(final zfa zfaVar, ScheduledExecutorService scheduledExecutorService, final long j, final g32.C13614a c13614a) {
        m19408C(zfaVar, c13614a);
        if (!zfaVar.isDone()) {
            final ScheduledFuture scheduledFutureSchedule = scheduledExecutorService.schedule(new Callable() { // from class: o.sm7
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return bn7.m19431q(c13614a, zfaVar, j);
                }
            }, j, TimeUnit.MILLISECONDS);
            zfaVar.addListener(new Runnable() { // from class: o.tm7
                @Override // java.lang.Runnable
                public final void run() {
                    scheduledFutureSchedule.cancel(true);
                }
            }, gb2.m28293a());
        }
        return "TimeoutFuture[" + zfaVar + "]";
    }

    /* renamed from: t */
    public static /* synthetic */ void m19434t(g32.C13614a c13614a, Object obj, boolean z, zfa zfaVar) {
        c13614a.m28005c(obj);
        if (z) {
            zfaVar.cancel(true);
        }
    }

    /* renamed from: v */
    public static /* synthetic */ Object m19436v(final zfa zfaVar, ScheduledExecutorService scheduledExecutorService, final Object obj, final boolean z, long j, final g32.C13614a c13614a) {
        m19408C(zfaVar, c13614a);
        if (!zfaVar.isDone()) {
            final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new Runnable() { // from class: o.xm7
                @Override // java.lang.Runnable
                public final void run() {
                    bn7.m19434t(c13614a, obj, z, zfaVar);
                }
            }, j, TimeUnit.MILLISECONDS);
            zfaVar.addListener(new Runnable() { // from class: o.ym7
                @Override // java.lang.Runnable
                public final void run() {
                    scheduledFutureSchedule.cancel(true);
                }
            }, gb2.m28293a());
        }
        return "TimeoutFuture[" + zfaVar + "]";
    }

    /* renamed from: w */
    public static /* synthetic */ Object m19437w(zfa zfaVar, g32.C13614a c13614a) {
        m19410E(false, zfaVar, f16567a, c13614a, gb2.m28293a());
        return "nonCancellationPropagating[" + zfaVar + "]";
    }

    /* renamed from: y */
    public static /* synthetic */ Object m19439y(zfa zfaVar, final g32.C13614a c13614a) {
        zfaVar.addListener(new Runnable() { // from class: o.wm7
            @Override // java.lang.Runnable
            public final void run() {
                c13614a.m28005c(null);
            }
        }, gb2.m28293a());
        return "transformVoidFuture [" + zfaVar + "]";
    }

    /* renamed from: z */
    public static zfa m19440z(final long j, final ScheduledExecutorService scheduledExecutorService, final Object obj, final boolean z, final zfa zfaVar) {
        return g32.m28002a(new g32.InterfaceC13616c() { // from class: o.vm7
            @Override // p001o.g32.InterfaceC13616c
            public final Object attachCompleter(g32.C13614a c13614a) {
                return bn7.m19436v(zfaVar, scheduledExecutorService, obj, z, j, c13614a);
            }
        });
    }
}
