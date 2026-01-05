package x4;

import com.sun.mail.util.AbstractC1452a;
import i0.m0;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p020v.a1;
import pg.h7;
import zh.InterfaceFutureC8957d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: x4.h */
/* loaded from: classes.dex */
public abstract class AbstractC8298h implements InterfaceFutureC8957d {

    /* renamed from: d */
    public static final boolean f39837d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e */
    public static final Logger f39838e = Logger.getLogger(AbstractC8298h.class.getName());

    /* renamed from: f */
    public static final h7 f39839f;

    /* renamed from: g */
    public static final Object f39840g;

    /* renamed from: a */
    public volatile Object f39841a;

    /* renamed from: b */
    public volatile C8294d f39842b;

    /* renamed from: c */
    public volatile C8297g f39843c;

    static {
        h7 c8296f;
        try {
            c8296f = new C8295e(AtomicReferenceFieldUpdater.newUpdater(C8297g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C8297g.class, C8297g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC8298h.class, C8297g.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC8298h.class, C8294d.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC8298h.class, Object.class, "a"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            c8296f = new C8296f();
        }
        f39839f = c8296f;
        if (th != null) {
            f39838e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f39840g = new Object();
    }

    /* renamed from: d */
    public static void m15497d(AbstractC8298h abstractC8298h) {
        C8297g c8297g;
        C8294d c8294d;
        C8294d c8294d2;
        C8294d c8294d3;
        do {
            c8297g = abstractC8298h.f39843c;
        } while (!f39839f.mo11679c(abstractC8298h, c8297g, C8297g.f39834c));
        while (true) {
            c8294d = null;
            if (c8297g == null) {
                break;
            }
            Thread thread = c8297g.f39835a;
            if (thread != null) {
                c8297g.f39835a = null;
                LockSupport.unpark(thread);
            }
            c8297g = c8297g.f39836b;
        }
        abstractC8298h.mo12571c();
        do {
            c8294d2 = abstractC8298h.f39842b;
        } while (!f39839f.mo11677a(abstractC8298h, c8294d2, C8294d.f39825d));
        while (true) {
            c8294d3 = c8294d;
            c8294d = c8294d2;
            if (c8294d == null) {
                break;
            }
            c8294d2 = c8294d.f39828c;
            c8294d.f39828c = c8294d3;
        }
        while (c8294d3 != null) {
            C8294d c8294d4 = c8294d3.f39828c;
            m15498e(c8294d3.f39826a, c8294d3.f39827b);
            c8294d3 = c8294d4;
        }
    }

    /* renamed from: e */
    public static void m15498e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            f39838e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    /* renamed from: f */
    public static Object m15499f(Object obj) throws ExecutionException {
        if (obj instanceof C8291a) {
            Throwable th2 = ((C8291a) obj).f39822b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        }
        if (obj instanceof C8293c) {
            throw new ExecutionException(((C8293c) obj).f39824a);
        }
        if (obj == f39840g) {
            return null;
        }
        return obj;
    }

    /* renamed from: g */
    public static Object m15500g(Future future) {
        Object obj;
        boolean z6 = false;
        while (true) {
            try {
                obj = future.get();
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
        return obj;
    }

    @Override // zh.InterfaceFutureC8957d
    /* renamed from: a */
    public final void mo9026a(Runnable runnable, Executor executor) {
        executor.getClass();
        C8294d c8294d = this.f39842b;
        C8294d c8294d2 = C8294d.f39825d;
        if (c8294d != c8294d2) {
            C8294d c8294d3 = new C8294d(runnable, executor);
            do {
                c8294d3.f39828c = c8294d;
                if (f39839f.mo11677a(this, c8294d, c8294d3)) {
                    return;
                } else {
                    c8294d = this.f39842b;
                }
            } while (c8294d != c8294d2);
        }
        m15498e(runnable, executor);
    }

    /* renamed from: b */
    public final void m15501b(StringBuilder sb2) {
        try {
            Object objM15500g = m15500g(this);
            sb2.append("SUCCESS, result=[");
            sb2.append(objM15500g == this ? "this future" : String.valueOf(objM15500g));
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e2.getClass());
            sb2.append(" thrown from get()]");
        } catch (ExecutionException e10) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e10.getCause());
            sb2.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        Object obj = this.f39841a;
        if (obj == null) {
            if (f39839f.mo11678b(this, obj, f39837d ? new C8291a(new CancellationException("Future.cancel() was called."), z6) : z6 ? C8291a.f39819c : C8291a.f39820d)) {
                m15497d(this);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j6, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        C8297g c8297g = C8297g.f39834c;
        long nanos = timeUnit.toNanos(j6);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f39841a;
        if (obj != null) {
            return m15499f(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C8297g c8297g2 = this.f39843c;
            if (c8297g2 != c8297g) {
                C8297g c8297g3 = new C8297g();
                do {
                    h7 h7Var = f39839f;
                    h7Var.mo11680e(c8297g3, c8297g2);
                    if (h7Var.mo11679c(this, c8297g2, c8297g3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m15503i(c8297g3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f39841a;
                            if (obj2 != null) {
                                return m15499f(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m15503i(c8297g3);
                    } else {
                        c8297g2 = this.f39843c;
                    }
                } while (c8297g2 != c8297g);
            }
            return m15499f(this.f39841a);
        }
        while (nanos > 0) {
            Object obj3 = this.f39841a;
            if (obj3 != null) {
                return m15499f(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String strM4561h = "Waited " + j6 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strM4561h2 = AbstractC1452a.m4561h(strM4561h, " (plus ");
            long j10 = -nanos;
            long jConvert = timeUnit.convert(j10, TimeUnit.NANOSECONDS);
            long nanos2 = j10 - timeUnit.toNanos(jConvert);
            boolean z6 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strM4561h3 = strM4561h2 + jConvert + " " + lowerCase;
                if (z6) {
                    strM4561h3 = AbstractC1452a.m4561h(strM4561h3, ",");
                }
                strM4561h2 = AbstractC1452a.m4561h(strM4561h3, " ");
            }
            if (z6) {
                strM4561h2 = strM4561h2 + nanos2 + " nanoseconds ";
            }
            strM4561h = AbstractC1452a.m4561h(strM4561h2, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(AbstractC1452a.m4561h(strM4561h, " but future completed as timeout expired"));
        }
        throw new TimeoutException(m0.m7379l(strM4561h, " for ", string));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public String mo15502h() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* renamed from: i */
    public final void m15503i(C8297g c8297g) {
        c8297g.f39835a = null;
        while (true) {
            C8297g c8297g2 = this.f39843c;
            if (c8297g2 == C8297g.f39834c) {
                return;
            }
            C8297g c8297g3 = null;
            while (c8297g2 != null) {
                C8297g c8297g4 = c8297g2.f39836b;
                if (c8297g2.f39835a != null) {
                    c8297g3 = c8297g2;
                } else if (c8297g3 != null) {
                    c8297g3.f39836b = c8297g4;
                    if (c8297g3.f39835a == null) {
                        break;
                    }
                } else if (!f39839f.mo11679c(this, c8297g2, c8297g4)) {
                    break;
                }
                c8297g2 = c8297g4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f39841a instanceof C8291a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f39841a != null;
    }

    /* renamed from: j */
    public boolean m15504j(Object obj) {
        if (obj == null) {
            obj = f39840g;
        }
        if (!f39839f.mo11678b(this, null, obj)) {
            return false;
        }
        m15497d(this);
        return true;
    }

    /* renamed from: k */
    public boolean mo15505k(Throwable th2) {
        th2.getClass();
        if (!f39839f.mo11678b(this, null, new C8293c(th2))) {
            return false;
        }
        m15497d(this);
        return true;
    }

    public final String toString() {
        String strMo15502h;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f39841a instanceof C8291a) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            m15501b(sb2);
        } else {
            try {
                strMo15502h = mo15502h();
            } catch (RuntimeException e2) {
                strMo15502h = "Exception thrown from implementation: " + e2.getClass();
            }
            if (strMo15502h != null && !strMo15502h.isEmpty()) {
                a1.m14318A(sb2, "PENDING, info=[", strMo15502h, "]");
            } else if (isDone()) {
                m15501b(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* renamed from: c */
    public void mo12571c() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        C8297g c8297g = C8297g.f39834c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f39841a;
            if (obj2 != null) {
                return m15499f(obj2);
            }
            C8297g c8297g2 = this.f39843c;
            if (c8297g2 != c8297g) {
                C8297g c8297g3 = new C8297g();
                do {
                    h7 h7Var = f39839f;
                    h7Var.mo11680e(c8297g3, c8297g2);
                    if (h7Var.mo11679c(this, c8297g2, c8297g3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f39841a;
                            } else {
                                m15503i(c8297g3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return m15499f(obj);
                    }
                    c8297g2 = this.f39843c;
                } while (c8297g2 != c8297g);
            }
            return m15499f(this.f39841a);
        }
        throw new InterruptedException();
    }
}
