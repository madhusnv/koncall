package p001o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
public final class tog {

    /* renamed from: a */
    public final uog f47501a;

    /* renamed from: b */
    public final String f47502b;

    /* renamed from: c */
    public final ReentrantLock f47503c;

    /* renamed from: d */
    public boolean f47504d;

    /* renamed from: e */
    public wjg f47505e;

    /* renamed from: f */
    public final List f47506f;

    /* renamed from: g */
    public boolean f47507g;

    /* renamed from: o.tog$a */
    public static final class C17170a extends wjg {

        /* renamed from: e */
        public final /* synthetic */ uk7 f47508e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17170a(String str, boolean z, uk7 uk7Var) {
            super(str, z);
            this.f47508e = uk7Var;
        }

        @Override // p001o.wjg
        /* renamed from: f */
        public long mo16932f() {
            this.f47508e.invoke();
            return -1L;
        }
    }

    /* renamed from: o.tog$b */
    public static final class C17171b extends wjg {

        /* renamed from: e */
        public final /* synthetic */ uk7 f47509e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17171b(String str, uk7 uk7Var) {
            super(str, false, 2, null);
            this.f47509e = uk7Var;
        }

        @Override // p001o.wjg
        /* renamed from: f */
        public long mo16932f() {
            return ((Number) this.f47509e.invoke()).longValue();
        }
    }

    public tog(uog uogVar, String str) {
        sq8.m48649h(uogVar, "taskRunner");
        sq8.m48649h(str, "name");
        this.f47501a = uogVar;
        this.f47502b = str;
        this.f47503c = new ReentrantLock();
        this.f47506f = new ArrayList();
    }

    /* renamed from: d */
    public static /* synthetic */ void m50260d(tog togVar, String str, long j, boolean z, uk7 uk7Var, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            z = true;
        }
        togVar.m50264c(str, j2, z, uk7Var);
    }

    /* renamed from: m */
    public static /* synthetic */ void m50261m(tog togVar, wjg wjgVar, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        togVar.m50272l(wjgVar, j);
    }

    /* renamed from: a */
    public final void m50262a() {
        ReentrantLock reentrantLock = this.f47503c;
        if (jgj.f30421e && reentrantLock.isHeldByCurrentThread()) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + reentrantLock);
        }
        ReentrantLock reentrantLockM51856h = this.f47501a.m51856h();
        reentrantLockM51856h.lock();
        try {
            if (m50263b()) {
                this.f47501a.m51858j(this);
            }
            y3i y3iVar = y3i.f54824a;
        } finally {
            reentrantLockM51856h.unlock();
        }
    }

    /* renamed from: b */
    public final boolean m50263b() {
        wjg wjgVar = this.f47505e;
        if (wjgVar != null) {
            sq8.m48646e(wjgVar);
            if (wjgVar.m54641a()) {
                this.f47507g = true;
            }
        }
        boolean z = false;
        for (int size = this.f47506f.size() - 1; -1 < size; size--) {
            if (((wjg) this.f47506f.get(size)).m54641a()) {
                Logger loggerM51857i = this.f47501a.m51857i();
                wjg wjgVar2 = (wjg) this.f47506f.get(size);
                if (loggerM51857i.isLoggable(Level.FINE)) {
                    sog.m48593c(loggerM51857i, wjgVar2, this, "canceled");
                }
                this.f47506f.remove(size);
                z = true;
            }
        }
        return z;
    }

    /* renamed from: c */
    public final void m50264c(String str, long j, boolean z, uk7 uk7Var) {
        sq8.m48649h(str, "name");
        sq8.m48649h(uk7Var, "block");
        m50272l(new C17170a(str, z, uk7Var), j);
    }

    /* renamed from: e */
    public final wjg m50265e() {
        return this.f47505e;
    }

    /* renamed from: f */
    public final boolean m50266f() {
        return this.f47507g;
    }

    /* renamed from: g */
    public final List m50267g() {
        return this.f47506f;
    }

    /* renamed from: h */
    public final String m50268h() {
        return this.f47502b;
    }

    /* renamed from: i */
    public final boolean m50269i() {
        return this.f47504d;
    }

    /* renamed from: j */
    public final uog m50270j() {
        return this.f47501a;
    }

    /* renamed from: k */
    public final void m50271k(String str, long j, uk7 uk7Var) {
        sq8.m48649h(str, "name");
        sq8.m48649h(uk7Var, "block");
        m50272l(new C17171b(str, uk7Var), j);
    }

    /* renamed from: l */
    public final void m50272l(wjg wjgVar, long j) {
        sq8.m48649h(wjgVar, "task");
        ReentrantLock reentrantLockM51856h = this.f47501a.m51856h();
        reentrantLockM51856h.lock();
        try {
            if (!this.f47504d) {
                if (m50273n(wjgVar, j, false)) {
                    this.f47501a.m51858j(this);
                }
                y3i y3iVar = y3i.f54824a;
            } else if (wjgVar.m54641a()) {
                Logger loggerM51857i = this.f47501a.m51857i();
                if (loggerM51857i.isLoggable(Level.FINE)) {
                    sog.m48593c(loggerM51857i, wjgVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                Logger loggerM51857i2 = this.f47501a.m51857i();
                if (loggerM51857i2.isLoggable(Level.FINE)) {
                    sog.m48593c(loggerM51857i2, wjgVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        } finally {
            reentrantLockM51856h.unlock();
        }
    }

    /* renamed from: n */
    public final boolean m50273n(wjg wjgVar, long j, boolean z) {
        String str;
        sq8.m48649h(wjgVar, "task");
        wjgVar.m54645e(this);
        long jNanoTime = this.f47501a.m51854f().nanoTime();
        long j2 = jNanoTime + j;
        int iIndexOf = this.f47506f.indexOf(wjgVar);
        if (iIndexOf != -1) {
            if (wjgVar.m54643c() <= j2) {
                Logger loggerM51857i = this.f47501a.m51857i();
                if (loggerM51857i.isLoggable(Level.FINE)) {
                    sog.m48593c(loggerM51857i, wjgVar, this, "already scheduled");
                }
                return false;
            }
            this.f47506f.remove(iIndexOf);
        }
        wjgVar.m54646g(j2);
        Logger loggerM51857i2 = this.f47501a.m51857i();
        if (loggerM51857i2.isLoggable(Level.FINE)) {
            if (z) {
                str = "run again after " + sog.m48592b(j2 - jNanoTime);
            } else {
                str = "scheduled after " + sog.m48592b(j2 - jNanoTime);
            }
            sog.m48593c(loggerM51857i2, wjgVar, this, str);
        }
        Iterator it = this.f47506f.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (((wjg) it.next()).m54643c() - jNanoTime > j) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = this.f47506f.size();
        }
        this.f47506f.add(size, wjgVar);
        return size == 0;
    }

    /* renamed from: o */
    public final void m50274o(wjg wjgVar) {
        this.f47505e = wjgVar;
    }

    /* renamed from: p */
    public final void m50275p(boolean z) {
        this.f47507g = z;
    }

    /* renamed from: q */
    public final void m50276q() {
        ReentrantLock reentrantLock = this.f47503c;
        if (jgj.f30421e && reentrantLock.isHeldByCurrentThread()) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + reentrantLock);
        }
        ReentrantLock reentrantLockM51856h = this.f47501a.m51856h();
        reentrantLockM51856h.lock();
        try {
            this.f47504d = true;
            if (m50263b()) {
                this.f47501a.m51858j(this);
            }
            y3i y3iVar = y3i.f54824a;
        } finally {
            reentrantLockM51856h.unlock();
        }
    }

    public String toString() {
        return this.f47502b;
    }
}
