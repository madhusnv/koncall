package p001o;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class f3e extends lag {

    /* renamed from: c */
    public static final C13320a[] f22630c = new C13320a[0];

    /* renamed from: d */
    public static final C13320a[] f22631d = new C13320a[0];

    /* renamed from: a */
    public final AtomicReference f22632a = new AtomicReference(f22631d);

    /* renamed from: b */
    public Throwable f22633b;

    /* renamed from: o.f3e$a */
    public static final class C13320a extends AtomicBoolean implements su5 {

        /* renamed from: a */
        public final m9c f22634a;

        /* renamed from: b */
        public final f3e f22635b;

        public C13320a(m9c m9cVar, f3e f3eVar) {
            this.f22634a = m9cVar;
            this.f22635b = f3eVar;
        }

        /* renamed from: a */
        public void m26042a() {
            if (get()) {
                return;
            }
            this.f22634a.onComplete();
        }

        /* renamed from: b */
        public void m26043b(Throwable th) {
            if (get()) {
                fwe.m27599r(th);
            } else {
                this.f22634a.onError(th);
            }
        }

        /* renamed from: d */
        public void m26044d(Object obj) {
            if (get()) {
                return;
            }
            this.f22634a.mo16560e(obj);
        }

        @Override // p001o.su5
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f22635b.O0(this);
            }
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return get();
        }
    }

    public static f3e N0() {
        return new f3e();
    }

    public boolean M0(C13320a c13320a) {
        C13320a[] c13320aArr;
        C13320a[] c13320aArr2;
        do {
            c13320aArr = (C13320a[]) this.f22632a.get();
            if (c13320aArr == f22630c) {
                return false;
            }
            int length = c13320aArr.length;
            c13320aArr2 = new C13320a[length + 1];
            System.arraycopy(c13320aArr, 0, c13320aArr2, 0, length);
            c13320aArr2[length] = c13320a;
        } while (!ec3.m24748a(this.f22632a, c13320aArr, c13320aArr2));
        return true;
    }

    public void O0(C13320a c13320a) {
        C13320a[] c13320aArr;
        C13320a[] c13320aArr2;
        do {
            c13320aArr = (C13320a[]) this.f22632a.get();
            if (c13320aArr == f22630c || c13320aArr == f22631d) {
                return;
            }
            int length = c13320aArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c13320aArr[i] == c13320a) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c13320aArr2 = f22631d;
            } else {
                C13320a[] c13320aArr3 = new C13320a[length - 1];
                System.arraycopy(c13320aArr, 0, c13320aArr3, 0, i);
                System.arraycopy(c13320aArr, i + 1, c13320aArr3, i, (length - i) - 1);
                c13320aArr2 = c13320aArr3;
            }
        } while (!ec3.m24748a(this.f22632a, c13320aArr, c13320aArr2));
    }

    @Override // p001o.m9c
    /* renamed from: a */
    public void mo16559a(su5 su5Var) {
        if (this.f22632a.get() == f22630c) {
            su5Var.dispose();
        }
    }

    @Override // p001o.m9c
    /* renamed from: e */
    public void mo16560e(Object obj) {
        xk6.m56415c(obj, "onNext called with a null value.");
        for (C13320a c13320a : (C13320a[]) this.f22632a.get()) {
            c13320a.m26044d(obj);
        }
    }

    @Override // p001o.m9c
    public void onComplete() {
        Object obj = this.f22632a.get();
        Object obj2 = f22630c;
        if (obj == obj2) {
            return;
        }
        for (C13320a c13320a : (C13320a[]) this.f22632a.getAndSet(obj2)) {
            c13320a.m26042a();
        }
    }

    @Override // p001o.m9c
    public void onError(Throwable th) {
        xk6.m56415c(th, "onError called with a null Throwable.");
        Object obj = this.f22632a.get();
        Object obj2 = f22630c;
        if (obj == obj2) {
            fwe.m27599r(th);
            return;
        }
        this.f22633b = th;
        for (C13320a c13320a : (C13320a[]) this.f22632a.getAndSet(obj2)) {
            c13320a.m26043b(th);
        }
    }

    @Override // p001o.x6c
    public void x0(m9c m9cVar) {
        C13320a c13320a = new C13320a(m9cVar, this);
        m9cVar.mo16559a(c13320a);
        if (M0(c13320a)) {
            if (c13320a.isDisposed()) {
                O0(c13320a);
            }
        } else {
            Throwable th = this.f22633b;
            if (th != null) {
                m9cVar.onError(th);
            } else {
                m9cVar.onComplete();
            }
        }
    }
}
