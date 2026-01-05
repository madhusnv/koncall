package p001o;

/* loaded from: classes2.dex */
public final class gr7 {

    /* renamed from: d */
    public static final C13819b f25722d = new C13819b(null);

    /* renamed from: a */
    public final String f25723a;

    /* renamed from: b */
    public final String f25724b;

    /* renamed from: c */
    public final String f25725c;

    /* renamed from: o.gr7$a */
    public static final class C13818a {

        /* renamed from: a */
        public String f25726a;

        /* renamed from: b */
        public String f25727b;

        /* renamed from: c */
        public String f25728c;

        /* renamed from: a */
        public final gr7 m29396a() {
            return new gr7(this, null);
        }

        /* renamed from: b */
        public final String m29397b() {
            return this.f25726a;
        }

        /* renamed from: c */
        public final String m29398c() {
            return this.f25727b;
        }

        /* renamed from: d */
        public final String m29399d() {
            return this.f25728c;
        }

        /* renamed from: e */
        public final void m29400e(String str) {
            this.f25726a = str;
        }

        /* renamed from: f */
        public final void m29401f(String str) {
            this.f25727b = str;
        }

        /* renamed from: g */
        public final void m29402g(String str) {
            this.f25728c = str;
        }
    }

    /* renamed from: o.gr7$b */
    public static final class C13819b {
        public C13819b() {
        }

        public /* synthetic */ C13819b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ gr7(C13818a c13818a, id5 id5Var) {
        this(c13818a);
    }

    /* renamed from: a */
    public final String m29393a() {
        return this.f25723a;
    }

    /* renamed from: b */
    public final String m29394b() {
        return this.f25724b;
    }

    /* renamed from: c */
    public final String m29395c() {
        return this.f25725c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gr7.class != obj.getClass()) {
            return false;
        }
        gr7 gr7Var = (gr7) obj;
        return sq8.m48644c(this.f25723a, gr7Var.f25723a) && sq8.m48644c(this.f25724b, gr7Var.f25724b) && sq8.m48644c(this.f25725c, gr7Var.f25725c);
    }

    public int hashCode() {
        String str = this.f25723a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f25724b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f25725c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GetRoleCredentialsRequest(");
        sb.append("accessToken=*** Sensitive Data Redacted ***,");
        sb.append("accountId=" + this.f25724b + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("roleName=");
        sb2.append(this.f25725c);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public gr7(C13818a c13818a) {
        this.f25723a = c13818a.m29397b();
        this.f25724b = c13818a.m29398c();
        this.f25725c = c13818a.m29399d();
    }
}
