package p001o;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public class mi5 extends pog {

    /* renamed from: a */
    public final Object f35501a = new Object();

    /* renamed from: b */
    public final ExecutorService f35502b = Executors.newFixedThreadPool(4, new ThreadFactoryC15328a());

    /* renamed from: c */
    public volatile Handler f35503c;

    /* renamed from: o.mi5$a */
    public class ThreadFactoryC15328a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f35504a = new AtomicInteger(0);

        public ThreadFactoryC15328a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.f35504a.getAndIncrement());
            return thread;
        }
    }

    /* renamed from: o.mi5$b */
    public static class C15329b {
        /* renamed from: a */
        public static Handler m39110a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* renamed from: e */
    public static Handler m39109e(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C15329b.m39110a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // p001o.pog
    /* renamed from: a */
    public void mo25359a(Runnable runnable) {
        this.f35502b.execute(runnable);
    }

    @Override // p001o.pog
    /* renamed from: c */
    public boolean mo25360c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // p001o.pog
    /* renamed from: d */
    public void mo25361d(Runnable runnable) {
        if (this.f35503c == null) {
            synchronized (this.f35501a) {
                if (this.f35503c == null) {
                    this.f35503c = m39109e(Looper.getMainLooper());
                }
            }
        }
        this.f35503c.post(runnable);
    }
}
