package p001o;

import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class xrf {

    /* renamed from: j */
    public static final C18231b f54175j = new C18231b(null);

    /* renamed from: a */
    public final hc0 f54176a;

    /* renamed from: b */
    public final String f54177b;

    /* renamed from: c */
    public final Map f54178c;

    /* renamed from: d */
    public final String f54179d;

    /* renamed from: e */
    public final String f54180e;

    /* renamed from: f */
    public final List f54181f;

    /* renamed from: g */
    public final yci f54182g;

    /* renamed from: h */
    public final String f54183h;

    /* renamed from: i */
    public final List f54184i;

    /* renamed from: o.xrf$a */
    public static final class C18230a {

        /* renamed from: a */
        public hc0 f54185a;

        /* renamed from: b */
        public String f54186b;

        /* renamed from: c */
        public Map f54187c;

        /* renamed from: d */
        public String f54188d;

        /* renamed from: e */
        public String f54189e;

        /* renamed from: f */
        public List f54190f;

        /* renamed from: g */
        public yci f54191g;

        /* renamed from: h */
        public String f54192h;

        /* renamed from: i */
        public List f54193i;

        /* renamed from: a */
        public final xrf m56710a() {
            return new xrf(this, null);
        }

        /* renamed from: b */
        public final hc0 m56711b() {
            return this.f54185a;
        }

        /* renamed from: c */
        public final String m56712c() {
            return this.f54186b;
        }

        /* renamed from: d */
        public final Map m56713d() {
            return this.f54187c;
        }

        /* renamed from: e */
        public final String m56714e() {
            return this.f54188d;
        }

        /* renamed from: f */
        public final String m56715f() {
            return this.f54189e;
        }

        /* renamed from: g */
        public final List m56716g() {
            return this.f54190f;
        }

        /* renamed from: h */
        public final yci m56717h() {
            return this.f54191g;
        }

        /* renamed from: i */
        public final String m56718i() {
            return this.f54192h;
        }

        /* renamed from: j */
        public final List m56719j() {
            return this.f54193i;
        }

        /* renamed from: k */
        public final void m56720k(hc0 hc0Var) {
            this.f54185a = hc0Var;
        }

        /* renamed from: l */
        public final void m56721l(String str) {
            this.f54186b = str;
        }

        /* renamed from: m */
        public final void m56722m(Map map) {
            this.f54187c = map;
        }

        /* renamed from: n */
        public final void m56723n(String str) {
            this.f54188d = str;
        }

        /* renamed from: o */
        public final void m56724o(String str) {
            this.f54189e = str;
        }

        /* renamed from: p */
        public final void m56725p(List list) {
            this.f54190f = list;
        }

        /* renamed from: q */
        public final void m56726q(String str) {
            this.f54192h = str;
        }

        /* renamed from: r */
        public final void m56727r(List list) {
            this.f54193i = list;
        }

        /* renamed from: s */
        public final void m56728s(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            this.f54191g = yci.f55272c.m57613a(xk7Var);
        }
    }

    /* renamed from: o.xrf$b */
    public static final class C18231b {
        public C18231b() {
        }

        public /* synthetic */ C18231b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ xrf(C18230a c18230a, id5 id5Var) {
        this(c18230a);
    }

    /* renamed from: a */
    public final hc0 m56701a() {
        return this.f54176a;
    }

    /* renamed from: b */
    public final String m56702b() {
        return this.f54177b;
    }

    /* renamed from: c */
    public final Map m56703c() {
        return this.f54178c;
    }

    /* renamed from: d */
    public final String m56704d() {
        return this.f54179d;
    }

    /* renamed from: e */
    public final String m56705e() {
        return this.f54180e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xrf.class != obj.getClass()) {
            return false;
        }
        xrf xrfVar = (xrf) obj;
        return sq8.m48644c(this.f54176a, xrfVar.f54176a) && sq8.m48644c(this.f54177b, xrfVar.f54177b) && sq8.m48644c(this.f54178c, xrfVar.f54178c) && sq8.m48644c(this.f54179d, xrfVar.f54179d) && sq8.m48644c(this.f54180e, xrfVar.f54180e) && sq8.m48644c(this.f54181f, xrfVar.f54181f) && sq8.m48644c(this.f54182g, xrfVar.f54182g) && sq8.m48644c(this.f54183h, xrfVar.f54183h) && sq8.m48644c(this.f54184i, xrfVar.f54184i);
    }

    /* renamed from: f */
    public final List m56706f() {
        return this.f54181f;
    }

    /* renamed from: g */
    public final yci m56707g() {
        return this.f54182g;
    }

    /* renamed from: h */
    public final String m56708h() {
        return this.f54183h;
    }

    public int hashCode() {
        hc0 hc0Var = this.f54176a;
        int iHashCode = (hc0Var != null ? hc0Var.hashCode() : 0) * 31;
        String str = this.f54177b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        Map map = this.f54178c;
        int iHashCode3 = (iHashCode2 + (map != null ? map.hashCode() : 0)) * 31;
        String str2 = this.f54179d;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f54180e;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List list = this.f54181f;
        int iHashCode6 = (iHashCode5 + (list != null ? list.hashCode() : 0)) * 31;
        yci yciVar = this.f54182g;
        int iHashCode7 = (iHashCode6 + (yciVar != null ? yciVar.hashCode() : 0)) * 31;
        String str4 = this.f54183h;
        int iHashCode8 = (iHashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31;
        List list2 = this.f54184i;
        return iHashCode8 + (list2 != null ? list2.hashCode() : 0);
    }

    /* renamed from: i */
    public final List m56709i() {
        return this.f54184i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SignUpRequest(");
        sb.append("analyticsMetadata=" + this.f54176a + ',');
        sb.append("clientId=*** Sensitive Data Redacted ***,");
        sb.append("clientMetadata=" + this.f54178c + ',');
        sb.append("password=*** Sensitive Data Redacted ***,");
        sb.append("secretHash=*** Sensitive Data Redacted ***,");
        sb.append("userAttributes=" + this.f54181f + ',');
        sb.append("userContextData=*** Sensitive Data Redacted ***,");
        sb.append("username=*** Sensitive Data Redacted ***,");
        sb.append("validationData=" + this.f54184i);
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public xrf(C18230a c18230a) {
        this.f54176a = c18230a.m56711b();
        this.f54177b = c18230a.m56712c();
        this.f54178c = c18230a.m56713d();
        this.f54179d = c18230a.m56714e();
        this.f54180e = c18230a.m56715f();
        this.f54181f = c18230a.m56716g();
        this.f54182g = c18230a.m56717h();
        this.f54183h = c18230a.m56718i();
        this.f54184i = c18230a.m56719j();
    }
}
