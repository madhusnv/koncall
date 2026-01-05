package p001o;

import java.util.ArrayList;
import java.util.List;
import p001o.c7f;
import p001o.gja;
import p001o.n28;
import p001o.v28;
import p001o.xse;
import p001o.zse;

/* loaded from: classes2.dex */
public interface q1g extends b7f {
    public static final C16271b b0 = C16271b.f41104a;

    /* renamed from: o.q1g$a */
    public static final class C16270a extends l9 {

        /* renamed from: a */
        public final C16272c.a f41103a = new C16272c.a();

        @Override // p001o.b7f.InterfaceC12296a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C16272c.a getConfig() {
            return this.f41103a;
        }

        @Override // p001o.l9
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public q1g mo20100b(C16272c c16272c) {
            sq8.m48649h(c16272c, "config");
            return new mh5(c16272c);
        }
    }

    /* renamed from: o.q1g$b */
    public static final class C16271b extends s6 {

        /* renamed from: a */
        public static final /* synthetic */ C16271b f41104a = new C16271b();

        /* renamed from: o.q1g$b$a */
        public static final class a extends o64 {

            /* renamed from: a */
            public Object f41105a;

            /* renamed from: b */
            public Object f41106b;

            /* renamed from: c */
            public /* synthetic */ Object f41107c;

            /* renamed from: e */
            public int f41109e;

            public a(n64 n64Var) {
                super(n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                this.f41107c = obj;
                this.f41109e |= Integer.MIN_VALUE;
                return C16271b.this.mo20105e(null, null, null, this);
            }
        }

        @Override // p001o.d7f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public C16270a mo20104b() {
            return new C16270a();
        }

        @Override // p001o.m9
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo20103a(C16270a c16270a) {
            sq8.m48649h(c16270a, "builder");
            super.mo20103a(c16270a);
            c16270a.getConfig().m44732w().add(0, new pb3());
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p001o.s6
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object mo20105e(C16270a c16270a, ii9 ii9Var, ii9 ii9Var2, n64 n64Var) {
            a aVar;
            C16272c.a config;
            l8i l8iVarM44731v;
            C16272c.a aVar2;
            Object obj;
            if (n64Var instanceof a) {
                aVar = (a) n64Var;
                int i = aVar.f41109e;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.f41109e = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(n64Var);
                }
            }
            a aVar3 = aVar;
            Object obj2 = aVar3.f41107c;
            Object objM51918f = uq8.m51918f();
            int i2 = aVar3.f41109e;
            if (i2 == 0) {
                wre.m54934b(obj2);
                aVar3.f41105a = c16270a;
                aVar3.f41106b = ii9Var;
                aVar3.f41109e = 1;
                if (super.mo20105e(c16270a, ii9Var, ii9Var2, aVar3) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = (C16272c.a) aVar3.f41105a;
                    wre.m54934b(obj2);
                    obj = obj2;
                    config = aVar2;
                    l8iVarM44731v = (l8i) obj;
                    config.m44734y(l8iVarM44731v);
                    return y3i.f54824a;
                }
                ii9Var = (ii9) aVar3.f41106b;
                c16270a = (C16270a) aVar3.f41105a;
                wre.m54934b(obj2);
            }
            ii9 ii9Var3 = ii9Var;
            config = c16270a.getConfig();
            l8iVarM44731v = c16270a.getConfig().m44731v();
            if (l8iVarM44731v == null) {
                aVar3.f41105a = config;
                aVar3.f41106b = null;
                aVar3.f41109e = 2;
                Object objM56511c = xne.m56511c(ii9Var3, "Sso", "SSO", "sso", null, aVar3, 16, null);
                if (objM56511c == objM51918f) {
                    return objM51918f;
                }
                aVar2 = config;
                obj = objM56511c;
                config = aVar2;
                l8iVarM44731v = (l8i) obj;
            }
            config.m44734y(l8iVarM44731v);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.q1g$c */
    public static final class C16272c implements c7f, n28, xse {

        /* renamed from: q */
        public static final b f41110q = new b(null);

        /* renamed from: a */
        public final /* synthetic */ n28 f41111a;

        /* renamed from: b */
        public final /* synthetic */ xse f41112b;

        /* renamed from: c */
        public final String f41113c;

        /* renamed from: d */
        public final String f41114d;

        /* renamed from: e */
        public final List f41115e;

        /* renamed from: f */
        public final qc4 f41116f;

        /* renamed from: g */
        public final w1g f41117g;

        /* renamed from: h */
        public final l8i f41118h;

        /* renamed from: i */
        public final List f41119i;

        /* renamed from: j */
        public final gja f41120j;

        /* renamed from: k */
        public final tse f41121k;

        /* renamed from: l */
        public final vdh f41122l;

        /* renamed from: m */
        public final boolean f41123m;

        /* renamed from: n */
        public final boolean f41124n;

        /* renamed from: o */
        public final String f41125o;

        /* renamed from: p */
        public final o1g f41126p;

        /* renamed from: o.q1g$c$a */
        public static final class a implements n81, s18, n28.InterfaceC15480a, xse.InterfaceC18242a, c7f.InterfaceC12584a, sdh {

            /* renamed from: d */
            public String f41130d;

            /* renamed from: f */
            public qc4 f41132f;

            /* renamed from: g */
            public w1g f41133g;

            /* renamed from: h */
            public l8i f41134h;

            /* renamed from: j */
            public gja f41136j;

            /* renamed from: k */
            public tse f41137k;

            /* renamed from: l */
            public vdh f41138l;

            /* renamed from: m */
            public Boolean f41139m;

            /* renamed from: n */
            public Boolean f41140n;

            /* renamed from: o */
            public String f41141o;

            /* renamed from: p */
            public o1g f41142p;

            /* renamed from: a */
            public final /* synthetic */ v28.C17502a f41127a = new v28.C17502a();

            /* renamed from: b */
            public final /* synthetic */ zse.C18700a f41128b = new zse.C18700a();

            /* renamed from: c */
            public String f41129c = "SSO";

            /* renamed from: e */
            public List f41131e = ch3.m21246k();

            /* renamed from: i */
            public List f41135i = new ArrayList();

            @Override // p001o.sdh
            /* renamed from: a */
            public vdh mo20125a() {
                return this.f41138l;
            }

            @Override // p001o.n28.InterfaceC15480a
            /* renamed from: b */
            public void mo20126b(t18 t18Var) {
                this.f41127a.mo20126b(t18Var);
            }

            @Override // p001o.n81
            /* renamed from: c */
            public Boolean mo20127c() {
                return this.f41140n;
            }

            @Override // p001o.n81
            /* renamed from: d */
            public void mo20128d(Boolean bool) {
                this.f41140n = bool;
            }

            @Override // p001o.n81
            /* renamed from: e */
            public Boolean mo20129e() {
                return this.f41139m;
            }

            @Override // p001o.n81
            /* renamed from: f */
            public void mo20130f(String str) {
                this.f41141o = str;
            }

            @Override // p001o.n81
            /* renamed from: g */
            public void mo20131g(Boolean bool) {
                this.f41139m = bool;
            }

            @Override // p001o.n81
            /* renamed from: h */
            public void mo20132h(String str) {
                this.f41130d = str;
            }

            @Override // p001o.n81
            /* renamed from: i */
            public String mo20133i() {
                return this.f41141o;
            }

            @Override // p001o.om1
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C16272c build() {
                return new C16272c(this, null);
            }

            @Override // p001o.xse.InterfaceC18242a
            /* renamed from: k */
            public void mo20135k(vse vseVar) {
                this.f41128b.mo20135k(vseVar);
            }

            @Override // p001o.c7f.InterfaceC12584a
            /* renamed from: l */
            public void mo20136l(gja gjaVar) {
                this.f41136j = gjaVar;
            }

            /* renamed from: m */
            public n28 m44724m() {
                return this.f41127a.m52299m();
            }

            @Override // p001o.n81
            /* renamed from: n */
            public String mo20138n() {
                return this.f41130d;
            }

            @Override // p001o.c7f.InterfaceC12584a
            /* renamed from: o */
            public gja mo20139o() {
                return this.f41136j;
            }

            /* renamed from: p */
            public xse m44725p() {
                return this.f41128b.m59820b();
            }

            /* renamed from: q */
            public final o1g m44726q() {
                return this.f41142p;
            }

            /* renamed from: r */
            public List m44727r() {
                return this.f41131e;
            }

            /* renamed from: s */
            public String m44728s() {
                return this.f41129c;
            }

            /* renamed from: t */
            public qc4 m44729t() {
                return this.f41132f;
            }

            /* renamed from: u */
            public final w1g m44730u() {
                return this.f41133g;
            }

            /* renamed from: v */
            public final l8i m44731v() {
                return this.f41134h;
            }

            /* renamed from: w */
            public List m44732w() {
                return this.f41135i;
            }

            /* renamed from: x */
            public tse m44733x() {
                return this.f41137k;
            }

            /* renamed from: y */
            public final void m44734y(l8i l8iVar) {
                this.f41134h = l8iVar;
            }

            /* renamed from: z */
            public void m44735z(vdh vdhVar) {
                this.f41138l = vdhVar;
            }
        }

        /* renamed from: o.q1g$c$b */
        public static final class b {
            public b() {
            }

            public /* synthetic */ b(id5 id5Var) {
                this();
            }
        }

        public /* synthetic */ C16272c(a aVar, id5 id5Var) {
            this(aVar);
        }

        @Override // p001o.xse
        /* renamed from: a */
        public vse mo20109a() {
            return this.f41112b.mo20109a();
        }

        @Override // p001o.n28
        /* renamed from: b */
        public t18 mo20110b() {
            return this.f41111a.mo20110b();
        }

        /* renamed from: c */
        public String m44709c() {
            return this.f41125o;
        }

        /* renamed from: d */
        public final o1g m44710d() {
            return this.f41126p;
        }

        /* renamed from: e */
        public List m44711e() {
            return this.f41115e;
        }

        /* renamed from: f */
        public String m44712f() {
            return this.f41113c;
        }

        /* renamed from: g */
        public qc4 m44713g() {
            return this.f41116f;
        }

        /* renamed from: h */
        public final w1g m44714h() {
            return this.f41117g;
        }

        /* renamed from: i */
        public final l8i m44715i() {
            return this.f41118h;
        }

        /* renamed from: j */
        public List m44716j() {
            return this.f41119i;
        }

        /* renamed from: k */
        public gja m44717k() {
            return this.f41120j;
        }

        /* renamed from: l */
        public String m44718l() {
            return this.f41114d;
        }

        /* renamed from: m */
        public tse m44719m() {
            return this.f41121k;
        }

        /* renamed from: n */
        public vdh m44720n() {
            return this.f41122l;
        }

        /* renamed from: o */
        public boolean m44721o() {
            return this.f41123m;
        }

        /* renamed from: p */
        public boolean m44722p() {
            return this.f41124n;
        }

        public C16272c(a aVar) {
            this.f41111a = aVar.m44724m();
            this.f41112b = aVar.m44725p();
            this.f41113c = aVar.m44728s();
            this.f41114d = aVar.mo20138n();
            this.f41115e = aVar.m44727r();
            qc4 qc4VarM44729t = aVar.m44729t();
            this.f41116f = qc4VarM44729t == null ? upa.m51911a(new pc5(null, null, mo20110b(), m44718l(), 3, null)) : qc4VarM44729t;
            w1g w1gVarM44730u = aVar.m44730u();
            this.f41117g = w1gVarM44730u == null ? new nh5() : w1gVarM44730u;
            this.f41118h = aVar.m44731v();
            this.f41119i = aVar.m44732w();
            gja gjaVarMo20139o = aVar.mo20139o();
            this.f41120j = gjaVarMo20139o == null ? gja.C13753c.f25332c : gjaVarMo20139o;
            tse tseVarM44733x = aVar.m44733x();
            this.f41121k = tseVarM44733x == null ? m81.f34943d.m38527a() : tseVarM44733x;
            vdh vdhVarMo20125a = aVar.mo20125a();
            this.f41122l = vdhVarMo20125a == null ? vt7.m53402a(vdh.f50220a) : vdhVarMo20125a;
            Boolean boolMo20129e = aVar.mo20129e();
            this.f41123m = boolMo20129e != null ? boolMo20129e.booleanValue() : false;
            Boolean boolMo20127c = aVar.mo20127c();
            this.f41124n = boolMo20127c != null ? boolMo20127c.booleanValue() : false;
            this.f41125o = aVar.mo20133i();
            o1g o1gVarM44726q = aVar.m44726q();
            this.f41126p = o1gVarM44726q == null ? new lh5(null, 1, null) : o1gVarM44726q;
        }
    }

    Object W1(gr7 gr7Var, n64 n64Var);
}
