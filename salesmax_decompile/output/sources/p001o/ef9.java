package p001o;

/* loaded from: classes3.dex */
public final class ef9 {

    /* renamed from: b */
    public static final C13179b f21549b = new C13179b(null);

    /* renamed from: a */
    public final String f21550a;

    /* renamed from: o.ef9$a */
    public static final class C13178a {

        /* renamed from: a */
        public String f21551a;

        /* renamed from: a */
        public final ef9 m24922a() {
            return new ef9(this, null);
        }

        /* renamed from: b */
        public final C13178a m24923b() {
            return this;
        }

        /* renamed from: c */
        public final String m24924c() {
            return this.f21551a;
        }

        /* renamed from: d */
        public final void m24925d(String str) {
            this.f21551a = str;
        }
    }

    /* renamed from: o.ef9$b */
    public static final class C13179b {
        public C13179b() {
        }

        public /* synthetic */ C13179b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ ef9(C13178a c13178a, id5 id5Var) {
        this(c13178a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ef9.class == obj.getClass() && sq8.m48644c(this.f21550a, ((ef9) obj).f21550a);
    }

    public int hashCode() {
        String str = this.f21550a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LabelCategory(");
        sb.append("name=" + this.f21550a);
        sb.append(")");
        String string = sb.toString();
        sq8.m48648g(string, "toString(...)");
        return string;
    }

    public ef9(C13178a c13178a) {
        this.f21550a = c13178a.m24924c();
    }
}
