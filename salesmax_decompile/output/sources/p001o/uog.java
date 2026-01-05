package p001o;

import com.amplifyframework.storage.s3.transfer.TransferRecord;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
public final class uog {

    /* renamed from: k */
    public static final C17421b f49283k = new C17421b(null);

    /* renamed from: l */
    public static final Logger f49284l;

    /* renamed from: m */
    public static final uog f49285m;

    /* renamed from: a */
    public final InterfaceC17420a f49286a;

    /* renamed from: b */
    public final Logger f49287b;

    /* renamed from: c */
    public final ReentrantLock f49288c;

    /* renamed from: d */
    public final Condition f49289d;

    /* renamed from: e */
    public int f49290e;

    /* renamed from: f */
    public boolean f49291f;

    /* renamed from: g */
    public long f49292g;

    /* renamed from: h */
    public final List f49293h;

    /* renamed from: i */
    public final List f49294i;

    /* renamed from: j */
    public final Runnable f49295j;

    /* renamed from: o.uog$a */
    public interface InterfaceC17420a {
        /* renamed from: a */
        BlockingQueue mo51861a(BlockingQueue blockingQueue);

        /* renamed from: b */
        void mo51862b(uog uogVar, Runnable runnable);

        /* renamed from: c */
        void mo51863c(uog uogVar);

        /* renamed from: d */
        void mo51864d(uog uogVar, long j);

        long nanoTime();
    }

    /* renamed from: o.uog$b */
    public static final class C17421b {
        public C17421b() {
        }

        public /* synthetic */ C17421b(id5 id5Var) {
            this();
        }
    }

    /* renamed from: o.uog$c */
    public static final class C17422c implements InterfaceC17420a {

        /* renamed from: a */
        public final ThreadPoolExecutor f49296a;

        public C17422c(ThreadFactory threadFactory) {
            sq8.m48649h(threadFactory, "threadFactory");
            this.f49296a = new ThreadPoolExecutor(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // p001o.uog.InterfaceC17420a
        /* renamed from: a */
        public BlockingQueue mo51861a(BlockingQueue blockingQueue) {
            sq8.m48649h(blockingQueue, "queue");
            return blockingQueue;
        }

        @Override // p001o.uog.InterfaceC17420a
        /* renamed from: b */
        public void mo51862b(uog uogVar, Runnable runnable) {
            sq8.m48649h(uogVar, "taskRunner");
            sq8.m48649h(runnable, "runnable");
            this.f49296a.execute(runnable);
        }

        @Override // p001o.uog.InterfaceC17420a
        /* renamed from: c */
        public void mo51863c(uog uogVar) {
            sq8.m48649h(uogVar, "taskRunner");
            uogVar.m51855g().signal();
        }

        @Override // p001o.uog.InterfaceC17420a
        /* renamed from: d */
        public void mo51864d(uog uogVar, long j) throws InterruptedException {
            sq8.m48649h(uogVar, "taskRunner");
            ReentrantLock reentrantLockM51856h = uogVar.m51856h();
            if (!jgj.f30421e || reentrantLockM51856h.isHeldByCurrentThread()) {
                if (j > 0) {
                    uogVar.m51855g().awaitNanos(j);
                }
            } else {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + reentrantLockM51856h);
            }
        }

        @Override // p001o.uog.InterfaceC17420a
        public long nanoTime() {
            return System.nanoTime();
        }
    }

    /* renamed from: o.uog$d */
    public static final class RunnableC17423d implements Runnable {
        public RunnableC17423d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long jNanoTime;
            while (true) {
                ReentrantLock reentrantLockM51856h = uog.this.m51856h();
                uog uogVar = uog.this;
                reentrantLockM51856h.lock();
                try {
                    wjg wjgVarM51851c = uogVar.m51851c();
                    if (wjgVarM51851c == null) {
                        return;
                    }
                    Logger loggerM51857i = uog.this.m51857i();
                    tog togVarM54644d = wjgVarM51851c.m54644d();
                    sq8.m48646e(togVarM54644d);
                    uog uogVar2 = uog.this;
                    boolean zIsLoggable = loggerM51857i.isLoggable(Level.FINE);
                    if (zIsLoggable) {
                        jNanoTime = togVarM54644d.m50270j().m51854f().nanoTime();
                        sog.m48593c(loggerM51857i, wjgVarM51851c, togVarM54644d, "starting");
                    } else {
                        jNanoTime = -1;
                    }
                    try {
                        try {
                            uogVar2.m51860l(wjgVarM51851c);
                            y3i y3iVar = y3i.f54824a;
                            if (zIsLoggable) {
                                sog.m48593c(loggerM51857i, wjgVarM51851c, togVarM54644d, "finished run in " + sog.m48592b(togVarM54644d.m50270j().m51854f().nanoTime() - jNanoTime));
                            }
                        } catch (Throwable th) {
                            uogVar2.m51856h().lock();
                            try {
                                uogVar2.m51854f().mo51862b(uogVar2, this);
                                y3i y3iVar2 = y3i.f54824a;
                                throw th;
                            } finally {
                            }
                        }
                    } catch (Throwable th2) {
                        if (zIsLoggable) {
                            sog.m48593c(loggerM51857i, wjgVarM51851c, togVarM54644d, "failed a run in " + sog.m48592b(togVarM54644d.m50270j().m51854f().nanoTime() - jNanoTime));
                        }
                        throw th2;
                    }
                } finally {
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Logger logger = Logger.getLogger(uog.class.getName());
        sq8.m48648g(logger, "getLogger(...)");
        f49284l = logger;
        f49285m = new uog(new C17422c(jgj.m33821o(jgj.f30422f + " TaskRunner", true)), 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
    }

    public uog(InterfaceC17420a interfaceC17420a, Logger logger) {
        sq8.m48649h(interfaceC17420a, "backend");
        sq8.m48649h(logger, "logger");
        this.f49286a = interfaceC17420a;
        this.f49287b = logger;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f49288c = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        sq8.m48648g(conditionNewCondition, "newCondition(...)");
        this.f49289d = conditionNewCondition;
        this.f49290e = TransferRecord.MAXIMUM_UPLOAD_PARTS;
        this.f49293h = new ArrayList();
        this.f49294i = new ArrayList();
        this.f49295j = new RunnableC17423d();
    }

    /* renamed from: b */
    public final void m51850b(wjg wjgVar, long j) {
        ReentrantLock reentrantLock = this.f49288c;
        if (jgj.f30421e && !reentrantLock.isHeldByCurrentThread()) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + reentrantLock);
        }
        tog togVarM54644d = wjgVar.m54644d();
        sq8.m48646e(togVarM54644d);
        if (!(togVarM54644d.m50265e() == wjgVar)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        boolean zM50266f = togVarM54644d.m50266f();
        togVarM54644d.m50275p(false);
        togVarM54644d.m50274o(null);
        this.f49293h.remove(togVarM54644d);
        if (j != -1 && !zM50266f && !togVarM54644d.m50269i()) {
            togVarM54644d.m50273n(wjgVar, j, true);
        }
        if (!togVarM54644d.m50267g().isEmpty()) {
            this.f49294i.add(togVarM54644d);
        }
    }

    /* renamed from: c */
    public final wjg m51851c() {
        boolean z;
        ReentrantLock reentrantLock = this.f49288c;
        if (jgj.f30421e && !reentrantLock.isHeldByCurrentThread()) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + reentrantLock);
        }
        while (!this.f49294i.isEmpty()) {
            long jNanoTime = this.f49286a.nanoTime();
            Iterator it = this.f49294i.iterator();
            long jMin = Long.MAX_VALUE;
            wjg wjgVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                wjg wjgVar2 = (wjg) ((tog) it.next()).m50267g().get(0);
                long jMax = Math.max(0L, wjgVar2.m54643c() - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (wjgVar != null) {
                        z = true;
                        break;
                    }
                    wjgVar = wjgVar2;
                }
            }
            if (wjgVar != null) {
                m51852d(wjgVar);
                if (z || (!this.f49291f && (!this.f49294i.isEmpty()))) {
                    this.f49286a.mo51862b(this, this.f49295j);
                }
                return wjgVar;
            }
            if (this.f49291f) {
                if (jMin < this.f49292g - jNanoTime) {
                    this.f49286a.mo51863c(this);
                }
                return null;
            }
            this.f49291f = true;
            this.f49292g = jNanoTime + jMin;
            try {
                try {
                    this.f49286a.mo51864d(this, jMin);
                } catch (InterruptedException unused) {
                    m51853e();
                }
            } finally {
                this.f49291f = false;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final void m51852d(wjg wjgVar) {
        ReentrantLock reentrantLock = this.f49288c;
        if (jgj.f30421e && !reentrantLock.isHeldByCurrentThread()) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + reentrantLock);
        }
        wjgVar.m54646g(-1L);
        tog togVarM54644d = wjgVar.m54644d();
        sq8.m48646e(togVarM54644d);
        togVarM54644d.m50267g().remove(wjgVar);
        this.f49294i.remove(togVarM54644d);
        togVarM54644d.m50274o(wjgVar);
        this.f49293h.add(togVarM54644d);
    }

    /* renamed from: e */
    public final void m51853e() {
        ReentrantLock reentrantLock = this.f49288c;
        if (jgj.f30421e && !reentrantLock.isHeldByCurrentThread()) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + reentrantLock);
        }
        int size = this.f49293h.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            } else {
                ((tog) this.f49293h.get(size)).m50263b();
            }
        }
        for (int size2 = this.f49294i.size() - 1; -1 < size2; size2--) {
            tog togVar = (tog) this.f49294i.get(size2);
            togVar.m50263b();
            if (togVar.m50267g().isEmpty()) {
                this.f49294i.remove(size2);
            }
        }
    }

    /* renamed from: f */
    public final InterfaceC17420a m51854f() {
        return this.f49286a;
    }

    /* renamed from: g */
    public final Condition m51855g() {
        return this.f49289d;
    }

    /* renamed from: h */
    public final ReentrantLock m51856h() {
        return this.f49288c;
    }

    /* renamed from: i */
    public final Logger m51857i() {
        return this.f49287b;
    }

    /* renamed from: j */
    public final void m51858j(tog togVar) {
        sq8.m48649h(togVar, "taskQueue");
        ReentrantLock reentrantLock = this.f49288c;
        if (jgj.f30421e && !reentrantLock.isHeldByCurrentThread()) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + reentrantLock);
        }
        if (togVar.m50265e() == null) {
            if (!togVar.m50267g().isEmpty()) {
                ggj.m28621a(this.f49294i, togVar);
            } else {
                this.f49294i.remove(togVar);
            }
        }
        if (this.f49291f) {
            this.f49286a.mo51863c(this);
        } else {
            this.f49286a.mo51862b(this, this.f49295j);
        }
    }

    /* renamed from: k */
    public final tog m51859k() {
        ReentrantLock reentrantLock = this.f49288c;
        reentrantLock.lock();
        try {
            int i = this.f49290e;
            this.f49290e = i + 1;
            reentrantLock.unlock();
            StringBuilder sb = new StringBuilder();
            sb.append('Q');
            sb.append(i);
            return new tog(this, sb.toString());
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* renamed from: l */
    public final void m51860l(wjg wjgVar) {
        ReentrantLock reentrantLock;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(wjgVar.m54642b());
        try {
            long jMo16932f = wjgVar.mo16932f();
            reentrantLock = this.f49288c;
            reentrantLock.lock();
            try {
                m51850b(wjgVar, jMo16932f);
                y3i y3iVar = y3i.f54824a;
                reentrantLock.unlock();
                threadCurrentThread.setName(name);
            } finally {
            }
        } catch (Throwable th) {
            reentrantLock = this.f49288c;
            reentrantLock.lock();
            try {
                m51850b(wjgVar, -1L);
                y3i y3iVar2 = y3i.f54824a;
                reentrantLock.unlock();
                threadCurrentThread.setName(name);
                throw th;
            } finally {
            }
        }
    }

    public /* synthetic */ uog(InterfaceC17420a interfaceC17420a, Logger logger, int i, id5 id5Var) {
        this(interfaceC17420a, (i & 2) != 0 ? f49284l : logger);
    }
}
