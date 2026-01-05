package p001o;

/* loaded from: classes3.dex */
public final class xfa {

    /* renamed from: d */
    public static final C18146b f53701d = new C18146b(null);

    /* renamed from: a */
    public final String f53702a;

    /* renamed from: b */
    public final Integer f53703b;

    /* renamed from: c */
    public final String f53704c;

    /* renamed from: o.xfa$a */
    public static final class C18145a {

        /* renamed from: a */
        public String f53705a;

        /* renamed from: b */
        public Integer f53706b;

        /* renamed from: c */
        public String f53707c;

        /* renamed from: a */
        public final xfa m56214a() {
            return new xfa(this, null);
        }

        /* renamed from: b */
        public final String m56215b() {
            return this.f53705a;
        }

        /* renamed from: c */
        public final Integer m56216c() {
            return this.f53706b;
        }

        /* renamed from: d */
        public final String m56217d() {
            return this.f53707c;
        }

        /* renamed from: e */
        public final void m56218e(String str) {
            this.f53705a = str;
        }

        /* renamed from: f */
        public final void m56219f(Integer num) {
            this.f53706b = num;
        }

        /* renamed from: g */
        public final void m56220g(String str) {
            this.f53707c = str;
        }
    }

    /* renamed from: o.xfa$b */
    public static final class C18146b {
        public C18146b() {
        }

        public /* synthetic */ C18146b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ xfa(C18145a c18145a, id5 id5Var) {
        this(c18145a);
    }

    /* renamed from: a */
    public final String m56211a() {
        return this.f53702a;
    }

    /* renamed from: b */
    public final Integer m56212b() {
        return this.f53703b;
    }

    /* renamed from: c */
    public final String m56213c() {
        return this.f53704c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xfa.class != obj.getClass()) {
            return false;
        }
        xfa xfaVar = (xfa) obj;
        return sq8.m48644c(this.f53702a, xfaVar.f53702a) && sq8.m48644c(this.f53703b, xfaVar.f53703b) && sq8.m48644c(this.f53704c, xfaVar.f53704c);
    }

    public int hashCode() {
        String str = this.f53702a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.f53703b;
        int iIntValue = (iHashCode + (num != null ? num.intValue() : 0)) * 31;
        String str2 = this.f53704c;
        return iIntValue + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ListWebAuthnCredentialsRequest(");
        sb.append("accessToken=*** Sensitive Data Redacted ***,");
        sb.append("maxResults=" + this.f53703b + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("nextToken=");
        sb2.append(this.f53704c);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public xfa(C18145a c18145a) {
        this.f53702a = c18145a.m56215b();
        this.f53703b = c18145a.m56216c();
        this.f53704c = c18145a.m56217d();
    }
}
