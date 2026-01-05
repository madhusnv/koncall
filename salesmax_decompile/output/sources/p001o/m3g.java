package p001o;

import java.util.concurrent.CancellationException;
import p001o.ese;
import p001o.m3g;
import p001o.vre;
import p001o.vse;
import p001o.zfc;

/* loaded from: classes3.dex */
public class m3g implements vse {

    /* renamed from: b */
    public static final C15210a f34705b = new C15210a(null);

    /* renamed from: a */
    public final C15211b f34706a;

    /* renamed from: o.m3g$a */
    public static final class C15210a implements o06 {
        public C15210a() {
        }

        public /* synthetic */ C15210a(id5 id5Var) {
            this();
        }

        @Override // p001o.o06
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public m3g mo19519a(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            C15211b.a aVar = new C15211b.a();
            xk7Var.invoke(aVar);
            return new m3g(new C15211b(aVar));
        }
    }

    /* renamed from: o.m3g$b */
    public static class C15211b implements vse.InterfaceC17669a {

        /* renamed from: d */
        public static final b f34707d = new b(null);

        /* renamed from: a */
        public final qk5 f34708a;

        /* renamed from: b */
        public final int f34709b;

        /* renamed from: c */
        public final cte f34710c;

        /* renamed from: o.m3g$b$a */
        public static class a implements vse.InterfaceC17669a.a {

            /* renamed from: a */
            public final n06 f34711a = new n06(bp6.f16648c, new xk7() { // from class: o.o3g
                @Override // p001o.xk7
                public final Object invoke(Object obj) {
                    return m3g.C15211b.a.m38270c((qk5) obj);
                }
            }, null, 4, null);

            /* renamed from: b */
            public int f34712b = 3;

            /* renamed from: c */
            public final n06 f34713c = new n06(q3g.f41223f, new xk7() { // from class: o.p3g
                @Override // p001o.xk7
                public final Object invoke(Object obj) {
                    return m3g.C15211b.a.m38271j((cte) obj);
                }
            }, null, 4, null);

            /* renamed from: c */
            public static final xk7 m38270c(qk5 qk5Var) {
                sq8.m48649h(qk5Var, "$this$DslBuilderProperty");
                return qk5Var.getConfig().mo19523a();
            }

            /* renamed from: j */
            public static final xk7 m38271j(cte cteVar) {
                sq8.m48649h(cteVar, "$this$DslBuilderProperty");
                return cteVar.getConfig().mo21795a();
            }

            /* renamed from: d */
            public final n06 m38272d() {
                return this.f34711a;
            }

            /* renamed from: e */
            public int m38273e() {
                return this.f34712b;
            }

            /* renamed from: f */
            public final n06 m38274f() {
                return this.f34713c;
            }

            /* renamed from: g */
            public final void m38275g(qk5 qk5Var) {
                this.f34711a.m39947p(qk5Var);
            }

            /* renamed from: h */
            public void m38276h(int i) {
                this.f34712b = i;
            }

            /* renamed from: i */
            public final void m38277i(cte cteVar) {
                this.f34713c.m39947p(cteVar);
            }
        }

        /* renamed from: o.m3g$b$b */
        public static final class b {
            public b() {
            }

            public /* synthetic */ b(id5 id5Var) {
                this();
            }

            /* renamed from: a */
            public final C15211b m38278a() {
                return new C15211b(new a());
            }
        }

        public C15211b(a aVar) {
            sq8.m48649h(aVar, "builder");
            this.f34708a = (qk5) aVar.m38272d().m39946o().invoke();
            this.f34709b = aVar.m38273e();
            this.f34710c = (cte) aVar.m38274f().m39946o().invoke();
        }

        /* renamed from: f */
        public static final y3i m38263f(C15211b c15211b, vse.InterfaceC17669a.a aVar) {
            sq8.m48649h(aVar, "<this>");
            if (aVar instanceof a) {
                a aVar2 = (a) aVar;
                aVar2.m38275g(c15211b.f34708a);
                aVar2.m38276h(c15211b.mo38265b());
                aVar2.m38277i(c15211b.f34710c);
            }
            return y3i.f54824a;
        }

        @Override // p001o.vse.InterfaceC17669a
        /* renamed from: a */
        public xk7 mo38264a() {
            return new xk7() { // from class: o.n3g
                @Override // p001o.xk7
                public final Object invoke(Object obj) {
                    return m3g.C15211b.m38263f(this.f36319a, (vse.InterfaceC17669a.a) obj);
                }
            };
        }

        @Override // p001o.vse.InterfaceC17669a
        /* renamed from: b */
        public int mo38265b() {
            return this.f34709b;
        }

        /* renamed from: d */
        public final qk5 m38266d() {
            return this.f34708a;
        }

        /* renamed from: e */
        public final cte m38267e() {
            return this.f34710c;
        }
    }

    /* renamed from: o.m3g$c */
    public static final class C15212c extends o64 {

        /* renamed from: a */
        public Object f34714a;

        /* renamed from: b */
        public Object f34715b;

        /* renamed from: c */
        public Object f34716c;

        /* renamed from: d */
        public Object f34717d;

        /* renamed from: e */
        public Object f34718e;

        /* renamed from: f */
        public Object f34719f;

        /* renamed from: g */
        public int f34720g;

        /* renamed from: h */
        public /* synthetic */ Object f34721h;

        /* renamed from: s */
        public int f34723s;

        public C15212c(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f34721h = obj;
            this.f34723s |= Integer.MIN_VALUE;
            return m3g.this.m38255j(null, null, 0, null, this);
        }
    }

    /* renamed from: o.m3g$d */
    public static final class C15213d extends o64 {

        /* renamed from: a */
        public Object f34724a;

        /* renamed from: b */
        public Object f34725b;

        /* renamed from: c */
        public Object f34726c;

        /* renamed from: d */
        public int f34727d;

        /* renamed from: e */
        public /* synthetic */ Object f34728e;

        /* renamed from: g */
        public int f34730g;

        public C15213d(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f34728e = obj;
            this.f34730g |= Integer.MIN_VALUE;
            return m3g.m38250l(m3g.this, null, null, this);
        }
    }

    /* renamed from: o.m3g$e */
    public static final class C15214e extends o64 {

        /* renamed from: a */
        public int f34731a;

        /* renamed from: b */
        public Object f34732b;

        /* renamed from: c */
        public /* synthetic */ Object f34733c;

        /* renamed from: e */
        public int f34735e;

        public C15214e(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f34733c = obj;
            this.f34735e |= Integer.MIN_VALUE;
            return m3g.this.m38257m(null, 0, null, this);
        }
    }

    public m3g(C15211b c15211b) {
        sq8.m48649h(c15211b, "config");
        this.f34706a = c15211b;
    }

    /* renamed from: e */
    public static /* synthetic */ Object m38247e(m3g m3gVar, int i, Object obj, ese eseVar, tse tseVar, n64 n64Var) {
        return y3i.f54824a;
    }

    /* renamed from: g */
    public static /* synthetic */ Object m38248g(m3g m3gVar, n64 n64Var) {
        return y3i.f54824a;
    }

    /* renamed from: i */
    public static /* synthetic */ Object m38249i(m3g m3gVar, int i, Object obj, ese eseVar, tse tseVar, n64 n64Var) {
        return y3i.f54824a;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a1 A[PHI: r10
      0x00a1: PHI (r10v8 java.lang.Object) = (r10v7 java.lang.Object), (r10v1 java.lang.Object) binds: [B:29:0x009e, B:13:0x002d] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object m38250l(m3g m3gVar, tse tseVar, xk7 xk7Var, n64 n64Var) throws Throwable {
        C15213d c15213d;
        m3g m3gVar2;
        tse tseVar2;
        int i;
        if (n64Var instanceof C15213d) {
            c15213d = (C15213d) n64Var;
            int i2 = c15213d.f34730g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c15213d.f34730g = i2 - Integer.MIN_VALUE;
            } else {
                c15213d = m3gVar.new C15213d(n64Var);
            }
        }
        C15213d c15213d2 = c15213d;
        Object objMo21794a = c15213d2.f34728e;
        Object objM51918f = uq8.m51918f();
        int i3 = c15213d2.f34730g;
        try {
            if (i3 == 0) {
                wre.m54934b(objMo21794a);
                c15213d2.f34724a = m3gVar;
                c15213d2.f34725b = tseVar;
                c15213d2.f34726c = xk7Var;
                c15213d2.f34730g = 1;
                if (m3gVar.mo38253f(c15213d2) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            wre.m54934b(objMo21794a);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = c15213d2.f34727d;
                    tse tseVar3 = (tse) c15213d2.f34726c;
                    xk7Var = (xk7) c15213d2.f34725b;
                    m3gVar2 = (m3g) c15213d2.f34724a;
                    wre.m54934b(objMo21794a);
                    tseVar2 = tseVar3;
                    c15213d2.f34724a = null;
                    c15213d2.f34725b = null;
                    c15213d2.f34726c = null;
                    c15213d2.f34730g = 3;
                    objMo21794a = m3gVar2.m38255j(xk7Var, tseVar2, i, (bte) objMo21794a, c15213d2);
                    return objMo21794a != objM51918f ? objM51918f : objMo21794a;
                }
                xk7Var = (xk7) c15213d2.f34726c;
                tseVar = (tse) c15213d2.f34725b;
                m3gVar = (m3g) c15213d2.f34724a;
                wre.m54934b(objMo21794a);
            }
            cte cteVarM38267e = m3gVar.getConfig().m38267e();
            c15213d2.f34724a = m3gVar;
            c15213d2.f34725b = xk7Var;
            c15213d2.f34726c = tseVar;
            c15213d2.f34727d = 1;
            c15213d2.f34730g = 2;
            objMo21794a = cteVarM38267e.mo21794a(c15213d2);
            if (objMo21794a == objM51918f) {
                return objM51918f;
            }
            m3gVar2 = m3gVar;
            tseVar2 = tseVar;
            i = 1;
            c15213d2.f34724a = null;
            c15213d2.f34725b = null;
            c15213d2.f34726c = null;
            c15213d2.f34730g = 3;
            objMo21794a = m3gVar2.m38255j(xk7Var, tseVar2, i, (bte) objMo21794a, c15213d2);
            if (objMo21794a != objM51918f) {
            }
        } catch (dse e) {
            m3gVar.m38258n(e, 1, null);
            throw new qe9();
        }
    }

    @Override // p001o.vse
    /* renamed from: a */
    public Object mo38251a(tse tseVar, xk7 xk7Var, n64 n64Var) {
        return m38250l(this, tseVar, xk7Var, n64Var);
    }

    /* renamed from: d */
    public Object mo38252d(int i, Object obj, ese eseVar, tse tseVar, n64 n64Var) {
        return m38247e(this, i, obj, eseVar, tseVar, n64Var);
    }

    /* renamed from: f */
    public Object mo38253f(n64 n64Var) {
        return m38248g(this, n64Var);
    }

    /* renamed from: h */
    public Object mo38254h(int i, Object obj, ese eseVar, tse tseVar, n64 n64Var) {
        return m38249i(this, i, obj, eseVar, tseVar, n64Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0123 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0192 A[Catch: all -> 0x00cf, dse -> 0x00d7, TryCatch #5 {dse -> 0x00d7, all -> 0x00cf, blocks: (B:14:0x0052, B:54:0x0166, B:58:0x018e, B:60:0x0192, B:64:0x01af, B:66:0x01b3, B:68:0x01b7, B:70:0x01c5, B:73:0x01e9, B:85:0x0248, B:86:0x0254, B:87:0x0255, B:88:0x025a, B:89:0x025b, B:90:0x0267, B:17:0x0074, B:20:0x009a, B:23:0x00ad, B:26:0x00ca), top: B:104:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01af A[Catch: all -> 0x00cf, dse -> 0x00d7, TryCatch #5 {dse -> 0x00d7, all -> 0x00cf, blocks: (B:14:0x0052, B:54:0x0166, B:58:0x018e, B:60:0x0192, B:64:0x01af, B:66:0x01b3, B:68:0x01b7, B:70:0x01c5, B:73:0x01e9, B:85:0x0248, B:86:0x0254, B:87:0x0255, B:88:0x025a, B:89:0x025b, B:90:0x0267, B:17:0x0074, B:20:0x009a, B:23:0x00ad, B:26:0x00ca), top: B:104:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0207 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x022e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0290  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x022f -> B:80:0x0237). Please report as a decompilation issue!!! */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m38255j(xk7 xk7Var, tse tseVar, int i, bte bteVar, n64 n64Var) throws Throwable {
        C15212c c15212c;
        bte bteVar2;
        gge ggeVar;
        C15212c c15212c2;
        Object obj;
        xk7 xk7Var2;
        tse tseVar2;
        gge ggeVar2;
        bte bteVar3;
        tse tseVar3;
        xk7 xk7Var3;
        ese eseVar;
        Object obj2;
        gge ggeVar3;
        bte bteVar4;
        tse tseVar4;
        xk7 xk7Var4;
        Throwable th;
        Object objM53351b;
        Object obj3;
        gge ggeVar4;
        bte bteVar5;
        ese eseVar2;
        xk7 xk7Var5;
        tse tseVar5;
        CancellationException cancellationException;
        if (n64Var instanceof C15212c) {
            c15212c = (C15212c) n64Var;
            int i2 = c15212c.f34723s;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c15212c.f34723s = i2 - Integer.MIN_VALUE;
            } else {
                c15212c = new C15212c(n64Var);
            }
        }
        Object objMo19784c = c15212c.f34721h;
        Object objM51918f = uq8.m51918f();
        int i3 = c15212c.f34723s;
        try {
            switch (i3) {
                case 0:
                    wre.m54934b(objMo19784c);
                    gge ggeVar5 = new gge();
                    ggeVar5.f25106a = this;
                    i3 = i;
                    bteVar2 = bteVar;
                    ggeVar = ggeVar5;
                    c15212c2 = c15212c;
                    obj = objM51918f;
                    xk7Var2 = xk7Var;
                    tseVar2 = tseVar;
                    Object obj4 = ggeVar.f25106a;
                    try {
                    } catch (Throwable th2) {
                        th = th2;
                        gge ggeVar6 = ggeVar;
                        xk7Var3 = xk7Var2;
                        c15212c = c15212c2;
                        bteVar3 = bteVar2;
                        ggeVar2 = ggeVar6;
                        Object obj5 = obj;
                        tseVar3 = tseVar2;
                        objM51918f = obj5;
                        vre.C17665a c17665a = vre.f50797b;
                        objM53351b = vre.m53351b(wre.m54933a(th));
                        bte bteVar6 = bteVar3;
                        obj2 = objM53351b;
                        tse tseVar6 = tseVar3;
                        ggeVar3 = ggeVar2;
                        xk7 xk7Var6 = xk7Var3;
                        bteVar4 = bteVar6;
                        Throwable thM53354e = vre.m53354e(obj2);
                        if (!(thM53354e instanceof CancellationException)) {
                        }
                        if (cancellationException == null) {
                        }
                    }
                    vre.C17665a c17665a2 = vre.f50797b;
                    c15212c2.f34714a = xk7Var2;
                    c15212c2.f34715b = tseVar2;
                    c15212c2.f34716c = bteVar2;
                    c15212c2.f34717d = ggeVar;
                    c15212c2.f34718e = null;
                    c15212c2.f34719f = null;
                    c15212c2.f34720g = i3;
                    c15212c2.f34723s = 1;
                    objMo19784c = xk7Var2.invoke(c15212c2);
                    if (objMo19784c == obj) {
                        return obj;
                    }
                    gge ggeVar7 = ggeVar;
                    xk7Var3 = xk7Var2;
                    c15212c = c15212c2;
                    bteVar3 = bteVar2;
                    ggeVar2 = ggeVar7;
                    Object obj6 = obj;
                    tseVar3 = tseVar2;
                    objM51918f = obj6;
                    objM53351b = vre.m53351b(objMo19784c);
                    bte bteVar62 = bteVar3;
                    obj2 = objM53351b;
                    tse tseVar62 = tseVar3;
                    ggeVar3 = ggeVar2;
                    xk7 xk7Var62 = xk7Var3;
                    bteVar4 = bteVar62;
                    Throwable thM53354e2 = vre.m53354e(obj2);
                    cancellationException = !(thM53354e2 instanceof CancellationException) ? (CancellationException) thM53354e2 : null;
                    if (cancellationException == null) {
                        throw cancellationException;
                    }
                    ese eseVarEvaluate = tseVar62.evaluate(obj2);
                    m3g m3gVar = (m3g) ggeVar3.f25106a;
                    c15212c.f34714a = xk7Var62;
                    c15212c.f34715b = tseVar62;
                    c15212c.f34716c = bteVar4;
                    c15212c.f34717d = ggeVar3;
                    c15212c.f34718e = obj2;
                    c15212c.f34719f = eseVarEvaluate;
                    c15212c.f34720g = i3;
                    c15212c.f34723s = 2;
                    if (m3gVar.mo38252d(i3, obj2, eseVarEvaluate, tseVar62, c15212c) == objM51918f) {
                        return objM51918f;
                    }
                    tseVar4 = tseVar62;
                    xk7Var4 = xk7Var62;
                    eseVar = eseVarEvaluate;
                    if (eseVar instanceof ese.C13256c) {
                        m3g m3gVar2 = (m3g) ggeVar3.f25106a;
                        c15212c.f34714a = bteVar4;
                        c15212c.f34715b = ggeVar3;
                        c15212c.f34716c = obj2;
                        c15212c.f34717d = null;
                        c15212c.f34718e = null;
                        c15212c.f34719f = null;
                        c15212c.f34720g = i3;
                        c15212c.f34723s = 3;
                        objMo19784c = m3gVar2.m38257m(bteVar4, i3, obj2, c15212c);
                        return objMo19784c == objM51918f ? objM51918f : objMo19784c;
                    }
                    if (eseVar instanceof ese.C13255b) {
                        ((m3g) ggeVar3.f25106a).m38259o(i3, obj2);
                        throw new qe9();
                    }
                    if (!(eseVar instanceof ese.C13254a)) {
                        throw new szb();
                    }
                    if (i3 >= ((m3g) ggeVar3.f25106a).getConfig().mo38265b()) {
                        ((m3g) ggeVar3.f25106a).m38260p(i3, obj2);
                        throw new qe9();
                    }
                    try {
                        qk5 qk5VarM38266d = ((m3g) ggeVar3.f25106a).getConfig().m38266d();
                        c15212c.f34714a = xk7Var4;
                        c15212c.f34715b = tseVar4;
                        c15212c.f34716c = bteVar4;
                        c15212c.f34717d = ggeVar3;
                        c15212c.f34718e = obj2;
                        c15212c.f34719f = eseVar;
                        c15212c.f34720g = i3;
                        c15212c.f34723s = 4;
                        if (qk5VarM38266d.mo19517a(i3, c15212c) == objM51918f) {
                            return objM51918f;
                        }
                        fse fseVarM25527a = ((ese.C13254a) eseVar).m25527a();
                        c15212c.f34714a = xk7Var4;
                        c15212c.f34715b = tseVar4;
                        c15212c.f34716c = bteVar4;
                        c15212c.f34717d = ggeVar3;
                        c15212c.f34718e = obj2;
                        c15212c.f34719f = eseVar;
                        c15212c.f34720g = i3;
                        c15212c.f34723s = 5;
                        objMo19784c = bteVar4.mo19784c(fseVarM25527a, c15212c);
                        if (objMo19784c == objM51918f) {
                            return objM51918f;
                        }
                        bte bteVar7 = (bte) objMo19784c;
                        c15212c.f34714a = xk7Var5;
                        c15212c.f34715b = tseVar5;
                        c15212c.f34716c = bteVar5;
                        c15212c.f34717d = ggeVar4;
                        c15212c.f34718e = obj3;
                        c15212c.f34719f = bteVar7;
                        c15212c.f34720g = i3;
                        c15212c.f34723s = 6;
                        if (((m3g) ggeVar4.f25106a).mo38254h(i3 + 1, obj3, eseVar2, tseVar5, c15212c) == objM51918f) {
                            return objM51918f;
                        }
                        bteVar2 = bteVar7;
                        c15212c2 = c15212c;
                        obj = objM51918f;
                        ggeVar = ggeVar4;
                        xk7Var2 = xk7Var5;
                        tseVar2 = tseVar5;
                        i3++;
                        ggeVar.f25106a = (m3g) ggeVar.f25106a;
                        Object obj42 = ggeVar.f25106a;
                        vre.C17665a c17665a22 = vre.f50797b;
                        c15212c2.f34714a = xk7Var2;
                        c15212c2.f34715b = tseVar2;
                        c15212c2.f34716c = bteVar2;
                        c15212c2.f34717d = ggeVar;
                        c15212c2.f34718e = null;
                        c15212c2.f34719f = null;
                        c15212c2.f34720g = i3;
                        c15212c2.f34723s = 1;
                        objMo19784c = xk7Var2.invoke(c15212c2);
                        if (objMo19784c == obj) {
                        }
                    } catch (dse e) {
                        e = e;
                        ((m3g) ggeVar4.f25106a).m38258n(e, i3, vre.m53350a(obj3));
                        throw new qe9();
                    } catch (Throwable th3) {
                        th = th3;
                        C15212c c15212c3 = c15212c;
                        Throwable th4 = th;
                        c15212c3.f34714a = th4;
                        c15212c3.f34715b = null;
                        c15212c3.f34716c = null;
                        c15212c3.f34717d = null;
                        c15212c3.f34718e = null;
                        c15212c3.f34719f = null;
                        c15212c3.f34723s = 7;
                        if (bteVar5.mo19783b(c15212c3) == objM51918f) {
                            return objM51918f;
                        }
                        throw th4;
                    }
                    obj3 = obj2;
                    ggeVar4 = ggeVar3;
                    bteVar5 = bteVar4;
                    eseVar2 = eseVar;
                    xk7Var5 = xk7Var4;
                    tseVar5 = tseVar4;
                case 1:
                    i3 = c15212c.f34720g;
                    ggeVar2 = (gge) c15212c.f34717d;
                    bteVar3 = (bte) c15212c.f34716c;
                    tseVar3 = (tse) c15212c.f34715b;
                    xk7Var3 = (xk7) c15212c.f34714a;
                    try {
                        wre.m54934b(objMo19784c);
                    } catch (Throwable th5) {
                        th = th5;
                        vre.C17665a c17665a3 = vre.f50797b;
                        objM53351b = vre.m53351b(wre.m54933a(th));
                        bte bteVar622 = bteVar3;
                        obj2 = objM53351b;
                        tse tseVar622 = tseVar3;
                        ggeVar3 = ggeVar2;
                        xk7 xk7Var622 = xk7Var3;
                        bteVar4 = bteVar622;
                        Throwable thM53354e22 = vre.m53354e(obj2);
                        if (!(thM53354e22 instanceof CancellationException)) {
                        }
                        if (cancellationException == null) {
                        }
                    }
                    objM53351b = vre.m53351b(objMo19784c);
                    bte bteVar6222 = bteVar3;
                    obj2 = objM53351b;
                    tse tseVar6222 = tseVar3;
                    ggeVar3 = ggeVar2;
                    xk7 xk7Var6222 = xk7Var3;
                    bteVar4 = bteVar6222;
                    Throwable thM53354e222 = vre.m53354e(obj2);
                    if (!(thM53354e222 instanceof CancellationException)) {
                    }
                    if (cancellationException == null) {
                    }
                    break;
                case 2:
                    i3 = c15212c.f34720g;
                    eseVar = (ese) c15212c.f34719f;
                    obj2 = c15212c.f34718e;
                    ggeVar3 = (gge) c15212c.f34717d;
                    bteVar4 = (bte) c15212c.f34716c;
                    tseVar4 = (tse) c15212c.f34715b;
                    xk7Var4 = (xk7) c15212c.f34714a;
                    wre.m54934b(objMo19784c);
                    if (eseVar instanceof ese.C13256c) {
                    }
                    break;
                case 3:
                    int i4 = c15212c.f34720g;
                    Object obj7 = c15212c.f34716c;
                    wre.m54934b(objMo19784c);
                case 4:
                    i3 = c15212c.f34720g;
                    eseVar = (ese) c15212c.f34719f;
                    obj2 = c15212c.f34718e;
                    ggeVar3 = (gge) c15212c.f34717d;
                    bteVar4 = (bte) c15212c.f34716c;
                    tseVar4 = (tse) c15212c.f34715b;
                    xk7Var4 = (xk7) c15212c.f34714a;
                    wre.m54934b(objMo19784c);
                    fse fseVarM25527a2 = ((ese.C13254a) eseVar).m25527a();
                    c15212c.f34714a = xk7Var4;
                    c15212c.f34715b = tseVar4;
                    c15212c.f34716c = bteVar4;
                    c15212c.f34717d = ggeVar3;
                    c15212c.f34718e = obj2;
                    c15212c.f34719f = eseVar;
                    c15212c.f34720g = i3;
                    c15212c.f34723s = 5;
                    objMo19784c = bteVar4.mo19784c(fseVarM25527a2, c15212c);
                    if (objMo19784c == objM51918f) {
                    }
                    obj3 = obj2;
                    ggeVar4 = ggeVar3;
                    bteVar5 = bteVar4;
                    eseVar2 = eseVar;
                    xk7Var5 = xk7Var4;
                    tseVar5 = tseVar4;
                    bte bteVar72 = (bte) objMo19784c;
                    c15212c.f34714a = xk7Var5;
                    c15212c.f34715b = tseVar5;
                    c15212c.f34716c = bteVar5;
                    c15212c.f34717d = ggeVar4;
                    c15212c.f34718e = obj3;
                    c15212c.f34719f = bteVar72;
                    c15212c.f34720g = i3;
                    c15212c.f34723s = 6;
                    if (((m3g) ggeVar4.f25106a).mo38254h(i3 + 1, obj3, eseVar2, tseVar5, c15212c) == objM51918f) {
                    }
                    break;
                case 5:
                    i3 = c15212c.f34720g;
                    eseVar = (ese) c15212c.f34719f;
                    obj2 = c15212c.f34718e;
                    ggeVar3 = (gge) c15212c.f34717d;
                    bteVar4 = (bte) c15212c.f34716c;
                    tseVar4 = (tse) c15212c.f34715b;
                    xk7Var4 = (xk7) c15212c.f34714a;
                    wre.m54934b(objMo19784c);
                    obj3 = obj2;
                    ggeVar4 = ggeVar3;
                    bteVar5 = bteVar4;
                    eseVar2 = eseVar;
                    xk7Var5 = xk7Var4;
                    tseVar5 = tseVar4;
                    bte bteVar722 = (bte) objMo19784c;
                    c15212c.f34714a = xk7Var5;
                    c15212c.f34715b = tseVar5;
                    c15212c.f34716c = bteVar5;
                    c15212c.f34717d = ggeVar4;
                    c15212c.f34718e = obj3;
                    c15212c.f34719f = bteVar722;
                    c15212c.f34720g = i3;
                    c15212c.f34723s = 6;
                    if (((m3g) ggeVar4.f25106a).mo38254h(i3 + 1, obj3, eseVar2, tseVar5, c15212c) == objM51918f) {
                    }
                    break;
                case 6:
                    i3 = c15212c.f34720g;
                    bteVar2 = (bte) c15212c.f34719f;
                    Object obj8 = c15212c.f34718e;
                    gge ggeVar8 = (gge) c15212c.f34717d;
                    tse tseVar7 = (tse) c15212c.f34715b;
                    xk7 xk7Var7 = (xk7) c15212c.f34714a;
                    wre.m54934b(objMo19784c);
                    c15212c2 = c15212c;
                    ggeVar = ggeVar8;
                    xk7Var2 = xk7Var7;
                    obj = objM51918f;
                    tseVar2 = tseVar7;
                    i3++;
                    ggeVar.f25106a = (m3g) ggeVar.f25106a;
                    Object obj422 = ggeVar.f25106a;
                    vre.C17665a c17665a222 = vre.f50797b;
                    c15212c2.f34714a = xk7Var2;
                    c15212c2.f34715b = tseVar2;
                    c15212c2.f34716c = bteVar2;
                    c15212c2.f34717d = ggeVar;
                    c15212c2.f34718e = null;
                    c15212c2.f34719f = null;
                    c15212c2.f34720g = i3;
                    c15212c2.f34723s = 1;
                    objMo19784c = xk7Var2.invoke(c15212c2);
                    if (objMo19784c == obj) {
                    }
                    break;
                case 7:
                    Throwable th6 = (Throwable) c15212c.f34714a;
                    wre.m54934b(objMo19784c);
                    throw th6;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (dse e2) {
            e = e2;
        } catch (Throwable th7) {
            th = th7;
        }
    }

    @Override // p001o.vse
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public C15211b getConfig() {
        return this.f34706a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m38257m(bte bteVar, int i, Object obj, n64 n64Var) {
        C15214e c15214e;
        if (n64Var instanceof C15214e) {
            c15214e = (C15214e) n64Var;
            int i2 = c15214e.f34735e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c15214e.f34735e = i2 - Integer.MIN_VALUE;
            } else {
                c15214e = new C15214e(n64Var);
            }
        }
        Object obj2 = c15214e.f34733c;
        Object objM51918f = uq8.m51918f();
        int i3 = c15214e.f34735e;
        if (i3 == 0) {
            wre.m54934b(obj2);
            c15214e.f34732b = obj;
            c15214e.f34731a = i;
            c15214e.f34735e = 1;
            if (bteVar.mo19782a(c15214e) == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c15214e.f34731a;
            obj = c15214e.f34732b;
            wre.m54934b(obj2);
        }
        Object obj3 = vre.m53356g(obj) ? null : obj;
        if (obj3 != null) {
            return new zfc.C18630b(i, obj3);
        }
        Throwable thM53354e = vre.m53354e(obj);
        sq8.m48646e(thM53354e);
        return new zfc.C18629a(i, thM53354e);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Void m38258n(Throwable th, int i, vre vreVar) throws Throwable {
        Object obj;
        Throwable thM53354e = vreVar != null ? vre.m53354e(vreVar.m53359j()) : null;
        if (thM53354e != null) {
            throw thM53354e;
        }
        String message = th.getMessage();
        sq8.m48646e(message);
        if (vreVar != null) {
            Object objM53359j = vreVar.m53359j();
            obj = vre.m53356g(objM53359j) ? null : objM53359j;
        }
        throw new jrh(message, th, i, obj, vreVar != null ? vre.m53354e(vreVar.m53359j()) : null);
    }

    /* renamed from: o */
    public final Void m38259o(int i, Object obj) throws Throwable {
        Throwable thM53354e = vre.m53354e(obj);
        if (thM53354e != null) {
            throw thM53354e;
        }
        if (vre.m53356g(obj)) {
            obj = null;
        }
        throw new hse("The operation resulted in a non-retryable failure", null, i, obj);
    }

    /* renamed from: p */
    public final Void m38260p(int i, Object obj) throws Throwable {
        Throwable thM53354e = vre.m53354e(obj);
        if (thM53354e != null) {
            throw thM53354e;
        }
        throw new jrh("Took more than " + getConfig().mo38265b() + " attempts to get a successful response", null, i, vre.m53356g(obj) ? null : obj, vre.m53354e(obj));
    }

    public /* synthetic */ m3g(C15211b c15211b, int i, id5 id5Var) {
        this((i & 1) != 0 ? C15211b.f34707d.m38278a() : c15211b);
    }
}
