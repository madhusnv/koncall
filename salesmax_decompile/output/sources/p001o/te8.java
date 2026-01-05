package p001o;

import java.io.IOException;
import p001o.d86;
import p001o.f91;
import p001o.gja;
import p001o.hb3;
import p001o.j7f;
import p001o.k16;
import p001o.n6d;
import p001o.x18;

/* loaded from: classes2.dex */
public final class te8 implements fk8 {

    /* renamed from: H */
    public static final C17066b f46926H = new C17066b(null);

    /* renamed from: a */
    public final int f46927a;

    /* renamed from: b */
    public final d86 f46928b;

    /* renamed from: c */
    public final long f46929c;

    /* renamed from: d */
    public final hb3 f46930d;

    /* renamed from: e */
    public final r9d f46931e;

    /* renamed from: f */
    public final gja f46932f;

    /* renamed from: g */
    public final t18 f46933g;

    /* renamed from: h */
    public final i7f f46934h;

    /* renamed from: q */
    public final boolean f46935q;

    /* renamed from: s */
    public final dai f46936s;

    /* renamed from: x */
    public final ye8 f46937x;

    /* renamed from: y */
    public final crh f46938y;

    /* renamed from: o.te8$a */
    public static final class C17065a {

        /* renamed from: a */
        public int f46939a = 3;

        /* renamed from: b */
        public d86 f46940b = d86.C12841a.f19384a;

        /* renamed from: c */
        public long f46941c;

        /* renamed from: d */
        public gja f46942d;

        /* renamed from: e */
        public t18 f46943e;

        /* renamed from: f */
        public hb3 f46944f;

        /* renamed from: g */
        public r9d f46945g;

        public C17065a() {
            k16.C14700a c14700a = k16.f31358b;
            this.f46941c = m16.m38175s(21600, o16.SECONDS);
            this.f46942d = gja.C13753c.f25332c;
            this.f46944f = hb3.C13904a.f26578a;
            this.f46945g = r9d.f43250a.m46382a();
        }

        /* renamed from: a */
        public final hb3 m49772a() {
            return this.f46944f;
        }

        /* renamed from: b */
        public final d86 m49773b() {
            return this.f46940b;
        }

        /* renamed from: c */
        public final t18 m49774c() {
            return this.f46943e;
        }

        /* renamed from: d */
        public final gja m49775d() {
            return this.f46942d;
        }

        /* renamed from: e */
        public final int m49776e() {
            return this.f46939a;
        }

        /* renamed from: f */
        public final r9d m49777f() {
            return this.f46945g;
        }

        /* renamed from: g */
        public final long m49778g() {
            return this.f46941c;
        }

        /* renamed from: h */
        public final void m49779h(t18 t18Var) {
            this.f46943e = t18Var;
        }

        /* renamed from: i */
        public final void m49780i(r9d r9dVar) {
            sq8.m48649h(r9dVar, "<set-?>");
            this.f46945g = r9dVar;
        }
    }

    /* renamed from: o.te8$b */
    public static final class C17066b {
        public C17066b() {
        }

        public /* synthetic */ C17066b(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final te8 m49781a(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            C17065a c17065a = new C17065a();
            xk7Var.invoke(c17065a);
            return new te8(c17065a, null);
        }
    }

    /* renamed from: o.te8$c */
    public static final class C17067c extends jgg implements ql7 {

        /* renamed from: a */
        public int f46946a;

        /* renamed from: b */
        public /* synthetic */ Object f46947b;

        /* renamed from: c */
        public /* synthetic */ Object f46948c;

        /* renamed from: d */
        public final /* synthetic */ String f46949d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17067c(String str, n64 n64Var) {
            super(3, n64Var);
            this.f46949d = str;
        }

        @Override // p001o.ql7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zdc zdcVar, jw7 jw7Var, n64 n64Var) {
            C17067c c17067c = new C17067c(this.f46949d, n64Var);
            c17067c.f46947b = zdcVar;
            c17067c.f46948c = jw7Var;
            return c17067c.invokeSuspend(y3i.f54824a);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f46946a;
            if (i == 0) {
                wre.m54934b(obj);
                zdc zdcVar = (zdc) this.f46947b;
                jw7 jw7Var = (jw7) this.f46948c;
                ((z38) zdcVar.m59255d()).m58671h().m36767h().m48016m(this.f46949d);
                this.f46947b = null;
                this.f46946a = 1;
                obj = jw7Var.mo21441a(zdcVar, this);
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
    }

    /* renamed from: o.te8$d */
    public static final class C17068d implements l28 {

        /* renamed from: o.te8$d$a */
        public static final class a extends o64 {

            /* renamed from: a */
            public Object f46950a;

            /* renamed from: b */
            public /* synthetic */ Object f46951b;

            /* renamed from: d */
            public int f46953d;

            public a(n64 n64Var) {
                super(n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                this.f46951b = obj;
                this.f46953d |= Integer.MIN_VALUE;
                return C17068d.this.mo36452a(null, null, this);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p001o.l28
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object mo36452a(jl6 jl6Var, o18 o18Var, n64 n64Var) {
            a aVar;
            g48 g48Var;
            if (n64Var instanceof a) {
                aVar = (a) n64Var;
                int i = aVar.f46953d;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.f46953d = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(n64Var);
                }
            }
            Object objM39980a = aVar.f46951b;
            Object objM51918f = uq8.m51918f();
            int i2 = aVar.f46953d;
            if (i2 == 0) {
                wre.m54934b(objM39980a);
                g48 g48VarM41347f = o18Var.m41347f();
                if (!t48.m49282c(g48VarM41347f.getStatus())) {
                    throw new o26(g48VarM41347f.getStatus().h0(), "error retrieving instance metadata: " + g48VarM41347f.getStatus().g0());
                }
                m18 body = g48VarM41347f.getBody();
                aVar.f46950a = g48VarM41347f;
                aVar.f46953d = 1;
                objM39980a = n18.m39980a(body, aVar);
                if (objM39980a == objM51918f) {
                    return objM51918f;
                }
                g48Var = g48VarM41347f;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g48Var = (g48) aVar.f46950a;
                wre.m54934b(objM39980a);
            }
            byte[] bArr = (byte[]) objM39980a;
            if (bArr != null) {
                return e9g.m24600r(bArr);
            }
            throw new o26(g48Var.getStatus().h0(), "no metadata payload");
        }
    }

    public /* synthetic */ te8(C17065a c17065a, id5 id5Var) {
        this(c17065a);
    }

    /* renamed from: c */
    public static final y3i m49771c(x18.InterfaceC18030a interfaceC18030a) {
        sq8.m48649h(interfaceC18030a, "$this$DefaultHttpEngine");
        k16.C14700a c14700a = k16.f31358b;
        o16 o16Var = o16.SECONDS;
        interfaceC18030a.mo55564p(m16.m38175s(1, o16Var));
        interfaceC18030a.mo55563o(m16.m38175s(1, o16Var));
        interfaceC18030a.mo55553d(y2e.f54790a.m57158c());
        return y3i.f54824a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f46935q) {
            ub3.m51325a(this.f46933g);
        }
    }

    @Override // p001o.fk8
    public Object e0(String str, n64 n64Var) {
        j7f.C14471a c14471a = j7f.f29929h;
        k7f k7fVar = new k7f(kge.m35689b(y3i.class), kge.m35689b(String.class));
        k7fVar.m35123i(d4i.f19091a);
        k7fVar.m35120f(new C17068d());
        k7fVar.m35121g(str);
        k7fVar.m35124j("IMDS");
        k7fVar.m35116b().mo34002p(e7f.f21127a.m24496c(), this.f46932f);
        k7fVar.m35117c().m51150j(this.f46937x);
        j7f j7fVarM35115a = k7fVar.m35115a();
        j7fVarM35115a.m33383c().m51151k(new cf8(n64Var.getContext()));
        j7fVarM35115a.m33388h(this.f46936s);
        j7fVarM35115a.m33388h(this.f46938y);
        j7fVarM35115a.m33383c().m51144d().m40148c(n6d.EnumC15515a.Before, new C17067c(str, null));
        return l7f.m36671e(j7fVarM35115a, this.f46934h, y3i.f54824a, n64Var);
    }

    public te8(C17065a c17065a) {
        int iM49776e = c17065a.m49776e();
        this.f46927a = iM49776e;
        d86 d86VarM49773b = c17065a.m49773b();
        this.f46928b = d86VarM49773b;
        long jM49778g = c17065a.m49778g();
        this.f46929c = jM49778g;
        hb3 hb3VarM49772a = c17065a.m49772a();
        this.f46930d = hb3VarM49772a;
        r9d r9dVarM49777f = c17065a.m49777f();
        this.f46931e = r9dVarM49777f;
        this.f46932f = c17065a.m49775d();
        this.f46935q = c17065a.m49774c() == null;
        if (!(iM49776e > 0)) {
            throw new IllegalArgumentException("maxRetries must be greater than zero".toString());
        }
        t18 t18VarM49774c = c17065a.m49774c();
        t18VarM49774c = t18VarM49774c == null ? ne5.m40413a(new xk7() { // from class: o.se8
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return te8.m49771c((x18.InterfaceC18030a) obj);
            }
        }) : t18VarM49774c;
        this.f46933g = t18VarM49774c;
        i7f i7fVar = new i7f(t18VarM49774c);
        this.f46934h = i7fVar;
        this.f46936s = new dai(f91.C13367a.m26296b(f91.f22967i, new ji0("imds", "unknown"), null, 2, null));
        ye8 ye8Var = new ye8(r9dVarM49777f, d86VarM49773b);
        this.f46937x = ye8Var;
        this.f46938y = new crh(i7fVar, ye8Var, jM49778g, hb3VarM49772a, null);
    }

    public te8() {
        this(new C17065a());
    }
}
