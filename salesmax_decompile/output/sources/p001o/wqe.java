package p001o;

import java.util.Map;

/* loaded from: classes3.dex */
public final class wqe {

    /* renamed from: h */
    public static final C17951b f52518h = new C17951b(null);

    /* renamed from: a */
    public final hc0 f52519a;

    /* renamed from: b */
    public final cg2 f52520b;

    /* renamed from: c */
    public final Map f52521c;

    /* renamed from: d */
    public final String f52522d;

    /* renamed from: e */
    public final Map f52523e;

    /* renamed from: f */
    public final String f52524f;

    /* renamed from: g */
    public final yci f52525g;

    /* renamed from: o.wqe$a */
    public static final class C17950a {

        /* renamed from: a */
        public hc0 f52526a;

        /* renamed from: b */
        public cg2 f52527b;

        /* renamed from: c */
        public Map f52528c;

        /* renamed from: d */
        public String f52529d;

        /* renamed from: e */
        public Map f52530e;

        /* renamed from: f */
        public String f52531f;

        /* renamed from: g */
        public yci f52532g;

        /* renamed from: a */
        public final void m54867a(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            this.f52526a = hc0.f26603b.m30167a(xk7Var);
        }

        /* renamed from: b */
        public final wqe m54868b() {
            return new wqe(this, null);
        }

        /* renamed from: c */
        public final hc0 m54869c() {
            return this.f52526a;
        }

        /* renamed from: d */
        public final cg2 m54870d() {
            return this.f52527b;
        }

        /* renamed from: e */
        public final Map m54871e() {
            return this.f52528c;
        }

        /* renamed from: f */
        public final String m54872f() {
            return this.f52529d;
        }

        /* renamed from: g */
        public final Map m54873g() {
            return this.f52530e;
        }

        /* renamed from: h */
        public final String m54874h() {
            return this.f52531f;
        }

        /* renamed from: i */
        public final yci m54875i() {
            return this.f52532g;
        }

        /* renamed from: j */
        public final void m54876j(cg2 cg2Var) {
            this.f52527b = cg2Var;
        }

        /* renamed from: k */
        public final void m54877k(Map map) {
            this.f52528c = map;
        }

        /* renamed from: l */
        public final void m54878l(String str) {
            this.f52529d = str;
        }

        /* renamed from: m */
        public final void m54879m(Map map) {
            this.f52530e = map;
        }

        /* renamed from: n */
        public final void m54880n(String str) {
            this.f52531f = str;
        }

        /* renamed from: o */
        public final void m54881o(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            this.f52532g = yci.f55272c.m57613a(xk7Var);
        }
    }

    /* renamed from: o.wqe$b */
    public static final class C17951b {
        public C17951b() {
        }

        public /* synthetic */ C17951b(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final wqe m54882a(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            C17950a c17950a = new C17950a();
            xk7Var.invoke(c17950a);
            return c17950a.m54868b();
        }
    }

    public /* synthetic */ wqe(C17950a c17950a, id5 id5Var) {
        this(c17950a);
    }

    /* renamed from: a */
    public final hc0 m54860a() {
        return this.f52519a;
    }

    /* renamed from: b */
    public final cg2 m54861b() {
        return this.f52520b;
    }

    /* renamed from: c */
    public final Map m54862c() {
        return this.f52521c;
    }

    /* renamed from: d */
    public final String m54863d() {
        return this.f52522d;
    }

    /* renamed from: e */
    public final Map m54864e() {
        return this.f52523e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wqe.class != obj.getClass()) {
            return false;
        }
        wqe wqeVar = (wqe) obj;
        return sq8.m48644c(this.f52519a, wqeVar.f52519a) && sq8.m48644c(this.f52520b, wqeVar.f52520b) && sq8.m48644c(this.f52521c, wqeVar.f52521c) && sq8.m48644c(this.f52522d, wqeVar.f52522d) && sq8.m48644c(this.f52523e, wqeVar.f52523e) && sq8.m48644c(this.f52524f, wqeVar.f52524f) && sq8.m48644c(this.f52525g, wqeVar.f52525g);
    }

    /* renamed from: f */
    public final String m54865f() {
        return this.f52524f;
    }

    /* renamed from: g */
    public final yci m54866g() {
        return this.f52525g;
    }

    public int hashCode() {
        hc0 hc0Var = this.f52519a;
        int iHashCode = (hc0Var != null ? hc0Var.hashCode() : 0) * 31;
        cg2 cg2Var = this.f52520b;
        int iHashCode2 = (iHashCode + (cg2Var != null ? cg2Var.hashCode() : 0)) * 31;
        Map map = this.f52521c;
        int iHashCode3 = (iHashCode2 + (map != null ? map.hashCode() : 0)) * 31;
        String str = this.f52522d;
        int iHashCode4 = (iHashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        Map map2 = this.f52523e;
        int iHashCode5 = (iHashCode4 + (map2 != null ? map2.hashCode() : 0)) * 31;
        String str2 = this.f52524f;
        int iHashCode6 = (iHashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        yci yciVar = this.f52525g;
        return iHashCode6 + (yciVar != null ? yciVar.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RespondToAuthChallengeRequest(");
        sb.append("analyticsMetadata=" + this.f52519a + ',');
        sb.append("challengeName=" + this.f52520b + ',');
        sb.append("challengeResponses=*** Sensitive Data Redacted ***,");
        sb.append("clientId=*** Sensitive Data Redacted ***,");
        sb.append("clientMetadata=" + this.f52523e + ',');
        sb.append("session=*** Sensitive Data Redacted ***,");
        sb.append("userContextData=*** Sensitive Data Redacted ***");
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public wqe(C17950a c17950a) {
        this.f52519a = c17950a.m54869c();
        this.f52520b = c17950a.m54870d();
        this.f52521c = c17950a.m54871e();
        this.f52522d = c17950a.m54872f();
        this.f52523e = c17950a.m54873g();
        this.f52524f = c17950a.m54874h();
        this.f52525g = c17950a.m54875i();
    }
}
