package p001o;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import p001o.fk6;

/* loaded from: classes6.dex */
public final class wd5 extends fk6 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: q */
    public static final wd5 f51804q;

    /* renamed from: s */
    public static final long f51805s;

    static {
        Long l;
        wd5 wd5Var = new wd5();
        f51804q = wd5Var;
        ek6.E0(wd5Var, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f51805s = timeUnit.toNanos(l.longValue());
    }

    public final synchronized void G1() {
        if (J1()) {
            debugStatus = 3;
            w1();
            sq8.m48647f(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final synchronized Thread H1() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setContextClassLoader(f51804q.getClass().getClassLoader());
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    public final boolean I1() {
        return debugStatus == 4;
    }

    public final boolean J1() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    @Override // p001o.gk6
    public Thread L0() {
        Thread thread = _thread;
        return thread == null ? H1() : thread;
    }

    public final synchronized boolean M1() {
        if (J1()) {
            return false;
        }
        debugStatus = 1;
        sq8.m48647f(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    @Override // p001o.gk6
    public void O0(long j, fk6.AbstractRunnableC13473c abstractRunnableC13473c) {
        O1();
    }

    public final void O1() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // p001o.fk6
    public void W0(Runnable runnable) {
        if (I1()) {
            O1();
        }
        super.W0(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zQ1;
        pkh.f40203a.m43815d(this);
        v9.m52465a();
        try {
            if (!M1()) {
                if (zQ1) {
                    return;
                } else {
                    return;
                }
            }
            long j = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jH0 = H0();
                if (jH0 == Long.MAX_VALUE) {
                    v9.m52465a();
                    long jNanoTime = System.nanoTime();
                    if (j == Long.MAX_VALUE) {
                        j = f51805s + jNanoTime;
                    }
                    long j2 = j - jNanoTime;
                    if (j2 <= 0) {
                        _thread = null;
                        G1();
                        v9.m52465a();
                        if (q1()) {
                            return;
                        }
                        L0();
                        return;
                    }
                    jH0 = bce.m18605h(jH0, j2);
                } else {
                    j = Long.MAX_VALUE;
                }
                if (jH0 > 0) {
                    if (J1()) {
                        _thread = null;
                        G1();
                        v9.m52465a();
                        if (q1()) {
                            return;
                        }
                        L0();
                        return;
                    }
                    v9.m52465a();
                    LockSupport.parkNanos(this, jH0);
                }
            }
        } finally {
            _thread = null;
            G1();
            v9.m52465a();
            if (!q1()) {
                L0();
            }
        }
    }

    @Override // p001o.fk6, p001o.ek6
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // p001o.fk6, p001o.mk5
    /* renamed from: t */
    public yu5 mo26963t(long j, Runnable runnable, q74 q74Var) {
        return B1(j, runnable);
    }

    @Override // p001o.z74
    public String toString() {
        return "DefaultExecutor";
    }
}
