package p001o;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes6.dex */
public final class b5f extends AtomicReferenceArray implements Runnable, Callable, su5 {

    /* renamed from: b */
    public static final Object f15564b = new Object();

    /* renamed from: c */
    public static final Object f15565c = new Object();

    /* renamed from: d */
    public static final Object f15566d = new Object();

    /* renamed from: e */
    public static final Object f15567e = new Object();

    /* renamed from: a */
    public final Runnable f15568a;

    public b5f(Runnable runnable, tu5 tu5Var) {
        super(3);
        this.f15568a = runnable;
        lazySet(0, tu5Var);
    }

    /* renamed from: a */
    public void m18173a(Future future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == f15567e) {
                return;
            }
            if (obj == f15565c) {
                future.cancel(false);
                return;
            } else if (obj == f15566d) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        run();
        return null;
    }

    @Override // p001o.su5
    public void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        while (true) {
            Object obj5 = get(1);
            if (obj5 == f15567e || obj5 == (obj3 = f15565c) || obj5 == (obj4 = f15566d)) {
                break;
            }
            boolean z = get(2) != Thread.currentThread();
            if (z) {
                obj3 = obj4;
            }
            if (compareAndSet(1, obj5, obj3)) {
                if (obj5 != null) {
                    ((Future) obj5).cancel(z);
                }
            }
        }
        do {
            obj = get(0);
            if (obj == f15567e || obj == (obj2 = f15564b) || obj == null) {
                return;
            }
        } while (!compareAndSet(0, obj, obj2));
        ((tu5) obj).mo30305b(this);
    }

    @Override // p001o.su5
    public boolean isDisposed() {
        Object obj = get(0);
        return obj == f15564b || obj == f15567e;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        Object obj2;
        lazySet(2, Thread.currentThread());
        try {
            this.f15568a.run();
            lazySet(2, null);
            Object obj3 = get(0);
            if (obj3 != f15564b && compareAndSet(0, obj3, f15567e) && obj3 != null) {
                ((tu5) obj3).mo30305b(this);
            }
            do {
                obj2 = get(1);
                if (obj2 == f15565c || obj2 == f15566d) {
                    return;
                }
            } while (!compareAndSet(1, obj2, f15567e));
        } catch (Throwable th) {
            try {
                fwe.m27599r(th);
                throw th;
            } catch (Throwable th2) {
                lazySet(2, null);
                Object obj4 = get(0);
                if (obj4 != f15564b && compareAndSet(0, obj4, f15567e) && obj4 != null) {
                    ((tu5) obj4).mo30305b(this);
                }
                do {
                    obj = get(1);
                    if (obj == f15565c || obj == f15566d) {
                        break;
                    }
                } while (!compareAndSet(1, obj, f15567e));
                throw th2;
            }
        }
    }
}
