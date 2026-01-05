package p001o;

import java.util.ArrayList;
import java.util.List;
import p001o.c7f;
import p001o.gja;
import p001o.n28;
import p001o.v28;
import p001o.xse;
import p001o.zse;

/* loaded from: classes3.dex */
public interface up3 extends b7f {

    /* renamed from: o */
    public static final C17429b f49308o = C17429b.f49310a;

    /* renamed from: o.up3$a */
    public static final class C17428a extends l9 {

        /* renamed from: a */
        public final C17430c.a f49309a = new C17430c.a();

        @Override // p001o.b7f.InterfaceC12296a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C17430c.a getConfig() {
            return this.f49309a;
        }

        @Override // p001o.l9
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public up3 mo20100b(C17430c c17430c) {
            sq8.m48649h(c17430c, "config");
            return new ed5(c17430c);
        }
    }

    /* renamed from: o.up3$b */
    public static final class C17429b extends s6 {

        /* renamed from: a */
        public static final /* synthetic */ C17429b f49310a = new C17429b();

        /* renamed from: o.up3$b$a */
        public static final class a extends o64 {

            /* renamed from: a */
            public Object f49311a;

            /* renamed from: b */
            public Object f49312b;

            /* renamed from: c */
            public /* synthetic */ Object f49313c;

            /* renamed from: e */
            public int f49315e;

            public a(n64 n64Var) {
                super(n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                this.f49313c = obj;
                this.f49315e |= Integer.MIN_VALUE;
                return C17429b.this.mo20105e(null, null, null, this);
            }
        }

        @Override // p001o.d7f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public C17428a mo20104b() {
            return new C17428a();
        }

        @Override // p001o.m9
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo20103a(C17428a c17428a) {
            sq8.m48649h(c17428a, "builder");
            super.mo20103a(c17428a);
            c17428a.getConfig().m51902x().add(0, new pb3());
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p001o.s6
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object mo20105e(C17428a c17428a, ii9 ii9Var, ii9 ii9Var2, n64 n64Var) {
            a aVar;
            C17430c.a config;
            l8i l8iVarM51900v;
            C17430c.a aVar2;
            Object obj;
            if (n64Var instanceof a) {
                aVar = (a) n64Var;
                int i = aVar.f49315e;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.f49315e = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(n64Var);
                }
            }
            a aVar3 = aVar;
            Object obj2 = aVar3.f49313c;
            Object objM51918f = uq8.m51918f();
            int i2 = aVar3.f49315e;
            if (i2 == 0) {
                wre.m54934b(obj2);
                aVar3.f49311a = c17428a;
                aVar3.f49312b = ii9Var;
                aVar3.f49315e = 1;
                if (super.mo20105e(c17428a, ii9Var, ii9Var2, aVar3) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = (C17430c.a) aVar3.f49311a;
                    wre.m54934b(obj2);
                    obj = obj2;
                    config = aVar2;
                    l8iVarM51900v = (l8i) obj;
                    config.m51891A(l8iVarM51900v);
                    return y3i.f54824a;
                }
                ii9Var = (ii9) aVar3.f49312b;
                c17428a = (C17428a) aVar3.f49311a;
                wre.m54934b(obj2);
            }
            ii9 ii9Var3 = ii9Var;
            config = c17428a.getConfig();
            l8iVarM51900v = c17428a.getConfig().m51900v();
            if (l8iVarM51900v == null) {
                aVar3.f49311a = config;
                aVar3.f49312b = null;
                aVar3.f49315e = 2;
                Object objM56511c = xne.m56511c(ii9Var3, "Comprehend", "COMPREHEND", "comprehend", null, aVar3, 16, null);
                if (objM56511c == objM51918f) {
                    return objM51918f;
                }
                aVar2 = config;
                obj = objM56511c;
                config = aVar2;
                l8iVarM51900v = (l8i) obj;
            }
            config.m51891A(l8iVarM51900v);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.up3$c */
    public static final class C17430c implements c7f, n28, xse {

        /* renamed from: r */
        public static final b f49316r = new b(null);

        /* renamed from: a */
        public final /* synthetic */ n28 f49317a;

        /* renamed from: b */
        public final /* synthetic */ xse f49318b;

        /* renamed from: c */
        public final String f49319c;

        /* renamed from: d */
        public final String f49320d;

        /* renamed from: e */
        public final List f49321e;

        /* renamed from: f */
        public final qc4 f49322f;

        /* renamed from: g */
        public final wp3 f49323g;

        /* renamed from: h */
        public final l8i f49324h;

        /* renamed from: i */
        public final ab8 f49325i;

        /* renamed from: j */
        public final List f49326j;

        /* renamed from: k */
        public final gja f49327k;

        /* renamed from: l */
        public final tse f49328l;

        /* renamed from: m */
        public final vdh f49329m;

        /* renamed from: n */
        public final boolean f49330n;

        /* renamed from: o */
        public final boolean f49331o;

        /* renamed from: p */
        public final String f49332p;

        /* renamed from: q */
        public final sp3 f49333q;

        /* renamed from: o.up3$c$a */
        public static final class a implements n81, s18, n28.InterfaceC15480a, xse.InterfaceC18242a, c7f.InterfaceC12584a, sdh {

            /* renamed from: d */
            public String f49337d;

            /* renamed from: f */
            public qc4 f49339f;

            /* renamed from: g */
            public wp3 f49340g;

            /* renamed from: h */
            public l8i f49341h;

            /* renamed from: i */
            public ab8 f49342i;

            /* renamed from: k */
            public gja f49344k;

            /* renamed from: l */
            public tse f49345l;

            /* renamed from: m */
            public vdh f49346m;

            /* renamed from: n */
            public Boolean f49347n;

            /* renamed from: o */
            public Boolean f49348o;

            /* renamed from: p */
            public String f49349p;

            /* renamed from: q */
            public sp3 f49350q;

            /* renamed from: a */
            public final /* synthetic */ v28.C17502a f49334a = new v28.C17502a();

            /* renamed from: b */
            public final /* synthetic */ zse.C18700a f49335b = new zse.C18700a();

            /* renamed from: c */
            public String f49336c = "Comprehend";

            /* renamed from: e */
            public List f49338e = ch3.m21246k();

            /* renamed from: j */
            public List f49343j = new ArrayList();

            /* renamed from: A */
            public final void m51891A(l8i l8iVar) {
                this.f49341h = l8iVar;
            }

            @Override // p001o.sdh
            /* renamed from: a */
            public vdh mo20125a() {
                return this.f49346m;
            }

            @Override // p001o.n28.InterfaceC15480a
            /* renamed from: b */
            public void mo20126b(t18 t18Var) {
                this.f49334a.mo20126b(t18Var);
            }

            @Override // p001o.n81
            /* renamed from: c */
            public Boolean mo20127c() {
                return this.f49348o;
            }

            @Override // p001o.n81
            /* renamed from: d */
            public void mo20128d(Boolean bool) {
                this.f49348o = bool;
            }

            @Override // p001o.n81
            /* renamed from: e */
            public Boolean mo20129e() {
                return this.f49347n;
            }

            @Override // p001o.n81
            /* renamed from: f */
            public void mo20130f(String str) {
                this.f49349p = str;
            }

            @Override // p001o.n81
            /* renamed from: g */
            public void mo20131g(Boolean bool) {
                this.f49347n = bool;
            }

            @Override // p001o.n81
            /* renamed from: h */
            public void mo20132h(String str) {
                this.f49337d = str;
            }

            @Override // p001o.n81
            /* renamed from: i */
            public String mo20133i() {
                return this.f49349p;
            }

            @Override // p001o.om1
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C17430c build() {
                return new C17430c(this, null);
            }

            @Override // p001o.xse.InterfaceC18242a
            /* renamed from: k */
            public void mo20135k(vse vseVar) {
                this.f49335b.mo20135k(vseVar);
            }

            @Override // p001o.c7f.InterfaceC12584a
            /* renamed from: l */
            public void mo20136l(gja gjaVar) {
                this.f49344k = gjaVar;
            }

            /* renamed from: m */
            public n28 m51893m() {
                return this.f49334a.m52299m();
            }

            @Override // p001o.n81
            /* renamed from: n */
            public String mo20138n() {
                return this.f49337d;
            }

            @Override // p001o.c7f.InterfaceC12584a
            /* renamed from: o */
            public gja mo20139o() {
                return this.f49344k;
            }

            /* renamed from: p */
            public xse m51894p() {
                return this.f49335b.m59820b();
            }

            /* renamed from: q */
            public final sp3 m51895q() {
                return this.f49350q;
            }

            /* renamed from: r */
            public List m51896r() {
                return this.f49338e;
            }

            /* renamed from: s */
            public String m51897s() {
                return this.f49336c;
            }

            /* renamed from: t */
            public qc4 m51898t() {
                return this.f49339f;
            }

            /* renamed from: u */
            public final wp3 m51899u() {
                return this.f49340g;
            }

            /* renamed from: v */
            public final l8i m51900v() {
                return this.f49341h;
            }

            /* renamed from: w */
            public ab8 m51901w() {
                return this.f49342i;
            }

            /* renamed from: x */
            public List m51902x() {
                return this.f49343j;
            }

            /* renamed from: y */
            public tse m51903y() {
                return this.f49345l;
            }

            /* renamed from: z */
            public void m51904z(qc4 qc4Var) {
                this.f49339f = qc4Var;
            }
        }

        /* renamed from: o.up3$c$b */
        public static final class b {
            public b() {
            }

            public /* synthetic */ b(id5 id5Var) {
                this();
            }
        }

        public /* synthetic */ C17430c(a aVar, id5 id5Var) {
            this(aVar);
        }

        @Override // p001o.xse
        /* renamed from: a */
        public vse mo20109a() {
            return this.f49318b.mo20109a();
        }

        @Override // p001o.n28
        /* renamed from: b */
        public t18 mo20110b() {
            return this.f49317a.mo20110b();
        }

        /* renamed from: c */
        public String m51876c() {
            return this.f49332p;
        }

        /* renamed from: d */
        public final sp3 m51877d() {
            return this.f49333q;
        }

        /* renamed from: e */
        public List m51878e() {
            return this.f49321e;
        }

        /* renamed from: f */
        public String m51879f() {
            return this.f49319c;
        }

        /* renamed from: g */
        public qc4 m51880g() {
            return this.f49322f;
        }

        /* renamed from: h */
        public final wp3 m51881h() {
            return this.f49323g;
        }

        /* renamed from: i */
        public final l8i m51882i() {
            return this.f49324h;
        }

        /* renamed from: j */
        public ab8 m51883j() {
            return this.f49325i;
        }

        /* renamed from: k */
        public List m51884k() {
            return this.f49326j;
        }

        /* renamed from: l */
        public gja m51885l() {
            return this.f49327k;
        }

        /* renamed from: m */
        public String m51886m() {
            return this.f49320d;
        }

        /* renamed from: n */
        public tse m51887n() {
            return this.f49328l;
        }

        /* renamed from: o */
        public vdh m51888o() {
            return this.f49329m;
        }

        /* renamed from: p */
        public boolean m51889p() {
            return this.f49330n;
        }

        /* renamed from: q */
        public boolean m51890q() {
            return this.f49331o;
        }

        public C17430c(a aVar) {
            this.f49317a = aVar.m51893m();
            this.f49318b = aVar.m51894p();
            this.f49319c = aVar.m51897s();
            this.f49320d = aVar.mo20138n();
            this.f49321e = aVar.m51896r();
            qc4 qc4VarM51898t = aVar.m51898t();
            this.f49322f = qc4VarM51898t == null ? upa.m51911a(new pc5(null, null, mo20110b(), m51886m(), 3, null)) : qc4VarM51898t;
            wp3 wp3VarM51899u = aVar.m51899u();
            this.f49323g = wp3VarM51899u == null ? new fd5() : wp3VarM51899u;
            this.f49324h = aVar.m51900v();
            ab8 ab8VarM51901w = aVar.m51901w();
            this.f49325i = ab8VarM51901w == null ? ab8.f14439a.m16813a() : ab8VarM51901w;
            this.f49326j = aVar.m51902x();
            gja gjaVarMo20139o = aVar.mo20139o();
            this.f49327k = gjaVarMo20139o == null ? gja.C13753c.f25332c : gjaVarMo20139o;
            tse tseVarM51903y = aVar.m51903y();
            this.f49328l = tseVarM51903y == null ? m81.f34943d.m38527a() : tseVarM51903y;
            vdh vdhVarMo20125a = aVar.mo20125a();
            this.f49329m = vdhVarMo20125a == null ? vt7.m53402a(vdh.f50220a) : vdhVarMo20125a;
            Boolean boolMo20129e = aVar.mo20129e();
            this.f49330n = boolMo20129e != null ? boolMo20129e.booleanValue() : false;
            Boolean boolMo20127c = aVar.mo20127c();
            this.f49331o = boolMo20127c != null ? boolMo20127c.booleanValue() : false;
            this.f49332p = aVar.mo20133i();
            sp3 sp3VarM51895q = aVar.m51895q();
            this.f49333q = sp3VarM51895q == null ? new dd5(null, 1, null) : sp3VarM51895q;
        }
    }

    /* renamed from: Z */
    Object mo24783Z(co5 co5Var, n64 n64Var);

    Object a3(dp5 dp5Var, n64 n64Var);

    Object e3(jp5 jp5Var, n64 n64Var);

    Object g2(qn5 qn5Var, n64 n64Var);

    Object p2(kn5 kn5Var, n64 n64Var);
}
