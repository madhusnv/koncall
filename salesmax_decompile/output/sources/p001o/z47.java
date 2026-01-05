package p001o;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class z47 extends xk3 {

    /* renamed from: a */
    public final s47 f56491a;

    /* renamed from: b */
    public final rl7 f56492b;

    /* renamed from: c */
    public final lj6 f56493c;

    /* renamed from: d */
    public final int f56494d;

    /* renamed from: o.z47$a */
    public static final class C18551a extends AtomicInteger implements h67, su5 {

        /* renamed from: a */
        public final ml3 f56495a;

        /* renamed from: b */
        public final rl7 f56496b;

        /* renamed from: c */
        public final lj6 f56497c;

        /* renamed from: d */
        public final ns0 f56498d = new ns0();

        /* renamed from: e */
        public final a f56499e = new a(this);

        /* renamed from: f */
        public final int f56500f;

        /* renamed from: g */
        public final qtf f56501g;

        /* renamed from: h */
        public rag f56502h;

        /* renamed from: q */
        public volatile boolean f56503q;

        /* renamed from: s */
        public volatile boolean f56504s;

        /* renamed from: x */
        public volatile boolean f56505x;

        /* renamed from: y */
        public int f56506y;

        /* renamed from: o.z47$a$a */
        public static final class a extends AtomicReference implements ml3 {

            /* renamed from: a */
            public final C18551a f56507a;

            public a(C18551a c18551a) {
                this.f56507a = c18551a;
            }

            @Override // p001o.ml3
            /* renamed from: a */
            public void mo16368a(su5 su5Var) {
                zu5.replace(this, su5Var);
            }

            /* renamed from: b */
            public void m58686b() {
                zu5.dispose(this);
            }

            @Override // p001o.ml3
            public void onComplete() {
                this.f56507a.m58684d();
            }

            @Override // p001o.ml3
            public void onError(Throwable th) {
                this.f56507a.m58685h(th);
            }
        }

        public C18551a(ml3 ml3Var, rl7 rl7Var, lj6 lj6Var, int i) {
            this.f56495a = ml3Var;
            this.f56496b = rl7Var;
            this.f56497c = lj6Var;
            this.f56500f = i;
            this.f56501g = new b1g(i);
        }

        /* renamed from: a */
        public void m58683a() {
            if (getAndIncrement() != 0) {
                return;
            }
            while (!this.f56505x) {
                if (!this.f56503q) {
                    if (this.f56497c == lj6.BOUNDARY && this.f56498d.get() != null) {
                        this.f56501g.clear();
                        this.f56498d.m41019e(this.f56495a);
                        return;
                    }
                    boolean z = this.f56504s;
                    Object objPoll = this.f56501g.poll();
                    boolean z2 = objPoll == null;
                    if (z && z2) {
                        this.f56498d.m41019e(this.f56495a);
                        return;
                    }
                    if (!z2) {
                        int i = this.f56500f;
                        int i2 = i - (i >> 1);
                        int i3 = this.f56506y + 1;
                        if (i3 == i2) {
                            this.f56506y = 0;
                            this.f56502h.request(i2);
                        } else {
                            this.f56506y = i3;
                        }
                        try {
                            Object objApply = this.f56496b.apply(objPoll);
                            Objects.requireNonNull(objApply, "The mapper returned a null CompletableSource");
                            ql3 ql3Var = (ql3) objApply;
                            this.f56503q = true;
                            ql3Var.mo45628a(this.f56499e);
                        } catch (Throwable th) {
                            zk6.m59526b(th);
                            this.f56501g.clear();
                            this.f56502h.cancel();
                            this.f56498d.m41017c(th);
                            this.f56498d.m41019e(this.f56495a);
                            return;
                        }
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.f56501g.clear();
        }

        @Override // p001o.h67, p001o.qag
        /* renamed from: b */
        public void mo18165b(rag ragVar) {
            if (wag.validate(this.f56502h, ragVar)) {
                this.f56502h = ragVar;
                this.f56495a.mo16368a(this);
                ragVar.request(this.f56500f);
            }
        }

        /* renamed from: d */
        public void m58684d() {
            this.f56503q = false;
            m58683a();
        }

        @Override // p001o.su5
        public void dispose() {
            this.f56505x = true;
            this.f56502h.cancel();
            this.f56499e.m58686b();
            this.f56498d.m41018d();
            if (getAndIncrement() == 0) {
                this.f56501g.clear();
            }
        }

        @Override // p001o.qag
        /* renamed from: e */
        public void mo18166e(Object obj) {
            if (this.f56501g.offer(obj)) {
                m58683a();
            } else {
                this.f56502h.cancel();
                onError(new ggb("Queue full?!"));
            }
        }

        /* renamed from: h */
        public void m58685h(Throwable th) {
            if (this.f56498d.m41017c(th)) {
                if (this.f56497c != lj6.IMMEDIATE) {
                    this.f56503q = false;
                    m58683a();
                    return;
                }
                this.f56502h.cancel();
                this.f56498d.m41019e(this.f56495a);
                if (getAndIncrement() == 0) {
                    this.f56501g.clear();
                }
            }
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return this.f56505x;
        }

        @Override // p001o.qag
        public void onComplete() {
            this.f56504s = true;
            m58683a();
        }

        @Override // p001o.qag
        public void onError(Throwable th) {
            if (this.f56498d.m41017c(th)) {
                if (this.f56497c != lj6.IMMEDIATE) {
                    this.f56504s = true;
                    m58683a();
                    return;
                }
                this.f56499e.m58686b();
                this.f56498d.m41019e(this.f56495a);
                if (getAndIncrement() == 0) {
                    this.f56501g.clear();
                }
            }
        }
    }

    public z47(s47 s47Var, rl7 rl7Var, lj6 lj6Var, int i) {
        this.f56491a = s47Var;
        this.f56492b = rl7Var;
        this.f56493c = lj6Var;
        this.f56494d = i;
    }

    @Override // p001o.xk3
    /* renamed from: x */
    public void mo17340x(ml3 ml3Var) {
        this.f56491a.b0(new C18551a(ml3Var, this.f56492b, this.f56493c, this.f56494d));
    }
}
