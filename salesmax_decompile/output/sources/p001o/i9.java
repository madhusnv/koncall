package p001o;

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

/* loaded from: classes2.dex */
public abstract class i9 implements zfa {
    static final AbstractC14217b ATOMIC_HELPER;
    private static final Object NULL;
    private static final long SPIN_THRESHOLD_NANOS = 1000;
    volatile C14220e listeners;
    volatile Object value;
    volatile C14224i waiters;
    static final boolean GENERATE_CANCELLATION_CAUSES = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger log = Logger.getLogger(i9.class.getName());

    /* renamed from: o.i9$b */
    public static abstract class AbstractC14217b {
        public AbstractC14217b() {
        }

        /* renamed from: a */
        public abstract boolean mo31749a(i9 i9Var, C14220e c14220e, C14220e c14220e2);

        /* renamed from: b */
        public abstract boolean mo31750b(i9 i9Var, Object obj, Object obj2);

        /* renamed from: c */
        public abstract boolean mo31751c(i9 i9Var, C14224i c14224i, C14224i c14224i2);

        /* renamed from: d */
        public abstract void mo31752d(C14224i c14224i, C14224i c14224i2);

        /* renamed from: e */
        public abstract void mo31753e(C14224i c14224i, Thread thread);
    }

    /* renamed from: o.i9$c */
    public static final class C14218c {

        /* renamed from: c */
        public static final C14218c f28246c;

        /* renamed from: d */
        public static final C14218c f28247d;

        /* renamed from: a */
        public final boolean f28248a;

        /* renamed from: b */
        public final Throwable f28249b;

        static {
            if (i9.GENERATE_CANCELLATION_CAUSES) {
                f28247d = null;
                f28246c = null;
            } else {
                f28247d = new C14218c(false, null);
                f28246c = new C14218c(true, null);
            }
        }

        public C14218c(boolean z, Throwable th) {
            this.f28248a = z;
            this.f28249b = th;
        }
    }

    /* renamed from: o.i9$d */
    public static final class C14219d {

        /* renamed from: b */
        public static final C14219d f28250b = new C14219d(new a("Failure occurred while trying to finish a future."));

        /* renamed from: a */
        public final Throwable f28251a;

        /* renamed from: o.i9$d$a */
        public class a extends Throwable {
            public a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public C14219d(Throwable th) {
            this.f28251a = (Throwable) i9.checkNotNull(th);
        }
    }

    /* renamed from: o.i9$e */
    public static final class C14220e {

        /* renamed from: d */
        public static final C14220e f28252d = new C14220e(null, null);

        /* renamed from: a */
        public final Runnable f28253a;

        /* renamed from: b */
        public final Executor f28254b;

        /* renamed from: c */
        public C14220e f28255c;

        public C14220e(Runnable runnable, Executor executor) {
            this.f28253a = runnable;
            this.f28254b = executor;
        }
    }

    /* renamed from: o.i9$f */
    public static final class C14221f extends AbstractC14217b {

        /* renamed from: a */
        public final AtomicReferenceFieldUpdater f28256a;

        /* renamed from: b */
        public final AtomicReferenceFieldUpdater f28257b;

        /* renamed from: c */
        public final AtomicReferenceFieldUpdater f28258c;

        /* renamed from: d */
        public final AtomicReferenceFieldUpdater f28259d;

        /* renamed from: e */
        public final AtomicReferenceFieldUpdater f28260e;

        public C14221f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f28256a = atomicReferenceFieldUpdater;
            this.f28257b = atomicReferenceFieldUpdater2;
            this.f28258c = atomicReferenceFieldUpdater3;
            this.f28259d = atomicReferenceFieldUpdater4;
            this.f28260e = atomicReferenceFieldUpdater5;
        }

        @Override // p001o.i9.AbstractC14217b
        /* renamed from: a */
        public boolean mo31749a(i9 i9Var, C14220e c14220e, C14220e c14220e2) {
            return j9.m33417a(this.f28259d, i9Var, c14220e, c14220e2);
        }

        @Override // p001o.i9.AbstractC14217b
        /* renamed from: b */
        public boolean mo31750b(i9 i9Var, Object obj, Object obj2) {
            return j9.m33417a(this.f28260e, i9Var, obj, obj2);
        }

        @Override // p001o.i9.AbstractC14217b
        /* renamed from: c */
        public boolean mo31751c(i9 i9Var, C14224i c14224i, C14224i c14224i2) {
            return j9.m33417a(this.f28258c, i9Var, c14224i, c14224i2);
        }

        @Override // p001o.i9.AbstractC14217b
        /* renamed from: d */
        public void mo31752d(C14224i c14224i, C14224i c14224i2) {
            this.f28257b.lazySet(c14224i, c14224i2);
        }

        @Override // p001o.i9.AbstractC14217b
        /* renamed from: e */
        public void mo31753e(C14224i c14224i, Thread thread) {
            this.f28256a.lazySet(c14224i, thread);
        }
    }

    /* renamed from: o.i9$g */
    public static final class RunnableC14222g implements Runnable {

        /* renamed from: a */
        public final i9 f28261a;

        /* renamed from: b */
        public final zfa f28262b;

        public RunnableC14222g(i9 i9Var, zfa zfaVar) {
            this.f28261a = i9Var;
            this.f28262b = zfaVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f28261a.value != this) {
                return;
            }
            if (i9.ATOMIC_HELPER.mo31750b(this.f28261a, this, i9.getFutureValue(this.f28262b))) {
                i9.complete(this.f28261a);
            }
        }
    }

    /* renamed from: o.i9$h */
    public static final class C14223h extends AbstractC14217b {
        public C14223h() {
            super();
        }

        @Override // p001o.i9.AbstractC14217b
        /* renamed from: a */
        public boolean mo31749a(i9 i9Var, C14220e c14220e, C14220e c14220e2) {
            synchronized (i9Var) {
                if (i9Var.listeners != c14220e) {
                    return false;
                }
                i9Var.listeners = c14220e2;
                return true;
            }
        }

        @Override // p001o.i9.AbstractC14217b
        /* renamed from: b */
        public boolean mo31750b(i9 i9Var, Object obj, Object obj2) {
            synchronized (i9Var) {
                if (i9Var.value != obj) {
                    return false;
                }
                i9Var.value = obj2;
                return true;
            }
        }

        @Override // p001o.i9.AbstractC14217b
        /* renamed from: c */
        public boolean mo31751c(i9 i9Var, C14224i c14224i, C14224i c14224i2) {
            synchronized (i9Var) {
                if (i9Var.waiters != c14224i) {
                    return false;
                }
                i9Var.waiters = c14224i2;
                return true;
            }
        }

        @Override // p001o.i9.AbstractC14217b
        /* renamed from: d */
        public void mo31752d(C14224i c14224i, C14224i c14224i2) {
            c14224i.f28265b = c14224i2;
        }

        @Override // p001o.i9.AbstractC14217b
        /* renamed from: e */
        public void mo31753e(C14224i c14224i, Thread thread) {
            c14224i.f28264a = thread;
        }
    }

    /* renamed from: o.i9$i */
    public static final class C14224i {

        /* renamed from: c */
        public static final C14224i f28263c = new C14224i(false);

        /* renamed from: a */
        public volatile Thread f28264a;

        /* renamed from: b */
        public volatile C14224i f28265b;

        public C14224i(boolean z) {
        }

        /* renamed from: a */
        public void m31754a(C14224i c14224i) {
            i9.ATOMIC_HELPER.mo31752d(this, c14224i);
        }

        /* renamed from: b */
        public void m31755b() {
            Thread thread = this.f28264a;
            if (thread != null) {
                this.f28264a = null;
                LockSupport.unpark(thread);
            }
        }

        public C14224i() {
            i9.ATOMIC_HELPER.mo31753e(this, Thread.currentThread());
        }
    }

    static {
        AbstractC14217b c14223h;
        try {
            c14223h = new C14221f(AtomicReferenceFieldUpdater.newUpdater(C14224i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C14224i.class, C14224i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(i9.class, C14224i.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(i9.class, C14220e.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(i9.class, Object.class, "value"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c14223h = new C14223h();
        }
        ATOMIC_HELPER = c14223h;
        if (th != null) {
            log.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        NULL = new Object();
    }

    /* renamed from: c */
    public static CancellationException m31741c(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    static <T> T checkNotNull(T t) {
        t.getClass();
        return t;
    }

    public static void complete(i9 i9Var) {
        C14220e c14220e = null;
        while (true) {
            i9Var.m31746h();
            i9Var.afterDone();
            C14220e c14220eM31744d = i9Var.m31744d(c14220e);
            while (c14220eM31744d != null) {
                c14220e = c14220eM31744d.f28255c;
                Runnable runnable = c14220eM31744d.f28253a;
                if (runnable instanceof RunnableC14222g) {
                    RunnableC14222g runnableC14222g = (RunnableC14222g) runnable;
                    i9Var = runnableC14222g.f28261a;
                    if (i9Var.value == runnableC14222g) {
                        if (ATOMIC_HELPER.mo31750b(i9Var, runnableC14222g, getFutureValue(runnableC14222g.f28262b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    m31742e(runnable, c14220eM31744d.f28254b);
                }
                c14220eM31744d = c14220e;
            }
            return;
        }
    }

    /* renamed from: e */
    public static void m31742e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            log.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    static Object getFutureValue(zfa zfaVar) {
        if (zfaVar instanceof i9) {
            Object obj = ((i9) zfaVar).value;
            if (!(obj instanceof C14218c)) {
                return obj;
            }
            C14218c c14218c = (C14218c) obj;
            return c14218c.f28248a ? c14218c.f28249b != null ? new C14218c(false, c14218c.f28249b) : C14218c.f28247d : obj;
        }
        boolean zIsCancelled = zfaVar.isCancelled();
        if ((!GENERATE_CANCELLATION_CAUSES) && zIsCancelled) {
            return C14218c.f28247d;
        }
        try {
            Object uninterruptibly = getUninterruptibly(zfaVar);
            return uninterruptibly == null ? NULL : uninterruptibly;
        } catch (CancellationException e) {
            if (zIsCancelled) {
                return new C14218c(false, e);
            }
            return new C14219d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + zfaVar, e));
        } catch (ExecutionException e2) {
            return new C14219d(e2.getCause());
        } catch (Throwable th) {
            return new C14219d(th);
        }
    }

    static <V> V getUninterruptibly(Future<V> future) {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    /* renamed from: a */
    public final void m31743a(StringBuilder sb) {
        try {
            Object uninterruptibly = getUninterruptibly(this);
            sb.append("SUCCESS, result=[");
            sb.append(m31748m(uninterruptibly));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    @Override // p001o.zfa
    public final void addListener(Runnable runnable, Executor executor) {
        checkNotNull(runnable);
        checkNotNull(executor);
        C14220e c14220e = this.listeners;
        if (c14220e != C14220e.f28252d) {
            C14220e c14220e2 = new C14220e(runnable, executor);
            do {
                c14220e2.f28255c = c14220e;
                if (ATOMIC_HELPER.mo31749a(this, c14220e, c14220e2)) {
                    return;
                } else {
                    c14220e = this.listeners;
                }
            } while (c14220e != C14220e.f28252d);
        }
        m31742e(runnable, executor);
    }

    public void afterDone() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.value;
        if (!(obj == null) && !(obj instanceof RunnableC14222g)) {
            return false;
        }
        C14218c c14218c = GENERATE_CANCELLATION_CAUSES ? new C14218c(z, new CancellationException("Future.cancel() was called.")) : z ? C14218c.f28246c : C14218c.f28247d;
        i9 i9Var = this;
        boolean z2 = false;
        while (true) {
            if (ATOMIC_HELPER.mo31750b(i9Var, obj, c14218c)) {
                if (z) {
                    i9Var.interruptTask();
                }
                complete(i9Var);
                if (!(obj instanceof RunnableC14222g)) {
                    return true;
                }
                zfa zfaVar = ((RunnableC14222g) obj).f28262b;
                if (!(zfaVar instanceof i9)) {
                    zfaVar.cancel(z);
                    return true;
                }
                i9Var = (i9) zfaVar;
                obj = i9Var.value;
                if (!(obj == null) && !(obj instanceof RunnableC14222g)) {
                    return true;
                }
                z2 = true;
            } else {
                obj = i9Var.value;
                if (!(obj instanceof RunnableC14222g)) {
                    return z2;
                }
            }
        }
    }

    /* renamed from: d */
    public final C14220e m31744d(C14220e c14220e) {
        C14220e c14220e2;
        do {
            c14220e2 = this.listeners;
        } while (!ATOMIC_HELPER.mo31749a(this, c14220e2, C14220e.f28252d));
        C14220e c14220e3 = c14220e;
        C14220e c14220e4 = c14220e2;
        while (c14220e4 != null) {
            C14220e c14220e5 = c14220e4.f28255c;
            c14220e4.f28255c = c14220e3;
            c14220e3 = c14220e4;
            c14220e4 = c14220e5;
        }
        return c14220e3;
    }

    /* renamed from: g */
    public final Object m31745g(Object obj) throws ExecutionException {
        if (obj instanceof C14218c) {
            throw m31741c("Task was cancelled.", ((C14218c) obj).f28249b);
        }
        if (obj instanceof C14219d) {
            throw new ExecutionException(((C14219d) obj).f28251a);
        }
        if (obj == NULL) {
            return null;
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        if ((obj != null) && (!(obj instanceof RunnableC14222g))) {
            return m31745g(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= SPIN_THRESHOLD_NANOS) {
            C14224i c14224i = this.waiters;
            if (c14224i != C14224i.f28263c) {
                C14224i c14224i2 = new C14224i();
                do {
                    c14224i2.m31754a(c14224i);
                    if (ATOMIC_HELPER.mo31751c(this, c14224i, c14224i2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m31747j(c14224i2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.value;
                            if ((obj2 != null) && (!(obj2 instanceof RunnableC14222g))) {
                                return m31745g(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= SPIN_THRESHOLD_NANOS);
                        m31747j(c14224i2);
                    } else {
                        c14224i = this.waiters;
                    }
                } while (c14224i != C14224i.f28263c);
            }
            return m31745g(this.value);
        }
        while (nanos > 0) {
            Object obj3 = this.value;
            if ((obj3 != null) && (!(obj3 instanceof RunnableC14222g))) {
                return m31745g(obj3);
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
        String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + SPIN_THRESHOLD_NANOS < 0) {
            String str2 = str + " (plus ";
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > SPIN_THRESHOLD_NANOS;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + " " + lowerCase;
                if (z) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + string);
    }

    /* renamed from: h */
    public final void m31746h() {
        C14224i c14224i;
        do {
            c14224i = this.waiters;
        } while (!ATOMIC_HELPER.mo31751c(this, c14224i, C14224i.f28263c));
        while (c14224i != null) {
            c14224i.m31755b();
            c14224i = c14224i.f28265b;
        }
    }

    public void interruptTask() {
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof C14218c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof RunnableC14222g)) & (this.value != null);
    }

    /* renamed from: j */
    public final void m31747j(C14224i c14224i) {
        c14224i.f28264a = null;
        while (true) {
            C14224i c14224i2 = this.waiters;
            if (c14224i2 == C14224i.f28263c) {
                return;
            }
            C14224i c14224i3 = null;
            while (c14224i2 != null) {
                C14224i c14224i4 = c14224i2.f28265b;
                if (c14224i2.f28264a != null) {
                    c14224i3 = c14224i2;
                } else if (c14224i3 != null) {
                    c14224i3.f28265b = c14224i4;
                    if (c14224i3.f28264a == null) {
                        break;
                    }
                } else if (!ATOMIC_HELPER.mo31751c(this, c14224i2, c14224i4)) {
                    break;
                }
                c14224i2 = c14224i4;
            }
            return;
        }
    }

    /* renamed from: m */
    public final String m31748m(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    final void maybePropagateCancellationTo(Future<?> future) {
        if ((future != null) && isCancelled()) {
            future.cancel(wasInterrupted());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String pendingToString() {
        Object obj = this.value;
        if (obj instanceof RunnableC14222g) {
            return "setFuture=[" + m31748m(((RunnableC14222g) obj).f28262b) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public boolean set(Object obj) {
        if (obj == null) {
            obj = NULL;
        }
        if (!ATOMIC_HELPER.mo31750b(this, null, obj)) {
            return false;
        }
        complete(this);
        return true;
    }

    public boolean setException(Throwable th) {
        if (!ATOMIC_HELPER.mo31750b(this, null, new C14219d((Throwable) checkNotNull(th)))) {
            return false;
        }
        complete(this);
        return true;
    }

    public boolean setFuture(zfa zfaVar) {
        C14219d c14219d;
        checkNotNull(zfaVar);
        Object obj = this.value;
        if (obj == null) {
            if (zfaVar.isDone()) {
                if (!ATOMIC_HELPER.mo31750b(this, null, getFutureValue(zfaVar))) {
                    return false;
                }
                complete(this);
                return true;
            }
            RunnableC14222g runnableC14222g = new RunnableC14222g(this, zfaVar);
            if (ATOMIC_HELPER.mo31750b(this, null, runnableC14222g)) {
                try {
                    zfaVar.addListener(runnableC14222g, it5.INSTANCE);
                } catch (Throwable th) {
                    try {
                        c14219d = new C14219d(th);
                    } catch (Throwable unused) {
                        c14219d = C14219d.f28250b;
                    }
                    ATOMIC_HELPER.mo31750b(this, runnableC14222g, c14219d);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof C14218c) {
            zfaVar.cancel(((C14218c) obj).f28248a);
        }
        return false;
    }

    public String toString() {
        String strPendingToString;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m31743a(sb);
        } else {
            try {
                strPendingToString = pendingToString();
            } catch (RuntimeException e) {
                strPendingToString = "Exception thrown from implementation: " + e.getClass();
            }
            if (strPendingToString != null && !strPendingToString.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strPendingToString);
                sb.append("]");
            } else if (isDone()) {
                m31743a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final boolean wasInterrupted() {
        Object obj = this.value;
        return (obj instanceof C14218c) && ((C14218c) obj).f28248a;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) & (!(obj2 instanceof RunnableC14222g))) {
                return m31745g(obj2);
            }
            C14224i c14224i = this.waiters;
            if (c14224i != C14224i.f28263c) {
                C14224i c14224i2 = new C14224i();
                do {
                    c14224i2.m31754a(c14224i);
                    if (ATOMIC_HELPER.mo31751c(this, c14224i, c14224i2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                m31747j(c14224i2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof RunnableC14222g))));
                        return m31745g(obj);
                    }
                    c14224i = this.waiters;
                } while (c14224i != C14224i.f28263c);
            }
            return m31745g(this.value);
        }
        throw new InterruptedException();
    }
}
