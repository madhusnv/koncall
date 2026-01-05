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
public interface cg3 extends b7f {

    /* renamed from: l */
    public static final C12675b f18087l = C12675b.f18089a;

    /* renamed from: o.cg3$a */
    public static final class C12674a extends l9 {

        /* renamed from: a */
        public final C12676c.a f18088a = new C12676c.a();

        @Override // p001o.b7f.InterfaceC12296a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C12676c.a getConfig() {
            return this.f18088a;
        }

        @Override // p001o.l9
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public cg3 mo20100b(C12676c c12676c) {
            sq8.m48649h(c12676c, "config");
            return new tc5(c12676c);
        }
    }

    /* renamed from: o.cg3$b */
    public static final class C12675b extends s6 {

        /* renamed from: a */
        public static final /* synthetic */ C12675b f18089a = new C12675b();

        /* renamed from: o.cg3$b$a */
        public static final class a extends o64 {

            /* renamed from: a */
            public Object f18090a;

            /* renamed from: b */
            public Object f18091b;

            /* renamed from: c */
            public /* synthetic */ Object f18092c;

            /* renamed from: e */
            public int f18094e;

            public a(n64 n64Var) {
                super(n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                this.f18092c = obj;
                this.f18094e |= Integer.MIN_VALUE;
                return C12675b.this.mo20105e(null, null, null, this);
            }
        }

        @Override // p001o.d7f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public C12674a mo20104b() {
            return new C12674a();
        }

        @Override // p001o.m9
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo20103a(C12674a c12674a) {
            sq8.m48649h(c12674a, "builder");
            super.mo20103a(c12674a);
            c12674a.getConfig().m21168w().add(0, new pb3());
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // p001o.s6
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object mo20105e(C12674a c12674a, ii9 ii9Var, ii9 ii9Var2, n64 n64Var) {
            a aVar;
            C12676c.a config;
            l8i l8iVarM21167v;
            C12676c.a aVar2;
            Object obj;
            if (n64Var instanceof a) {
                aVar = (a) n64Var;
                int i = aVar.f18094e;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.f18094e = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(n64Var);
                }
            }
            a aVar3 = aVar;
            Object obj2 = aVar3.f18092c;
            Object objM51918f = uq8.m51918f();
            int i2 = aVar3.f18094e;
            if (i2 == 0) {
                wre.m54934b(obj2);
                aVar3.f18090a = c12674a;
                aVar3.f18091b = ii9Var;
                aVar3.f18094e = 1;
                if (super.mo20105e(c12674a, ii9Var, ii9Var2, aVar3) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = (C12676c.a) aVar3.f18090a;
                    wre.m54934b(obj2);
                    obj = obj2;
                    config = aVar2;
                    l8iVarM21167v = (l8i) obj;
                    config.m21170y(l8iVarM21167v);
                    return y3i.f54824a;
                }
                ii9Var = (ii9) aVar3.f18091b;
                c12674a = (C12674a) aVar3.f18090a;
                wre.m54934b(obj2);
            }
            ii9 ii9Var3 = ii9Var;
            config = c12674a.getConfig();
            l8iVarM21167v = c12674a.getConfig().m21167v();
            if (l8iVarM21167v == null) {
                aVar3.f18090a = config;
                aVar3.f18091b = null;
                aVar3.f18094e = 2;
                Object objM56511c = xne.m56511c(ii9Var3, "CognitoIdentity", "COGNITO_IDENTITY", "cognito_identity", null, aVar3, 16, null);
                if (objM56511c == objM51918f) {
                    return objM51918f;
                }
                aVar2 = config;
                obj = objM56511c;
                config = aVar2;
                l8iVarM21167v = (l8i) obj;
            }
            config.m21170y(l8iVarM21167v);
            return y3i.f54824a;
        }
    }

    /* renamed from: o.cg3$c */
    public static final class C12676c implements c7f, n28, xse {

        /* renamed from: q */
        public static final b f18095q = new b(null);

        /* renamed from: a */
        public final /* synthetic */ n28 f18096a;

        /* renamed from: b */
        public final /* synthetic */ xse f18097b;

        /* renamed from: c */
        public final String f18098c;

        /* renamed from: d */
        public final String f18099d;

        /* renamed from: e */
        public final List f18100e;

        /* renamed from: f */
        public final qc4 f18101f;

        /* renamed from: g */
        public final eg3 f18102g;

        /* renamed from: h */
        public final l8i f18103h;

        /* renamed from: i */
        public final List f18104i;

        /* renamed from: j */
        public final gja f18105j;

        /* renamed from: k */
        public final tse f18106k;

        /* renamed from: l */
        public final vdh f18107l;

        /* renamed from: m */
        public final boolean f18108m;

        /* renamed from: n */
        public final boolean f18109n;

        /* renamed from: o */
        public final String f18110o;

        /* renamed from: p */
        public final ag3 f18111p;

        /* renamed from: o.cg3$c$a */
        public static final class a implements n81, s18, n28.InterfaceC15480a, xse.InterfaceC18242a, c7f.InterfaceC12584a, sdh {

            /* renamed from: d */
            public String f18115d;

            /* renamed from: f */
            public qc4 f18117f;

            /* renamed from: g */
            public eg3 f18118g;

            /* renamed from: h */
            public l8i f18119h;

            /* renamed from: j */
            public gja f18121j;

            /* renamed from: k */
            public tse f18122k;

            /* renamed from: l */
            public vdh f18123l;

            /* renamed from: m */
            public Boolean f18124m;

            /* renamed from: n */
            public Boolean f18125n;

            /* renamed from: o */
            public String f18126o;

            /* renamed from: p */
            public ag3 f18127p;

            /* renamed from: a */
            public final /* synthetic */ v28.C17502a f18112a = new v28.C17502a();

            /* renamed from: b */
            public final /* synthetic */ zse.C18700a f18113b = new zse.C18700a();

            /* renamed from: c */
            public String f18114c = "Cognito Identity";

            /* renamed from: e */
            public List f18116e = ch3.m21246k();

            /* renamed from: i */
            public List f18120i = new ArrayList();

            @Override // p001o.sdh
            /* renamed from: a */
            public vdh mo20125a() {
                return this.f18123l;
            }

            @Override // p001o.n28.InterfaceC15480a
            /* renamed from: b */
            public void mo20126b(t18 t18Var) {
                this.f18112a.mo20126b(t18Var);
            }

            @Override // p001o.n81
            /* renamed from: c */
            public Boolean mo20127c() {
                return this.f18125n;
            }

            @Override // p001o.n81
            /* renamed from: d */
            public void mo20128d(Boolean bool) {
                this.f18125n = bool;
            }

            @Override // p001o.n81
            /* renamed from: e */
            public Boolean mo20129e() {
                return this.f18124m;
            }

            @Override // p001o.n81
            /* renamed from: f */
            public void mo20130f(String str) {
                this.f18126o = str;
            }

            @Override // p001o.n81
            /* renamed from: g */
            public void mo20131g(Boolean bool) {
                this.f18124m = bool;
            }

            @Override // p001o.n81
            /* renamed from: h */
            public void mo20132h(String str) {
                this.f18115d = str;
            }

            @Override // p001o.n81
            /* renamed from: i */
            public String mo20133i() {
                return this.f18126o;
            }

            @Override // p001o.om1
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C12676c build() {
                return new C12676c(this, null);
            }

            @Override // p001o.xse.InterfaceC18242a
            /* renamed from: k */
            public void mo20135k(vse vseVar) {
                this.f18113b.mo20135k(vseVar);
            }

            @Override // p001o.c7f.InterfaceC12584a
            /* renamed from: l */
            public void mo20136l(gja gjaVar) {
                this.f18121j = gjaVar;
            }

            /* renamed from: m */
            public n28 m21160m() {
                return this.f18112a.m52299m();
            }

            @Override // p001o.n81
            /* renamed from: n */
            public String mo20138n() {
                return this.f18115d;
            }

            @Override // p001o.c7f.InterfaceC12584a
            /* renamed from: o */
            public gja mo20139o() {
                return this.f18121j;
            }

            /* renamed from: p */
            public xse m21161p() {
                return this.f18113b.m59820b();
            }

            /* renamed from: q */
            public final ag3 m21162q() {
                return this.f18127p;
            }

            /* renamed from: r */
            public List m21163r() {
                return this.f18116e;
            }

            /* renamed from: s */
            public String m21164s() {
                return this.f18114c;
            }

            /* renamed from: t */
            public qc4 m21165t() {
                return this.f18117f;
            }

            /* renamed from: u */
            public final eg3 m21166u() {
                return this.f18118g;
            }

            /* renamed from: v */
            public final l8i m21167v() {
                return this.f18119h;
            }

            /* renamed from: w */
            public List m21168w() {
                return this.f18120i;
            }

            /* renamed from: x */
            public tse m21169x() {
                return this.f18122k;
            }

            /* renamed from: y */
            public final void m21170y(l8i l8iVar) {
                this.f18119h = l8iVar;
            }
        }

        /* renamed from: o.cg3$c$b */
        public static final class b {
            public b() {
            }

            public /* synthetic */ b(id5 id5Var) {
                this();
            }
        }

        public /* synthetic */ C12676c(a aVar, id5 id5Var) {
            this(aVar);
        }

        @Override // p001o.xse
        /* renamed from: a */
        public vse mo20109a() {
            return this.f18097b.mo20109a();
        }

        @Override // p001o.n28
        /* renamed from: b */
        public t18 mo20110b() {
            return this.f18096a.mo20110b();
        }

        /* renamed from: c */
        public String m21145c() {
            return this.f18110o;
        }

        /* renamed from: d */
        public final ag3 m21146d() {
            return this.f18111p;
        }

        /* renamed from: e */
        public List m21147e() {
            return this.f18100e;
        }

        /* renamed from: f */
        public String m21148f() {
            return this.f18098c;
        }

        /* renamed from: g */
        public qc4 m21149g() {
            return this.f18101f;
        }

        /* renamed from: h */
        public final eg3 m21150h() {
            return this.f18102g;
        }

        /* renamed from: i */
        public final l8i m21151i() {
            return this.f18103h;
        }

        /* renamed from: j */
        public List m21152j() {
            return this.f18104i;
        }

        /* renamed from: k */
        public gja m21153k() {
            return this.f18105j;
        }

        /* renamed from: l */
        public String m21154l() {
            return this.f18099d;
        }

        /* renamed from: m */
        public tse m21155m() {
            return this.f18106k;
        }

        /* renamed from: n */
        public vdh m21156n() {
            return this.f18107l;
        }

        /* renamed from: o */
        public boolean m21157o() {
            return this.f18108m;
        }

        /* renamed from: p */
        public boolean m21158p() {
            return this.f18109n;
        }

        public C12676c(a aVar) {
            this.f18096a = aVar.m21160m();
            this.f18097b = aVar.m21161p();
            this.f18098c = aVar.m21164s();
            this.f18099d = aVar.mo20138n();
            this.f18100e = aVar.m21163r();
            qc4 qc4VarM21165t = aVar.m21165t();
            this.f18101f = qc4VarM21165t == null ? upa.m51911a(new pc5(null, null, mo20110b(), m21154l(), 3, null)) : qc4VarM21165t;
            eg3 eg3VarM21166u = aVar.m21166u();
            this.f18102g = eg3VarM21166u == null ? new uc5() : eg3VarM21166u;
            this.f18103h = aVar.m21167v();
            this.f18104i = aVar.m21168w();
            gja gjaVarMo20139o = aVar.mo20139o();
            this.f18105j = gjaVarMo20139o == null ? gja.C13753c.f25332c : gjaVarMo20139o;
            tse tseVarM21169x = aVar.m21169x();
            this.f18106k = tseVarM21169x == null ? m81.f34943d.m38527a() : tseVarM21169x;
            vdh vdhVarMo20125a = aVar.mo20125a();
            this.f18107l = vdhVarMo20125a == null ? vt7.m53402a(vdh.f50220a) : vdhVarMo20125a;
            Boolean boolMo20129e = aVar.mo20129e();
            this.f18108m = boolMo20129e != null ? boolMo20129e.booleanValue() : false;
            Boolean boolMo20127c = aVar.mo20127c();
            this.f18109n = boolMo20127c != null ? boolMo20127c.booleanValue() : false;
            this.f18110o = aVar.mo20133i();
            ag3 ag3VarM21162q = aVar.m21162q();
            this.f18111p = ag3VarM21162q == null ? new sc5(null, 1, null) : ag3VarM21162q;
        }
    }

    Object V2(bp7 bp7Var, n64 n64Var);

    Object e1(iq7 iq7Var, n64 n64Var);
}
