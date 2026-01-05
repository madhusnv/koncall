package tx;

import ay.C0496f;
import ay.ExecutorC0495e;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l0.RunnableC4307g;
import uw.InterfaceC7564h;
import yx.AbstractC8807a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class y0 extends x0 implements h0 {

    /* renamed from: c */
    public final Executor f34697c;

    public y0(Executor executor) {
        Method method;
        this.f34697c = executor;
        Method method2 = AbstractC8807a.f42478a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = AbstractC8807a.f42478a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // tx.AbstractC7262v
    public final void B0(InterfaceC7564h interfaceC7564h, Runnable runnable) {
        try {
            this.f34697c.execute(runnable);
        } catch (RejectedExecutionException e2) {
            c0.m13486i(interfaceC7564h, c0.m13478a("The task was rejected", e2));
            C0496f c0496f = m0.f34659a;
            ExecutorC0495e.f3538c.B0(interfaceC7564h, runnable);
        }
    }

    @Override // tx.h0
    /* renamed from: R */
    public final o0 mo13506R(long j6, Runnable runnable, InterfaceC7564h interfaceC7564h) {
        Executor executor = this.f34697c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnable, j6, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e2) {
                c0.m13486i(interfaceC7564h, c0.m13478a("The task was rejected", e2));
            }
        }
        return scheduledFutureSchedule != null ? new n0(scheduledFutureSchedule) : d0.f34618k.mo13506R(j6, runnable, interfaceC7564h);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f34697c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof y0) && ((y0) obj).f34697c == this.f34697c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f34697c);
    }

    @Override // tx.AbstractC7262v
    public final String toString() {
        return this.f34697c.toString();
    }

    @Override // tx.h0
    /* renamed from: w */
    public final void mo13517w(long j6, C7251k c7251k) {
        Executor executor = this.f34697c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            RunnableC4307g runnableC4307g = new RunnableC4307g(14, this, c7251k);
            InterfaceC7564h interfaceC7564h = c7251k.f34651e;
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnableC4307g, j6, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e2) {
                c0.m13486i(interfaceC7564h, c0.m13478a("The task was rejected", e2));
            }
        }
        if (scheduledFutureSchedule != null) {
            c7251k.m13543u(new C7248h(0, scheduledFutureSchedule));
        } else {
            d0.f34618k.mo13517w(j6, c7251k);
        }
    }
}
