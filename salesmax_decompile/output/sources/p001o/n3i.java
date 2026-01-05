package p001o;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class n3i extends lag {

    /* renamed from: a */
    public final c1g f36320a;

    /* renamed from: c */
    public final AtomicReference f36322c;

    /* renamed from: d */
    public final boolean f36323d;

    /* renamed from: e */
    public volatile boolean f36324e;

    /* renamed from: f */
    public volatile boolean f36325f;

    /* renamed from: g */
    public Throwable f36326g;

    /* renamed from: s */
    public boolean f36329s;

    /* renamed from: b */
    public final AtomicReference f36321b = new AtomicReference();

    /* renamed from: h */
    public final AtomicBoolean f36327h = new AtomicBoolean();

    /* renamed from: q */
    public final nf1 f36328q = new C15483a();

    /* renamed from: o.n3i$a */
    public final class C15483a extends nf1 {
        public C15483a() {
        }

        @Override // p001o.rtf
        public void clear() {
            n3i.this.f36320a.clear();
        }

        @Override // p001o.su5
        public void dispose() {
            if (n3i.this.f36324e) {
                return;
            }
            n3i.this.f36324e = true;
            n3i.this.N0();
            n3i.this.f36321b.lazySet(null);
            if (n3i.this.f36328q.getAndIncrement() == 0) {
                n3i.this.f36321b.lazySet(null);
                n3i n3iVar = n3i.this;
                if (n3iVar.f36329s) {
                    return;
                }
                n3iVar.f36320a.clear();
            }
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return n3i.this.f36324e;
        }

        @Override // p001o.rtf
        public boolean isEmpty() {
            return n3i.this.f36320a.isEmpty();
        }

        @Override // p001o.rtf
        public Object poll() {
            return n3i.this.f36320a.poll();
        }

        @Override // p001o.f5e
        public int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            n3i.this.f36329s = true;
            return 2;
        }
    }

    public n3i(int i, Runnable runnable, boolean z) {
        this.f36320a = new c1g(i);
        this.f36322c = new AtomicReference(runnable);
        this.f36323d = z;
    }

    public static n3i M0() {
        return new n3i(x6c.m55703k(), null, true);
    }

    public void N0() {
        Runnable runnable = (Runnable) this.f36322c.get();
        if (runnable == null || !ec3.m24748a(this.f36322c, runnable, null)) {
            return;
        }
        runnable.run();
    }

    public void O0() {
        if (this.f36328q.getAndIncrement() != 0) {
            return;
        }
        m9c m9cVar = (m9c) this.f36321b.get();
        int iAddAndGet = 1;
        while (m9cVar == null) {
            iAddAndGet = this.f36328q.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            } else {
                m9cVar = (m9c) this.f36321b.get();
            }
        }
        if (this.f36329s) {
            P0(m9cVar);
        } else {
            Q0(m9cVar);
        }
    }

    public void P0(m9c m9cVar) {
        c1g c1gVar = this.f36320a;
        int iAddAndGet = 1;
        boolean z = !this.f36323d;
        while (!this.f36324e) {
            boolean z2 = this.f36325f;
            if (z && z2 && S0(c1gVar, m9cVar)) {
                return;
            }
            m9cVar.mo16560e(null);
            if (z2) {
                R0(m9cVar);
                return;
            } else {
                iAddAndGet = this.f36328q.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
        this.f36321b.lazySet(null);
    }

    public void Q0(m9c m9cVar) {
        c1g c1gVar = this.f36320a;
        boolean z = !this.f36323d;
        boolean z2 = true;
        int iAddAndGet = 1;
        while (!this.f36324e) {
            boolean z3 = this.f36325f;
            Object objPoll = this.f36320a.poll();
            boolean z4 = objPoll == null;
            if (z3) {
                if (z && z2) {
                    if (S0(c1gVar, m9cVar)) {
                        return;
                    } else {
                        z2 = false;
                    }
                }
                if (z4) {
                    R0(m9cVar);
                    return;
                }
            }
            if (z4) {
                iAddAndGet = this.f36328q.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                m9cVar.mo16560e(objPoll);
            }
        }
        this.f36321b.lazySet(null);
        c1gVar.clear();
    }

    public void R0(m9c m9cVar) {
        this.f36321b.lazySet(null);
        Throwable th = this.f36326g;
        if (th != null) {
            m9cVar.onError(th);
        } else {
            m9cVar.onComplete();
        }
    }

    public boolean S0(rtf rtfVar, m9c m9cVar) {
        Throwable th = this.f36326g;
        if (th == null) {
            return false;
        }
        this.f36321b.lazySet(null);
        rtfVar.clear();
        m9cVar.onError(th);
        return true;
    }

    @Override // p001o.m9c
    /* renamed from: a */
    public void mo16559a(su5 su5Var) {
        if (this.f36325f || this.f36324e) {
            su5Var.dispose();
        }
    }

    @Override // p001o.m9c
    /* renamed from: e */
    public void mo16560e(Object obj) {
        xk6.m56415c(obj, "onNext called with a null value.");
        if (this.f36325f || this.f36324e) {
            return;
        }
        this.f36320a.offer(obj);
        O0();
    }

    @Override // p001o.m9c
    public void onComplete() {
        if (this.f36325f || this.f36324e) {
            return;
        }
        this.f36325f = true;
        N0();
        O0();
    }

    @Override // p001o.m9c
    public void onError(Throwable th) {
        xk6.m56415c(th, "onError called with a null Throwable.");
        if (this.f36325f || this.f36324e) {
            fwe.m27599r(th);
            return;
        }
        this.f36326g = th;
        this.f36325f = true;
        N0();
        O0();
    }

    @Override // p001o.x6c
    public void x0(m9c m9cVar) {
        if (this.f36327h.get() || !this.f36327h.compareAndSet(false, true)) {
            h66.error(new IllegalStateException("Only a single observer allowed."), m9cVar);
            return;
        }
        m9cVar.mo16559a(this.f36328q);
        this.f36321b.lazySet(m9cVar);
        if (this.f36324e) {
            this.f36321b.lazySet(null);
        } else {
            O0();
        }
    }
}
