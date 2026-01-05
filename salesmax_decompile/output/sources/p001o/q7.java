package p001o;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
public abstract class q7 implements Future {

    /* renamed from: d */
    public static final boolean f41384d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e */
    public static final Logger f41385e = Logger.getLogger(q7.class.getName());

    /* renamed from: f */
    public static final AbstractC16301b f41386f;

    /* renamed from: g */
    public static final Object f41387g;

    /* renamed from: a */
    public volatile Object f41388a;

    /* renamed from: b */
    public volatile C16303d f41389b;

    /* renamed from: c */
    public volatile C16307h f41390c;

    /* renamed from: o.q7$b */
    public static abstract class AbstractC16301b {
        public AbstractC16301b() {
        }

        /* renamed from: a */
        public abstract boolean mo44900a(q7 q7Var, C16303d c16303d, C16303d c16303d2);

        /* renamed from: b */
        public abstract boolean mo44901b(q7 q7Var, Object obj, Object obj2);

        /* renamed from: c */
        public abstract boolean mo44902c(q7 q7Var, C16307h c16307h, C16307h c16307h2);

        /* renamed from: d */
        public abstract void mo44903d(C16307h c16307h, C16307h c16307h2);

        /* renamed from: e */
        public abstract void mo44904e(C16307h c16307h, Thread thread);
    }

    /* renamed from: o.q7$c */
    public static final class C16302c {

        /* renamed from: a */
        public final boolean f41391a;

        /* renamed from: b */
        public final Throwable f41392b;

        public C16302c(boolean z, Throwable th) {
            this.f41391a = z;
            this.f41392b = th;
        }
    }

    /* renamed from: o.q7$d */
    public static final class C16303d {

        /* renamed from: d */
        public static final C16303d f41393d = new C16303d(null, null);

        /* renamed from: a */
        public final Runnable f41394a;

        /* renamed from: b */
        public final Executor f41395b;

        /* renamed from: c */
        public C16303d f41396c;

        public C16303d(Runnable runnable, Executor executor) {
            this.f41394a = runnable;
            this.f41395b = executor;
        }
    }

    /* renamed from: o.q7$e */
    public static final class C16304e extends AbstractC16301b {

        /* renamed from: a */
        public final AtomicReferenceFieldUpdater f41397a;

        /* renamed from: b */
        public final AtomicReferenceFieldUpdater f41398b;

        /* renamed from: c */
        public final AtomicReferenceFieldUpdater f41399c;

        /* renamed from: d */
        public final AtomicReferenceFieldUpdater f41400d;

        /* renamed from: e */
        public final AtomicReferenceFieldUpdater f41401e;

        public C16304e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f41397a = atomicReferenceFieldUpdater;
            this.f41398b = atomicReferenceFieldUpdater2;
            this.f41399c = atomicReferenceFieldUpdater3;
            this.f41400d = atomicReferenceFieldUpdater4;
            this.f41401e = atomicReferenceFieldUpdater5;
        }

        @Override // p001o.q7.AbstractC16301b
        /* renamed from: a */
        public boolean mo44900a(q7 q7Var, C16303d c16303d, C16303d c16303d2) {
            return j9.m33417a(this.f41400d, q7Var, c16303d, c16303d2);
        }

        @Override // p001o.q7.AbstractC16301b
        /* renamed from: b */
        public boolean mo44901b(q7 q7Var, Object obj, Object obj2) {
            return j9.m33417a(this.f41401e, q7Var, obj, obj2);
        }

        @Override // p001o.q7.AbstractC16301b
        /* renamed from: c */
        public boolean mo44902c(q7 q7Var, C16307h c16307h, C16307h c16307h2) {
            return j9.m33417a(this.f41399c, q7Var, c16307h, c16307h2);
        }

        @Override // p001o.q7.AbstractC16301b
        /* renamed from: d */
        public void mo44903d(C16307h c16307h, C16307h c16307h2) {
            this.f41398b.lazySet(c16307h, c16307h2);
        }

        @Override // p001o.q7.AbstractC16301b
        /* renamed from: e */
        public void mo44904e(C16307h c16307h, Thread thread) {
            this.f41397a.lazySet(c16307h, thread);
        }
    }

    /* renamed from: o.q7$f */
    public static final class C16305f extends AbstractC16301b {
        public C16305f() {
            super();
        }

        @Override // p001o.q7.AbstractC16301b
        /* renamed from: a */
        public boolean mo44900a(q7 q7Var, C16303d c16303d, C16303d c16303d2) {
            synchronized (q7Var) {
                if (q7Var.f41389b != c16303d) {
                    return false;
                }
                q7Var.f41389b = c16303d2;
                return true;
            }
        }

        @Override // p001o.q7.AbstractC16301b
        /* renamed from: b */
        public boolean mo44901b(q7 q7Var, Object obj, Object obj2) {
            synchronized (q7Var) {
                if (q7Var.f41388a != obj) {
                    return false;
                }
                q7Var.f41388a = obj2;
                return true;
            }
        }

        @Override // p001o.q7.AbstractC16301b
        /* renamed from: c */
        public boolean mo44902c(q7 q7Var, C16307h c16307h, C16307h c16307h2) {
            synchronized (q7Var) {
                if (q7Var.f41390c != c16307h) {
                    return false;
                }
                q7Var.f41390c = c16307h2;
                return true;
            }
        }

        @Override // p001o.q7.AbstractC16301b
        /* renamed from: d */
        public void mo44903d(C16307h c16307h, C16307h c16307h2) {
            c16307h.f41404b = c16307h2;
        }

        @Override // p001o.q7.AbstractC16301b
        /* renamed from: e */
        public void mo44904e(C16307h c16307h, Thread thread) {
            c16307h.f41403a = thread;
        }
    }

    /* renamed from: o.q7$g */
    public static abstract class AbstractC16306g extends q7 {
        @Override // p001o.q7, java.util.concurrent.Future
        public final Object get() {
            return super.get();
        }

        @Override // p001o.q7, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // p001o.q7, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // p001o.q7, java.util.concurrent.Future
        public final Object get(long j, TimeUnit timeUnit) {
            return super.get(j, timeUnit);
        }
    }

    /* renamed from: o.q7$h */
    public static final class C16307h {

        /* renamed from: c */
        public static final C16307h f41402c = new C16307h(false);

        /* renamed from: a */
        public volatile Thread f41403a;

        /* renamed from: b */
        public volatile C16307h f41404b;

        public C16307h() {
            q7.f41386f.mo44904e(this, Thread.currentThread());
        }

        public C16307h(boolean z) {
        }

        /* renamed from: a */
        public void m44905a(C16307h c16307h) {
            q7.f41386f.mo44903d(this, c16307h);
        }

        /* renamed from: b */
        public void m44906b() {
            Thread thread = this.f41403a;
            if (thread != null) {
                this.f41403a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    static {
        AbstractC16301b c16305f;
        try {
            c16305f = new C16304e(AtomicReferenceFieldUpdater.newUpdater(C16307h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C16307h.class, C16307h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(q7.class, C16307h.class, "c"), AtomicReferenceFieldUpdater.newUpdater(q7.class, C16303d.class, "b"), AtomicReferenceFieldUpdater.newUpdater(q7.class, Object.class, "a"));
        } catch (Throwable th) {
            Logger logger = f41385e;
            Level level = Level.SEVERE;
            logger.log(level, "UnsafeAtomicHelper is broken!");
            logger.log(level, "SafeAtomicHelper is broken!", th);
            c16305f = new C16305f();
        }
        f41386f = c16305f;
        f41387g = new Object();
    }

    /* renamed from: h */
    public static final CancellationException m44890h(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* renamed from: m */
    public static void m44891m(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f41385e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        Object obj = this.f41388a;
        if ((obj == null) | false) {
            if (f41386f.mo44901b(this, obj, new C16302c(z, f41384d ? m44898p() : null))) {
                if (z) {
                    m44897o();
                }
                m44894k();
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f41388a;
        if ((obj != null) && true) {
            return m44896n(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C16307h c16307h = this.f41390c;
            if (c16307h != C16307h.f41402c) {
                C16307h c16307h2 = new C16307h();
                do {
                    c16307h2.m44905a(c16307h);
                    if (f41386f.mo44902c(this, c16307h, c16307h2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m44899q(c16307h2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f41388a;
                            if ((obj2 != null) && true) {
                                return m44896n(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m44899q(c16307h2);
                    } else {
                        c16307h = this.f41390c;
                    }
                } while (c16307h != C16307h.f41402c);
            }
            return m44896n(this.f41388a);
        }
        while (nanos > 0) {
            Object obj3 = this.f41388a;
            if ((obj3 != null) && true) {
                return m44896n(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        throw new TimeoutException();
    }

    /* renamed from: i */
    public final C16303d m44892i() {
        C16303d c16303d;
        do {
            c16303d = this.f41389b;
        } while (!f41386f.mo44900a(this, c16303d, C16303d.f41393d));
        return c16303d;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f41388a instanceof C16302c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (this.f41388a != null) & true;
    }

    /* renamed from: j */
    public final C16307h m44893j() {
        C16307h c16307h;
        do {
            c16307h = this.f41390c;
        } while (!f41386f.mo44902c(this, c16307h, C16307h.f41402c));
        return c16307h;
    }

    /* renamed from: k */
    public final void m44894k() {
        for (C16307h c16307hM44893j = m44893j(); c16307hM44893j != null; c16307hM44893j = c16307hM44893j.f41404b) {
            c16307hM44893j.m44906b();
        }
        C16303d c16303dM44892i = m44892i();
        C16303d c16303d = null;
        while (c16303dM44892i != null) {
            C16303d c16303d2 = c16303dM44892i.f41396c;
            c16303dM44892i.f41396c = c16303d;
            c16303d = c16303dM44892i;
            c16303dM44892i = c16303d2;
        }
        while (c16303d != null) {
            m44891m(c16303d.f41394a, c16303d.f41395b);
            c16303d = c16303d.f41396c;
        }
        m44895l();
    }

    /* renamed from: l */
    public void m44895l() {
    }

    /* renamed from: n */
    public final Object m44896n(Object obj) {
        if (obj instanceof C16302c) {
            throw m44890h("Task was cancelled.", ((C16302c) obj).f41392b);
        }
        if (obj == f41387g) {
            return null;
        }
        return obj;
    }

    /* renamed from: o */
    public void m44897o() {
    }

    /* renamed from: p */
    public final Throwable m44898p() {
        return new CancellationException("Future.cancel() was called.");
    }

    /* renamed from: q */
    public final void m44899q(C16307h c16307h) {
        c16307h.f41403a = null;
        while (true) {
            C16307h c16307h2 = this.f41390c;
            if (c16307h2 == C16307h.f41402c) {
                return;
            }
            C16307h c16307h3 = null;
            while (c16307h2 != null) {
                C16307h c16307h4 = c16307h2.f41404b;
                if (c16307h2.f41403a != null) {
                    c16307h3 = c16307h2;
                } else if (c16307h3 != null) {
                    c16307h3.f41404b = c16307h4;
                    if (c16307h3.f41403a == null) {
                        break;
                    }
                } else if (!f41386f.mo44902c(this, c16307h2, c16307h4)) {
                    break;
                }
                c16307h2 = c16307h4;
            }
            return;
        }
    }

    /* renamed from: r */
    public boolean mo43750r(Object obj) {
        if (obj == null) {
            obj = f41387g;
        }
        if (!f41386f.mo44901b(this, null, obj)) {
            return false;
        }
        m44894k();
        return true;
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f41388a;
            if ((obj2 != null) & true) {
                return m44896n(obj2);
            }
            C16307h c16307h = this.f41390c;
            if (c16307h != C16307h.f41402c) {
                C16307h c16307h2 = new C16307h();
                do {
                    c16307h2.m44905a(c16307h);
                    if (f41386f.mo44902c(this, c16307h, c16307h2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f41388a;
                            } else {
                                m44899q(c16307h2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & true));
                        return m44896n(obj);
                    }
                    c16307h = this.f41390c;
                } while (c16307h != C16307h.f41402c);
            }
            return m44896n(this.f41388a);
        }
        throw new InterruptedException();
    }
}
