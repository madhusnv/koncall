package p001o;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public class ag2 extends rm7 implements Runnable {

    /* renamed from: c */
    public wr0 f14635c;

    /* renamed from: d */
    public final BlockingQueue f14636d = new LinkedBlockingQueue(1);

    /* renamed from: e */
    public final CountDownLatch f14637e = new CountDownLatch(1);

    /* renamed from: f */
    public zfa f14638f;

    /* renamed from: g */
    public volatile zfa f14639g;

    /* renamed from: o.ag2$a */
    public class RunnableC12166a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ zfa f14640a;

        public RunnableC12166a(zfa zfaVar) {
            this.f14640a = zfaVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    ag2.this.m46958b(bn7.m19427m(this.f14640a));
                } catch (CancellationException unused) {
                    ag2.this.cancel(false);
                    ag2.this.f14639g = null;
                    return;
                } catch (ExecutionException e) {
                    ag2.this.m46959c(e.getCause());
                }
                ag2.this.f14639g = null;
            } catch (Throwable th) {
                ag2.this.f14639g = null;
                throw th;
            }
        }
    }

    public ag2(wr0 wr0Var, zfa zfaVar) {
        this.f14635c = (wr0) fgd.m26663g(wr0Var);
        this.f14638f = (zfa) fgd.m26663g(zfaVar);
    }

    @Override // p001o.rm7, java.util.concurrent.Future
    public boolean cancel(boolean z) {
        if (!super.cancel(z)) {
            return false;
        }
        m17019g(this.f14636d, Boolean.valueOf(z));
        m17018f(this.f14638f, z);
        m17018f(this.f14639g, z);
        return true;
    }

    /* renamed from: f */
    public final void m17018f(Future future, boolean z) {
        if (future != null) {
            future.cancel(z);
        }
    }

    /* renamed from: g */
    public final void m17019g(BlockingQueue blockingQueue, Object obj) {
        boolean z = false;
        while (true) {
            try {
                blockingQueue.put(obj);
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
    }

    @Override // p001o.rm7, java.util.concurrent.Future
    public Object get() throws ExecutionException, InterruptedException {
        if (!isDone()) {
            zfa zfaVar = this.f14638f;
            if (zfaVar != null) {
                zfaVar.get();
            }
            this.f14637e.await();
            zfa zfaVar2 = this.f14639g;
            if (zfaVar2 != null) {
                zfaVar2.get();
            }
        }
        return super.get();
    }

    /* renamed from: h */
    public final Object m17020h(BlockingQueue blockingQueue) {
        Object objTake;
        boolean z = false;
        while (true) {
            try {
                objTake = blockingQueue.take();
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
        return objTake;
    }

    @Override // java.lang.Runnable
    public void run() {
        zfa zfaVarApply;
        try {
            try {
                try {
                    try {
                        zfaVarApply = this.f14635c.apply(bn7.m19427m(this.f14638f));
                        this.f14639g = zfaVarApply;
                    } catch (Error e) {
                        m46959c(e);
                    } catch (UndeclaredThrowableException e2) {
                        m46959c(e2.getCause());
                    }
                } catch (Throwable th) {
                    this.f14635c = null;
                    this.f14638f = null;
                    this.f14637e.countDown();
                    throw th;
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e3) {
                m46959c(e3.getCause());
            }
        } catch (Exception e4) {
            m46959c(e4);
        }
        if (!isCancelled()) {
            zfaVarApply.addListener(new RunnableC12166a(zfaVarApply), gb2.m28293a());
            this.f14635c = null;
            this.f14638f = null;
            this.f14637e.countDown();
            return;
        }
        zfaVarApply.cancel(((Boolean) m17020h(this.f14636d)).booleanValue());
        this.f14639g = null;
        this.f14635c = null;
        this.f14638f = null;
        this.f14637e.countDown();
    }

    @Override // p001o.rm7, java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (!isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j = timeUnit2.convert(j, timeUnit);
                timeUnit = timeUnit2;
            }
            zfa zfaVar = this.f14638f;
            if (zfaVar != null) {
                long jNanoTime = System.nanoTime();
                zfaVar.get(j, timeUnit);
                j -= Math.max(0L, System.nanoTime() - jNanoTime);
            }
            long jNanoTime2 = System.nanoTime();
            if (this.f14637e.await(j, timeUnit)) {
                j -= Math.max(0L, System.nanoTime() - jNanoTime2);
                zfa zfaVar2 = this.f14639g;
                if (zfaVar2 != null) {
                    zfaVar2.get(j, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return super.get(j, timeUnit);
    }
}
