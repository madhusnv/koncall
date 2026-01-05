package p001o;

import java.util.Map;

/* loaded from: classes3.dex */
public final class gne {

    /* renamed from: g */
    public static final C13796b f25567g = new C13796b(null);

    /* renamed from: a */
    public final hc0 f25568a;

    /* renamed from: b */
    public final String f25569b;

    /* renamed from: c */
    public final Map f25570c;

    /* renamed from: d */
    public final String f25571d;

    /* renamed from: e */
    public final yci f25572e;

    /* renamed from: f */
    public final String f25573f;

    /* renamed from: o.gne$a */
    public static final class C13795a {

        /* renamed from: a */
        public hc0 f25574a;

        /* renamed from: b */
        public String f25575b;

        /* renamed from: c */
        public Map f25576c;

        /* renamed from: d */
        public String f25577d;

        /* renamed from: e */
        public yci f25578e;

        /* renamed from: f */
        public String f25579f;

        /* renamed from: a */
        public final gne m29166a() {
            return new gne(this, null);
        }

        /* renamed from: b */
        public final hc0 m29167b() {
            return this.f25574a;
        }

        /* renamed from: c */
        public final String m29168c() {
            return this.f25575b;
        }

        /* renamed from: d */
        public final Map m29169d() {
            return this.f25576c;
        }

        /* renamed from: e */
        public final String m29170e() {
            return this.f25577d;
        }

        /* renamed from: f */
        public final yci m29171f() {
            return this.f25578e;
        }

        /* renamed from: g */
        public final String m29172g() {
            return this.f25579f;
        }

        /* renamed from: h */
        public final void m29173h(hc0 hc0Var) {
            this.f25574a = hc0Var;
        }

        /* renamed from: i */
        public final void m29174i(String str) {
            this.f25575b = str;
        }

        /* renamed from: j */
        public final void m29175j(Map map) {
            this.f25576c = map;
        }

        /* renamed from: k */
        public final void m29176k(String str) {
            this.f25577d = str;
        }

        /* renamed from: l */
        public final void m29177l(String str) {
            this.f25579f = str;
        }

        /* renamed from: m */
        public final void m29178m(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            this.f25578e = yci.f55272c.m57613a(xk7Var);
        }
    }

    /* renamed from: o.gne$b */
    public static final class C13796b {
        public C13796b() {
        }

        public /* synthetic */ C13796b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ gne(C13795a c13795a, id5 id5Var) {
        this(c13795a);
    }

    /* renamed from: a */
    public final hc0 m29160a() {
        return this.f25568a;
    }

    /* renamed from: b */
    public final String m29161b() {
        return this.f25569b;
    }

    /* renamed from: c */
    public final Map m29162c() {
        return this.f25570c;
    }

    /* renamed from: d */
    public final String m29163d() {
        return this.f25571d;
    }

    /* renamed from: e */
    public final yci m29164e() {
        return this.f25572e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gne.class != obj.getClass()) {
            return false;
        }
        gne gneVar = (gne) obj;
        return sq8.m48644c(this.f25568a, gneVar.f25568a) && sq8.m48644c(this.f25569b, gneVar.f25569b) && sq8.m48644c(this.f25570c, gneVar.f25570c) && sq8.m48644c(this.f25571d, gneVar.f25571d) && sq8.m48644c(this.f25572e, gneVar.f25572e) && sq8.m48644c(this.f25573f, gneVar.f25573f);
    }

    /* renamed from: f */
    public final String m29165f() {
        return this.f25573f;
    }

    public int hashCode() {
        hc0 hc0Var = this.f25568a;
        int iHashCode = (hc0Var != null ? hc0Var.hashCode() : 0) * 31;
        String str = this.f25569b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        Map map = this.f25570c;
        int iHashCode3 = (iHashCode2 + (map != null ? map.hashCode() : 0)) * 31;
        String str2 = this.f25571d;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        yci yciVar = this.f25572e;
        int iHashCode5 = (iHashCode4 + (yciVar != null ? yciVar.hashCode() : 0)) * 31;
        String str3 = this.f25573f;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResendConfirmationCodeRequest(");
        sb.append("analyticsMetadata=" + this.f25568a + ',');
        sb.append("clientId=*** Sensitive Data Redacted ***,");
        sb.append("clientMetadata=" + this.f25570c + ',');
        sb.append("secretHash=*** Sensitive Data Redacted ***,");
        sb.append("userContextData=*** Sensitive Data Redacted ***,");
        sb.append("username=*** Sensitive Data Redacted ***");
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public gne(C13795a c13795a) {
        this.f25568a = c13795a.m29167b();
        this.f25569b = c13795a.m29168c();
        this.f25570c = c13795a.m29169d();
        this.f25571d = c13795a.m29170e();
        this.f25572e = c13795a.m29171f();
        this.f25573f = c13795a.m29172g();
    }
}
