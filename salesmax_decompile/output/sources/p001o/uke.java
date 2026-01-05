package p001o;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class uke extends lag {

    /* renamed from: d */
    public static final C17388b[] f49021d = new C17388b[0];

    /* renamed from: e */
    public static final C17388b[] f49022e = new C17388b[0];

    /* renamed from: f */
    public static final Object[] f49023f = new Object[0];

    /* renamed from: a */
    public final InterfaceC17387a f49024a;

    /* renamed from: b */
    public final AtomicReference f49025b = new AtomicReference(f49021d);

    /* renamed from: c */
    public boolean f49026c;

    /* renamed from: o.uke$a */
    public interface InterfaceC17387a {
        /* renamed from: a */
        void mo51681a(Object obj);

        void add(Object obj);

        /* renamed from: b */
        void mo51682b(C17388b c17388b);

        boolean compareAndSet(Object obj, Object obj2);
    }

    /* renamed from: o.uke$b */
    public static final class C17388b extends AtomicInteger implements su5 {

        /* renamed from: a */
        public final m9c f49027a;

        /* renamed from: b */
        public final uke f49028b;

        /* renamed from: c */
        public Object f49029c;

        /* renamed from: d */
        public volatile boolean f49030d;

        public C17388b(m9c m9cVar, uke ukeVar) {
            this.f49027a = m9cVar;
            this.f49028b = ukeVar;
        }

        @Override // p001o.su5
        public void dispose() {
            if (this.f49030d) {
                return;
            }
            this.f49030d = true;
            this.f49028b.O0(this);
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return this.f49030d;
        }
    }

    /* renamed from: o.uke$c */
    public static final class C17389c extends AtomicReference implements InterfaceC17387a {

        /* renamed from: a */
        public final List f49031a;

        /* renamed from: b */
        public volatile boolean f49032b;

        /* renamed from: c */
        public volatile int f49033c;

        public C17389c(int i) {
            this.f49031a = new ArrayList(i);
        }

        @Override // p001o.uke.InterfaceC17387a
        /* renamed from: a */
        public void mo51681a(Object obj) {
            this.f49031a.add(obj);
            m51683c();
            this.f49033c++;
            this.f49032b = true;
        }

        @Override // p001o.uke.InterfaceC17387a
        public void add(Object obj) {
            this.f49031a.add(obj);
            this.f49033c++;
        }

        @Override // p001o.uke.InterfaceC17387a
        /* renamed from: b */
        public void mo51682b(C17388b c17388b) {
            int iIntValue;
            int i;
            if (c17388b.getAndIncrement() != 0) {
                return;
            }
            List list = this.f49031a;
            m9c m9cVar = c17388b.f49027a;
            Integer num = (Integer) c17388b.f49029c;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
                c17388b.f49029c = 0;
            }
            int iAddAndGet = 1;
            while (!c17388b.f49030d) {
                int i2 = this.f49033c;
                while (i2 != iIntValue) {
                    if (c17388b.f49030d) {
                        c17388b.f49029c = null;
                        return;
                    }
                    Object obj = list.get(iIntValue);
                    if (this.f49032b && (i = iIntValue + 1) == i2 && i == (i2 = this.f49033c)) {
                        if (d3c.isComplete(obj)) {
                            m9cVar.onComplete();
                        } else {
                            m9cVar.onError(d3c.getError(obj));
                        }
                        c17388b.f49029c = null;
                        c17388b.f49030d = true;
                        return;
                    }
                    m9cVar.mo16560e(obj);
                    iIntValue++;
                }
                if (iIntValue == this.f49033c) {
                    c17388b.f49029c = Integer.valueOf(iIntValue);
                    iAddAndGet = c17388b.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            c17388b.f49029c = null;
        }

        /* renamed from: c */
        public void m51683c() {
        }
    }

    public uke(InterfaceC17387a interfaceC17387a) {
        this.f49024a = interfaceC17387a;
    }

    public static uke N0() {
        return new uke(new C17389c(16));
    }

    public boolean M0(C17388b c17388b) {
        C17388b[] c17388bArr;
        C17388b[] c17388bArr2;
        do {
            c17388bArr = (C17388b[]) this.f49025b.get();
            if (c17388bArr == f49022e) {
                return false;
            }
            int length = c17388bArr.length;
            c17388bArr2 = new C17388b[length + 1];
            System.arraycopy(c17388bArr, 0, c17388bArr2, 0, length);
            c17388bArr2[length] = c17388b;
        } while (!ec3.m24748a(this.f49025b, c17388bArr, c17388bArr2));
        return true;
    }

    public void O0(C17388b c17388b) {
        C17388b[] c17388bArr;
        C17388b[] c17388bArr2;
        do {
            c17388bArr = (C17388b[]) this.f49025b.get();
            if (c17388bArr == f49022e || c17388bArr == f49021d) {
                return;
            }
            int length = c17388bArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (c17388bArr[i] == c17388b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                c17388bArr2 = f49021d;
            } else {
                C17388b[] c17388bArr3 = new C17388b[length - 1];
                System.arraycopy(c17388bArr, 0, c17388bArr3, 0, i);
                System.arraycopy(c17388bArr, i + 1, c17388bArr3, i, (length - i) - 1);
                c17388bArr2 = c17388bArr3;
            }
        } while (!ec3.m24748a(this.f49025b, c17388bArr, c17388bArr2));
    }

    public C17388b[] P0(Object obj) {
        this.f49024a.compareAndSet(null, obj);
        return (C17388b[]) this.f49025b.getAndSet(f49022e);
    }

    @Override // p001o.m9c
    /* renamed from: a */
    public void mo16559a(su5 su5Var) {
        if (this.f49026c) {
            su5Var.dispose();
        }
    }

    @Override // p001o.m9c
    /* renamed from: e */
    public void mo16560e(Object obj) {
        xk6.m56415c(obj, "onNext called with a null value.");
        if (this.f49026c) {
            return;
        }
        InterfaceC17387a interfaceC17387a = this.f49024a;
        interfaceC17387a.add(obj);
        for (C17388b c17388b : (C17388b[]) this.f49025b.get()) {
            interfaceC17387a.mo51682b(c17388b);
        }
    }

    @Override // p001o.m9c
    public void onComplete() {
        if (this.f49026c) {
            return;
        }
        this.f49026c = true;
        Object objComplete = d3c.complete();
        InterfaceC17387a interfaceC17387a = this.f49024a;
        interfaceC17387a.mo51681a(objComplete);
        for (C17388b c17388b : P0(objComplete)) {
            interfaceC17387a.mo51682b(c17388b);
        }
    }

    @Override // p001o.m9c
    public void onError(Throwable th) {
        xk6.m56415c(th, "onError called with a null Throwable.");
        if (this.f49026c) {
            fwe.m27599r(th);
            return;
        }
        this.f49026c = true;
        Object objError = d3c.error(th);
        InterfaceC17387a interfaceC17387a = this.f49024a;
        interfaceC17387a.mo51681a(objError);
        for (C17388b c17388b : P0(objError)) {
            interfaceC17387a.mo51682b(c17388b);
        }
    }

    @Override // p001o.x6c
    public void x0(m9c m9cVar) {
        C17388b c17388b = new C17388b(m9cVar, this);
        m9cVar.mo16559a(c17388b);
        if (M0(c17388b) && c17388b.f49030d) {
            O0(c17388b);
        } else {
            this.f49024a.mo51682b(c17388b);
        }
    }
}
