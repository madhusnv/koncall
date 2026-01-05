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
public interface xvh extends b7f {
    public static final C18255b g0 = C18255b.f54380a;

    /* renamed from: o.xvh$a */
    public static final class C18254a extends l9 {

        /* renamed from: a */
        public final C18256c.a f54379a = new C18256c.a();

        @Override // p001o.b7f.InterfaceC12296a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C18256c.a getConfig() {
            return this.f54379a;
        }

        @Override // p001o.l9
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public xvh mo20100b(C18256c c18256c) {
            sq8.m48649h(c18256c, "config");
            return new qj5(c18256c);
        }
    }

    /* renamed from: o.xvh$b */
    public static final class C18255b extends s6 {

        /* renamed from: a */
        public static final /* synthetic */ C18255b f54380a = new C18255b();

        /* renamed from: o.xvh$b$a */
        public static final class a extends o64 {

            /* renamed from: a */
            public Object f54381a;

            /* renamed from: b */
            public Object f54382b;

            /* renamed from: c */
            public /* synthetic */ Object f54383c;

            /* renamed from: e */
            public int f54385e;

            public a(n64 n64Var) {
                super(n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                this.f54383c = obj;
                this.f54385e |= Integer.MIN_VALUE;
                return C18255b.this.mo20105e(null, null, null, this);
            }
        }

        @Override // p001o.d7f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public C18254a mo20104b() {
            return new C18254a();
        }

        @Override // p001o.m9
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo20103a(C18254a c18254a) {
            sq8.m48649h(c18254a, "builder");
            super.mo20103a(c18254a);
            c18254a.getConfig().m56905x().add(0, new pb3());
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p001o.s6
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object mo20105e(C18254a c18254a, ii9 ii9Var, ii9 ii9Var2, n64 n64Var) {
            a aVar;
            C18256c.a config;
            l8i l8iVarM56903v;
            C18256c.a aVar2;
            Object obj;
            if (n64Var instanceof a) {
                aVar = (a) n64Var;
                int i = aVar.f54385e;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.f54385e = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(n64Var);
                }
            }
            a aVar3 = aVar;
            Object obj2 = aVar3.f54383c;
            Object objM51918f = uq8.m51918f();
            int i2 = aVar3.f54385e;
            if (i2 == 0) {
                wre.m54934b(obj2);
                aVar3.f54381a = c18254a;
                aVar3.f54382b = ii9Var;
                aVar3.f54385e = 1;
                if (super.mo20105e(c18254a, ii9Var, ii9Var2, aVar3) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = (C18256c.a) aVar3.f54381a;
                    wre.m54934b(obj2);
                    obj = obj2;
                    config = aVar2;
                    l8iVarM56903v = (l8i) obj;
                    config.m56894A(l8iVarM56903v);
                    return y3i.f54824a;
                }
                ii9Var = (ii9) aVar3.f54382b;
                c18254a = (C18254a) aVar3.f54381a;
                wre.m54934b(obj2);
            }
            ii9 ii9Var3 = ii9Var;
            config = c18254a.getConfig();
            l8iVarM56903v = c18254a.getConfig().m56903v();
            if (l8iVarM56903v == null) {
                aVar3.f54381a = config;
                aVar3.f54382b = null;
                aVar3.f54385e = 2;
                Object objM56511c = xne.m56511c(ii9Var3, "Translate", "TRANSLATE", "translate", null, aVar3, 16, null);
                if (objM56511c == objM51918f) {
                    return objM51918f;
                }
                aVar2 = config;
                obj = objM56511c;
                config = aVar2;
                l8iVarM56903v = (l8i) obj;
            }
            config.m56894A(l8iVarM56903v);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.xvh$c */
    public static final class C18256c implements c7f, n28, xse {

        /* renamed from: r */
        public static final b f54386r = new b(null);

        /* renamed from: a */
        public final /* synthetic */ n28 f54387a;

        /* renamed from: b */
        public final /* synthetic */ xse f54388b;

        /* renamed from: c */
        public final String f54389c;

        /* renamed from: d */
        public final String f54390d;

        /* renamed from: e */
        public final List f54391e;

        /* renamed from: f */
        public final qc4 f54392f;

        /* renamed from: g */
        public final zvh f54393g;

        /* renamed from: h */
        public final l8i f54394h;

        /* renamed from: i */
        public final ab8 f54395i;

        /* renamed from: j */
        public final List f54396j;

        /* renamed from: k */
        public final gja f54397k;

        /* renamed from: l */
        public final tse f54398l;

        /* renamed from: m */
        public final vdh f54399m;

        /* renamed from: n */
        public final boolean f54400n;

        /* renamed from: o */
        public final boolean f54401o;

        /* renamed from: p */
        public final String f54402p;

        /* renamed from: q */
        public final vvh f54403q;

        /* renamed from: o.xvh$c$a */
        public static final class a implements n81, s18, n28.InterfaceC15480a, xse.InterfaceC18242a, c7f.InterfaceC12584a, sdh {

            /* renamed from: d */
            public String f54407d;

            /* renamed from: f */
            public qc4 f54409f;

            /* renamed from: g */
            public zvh f54410g;

            /* renamed from: h */
            public l8i f54411h;

            /* renamed from: i */
            public ab8 f54412i;

            /* renamed from: k */
            public gja f54414k;

            /* renamed from: l */
            public tse f54415l;

            /* renamed from: m */
            public vdh f54416m;

            /* renamed from: n */
            public Boolean f54417n;

            /* renamed from: o */
            public Boolean f54418o;

            /* renamed from: p */
            public String f54419p;

            /* renamed from: q */
            public vvh f54420q;

            /* renamed from: a */
            public final /* synthetic */ v28.C17502a f54404a = new v28.C17502a();

            /* renamed from: b */
            public final /* synthetic */ zse.C18700a f54405b = new zse.C18700a();

            /* renamed from: c */
            public String f54406c = "Translate";

            /* renamed from: e */
            public List f54408e = ch3.m21246k();

            /* renamed from: j */
            public List f54413j = new ArrayList();

            /* renamed from: A */
            public final void m56894A(l8i l8iVar) {
                this.f54411h = l8iVar;
            }

            @Override // p001o.sdh
            /* renamed from: a */
            public vdh mo20125a() {
                return this.f54416m;
            }

            @Override // p001o.n28.InterfaceC15480a
            /* renamed from: b */
            public void mo20126b(t18 t18Var) {
                this.f54404a.mo20126b(t18Var);
            }

            @Override // p001o.n81
            /* renamed from: c */
            public Boolean mo20127c() {
                return this.f54418o;
            }

            @Override // p001o.n81
            /* renamed from: d */
            public void mo20128d(Boolean bool) {
                this.f54418o = bool;
            }

            @Override // p001o.n81
            /* renamed from: e */
            public Boolean mo20129e() {
                return this.f54417n;
            }

            @Override // p001o.n81
            /* renamed from: f */
            public void mo20130f(String str) {
                this.f54419p = str;
            }

            @Override // p001o.n81
            /* renamed from: g */
            public void mo20131g(Boolean bool) {
                this.f54417n = bool;
            }

            @Override // p001o.n81
            /* renamed from: h */
            public void mo20132h(String str) {
                this.f54407d = str;
            }

            @Override // p001o.n81
            /* renamed from: i */
            public String mo20133i() {
                return this.f54419p;
            }

            @Override // p001o.om1
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C18256c build() {
                return new C18256c(this, null);
            }

            @Override // p001o.xse.InterfaceC18242a
            /* renamed from: k */
            public void mo20135k(vse vseVar) {
                this.f54405b.mo20135k(vseVar);
            }

            @Override // p001o.c7f.InterfaceC12584a
            /* renamed from: l */
            public void mo20136l(gja gjaVar) {
                this.f54414k = gjaVar;
            }

            /* renamed from: m */
            public n28 m56896m() {
                return this.f54404a.m52299m();
            }

            @Override // p001o.n81
            /* renamed from: n */
            public String mo20138n() {
                return this.f54407d;
            }

            @Override // p001o.c7f.InterfaceC12584a
            /* renamed from: o */
            public gja mo20139o() {
                return this.f54414k;
            }

            /* renamed from: p */
            public xse m56897p() {
                return this.f54405b.m59820b();
            }

            /* renamed from: q */
            public final vvh m56898q() {
                return this.f54420q;
            }

            /* renamed from: r */
            public List m56899r() {
                return this.f54408e;
            }

            /* renamed from: s */
            public String m56900s() {
                return this.f54406c;
            }

            /* renamed from: t */
            public qc4 m56901t() {
                return this.f54409f;
            }

            /* renamed from: u */
            public final zvh m56902u() {
                return this.f54410g;
            }

            /* renamed from: v */
            public final l8i m56903v() {
                return this.f54411h;
            }

            /* renamed from: w */
            public ab8 m56904w() {
                return this.f54412i;
            }

            /* renamed from: x */
            public List m56905x() {
                return this.f54413j;
            }

            /* renamed from: y */
            public tse m56906y() {
                return this.f54415l;
            }

            /* renamed from: z */
            public void m56907z(qc4 qc4Var) {
                this.f54409f = qc4Var;
            }
        }

        /* renamed from: o.xvh$c$b */
        public static final class b {
            public b() {
            }

            public /* synthetic */ b(id5 id5Var) {
                this();
            }
        }

        public /* synthetic */ C18256c(a aVar, id5 id5Var) {
            this(aVar);
        }

        @Override // p001o.xse
        /* renamed from: a */
        public vse mo20109a() {
            return this.f54388b.mo20109a();
        }

        @Override // p001o.n28
        /* renamed from: b */
        public t18 mo20110b() {
            return this.f54387a.mo20110b();
        }

        /* renamed from: c */
        public String m56879c() {
            return this.f54402p;
        }

        /* renamed from: d */
        public final vvh m56880d() {
            return this.f54403q;
        }

        /* renamed from: e */
        public List m56881e() {
            return this.f54391e;
        }

        /* renamed from: f */
        public String m56882f() {
            return this.f54389c;
        }

        /* renamed from: g */
        public qc4 m56883g() {
            return this.f54392f;
        }

        /* renamed from: h */
        public final zvh m56884h() {
            return this.f54393g;
        }

        /* renamed from: i */
        public final l8i m56885i() {
            return this.f54394h;
        }

        /* renamed from: j */
        public ab8 m56886j() {
            return this.f54395i;
        }

        /* renamed from: k */
        public List m56887k() {
            return this.f54396j;
        }

        /* renamed from: l */
        public gja m56888l() {
            return this.f54397k;
        }

        /* renamed from: m */
        public String m56889m() {
            return this.f54390d;
        }

        /* renamed from: n */
        public tse m56890n() {
            return this.f54398l;
        }

        /* renamed from: o */
        public vdh m56891o() {
            return this.f54399m;
        }

        /* renamed from: p */
        public boolean m56892p() {
            return this.f54400n;
        }

        /* renamed from: q */
        public boolean m56893q() {
            return this.f54401o;
        }

        public C18256c(a aVar) {
            this.f54387a = aVar.m56896m();
            this.f54388b = aVar.m56897p();
            this.f54389c = aVar.m56900s();
            this.f54390d = aVar.mo20138n();
            this.f54391e = aVar.m56899r();
            qc4 qc4VarM56901t = aVar.m56901t();
            this.f54392f = qc4VarM56901t == null ? upa.m51911a(new pc5(null, null, mo20110b(), m56889m(), 3, null)) : qc4VarM56901t;
            zvh zvhVarM56902u = aVar.m56902u();
            this.f54393g = zvhVarM56902u == null ? new rj5() : zvhVarM56902u;
            this.f54394h = aVar.m56903v();
            ab8 ab8VarM56904w = aVar.m56904w();
            this.f54395i = ab8VarM56904w == null ? ab8.f14439a.m16813a() : ab8VarM56904w;
            this.f54396j = aVar.m56905x();
            gja gjaVarMo20139o = aVar.mo20139o();
            this.f54397k = gjaVarMo20139o == null ? gja.C13753c.f25332c : gjaVarMo20139o;
            tse tseVarM56906y = aVar.m56906y();
            this.f54398l = tseVarM56906y == null ? m81.f34943d.m38527a() : tseVarM56906y;
            vdh vdhVarMo20125a = aVar.mo20125a();
            this.f54399m = vdhVarMo20125a == null ? vt7.m53402a(vdh.f50220a) : vdhVarMo20125a;
            Boolean boolMo20129e = aVar.mo20129e();
            this.f54400n = boolMo20129e != null ? boolMo20129e.booleanValue() : false;
            Boolean boolMo20127c = aVar.mo20127c();
            this.f54401o = boolMo20127c != null ? boolMo20127c.booleanValue() : false;
            this.f54402p = aVar.mo20133i();
            vvh vvhVarM56898q = aVar.m56898q();
            this.f54403q = vvhVarM56898q == null ? new pj5(null, 1, null) : vvhVarM56898q;
        }
    }

    Object l3(gwh gwhVar, n64 n64Var);
}
