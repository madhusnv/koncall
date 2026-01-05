package p001o;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class f7c extends a9 {

    /* renamed from: b */
    public final rl7 f22894b;

    /* renamed from: c */
    public final int f22895c;

    /* renamed from: d */
    public final lj6 f22896d;

    /* renamed from: o.f7c$a */
    public static final class C13359a extends AtomicInteger implements m9c, su5 {

        /* renamed from: a */
        public final m9c f22897a;

        /* renamed from: b */
        public final rl7 f22898b;

        /* renamed from: c */
        public final int f22899c;

        /* renamed from: d */
        public final ns0 f22900d = new ns0();

        /* renamed from: e */
        public final a f22901e;

        /* renamed from: f */
        public final boolean f22902f;

        /* renamed from: g */
        public rtf f22903g;

        /* renamed from: h */
        public su5 f22904h;

        /* renamed from: q */
        public volatile boolean f22905q;

        /* renamed from: s */
        public volatile boolean f22906s;

        /* renamed from: x */
        public volatile boolean f22907x;

        /* renamed from: y */
        public int f22908y;

        /* renamed from: o.f7c$a$a */
        public static final class a extends AtomicReference implements m9c {

            /* renamed from: a */
            public final m9c f22909a;

            /* renamed from: b */
            public final C13359a f22910b;

            public a(m9c m9cVar, C13359a c13359a) {
                this.f22909a = m9cVar;
                this.f22910b = c13359a;
            }

            @Override // p001o.m9c
            /* renamed from: a */
            public void mo16559a(su5 su5Var) {
                zu5.replace(this, su5Var);
            }

            /* renamed from: b */
            public void m26240b() {
                zu5.dispose(this);
            }

            @Override // p001o.m9c
            /* renamed from: e */
            public void mo16560e(Object obj) {
                this.f22909a.mo16560e(obj);
            }

            @Override // p001o.m9c
            public void onComplete() {
                C13359a c13359a = this.f22910b;
                c13359a.f22905q = false;
                c13359a.m26239b();
            }

            @Override // p001o.m9c
            public void onError(Throwable th) {
                C13359a c13359a = this.f22910b;
                if (c13359a.f22900d.m41017c(th)) {
                    if (!c13359a.f22902f) {
                        c13359a.f22904h.dispose();
                    }
                    c13359a.f22905q = false;
                    c13359a.m26239b();
                }
            }
        }

        public C13359a(m9c m9cVar, rl7 rl7Var, int i, boolean z) {
            this.f22897a = m9cVar;
            this.f22898b = rl7Var;
            this.f22899c = i;
            this.f22902f = z;
            this.f22901e = new a(m9cVar, this);
        }

        @Override // p001o.m9c
        /* renamed from: a */
        public void mo16559a(su5 su5Var) {
            if (zu5.validate(this.f22904h, su5Var)) {
                this.f22904h = su5Var;
                if (su5Var instanceof e5e) {
                    e5e e5eVar = (e5e) su5Var;
                    int iRequestFusion = e5eVar.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.f22908y = iRequestFusion;
                        this.f22903g = e5eVar;
                        this.f22906s = true;
                        this.f22897a.mo16559a(this);
                        m26239b();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f22908y = iRequestFusion;
                        this.f22903g = e5eVar;
                        this.f22897a.mo16559a(this);
                        return;
                    }
                }
                this.f22903g = new c1g(this.f22899c);
                this.f22897a.mo16559a(this);
            }
        }

        /* renamed from: b */
        public void m26239b() {
            if (getAndIncrement() != 0) {
                return;
            }
            m9c m9cVar = this.f22897a;
            rtf rtfVar = this.f22903g;
            ns0 ns0Var = this.f22900d;
            while (true) {
                if (!this.f22905q) {
                    if (this.f22907x) {
                        rtfVar.clear();
                        return;
                    }
                    if (!this.f22902f && ((Throwable) ns0Var.get()) != null) {
                        rtfVar.clear();
                        this.f22907x = true;
                        ns0Var.m41020f(m9cVar);
                        return;
                    }
                    boolean z = this.f22906s;
                    try {
                        Object objPoll = rtfVar.poll();
                        boolean z2 = objPoll == null;
                        if (z && z2) {
                            this.f22907x = true;
                            ns0Var.m41020f(m9cVar);
                            return;
                        }
                        if (!z2) {
                            try {
                                Object objApply = this.f22898b.apply(objPoll);
                                Objects.requireNonNull(objApply, "The mapper returned a null ObservableSource");
                                x8c x8cVar = (x8c) objApply;
                                if (x8cVar instanceof idg) {
                                    try {
                                        Object obj = ((idg) x8cVar).get();
                                        if (obj != null && !this.f22907x) {
                                            m9cVar.mo16560e(obj);
                                        }
                                    } catch (Throwable th) {
                                        zk6.m59526b(th);
                                        ns0Var.m41017c(th);
                                    }
                                } else {
                                    this.f22905q = true;
                                    x8cVar.mo55724b(this.f22901e);
                                }
                            } catch (Throwable th2) {
                                zk6.m59526b(th2);
                                this.f22907x = true;
                                this.f22904h.dispose();
                                rtfVar.clear();
                                ns0Var.m41017c(th2);
                                ns0Var.m41020f(m9cVar);
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        zk6.m59526b(th3);
                        this.f22907x = true;
                        this.f22904h.dispose();
                        ns0Var.m41017c(th3);
                        ns0Var.m41020f(m9cVar);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }

        @Override // p001o.su5
        public void dispose() {
            this.f22907x = true;
            this.f22904h.dispose();
            this.f22901e.m26240b();
            this.f22900d.m41018d();
        }

        @Override // p001o.m9c
        /* renamed from: e */
        public void mo16560e(Object obj) {
            if (this.f22908y == 0) {
                this.f22903g.offer(obj);
            }
            m26239b();
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return this.f22907x;
        }

        @Override // p001o.m9c
        public void onComplete() {
            this.f22906s = true;
            m26239b();
        }

        @Override // p001o.m9c
        public void onError(Throwable th) {
            if (this.f22900d.m41017c(th)) {
                this.f22906s = true;
                m26239b();
            }
        }
    }

    /* renamed from: o.f7c$b */
    public static final class C13360b extends AtomicInteger implements m9c, su5 {

        /* renamed from: a */
        public final m9c f22911a;

        /* renamed from: b */
        public final rl7 f22912b;

        /* renamed from: c */
        public final a f22913c;

        /* renamed from: d */
        public final int f22914d;

        /* renamed from: e */
        public rtf f22915e;

        /* renamed from: f */
        public su5 f22916f;

        /* renamed from: g */
        public volatile boolean f22917g;

        /* renamed from: h */
        public volatile boolean f22918h;

        /* renamed from: q */
        public volatile boolean f22919q;

        /* renamed from: s */
        public int f22920s;

        /* renamed from: o.f7c$b$a */
        public static final class a extends AtomicReference implements m9c {

            /* renamed from: a */
            public final m9c f22921a;

            /* renamed from: b */
            public final C13360b f22922b;

            public a(m9c m9cVar, C13360b c13360b) {
                this.f22921a = m9cVar;
                this.f22922b = c13360b;
            }

            @Override // p001o.m9c
            /* renamed from: a */
            public void mo16559a(su5 su5Var) {
                zu5.replace(this, su5Var);
            }

            /* renamed from: b */
            public void m26243b() {
                zu5.dispose(this);
            }

            @Override // p001o.m9c
            /* renamed from: e */
            public void mo16560e(Object obj) {
                this.f22921a.mo16560e(obj);
            }

            @Override // p001o.m9c
            public void onComplete() {
                this.f22922b.m26242d();
            }

            @Override // p001o.m9c
            public void onError(Throwable th) {
                this.f22922b.dispose();
                this.f22921a.onError(th);
            }
        }

        public C13360b(m9c m9cVar, rl7 rl7Var, int i) {
            this.f22911a = m9cVar;
            this.f22912b = rl7Var;
            this.f22914d = i;
            this.f22913c = new a(m9cVar, this);
        }

        @Override // p001o.m9c
        /* renamed from: a */
        public void mo16559a(su5 su5Var) {
            if (zu5.validate(this.f22916f, su5Var)) {
                this.f22916f = su5Var;
                if (su5Var instanceof e5e) {
                    e5e e5eVar = (e5e) su5Var;
                    int iRequestFusion = e5eVar.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.f22920s = iRequestFusion;
                        this.f22915e = e5eVar;
                        this.f22919q = true;
                        this.f22911a.mo16559a(this);
                        m26241b();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f22920s = iRequestFusion;
                        this.f22915e = e5eVar;
                        this.f22911a.mo16559a(this);
                        return;
                    }
                }
                this.f22915e = new c1g(this.f22914d);
                this.f22911a.mo16559a(this);
            }
        }

        /* renamed from: b */
        public void m26241b() {
            if (getAndIncrement() != 0) {
                return;
            }
            while (!this.f22918h) {
                if (!this.f22917g) {
                    boolean z = this.f22919q;
                    try {
                        Object objPoll = this.f22915e.poll();
                        boolean z2 = objPoll == null;
                        if (z && z2) {
                            this.f22918h = true;
                            this.f22911a.onComplete();
                            return;
                        }
                        if (!z2) {
                            try {
                                Object objApply = this.f22912b.apply(objPoll);
                                Objects.requireNonNull(objApply, "The mapper returned a null ObservableSource");
                                x8c x8cVar = (x8c) objApply;
                                this.f22917g = true;
                                x8cVar.mo55724b(this.f22913c);
                            } catch (Throwable th) {
                                zk6.m59526b(th);
                                dispose();
                                this.f22915e.clear();
                                this.f22911a.onError(th);
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        zk6.m59526b(th2);
                        dispose();
                        this.f22915e.clear();
                        this.f22911a.onError(th2);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.f22915e.clear();
        }

        /* renamed from: d */
        public void m26242d() {
            this.f22917g = false;
            m26241b();
        }

        @Override // p001o.su5
        public void dispose() {
            this.f22918h = true;
            this.f22913c.m26243b();
            this.f22916f.dispose();
            if (getAndIncrement() == 0) {
                this.f22915e.clear();
            }
        }

        @Override // p001o.m9c
        /* renamed from: e */
        public void mo16560e(Object obj) {
            if (this.f22919q) {
                return;
            }
            if (this.f22920s == 0) {
                this.f22915e.offer(obj);
            }
            m26241b();
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return this.f22918h;
        }

        @Override // p001o.m9c
        public void onComplete() {
            if (this.f22919q) {
                return;
            }
            this.f22919q = true;
            m26241b();
        }

        @Override // p001o.m9c
        public void onError(Throwable th) {
            if (this.f22919q) {
                fwe.m27599r(th);
                return;
            }
            this.f22919q = true;
            dispose();
            this.f22911a.onError(th);
        }
    }

    public f7c(x8c x8cVar, rl7 rl7Var, int i, lj6 lj6Var) {
        super(x8cVar);
        this.f22894b = rl7Var;
        this.f22896d = lj6Var;
        this.f22895c = Math.max(8, i);
    }

    @Override // p001o.x6c
    public void x0(m9c m9cVar) {
        if (t8c.m49563b(this.f14302a, m9cVar, this.f22894b)) {
            return;
        }
        if (this.f22896d == lj6.IMMEDIATE) {
            this.f14302a.mo55724b(new C13360b(new qff(m9cVar), this.f22894b, this.f22895c));
        } else {
            this.f14302a.mo55724b(new C13359a(m9cVar, this.f22894b, this.f22895c, this.f22896d == lj6.END));
        }
    }
}
