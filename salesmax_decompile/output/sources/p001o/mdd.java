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
public interface mdd extends b7f {

    /* renamed from: R */
    public static final C15288b f35213R = C15288b.f35215a;

    /* renamed from: o.mdd$a */
    public static final class C15287a extends l9 {

        /* renamed from: a */
        public final C15289c.a f35214a = new C15289c.a();

        @Override // p001o.b7f.InterfaceC12296a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C15289c.a getConfig() {
            return this.f35214a;
        }

        @Override // p001o.l9
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public mdd mo20100b(C15289c c15289c) {
            sq8.m48649h(c15289c, "config");
            return new ag5(c15289c);
        }
    }

    /* renamed from: o.mdd$b */
    public static final class C15288b extends s6 {

        /* renamed from: a */
        public static final /* synthetic */ C15288b f35215a = new C15288b();

        /* renamed from: o.mdd$b$a */
        public static final class a extends o64 {

            /* renamed from: a */
            public Object f35216a;

            /* renamed from: b */
            public Object f35217b;

            /* renamed from: c */
            public /* synthetic */ Object f35218c;

            /* renamed from: e */
            public int f35220e;

            public a(n64 n64Var) {
                super(n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                this.f35218c = obj;
                this.f35220e |= Integer.MIN_VALUE;
                return C15288b.this.mo20105e(null, null, null, this);
            }
        }

        @Override // p001o.d7f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public C15287a mo20104b() {
            return new C15287a();
        }

        @Override // p001o.m9
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo20103a(C15287a c15287a) {
            sq8.m48649h(c15287a, "builder");
            super.mo20103a(c15287a);
            c15287a.getConfig().m38791w().add(0, new pb3());
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p001o.s6
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object mo20105e(C15287a c15287a, ii9 ii9Var, ii9 ii9Var2, n64 n64Var) {
            a aVar;
            C15289c.a config;
            l8i l8iVarM38790v;
            C15289c.a aVar2;
            Object obj;
            if (n64Var instanceof a) {
                aVar = (a) n64Var;
                int i = aVar.f35220e;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.f35220e = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(n64Var);
                }
            }
            a aVar3 = aVar;
            Object obj2 = aVar3.f35218c;
            Object objM51918f = uq8.m51918f();
            int i2 = aVar3.f35220e;
            if (i2 == 0) {
                wre.m54934b(obj2);
                aVar3.f35216a = c15287a;
                aVar3.f35217b = ii9Var;
                aVar3.f35220e = 1;
                if (super.mo20105e(c15287a, ii9Var, ii9Var2, aVar3) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = (C15289c.a) aVar3.f35216a;
                    wre.m54934b(obj2);
                    obj = obj2;
                    config = aVar2;
                    l8iVarM38790v = (l8i) obj;
                    config.m38794z(l8iVarM38790v);
                    return y3i.f54824a;
                }
                ii9Var = (ii9) aVar3.f35217b;
                c15287a = (C15287a) aVar3.f35216a;
                wre.m54934b(obj2);
            }
            ii9 ii9Var3 = ii9Var;
            config = c15287a.getConfig();
            l8iVarM38790v = c15287a.getConfig().m38790v();
            if (l8iVarM38790v == null) {
                aVar3.f35216a = config;
                aVar3.f35217b = null;
                aVar3.f35220e = 2;
                Object objM56511c = xne.m56511c(ii9Var3, "Polly", "POLLY", "polly", null, aVar3, 16, null);
                if (objM56511c == objM51918f) {
                    return objM51918f;
                }
                aVar2 = config;
                obj = objM56511c;
                config = aVar2;
                l8iVarM38790v = (l8i) obj;
            }
            config.m38794z(l8iVarM38790v);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.mdd$c */
    public static final class C15289c implements c7f, n28, xse {

        /* renamed from: q */
        public static final b f35221q = new b(null);

        /* renamed from: a */
        public final /* synthetic */ n28 f35222a;

        /* renamed from: b */
        public final /* synthetic */ xse f35223b;

        /* renamed from: c */
        public final String f35224c;

        /* renamed from: d */
        public final String f35225d;

        /* renamed from: e */
        public final List f35226e;

        /* renamed from: f */
        public final qc4 f35227f;

        /* renamed from: g */
        public final odd f35228g;

        /* renamed from: h */
        public final l8i f35229h;

        /* renamed from: i */
        public final List f35230i;

        /* renamed from: j */
        public final gja f35231j;

        /* renamed from: k */
        public final tse f35232k;

        /* renamed from: l */
        public final vdh f35233l;

        /* renamed from: m */
        public final boolean f35234m;

        /* renamed from: n */
        public final boolean f35235n;

        /* renamed from: o */
        public final String f35236o;

        /* renamed from: p */
        public final kdd f35237p;

        /* renamed from: o.mdd$c$a */
        public static final class a implements n81, s18, n28.InterfaceC15480a, xse.InterfaceC18242a, c7f.InterfaceC12584a, sdh {

            /* renamed from: d */
            public String f35241d;

            /* renamed from: f */
            public qc4 f35243f;

            /* renamed from: g */
            public odd f35244g;

            /* renamed from: h */
            public l8i f35245h;

            /* renamed from: j */
            public gja f35247j;

            /* renamed from: k */
            public tse f35248k;

            /* renamed from: l */
            public vdh f35249l;

            /* renamed from: m */
            public Boolean f35250m;

            /* renamed from: n */
            public Boolean f35251n;

            /* renamed from: o */
            public String f35252o;

            /* renamed from: p */
            public kdd f35253p;

            /* renamed from: a */
            public final /* synthetic */ v28.C17502a f35238a = new v28.C17502a();

            /* renamed from: b */
            public final /* synthetic */ zse.C18700a f35239b = new zse.C18700a();

            /* renamed from: c */
            public String f35240c = "Polly";

            /* renamed from: e */
            public List f35242e = ch3.m21246k();

            /* renamed from: i */
            public List f35246i = new ArrayList();

            @Override // p001o.sdh
            /* renamed from: a */
            public vdh mo20125a() {
                return this.f35249l;
            }

            @Override // p001o.n28.InterfaceC15480a
            /* renamed from: b */
            public void mo20126b(t18 t18Var) {
                this.f35238a.mo20126b(t18Var);
            }

            @Override // p001o.n81
            /* renamed from: c */
            public Boolean mo20127c() {
                return this.f35251n;
            }

            @Override // p001o.n81
            /* renamed from: d */
            public void mo20128d(Boolean bool) {
                this.f35251n = bool;
            }

            @Override // p001o.n81
            /* renamed from: e */
            public Boolean mo20129e() {
                return this.f35250m;
            }

            @Override // p001o.n81
            /* renamed from: f */
            public void mo20130f(String str) {
                this.f35252o = str;
            }

            @Override // p001o.n81
            /* renamed from: g */
            public void mo20131g(Boolean bool) {
                this.f35250m = bool;
            }

            @Override // p001o.n81
            /* renamed from: h */
            public void mo20132h(String str) {
                this.f35241d = str;
            }

            @Override // p001o.n81
            /* renamed from: i */
            public String mo20133i() {
                return this.f35252o;
            }

            @Override // p001o.om1
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C15289c build() {
                return new C15289c(this, null);
            }

            @Override // p001o.xse.InterfaceC18242a
            /* renamed from: k */
            public void mo20135k(vse vseVar) {
                this.f35239b.mo20135k(vseVar);
            }

            @Override // p001o.c7f.InterfaceC12584a
            /* renamed from: l */
            public void mo20136l(gja gjaVar) {
                this.f35247j = gjaVar;
            }

            /* renamed from: m */
            public n28 m38783m() {
                return this.f35238a.m52299m();
            }

            @Override // p001o.n81
            /* renamed from: n */
            public String mo20138n() {
                return this.f35241d;
            }

            @Override // p001o.c7f.InterfaceC12584a
            /* renamed from: o */
            public gja mo20139o() {
                return this.f35247j;
            }

            /* renamed from: p */
            public xse m38784p() {
                return this.f35239b.m59820b();
            }

            /* renamed from: q */
            public final kdd m38785q() {
                return this.f35253p;
            }

            /* renamed from: r */
            public List m38786r() {
                return this.f35242e;
            }

            /* renamed from: s */
            public String m38787s() {
                return this.f35240c;
            }

            /* renamed from: t */
            public qc4 m38788t() {
                return this.f35243f;
            }

            /* renamed from: u */
            public final odd m38789u() {
                return this.f35244g;
            }

            /* renamed from: v */
            public final l8i m38790v() {
                return this.f35245h;
            }

            /* renamed from: w */
            public List m38791w() {
                return this.f35246i;
            }

            /* renamed from: x */
            public tse m38792x() {
                return this.f35248k;
            }

            /* renamed from: y */
            public void m38793y(qc4 qc4Var) {
                this.f35243f = qc4Var;
            }

            /* renamed from: z */
            public final void m38794z(l8i l8iVar) {
                this.f35245h = l8iVar;
            }
        }

        /* renamed from: o.mdd$c$b */
        public static final class b {
            public b() {
            }

            public /* synthetic */ b(id5 id5Var) {
                this();
            }
        }

        public /* synthetic */ C15289c(a aVar, id5 id5Var) {
            this(aVar);
        }

        @Override // p001o.xse
        /* renamed from: a */
        public vse mo20109a() {
            return this.f35223b.mo20109a();
        }

        @Override // p001o.n28
        /* renamed from: b */
        public t18 mo20110b() {
            return this.f35222a.mo20110b();
        }

        /* renamed from: c */
        public String m38768c() {
            return this.f35236o;
        }

        /* renamed from: d */
        public final kdd m38769d() {
            return this.f35237p;
        }

        /* renamed from: e */
        public List m38770e() {
            return this.f35226e;
        }

        /* renamed from: f */
        public String m38771f() {
            return this.f35224c;
        }

        /* renamed from: g */
        public qc4 m38772g() {
            return this.f35227f;
        }

        /* renamed from: h */
        public final odd m38773h() {
            return this.f35228g;
        }

        /* renamed from: i */
        public final l8i m38774i() {
            return this.f35229h;
        }

        /* renamed from: j */
        public List m38775j() {
            return this.f35230i;
        }

        /* renamed from: k */
        public gja m38776k() {
            return this.f35231j;
        }

        /* renamed from: l */
        public String m38777l() {
            return this.f35225d;
        }

        /* renamed from: m */
        public tse m38778m() {
            return this.f35232k;
        }

        /* renamed from: n */
        public vdh m38779n() {
            return this.f35233l;
        }

        /* renamed from: o */
        public boolean m38780o() {
            return this.f35234m;
        }

        /* renamed from: p */
        public boolean m38781p() {
            return this.f35235n;
        }

        public C15289c(a aVar) {
            this.f35222a = aVar.m38783m();
            this.f35223b = aVar.m38784p();
            this.f35224c = aVar.m38787s();
            this.f35225d = aVar.mo20138n();
            this.f35226e = aVar.m38786r();
            qc4 qc4VarM38788t = aVar.m38788t();
            this.f35227f = qc4VarM38788t == null ? upa.m51911a(new pc5(null, null, mo20110b(), m38777l(), 3, null)) : qc4VarM38788t;
            odd oddVarM38789u = aVar.m38789u();
            this.f35228g = oddVarM38789u == null ? new bg5() : oddVarM38789u;
            this.f35229h = aVar.m38790v();
            this.f35230i = aVar.m38791w();
            gja gjaVarMo20139o = aVar.mo20139o();
            this.f35231j = gjaVarMo20139o == null ? gja.C13753c.f25332c : gjaVarMo20139o;
            tse tseVarM38792x = aVar.m38792x();
            this.f35232k = tseVarM38792x == null ? m81.f34943d.m38527a() : tseVarM38792x;
            vdh vdhVarMo20125a = aVar.mo20125a();
            this.f35233l = vdhVarMo20125a == null ? vt7.m53402a(vdh.f50220a) : vdhVarMo20125a;
            Boolean boolMo20129e = aVar.mo20129e();
            this.f35234m = boolMo20129e != null ? boolMo20129e.booleanValue() : false;
            Boolean boolMo20127c = aVar.mo20127c();
            this.f35235n = boolMo20127c != null ? boolMo20127c.booleanValue() : false;
            this.f35236o = aVar.mo20133i();
            kdd kddVarM38785q = aVar.m38785q();
            this.f35237p = kddVarM38785q == null ? new zf5(null, 1, null) : kddVarM38785q;
        }
    }

    Object deleteLexicon(yk5 yk5Var, n64 n64Var);

    Object describeVoices(pm5 pm5Var, n64 n64Var);

    /* renamed from: getConfig */
    C15289c mo68738getConfig();

    Object getLexicon(nq7 nq7Var, n64 n64Var);

    Object getSpeechSynthesisTask(lr7 lr7Var, n64 n64Var);

    Object listLexicons(wea weaVar, n64 n64Var);

    Object listSpeechSynthesisTasks(lfa lfaVar, n64 n64Var);

    Object putLexicon(m3e m3eVar, n64 n64Var);

    Object startSpeechSynthesisTask(b4g b4gVar, n64 n64Var);

    Object synthesizeSpeech(aig aigVar, nl7 nl7Var, n64 n64Var);
}
