package p001o;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
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
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public abstract class p7 extends rp8 implements zfa {

    /* renamed from: d */
    public static final boolean f39432d;

    /* renamed from: e */
    public static final ui9 f39433e;

    /* renamed from: f */
    public static final AbstractC15983b f39434f;

    /* renamed from: g */
    public static final Object f39435g;

    /* renamed from: a */
    public volatile Object f39436a;

    /* renamed from: b */
    public volatile C15986e f39437b;

    /* renamed from: c */
    public volatile C15993l f39438c;

    /* renamed from: o.p7$b */
    public static abstract class AbstractC15983b {
        public AbstractC15983b() {
        }

        /* renamed from: a */
        public abstract boolean mo43048a(p7 p7Var, C15986e c15986e, C15986e c15986e2);

        /* renamed from: b */
        public abstract boolean mo43049b(p7 p7Var, Object obj, Object obj2);

        /* renamed from: c */
        public abstract boolean mo43050c(p7 p7Var, C15993l c15993l, C15993l c15993l2);

        /* renamed from: d */
        public abstract C15986e mo43051d(p7 p7Var, C15986e c15986e);

        /* renamed from: e */
        public abstract C15993l mo43052e(p7 p7Var, C15993l c15993l);

        /* renamed from: f */
        public abstract void mo43053f(C15993l c15993l, C15993l c15993l2);

        /* renamed from: g */
        public abstract void mo43054g(C15993l c15993l, Thread thread);
    }

    /* renamed from: o.p7$c */
    public static final class C15984c {

        /* renamed from: c */
        public static final C15984c f39439c;

        /* renamed from: d */
        public static final C15984c f39440d;

        /* renamed from: a */
        public final boolean f39441a;

        /* renamed from: b */
        public final Throwable f39442b;

        static {
            if (p7.f39432d) {
                f39440d = null;
                f39439c = null;
            } else {
                f39440d = new C15984c(false, null);
                f39439c = new C15984c(true, null);
            }
        }

        public C15984c(boolean z, Throwable th) {
            this.f39441a = z;
            this.f39442b = th;
        }
    }

    /* renamed from: o.p7$d */
    public static final class C15985d {

        /* renamed from: b */
        public static final C15985d f39443b = new C15985d(new a("Failure occurred while trying to finish a future."));

        /* renamed from: a */
        public final Throwable f39444a;

        /* renamed from: o.p7$d$a */
        public class a extends Throwable {
            public a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public C15985d(Throwable th) {
            this.f39444a = (Throwable) dgd.m23062o(th);
        }
    }

    /* renamed from: o.p7$f */
    public static final class C15987f extends AbstractC15983b {

        /* renamed from: a */
        public final AtomicReferenceFieldUpdater f39449a;

        /* renamed from: b */
        public final AtomicReferenceFieldUpdater f39450b;

        /* renamed from: c */
        public final AtomicReferenceFieldUpdater f39451c;

        /* renamed from: d */
        public final AtomicReferenceFieldUpdater f39452d;

        /* renamed from: e */
        public final AtomicReferenceFieldUpdater f39453e;

        public C15987f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f39449a = atomicReferenceFieldUpdater;
            this.f39450b = atomicReferenceFieldUpdater2;
            this.f39451c = atomicReferenceFieldUpdater3;
            this.f39452d = atomicReferenceFieldUpdater4;
            this.f39453e = atomicReferenceFieldUpdater5;
        }

        @Override // p001o.p7.AbstractC15983b
        /* renamed from: a */
        public boolean mo43048a(p7 p7Var, C15986e c15986e, C15986e c15986e2) {
            return j9.m33417a(this.f39452d, p7Var, c15986e, c15986e2);
        }

        @Override // p001o.p7.AbstractC15983b
        /* renamed from: b */
        public boolean mo43049b(p7 p7Var, Object obj, Object obj2) {
            return j9.m33417a(this.f39453e, p7Var, obj, obj2);
        }

        @Override // p001o.p7.AbstractC15983b
        /* renamed from: c */
        public boolean mo43050c(p7 p7Var, C15993l c15993l, C15993l c15993l2) {
            return j9.m33417a(this.f39451c, p7Var, c15993l, c15993l2);
        }

        @Override // p001o.p7.AbstractC15983b
        /* renamed from: d */
        public C15986e mo43051d(p7 p7Var, C15986e c15986e) {
            return (C15986e) this.f39452d.getAndSet(p7Var, c15986e);
        }

        @Override // p001o.p7.AbstractC15983b
        /* renamed from: e */
        public C15993l mo43052e(p7 p7Var, C15993l c15993l) {
            return (C15993l) this.f39451c.getAndSet(p7Var, c15993l);
        }

        @Override // p001o.p7.AbstractC15983b
        /* renamed from: f */
        public void mo43053f(C15993l c15993l, C15993l c15993l2) {
            this.f39450b.lazySet(c15993l, c15993l2);
        }

        @Override // p001o.p7.AbstractC15983b
        /* renamed from: g */
        public void mo43054g(C15993l c15993l, Thread thread) {
            this.f39449a.lazySet(c15993l, thread);
        }
    }

    /* renamed from: o.p7$g */
    public static final class RunnableC15988g implements Runnable {

        /* renamed from: a */
        public final p7 f39454a;

        /* renamed from: b */
        public final zfa f39455b;

        public RunnableC15988g(p7 p7Var, zfa zfaVar) {
            this.f39454a = p7Var;
            this.f39455b = zfaVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f39454a.f39436a != this) {
                return;
            }
            if (p7.f39434f.mo43049b(this.f39454a, this, p7.m43031u(this.f39455b))) {
                p7.m43028r(this.f39454a, false);
            }
        }
    }

    /* renamed from: o.p7$h */
    public static final class C15989h extends AbstractC15983b {
        public C15989h() {
            super();
        }

        @Override // p001o.p7.AbstractC15983b
        /* renamed from: a */
        public boolean mo43048a(p7 p7Var, C15986e c15986e, C15986e c15986e2) {
            synchronized (p7Var) {
                if (p7Var.f39437b != c15986e) {
                    return false;
                }
                p7Var.f39437b = c15986e2;
                return true;
            }
        }

        @Override // p001o.p7.AbstractC15983b
        /* renamed from: b */
        public boolean mo43049b(p7 p7Var, Object obj, Object obj2) {
            synchronized (p7Var) {
                if (p7Var.f39436a != obj) {
                    return false;
                }
                p7Var.f39436a = obj2;
                return true;
            }
        }

        @Override // p001o.p7.AbstractC15983b
        /* renamed from: c */
        public boolean mo43050c(p7 p7Var, C15993l c15993l, C15993l c15993l2) {
            synchronized (p7Var) {
                if (p7Var.f39438c != c15993l) {
                    return false;
                }
                p7Var.f39438c = c15993l2;
                return true;
            }
        }

        @Override // p001o.p7.AbstractC15983b
        /* renamed from: d */
        public C15986e mo43051d(p7 p7Var, C15986e c15986e) {
            C15986e c15986e2;
            synchronized (p7Var) {
                c15986e2 = p7Var.f39437b;
                if (c15986e2 != c15986e) {
                    p7Var.f39437b = c15986e;
                }
            }
            return c15986e2;
        }

        @Override // p001o.p7.AbstractC15983b
        /* renamed from: e */
        public C15993l mo43052e(p7 p7Var, C15993l c15993l) {
            C15993l c15993l2;
            synchronized (p7Var) {
                c15993l2 = p7Var.f39438c;
                if (c15993l2 != c15993l) {
                    p7Var.f39438c = c15993l;
                }
            }
            return c15993l2;
        }

        @Override // p001o.p7.AbstractC15983b
        /* renamed from: f */
        public void mo43053f(C15993l c15993l, C15993l c15993l2) {
            c15993l.f39464b = c15993l2;
        }

        @Override // p001o.p7.AbstractC15983b
        /* renamed from: g */
        public void mo43054g(C15993l c15993l, Thread thread) {
            c15993l.f39463a = thread;
        }
    }

    /* renamed from: o.p7$i */
    public interface InterfaceC15990i extends zfa {
    }

    /* renamed from: o.p7$j */
    public static abstract class AbstractC15991j extends p7 implements InterfaceC15990i {
        @Override // p001o.p7, p001o.zfa
        public final void addListener(Runnable runnable, Executor executor) {
            super.addListener(runnable, executor);
        }

        @Override // p001o.p7, java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            return super.cancel(z);
        }

        @Override // p001o.p7, java.util.concurrent.Future
        public final Object get() {
            return super.get();
        }

        @Override // p001o.p7, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // p001o.p7, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }

        @Override // p001o.p7, java.util.concurrent.Future
        public final Object get(long j, TimeUnit timeUnit) {
            return super.get(j, timeUnit);
        }
    }

    /* renamed from: o.p7$k */
    public static final class C15992k extends AbstractC15983b {

        /* renamed from: a */
        public static final Unsafe f39456a;

        /* renamed from: b */
        public static final long f39457b;

        /* renamed from: c */
        public static final long f39458c;

        /* renamed from: d */
        public static final long f39459d;

        /* renamed from: e */
        public static final long f39460e;

        /* renamed from: f */
        public static final long f39461f;

        /* renamed from: o.p7$k$a */
        public class a implements PrivilegedExceptionAction {
            @Override // java.security.PrivilegedExceptionAction
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Unsafe run() throws IllegalAccessException, SecurityException, IllegalArgumentException {
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e) {
                    throw new RuntimeException("Could not initialize intrinsics", e.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new a());
            }
            try {
                f39458c = unsafe.objectFieldOffset(p7.class.getDeclaredField("c"));
                f39457b = unsafe.objectFieldOffset(p7.class.getDeclaredField("b"));
                f39459d = unsafe.objectFieldOffset(p7.class.getDeclaredField("a"));
                f39460e = unsafe.objectFieldOffset(C15993l.class.getDeclaredField("a"));
                f39461f = unsafe.objectFieldOffset(C15993l.class.getDeclaredField("b"));
                f39456a = unsafe;
            } catch (NoSuchFieldException e2) {
                throw new RuntimeException(e2);
            }
        }

        public C15992k() {
            super();
        }

        @Override // p001o.p7.AbstractC15983b
        /* renamed from: a */
        public boolean mo43048a(p7 p7Var, C15986e c15986e, C15986e c15986e2) {
            return dkj.m23383a(f39456a, p7Var, f39457b, c15986e, c15986e2);
        }

        @Override // p001o.p7.AbstractC15983b
        /* renamed from: b */
        public boolean mo43049b(p7 p7Var, Object obj, Object obj2) {
            return dkj.m23383a(f39456a, p7Var, f39459d, obj, obj2);
        }

        @Override // p001o.p7.AbstractC15983b
        /* renamed from: c */
        public boolean mo43050c(p7 p7Var, C15993l c15993l, C15993l c15993l2) {
            return dkj.m23383a(f39456a, p7Var, f39458c, c15993l, c15993l2);
        }

        @Override // p001o.p7.AbstractC15983b
        /* renamed from: d */
        public C15986e mo43051d(p7 p7Var, C15986e c15986e) {
            C15986e c15986e2;
            do {
                c15986e2 = p7Var.f39437b;
                if (c15986e == c15986e2) {
                    return c15986e2;
                }
            } while (!mo43048a(p7Var, c15986e2, c15986e));
            return c15986e2;
        }

        @Override // p001o.p7.AbstractC15983b
        /* renamed from: e */
        public C15993l mo43052e(p7 p7Var, C15993l c15993l) {
            C15993l c15993l2;
            do {
                c15993l2 = p7Var.f39438c;
                if (c15993l == c15993l2) {
                    return c15993l2;
                }
            } while (!mo43050c(p7Var, c15993l2, c15993l));
            return c15993l2;
        }

        @Override // p001o.p7.AbstractC15983b
        /* renamed from: f */
        public void mo43053f(C15993l c15993l, C15993l c15993l2) {
            f39456a.putObject(c15993l, f39461f, c15993l2);
        }

        @Override // p001o.p7.AbstractC15983b
        /* renamed from: g */
        public void mo43054g(C15993l c15993l, Thread thread) {
            f39456a.putObject(c15993l, f39460e, thread);
        }
    }

    /* renamed from: o.p7$l */
    public static final class C15993l {

        /* renamed from: c */
        public static final C15993l f39462c = new C15993l(false);

        /* renamed from: a */
        public volatile Thread f39463a;

        /* renamed from: b */
        public volatile C15993l f39464b;

        public C15993l() {
            p7.f39434f.mo43054g(this, Thread.currentThread());
        }

        public C15993l(boolean z) {
        }

        /* renamed from: a */
        public void m43056a(C15993l c15993l) {
            p7.f39434f.mo43053f(this, c15993l);
        }

        /* renamed from: b */
        public void m43057b() {
            Thread thread = this.f39463a;
            if (thread != null) {
                this.f39463a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.logging.Logger] */
    /* JADX WARN: Type inference failed for: r10v0, types: [o.p7$f] */
    /* JADX WARN: Type inference failed for: r1v3, types: [o.p7$a] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v2, types: [o.p7$k] */
    static {
        boolean z;
        C15989h c15989h;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f39432d = z;
        f39433e = new ui9(p7.class);
        ?? r1 = 0;
        r1 = 0;
        try {
            c15989h = new C15992k();
            e = null;
        } catch (Error | Exception e) {
            e = e;
            try {
                c15989h = new C15987f(AtomicReferenceFieldUpdater.newUpdater(C15993l.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C15993l.class, C15993l.class, "b"), AtomicReferenceFieldUpdater.newUpdater(p7.class, C15993l.class, "c"), AtomicReferenceFieldUpdater.newUpdater(p7.class, C15986e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(p7.class, Object.class, "a"));
            } catch (Error | Exception e2) {
                c15989h = new C15989h();
                r1 = e2;
            }
        }
        f39434f = c15989h;
        if (r1 != 0) {
            ui9 ui9Var = f39433e;
            Logger loggerM51626a = ui9Var.m51626a();
            Level level = Level.SEVERE;
            loggerM51626a.log(level, "UnsafeAtomicHelper is broken!", e);
            ui9Var.m51626a().log(level, "SafeAtomicHelper is broken!", r1);
        }
        f39435g = new Object();
    }

    /* renamed from: k */
    private void m43026k(StringBuilder sb) {
        try {
            Object objM43032v = m43032v(this);
            sb.append("SUCCESS, result=[");
            m43042n(sb, objM43032v);
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (Exception e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    /* renamed from: p */
    public static CancellationException m43027p(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* renamed from: r */
    public static void m43028r(p7 p7Var, boolean z) {
        C15986e c15986e = null;
        while (true) {
            p7Var.m43033z();
            if (z) {
                p7Var.m43045w();
                z = false;
            }
            p7Var.mo43041m();
            C15986e c15986eM43044q = p7Var.m43044q(c15986e);
            while (c15986eM43044q != null) {
                c15986e = c15986eM43044q.f39448c;
                Runnable runnable = c15986eM43044q.f39446a;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof RunnableC15988g) {
                    RunnableC15988g runnableC15988g = (RunnableC15988g) runnable2;
                    p7Var = runnableC15988g.f39454a;
                    if (p7Var.f39436a == runnableC15988g) {
                        if (f39434f.mo43049b(p7Var, runnableC15988g, m43031u(runnableC15988g.f39455b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = c15986eM43044q.f39447b;
                    Objects.requireNonNull(executor);
                    m43029s(runnable2, executor);
                }
                c15986eM43044q = c15986e;
            }
            return;
        }
    }

    /* renamed from: s */
    public static void m43029s(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            f39433e.m51626a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    /* renamed from: t */
    private Object m43030t(Object obj) throws ExecutionException {
        if (obj instanceof C15984c) {
            throw m43027p("Task was cancelled.", ((C15984c) obj).f39442b);
        }
        if (obj instanceof C15985d) {
            throw new ExecutionException(((C15985d) obj).f39444a);
        }
        return obj == f39435g ? b5c.m18168a() : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: u */
    public static Object m43031u(zfa zfaVar) {
        Throwable thM48613a;
        if (zfaVar instanceof InterfaceC15990i) {
            Object c15984c = ((p7) zfaVar).f39436a;
            if (c15984c instanceof C15984c) {
                C15984c c15984c2 = (C15984c) c15984c;
                if (c15984c2.f39441a) {
                    c15984c = c15984c2.f39442b != null ? new C15984c(false, c15984c2.f39442b) : C15984c.f39440d;
                }
            }
            Objects.requireNonNull(c15984c);
            return c15984c;
        }
        if ((zfaVar instanceof rp8) && (thM48613a = sp8.m48613a((rp8) zfaVar)) != null) {
            return new C15985d(thM48613a);
        }
        boolean zIsCancelled = zfaVar.isCancelled();
        if ((!f39432d) && zIsCancelled) {
            C15984c c15984c3 = C15984c.f39440d;
            Objects.requireNonNull(c15984c3);
            return c15984c3;
        }
        try {
            Object objM43032v = m43032v(zfaVar);
            if (!zIsCancelled) {
                return objM43032v == null ? f39435g : objM43032v;
            }
            return new C15984c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + zfaVar));
        } catch (Error e) {
            e = e;
            return new C15985d(e);
        } catch (CancellationException e2) {
            if (zIsCancelled) {
                return new C15984c(false, e2);
            }
            return new C15985d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + zfaVar, e2));
        } catch (ExecutionException e3) {
            if (!zIsCancelled) {
                return new C15985d(e3.getCause());
            }
            return new C15984c(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + zfaVar, e3));
        } catch (Exception e4) {
            e = e4;
            return new C15985d(e);
        }
    }

    /* renamed from: v */
    public static Object m43032v(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
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
        return obj;
    }

    /* renamed from: z */
    private void m43033z() {
        for (C15993l c15993lMo43052e = f39434f.mo43052e(this, C15993l.f39462c); c15993lMo43052e != null; c15993lMo43052e = c15993lMo43052e.f39464b) {
            c15993lMo43052e.m43057b();
        }
    }

    /* renamed from: A */
    public final void m43034A(C15993l c15993l) {
        c15993l.f39463a = null;
        while (true) {
            C15993l c15993l2 = this.f39438c;
            if (c15993l2 == C15993l.f39462c) {
                return;
            }
            C15993l c15993l3 = null;
            while (c15993l2 != null) {
                C15993l c15993l4 = c15993l2.f39464b;
                if (c15993l2.f39463a != null) {
                    c15993l3 = c15993l2;
                } else if (c15993l3 != null) {
                    c15993l3.f39464b = c15993l4;
                    if (c15993l3.f39463a == null) {
                        break;
                    }
                } else if (!f39434f.mo43050c(this, c15993l2, c15993l4)) {
                    break;
                }
                c15993l2 = c15993l4;
            }
            return;
        }
    }

    /* renamed from: B */
    public boolean mo43035B(Object obj) {
        if (obj == null) {
            obj = f39435g;
        }
        if (!f39434f.mo43049b(this, null, obj)) {
            return false;
        }
        m43028r(this, false);
        return true;
    }

    /* renamed from: C */
    public boolean mo43036C(Throwable th) {
        if (!f39434f.mo43049b(this, null, new C15985d((Throwable) dgd.m23062o(th)))) {
            return false;
        }
        m43028r(this, false);
        return true;
    }

    /* renamed from: D */
    public boolean m43037D(zfa zfaVar) {
        C15985d c15985d;
        dgd.m23062o(zfaVar);
        Object obj = this.f39436a;
        if (obj == null) {
            if (zfaVar.isDone()) {
                if (!f39434f.mo43049b(this, null, m43031u(zfaVar))) {
                    return false;
                }
                m43028r(this, false);
                return true;
            }
            RunnableC15988g runnableC15988g = new RunnableC15988g(this, zfaVar);
            if (f39434f.mo43049b(this, null, runnableC15988g)) {
                try {
                    zfaVar.addListener(runnableC15988g, jt5.INSTANCE);
                } catch (Throwable th) {
                    try {
                        c15985d = new C15985d(th);
                    } catch (Error | Exception unused) {
                        c15985d = C15985d.f39443b;
                    }
                    f39434f.mo43049b(this, runnableC15988g, c15985d);
                }
                return true;
            }
            obj = this.f39436a;
        }
        if (obj instanceof C15984c) {
            zfaVar.cancel(((C15984c) obj).f39441a);
        }
        return false;
    }

    /* renamed from: E */
    public final boolean m43038E() {
        Object obj = this.f39436a;
        return (obj instanceof C15984c) && ((C15984c) obj).f39441a;
    }

    @Override // p001o.rp8
    /* renamed from: a */
    public final Throwable mo43039a() {
        if (!(this instanceof InterfaceC15990i)) {
            return null;
        }
        Object obj = this.f39436a;
        if (obj instanceof C15985d) {
            return ((C15985d) obj).f39444a;
        }
        return null;
    }

    public void addListener(Runnable runnable, Executor executor) {
        C15986e c15986e;
        dgd.m23063p(runnable, "Runnable was null.");
        dgd.m23063p(executor, "Executor was null.");
        if (!isDone() && (c15986e = this.f39437b) != C15986e.f39445d) {
            C15986e c15986e2 = new C15986e(runnable, executor);
            do {
                c15986e2.f39448c = c15986e;
                if (f39434f.mo43048a(this, c15986e, c15986e2)) {
                    return;
                } else {
                    c15986e = this.f39437b;
                }
            } while (c15986e != C15986e.f39445d);
        }
        m43029s(runnable, executor);
    }

    public boolean cancel(boolean z) {
        C15984c c15984c;
        Object obj = this.f39436a;
        if (!(obj == null) && !(obj instanceof RunnableC15988g)) {
            return false;
        }
        if (f39432d) {
            c15984c = new C15984c(z, new CancellationException("Future.cancel() was called."));
        } else {
            c15984c = z ? C15984c.f39439c : C15984c.f39440d;
            Objects.requireNonNull(c15984c);
        }
        p7 p7Var = this;
        boolean z2 = false;
        while (true) {
            if (f39434f.mo43049b(p7Var, obj, c15984c)) {
                m43028r(p7Var, z);
                if (!(obj instanceof RunnableC15988g)) {
                    return true;
                }
                zfa zfaVar = ((RunnableC15988g) obj).f39455b;
                if (!(zfaVar instanceof InterfaceC15990i)) {
                    zfaVar.cancel(z);
                    return true;
                }
                p7Var = (p7) zfaVar;
                obj = p7Var.f39436a;
                if (!(obj == null) && !(obj instanceof RunnableC15988g)) {
                    return true;
                }
                z2 = true;
            } else {
                obj = p7Var.f39436a;
                if (!(obj instanceof RunnableC15988g)) {
                    return z2;
                }
            }
        }
    }

    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f39436a;
        if ((obj != null) && (!(obj instanceof RunnableC15988g))) {
            return m43030t(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C15993l c15993l = this.f39438c;
            if (c15993l != C15993l.f39462c) {
                C15993l c15993l2 = new C15993l();
                do {
                    c15993l2.m43056a(c15993l);
                    if (f39434f.mo43050c(this, c15993l, c15993l2)) {
                        do {
                            pgc.m43606a(this, nanos);
                            if (Thread.interrupted()) {
                                m43034A(c15993l2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f39436a;
                            if ((obj2 != null) && (!(obj2 instanceof RunnableC15988g))) {
                                return m43030t(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m43034A(c15993l2);
                    } else {
                        c15993l = this.f39438c;
                    }
                } while (c15993l != C15993l.f39462c);
            }
            Object obj3 = this.f39436a;
            Objects.requireNonNull(obj3);
            return m43030t(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f39436a;
            if ((obj4 != null) && (!(obj4 instanceof RunnableC15988g))) {
                return m43030t(obj4);
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
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
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

    public boolean isCancelled() {
        return this.f39436a instanceof C15984c;
    }

    public boolean isDone() {
        return (!(r0 instanceof RunnableC15988g)) & (this.f39436a != null);
    }

    /* renamed from: l */
    public final void m43040l(StringBuilder sb) {
        String strM51207a;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.f39436a;
        if (obj instanceof RunnableC15988g) {
            sb.append(", setFuture=[");
            m43043o(sb, ((RunnableC15988g) obj).f39455b);
            sb.append("]");
        } else {
            try {
                strM51207a = u8g.m51207a(mo43047y());
            } catch (Exception | StackOverflowError e) {
                strM51207a = "Exception thrown from implementation: " + e.getClass();
            }
            if (strM51207a != null) {
                sb.append(", info=[");
                sb.append(strM51207a);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            m43026k(sb);
        }
    }

    /* renamed from: m */
    public void mo43041m() {
    }

    /* renamed from: n */
    public final void m43042n(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    /* renamed from: o */
    public final void m43043o(StringBuilder sb, Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (Exception | StackOverflowError e) {
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        }
    }

    /* renamed from: q */
    public final C15986e m43044q(C15986e c15986e) {
        C15986e c15986e2 = c15986e;
        C15986e c15986eMo43051d = f39434f.mo43051d(this, C15986e.f39445d);
        while (c15986eMo43051d != null) {
            C15986e c15986e3 = c15986eMo43051d.f39448c;
            c15986eMo43051d.f39448c = c15986e2;
            c15986e2 = c15986eMo43051d;
            c15986eMo43051d = c15986e3;
        }
        return c15986e2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m43026k(sb);
        } else {
            m43040l(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: w */
    public void m43045w() {
    }

    /* renamed from: x */
    final void m43046x(Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(m43038E());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: y */
    public String mo43047y() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* renamed from: o.p7$e */
    public static final class C15986e {

        /* renamed from: d */
        public static final C15986e f39445d = new C15986e();

        /* renamed from: a */
        public final Runnable f39446a;

        /* renamed from: b */
        public final Executor f39447b;

        /* renamed from: c */
        public C15986e f39448c;

        public C15986e(Runnable runnable, Executor executor) {
            this.f39446a = runnable;
            this.f39447b = executor;
        }

        public C15986e() {
            this.f39446a = null;
            this.f39447b = null;
        }
    }

    public Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f39436a;
            if ((obj2 != null) & (!(obj2 instanceof RunnableC15988g))) {
                return m43030t(obj2);
            }
            C15993l c15993l = this.f39438c;
            if (c15993l != C15993l.f39462c) {
                C15993l c15993l2 = new C15993l();
                do {
                    c15993l2.m43056a(c15993l);
                    if (f39434f.mo43050c(this, c15993l, c15993l2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f39436a;
                            } else {
                                m43034A(c15993l2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof RunnableC15988g))));
                        return m43030t(obj);
                    }
                    c15993l = this.f39438c;
                } while (c15993l != C15993l.f39462c);
            }
            Object obj3 = this.f39436a;
            Objects.requireNonNull(obj3);
            return m43030t(obj3);
        }
        throw new InterruptedException();
    }
}
