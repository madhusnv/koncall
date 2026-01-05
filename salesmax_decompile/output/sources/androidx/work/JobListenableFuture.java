package androidx.work;

import androidx.work.impl.utils.futures.SettableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p001o.id5;
import p001o.kf9;
import p001o.p69;
import p001o.sq8;
import p001o.xk7;
import p001o.y3i;
import p001o.zfa;

/* loaded from: classes2.dex */
public final class JobListenableFuture<R> implements zfa {
    private final p69 job;
    private final SettableFuture<R> underlying;

    /* renamed from: androidx.work.JobListenableFuture$1 */
    public static final class C25711 extends kf9 implements xk7 {
        final /* synthetic */ JobListenableFuture<R> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25711(JobListenableFuture<R> jobListenableFuture) {
            super(1);
            this.this$0 = jobListenableFuture;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return y3i.f54824a;
        }

        public final void invoke(Throwable th) {
            if (th == null) {
                if (!((JobListenableFuture) this.this$0).underlying.isDone()) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            } else {
                if (th instanceof CancellationException) {
                    ((JobListenableFuture) this.this$0).underlying.cancel(true);
                    return;
                }
                SettableFuture settableFuture = ((JobListenableFuture) this.this$0).underlying;
                Throwable cause = th.getCause();
                if (cause != null) {
                    th = cause;
                }
                settableFuture.setException(th);
            }
        }
    }

    public JobListenableFuture(p69 p69Var, SettableFuture<R> settableFuture) {
        sq8.m48649h(p69Var, "job");
        sq8.m48649h(settableFuture, "underlying");
        this.job = p69Var;
        this.underlying = settableFuture;
        p69Var.j0(new C25711(this));
    }

    @Override // p001o.zfa
    public void addListener(Runnable runnable, Executor executor) {
        this.underlying.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.underlying.cancel(z);
    }

    public final void complete(R r) {
        this.underlying.set(r);
    }

    @Override // java.util.concurrent.Future
    public R get() {
        return this.underlying.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.underlying.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.underlying.isDone();
    }

    @Override // java.util.concurrent.Future
    public R get(long j, TimeUnit timeUnit) {
        return this.underlying.get(j, timeUnit);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ JobListenableFuture(p69 p69Var, SettableFuture settableFuture, int i, id5 id5Var) {
        if ((i & 2) != 0) {
            settableFuture = SettableFuture.create();
            sq8.m48648g(settableFuture, "create()");
        }
        this(p69Var, settableFuture);
    }
}
