package p001o;

import java.util.Map;

/* loaded from: classes3.dex */
public final class wi8 {

    /* renamed from: h */
    public static final C17919b f52197h = new C17919b(null);

    /* renamed from: a */
    public final hc0 f52198a;

    /* renamed from: b */
    public final sz0 f52199b;

    /* renamed from: c */
    public final Map f52200c;

    /* renamed from: d */
    public final String f52201d;

    /* renamed from: e */
    public final Map f52202e;

    /* renamed from: f */
    public final String f52203f;

    /* renamed from: g */
    public final yci f52204g;

    /* renamed from: o.wi8$a */
    public static final class C17918a {

        /* renamed from: a */
        public hc0 f52205a;

        /* renamed from: b */
        public sz0 f52206b;

        /* renamed from: c */
        public Map f52207c;

        /* renamed from: d */
        public String f52208d;

        /* renamed from: e */
        public Map f52209e;

        /* renamed from: f */
        public String f52210f;

        /* renamed from: g */
        public yci f52211g;

        /* renamed from: a */
        public final void m54582a(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            this.f52205a = hc0.f26603b.m30167a(xk7Var);
        }

        /* renamed from: b */
        public final wi8 m54583b() {
            return new wi8(this, null);
        }

        /* renamed from: c */
        public final hc0 m54584c() {
            return this.f52205a;
        }

        /* renamed from: d */
        public final sz0 m54585d() {
            return this.f52206b;
        }

        /* renamed from: e */
        public final Map m54586e() {
            return this.f52207c;
        }

        /* renamed from: f */
        public final String m54587f() {
            return this.f52208d;
        }

        /* renamed from: g */
        public final Map m54588g() {
            return this.f52209e;
        }

        /* renamed from: h */
        public final String m54589h() {
            return this.f52210f;
        }

        /* renamed from: i */
        public final yci m54590i() {
            return this.f52211g;
        }

        /* renamed from: j */
        public final void m54591j(sz0 sz0Var) {
            this.f52206b = sz0Var;
        }

        /* renamed from: k */
        public final void m54592k(Map map) {
            this.f52207c = map;
        }

        /* renamed from: l */
        public final void m54593l(String str) {
            this.f52208d = str;
        }

        /* renamed from: m */
        public final void m54594m(Map map) {
            this.f52209e = map;
        }

        /* renamed from: n */
        public final void m54595n(String str) {
            this.f52210f = str;
        }

        /* renamed from: o */
        public final void m54596o(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            this.f52211g = yci.f55272c.m57613a(xk7Var);
        }
    }

    /* renamed from: o.wi8$b */
    public static final class C17919b {
        public C17919b() {
        }

        public /* synthetic */ C17919b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ wi8(C17918a c17918a, id5 id5Var) {
        this(c17918a);
    }

    /* renamed from: a */
    public final hc0 m54575a() {
        return this.f52198a;
    }

    /* renamed from: b */
    public final sz0 m54576b() {
        return this.f52199b;
    }

    /* renamed from: c */
    public final Map m54577c() {
        return this.f52200c;
    }

    /* renamed from: d */
    public final String m54578d() {
        return this.f52201d;
    }

    /* renamed from: e */
    public final Map m54579e() {
        return this.f52202e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wi8.class != obj.getClass()) {
            return false;
        }
        wi8 wi8Var = (wi8) obj;
        return sq8.m48644c(this.f52198a, wi8Var.f52198a) && sq8.m48644c(this.f52199b, wi8Var.f52199b) && sq8.m48644c(this.f52200c, wi8Var.f52200c) && sq8.m48644c(this.f52201d, wi8Var.f52201d) && sq8.m48644c(this.f52202e, wi8Var.f52202e) && sq8.m48644c(this.f52203f, wi8Var.f52203f) && sq8.m48644c(this.f52204g, wi8Var.f52204g);
    }

    /* renamed from: f */
    public final String m54580f() {
        return this.f52203f;
    }

    /* renamed from: g */
    public final yci m54581g() {
        return this.f52204g;
    }

    public int hashCode() {
        hc0 hc0Var = this.f52198a;
        int iHashCode = (hc0Var != null ? hc0Var.hashCode() : 0) * 31;
        sz0 sz0Var = this.f52199b;
        int iHashCode2 = (iHashCode + (sz0Var != null ? sz0Var.hashCode() : 0)) * 31;
        Map map = this.f52200c;
        int iHashCode3 = (iHashCode2 + (map != null ? map.hashCode() : 0)) * 31;
        String str = this.f52201d;
        int iHashCode4 = (iHashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        Map map2 = this.f52202e;
        int iHashCode5 = (iHashCode4 + (map2 != null ? map2.hashCode() : 0)) * 31;
        String str2 = this.f52203f;
        int iHashCode6 = (iHashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        yci yciVar = this.f52204g;
        return iHashCode6 + (yciVar != null ? yciVar.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InitiateAuthRequest(");
        sb.append("analyticsMetadata=" + this.f52198a + ',');
        sb.append("authFlow=" + this.f52199b + ',');
        sb.append("authParameters=*** Sensitive Data Redacted ***,");
        sb.append("clientId=*** Sensitive Data Redacted ***,");
        sb.append("clientMetadata=" + this.f52202e + ',');
        sb.append("session=*** Sensitive Data Redacted ***,");
        sb.append("userContextData=*** Sensitive Data Redacted ***");
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public wi8(C17918a c17918a) {
        this.f52198a = c17918a.m54584c();
        this.f52199b = c17918a.m54585d();
        this.f52200c = c17918a.m54586e();
        this.f52201d = c17918a.m54587f();
        this.f52202e = c17918a.m54588g();
        this.f52203f = c17918a.m54589h();
        this.f52204g = c17918a.m54590i();
    }
}
