package p001o;

import java.util.Set;
import java.util.concurrent.CancellationException;
import p001o.b7f;
import p001o.c7f;
import p001o.xse;

/* loaded from: classes2.dex */
public abstract class s6 extends m9 {

    /* renamed from: o.s6$a */
    public static final class C16753a extends jgg implements nl7 {

        /* renamed from: a */
        public int f44845a;

        /* renamed from: b */
        public /* synthetic */ Object f44846b;

        /* renamed from: c */
        public final /* synthetic */ dth f44847c;

        /* renamed from: d */
        public final /* synthetic */ c7f.InterfaceC12584a f44848d;

        /* renamed from: e */
        public final /* synthetic */ xk7 f44849e;

        /* renamed from: f */
        public final /* synthetic */ s6 f44850f;

        /* renamed from: g */
        public final /* synthetic */ b7f.InterfaceC12296a f44851g;

        /* renamed from: h */
        public Object f44852h;

        /* renamed from: q */
        public Object f44853q;

        /* renamed from: s */
        public Object f44854s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16753a(dth dthVar, n64 n64Var, c7f.InterfaceC12584a interfaceC12584a, xk7 xk7Var, s6 s6Var, b7f.InterfaceC12296a interfaceC12296a) {
            super(2, n64Var);
            this.f44847c = dthVar;
            this.f44848d = interfaceC12584a;
            this.f44849e = xk7Var;
            this.f44850f = s6Var;
            this.f44851g = interfaceC12296a;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C16753a c16753a = new C16753a(this.f44847c, n64Var, this.f44848d, this.f44849e, this.f44850f, this.f44851g);
            c16753a.f44846b = obj;
            return c16753a;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0101  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x010e  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x012a  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x014e  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0172  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x018a  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x019d  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x01ba  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x01fa A[RETURN] */
        @Override // p001o.vb1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            r9d r9dVarM46382a;
            ii9 ii9VarM35729a;
            ii9 ii9VarM35729a2;
            xse.InterfaceC18242a interfaceC18242a;
            xk7 xk7Var;
            gja gjaVarMo20139o;
            n81 n81Var;
            String strMo20138n;
            n81 n81Var2;
            Boolean boolMo20127c;
            n81 n81Var3;
            Boolean boolMo20129e;
            ii9 ii9Var;
            ii9 ii9Var2;
            r9d r9dVar;
            n81 n81Var4;
            String strMo20133i;
            c7f.InterfaceC12584a interfaceC12584a;
            rrf rrfVar;
            Set setMo22027j;
            s6 s6Var;
            b7f.InterfaceC12296a interfaceC12296a;
            Object objM51918f = uq8.m51918f();
            switch (this.f44845a) {
                case 0:
                    wre.m54934b(obj);
                    r9dVarM46382a = r9d.f43250a.m46382a();
                    ii9VarM35729a = ki9.m35729a(new C16756d(r9dVarM46382a, null));
                    ii9VarM35729a2 = ki9.m35729a(new C16755c(ii9VarM35729a, null));
                    c7f.InterfaceC12584a interfaceC12584a2 = this.f44848d;
                    if (interfaceC12584a2 instanceof xse.InterfaceC18242a) {
                        interfaceC18242a = (xse.InterfaceC18242a) interfaceC12584a2;
                        this.f44846b = r9dVarM46382a;
                        this.f44852h = ii9VarM35729a;
                        this.f44853q = ii9VarM35729a2;
                        this.f44854s = interfaceC18242a;
                        this.f44845a = 1;
                        obj = une.m51834c(null, ii9VarM35729a2, this, 1, null);
                        if (obj == objM51918f) {
                            return objM51918f;
                        }
                        interfaceC18242a.mo20135k((vse) obj);
                    }
                    xk7Var = this.f44849e;
                    if (xk7Var != null) {
                        xk7Var.invoke(this.f44848d);
                    }
                    c7f.InterfaceC12584a interfaceC12584a3 = this.f44848d;
                    gjaVarMo20139o = interfaceC12584a3.mo20139o();
                    if (gjaVarMo20139o == null) {
                        gjaVarMo20139o = (gja) bj6.m19237f(cb3.f17670a.m20638a(), r9dVarM46382a);
                    }
                    interfaceC12584a3.mo20136l(gjaVarMo20139o);
                    c7f.InterfaceC12584a interfaceC12584a4 = this.f44848d;
                    n81Var = (n81) interfaceC12584a4;
                    strMo20138n = ((n81) interfaceC12584a4).mo20138n();
                    if (strMo20138n == null) {
                        this.f44846b = r9dVarM46382a;
                        this.f44852h = ii9VarM35729a;
                        this.f44853q = ii9VarM35729a2;
                        this.f44854s = n81Var;
                        this.f44845a = 2;
                        obj = sne.m48584b(null, ii9VarM35729a2, this, 1, null);
                        if (obj == objM51918f) {
                            return objM51918f;
                        }
                        strMo20138n = (String) obj;
                    }
                    n81Var.mo20132h(strMo20138n);
                    c7f.InterfaceC12584a interfaceC12584a5 = this.f44848d;
                    n81Var2 = (n81) interfaceC12584a5;
                    boolMo20127c = ((n81) interfaceC12584a5).mo20127c();
                    if (boolMo20127c == null) {
                        this.f44846b = r9dVarM46382a;
                        this.f44852h = ii9VarM35729a;
                        this.f44853q = ii9VarM35729a2;
                        this.f44854s = n81Var2;
                        this.f44845a = 3;
                        obj = xne.m56516h(null, ii9VarM35729a2, this, 1, null);
                        if (obj == objM51918f) {
                            return objM51918f;
                        }
                        boolMo20127c = (Boolean) obj;
                    }
                    n81Var2.mo20128d(boolMo20127c);
                    c7f.InterfaceC12584a interfaceC12584a6 = this.f44848d;
                    n81Var3 = (n81) interfaceC12584a6;
                    boolMo20129e = ((n81) interfaceC12584a6).mo20129e();
                    if (boolMo20129e == null) {
                        ii9Var = ii9VarM35729a2;
                        ii9Var2 = ii9VarM35729a;
                        r9dVar = r9dVarM46382a;
                        n81Var3.mo20131g(boolMo20129e);
                        c7f.InterfaceC12584a interfaceC12584a7 = this.f44848d;
                        n81Var4 = (n81) interfaceC12584a7;
                        strMo20133i = ((n81) interfaceC12584a7).mo20133i();
                        if (strMo20133i == null) {
                        }
                        n81Var4.mo20130f(strMo20133i);
                        interfaceC12584a = this.f44848d;
                        if (interfaceC12584a instanceof rrf) {
                        }
                        this.f44850f.mo20103a(this.f44851g);
                        s6Var = this.f44850f;
                        interfaceC12296a = this.f44851g;
                        this.f44846b = null;
                        this.f44852h = null;
                        this.f44853q = null;
                        this.f44854s = null;
                        this.f44845a = 9;
                        if (s6Var.mo20105e(interfaceC12296a, ii9Var2, ii9Var, this) == objM51918f) {
                        }
                        return y3i.f54824a;
                    }
                    this.f44846b = r9dVarM46382a;
                    this.f44852h = ii9VarM35729a;
                    this.f44853q = ii9VarM35729a2;
                    this.f44854s = n81Var3;
                    this.f44845a = 4;
                    obj = xne.m56514f(null, ii9VarM35729a2, this, 1, null);
                    if (obj == objM51918f) {
                        return objM51918f;
                    }
                    ii9Var = ii9VarM35729a2;
                    ii9Var2 = ii9VarM35729a;
                    r9dVar = r9dVarM46382a;
                    boolMo20129e = (Boolean) obj;
                    n81Var3.mo20131g(boolMo20129e);
                    c7f.InterfaceC12584a interfaceC12584a72 = this.f44848d;
                    n81Var4 = (n81) interfaceC12584a72;
                    strMo20133i = ((n81) interfaceC12584a72).mo20133i();
                    if (strMo20133i == null) {
                        this.f44846b = r9dVar;
                        this.f44852h = ii9Var2;
                        this.f44853q = ii9Var;
                        this.f44854s = n81Var4;
                        this.f44845a = 5;
                        obj = vne.m53073a(r9dVar, ii9Var, this);
                        if (obj == objM51918f) {
                            return objM51918f;
                        }
                        strMo20133i = (String) obj;
                    }
                    n81Var4.mo20130f(strMo20133i);
                    interfaceC12584a = this.f44848d;
                    if (interfaceC12584a instanceof rrf) {
                        rrfVar = (rrf) interfaceC12584a;
                        setMo22027j = ((rrf) interfaceC12584a).mo22027j();
                        if (setMo22027j == null) {
                            this.f44846b = ii9Var2;
                            this.f44852h = ii9Var;
                            this.f44853q = rrfVar;
                            this.f44854s = null;
                            this.f44845a = 8;
                            obj = sne.m48585c(r9dVar, ii9Var, this);
                            if (obj == objM51918f) {
                                return objM51918f;
                            }
                            setMo22027j = (Set) obj;
                        }
                        rrfVar.mo22028m(setMo22027j);
                    }
                    this.f44850f.mo20103a(this.f44851g);
                    s6Var = this.f44850f;
                    interfaceC12296a = this.f44851g;
                    this.f44846b = null;
                    this.f44852h = null;
                    this.f44853q = null;
                    this.f44854s = null;
                    this.f44845a = 9;
                    if (s6Var.mo20105e(interfaceC12296a, ii9Var2, ii9Var, this) == objM51918f) {
                        return objM51918f;
                    }
                    return y3i.f54824a;
                case 1:
                    interfaceC18242a = (xse.InterfaceC18242a) this.f44854s;
                    ii9VarM35729a2 = (ii9) this.f44853q;
                    ii9VarM35729a = (ii9) this.f44852h;
                    r9dVarM46382a = (r9d) this.f44846b;
                    wre.m54934b(obj);
                    interfaceC18242a.mo20135k((vse) obj);
                    xk7Var = this.f44849e;
                    if (xk7Var != null) {
                    }
                    c7f.InterfaceC12584a interfaceC12584a32 = this.f44848d;
                    gjaVarMo20139o = interfaceC12584a32.mo20139o();
                    if (gjaVarMo20139o == null) {
                    }
                    interfaceC12584a32.mo20136l(gjaVarMo20139o);
                    c7f.InterfaceC12584a interfaceC12584a42 = this.f44848d;
                    n81Var = (n81) interfaceC12584a42;
                    strMo20138n = ((n81) interfaceC12584a42).mo20138n();
                    if (strMo20138n == null) {
                    }
                    n81Var.mo20132h(strMo20138n);
                    c7f.InterfaceC12584a interfaceC12584a52 = this.f44848d;
                    n81Var2 = (n81) interfaceC12584a52;
                    boolMo20127c = ((n81) interfaceC12584a52).mo20127c();
                    if (boolMo20127c == null) {
                    }
                    n81Var2.mo20128d(boolMo20127c);
                    c7f.InterfaceC12584a interfaceC12584a62 = this.f44848d;
                    n81Var3 = (n81) interfaceC12584a62;
                    boolMo20129e = ((n81) interfaceC12584a62).mo20129e();
                    if (boolMo20129e == null) {
                    }
                    break;
                case 2:
                    n81Var = (n81) this.f44854s;
                    ii9VarM35729a2 = (ii9) this.f44853q;
                    ii9VarM35729a = (ii9) this.f44852h;
                    r9dVarM46382a = (r9d) this.f44846b;
                    wre.m54934b(obj);
                    strMo20138n = (String) obj;
                    n81Var.mo20132h(strMo20138n);
                    c7f.InterfaceC12584a interfaceC12584a522 = this.f44848d;
                    n81Var2 = (n81) interfaceC12584a522;
                    boolMo20127c = ((n81) interfaceC12584a522).mo20127c();
                    if (boolMo20127c == null) {
                    }
                    n81Var2.mo20128d(boolMo20127c);
                    c7f.InterfaceC12584a interfaceC12584a622 = this.f44848d;
                    n81Var3 = (n81) interfaceC12584a622;
                    boolMo20129e = ((n81) interfaceC12584a622).mo20129e();
                    if (boolMo20129e == null) {
                    }
                    break;
                case 3:
                    n81Var2 = (n81) this.f44854s;
                    ii9VarM35729a2 = (ii9) this.f44853q;
                    ii9VarM35729a = (ii9) this.f44852h;
                    r9dVarM46382a = (r9d) this.f44846b;
                    wre.m54934b(obj);
                    boolMo20127c = (Boolean) obj;
                    n81Var2.mo20128d(boolMo20127c);
                    c7f.InterfaceC12584a interfaceC12584a6222 = this.f44848d;
                    n81Var3 = (n81) interfaceC12584a6222;
                    boolMo20129e = ((n81) interfaceC12584a6222).mo20129e();
                    if (boolMo20129e == null) {
                    }
                    break;
                case 4:
                    n81Var3 = (n81) this.f44854s;
                    ii9Var = (ii9) this.f44853q;
                    ii9Var2 = (ii9) this.f44852h;
                    r9dVar = (r9d) this.f44846b;
                    wre.m54934b(obj);
                    boolMo20129e = (Boolean) obj;
                    n81Var3.mo20131g(boolMo20129e);
                    c7f.InterfaceC12584a interfaceC12584a722 = this.f44848d;
                    n81Var4 = (n81) interfaceC12584a722;
                    strMo20133i = ((n81) interfaceC12584a722).mo20133i();
                    if (strMo20133i == null) {
                    }
                    n81Var4.mo20130f(strMo20133i);
                    interfaceC12584a = this.f44848d;
                    if (interfaceC12584a instanceof rrf) {
                    }
                    this.f44850f.mo20103a(this.f44851g);
                    s6Var = this.f44850f;
                    interfaceC12296a = this.f44851g;
                    this.f44846b = null;
                    this.f44852h = null;
                    this.f44853q = null;
                    this.f44854s = null;
                    this.f44845a = 9;
                    if (s6Var.mo20105e(interfaceC12296a, ii9Var2, ii9Var, this) == objM51918f) {
                    }
                    return y3i.f54824a;
                case 5:
                    n81Var4 = (n81) this.f44854s;
                    ii9Var = (ii9) this.f44853q;
                    ii9Var2 = (ii9) this.f44852h;
                    r9dVar = (r9d) this.f44846b;
                    wre.m54934b(obj);
                    strMo20133i = (String) obj;
                    n81Var4.mo20130f(strMo20133i);
                    interfaceC12584a = this.f44848d;
                    if (interfaceC12584a instanceof rrf) {
                    }
                    this.f44850f.mo20103a(this.f44851g);
                    s6Var = this.f44850f;
                    interfaceC12296a = this.f44851g;
                    this.f44846b = null;
                    this.f44852h = null;
                    this.f44853q = null;
                    this.f44854s = null;
                    this.f44845a = 9;
                    if (s6Var.mo20105e(interfaceC12296a, ii9Var2, ii9Var, this) == objM51918f) {
                    }
                    return y3i.f54824a;
                case 6:
                    tq.m50332a(this.f44854s);
                    wre.m54934b(obj);
                    throw null;
                case 7:
                    tq.m50332a(this.f44854s);
                    wre.m54934b(obj);
                    throw null;
                case 8:
                    rrfVar = (rrf) this.f44853q;
                    ii9Var = (ii9) this.f44852h;
                    ii9Var2 = (ii9) this.f44846b;
                    wre.m54934b(obj);
                    setMo22027j = (Set) obj;
                    rrfVar.mo22028m(setMo22027j);
                    this.f44850f.mo20103a(this.f44851g);
                    s6Var = this.f44850f;
                    interfaceC12296a = this.f44851g;
                    this.f44846b = null;
                    this.f44852h = null;
                    this.f44853q = null;
                    this.f44854s = null;
                    this.f44845a = 9;
                    if (s6Var.mo20105e(interfaceC12296a, ii9Var2, ii9Var, this) == objM51918f) {
                    }
                    return y3i.f54824a;
                case 9:
                    wre.m54934b(obj);
                    return y3i.f54824a;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C16753a) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.s6$b */
    public static final class C16754b extends o64 {

        /* renamed from: a */
        public Object f44855a;

        /* renamed from: b */
        public Object f44856b;

        /* renamed from: c */
        public /* synthetic */ Object f44857c;

        /* renamed from: e */
        public int f44859e;

        public C16754b(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f44857c = obj;
            this.f44859e |= Integer.MIN_VALUE;
            return s6.this.m47891g(null, this);
        }
    }

    /* renamed from: o.s6$c */
    public static final class C16755c extends jgg implements xk7 {

        /* renamed from: a */
        public int f44860a;

        /* renamed from: b */
        public final /* synthetic */ ii9 f44861b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16755c(ii9 ii9Var, n64 n64Var) {
            super(1, n64Var);
            this.f44861b = ii9Var;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return new C16755c(this.f44861b, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f44860a;
            if (i == 0) {
                wre.m54934b(obj);
                ii9 ii9Var = this.f44861b;
                this.f44860a = 1;
                obj = ii9Var.mo32174a(this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return ((r81) obj).m46332a();
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C16755c) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.s6$d */
    public static final class C16756d extends jgg implements xk7 {

        /* renamed from: a */
        public int f44862a;

        /* renamed from: b */
        public final /* synthetic */ r9d f44863b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16756d(r9d r9dVar, n64 n64Var) {
            super(1, n64Var);
            this.f44863b = r9dVar;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return new C16756d(this.f44863b, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f44862a;
            if (i == 0) {
                wre.m54934b(obj);
                r9d r9dVar = this.f44863b;
                this.f44862a = 1;
                obj = n71.m40193c(r9dVar, null, null, this, 6, null);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return obj;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C16756d) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: f */
    public static /* synthetic */ Object m47890f(s6 s6Var, b7f.InterfaceC12296a interfaceC12296a, ii9 ii9Var, ii9 ii9Var2, n64 n64Var) {
        return y3i.f54824a;
    }

    /* renamed from: e */
    public Object mo20105e(b7f.InterfaceC12296a interfaceC12296a, ii9 ii9Var, ii9 ii9Var2, n64 n64Var) {
        return m47890f(this, interfaceC12296a, ii9Var, ii9Var2, n64Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f2 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002d, B:52:0x00ee, B:54:0x00f2, B:56:0x0104, B:55:0x00fc), top: B:59:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fc A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002d, B:52:0x00ee, B:54:0x00f2, B:56:0x0104, B:55:0x00fc), top: B:59:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r14v0, types: [o.xk7] */
    /* JADX WARN: Type inference failed for: r14v1, types: [o.dth] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m47891g(xk7 xk7Var, n64 n64Var) throws Throwable {
        C16754b c16754b;
        vdh vdhVarM52646a;
        dth dthVar;
        q74 tdhVar;
        b7f.InterfaceC12296a interfaceC12296a;
        vdh vdhVarM54242K;
        g64 g64VarMo40626b;
        if (n64Var instanceof C16754b) {
            c16754b = (C16754b) n64Var;
            int i = c16754b.f44859e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16754b.f44859e = i - Integer.MIN_VALUE;
            } else {
                c16754b = new C16754b(n64Var);
            }
        }
        Object obj = c16754b.f44857c;
        Object objM51918f = uq8.m51918f();
        int i2 = c16754b.f44859e;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dthVar = (dth) c16754b.f44856b;
                interfaceC12296a = (b7f.InterfaceC12296a) c16754b.f44855a;
                try {
                    wre.m54934b(obj);
                    dthVar.close();
                    return interfaceC12296a.build();
                } catch (Exception e) {
                    e = e;
                    if (e instanceof CancellationException) {
                        dthVar.Z0(vzf.ERROR);
                        fth.m27471a(dthVar, e, true);
                    } else {
                        fth.m27472b(dthVar, "cancelled", ml1.m39301a(true));
                    }
                    throw e;
                }
            }
            wre.m54934b(obj);
            b7f.InterfaceC12296a interfaceC12296aMo20104b = mo20104b();
            c7f.InterfaceC12584a config = interfaceC12296aMo20104b.getConfig();
            x54 x54VarMo28089a = null;
            sdh sdhVar = interfaceC12296aMo20104b instanceof sdh ? (sdh) interfaceC12296aMo20104b : null;
            if (sdhVar == null || (vdhVarM52646a = sdhVar.mo20125a()) == null) {
                vdhVarM52646a = vdh.f50220a.m52646a();
            }
            hth hthVarMo34509a = vdhVarM52646a.mo40628d().mo34509a("AwsSdkClientFactory");
            qx0 qx0VarM50736a = tx0.m50736a();
            uzf uzfVar = uzf.INTERNAL;
            e66 e66Var = e66.f21035a;
            dth dthVarMo31126a = hthVarMo34509a.mo31126a("fromEnvironment", qx0VarM50736a, uzfVar, udh.m51389a(c16754b.getContext()));
            try {
                wdh wdhVar = (wdh) c16754b.getContext().get(wdh.f51822c);
                if (wdhVar != null && (vdhVarM54242K = wdhVar.m54242K()) != null && (g64VarMo40626b = vdhVarM54242K.mo40626b()) != null) {
                    x54VarMo28089a = g64VarMo40626b.mo28089a();
                }
                if (x54VarMo28089a != null) {
                    tdhVar = new tdh(x54VarMo28089a);
                } else {
                    tdhVar = (tdh) c16754b.getContext().get(tdh.f46909c);
                    if (tdhVar == null) {
                        tdhVar = e66Var;
                    }
                }
                q74 q74VarPlus = e66Var.plus(new eth(dthVarMo31126a)).plus(tdhVar);
                C16753a c16753a = new C16753a(dthVarMo31126a, null, config, xk7Var, this, interfaceC12296aMo20104b);
                c16754b.f44855a = interfaceC12296aMo20104b;
                c16754b.f44856b = dthVarMo31126a;
                c16754b.f44859e = 1;
                if (pm1.m43867g(q74VarPlus, c16753a, c16754b) == objM51918f) {
                    return objM51918f;
                }
                interfaceC12296a = interfaceC12296aMo20104b;
                dthVar = dthVarMo31126a;
                dthVar.close();
                return interfaceC12296a.build();
            } catch (Exception e2) {
                e = e2;
                dthVar = dthVarMo31126a;
                if (e instanceof CancellationException) {
                }
                throw e;
            } catch (Throwable th) {
                th = th;
                xk7Var = dthVarMo31126a;
                xk7Var.close();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
