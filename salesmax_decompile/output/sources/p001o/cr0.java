package p001o;

/* loaded from: classes3.dex */
public final class cr0 {

    /* renamed from: c */
    public static final C12727b f18519c = new C12727b(null);

    /* renamed from: a */
    public final String f18520a;

    /* renamed from: b */
    public final String f18521b;

    /* renamed from: o.cr0$a */
    public static final class C12726a {

        /* renamed from: a */
        public String f18522a;

        /* renamed from: b */
        public String f18523b;

        /* renamed from: a */
        public final cr0 m21597a() {
            return new cr0(this, null);
        }

        /* renamed from: b */
        public final C12726a m21598b() {
            return this;
        }

        /* renamed from: c */
        public final String m21599c() {
            return this.f18522a;
        }

        /* renamed from: d */
        public final String m21600d() {
            return this.f18523b;
        }

        /* renamed from: e */
        public final void m21601e(String str) {
            this.f18522a = str;
        }

        /* renamed from: f */
        public final void m21602f(String str) {
            this.f18523b = str;
        }
    }

    /* renamed from: o.cr0$b */
    public static final class C12727b {
        public C12727b() {
        }

        public /* synthetic */ C12727b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ cr0(C12726a c12726a, id5 id5Var) {
        this(c12726a);
    }

    /* renamed from: a */
    public final String m21595a() {
        return this.f18520a;
    }

    /* renamed from: b */
    public final String m21596b() {
        return this.f18521b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cr0.class != obj.getClass()) {
            return false;
        }
        cr0 cr0Var = (cr0) obj;
        return sq8.m48644c(this.f18520a, cr0Var.f18520a) && sq8.m48644c(this.f18521b, cr0Var.f18521b);
    }

    public int hashCode() {
        String str = this.f18520a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f18521b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = "AssociateSoftwareTokenResponse(secretCode=*** Sensitive Data Redacted ***,session=*** Sensitive Data Redacted ***)";
        sq8.m48648g(str, "toString(...)");
        return str;
    }

    public cr0(C12726a c12726a) {
        this.f18520a = c12726a.m21599c();
        this.f18521b = c12726a.m21600d();
    }
}
