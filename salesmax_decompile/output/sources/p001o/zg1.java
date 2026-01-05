package p001o;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p001o.ln0;

/* loaded from: classes6.dex */
public final class zg1 extends z57 {

    /* renamed from: q */
    public static final Object[] f57141q = new Object[0];

    /* renamed from: s */
    public static final C18631a[] f57142s = new C18631a[0];

    /* renamed from: x */
    public static final C18631a[] f57143x = new C18631a[0];

    /* renamed from: b */
    public final AtomicReference f57144b;

    /* renamed from: c */
    public final ReadWriteLock f57145c;

    /* renamed from: d */
    public final Lock f57146d;

    /* renamed from: e */
    public final Lock f57147e;

    /* renamed from: f */
    public final AtomicReference f57148f;

    /* renamed from: g */
    public final AtomicReference f57149g;

    /* renamed from: h */
    public long f57150h;

    /* renamed from: o.zg1$a */
    public static final class C18631a extends AtomicLong implements rag, ln0.InterfaceC15107a {

        /* renamed from: a */
        public final qag f57151a;

        /* renamed from: b */
        public final zg1 f57152b;

        /* renamed from: c */
        public boolean f57153c;

        /* renamed from: d */
        public boolean f57154d;

        /* renamed from: e */
        public ln0 f57155e;

        /* renamed from: f */
        public boolean f57156f;

        /* renamed from: g */
        public volatile boolean f57157g;

        /* renamed from: h */
        public long f57158h;

        public C18631a(qag qagVar, zg1 zg1Var) {
            this.f57151a = qagVar;
            this.f57152b = zg1Var;
        }

        /* renamed from: a */
        public void m59383a() {
            if (this.f57157g) {
                return;
            }
            synchronized (this) {
                if (this.f57157g) {
                    return;
                }
                if (this.f57153c) {
                    return;
                }
                zg1 zg1Var = this.f57152b;
                Lock lock = zg1Var.f57146d;
                lock.lock();
                this.f57158h = zg1Var.f57150h;
                Object obj = zg1Var.f57148f.get();
                lock.unlock();
                this.f57154d = obj != null;
                this.f57153c = true;
                if (obj == null || test(obj)) {
                    return;
                }
                m59384b();
            }
        }

        /* renamed from: b */
        public void m59384b() {
            ln0 ln0Var;
            while (!this.f57157g) {
                synchronized (this) {
                    ln0Var = this.f57155e;
                    if (ln0Var == null) {
                        this.f57154d = false;
                        return;
                    }
                    this.f57155e = null;
                }
                ln0Var.m37508c(this);
            }
        }

        /* renamed from: c */
        public void m59385c(Object obj, long j) {
            if (this.f57157g) {
                return;
            }
            if (!this.f57156f) {
                synchronized (this) {
                    if (this.f57157g) {
                        return;
                    }
                    if (this.f57158h == j) {
                        return;
                    }
                    if (this.f57154d) {
                        ln0 ln0Var = this.f57155e;
                        if (ln0Var == null) {
                            ln0Var = new ln0(4);
                            this.f57155e = ln0Var;
                        }
                        ln0Var.m37507b(obj);
                        return;
                    }
                    this.f57153c = true;
                    this.f57156f = true;
                }
            }
            test(obj);
        }

        @Override // p001o.rag
        public void cancel() {
            if (this.f57157g) {
                return;
            }
            this.f57157g = true;
            this.f57152b.k0(this);
        }

        @Override // p001o.rag
        public void request(long j) {
            if (wag.validate(j)) {
                ka1.m35216a(this, j);
            }
        }

        @Override // p001o.ln0.InterfaceC15107a, p001o.ggd
        public boolean test(Object obj) {
            if (this.f57157g) {
                return true;
            }
            if (d3c.isComplete(obj)) {
                this.f57151a.onComplete();
                return true;
            }
            if (d3c.isError(obj)) {
                this.f57151a.onError(d3c.getError(obj));
                return true;
            }
            long j = get();
            if (j == 0) {
                cancel();
                this.f57151a.onError(new ggb("Could not deliver value due to lack of requests"));
                return true;
            }
            this.f57151a.mo18166e(d3c.getValue(obj));
            if (j == Long.MAX_VALUE) {
                return false;
            }
            decrementAndGet();
            return false;
        }
    }

    public zg1() {
        this.f57148f = new AtomicReference();
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f57145c = reentrantReadWriteLock;
        this.f57146d = reentrantReadWriteLock.readLock();
        this.f57147e = reentrantReadWriteLock.writeLock();
        this.f57144b = new AtomicReference(f57142s);
        this.f57149g = new AtomicReference();
    }

    public static zg1 j0(Object obj) {
        Objects.requireNonNull(obj, "defaultValue is null");
        return new zg1(obj);
    }

    @Override // p001o.qag
    /* renamed from: b */
    public void mo18165b(rag ragVar) {
        if (this.f57149g.get() != null) {
            ragVar.cancel();
        } else {
            ragVar.request(Long.MAX_VALUE);
        }
    }

    @Override // p001o.s47
    public void c0(qag qagVar) {
        C18631a c18631a = new C18631a(qagVar, this);
        qagVar.mo18165b(c18631a);
        if (i0(c18631a)) {
            if (c18631a.f57157g) {
                k0(c18631a);
                return;
            } else {
                c18631a.m59383a();
                return;
            }
        }
        Throwable th = (Throwable) this.f57149g.get();
        if (th == xk6.f53863a) {
            qagVar.onComplete();
        } else {
            qagVar.onError(th);
        }
    }

    @Override // p001o.qag
    /* renamed from: e */
    public void mo18166e(Object obj) {
        xk6.m56415c(obj, "onNext called with a null value.");
        if (this.f57149g.get() != null) {
            return;
        }
        Object next = d3c.next(obj);
        l0(next);
        for (C18631a c18631a : (C18631a[]) this.f57144b.get()) {
            c18631a.m59385c(next, this.f57150h);
        }
    }

    public boolean i0(C18631a c18631a) {
        C18631a[] c18631aArr;
        C18631a[] c18631aArr2;
        do {
            c18631aArr = (C18631a[]) this.f57144b.get();
            if (c18631aArr == f57143x) {
                return false;
            }
            int length = c18631aArr.length;
            c18631aArr2 = new C18631a[length + 1];
            System.arraycopy(c18631aArr, 0, c18631aArr2, 0, length);
            c18631aArr2[length] = c18631a;
        } while (!ec3.m24748a(this.f57144b, c18631aArr, c18631aArr2));
        return true;
    }

    public void k0(C18631a c18631a) {
        C18631a[] c18631aArr;
        C18631a[] c18631aArr2;
        do {
            c18631aArr = (C18631a[]) this.f57144b.get();
            int length = c18631aArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c18631aArr[i] == c18631a) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c18631aArr2 = f57142s;
            } else {
                C18631a[] c18631aArr3 = new C18631a[length - 1];
                System.arraycopy(c18631aArr, 0, c18631aArr3, 0, i);
                System.arraycopy(c18631aArr, i + 1, c18631aArr3, i, (length - i) - 1);
                c18631aArr2 = c18631aArr3;
            }
        } while (!ec3.m24748a(this.f57144b, c18631aArr, c18631aArr2));
    }

    public void l0(Object obj) {
        Lock lock = this.f57147e;
        lock.lock();
        this.f57150h++;
        this.f57148f.lazySet(obj);
        lock.unlock();
    }

    public C18631a[] m0(Object obj) {
        l0(obj);
        return (C18631a[]) this.f57144b.getAndSet(f57143x);
    }

    @Override // p001o.qag
    public void onComplete() {
        if (ec3.m24748a(this.f57149g, null, xk6.f53863a)) {
            Object objComplete = d3c.complete();
            for (C18631a c18631a : m0(objComplete)) {
                c18631a.m59385c(objComplete, this.f57150h);
            }
        }
    }

    @Override // p001o.qag
    public void onError(Throwable th) {
        xk6.m56415c(th, "onError called with a null Throwable.");
        if (!ec3.m24748a(this.f57149g, null, th)) {
            fwe.m27599r(th);
            return;
        }
        Object objError = d3c.error(th);
        for (C18631a c18631a : m0(objError)) {
            c18631a.m59385c(objError, this.f57150h);
        }
    }

    public zg1(Object obj) {
        this();
        this.f57148f.lazySet(obj);
    }
}
