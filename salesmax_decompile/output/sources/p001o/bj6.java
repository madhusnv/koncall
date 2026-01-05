package p001o;

import p001o.zi6;

/* loaded from: classes3.dex */
public abstract class bj6 {

    /* renamed from: a */
    public static final nl7 f16431a;

    /* renamed from: b */
    public static final nl7 f16432b;

    /* renamed from: c */
    public static final nl7 f16433c;

    /* renamed from: d */
    public static final nl7 f16434d;

    /* renamed from: o.bj6$a */
    public /* synthetic */ class C12441a extends dm7 implements xk7 {

        /* renamed from: a */
        public static final C12441a f16435a = new C12441a();

        public C12441a() {
            super(1, v8g.class, "toBoolean", "toBoolean(Ljava/lang/String;)Z", 1);
        }

        @Override // p001o.xk7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(String str) {
            sq8.m48649h(str, "p0");
            return Boolean.valueOf(Boolean.parseBoolean(str));
        }
    }

    /* renamed from: o.bj6$b */
    public /* synthetic */ class C12442b extends dm7 implements xk7 {

        /* renamed from: a */
        public static final C12442b f16436a = new C12442b();

        public C12442b() {
            super(1, v8g.class, "toInt", "toInt(Ljava/lang/String;)I", 1);
        }

        @Override // p001o.xk7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(String str) {
            sq8.m48649h(str, "p0");
            return Integer.valueOf(Integer.parseInt(str));
        }
    }

    /* renamed from: o.bj6$c */
    public /* synthetic */ class C12443c extends dm7 implements xk7 {

        /* renamed from: a */
        public static final C12443c f16437a = new C12443c();

        public C12443c() {
            super(1, v8g.class, "toLong", "toLong(Ljava/lang/String;)J", 1);
        }

        @Override // p001o.xk7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Long invoke(String str) {
            sq8.m48649h(str, "p0");
            return Long.valueOf(Long.parseLong(str));
        }
    }

    static {
        zi6.C18651a c18651a = zi6.f57249e;
        f16431a = c18651a.m59497b(C12441a.f16435a);
        f16432b = c18651a.m59497b(C12442b.f16436a);
        f16433c = c18651a.m59497b(C12443c.f16437a);
        f16434d = c18651a.m59497b(new xk7() { // from class: o.aj6
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return bj6.m19239h((String) obj);
            }
        });
    }

    /* renamed from: b */
    public static final nl7 m19233b() {
        return f16431a;
    }

    /* renamed from: c */
    public static final nl7 m19234c() {
        return f16432b;
    }

    /* renamed from: d */
    public static final nl7 m19235d() {
        return f16433c;
    }

    /* renamed from: e */
    public static final nl7 m19236e() {
        return f16434d;
    }

    /* renamed from: f */
    public static final Object m19237f(zi6 zi6Var, f9d f9dVar) {
        Object objInvoke;
        sq8.m48649h(zi6Var, "<this>");
        sq8.m48649h(f9dVar, "platform");
        String strMo26796e = f9dVar.mo26796e(zi6Var.m59493f());
        if (strMo26796e == null) {
            strMo26796e = f9dVar.mo26798i(zi6Var.m59491d());
        }
        return (strMo26796e == null || (objInvoke = zi6Var.m59492e().invoke(strMo26796e)) == null) ? zi6Var.m59490c() : objInvoke;
    }

    /* renamed from: g */
    public static /* synthetic */ Object m19238g(zi6 zi6Var, f9d f9dVar, int i, Object obj) {
        if ((i & 1) != 0) {
            f9dVar = r9d.f43250a.m46382a();
        }
        return m19237f(zi6Var, f9dVar);
    }

    /* renamed from: h */
    public static final String m19239h(String str) {
        sq8.m48649h(str, "it");
        return str;
    }
}
