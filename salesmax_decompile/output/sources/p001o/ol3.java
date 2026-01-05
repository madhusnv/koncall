package p001o;

/* loaded from: classes6.dex */
public final class ol3 extends xk3 {

    /* renamed from: a */
    public final ql3 f38523a;

    /* renamed from: b */
    public final gu3 f38524b;

    /* renamed from: c */
    public final gu3 f38525c;

    /* renamed from: d */
    public final jm f38526d;

    /* renamed from: e */
    public final jm f38527e;

    /* renamed from: f */
    public final jm f38528f;

    /* renamed from: g */
    public final jm f38529g;

    /* renamed from: o.ol3$a */
    public final class C15832a implements ml3, su5 {

        /* renamed from: a */
        public final ml3 f38530a;

        /* renamed from: b */
        public su5 f38531b;

        public C15832a(ml3 ml3Var) {
            this.f38530a = ml3Var;
        }

        @Override // p001o.ml3
        /* renamed from: a */
        public void mo16368a(su5 su5Var) {
            try {
                ol3.this.f38524b.accept(su5Var);
                if (zu5.validate(this.f38531b, su5Var)) {
                    this.f38531b = su5Var;
                    this.f38530a.mo16368a(this);
                }
            } catch (Throwable th) {
                zk6.m59526b(th);
                su5Var.dispose();
                this.f38531b = zu5.DISPOSED;
                h66.error(th, this.f38530a);
            }
        }

        /* renamed from: b */
        public void m42371b() {
            try {
                ol3.this.f38528f.run();
            } catch (Throwable th) {
                zk6.m59526b(th);
                fwe.m27599r(th);
            }
        }

        @Override // p001o.su5
        public void dispose() {
            try {
                ol3.this.f38529g.run();
            } catch (Throwable th) {
                zk6.m59526b(th);
                fwe.m27599r(th);
            }
            this.f38531b.dispose();
        }

        @Override // p001o.su5
        public boolean isDisposed() {
            return this.f38531b.isDisposed();
        }

        @Override // p001o.ml3
        public void onComplete() {
            if (this.f38531b == zu5.DISPOSED) {
                return;
            }
            try {
                ol3.this.f38526d.run();
                ol3.this.f38527e.run();
                this.f38530a.onComplete();
                m42371b();
            } catch (Throwable th) {
                zk6.m59526b(th);
                this.f38530a.onError(th);
            }
        }

        @Override // p001o.ml3
        public void onError(Throwable th) {
            if (this.f38531b == zu5.DISPOSED) {
                fwe.m27599r(th);
                return;
            }
            try {
                ol3.this.f38525c.accept(th);
                ol3.this.f38527e.run();
            } catch (Throwable th2) {
                zk6.m59526b(th2);
                th = new mo3(th, th2);
            }
            this.f38530a.onError(th);
            m42371b();
        }
    }

    public ol3(ql3 ql3Var, gu3 gu3Var, gu3 gu3Var2, jm jmVar, jm jmVar2, jm jmVar3, jm jmVar4) {
        this.f38523a = ql3Var;
        this.f38524b = gu3Var;
        this.f38525c = gu3Var2;
        this.f38526d = jmVar;
        this.f38527e = jmVar2;
        this.f38528f = jmVar3;
        this.f38529g = jmVar4;
    }

    @Override // p001o.xk3
    /* renamed from: x */
    public void mo17340x(ml3 ml3Var) {
        this.f38523a.mo45628a(new C15832a(ml3Var));
    }
}
