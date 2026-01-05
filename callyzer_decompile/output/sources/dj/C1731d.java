package dj;

import a1.RunnableC0012k;
import android.os.SystemClock;
import android.util.Log;
import ej.C2057b;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import ue.C7419a;
import ue.EnumC7422d;
import ue.InterfaceC7425g;
import wi.AbstractC8074x;
import wi.C8052b;
import xe.C8364p;
import yg.C8650g;
import z1.C8849i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dj.d */
/* loaded from: classes.dex */
public final class C1731d {

    /* renamed from: a */
    public final double f8385a;

    /* renamed from: b */
    public final double f8386b;

    /* renamed from: c */
    public final long f8387c;

    /* renamed from: d */
    public final long f8388d;

    /* renamed from: e */
    public final int f8389e;

    /* renamed from: f */
    public final ArrayBlockingQueue f8390f;

    /* renamed from: g */
    public final ThreadPoolExecutor f8391g;

    /* renamed from: h */
    public final C8364p f8392h;

    /* renamed from: i */
    public final C8849i f8393i;

    /* renamed from: j */
    public int f8394j;

    /* renamed from: k */
    public long f8395k;

    public C1731d(C8364p c8364p, C2057b c2057b, C8849i c8849i) {
        double d2 = c2057b.f9647d;
        double d10 = c2057b.f9648e;
        this.f8385a = d2;
        this.f8386b = d10;
        this.f8387c = c2057b.f9649f * 1000;
        this.f8392h = c8364p;
        this.f8393i = c8849i;
        this.f8388d = SystemClock.elapsedRealtime();
        int i10 = (int) d2;
        this.f8389e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f8390f = arrayBlockingQueue;
        this.f8391g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f8394j = 0;
        this.f8395k = 0L;
    }

    /* renamed from: a */
    public final int m5429a() {
        if (this.f8395k == 0) {
            this.f8395k = System.currentTimeMillis();
        }
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - this.f8395k) / this.f8387c);
        int iMin = this.f8390f.size() == this.f8389e ? Math.min(100, this.f8394j + iCurrentTimeMillis) : Math.max(0, this.f8394j - iCurrentTimeMillis);
        if (this.f8394j != iMin) {
            this.f8394j = iMin;
            this.f8395k = System.currentTimeMillis();
        }
        return iMin;
    }

    /* renamed from: b */
    public final void m5430b(final C8052b c8052b, final C8650g c8650g) {
        Log.isLoggable("FirebaseCrashlytics", 3);
        final boolean z6 = SystemClock.elapsedRealtime() - this.f8388d < 2000;
        this.f8392h.m15535a(new C7419a(c8052b.f38570a, EnumC7422d.HIGHEST, null), new InterfaceC7425g() { // from class: dj.b
            @Override // ue.InterfaceC7425g
            /* renamed from: b */
            public final void mo5428b(Exception exc) throws Throwable {
                C8650g c8650g2 = c8650g;
                if (exc != null) {
                    c8650g2.m15970c(exc);
                    return;
                }
                if (z6) {
                    boolean z10 = true;
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    new Thread(new RunnableC0012k(17, this.f8377a, countDownLatch)).start();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    ExecutorService executorService = AbstractC8074x.f38667a;
                    boolean z11 = false;
                    try {
                        long nanos = timeUnit.toNanos(2L);
                        long jNanoTime = System.nanoTime() + nanos;
                        while (true) {
                            try {
                                try {
                                    countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                                    break;
                                } catch (InterruptedException unused) {
                                    nanos = jNanoTime - System.nanoTime();
                                    z11 = true;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (z10) {
                                    Thread.currentThread().interrupt();
                                }
                                throw th;
                            }
                        }
                        if (z11) {
                            Thread.currentThread().interrupt();
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        z10 = z11;
                    }
                }
                c8650g2.m15971d(c8052b);
            }
        });
    }
}
