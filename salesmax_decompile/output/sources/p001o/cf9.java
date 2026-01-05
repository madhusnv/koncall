package p001o;

/* loaded from: classes3.dex */
public final class cf9 {

    /* renamed from: b */
    public static final C12655b f18031b = new C12655b(null);

    /* renamed from: a */
    public final String f18032a;

    /* renamed from: o.cf9$a */
    public static final class C12654a {

        /* renamed from: a */
        public String f18033a;

        /* renamed from: a */
        public final cf9 m21123a() {
            return new cf9(this, null);
        }

        /* renamed from: b */
        public final C12654a m21124b() {
            return this;
        }

        /* renamed from: c */
        public final String m21125c() {
            return this.f18033a;
        }

        /* renamed from: d */
        public final void m21126d(String str) {
            this.f18033a = str;
        }
    }

    /* renamed from: o.cf9$b */
    public static final class C12655b {
        public C12655b() {
        }

        public /* synthetic */ C12655b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ cf9(C12654a c12654a, id5 id5Var) {
        this(c12654a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && cf9.class == obj.getClass() && sq8.m48644c(this.f18032a, ((cf9) obj).f18032a);
    }

    public int hashCode() {
        String str = this.f18032a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LabelAlias(");
        sb.append("name=" + this.f18032a);
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public cf9(C12654a c12654a) {
        this.f18032a = c12654a.m21125c();
    }
}
