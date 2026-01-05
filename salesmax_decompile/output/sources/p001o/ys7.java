package p001o;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import com.google.android.gms.common.api.Api;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class ys7 implements ExecutorService {

    /* renamed from: b */
    public static final long f55875b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c */
    public static volatile int f55876c;

    /* renamed from: a */
    public final ExecutorService f55877a;

    /* renamed from: o.ys7$b */
    public static final class C18476b {

        /* renamed from: a */
        public final boolean f55878a;

        /* renamed from: b */
        public int f55879b;

        /* renamed from: c */
        public int f55880c;

        /* renamed from: d */
        public final ThreadFactory f55881d = new ThreadFactoryC18477c();

        /* renamed from: e */
        public InterfaceC18479e f55882e = InterfaceC18479e.f55896d;

        /* renamed from: f */
        public String f55883f;

        /* renamed from: g */
        public long f55884g;

        public C18476b(boolean z) {
            this.f55878a = z;
        }

        /* renamed from: a */
        public ys7 m58178a() {
            if (TextUtils.isEmpty(this.f55883f)) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f55883f);
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f55879b, this.f55880c, this.f55884g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ThreadFactoryC18478d(this.f55881d, this.f55883f, this.f55882e, this.f55878a));
            if (this.f55884g != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new ys7(threadPoolExecutor);
        }

        /* renamed from: b */
        public C18476b m58179b(String str) {
            this.f55883f = str;
            return this;
        }

        /* renamed from: c */
        public C18476b m58180c(int i) {
            this.f55879b = i;
            this.f55880c = i;
            return this;
        }
    }

    /* renamed from: o.ys7$c */
    public static final class ThreadFactoryC18477c implements ThreadFactory {

        /* renamed from: o.ys7$c$a */
        public class a extends Thread {
            public a(Runnable runnable) {
                super(runnable);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() throws SecurityException, IllegalArgumentException {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        public ThreadFactoryC18477c() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new a(runnable);
        }
    }

    /* renamed from: o.ys7$d */
    public static final class ThreadFactoryC18478d implements ThreadFactory {

        /* renamed from: a */
        public final ThreadFactory f55886a;

        /* renamed from: b */
        public final String f55887b;

        /* renamed from: c */
        public final InterfaceC18479e f55888c;

        /* renamed from: d */
        public final boolean f55889d;

        /* renamed from: e */
        public final AtomicInteger f55890e = new AtomicInteger();

        /* renamed from: o.ys7$d$a */
        public class a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Runnable f55891a;

            public a(Runnable runnable) {
                this.f55891a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (ThreadFactoryC18478d.this.f55889d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f55891a.run();
                } catch (Throwable th) {
                    ThreadFactoryC18478d.this.f55888c.mo58181a(th);
                }
            }
        }

        public ThreadFactoryC18478d(ThreadFactory threadFactory, String str, InterfaceC18479e interfaceC18479e, boolean z) {
            this.f55886a = threadFactory;
            this.f55887b = str;
            this.f55888c = interfaceC18479e;
            this.f55889d = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = this.f55886a.newThread(new a(runnable));
            threadNewThread.setName("glide-" + this.f55887b + "-thread-" + this.f55890e.getAndIncrement());
            return threadNewThread;
        }
    }

    /* renamed from: o.ys7$e */
    public interface InterfaceC18479e {

        /* renamed from: a */
        public static final InterfaceC18479e f55893a = new a();

        /* renamed from: b */
        public static final InterfaceC18479e f55894b;

        /* renamed from: c */
        public static final InterfaceC18479e f55895c;

        /* renamed from: d */
        public static final InterfaceC18479e f55896d;

        /* renamed from: o.ys7$e$a */
        public class a implements InterfaceC18479e {
            @Override // p001o.ys7.InterfaceC18479e
            /* renamed from: a */
            public void mo58181a(Throwable th) {
            }
        }

        /* renamed from: o.ys7$e$b */
        public class b implements InterfaceC18479e {
            @Override // p001o.ys7.InterfaceC18479e
            /* renamed from: a */
            public void mo58181a(Throwable th) {
            }
        }

        /* renamed from: o.ys7$e$c */
        public class c implements InterfaceC18479e {
            @Override // p001o.ys7.InterfaceC18479e
            /* renamed from: a */
            public void mo58181a(Throwable th) {
                if (th != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        }

        static {
            b bVar = new b();
            f55894b = bVar;
            f55895c = new c();
            f55896d = bVar;
        }

        /* renamed from: a */
        void mo58181a(Throwable th);
    }

    public ys7(ExecutorService executorService) {
        this.f55877a = executorService;
    }

    /* renamed from: a */
    public static int m58170a() {
        if (f55876c == 0) {
            f55876c = Math.min(4, qve.m45879a());
        }
        return f55876c;
    }

    /* renamed from: b */
    public static C18476b m58171b() {
        return new C18476b(true).m58180c(m58170a() >= 4 ? 2 : 1).m58179b("animation");
    }

    /* renamed from: c */
    public static ys7 m58172c() {
        return m58171b().m58178a();
    }

    /* renamed from: d */
    public static C18476b m58173d() {
        return new C18476b(true).m58180c(1).m58179b("disk-cache");
    }

    /* renamed from: e */
    public static ys7 m58174e() {
        return m58173d().m58178a();
    }

    /* renamed from: f */
    public static C18476b m58175f() {
        return new C18476b(false).m58180c(m58170a()).m58179b("source");
    }

    /* renamed from: h */
    public static ys7 m58176h() {
        return m58175f().m58178a();
    }

    /* renamed from: i */
    public static ys7 m58177i() {
        return new ys7(new ThreadPoolExecutor(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, f55875b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new ThreadFactoryC18478d(new ThreadFactoryC18477c(), "source-unlimited", InterfaceC18479e.f55896d, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f55877a.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f55877a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection) {
        return this.f55877a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection) {
        return this.f55877a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f55877a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f55877a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f55877a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        return this.f55877a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        return this.f55877a.submit(runnable);
    }

    public String toString() {
        return this.f55877a.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.f55877a.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.f55877a.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        return this.f55877a.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        return this.f55877a.submit(callable);
    }
}
