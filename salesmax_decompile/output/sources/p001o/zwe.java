package p001o;

/* loaded from: classes3.dex */
public final class zwe {

    /* renamed from: c */
    public static final C18724b f57825c = new C18724b(null);

    /* renamed from: a */
    public final exe f57826a;

    /* renamed from: b */
    public final String f57827b;

    /* renamed from: o.zwe$a */
    public static final class C18723a {

        /* renamed from: a */
        public exe f57828a;

        /* renamed from: b */
        public String f57829b;

        /* renamed from: a */
        public final zwe m60048a() {
            return new zwe(this, null);
        }

        /* renamed from: b */
        public final exe m60049b() {
            return this.f57828a;
        }

        /* renamed from: c */
        public final String m60050c() {
            return this.f57829b;
        }

        /* renamed from: d */
        public final void m60051d(exe exeVar) {
            this.f57828a = exeVar;
        }

        /* renamed from: e */
        public final void m60052e(String str) {
            this.f57829b = str;
        }
    }

    /* renamed from: o.zwe$b */
    public static final class C18724b {
        public C18724b() {
        }

        public /* synthetic */ C18724b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ zwe(C18723a c18723a, id5 id5Var) {
        this(c18723a);
    }

    /* renamed from: a */
    public final exe m60046a() {
        return this.f57826a;
    }

    /* renamed from: b */
    public final String m60047b() {
        return this.f57827b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zwe)) {
            return false;
        }
        zwe zweVar = (zwe) obj;
        return sq8.m48644c(this.f57826a, zweVar.f57826a) && sq8.m48644c(this.f57827b, zweVar.f57827b);
    }

    public int hashCode() {
        exe exeVar = this.f57826a;
        int iHashCode = (exeVar != null ? exeVar.hashCode() : 0) * 31;
        String str = this.f57827b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("S3AuthSchemeParameters(");
        sb.append("endpointParameters=" + this.f57826a + ',');
        sb.append("operationName=" + this.f57827b + ')');
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public zwe(C18723a c18723a) {
        this.f57826a = c18723a.m60049b();
        String strM60050c = c18723a.m60050c();
        if (strM60050c == null) {
            throw new IllegalArgumentException("operationName is a required auth scheme parameter".toString());
        }
        this.f57827b = strM60050c;
    }
}
