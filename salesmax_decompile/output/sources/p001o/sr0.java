package p001o;

import java.util.List;

/* loaded from: classes2.dex */
public final class sr0 {

    /* renamed from: h */
    public static final C16897b f45807h = new C16897b(null);

    /* renamed from: a */
    public final Integer f45808a;

    /* renamed from: b */
    public final String f45809b;

    /* renamed from: c */
    public final List f45810c;

    /* renamed from: d */
    public final String f45811d;

    /* renamed from: e */
    public final String f45812e;

    /* renamed from: f */
    public final String f45813f;

    /* renamed from: g */
    public final String f45814g;

    /* renamed from: o.sr0$a */
    public static final class C16896a {

        /* renamed from: a */
        public Integer f45815a;

        /* renamed from: b */
        public String f45816b;

        /* renamed from: c */
        public List f45817c;

        /* renamed from: d */
        public String f45818d;

        /* renamed from: e */
        public String f45819e;

        /* renamed from: f */
        public String f45820f;

        /* renamed from: g */
        public String f45821g;

        /* renamed from: a */
        public final sr0 m48756a() {
            return new sr0(this, null);
        }

        /* renamed from: b */
        public final Integer m48757b() {
            return this.f45815a;
        }

        /* renamed from: c */
        public final String m48758c() {
            return this.f45816b;
        }

        /* renamed from: d */
        public final List m48759d() {
            return this.f45817c;
        }

        /* renamed from: e */
        public final String m48760e() {
            return this.f45818d;
        }

        /* renamed from: f */
        public final String m48761f() {
            return this.f45819e;
        }

        /* renamed from: g */
        public final String m48762g() {
            return this.f45820f;
        }

        /* renamed from: h */
        public final String m48763h() {
            return this.f45821g;
        }

        /* renamed from: i */
        public final void m48764i(Integer num) {
            this.f45815a = num;
        }

        /* renamed from: j */
        public final void m48765j(String str) {
            this.f45816b = str;
        }

        /* renamed from: k */
        public final void m48766k(List list) {
            this.f45817c = list;
        }

        /* renamed from: l */
        public final void m48767l(String str) {
            this.f45818d = str;
        }

        /* renamed from: m */
        public final void m48768m(String str) {
            this.f45819e = str;
        }

        /* renamed from: n */
        public final void m48769n(String str) {
            this.f45820f = str;
        }

        /* renamed from: o */
        public final void m48770o(String str) {
            this.f45821g = str;
        }
    }

    /* renamed from: o.sr0$b */
    public static final class C16897b {
        public C16897b() {
        }

        public /* synthetic */ C16897b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ sr0(C16896a c16896a, id5 id5Var) {
        this(c16896a);
    }

    /* renamed from: a */
    public final Integer m48749a() {
        return this.f45808a;
    }

    /* renamed from: b */
    public final String m48750b() {
        return this.f45809b;
    }

    /* renamed from: c */
    public final List m48751c() {
        return this.f45810c;
    }

    /* renamed from: d */
    public final String m48752d() {
        return this.f45811d;
    }

    /* renamed from: e */
    public final String m48753e() {
        return this.f45812e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sr0.class != obj.getClass()) {
            return false;
        }
        sr0 sr0Var = (sr0) obj;
        return sq8.m48644c(this.f45808a, sr0Var.f45808a) && sq8.m48644c(this.f45809b, sr0Var.f45809b) && sq8.m48644c(this.f45810c, sr0Var.f45810c) && sq8.m48644c(this.f45811d, sr0Var.f45811d) && sq8.m48644c(this.f45812e, sr0Var.f45812e) && sq8.m48644c(this.f45813f, sr0Var.f45813f) && sq8.m48644c(this.f45814g, sr0Var.f45814g);
    }

    /* renamed from: f */
    public final String m48754f() {
        return this.f45813f;
    }

    /* renamed from: g */
    public final String m48755g() {
        return this.f45814g;
    }

    public int hashCode() {
        Integer num = this.f45808a;
        int iIntValue = (num != null ? num.intValue() : 0) * 31;
        String str = this.f45809b;
        int iHashCode = (iIntValue + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.f45810c;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f45811d;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f45812e;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f45813f;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f45814g;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AssumeRoleWithWebIdentityRequest(");
        sb.append("durationSeconds=" + this.f45808a + ',');
        sb.append("policy=" + this.f45809b + ',');
        sb.append("policyArns=" + this.f45810c + ',');
        sb.append("providerId=" + this.f45811d + ',');
        sb.append("roleArn=" + this.f45812e + ',');
        sb.append("roleSessionName=" + this.f45813f + ',');
        sb.append("webIdentityToken=*** Sensitive Data Redacted ***");
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public sr0(C16896a c16896a) {
        this.f45808a = c16896a.m48757b();
        this.f45809b = c16896a.m48758c();
        this.f45810c = c16896a.m48759d();
        this.f45811d = c16896a.m48760e();
        this.f45812e = c16896a.m48761f();
        this.f45813f = c16896a.m48762g();
        this.f45814g = c16896a.m48763h();
    }
}
