package ug;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class m1 extends t1 {

    /* renamed from: l */
    public static final AtomicLong f35608l = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: c */
    public l1 f35609c;

    /* renamed from: d */
    public l1 f35610d;

    /* renamed from: e */
    public final PriorityBlockingQueue f35611e;

    /* renamed from: f */
    public final LinkedBlockingQueue f35612f;

    /* renamed from: g */
    public final j1 f35613g;

    /* renamed from: h */
    public final j1 f35614h;

    /* renamed from: j */
    public final Object f35615j;

    /* renamed from: k */
    public final Semaphore f35616k;

    public m1(n1 n1Var) {
        super(n1Var);
        this.f35615j = new Object();
        this.f35616k = new Semaphore(2);
        this.f35611e = new PriorityBlockingQueue();
        this.f35612f = new LinkedBlockingQueue();
        this.f35613g = new j1(this, "Thread death: Uncaught exception on worker thread");
        this.f35614h = new j1(this, "Thread death: Uncaught exception on network thread");
    }

    @Override // ai.AbstractC0151h
    /* renamed from: M */
    public final void mo325M() {
        if (Thread.currentThread() != this.f35609c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // ug.t1
    /* renamed from: N */
    public final boolean mo13860N() {
        return false;
    }

    /* renamed from: Q */
    public final void m14042Q() {
        if (Thread.currentThread() != this.f35610d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    /* renamed from: R */
    public final void m14043R() {
        if (Thread.currentThread() == this.f35609c) {
            throw new IllegalStateException("Call not expected from worker thread");
        }
    }

    /* renamed from: S */
    public final boolean m14044S() {
        return Thread.currentThread() == this.f35609c;
    }

    /* renamed from: T */
    public final k1 m14045T(Callable callable) {
        m14144O();
        k1 k1Var = new k1(this, callable, false);
        if (Thread.currentThread() != this.f35609c) {
            m14051Z(k1Var);
            return k1Var;
        }
        if (!this.f35611e.isEmpty()) {
            v0 v0Var = ((n1) this.f482a).f35669f;
            n1.m14085m(v0Var);
            v0Var.f35865j.m14140a("Callable skipped the worker queue.");
        }
        k1Var.run();
        return k1Var;
    }

    /* renamed from: U */
    public final k1 m14046U(Callable callable) {
        m14144O();
        k1 k1Var = new k1(this, callable, true);
        if (Thread.currentThread() == this.f35609c) {
            k1Var.run();
            return k1Var;
        }
        m14051Z(k1Var);
        return k1Var;
    }

    /* renamed from: V */
    public final void m14047V(Runnable runnable) {
        m14144O();
        AbstractC6840z.m13036g(runnable);
        m14051Z(new k1(this, runnable, false, "Task exception on worker thread"));
    }

    /* renamed from: W */
    public final Object m14048W(AtomicReference atomicReference, long j6, String str, Runnable runnable) {
        synchronized (atomicReference) {
            m1 m1Var = ((n1) this.f482a).f35670g;
            n1.m14085m(m1Var);
            m1Var.m14047V(runnable);
            try {
                atomicReference.wait(j6);
            } catch (InterruptedException unused) {
                v0 v0Var = ((n1) this.f482a).f35669f;
                n1.m14085m(v0Var);
                t0 t0Var = v0Var.f35865j;
                StringBuilder sb2 = new StringBuilder(str.length() + 24);
                sb2.append("Interrupted waiting for ");
                sb2.append(str);
                t0Var.m14140a(sb2.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            v0 v0Var2 = ((n1) this.f482a).f35669f;
            n1.m14085m(v0Var2);
            v0Var2.f35865j.m14140a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    /* renamed from: X */
    public final void m14049X(Runnable runnable) {
        m14144O();
        m14051Z(new k1(this, runnable, true, "Task exception on worker thread"));
    }

    /* renamed from: Y */
    public final void m14050Y(Runnable runnable) {
        m14144O();
        k1 k1Var = new k1(this, runnable, false, "Task exception on network thread");
        synchronized (this.f35615j) {
            try {
                LinkedBlockingQueue linkedBlockingQueue = this.f35612f;
                linkedBlockingQueue.add(k1Var);
                l1 l1Var = this.f35610d;
                if (l1Var == null) {
                    l1 l1Var2 = new l1(this, "Measurement Network", linkedBlockingQueue);
                    this.f35610d = l1Var2;
                    l1Var2.setUncaughtExceptionHandler(this.f35614h);
                    this.f35610d.start();
                } else {
                    Object obj = l1Var.f35586a;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: Z */
    public final void m14051Z(k1 k1Var) {
        synchronized (this.f35615j) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.f35611e;
                priorityBlockingQueue.add(k1Var);
                l1 l1Var = this.f35609c;
                if (l1Var == null) {
                    l1 l1Var2 = new l1(this, "Measurement Worker", priorityBlockingQueue);
                    this.f35609c = l1Var2;
                    l1Var2.setUncaughtExceptionHandler(this.f35613g);
                    this.f35609c.start();
                } else {
                    Object obj = l1Var.f35586a;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
