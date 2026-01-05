package p001o;

import p001o.imf;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class r47 {

    /* renamed from: o.r47$a */
    public static final class C16533a extends jgg implements nl7 {

        /* renamed from: a */
        public int f42913a;

        /* renamed from: b */
        public final /* synthetic */ imf f42914b;

        /* renamed from: c */
        public final /* synthetic */ v37 f42915c;

        /* renamed from: d */
        public final /* synthetic */ zpb f42916d;

        /* renamed from: e */
        public final /* synthetic */ Object f42917e;

        /* renamed from: o.r47$a$a */
        public static final class a extends jgg implements nl7 {

            /* renamed from: a */
            public int f42918a;

            /* renamed from: b */
            public /* synthetic */ int f42919b;

            public a(n64 n64Var) {
                super(2, n64Var);
            }

            @Override // p001o.vb1
            public final n64 create(Object obj, n64 n64Var) {
                a aVar = new a(n64Var);
                aVar.f42919b = ((Number) obj).intValue();
                return aVar;
            }

            /* renamed from: f */
            public final Object m46203f(int i, n64 n64Var) {
                return ((a) create(Integer.valueOf(i), n64Var)).invokeSuspend(y3i.f54824a);
            }

            @Override // p001o.nl7
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return m46203f(((Number) obj).intValue(), (n64) obj2);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                uq8.m51918f();
                if (this.f42918a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
                return ml1.m39301a(this.f42919b > 0);
            }
        }

        /* renamed from: o.r47$a$b */
        public static final class b extends jgg implements nl7 {

            /* renamed from: a */
            public int f42920a;

            /* renamed from: b */
            public /* synthetic */ Object f42921b;

            /* renamed from: c */
            public final /* synthetic */ v37 f42922c;

            /* renamed from: d */
            public final /* synthetic */ zpb f42923d;

            /* renamed from: e */
            public final /* synthetic */ Object f42924e;

            /* renamed from: o.r47$a$b$a */
            public /* synthetic */ class a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f42925a;

                static {
                    int[] iArr = new int[gmf.values().length];
                    try {
                        iArr[gmf.START.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[gmf.STOP.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[gmf.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f42925a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(v37 v37Var, zpb zpbVar, Object obj, n64 n64Var) {
                super(2, n64Var);
                this.f42922c = v37Var;
                this.f42923d = zpbVar;
                this.f42924e = obj;
            }

            @Override // p001o.vb1
            public final n64 create(Object obj, n64 n64Var) {
                b bVar = new b(this.f42922c, this.f42923d, this.f42924e, n64Var);
                bVar.f42921b = obj;
                return bVar;
            }

            @Override // p001o.nl7
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(gmf gmfVar, n64 n64Var) {
                return ((b) create(gmfVar, n64Var)).invokeSuspend(y3i.f54824a);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                Object objM51918f = uq8.m51918f();
                int i = this.f42920a;
                if (i == 0) {
                    wre.m54934b(obj);
                    int i2 = a.f42925a[((gmf) this.f42921b).ordinal()];
                    if (i2 == 1) {
                        v37 v37Var = this.f42922c;
                        zpb zpbVar = this.f42923d;
                        this.f42920a = 1;
                        if (v37Var.mo9775a(zpbVar, this) == objM51918f) {
                            return objM51918f;
                        }
                    } else if (i2 != 2) {
                        if (i2 != 3) {
                            throw new szb();
                        }
                        Object obj2 = this.f42924e;
                        if (obj2 == bmf.f16537a) {
                            this.f42923d.mo17499d();
                        } else {
                            ml1.m39301a(this.f42923d.mo17498b(obj2));
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                }
                return y3i.f54824a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16533a(imf imfVar, v37 v37Var, zpb zpbVar, Object obj, n64 n64Var) {
            super(2, n64Var);
            this.f42914b = imfVar;
            this.f42915c = v37Var;
            this.f42916d = zpbVar;
            this.f42917e = obj;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C16533a(this.f42914b, this.f42915c, this.f42916d, this.f42917e, n64Var);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0068 A[RETURN] */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            v37 v37Var;
            zpb zpbVar;
            Object objM51918f = uq8.m51918f();
            int i = this.f42913a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        wre.m54934b(obj);
                        v37Var = this.f42915c;
                        zpbVar = this.f42916d;
                        this.f42913a = 3;
                        if (v37Var.mo9775a(zpbVar, this) == objM51918f) {
                            return objM51918f;
                        }
                    } else if (i != 3 && i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                wre.m54934b(obj);
            } else {
                wre.m54934b(obj);
                imf imfVar = this.f42914b;
                imf.C14327a c14327a = imf.f28923a;
                if (imfVar == c14327a.m32416c()) {
                    v37 v37Var2 = this.f42915c;
                    zpb zpbVar2 = this.f42916d;
                    this.f42913a = 1;
                    if (v37Var2.mo9775a(zpbVar2, this) == objM51918f) {
                        return objM51918f;
                    }
                } else if (this.f42914b == c14327a.m32417d()) {
                    q4g q4gVarM59681c = this.f42916d.m59681c();
                    a aVar = new a(null);
                    this.f42913a = 2;
                    if (e47.m24279m(q4gVarM59681c, aVar, this) == objM51918f) {
                        return objM51918f;
                    }
                    v37Var = this.f42915c;
                    zpbVar = this.f42916d;
                    this.f42913a = 3;
                    if (v37Var.mo9775a(zpbVar, this) == objM51918f) {
                    }
                } else {
                    v37 v37VarM24274h = e47.m24274h(this.f42914b.mo32413a(this.f42916d.m59681c()));
                    b bVar = new b(this.f42915c, this.f42916d, this.f42917e, null);
                    this.f42913a = 4;
                    if (e47.m24273g(v37VarM24274h, bVar, this) == objM51918f) {
                        return objM51918f;
                    }
                }
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C16533a) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: a */
    public static final zlf m46198a(zpb zpbVar) {
        return new qce(zpbVar, null);
    }

    /* renamed from: b */
    public static final q4g m46199b(cqb cqbVar) {
        return new sce(cqbVar, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final hmf m46200c(v37 v37Var, int i) {
        mg2 mg2Var;
        v37 v37VarMo38964j;
        int iM18601d = bce.m18601d(i, jg2.f30380k.m33787a()) - i;
        if (!(v37Var instanceof mg2) || (v37VarMo38964j = (mg2Var = (mg2) v37Var).mo38964j()) == null) {
            return new hmf(v37Var, iM18601d, wl1.SUSPEND, e66.f21035a);
        }
        int i2 = mg2Var.f35372b;
        if (i2 != -3 && i2 != -2 && i2 != 0) {
            iM18601d = i2;
        } else if (mg2Var.f35373c == wl1.SUSPEND) {
            if (i2 == 0) {
                iM18601d = 0;
            }
        } else if (i == 0) {
            iM18601d = 1;
        }
        return new hmf(v37VarMo38964j, iM18601d, mg2Var.f35373c, mg2Var.f35371a);
    }

    /* renamed from: d */
    public static final p69 m46201d(h84 h84Var, q74 q74Var, v37 v37Var, zpb zpbVar, imf imfVar, Object obj) {
        return pm1.m43863c(h84Var, q74Var, sq8.m48644c(imfVar, imf.f28923a.m32416c()) ? l84.DEFAULT : l84.UNDISPATCHED, new C16533a(imfVar, v37Var, zpbVar, obj, null));
    }

    /* renamed from: e */
    public static final q4g m46202e(v37 v37Var, h84 h84Var, imf imfVar, Object obj) {
        hmf hmfVarM46200c = m46200c(v37Var, 1);
        cqb cqbVarM47838a = s4g.m47838a(obj);
        return new sce(cqbVarM47838a, m46201d(h84Var, hmfVarM46200c.f27193d, hmfVarM46200c.f27190a, cqbVarM47838a, imfVar, obj));
    }
}
