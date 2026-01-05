package p001o;

/* loaded from: classes6.dex */
public final class i57 extends o7 {

    /* renamed from: c */
    public final ggd f28095c;

    /* renamed from: o.i57$a */
    public static final class C14185a extends kf1 {

        /* renamed from: f */
        public final ggd f28096f;

        public C14185a(kq3 kq3Var, ggd ggdVar) {
            super(kq3Var);
            this.f28096f = ggdVar;
        }

        @Override // p001o.qag
        /* renamed from: e */
        public void mo18166e(Object obj) {
            if (mo20248f(obj)) {
                return;
            }
            this.f32130b.request(1L);
        }

        @Override // p001o.kq3
        /* renamed from: f */
        public boolean mo20248f(Object obj) {
            if (this.f32132d) {
                return false;
            }
            if (this.f32133e != 0) {
                return this.f32129a.mo20248f(null);
            }
            try {
                return this.f28096f.test(obj) && this.f32129a.mo20248f(obj);
            } catch (Throwable th) {
                m35567d(th);
                return true;
            }
        }

        @Override // p001o.rtf
        public Object poll() {
            g5e g5eVar = this.f32131c;
            ggd ggdVar = this.f28096f;
            while (true) {
                Object objPoll = g5eVar.poll();
                if (objPoll == null) {
                    return null;
                }
                if (ggdVar.test(objPoll)) {
                    return objPoll;
                }
                if (this.f32133e == 2) {
                    g5eVar.request(1L);
                }
            }
        }

        @Override // p001o.f5e
        public int requestFusion(int i) {
            return m35568g(i);
        }
    }

    /* renamed from: o.i57$b */
    public static final class C14186b extends mf1 implements kq3 {

        /* renamed from: f */
        public final ggd f28097f;

        public C14186b(qag qagVar, ggd ggdVar) {
            super(qagVar);
            this.f28097f = ggdVar;
        }

        @Override // p001o.qag
        /* renamed from: e */
        public void mo18166e(Object obj) {
            if (mo20248f(obj)) {
                return;
            }
            this.f35325b.request(1L);
        }

        @Override // p001o.kq3
        /* renamed from: f */
        public boolean mo20248f(Object obj) {
            if (this.f35327d) {
                return false;
            }
            if (this.f35328e != 0) {
                this.f35324a.mo18166e(null);
                return true;
            }
            try {
                boolean zTest = this.f28097f.test(obj);
                if (zTest) {
                    this.f35324a.mo18166e(obj);
                }
                return zTest;
            } catch (Throwable th) {
                m38867d(th);
                return true;
            }
        }

        @Override // p001o.rtf
        public Object poll() {
            g5e g5eVar = this.f35326c;
            ggd ggdVar = this.f28097f;
            while (true) {
                Object objPoll = g5eVar.poll();
                if (objPoll == null) {
                    return null;
                }
                if (ggdVar.test(objPoll)) {
                    return objPoll;
                }
                if (this.f35328e == 2) {
                    g5eVar.request(1L);
                }
            }
        }

        @Override // p001o.f5e
        public int requestFusion(int i) {
            return m38868g(i);
        }
    }

    public i57(s47 s47Var, ggd ggdVar) {
        super(s47Var);
        this.f28095c = ggdVar;
    }

    @Override // p001o.s47
    public void c0(qag qagVar) {
        if (qagVar instanceof kq3) {
            this.f37840b.b0(new C14185a((kq3) qagVar, this.f28095c));
        } else {
            this.f37840b.b0(new C14186b(qagVar, this.f28095c));
        }
    }
}
