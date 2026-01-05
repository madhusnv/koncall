package p001o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public abstract class g5f {

    /* renamed from: a */
    public static final boolean f24603a;

    /* renamed from: b */
    public static final int f24604b;

    /* renamed from: c */
    public static final AtomicReference f24605c = new AtomicReference();

    /* renamed from: d */
    public static final Map f24606d = new ConcurrentHashMap();

    /* renamed from: o.g5f$a */
    public static final class RunnableC13623a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            Iterator it = new ArrayList(g5f.f24606d.keySet()).iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    g5f.f24606d.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    /* renamed from: o.g5f$b */
    public static final class C13624b implements rl7 {
        @Override // p001o.rl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String apply(String str) {
            return System.getProperty(str);
        }
    }

    static {
        C13624b c13624b = new C13624b();
        boolean zM28070b = m28070b(true, "rx3.purge-enabled", true, true, c13624b);
        f24603a = zM28070b;
        f24604b = m28071c(zM28070b, "rx3.purge-period-seconds", 1, 1, c13624b);
        m28072d();
    }

    /* renamed from: a */
    public static ScheduledExecutorService m28069a(ThreadFactory threadFactory) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        m28073e(f24603a, scheduledExecutorServiceNewScheduledThreadPool);
        return scheduledExecutorServiceNewScheduledThreadPool;
    }

    /* renamed from: b */
    public static boolean m28070b(boolean z, String str, boolean z2, boolean z3, rl7 rl7Var) {
        if (!z) {
            return z3;
        }
        try {
            String str2 = (String) rl7Var.apply(str);
            return str2 == null ? z2 : "true".equals(str2);
        } catch (Throwable th) {
            zk6.m59526b(th);
            return z2;
        }
    }

    /* renamed from: c */
    public static int m28071c(boolean z, String str, int i, int i2, rl7 rl7Var) {
        if (!z) {
            return i2;
        }
        try {
            String str2 = (String) rl7Var.apply(str);
            return str2 == null ? i : Integer.parseInt(str2);
        } catch (Throwable th) {
            zk6.m59526b(th);
            return i;
        }
    }

    /* renamed from: d */
    public static void m28072d() {
        m28074f(f24603a);
    }

    /* renamed from: e */
    public static void m28073e(boolean z, ScheduledExecutorService scheduledExecutorService) {
        if (z && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            f24606d.put((ScheduledThreadPoolExecutor) scheduledExecutorService, scheduledExecutorService);
        }
    }

    /* renamed from: f */
    public static void m28074f(boolean z) {
        if (!z) {
            return;
        }
        while (true) {
            AtomicReference atomicReference = f24605c;
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new vwe("RxSchedulerPurge"));
            if (ec3.m24748a(atomicReference, scheduledExecutorService, scheduledExecutorServiceNewScheduledThreadPool)) {
                RunnableC13623a runnableC13623a = new RunnableC13623a();
                int i = f24604b;
                scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(runnableC13623a, i, i, TimeUnit.SECONDS);
                return;
            }
            scheduledExecutorServiceNewScheduledThreadPool.shutdownNow();
        }
    }
}
