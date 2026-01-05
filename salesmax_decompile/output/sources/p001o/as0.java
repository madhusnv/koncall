package p001o;

import com.google.android.gms.cast.MediaStatus;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes6.dex */
public class as0 extends nmh {

    /* renamed from: i */
    public static final C12238a f15180i = new C12238a(null);

    /* renamed from: j */
    public static final ReentrantLock f15181j;

    /* renamed from: k */
    public static final Condition f15182k;

    /* renamed from: l */
    public static final long f15183l;

    /* renamed from: m */
    public static final long f15184m;

    /* renamed from: n */
    public static as0 f15185n;

    /* renamed from: f */
    public int f15186f;

    /* renamed from: g */
    public as0 f15187g;

    /* renamed from: h */
    public long f15188h;

    /* renamed from: o.as0$a */
    public static final class C12238a {
        public C12238a() {
        }

        public /* synthetic */ C12238a(id5 id5Var) {
            this();
        }

        /* renamed from: c */
        public final as0 m17749c() throws InterruptedException {
            as0 as0Var = as0.f15185n;
            sq8.m48646e(as0Var);
            as0 as0Var2 = as0Var.f15187g;
            if (as0Var2 == null) {
                long jNanoTime = System.nanoTime();
                m17750d().await(as0.f15183l, TimeUnit.MILLISECONDS);
                as0 as0Var3 = as0.f15185n;
                sq8.m48646e(as0Var3);
                if (as0Var3.f15187g != null || System.nanoTime() - jNanoTime < as0.f15184m) {
                    return null;
                }
                return as0.f15185n;
            }
            long jM17745y = as0Var2.m17745y(System.nanoTime());
            if (jM17745y > 0) {
                m17750d().await(jM17745y, TimeUnit.NANOSECONDS);
                return null;
            }
            as0 as0Var4 = as0.f15185n;
            sq8.m48646e(as0Var4);
            as0Var4.f15187g = as0Var2.f15187g;
            as0Var2.f15187g = null;
            as0Var2.f15186f = 2;
            return as0Var2;
        }

        /* renamed from: d */
        public final Condition m17750d() {
            return as0.f15182k;
        }

        /* renamed from: e */
        public final ReentrantLock m17751e() {
            return as0.f15181j;
        }

        /* renamed from: f */
        public final void m17752f(as0 as0Var, long j, boolean z) {
            if (as0.f15185n == null) {
                as0.f15185n = new as0();
                new C12239b().start();
            }
            long jNanoTime = System.nanoTime();
            if (j != 0 && z) {
                as0Var.f15188h = Math.min(j, as0Var.mo40792c() - jNanoTime) + jNanoTime;
            } else if (j != 0) {
                as0Var.f15188h = j + jNanoTime;
            } else {
                if (!z) {
                    throw new AssertionError();
                }
                as0Var.f15188h = as0Var.mo40792c();
            }
            long jM17745y = as0Var.m17745y(jNanoTime);
            as0 as0Var2 = as0.f15185n;
            sq8.m48646e(as0Var2);
            while (as0Var2.f15187g != null) {
                as0 as0Var3 = as0Var2.f15187g;
                sq8.m48646e(as0Var3);
                if (jM17745y < as0Var3.m17745y(jNanoTime)) {
                    break;
                }
                as0Var2 = as0Var2.f15187g;
                sq8.m48646e(as0Var2);
            }
            as0Var.f15187g = as0Var2.f15187g;
            as0Var2.f15187g = as0Var;
            if (as0Var2 == as0.f15185n) {
                m17750d().signal();
            }
        }

        /* renamed from: g */
        public final void m17753g(as0 as0Var) {
            for (as0 as0Var2 = as0.f15185n; as0Var2 != null; as0Var2 = as0Var2.f15187g) {
                if (as0Var2.f15187g == as0Var) {
                    as0Var2.f15187g = as0Var.f15187g;
                    as0Var.f15187g = null;
                    return;
                }
            }
            throw new IllegalStateException("node was not found in the queue".toString());
        }
    }

    /* renamed from: o.as0$b */
    public static final class C12239b extends Thread {
        public C12239b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ReentrantLock reentrantLockM17751e;
            as0 as0VarM17749c;
            while (true) {
                try {
                    reentrantLockM17751e = as0.f15180i.m17751e();
                    reentrantLockM17751e.lock();
                    try {
                        as0VarM17749c = as0.f15180i.m17749c();
                    } finally {
                        reentrantLockM17751e.unlock();
                    }
                } catch (InterruptedException unused) {
                }
                if (as0VarM17749c == as0.f15185n) {
                    C12238a unused2 = as0.f15180i;
                    as0.f15185n = null;
                    return;
                } else {
                    y3i y3iVar = y3i.f54824a;
                    reentrantLockM17751e.unlock();
                    if (as0VarM17749c != null) {
                        as0VarM17749c.mo17740B();
                    }
                }
            }
        }
    }

    /* renamed from: o.as0$c */
    public static final class C12240c implements dvf {

        /* renamed from: b */
        public final /* synthetic */ dvf f15190b;

        public C12240c(dvf dvfVar) {
            this.f15190b = dvfVar;
        }

        @Override // p001o.dvf
        public void M0(rl1 rl1Var, long j) throws IOException {
            sq8.m48649h(rl1Var, "source");
            AbstractC13298f.m25885b(rl1Var.f0(), 0L, j);
            while (true) {
                long j2 = 0;
                if (j <= 0) {
                    return;
                }
                hbf hbfVar = rl1Var.f43757a;
                sq8.m48646e(hbfVar);
                while (true) {
                    if (j2 >= MediaStatus.COMMAND_FOLLOW) {
                        break;
                    }
                    j2 += hbfVar.f26589c - hbfVar.f26588b;
                    if (j2 >= j) {
                        j2 = j;
                        break;
                    } else {
                        hbfVar = hbfVar.f26592f;
                        sq8.m48646e(hbfVar);
                    }
                }
                as0 as0Var = as0.this;
                dvf dvfVar = this.f15190b;
                as0Var.m17742v();
                try {
                    dvfVar.M0(rl1Var, j2);
                    y3i y3iVar = y3i.f54824a;
                    if (as0Var.m17743w()) {
                        throw as0Var.m17741p(null);
                    }
                    j -= j2;
                } catch (IOException e) {
                    if (!as0Var.m17743w()) {
                        throw e;
                    }
                    throw as0Var.m17741p(e);
                } finally {
                    as0Var.m17743w();
                }
            }
        }

        @Override // p001o.dvf
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public as0 timeout() {
            return as0.this;
        }

        @Override // p001o.dvf, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            as0 as0Var = as0.this;
            dvf dvfVar = this.f15190b;
            as0Var.m17742v();
            try {
                dvfVar.close();
                y3i y3iVar = y3i.f54824a;
                if (as0Var.m17743w()) {
                    throw as0Var.m17741p(null);
                }
            } catch (IOException e) {
                if (!as0Var.m17743w()) {
                    throw e;
                }
                throw as0Var.m17741p(e);
            } finally {
                as0Var.m17743w();
            }
        }

        @Override // p001o.dvf, java.io.Flushable
        public void flush() throws IOException {
            as0 as0Var = as0.this;
            dvf dvfVar = this.f15190b;
            as0Var.m17742v();
            try {
                dvfVar.flush();
                y3i y3iVar = y3i.f54824a;
                if (as0Var.m17743w()) {
                    throw as0Var.m17741p(null);
                }
            } catch (IOException e) {
                if (!as0Var.m17743w()) {
                    throw e;
                }
                throw as0Var.m17741p(e);
            } finally {
                as0Var.m17743w();
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f15190b + ')';
        }
    }

    /* renamed from: o.as0$d */
    public static final class C12241d implements lzf {

        /* renamed from: b */
        public final /* synthetic */ lzf f15192b;

        public C12241d(lzf lzfVar) {
            this.f15192b = lzfVar;
        }

        @Override // p001o.lzf
        public long N0(rl1 rl1Var, long j) throws IOException {
            sq8.m48649h(rl1Var, "sink");
            as0 as0Var = as0.this;
            lzf lzfVar = this.f15192b;
            as0Var.m17742v();
            try {
                long jN0 = lzfVar.N0(rl1Var, j);
                if (as0Var.m17743w()) {
                    throw as0Var.m17741p(null);
                }
                return jN0;
            } catch (IOException e) {
                if (as0Var.m17743w()) {
                    throw as0Var.m17741p(e);
                }
                throw e;
            } finally {
                as0Var.m17743w();
            }
        }

        @Override // p001o.lzf
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public as0 timeout() {
            return as0.this;
        }

        @Override // p001o.lzf, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            as0 as0Var = as0.this;
            lzf lzfVar = this.f15192b;
            as0Var.m17742v();
            try {
                lzfVar.close();
                y3i y3iVar = y3i.f54824a;
                if (as0Var.m17743w()) {
                    throw as0Var.m17741p(null);
                }
            } catch (IOException e) {
                if (!as0Var.m17743w()) {
                    throw e;
                }
                throw as0Var.m17741p(e);
            } finally {
                as0Var.m17743w();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f15192b + ')';
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f15181j = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        sq8.m48648g(conditionNewCondition, "newCondition(...)");
        f15182k = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f15183l = millis;
        f15184m = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* renamed from: A */
    public final lzf m17739A(lzf lzfVar) {
        sq8.m48649h(lzfVar, "source");
        return new C12241d(lzfVar);
    }

    /* renamed from: B */
    public void mo17740B() {
    }

    /* renamed from: p */
    public final IOException m17741p(IOException iOException) {
        return mo17744x(iOException);
    }

    /* renamed from: v */
    public final void m17742v() {
        long jMo40797h = mo40797h();
        boolean zMo40794e = mo40794e();
        if (jMo40797h != 0 || zMo40794e) {
            ReentrantLock reentrantLock = f15181j;
            reentrantLock.lock();
            try {
                if (!(this.f15186f == 0)) {
                    throw new IllegalStateException("Unbalanced enter/exit".toString());
                }
                this.f15186f = 1;
                f15180i.m17752f(this, jMo40797h, zMo40794e);
                y3i y3iVar = y3i.f54824a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* renamed from: w */
    public final boolean m17743w() {
        ReentrantLock reentrantLock = f15181j;
        reentrantLock.lock();
        try {
            int i = this.f15186f;
            this.f15186f = 0;
            if (i != 1) {
                return i == 2;
            }
            f15180i.m17753g(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: x */
    public IOException mo17744x(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* renamed from: y */
    public final long m17745y(long j) {
        return this.f15188h - j;
    }

    /* renamed from: z */
    public final dvf m17746z(dvf dvfVar) {
        sq8.m48649h(dvfVar, "sink");
        return new C12240c(dvfVar);
    }
}
