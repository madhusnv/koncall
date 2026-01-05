package p001o;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p001o.ln0;

/* loaded from: classes6.dex */
public final class ah1 extends lag {

    /* renamed from: h */
    public static final C12168a[] f14687h = new C12168a[0];

    /* renamed from: q */
    public static final C12168a[] f14688q = new C12168a[0];

    /* renamed from: a */
    public final AtomicReference f14689a;

    /* renamed from: b */
    public final AtomicReference f14690b;

    /* renamed from: c */
    public final ReadWriteLock f14691c;

    /* renamed from: d */
    public final Lock f14692d;

    /* renamed from: e */
    public final Lock f14693e;

    /* renamed from: f */
    public final AtomicReference f14694f;

    /* renamed from: g */
    public long f14695g;

    /* renamed from: o.ah1$a */
    public static final class C12168a implements su5, ln0.InterfaceC15107a {

        /* renamed from: a */
        public final m9c f14696a;

        /* renamed from: b */
        public final ah1 f14697b;

        /* renamed from: c */
        public boolean f14698c;

        /* renamed from: d */
        public boolean f14699d;

        /* renamed from: e */
        public ln0 f14700e;

        /* renamed from: f */
        public boolean f14701f;

        /* renamed from: g */
        public volatile boolean f14702g;

        /* renamed from: h */
        public long f14703h;

        public C12168a(m9c m9cVar, ah1 ah1Var) {
            this.f14696a = m9cVar;
            this.f14697b = ah1Var;
        }

        /* renamed from: a */
        public void m17038a() {
            if (this.f14702g) {
                return;
            }
            synchronized (this) {
                if (this.f14702g) {
                    return;
                }
                if (this.f14698c) {
                    return;
                }
                ah1 ah1Var = this.f14697b;
                Lock lock = ah1Var.f14692d;
                lock.lock();
                this.f14703h = ah1Var.f14695g;
                Object obj = ah1Var.f14689a.get();
                lock.unlock();
                this.f14699d = obj != null;
                this.f14698c = true;
                if (obj == null || test(obj)) {
                    return;
                }
                m17039b();
            }
        }

        /* renamed from: b */
        public void m17039b() {
            ln0 ln0Var;
            while (!this.f14702g) {
                synchronized (this) {
                    ln0Var = this.f14700e;
                    if (ln0Var == null) {
                        this.f14699d = false;
                        return;
                    }
                    this.f14700e = null;
                }
                ln0Var.m37508c(this);
            }
        }

        /* renamed from: d */
        public void m17040d(Object obj, long j) {
            if (this.f14702g) {
                return;
            }
            if (!this.f14701f) {
                synchronized (this) {
                    if (this.f14702g) {
                        return;
                    }
                    if (this.f14703h == j) {
                        return;
                    }
                    if (this.f14699d) {
                        ln0 ln0Var = this.f14700e;
                        if (ln0Var == null) {
                            ln0Var = new ln0(4);
                            this.f14700e = ln0Var;
                        }
                        ln0Var.m37507b(obj);
                        return;
                    }
                    this.f14698c = true;
                    this.f14701f = true;
                }
            }
            test(obj);
        }

        @Override // p001o.su5
        public void dispose() {
            if (this.f14702g) {
                return;
            }
            this.f14702g = true;
            this.f14697b.O0(this);
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return this.f14702g;
        }

        @Override // p001o.ln0.InterfaceC15107a, p001o.ggd
        public boolean test(Object obj) {
            return this.f14702g || d3c.accept(obj, this.f14696a);
        }
    }

    public ah1(Object obj) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f14691c = reentrantReadWriteLock;
        this.f14692d = reentrantReadWriteLock.readLock();
        this.f14693e = reentrantReadWriteLock.writeLock();
        this.f14690b = new AtomicReference(f14687h);
        this.f14689a = new AtomicReference(obj);
        this.f14694f = new AtomicReference();
    }

    public static ah1 N0() {
        return new ah1(null);
    }

    public boolean M0(C12168a c12168a) {
        C12168a[] c12168aArr;
        C12168a[] c12168aArr2;
        do {
            c12168aArr = (C12168a[]) this.f14690b.get();
            if (c12168aArr == f14688q) {
                return false;
            }
            int length = c12168aArr.length;
            c12168aArr2 = new C12168a[length + 1];
            System.arraycopy(c12168aArr, 0, c12168aArr2, 0, length);
            c12168aArr2[length] = c12168a;
        } while (!ec3.m24748a(this.f14690b, c12168aArr, c12168aArr2));
        return true;
    }

    public void O0(C12168a c12168a) {
        C12168a[] c12168aArr;
        C12168a[] c12168aArr2;
        do {
            c12168aArr = (C12168a[]) this.f14690b.get();
            int length = c12168aArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c12168aArr[i] == c12168a) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c12168aArr2 = f14687h;
            } else {
                C12168a[] c12168aArr3 = new C12168a[length - 1];
                System.arraycopy(c12168aArr, 0, c12168aArr3, 0, i);
                System.arraycopy(c12168aArr, i + 1, c12168aArr3, i, (length - i) - 1);
                c12168aArr2 = c12168aArr3;
            }
        } while (!ec3.m24748a(this.f14690b, c12168aArr, c12168aArr2));
    }

    public void P0(Object obj) {
        this.f14693e.lock();
        this.f14695g++;
        this.f14689a.lazySet(obj);
        this.f14693e.unlock();
    }

    public C12168a[] Q0(Object obj) {
        P0(obj);
        return (C12168a[]) this.f14690b.getAndSet(f14688q);
    }

    @Override // p001o.m9c
    /* renamed from: a */
    public void mo16559a(su5 su5Var) {
        if (this.f14694f.get() != null) {
            su5Var.dispose();
        }
    }

    @Override // p001o.m9c
    /* renamed from: e */
    public void mo16560e(Object obj) {
        xk6.m56415c(obj, "onNext called with a null value.");
        if (this.f14694f.get() != null) {
            return;
        }
        Object next = d3c.next(obj);
        P0(next);
        for (C12168a c12168a : (C12168a[]) this.f14690b.get()) {
            c12168a.m17040d(next, this.f14695g);
        }
    }

    @Override // p001o.m9c
    public void onComplete() {
        if (ec3.m24748a(this.f14694f, null, xk6.f53863a)) {
            Object objComplete = d3c.complete();
            for (C12168a c12168a : Q0(objComplete)) {
                c12168a.m17040d(objComplete, this.f14695g);
            }
        }
    }

    @Override // p001o.m9c
    public void onError(Throwable th) {
        xk6.m56415c(th, "onError called with a null Throwable.");
        if (!ec3.m24748a(this.f14694f, null, th)) {
            fwe.m27599r(th);
            return;
        }
        Object objError = d3c.error(th);
        for (C12168a c12168a : Q0(objError)) {
            c12168a.m17040d(objError, this.f14695g);
        }
    }

    @Override // p001o.x6c
    public void x0(m9c m9cVar) {
        C12168a c12168a = new C12168a(m9cVar, this);
        m9cVar.mo16559a(c12168a);
        if (M0(c12168a)) {
            if (c12168a.f14702g) {
                O0(c12168a);
                return;
            } else {
                c12168a.m17038a();
                return;
            }
        }
        Throwable th = (Throwable) this.f14694f.get();
        if (th == xk6.f53863a) {
            m9cVar.onComplete();
        } else {
            m9cVar.onError(th);
        }
    }
}
