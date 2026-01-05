package p001o;

import java.util.Map;

/* loaded from: classes3.dex */
public final class xqe {

    /* renamed from: e */
    public static final C18224b f54143e = new C18224b(null);

    /* renamed from: a */
    public final q01 f54144a;

    /* renamed from: b */
    public final cg2 f54145b;

    /* renamed from: c */
    public final Map f54146c;

    /* renamed from: d */
    public final String f54147d;

    /* renamed from: o.xqe$a */
    public static final class C18223a {

        /* renamed from: a */
        public q01 f54148a;

        /* renamed from: b */
        public cg2 f54149b;

        /* renamed from: c */
        public Map f54150c;

        /* renamed from: d */
        public String f54151d;

        /* renamed from: a */
        public final xqe m56665a() {
            return new xqe(this, null);
        }

        /* renamed from: b */
        public final C18223a m56666b() {
            return this;
        }

        /* renamed from: c */
        public final q01 m56667c() {
            return this.f54148a;
        }

        /* renamed from: d */
        public final cg2 m56668d() {
            return this.f54149b;
        }

        /* renamed from: e */
        public final Map m56669e() {
            return this.f54150c;
        }

        /* renamed from: f */
        public final String m56670f() {
            return this.f54151d;
        }

        /* renamed from: g */
        public final void m56671g(q01 q01Var) {
            this.f54148a = q01Var;
        }

        /* renamed from: h */
        public final void m56672h(cg2 cg2Var) {
            this.f54149b = cg2Var;
        }

        /* renamed from: i */
        public final void m56673i(Map map) {
            this.f54150c = map;
        }

        /* renamed from: j */
        public final void m56674j(String str) {
            this.f54151d = str;
        }
    }

    /* renamed from: o.xqe$b */
    public static final class C18224b {
        public C18224b() {
        }

        public /* synthetic */ C18224b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ xqe(C18223a c18223a, id5 id5Var) {
        this(c18223a);
    }

    /* renamed from: a */
    public final q01 m56661a() {
        return this.f54144a;
    }

    /* renamed from: b */
    public final cg2 m56662b() {
        return this.f54145b;
    }

    /* renamed from: c */
    public final Map m56663c() {
        return this.f54146c;
    }

    /* renamed from: d */
    public final String m56664d() {
        return this.f54147d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xqe.class != obj.getClass()) {
            return false;
        }
        xqe xqeVar = (xqe) obj;
        return sq8.m48644c(this.f54144a, xqeVar.f54144a) && sq8.m48644c(this.f54145b, xqeVar.f54145b) && sq8.m48644c(this.f54146c, xqeVar.f54146c) && sq8.m48644c(this.f54147d, xqeVar.f54147d);
    }

    public int hashCode() {
        q01 q01Var = this.f54144a;
        int iHashCode = (q01Var != null ? q01Var.hashCode() : 0) * 31;
        cg2 cg2Var = this.f54145b;
        int iHashCode2 = (iHashCode + (cg2Var != null ? cg2Var.hashCode() : 0)) * 31;
        Map map = this.f54146c;
        int iHashCode3 = (iHashCode2 + (map != null ? map.hashCode() : 0)) * 31;
        String str = this.f54147d;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RespondToAuthChallengeResponse(");
        sb.append("authenticationResult=" + this.f54144a + ',');
        sb.append("challengeName=" + this.f54145b + ',');
        sb.append("challengeParameters=" + this.f54146c + ',');
        sb.append("session=*** Sensitive Data Redacted ***");
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public xqe(C18223a c18223a) {
        this.f54144a = c18223a.m56667c();
        this.f54145b = c18223a.m56668d();
        this.f54146c = c18223a.m56669e();
        this.f54147d = c18223a.m56670f();
    }
}
