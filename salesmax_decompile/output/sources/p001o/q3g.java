package p001o;

import p001o.cte;
import p001o.fmh;
import p001o.k16;
import p001o.q3g;

/* loaded from: classes3.dex */
public final class q3g implements cte {

    /* renamed from: f */
    public static final C16282a f41223f = new C16282a(null);

    /* renamed from: a */
    public final C16283b f41224a;

    /* renamed from: b */
    public final fmh f41225b;

    /* renamed from: c */
    public int f41226c;

    /* renamed from: d */
    public ulh f41227d;

    /* renamed from: e */
    public final nqb f41228e;

    /* renamed from: o.q3g$a */
    public static final class C16282a implements o06 {
        public C16282a() {
        }

        public /* synthetic */ C16282a(id5 id5Var) {
            this();
        }

        @Override // p001o.o06
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public q3g mo19519a(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            C16283b.a aVar = new C16283b.a();
            xk7Var.invoke(aVar);
            return new q3g(new C16283b(aVar));
        }
    }

    /* renamed from: o.q3g$b */
    public static final class C16283b implements cte.InterfaceC12745a {

        /* renamed from: h */
        public static final b f41229h = new b(null);

        /* renamed from: i */
        public static final C16283b f41230i = new C16283b(new a());

        /* renamed from: a */
        public final boolean f41231a;

        /* renamed from: b */
        public final int f41232b;

        /* renamed from: c */
        public final int f41233c;

        /* renamed from: d */
        public final int f41234d;

        /* renamed from: e */
        public final int f41235e;

        /* renamed from: f */
        public final int f41236f;

        /* renamed from: g */
        public final int f41237g;

        /* renamed from: o.q3g$b$a */
        public static final class a implements cte.InterfaceC12745a.a {

            /* renamed from: b */
            public int f41239b;

            /* renamed from: e */
            public int f41242e;

            /* renamed from: a */
            public boolean f41238a = true;

            /* renamed from: c */
            public int f41240c = 1;

            /* renamed from: d */
            public int f41241d = 500;

            /* renamed from: f */
            public int f41243f = 5;

            /* renamed from: g */
            public int f41244g = 10;

            /* renamed from: a */
            public final int m44784a() {
                return this.f41239b;
            }

            /* renamed from: b */
            public final int m44785b() {
                return this.f41240c;
            }

            /* renamed from: c */
            public final int m44786c() {
                return this.f41241d;
            }

            /* renamed from: d */
            public final int m44787d() {
                return this.f41242e;
            }

            /* renamed from: e */
            public final int m44788e() {
                return this.f41243f;
            }

            /* renamed from: f */
            public final int m44789f() {
                return this.f41244g;
            }

            /* renamed from: g */
            public final boolean m44790g() {
                return this.f41238a;
            }

            /* renamed from: h */
            public final void m44791h(int i) {
                this.f41239b = i;
            }

            /* renamed from: i */
            public final void m44792i(int i) {
                this.f41240c = i;
            }

            /* renamed from: j */
            public final void m44793j(int i) {
                this.f41241d = i;
            }

            /* renamed from: k */
            public final void m44794k(int i) {
                if (i == 0) {
                    this.f41238a = true;
                }
                this.f41242e = i;
            }

            /* renamed from: l */
            public final void m44795l(int i) {
                this.f41243f = i;
            }

            /* renamed from: m */
            public final void m44796m(int i) {
                this.f41244g = i;
            }

            /* renamed from: n */
            public final void m44797n(boolean z) {
                this.f41238a = z;
            }
        }

        /* renamed from: o.q3g$b$b */
        public static final class b {
            public b() {
            }

            public /* synthetic */ b(id5 id5Var) {
                this();
            }
        }

        public C16283b(a aVar) {
            sq8.m48649h(aVar, "builder");
            this.f41231a = aVar.m44790g();
            this.f41232b = aVar.m44784a();
            this.f41233c = aVar.m44785b();
            this.f41234d = aVar.m44786c();
            this.f41235e = aVar.m44787d();
            this.f41236f = aVar.m44788e();
            this.f41237g = aVar.m44789f();
        }

        /* renamed from: j */
        public static final y3i m44776j(C16283b c16283b, cte.InterfaceC12745a.a aVar) {
            sq8.m48649h(aVar, "<this>");
            if (aVar instanceof a) {
                a aVar2 = (a) aVar;
                aVar2.m44797n(c16283b.f41231a);
                aVar2.m44791h(c16283b.f41232b);
                aVar2.m44792i(c16283b.f41233c);
                aVar2.m44793j(c16283b.f41234d);
                aVar2.m44794k(c16283b.f41235e);
                aVar2.m44795l(c16283b.f41236f);
                aVar2.m44796m(c16283b.f41237g);
            }
            return y3i.f54824a;
        }

        @Override // p001o.cte.InterfaceC12745a
        /* renamed from: a */
        public xk7 mo21795a() {
            return new xk7() { // from class: o.r3g
                @Override // p001o.xk7
                public final Object invoke(Object obj) {
                    return q3g.C16283b.m44776j(this.f42900a, (cte.InterfaceC12745a.a) obj);
                }
            };
        }

        /* renamed from: c */
        public final int m44777c() {
            return this.f41232b;
        }

        /* renamed from: d */
        public final int m44778d() {
            return this.f41233c;
        }

        /* renamed from: e */
        public final int m44779e() {
            return this.f41234d;
        }

        /* renamed from: f */
        public final int m44780f() {
            return this.f41235e;
        }

        /* renamed from: g */
        public final int m44781g() {
            return this.f41236f;
        }

        /* renamed from: h */
        public final int m44782h() {
            return this.f41237g;
        }

        /* renamed from: i */
        public final boolean m44783i() {
            return this.f41231a;
        }
    }

    /* renamed from: o.q3g$c */
    public final class C16284c implements bte {

        /* renamed from: a */
        public final int f41245a;

        /* renamed from: o.q3g$c$a */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f41247a;

            static {
                int[] iArr = new int[fse.values().length];
                try {
                    iArr[fse.Transient.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[fse.Throttling.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f41247a = iArr;
            }
        }

        /* renamed from: o.q3g$c$b */
        public static final class b extends o64 {

            /* renamed from: a */
            public Object f41248a;

            /* renamed from: b */
            public int f41249b;

            /* renamed from: c */
            public /* synthetic */ Object f41250c;

            /* renamed from: e */
            public int f41252e;

            public b(n64 n64Var) {
                super(n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                this.f41250c = obj;
                this.f41252e |= Integer.MIN_VALUE;
                return C16284c.this.mo19784c(null, this);
            }
        }

        public C16284c(int i) {
            this.f41245a = i;
        }

        @Override // p001o.bte
        /* renamed from: a */
        public Object mo19782a(n64 n64Var) {
            Object objM44773g = q3g.this.m44773g(this.f41245a, n64Var);
            return objM44773g == uq8.m51918f() ? objM44773g : y3i.f54824a;
        }

        @Override // p001o.bte
        /* renamed from: b */
        public Object mo19783b(n64 n64Var) {
            return y3i.f54824a;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p001o.bte
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object mo19784c(fse fseVar, n64 n64Var) {
            b bVar;
            int iM44782h;
            C16284c c16284c;
            if (n64Var instanceof b) {
                bVar = (b) n64Var;
                int i = bVar.f41252e;
                if ((i & Integer.MIN_VALUE) != 0) {
                    bVar.f41252e = i - Integer.MIN_VALUE;
                } else {
                    bVar = new b(n64Var);
                }
            }
            Object obj = bVar.f41250c;
            Object objM51918f = uq8.m51918f();
            int i2 = bVar.f41252e;
            if (i2 == 0) {
                wre.m54934b(obj);
                int i3 = a.f41247a[fseVar.ordinal()];
                iM44782h = (i3 == 1 || i3 == 2) ? q3g.this.getConfig().m44782h() : q3g.this.getConfig().m44781g();
                q3g q3gVar = q3g.this;
                bVar.f41248a = this;
                bVar.f41249b = iM44782h;
                bVar.f41252e = 1;
                if (q3gVar.m44770d(iM44782h, bVar) == objM51918f) {
                    return objM51918f;
                }
                c16284c = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iM44782h = bVar.f41249b;
                c16284c = (C16284c) bVar.f41248a;
                wre.m54934b(obj);
            }
            return q3g.this.new C16284c(iM44782h);
        }
    }

    /* renamed from: o.q3g$d */
    public static final class C16285d extends o64 {

        /* renamed from: a */
        public Object f41253a;

        /* renamed from: b */
        public /* synthetic */ Object f41254b;

        /* renamed from: d */
        public int f41256d;

        public C16285d(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f41254b = obj;
            this.f41256d |= Integer.MIN_VALUE;
            return q3g.this.mo21794a(this);
        }
    }

    /* renamed from: o.q3g$e */
    public static final class C16286e extends o64 {

        /* renamed from: a */
        public Object f41257a;

        /* renamed from: b */
        public Object f41258b;

        /* renamed from: c */
        public int f41259c;

        /* renamed from: d */
        public /* synthetic */ Object f41260d;

        /* renamed from: f */
        public int f41262f;

        public C16286e(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f41260d = obj;
            this.f41262f |= Integer.MIN_VALUE;
            return q3g.this.m44770d(0, this);
        }
    }

    /* renamed from: o.q3g$f */
    public static final class C16287f extends o64 {

        /* renamed from: a */
        public Object f41263a;

        /* renamed from: b */
        public Object f41264b;

        /* renamed from: c */
        public int f41265c;

        /* renamed from: d */
        public /* synthetic */ Object f41266d;

        /* renamed from: f */
        public int f41268f;

        public C16287f(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f41266d = obj;
            this.f41268f |= Integer.MIN_VALUE;
            return q3g.this.m44773g(0, this);
        }
    }

    public q3g(C16283b c16283b, fmh fmhVar) {
        sq8.m48649h(c16283b, "config");
        sq8.m48649h(fmhVar, "timeSource");
        this.f41224a = c16283b;
        this.f41225b = fmhVar;
        this.f41226c = getConfig().m44779e();
        this.f41227d = fmhVar.mo27091a();
        this.f41228e = tqb.m50340b(false, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p001o.cte
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo21794a(n64 n64Var) {
        C16285d c16285d;
        q3g q3gVar;
        if (n64Var instanceof C16285d) {
            c16285d = (C16285d) n64Var;
            int i = c16285d.f41256d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16285d.f41256d = i - Integer.MIN_VALUE;
            } else {
                c16285d = new C16285d(n64Var);
            }
        }
        Object obj = c16285d.f41254b;
        Object objM51918f = uq8.m51918f();
        int i2 = c16285d.f41256d;
        if (i2 == 0) {
            wre.m54934b(obj);
            int iM44777c = getConfig().m44777c();
            c16285d.f41253a = this;
            c16285d.f41256d = 1;
            if (m44770d(iM44777c, c16285d) == objM51918f) {
                return objM51918f;
            }
            q3gVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q3gVar = (q3g) c16285d.f41253a;
            wre.m54934b(obj);
        }
        return q3gVar.new C16284c(q3gVar.getConfig().m44778d());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m44770d(int i, n64 n64Var) throws Throwable {
        C16286e c16286e;
        nqb nqbVar;
        q3g q3gVar;
        Throwable th;
        nqb nqbVar2;
        q3g q3gVar2;
        if (n64Var instanceof C16286e) {
            c16286e = (C16286e) n64Var;
            int i2 = c16286e.f41262f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c16286e.f41262f = i2 - Integer.MIN_VALUE;
            } else {
                c16286e = new C16286e(n64Var);
            }
        }
        Object obj = c16286e.f41260d;
        Object objM51918f = uq8.m51918f();
        int i3 = c16286e.f41262f;
        try {
            if (i3 == 0) {
                wre.m54934b(obj);
                nqbVar = this.f41228e;
                c16286e.f41257a = this;
                c16286e.f41258b = nqbVar;
                c16286e.f41259c = i;
                c16286e.f41262f = 1;
                if (nqbVar.mo40922b(null, c16286e) == objM51918f) {
                    return objM51918f;
                }
                q3gVar = this;
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    nqbVar2 = (nqb) c16286e.f41258b;
                    q3gVar2 = (q3g) c16286e.f41257a;
                    try {
                        wre.m54934b(obj);
                        q3gVar2.f41226c = 0;
                        q3gVar = q3gVar2;
                        q3gVar.f41227d = q3gVar.f41225b.mo27091a();
                        y3i y3iVar = y3i.f54824a;
                        nqbVar2.mo40923c(null);
                        return y3iVar;
                    } catch (Throwable th2) {
                        th = th2;
                        nqbVar2.mo40923c(null);
                        throw th;
                    }
                }
                i = c16286e.f41259c;
                nqb nqbVar3 = (nqb) c16286e.f41258b;
                q3gVar = (q3g) c16286e.f41257a;
                wre.m54934b(obj);
                nqbVar = nqbVar3;
            }
            q3gVar.m44772f();
            int i4 = q3gVar.f41226c;
            if (i <= i4) {
                q3gVar.f41226c = i4 - i;
                nqbVar2 = nqbVar;
                q3gVar.f41227d = q3gVar.f41225b.mo27091a();
                y3i y3iVar2 = y3i.f54824a;
                nqbVar2.mo40923c(null);
                return y3iVar2;
            }
            if (q3gVar.getConfig().m44783i()) {
                throw new dse("Insufficient capacity to attempt another retry");
            }
            int i5 = i - q3gVar.f41226c;
            k16.C14700a c14700a = k16.f31358b;
            long jM38174r = m16.m38174r(Math.ceil(i5 / q3gVar.getConfig().m44780f()), o16.SECONDS);
            c16286e.f41257a = q3gVar;
            c16286e.f41258b = nqbVar;
            c16286e.f41262f = 2;
            if (nk5.m40721c(jM38174r, c16286e) == objM51918f) {
                return objM51918f;
            }
            nqbVar2 = nqbVar;
            q3gVar2 = q3gVar;
            q3gVar2.f41226c = 0;
            q3gVar = q3gVar2;
            q3gVar.f41227d = q3gVar.f41225b.mo27091a();
            y3i y3iVar22 = y3i.f54824a;
            nqbVar2.mo40923c(null);
            return y3iVar22;
        } catch (Throwable th3) {
            nqb nqbVar4 = nqbVar;
            th = th3;
            nqbVar2 = nqbVar4;
            nqbVar2.mo40923c(null);
            throw th;
        }
    }

    @Override // p001o.cte
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C16283b getConfig() {
        return this.f41224a;
    }

    /* renamed from: f */
    public final void m44772f() {
        this.f41226c = Math.min(getConfig().m44779e(), this.f41226c + ((int) Math.floor(getConfig().m44780f() * k16.m34873S(this.f41227d.mo27104a(), o16.SECONDS))));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m44773g(int i, n64 n64Var) {
        C16287f c16287f;
        q3g q3gVar;
        nqb nqbVar;
        if (n64Var instanceof C16287f) {
            c16287f = (C16287f) n64Var;
            int i2 = c16287f.f41268f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c16287f.f41268f = i2 - Integer.MIN_VALUE;
            } else {
                c16287f = new C16287f(n64Var);
            }
        }
        Object obj = c16287f.f41266d;
        Object objM51918f = uq8.m51918f();
        int i3 = c16287f.f41268f;
        if (i3 == 0) {
            wre.m54934b(obj);
            nqb nqbVar2 = this.f41228e;
            c16287f.f41263a = this;
            c16287f.f41264b = nqbVar2;
            c16287f.f41265c = i;
            c16287f.f41268f = 1;
            if (nqbVar2.mo40922b(null, c16287f) == objM51918f) {
                return objM51918f;
            }
            q3gVar = this;
            nqbVar = nqbVar2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c16287f.f41265c;
            nqbVar = (nqb) c16287f.f41264b;
            q3gVar = (q3g) c16287f.f41263a;
            wre.m54934b(obj);
        }
        try {
            q3gVar.m44772f();
            q3gVar.f41226c = Math.min(q3gVar.getConfig().m44779e(), q3gVar.f41226c + i);
            q3gVar.f41227d = q3gVar.f41225b.mo27091a();
            return y3i.f54824a;
        } finally {
            nqbVar.mo40923c(null);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q3g(C16283b c16283b) {
        this(c16283b, fmh.C13489a.f23681a);
        sq8.m48649h(c16283b, "options");
    }
}
