package p001o;

/* loaded from: classes6.dex */
public final class k7c extends a9 {

    /* renamed from: b */
    public final jm f31573b;

    /* renamed from: o.k7c$a */
    public static final class C14725a extends nf1 implements m9c {

        /* renamed from: a */
        public final m9c f31574a;

        /* renamed from: b */
        public final jm f31575b;

        /* renamed from: c */
        public su5 f31576c;

        /* renamed from: d */
        public e5e f31577d;

        /* renamed from: e */
        public boolean f31578e;

        public C14725a(m9c m9cVar, jm jmVar) {
            this.f31574a = m9cVar;
            this.f31575b = jmVar;
        }

        @Override // p001o.m9c
        /* renamed from: a */
        public void mo16559a(su5 su5Var) {
            if (zu5.validate(this.f31576c, su5Var)) {
                this.f31576c = su5Var;
                if (su5Var instanceof e5e) {
                    this.f31577d = (e5e) su5Var;
                }
                this.f31574a.mo16559a(this);
            }
        }

        /* renamed from: b */
        public void m35112b() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f31575b.run();
                } catch (Throwable th) {
                    zk6.m59526b(th);
                    fwe.m27599r(th);
                }
            }
        }

        @Override // p001o.rtf
        public void clear() {
            this.f31577d.clear();
        }

        @Override // p001o.su5
        public void dispose() {
            this.f31576c.dispose();
            m35112b();
        }

        @Override // p001o.m9c
        /* renamed from: e */
        public void mo16560e(Object obj) {
            this.f31574a.mo16560e(obj);
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return this.f31576c.isDisposed();
        }

        @Override // p001o.rtf
        public boolean isEmpty() {
            return this.f31577d.isEmpty();
        }

        @Override // p001o.m9c
        public void onComplete() {
            this.f31574a.onComplete();
            m35112b();
        }

        @Override // p001o.m9c
        public void onError(Throwable th) {
            this.f31574a.onError(th);
            m35112b();
        }

        @Override // p001o.rtf
        public Object poll() {
            Object objPoll = this.f31577d.poll();
            if (objPoll == null && this.f31578e) {
                m35112b();
            }
            return objPoll;
        }

        @Override // p001o.f5e
        public int requestFusion(int i) {
            e5e e5eVar = this.f31577d;
            if (e5eVar == null || (i & 4) != 0) {
                return 0;
            }
            int iRequestFusion = e5eVar.requestFusion(i);
            if (iRequestFusion != 0) {
                this.f31578e = iRequestFusion == 1;
            }
            return iRequestFusion;
        }
    }

    public k7c(x8c x8cVar, jm jmVar) {
        super(x8cVar);
        this.f31573b = jmVar;
    }

    @Override // p001o.x6c
    public void x0(m9c m9cVar) {
        this.f14302a.mo55724b(new C14725a(m9cVar, this.f31573b));
    }
}
