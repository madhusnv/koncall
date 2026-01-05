package p001o;

/* loaded from: classes3.dex */
public final class er3 {

    /* renamed from: e */
    public static final C13249b f22056e = new C13249b(null);

    /* renamed from: a */
    public final String f22057a;

    /* renamed from: b */
    public final String f22058b;

    /* renamed from: c */
    public final String f22059c;

    /* renamed from: d */
    public final jr5 f22060d;

    /* renamed from: o.er3$a */
    public static final class C13248a {

        /* renamed from: a */
        public String f22061a;

        /* renamed from: b */
        public String f22062b;

        /* renamed from: c */
        public String f22063c;

        /* renamed from: d */
        public jr5 f22064d;

        /* renamed from: a */
        public final er3 m25452a() {
            return new er3(this, null);
        }

        /* renamed from: b */
        public final String m25453b() {
            return this.f22061a;
        }

        /* renamed from: c */
        public final String m25454c() {
            return this.f22062b;
        }

        /* renamed from: d */
        public final String m25455d() {
            return this.f22063c;
        }

        /* renamed from: e */
        public final jr5 m25456e() {
            return this.f22064d;
        }

        /* renamed from: f */
        public final void m25457f(String str) {
            this.f22061a = str;
        }

        /* renamed from: g */
        public final void m25458g(String str) {
            this.f22062b = str;
        }

        /* renamed from: h */
        public final void m25459h(String str) {
            this.f22063c = str;
        }

        /* renamed from: i */
        public final void m25460i(jr5 jr5Var) {
            this.f22064d = jr5Var;
        }
    }

    /* renamed from: o.er3$b */
    public static final class C13249b {
        public C13249b() {
        }

        public /* synthetic */ C13249b(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final er3 m25461a(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            C13248a c13248a = new C13248a();
            xk7Var.invoke(c13248a);
            return c13248a.m25452a();
        }
    }

    public /* synthetic */ er3(C13248a c13248a, id5 id5Var) {
        this(c13248a);
    }

    /* renamed from: a */
    public final String m25448a() {
        return this.f22057a;
    }

    /* renamed from: b */
    public final String m25449b() {
        return this.f22058b;
    }

    /* renamed from: c */
    public final String m25450c() {
        return this.f22059c;
    }

    /* renamed from: d */
    public final jr5 m25451d() {
        return this.f22060d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || er3.class != obj.getClass()) {
            return false;
        }
        er3 er3Var = (er3) obj;
        return sq8.m48644c(this.f22057a, er3Var.f22057a) && sq8.m48644c(this.f22058b, er3Var.f22058b) && sq8.m48644c(this.f22059c, er3Var.f22059c) && sq8.m48644c(this.f22060d, er3Var.f22060d);
    }

    public int hashCode() {
        String str = this.f22057a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f22058b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f22059c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        jr5 jr5Var = this.f22060d;
        return iHashCode3 + (jr5Var != null ? jr5Var.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ConfirmDeviceRequest(");
        sb.append("accessToken=*** Sensitive Data Redacted ***,");
        sb.append("deviceKey=" + this.f22058b + ',');
        sb.append("deviceName=" + this.f22059c + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("deviceSecretVerifierConfig=");
        sb2.append(this.f22060d);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public er3(C13248a c13248a) {
        this.f22057a = c13248a.m25453b();
        this.f22058b = c13248a.m25454c();
        this.f22059c = c13248a.m25455d();
        this.f22060d = c13248a.m25456e();
    }
}
