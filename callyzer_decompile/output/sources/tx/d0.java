package tx;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import uw.InterfaceC7564h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class d0 extends v0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: k */
    public static final d0 f34618k;

    /* renamed from: l */
    public static final long f34619l;

    static {
        Long l9;
        d0 d0Var = new d0();
        f34618k = d0Var;
        d0Var.I0(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l9 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l9 = 1000L;
        }
        f34619l = timeUnit.toNanos(l9.longValue());
    }

    @Override // tx.w0
    public final Thread H0() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(f34618k.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // tx.w0
    public final void L0(long j6, t0 t0Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // tx.v0
    public final void M0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.M0(runnable);
    }

    @Override // tx.v0, tx.h0
    /* renamed from: R */
    public final o0 mo13506R(long j6, Runnable runnable, InterfaceC7564h interfaceC7564h) {
        long j10 = j6 > 0 ? j6 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j6 : 0L;
        if (j10 >= 4611686018427387903L) {
            return p1.f34666a;
        }
        long jNanoTime = System.nanoTime();
        s0 s0Var = new s0(j10 + jNanoTime, runnable);
        Q0(jNanoTime, s0Var);
        return s0Var;
    }

    public final synchronized void R0() {
        int i10 = debugStatus;
        if (i10 == 2 || i10 == 3) {
            debugStatus = 3;
            v0.f34685g.set(this, null);
            v0.f34686h.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zP0;
        w1.f34694a.set(this);
        try {
            synchronized (this) {
                int i10 = debugStatus;
                if (i10 == 2 || i10 == 3) {
                    if (zP0) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j6 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jJ0 = J0();
                    if (jJ0 == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j6 == Long.MAX_VALUE) {
                            j6 = f34619l + jNanoTime;
                        }
                        long j10 = j6 - jNanoTime;
                        if (j10 <= 0) {
                            _thread = null;
                            R0();
                            if (P0()) {
                                return;
                            }
                            H0();
                            return;
                        }
                        if (jJ0 > j10) {
                            jJ0 = j10;
                        }
                    } else {
                        j6 = Long.MAX_VALUE;
                    }
                    if (jJ0 > 0) {
                        int i11 = debugStatus;
                        if (i11 == 2 || i11 == 3) {
                            _thread = null;
                            R0();
                            if (P0()) {
                                return;
                            }
                            H0();
                            return;
                        }
                        LockSupport.parkNanos(this, jJ0);
                    }
                }
            }
        } finally {
            _thread = null;
            R0();
            if (!P0()) {
                H0();
            }
        }
    }

    @Override // tx.v0, tx.w0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // tx.AbstractC7262v
    public final String toString() {
        return "DefaultExecutor";
    }
}
