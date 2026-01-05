package p001o;

/* loaded from: classes3.dex */
public final class tgc {

    /* renamed from: c */
    public static final C17107b f47106c = new C17107b(null);

    /* renamed from: a */
    public final String f47107a;

    /* renamed from: b */
    public final String f47108b;

    /* renamed from: o.tgc$a */
    public static final class C17106a {

        /* renamed from: a */
        public String f47109a;

        /* renamed from: b */
        public String f47110b;

        /* renamed from: a */
        public final tgc m49831a() {
            return new tgc(this, null);
        }

        /* renamed from: b */
        public final C17106a m49832b() {
            return this;
        }

        /* renamed from: c */
        public final String m49833c() {
            return this.f47109a;
        }

        /* renamed from: d */
        public final String m49834d() {
            return this.f47110b;
        }

        /* renamed from: e */
        public final void m49835e(String str) {
            this.f47109a = str;
        }

        /* renamed from: f */
        public final void m49836f(String str) {
            this.f47110b = str;
        }
    }

    /* renamed from: o.tgc$b */
    public static final class C17107b {
        public C17107b() {
        }

        public /* synthetic */ C17107b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ tgc(C17106a c17106a, id5 id5Var) {
        this(c17106a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tgc.class != obj.getClass()) {
            return false;
        }
        tgc tgcVar = (tgc) obj;
        return sq8.m48644c(this.f47107a, tgcVar.f47107a) && sq8.m48644c(this.f47108b, tgcVar.f47108b);
    }

    public int hashCode() {
        String str = this.f47107a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f47108b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Owner(");
        sb.append("displayName=" + this.f47107a + ',');
        StringBuilder sb2 = new StringBuilder();
        sb2.append("id=");
        sb2.append(this.f47108b);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public tgc(C17106a c17106a) {
        this.f47107a = c17106a.m49833c();
        this.f47108b = c17106a.m49834d();
    }
}
