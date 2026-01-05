package p001o;

import p001o.gr7;
import p001o.hb3;
import p001o.q1g;
import p001o.qja;

/* loaded from: classes2.dex */
public final class u1g implements qc4 {

    /* renamed from: a */
    public final String f48182a;

    /* renamed from: b */
    public final String f48183b;

    /* renamed from: c */
    public final String f48184c;

    /* renamed from: d */
    public final String f48185d;

    /* renamed from: e */
    public final String f48186e;

    /* renamed from: f */
    public final t18 f48187f;

    /* renamed from: g */
    public final r9d f48188g;

    /* renamed from: h */
    public final hb3 f48189h;

    /* renamed from: q */
    public final p2g f48190q;

    /* renamed from: o.u1g$a */
    public static final class C17283a extends o64 {

        /* renamed from: a */
        public Object f48191a;

        /* renamed from: b */
        public /* synthetic */ Object f48192b;

        /* renamed from: d */
        public int f48194d;

        public C17283a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f48192b = obj;
            this.f48194d |= Integer.MIN_VALUE;
            return u1g.this.m50863g(this);
        }
    }

    /* renamed from: o.u1g$b */
    public static final class C17284b extends o64 {

        /* renamed from: a */
        public Object f48195a;

        /* renamed from: b */
        public Object f48196b;

        /* renamed from: c */
        public /* synthetic */ Object f48197c;

        /* renamed from: e */
        public int f48199e;

        public C17284b(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f48197c = obj;
            this.f48199e |= Integer.MIN_VALUE;
            return u1g.this.resolve(null, this);
        }
    }

    public u1g(String str, String str2, String str3, String str4, String str5, t18 t18Var, r9d r9dVar, hb3 hb3Var) {
        sq8.m48649h(str, "accountId");
        sq8.m48649h(str2, "roleName");
        sq8.m48649h(str3, "startUrl");
        sq8.m48649h(str4, "ssoRegion");
        sq8.m48649h(r9dVar, "platformProvider");
        sq8.m48649h(hb3Var, "clock");
        this.f48182a = str;
        this.f48183b = str2;
        this.f48184c = str3;
        this.f48185d = str4;
        this.f48186e = str5;
        this.f48187f = t18Var;
        this.f48188g = r9dVar;
        this.f48189h = hb3Var;
        this.f48190q = str5 != null ? new p2g(str5, str3, str4, 0L, t18Var, r9dVar, hb3Var, 8, null) : null;
    }

    /* renamed from: h */
    public static final String m50858h(u1g u1gVar) {
        return "Attempting to load token using token provider for sso-session: `" + u1gVar.f48186e + '`';
    }

    /* renamed from: i */
    public static final String m50859i() {
        return "Attempting to load token from file using legacy format";
    }

    /* renamed from: j */
    public static final y3i m50860j(u1g u1gVar, vdh vdhVar, qx0 qx0Var, q1g.C16272c.a aVar) {
        sq8.m48649h(aVar, "$this$fromEnvironment");
        aVar.mo20132h(u1gVar.f48185d);
        aVar.mo20126b(u1gVar.f48187f);
        aVar.m44735z(vdhVar);
        aVar.mo20136l((gja) qx0Var.mo18191b(e7f.f21127a.m24496c()));
        return y3i.f54824a;
    }

    /* renamed from: e */
    public final String m50861e() {
        return this.f48182a;
    }

    /* renamed from: f */
    public final String m50862f() {
        return this.f48183b;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m50863g(n64 n64Var) {
        C17283a c17283a;
        u1g u1gVar;
        if (n64Var instanceof C17283a) {
            c17283a = (C17283a) n64Var;
            int i = c17283a.f48194d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c17283a.f48194d = i - Integer.MIN_VALUE;
            } else {
                c17283a = new C17283a(n64Var);
            }
        }
        Object objM44751g = c17283a.f48192b;
        Object objM51918f = uq8.m51918f();
        int i2 = c17283a.f48194d;
        if (i2 == 0) {
            wre.m54934b(objM44751g);
            String str = this.f48184c;
            r9d r9dVar = this.f48188g;
            c17283a.f48191a = this;
            c17283a.f48194d = 1;
            objM44751g = q2g.m44751g(str, r9dVar, c17283a);
            if (objM44751g == objM51918f) {
                return objM51918f;
            }
            u1gVar = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u1gVar = (u1g) c17283a.f48191a;
            wre.m54934b(objM44751g);
        }
        h2g h2gVar = (h2g) objM44751g;
        if (u1gVar.f48189h.mo30148a().compareTo(h2gVar.mo29762c()) <= 0) {
            return h2gVar;
        }
        throw new n2e("The SSO session has expired. To refresh this SSO session run `aws sso login` with the corresponding profile.", null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0118 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v2 */
    @Override // p001o.qc4, p001o.nb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object resolve(qx0 qx0Var, n64 n64Var) throws Throwable {
        C17284b c17284b;
        final u1g u1gVar;
        ag1 ag1Var;
        ag1 ag1Var2;
        u1g u1gVar2;
        q1g q1gVar;
        q1g q1gVar2;
        jue jueVarM31005a;
        qx0 qx0Var2 = qx0Var;
        if (n64Var instanceof C17284b) {
            c17284b = (C17284b) n64Var;
            int i = c17284b.f48199e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c17284b.f48199e = i - Integer.MIN_VALUE;
            } else {
                c17284b = new C17284b(n64Var);
            }
        }
        Object objM50863g = c17284b.f48197c;
        ?? M51918f = uq8.m51918f();
        int i2 = c17284b.f48199e;
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (i2 == 0) {
                wre.m54934b(objM50863g);
                q74 context = c17284b.getContext();
                String strMo26336c = kge.m35689b(u1g.class).mo26336c();
                if (strMo26336c == null) {
                    throw new IllegalArgumentException("logger<T> cannot be used on an anonymous object".toString());
                }
                qja qjaVarM52400e = v74.m52400e(context, strMo26336c);
                if (this.f48190q != null) {
                    qja.C16414b.m45550c(qjaVarM52400e, null, new uk7() { // from class: o.r1g
                        @Override // p001o.uk7
                        public final Object invoke() {
                            return u1g.m50858h(this.f42755a);
                        }
                    }, 1, null);
                    p2g p2gVar = this.f48190q;
                    c17284b.f48195a = this;
                    c17284b.f48196b = qx0Var2;
                    c17284b.f48199e = 1;
                    objM50863g = p2gVar.resolve(qx0Var2, c17284b);
                    if (objM50863g == M51918f) {
                        return M51918f;
                    }
                    u1gVar = this;
                    ag1Var = (ag1) objM50863g;
                } else {
                    qja.C16414b.m45550c(qjaVarM52400e, null, new uk7() { // from class: o.s1g
                        @Override // p001o.uk7
                        public final Object invoke() {
                            return u1g.m50859i();
                        }
                    }, 1, null);
                    c17284b.f48195a = this;
                    c17284b.f48196b = qx0Var2;
                    c17284b.f48199e = 2;
                    objM50863g = m50863g(c17284b);
                    if (objM50863g == M51918f) {
                        return M51918f;
                    }
                    u1gVar = this;
                    ag1Var = (ag1) objM50863g;
                }
            } else if (i2 == 1) {
                qx0Var2 = (qx0) c17284b.f48196b;
                u1gVar = (u1g) c17284b.f48195a;
                wre.m54934b(objM50863g);
                ag1Var = (ag1) objM50863g;
            } else if (i2 == 2) {
                qx0Var2 = (qx0) c17284b.f48196b;
                u1gVar = (u1g) c17284b.f48195a;
                wre.m54934b(objM50863g);
                ag1Var = (ag1) objM50863g;
            } else {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q1gVar2 = (q1g) c17284b.f48196b;
                    u1gVar2 = (u1g) c17284b.f48195a;
                    try {
                        wre.m54934b(objM50863g);
                        hr7 hr7Var = (hr7) objM50863g;
                        q1gVar2.close();
                        jueVarM31005a = hr7Var.m31005a();
                        if (jueVarM31005a != null) {
                            throw new sc4("Expected SSO roleCredentials to not be null", null, 2, null);
                        }
                        String strM34526a = jueVarM31005a.m34526a();
                        if (strM34526a == null) {
                            throw new IllegalStateException("Expected accessKeyId in SSO roleCredentials response".toString());
                        }
                        String strM34528c = jueVarM31005a.m34528c();
                        if (strM34528c != null) {
                            return mc4.m38705a(strM34526a, strM34528c, jueVarM31005a.m34529d(), jk8.m33903a(gk8.f25374b, jueVarM31005a.m34527b()), "SSO", u1gVar2.f48182a);
                        }
                        throw new IllegalStateException("Expected secretAccessKey in SSO roleCredentials response".toString());
                    } catch (Exception e) {
                        e = e;
                        throw new pc4("GetRoleCredentials operation failed", e);
                    }
                }
                ag1Var2 = (ag1) c17284b.f48196b;
                u1gVar = (u1g) c17284b.f48195a;
                wre.m54934b(objM50863g);
                Object obj = objM50863g;
                ag1 ag1Var3 = ag1Var2;
                u1gVar2 = u1gVar;
                q1gVar = (q1g) obj;
                gr7.C13818a c13818a = new gr7.C13818a();
                c13818a.m29401f(u1gVar2.m50861e());
                c13818a.m29402g(u1gVar2.m50862f());
                c13818a.m29400e(ag1Var3.getToken());
                gr7 gr7VarM29396a = c13818a.m29396a();
                c17284b.f48195a = u1gVar2;
                c17284b.f48196b = q1gVar;
                c17284b.f48199e = 4;
                objM50863g = q1gVar.W1(gr7VarM29396a, c17284b);
                if (objM50863g != M51918f) {
                    return M51918f;
                }
                q1gVar2 = q1gVar;
                hr7 hr7Var2 = (hr7) objM50863g;
                q1gVar2.close();
                jueVarM31005a = hr7Var2.m31005a();
                if (jueVarM31005a != null) {
                }
            }
            gr7.C13818a c13818a2 = new gr7.C13818a();
            c13818a2.m29401f(u1gVar2.m50861e());
            c13818a2.m29402g(u1gVar2.m50862f());
            c13818a2.m29400e(ag1Var3.getToken());
            gr7 gr7VarM29396a2 = c13818a2.m29396a();
            c17284b.f48195a = u1gVar2;
            c17284b.f48196b = q1gVar;
            c17284b.f48199e = 4;
            objM50863g = q1gVar.W1(gr7VarM29396a2, c17284b);
            if (objM50863g != M51918f) {
            }
        } catch (Exception e2) {
            e = e2;
            throw new pc4("GetRoleCredentials operation failed", e);
        } catch (Throwable th2) {
            th = th2;
            M51918f = q1gVar;
            M51918f.close();
            throw th;
        }
        ag1 ag1Var4 = ag1Var;
        final qx0 qx0Var3 = qx0Var2;
        ag1Var2 = ag1Var4;
        final vdh vdhVarM56098a = xdh.m56098a(c17284b.getContext());
        q1g.C16271b c16271b = q1g.b0;
        xk7 xk7Var = new xk7() { // from class: o.t1g
            @Override // p001o.xk7
            public final Object invoke(Object obj2) {
                return u1g.m50860j(this.f46234a, vdhVarM56098a, qx0Var3, (q1g.C16272c.a) obj2);
            }
        };
        c17284b.f48195a = u1gVar;
        c17284b.f48196b = ag1Var2;
        c17284b.f48199e = 3;
        objM50863g = c16271b.m47891g(xk7Var, c17284b);
        if (objM50863g == M51918f) {
            return M51918f;
        }
        Object obj2 = objM50863g;
        ag1 ag1Var32 = ag1Var2;
        u1gVar2 = u1gVar;
        q1gVar = (q1g) obj2;
    }

    public /* synthetic */ u1g(String str, String str2, String str3, String str4, String str5, t18 t18Var, r9d r9dVar, hb3 hb3Var, int i, id5 id5Var) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : t18Var, (i & 64) != 0 ? r9d.f43250a.m46382a() : r9dVar, (i & 128) != 0 ? hb3.C13904a.f26578a : hb3Var);
    }
}
