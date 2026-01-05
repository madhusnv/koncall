package p001o;

/* loaded from: classes6.dex */
public final class rg2 extends pg2 {

    /* renamed from: e */
    public final ql7 f43530e;

    /* renamed from: o.rg2$a */
    public static final class C16605a extends jgg implements nl7 {

        /* renamed from: a */
        public int f43531a;

        /* renamed from: b */
        public /* synthetic */ Object f43532b;

        /* renamed from: d */
        public final /* synthetic */ z37 f43534d;

        /* renamed from: o.rg2$a$a */
        public static final class a implements z37 {

            /* renamed from: a */
            public final /* synthetic */ gge f43535a;

            /* renamed from: b */
            public final /* synthetic */ h84 f43536b;

            /* renamed from: c */
            public final /* synthetic */ rg2 f43537c;

            /* renamed from: d */
            public final /* synthetic */ z37 f43538d;

            /* renamed from: o.rg2$a$a$a, reason: collision with other inner class name */
            public static final class C19593a extends jgg implements nl7 {

                /* renamed from: a */
                public int f43539a;

                /* renamed from: b */
                public final /* synthetic */ rg2 f43540b;

                /* renamed from: c */
                public final /* synthetic */ z37 f43541c;

                /* renamed from: d */
                public final /* synthetic */ Object f43542d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19593a(rg2 rg2Var, z37 z37Var, Object obj, n64 n64Var) {
                    super(2, n64Var);
                    this.f43540b = rg2Var;
                    this.f43541c = z37Var;
                    this.f43542d = obj;
                }

                @Override // p001o.vb1
                public final n64 create(Object obj, n64 n64Var) {
                    return new C19593a(this.f43540b, this.f43541c, this.f43542d, n64Var);
                }

                @Override // p001o.vb1
                public final Object invokeSuspend(Object obj) {
                    Object objM51918f = uq8.m51918f();
                    int i = this.f43539a;
                    if (i == 0) {
                        wre.m54934b(obj);
                        ql7 ql7Var = this.f43540b.f43530e;
                        z37 z37Var = this.f43541c;
                        Object obj2 = this.f43542d;
                        this.f43539a = 1;
                        if (ql7Var.invoke(z37Var, obj2, this) == objM51918f) {
                            return objM51918f;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        wre.m54934b(obj);
                    }
                    return y3i.f54824a;
                }

                @Override // p001o.nl7
                public final Object invoke(h84 h84Var, n64 n64Var) {
                    return ((C19593a) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
                }
            }

            /* renamed from: o.rg2$a$a$b */
            public static final class b extends o64 {

                /* renamed from: a */
                public Object f43543a;

                /* renamed from: b */
                public Object f43544b;

                /* renamed from: c */
                public Object f43545c;

                /* renamed from: d */
                public /* synthetic */ Object f43546d;

                /* renamed from: f */
                public int f43548f;

                public b(n64 n64Var) {
                    super(n64Var);
                }

                @Override // p001o.vb1
                public final Object invokeSuspend(Object obj) {
                    this.f43546d = obj;
                    this.f43548f |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(gge ggeVar, h84 h84Var, rg2 rg2Var, z37 z37Var) {
                this.f43535a = ggeVar;
                this.f43536b = h84Var;
                this.f43537c = rg2Var;
                this.f43538d = z37Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // p001o.z37
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, n64 n64Var) {
                b bVar;
                a aVar;
                if (n64Var instanceof b) {
                    bVar = (b) n64Var;
                    int i = bVar.f43548f;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        bVar.f43548f = i - Integer.MIN_VALUE;
                    } else {
                        bVar = new b(n64Var);
                    }
                }
                Object obj2 = bVar.f43546d;
                Object objM51918f = uq8.m51918f();
                int i2 = bVar.f43548f;
                if (i2 == 0) {
                    wre.m54934b(obj2);
                    p69 p69Var = (p69) this.f43535a.f25106a;
                    if (p69Var != null) {
                        p69Var.mo22429f(new a93());
                        bVar.f43543a = this;
                        bVar.f43544b = obj;
                        bVar.f43545c = p69Var;
                        bVar.f43548f = 1;
                        if (p69Var.d0(bVar) == objM51918f) {
                            return objM51918f;
                        }
                    }
                    aVar = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = bVar.f43544b;
                    aVar = (a) bVar.f43543a;
                    wre.m54934b(obj2);
                }
                aVar.f43535a.f25106a = rm1.m46952d(aVar.f43536b, null, l84.UNDISPATCHED, new C19593a(aVar.f43537c, aVar.f43538d, obj, null), 1, null);
                return y3i.f54824a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16605a(z37 z37Var, n64 n64Var) {
            super(2, n64Var);
            this.f43534d = z37Var;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C16605a c16605a = rg2.this.new C16605a(this.f43534d, n64Var);
            c16605a.f43532b = obj;
            return c16605a;
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f43531a;
            if (i == 0) {
                wre.m54934b(obj);
                h84 h84Var = (h84) this.f43532b;
                gge ggeVar = new gge();
                rg2 rg2Var = rg2.this;
                v37 v37Var = rg2Var.f40024d;
                a aVar = new a(ggeVar, h84Var, rg2Var, this.f43534d);
                this.f43531a = 1;
                if (v37Var.mo9775a(aVar, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C16605a) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public /* synthetic */ rg2(ql7 ql7Var, v37 v37Var, q74 q74Var, int i, wl1 wl1Var, int i2, id5 id5Var) {
        this(ql7Var, v37Var, (i2 & 4) != 0 ? e66.f21035a : q74Var, (i2 & 8) != 0 ? -2 : i, (i2 & 16) != 0 ? wl1.SUSPEND : wl1Var);
    }

    @Override // p001o.mg2
    /* renamed from: i */
    public mg2 mo20155i(q74 q74Var, int i, wl1 wl1Var) {
        return new rg2(this.f43530e, this.f40024d, q74Var, i, wl1Var);
    }

    @Override // p001o.pg2
    /* renamed from: q */
    public Object mo43602q(z37 z37Var, n64 n64Var) {
        Object objM31711e = i84.m31711e(new C16605a(z37Var, null), n64Var);
        return objM31711e == uq8.m51918f() ? objM31711e : y3i.f54824a;
    }

    public rg2(ql7 ql7Var, v37 v37Var, q74 q74Var, int i, wl1 wl1Var) {
        super(v37Var, q74Var, i, wl1Var);
        this.f43530e = ql7Var;
    }
}
