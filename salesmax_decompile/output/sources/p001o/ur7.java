package p001o;

import java.util.Map;

/* loaded from: classes3.dex */
public final class ur7 {

    /* renamed from: d */
    public static final C17437b f49398d = new C17437b(null);

    /* renamed from: a */
    public final String f49399a;

    /* renamed from: b */
    public final String f49400b;

    /* renamed from: c */
    public final Map f49401c;

    /* renamed from: o.ur7$a */
    public static final class C17436a {

        /* renamed from: a */
        public String f49402a;

        /* renamed from: b */
        public String f49403b;

        /* renamed from: c */
        public Map f49404c;

        /* renamed from: a */
        public final ur7 m51954a() {
            return new ur7(this, null);
        }

        /* renamed from: b */
        public final String m51955b() {
            return this.f49402a;
        }

        /* renamed from: c */
        public final String m51956c() {
            return this.f49403b;
        }

        /* renamed from: d */
        public final Map m51957d() {
            return this.f49404c;
        }

        /* renamed from: e */
        public final void m51958e(String str) {
            this.f49402a = str;
        }

        /* renamed from: f */
        public final void m51959f(String str) {
            this.f49403b = str;
        }

        /* renamed from: g */
        public final void m51960g(Map map) {
            this.f49404c = map;
        }
    }

    /* renamed from: o.ur7$b */
    public static final class C17437b {
        public C17437b() {
        }

        public /* synthetic */ C17437b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ ur7(C17436a c17436a, id5 id5Var) {
        this(c17436a);
    }

    /* renamed from: a */
    public final String m51951a() {
        return this.f49399a;
    }

    /* renamed from: b */
    public final String m51952b() {
        return this.f49400b;
    }

    /* renamed from: c */
    public final Map m51953c() {
        return this.f49401c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ur7.class != obj.getClass()) {
            return false;
        }
        ur7 ur7Var = (ur7) obj;
        return sq8.m48644c(this.f49399a, ur7Var.f49399a) && sq8.m48644c(this.f49400b, ur7Var.f49400b) && sq8.m48644c(this.f49401c, ur7Var.f49401c);
    }

    public int hashCode() {
        String str = this.f49399a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f49400b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Map map = this.f49401c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GetUserAttributeVerificationCodeRequest(");
        sb.append("accessToken=*** Sensitive Data Redacted ***,");
        sb.append("attributeName=" + this.f49400b + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("clientMetadata=");
        sb2.append(this.f49401c);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public ur7(C17436a c17436a) {
        this.f49399a = c17436a.m51955b();
        this.f49400b = c17436a.m51956c();
        this.f49401c = c17436a.m51957d();
    }
}
