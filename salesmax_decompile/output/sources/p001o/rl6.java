package p001o;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class rl6 extends ql6 implements mk5 {

    /* renamed from: d */
    public final Executor f43773d;

    public rl6(Executor executor) {
        this.f43773d = executor;
        if (u0() instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) u0()).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // p001o.mk5
    /* renamed from: D */
    public void mo26962D(long j, xb2 xb2Var) {
        Executor executorU0 = u0();
        ScheduledExecutorService scheduledExecutorService = executorU0 instanceof ScheduledExecutorService ? (ScheduledExecutorService) executorU0 : null;
        ScheduledFuture scheduledFutureV0 = scheduledExecutorService != null ? v0(scheduledExecutorService, new zre(this, xb2Var), xb2Var.getContext(), j) : null;
        if (scheduledFutureV0 != null) {
            bc2.m18562c(xb2Var, new sb2(scheduledFutureV0));
        } else {
            wd5.f51804q.mo26962D(j, xb2Var);
        }
    }

    @Override // p001o.z74
    /* renamed from: K */
    public void mo22314K(q74 q74Var, Runnable runnable) {
        try {
            Executor executorU0 = u0();
            v9.m52465a();
            executorU0.execute(runnable);
        } catch (RejectedExecutionException e) {
            v9.m52465a();
            r0(q74Var, e);
            eu5.m25611b().mo22314K(q74Var, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor executorU0 = u0();
        ExecutorService executorService = executorU0 instanceof ExecutorService ? (ExecutorService) executorU0 : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof rl6) && ((rl6) obj).u0() == u0();
    }

    public int hashCode() {
        return System.identityHashCode(u0());
    }

    public final void r0(q74 q74Var, RejectedExecutionException rejectedExecutionException) {
        z69.m58838c(q74Var, al6.m17345a("The task was rejected", rejectedExecutionException));
    }

    @Override // p001o.mk5
    /* renamed from: t */
    public yu5 mo26963t(long j, Runnable runnable, q74 q74Var) {
        Executor executorU0 = u0();
        ScheduledExecutorService scheduledExecutorService = executorU0 instanceof ScheduledExecutorService ? (ScheduledExecutorService) executorU0 : null;
        ScheduledFuture scheduledFutureV0 = scheduledExecutorService != null ? v0(scheduledExecutorService, runnable, q74Var, j) : null;
        return scheduledFutureV0 != null ? new xu5(scheduledFutureV0) : wd5.f51804q.mo26963t(j, runnable, q74Var);
    }

    @Override // p001o.z74
    public String toString() {
        return u0().toString();
    }

    public Executor u0() {
        return this.f43773d;
    }

    public final ScheduledFuture v0(ScheduledExecutorService scheduledExecutorService, Runnable runnable, q74 q74Var, long j) {
        try {
            return scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            r0(q74Var, e);
            return null;
        }
    }
}
