package p001o;

/* loaded from: classes3.dex */
public final class seb {

    /* renamed from: c */
    public static final C16818b f45315c = new C16818b(null);

    /* renamed from: a */
    public final String f45316a;

    /* renamed from: b */
    public final xl5 f45317b;

    /* renamed from: o.seb$a */
    public static final class C16817a {

        /* renamed from: a */
        public String f45318a;

        /* renamed from: b */
        public xl5 f45319b;

        /* renamed from: a */
        public final seb m48274a() {
            return new seb(this, null);
        }

        /* renamed from: b */
        public final C16817a m48275b() {
            return this;
        }

        /* renamed from: c */
        public final String m48276c() {
            return this.f45318a;
        }

        /* renamed from: d */
        public final xl5 m48277d() {
            return this.f45319b;
        }

        /* renamed from: e */
        public final void m48278e(String str) {
            this.f45318a = str;
        }

        /* renamed from: f */
        public final void m48279f(xl5 xl5Var) {
            this.f45319b = xl5Var;
        }
    }

    /* renamed from: o.seb$b */
    public static final class C16818b {
        public C16818b() {
        }

        public /* synthetic */ C16818b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ seb(C16817a c16817a, id5 id5Var) {
        this(c16817a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || seb.class != obj.getClass()) {
            return false;
        }
        seb sebVar = (seb) obj;
        return sq8.m48644c(this.f45316a, sebVar.f45316a) && sq8.m48644c(this.f45317b, sebVar.f45317b);
    }

    public int hashCode() {
        String str = this.f45316a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        xl5 xl5Var = this.f45317b;
        return iHashCode + (xl5Var != null ? xl5Var.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MfaOptionType(");
        sb.append("attributeName=" + this.f45316a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("deliveryMedium=");
        sb2.append(this.f45317b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public seb(C16817a c16817a) {
        this.f45316a = c16817a.m48276c();
        this.f45317b = c16817a.m48277d();
    }
}
