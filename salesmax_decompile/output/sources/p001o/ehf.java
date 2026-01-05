package p001o;

import p001o.gk8;

/* loaded from: classes3.dex */
public final class ehf {

    /* renamed from: e */
    public static final C13195b f21693e = new C13195b(null);

    /* renamed from: a */
    public final String f21694a;

    /* renamed from: b */
    public final gk8 f21695b;

    /* renamed from: c */
    public final String f21696c;

    /* renamed from: d */
    public final String f21697d;

    /* renamed from: o.ehf$a */
    public static final class C13194a {

        /* renamed from: a */
        public String f21698a;

        /* renamed from: b */
        public gk8 f21699b;

        /* renamed from: c */
        public String f21700c;

        /* renamed from: d */
        public String f21701d;

        /* renamed from: a */
        public final ehf m25067a() {
            return new ehf(this, null);
        }

        /* renamed from: b */
        public final C13194a m25068b() {
            if (this.f21698a == null) {
                this.f21698a = "";
            }
            if (this.f21699b == null) {
                this.f21699b = gk8.C13769a.m28957c(gk8.f25374b, 0L, 0, 2, null);
            }
            if (this.f21700c == null) {
                this.f21700c = "";
            }
            if (this.f21701d == null) {
                this.f21701d = "";
            }
            return this;
        }

        /* renamed from: c */
        public final String m25069c() {
            return this.f21698a;
        }

        /* renamed from: d */
        public final gk8 m25070d() {
            return this.f21699b;
        }

        /* renamed from: e */
        public final String m25071e() {
            return this.f21700c;
        }

        /* renamed from: f */
        public final String m25072f() {
            return this.f21701d;
        }

        /* renamed from: g */
        public final void m25073g(String str) {
            this.f21698a = str;
        }

        /* renamed from: h */
        public final void m25074h(gk8 gk8Var) {
            this.f21699b = gk8Var;
        }

        /* renamed from: i */
        public final void m25075i(String str) {
            this.f21700c = str;
        }

        /* renamed from: j */
        public final void m25076j(String str) {
            this.f21701d = str;
        }
    }

    /* renamed from: o.ehf$b */
    public static final class C13195b {
        public C13195b() {
        }

        public /* synthetic */ C13195b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ ehf(C13194a c13194a, id5 id5Var) {
        this(c13194a);
    }

    /* renamed from: a */
    public final String m25063a() {
        return this.f21694a;
    }

    /* renamed from: b */
    public final gk8 m25064b() {
        return this.f21695b;
    }

    /* renamed from: c */
    public final String m25065c() {
        return this.f21696c;
    }

    /* renamed from: d */
    public final String m25066d() {
        return this.f21697d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ehf.class != obj.getClass()) {
            return false;
        }
        ehf ehfVar = (ehf) obj;
        return sq8.m48644c(this.f21694a, ehfVar.f21694a) && sq8.m48644c(this.f21695b, ehfVar.f21695b) && sq8.m48644c(this.f21696c, ehfVar.f21696c) && sq8.m48644c(this.f21697d, ehfVar.f21697d);
    }

    public int hashCode() {
        return (((((this.f21694a.hashCode() * 31) + this.f21695b.hashCode()) * 31) + this.f21696c.hashCode()) * 31) + this.f21697d.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SessionCredentials(");
        sb.append("accessKeyId=" + this.f21694a + ',');
        sb.append("expiration=" + this.f21695b + ',');
        sb.append("secretAccessKey=*** Sensitive Data Redacted ***,");
        sb.append("sessionToken=*** Sensitive Data Redacted ***");
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public ehf(C13194a c13194a) {
        String strM25069c = c13194a.m25069c();
        if (strM25069c == null) {
            throw new IllegalArgumentException("A non-null value must be provided for accessKeyId".toString());
        }
        this.f21694a = strM25069c;
        gk8 gk8VarM25070d = c13194a.m25070d();
        if (gk8VarM25070d == null) {
            throw new IllegalArgumentException("A non-null value must be provided for expiration".toString());
        }
        this.f21695b = gk8VarM25070d;
        String strM25071e = c13194a.m25071e();
        if (strM25071e == null) {
            throw new IllegalArgumentException("A non-null value must be provided for secretAccessKey".toString());
        }
        this.f21696c = strM25071e;
        String strM25072f = c13194a.m25072f();
        if (strM25072f == null) {
            throw new IllegalArgumentException("A non-null value must be provided for sessionToken".toString());
        }
        this.f21697d = strM25072f;
    }
}
