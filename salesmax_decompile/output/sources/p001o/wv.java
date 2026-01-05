package p001o;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import p001o.cce;
import p001o.fmh;
import p001o.k16;
import p001o.wv;

/* loaded from: classes3.dex */
public final class wv implements cce {

    /* renamed from: j */
    public static final C17965a f52683j = new C17965a(null);

    /* renamed from: a */
    public final C17966b f52684a;

    /* renamed from: b */
    public final fmh f52685b;

    /* renamed from: c */
    public final yv f52686c;

    /* renamed from: d */
    public final bd4 f52687d;

    /* renamed from: e */
    public double f52688e;

    /* renamed from: f */
    public ulh f52689f;

    /* renamed from: g */
    public double f52690g;

    /* renamed from: h */
    public double f52691h;

    /* renamed from: i */
    public final nqb f52692i;

    /* renamed from: o.wv$a */
    public static final class C17965a implements o06 {
        public C17965a() {
        }

        public /* synthetic */ C17965a(id5 id5Var) {
            this();
        }

        @Override // p001o.o06
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public wv mo19519a(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            C17966b.a aVar = new C17966b.a();
            xk7Var.invoke(aVar);
            return new wv(new C17966b(aVar));
        }
    }

    /* renamed from: o.wv$b */
    public static final class C17966b implements cce.InterfaceC12636a {

        /* renamed from: g */
        public static final b f52693g = new b(null);

        /* renamed from: h */
        public static final C17966b f52694h = new C17966b(new a());

        /* renamed from: a */
        public final double f52695a;

        /* renamed from: b */
        public final long f52696b;

        /* renamed from: c */
        public final double f52697c;

        /* renamed from: d */
        public final double f52698d;

        /* renamed from: e */
        public final double f52699e;

        /* renamed from: f */
        public final double f52700f;

        /* renamed from: o.wv$b$a */
        public static final class a implements cce.InterfaceC12636a.a {

            /* renamed from: a */
            public double f52701a = 0.7d;

            /* renamed from: b */
            public long f52702b;

            /* renamed from: c */
            public double f52703c;

            /* renamed from: d */
            public double f52704d;

            /* renamed from: e */
            public double f52705e;

            /* renamed from: f */
            public double f52706f;

            public a() {
                k16.C14700a c14700a = k16.f31358b;
                this.f52702b = m16.m38174r(0.5d, o16.SECONDS);
                this.f52703c = 1.0d;
                this.f52704d = 0.5d;
                this.f52705e = 0.4d;
                this.f52706f = 0.8d;
            }

            /* renamed from: a */
            public final double m55065a() {
                return this.f52701a;
            }

            /* renamed from: b */
            public final long m55066b() {
                return this.f52702b;
            }

            /* renamed from: c */
            public final double m55067c() {
                return this.f52703c;
            }

            /* renamed from: d */
            public final double m55068d() {
                return this.f52704d;
            }

            /* renamed from: e */
            public final double m55069e() {
                return this.f52705e;
            }

            /* renamed from: f */
            public final double m55070f() {
                return this.f52706f;
            }

            /* renamed from: g */
            public final void m55071g(double d) {
                this.f52701a = d;
            }

            /* renamed from: h */
            public final void m55072h(long j) {
                this.f52702b = j;
            }

            /* renamed from: i */
            public final void m55073i(double d) {
                this.f52703c = d;
            }

            /* renamed from: j */
            public final void m55074j(double d) {
                this.f52704d = d;
            }

            /* renamed from: k */
            public final void m55075k(double d) {
                this.f52705e = d;
            }

            /* renamed from: l */
            public final void m55076l(double d) {
                this.f52706f = d;
            }
        }

        /* renamed from: o.wv$b$b */
        public static final class b {
            public b() {
            }

            public /* synthetic */ b(id5 id5Var) {
                this();
            }
        }

        public C17966b(a aVar) {
            sq8.m48649h(aVar, "builder");
            this.f52695a = aVar.m55065a();
            this.f52696b = aVar.m55066b();
            this.f52697c = aVar.m55067c();
            this.f52698d = aVar.m55068d();
            this.f52699e = aVar.m55069e();
            this.f52700f = aVar.m55070f();
        }

        /* renamed from: i */
        public static final y3i m55058i(C17966b c17966b, cce.InterfaceC12636a.a aVar) {
            sq8.m48649h(aVar, "<this>");
            if (aVar instanceof a) {
                a aVar2 = (a) aVar;
                aVar2.m55071g(c17966b.f52695a);
                aVar2.m55072h(c17966b.f52696b);
                aVar2.m55073i(c17966b.f52697c);
                aVar2.m55074j(c17966b.f52698d);
                aVar2.m55075k(c17966b.f52699e);
                aVar2.m55076l(c17966b.f52700f);
            }
            return y3i.f54824a;
        }

        @Override // p001o.cce.InterfaceC12636a
        /* renamed from: a */
        public xk7 mo20852a() {
            return new xk7() { // from class: o.xv
                @Override // p001o.xk7
                public final Object invoke(Object obj) {
                    return wv.C17966b.m55058i(this.f54319a, (cce.InterfaceC12636a.a) obj);
                }
            };
        }

        /* renamed from: c */
        public final double m55059c() {
            return this.f52695a;
        }

        /* renamed from: d */
        public final long m55060d() {
            return this.f52696b;
        }

        /* renamed from: e */
        public final double m55061e() {
            return this.f52697c;
        }

        /* renamed from: f */
        public final double m55062f() {
            return this.f52698d;
        }

        /* renamed from: g */
        public final double m55063g() {
            return this.f52699e;
        }

        /* renamed from: h */
        public final double m55064h() {
            return this.f52700f;
        }
    }

    /* renamed from: o.wv$c */
    public static final class C17967c extends o64 {

        /* renamed from: a */
        public Object f52707a;

        /* renamed from: b */
        public Object f52708b;

        /* renamed from: c */
        public int f52709c;

        /* renamed from: d */
        public /* synthetic */ Object f52710d;

        /* renamed from: f */
        public int f52712f;

        public C17967c(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f52710d = obj;
            this.f52712f |= Integer.MIN_VALUE;
            return wv.this.mo20850a(0, this);
        }
    }

    /* renamed from: o.wv$d */
    public static final class C17968d extends o64 {

        /* renamed from: a */
        public Object f52713a;

        /* renamed from: b */
        public Object f52714b;

        /* renamed from: c */
        public Object f52715c;

        /* renamed from: d */
        public /* synthetic */ Object f52716d;

        /* renamed from: f */
        public int f52718f;

        public C17968d(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f52716d = obj;
            this.f52718f |= Integer.MIN_VALUE;
            return wv.this.mo20851b(null, this);
        }
    }

    public wv(C17966b c17966b, fmh fmhVar, yv yvVar, bd4 bd4Var) {
        sq8.m48649h(c17966b, "config");
        sq8.m48649h(fmhVar, "timeSource");
        sq8.m48649h(yvVar, "rateMeasurer");
        sq8.m48649h(bd4Var, "rateCalculator");
        this.f52684a = c17966b;
        this.f52685b = fmhVar;
        this.f52686c = yvVar;
        this.f52687d = bd4Var;
        this.f52692i = tqb.m50340b(false, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p001o.cce
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo20850a(int i, n64 n64Var) throws Throwable {
        C17967c c17967c;
        nqb nqbVar;
        wv wvVar;
        Throwable th;
        nqb nqbVar2;
        wv wvVar2;
        if (n64Var instanceof C17967c) {
            c17967c = (C17967c) n64Var;
            int i2 = c17967c.f52712f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c17967c.f52712f = i2 - Integer.MIN_VALUE;
            } else {
                c17967c = new C17967c(n64Var);
            }
        }
        Object obj = c17967c.f52710d;
        Object objM51918f = uq8.m51918f();
        int i3 = c17967c.f52712f;
        try {
            if (i3 == 0) {
                wre.m54934b(obj);
                nqbVar = this.f52692i;
                c17967c.f52707a = this;
                c17967c.f52708b = nqbVar;
                c17967c.f52709c = i;
                c17967c.f52712f = 1;
                if (nqbVar.mo40922b(null, c17967c) == objM51918f) {
                    return objM51918f;
                }
                wvVar = this;
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    nqbVar2 = (nqb) c17967c.f52708b;
                    wvVar2 = (wv) c17967c.f52707a;
                    try {
                        wre.m54934b(obj);
                        wvVar2.f52688e = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                        y3i y3iVar = y3i.f54824a;
                        nqbVar2.mo40923c(null);
                        return y3iVar;
                    } catch (Throwable th2) {
                        th = th2;
                        nqbVar2.mo40923c(null);
                        throw th;
                    }
                }
                i = c17967c.f52709c;
                nqb nqbVar3 = (nqb) c17967c.f52708b;
                wvVar = (wv) c17967c.f52707a;
                wre.m54934b(obj);
                nqbVar = nqbVar3;
            }
            if (wvVar.f52687d.m18634e()) {
                wvVar.m55054d();
                double d = i;
                double d2 = wvVar.f52688e;
                if (d > d2) {
                    k16.C14700a c14700a = k16.f31358b;
                    long jM38174r = m16.m38174r((d - d2) / wvVar.f52690g, o16.SECONDS);
                    c17967c.f52707a = wvVar;
                    c17967c.f52708b = nqbVar;
                    c17967c.f52712f = 2;
                    if (nk5.m40721c(jM38174r, c17967c) == objM51918f) {
                        return objM51918f;
                    }
                    nqbVar2 = nqbVar;
                    wvVar2 = wvVar;
                    wvVar2.f52688e = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                    y3i y3iVar2 = y3i.f54824a;
                    nqbVar2.mo40923c(null);
                    return y3iVar2;
                }
                wvVar.f52688e = d2 - d;
            }
            nqbVar2 = nqbVar;
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p001o.cce
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo20851b(fse fseVar, n64 n64Var) {
        C17968d c17968d;
        wv wvVar;
        fse fseVar2;
        nqb nqbVar;
        if (n64Var instanceof C17968d) {
            c17968d = (C17968d) n64Var;
            int i = c17968d.f52718f;
            if ((i & Integer.MIN_VALUE) != 0) {
                c17968d.f52718f = i - Integer.MIN_VALUE;
            } else {
                c17968d = new C17968d(n64Var);
            }
        }
        Object obj = c17968d.f52716d;
        Object objM51918f = uq8.m51918f();
        int i2 = c17968d.f52718f;
        if (i2 == 0) {
            wre.m54934b(obj);
            nqb nqbVar2 = this.f52692i;
            c17968d.f52713a = this;
            c17968d.f52714b = fseVar;
            c17968d.f52715c = nqbVar2;
            c17968d.f52718f = 1;
            if (nqbVar2.mo40922b(null, c17968d) == objM51918f) {
                return objM51918f;
            }
            wvVar = this;
            fseVar2 = fseVar;
            nqbVar = nqbVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nqbVar = (nqb) c17968d.f52715c;
            fse fseVar3 = (fse) c17968d.f52714b;
            wvVar = (wv) c17968d.f52713a;
            wre.m54934b(obj);
            fseVar2 = fseVar3;
        }
        try {
            double dM58353a = wvVar.f52686c.m58353a();
            wvVar.m55055e(Math.min(wvVar.f52687d.m18630a(fseVar2, dM58353a, wvVar.f52690g), 2 * dM58353a));
            return y3i.f54824a;
        } finally {
            nqbVar.mo40923c(null);
        }
    }

    @Override // p001o.cce
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C17966b getConfig() {
        return this.f52684a;
    }

    /* renamed from: d */
    public final void m55054d() {
        ulh ulhVar = this.f52689f;
        if (ulhVar != null) {
            this.f52688e = Math.min(this.f52691h, this.f52688e + (this.f52690g * k16.m34873S(ulhVar.mo27104a(), o16.SECONDS)));
        }
        this.f52689f = this.f52685b.mo27091a();
    }

    /* renamed from: e */
    public final void m55055e(double d) {
        m55054d();
        this.f52690g = Math.max(d, getConfig().m55062f());
        double dMax = Math.max(d, getConfig().m55061e());
        this.f52691h = dMax;
        this.f52688e = Math.min(this.f52688e, dMax);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public wv(C17966b c17966b) {
        sq8.m48649h(c17966b, "config");
        fmh.C13489a c13489a = fmh.C13489a.f23681a;
        this(c17966b, c13489a, new yv(c17966b, c13489a, null, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 0, 28, null), new bd4(c17966b, c13489a, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, null, 12, null));
    }
}
