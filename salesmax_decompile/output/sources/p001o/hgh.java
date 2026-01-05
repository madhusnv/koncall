package p001o;

/* loaded from: classes3.dex */
public final class hgh {

    /* renamed from: c */
    public static final C13940b f26842c = new C13940b(null);

    /* renamed from: a */
    public final String f26843a;

    /* renamed from: b */
    public final String f26844b;

    /* renamed from: o.hgh$a */
    public static final class C13939a {

        /* renamed from: a */
        public String f26845a;

        /* renamed from: b */
        public String f26846b;

        /* renamed from: a */
        public final hgh m30427a() {
            return new hgh(this, null);
        }

        /* renamed from: b */
        public final C13939a m30428b() {
            return this;
        }

        /* renamed from: c */
        public final String m30429c() {
            return this.f26845a;
        }

        /* renamed from: d */
        public final String m30430d() {
            return this.f26846b;
        }

        /* renamed from: e */
        public final void m30431e(String str) {
            this.f26845a = str;
        }

        /* renamed from: f */
        public final void m30432f(String str) {
            this.f26846b = str;
        }
    }

    /* renamed from: o.hgh$b */
    public static final class C13940b {
        public C13940b() {
        }

        public /* synthetic */ C13940b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ hgh(C13939a c13939a, id5 id5Var) {
        this(c13939a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hgh.class != obj.getClass()) {
            return false;
        }
        hgh hghVar = (hgh) obj;
        return sq8.m48644c(this.f26843a, hghVar.f26843a) && sq8.m48644c(this.f26844b, hghVar.f26844b);
    }

    public int hashCode() {
        String str = this.f26843a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f26844b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Term(");
        sb.append("sourceText=" + this.f26843a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("targetText=");
        sb2.append(this.f26844b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public hgh(C13939a c13939a) {
        this.f26843a = c13939a.m30429c();
        this.f26844b = c13939a.m30430d();
    }
}
