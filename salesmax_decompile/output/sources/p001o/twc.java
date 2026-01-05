package p001o;

/* loaded from: classes3.dex */
public final class twc {

    /* renamed from: b */
    public static final C17245b f47987b = new C17245b(null);

    /* renamed from: a */
    public final String f47988a;

    /* renamed from: o.twc$a */
    public static final class C17244a {

        /* renamed from: a */
        public String f47989a;

        /* renamed from: a */
        public final twc m50727a() {
            return new twc(this, null);
        }

        /* renamed from: b */
        public final C17244a m50728b() {
            return this;
        }

        /* renamed from: c */
        public final String m50729c() {
            return this.f47989a;
        }

        /* renamed from: d */
        public final void m50730d(String str) {
            this.f47989a = str;
        }
    }

    /* renamed from: o.twc$b */
    public static final class C17245b {
        public C17245b() {
        }

        public /* synthetic */ C17245b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ twc(C17244a c17244a, id5 id5Var) {
        this(c17244a);
    }

    /* renamed from: a */
    public final String m50726a() {
        return this.f47988a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && twc.class == obj.getClass() && sq8.m48644c(this.f47988a, ((twc) obj).f47988a);
    }

    public int hashCode() {
        String str = this.f47988a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Parent(");
        sb.append("name=" + this.f47988a);
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public twc(C17244a c17244a) {
        this.f47988a = c17244a.m50729c();
    }
}
