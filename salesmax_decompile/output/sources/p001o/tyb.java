package p001o;

import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p001o.c5f;

/* loaded from: classes6.dex */
public class tyb extends c5f.AbstractC12571c {

    /* renamed from: a */
    public final ScheduledExecutorService f48048a;

    /* renamed from: b */
    public volatile boolean f48049b;

    public tyb(ThreadFactory threadFactory) {
        this.f48048a = g5f.m28069a(threadFactory);
    }

    @Override // p001o.c5f.AbstractC12571c
    /* renamed from: b */
    public su5 mo20307b(Runnable runnable) {
        return mo20308d(runnable, 0L, null);
    }

    @Override // p001o.c5f.AbstractC12571c
    /* renamed from: d */
    public su5 mo20308d(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f48049b ? h66.INSTANCE : m50782f(runnable, j, timeUnit, null);
    }

    @Override // p001o.su5
    public void dispose() {
        if (this.f48049b) {
            return;
        }
        this.f48049b = true;
        this.f48048a.shutdownNow();
    }

    /* renamed from: f */
    public b5f m50782f(Runnable runnable, long j, TimeUnit timeUnit, tu5 tu5Var) {
        b5f b5fVar = new b5f(fwe.m27602u(runnable), tu5Var);
        if (tu5Var != null && !tu5Var.mo30304a(b5fVar)) {
            return b5fVar;
        }
        try {
            b5fVar.m18173a(j <= 0 ? this.f48048a.submit((Callable) b5fVar) : this.f48048a.schedule((Callable) b5fVar, j, timeUnit));
        } catch (RejectedExecutionException e) {
            if (tu5Var != null) {
                tu5Var.mo30306d(b5fVar);
            }
            fwe.m27599r(e);
        }
        return b5fVar;
    }

    /* renamed from: h */
    public su5 m50783h(Runnable runnable, long j, TimeUnit timeUnit) {
        a5f a5fVar = new a5f(fwe.m27602u(runnable));
        try {
            a5fVar.m36635a(j <= 0 ? this.f48048a.submit(a5fVar) : this.f48048a.schedule(a5fVar, j, timeUnit));
            return a5fVar;
        } catch (RejectedExecutionException e) {
            fwe.m27599r(e);
            return h66.INSTANCE;
        }
    }

    /* renamed from: i */
    public su5 m50784i(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Runnable runnableM27602u = fwe.m27602u(runnable);
        if (j2 <= 0) {
            kk8 kk8Var = new kk8(runnableM27602u, this.f48048a);
            try {
                kk8Var.m35804b(j <= 0 ? this.f48048a.submit(kk8Var) : this.f48048a.schedule(kk8Var, j, timeUnit));
                return kk8Var;
            } catch (RejectedExecutionException e) {
                fwe.m27599r(e);
                return h66.INSTANCE;
            }
        }
        z4f z4fVar = new z4f(runnableM27602u);
        try {
            z4fVar.m36635a(this.f48048a.scheduleAtFixedRate(z4fVar, j, j2, timeUnit));
            return z4fVar;
        } catch (RejectedExecutionException e2) {
            fwe.m27599r(e2);
            return h66.INSTANCE;
        }
    }

    @Override // p001o.su5
    public boolean isDisposed() {
        return this.f48049b;
    }

    /* renamed from: k */
    public void m50785k() {
        if (this.f48049b) {
            return;
        }
        this.f48049b = true;
        this.f48048a.shutdown();
    }
}
