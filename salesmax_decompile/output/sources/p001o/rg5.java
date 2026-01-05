package p001o;

import p001o.fmh;
import p001o.hb3;
import p001o.k16;
import p001o.ma4;
import p001o.qja;
import p001o.rg5;

/* loaded from: classes3.dex */
public final class rg5 extends o7f implements rb3, h84 {

    /* renamed from: b */
    public final fmh.InterfaceC13490b f43550b;

    /* renamed from: c */
    public final hb3 f43551c;

    /* renamed from: d */
    public final uma f43552d;

    /* renamed from: e */
    public final long f43553e;

    /* renamed from: f */
    public final q74 f43554f;

    /* renamed from: o.rg5$a */
    public static final class C16606a extends o64 {

        /* renamed from: a */
        public Object f43555a;

        /* renamed from: b */
        public Object f43556b;

        /* renamed from: c */
        public /* synthetic */ Object f43557c;

        /* renamed from: e */
        public int f43559e;

        public C16606a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f43557c = obj;
            this.f43559e |= Integer.MIN_VALUE;
            return rg5.this.m46696h(null, null, this);
        }
    }

    /* renamed from: o.rg5$b */
    public static final class C16607b extends o64 {

        /* renamed from: a */
        public Object f43560a;

        /* renamed from: b */
        public Object f43561b;

        /* renamed from: c */
        public Object f43562c;

        /* renamed from: d */
        public /* synthetic */ Object f43563d;

        /* renamed from: f */
        public int f43565f;

        public C16607b(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f43563d = obj;
            this.f43565f |= Integer.MIN_VALUE;
            return rg5.this.resolve(null, this);
        }
    }

    /* renamed from: o.rg5$c */
    public static final class C16608c extends jgg implements nl7 {

        /* renamed from: a */
        public int f43566a;

        /* renamed from: b */
        public final /* synthetic */ mxe f43567b;

        /* renamed from: c */
        public final /* synthetic */ rg5 f43568c;

        /* renamed from: d */
        public final /* synthetic */ cxe f43569d;

        /* renamed from: e */
        public final /* synthetic */ kxe f43570e;

        /* renamed from: o.rg5$c$a */
        public static final class a extends jgg implements xk7 {

            /* renamed from: a */
            public int f43571a;

            /* renamed from: b */
            public final /* synthetic */ rg5 f43572b;

            /* renamed from: c */
            public final /* synthetic */ kxe f43573c;

            /* renamed from: d */
            public final /* synthetic */ cxe f43574d;

            /* renamed from: e */
            public final /* synthetic */ mxe f43575e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(rg5 rg5Var, kxe kxeVar, cxe cxeVar, mxe mxeVar, n64 n64Var) {
                super(1, n64Var);
                this.f43572b = rg5Var;
                this.f43573c = kxeVar;
                this.f43574d = cxeVar;
                this.f43575e = mxeVar;
            }

            @Override // p001o.vb1
            public final n64 create(n64 n64Var) {
                return new a(this.f43572b, this.f43573c, this.f43574d, this.f43575e, n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                zo6 zo6VarM39758a;
                Object objM51918f = uq8.m51918f();
                int i = this.f43571a;
                if (i == 0) {
                    wre.m54934b(obj);
                    uma umaVar = this.f43572b.f43552d;
                    kxe kxeVar = this.f43573c;
                    this.f43571a = 1;
                    obj = umaVar.m51778a(kxeVar, this);
                    if (obj == objM51918f) {
                        return objM51918f;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        wre.m54934b(obj);
                        return (zo6) obj;
                    }
                    wre.m54934b(obj);
                }
                mxe mxeVar = (mxe) obj;
                if (!((mxeVar == null || (zo6VarM39758a = mxeVar.m39758a()) == null || !lxe.m38097c(zo6VarM39758a, this.f43572b.f43553e)) ? false : true)) {
                    return this.f43575e.m39758a();
                }
                rg5 rg5Var = this.f43572b;
                kxe kxeVar2 = this.f43573c;
                cxe cxeVar = this.f43574d;
                this.f43571a = 2;
                obj = rg5Var.m46696h(kxeVar2, cxeVar, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
                return (zo6) obj;
            }

            @Override // p001o.xk7
            public final Object invoke(n64 n64Var) {
                return ((a) create(n64Var)).invokeSuspend(y3i.f54824a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16608c(mxe mxeVar, rg5 rg5Var, cxe cxeVar, kxe kxeVar, n64 n64Var) {
            super(2, n64Var);
            this.f43567b = mxeVar;
            this.f43568c = rg5Var;
            this.f43569d = cxeVar;
            this.f43570e = kxeVar;
        }

        /* renamed from: g */
        public static final String m46699g(kxe kxeVar) {
            return "Asynchronous refresh for " + kxeVar.m36294a() + " failed.";
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C16608c(this.f43567b, this.f43568c, this.f43569d, this.f43570e, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f43566a;
            try {
                if (i == 0) {
                    wre.m54934b(obj);
                    fuf fufVarM39759b = this.f43567b.m39759b();
                    a aVar = new a(this.f43568c, this.f43570e, this.f43569d, this.f43567b, null);
                    this.f43566a = 1;
                    if (fufVarM39759b.m27524a(aVar, this) == objM51918f) {
                        return objM51918f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                }
            } catch (Exception e) {
                qja qjaVarM46697k = this.f43568c.m46697k(this.f43569d);
                final kxe kxeVar = this.f43570e;
                qjaVarM46697k.mo18186c(e, new uk7() { // from class: o.sg5
                    @Override // p001o.uk7
                    public final Object invoke() {
                        return rg5.C16608c.m46699g(kxeVar);
                    }
                });
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C16608c) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public /* synthetic */ rg5(fmh.InterfaceC13490b interfaceC13490b, hb3 hb3Var, uma umaVar, long j, id5 id5Var) {
        this(interfaceC13490b, hb3Var, umaVar, j);
    }

    /* renamed from: o */
    public static final String m46695o(kxe kxeVar, mxe mxeVar) {
        return "Credentials for " + kxeVar.m36294a() + " are expiring in " + mxeVar.m39758a().m59664a() + " and are within their refresh window, performing asynchronous refresh...";
    }

    @Override // p001o.h84
    /* renamed from: D */
    public q74 mo6529D() {
        return this.f43554f;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        z69.m58838c(mo6529D(), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m46696h(kxe kxeVar, cxe cxeVar, n64 n64Var) {
        C16606a c16606a;
        kxe kxeVar2;
        rg5 rg5Var;
        if (n64Var instanceof C16606a) {
            c16606a = (C16606a) n64Var;
            int i = c16606a.f43559e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16606a.f43559e = i - Integer.MIN_VALUE;
            } else {
                c16606a = new C16606a(n64Var);
            }
        }
        Object objA1 = c16606a.f43557c;
        Object objM51918f = uq8.m51918f();
        int i2 = c16606a.f43559e;
        if (i2 == 0) {
            wre.m54934b(objA1);
            ma4.C15258a c15258a = new ma4.C15258a();
            c15258a.m38627h(kxeVar.m36294a());
            ma4 ma4VarM38620a = c15258a.m38620a();
            c16606a.f43555a = this;
            kxeVar2 = kxeVar;
            c16606a.f43556b = kxeVar2;
            c16606a.f43559e = 1;
            objA1 = cxeVar.A1(ma4VarM38620a, c16606a);
            if (objA1 == objM51918f) {
                return objM51918f;
            }
            rg5Var = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zo6 zo6Var = (zo6) c16606a.f43555a;
                wre.m54934b(objA1);
                return zo6Var;
            }
            kxeVar2 = (kxe) c16606a.f43556b;
            rg5Var = (rg5) c16606a.f43555a;
            wre.m54934b(objA1);
        }
        ehf ehfVarM40265a = ((na4) objA1).m40265a();
        sq8.m48646e(ehfVarM40265a);
        zo6 zo6Var2 = new zo6(ic4.f28446a.m31900a(ehfVarM40265a.m25063a(), ehfVarM40265a.m25065c(), (16 & 4) != 0 ? null : ehfVarM40265a.m25066d(), (16 & 8) != 0 ? null : ehfVarM40265a.m25064b(), (16 & 16) != 0 ? null : null, (16 & 32) != 0 ? null : null), rg5Var.f43550b.mo27091a().mo23355b(jk8.m33905c(rg5Var.f43551c.mo30148a(), ehfVarM40265a.m25064b())));
        uma umaVar = rg5Var.f43552d;
        mxe mxeVar = new mxe(zo6Var2, null, 2, null);
        c16606a.f43555a = zo6Var2;
        c16606a.f43556b = null;
        c16606a.f43559e = 2;
        return umaVar.m51779b(kxeVar2, mxeVar, c16606a) == objM51918f ? objM51918f : zo6Var2;
    }

    /* renamed from: k */
    public final qja m46697k(cxe cxeVar) {
        sq8.m48649h(cxeVar, "<this>");
        zja zjaVarMo40627c = cxeVar.getConfig().m21997v().mo40627c();
        String strMo26336c = kge.m35689b(rg5.class).mo26336c();
        if (strMo26336c != null) {
            return zjaVarMo40627c.mo33391a(strMo26336c);
        }
        throw new IllegalArgumentException("getLogger<T> cannot be used on an anonymous object".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // p001o.qc4, p001o.nb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object resolve(qx0 qx0Var, n64 n64Var) {
        C16607b c16607b;
        cxe cxeVar;
        rg5 rg5Var;
        String str;
        rg5 rg5Var2;
        final kxe kxeVar;
        final mxe mxeVar;
        Object obj;
        ic4 ic4Var;
        if (n64Var instanceof C16607b) {
            c16607b = (C16607b) n64Var;
            int i = c16607b.f43565f;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16607b.f43565f = i - Integer.MIN_VALUE;
            } else {
                c16607b = new C16607b(n64Var);
            }
        }
        Object objM51778a = c16607b.f43563d;
        Object objM51918f = uq8.m51918f();
        int i2 = c16607b.f43565f;
        if (i2 == 0) {
            wre.m54934b(objM51778a);
            ywe yweVar = ywe.f56214a;
            Object objM50737b = tx0.m50737b(qx0Var, yweVar.m58457b());
            sq8.m48647f(objM50737b, "null cannot be cast to non-null type aws.sdk.kotlin.services.s3.S3Client");
            cxeVar = (cxe) objM50737b;
            String str2 = (String) tx0.m50737b(qx0Var, yweVar.m58456a());
            qc4 qc4VarM21983h = cxeVar.getConfig().m21983h();
            c16607b.f43560a = this;
            c16607b.f43561b = cxeVar;
            c16607b.f43562c = str2;
            c16607b.f43565f = 1;
            Object objResolve = qc4VarM21983h.resolve(qx0Var, c16607b);
            if (objResolve == objM51918f) {
                return objM51918f;
            }
            rg5Var = this;
            objM51778a = objResolve;
            str = str2;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(objM51778a);
                    return (ic4) ((zo6) objM51778a).m59665b();
                }
                kxeVar = (kxe) c16607b.f43562c;
                cxeVar = (cxe) c16607b.f43561b;
                rg5Var2 = (rg5) c16607b.f43560a;
                wre.m54934b(objM51778a);
                mxeVar = (mxe) objM51778a;
                if (mxeVar == null) {
                    obj = null;
                    c16607b.f43560a = obj;
                    c16607b.f43561b = obj;
                    c16607b.f43562c = obj;
                    c16607b.f43565f = 3;
                    objM51778a = rg5Var2.m46696h(kxeVar, cxeVar, c16607b);
                    if (objM51778a == objM51918f) {
                        return objM51918f;
                    }
                } else {
                    if (!(!lxe.m38096b(mxeVar.m39758a()))) {
                        mxeVar = null;
                    }
                    if (mxeVar != null) {
                        if (lxe.m38097c(mxeVar.m39758a(), rg5Var2.f43553e)) {
                            qja.C16414b.m45550c(rg5Var2.m46697k(cxeVar), null, new uk7() { // from class: o.qg5
                                @Override // p001o.uk7
                                public final Object invoke() {
                                    return rg5.m46695o(kxeVar, mxeVar);
                                }
                            }, 1, null);
                            obj = null;
                            rm1.m46952d(rg5Var2, rg5Var2.mo6529D(), null, new C16608c(mxeVar, rg5Var2, cxeVar, kxeVar, null), 2, null);
                        } else {
                            obj = null;
                        }
                        zo6 zo6VarM39758a = mxeVar.m39758a();
                        if (zo6VarM39758a != null && (ic4Var = (ic4) zo6VarM39758a.m59665b()) != null) {
                            return ic4Var;
                        }
                    }
                    c16607b.f43560a = obj;
                    c16607b.f43561b = obj;
                    c16607b.f43562c = obj;
                    c16607b.f43565f = 3;
                    objM51778a = rg5Var2.m46696h(kxeVar, cxeVar, c16607b);
                    if (objM51778a == objM51918f) {
                    }
                }
                return (ic4) ((zo6) objM51778a).m59665b();
            }
            str = (String) c16607b.f43562c;
            cxeVar = (cxe) c16607b.f43561b;
            rg5Var = (rg5) c16607b.f43560a;
            wre.m54934b(objM51778a);
        }
        kxe kxeVar2 = new kxe(str, (ic4) objM51778a);
        uma umaVar = rg5Var.f43552d;
        c16607b.f43560a = rg5Var;
        c16607b.f43561b = cxeVar;
        c16607b.f43562c = kxeVar2;
        c16607b.f43565f = 2;
        objM51778a = umaVar.m51778a(kxeVar2, c16607b);
        if (objM51778a == objM51918f) {
            return objM51918f;
        }
        rg5Var2 = rg5Var;
        kxeVar = kxeVar2;
        mxeVar = (mxe) objM51778a;
        if (mxeVar == null) {
        }
        return (ic4) ((zo6) objM51778a).m59665b();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ rg5(fmh.InterfaceC13490b interfaceC13490b, hb3 hb3Var, uma umaVar, long j, int i, id5 id5Var) {
        fmh.InterfaceC13490b interfaceC13490b2 = (i & 1) != 0 ? fmh.C13489a.f23681a : interfaceC13490b;
        hb3 hb3Var2 = (i & 2) != 0 ? hb3.C13904a.f26578a : hb3Var;
        uma umaVarM38095a = (i & 4) != 0 ? lxe.m38095a() : umaVar;
        if ((i & 8) != 0) {
            k16.C14700a c14700a = k16.f31358b;
            j = m16.m38175s(1, o16.MINUTES);
        }
        this(interfaceC13490b2, hb3Var2, umaVarM38095a, j, null);
    }

    public rg5(fmh.InterfaceC13490b interfaceC13490b, hb3 hb3Var, uma umaVar, long j) {
        sq8.m48649h(interfaceC13490b, "timeSource");
        sq8.m48649h(hb3Var, "clock");
        sq8.m48649h(umaVar, "credentialsCache");
        this.f43550b = interfaceC13490b;
        this.f43551c = hb3Var;
        this.f43552d = umaVar;
        this.f43553e = j;
        this.f43554f = a79.m16544b(null, 1, null).plus(new f84("DefaultS3ExpressCredentialsProvider"));
    }
}
