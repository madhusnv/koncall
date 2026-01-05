package p001o;

import p001o.vre;

/* loaded from: classes.dex */
public final class p74 {

    /* renamed from: a */
    public static final p74 f39487a = new p74();

    /* renamed from: o.p74$a */
    public static final class C16002a extends jgg implements nl7 {

        /* renamed from: a */
        public int f39488a;

        /* renamed from: b */
        public /* synthetic */ Object f39489b;

        /* renamed from: c */
        public final /* synthetic */ uk7 f39490c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16002a(uk7 uk7Var, n64 n64Var) {
            super(2, n64Var);
            this.f39490c = uk7Var;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C16002a c16002a = new C16002a(this.f39490c, n64Var);
            c16002a.f39489b = obj;
            return c16002a;
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM53351b;
            uq8.m51918f();
            if (this.f39488a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            uk7 uk7Var = this.f39490c;
            try {
                vre.C17665a c17665a = vre.f50797b;
                objM53351b = vre.m53351b(uk7Var.invoke());
            } catch (Throwable th) {
                vre.C17665a c17665a2 = vre.f50797b;
                objM53351b = vre.m53351b(wre.m54933a(th));
            }
            uia.m51627b(uia.f48971a, "coroutine", "Result for FireAndForget processing: " + vre.m53358i(objM53351b), vre.m53354e(objM53351b), null, 8, null);
            p74.f39487a.m43075c(objM53351b);
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C16002a) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.p74$b */
    public static final class C16003b extends jgg implements nl7 {

        /* renamed from: a */
        public int f39491a;

        /* renamed from: b */
        public final /* synthetic */ xk7 f39492b;

        /* renamed from: o.p74$b$a */
        public static final class a extends jgg implements nl7 {

            /* renamed from: a */
            public int f39493a;

            /* renamed from: b */
            public /* synthetic */ Object f39494b;

            /* renamed from: c */
            public final /* synthetic */ xk7 f39495c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(xk7 xk7Var, n64 n64Var) {
                super(2, n64Var);
                this.f39495c = xk7Var;
            }

            @Override // p001o.vb1
            public final n64 create(Object obj, n64 n64Var) {
                a aVar = new a(this.f39495c, n64Var);
                aVar.f39494b = obj;
                return aVar;
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                Object objM53351b;
                Object objM51918f = uq8.m51918f();
                int i = this.f39493a;
                try {
                    if (i == 0) {
                        wre.m54934b(obj);
                        xk7 xk7Var = this.f39495c;
                        vre.C17665a c17665a = vre.f50797b;
                        this.f39493a = 1;
                        obj = xk7Var.invoke(this);
                        if (obj == objM51918f) {
                            return objM51918f;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        wre.m54934b(obj);
                    }
                    objM53351b = vre.m53351b(obj);
                } catch (Throwable th) {
                    vre.C17665a c17665a2 = vre.f50797b;
                    objM53351b = vre.m53351b(wre.m54933a(th));
                }
                uia.m51627b(uia.f48971a, "coroutine", "Result of processing: " + vre.m53358i(objM53351b), vre.m53354e(objM53351b), null, 8, null);
                p74.f39487a.m43075c(objM53351b);
                ml1.m39301a(vre.m53357h(objM53351b)).booleanValue();
                if (vre.m53356g(objM53351b)) {
                    return null;
                }
                return objM53351b;
            }

            @Override // p001o.nl7
            public final Object invoke(h84 h84Var, n64 n64Var) {
                return ((a) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16003b(xk7 xk7Var, n64 n64Var) {
            super(2, n64Var);
            this.f39492b = xk7Var;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C16003b(this.f39492b, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f39491a;
            if (i == 0) {
                wre.m54934b(obj);
                q74 q74VarPlus = eu5.m25611b().plus(gdg.m28505b(null, 1, null));
                a aVar = new a(this.f39492b, null);
                this.f39491a = 1;
                obj = pm1.m43867g(q74VarPlus, aVar, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return obj;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C16003b) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.p74$c */
    public static final class C16004c extends jgg implements nl7 {

        /* renamed from: a */
        public int f39496a;

        /* renamed from: b */
        public /* synthetic */ Object f39497b;

        /* renamed from: c */
        public final /* synthetic */ xk7 f39498c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16004c(xk7 xk7Var, n64 n64Var) {
            super(2, n64Var);
            this.f39498c = xk7Var;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C16004c c16004c = new C16004c(this.f39498c, n64Var);
            c16004c.f39497b = obj;
            return c16004c;
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM53351b;
            Object objM51918f = uq8.m51918f();
            int i = this.f39496a;
            try {
                if (i == 0) {
                    wre.m54934b(obj);
                    xk7 xk7Var = this.f39498c;
                    vre.C17665a c17665a = vre.f50797b;
                    this.f39496a = 1;
                    obj = xk7Var.invoke(this);
                    if (obj == objM51918f) {
                        return objM51918f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                }
                objM53351b = vre.m53351b(obj);
            } catch (Throwable th) {
                vre.C17665a c17665a2 = vre.f50797b;
                objM53351b = vre.m53351b(wre.m54933a(th));
            }
            uia.m51627b(uia.f48971a, "coroutine", "Result of processing: " + vre.m53358i(objM53351b), vre.m53354e(objM53351b), null, 8, null);
            p74.f39487a.m43075c(objM53351b);
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C16004c) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.p74$d */
    public static final class C16005d extends jgg implements nl7 {

        /* renamed from: a */
        public int f39499a;

        /* renamed from: b */
        public /* synthetic */ Object f39500b;

        /* renamed from: c */
        public final /* synthetic */ xk7 f39501c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16005d(xk7 xk7Var, n64 n64Var) {
            super(2, n64Var);
            this.f39501c = xk7Var;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C16005d c16005d = new C16005d(this.f39501c, n64Var);
            c16005d.f39500b = obj;
            return c16005d;
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM53351b;
            Object objM51918f = uq8.m51918f();
            int i = this.f39499a;
            try {
                if (i == 0) {
                    wre.m54934b(obj);
                    xk7 xk7Var = this.f39501c;
                    vre.C17665a c17665a = vre.f50797b;
                    this.f39499a = 1;
                    obj = xk7Var.invoke(this);
                    if (obj == objM51918f) {
                        return objM51918f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                }
                objM53351b = vre.m53351b(obj);
            } catch (Throwable th) {
                vre.C17665a c17665a2 = vre.f50797b;
                objM53351b = vre.m53351b(wre.m54933a(th));
            }
            uia.m51627b(uia.f48971a, "coroutine", "Result of processing: " + vre.m53358i(objM53351b), vre.m53354e(objM53351b), null, 8, null);
            p74.f39487a.m43075c(objM53351b);
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C16005d) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.p74$e */
    public static final class C16006e extends jgg implements nl7 {

        /* renamed from: a */
        public int f39502a;

        /* renamed from: b */
        public /* synthetic */ Object f39503b;

        /* renamed from: c */
        public final /* synthetic */ xk7 f39504c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16006e(xk7 xk7Var, n64 n64Var) {
            super(2, n64Var);
            this.f39504c = xk7Var;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C16006e c16006e = new C16006e(this.f39504c, n64Var);
            c16006e.f39503b = obj;
            return c16006e;
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM53351b;
            Object objM51918f = uq8.m51918f();
            int i = this.f39502a;
            try {
                if (i == 0) {
                    wre.m54934b(obj);
                    xk7 xk7Var = this.f39504c;
                    vre.C17665a c17665a = vre.f50797b;
                    this.f39502a = 1;
                    obj = xk7Var.invoke(this);
                    if (obj == objM51918f) {
                        return objM51918f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                }
                objM53351b = vre.m53351b(obj);
            } catch (Throwable th) {
                vre.C17665a c17665a2 = vre.f50797b;
                objM53351b = vre.m53351b(wre.m54933a(th));
            }
            uia.m51627b(uia.f48971a, "coroutine", "Result of processing: " + vre.m53358i(objM53351b), vre.m53354e(objM53351b), null, 8, null);
            p74.f39487a.m43075c(objM53351b);
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C16006e) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.p74$f */
    public static final class C16007f extends jgg implements nl7 {

        /* renamed from: a */
        public int f39505a;

        /* renamed from: b */
        public final /* synthetic */ uk7 f39506b;

        /* renamed from: o.p74$f$a */
        public static final class a extends jgg implements nl7 {

            /* renamed from: a */
            public int f39507a;

            /* renamed from: b */
            public /* synthetic */ Object f39508b;

            /* renamed from: c */
            public final /* synthetic */ uk7 f39509c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(uk7 uk7Var, n64 n64Var) {
                super(2, n64Var);
                this.f39509c = uk7Var;
            }

            @Override // p001o.vb1
            public final n64 create(Object obj, n64 n64Var) {
                a aVar = new a(this.f39509c, n64Var);
                aVar.f39508b = obj;
                return aVar;
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                Object objM53351b;
                uq8.m51918f();
                if (this.f39507a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
                uk7 uk7Var = this.f39509c;
                try {
                    vre.C17665a c17665a = vre.f50797b;
                    objM53351b = vre.m53351b(uk7Var.invoke());
                } catch (Throwable th) {
                    vre.C17665a c17665a2 = vre.f50797b;
                    objM53351b = vre.m53351b(wre.m54933a(th));
                }
                uia.m51627b(uia.f48971a, "coroutine", "Result of processing: " + vre.m53358i(objM53351b), vre.m53354e(objM53351b), null, 8, null);
                p74.f39487a.m43075c(objM53351b);
                ml1.m39301a(vre.m53357h(objM53351b)).booleanValue();
                if (vre.m53356g(objM53351b)) {
                    return null;
                }
                return objM53351b;
            }

            @Override // p001o.nl7
            public final Object invoke(h84 h84Var, n64 n64Var) {
                return ((a) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16007f(uk7 uk7Var, n64 n64Var) {
            super(2, n64Var);
            this.f39506b = uk7Var;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C16007f(this.f39506b, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f39505a;
            if (i == 0) {
                wre.m54934b(obj);
                q74 q74VarPlus = eu5.m25611b().plus(gdg.m28505b(null, 1, null));
                a aVar = new a(this.f39506b, null);
                this.f39505a = 1;
                obj = pm1.m43867g(q74VarPlus, aVar, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return obj;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C16007f) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: b */
    public final void m43074b(uk7 uk7Var) {
        sq8.m48649h(uk7Var, "block");
        rm1.m46952d(i84.m31707a(eu5.m25611b().plus(gdg.m28505b(null, 1, null))), null, null, new C16002a(uk7Var, null), 3, null);
    }

    /* renamed from: c */
    public final void m43075c(Object obj) {
        Throwable thM53354e = vre.m53354e(obj);
        if (thM53354e != null) {
            l07.m36402c(l07.f32907a, "coroutine: exception in processing", thM53354e, null, 4, null);
        }
    }

    /* renamed from: d */
    public final void m43076d(Throwable th) {
        sq8.m48649h(th, "t");
        l07.m36402c(l07.f32907a, "coroutine: exception in processing", th, null, 4, null);
    }

    /* renamed from: e */
    public final Object m43077e(xk7 xk7Var) {
        sq8.m48649h(xk7Var, "block");
        return qm1.m45641b(null, new C16003b(xk7Var, null), 1, null);
    }

    /* renamed from: f */
    public final void m43078f(h84 h84Var, xk7 xk7Var) {
        sq8.m48649h(h84Var, "scope");
        sq8.m48649h(xk7Var, "block");
        rm1.m46952d(h84Var, null, null, new C16004c(xk7Var, null), 3, null);
    }

    /* renamed from: g */
    public final void m43079g(xk7 xk7Var) {
        sq8.m48649h(xk7Var, "block");
        rm1.m46952d(m43082j(), null, null, new C16005d(xk7Var, null), 3, null);
    }

    /* renamed from: h */
    public final void m43080h(xk7 xk7Var) {
        sq8.m48649h(xk7Var, "block");
        rm1.m46952d(m43083k(), null, null, new C16006e(xk7Var, null), 3, null);
    }

    /* renamed from: i */
    public final Object m43081i(uk7 uk7Var) {
        sq8.m48649h(uk7Var, "block");
        return qm1.m45641b(null, new C16007f(uk7Var, null), 1, null);
    }

    /* renamed from: j */
    public final h84 m43082j() {
        return i84.m31707a(eu5.m25611b().plus(gdg.m28505b(null, 1, null)).plus(a84.f14277a.m16672a()));
    }

    /* renamed from: k */
    public final h84 m43083k() {
        return i84.m31707a(eu5.m25612c().plus(gdg.m28505b(null, 1, null)).plus(a84.f14277a.m16672a()));
    }
}
