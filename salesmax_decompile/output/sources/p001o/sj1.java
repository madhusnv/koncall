package p001o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes6.dex */
public final class sj1 implements Iterable {

    /* renamed from: a */
    public final s47 f45461a;

    /* renamed from: b */
    public final int f45462b;

    /* renamed from: o.sj1$a */
    public static final class RunnableC16849a extends AtomicReference implements h67, Iterator, Runnable, su5 {

        /* renamed from: a */
        public final b1g f45463a;

        /* renamed from: b */
        public final long f45464b;

        /* renamed from: c */
        public final long f45465c;

        /* renamed from: d */
        public final Lock f45466d;

        /* renamed from: e */
        public final Condition f45467e;

        /* renamed from: f */
        public long f45468f;

        /* renamed from: g */
        public volatile boolean f45469g;

        /* renamed from: h */
        public volatile Throwable f45470h;

        public RunnableC16849a(int i) {
            this.f45463a = new b1g(i);
            this.f45464b = i;
            this.f45465c = i - (i >> 2);
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f45466d = reentrantLock;
            this.f45467e = reentrantLock.newCondition();
        }

        /* renamed from: a */
        public void m48368a() {
            this.f45466d.lock();
            try {
                this.f45467e.signalAll();
            } finally {
                this.f45466d.unlock();
            }
        }

        @Override // p001o.h67, p001o.qag
        /* renamed from: b */
        public void mo18165b(rag ragVar) {
            wag.setOnce(this, ragVar, this.f45464b);
        }

        @Override // p001o.su5
        public void dispose() {
            wag.cancel(this);
            m48368a();
        }

        @Override // p001o.qag
        /* renamed from: e */
        public void mo18166e(Object obj) {
            if (this.f45463a.offer(obj)) {
                m48368a();
            } else {
                wag.cancel(this);
                onError(new ggb("Queue full?!"));
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (!isDisposed()) {
                boolean z = this.f45469g;
                boolean zIsEmpty = this.f45463a.isEmpty();
                if (z) {
                    Throwable th = this.f45470h;
                    if (th != null) {
                        throw xk6.m56420h(th);
                    }
                    if (zIsEmpty) {
                        return false;
                    }
                }
                if (!zIsEmpty) {
                    return true;
                }
                tj1.m49950a();
                this.f45466d.lock();
                while (!this.f45469g && this.f45463a.isEmpty() && !isDisposed()) {
                    try {
                        try {
                            this.f45467e.await();
                        } catch (InterruptedException e) {
                            run();
                            throw xk6.m56420h(e);
                        }
                    } finally {
                        this.f45466d.unlock();
                    }
                }
            }
            Throwable th2 = this.f45470h;
            if (th2 == null) {
                return false;
            }
            throw xk6.m56420h(th2);
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return get() == wag.CANCELLED;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Object objPoll = this.f45463a.poll();
            long j = this.f45468f + 1;
            if (j == this.f45465c) {
                this.f45468f = 0L;
                ((rag) get()).request(j);
            } else {
                this.f45468f = j;
            }
            return objPoll;
        }

        @Override // p001o.qag
        public void onComplete() {
            this.f45469g = true;
            m48368a();
        }

        @Override // p001o.qag
        public void onError(Throwable th) {
            this.f45470h = th;
            this.f45469g = true;
            m48368a();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("remove");
        }

        @Override // java.lang.Runnable
        public void run() {
            wag.cancel(this);
            m48368a();
        }
    }

    public sj1(s47 s47Var, int i) {
        this.f45461a = s47Var;
        this.f45462b = i;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        RunnableC16849a runnableC16849a = new RunnableC16849a(this.f45462b);
        this.f45461a.b0(runnableC16849a);
        return runnableC16849a;
    }
}
