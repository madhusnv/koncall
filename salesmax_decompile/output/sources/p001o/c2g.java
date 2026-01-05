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
public interface c2g extends b7f {
    public static final C12538b c0 = C12538b.f17165a;

    /* renamed from: o.c2g$a */
    public static final class C12537a extends l9 {

        /* renamed from: a */
        public final C12539c.a f17164a = new C12539c.a();

        @Override // p001o.b7f.InterfaceC12296a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C12539c.a getConfig() {
            return this.f17164a;
        }

        @Override // p001o.l9
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public c2g mo20100b(C12539c c12539c) {
            sq8.m48649h(c12539c, "config");
            return new ph5(c12539c);
        }
    }

    /* renamed from: o.c2g$b */
    public static final class C12538b extends s6 {

        /* renamed from: a */
        public static final /* synthetic */ C12538b f17165a = new C12538b();

        /* renamed from: o.c2g$b$a */
        public static final class a extends o64 {

            /* renamed from: a */
            public Object f17166a;

            /* renamed from: b */
            public Object f17167b;

            /* renamed from: c */
            public /* synthetic */ Object f17168c;

            /* renamed from: e */
            public int f17170e;

            public a(n64 n64Var) {
                super(n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                this.f17168c = obj;
                this.f17170e |= Integer.MIN_VALUE;
                return C12538b.this.mo20105e(null, null, null, this);
            }
        }

        @Override // p001o.d7f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public C12537a mo20104b() {
            return new C12537a();
        }

        @Override // p001o.m9
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo20103a(C12537a c12537a) {
            sq8.m48649h(c12537a, "builder");
            super.mo20103a(c12537a);
            c12537a.getConfig().m20147w().add(0, new pb3());
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p001o.s6
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object mo20105e(C12537a c12537a, ii9 ii9Var, ii9 ii9Var2, n64 n64Var) {
            a aVar;
            C12539c.a config;
            l8i l8iVarM20146v;
            C12539c.a aVar2;
            Object obj;
            if (n64Var instanceof a) {
                aVar = (a) n64Var;
                int i = aVar.f17170e;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.f17170e = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(n64Var);
                }
            }
            a aVar3 = aVar;
            Object obj2 = aVar3.f17168c;
            Object objM51918f = uq8.m51918f();
            int i2 = aVar3.f17170e;
            if (i2 == 0) {
                wre.m54934b(obj2);
                aVar3.f17166a = c12537a;
                aVar3.f17167b = ii9Var;
                aVar3.f17170e = 1;
                if (super.mo20105e(c12537a, ii9Var, ii9Var2, aVar3) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = (C12539c.a) aVar3.f17166a;
                    wre.m54934b(obj2);
                    obj = obj2;
                    config = aVar2;
                    l8iVarM20146v = (l8i) obj;
                    config.m20149y(l8iVarM20146v);
                    return y3i.f54824a;
                }
                ii9Var = (ii9) aVar3.f17167b;
                c12537a = (C12537a) aVar3.f17166a;
                wre.m54934b(obj2);
            }
            ii9 ii9Var3 = ii9Var;
            config = c12537a.getConfig();
            l8iVarM20146v = c12537a.getConfig().m20146v();
            if (l8iVarM20146v == null) {
                aVar3.f17166a = config;
                aVar3.f17167b = null;
                aVar3.f17170e = 2;
                Object objM56511c = xne.m56511c(ii9Var3, "SsoOidc", "SSO_OIDC", "sso_oidc", null, aVar3, 16, null);
                if (objM56511c == objM51918f) {
                    return objM51918f;
                }
                aVar2 = config;
                obj = objM56511c;
                config = aVar2;
                l8iVarM20146v = (l8i) obj;
            }
            config.m20149y(l8iVarM20146v);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.c2g$c */
    public static final class C12539c implements c7f, n28, xse {

        /* renamed from: q */
        public static final b f17171q = new b(null);

        /* renamed from: a */
        public final /* synthetic */ n28 f17172a;

        /* renamed from: b */
        public final /* synthetic */ xse f17173b;

        /* renamed from: c */
        public final String f17174c;

        /* renamed from: d */
        public final String f17175d;

        /* renamed from: e */
        public final List f17176e;

        /* renamed from: f */
        public final qc4 f17177f;

        /* renamed from: g */
        public final e2g f17178g;

        /* renamed from: h */
        public final l8i f17179h;

        /* renamed from: i */
        public final List f17180i;

        /* renamed from: j */
        public final gja f17181j;

        /* renamed from: k */
        public final tse f17182k;

        /* renamed from: l */
        public final vdh f17183l;

        /* renamed from: m */
        public final boolean f17184m;

        /* renamed from: n */
        public final boolean f17185n;

        /* renamed from: o */
        public final String f17186o;

        /* renamed from: p */
        public final a2g f17187p;

        /* renamed from: o.c2g$c$a */
        public static final class a implements n81, s18, n28.InterfaceC15480a, xse.InterfaceC18242a, c7f.InterfaceC12584a, sdh {

            /* renamed from: d */
            public String f17191d;

            /* renamed from: f */
            public qc4 f17193f;

            /* renamed from: g */
            public e2g f17194g;

            /* renamed from: h */
            public l8i f17195h;

            /* renamed from: j */
            public gja f17197j;

            /* renamed from: k */
            public tse f17198k;

            /* renamed from: l */
            public vdh f17199l;

            /* renamed from: m */
            public Boolean f17200m;

            /* renamed from: n */
            public Boolean f17201n;

            /* renamed from: o */
            public String f17202o;

            /* renamed from: p */
            public a2g f17203p;

            /* renamed from: a */
            public final /* synthetic */ v28.C17502a f17188a = new v28.C17502a();

            /* renamed from: b */
            public final /* synthetic */ zse.C18700a f17189b = new zse.C18700a();

            /* renamed from: c */
            public String f17190c = "SSO OIDC";

            /* renamed from: e */
            public List f17192e = ch3.m21246k();

            /* renamed from: i */
            public List f17196i = new ArrayList();

            @Override // p001o.sdh
            /* renamed from: a */
            public vdh mo20125a() {
                return this.f17199l;
            }

            @Override // p001o.n28.InterfaceC15480a
            /* renamed from: b */
            public void mo20126b(t18 t18Var) {
                this.f17188a.mo20126b(t18Var);
            }

            @Override // p001o.n81
            /* renamed from: c */
            public Boolean mo20127c() {
                return this.f17201n;
            }

            @Override // p001o.n81
            /* renamed from: d */
            public void mo20128d(Boolean bool) {
                this.f17201n = bool;
            }

            @Override // p001o.n81
            /* renamed from: e */
            public Boolean mo20129e() {
                return this.f17200m;
            }

            @Override // p001o.n81
            /* renamed from: f */
            public void mo20130f(String str) {
                this.f17202o = str;
            }

            @Override // p001o.n81
            /* renamed from: g */
            public void mo20131g(Boolean bool) {
                this.f17200m = bool;
            }

            @Override // p001o.n81
            /* renamed from: h */
            public void mo20132h(String str) {
                this.f17191d = str;
            }

            @Override // p001o.n81
            /* renamed from: i */
            public String mo20133i() {
                return this.f17202o;
            }

            @Override // p001o.om1
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C12539c build() {
                return new C12539c(this, null);
            }

            @Override // p001o.xse.InterfaceC18242a
            /* renamed from: k */
            public void mo20135k(vse vseVar) {
                this.f17189b.mo20135k(vseVar);
            }

            @Override // p001o.c7f.InterfaceC12584a
            /* renamed from: l */
            public void mo20136l(gja gjaVar) {
                this.f17197j = gjaVar;
            }

            /* renamed from: m */
            public n28 m20137m() {
                return this.f17188a.m52299m();
            }

            @Override // p001o.n81
            /* renamed from: n */
            public String mo20138n() {
                return this.f17191d;
            }

            @Override // p001o.c7f.InterfaceC12584a
            /* renamed from: o */
            public gja mo20139o() {
                return this.f17197j;
            }

            /* renamed from: p */
            public xse m20140p() {
                return this.f17189b.m59820b();
            }

            /* renamed from: q */
            public final a2g m20141q() {
                return this.f17203p;
            }

            /* renamed from: r */
            public List m20142r() {
                return this.f17192e;
            }

            /* renamed from: s */
            public String m20143s() {
                return this.f17190c;
            }

            /* renamed from: t */
            public qc4 m20144t() {
                return this.f17193f;
            }

            /* renamed from: u */
            public final e2g m20145u() {
                return this.f17194g;
            }

            /* renamed from: v */
            public final l8i m20146v() {
                return this.f17195h;
            }

            /* renamed from: w */
            public List m20147w() {
                return this.f17196i;
            }

            /* renamed from: x */
            public tse m20148x() {
                return this.f17198k;
            }

            /* renamed from: y */
            public final void m20149y(l8i l8iVar) {
                this.f17195h = l8iVar;
            }

            /* renamed from: z */
            public void m20150z(vdh vdhVar) {
                this.f17199l = vdhVar;
            }
        }

        /* renamed from: o.c2g$c$b */
        public static final class b {
            public b() {
            }

            public /* synthetic */ b(id5 id5Var) {
                this();
            }
        }

        public /* synthetic */ C12539c(a aVar, id5 id5Var) {
            this(aVar);
        }

        @Override // p001o.xse
        /* renamed from: a */
        public vse mo20109a() {
            return this.f17173b.mo20109a();
        }

        @Override // p001o.n28
        /* renamed from: b */
        public t18 mo20110b() {
            return this.f17172a.mo20110b();
        }

        /* renamed from: c */
        public String m20111c() {
            return this.f17186o;
        }

        /* renamed from: d */
        public final a2g m20112d() {
            return this.f17187p;
        }

        /* renamed from: e */
        public List m20113e() {
            return this.f17176e;
        }

        /* renamed from: f */
        public String m20114f() {
            return this.f17174c;
        }

        /* renamed from: g */
        public qc4 m20115g() {
            return this.f17177f;
        }

        /* renamed from: h */
        public final e2g m20116h() {
            return this.f17178g;
        }

        /* renamed from: i */
        public final l8i m20117i() {
            return this.f17179h;
        }

        /* renamed from: j */
        public List m20118j() {
            return this.f17180i;
        }

        /* renamed from: k */
        public gja m20119k() {
            return this.f17181j;
        }

        /* renamed from: l */
        public String m20120l() {
            return this.f17175d;
        }

        /* renamed from: m */
        public tse m20121m() {
            return this.f17182k;
        }

        /* renamed from: n */
        public vdh m20122n() {
            return this.f17183l;
        }

        /* renamed from: o */
        public boolean m20123o() {
            return this.f17184m;
        }

        /* renamed from: p */
        public boolean m20124p() {
            return this.f17185n;
        }

        public C12539c(a aVar) {
            this.f17172a = aVar.m20137m();
            this.f17173b = aVar.m20140p();
            this.f17174c = aVar.m20143s();
            this.f17175d = aVar.mo20138n();
            this.f17176e = aVar.m20142r();
            qc4 qc4VarM20144t = aVar.m20144t();
            this.f17177f = qc4VarM20144t == null ? upa.m51911a(new pc5(null, null, mo20110b(), m20120l(), 3, null)) : qc4VarM20144t;
            e2g e2gVarM20145u = aVar.m20145u();
            this.f17178g = e2gVarM20145u == null ? new qh5() : e2gVarM20145u;
            this.f17179h = aVar.m20146v();
            this.f17180i = aVar.m20147w();
            gja gjaVarMo20139o = aVar.mo20139o();
            this.f17181j = gjaVarMo20139o == null ? gja.C13753c.f25332c : gjaVarMo20139o;
            tse tseVarM20148x = aVar.m20148x();
            this.f17182k = tseVarM20148x == null ? m81.f34943d.m38527a() : tseVarM20148x;
            vdh vdhVarMo20125a = aVar.mo20125a();
            this.f17183l = vdhVarMo20125a == null ? vt7.m53402a(vdh.f50220a) : vdhVarMo20125a;
            Boolean boolMo20129e = aVar.mo20129e();
            this.f17184m = boolMo20129e != null ? boolMo20129e.booleanValue() : false;
            Boolean boolMo20127c = aVar.mo20127c();
            this.f17185n = boolMo20127c != null ? boolMo20127c.booleanValue() : false;
            this.f17186o = aVar.mo20133i();
            a2g a2gVarM20141q = aVar.m20141q();
            this.f17187p = a2gVarM20141q == null ? new oh5(null, 1, null) : a2gVarM20141q;
        }
    }

    Object E2(sa4 sa4Var, n64 n64Var);
}
