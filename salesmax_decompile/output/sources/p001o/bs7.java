package p001o;

import java.util.List;

/* loaded from: classes3.dex */
public final class bs7 {

    /* renamed from: f */
    public static final C12485b f16755f = new C12485b(null);

    /* renamed from: a */
    public final List f16756a;

    /* renamed from: b */
    public final String f16757b;

    /* renamed from: c */
    public final List f16758c;

    /* renamed from: d */
    public final List f16759d;

    /* renamed from: e */
    public final String f16760e;

    /* renamed from: o.bs7$a */
    public static final class C12484a {

        /* renamed from: a */
        public List f16761a;

        /* renamed from: b */
        public String f16762b;

        /* renamed from: c */
        public List f16763c;

        /* renamed from: d */
        public List f16764d;

        /* renamed from: e */
        public String f16765e;

        /* renamed from: a */
        public final bs7 m19682a() {
            return new bs7(this, null);
        }

        /* renamed from: b */
        public final C12484a m19683b() {
            if (this.f16763c == null) {
                this.f16763c = ch3.m21246k();
            }
            if (this.f16765e == null) {
                this.f16765e = "";
            }
            return this;
        }

        /* renamed from: c */
        public final List m19684c() {
            return this.f16761a;
        }

        /* renamed from: d */
        public final String m19685d() {
            return this.f16762b;
        }

        /* renamed from: e */
        public final List m19686e() {
            return this.f16763c;
        }

        /* renamed from: f */
        public final List m19687f() {
            return this.f16764d;
        }

        /* renamed from: g */
        public final String m19688g() {
            return this.f16765e;
        }

        /* renamed from: h */
        public final void m19689h(List list) {
            this.f16761a = list;
        }

        /* renamed from: i */
        public final void m19690i(String str) {
            this.f16762b = str;
        }

        /* renamed from: j */
        public final void m19691j(List list) {
            this.f16763c = list;
        }

        /* renamed from: k */
        public final void m19692k(List list) {
            this.f16764d = list;
        }

        /* renamed from: l */
        public final void m19693l(String str) {
            this.f16765e = str;
        }
    }

    /* renamed from: o.bs7$b */
    public static final class C12485b {
        public C12485b() {
        }

        public /* synthetic */ C12485b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ bs7(C12484a c12484a, id5 id5Var) {
        this(c12484a);
    }

    /* renamed from: a */
    public final String m19679a() {
        return this.f16757b;
    }

    /* renamed from: b */
    public final List m19680b() {
        return this.f16758c;
    }

    /* renamed from: c */
    public final List m19681c() {
        return this.f16759d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bs7.class != obj.getClass()) {
            return false;
        }
        bs7 bs7Var = (bs7) obj;
        return sq8.m48644c(this.f16756a, bs7Var.f16756a) && sq8.m48644c(this.f16757b, bs7Var.f16757b) && sq8.m48644c(this.f16758c, bs7Var.f16758c) && sq8.m48644c(this.f16759d, bs7Var.f16759d) && sq8.m48644c(this.f16760e, bs7Var.f16760e);
    }

    public int hashCode() {
        List list = this.f16756a;
        int iHashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.f16757b;
        int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f16758c.hashCode()) * 31;
        List list2 = this.f16759d;
        return ((iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31) + this.f16760e.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GetUserResponse(");
        sb.append("mfaOptions=" + this.f16756a + ',');
        sb.append("preferredMfaSetting=" + this.f16757b + ',');
        sb.append("userAttributes=" + this.f16758c + ',');
        sb.append("userMfaSettingList=" + this.f16759d + ',');
        sb.append("username=*** Sensitive Data Redacted ***");
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public bs7(C12484a c12484a) {
        this.f16756a = c12484a.m19684c();
        this.f16757b = c12484a.m19685d();
        List listM19686e = c12484a.m19686e();
        if (listM19686e == null) {
            throw new IllegalArgumentException("A non-null value must be provided for userAttributes".toString());
        }
        this.f16758c = listM19686e;
        this.f16759d = c12484a.m19687f();
        String strM19688g = c12484a.m19688g();
        if (strM19688g == null) {
            throw new IllegalArgumentException("A non-null value must be provided for username".toString());
        }
        this.f16760e = strM19688g;
    }
}
