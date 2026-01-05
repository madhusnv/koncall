package p001o;

/* loaded from: classes3.dex */
public final class mea {

    /* renamed from: d */
    public static final C15296b f35267d = new C15296b(null);

    /* renamed from: a */
    public final String f35268a;

    /* renamed from: b */
    public final Integer f35269b;

    /* renamed from: c */
    public final String f35270c;

    /* renamed from: o.mea$a */
    public static final class C15295a {

        /* renamed from: a */
        public String f35271a;

        /* renamed from: b */
        public Integer f35272b;

        /* renamed from: c */
        public String f35273c;

        /* renamed from: a */
        public final mea m38825a() {
            return new mea(this, null);
        }

        /* renamed from: b */
        public final String m38826b() {
            return this.f35271a;
        }

        /* renamed from: c */
        public final Integer m38827c() {
            return this.f35272b;
        }

        /* renamed from: d */
        public final String m38828d() {
            return this.f35273c;
        }

        /* renamed from: e */
        public final void m38829e(String str) {
            this.f35271a = str;
        }
    }

    /* renamed from: o.mea$b */
    public static final class C15296b {
        public C15296b() {
        }

        public /* synthetic */ C15296b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ mea(C15295a c15295a, id5 id5Var) {
        this(c15295a);
    }

    /* renamed from: a */
    public final String m38822a() {
        return this.f35268a;
    }

    /* renamed from: b */
    public final Integer m38823b() {
        return this.f35269b;
    }

    /* renamed from: c */
    public final String m38824c() {
        return this.f35270c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mea.class != obj.getClass()) {
            return false;
        }
        mea meaVar = (mea) obj;
        return sq8.m48644c(this.f35268a, meaVar.f35268a) && sq8.m48644c(this.f35269b, meaVar.f35269b) && sq8.m48644c(this.f35270c, meaVar.f35270c);
    }

    public int hashCode() {
        String str = this.f35268a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.f35269b;
        int iIntValue = (iHashCode + (num != null ? num.intValue() : 0)) * 31;
        String str2 = this.f35270c;
        return iIntValue + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ListDevicesRequest(");
        sb.append("accessToken=*** Sensitive Data Redacted ***,");
        sb.append("limit=" + this.f35269b + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("paginationToken=");
        sb2.append(this.f35270c);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public mea(C15295a c15295a) {
        this.f35268a = c15295a.m38826b();
        this.f35269b = c15295a.m38827c();
        this.f35270c = c15295a.m38828d();
    }
}
