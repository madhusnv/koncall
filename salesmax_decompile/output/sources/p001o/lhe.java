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
public interface lhe extends b7f {

    /* renamed from: U */
    public static final C15077b f33823U = C15077b.f33825a;

    /* renamed from: o.lhe$a */
    public static final class C15076a extends l9 {

        /* renamed from: a */
        public final C15078c.a f33824a = new C15078c.a();

        @Override // p001o.b7f.InterfaceC12296a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C15078c.a getConfig() {
            return this.f33824a;
        }

        @Override // p001o.l9
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public lhe mo20100b(C15078c c15078c) {
            sq8.m48649h(c15078c, "config");
            return new gg5(c15078c);
        }
    }

    /* renamed from: o.lhe$b */
    public static final class C15077b extends s6 {

        /* renamed from: a */
        public static final /* synthetic */ C15077b f33825a = new C15077b();

        /* renamed from: o.lhe$b$a */
        public static final class a extends o64 {

            /* renamed from: a */
            public Object f33826a;

            /* renamed from: b */
            public Object f33827b;

            /* renamed from: c */
            public /* synthetic */ Object f33828c;

            /* renamed from: e */
            public int f33830e;

            public a(n64 n64Var) {
                super(n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                this.f33828c = obj;
                this.f33830e |= Integer.MIN_VALUE;
                return C15077b.this.mo20105e(null, null, null, this);
            }
        }

        @Override // p001o.d7f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public C15076a mo20104b() {
            return new C15076a();
        }

        @Override // p001o.m9
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo20103a(C15076a c15076a) {
            sq8.m48649h(c15076a, "builder");
            super.mo20103a(c15076a);
            c15076a.getConfig().m37255x().add(0, new pb3());
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p001o.s6
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object mo20105e(C15076a c15076a, ii9 ii9Var, ii9 ii9Var2, n64 n64Var) {
            a aVar;
            C15078c.a config;
            l8i l8iVarM37253v;
            C15078c.a aVar2;
            Object obj;
            if (n64Var instanceof a) {
                aVar = (a) n64Var;
                int i = aVar.f33830e;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.f33830e = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(n64Var);
                }
            }
            a aVar3 = aVar;
            Object obj2 = aVar3.f33828c;
            Object objM51918f = uq8.m51918f();
            int i2 = aVar3.f33830e;
            if (i2 == 0) {
                wre.m54934b(obj2);
                aVar3.f33826a = c15076a;
                aVar3.f33827b = ii9Var;
                aVar3.f33830e = 1;
                if (super.mo20105e(c15076a, ii9Var, ii9Var2, aVar3) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = (C15078c.a) aVar3.f33826a;
                    wre.m54934b(obj2);
                    obj = obj2;
                    config = aVar2;
                    l8iVarM37253v = (l8i) obj;
                    config.m37244A(l8iVarM37253v);
                    return y3i.f54824a;
                }
                ii9Var = (ii9) aVar3.f33827b;
                c15076a = (C15076a) aVar3.f33826a;
                wre.m54934b(obj2);
            }
            ii9 ii9Var3 = ii9Var;
            config = c15076a.getConfig();
            l8iVarM37253v = c15076a.getConfig().m37253v();
            if (l8iVarM37253v == null) {
                aVar3.f33826a = config;
                aVar3.f33827b = null;
                aVar3.f33830e = 2;
                Object objM56511c = xne.m56511c(ii9Var3, "Rekognition", "REKOGNITION", "rekognition", null, aVar3, 16, null);
                if (objM56511c == objM51918f) {
                    return objM51918f;
                }
                aVar2 = config;
                obj = objM56511c;
                config = aVar2;
                l8iVarM37253v = (l8i) obj;
            }
            config.m37244A(l8iVarM37253v);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.lhe$c */
    public static final class C15078c implements c7f, n28, xse {

        /* renamed from: r */
        public static final b f33831r = new b(null);

        /* renamed from: a */
        public final /* synthetic */ n28 f33832a;

        /* renamed from: b */
        public final /* synthetic */ xse f33833b;

        /* renamed from: c */
        public final String f33834c;

        /* renamed from: d */
        public final String f33835d;

        /* renamed from: e */
        public final List f33836e;

        /* renamed from: f */
        public final qc4 f33837f;

        /* renamed from: g */
        public final nhe f33838g;

        /* renamed from: h */
        public final l8i f33839h;

        /* renamed from: i */
        public final ab8 f33840i;

        /* renamed from: j */
        public final List f33841j;

        /* renamed from: k */
        public final gja f33842k;

        /* renamed from: l */
        public final tse f33843l;

        /* renamed from: m */
        public final vdh f33844m;

        /* renamed from: n */
        public final boolean f33845n;

        /* renamed from: o */
        public final boolean f33846o;

        /* renamed from: p */
        public final String f33847p;

        /* renamed from: q */
        public final jhe f33848q;

        /* renamed from: o.lhe$c$a */
        public static final class a implements n81, s18, n28.InterfaceC15480a, xse.InterfaceC18242a, c7f.InterfaceC12584a, sdh {

            /* renamed from: d */
            public String f33852d;

            /* renamed from: f */
            public qc4 f33854f;

            /* renamed from: g */
            public nhe f33855g;

            /* renamed from: h */
            public l8i f33856h;

            /* renamed from: i */
            public ab8 f33857i;

            /* renamed from: k */
            public gja f33859k;

            /* renamed from: l */
            public tse f33860l;

            /* renamed from: m */
            public vdh f33861m;

            /* renamed from: n */
            public Boolean f33862n;

            /* renamed from: o */
            public Boolean f33863o;

            /* renamed from: p */
            public String f33864p;

            /* renamed from: q */
            public jhe f33865q;

            /* renamed from: a */
            public final /* synthetic */ v28.C17502a f33849a = new v28.C17502a();

            /* renamed from: b */
            public final /* synthetic */ zse.C18700a f33850b = new zse.C18700a();

            /* renamed from: c */
            public String f33851c = "Rekognition";

            /* renamed from: e */
            public List f33853e = ch3.m21246k();

            /* renamed from: j */
            public List f33858j = new ArrayList();

            /* renamed from: A */
            public final void m37244A(l8i l8iVar) {
                this.f33856h = l8iVar;
            }

            @Override // p001o.sdh
            /* renamed from: a */
            public vdh mo20125a() {
                return this.f33861m;
            }

            @Override // p001o.n28.InterfaceC15480a
            /* renamed from: b */
            public void mo20126b(t18 t18Var) {
                this.f33849a.mo20126b(t18Var);
            }

            @Override // p001o.n81
            /* renamed from: c */
            public Boolean mo20127c() {
                return this.f33863o;
            }

            @Override // p001o.n81
            /* renamed from: d */
            public void mo20128d(Boolean bool) {
                this.f33863o = bool;
            }

            @Override // p001o.n81
            /* renamed from: e */
            public Boolean mo20129e() {
                return this.f33862n;
            }

            @Override // p001o.n81
            /* renamed from: f */
            public void mo20130f(String str) {
                this.f33864p = str;
            }

            @Override // p001o.n81
            /* renamed from: g */
            public void mo20131g(Boolean bool) {
                this.f33862n = bool;
            }

            @Override // p001o.n81
            /* renamed from: h */
            public void mo20132h(String str) {
                this.f33852d = str;
            }

            @Override // p001o.n81
            /* renamed from: i */
            public String mo20133i() {
                return this.f33864p;
            }

            @Override // p001o.om1
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C15078c build() {
                return new C15078c(this, null);
            }

            @Override // p001o.xse.InterfaceC18242a
            /* renamed from: k */
            public void mo20135k(vse vseVar) {
                this.f33850b.mo20135k(vseVar);
            }

            @Override // p001o.c7f.InterfaceC12584a
            /* renamed from: l */
            public void mo20136l(gja gjaVar) {
                this.f33859k = gjaVar;
            }

            /* renamed from: m */
            public n28 m37246m() {
                return this.f33849a.m52299m();
            }

            @Override // p001o.n81
            /* renamed from: n */
            public String mo20138n() {
                return this.f33852d;
            }

            @Override // p001o.c7f.InterfaceC12584a
            /* renamed from: o */
            public gja mo20139o() {
                return this.f33859k;
            }

            /* renamed from: p */
            public xse m37247p() {
                return this.f33850b.m59820b();
            }

            /* renamed from: q */
            public final jhe m37248q() {
                return this.f33865q;
            }

            /* renamed from: r */
            public List m37249r() {
                return this.f33853e;
            }

            /* renamed from: s */
            public String m37250s() {
                return this.f33851c;
            }

            /* renamed from: t */
            public qc4 m37251t() {
                return this.f33854f;
            }

            /* renamed from: u */
            public final nhe m37252u() {
                return this.f33855g;
            }

            /* renamed from: v */
            public final l8i m37253v() {
                return this.f33856h;
            }

            /* renamed from: w */
            public ab8 m37254w() {
                return this.f33857i;
            }

            /* renamed from: x */
            public List m37255x() {
                return this.f33858j;
            }

            /* renamed from: y */
            public tse m37256y() {
                return this.f33860l;
            }

            /* renamed from: z */
            public void m37257z(qc4 qc4Var) {
                this.f33854f = qc4Var;
            }
        }

        /* renamed from: o.lhe$c$b */
        public static final class b {
            public b() {
            }

            public /* synthetic */ b(id5 id5Var) {
                this();
            }
        }

        public /* synthetic */ C15078c(a aVar, id5 id5Var) {
            this(aVar);
        }

        @Override // p001o.xse
        /* renamed from: a */
        public vse mo20109a() {
            return this.f33833b.mo20109a();
        }

        @Override // p001o.n28
        /* renamed from: b */
        public t18 mo20110b() {
            return this.f33832a.mo20110b();
        }

        /* renamed from: c */
        public String m37229c() {
            return this.f33847p;
        }

        /* renamed from: d */
        public final jhe m37230d() {
            return this.f33848q;
        }

        /* renamed from: e */
        public List m37231e() {
            return this.f33836e;
        }

        /* renamed from: f */
        public String m37232f() {
            return this.f33834c;
        }

        /* renamed from: g */
        public qc4 m37233g() {
            return this.f33837f;
        }

        /* renamed from: h */
        public final nhe m37234h() {
            return this.f33838g;
        }

        /* renamed from: i */
        public final l8i m37235i() {
            return this.f33839h;
        }

        /* renamed from: j */
        public ab8 m37236j() {
            return this.f33840i;
        }

        /* renamed from: k */
        public List m37237k() {
            return this.f33841j;
        }

        /* renamed from: l */
        public gja m37238l() {
            return this.f33842k;
        }

        /* renamed from: m */
        public String m37239m() {
            return this.f33835d;
        }

        /* renamed from: n */
        public tse m37240n() {
            return this.f33843l;
        }

        /* renamed from: o */
        public vdh m37241o() {
            return this.f33844m;
        }

        /* renamed from: p */
        public boolean m37242p() {
            return this.f33845n;
        }

        /* renamed from: q */
        public boolean m37243q() {
            return this.f33846o;
        }

        public C15078c(a aVar) {
            this.f33832a = aVar.m37246m();
            this.f33833b = aVar.m37247p();
            this.f33834c = aVar.m37250s();
            this.f33835d = aVar.mo20138n();
            this.f33836e = aVar.m37249r();
            qc4 qc4VarM37251t = aVar.m37251t();
            this.f33837f = qc4VarM37251t == null ? upa.m51911a(new pc5(null, null, mo20110b(), m37239m(), 3, null)) : qc4VarM37251t;
            nhe nheVarM37252u = aVar.m37252u();
            this.f33838g = nheVarM37252u == null ? new hg5() : nheVarM37252u;
            this.f33839h = aVar.m37253v();
            ab8 ab8VarM37254w = aVar.m37254w();
            this.f33840i = ab8VarM37254w == null ? ab8.f14439a.m16813a() : ab8VarM37254w;
            this.f33841j = aVar.m37255x();
            gja gjaVarMo20139o = aVar.mo20139o();
            this.f33842k = gjaVarMo20139o == null ? gja.C13753c.f25332c : gjaVarMo20139o;
            tse tseVarM37256y = aVar.m37256y();
            this.f33843l = tseVarM37256y == null ? m81.f34943d.m38527a() : tseVarM37256y;
            vdh vdhVarMo20125a = aVar.mo20125a();
            this.f33844m = vdhVarMo20125a == null ? vt7.m53402a(vdh.f50220a) : vdhVarMo20125a;
            Boolean boolMo20129e = aVar.mo20129e();
            this.f33845n = boolMo20129e != null ? boolMo20129e.booleanValue() : false;
            Boolean boolMo20127c = aVar.mo20127c();
            this.f33846o = boolMo20127c != null ? boolMo20127c.booleanValue() : false;
            this.f33847p = aVar.mo20133i();
            jhe jheVarM37248q = aVar.m37248q();
            this.f33848q = jheVarM37248q == null ? new fg5(null, 1, null) : jheVarM37248q;
        }
    }

    Object F2(c9f c9fVar, n64 n64Var);

    Object L1(lk3 lk3Var, n64 n64Var);

    /* renamed from: M */
    Object mo28570M(qp5 qp5Var, n64 n64Var);

    Object N2(qo5 qo5Var, n64 n64Var);

    Object f2(wn5 wn5Var, n64 n64Var);

    Object j3(xo5 xo5Var, n64 n64Var);

    Object q0(oee oeeVar, n64 n64Var);
}
