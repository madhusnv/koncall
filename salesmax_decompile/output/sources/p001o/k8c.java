package p001o;

import p001o.c5f;

/* loaded from: classes6.dex */
public final class k8c extends a9 {

    /* renamed from: b */
    public final c5f f31634b;

    /* renamed from: c */
    public final boolean f31635c;

    /* renamed from: d */
    public final int f31636d;

    /* renamed from: o.k8c$a */
    public static final class RunnableC14733a extends nf1 implements m9c, Runnable {

        /* renamed from: a */
        public final m9c f31637a;

        /* renamed from: b */
        public final c5f.AbstractC12571c f31638b;

        /* renamed from: c */
        public final boolean f31639c;

        /* renamed from: d */
        public final int f31640d;

        /* renamed from: e */
        public rtf f31641e;

        /* renamed from: f */
        public su5 f31642f;

        /* renamed from: g */
        public Throwable f31643g;

        /* renamed from: h */
        public volatile boolean f31644h;

        /* renamed from: q */
        public volatile boolean f31645q;

        /* renamed from: s */
        public int f31646s;

        /* renamed from: x */
        public boolean f31647x;

        public RunnableC14733a(m9c m9cVar, c5f.AbstractC12571c abstractC12571c, boolean z, int i) {
            this.f31637a = m9cVar;
            this.f31638b = abstractC12571c;
            this.f31639c = z;
            this.f31640d = i;
        }

        @Override // p001o.m9c
        /* renamed from: a */
        public void mo16559a(su5 su5Var) {
            if (zu5.validate(this.f31642f, su5Var)) {
                this.f31642f = su5Var;
                if (su5Var instanceof e5e) {
                    e5e e5eVar = (e5e) su5Var;
                    int iRequestFusion = e5eVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f31646s = iRequestFusion;
                        this.f31641e = e5eVar;
                        this.f31644h = true;
                        this.f31637a.mo16559a(this);
                        m35173h();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f31646s = iRequestFusion;
                        this.f31641e = e5eVar;
                        this.f31637a.mo16559a(this);
                        return;
                    }
                }
                this.f31641e = new c1g(this.f31640d);
                this.f31637a.mo16559a(this);
            }
        }

        /* renamed from: b */
        public boolean m35170b(boolean z, boolean z2, m9c m9cVar) {
            if (this.f31645q) {
                this.f31641e.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.f31643g;
            if (this.f31639c) {
                if (!z2) {
                    return false;
                }
                this.f31645q = true;
                if (th != null) {
                    m9cVar.onError(th);
                } else {
                    m9cVar.onComplete();
                }
                this.f31638b.dispose();
                return true;
            }
            if (th != null) {
                this.f31645q = true;
                this.f31641e.clear();
                m9cVar.onError(th);
                this.f31638b.dispose();
                return true;
            }
            if (!z2) {
                return false;
            }
            this.f31645q = true;
            m9cVar.onComplete();
            this.f31638b.dispose();
            return true;
        }

        @Override // p001o.rtf
        public void clear() {
            this.f31641e.clear();
        }

        /* renamed from: d */
        public void m35171d() {
            int iAddAndGet = 1;
            while (!this.f31645q) {
                boolean z = this.f31644h;
                Throwable th = this.f31643g;
                if (!this.f31639c && z && th != null) {
                    this.f31645q = true;
                    this.f31637a.onError(this.f31643g);
                    this.f31638b.dispose();
                    return;
                }
                this.f31637a.mo16560e(null);
                if (z) {
                    this.f31645q = true;
                    Throwable th2 = this.f31643g;
                    if (th2 != null) {
                        this.f31637a.onError(th2);
                    } else {
                        this.f31637a.onComplete();
                    }
                    this.f31638b.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // p001o.su5
        public void dispose() {
            if (this.f31645q) {
                return;
            }
            this.f31645q = true;
            this.f31642f.dispose();
            this.f31638b.dispose();
            if (this.f31647x || getAndIncrement() != 0) {
                return;
            }
            this.f31641e.clear();
        }

        @Override // p001o.m9c
        /* renamed from: e */
        public void mo16560e(Object obj) {
            if (this.f31644h) {
                return;
            }
            if (this.f31646s != 2) {
                this.f31641e.offer(obj);
            }
            m35173h();
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
        
            r3 = addAndGet(-r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
        
            if (r3 != 0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
        
            return;
         */
        /* renamed from: f */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void m35172f() {
            rtf rtfVar = this.f31641e;
            m9c m9cVar = this.f31637a;
            int iAddAndGet = 1;
            while (!m35170b(this.f31644h, rtfVar.isEmpty(), m9cVar)) {
                while (true) {
                    boolean z = this.f31644h;
                    try {
                        Object objPoll = rtfVar.poll();
                        boolean z2 = objPoll == null;
                        if (m35170b(z, z2, m9cVar)) {
                            return;
                        }
                        if (z2) {
                            break;
                        } else {
                            m9cVar.mo16560e(objPoll);
                        }
                    } catch (Throwable th) {
                        zk6.m59526b(th);
                        this.f31645q = true;
                        this.f31642f.dispose();
                        rtfVar.clear();
                        m9cVar.onError(th);
                        this.f31638b.dispose();
                        return;
                    }
                }
            }
        }

        /* renamed from: h */
        public void m35173h() {
            if (getAndIncrement() == 0) {
                this.f31638b.mo20307b(this);
            }
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return this.f31645q;
        }

        @Override // p001o.rtf
        public boolean isEmpty() {
            return this.f31641e.isEmpty();
        }

        @Override // p001o.m9c
        public void onComplete() {
            if (this.f31644h) {
                return;
            }
            this.f31644h = true;
            m35173h();
        }

        @Override // p001o.m9c
        public void onError(Throwable th) {
            if (this.f31644h) {
                fwe.m27599r(th);
                return;
            }
            this.f31643g = th;
            this.f31644h = true;
            m35173h();
        }

        @Override // p001o.rtf
        public Object poll() {
            return this.f31641e.poll();
        }

        @Override // p001o.f5e
        public int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f31647x = true;
            return 2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f31647x) {
                m35171d();
            } else {
                m35172f();
            }
        }
    }

    public k8c(x8c x8cVar, c5f c5fVar, boolean z, int i) {
        super(x8cVar);
        this.f31634b = c5fVar;
        this.f31635c = z;
        this.f31636d = i;
    }

    @Override // p001o.x6c
    public void x0(m9c m9cVar) {
        c5f c5fVar = this.f31634b;
        if (c5fVar instanceof fuh) {
            this.f14302a.mo55724b(m9cVar);
        } else {
            this.f14302a.mo55724b(new RunnableC14733a(m9cVar, c5fVar.mo20301b(), this.f31635c, this.f31636d));
        }
    }
}
