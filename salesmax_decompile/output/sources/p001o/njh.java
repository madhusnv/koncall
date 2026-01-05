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
public interface njh extends b7f {
    public static final C15594b e0 = C15594b.f36919a;

    /* renamed from: o.njh$a */
    public static final class C15593a extends l9 {

        /* renamed from: a */
        public final C15595c.a f36918a = new C15595c.a();

        @Override // p001o.b7f.InterfaceC12296a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C15595c.a getConfig() {
            return this.f36918a;
        }

        @Override // p001o.l9
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public njh mo20100b(C15595c c15595c) {
            sq8.m48649h(c15595c, "config");
            return new pi5(c15595c);
        }
    }

    /* renamed from: o.njh$b */
    public static final class C15594b extends s6 {

        /* renamed from: a */
        public static final /* synthetic */ C15594b f36919a = new C15594b();

        /* renamed from: o.njh$b$a */
        public static final class a extends o64 {

            /* renamed from: a */
            public Object f36920a;

            /* renamed from: b */
            public Object f36921b;

            /* renamed from: c */
            public /* synthetic */ Object f36922c;

            /* renamed from: e */
            public int f36924e;

            public a(n64 n64Var) {
                super(n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                this.f36922c = obj;
                this.f36924e |= Integer.MIN_VALUE;
                return C15594b.this.mo20105e(null, null, null, this);
            }
        }

        @Override // p001o.d7f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public C15593a mo20104b() {
            return new C15593a();
        }

        @Override // p001o.m9
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo20103a(C15593a c15593a) {
            sq8.m48649h(c15593a, "builder");
            super.mo20103a(c15593a);
            c15593a.getConfig().m40712x().add(0, new pb3());
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p001o.s6
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object mo20105e(C15593a c15593a, ii9 ii9Var, ii9 ii9Var2, n64 n64Var) {
            a aVar;
            C15595c.a config;
            l8i l8iVarM40710v;
            C15595c.a aVar2;
            Object obj;
            if (n64Var instanceof a) {
                aVar = (a) n64Var;
                int i = aVar.f36924e;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.f36924e = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(n64Var);
                }
            }
            a aVar3 = aVar;
            Object obj2 = aVar3.f36922c;
            Object objM51918f = uq8.m51918f();
            int i2 = aVar3.f36924e;
            if (i2 == 0) {
                wre.m54934b(obj2);
                aVar3.f36920a = c15593a;
                aVar3.f36921b = ii9Var;
                aVar3.f36924e = 1;
                if (super.mo20105e(c15593a, ii9Var, ii9Var2, aVar3) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = (C15595c.a) aVar3.f36920a;
                    wre.m54934b(obj2);
                    obj = obj2;
                    config = aVar2;
                    l8iVarM40710v = (l8i) obj;
                    config.m40701A(l8iVarM40710v);
                    return y3i.f54824a;
                }
                ii9Var = (ii9) aVar3.f36921b;
                c15593a = (C15593a) aVar3.f36920a;
                wre.m54934b(obj2);
            }
            ii9 ii9Var3 = ii9Var;
            config = c15593a.getConfig();
            l8iVarM40710v = c15593a.getConfig().m40710v();
            if (l8iVarM40710v == null) {
                aVar3.f36920a = config;
                aVar3.f36921b = null;
                aVar3.f36924e = 2;
                Object objM56511c = xne.m56511c(ii9Var3, "Textract", "TEXTRACT", "textract", null, aVar3, 16, null);
                if (objM56511c == objM51918f) {
                    return objM51918f;
                }
                aVar2 = config;
                obj = objM56511c;
                config = aVar2;
                l8iVarM40710v = (l8i) obj;
            }
            config.m40701A(l8iVarM40710v);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.njh$c */
    public static final class C15595c implements c7f, n28, xse {

        /* renamed from: r */
        public static final b f36925r = new b(null);

        /* renamed from: a */
        public final /* synthetic */ n28 f36926a;

        /* renamed from: b */
        public final /* synthetic */ xse f36927b;

        /* renamed from: c */
        public final String f36928c;

        /* renamed from: d */
        public final String f36929d;

        /* renamed from: e */
        public final List f36930e;

        /* renamed from: f */
        public final qc4 f36931f;

        /* renamed from: g */
        public final pjh f36932g;

        /* renamed from: h */
        public final l8i f36933h;

        /* renamed from: i */
        public final ab8 f36934i;

        /* renamed from: j */
        public final List f36935j;

        /* renamed from: k */
        public final gja f36936k;

        /* renamed from: l */
        public final tse f36937l;

        /* renamed from: m */
        public final vdh f36938m;

        /* renamed from: n */
        public final boolean f36939n;

        /* renamed from: o */
        public final boolean f36940o;

        /* renamed from: p */
        public final String f36941p;

        /* renamed from: q */
        public final ljh f36942q;

        /* renamed from: o.njh$c$a */
        public static final class a implements n81, s18, n28.InterfaceC15480a, xse.InterfaceC18242a, c7f.InterfaceC12584a, sdh {

            /* renamed from: d */
            public String f36946d;

            /* renamed from: f */
            public qc4 f36948f;

            /* renamed from: g */
            public pjh f36949g;

            /* renamed from: h */
            public l8i f36950h;

            /* renamed from: i */
            public ab8 f36951i;

            /* renamed from: k */
            public gja f36953k;

            /* renamed from: l */
            public tse f36954l;

            /* renamed from: m */
            public vdh f36955m;

            /* renamed from: n */
            public Boolean f36956n;

            /* renamed from: o */
            public Boolean f36957o;

            /* renamed from: p */
            public String f36958p;

            /* renamed from: q */
            public ljh f36959q;

            /* renamed from: a */
            public final /* synthetic */ v28.C17502a f36943a = new v28.C17502a();

            /* renamed from: b */
            public final /* synthetic */ zse.C18700a f36944b = new zse.C18700a();

            /* renamed from: c */
            public String f36945c = "Textract";

            /* renamed from: e */
            public List f36947e = ch3.m21246k();

            /* renamed from: j */
            public List f36952j = new ArrayList();

            /* renamed from: A */
            public final void m40701A(l8i l8iVar) {
                this.f36950h = l8iVar;
            }

            @Override // p001o.sdh
            /* renamed from: a */
            public vdh mo20125a() {
                return this.f36955m;
            }

            @Override // p001o.n28.InterfaceC15480a
            /* renamed from: b */
            public void mo20126b(t18 t18Var) {
                this.f36943a.mo20126b(t18Var);
            }

            @Override // p001o.n81
            /* renamed from: c */
            public Boolean mo20127c() {
                return this.f36957o;
            }

            @Override // p001o.n81
            /* renamed from: d */
            public void mo20128d(Boolean bool) {
                this.f36957o = bool;
            }

            @Override // p001o.n81
            /* renamed from: e */
            public Boolean mo20129e() {
                return this.f36956n;
            }

            @Override // p001o.n81
            /* renamed from: f */
            public void mo20130f(String str) {
                this.f36958p = str;
            }

            @Override // p001o.n81
            /* renamed from: g */
            public void mo20131g(Boolean bool) {
                this.f36956n = bool;
            }

            @Override // p001o.n81
            /* renamed from: h */
            public void mo20132h(String str) {
                this.f36946d = str;
            }

            @Override // p001o.n81
            /* renamed from: i */
            public String mo20133i() {
                return this.f36958p;
            }

            @Override // p001o.om1
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C15595c build() {
                return new C15595c(this, null);
            }

            @Override // p001o.xse.InterfaceC18242a
            /* renamed from: k */
            public void mo20135k(vse vseVar) {
                this.f36944b.mo20135k(vseVar);
            }

            @Override // p001o.c7f.InterfaceC12584a
            /* renamed from: l */
            public void mo20136l(gja gjaVar) {
                this.f36953k = gjaVar;
            }

            /* renamed from: m */
            public n28 m40703m() {
                return this.f36943a.m52299m();
            }

            @Override // p001o.n81
            /* renamed from: n */
            public String mo20138n() {
                return this.f36946d;
            }

            @Override // p001o.c7f.InterfaceC12584a
            /* renamed from: o */
            public gja mo20139o() {
                return this.f36953k;
            }

            /* renamed from: p */
            public xse m40704p() {
                return this.f36944b.m59820b();
            }

            /* renamed from: q */
            public final ljh m40705q() {
                return this.f36959q;
            }

            /* renamed from: r */
            public List m40706r() {
                return this.f36947e;
            }

            /* renamed from: s */
            public String m40707s() {
                return this.f36945c;
            }

            /* renamed from: t */
            public qc4 m40708t() {
                return this.f36948f;
            }

            /* renamed from: u */
            public final pjh m40709u() {
                return this.f36949g;
            }

            /* renamed from: v */
            public final l8i m40710v() {
                return this.f36950h;
            }

            /* renamed from: w */
            public ab8 m40711w() {
                return this.f36951i;
            }

            /* renamed from: x */
            public List m40712x() {
                return this.f36952j;
            }

            /* renamed from: y */
            public tse m40713y() {
                return this.f36954l;
            }

            /* renamed from: z */
            public void m40714z(qc4 qc4Var) {
                this.f36948f = qc4Var;
            }
        }

        /* renamed from: o.njh$c$b */
        public static final class b {
            public b() {
            }

            public /* synthetic */ b(id5 id5Var) {
                this();
            }
        }

        public /* synthetic */ C15595c(a aVar, id5 id5Var) {
            this(aVar);
        }

        @Override // p001o.xse
        /* renamed from: a */
        public vse mo20109a() {
            return this.f36927b.mo20109a();
        }

        @Override // p001o.n28
        /* renamed from: b */
        public t18 mo20110b() {
            return this.f36926a.mo20110b();
        }

        /* renamed from: c */
        public String m40686c() {
            return this.f36941p;
        }

        /* renamed from: d */
        public final ljh m40687d() {
            return this.f36942q;
        }

        /* renamed from: e */
        public List m40688e() {
            return this.f36930e;
        }

        /* renamed from: f */
        public String m40689f() {
            return this.f36928c;
        }

        /* renamed from: g */
        public qc4 m40690g() {
            return this.f36931f;
        }

        /* renamed from: h */
        public final pjh m40691h() {
            return this.f36932g;
        }

        /* renamed from: i */
        public final l8i m40692i() {
            return this.f36933h;
        }

        /* renamed from: j */
        public ab8 m40693j() {
            return this.f36934i;
        }

        /* renamed from: k */
        public List m40694k() {
            return this.f36935j;
        }

        /* renamed from: l */
        public gja m40695l() {
            return this.f36936k;
        }

        /* renamed from: m */
        public String m40696m() {
            return this.f36929d;
        }

        /* renamed from: n */
        public tse m40697n() {
            return this.f36937l;
        }

        /* renamed from: o */
        public vdh m40698o() {
            return this.f36938m;
        }

        /* renamed from: p */
        public boolean m40699p() {
            return this.f36939n;
        }

        /* renamed from: q */
        public boolean m40700q() {
            return this.f36940o;
        }

        public C15595c(a aVar) {
            this.f36926a = aVar.m40703m();
            this.f36927b = aVar.m40704p();
            this.f36928c = aVar.m40707s();
            this.f36929d = aVar.mo20138n();
            this.f36930e = aVar.m40706r();
            qc4 qc4VarM40708t = aVar.m40708t();
            this.f36931f = qc4VarM40708t == null ? upa.m51911a(new pc5(null, null, mo20110b(), m40696m(), 3, null)) : qc4VarM40708t;
            pjh pjhVarM40709u = aVar.m40709u();
            this.f36932g = pjhVarM40709u == null ? new qi5() : pjhVarM40709u;
            this.f36933h = aVar.m40710v();
            ab8 ab8VarM40711w = aVar.m40711w();
            this.f36934i = ab8VarM40711w == null ? ab8.f14439a.m16813a() : ab8VarM40711w;
            this.f36935j = aVar.m40712x();
            gja gjaVarMo20139o = aVar.mo20139o();
            this.f36936k = gjaVarMo20139o == null ? gja.C13753c.f25332c : gjaVarMo20139o;
            tse tseVarM40713y = aVar.m40713y();
            this.f36937l = tseVarM40713y == null ? m81.f34943d.m38527a() : tseVarM40713y;
            vdh vdhVarMo20125a = aVar.mo20125a();
            this.f36938m = vdhVarMo20125a == null ? vt7.m53402a(vdh.f50220a) : vdhVarMo20125a;
            Boolean boolMo20129e = aVar.mo20129e();
            this.f36939n = boolMo20129e != null ? boolMo20129e.booleanValue() : false;
            Boolean boolMo20127c = aVar.mo20127c();
            this.f36940o = boolMo20127c != null ? boolMo20127c.booleanValue() : false;
            this.f36941p = aVar.mo20133i();
            ljh ljhVarM40705q = aVar.m40705q();
            this.f36942q = ljhVarM40705q == null ? new oi5(null, 1, null) : ljhVarM40705q;
        }
    }

    Object L2(qc0 qc0Var, n64 n64Var);
}
