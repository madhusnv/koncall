package p001o;

/* loaded from: classes6.dex */
public final class c57 extends o7 {

    /* renamed from: c */
    public final gu3 f17348c;

    /* renamed from: d */
    public final gu3 f17349d;

    /* renamed from: e */
    public final jm f17350e;

    /* renamed from: f */
    public final jm f17351f;

    /* renamed from: o.c57$a */
    public static final class C12565a extends kf1 {

        /* renamed from: f */
        public final gu3 f17352f;

        /* renamed from: g */
        public final gu3 f17353g;

        /* renamed from: h */
        public final jm f17354h;

        /* renamed from: q */
        public final jm f17355q;

        public C12565a(kq3 kq3Var, gu3 gu3Var, gu3 gu3Var2, jm jmVar, jm jmVar2) {
            super(kq3Var);
            this.f17352f = gu3Var;
            this.f17353g = gu3Var2;
            this.f17354h = jmVar;
            this.f17355q = jmVar2;
        }

        @Override // p001o.qag
        /* renamed from: e */
        public void mo18166e(Object obj) {
            if (this.f32132d) {
                return;
            }
            if (this.f32133e != 0) {
                this.f32129a.mo18166e(null);
                return;
            }
            try {
                this.f17352f.accept(obj);
                this.f32129a.mo18166e(obj);
            } catch (Throwable th) {
                m35567d(th);
            }
        }

        @Override // p001o.kq3
        /* renamed from: f */
        public boolean mo20248f(Object obj) {
            if (this.f32132d) {
                return false;
            }
            try {
                this.f17352f.accept(obj);
                return this.f32129a.mo20248f(obj);
            } catch (Throwable th) {
                m35567d(th);
                return false;
            }
        }

        @Override // p001o.kf1, p001o.qag
        public void onComplete() {
            if (this.f32132d) {
                return;
            }
            try {
                this.f17354h.run();
                this.f32132d = true;
                this.f32129a.onComplete();
                try {
                    this.f17355q.run();
                } catch (Throwable th) {
                    zk6.m59526b(th);
                    fwe.m27599r(th);
                }
            } catch (Throwable th2) {
                m35567d(th2);
            }
        }

        @Override // p001o.kf1, p001o.qag
        public void onError(Throwable th) {
            if (this.f32132d) {
                fwe.m27599r(th);
                return;
            }
            boolean z = true;
            this.f32132d = true;
            try {
                this.f17353g.accept(th);
            } catch (Throwable th2) {
                zk6.m59526b(th2);
                this.f32129a.onError(new mo3(th, th2));
                z = false;
            }
            if (z) {
                this.f32129a.onError(th);
            }
            try {
                this.f17355q.run();
            } catch (Throwable th3) {
                zk6.m59526b(th3);
                fwe.m27599r(th3);
            }
        }

        @Override // p001o.rtf
        public Object poll() throws Exception {
            try {
                Object objPoll = this.f32131c.poll();
                if (objPoll != null) {
                    try {
                        this.f17352f.accept(objPoll);
                    } catch (Throwable th) {
                        try {
                            zk6.m59526b(th);
                            try {
                                this.f17353g.accept(th);
                                throw xk6.m56418f(th);
                            } catch (Throwable th2) {
                                zk6.m59526b(th2);
                                throw new mo3(th, th2);
                            }
                        } finally {
                            this.f17355q.run();
                        }
                    }
                } else if (this.f32133e == 1) {
                    this.f17354h.run();
                }
                return objPoll;
            } catch (Throwable th3) {
                zk6.m59526b(th3);
                try {
                    this.f17353g.accept(th3);
                    throw xk6.m56418f(th3);
                } catch (Throwable th4) {
                    zk6.m59526b(th4);
                    throw new mo3(th3, th4);
                }
            }
        }

        @Override // p001o.f5e
        public int requestFusion(int i) {
            return m35568g(i);
        }
    }

    /* renamed from: o.c57$b */
    public static final class C12566b extends mf1 {

        /* renamed from: f */
        public final gu3 f17356f;

        /* renamed from: g */
        public final gu3 f17357g;

        /* renamed from: h */
        public final jm f17358h;

        /* renamed from: q */
        public final jm f17359q;

        public C12566b(qag qagVar, gu3 gu3Var, gu3 gu3Var2, jm jmVar, jm jmVar2) {
            super(qagVar);
            this.f17356f = gu3Var;
            this.f17357g = gu3Var2;
            this.f17358h = jmVar;
            this.f17359q = jmVar2;
        }

        @Override // p001o.qag
        /* renamed from: e */
        public void mo18166e(Object obj) {
            if (this.f35327d) {
                return;
            }
            if (this.f35328e != 0) {
                this.f35324a.mo18166e(null);
                return;
            }
            try {
                this.f17356f.accept(obj);
                this.f35324a.mo18166e(obj);
            } catch (Throwable th) {
                m38867d(th);
            }
        }

        @Override // p001o.mf1, p001o.qag
        public void onComplete() {
            if (this.f35327d) {
                return;
            }
            try {
                this.f17358h.run();
                this.f35327d = true;
                this.f35324a.onComplete();
                try {
                    this.f17359q.run();
                } catch (Throwable th) {
                    zk6.m59526b(th);
                    fwe.m27599r(th);
                }
            } catch (Throwable th2) {
                m38867d(th2);
            }
        }

        @Override // p001o.mf1, p001o.qag
        public void onError(Throwable th) {
            if (this.f35327d) {
                fwe.m27599r(th);
                return;
            }
            boolean z = true;
            this.f35327d = true;
            try {
                this.f17357g.accept(th);
            } catch (Throwable th2) {
                zk6.m59526b(th2);
                this.f35324a.onError(new mo3(th, th2));
                z = false;
            }
            if (z) {
                this.f35324a.onError(th);
            }
            try {
                this.f17359q.run();
            } catch (Throwable th3) {
                zk6.m59526b(th3);
                fwe.m27599r(th3);
            }
        }

        @Override // p001o.rtf
        public Object poll() throws Exception {
            try {
                Object objPoll = this.f35326c.poll();
                if (objPoll != null) {
                    try {
                        this.f17356f.accept(objPoll);
                    } catch (Throwable th) {
                        try {
                            zk6.m59526b(th);
                            try {
                                this.f17357g.accept(th);
                                throw xk6.m56418f(th);
                            } catch (Throwable th2) {
                                zk6.m59526b(th2);
                                throw new mo3(th, th2);
                            }
                        } finally {
                            this.f17359q.run();
                        }
                    }
                } else if (this.f35328e == 1) {
                    this.f17358h.run();
                }
                return objPoll;
            } catch (Throwable th3) {
                zk6.m59526b(th3);
                try {
                    this.f17357g.accept(th3);
                    throw xk6.m56418f(th3);
                } catch (Throwable th4) {
                    zk6.m59526b(th4);
                    throw new mo3(th3, th4);
                }
            }
        }

        @Override // p001o.f5e
        public int requestFusion(int i) {
            return m38868g(i);
        }
    }

    public c57(s47 s47Var, gu3 gu3Var, gu3 gu3Var2, jm jmVar, jm jmVar2) {
        super(s47Var);
        this.f17348c = gu3Var;
        this.f17349d = gu3Var2;
        this.f17350e = jmVar;
        this.f17351f = jmVar2;
    }

    @Override // p001o.s47
    public void c0(qag qagVar) {
        if (qagVar instanceof kq3) {
            this.f37840b.b0(new C12565a((kq3) qagVar, this.f17348c, this.f17349d, this.f17350e, this.f17351f));
        } else {
            this.f37840b.b0(new C12566b(qagVar, this.f17348c, this.f17349d, this.f17350e, this.f17351f));
        }
    }
}
