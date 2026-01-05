package p001o;

import com.amazonaws.regions.ServiceAbbreviations;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p001o.c7f;
import p001o.gja;
import p001o.n28;
import p001o.v28;
import p001o.xse;
import p001o.zse;

/* loaded from: classes3.dex */
public interface cxe extends b7f {

    /* renamed from: V */
    public static final C12765b f18758V = C12765b.f18760a;

    /* renamed from: o.cxe$a */
    public static final class C12764a extends l9 {

        /* renamed from: a */
        public final C12766c.a f18759a = new C12766c.a();

        @Override // p001o.b7f.InterfaceC12296a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C12766c.a getConfig() {
            return this.f18759a;
        }

        @Override // p001o.l9
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public cxe mo20100b(C12766c c12766c) {
            sq8.m48649h(c12766c, "config");
            return new og5(c12766c);
        }
    }

    /* renamed from: o.cxe$b */
    public static final class C12765b extends s6 {

        /* renamed from: a */
        public static final /* synthetic */ C12765b f18760a = new C12765b();

        /* renamed from: o.cxe$b$a */
        public static final class a extends o64 {

            /* renamed from: a */
            public Object f18761a;

            /* renamed from: b */
            public Object f18762b;

            /* renamed from: c */
            public Object f18763c;

            /* renamed from: d */
            public /* synthetic */ Object f18764d;

            /* renamed from: f */
            public int f18766f;

            public a(n64 n64Var) {
                super(n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                this.f18764d = obj;
                this.f18766f |= Integer.MIN_VALUE;
                return C12765b.this.mo20105e(null, null, null, this);
            }
        }

        @Override // p001o.d7f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public C12764a mo20104b() {
            return new C12764a();
        }

        @Override // p001o.m9
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo20103a(C12764a c12764a) {
            sq8.m48649h(c12764a, "builder");
            super.mo20103a(c12764a);
            c12764a.getConfig().m22007F().add(0, new pb3());
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x00c2 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
        @Override // p001o.s6
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object mo20105e(C12764a c12764a, ii9 ii9Var, ii9 ii9Var2, n64 n64Var) {
            a aVar;
            C12766c.a config;
            l8i l8iVarM22004C;
            ii9 ii9Var3;
            C12764a c12764a2;
            C12766c.a aVar2;
            C12764a c12764a3 = c12764a;
            ii9 ii9Var4 = ii9Var;
            if (n64Var instanceof a) {
                aVar = (a) n64Var;
                int i = aVar.f18766f;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.f18766f = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(n64Var);
                }
            }
            Object obj = aVar.f18764d;
            Object objM51918f = uq8.m51918f();
            int i2 = aVar.f18766f;
            if (i2 == 0) {
                wre.m54934b(obj);
                aVar.f18761a = c12764a3;
                aVar.f18762b = ii9Var4;
                aVar.f18766f = 1;
                if (super.mo20105e(c12764a3, ii9Var4, ii9Var2, aVar) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        wre.m54934b(obj);
                        return y3i.f54824a;
                    }
                    aVar2 = (C12766c.a) aVar.f18763c;
                    ii9Var4 = (ii9) aVar.f18762b;
                    c12764a2 = (C12764a) aVar.f18761a;
                    wre.m54934b(obj);
                    l8i l8iVar = (l8i) obj;
                    ii9Var3 = ii9Var4;
                    config = aVar2;
                    c12764a3 = c12764a2;
                    l8iVarM22004C = l8iVar;
                    config.m22020S(l8iVarM22004C);
                    aVar.f18761a = null;
                    aVar.f18762b = null;
                    aVar.f18763c = null;
                    aVar.f18766f = 3;
                    if (i07.m31336b(c12764a3, ii9Var3, null, aVar, 4, null) == objM51918f) {
                        return objM51918f;
                    }
                    return y3i.f54824a;
                }
                ii9 ii9Var5 = (ii9) aVar.f18762b;
                C12764a c12764a4 = (C12764a) aVar.f18761a;
                wre.m54934b(obj);
                ii9Var4 = ii9Var5;
                c12764a3 = c12764a4;
            }
            config = c12764a3.getConfig();
            l8iVarM22004C = c12764a3.getConfig().m22004C();
            if (l8iVarM22004C != null) {
                ii9Var3 = ii9Var4;
                config.m22020S(l8iVarM22004C);
                aVar.f18761a = null;
                aVar.f18762b = null;
                aVar.f18763c = null;
                aVar.f18766f = 3;
                if (i07.m31336b(c12764a3, ii9Var3, null, aVar, 4, null) == objM51918f) {
                }
                return y3i.f54824a;
            }
            aVar.f18761a = c12764a3;
            aVar.f18762b = ii9Var4;
            aVar.f18763c = config;
            aVar.f18766f = 2;
            Object objM56511c = xne.m56511c(ii9Var4, "S3", "S3", ServiceAbbreviations.S3, null, aVar, 16, null);
            if (objM56511c == objM51918f) {
                return objM51918f;
            }
            c12764a2 = c12764a3;
            aVar2 = config;
            obj = objM56511c;
            l8i l8iVar2 = (l8i) obj;
            ii9Var3 = ii9Var4;
            config = aVar2;
            c12764a3 = c12764a2;
            l8iVarM22004C = l8iVar2;
            config.m22020S(l8iVarM22004C);
            aVar.f18761a = null;
            aVar.f18762b = null;
            aVar.f18763c = null;
            aVar.f18766f = 3;
            if (i07.m31336b(c12764a3, ii9Var3, null, aVar, 4, null) == objM51918f) {
            }
            return y3i.f54824a;
        }
    }

    /* renamed from: o.cxe$c */
    public static final class C12766c implements c7f, n28, xse {

        /* renamed from: z */
        public static final b f18767z = new b(null);

        /* renamed from: a */
        public final /* synthetic */ n28 f18768a;

        /* renamed from: b */
        public final /* synthetic */ xse f18769b;

        /* renamed from: c */
        public final String f18770c;

        /* renamed from: d */
        public final String f18771d;

        /* renamed from: e */
        public final List f18772e;

        /* renamed from: f */
        public final Long f18773f;

        /* renamed from: g */
        public final qc4 f18774g;

        /* renamed from: h */
        public final boolean f18775h;

        /* renamed from: i */
        public final boolean f18776i;

        /* renamed from: j */
        public final boolean f18777j;

        /* renamed from: k */
        public final boolean f18778k;

        /* renamed from: l */
        public final fxe f18779l;

        /* renamed from: m */
        public final l8i f18780m;

        /* renamed from: n */
        public final qc4 f18781n;

        /* renamed from: o */
        public final boolean f18782o;

        /* renamed from: p */
        public final List f18783p;

        /* renamed from: q */
        public final gja f18784q;

        /* renamed from: r */
        public final tse f18785r;

        /* renamed from: s */
        public final Set f18786s;

        /* renamed from: t */
        public final vdh f18787t;

        /* renamed from: u */
        public final boolean f18788u;

        /* renamed from: v */
        public final boolean f18789v;

        /* renamed from: w */
        public final boolean f18790w;

        /* renamed from: x */
        public final String f18791x;

        /* renamed from: y */
        public final axe f18792y;

        /* renamed from: o.cxe$c$a */
        public static final class a implements n81, s18, n28.InterfaceC15480a, xse.InterfaceC18242a, c7f.InterfaceC12584a, rrf, sdh {

            /* renamed from: d */
            public String f18796d;

            /* renamed from: g */
            public qc4 f18799g;

            /* renamed from: h */
            public Boolean f18800h;

            /* renamed from: i */
            public Boolean f18801i;

            /* renamed from: j */
            public Boolean f18802j;

            /* renamed from: k */
            public Boolean f18803k;

            /* renamed from: l */
            public fxe f18804l;

            /* renamed from: m */
            public l8i f18805m;

            /* renamed from: n */
            public qc4 f18806n;

            /* renamed from: o */
            public Boolean f18807o;

            /* renamed from: q */
            public gja f18809q;

            /* renamed from: r */
            public tse f18810r;

            /* renamed from: s */
            public Set f18811s;

            /* renamed from: t */
            public vdh f18812t;

            /* renamed from: u */
            public Boolean f18813u;

            /* renamed from: v */
            public Boolean f18814v;

            /* renamed from: w */
            public Boolean f18815w;

            /* renamed from: x */
            public String f18816x;

            /* renamed from: y */
            public axe f18817y;

            /* renamed from: a */
            public final /* synthetic */ v28.C17502a f18793a = new v28.C17502a();

            /* renamed from: b */
            public final /* synthetic */ zse.C18700a f18794b = new zse.C18700a();

            /* renamed from: c */
            public String f18795c = "S3";

            /* renamed from: e */
            public List f18797e = ch3.m21246k();

            /* renamed from: f */
            public Long f18798f = 2097152L;

            /* renamed from: p */
            public List f18808p = new ArrayList();

            /* renamed from: A */
            public final Boolean m22002A() {
                return this.f18803k;
            }

            /* renamed from: B */
            public final fxe m22003B() {
                return this.f18804l;
            }

            /* renamed from: C */
            public final l8i m22004C() {
                return this.f18805m;
            }

            /* renamed from: D */
            public final qc4 m22005D() {
                return this.f18806n;
            }

            /* renamed from: E */
            public final Boolean m22006E() {
                return this.f18807o;
            }

            /* renamed from: F */
            public List m22007F() {
                return this.f18808p;
            }

            /* renamed from: G */
            public tse m22008G() {
                return this.f18810r;
            }

            /* renamed from: H */
            public final Boolean m22009H() {
                return this.f18813u;
            }

            /* renamed from: I */
            public final void m22010I(axe axeVar) {
                this.f18817y = axeVar;
            }

            /* renamed from: J */
            public void m22011J(List list) {
                sq8.m48649h(list, "<set-?>");
                this.f18797e = list;
            }

            /* renamed from: K */
            public void m22012K(String str) {
                sq8.m48649h(str, "<set-?>");
                this.f18795c = str;
            }

            /* renamed from: L */
            public final void m22013L(Long l) {
                this.f18798f = l;
            }

            /* renamed from: M */
            public void m22014M(qc4 qc4Var) {
                this.f18799g = qc4Var;
            }

            /* renamed from: N */
            public final void m22015N(Boolean bool) {
                this.f18800h = bool;
            }

            /* renamed from: O */
            public final void m22016O(Boolean bool) {
                this.f18801i = bool;
            }

            /* renamed from: P */
            public final void m22017P(Boolean bool) {
                this.f18802j = bool;
            }

            /* renamed from: Q */
            public final void m22018Q(Boolean bool) {
                this.f18803k = bool;
            }

            /* renamed from: R */
            public final void m22019R(fxe fxeVar) {
                this.f18804l = fxeVar;
            }

            /* renamed from: S */
            public final void m22020S(l8i l8iVar) {
                this.f18805m = l8iVar;
            }

            /* renamed from: T */
            public final void m22021T(qc4 qc4Var) {
                this.f18806n = qc4Var;
            }

            /* renamed from: U */
            public final void m22022U(Boolean bool) {
                this.f18807o = bool;
            }

            /* renamed from: V */
            public void m22023V(List list) {
                sq8.m48649h(list, "<set-?>");
                this.f18808p = list;
            }

            /* renamed from: W */
            public void m22024W(tse tseVar) {
                this.f18810r = tseVar;
            }

            /* renamed from: X */
            public void m22025X(vdh vdhVar) {
                this.f18812t = vdhVar;
            }

            /* renamed from: Y */
            public final void m22026Y(Boolean bool) {
                this.f18813u = bool;
            }

            @Override // p001o.sdh
            /* renamed from: a */
            public vdh mo20125a() {
                return this.f18812t;
            }

            @Override // p001o.n28.InterfaceC15480a
            /* renamed from: b */
            public void mo20126b(t18 t18Var) {
                this.f18793a.mo20126b(t18Var);
            }

            @Override // p001o.n81
            /* renamed from: c */
            public Boolean mo20127c() {
                return this.f18815w;
            }

            @Override // p001o.n81
            /* renamed from: d */
            public void mo20128d(Boolean bool) {
                this.f18815w = bool;
            }

            @Override // p001o.n81
            /* renamed from: e */
            public Boolean mo20129e() {
                return this.f18814v;
            }

            @Override // p001o.n81
            /* renamed from: f */
            public void mo20130f(String str) {
                this.f18816x = str;
            }

            @Override // p001o.n81
            /* renamed from: g */
            public void mo20131g(Boolean bool) {
                this.f18814v = bool;
            }

            @Override // p001o.n81
            /* renamed from: h */
            public void mo20132h(String str) {
                this.f18796d = str;
            }

            @Override // p001o.n81
            /* renamed from: i */
            public String mo20133i() {
                return this.f18816x;
            }

            @Override // p001o.rrf
            /* renamed from: j */
            public Set mo22027j() {
                return this.f18811s;
            }

            @Override // p001o.xse.InterfaceC18242a
            /* renamed from: k */
            public void mo20135k(vse vseVar) {
                this.f18794b.mo20135k(vseVar);
            }

            @Override // p001o.c7f.InterfaceC12584a
            /* renamed from: l */
            public void mo20136l(gja gjaVar) {
                this.f18809q = gjaVar;
            }

            @Override // p001o.rrf
            /* renamed from: m */
            public void mo22028m(Set set) {
                this.f18811s = set;
            }

            @Override // p001o.n81
            /* renamed from: n */
            public String mo20138n() {
                return this.f18796d;
            }

            @Override // p001o.c7f.InterfaceC12584a
            /* renamed from: o */
            public gja mo20139o() {
                return this.f18809q;
            }

            @Override // p001o.om1
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public C12766c build() {
                return new C12766c(this, null);
            }

            /* renamed from: q */
            public n28 m22030q() {
                return this.f18793a.m52299m();
            }

            /* renamed from: r */
            public xse m22031r() {
                return this.f18794b.m59820b();
            }

            /* renamed from: s */
            public final axe m22032s() {
                return this.f18817y;
            }

            /* renamed from: t */
            public List m22033t() {
                return this.f18797e;
            }

            /* renamed from: u */
            public String m22034u() {
                return this.f18795c;
            }

            /* renamed from: v */
            public final Long m22035v() {
                return this.f18798f;
            }

            /* renamed from: w */
            public qc4 m22036w() {
                return this.f18799g;
            }

            /* renamed from: x */
            public final Boolean m22037x() {
                return this.f18800h;
            }

            /* renamed from: y */
            public final Boolean m22038y() {
                return this.f18801i;
            }

            /* renamed from: z */
            public final Boolean m22039z() {
                return this.f18802j;
            }
        }

        /* renamed from: o.cxe$c$b */
        public static final class b {
            public b() {
            }

            public /* synthetic */ b(id5 id5Var) {
                this();
            }
        }

        public /* synthetic */ C12766c(a aVar, id5 id5Var) {
            this(aVar);
        }

        @Override // p001o.xse
        /* renamed from: a */
        public vse mo20109a() {
            return this.f18769b.mo20109a();
        }

        @Override // p001o.n28
        /* renamed from: b */
        public t18 mo20110b() {
            return this.f18768a.mo20110b();
        }

        /* renamed from: c */
        public String m21978c() {
            return this.f18791x;
        }

        /* renamed from: d */
        public final axe m21979d() {
            return this.f18792y;
        }

        /* renamed from: e */
        public List m21980e() {
            return this.f18772e;
        }

        /* renamed from: f */
        public String m21981f() {
            return this.f18770c;
        }

        /* renamed from: g */
        public final Long m21982g() {
            return this.f18773f;
        }

        /* renamed from: h */
        public qc4 m21983h() {
            return this.f18774g;
        }

        /* renamed from: i */
        public final boolean m21984i() {
            return this.f18775h;
        }

        /* renamed from: j */
        public final boolean m21985j() {
            return this.f18776i;
        }

        /* renamed from: k */
        public final boolean m21986k() {
            return this.f18777j;
        }

        /* renamed from: l */
        public final boolean m21987l() {
            return this.f18778k;
        }

        /* renamed from: m */
        public final fxe m21988m() {
            return this.f18779l;
        }

        /* renamed from: n */
        public final l8i m21989n() {
            return this.f18780m;
        }

        /* renamed from: o */
        public final qc4 m21990o() {
            return this.f18781n;
        }

        /* renamed from: p */
        public final boolean m21991p() {
            return this.f18782o;
        }

        /* renamed from: q */
        public List m21992q() {
            return this.f18783p;
        }

        /* renamed from: r */
        public gja m21993r() {
            return this.f18784q;
        }

        /* renamed from: s */
        public String m21994s() {
            return this.f18771d;
        }

        /* renamed from: t */
        public tse m21995t() {
            return this.f18785r;
        }

        /* renamed from: u */
        public Set m21996u() {
            return this.f18786s;
        }

        /* renamed from: v */
        public vdh m21997v() {
            return this.f18787t;
        }

        /* renamed from: w */
        public final boolean m21998w() {
            return this.f18788u;
        }

        /* renamed from: x */
        public boolean m21999x() {
            return this.f18789v;
        }

        /* renamed from: y */
        public boolean m22000y() {
            return this.f18790w;
        }

        /* renamed from: z */
        public final a m22001z() {
            a aVar = new a();
            aVar.m22012K(m21981f());
            aVar.mo20132h(m21994s());
            aVar.m22011J(m21980e());
            aVar.m22013L(this.f18773f);
            aVar.m22014M(m21983h());
            aVar.m22015N(Boolean.valueOf(this.f18775h));
            aVar.m22016O(Boolean.valueOf(this.f18776i));
            aVar.m22017P(Boolean.valueOf(this.f18777j));
            aVar.m22018Q(Boolean.valueOf(this.f18778k));
            aVar.m22019R(this.f18779l);
            aVar.m22020S(this.f18780m);
            aVar.m22021T(this.f18781n);
            aVar.m22022U(Boolean.valueOf(this.f18782o));
            aVar.mo20126b(mo20110b());
            aVar.m22023V(kh3.T0(m21992q()));
            aVar.mo20136l(m21993r());
            aVar.m22024W(m21995t());
            aVar.mo20135k(mo20109a());
            aVar.mo22028m(m21996u());
            aVar.m22025X(m21997v());
            aVar.m22026Y(Boolean.valueOf(this.f18788u));
            aVar.mo20131g(Boolean.valueOf(m21999x()));
            aVar.mo20128d(Boolean.valueOf(m22000y()));
            aVar.mo20130f(m21978c());
            aVar.m22010I(this.f18792y);
            return aVar;
        }

        public C12766c(a aVar) {
            this.f18768a = aVar.m22030q();
            this.f18769b = aVar.m22031r();
            this.f18770c = aVar.m22034u();
            this.f18771d = aVar.mo20138n();
            this.f18772e = aVar.m22033t();
            this.f18773f = aVar.m22035v();
            qc4 qc4VarM22036w = aVar.m22036w();
            this.f18774g = qc4VarM22036w == null ? upa.m51911a(new pc5(null, null, mo20110b(), m21994s(), 3, null)) : qc4VarM22036w;
            Boolean boolM22037x = aVar.m22037x();
            this.f18775h = boolM22037x != null ? boolM22037x.booleanValue() : false;
            Boolean boolM22038y = aVar.m22038y();
            this.f18776i = boolM22038y != null ? boolM22038y.booleanValue() : false;
            Boolean boolM22039z = aVar.m22039z();
            this.f18777j = boolM22039z != null ? boolM22039z.booleanValue() : false;
            Boolean boolM22002A = aVar.m22002A();
            this.f18778k = boolM22002A != null ? boolM22002A.booleanValue() : true;
            fxe fxeVarM22003B = aVar.m22003B();
            fxeVarM22003B = fxeVarM22003B == null ? new pg5() : fxeVarM22003B;
            this.f18779l = fxeVarM22003B;
            this.f18780m = aVar.m22004C();
            qc4 qc4VarM22005D = aVar.m22005D();
            this.f18781n = qc4VarM22005D == null ? new rg5(null, null, null, 0L, 15, null) : qc4VarM22005D;
            Boolean boolM22006E = aVar.m22006E();
            this.f18782o = boolM22006E != null ? boolM22006E.booleanValue() : false;
            this.f18783p = aVar.m22007F();
            gja gjaVarMo20139o = aVar.mo20139o();
            this.f18784q = gjaVarMo20139o == null ? gja.C13753c.f25332c : gjaVarMo20139o;
            tse tseVarM22008G = aVar.m22008G();
            this.f18785r = tseVarM22008G == null ? m81.f34943d.m38527a() : tseVarM22008G;
            this.f18786s = aVar.mo22027j();
            vdh vdhVarMo20125a = aVar.mo20125a();
            this.f18787t = vdhVarMo20125a == null ? vt7.m53402a(vdh.f50220a) : vdhVarMo20125a;
            Boolean boolM22009H = aVar.m22009H();
            this.f18788u = boolM22009H != null ? boolM22009H.booleanValue() : false;
            Boolean boolMo20129e = aVar.mo20129e();
            this.f18789v = boolMo20129e != null ? boolMo20129e.booleanValue() : false;
            Boolean boolMo20127c = aVar.mo20127c();
            this.f18790w = boolMo20127c != null ? boolMo20127c.booleanValue() : false;
            this.f18791x = aVar.mo20133i();
            axe axeVarM22032s = aVar.m22032s();
            this.f18792y = axeVarM22032s == null ? new kg5(fxeVarM22003B) : axeVarM22032s;
        }
    }

    Object A1(ma4 ma4Var, n64 n64Var);

    /* renamed from: E */
    Object mo21970E(ca4 ca4Var, n64 n64Var);

    Object Q1(fl5 fl5Var, n64 n64Var);

    Object V1(c7i c7iVar, n64 n64Var);

    Object X2(s3e s3eVar, n64 n64Var);

    C12766c getConfig();

    Object h0(qx7 qx7Var, n64 n64Var);

    Object h1(am3 am3Var, n64 n64Var);

    Object i2(efa efaVar, n64 n64Var);

    /* renamed from: v */
    Object mo21971v(e6 e6Var, n64 n64Var);

    /* renamed from: w */
    Object mo21972w(wq7 wq7Var, nl7 nl7Var, n64 n64Var);
}
