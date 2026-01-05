package p001o;

/* loaded from: classes3.dex */
public final class xw5 {

    /* renamed from: c */
    public static final C18258b f54432c = new C18258b(null);

    /* renamed from: a */
    public final String f54433a;

    /* renamed from: b */
    public final Float f54434b;

    /* renamed from: o.xw5$a */
    public static final class C18257a {

        /* renamed from: a */
        public String f54435a;

        /* renamed from: b */
        public Float f54436b;

        /* renamed from: a */
        public final xw5 m56910a() {
            return new xw5(this, null);
        }

        /* renamed from: b */
        public final C18257a m56911b() {
            return this;
        }

        /* renamed from: c */
        public final String m56912c() {
            return this.f54435a;
        }

        /* renamed from: d */
        public final Float m56913d() {
            return this.f54436b;
        }

        /* renamed from: e */
        public final void m56914e(String str) {
            this.f54435a = str;
        }

        /* renamed from: f */
        public final void m56915f(Float f) {
            this.f54436b = f;
        }
    }

    /* renamed from: o.xw5$b */
    public static final class C18258b {
        public C18258b() {
        }

        public /* synthetic */ C18258b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ xw5(C18257a c18257a, id5 id5Var) {
        this(c18257a);
    }

    /* renamed from: a */
    public final String m56908a() {
        return this.f54433a;
    }

    /* renamed from: b */
    public final Float m56909b() {
        return this.f54434b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xw5.class != obj.getClass()) {
            return false;
        }
        xw5 xw5Var = (xw5) obj;
        if (!sq8.m48644c(this.f54433a, xw5Var.f54433a)) {
            return false;
        }
        Float f = this.f54434b;
        Float f2 = xw5Var.f54434b;
        return f != null ? f.equals(f2) : f2 == null;
    }

    public int hashCode() {
        String str = this.f54433a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Float f = this.f54434b;
        return iHashCode + (f != null ? f.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DominantLanguage(");
        sb.append("languageCode=" + this.f54433a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("score=");
        sb2.append(this.f54434b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public xw5(C18257a c18257a) {
        this.f54433a = c18257a.m56912c();
        this.f54434b = c18257a.m56913d();
    }
}
