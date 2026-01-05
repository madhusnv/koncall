package p001o;

/* loaded from: classes3.dex */
public final class kn5 {

    /* renamed from: b */
    public static final C14886b f32462b = new C14886b(null);

    /* renamed from: a */
    public final String f32463a;

    /* renamed from: o.kn5$a */
    public static final class C14885a {

        /* renamed from: a */
        public String f32464a;

        /* renamed from: a */
        public final kn5 m35945a() {
            return new kn5(this, null);
        }

        /* renamed from: b */
        public final String m35946b() {
            return this.f32464a;
        }

        /* renamed from: c */
        public final void m35947c(String str) {
            this.f32464a = str;
        }
    }

    /* renamed from: o.kn5$b */
    public static final class C14886b {
        public C14886b() {
        }

        public /* synthetic */ C14886b(id5 id5Var) {
            this();
        }
    }

    public /* synthetic */ kn5(C14885a c14885a, id5 id5Var) {
        this(c14885a);
    }

    /* renamed from: a */
    public final String m35944a() {
        return this.f32463a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && kn5.class == obj.getClass() && sq8.m48644c(this.f32463a, ((kn5) obj).f32463a);
    }

    public int hashCode() {
        String str = this.f32463a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        String str = "DetectDominantLanguageRequest(text=*** Sensitive Data Redacted ***)";
        sq8.m48648g(str, "toString(...)");
        return str;
    }

    public kn5(C14885a c14885a) {
        this.f32463a = c14885a.m35946b();
    }
}
