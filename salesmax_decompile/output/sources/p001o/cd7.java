package p001o;

import java.util.Map;

/* loaded from: classes3.dex */
public final class cd7 {

    /* renamed from: g */
    public static final C12643b f17932g = new C12643b(null);

    /* renamed from: a */
    public final hc0 f17933a;

    /* renamed from: b */
    public final String f17934b;

    /* renamed from: c */
    public final Map f17935c;

    /* renamed from: d */
    public final String f17936d;

    /* renamed from: e */
    public final yci f17937e;

    /* renamed from: f */
    public final String f17938f;

    /* renamed from: o.cd7$a */
    public static final class C12642a {

        /* renamed from: a */
        public hc0 f17939a;

        /* renamed from: b */
        public String f17940b;

        /* renamed from: c */
        public Map f17941c;

        /* renamed from: d */
        public String f17942d;

        /* renamed from: e */
        public yci f17943e;

        /* renamed from: f */
        public String f17944f;

        /* renamed from: a */
        public final cd7 m20946a() {
            return new cd7(this, null);
        }

        /* renamed from: b */
        public final hc0 m20947b() {
            return this.f17939a;
        }

        /* renamed from: c */
        public final String m20948c() {
            return this.f17940b;
        }

        /* renamed from: d */
        public final Map m20949d() {
            return this.f17941c;
        }

        /* renamed from: e */
        public final String m20950e() {
            return this.f17942d;
        }

        /* renamed from: f */
        public final yci m20951f() {
            return this.f17943e;
        }

        /* renamed from: g */
        public final String m20952g() {
            return this.f17944f;
        }

        /* renamed from: h */
        public final void m20953h(hc0 hc0Var) {
            this.f17939a = hc0Var;
        }

        /* renamed from: i */
        public final void m20954i(String str) {
            this.f17940b = str;
        }

        /* renamed from: j */
        public final void m20955j(Map map) {
            this.f17941c = map;
        }

        /* renamed from: k */
        public final void m20956k(String str) {
            this.f17942d = str;
        }

        /* renamed from: l */
        public final void m20957l(String str) {
            this.f17944f = str;
        }

        /* renamed from: m */
        public final void m20958m(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            this.f17943e = yci.f55272c.m57613a(xk7Var);
        }
    }

    /* renamed from: o.cd7$b */
    public static final class C12643b {
        public C12643b() {
        }

        public /* synthetic */ C12643b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ cd7(C12642a c12642a, id5 id5Var) {
        this(c12642a);
    }

    /* renamed from: a */
    public final hc0 m20940a() {
        return this.f17933a;
    }

    /* renamed from: b */
    public final String m20941b() {
        return this.f17934b;
    }

    /* renamed from: c */
    public final Map m20942c() {
        return this.f17935c;
    }

    /* renamed from: d */
    public final String m20943d() {
        return this.f17936d;
    }

    /* renamed from: e */
    public final yci m20944e() {
        return this.f17937e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cd7.class != obj.getClass()) {
            return false;
        }
        cd7 cd7Var = (cd7) obj;
        return sq8.m48644c(this.f17933a, cd7Var.f17933a) && sq8.m48644c(this.f17934b, cd7Var.f17934b) && sq8.m48644c(this.f17935c, cd7Var.f17935c) && sq8.m48644c(this.f17936d, cd7Var.f17936d) && sq8.m48644c(this.f17937e, cd7Var.f17937e) && sq8.m48644c(this.f17938f, cd7Var.f17938f);
    }

    /* renamed from: f */
    public final String m20945f() {
        return this.f17938f;
    }

    public int hashCode() {
        hc0 hc0Var = this.f17933a;
        int iHashCode = (hc0Var != null ? hc0Var.hashCode() : 0) * 31;
        String str = this.f17934b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        Map map = this.f17935c;
        int iHashCode3 = (iHashCode2 + (map != null ? map.hashCode() : 0)) * 31;
        String str2 = this.f17936d;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        yci yciVar = this.f17937e;
        int iHashCode5 = (iHashCode4 + (yciVar != null ? yciVar.hashCode() : 0)) * 31;
        String str3 = this.f17938f;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ForgotPasswordRequest(");
        sb.append("analyticsMetadata=" + this.f17933a + ',');
        sb.append("clientId=*** Sensitive Data Redacted ***,");
        sb.append("clientMetadata=" + this.f17935c + ',');
        sb.append("secretHash=*** Sensitive Data Redacted ***,");
        sb.append("userContextData=*** Sensitive Data Redacted ***,");
        sb.append("username=*** Sensitive Data Redacted ***");
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public cd7(C12642a c12642a) {
        this.f17933a = c12642a.m20947b();
        this.f17934b = c12642a.m20948c();
        this.f17935c = c12642a.m20949d();
        this.f17936d = c12642a.m20950e();
        this.f17937e = c12642a.m20951f();
        this.f17938f = c12642a.m20952g();
    }
}
