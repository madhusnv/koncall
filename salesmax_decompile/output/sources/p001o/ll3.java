package p001o;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class ll3 extends xk3 {

    /* renamed from: a */
    public final g3e f33995a;

    /* renamed from: b */
    public final int f33996b;

    /* renamed from: c */
    public final boolean f33997c;

    /* renamed from: o.ll3$a */
    public static final class C15100a extends AtomicInteger implements h67, su5 {

        /* renamed from: a */
        public final ml3 f33998a;

        /* renamed from: b */
        public final int f33999b;

        /* renamed from: c */
        public final boolean f34000c;

        /* renamed from: f */
        public rag f34003f;

        /* renamed from: e */
        public final ko3 f34002e = new ko3();

        /* renamed from: d */
        public final ns0 f34001d = new ns0();

        /* renamed from: o.ll3$a$a */
        public final class a extends AtomicReference implements ml3, su5 {
            public a() {
            }

            @Override // p001o.ml3
            /* renamed from: a */
            public void mo16368a(su5 su5Var) {
                zu5.setOnce(this, su5Var);
            }

            @Override // p001o.su5
            public void dispose() {
                zu5.dispose(this);
            }

            @Override // p001o.su5
            public boolean isDisposed() {
                return zu5.isDisposed((su5) get());
            }

            @Override // p001o.ml3
            public void onComplete() {
                C15100a.this.m37421a(this);
            }

            @Override // p001o.ml3
            public void onError(Throwable th) {
                C15100a.this.m37422d(this, th);
            }
        }

        public C15100a(ml3 ml3Var, int i, boolean z) {
            this.f33998a = ml3Var;
            this.f33999b = i;
            this.f34000c = z;
            lazySet(1);
        }

        /* renamed from: a */
        public void m37421a(a aVar) {
            this.f34002e.mo30305b(aVar);
            if (decrementAndGet() == 0) {
                this.f34001d.m41019e(this.f33998a);
            } else if (this.f33999b != Integer.MAX_VALUE) {
                this.f34003f.request(1L);
            }
        }

        @Override // p001o.h67, p001o.qag
        /* renamed from: b */
        public void mo18165b(rag ragVar) {
            if (wag.validate(this.f34003f, ragVar)) {
                this.f34003f = ragVar;
                this.f33998a.mo16368a(this);
                int i = this.f33999b;
                if (i == Integer.MAX_VALUE) {
                    ragVar.request(Long.MAX_VALUE);
                } else {
                    ragVar.request(i);
                }
            }
        }

        /* renamed from: d */
        public void m37422d(a aVar, Throwable th) {
            this.f34002e.mo30305b(aVar);
            if (!this.f34000c) {
                this.f34003f.cancel();
                this.f34002e.dispose();
                if (!this.f34001d.m41017c(th) || getAndSet(0) <= 0) {
                    return;
                }
                this.f34001d.m41019e(this.f33998a);
                return;
            }
            if (this.f34001d.m41017c(th)) {
                if (decrementAndGet() == 0) {
                    this.f34001d.m41019e(this.f33998a);
                } else if (this.f33999b != Integer.MAX_VALUE) {
                    this.f34003f.request(1L);
                }
            }
        }

        @Override // p001o.su5
        public void dispose() {
            this.f34003f.cancel();
            this.f34002e.dispose();
            this.f34001d.m41018d();
        }

        @Override // p001o.qag
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo18166e(ql3 ql3Var) {
            getAndIncrement();
            a aVar = new a();
            this.f34002e.mo30304a(aVar);
            ql3Var.mo45628a(aVar);
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return this.f34002e.isDisposed();
        }

        @Override // p001o.qag
        public void onComplete() {
            if (decrementAndGet() == 0) {
                this.f34001d.m41019e(this.f33998a);
            }
        }

        @Override // p001o.qag
        public void onError(Throwable th) {
            if (this.f34000c) {
                if (this.f34001d.m41017c(th) && decrementAndGet() == 0) {
                    this.f34001d.m41019e(this.f33998a);
                    return;
                }
                return;
            }
            this.f34002e.dispose();
            if (!this.f34001d.m41017c(th) || getAndSet(0) <= 0) {
                return;
            }
            this.f34001d.m41019e(this.f33998a);
        }
    }

    public ll3(g3e g3eVar, int i, boolean z) {
        this.f33995a = g3eVar;
        this.f33996b = i;
        this.f33997c = z;
    }

    @Override // p001o.xk3
    /* renamed from: x */
    public void mo17340x(ml3 ml3Var) {
        this.f33995a.mo28025a(new C15100a(ml3Var, this.f33996b, this.f33997c));
    }
}
