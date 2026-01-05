package p001o;

import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class xi8 {

    /* renamed from: f */
    public static final C18165b f53809f = new C18165b(null);

    /* renamed from: a */
    public final q01 f53810a;

    /* renamed from: b */
    public final List f53811b;

    /* renamed from: c */
    public final cg2 f53812c;

    /* renamed from: d */
    public final Map f53813d;

    /* renamed from: e */
    public final String f53814e;

    /* renamed from: o.xi8$a */
    public static final class C18164a {

        /* renamed from: a */
        public q01 f53815a;

        /* renamed from: b */
        public List f53816b;

        /* renamed from: c */
        public cg2 f53817c;

        /* renamed from: d */
        public Map f53818d;

        /* renamed from: e */
        public String f53819e;

        /* renamed from: a */
        public final xi8 m56339a() {
            return new xi8(this, null);
        }

        /* renamed from: b */
        public final C18164a m56340b() {
            return this;
        }

        /* renamed from: c */
        public final q01 m56341c() {
            return this.f53815a;
        }

        /* renamed from: d */
        public final List m56342d() {
            return this.f53816b;
        }

        /* renamed from: e */
        public final cg2 m56343e() {
            return this.f53817c;
        }

        /* renamed from: f */
        public final Map m56344f() {
            return this.f53818d;
        }

        /* renamed from: g */
        public final String m56345g() {
            return this.f53819e;
        }

        /* renamed from: h */
        public final void m56346h(q01 q01Var) {
            this.f53815a = q01Var;
        }

        /* renamed from: i */
        public final void m56347i(List list) {
            this.f53816b = list;
        }

        /* renamed from: j */
        public final void m56348j(cg2 cg2Var) {
            this.f53817c = cg2Var;
        }

        /* renamed from: k */
        public final void m56349k(Map map) {
            this.f53818d = map;
        }

        /* renamed from: l */
        public final void m56350l(String str) {
            this.f53819e = str;
        }
    }

    /* renamed from: o.xi8$b */
    public static final class C18165b {
        public C18165b() {
        }

        public /* synthetic */ C18165b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ xi8(C18164a c18164a, id5 id5Var) {
        this(c18164a);
    }

    /* renamed from: a */
    public final q01 m56334a() {
        return this.f53810a;
    }

    /* renamed from: b */
    public final List m56335b() {
        return this.f53811b;
    }

    /* renamed from: c */
    public final cg2 m56336c() {
        return this.f53812c;
    }

    /* renamed from: d */
    public final Map m56337d() {
        return this.f53813d;
    }

    /* renamed from: e */
    public final String m56338e() {
        return this.f53814e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xi8.class != obj.getClass()) {
            return false;
        }
        xi8 xi8Var = (xi8) obj;
        return sq8.m48644c(this.f53810a, xi8Var.f53810a) && sq8.m48644c(this.f53811b, xi8Var.f53811b) && sq8.m48644c(this.f53812c, xi8Var.f53812c) && sq8.m48644c(this.f53813d, xi8Var.f53813d) && sq8.m48644c(this.f53814e, xi8Var.f53814e);
    }

    public int hashCode() {
        q01 q01Var = this.f53810a;
        int iHashCode = (q01Var != null ? q01Var.hashCode() : 0) * 31;
        List list = this.f53811b;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        cg2 cg2Var = this.f53812c;
        int iHashCode3 = (iHashCode2 + (cg2Var != null ? cg2Var.hashCode() : 0)) * 31;
        Map map = this.f53813d;
        int iHashCode4 = (iHashCode3 + (map != null ? map.hashCode() : 0)) * 31;
        String str = this.f53814e;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InitiateAuthResponse(");
        sb.append("authenticationResult=" + this.f53810a + ',');
        sb.append("availableChallenges=" + this.f53811b + ',');
        sb.append("challengeName=" + this.f53812c + ',');
        sb.append("challengeParameters=" + this.f53813d + ',');
        sb.append("session=*** Sensitive Data Redacted ***");
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public xi8(C18164a c18164a) {
        this.f53810a = c18164a.m56341c();
        this.f53811b = c18164a.m56342d();
        this.f53812c = c18164a.m56343e();
        this.f53813d = c18164a.m56344f();
        this.f53814e = c18164a.m56345g();
    }
}
