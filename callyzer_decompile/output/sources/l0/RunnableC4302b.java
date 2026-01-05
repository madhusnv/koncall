package l0;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import pg.t8;
import x4.C8299i;
import zh.InterfaceFutureC8957d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l0.b */
/* loaded from: classes.dex */
public final class RunnableC4302b extends C4304d implements Runnable {

    /* renamed from: c */
    public InterfaceC4301a f21721c;

    /* renamed from: d */
    public final LinkedBlockingQueue f21722d = new LinkedBlockingQueue(1);

    /* renamed from: e */
    public final CountDownLatch f21723e = new CountDownLatch(1);

    /* renamed from: f */
    public InterfaceFutureC8957d f21724f;

    /* renamed from: g */
    public volatile InterfaceFutureC8957d f21725g;

    public RunnableC4302b(InterfaceC4301a interfaceC4301a, InterfaceFutureC8957d interfaceFutureC8957d) {
        this.f21721c = interfaceC4301a;
        interfaceFutureC8957d.getClass();
        this.f21724f = interfaceFutureC8957d;
    }

    /* renamed from: c */
    public static Object m9024c(LinkedBlockingQueue linkedBlockingQueue) {
        Object objTake;
        boolean z6 = false;
        while (true) {
            try {
                objTake = linkedBlockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z6 = true;
            } catch (Throwable th2) {
                if (z6) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
        return objTake;
    }

    @Override // l0.C4304d, java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        boolean z10 = false;
        if (!this.f21726a.cancel(z6)) {
            return false;
        }
        while (true) {
            try {
                this.f21722d.put(Boolean.valueOf(z6));
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        InterfaceFutureC8957d interfaceFutureC8957d = this.f21724f;
        if (interfaceFutureC8957d != null) {
            interfaceFutureC8957d.cancel(z6);
        }
        InterfaceFutureC8957d interfaceFutureC8957d2 = this.f21725g;
        if (interfaceFutureC8957d2 != null) {
            interfaceFutureC8957d2.cancel(z6);
        }
        return true;
    }

    @Override // l0.C4304d, java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        if (!this.f21726a.isDone()) {
            InterfaceFutureC8957d interfaceFutureC8957d = this.f21724f;
            if (interfaceFutureC8957d != null) {
                interfaceFutureC8957d.get();
            }
            this.f21723e.await();
            InterfaceFutureC8957d interfaceFutureC8957d2 = this.f21725g;
            if (interfaceFutureC8957d2 != null) {
                interfaceFutureC8957d2.get();
            }
        }
        return this.f21726a.get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l0.a, zh.d] */
    /* JADX WARN: Type inference failed for: r0v1, types: [l0.a, zh.d] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [l0.a, zh.d] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.concurrent.CountDownLatch] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r02;
        ?? r03 = 0;
        r03 = 0;
        r03 = 0;
        r03 = 0;
        r03 = 0;
        try {
            try {
                try {
                    try {
                        try {
                            InterfaceFutureC8957d interfaceFutureC8957dApply = this.f21721c.apply(AbstractC4308h.m9032b(this.f21724f));
                            this.f21725g = interfaceFutureC8957dApply;
                            if (this.f21726a.isCancelled()) {
                                interfaceFutureC8957dApply.cancel(((Boolean) m9024c(this.f21722d)).booleanValue());
                                this.f21725g = null;
                            } else {
                                interfaceFutureC8957dApply.mo9026a(new RunnableC4307g(7, this, interfaceFutureC8957dApply, false), t8.m11872a());
                            }
                        } catch (Exception e2) {
                            C8299i c8299i = this.f21727b;
                            r02 = r03;
                            if (c8299i != null) {
                                c8299i.m15509d(e2);
                                r02 = r03;
                            }
                        }
                    } catch (Error e10) {
                        C8299i c8299i2 = this.f21727b;
                        r02 = r03;
                        if (c8299i2 != null) {
                            c8299i2.m15509d(e10);
                            r02 = r03;
                        }
                    }
                } finally {
                    this.f21721c = r03;
                    this.f21724f = r03;
                    this.f21723e.countDown();
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e11) {
                Throwable cause = e11.getCause();
                C8299i c8299i3 = this.f21727b;
                if (c8299i3 != null) {
                    c8299i3.m15509d(cause);
                }
            }
        } catch (UndeclaredThrowableException e12) {
            Throwable cause2 = e12.getCause();
            C8299i c8299i4 = this.f21727b;
            r02 = r03;
            if (c8299i4 != null) {
                c8299i4.m15509d(cause2);
                r02 = r03;
            }
        }
    }

    @Override // l0.C4304d, java.util.concurrent.Future
    public final Object get(long j6, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (!this.f21726a.isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j6 = timeUnit2.convert(j6, timeUnit);
                timeUnit = timeUnit2;
            }
            InterfaceFutureC8957d interfaceFutureC8957d = this.f21724f;
            if (interfaceFutureC8957d != null) {
                long jNanoTime = System.nanoTime();
                interfaceFutureC8957d.get(j6, timeUnit);
                j6 -= Math.max(0L, System.nanoTime() - jNanoTime);
            }
            long jNanoTime2 = System.nanoTime();
            if (this.f21723e.await(j6, timeUnit)) {
                j6 -= Math.max(0L, System.nanoTime() - jNanoTime2);
                InterfaceFutureC8957d interfaceFutureC8957d2 = this.f21725g;
                if (interfaceFutureC8957d2 != null) {
                    interfaceFutureC8957d2.get(j6, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return this.f21726a.get(j6, timeUnit);
    }
}
