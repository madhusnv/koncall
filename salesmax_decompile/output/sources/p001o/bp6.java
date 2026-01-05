package p001o;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import p001o.bp6;
import p001o.k16;
import p001o.qk5;
import p001o.vbe;

/* loaded from: classes3.dex */
public final class bp6 implements qk5 {

    /* renamed from: c */
    public static final C12467a f16648c = new C12467a(null);

    /* renamed from: a */
    public final C12468b f16649a;

    /* renamed from: b */
    public final vbe.C17544a f16650b;

    /* renamed from: o.bp6$a */
    public static final class C12467a implements o06 {
        public C12467a() {
        }

        public /* synthetic */ C12467a(id5 id5Var) {
            this();
        }

        @Override // p001o.o06
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public bp6 mo19519a(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            return new bp6(C12468b.f16651e.m19536a(xk7Var));
        }
    }

    /* renamed from: o.bp6$b */
    public static final class C12468b implements qk5.InterfaceC16417a {

        /* renamed from: e */
        public static final b f16651e = new b(null);

        /* renamed from: f */
        public static final C12468b f16652f = new C12468b(new a());

        /* renamed from: a */
        public final long f16653a;

        /* renamed from: b */
        public final double f16654b;

        /* renamed from: c */
        public final double f16655c;

        /* renamed from: d */
        public final long f16656d;

        /* renamed from: o.bp6$b$a */
        public static final class a implements qk5.InterfaceC16417a.a {

            /* renamed from: a */
            public long f16657a;

            /* renamed from: b */
            public double f16658b;

            /* renamed from: c */
            public double f16659c;

            /* renamed from: d */
            public long f16660d;

            public a() {
                k16.C14700a c14700a = k16.f31358b;
                this.f16657a = m16.m38175s(10, o16.MILLISECONDS);
                this.f16658b = 1.5d;
                this.f16659c = 1.0d;
                this.f16660d = m16.m38175s(20, o16.SECONDS);
            }

            /* renamed from: a */
            public final long m19528a() {
                return this.f16657a;
            }

            /* renamed from: b */
            public final double m19529b() {
                return this.f16659c;
            }

            /* renamed from: c */
            public final long m19530c() {
                return this.f16660d;
            }

            /* renamed from: d */
            public final double m19531d() {
                return this.f16658b;
            }

            /* renamed from: e */
            public final void m19532e(long j) {
                this.f16657a = j;
            }

            /* renamed from: f */
            public final void m19533f(double d) {
                this.f16659c = d;
            }

            /* renamed from: g */
            public final void m19534g(long j) {
                this.f16660d = j;
            }

            /* renamed from: h */
            public final void m19535h(double d) {
                this.f16658b = d;
            }
        }

        /* renamed from: o.bp6$b$b */
        public static final class b {
            public b() {
            }

            public /* synthetic */ b(id5 id5Var) {
                this();
            }

            /* renamed from: a */
            public final C12468b m19536a(xk7 xk7Var) {
                sq8.m48649h(xk7Var, "block");
                a aVar = new a();
                xk7Var.invoke(aVar);
                return new C12468b(aVar);
            }
        }

        public C12468b(a aVar) {
            sq8.m48649h(aVar, "builder");
            this.f16653a = aVar.m19528a();
            this.f16654b = aVar.m19531d();
            this.f16655c = aVar.m19529b();
            this.f16656d = aVar.m19530c();
        }

        /* renamed from: g */
        public static final y3i m19522g(C12468b c12468b, qk5.InterfaceC16417a.a aVar) {
            sq8.m48649h(aVar, "<this>");
            if (aVar instanceof a) {
                a aVar2 = (a) aVar;
                aVar2.m19532e(c12468b.f16653a);
                aVar2.m19535h(c12468b.f16654b);
                aVar2.m19533f(c12468b.f16655c);
                aVar2.m19534g(c12468b.f16656d);
            }
            return y3i.f54824a;
        }

        @Override // p001o.qk5.InterfaceC16417a
        /* renamed from: a */
        public xk7 mo19523a() {
            return new xk7() { // from class: o.cp6
                @Override // p001o.xk7
                public final Object invoke(Object obj) {
                    return bp6.C12468b.m19522g(this.f18477a, (qk5.InterfaceC16417a.a) obj);
                }
            };
        }

        /* renamed from: c */
        public final long m19524c() {
            return this.f16653a;
        }

        /* renamed from: d */
        public final double m19525d() {
            return this.f16655c;
        }

        /* renamed from: e */
        public final long m19526e() {
            return this.f16656d;
        }

        /* renamed from: f */
        public final double m19527f() {
            return this.f16654b;
        }
    }

    public bp6(C12468b c12468b) {
        sq8.m48649h(c12468b, "config");
        this.f16649a = c12468b;
        this.f16650b = vbe.f50091a;
    }

    @Override // p001o.qk5
    /* renamed from: a */
    public Object mo19517a(int i, n64 n64Var) {
        if (!(i > 0)) {
            throw new IllegalArgumentException(("attempt was " + i + " but must be greater than 0").toString());
        }
        double dMin = Math.min(k16.m34894y(getConfig().m19524c()) * Math.pow(getConfig().m19527f(), i - 1), k16.m34873S(getConfig().m19526e(), o16.MILLISECONDS));
        double dM19525d = getConfig().m19525d();
        double dMo18507d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        if (dM19525d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            dMo18507d = this.f16650b.mo18507d(getConfig().m19525d());
        }
        Object objM40720b = nk5.m40720b((long) (dMin * (1.0d - dMo18507d)), n64Var);
        return objM40720b == uq8.m51918f() ? objM40720b : y3i.f54824a;
    }

    @Override // p001o.qk5
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C12468b getConfig() {
        return this.f16649a;
    }
}
