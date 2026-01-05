package p001o;

import java.util.List;

/* loaded from: classes2.dex */
public final class sa4 {

    /* renamed from: j */
    public static final C16792b f45060j = new C16792b(null);

    /* renamed from: a */
    public final String f45061a;

    /* renamed from: b */
    public final String f45062b;

    /* renamed from: c */
    public final String f45063c;

    /* renamed from: d */
    public final String f45064d;

    /* renamed from: e */
    public final String f45065e;

    /* renamed from: f */
    public final String f45066f;

    /* renamed from: g */
    public final String f45067g;

    /* renamed from: h */
    public final String f45068h;

    /* renamed from: i */
    public final List f45069i;

    /* renamed from: o.sa4$a */
    public static final class C16791a {

        /* renamed from: a */
        public String f45070a;

        /* renamed from: b */
        public String f45071b;

        /* renamed from: c */
        public String f45072c;

        /* renamed from: d */
        public String f45073d;

        /* renamed from: e */
        public String f45074e;

        /* renamed from: f */
        public String f45075f;

        /* renamed from: g */
        public String f45076g;

        /* renamed from: h */
        public String f45077h;

        /* renamed from: i */
        public List f45078i;

        /* renamed from: a */
        public final sa4 m48079a() {
            return new sa4(this, null);
        }

        /* renamed from: b */
        public final String m48080b() {
            return this.f45070a;
        }

        /* renamed from: c */
        public final String m48081c() {
            return this.f45071b;
        }

        /* renamed from: d */
        public final String m48082d() {
            return this.f45072c;
        }

        /* renamed from: e */
        public final String m48083e() {
            return this.f45073d;
        }

        /* renamed from: f */
        public final String m48084f() {
            return this.f45074e;
        }

        /* renamed from: g */
        public final String m48085g() {
            return this.f45075f;
        }

        /* renamed from: h */
        public final String m48086h() {
            return this.f45076g;
        }

        /* renamed from: i */
        public final String m48087i() {
            return this.f45077h;
        }

        /* renamed from: j */
        public final List m48088j() {
            return this.f45078i;
        }

        /* renamed from: k */
        public final void m48089k(String str) {
            this.f45070a = str;
        }

        /* renamed from: l */
        public final void m48090l(String str) {
            this.f45071b = str;
        }

        /* renamed from: m */
        public final void m48091m(String str) {
            this.f45075f = str;
        }

        /* renamed from: n */
        public final void m48092n(String str) {
            this.f45077h = str;
        }
    }

    /* renamed from: o.sa4$b */
    public static final class C16792b {
        public C16792b() {
        }

        public /* synthetic */ C16792b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ sa4(C16791a c16791a, id5 id5Var) {
        this(c16791a);
    }

    /* renamed from: a */
    public final String m48070a() {
        return this.f45061a;
    }

    /* renamed from: b */
    public final String m48071b() {
        return this.f45062b;
    }

    /* renamed from: c */
    public final String m48072c() {
        return this.f45063c;
    }

    /* renamed from: d */
    public final String m48073d() {
        return this.f45064d;
    }

    /* renamed from: e */
    public final String m48074e() {
        return this.f45065e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sa4.class != obj.getClass()) {
            return false;
        }
        sa4 sa4Var = (sa4) obj;
        return sq8.m48644c(this.f45061a, sa4Var.f45061a) && sq8.m48644c(this.f45062b, sa4Var.f45062b) && sq8.m48644c(this.f45063c, sa4Var.f45063c) && sq8.m48644c(this.f45064d, sa4Var.f45064d) && sq8.m48644c(this.f45065e, sa4Var.f45065e) && sq8.m48644c(this.f45066f, sa4Var.f45066f) && sq8.m48644c(this.f45067g, sa4Var.f45067g) && sq8.m48644c(this.f45068h, sa4Var.f45068h) && sq8.m48644c(this.f45069i, sa4Var.f45069i);
    }

    /* renamed from: f */
    public final String m48075f() {
        return this.f45066f;
    }

    /* renamed from: g */
    public final String m48076g() {
        return this.f45067g;
    }

    /* renamed from: h */
    public final String m48077h() {
        return this.f45068h;
    }

    public int hashCode() {
        String str = this.f45061a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f45062b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f45063c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f45064d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f45065e;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f45066f;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f45067g;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.f45068h;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        List list = this.f45069i;
        return iHashCode8 + (list != null ? list.hashCode() : 0);
    }

    /* renamed from: i */
    public final List m48078i() {
        return this.f45069i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CreateTokenRequest(");
        sb.append("clientId=" + this.f45061a + ',');
        sb.append("clientSecret=*** Sensitive Data Redacted ***,");
        sb.append("code=" + this.f45063c + ',');
        sb.append("codeVerifier=*** Sensitive Data Redacted ***,");
        sb.append("deviceCode=" + this.f45065e + ',');
        sb.append("grantType=" + this.f45066f + ',');
        sb.append("redirectUri=" + this.f45067g + ',');
        sb.append("refreshToken=*** Sensitive Data Redacted ***,");
        sb.append("scope=" + this.f45069i);
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public sa4(C16791a c16791a) {
        this.f45061a = c16791a.m48080b();
        this.f45062b = c16791a.m48081c();
        this.f45063c = c16791a.m48082d();
        this.f45064d = c16791a.m48083e();
        this.f45065e = c16791a.m48084f();
        this.f45066f = c16791a.m48085g();
        this.f45067g = c16791a.m48086h();
        this.f45068h = c16791a.m48087i();
        this.f45069i = c16791a.m48088j();
    }
}
