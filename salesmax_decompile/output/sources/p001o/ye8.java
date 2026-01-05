package p001o;

/* loaded from: classes2.dex */
public final class ye8 implements h86 {

    /* renamed from: a */
    public final r9d f55341a;

    /* renamed from: b */
    public final d86 f55342b;

    /* renamed from: c */
    public final ii9 f55343c;

    /* renamed from: d */
    public final ii9 f55344d;

    /* renamed from: o.ye8$a */
    public static final class C18386a extends jgg implements xk7 {

        /* renamed from: a */
        public int f55345a;

        public C18386a(n64 n64Var) {
            super(1, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return ye8.this.new C18386a(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f55345a;
            if (i == 0) {
                wre.m54934b(obj);
                r9d r9dVar = ye8.this.f55341a;
                this.f55345a = 1;
                obj = n71.m40193c(r9dVar, null, null, this, 6, null);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return ((r81) obj).m46332a();
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C18386a) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.ye8$b */
    public static final class C18387b extends o64 {

        /* renamed from: a */
        public /* synthetic */ Object f55347a;

        /* renamed from: c */
        public int f55349c;

        public C18387b(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f55347a = obj;
            this.f55349c |= Integer.MIN_VALUE;
            return ye8.this.m57696i(this);
        }
    }

    /* renamed from: o.ye8$c */
    public static final class C18388c extends o64 {

        /* renamed from: a */
        public /* synthetic */ Object f55350a;

        /* renamed from: c */
        public int f55352c;

        public C18388c(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f55350a = obj;
            this.f55352c |= Integer.MIN_VALUE;
            return ye8.this.m57698k(this);
        }
    }

    /* renamed from: o.ye8$d */
    public static final class C18389d extends o64 {

        /* renamed from: a */
        public Object f55353a;

        /* renamed from: b */
        public /* synthetic */ Object f55354b;

        /* renamed from: d */
        public int f55356d;

        public C18389d(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f55354b = obj;
            this.f55356d |= Integer.MIN_VALUE;
            return ye8.this.m57699l(this);
        }
    }

    /* renamed from: o.ye8$e */
    public /* synthetic */ class C18390e extends dm7 implements xk7 {
        public C18390e(Object obj) {
            super(1, obj, ye8.class, "doResolveEndpoint", "doResolveEndpoint(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // p001o.xk7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(n64 n64Var) {
            return ((ye8) this.receiver).m57694g(n64Var);
        }
    }

    public ye8(r9d r9dVar, d86 d86Var) {
        sq8.m48649h(r9dVar, "platformProvider");
        sq8.m48649h(d86Var, "endpointConfiguration");
        this.f55341a = r9dVar;
        this.f55342b = d86Var;
        this.f55343c = ki9.m35729a(new C18390e(this));
        this.f55344d = ki9.m35729a(new C18386a(null));
    }

    @Override // p001o.h86
    /* renamed from: a */
    public Object mo29972a(rne rneVar, n64 n64Var) {
        return m57700m(n64Var);
    }

    /* renamed from: g */
    public final Object m57694g(n64 n64Var) {
        return m57699l(n64Var);
    }

    /* renamed from: h */
    public final b86 m57695h() {
        String str = (String) bj6.m19237f(o81.f37890a.m41737j(), this.f55341a);
        if (str != null) {
            return ze8.m59345a(str);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m57696i(n64 n64Var) {
        C18387b c18387b;
        if (n64Var instanceof C18387b) {
            c18387b = (C18387b) n64Var;
            int i = c18387b.f55349c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c18387b.f55349c = i - Integer.MIN_VALUE;
            } else {
                c18387b = new C18387b(n64Var);
            }
        }
        Object objMo32174a = c18387b.f55347a;
        Object objM51918f = uq8.m51918f();
        int i2 = c18387b.f55349c;
        if (i2 == 0) {
            wre.m54934b(objMo32174a);
            ii9 ii9Var = this.f55344d;
            c18387b.f55349c = 1;
            objMo32174a = ii9Var.mo32174a(c18387b);
            if (objMo32174a == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(objMo32174a);
        }
        String strM53203d = vq3.m53203d((vq3) objMo32174a, "ec2_metadata_service_endpoint", null, 2, null);
        if (strM53203d != null) {
            return ze8.m59345a(strM53203d);
        }
        return null;
    }

    /* renamed from: j */
    public final e86 m57697j() {
        String str = (String) bj6.m19237f(o81.f37890a.m41738k(), this.f55341a);
        if (str != null) {
            return e86.Companion.m24522a(str);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m57698k(n64 n64Var) {
        C18388c c18388c;
        if (n64Var instanceof C18388c) {
            c18388c = (C18388c) n64Var;
            int i = c18388c.f55352c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c18388c.f55352c = i - Integer.MIN_VALUE;
            } else {
                c18388c = new C18388c(n64Var);
            }
        }
        Object objMo32174a = c18388c.f55350a;
        Object objM51918f = uq8.m51918f();
        int i2 = c18388c.f55352c;
        if (i2 == 0) {
            wre.m54934b(objMo32174a);
            ii9 ii9Var = this.f55344d;
            c18388c.f55352c = 1;
            objMo32174a = ii9Var.mo32174a(c18388c);
            if (objMo32174a == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(objMo32174a);
        }
        String strM53203d = vq3.m53203d((vq3) objMo32174a, "ec2_metadata_service_endpoint_mode", null, 2, null);
        if (strM53203d != null) {
            return e86.Companion.m24522a(strM53203d);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m57699l(n64 n64Var) {
        C18389d c18389d;
        b86 b86VarM57695h;
        ye8 ye8Var;
        e86 e86VarM57697j;
        if (n64Var instanceof C18389d) {
            c18389d = (C18389d) n64Var;
            int i = c18389d.f55356d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c18389d.f55356d = i - Integer.MIN_VALUE;
            } else {
                c18389d = new C18389d(n64Var);
            }
        }
        Object objM57696i = c18389d.f55354b;
        Object objM51918f = uq8.m51918f();
        int i2 = c18389d.f55356d;
        if (i2 == 0) {
            wre.m54934b(objM57696i);
            b86VarM57695h = m57695h();
            if (b86VarM57695h != null) {
                ye8Var = this;
                if (b86VarM57695h == null) {
                    return b86VarM57695h;
                }
                d86 d86Var = ye8Var.f55342b;
                e86VarM57697j = ye8Var.m57697j();
                if (e86VarM57697j == null) {
                    c18389d.f55353a = null;
                    c18389d.f55356d = 2;
                    objM57696i = ye8Var.m57698k(c18389d);
                    if (objM57696i == objM51918f) {
                        return objM51918f;
                    }
                    e86VarM57697j = (e86) objM57696i;
                    if (e86VarM57697j == null) {
                    }
                }
                return e86VarM57697j.getDefaultEndpoint$aws_config();
            }
            c18389d.f55353a = this;
            c18389d.f55356d = 1;
            objM57696i = m57696i(c18389d);
            if (objM57696i == objM51918f) {
                return objM51918f;
            }
            ye8Var = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(objM57696i);
                e86VarM57697j = (e86) objM57696i;
                if (e86VarM57697j == null) {
                    e86VarM57697j = e86.IPv4;
                }
                return e86VarM57697j.getDefaultEndpoint$aws_config();
            }
            ye8Var = (ye8) c18389d.f55353a;
            wre.m54934b(objM57696i);
        }
        b86VarM57695h = (b86) objM57696i;
        if (b86VarM57695h == null) {
        }
    }

    /* renamed from: m */
    public final Object m57700m(n64 n64Var) {
        return this.f55343c.mo32174a(n64Var);
    }
}
