package p001o;

import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class ff8 implements zfa {

    /* renamed from: o.ff8$a */
    public static class C13413a extends ff8 {

        /* renamed from: a */
        public final Throwable f23206a;

        public C13413a(Throwable th) {
            this.f23206a = th;
        }

        @Override // p001o.ff8, java.util.concurrent.Future
        public Object get() throws ExecutionException {
            throw new ExecutionException(this.f23206a);
        }

        public String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.f23206a + "]]";
        }
    }

    /* renamed from: o.ff8$b */
    public static final class ScheduledFutureC13414b extends C13413a implements ScheduledFuture {
        public ScheduledFutureC13414b(Throwable th) {
            super(th);
        }

        @Override // java.lang.Comparable
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(Delayed delayed) {
            return -1;
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            return 0L;
        }
    }

    /* renamed from: o.ff8$c */
    public static final class C13415c extends ff8 {

        /* renamed from: b */
        public static final ff8 f23207b = new C13415c(null);

        /* renamed from: a */
        public final Object f23208a;

        public C13415c(Object obj) {
            this.f23208a = obj;
        }

        @Override // p001o.ff8, java.util.concurrent.Future
        public Object get() {
            return this.f23208a;
        }

        public String toString() {
            return super.toString() + "[status=SUCCESS, result=[" + this.f23208a + "]]";
        }
    }

    /* renamed from: a */
    public static zfa m26548a() {
        return C13415c.f23207b;
    }

    @Override // p001o.zfa
    public void addListener(Runnable runnable, Executor executor) {
        fgd.m26663g(runnable);
        fgd.m26663g(executor);
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            wja.m54630d("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public abstract Object get();

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        fgd.m26663g(timeUnit);
        return get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }
}
