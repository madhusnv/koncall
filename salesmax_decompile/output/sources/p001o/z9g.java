package p001o;

import com.amazonaws.regions.ServiceAbbreviations;
import java.util.ArrayList;
import java.util.List;
import p001o.c7f;
import p001o.gja;
import p001o.n28;
import p001o.v28;
import p001o.xse;
import p001o.zse;

/* loaded from: classes2.dex */
public interface z9g extends b7f {
    public static final C18592b d0 = C18592b.f56764a;

    /* renamed from: o.z9g$a */
    public static final class C18591a extends l9 {

        /* renamed from: a */
        public final C18593c.a f56763a = new C18593c.a();

        @Override // p001o.b7f.InterfaceC12296a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C18593c.a getConfig() {
            return this.f56763a;
        }

        @Override // p001o.l9
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public z9g mo20100b(C18593c c18593c) {
            sq8.m48649h(c18593c, "config");
            return new sh5(c18593c);
        }
    }

    /* renamed from: o.z9g$b */
    public static final class C18592b extends s6 {

        /* renamed from: a */
        public static final /* synthetic */ C18592b f56764a = new C18592b();

        /* renamed from: o.z9g$b$a */
        public static final class a extends o64 {

            /* renamed from: a */
            public Object f56765a;

            /* renamed from: b */
            public Object f56766b;

            /* renamed from: c */
            public /* synthetic */ Object f56767c;

            /* renamed from: e */
            public int f56769e;

            public a(n64 n64Var) {
                super(n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                this.f56767c = obj;
                this.f56769e |= Integer.MIN_VALUE;
                return C18592b.this.mo20105e(null, null, null, this);
            }
        }

        @Override // p001o.d7f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public C18591a mo20104b() {
            return new C18591a();
        }

        @Override // p001o.m9
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo20103a(C18591a c18591a) {
            sq8.m48649h(c18591a, "builder");
            super.mo20103a(c18591a);
            c18591a.getConfig().m59031w().add(0, new pb3());
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p001o.s6
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object mo20105e(C18591a c18591a, ii9 ii9Var, ii9 ii9Var2, n64 n64Var) {
            a aVar;
            C18593c.a config;
            l8i l8iVarM59030v;
            C18593c.a aVar2;
            Object obj;
            if (n64Var instanceof a) {
                aVar = (a) n64Var;
                int i = aVar.f56769e;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.f56769e = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(n64Var);
                }
            }
            a aVar3 = aVar;
            Object obj2 = aVar3.f56767c;
            Object objM51918f = uq8.m51918f();
            int i2 = aVar3.f56769e;
            if (i2 == 0) {
                wre.m54934b(obj2);
                aVar3.f56765a = c18591a;
                aVar3.f56766b = ii9Var;
                aVar3.f56769e = 1;
                if (super.mo20105e(c18591a, ii9Var, ii9Var2, aVar3) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = (C18593c.a) aVar3.f56765a;
                    wre.m54934b(obj2);
                    obj = obj2;
                    config = aVar2;
                    l8iVarM59030v = (l8i) obj;
                    config.m59034z(l8iVarM59030v);
                    return y3i.f54824a;
                }
                ii9Var = (ii9) aVar3.f56766b;
                c18591a = (C18591a) aVar3.f56765a;
                wre.m54934b(obj2);
            }
            ii9 ii9Var3 = ii9Var;
            config = c18591a.getConfig();
            l8iVarM59030v = c18591a.getConfig().m59030v();
            if (l8iVarM59030v == null) {
                aVar3.f56765a = config;
                aVar3.f56766b = null;
                aVar3.f56769e = 2;
                Object objM56511c = xne.m56511c(ii9Var3, "Sts", "STS", ServiceAbbreviations.STS, null, aVar3, 16, null);
                if (objM56511c == objM51918f) {
                    return objM51918f;
                }
                aVar2 = config;
                obj = objM56511c;
                config = aVar2;
                l8iVarM59030v = (l8i) obj;
            }
            config.m59034z(l8iVarM59030v);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.z9g$c */
    public static final class C18593c implements c7f, n28, xse {

        /* renamed from: q */
        public static final b f56770q = new b(null);

        /* renamed from: a */
        public final /* synthetic */ n28 f56771a;

        /* renamed from: b */
        public final /* synthetic */ xse f56772b;

        /* renamed from: c */
        public final String f56773c;

        /* renamed from: d */
        public final String f56774d;

        /* renamed from: e */
        public final List f56775e;

        /* renamed from: f */
        public final qc4 f56776f;

        /* renamed from: g */
        public final bag f56777g;

        /* renamed from: h */
        public final l8i f56778h;

        /* renamed from: i */
        public final List f56779i;

        /* renamed from: j */
        public final gja f56780j;

        /* renamed from: k */
        public final tse f56781k;

        /* renamed from: l */
        public final vdh f56782l;

        /* renamed from: m */
        public final boolean f56783m;

        /* renamed from: n */
        public final boolean f56784n;

        /* renamed from: o */
        public final String f56785o;

        /* renamed from: p */
        public final x9g f56786p;

        /* renamed from: o.z9g$c$a */
        public static final class a implements n81, s18, n28.InterfaceC15480a, xse.InterfaceC18242a, c7f.InterfaceC12584a, sdh {

            /* renamed from: d */
            public String f56790d;

            /* renamed from: f */
            public qc4 f56792f;

            /* renamed from: g */
            public bag f56793g;

            /* renamed from: h */
            public l8i f56794h;

            /* renamed from: j */
            public gja f56796j;

            /* renamed from: k */
            public tse f56797k;

            /* renamed from: l */
            public vdh f56798l;

            /* renamed from: m */
            public Boolean f56799m;

            /* renamed from: n */
            public Boolean f56800n;

            /* renamed from: o */
            public String f56801o;

            /* renamed from: p */
            public x9g f56802p;

            /* renamed from: a */
            public final /* synthetic */ v28.C17502a f56787a = new v28.C17502a();

            /* renamed from: b */
            public final /* synthetic */ zse.C18700a f56788b = new zse.C18700a();

            /* renamed from: c */
            public String f56789c = "STS";

            /* renamed from: e */
            public List f56791e = ch3.m21246k();

            /* renamed from: i */
            public List f56795i = new ArrayList();

            /* renamed from: A */
            public void m59021A(vdh vdhVar) {
                this.f56798l = vdhVar;
            }

            @Override // p001o.sdh
            /* renamed from: a */
            public vdh mo20125a() {
                return this.f56798l;
            }

            @Override // p001o.n28.InterfaceC15480a
            /* renamed from: b */
            public void mo20126b(t18 t18Var) {
                this.f56787a.mo20126b(t18Var);
            }

            @Override // p001o.n81
            /* renamed from: c */
            public Boolean mo20127c() {
                return this.f56800n;
            }

            @Override // p001o.n81
            /* renamed from: d */
            public void mo20128d(Boolean bool) {
                this.f56800n = bool;
            }

            @Override // p001o.n81
            /* renamed from: e */
            public Boolean mo20129e() {
                return this.f56799m;
            }

            @Override // p001o.n81
            /* renamed from: f */
            public void mo20130f(String str) {
                this.f56801o = str;
            }

            @Override // p001o.n81
            /* renamed from: g */
            public void mo20131g(Boolean bool) {
                this.f56799m = bool;
            }

            @Override // p001o.n81
            /* renamed from: h */
            public void mo20132h(String str) {
                this.f56790d = str;
            }

            @Override // p001o.n81
            /* renamed from: i */
            public String mo20133i() {
                return this.f56801o;
            }

            @Override // p001o.om1
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C18593c build() {
                return new C18593c(this, null);
            }

            @Override // p001o.xse.InterfaceC18242a
            /* renamed from: k */
            public void mo20135k(vse vseVar) {
                this.f56788b.mo20135k(vseVar);
            }

            @Override // p001o.c7f.InterfaceC12584a
            /* renamed from: l */
            public void mo20136l(gja gjaVar) {
                this.f56796j = gjaVar;
            }

            /* renamed from: m */
            public n28 m59023m() {
                return this.f56787a.m52299m();
            }

            @Override // p001o.n81
            /* renamed from: n */
            public String mo20138n() {
                return this.f56790d;
            }

            @Override // p001o.c7f.InterfaceC12584a
            /* renamed from: o */
            public gja mo20139o() {
                return this.f56796j;
            }

            /* renamed from: p */
            public xse m59024p() {
                return this.f56788b.m59820b();
            }

            /* renamed from: q */
            public final x9g m59025q() {
                return this.f56802p;
            }

            /* renamed from: r */
            public List m59026r() {
                return this.f56791e;
            }

            /* renamed from: s */
            public String m59027s() {
                return this.f56789c;
            }

            /* renamed from: t */
            public qc4 m59028t() {
                return this.f56792f;
            }

            /* renamed from: u */
            public final bag m59029u() {
                return this.f56793g;
            }

            /* renamed from: v */
            public final l8i m59030v() {
                return this.f56794h;
            }

            /* renamed from: w */
            public List m59031w() {
                return this.f56795i;
            }

            /* renamed from: x */
            public tse m59032x() {
                return this.f56797k;
            }

            /* renamed from: y */
            public void m59033y(qc4 qc4Var) {
                this.f56792f = qc4Var;
            }

            /* renamed from: z */
            public final void m59034z(l8i l8iVar) {
                this.f56794h = l8iVar;
            }
        }

        /* renamed from: o.z9g$c$b */
        public static final class b {
            public b() {
            }

            public /* synthetic */ b(id5 id5Var) {
                this();
            }
        }

        public /* synthetic */ C18593c(a aVar, id5 id5Var) {
            this(aVar);
        }

        @Override // p001o.xse
        /* renamed from: a */
        public vse mo20109a() {
            return this.f56772b.mo20109a();
        }

        @Override // p001o.n28
        /* renamed from: b */
        public t18 mo20110b() {
            return this.f56771a.mo20110b();
        }

        /* renamed from: c */
        public String m59007c() {
            return this.f56785o;
        }

        /* renamed from: d */
        public final x9g m59008d() {
            return this.f56786p;
        }

        /* renamed from: e */
        public List m59009e() {
            return this.f56775e;
        }

        /* renamed from: f */
        public String m59010f() {
            return this.f56773c;
        }

        /* renamed from: g */
        public qc4 m59011g() {
            return this.f56776f;
        }

        /* renamed from: h */
        public final bag m59012h() {
            return this.f56777g;
        }

        /* renamed from: i */
        public final l8i m59013i() {
            return this.f56778h;
        }

        /* renamed from: j */
        public List m59014j() {
            return this.f56779i;
        }

        /* renamed from: k */
        public gja m59015k() {
            return this.f56780j;
        }

        /* renamed from: l */
        public String m59016l() {
            return this.f56774d;
        }

        /* renamed from: m */
        public tse m59017m() {
            return this.f56781k;
        }

        /* renamed from: n */
        public vdh m59018n() {
            return this.f56782l;
        }

        /* renamed from: o */
        public boolean m59019o() {
            return this.f56783m;
        }

        /* renamed from: p */
        public boolean m59020p() {
            return this.f56784n;
        }

        public C18593c(a aVar) {
            this.f56771a = aVar.m59023m();
            this.f56772b = aVar.m59024p();
            this.f56773c = aVar.m59027s();
            this.f56774d = aVar.mo20138n();
            this.f56775e = aVar.m59026r();
            qc4 qc4VarM59028t = aVar.m59028t();
            this.f56776f = qc4VarM59028t == null ? upa.m51911a(new pc5(null, null, mo20110b(), m59016l(), 3, null)) : qc4VarM59028t;
            bag bagVarM59029u = aVar.m59029u();
            this.f56777g = bagVarM59029u == null ? new th5() : bagVarM59029u;
            this.f56778h = aVar.m59030v();
            this.f56779i = aVar.m59031w();
            gja gjaVarMo20139o = aVar.mo20139o();
            this.f56780j = gjaVarMo20139o == null ? gja.C13753c.f25332c : gjaVarMo20139o;
            tse tseVarM59032x = aVar.m59032x();
            this.f56781k = tseVarM59032x == null ? m81.f34943d.m38527a() : tseVarM59032x;
            vdh vdhVarMo20125a = aVar.mo20125a();
            this.f56782l = vdhVarMo20125a == null ? vt7.m53402a(vdh.f50220a) : vdhVarMo20125a;
            Boolean boolMo20129e = aVar.mo20129e();
            this.f56783m = boolMo20129e != null ? boolMo20129e.booleanValue() : false;
            Boolean boolMo20127c = aVar.mo20127c();
            this.f56784n = boolMo20127c != null ? boolMo20127c.booleanValue() : false;
            this.f56785o = aVar.mo20133i();
            x9g x9gVarM59025q = aVar.m59025q();
            this.f56786p = x9gVarM59025q == null ? new rh5(null, 1, null) : x9gVarM59025q;
        }
    }

    Object g0(sr0 sr0Var, n64 n64Var);

    C18593c getConfig();

    Object l1(kr0 kr0Var, n64 n64Var);
}
