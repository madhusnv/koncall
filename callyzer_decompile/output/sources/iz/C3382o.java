package iz;

import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC4154l;
import kz.AbstractC4299e;
import kz.ThreadFactoryC4298d;
import l1.C4327p;
import net.schmizz.sshj.common.C5021a;
import net.schmizz.sshj.common.C5035o;
import net.schmizz.sshj.common.EnumC5034n;
import net.schmizz.sshj.connection.ConnectionException;
import nz.C5205p;
import nz.RunnableC5202m;
import oz.C5783f;
import r1.C6419d;
import r1.C6430o;
import r1.C6434s;
import r1.C6435t;
import r1.C6438w;
import ry.C6687c;
import ry.C6689e;
import s4.AbstractC6746b;
import s4.AbstractC6753i;
import sy.C6966b;
import tb.C7105p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: iz.o */
/* loaded from: classes3.dex */
public final class C3382o {

    /* renamed from: a */
    public int f17963a;

    /* renamed from: b */
    public int f17964b;

    /* renamed from: c */
    public Object f17965c;

    /* renamed from: d */
    public final Object f17966d;

    /* renamed from: e */
    public final Object f17967e;

    /* renamed from: f */
    public final Object f17968f;

    public C3382o(C7105p c7105p, int i10, int i11, C6430o c6430o, C5783f c5783f) {
        this.f17968f = c7105p;
        this.f17965c = c7105p;
        this.f17963a = i10;
        this.f17964b = i11;
        this.f17966d = c6430o;
        this.f17967e = c5783f;
    }

    /* renamed from: a */
    public long m7747a(int i10, int i11) {
        int i12;
        C7105p c7105p = (C7105p) this.f17965c;
        int[] iArr = (int[]) c7105p.f34290b;
        if (i11 == 1) {
            i12 = iArr[i10];
        } else {
            int i13 = (i11 + i10) - 1;
            int[] iArr2 = (int[]) c7105p.f34291c;
            i12 = (iArr2[i13] + iArr[i13]) - iArr2[i10];
        }
        if (i12 < 0) {
            i12 = 0;
        }
        if (i12 < 0) {
            AbstractC6753i.m12938a("width must be >= 0");
        }
        return AbstractC6746b.m12930h(i12, i12, 0, Integer.MAX_VALUE);
    }

    /* renamed from: b */
    public synchronized ExecutorService m7748b() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (((ThreadPoolExecutor) this.f17965c) == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                String name = AbstractC4299e.f21708b + " Dispatcher";
                AbstractC4154l.m8923f(name, "name");
                this.f17965c = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new ThreadFactoryC4298d(name, false));
            }
            threadPoolExecutor = (ThreadPoolExecutor) this.f17965c;
            AbstractC4154l.m8920c(threadPoolExecutor);
        } catch (Throwable th2) {
            throw th2;
        }
        return threadPoolExecutor;
    }

    /* renamed from: c */
    public RunnableC5202m m7749c(String str) {
        Iterator it = ((ArrayDeque) this.f17967e).iterator();
        AbstractC4154l.m8922e(it, "iterator(...)");
        while (it.hasNext()) {
            RunnableC5202m runnableC5202m = (RunnableC5202m) it.next();
            if (AbstractC4154l.m8918a(((C3391x) runnableC5202m.f25356c.f25360b.f36754b).f17994d, str)) {
                return runnableC5202m;
            }
        }
        Iterator it2 = ((ArrayDeque) this.f17966d).iterator();
        AbstractC4154l.m8922e(it2, "iterator(...)");
        while (it2.hasNext()) {
            RunnableC5202m runnableC5202m2 = (RunnableC5202m) it2.next();
            if (AbstractC4154l.m8918a(((C3391x) runnableC5202m2.f25356c.f25360b.f36754b).f17994d, str)) {
                return runnableC5202m2;
            }
        }
        return null;
    }

    /* renamed from: d */
    public void m7750d(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        m7754h();
    }

    /* renamed from: e */
    public void m7751e(RunnableC5202m runnableC5202m) {
        runnableC5202m.f25355b.decrementAndGet();
        m7750d((ArrayDeque) this.f17967e, runnableC5202m);
    }

    /* renamed from: f */
    public boolean m7752f(int i10, boolean z6) throws ConnectionException {
        long j6;
        long j10;
        while (i10 > 0) {
            C6689e c6689e = ((C6687c) this.f17968f).f31986c;
            synchronized (c6689e.f31995b) {
                j6 = c6689e.f31997d;
            }
            if (j6 == 0) {
                if (!z6) {
                    return false;
                }
                C6689e c6689e2 = ((C6687c) this.f17968f).f31986c;
                synchronized (c6689e2.f31995b) {
                    long jNanoTime = System.nanoTime() + TimeUnit.MILLISECONDS.toNanos(c6689e2.f31993e);
                    while (true) {
                        j10 = c6689e2.f31997d;
                        if (j10 <= j6) {
                            c6689e2.f31994a.mo5849y(Long.valueOf(j6), "Waiting, need size to grow from {} bytes");
                            try {
                                c6689e2.f31995b.wait(c6689e2.f31993e);
                                if (c6689e2.f31997d <= j6 && System.nanoTime() - jNanoTime > 0) {
                                    throw new ConnectionException("Timeout when trying to expand the window size");
                                }
                            } catch (InterruptedException e2) {
                                Thread.currentThread().interrupt();
                                throw new ConnectionException(e2);
                            }
                        }
                    }
                }
                j6 = j10;
                break;
            }
            int iMin = Math.min(i10, (int) Math.min(((C6687c) this.f17968f).f31986c.f31996c, j6));
            ((C5035o) this.f17965c).m9931z(this.f17963a);
            C5035o c5035o = (C5035o) this.f17965c;
            EnumC5034n enumC5034n = EnumC5034n.CHANNEL_DATA;
            c5035o.getClass();
            c5035o.m9911f(enumC5034n.toByte());
            ((C5035o) this.f17965c).m9919n(((C6687c) this.f17968f).f31984a.f33732g);
            long j11 = iMin;
            ((C5035o) this.f17965c).m9918m(j11);
            ((C5035o) this.f17965c).m9931z(this.f17964b + iMin);
            i10 -= iMin;
            if (i10 > 0) {
                C5021a c5021a = (C5021a) this.f17966d;
                C5035o c5035o2 = (C5035o) this.f17965c;
                c5021a.m9914i(c5035o2.f24777c, i10, c5035o2.f24775a);
            }
            C6966b c6966b = ((C6687c) this.f17968f).f31984a;
            C4327p c4327p = (C4327p) this.f17967e;
            ReentrantLock reentrantLock = c6966b.f33735k;
            reentrantLock.lock();
            try {
                if (!c6966b.isOpen()) {
                    reentrantLock.unlock();
                    throw new ConnectionException("Stream closed");
                }
                C3382o c3382o = (C3382o) c4327p.f21788b;
                ((C6687c) c3382o.f17968f).f31985b.m14819i((C5035o) c3382o.f17965c);
                reentrantLock.unlock();
                ((C6687c) this.f17968f).f31986c.mo12826a(j11);
                C5035o c5035o3 = (C5035o) this.f17965c;
                c5035o3.f24776b = this.f17963a;
                c5035o3.m9931z(this.f17964b);
                if (i10 > 0) {
                    C5035o c5035o4 = (C5035o) this.f17965c;
                    C5021a c5021a2 = (C5021a) this.f17966d;
                    c5035o4.getClass();
                    if (c5021a2 != null) {
                        int iM9907a = c5021a2.m9907a();
                        c5035o4.m9909c(iM9907a);
                        System.arraycopy(c5021a2.f24775a, c5021a2.f24776b, c5035o4.f24775a, c5035o4.f24777c, iM9907a);
                        c5035o4.f24777c += iM9907a;
                    }
                    C5021a c5021a3 = (C5021a) this.f17966d;
                    c5021a3.f24776b = 0;
                    c5021a3.f24777c = 0;
                }
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        return true;
    }

    /* renamed from: g */
    public C6435t m7753g(int i10) {
        C6438w c6438wM11329c = ((C5783f) this.f17967e).m11329c(i10);
        int i11 = c6438wM11329c.f31065a;
        List list = c6438wM11329c.f31066b;
        int size = list.size();
        int i12 = (size == 0 || i11 + size == this.f17963a) ? 0 : this.f17964b;
        C6434s[] c6434sArr = new C6434s[size];
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            int i15 = (int) ((C6419d) list.get(i14)).f30951a;
            C6434s c6434sM12426a = ((C6430o) this.f17966d).m12426a(i11 + i14, i13, i15, i12, m7747a(i13, i15));
            i13 += i15;
            c6434sArr[i14] = c6434sM12426a;
        }
        return new C6435t(i10, c6434sArr, (C7105p) this.f17968f, c6438wM11329c.f31066b, i12);
    }

    /* renamed from: h */
    public void m7754h() {
        TimeZone timeZone = AbstractC4299e.f21707a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.f17966d).iterator();
                AbstractC4154l.m8922e(it, "iterator(...)");
                while (it.hasNext()) {
                    RunnableC5202m runnableC5202m = (RunnableC5202m) it.next();
                    if (((ArrayDeque) this.f17967e).size() >= this.f17963a) {
                        break;
                    }
                    if (runnableC5202m.f25355b.get() < this.f17964b) {
                        it.remove();
                        runnableC5202m.f25355b.incrementAndGet();
                        arrayList.add(runnableC5202m);
                        ((ArrayDeque) this.f17967e).add(runnableC5202m);
                    }
                }
                m7755i();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int i10 = 0;
        if (((ThreadPoolExecutor) m7748b()).isShutdown()) {
            int size = arrayList.size();
            while (i10 < size) {
                RunnableC5202m runnableC5202m2 = (RunnableC5202m) arrayList.get(i10);
                runnableC5202m2.f25355b.decrementAndGet();
                synchronized (this) {
                    ((ArrayDeque) this.f17967e).remove(runnableC5202m2);
                }
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(null);
                C5205p c5205p = runnableC5202m2.f25356c;
                c5205p.m10195f(interruptedIOException);
                runnableC5202m2.f25354a.mo2561d(c5205p, interruptedIOException);
                i10++;
            }
            return;
        }
        int size2 = arrayList.size();
        while (i10 < size2) {
            RunnableC5202m runnableC5202m3 = (RunnableC5202m) arrayList.get(i10);
            ExecutorService executorServiceM7748b = m7748b();
            runnableC5202m3.getClass();
            C5205p c5205p2 = runnableC5202m3.f25356c;
            AbstractC4154l.m8923f(c5205p2.f25359a.f17834a, "<this>");
            try {
                try {
                    ((ThreadPoolExecutor) executorServiceM7748b).execute(runnableC5202m3);
                } catch (RejectedExecutionException e2) {
                    InterruptedIOException interruptedIOException2 = new InterruptedIOException("executor rejected");
                    interruptedIOException2.initCause(e2);
                    C5205p c5205p3 = runnableC5202m3.f25356c;
                    c5205p3.m10195f(interruptedIOException2);
                    runnableC5202m3.f25354a.mo2561d(c5205p3, interruptedIOException2);
                    c5205p2.f25359a.f17834a.m7751e(runnableC5202m3);
                }
                i10++;
            } catch (Throwable th3) {
                c5205p2.f25359a.f17834a.m7751e(runnableC5202m3);
                throw th3;
            }
        }
    }

    /* renamed from: i */
    public synchronized int m7755i() {
        return ((ArrayDeque) this.f17967e).size() + ((ArrayDeque) this.f17968f).size();
    }

    public C3382o() {
        this.f17963a = 64;
        this.f17964b = 5;
        this.f17966d = new ArrayDeque();
        this.f17967e = new ArrayDeque();
        this.f17968f = new ArrayDeque();
    }

    public C3382o(C6687c c6687c) {
        this.f17968f = c6687c;
        C5035o c5035o = new C5035o(EnumC5034n.CHANNEL_DATA);
        this.f17965c = c5035o;
        this.f17966d = new C5021a();
        this.f17967e = new C4327p(21, this);
        this.f17963a = c5035o.f24776b;
        c5035o.m9918m(0L);
        c5035o.m9918m(0L);
        this.f17964b = c5035o.f24777c;
    }
}
