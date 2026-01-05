package p001o;

import java.io.Closeable;
import p001o.c2g;
import p001o.hb3;
import p001o.k16;
import p001o.sa4;
import p001o.vre;

/* loaded from: classes2.dex */
public final class p2g implements nb8 {

    /* renamed from: a */
    public final String f39214a;

    /* renamed from: b */
    public final String f39215b;

    /* renamed from: c */
    public final String f39216c;

    /* renamed from: d */
    public final long f39217d;

    /* renamed from: e */
    public final t18 f39218e;

    /* renamed from: f */
    public final r9d f39219f;

    /* renamed from: g */
    public final hb3 f39220g;

    /* renamed from: h */
    public final fuf f39221h;

    /* renamed from: o.p2g$a */
    public static final class C15943a extends o64 {

        /* renamed from: a */
        public Object f39222a;

        /* renamed from: b */
        public Object f39223b;

        /* renamed from: c */
        public Object f39224c;

        /* renamed from: d */
        public /* synthetic */ Object f39225d;

        /* renamed from: f */
        public int f39227f;

        public C15943a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f39225d = obj;
            this.f39227f |= Integer.MIN_VALUE;
            return p2g.this.m42913l(null, this);
        }
    }

    /* renamed from: o.p2g$b */
    public static final class C15944b extends o64 {

        /* renamed from: a */
        public Object f39228a;

        /* renamed from: b */
        public /* synthetic */ Object f39229b;

        /* renamed from: d */
        public int f39231d;

        public C15944b(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f39229b = obj;
            this.f39231d |= Integer.MIN_VALUE;
            return p2g.this.m42914p(null, this);
        }
    }

    /* renamed from: o.p2g$c */
    public static final class C15945c extends o64 {

        /* renamed from: a */
        public Object f39232a;

        /* renamed from: b */
        public Object f39233b;

        /* renamed from: c */
        public Object f39234c;

        /* renamed from: d */
        public int f39235d;

        /* renamed from: e */
        public /* synthetic */ Object f39236e;

        /* renamed from: g */
        public int f39238g;

        public C15945c(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f39236e = obj;
            this.f39238g |= Integer.MIN_VALUE;
            return p2g.this.m42915s(null, this);
        }
    }

    /* renamed from: o.p2g$d */
    public static final class C15946d extends jgg implements xk7 {

        /* renamed from: a */
        public int f39239a;

        /* renamed from: c */
        public final /* synthetic */ qx0 f39241c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15946d(qx0 qx0Var, n64 n64Var) {
            super(1, n64Var);
            this.f39241c = qx0Var;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return p2g.this.new C15946d(this.f39241c, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f39239a;
            if (i == 0) {
                wre.m54934b(obj);
                p2g p2gVar = p2g.this;
                qx0 qx0Var = this.f39241c;
                this.f39239a = 1;
                obj = p2gVar.m42914p(qx0Var, this);
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
            return ((C15946d) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: o.p2g$e */
    public static final class C15947e extends o64 {

        /* renamed from: a */
        public Object f39242a;

        /* renamed from: b */
        public /* synthetic */ Object f39243b;

        /* renamed from: d */
        public int f39245d;

        public C15947e(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f39243b = obj;
            this.f39245d |= Integer.MIN_VALUE;
            return p2g.this.m42917w(null, this);
        }
    }

    public /* synthetic */ p2g(String str, String str2, String str3, long j, t18 t18Var, r9d r9dVar, hb3 hb3Var, id5 id5Var) {
        this(str, str2, str3, j, t18Var, r9dVar, hb3Var);
    }

    /* renamed from: m */
    public static final String m42905m(p2g p2gVar) {
        return "attempting to refresh token for sso-session: " + p2gVar.f39214a;
    }

    /* renamed from: n */
    public static final String m42906n() {
        return "token refresh failed";
    }

    /* renamed from: o */
    public static final String m42907o(h2g h2gVar, p2g p2gVar) {
        return "refresh token failed, original token is still valid until " + h2gVar.mo29762c() + " for sso-session: " + p2gVar.f39214a + ", re-using";
    }

    /* renamed from: q */
    public static final String m42908q(p2g p2gVar) {
        return "using cached token for sso-session: " + p2gVar.f39214a;
    }

    /* renamed from: r */
    public static final String m42909r(h2g h2gVar, p2g p2gVar) {
        return "cached token is not refreshable but still valid until " + h2gVar.mo29762c() + " for sso-session: " + p2gVar.f39214a;
    }

    /* renamed from: t */
    public static final y3i m42910t(p2g p2gVar, vdh vdhVar, c2g.C12539c.a aVar) {
        sq8.m48649h(aVar, "$this$fromEnvironment");
        aVar.mo20132h(p2gVar.f39216c);
        aVar.mo20126b(p2gVar.f39218e);
        aVar.m20150z(vdhVar);
        return y3i.f54824a;
    }

    /* renamed from: v */
    public static /* synthetic */ Void m42911v(p2g p2gVar, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        return p2gVar.m42916u(th);
    }

    /* renamed from: x */
    public static final String m42912x(String str) {
        return "failed to write refreshed token back to disk at " + str;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m42913l(h2g h2gVar, n64 n64Var) {
        C15943a c15943a;
        final p2g p2gVar;
        Object objM53351b;
        final h2g h2gVar2;
        Object obj;
        h2g h2gVar3;
        Throwable thM53354e;
        if (n64Var instanceof C15943a) {
            c15943a = (C15943a) n64Var;
            int i = c15943a.f39227f;
            if ((i & Integer.MIN_VALUE) != 0) {
                c15943a.f39227f = i - Integer.MIN_VALUE;
            } else {
                c15943a = new C15943a(n64Var);
            }
        }
        Object objM42915s = c15943a.f39225d;
        Object objM51918f = uq8.m51918f();
        int i2 = c15943a.f39227f;
        if (i2 == 0) {
            wre.m54934b(objM42915s);
            q74 context = c15943a.getContext();
            uk7 uk7Var = new uk7() { // from class: o.k2g
                @Override // p001o.uk7
                public final Object invoke() {
                    return p2g.m42905m(this.f31403a);
                }
            };
            fja fjaVar = fja.Debug;
            String strMo26336c = kge.m35689b(p2g.class).mo26336c();
            if (strMo26336c == null) {
                throw new IllegalArgumentException("log<T> cannot be used on an anonymous object".toString());
            }
            v74.m52399d(context, fjaVar, strMo26336c, null, uk7Var);
            try {
                vre.C17665a c17665a = vre.f50797b;
                c15943a.f39222a = this;
                c15943a.f39223b = h2gVar;
                c15943a.f39227f = 1;
                objM42915s = m42915s(h2gVar, c15943a);
                if (objM42915s == objM51918f) {
                    return objM51918f;
                }
                p2gVar = this;
            } catch (Throwable th) {
                th = th;
                p2gVar = this;
                vre.C17665a c17665a2 = vre.f50797b;
                objM53351b = vre.m53351b(wre.m54933a(th));
                Object obj2 = objM53351b;
                h2gVar2 = h2gVar;
                obj = obj2;
                if (vre.m53357h(obj)) {
                }
                thM53354e = vre.m53354e(obj);
                if (thM53354e != null) {
                }
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = c15943a.f39224c;
                h2gVar3 = (h2g) c15943a.f39223b;
                p2gVar = (p2g) c15943a.f39222a;
                wre.m54934b(objM42915s);
                h2gVar2 = h2gVar3;
                thM53354e = vre.m53354e(obj);
                if (thM53354e != null) {
                    return obj;
                }
                if (p2gVar.f39220g.mo30148a().compareTo(h2gVar2.mo29762c()) < 0) {
                    q74 context2 = c15943a.getContext();
                    uk7 uk7Var2 = new uk7() { // from class: o.m2g
                        @Override // p001o.uk7
                        public final Object invoke() {
                            return p2g.m42907o(h2gVar2, p2gVar);
                        }
                    };
                    fja fjaVar2 = fja.Debug;
                    String strMo26336c2 = kge.m35689b(p2g.class).mo26336c();
                    if (strMo26336c2 == null) {
                        throw new IllegalArgumentException("log<T> cannot be used on an anonymous object".toString());
                    }
                    v74.m52399d(context2, fjaVar2, strMo26336c2, null, uk7Var2);
                    return h2gVar2;
                }
                q74 context3 = c15943a.getContext();
                uk7 uk7Var3 = new uk7() { // from class: o.l2g
                    @Override // p001o.uk7
                    public final Object invoke() {
                        return p2g.m42906n();
                    }
                };
                fja fjaVar3 = fja.Error;
                String strMo26336c3 = kge.m35689b(p2g.class).mo26336c();
                if (strMo26336c3 == null) {
                    throw new IllegalArgumentException("log<T> cannot be used on an anonymous object".toString());
                }
                v74.m52399d(context3, fjaVar3, strMo26336c3, thM53354e, uk7Var3);
                p2gVar.m42916u(thM53354e);
                throw new qe9();
            }
            h2gVar = (h2g) c15943a.f39223b;
            p2gVar = (p2g) c15943a.f39222a;
            try {
                wre.m54934b(objM42915s);
            } catch (Throwable th2) {
                th = th2;
                vre.C17665a c17665a22 = vre.f50797b;
                objM53351b = vre.m53351b(wre.m54933a(th));
                Object obj22 = objM53351b;
                h2gVar2 = h2gVar;
                obj = obj22;
                if (vre.m53357h(obj)) {
                }
                thM53354e = vre.m53354e(obj);
                if (thM53354e != null) {
                }
            }
        }
        objM53351b = vre.m53351b((h2g) objM42915s);
        Object obj222 = objM53351b;
        h2gVar2 = h2gVar;
        obj = obj222;
        if (vre.m53357h(obj)) {
            c15943a.f39222a = p2gVar;
            c15943a.f39223b = h2gVar2;
            c15943a.f39224c = obj;
            c15943a.f39227f = 2;
            if (p2gVar.m42917w((h2g) obj, c15943a) == objM51918f) {
                return objM51918f;
            }
            h2gVar3 = h2gVar2;
            h2gVar2 = h2gVar3;
        }
        thM53354e = vre.m53354e(obj);
        if (thM53354e != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m42914p(qx0 qx0Var, n64 n64Var) {
        C15944b c15944b;
        final p2g p2gVar;
        if (n64Var instanceof C15944b) {
            c15944b = (C15944b) n64Var;
            int i = c15944b.f39231d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c15944b.f39231d = i - Integer.MIN_VALUE;
            } else {
                c15944b = new C15944b(n64Var);
            }
        }
        Object objM44751g = c15944b.f39229b;
        Object objM51918f = uq8.m51918f();
        int i2 = c15944b.f39231d;
        if (i2 == 0) {
            wre.m54934b(objM44751g);
            String str = this.f39214a;
            r9d r9dVar = this.f39219f;
            c15944b.f39228a = this;
            c15944b.f39231d = 1;
            objM44751g = q2g.m44751g(str, r9dVar, c15944b);
            if (objM44751g == objM51918f) {
                return objM51918f;
            }
            p2gVar = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    wre.m54934b(objM44751g);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p2gVar = (p2g) c15944b.f39228a;
            wre.m54934b(objM44751g);
        }
        final h2g h2gVar = (h2g) objM44751g;
        if (p2gVar.f39220g.mo30148a().compareTo(h2gVar.mo29762c().m28955j(p2gVar.f39217d)) < 0) {
            q74 context = c15944b.getContext();
            uk7 uk7Var = new uk7() { // from class: o.i2g
                @Override // p001o.uk7
                public final Object invoke() {
                    return p2g.m42908q(this.f27971a);
                }
            };
            fja fjaVar = fja.Debug;
            String strMo26336c = kge.m35689b(p2g.class).mo26336c();
            if (strMo26336c == null) {
                throw new IllegalArgumentException("log<T> cannot be used on an anonymous object".toString());
            }
            v74.m52399d(context, fjaVar, strMo26336c, null, uk7Var);
            return h2gVar;
        }
        if (q2g.m44750f(h2gVar)) {
            c15944b.f39228a = null;
            c15944b.f39231d = 2;
            objM44751g = p2gVar.m42913l(h2gVar, c15944b);
            return objM44751g == objM51918f ? objM51918f : objM44751g;
        }
        if (!(p2gVar.f39220g.mo30148a().compareTo(h2gVar.mo29762c()) < 0)) {
            h2gVar = null;
        }
        if (h2gVar == null) {
            m42911v(p2gVar, null, 1, null);
            throw new qe9();
        }
        q74 context2 = c15944b.getContext();
        uk7 uk7Var2 = new uk7() { // from class: o.j2g
            @Override // p001o.uk7
            public final Object invoke() {
                return p2g.m42909r(h2gVar, p2gVar);
            }
        };
        fja fjaVar2 = fja.Debug;
        String strMo26336c2 = kge.m35689b(p2g.class).mo26336c();
        if (strMo26336c2 == null) {
            throw new IllegalArgumentException("log<T> cannot be used on an anonymous object".toString());
        }
        v74.m52399d(context2, fjaVar2, strMo26336c2, null, uk7Var2);
        return h2gVar;
    }

    @Override // p001o.nb8
    public Object resolve(qx0 qx0Var, n64 n64Var) {
        return this.f39221h.m27524a(new C15946d(qx0Var, null), n64Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m42915s(h2g h2gVar, n64 n64Var) throws Throwable {
        C15945c c15945c;
        p2g p2gVar;
        Closeable closeable;
        Throwable th;
        Closeable closeable2;
        h2g h2gVar2;
        p2g p2gVar2;
        if (n64Var instanceof C15945c) {
            c15945c = (C15945c) n64Var;
            int i = c15945c.f39238g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c15945c.f39238g = i - Integer.MIN_VALUE;
            } else {
                c15945c = new C15945c(n64Var);
            }
        }
        Object objM47891g = c15945c.f39236e;
        Object objM51918f = uq8.m51918f();
        int i2 = c15945c.f39238g;
        try {
            if (i2 == 0) {
                wre.m54934b(objM47891g);
                final vdh vdhVarM56098a = xdh.m56098a(c15945c.getContext());
                c2g.C12538b c12538b = c2g.c0;
                xk7 xk7Var = new xk7() { // from class: o.n2g
                    @Override // p001o.xk7
                    public final Object invoke(Object obj) {
                        return p2g.m42910t(this.f36283a, vdhVarM56098a, (c2g.C12539c.a) obj);
                    }
                };
                c15945c.f39232a = this;
                c15945c.f39233b = h2gVar;
                c15945c.f39238g = 1;
                objM47891g = c12538b.m47891g(xk7Var, c15945c);
                if (objM47891g == objM51918f) {
                    return objM51918f;
                }
                p2gVar = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    closeable2 = (Closeable) c15945c.f39234c;
                    h2gVar2 = (h2g) c15945c.f39233b;
                    p2gVar2 = (p2g) c15945c.f39232a;
                    try {
                        wre.m54934b(objM47891g);
                        h2g h2gVarM44753i = q2g.m44753i((ta4) objM47891g, h2gVar2, p2gVar2.f39220g);
                        closeable2.close();
                        return h2gVarM44753i;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            closeable2.close();
                        } catch (Throwable th3) {
                            cl6.m21376a(th, th3);
                        }
                        throw th;
                    }
                }
                h2gVar = (h2g) c15945c.f39233b;
                p2gVar = (p2g) c15945c.f39232a;
                wre.m54934b(objM47891g);
            }
            sa4.C16791a c16791a = new sa4.C16791a();
            c16791a.m48089k(h2gVar.m29764g());
            c16791a.m48090l(h2gVar.m29765h());
            c16791a.m48092n(h2gVar.m29766i());
            c16791a.m48091m("refresh_token");
            sa4 sa4VarM48079a = c16791a.m48079a();
            c15945c.f39232a = p2gVar;
            c15945c.f39233b = h2gVar;
            c15945c.f39234c = closeable;
            c15945c.f39235d = 0;
            c15945c.f39238g = 2;
            Object objE2 = ((c2g) closeable).E2(sa4VarM48079a, c15945c);
            if (objE2 == objM51918f) {
                return objM51918f;
            }
            h2gVar2 = h2gVar;
            closeable2 = closeable;
            objM47891g = objE2;
            p2gVar2 = p2gVar;
            h2g h2gVarM44753i2 = q2g.m44753i((ta4) objM47891g, h2gVar2, p2gVar2.f39220g);
            closeable2.close();
            return h2gVarM44753i2;
        } catch (Throwable th4) {
            th = th4;
            closeable2 = closeable;
            closeable2.close();
            throw th;
        }
        closeable = (Closeable) objM47891g;
    }

    /* renamed from: u */
    public final Void m42916u(Throwable th) {
        throw new av8("SSO token for sso-session: " + this.f39214a + " is expired", th);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m42917w(h2g h2gVar, n64 n64Var) {
        C15947e c15947e;
        Exception e;
        final String str;
        String strMo26336c;
        if (n64Var instanceof C15947e) {
            c15947e = (C15947e) n64Var;
            int i = c15947e.f39245d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c15947e.f39245d = i - Integer.MIN_VALUE;
            } else {
                c15947e = new C15947e(n64Var);
            }
        }
        Object obj = c15947e.f39243b;
        Object objM51918f = uq8.m51918f();
        int i2 = c15947e.f39245d;
        if (i2 == 0) {
            wre.m54934b(obj);
            String strM40196f = n71.m40196f(q2g.m44748d(this.f39219f, "~", ".aws", "sso", "cache", q2g.m44749e(this.f39214a)), this.f39219f);
            try {
                byte[] bArrM44752h = q2g.m44752h(h2gVar);
                r9d r9dVar = this.f39219f;
                c15947e.f39242a = strM40196f;
                c15947e.f39245d = 1;
                if (r9dVar.mo18077f(strM40196f, bArrM44752h, c15947e) == objM51918f) {
                    return objM51918f;
                }
            } catch (Exception e2) {
                e = e2;
                str = strM40196f;
                q74 context = c15947e.getContext();
                uk7 uk7Var = new uk7() { // from class: o.o2g
                    @Override // p001o.uk7
                    public final Object invoke() {
                        return p2g.m42912x(str);
                    }
                };
                fja fjaVar = fja.Debug;
                strMo26336c = kge.m35689b(p2g.class).mo26336c();
                if (strMo26336c != null) {
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) c15947e.f39242a;
            try {
                wre.m54934b(obj);
            } catch (Exception e3) {
                e = e3;
                q74 context2 = c15947e.getContext();
                uk7 uk7Var2 = new uk7() { // from class: o.o2g
                    @Override // p001o.uk7
                    public final Object invoke() {
                        return p2g.m42912x(str);
                    }
                };
                fja fjaVar2 = fja.Debug;
                strMo26336c = kge.m35689b(p2g.class).mo26336c();
                if (strMo26336c != null) {
                    throw new IllegalArgumentException("log<T> cannot be used on an anonymous object".toString());
                }
                v74.m52399d(context2, fjaVar2, strMo26336c, e, uk7Var2);
                return y3i.f54824a;
            }
        }
        return y3i.f54824a;
    }

    public p2g(String str, String str2, String str3, long j, t18 t18Var, r9d r9dVar, hb3 hb3Var) {
        sq8.m48649h(str, "ssoSessionName");
        sq8.m48649h(str2, "startUrl");
        sq8.m48649h(str3, "ssoRegion");
        sq8.m48649h(r9dVar, "platformProvider");
        sq8.m48649h(hb3Var, "clock");
        this.f39214a = str;
        this.f39215b = str2;
        this.f39216c = str3;
        this.f39217d = j;
        this.f39218e = t18Var;
        this.f39219f = r9dVar;
        this.f39220g = hb3Var;
        this.f39221h = new fuf();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ p2g(String str, String str2, String str3, long j, t18 t18Var, r9d r9dVar, hb3 hb3Var, int i, id5 id5Var) {
        long jM38175s;
        if ((i & 8) != 0) {
            k16.C14700a c14700a = k16.f31358b;
            jM38175s = m16.m38175s(300, o16.SECONDS);
        } else {
            jM38175s = j;
        }
        this(str, str2, str3, jM38175s, (i & 16) != 0 ? null : t18Var, (i & 32) != 0 ? r9d.f43250a.m46382a() : r9dVar, (i & 64) != 0 ? hb3.C13904a.f26578a : hb3Var, null);
    }
}
