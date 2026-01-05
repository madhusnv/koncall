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
public interface kg3 extends b7f {

    /* renamed from: m */
    public static final C14826b f32169m = C14826b.f32171a;

    /* renamed from: o.kg3$a */
    public static final class C14825a extends l9 {

        /* renamed from: a */
        public final C14827c.a f32170a = new C14827c.a();

        @Override // p001o.b7f.InterfaceC12296a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C14827c.a getConfig() {
            return this.f32170a;
        }

        @Override // p001o.l9
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public kg3 mo20100b(C14827c c14827c) {
            sq8.m48649h(c14827c, "config");
            return new wc5(c14827c);
        }
    }

    /* renamed from: o.kg3$b */
    public static final class C14826b extends s6 {

        /* renamed from: a */
        public static final /* synthetic */ C14826b f32171a = new C14826b();

        /* renamed from: o.kg3$b$a */
        public static final class a extends o64 {

            /* renamed from: a */
            public Object f32172a;

            /* renamed from: b */
            public Object f32173b;

            /* renamed from: c */
            public /* synthetic */ Object f32174c;

            /* renamed from: e */
            public int f32176e;

            public a(n64 n64Var) {
                super(n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                this.f32174c = obj;
                this.f32176e |= Integer.MIN_VALUE;
                return C14826b.this.mo20105e(null, null, null, this);
            }
        }

        @Override // p001o.d7f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public C14825a mo20104b() {
            return new C14825a();
        }

        @Override // p001o.m9
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo20103a(C14825a c14825a) {
            sq8.m48649h(c14825a, "builder");
            super.mo20103a(c14825a);
            c14825a.getConfig().m35678w().add(0, new pb3());
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p001o.s6
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object mo20105e(C14825a c14825a, ii9 ii9Var, ii9 ii9Var2, n64 n64Var) {
            a aVar;
            C14827c.a config;
            l8i l8iVarM35677v;
            C14827c.a aVar2;
            Object obj;
            if (n64Var instanceof a) {
                aVar = (a) n64Var;
                int i = aVar.f32176e;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.f32176e = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(n64Var);
                }
            }
            a aVar3 = aVar;
            Object obj2 = aVar3.f32174c;
            Object objM51918f = uq8.m51918f();
            int i2 = aVar3.f32176e;
            if (i2 == 0) {
                wre.m54934b(obj2);
                aVar3.f32172a = c14825a;
                aVar3.f32173b = ii9Var;
                aVar3.f32176e = 1;
                if (super.mo20105e(c14825a, ii9Var, ii9Var2, aVar3) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = (C14827c.a) aVar3.f32172a;
                    wre.m54934b(obj2);
                    obj = obj2;
                    config = aVar2;
                    l8iVarM35677v = (l8i) obj;
                    config.m35681z(l8iVarM35677v);
                    return y3i.f54824a;
                }
                ii9Var = (ii9) aVar3.f32173b;
                c14825a = (C14825a) aVar3.f32172a;
                wre.m54934b(obj2);
            }
            ii9 ii9Var3 = ii9Var;
            config = c14825a.getConfig();
            l8iVarM35677v = c14825a.getConfig().m35677v();
            if (l8iVarM35677v == null) {
                aVar3.f32172a = config;
                aVar3.f32173b = null;
                aVar3.f32176e = 2;
                Object objM56511c = xne.m56511c(ii9Var3, "CognitoIdentityProvider", "COGNITO_IDENTITY_PROVIDER", "cognito_identity_provider", null, aVar3, 16, null);
                if (objM56511c == objM51918f) {
                    return objM51918f;
                }
                aVar2 = config;
                obj = objM56511c;
                config = aVar2;
                l8iVarM35677v = (l8i) obj;
            }
            config.m35681z(l8iVarM35677v);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.kg3$c */
    public static final class C14827c implements c7f, n28, xse {

        /* renamed from: q */
        public static final b f32177q = new b(null);

        /* renamed from: a */
        public final /* synthetic */ n28 f32178a;

        /* renamed from: b */
        public final /* synthetic */ xse f32179b;

        /* renamed from: c */
        public final String f32180c;

        /* renamed from: d */
        public final String f32181d;

        /* renamed from: e */
        public final List f32182e;

        /* renamed from: f */
        public final qc4 f32183f;

        /* renamed from: g */
        public final mg3 f32184g;

        /* renamed from: h */
        public final l8i f32185h;

        /* renamed from: i */
        public final List f32186i;

        /* renamed from: j */
        public final gja f32187j;

        /* renamed from: k */
        public final tse f32188k;

        /* renamed from: l */
        public final vdh f32189l;

        /* renamed from: m */
        public final boolean f32190m;

        /* renamed from: n */
        public final boolean f32191n;

        /* renamed from: o */
        public final String f32192o;

        /* renamed from: p */
        public final ig3 f32193p;

        /* renamed from: o.kg3$c$a */
        public static final class a implements n81, s18, n28.InterfaceC15480a, xse.InterfaceC18242a, c7f.InterfaceC12584a, sdh {

            /* renamed from: d */
            public String f32197d;

            /* renamed from: f */
            public qc4 f32199f;

            /* renamed from: g */
            public mg3 f32200g;

            /* renamed from: h */
            public l8i f32201h;

            /* renamed from: j */
            public gja f32203j;

            /* renamed from: k */
            public tse f32204k;

            /* renamed from: l */
            public vdh f32205l;

            /* renamed from: m */
            public Boolean f32206m;

            /* renamed from: n */
            public Boolean f32207n;

            /* renamed from: o */
            public String f32208o;

            /* renamed from: p */
            public ig3 f32209p;

            /* renamed from: a */
            public final /* synthetic */ v28.C17502a f32194a = new v28.C17502a();

            /* renamed from: b */
            public final /* synthetic */ zse.C18700a f32195b = new zse.C18700a();

            /* renamed from: c */
            public String f32196c = "Cognito Identity Provider";

            /* renamed from: e */
            public List f32198e = ch3.m21246k();

            /* renamed from: i */
            public List f32202i = new ArrayList();

            @Override // p001o.sdh
            /* renamed from: a */
            public vdh mo20125a() {
                return this.f32205l;
            }

            @Override // p001o.n28.InterfaceC15480a
            /* renamed from: b */
            public void mo20126b(t18 t18Var) {
                this.f32194a.mo20126b(t18Var);
            }

            @Override // p001o.n81
            /* renamed from: c */
            public Boolean mo20127c() {
                return this.f32207n;
            }

            @Override // p001o.n81
            /* renamed from: d */
            public void mo20128d(Boolean bool) {
                this.f32207n = bool;
            }

            @Override // p001o.n81
            /* renamed from: e */
            public Boolean mo20129e() {
                return this.f32206m;
            }

            @Override // p001o.n81
            /* renamed from: f */
            public void mo20130f(String str) {
                this.f32208o = str;
            }

            @Override // p001o.n81
            /* renamed from: g */
            public void mo20131g(Boolean bool) {
                this.f32206m = bool;
            }

            @Override // p001o.n81
            /* renamed from: h */
            public void mo20132h(String str) {
                this.f32197d = str;
            }

            @Override // p001o.n81
            /* renamed from: i */
            public String mo20133i() {
                return this.f32208o;
            }

            @Override // p001o.om1
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C14827c build() {
                return new C14827c(this, null);
            }

            @Override // p001o.xse.InterfaceC18242a
            /* renamed from: k */
            public void mo20135k(vse vseVar) {
                this.f32195b.mo20135k(vseVar);
            }

            @Override // p001o.c7f.InterfaceC12584a
            /* renamed from: l */
            public void mo20136l(gja gjaVar) {
                this.f32203j = gjaVar;
            }

            /* renamed from: m */
            public n28 m35670m() {
                return this.f32194a.m52299m();
            }

            @Override // p001o.n81
            /* renamed from: n */
            public String mo20138n() {
                return this.f32197d;
            }

            @Override // p001o.c7f.InterfaceC12584a
            /* renamed from: o */
            public gja mo20139o() {
                return this.f32203j;
            }

            /* renamed from: p */
            public xse m35671p() {
                return this.f32195b.m59820b();
            }

            /* renamed from: q */
            public final ig3 m35672q() {
                return this.f32209p;
            }

            /* renamed from: r */
            public List m35673r() {
                return this.f32198e;
            }

            /* renamed from: s */
            public String m35674s() {
                return this.f32196c;
            }

            /* renamed from: t */
            public qc4 m35675t() {
                return this.f32199f;
            }

            /* renamed from: u */
            public final mg3 m35676u() {
                return this.f32200g;
            }

            /* renamed from: v */
            public final l8i m35677v() {
                return this.f32201h;
            }

            /* renamed from: w */
            public List m35678w() {
                return this.f32202i;
            }

            /* renamed from: x */
            public tse m35679x() {
                return this.f32204k;
            }

            /* renamed from: y */
            public final void m35680y(mg3 mg3Var) {
                this.f32200g = mg3Var;
            }

            /* renamed from: z */
            public final void m35681z(l8i l8iVar) {
                this.f32201h = l8iVar;
            }
        }

        /* renamed from: o.kg3$c$b */
        public static final class b {
            public b() {
            }

            public /* synthetic */ b(id5 id5Var) {
                this();
            }
        }

        public /* synthetic */ C14827c(a aVar, id5 id5Var) {
            this(aVar);
        }

        @Override // p001o.xse
        /* renamed from: a */
        public vse mo20109a() {
            return this.f32179b.mo20109a();
        }

        @Override // p001o.n28
        /* renamed from: b */
        public t18 mo20110b() {
            return this.f32178a.mo20110b();
        }

        /* renamed from: c */
        public String m35655c() {
            return this.f32192o;
        }

        /* renamed from: d */
        public final ig3 m35656d() {
            return this.f32193p;
        }

        /* renamed from: e */
        public List m35657e() {
            return this.f32182e;
        }

        /* renamed from: f */
        public String m35658f() {
            return this.f32180c;
        }

        /* renamed from: g */
        public qc4 m35659g() {
            return this.f32183f;
        }

        /* renamed from: h */
        public final mg3 m35660h() {
            return this.f32184g;
        }

        /* renamed from: i */
        public final l8i m35661i() {
            return this.f32185h;
        }

        /* renamed from: j */
        public List m35662j() {
            return this.f32186i;
        }

        /* renamed from: k */
        public gja m35663k() {
            return this.f32187j;
        }

        /* renamed from: l */
        public String m35664l() {
            return this.f32181d;
        }

        /* renamed from: m */
        public tse m35665m() {
            return this.f32188k;
        }

        /* renamed from: n */
        public vdh m35666n() {
            return this.f32189l;
        }

        /* renamed from: o */
        public boolean m35667o() {
            return this.f32190m;
        }

        /* renamed from: p */
        public boolean m35668p() {
            return this.f32191n;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C14827c(a aVar) {
            this.f32178a = aVar.m35670m();
            this.f32179b = aVar.m35671p();
            this.f32180c = aVar.m35674s();
            this.f32181d = aVar.mo20138n();
            this.f32182e = aVar.m35673r();
            qc4 qc4VarM35675t = aVar.m35675t();
            this.f32183f = qc4VarM35675t == null ? upa.m51911a(new pc5(null, null, mo20110b(), m35664l(), 3, null)) : qc4VarM35675t;
            mg3 mg3VarM35676u = aVar.m35676u();
            this.f32184g = mg3VarM35676u == null ? new xc5() : mg3VarM35676u;
            this.f32185h = aVar.m35677v();
            this.f32186i = aVar.m35678w();
            gja gjaVarMo20139o = aVar.mo20139o();
            this.f32187j = gjaVarMo20139o == null ? gja.C13753c.f25332c : gjaVarMo20139o;
            tse tseVarM35679x = aVar.m35679x();
            this.f32188k = tseVarM35679x == null ? m81.f34943d.m38527a() : tseVarM35679x;
            vdh vdhVarMo20125a = aVar.mo20125a();
            this.f32189l = vdhVarMo20125a == null ? vt7.m53402a(vdh.f50220a) : vdhVarMo20125a;
            Boolean boolMo20129e = aVar.mo20129e();
            this.f32190m = boolMo20129e != null ? boolMo20129e.booleanValue() : false;
            Boolean boolMo20127c = aVar.mo20127c();
            this.f32191n = boolMo20127c != null ? boolMo20127c.booleanValue() : false;
            this.f32192o = aVar.mo20133i();
            ig3 ig3VarM35672q = aVar.m35672q();
            this.f32193p = ig3VarM35672q == null ? new vc5(null, 1, 0 == true ? 1 : 0) : ig3VarM35672q;
        }
    }

    /* renamed from: B */
    Object mo35644B(h4g h4gVar, n64 n64Var);

    Object D0(br0 br0Var, n64 n64Var);

    Object J0(n6i n6iVar, n64 n64Var);

    Object K1(er3 er3Var, n64 n64Var);

    /* renamed from: L */
    Object mo35645L(mti mtiVar, n64 n64Var);

    /* renamed from: P */
    Object mo35646P(wc7 wc7Var, n64 n64Var);

    /* renamed from: R */
    Object mo35647R(hg2 hg2Var, n64 n64Var);

    Object U1(as7 as7Var, n64 n64Var);

    /* renamed from: V */
    Object mo35648V(v6i v6iVar, n64 n64Var);

    Object a1(xfa xfaVar, n64 n64Var);

    Object a2(ul5 ul5Var, n64 n64Var);

    Object b0(mea meaVar, n64 n64Var);

    Object f1(ol5 ol5Var, n64 n64Var);

    Object f3(cd7 cd7Var, n64 n64Var);

    Object g1(qr3 qr3Var, n64 n64Var);

    Object h2(xrf xrfVar, n64 n64Var);

    Object i0(wi8 wi8Var, n64 n64Var);

    Object j2(wqe wqeVar, n64 n64Var);

    Object q2(gm3 gm3Var, n64 n64Var);

    Object r1(ur7 ur7Var, n64 n64Var);

    Object s0(gne gneVar, n64 n64Var);

    Object s1(kr3 kr3Var, n64 n64Var);

    Object t0(ote oteVar, n64 n64Var);

    Object u2(pt7 pt7Var, n64 n64Var);

    Object x0(fti ftiVar, n64 n64Var);

    /* renamed from: z */
    Object mo35649z(gif gifVar, n64 n64Var);
}
