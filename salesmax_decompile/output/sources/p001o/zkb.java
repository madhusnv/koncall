package p001o;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public abstract class zkb {

    /* renamed from: f */
    public static final ThreadFactory f57315f;

    /* renamed from: g */
    public static final BlockingQueue f57316g;

    /* renamed from: h */
    public static final Executor f57317h;

    /* renamed from: q */
    public static HandlerC18673f f57318q;

    /* renamed from: s */
    public static volatile Executor f57319s;

    /* renamed from: a */
    public final AbstractCallableC18675h f57320a;

    /* renamed from: b */
    public final FutureTask f57321b;

    /* renamed from: c */
    public volatile EnumC18674g f57322c = EnumC18674g.PENDING;

    /* renamed from: d */
    public final AtomicBoolean f57323d = new AtomicBoolean();

    /* renamed from: e */
    public final AtomicBoolean f57324e = new AtomicBoolean();

    /* renamed from: o.zkb$a */
    public static class ThreadFactoryC18668a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f57325a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f57325a.getAndIncrement());
        }
    }

    /* renamed from: o.zkb$b */
    public class C18669b extends AbstractCallableC18675h {
        public C18669b() {
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            zkb.this.f57324e.set(true);
            Object objMo59541b = null;
            try {
                Process.setThreadPriority(10);
                objMo59541b = zkb.this.mo59541b(this.f57331a);
                Binder.flushPendingCommands();
                return objMo59541b;
            } finally {
            }
        }
    }

    /* renamed from: o.zkb$c */
    public class C18670c extends FutureTask {
        public C18670c(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            try {
                zkb.this.m59550l(get());
            } catch (InterruptedException unused) {
            } catch (CancellationException unused2) {
                zkb.this.m59550l(null);
            } catch (ExecutionException e) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* renamed from: o.zkb$d */
    public static /* synthetic */ class C18671d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f57328a;

        static {
            int[] iArr = new int[EnumC18674g.values().length];
            f57328a = iArr;
            try {
                iArr[EnumC18674g.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57328a[EnumC18674g.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: o.zkb$e */
    public static class C18672e {

        /* renamed from: a */
        public final zkb f57329a;

        /* renamed from: b */
        public final Object[] f57330b;

        public C18672e(zkb zkbVar, Object... objArr) {
            this.f57329a = zkbVar;
            this.f57330b = objArr;
        }
    }

    /* renamed from: o.zkb$f */
    public static class HandlerC18673f extends Handler {
        public HandlerC18673f() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C18672e c18672e = (C18672e) message.obj;
            int i = message.what;
            if (i == 1) {
                c18672e.f57329a.m59543d(c18672e.f57330b[0]);
            } else {
                if (i != 2) {
                    return;
                }
                c18672e.f57329a.m59548j(c18672e.f57330b);
            }
        }
    }

    /* renamed from: o.zkb$g */
    public enum EnumC18674g {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* renamed from: o.zkb$h */
    public static abstract class AbstractCallableC18675h implements Callable {

        /* renamed from: a */
        public Object[] f57331a;
    }

    static {
        ThreadFactoryC18668a threadFactoryC18668a = new ThreadFactoryC18668a();
        f57315f = threadFactoryC18668a;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f57316g = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, linkedBlockingQueue, threadFactoryC18668a);
        f57317h = threadPoolExecutor;
        f57319s = threadPoolExecutor;
    }

    public zkb() {
        C18669b c18669b = new C18669b();
        this.f57320a = c18669b;
        this.f57321b = new C18670c(c18669b);
    }

    /* renamed from: e */
    public static Handler m59539e() {
        HandlerC18673f handlerC18673f;
        synchronized (zkb.class) {
            if (f57318q == null) {
                f57318q = new HandlerC18673f();
            }
            handlerC18673f = f57318q;
        }
        return handlerC18673f;
    }

    /* renamed from: a */
    public final boolean m59540a(boolean z) {
        this.f57323d.set(true);
        return this.f57321b.cancel(z);
    }

    /* renamed from: b */
    public abstract Object mo59541b(Object... objArr);

    /* renamed from: c */
    public final zkb m59542c(Executor executor, Object... objArr) {
        if (this.f57322c == EnumC18674g.PENDING) {
            this.f57322c = EnumC18674g.RUNNING;
            m59547i();
            this.f57320a.f57331a = objArr;
            executor.execute(this.f57321b);
            return this;
        }
        int i = C18671d.f57328a[this.f57322c.ordinal()];
        if (i == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i != 2) {
            throw new IllegalStateException("We should never reach this state");
        }
        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
    }

    /* renamed from: d */
    public void m59543d(Object obj) {
        if (m59544f()) {
            mo59545g(obj);
        } else {
            mo59546h(obj);
        }
        this.f57322c = EnumC18674g.FINISHED;
    }

    /* renamed from: f */
    public final boolean m59544f() {
        return this.f57323d.get();
    }

    /* renamed from: g */
    public abstract void mo59545g(Object obj);

    /* renamed from: h */
    public abstract void mo59546h(Object obj);

    /* renamed from: i */
    public void m59547i() {
    }

    /* renamed from: j */
    public void m59548j(Object... objArr) {
    }

    /* renamed from: k */
    public Object m59549k(Object obj) {
        m59539e().obtainMessage(1, new C18672e(this, obj)).sendToTarget();
        return obj;
    }

    /* renamed from: l */
    public void m59550l(Object obj) {
        if (this.f57324e.get()) {
            return;
        }
        m59549k(obj);
    }
}
