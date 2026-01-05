package p001o;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class tv8 implements Executor {

    /* renamed from: b */
    public static volatile Executor f47955b;

    /* renamed from: a */
    public final ExecutorService f47956a = Executors.newFixedThreadPool(2, new ThreadFactoryC17241a());

    /* renamed from: o.tv8$a */
    public class ThreadFactoryC17241a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f47957a = new AtomicInteger(0);

        public ThreadFactoryC17241a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-camerax_io_%d", Integer.valueOf(this.f47957a.getAndIncrement())));
            return thread;
        }
    }

    /* renamed from: a */
    public static Executor m50712a() {
        if (f47955b != null) {
            return f47955b;
        }
        synchronized (tv8.class) {
            if (f47955b == null) {
                f47955b = new tv8();
            }
        }
        return f47955b;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f47956a.execute(runnable);
    }
}
