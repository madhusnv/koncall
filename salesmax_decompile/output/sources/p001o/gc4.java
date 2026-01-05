package p001o;

import p001o.gk8;

/* loaded from: classes2.dex */
public final class gc4 {

    /* renamed from: e */
    public static final C13676b f24910e = new C13676b(null);

    /* renamed from: a */
    public final String f24911a;

    /* renamed from: b */
    public final gk8 f24912b;

    /* renamed from: c */
    public final String f24913c;

    /* renamed from: d */
    public final String f24914d;

    /* renamed from: o.gc4$a */
    public static final class C13675a {

        /* renamed from: a */
        public String f24915a;

        /* renamed from: b */
        public gk8 f24916b;

        /* renamed from: c */
        public String f24917c;

        /* renamed from: d */
        public String f24918d;

        /* renamed from: a */
        public final gc4 m28394a() {
            return new gc4(this, null);
        }

        /* renamed from: b */
        public final C13675a m28395b() {
            if (this.f24915a == null) {
                this.f24915a = "";
            }
            if (this.f24916b == null) {
                this.f24916b = gk8.C13769a.m28957c(gk8.f25374b, 0L, 0, 2, null);
            }
            if (this.f24917c == null) {
                this.f24917c = "";
            }
            if (this.f24918d == null) {
                this.f24918d = "";
            }
            return this;
        }

        /* renamed from: c */
        public final String m28396c() {
            return this.f24915a;
        }

        /* renamed from: d */
        public final gk8 m28397d() {
            return this.f24916b;
        }

        /* renamed from: e */
        public final String m28398e() {
            return this.f24917c;
        }

        /* renamed from: f */
        public final String m28399f() {
            return this.f24918d;
        }

        /* renamed from: g */
        public final void m28400g(String str) {
            this.f24915a = str;
        }

        /* renamed from: h */
        public final void m28401h(gk8 gk8Var) {
            this.f24916b = gk8Var;
        }

        /* renamed from: i */
        public final void m28402i(String str) {
            this.f24917c = str;
        }

        /* renamed from: j */
        public final void m28403j(String str) {
            this.f24918d = str;
        }
    }

    /* renamed from: o.gc4$b */
    public static final class C13676b {
        public C13676b() {
        }

        public /* synthetic */ C13676b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ gc4(C13675a c13675a, id5 id5Var) {
        this(c13675a);
    }

    /* renamed from: a */
    public final String m28390a() {
        return this.f24911a;
    }

    /* renamed from: b */
    public final gk8 m28391b() {
        return this.f24912b;
    }

    /* renamed from: c */
    public final String m28392c() {
        return this.f24913c;
    }

    /* renamed from: d */
    public final String m28393d() {
        return this.f24914d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gc4.class != obj.getClass()) {
            return false;
        }
        gc4 gc4Var = (gc4) obj;
        return sq8.m48644c(this.f24911a, gc4Var.f24911a) && sq8.m48644c(this.f24912b, gc4Var.f24912b) && sq8.m48644c(this.f24913c, gc4Var.f24913c) && sq8.m48644c(this.f24914d, gc4Var.f24914d);
    }

    public int hashCode() {
        return (((((this.f24911a.hashCode() * 31) + this.f24912b.hashCode()) * 31) + this.f24913c.hashCode()) * 31) + this.f24914d.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Credentials(");
        sb.append("accessKeyId=" + this.f24911a + ',');
        sb.append("expiration=" + this.f24912b + ',');
        sb.append("secretAccessKey=*** Sensitive Data Redacted ***,");
        sb.append("sessionToken=" + this.f24914d);
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public gc4(C13675a c13675a) {
        String strM28396c = c13675a.m28396c();
        if (strM28396c == null) {
            throw new IllegalArgumentException("A non-null value must be provided for accessKeyId".toString());
        }
        this.f24911a = strM28396c;
        gk8 gk8VarM28397d = c13675a.m28397d();
        if (gk8VarM28397d == null) {
            throw new IllegalArgumentException("A non-null value must be provided for expiration".toString());
        }
        this.f24912b = gk8VarM28397d;
        String strM28398e = c13675a.m28398e();
        if (strM28398e == null) {
            throw new IllegalArgumentException("A non-null value must be provided for secretAccessKey".toString());
        }
        this.f24913c = strM28398e;
        String strM28399f = c13675a.m28399f();
        if (strM28399f == null) {
            throw new IllegalArgumentException("A non-null value must be provided for sessionToken".toString());
        }
        this.f24914d = strM28399f;
    }
}
